package danger.orespawn.item;

import java.util.Map;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class PoisonSwordItem extends AutoEnchantedSwordItem {
    public PoisonSwordItem(
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
        if (target != null) {
            int poisonSeconds = 10 + target.level.random.nextInt(10);
            int witherSeconds = 10 + target.level.random.nextInt(10);
            int weaknessSeconds = 10 + target.level.random.nextInt(10);
            target.addEffect(new EffectInstance(Effects.POISON, poisonSeconds * 20, 0));
            target.addEffect(new EffectInstance(Effects.WITHER, witherSeconds * 20, 0));
            target.addEffect(new EffectInstance(Effects.WEAKNESS, weaknessSeconds * 20, 0));
        }
        return super.hurtEnemy(stack, target, attacker);
    }
}
