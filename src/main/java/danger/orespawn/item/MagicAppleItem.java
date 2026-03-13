package danger.orespawn.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUseContext;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class MagicAppleItem extends Item {
    public MagicAppleItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFoil(net.minecraft.item.ItemStack stack) {
        return true;
    }

    @Override
    public ActionResultType useOn(ItemUseContext context) {
        World world = context.getLevel();
        BlockPos targetPos = context.getClickedPos();
        BlockState ground = world.getBlockState(targetPos);
        BlockPos plantPos = targetPos.above();

        if (!isValidGround(ground.getBlock()) || !world.getBlockState(plantPos).canBeReplaced(new BlockItemUseContext(context))) {
            return ActionResultType.FAIL;
        }

        if (world.isClientSide) {
            for (int i = 0; i < 10; i++) {
                world.addParticle(
                        ParticleTypes.LARGE_SMOKE,
                        plantPos.getX() + 0.5D,
                        plantPos.getY() + 0.5D,
                        plantPos.getZ() + 0.5D,
                        0.0D,
                        0.0D,
                        0.0D
                );
                world.addParticle(
                        ParticleTypes.EXPLOSION,
                        plantPos.getX() + 0.5D,
                        plantPos.getY() + 0.5D,
                        plantPos.getZ() + 0.5D,
                        0.0D,
                        0.0D,
                        0.0D
                );
            }
        } else {
            ServerWorld serverWorld = (ServerWorld) world;
            BlockState saplingState = Blocks.OAK_SAPLING.defaultBlockState();
            serverWorld.setBlockAndUpdate(plantPos, saplingState);
            ((SaplingBlock) Blocks.OAK_SAPLING).advanceTree(
                    serverWorld,
                    plantPos,
                    saplingState,
                    serverWorld.random
            );

            if (context.getPlayer() != null && !context.getPlayer().abilities.instabuild) {
                context.getItemInHand().shrink(1);
            }
        }

        world.playSound(
                context.getPlayer(),
                plantPos,
                SoundEvents.GENERIC_EXPLODE,
                SoundCategory.BLOCKS,
                1.5F,
                1.2F
        );
        return ActionResultType.sidedSuccess(world.isClientSide);
    }

    private boolean isValidGround(Block block) {
        return block == Blocks.GRASS_BLOCK || block == Blocks.DIRT || block == Blocks.COARSE_DIRT || block == Blocks.PODZOL;
    }
}
