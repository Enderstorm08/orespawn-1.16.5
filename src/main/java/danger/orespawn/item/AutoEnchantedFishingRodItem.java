package danger.orespawn.item;

import java.util.Map;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FishingRodItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class AutoEnchantedFishingRodItem extends FishingRodItem {
    private final Map<Enchantment, Integer> defaultEnchantments;

    public AutoEnchantedFishingRodItem(Properties properties, Map<Enchantment, Integer> defaultEnchantments) {
        super(properties);
        this.defaultEnchantments = defaultEnchantments;
    }

    @Override
    public void onCraftedBy(ItemStack stack, World world, PlayerEntity player) {
        super.onCraftedBy(stack, world, player);
        applyDefaultEnchantments(stack);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected) {
        super.inventoryTick(stack, world, entity, itemSlot, isSelected);
        if (!world.isClientSide) {
            applyDefaultEnchantments(stack);
        }
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }

    private void applyDefaultEnchantments(ItemStack stack) {
        for (Map.Entry<Enchantment, Integer> entry : this.defaultEnchantments.entrySet()) {
            if (EnchantmentHelper.getItemEnchantmentLevel(entry.getKey(), stack) < entry.getValue()) {
                stack.enchant(entry.getKey(), entry.getValue());
            }
        }
    }
}
