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

public class CompoundLandmarkFeature extends Feature<NoFeatureConfig> {
    private final Supplier<BlockState> floorSupplier;
    private final Supplier<BlockState> wallSupplier;
    private final Supplier<BlockState> coreSupplier;
    private final Supplier<BlockState> accentSupplier;

    public CompoundLandmarkFeature(
            Codec<NoFeatureConfig> codec,
            Supplier<BlockState> floorSupplier,
            Supplier<BlockState> wallSupplier,
            Supplier<BlockState> coreSupplier,
            Supplier<BlockState> accentSupplier) {
        super(codec);
        this.floorSupplier = floorSupplier;
        this.wallSupplier = wallSupplier;
        this.coreSupplier = coreSupplier;
        this.accentSupplier = accentSupplier;
    }

    @Override
    public boolean place(ISeedReader world, ChunkGenerator generator, Random random, BlockPos origin, NoFeatureConfig config) {
        BlockPos center = world.getHeightmapPos(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, origin);
        if (center.getY() <= 1) {
            return false;
        }

        BlockState floor = this.floorSupplier.get();
        BlockState wall = this.wallSupplier.get();
        BlockState core = this.coreSupplier.get();
        BlockState accent = this.accentSupplier.get();

        for (int x = -5; x <= 5; x++) {
            for (int z = -5; z <= 5; z++) {
                BlockPos floorPos = center.offset(x, -1, z);
                world.setBlock(floorPos, (Math.abs(x) == 5 || Math.abs(z) == 5) ? wall : floor, 2);
                clearColumn(world, center.offset(x, 0, z), 4);
            }
        }

        for (int x = -3; x <= 3; x++) {
            world.setBlock(center.offset(x, -1, -3), accent, 2);
            world.setBlock(center.offset(x, -1, 3), accent, 2);
        }
        for (int z = -3; z <= 3; z++) {
            world.setBlock(center.offset(-3, -1, z), accent, 2);
            world.setBlock(center.offset(3, -1, z), accent, 2);
        }

        buildTower(world, center.offset(4, 0, 4), wall, accent, random);
        buildTower(world, center.offset(-4, 0, 4), wall, accent, random);
        buildTower(world, center.offset(4, 0, -4), wall, accent, random);
        buildTower(world, center.offset(-4, 0, -4), wall, accent, random);

        buildTower(world, center.offset(0, 0, 4), wall, accent, random);
        buildTower(world, center.offset(0, 0, -4), wall, accent, random);

        world.setBlock(center.offset(0, 0, 0), core, 2);
        world.setBlock(center.offset(1, 0, 0), accent, 2);
        world.setBlock(center.offset(-1, 0, 0), accent, 2);
        world.setBlock(center.offset(0, 0, 1), accent, 2);
        world.setBlock(center.offset(0, 0, -1), accent, 2);

        world.setBlock(center.offset(2, 0, 2), Blocks.TORCH.defaultBlockState(), 2);
        world.setBlock(center.offset(-2, 0, 2), Blocks.TORCH.defaultBlockState(), 2);
        world.setBlock(center.offset(2, 0, -2), Blocks.TORCH.defaultBlockState(), 2);
        world.setBlock(center.offset(-2, 0, -2), Blocks.TORCH.defaultBlockState(), 2);
        return true;
    }

    private static void clearColumn(ISeedReader world, BlockPos base, int height) {
        for (int y = 0; y < height; y++) {
            world.setBlock(base.above(y), Blocks.AIR.defaultBlockState(), 2);
        }
    }

    private static void buildTower(ISeedReader world, BlockPos base, BlockState wall, BlockState accent, Random random) {
        int height = 3 + random.nextInt(3);
        for (int y = 0; y < height; y++) {
            world.setBlock(base.above(y), wall, 2);
        }
        world.setBlock(base.above(height), accent, 2);
    }
}
