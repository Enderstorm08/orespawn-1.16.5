package danger.orespawn.item;

import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class SquidZookaItem extends Item {
    public SquidZookaItem(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (stack.getDamageValue() >= stack.getMaxDamage() - 1) {
            return ActionResult.fail(stack);
        }

        world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.GENERIC_EXPLODE, SoundCategory.PLAYERS, 0.5F, 0.5F);
        if (!world.isClientSide) {
            double xzOffset = 2.5D;
            double yOffset = 1.65D;
            float yaw = player.yRot;
            SquidEntity squid = net.minecraft.entity.EntityType.SQUID.create(world);
            if (squid != null) {
                squid.moveTo(
                        player.getX() - xzOffset * Math.sin(Math.toRadians(yaw + 15.0F)),
                        player.getY() + yOffset,
                        player.getZ() + xzOffset * Math.cos(Math.toRadians(yaw + 15.0F)),
                        yaw,
                        player.xRot
                );
                float speed = 3.6F;
                squid.setDeltaMovement(
                        -MathHelper.sin(player.yRot * ((float) Math.PI / 180F)) * MathHelper.cos(player.xRot * ((float) Math.PI / 180F)) * speed,
                        -MathHelper.sin(player.xRot * ((float) Math.PI / 180F)) * speed,
                        MathHelper.cos(player.yRot * ((float) Math.PI / 180F)) * MathHelper.cos(player.xRot * ((float) Math.PI / 180F)) * speed
                );
                squid.hasImpulse = true;
                squid.setCustomName(new net.minecraft.util.text.StringTextComponent("Attack Squid"));
                world.addFreshEntity(squid);
            }
        }

        player.awardStat(Stats.ITEM_USED.get(this));
        player.swing(hand, true);
        player.push(
                Math.cos(Math.toRadians(player.yRot - 90.0F)) * 0.45D,
                0.1D,
                Math.sin(Math.toRadians(player.yRot - 90.0F)) * 0.45D
        );
        if (!player.abilities.instabuild) {
            stack.hurtAndBreak(1, player, (living) -> living.broadcastBreakEvent(hand));
        }

        return ActionResult.sidedSuccess(stack, world.isClientSide());
    }
}
