package danger.orespawn.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class CreeperLauncherItem extends Item {
    public CreeperLauncherItem(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType interactLivingEntity(ItemStack stack, PlayerEntity player, LivingEntity target, Hand hand) {
        if (!(target instanceof CreeperEntity)) {
            return ActionResultType.PASS;
        }

        World world = player.level;
        if (!world.isClientSide) {
            target.setDeltaMovement(target.getDeltaMovement().x, 1.35D, target.getDeltaMovement().z);
            target.hurtMarked = true;
            ((net.minecraft.world.server.ServerWorld) world).sendParticles(
                    ParticleTypes.SMOKE,
                    target.getX(),
                    target.getY() + 1.0D,
                    target.getZ(),
                    18,
                    0.45D,
                    0.8D,
                    0.45D,
                    0.02D
            );
            ((net.minecraft.world.server.ServerWorld) world).sendParticles(
                    ParticleTypes.EXPLOSION,
                    target.getX(),
                    target.getY() + 1.0D,
                    target.getZ(),
                    8,
                    0.35D,
                    0.7D,
                    0.35D,
                    0.0D
            );
        }

        world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.FIREWORK_ROCKET_LAUNCH, SoundCategory.PLAYERS, 1.5F, 1.2F);
        player.swing(hand, true);
        if (!player.abilities.instabuild) {
            stack.shrink(1);
        }

        return ActionResultType.sidedSuccess(world.isClientSide);
    }
}
