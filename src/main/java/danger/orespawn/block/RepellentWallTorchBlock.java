package danger.orespawn.block;

import java.util.List;
import java.util.function.Predicate;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class RepellentWallTorchBlock extends WallTorchBlock {
    private final Predicate<LivingEntity> predicate;
    private final double xzRange;
    private final double belowRange;
    private final double aboveRange;

    public RepellentWallTorchBlock(BasicParticleType particle, Predicate<LivingEntity> predicate, double xzRange, double belowRange, double aboveRange) {
        super(AbstractBlock.Properties.copy(net.minecraft.block.Blocks.WALL_TORCH).dropsLike(net.minecraft.block.Blocks.TORCH), particle);
        this.predicate = predicate;
        this.xzRange = xzRange;
        this.belowRange = belowRange;
        this.aboveRange = aboveRange;
    }

    @Override
    public void onPlace(BlockState state, World world, BlockPos pos, BlockState oldState, boolean isMoving) {
        super.onPlace(state, world, pos, oldState, isMoving);
        world.getBlockTicks().scheduleTick(pos, this, 10);
    }

    @Override
    public void tick(BlockState state, ServerWorld world, BlockPos pos, java.util.Random random) {
        repelNearby(world, pos);
        world.getBlockTicks().scheduleTick(pos, this, 10);
    }

    private void repelNearby(World world, BlockPos pos) {
        AxisAlignedBB box = new AxisAlignedBB(
                pos.getX() - this.xzRange,
                pos.getY() - this.belowRange,
                pos.getZ() - this.xzRange,
                pos.getX() + this.xzRange + 1.0D,
                pos.getY() + this.aboveRange,
                pos.getZ() + this.xzRange + 1.0D
        );
        List<LivingEntity> entities = world.getEntitiesOfClass(LivingEntity.class, box, this.predicate::test);
        for (LivingEntity entity : entities) {
            double dx = entity.getX() - (pos.getX() + 0.5D);
            double dz = entity.getZ() - (pos.getZ() + 0.5D);
            double dy = entity.getY() - pos.getY();
            double distance = Math.sqrt(dx * dx + dy * dy + dz * dz);
            if (distance <= 0.001D || distance > this.xzRange) {
                continue;
            }
            double strength = Math.max(0.0D, this.xzRange - distance) * 0.04D;
            entity.push(dx / distance * strength, 0.02D, dz / distance * strength);
        }
    }
}
