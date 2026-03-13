package danger.orespawn.item;

import java.util.List;
import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ExperienceCatcherItem extends Item {
    public ExperienceCatcherItem(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType useOn(ItemUseContext context) {
        World world = context.getLevel();
        BlockPos pos = context.getClickedPos();
        PlayerEntity player = context.getPlayer();
        ItemStack stack = context.getItemInHand();

        if (player == null) {
            return ActionResultType.PASS;
        }

        if (!world.isClientSide) {
            AxisAlignedBB area = new AxisAlignedBB(pos).inflate(1.5D, 1.0D, 1.5D);
            List<ExperienceOrbEntity> orbs = world.getEntitiesOfClass(ExperienceOrbEntity.class, area, orb -> orb.value >= 3);

            if (!orbs.isEmpty()) {
                ExperienceOrbEntity orb = orbs.get(0);
                orb.remove();
                popItem(world, pos, new ItemStack(Items.EXPERIENCE_BOTTLE));
                if (!player.abilities.instabuild) {
                    stack.shrink(1);
                }
            } else {
                popItem(world, pos, new ItemStack(this));
                if (!player.abilities.instabuild) {
                    stack.shrink(1);
                }
            }
        }

        player.swing(context.getHand(), true);
        return ActionResultType.sidedSuccess(world.isClientSide);
    }

    private void popItem(World world, BlockPos pos, ItemStack drop) {
        net.minecraft.block.Block.popResource(world, pos.above(), drop);
    }
}
