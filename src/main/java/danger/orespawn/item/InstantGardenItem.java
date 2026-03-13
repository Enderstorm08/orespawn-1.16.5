package danger.orespawn.item;

import danger.orespawn.block.SimpleOreCropBlock;
import danger.orespawn.registry.OreSpawnBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
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

public class InstantGardenItem extends Item {
    private static final int HALF_WIDTH = 4;
    private static final int LENGTH = 14;

    private static final Block[] ROW_BLOCKS = new Block[] {
            OreSpawnBlocks.RADISH_CROP.get(),
            OreSpawnBlocks.LETTUCE_CROP.get(),
            OreSpawnBlocks.TOMATO_CROP.get(),
            null,
            OreSpawnBlocks.STRAWBERRY_CROP.get(),
            OreSpawnBlocks.CORN_CROP.get(),
            null,
            OreSpawnBlocks.RICE_CROP.get(),
            OreSpawnBlocks.QUINOA_CROP.get()
    };

    public InstantGardenItem(Properties properties) {
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
        BlockPos origin = context.getClickedPos().above();
        ItemStack stack = context.getItemInHand();

        if (!world.isClientSide) {
            for (int step = 0; step < LENGTH; step++) {
                for (int lateral = -HALF_WIDTH; lateral <= HALF_WIDTH; lateral++) {
                    BlockPos base = offset(origin, sideways, forward, lateral, step);

                    for (int clearY = 0; clearY < 4; clearY++) {
                        BlockPos clearPos = base.above(clearY);
                        if (world.getBlockState(clearPos).getDestroySpeed(world, clearPos) >= 0.0F && world.getBlockEntity(clearPos) == null) {
                            world.removeBlock(clearPos, false);
                        }
                    }

                    if (lateral == -1 || lateral == 2) {
                        world.setBlockAndUpdate(base.below(), Blocks.WATER.defaultBlockState());
                        continue;
                    }

                    world.setBlockAndUpdate(base.below(), Blocks.FARMLAND.defaultBlockState());
                    Block crop = ROW_BLOCKS[lateral + HALF_WIDTH];
                    if (crop != null) {
                        BlockState cropState = crop.defaultBlockState();
                        if (crop instanceof SimpleOreCropBlock) {
                            cropState = cropState.setValue(SimpleOreCropBlock.AGE, 2);
                        }
                        world.setBlockAndUpdate(base, cropState);
                    }
                }
            }

            if (!player.abilities.instabuild) {
                stack.shrink(1);
            }
        }

        world.playSound(player, origin, SoundEvents.GENERIC_EXPLODE, SoundCategory.PLAYERS, 0.5F, 1.6F);
        player.swing(context.getHand(), true);
        return ActionResultType.sidedSuccess(world.isClientSide);
    }

    private BlockPos offset(BlockPos origin, Direction sideways, Direction forward, int lateral, int step) {
        return origin.relative(sideways, lateral).relative(forward, step);
    }
}
