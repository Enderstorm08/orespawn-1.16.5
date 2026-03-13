package danger.orespawn.item;

import java.util.Map;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BigHammerItem extends AutoEnchantedSwordItem {
    public BigHammerItem(
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
            target.push(0.0D, 0.6D + target.level.random.nextDouble() * 0.4D, 0.0D);
            target.hurtMarked = true;
        }
        return super.hurtEnemy(stack, target, attacker);
    }
}
