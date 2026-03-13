package danger.orespawn.item;

import danger.orespawn.registry.OreSpawnSoundEvents;
import java.util.Map;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

public class ChainsawItem extends AutoEnchantedSwordItem {
    private static final String ACTIVE_TICKS_KEY = "OreSpawnChainsawActiveTicks";

    public ChainsawItem(
            IItemTier tier,
            float attackDamage,
            float attackSpeed,
            Item.Properties properties,
            Map<Enchantment, Integer> defaultEnchantments
    ) {
        super(tier, attackDamage, attackSpeed, properties, defaultEnchantments);
    }

    @Override
    public boolean onEntitySwing(ItemStack stack, LivingEntity entity) {
        if (!entity.level.isClientSide) {
            entity.level.playSound(
                    null,
                    entity.getX(),
                    entity.getY(),
                    entity.getZ(),
                    OreSpawnSoundEvents.CHAINSAW_SHORT.get(),
                    SoundCategory.PLAYERS,
                    1.0F,
                    0.9F + entity.level.random.nextFloat() * 0.2F
            );
            stack.getOrCreateTag().putInt(ACTIVE_TICKS_KEY, 12);
        }
        return super.onEntitySwing(stack, entity);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean isSelected) {
        super.inventoryTick(stack, world, entity, slot, isSelected);
        if (world.isClientSide || !(entity instanceof PlayerEntity) || !isSelected) {
            return;
        }

        int activeTicks = stack.getOrCreateTag().getInt(ACTIVE_TICKS_KEY);
        if (activeTicks <= 0) {
            return;
        }

        stack.getTag().putInt(ACTIVE_TICKS_KEY, activeTicks - 1);
        PlayerEntity player = (PlayerEntity) entity;
        AxisAlignedBB area = player.getBoundingBox().inflate(5.0D);
        double attackDamage = player.getAttributeValue(Attributes.ATTACK_DAMAGE);
        for (LivingEntity target : world.getEntitiesOfClass(LivingEntity.class, area, living -> living != player && living.isAlive())) {
            if (player.canSee(target) && player.distanceToSqr(target) <= 25.0D) {
                target.hurt(DamageSource.playerAttack(player), (float) attackDamage);
            }
        }

        world.playSound(null, player.getX(), player.getY(), player.getZ(), OreSpawnSoundEvents.CHAINSAW.get(), SoundCategory.PLAYERS, 0.35F, 1.0F);
        ((net.minecraft.world.server.ServerWorld) world).sendParticles(
                ParticleTypes.SMOKE,
                player.getX(),
                player.getY() + 1.0D,
                player.getZ(),
                2,
                0.25D,
                0.25D,
                0.25D,
                0.01D
        );
    }
}
