package danger.orespawn.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SimpleTreeSeedItem extends Item {
    private final Block placedBlock;
    private final boolean spawnHappyParticles;

    public SimpleTreeSeedItem(Properties properties, Block placedBlock, boolean spawnHappyParticles) {
        super(properties);
        this.placedBlock = placedBlock;
        this.spawnHappyParticles = spawnHappyParticles;
    }

    @Override
    public ActionResultType useOn(ItemUseContext context) {
        World world = context.getLevel();
        BlockPos targetPos = context.getClickedPos();
        BlockState ground = world.getBlockState(targetPos);
        BlockPos plantPos = targetPos.above();

        if (!isValidGround(ground.getBlock()) || !world.getBlockState(plantPos).canBeReplaced(new BlockItemUseContext(context))) {
            return ActionResultType.FAIL;
        }

        if (!world.isClientSide) {
            world.setBlockAndUpdate(plantPos, this.placedBlock.defaultBlockState());
            if (!context.getPlayer().abilities.instabuild) {
                context.getItemInHand().shrink(1);
            }
        } else if (this.spawnHappyParticles) {
            for (int i = 0; i < 10; i++) {
                world.addParticle(
                        net.minecraft.particles.ParticleTypes.HAPPY_VILLAGER,
                        plantPos.getX() + world.random.nextDouble(),
                        plantPos.getY() + world.random.nextDouble(),
                        plantPos.getZ() + world.random.nextDouble(),
                        0.0D,
                        0.0D,
                        0.0D
                );
            }
        }

        return ActionResultType.sidedSuccess(world.isClientSide);
    }

    private boolean isValidGround(Block block) {
        return block == Blocks.GRASS_BLOCK || block == Blocks.DIRT || block == Blocks.COARSE_DIRT || block == Blocks.PODZOL || block == Blocks.FARMLAND;
    }
}
