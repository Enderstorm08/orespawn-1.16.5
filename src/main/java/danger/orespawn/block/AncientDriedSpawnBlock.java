package danger.orespawn.block;

import java.util.Random;
import java.util.function.Supplier;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class AncientDriedSpawnBlock extends Block {
    public static final IntegerProperty HATCH = IntegerProperty.create("hatch", 0, 2);

    private static final VoxelShape SHAPE = VoxelShapes.box(0.1875D, 0.0D, 0.1875D, 0.8125D, 0.5625D, 0.8125D);
    private final Supplier<EntityType<?>> entityTypeSupplier;

    public AncientDriedSpawnBlock(AbstractBlock.Properties properties, Supplier<EntityType<?>> entityTypeSupplier) {
        super(properties.randomTicks());
        this.entityTypeSupplier = entityTypeSupplier;
        this.registerDefaultState(this.stateDefinition.any().setValue(HATCH, Integer.valueOf(0)));
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(HATCH);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader level, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return true;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld level, BlockPos pos, Random random) {
        this.progressHatch(state, level, pos, random, false);
    }

    @Override
    public void tick(BlockState state, ServerWorld level, BlockPos pos, Random random) {
        this.progressHatch(state, level, pos, random, true);
    }

    @Override
    public ActionResultType use(BlockState state, World level, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit) {
        if (level.isClientSide) {
            return ActionResultType.SUCCESS;
        }
        this.progressHatch(state, (ServerWorld) level, pos, level.random, true);
        return ActionResultType.CONSUME;
    }

    @Override
    public void playerDestroy(World level, PlayerEntity player, BlockPos pos, BlockState state, net.minecraft.tileentity.TileEntity blockEntity, ItemStack tool) {
        super.playerDestroy(level, player, pos, state, blockEntity, tool);
        if (!level.isClientSide) {
            ((ServerWorld) level).sendParticles(ParticleTypes.POOF, pos.getX() + 0.5D, pos.getY() + 0.2D, pos.getZ() + 0.5D, 10, 0.18D, 0.08D, 0.18D, 0.02D);
        }
    }

    private void progressHatch(BlockState state, ServerWorld level, BlockPos pos, Random random, boolean accelerated) {
        int hatch = state.getValue(HATCH).intValue();
        if (!accelerated && random.nextInt(4) != 0) {
            return;
        }

        level.sendParticles(ParticleTypes.HAPPY_VILLAGER, pos.getX() + 0.5D, pos.getY() + 0.15D, pos.getZ() + 0.5D, 4 + hatch * 2, 0.15D, 0.04D, 0.15D, 0.01D);
        if (hatch < 2) {
            level.setBlock(pos, state.setValue(HATCH, Integer.valueOf(hatch + 1)), 2);
            return;
        }

        EntityType<?> entityType = this.entityTypeSupplier.get();
        net.minecraft.entity.Entity entity = entityType.create(level);
        if (entity != null) {
            entity.moveTo(pos.getX() + 0.5D, pos.getY() + 0.15D, pos.getZ() + 0.5D, level.random.nextFloat() * 360.0F, 0.0F);
            if (entity instanceof MobEntity) {
                ((MobEntity) entity).finalizeSpawn(level, level.getCurrentDifficultyAt(pos), net.minecraft.entity.SpawnReason.SPAWN_EGG, null, null);
            }
            level.addFreshEntity(entity);
        }

        level.sendParticles(ParticleTypes.CLOUD, pos.getX() + 0.5D, pos.getY() + 0.2D, pos.getZ() + 0.5D, 14, 0.18D, 0.12D, 0.18D, 0.02D);
        level.removeBlock(pos, false);
    }
}
