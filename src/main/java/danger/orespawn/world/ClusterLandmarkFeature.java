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

public class ClusterLandmarkFeature extends Feature<NoFeatureConfig> {
    private final Supplier<BlockState> stemSupplier;
    private final Supplier<BlockState> crownSupplier;

    public ClusterLandmarkFeature(Codec<NoFeatureConfig> codec, Supplier<BlockState> stemSupplier, Supplier<BlockState> crownSupplier) {
        super(codec);
        this.stemSupplier = stemSupplier;
        this.crownSupplier = crownSupplier;
    }

    @Override
    public boolean place(ISeedReader world, ChunkGenerator generator, Random random, BlockPos origin, NoFeatureConfig config) {
        BlockPos base = world.getHeightmapPos(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, origin);
        if (base.getY() <= 1) {
            return false;
        }

        BlockState stem = this.stemSupplier.get();
        BlockState crown = this.crownSupplier.get();
        int height = 3 + random.nextInt(2);

        for (int y = 0; y < height; y++) {
            world.setBlock(base.offset(0, y, 0), stem, 2);
        }

        BlockPos crownCenter = base.offset(0, height - 1, 0);
        for (int x = -1; x <= 1; x++) {
            for (int z = -1; z <= 1; z++) {
                if (Math.abs(x) == 1 && Math.abs(z) == 1 && random.nextBoolean()) {
                    continue;
                }
                world.setBlock(crownCenter.offset(x, 0, z), crown, 2);
                if (random.nextInt(3) == 0) {
                    world.setBlock(crownCenter.offset(x, 1, z), crown, 2);
                }
            }
        }

        if (random.nextBoolean()) {
            world.setBlock(base.offset(1, 0, 0), Blocks.TORCH.defaultBlockState(), 2);
        }
        if (random.nextBoolean()) {
            world.setBlock(base.offset(-1, 0, 0), Blocks.TORCH.defaultBlockState(), 2);
        }
        return true;
    }
}
