package danger.orespawn.item;

import java.util.Map;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;

public class ExperienceSwordItem extends AutoEnchantedSwordItem {
    public ExperienceSwordItem(
            IItemTier tier,
            float attackDamage,
            float attackSpeed,
            Properties properties,
            Map<Enchantment, Integer> defaultEnchantments
    ) {
        super(tier, attackDamage, attackSpeed, properties, defaultEnchantments);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        boolean result = super.hurtEnemy(stack, target, attacker);
        if (attacker instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) attacker;
            player.giveExperiencePoints(10);

            int bonusDamage = player.experienceLevel / 2;
            if (bonusDamage > 0) {
                target.hurt(net.minecraft.util.DamageSource.playerAttack(player), bonusDamage);
            }
        }
        return result;
    }
}
