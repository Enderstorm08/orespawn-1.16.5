package danger.orespawn.world;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.function.Supplier;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

public class GrandLandmarkFeature extends Feature<NoFeatureConfig> {
    private final Supplier<BlockState> floorSupplier;
    private final Supplier<BlockState> pillarSupplier;
    private final Supplier<BlockState> canopySupplier;
    private final Supplier<BlockState> coreSupplier;

    public GrandLandmarkFeature(
            Codec<NoFeatureConfig> codec,
            Supplier<BlockState> floorSupplier,
            Supplier<BlockState> pillarSupplier,
            Supplier<BlockState> canopySupplier,
            Supplier<BlockState> coreSupplier) {
        super(codec);
        this.floorSupplier = floorSupplier;
        this.pillarSupplier = pillarSupplier;
        this.canopySupplier = canopySupplier;
        this.coreSupplier = coreSupplier;
    }

    @Override
    public boolean place(ISeedReader world, ChunkGenerator generator, Random random, BlockPos origin, NoFeatureConfig config) {
        BlockPos center = world.getHeightmapPos(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, origin);
        if (center.getY() <= 1) {
            return false;
        }

        BlockState floor = this.floorSupplier.get();
        BlockState pillar = this.pillarSupplier.get();
        BlockState canopy = this.canopySupplier.get();
        BlockState core = this.coreSupplier.get();

        for (int x = -6; x <= 6; x++) {
            for (int z = -6; z <= 6; z++) {
                BlockPos floorPos = center.offset(x, -1, z);
                world.setBlock(floorPos, Math.abs(x) == 6 || Math.abs(z) == 6 ? pillar : floor, 2);
                clearColumn(world, center.offset(x, 0, z), 8);
            }
        }

        buildPillar(world, center.offset(5, 0, 5), pillar, canopy, random);
        buildPillar(world, center.offset(-5, 0, 5), pillar, canopy, random);
        buildPillar(world, center.offset(5, 0, -5), pillar, canopy, random);
        buildPillar(world, center.offset(-5, 0, -5), pillar, canopy, random);
        buildPillar(world, center.offset(0, 0, 5), pillar, canopy, random);
        buildPillar(world, center.offset(0, 0, -5), pillar, canopy, random);
        buildPillar(world, center.offset(5, 0, 0), pillar, canopy, random);
        buildPillar(world, center.offset(-5, 0, 0), pillar, canopy, random);

        for (int x = -3; x <= 3; x++) {
            world.setBlock(center.offset(x, -1, -3), canopy, 2);
            world.setBlock(center.offset(x, -1, 3), canopy, 2);
        }
        for (int z = -3; z <= 3; z++) {
            world.setBlock(center.offset(-3, -1, z), canopy, 2);
            world.setBlock(center.offset(3, -1, z), canopy, 2);
        }

        world.setBlock(center, core, 2);
        world.setBlock(center.above(), canopy, 2);
        world.setBlock(center.north(), floor, 2);
        world.setBlock(center.south(), floor, 2);
        world.setBlock(center.east(), floor, 2);
        world.setBlock(center.west(), floor, 2);

        placeCornerLights(world, center);
        return true;
    }

    private static void clearColumn(ISeedReader world, BlockPos pos, int height) {
        for (int y = 0; y < height; y++) {
            world.setBlock(pos.above(y), Blocks.AIR.defaultBlockState(), 2);
        }
    }

    private static void buildPillar(ISeedReader world, BlockPos base, BlockState pillar, BlockState canopy, Random random) {
        int height = 4 + random.nextInt(3);
        for (int y = 0; y < height; y++) {
            world.setBlock(base.above(y), pillar, 2);
        }

        BlockPos crown = base.above(height);
        for (int x = -1; x <= 1; x++) {
            for (int z = -1; z <= 1; z++) {
                if (Math.abs(x) == 1 && Math.abs(z) == 1 && random.nextBoolean()) {
                    continue;
                }
                world.setBlock(crown.offset(x, 0, z), canopy, 2);
            }
        }
        world.setBlock(crown.above(), canopy, 2);
    }

    private static void placeCornerLights(ISeedReader world, BlockPos center) {
        world.setBlock(center.offset(4, 0, 4), Blocks.TORCH.defaultBlockState(), 2);
        world.setBlock(center.offset(-4, 0, 4), Blocks.TORCH.defaultBlockState(), 2);
        world.setBlock(center.offset(4, 0, -4), Blocks.TORCH.defaultBlockState(), 2);
        world.setBlock(center.offset(-4, 0, -4), Blocks.TORCH.defaultBlockState(), 2);
    }
}
