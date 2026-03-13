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

public class MonolithFeature extends Feature<NoFeatureConfig> {
    private final Supplier<BlockState> baseSupplier;
    private final Supplier<BlockState> shaftSupplier;
    private final Supplier<BlockState> capSupplier;

    public MonolithFeature(Codec<NoFeatureConfig> codec,
                           Supplier<BlockState> baseSupplier,
                           Supplier<BlockState> shaftSupplier,
                           Supplier<BlockState> capSupplier) {
        super(codec);
        this.baseSupplier = baseSupplier;
        this.shaftSupplier = shaftSupplier;
        this.capSupplier = capSupplier;
    }

    @Override
    public boolean place(ISeedReader world, ChunkGenerator generator, Random random, BlockPos origin, NoFeatureConfig config) {
        BlockPos center = world.getHeightmapPos(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, origin);
        if (center.getY() <= 1) {
            return false;
        }

        BlockState base = this.baseSupplier.get();
        BlockState shaft = this.shaftSupplier.get();
        BlockState cap = this.capSupplier.get();
        int height = 5 + random.nextInt(3);

        for (int x = -1; x <= 1; x++) {
            for (int z = -1; z <= 1; z++) {
                world.setBlock(center.offset(x, -1, z), base, 2);
                if (Math.abs(x) == 1 || Math.abs(z) == 1) {
                    world.setBlock(center.offset(x, 0, z), base, 2);
                }
            }
        }

        for (int y = 0; y < height; y++) {
            world.setBlock(center.offset(0, y, 0), shaft, 2);
        }

        world.setBlock(center.offset(0, height, 0), cap, 2);
        world.setBlock(center.offset(1, height - 1, 0), cap, 2);
        world.setBlock(center.offset(-1, height - 1, 0), cap, 2);
        world.setBlock(center.offset(0, height - 1, 1), cap, 2);
        world.setBlock(center.offset(0, height - 1, -1), cap, 2);

        world.setBlock(center.offset(2, 0, 2), Blocks.TORCH.defaultBlockState(), 2);
        world.setBlock(center.offset(-2, 0, 2), Blocks.TORCH.defaultBlockState(), 2);
        world.setBlock(center.offset(2, 0, -2), Blocks.TORCH.defaultBlockState(), 2);
        world.setBlock(center.offset(-2, 0, -2), Blocks.TORCH.defaultBlockState(), 2);
        return true;
    }
}
