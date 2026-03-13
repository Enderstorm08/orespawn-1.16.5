package danger.orespawn.world;

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

public class ThemedRuinFeature extends Feature<NoFeatureConfig> {
    private final Supplier<BlockState> floorSupplier;
    private final Supplier<BlockState> accentSupplier;
    private final Supplier<BlockState> markerSupplier;

    public ThemedRuinFeature(com.mojang.serialization.Codec<NoFeatureConfig> codec,
                             Supplier<BlockState> floorSupplier,
                             Supplier<BlockState> accentSupplier,
                             Supplier<BlockState> markerSupplier) {
        super(codec);
        this.floorSupplier = floorSupplier;
        this.accentSupplier = accentSupplier;
        this.markerSupplier = markerSupplier;
    }

    @Override
    public boolean place(ISeedReader world, ChunkGenerator generator, Random random, BlockPos origin, NoFeatureConfig config) {
        BlockPos center = world.getHeightmapPos(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, origin);
        if (center.getY() <= 1) {
            return false;
        }

        BlockState floor = this.floorSupplier.get();
        BlockState accent = this.accentSupplier.get();
        BlockState marker = this.markerSupplier.get();

        for (int x = -3; x <= 3; x++) {
            for (int z = -3; z <= 3; z++) {
                BlockPos floorPos = center.offset(x, -1, z);
                BlockPos airPos = center.offset(x, 0, z);
                BlockPos upperPos = center.offset(x, 1, z);
                BlockState state = (Math.abs(x) == 3 || Math.abs(z) == 3) ? accent : floor;
                world.setBlock(floorPos, state, 2);
                if (!world.getBlockState(airPos).getMaterial().isLiquid()) {
                    world.setBlock(airPos, Blocks.AIR.defaultBlockState(), 2);
                }
                if (!world.getBlockState(upperPos).getMaterial().isLiquid()) {
                    world.setBlock(upperPos, Blocks.AIR.defaultBlockState(), 2);
                }
            }
        }

        world.setBlock(center.offset(0, -1, 0), accent, 2);
        world.setBlock(center, marker, 2);

        buildPillar(world, center.offset(3, 0, 3), accent, random);
        buildPillar(world, center.offset(-3, 0, 3), accent, random);
        buildPillar(world, center.offset(3, 0, -3), accent, random);
        buildPillar(world, center.offset(-3, 0, -3), accent, random);

        world.setBlock(center.offset(2, 0, 0), Blocks.TORCH.defaultBlockState(), 2);
        world.setBlock(center.offset(-2, 0, 0), Blocks.TORCH.defaultBlockState(), 2);
        world.setBlock(center.offset(0, 0, 2), Blocks.TORCH.defaultBlockState(), 2);
        world.setBlock(center.offset(0, 0, -2), Blocks.TORCH.defaultBlockState(), 2);
        return true;
    }

    private void buildPillar(ISeedReader world, BlockPos base, BlockState accent, Random random) {
        int height = 2 + random.nextInt(2);
        for (int y = 0; y < height; y++) {
            world.setBlock(base.offset(0, y, 0), accent, 2);
        }
    }
}
