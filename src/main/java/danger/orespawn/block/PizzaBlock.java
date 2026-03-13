package danger.orespawn.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import danger.orespawn.registry.OreSpawnBlocks;

public class PizzaBlock extends Block {
    public static final IntegerProperty BITES = IntegerProperty.create("bites", 0, 5);
    private static final VoxelShape[] SHAPES = new VoxelShape[] {
            Block.box(1.0D, 0.0D, 1.0D, 15.0D, 4.0D, 15.0D),
            Block.box(3.0D, 0.0D, 1.0D, 15.0D, 4.0D, 15.0D),
            Block.box(5.0D, 0.0D, 1.0D, 15.0D, 4.0D, 15.0D),
            Block.box(7.0D, 0.0D, 1.0D, 15.0D, 4.0D, 15.0D),
            Block.box(9.0D, 0.0D, 1.0D, 15.0D, 4.0D, 15.0D),
            Block.box(11.0D, 0.0D, 1.0D, 15.0D, 4.0D, 15.0D)
    };

    public PizzaBlock() {
        super(AbstractBlock.Properties.copy(Blocks.CAKE));
        this.registerDefaultState(this.stateDefinition.any().setValue(BITES, 0));
    }

    @Override
    public ActionResultType use(BlockState state, World level, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit) {
        if (level.isClientSide) {
            if (eat(level, pos, state, player).consumesAction()) {
                return ActionResultType.SUCCESS;
            }
            if (player.getItemInHand(hand).isEmpty()) {
                return ActionResultType.CONSUME;
            }
        }

        return eat(level, pos, state, player);
    }

    private ActionResultType eat(World level, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!player.canEat(false)) {
            return ActionResultType.PASS;
        }

        player.getFoodData().eat(4, 0.2F);
        int bites = state.getValue(BITES);
        if (bites < 5) {
            level.setBlock(pos, state.setValue(BITES, bites + 1), 3);
        } else {
            level.removeBlock(pos, false);
        }

        return ActionResultType.SUCCESS;
    }

    @Override
    public BlockState updateShape(BlockState state, net.minecraft.util.Direction direction, BlockState neighborState, net.minecraft.world.IWorld world, BlockPos pos, BlockPos neighborPos) {
        return direction == net.minecraft.util.Direction.DOWN && !state.canSurvive(world, pos) ? Blocks.AIR.defaultBlockState() : super.updateShape(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public boolean canSurvive(BlockState state, net.minecraft.world.IWorldReader level, BlockPos pos) {
        return level.getBlockState(pos.below()).getMaterial().isSolid();
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader level, BlockPos pos, ISelectionContext context) {
        return SHAPES[state.getValue(BITES)];
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(BITES);
    }

    @Override
    public ItemStack getCloneItemStack(IBlockReader level, BlockPos pos, BlockState state) {
        return new ItemStack(OreSpawnBlocks.PIZZA.get());
    }

    @Override
    public boolean isPathfindable(BlockState state, IBlockReader level, BlockPos pos, PathType type) {
        return false;
    }
}
