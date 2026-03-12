package danger.orespawn.item;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import java.util.Map;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.world.World;

public class AutoEnchantedSwordItem extends SwordItem {
    private final Map<Enchantment, Integer> defaultEnchantments;
    private final Multimap<Attribute, AttributeModifier> mainHandModifiers;

    public AutoEnchantedSwordItem(
            IItemTier tier,
            float attackDamage,
            float attackSpeed,
            Properties properties,
            Map<Enchantment, Integer> defaultEnchantments
    ) {
        super(tier, 0, attackSpeed, properties);
        this.defaultEnchantments = defaultEnchantments;
        this.mainHandModifiers = ImmutableMultimap.<Attribute, AttributeModifier>builder()
                .put(
                        Attributes.ATTACK_DAMAGE,
                        new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Weapon modifier", attackDamage, AttributeModifier.Operation.ADDITION)
                )
                .put(
                        Attributes.ATTACK_SPEED,
                        new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Weapon modifier", attackSpeed, AttributeModifier.Operation.ADDITION)
                )
                .build();
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
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlotType slot) {
        return slot == EquipmentSlotType.MAINHAND ? this.mainHandModifiers : super.getDefaultAttributeModifiers(slot);
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return !this.defaultEnchantments.isEmpty() || super.isFoil(stack);
    }

    private void applyDefaultEnchantments(ItemStack stack) {
        for (Map.Entry<Enchantment, Integer> entry : this.defaultEnchantments.entrySet()) {
            if (EnchantmentHelper.getItemEnchantmentLevel(entry.getKey(), stack) < entry.getValue()) {
                stack.enchant(entry.getKey(), entry.getValue());
            }
        }
    }
}
