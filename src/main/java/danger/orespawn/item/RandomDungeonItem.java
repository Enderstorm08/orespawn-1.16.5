package danger.orespawn.item;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTables;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.ChestTileEntity;
import net.minecraft.tileentity.MobSpawnerTileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RandomDungeonItem extends Item {
    private static final EntityType<?>[] SPAWNER_MOBS = new EntityType<?>[] {
            EntityType.ZOMBIE,
            EntityType.SKELETON,
            EntityType.SPIDER
    };

    public RandomDungeonItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }

    @Override
    public ActionResultType useOn(ItemUseContext context) {
        World world = context.getLevel();
        PlayerEntity player = context.getPlayer();
        if (player == null) {
            return ActionResultType.PASS;
        }

        BlockPos clicked = context.getClickedPos();
        Block groundBlock = world.getBlockState(clicked).getBlock();
        if (!(groundBlock == Blocks.GRASS_BLOCK || groundBlock == Blocks.DIRT || groundBlock == Blocks.STONE || groundBlock == Blocks.COARSE_DIRT)) {
            return ActionResultType.FAIL;
        }
        if (clicked.getY() < 40) {
            return ActionResultType.FAIL;
        }

        if (!world.isClientSide) {
            buildDungeon(world, clicked.above(), world.random);
            if (!player.abilities.instabuild) {
                context.getItemInHand().shrink(1);
            }
        }

        world.playSound(player, clicked, SoundEvents.END_PORTAL_SPAWN, SoundCategory.PLAYERS, 0.7F, 1.1F);
        player.swing(context.getHand(), true);
        return ActionResultType.sidedSuccess(world.isClientSide);
    }

    private void buildDungeon(World world, BlockPos origin, Random random) {
        for (int x = -3; x <= 3; x++) {
            for (int z = -3; z <= 3; z++) {
                for (int y = 0; y <= 4; y++) {
                    BlockPos pos = origin.offset(x, y, z);
                    boolean shell = Math.abs(x) == 3 || Math.abs(z) == 3 || y == 0 || y == 4;
                    if (shell) {
                        world.setBlockAndUpdate(pos, random.nextBoolean() ? Blocks.COBBLESTONE.defaultBlockState() : Blocks.MOSSY_COBBLESTONE.defaultBlockState());
                    } else {
                        clearSoftBlock(world, pos);
                    }
                }
            }
        }

        BlockPos spawnerPos = origin.offset(0, 1, 0);
        world.setBlockAndUpdate(spawnerPos, Blocks.SPAWNER.defaultBlockState());
        if (world.getBlockEntity(spawnerPos) instanceof MobSpawnerTileEntity) {
            ((MobSpawnerTileEntity) world.getBlockEntity(spawnerPos)).getSpawner().setEntityId(SPAWNER_MOBS[random.nextInt(SPAWNER_MOBS.length)]);
        }

        placeChest(world, origin.offset(-2, 1, 0), random, Direction.EAST);
        placeChest(world, origin.offset(2, 1, 0), random, Direction.WEST);
    }

    private void placeChest(World world, BlockPos pos, Random random, Direction facing) {
        BlockState chestState = Blocks.CHEST.defaultBlockState().setValue(BlockStateProperties.HORIZONTAL_FACING, facing);
        world.setBlockAndUpdate(pos, chestState);
        if (world.getBlockEntity(pos) instanceof ChestTileEntity) {
            ((ChestTileEntity) world.getBlockEntity(pos)).setLootTable(LootTables.SIMPLE_DUNGEON, random.nextLong());
        }
    }

    private void clearSoftBlock(World world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        if (state.getDestroySpeed(world, pos) >= 0.0F && world.getBlockEntity(pos) == null) {
            world.removeBlock(pos, false);
        }
    }
}
