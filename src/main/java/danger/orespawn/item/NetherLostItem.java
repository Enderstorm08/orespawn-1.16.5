package danger.orespawn.item;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class NetherLostItem extends Item {
    public NetherLostItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected) {
        super.inventoryTick(stack, world, entity, itemSlot, isSelected);

        if (world.isClientSide || !(entity instanceof LivingEntity)) {
            return;
        }

        LivingEntity living = (LivingEntity) entity;
        boolean active = isSelected || living.getOffhandItem() == stack;
        if (!active || !world.dimensionType().ultraWarm()) {
            return;
        }

        BlockPos feetPos = living.blockPosition().below();
        if (world.getBlockState(feetPos).is(net.minecraft.block.Blocks.NETHERRACK)) {
            world.setBlockAndUpdate(feetPos, net.minecraft.block.Blocks.GLOWSTONE.defaultBlockState());
            if (living.tickCount % 20 == 0) {
                stack.hurtAndBreak(1, living, broken -> broken.broadcastBreakEvent(living.getUsedItemHand()));
            }
        }
    }

    @Override
    public ItemStack getDefaultInstance() {
        ItemStack stack = super.getDefaultInstance();
        stack.enchant(Enchantments.UNBREAKING, 2);
        return stack;
    }
}
