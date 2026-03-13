package danger.orespawn.block;

import java.util.Random;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.BushBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class IslandSpawnerBlock extends BushBlock {
    public IslandSpawnerBlock() {
        super(AbstractBlock.Properties
                .of(Material.PLANT, MaterialColor.COLOR_GREEN)
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS));
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, net.minecraft.world.IBlockReader world, BlockPos pos) {
        return state.getMaterial().isSolid();
    }

    @Override
    public void tick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        spawnIsland(world, pos, random);
    }

    @Override
    public void onPlace(BlockState state, World world, BlockPos pos, BlockState oldState, boolean isMoving) {
        super.onPlace(state, world, pos, oldState, isMoving);
        if (!world.isClientSide) {
            world.getBlockTicks().scheduleTick(pos, this, 4);
        }
    }

    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit) {
        if (!world.isClientSide) {
            spawnIsland((ServerWorld) world, pos, world.random);
        }
        return ActionResultType.sidedSuccess(world.isClientSide);
    }

    private void spawnIsland(ServerWorld world, BlockPos pos, Random random) {
        int yOffset = 20 + random.nextInt(18);
        BlockPos center = pos.above(yOffset);
        int radius = 4 + random.nextInt(3);

        for (int dx = -radius - 1; dx <= radius + 1; dx++) {
            for (int dz = -radius - 1; dz <= radius + 1; dz++) {
                double distance = Math.sqrt(dx * dx + dz * dz);
                if (distance > radius + 0.5D) {
                    continue;
                }

                int thickness = 2 + Math.max(0, radius - (int) Math.floor(distance)) / 2;
                for (int dy = -thickness; dy <= 0; dy++) {
                    BlockPos fillPos = center.offset(dx, dy, dz);
                    BlockState fill = dy == 0 ? Blocks.GRASS_BLOCK.defaultBlockState() : Blocks.DIRT.defaultBlockState();
                    world.setBlockAndUpdate(fillPos, fill);
                }
            }
        }

        world.setBlockAndUpdate(center.above(), Blocks.OAK_SAPLING.defaultBlockState());
        for (int i = 0; i < 24; i++) {
            world.sendParticles(
                    ParticleTypes.HAPPY_VILLAGER,
                    pos.getX() + 0.5D,
                    pos.getY() + 0.5D,
                    pos.getZ() + 0.5D,
                    1,
                    0.35D,
                    0.35D,
                    0.35D,
                    0.01D
            );
        }
        world.removeBlock(pos, false);
    }
}
