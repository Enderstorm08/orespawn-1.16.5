package danger.orespawn.block;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropsBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IBlockReader;
import net.minecraft.loot.LootContext;

public class SimpleOreCropBlock extends CropsBlock {
    public static final IntegerProperty AGE = BlockStateProperties.AGE_3;
    private static final VoxelShape[] SHAPES = new VoxelShape[] {
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D)
    };

    private final Supplier<? extends IItemProvider> seedItem;
    private final Supplier<? extends IItemProvider> cropItem;

    public SimpleOreCropBlock(Supplier<? extends IItemProvider> seedItem) {
        this(seedItem, seedItem);
    }

    public SimpleOreCropBlock(Supplier<? extends IItemProvider> seedItem, Supplier<? extends IItemProvider> cropItem) {
        super(AbstractBlock.Properties.copy(Blocks.WHEAT));
        this.seedItem = seedItem;
        this.cropItem = cropItem;
        this.registerDefaultState(this.stateDefinition.any().setValue(AGE, 0));
    }

    @Override
    protected IItemProvider getBaseSeedId() {
        return this.seedItem.get();
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return 3;
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<net.minecraft.block.Block, BlockState> builder) {
        builder.add(AGE);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader level, net.minecraft.util.math.BlockPos pos, net.minecraft.util.math.shapes.ISelectionContext context) {
        return SHAPES[state.getValue(this.getAgeProperty())];
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> drops = new ArrayList<>();
        int age = state.getValue(this.getAgeProperty());
        IItemProvider seed = this.seedItem.get();
        IItemProvider crop = this.cropItem.get();

        if (age >= this.getMaxAge()) {
            int cropCount = 2 + RANDOM.nextInt(4);
            drops.add(new ItemStack(crop, cropCount));
            if (crop != seed) {
                drops.add(new ItemStack(seed, 1 + RANDOM.nextInt(2)));
            }
        } else {
            drops.add(new ItemStack(seed));
        }

        return drops;
    }
}
