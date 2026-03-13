package danger.orespawn.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.passive.SnowGolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class WrenchItem extends Item {
    public WrenchItem(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType interactLivingEntity(ItemStack stack, PlayerEntity player, LivingEntity target, Hand hand) {
        float healAmount;
        if (target instanceof IronGolemEntity) {
            healAmount = 20.0F;
        } else if (target instanceof SnowGolemEntity) {
            healAmount = 4.0F;
        } else {
            return ActionResultType.PASS;
        }

        if (target.getHealth() >= target.getMaxHealth()) {
            return ActionResultType.PASS;
        }

        World world = player.level;
        if (!world.isClientSide) {
            target.heal(healAmount);
            ((net.minecraft.world.server.ServerWorld) world).sendParticles(
                    ParticleTypes.CRIT,
                    target.getX(),
                    target.getY() + target.getBbHeight() * 0.5D,
                    target.getZ(),
                    10,
                    0.35D,
                    0.35D,
                    0.35D,
                    0.03D
            );
            stack.hurtAndBreak(2, player, (living) -> living.broadcastBreakEvent(hand));
        }

        world.playSound(null, target.getX(), target.getY(), target.getZ(), SoundEvents.ANVIL_USE, SoundCategory.PLAYERS, 0.5F, 1.4F);
        player.swing(hand, true);
        return ActionResultType.sidedSuccess(world.isClientSide);
    }
}
