package danger.orespawn.item;

import danger.orespawn.registry.OreSpawnItems;
import java.util.function.Supplier;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SifterItem extends Item {
    private static final Supplier<ItemStack>[] SAND_LOOT = new Supplier[] {
            () -> new ItemStack(Items.CLAY_BALL),
            () -> new ItemStack(Items.IRON_NUGGET, 2),
            () -> new ItemStack(Items.GOLD_NUGGET, 2),
            () -> new ItemStack(Items.PRISMARINE_CRYSTALS),
            () -> new ItemStack(Items.PRISMARINE_SHARD),
            () -> new ItemStack(OreSpawnItems.SALT.get()),
            () -> new ItemStack(OreSpawnItems.RUBY.get()),
            () -> new ItemStack(OreSpawnItems.AMETHYST.get()),
            () -> new ItemStack(OreSpawnItems.TITANIUM_NUGGET.get()),
            () -> new ItemStack(OreSpawnItems.URANIUM_NUGGET.get())
    };

    private static final Supplier<ItemStack>[] GRAVEL_LOOT = new Supplier[] {
            () -> new ItemStack(Items.FLINT),
            () -> new ItemStack(Items.COAL),
            () -> new ItemStack(Items.IRON_NUGGET, 3),
            () -> new ItemStack(Items.GOLD_NUGGET, 3),
            () -> new ItemStack(Items.REDSTONE, 2),
            () -> new ItemStack(Items.LAPIS_LAZULI),
            () -> new ItemStack(Items.QUARTZ),
            () -> new ItemStack(OreSpawnItems.SALT.get()),
            () -> new ItemStack(OreSpawnItems.MOTH_SCALE.get()),
            () -> new ItemStack(OreSpawnItems.PEACOCK_FEATHER.get())
    };

    private static final Supplier<ItemStack>[] DIRT_LOOT = new Supplier[] {
            () -> new ItemStack(Items.WHEAT_SEEDS),
            () -> new ItemStack(Items.BEETROOT_SEEDS),
            () -> new ItemStack(Items.MELON_SEEDS),
            () -> new ItemStack(Items.PUMPKIN_SEEDS),
            () -> new ItemStack(OreSpawnItems.STRAWBERRY_SEED.get()),
            () -> new ItemStack(OreSpawnItems.RADISH.get()),
            () -> new ItemStack(OreSpawnItems.CORN.get()),
            () -> new ItemStack(OreSpawnItems.TOMATO.get()),
            () -> new ItemStack(OreSpawnItems.LETTUCE.get()),
            () -> new ItemStack(OreSpawnItems.QUINOA.get())
    };

    public SifterItem(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType useOn(ItemUseContext context) {
        World world = context.getLevel();
        PlayerEntity player = context.getPlayer();
        if (player == null) {
            return ActionResultType.PASS;
        }

        BlockPos pos = context.getClickedPos();
        BlockState state = world.getBlockState(pos);
        Supplier<ItemStack>[] loot = lootFor(state.getBlock());
        if (loot == null) {
            return ActionResultType.FAIL;
        }

        if (!world.isClientSide) {
            ItemStack drop = loot[world.random.nextInt(loot.length)].get();
            Block.popResource(world, pos.above(), drop);
            context.getItemInHand().hurtAndBreak(1, player, broken -> broken.broadcastBreakEvent(context.getHand()));
        }

        world.playSound(player, pos, SoundEvents.SAND_BREAK, SoundCategory.PLAYERS, 0.8F, 1.0F);
        player.swing(context.getHand(), true);
        return ActionResultType.sidedSuccess(world.isClientSide);
    }

    private Supplier<ItemStack>[] lootFor(Block block) {
        if (block == Blocks.SAND || block == Blocks.RED_SAND) {
            return SAND_LOOT;
        }
        if (block == Blocks.GRAVEL || block == Blocks.CLAY) {
            return GRAVEL_LOOT;
        }
        if (block == Blocks.DIRT || block == Blocks.GRASS_BLOCK || block == Blocks.COARSE_DIRT || block == Blocks.PODZOL) {
            return DIRT_LOOT;
        }
        return null;
    }
}
