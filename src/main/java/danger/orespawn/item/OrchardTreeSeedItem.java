package danger.orespawn.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class OrchardTreeSeedItem extends Item {
    private final Block leavesBlock;
    private final int trunkHeight;
    private final int branchHeight;
    private final int branchLength;
    private final int canopyStart;
    private final int canopyTop;
    private final int baseCanopyRadius;

    public OrchardTreeSeedItem(
            Properties properties,
            Block leavesBlock,
            int trunkHeight,
            int branchHeight,
            int branchLength,
            int canopyStart,
            int canopyTop,
            int baseCanopyRadius
    ) {
        super(properties);
        this.leavesBlock = leavesBlock;
        this.trunkHeight = trunkHeight;
        this.branchHeight = branchHeight;
        this.branchLength = branchLength;
        this.canopyStart = canopyStart;
        this.canopyTop = canopyTop;
        this.baseCanopyRadius = baseCanopyRadius;
    }

    @Override
    public ActionResultType useOn(ItemUseContext context) {
        World world = context.getLevel();
        BlockPos groundPos = context.getClickedPos();
        if (!isValidGround(world.getBlockState(groundPos).getBlock())) {
            return ActionResultType.FAIL;
        }

        if (!hasSpace(world, groundPos)) {
            return ActionResultType.FAIL;
        }

        if (!world.isClientSide) {
            growTree(world, groundPos);
            if (context.getPlayer() != null && !context.getPlayer().abilities.instabuild) {
                context.getItemInHand().shrink(1);
            }
        }

        return ActionResultType.sidedSuccess(world.isClientSide);
    }

    private boolean hasSpace(World world, BlockPos groundPos) {
        for (int y = 1; y <= this.canopyTop + 1; y++) {
            int radius = y >= this.canopyStart ? this.baseCanopyRadius : this.branchLength;
            for (int x = -radius; x <= radius; x++) {
                for (int z = -radius; z <= radius; z++) {
                    BlockPos checkPos = groundPos.offset(x, y, z);
                    BlockState state = world.getBlockState(checkPos);
                    if (!state.getMaterial().isReplaceable() && !state.isAir() && state.getBlock() != this.leavesBlock) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private void growTree(World world, BlockPos groundPos) {
        BlockPos trunkBase = groundPos.above();
        BlockState log = Blocks.OAK_LOG.defaultBlockState();
        BlockState leaves = this.leavesBlock.defaultBlockState();

        for (int y = 0; y < this.trunkHeight; y++) {
            world.setBlockAndUpdate(trunkBase.above(y), log);
        }

        for (int offset = 1; offset < this.branchLength; offset++) {
            world.setBlockAndUpdate(trunkBase.offset(offset, this.branchHeight, 0), log);
            world.setBlockAndUpdate(trunkBase.offset(-offset, this.branchHeight, 0), log);
            world.setBlockAndUpdate(trunkBase.offset(0, this.branchHeight, offset), log);
            world.setBlockAndUpdate(trunkBase.offset(0, this.branchHeight, -offset), log);
        }

        for (int y = this.canopyStart; y <= this.canopyTop; y++) {
            int radius = this.baseCanopyRadius;
            if (y > this.canopyStart + 3) {
                radius--;
            }
            if (y > this.canopyStart + 5) {
                radius--;
            }
            radius = Math.max(2, radius);

            for (int x = -radius; x <= radius; x++) {
                for (int z = -radius; z <= radius; z++) {
                    BlockPos leafPos = trunkBase.offset(x, y, z);
                    BlockState existing = world.getBlockState(leafPos);
                    if (existing.getMaterial().isReplaceable() || existing.isAir()) {
                        world.setBlockAndUpdate(leafPos, leaves);
                    }
                }
            }
        }
    }

    private boolean isValidGround(Block block) {
        return block == Blocks.GRASS_BLOCK || block == Blocks.DIRT || block == Blocks.COARSE_DIRT || block == Blocks.PODZOL;
    }
}
