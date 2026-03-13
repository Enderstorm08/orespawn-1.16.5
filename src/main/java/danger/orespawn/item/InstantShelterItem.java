package danger.orespawn.item;

import danger.orespawn.registry.OreSpawnItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.Items;
import net.minecraft.tileentity.ChestTileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class InstantShelterItem extends Item {
    private static final int RADIUS = 3;
    private static final int HEIGHT = 4;

    public InstantShelterItem(Properties properties) {
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
            for (int x = -RADIUS; x <= RADIUS; x++) {
                for (int z = -RADIUS; z <= RADIUS; z++) {
                    for (int y = 0; y <= HEIGHT; y++) {
                        BlockPos pos = offset(origin, sideways, forward, x, z).above(y);
                        boolean boundary = Math.abs(x) == RADIUS || Math.abs(z) == RADIUS;
                        boolean roof = y == HEIGHT;
                        boolean floor = y == 0;
                        boolean doorway = z == -RADIUS && x == 0 && (y == 1 || y == 2);

                        if (floor) {
                            world.setBlockAndUpdate(pos, Blocks.COBBLESTONE.defaultBlockState());
                            continue;
                        }

                        if (roof) {
                            world.setBlockAndUpdate(pos, Blocks.OAK_PLANKS.defaultBlockState());
                            continue;
                        }

                        if (boundary && !doorway) {
                            world.setBlockAndUpdate(pos, Blocks.COBBLESTONE.defaultBlockState());
                        } else {
                            clearSoftBlock(world, pos);
                        }
                    }
                }
            }

            placeUtilityBlocks(world, origin, sideways, forward);

            if (!player.abilities.instabuild) {
                stack.shrink(1);
            }
        }

        world.playSound(player, origin, SoundEvents.GENERIC_EXPLODE, SoundCategory.PLAYERS, 0.6F, 1.3F);
        player.swing(context.getHand(), true);
        return ActionResultType.sidedSuccess(world.isClientSide);
    }

    private void placeUtilityBlocks(World world, BlockPos origin, Direction sideways, Direction forward) {
        BlockPos chestPos = offset(origin, sideways, forward, -2, 2).above(1);
        BlockPos tablePos = offset(origin, sideways, forward, 0, 2).above(1);
        BlockPos furnacePos = offset(origin, sideways, forward, 2, 2).above(1);
        BlockPos torchLeft = offset(origin, sideways, forward, -2, -2).above(3);
        BlockPos torchRight = offset(origin, sideways, forward, 2, -2).above(3);

        world.setBlockAndUpdate(chestPos, Blocks.CHEST.defaultBlockState());
        world.setBlockAndUpdate(tablePos, Blocks.CRAFTING_TABLE.defaultBlockState());
        world.setBlockAndUpdate(furnacePos, Blocks.FURNACE.defaultBlockState());
        world.setBlockAndUpdate(torchLeft, Blocks.TORCH.defaultBlockState());
        world.setBlockAndUpdate(torchRight, Blocks.TORCH.defaultBlockState());

        if (world.getBlockEntity(chestPos) instanceof ChestTileEntity) {
            fillStarterChest((ChestTileEntity) world.getBlockEntity(chestPos));
        }
    }

    private void fillStarterChest(IInventory chest) {
        chest.setItem(0, new ItemStack(Items.BREAD, 6));
        chest.setItem(1, new ItemStack(Items.TORCH, 32));
        chest.setItem(2, new ItemStack(Items.OAK_LOG, 16));
        chest.setItem(3, new ItemStack(Items.STICK, 16));
        chest.setItem(4, new ItemStack(Items.WHEAT_SEEDS, 16));
        chest.setItem(5, new ItemStack(OreSpawnItems.SALT.get(), 4));
        chest.setItem(6, new ItemStack(Items.WATER_BUCKET));
        chest.setItem(7, new ItemStack(Items.APPLE, 4));
    }

    private void clearSoftBlock(World world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        if (state.getDestroySpeed(world, pos) >= 0.0F && world.getBlockEntity(pos) == null) {
            world.removeBlock(pos, false);
        }
    }

    private BlockPos offset(BlockPos origin, Direction sideways, Direction forward, int x, int z) {
        return origin.relative(sideways, x).relative(forward, z);
    }
}
