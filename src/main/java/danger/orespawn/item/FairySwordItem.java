package danger.orespawn.item;

import java.util.Map;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.server.ServerWorld;

public class FairySwordItem extends AutoEnchantedSwordItem {
    public FairySwordItem(
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
        if (!target.level.isClientSide && target.level instanceof ServerWorld) {
            ServerWorld world = (ServerWorld) target.level;
            int count = 1 + world.random.nextInt(2);
            for (int i = 0; i < count; i++) {
                BeeEntity summon = EntityType.BEE.create(world);
                if (summon != null) {
                    summon.moveTo(
                            target.getX() + (world.random.nextDouble() - 0.5D),
                            target.getY() + 0.6D + world.random.nextDouble() * 0.5D,
                            target.getZ() + (world.random.nextDouble() - 0.5D),
                            world.random.nextFloat() * 360.0F,
                            0.0F
                    );
                    summon.setTarget(target);
                    summon.setRemainingPersistentAngerTime(200);
                    world.addFreshEntity(summon);
                }
            }
        }
        return super.hurtEnemy(stack, target, attacker);
    }
}
