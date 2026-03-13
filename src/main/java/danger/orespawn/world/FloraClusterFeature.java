package danger.orespawn.world;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.function.Supplier;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

public class FloraClusterFeature extends Feature<NoFeatureConfig> {
    private final Supplier<BlockState> trunkSupplier;
    private final Supplier<BlockState> canopySupplier;
    private final Supplier<BlockState> scatterSupplier;

    public FloraClusterFeature(
            Codec<NoFeatureConfig> codec,
            Supplier<BlockState> trunkSupplier,
            Supplier<BlockState> canopySupplier,
            Supplier<BlockState> scatterSupplier) {
        super(codec);
        this.trunkSupplier = trunkSupplier;
        this.canopySupplier = canopySupplier;
        this.scatterSupplier = scatterSupplier;
    }

    @Override
    public boolean place(ISeedReader world, ChunkGenerator generator, Random random, BlockPos origin, NoFeatureConfig config) {
        BlockPos center = world.getHeightmapPos(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, origin);
        if (center.getY() <= 1) {
            return false;
        }

        BlockState trunk = this.trunkSupplier.get();
        BlockState canopy = this.canopySupplier.get();
        BlockState scatter = this.scatterSupplier.get();

        int stems = 3 + random.nextInt(3);
        for (int i = 0; i < stems; i++) {
            int dx = random.nextInt(7) - 3;
            int dz = random.nextInt(7) - 3;
            BlockPos stemBase = world.getHeightmapPos(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, center.offset(dx, 0, dz));
            if (!supportsCluster(world, stemBase)) {
                continue;
            }
            buildStem(world, random, stemBase, trunk, canopy);
        }

        int scatterPlacements = 8 + random.nextInt(7);
        for (int i = 0; i < scatterPlacements; i++) {
            int dx = random.nextInt(11) - 5;
            int dz = random.nextInt(11) - 5;
            BlockPos patchPos = world.getHeightmapPos(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, center.offset(dx, 0, dz));
            if (!supportsCluster(world, patchPos)) {
                continue;
            }
            placeScatter(world, patchPos, scatter, random);
        }

        return true;
    }

    private static boolean supportsCluster(ISeedReader world, BlockPos pos) {
        Block support = world.getBlockState(pos.below()).getBlock();
        return support == Blocks.DIRT
                || support == Blocks.GRASS_BLOCK
                || support == Blocks.COARSE_DIRT
                || support == Blocks.PODZOL
                || support == Blocks.STONE
                || support == Blocks.ANDESITE
                || support == Blocks.GRAVEL
                || support == Blocks.SAND
                || support == Blocks.RED_SAND;
    }

    private static void buildStem(ISeedReader world, Random random, BlockPos base, BlockState trunk, BlockState canopy) {
        int height = 2 + random.nextInt(3);
        for (int y = 0; y < height; y++) {
            world.setBlock(base.offset(0, y, 0), trunk, 2);
        }

        BlockPos crownCenter = base.offset(0, height - 1, 0);
        for (int x = -1; x <= 1; x++) {
            for (int z = -1; z <= 1; z++) {
                if (Math.abs(x) == 1 && Math.abs(z) == 1 && random.nextBoolean()) {
                    continue;
                }
                world.setBlock(crownCenter.offset(x, 0, z), canopy, 2);
                if (random.nextBoolean()) {
                    world.setBlock(crownCenter.offset(x, 1, z), canopy, 2);
                }
            }
        }
    }

    private static void placeScatter(ISeedReader world, BlockPos pos, BlockState scatter, Random random) {
        world.setBlock(pos, scatter, 2);
        if (random.nextInt(4) == 0) {
            world.setBlock(pos.above(), scatter, 2);
        }
    }
}
