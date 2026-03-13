package danger.orespawn.item;

import danger.orespawn.entity.OreSpawnThrownItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class ThrownAmmoItem extends Item {
    private final float velocity;
    private final float inaccuracy;
    private final float pitch;
    private final float volume;

    public ThrownAmmoItem(Properties properties, float velocity, float inaccuracy, float pitch, float volume) {
        super(properties);
        this.velocity = velocity;
        this.inaccuracy = inaccuracy;
        this.pitch = pitch;
        this.volume = volume;
    }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getItemInHand(hand);

        world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.SNOWBALL_THROW, SoundCategory.PLAYERS, this.volume, this.pitch);
        if (!world.isClientSide) {
            OreSpawnThrownItemEntity projectile = new OreSpawnThrownItemEntity(world, player);
            projectile.setItem(stack.copy());
            projectile.shootFromRotation(player, player.xRot, player.yRot, 0.0F, this.velocity, this.inaccuracy);
            world.addFreshEntity(projectile);
        }

        player.awardStat(Stats.ITEM_USED.get(this));
        if (!player.abilities.instabuild) {
            stack.shrink(1);
        }

        return ActionResult.sidedSuccess(stack, world.isClientSide());
    }
}
