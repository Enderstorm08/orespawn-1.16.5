package danger.orespawn.item;

import danger.orespawn.entity.OreSpawnThrownItemEntity;
import danger.orespawn.registry.OreSpawnItems;
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

public class ThunderStaffItem extends Item {
    private static final int STORM_REPAIR_TICKS = 50;

    public ThunderStaffItem(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (stack.getDamageValue() >= stack.getMaxDamage() - 1) {
            return ActionResult.fail(stack);
        }

        if (!world.isClientSide) {
            float yaw = player.yRot;
            double xzOffset = 1.0D;
            double yOffset = 1.55D;
            OreSpawnThrownItemEntity projectile = new OreSpawnThrownItemEntity(world, player);
            projectile.setItem(new ItemStack(OreSpawnItems.THUNDER_STAFF.get()));
            projectile.setPos(
                    player.getX() - xzOffset * MathHelper.sin((float) Math.toRadians(yaw + 45.0F)),
                    player.getY() + yOffset,
                    player.getZ() + xzOffset * MathHelper.cos((float) Math.toRadians(yaw + 45.0F))
            );
            projectile.shootFromRotation(player, player.xRot, yaw, 0.0F, 3.0F, 0.0F);
            world.addFreshEntity(projectile);
        }

        world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.TRIDENT_THUNDER, SoundCategory.PLAYERS, 1.6F, 1.0F);
        player.awardStat(Stats.ITEM_USED.get(this));
        player.swing(hand, true);
        player.getCooldowns().addCooldown(this, 10);
        player.push(
                Math.cos(Math.toRadians(player.yRot - 90.0F)) * 0.5D,
                0.15D,
                Math.sin(Math.toRadians(player.yRot - 90.0F)) * 0.5D
        );
        if (!player.abilities.instabuild) {
            stack.hurtAndBreak(1, player, (living) -> living.broadcastBreakEvent(hand));
        }

        return ActionResult.sidedSuccess(stack, world.isClientSide());
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, net.minecraft.entity.Entity entity, int itemSlot, boolean isSelected) {
        if (!world.isClientSide && world.isThundering() && stack.isDamaged() && world.getGameTime() % STORM_REPAIR_TICKS == 0L) {
            stack.setDamageValue(Math.max(0, stack.getDamageValue() - 1));
        }
    }
}
