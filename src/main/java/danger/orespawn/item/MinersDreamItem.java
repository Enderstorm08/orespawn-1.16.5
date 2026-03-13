package danger.orespawn.item;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MinersDreamItem extends Item {
    private static final int HALF_WIDTH = 2;
    private static final int HEIGHT = 5;
    private static final int LENGTH = 48;
    private static final int TORCH_SPACING = 8;

    public MinersDreamItem(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType useOn(ItemUseContext context) {
        World world = context.getLevel();
        PlayerEntity player = context.getPlayer();
        if (player == null) {
            return ActionResultType.PASS;
        }

        Direction forward = player.getDirection();
        if (forward.getAxis().isVertical()) {
            return ActionResultType.FAIL;
        }

        Direction sideways = forward.getClockWise();
        BlockPos clickedPos = context.getClickedPos();
        BlockPos start = new BlockPos(clickedPos.getX(), player.blockPosition().getY(), clickedPos.getZ()).relative(forward);
        ItemStack stack = context.getItemInHand();

        if (!world.isClientSide) {
            for (int step = 0; step < LENGTH; step++) {
                BlockPos segment = start.relative(forward, step);
                for (int lateral = -HALF_WIDTH; lateral <= HALF_WIDTH; lateral++) {
                    BlockPos columnBase = segment.relative(sideways, lateral);
                    for (int dy = 0; dy < HEIGHT; dy++) {
                        BlockPos targetPos = columnBase.above(dy);
                        BlockState state = world.getBlockState(targetPos);
                        if (canExcavate(world, targetPos, state)) {
                            world.removeBlock(targetPos, false);
                        }
                    }
                }

                if (step % TORCH_SPACING == 0) {
                    placeTorch(world, segment.above(), forward, sideways);
                }
            }

            if (!player.abilities.instabuild) {
                stack.shrink(1);
            }
        }

        world.playSound(player, start, SoundEvents.GENERIC_EXPLODE, SoundCategory.PLAYERS, 0.6F, 1.4F);
        player.swing(context.getHand(), true);
        return ActionResultType.sidedSuccess(world.isClientSide);
    }

    private boolean canExcavate(World world, BlockPos pos, BlockState state) {
        if (state.isAir()) {
            return false;
        }
        if (state.getDestroySpeed(world, pos) < 0.0F) {
            return false;
        }
        if (state.getMaterial() == Material.WATER || state.getMaterial() == Material.LAVA) {
            return false;
        }
        if (world.getBlockEntity(pos) != null) {
            return false;
        }
        return state.getMaterial().isSolid() || state.getMaterial().isReplaceable();
    }

    private void placeTorch(World world, BlockPos pos, Direction forward, Direction sideways) {
        BlockPos floor = pos.below();
        if (world.getBlockState(pos).isAir() && world.getBlockState(floor).getMaterial().isSolid()) {
            world.setBlockAndUpdate(pos, Blocks.TORCH.defaultBlockState());
            return;
        }

        BlockPos wallPos = pos.relative(sideways, HALF_WIDTH);
        if (world.getBlockState(wallPos).isAir()) {
            BlockState wallTorch = Blocks.WALL_TORCH.defaultBlockState().setValue(net.minecraft.state.properties.BlockStateProperties.HORIZONTAL_FACING, forward.getOpposite());
            BlockPos attach = wallPos.relative(forward.getOpposite());
            if (world.getBlockState(attach).getMaterial().isSolid()) {
                world.setBlockAndUpdate(wallPos, wallTorch);
            }
        }
    }
}
