package danger.orespawn.item;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;

public class ExactAttributeHoeItem extends HoeItem {
    private final Multimap<Attribute, AttributeModifier> mainHandModifiers;

    public ExactAttributeHoeItem(IItemTier tier, float attackDamage, float attackSpeed, Properties properties) {
        super(tier, 0, attackSpeed, properties);
        this.mainHandModifiers = ImmutableMultimap.<Attribute, AttributeModifier>builder()
                .put(
                        Attributes.ATTACK_DAMAGE,
                        new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Tool modifier", attackDamage, AttributeModifier.Operation.ADDITION)
                )
                .put(
                        Attributes.ATTACK_SPEED,
                        new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Tool modifier", attackSpeed, AttributeModifier.Operation.ADDITION)
                )
                .build();
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlotType slot) {
        return slot == EquipmentSlotType.MAINHAND ? this.mainHandModifiers : super.getDefaultAttributeModifiers(slot);
    }
}
