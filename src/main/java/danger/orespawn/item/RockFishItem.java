package danger.orespawn.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class RockFishItem extends Item {
    public RockFishItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, World world, LivingEntity entity) {
        ItemStack result = super.finishUsingItem(stack, world, entity);
        if (!world.isClientSide && world.random.nextInt(4) == 1) {
            entity.addEffect(new EffectInstance(Effects.HUNGER, 20, 0));
        }
        return result;
    }
}
