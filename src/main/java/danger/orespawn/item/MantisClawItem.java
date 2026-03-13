package danger.orespawn.item;

import java.util.Map;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

public class MantisClawItem extends AutoEnchantedSwordItem {
    public MantisClawItem(
            IItemTier tier,
            float attackDamage,
            float attackSpeed,
            Item.Properties properties,
            Map<Enchantment, Integer> defaultEnchantments
    ) {
        super(tier, attackDamage, attackSpeed, properties, defaultEnchantments);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!target.level.isClientSide) {
            target.hurt(DamageSource.mobAttack(attacker), 1.0F);
            attacker.heal(1.0F);
        }
        return super.hurtEnemy(stack, target, attacker);
    }
}
