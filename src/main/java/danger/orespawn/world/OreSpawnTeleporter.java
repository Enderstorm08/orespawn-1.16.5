package danger.orespawn.world;

import danger.orespawn.registry.OreSpawnDimensions;
import java.util.function.Function;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.util.ITeleporter;

public class OreSpawnTeleporter implements ITeleporter {
    private final BlockPos targetPos;
    private final net.minecraft.util.RegistryKey<World> targetDimension;

    public OreSpawnTeleporter(BlockPos targetPos, net.minecraft.util.RegistryKey<World> targetDimension) {
        this.targetPos = targetPos;
        this.targetDimension = targetDimension;
    }

    @Override
    public Entity placeEntity(Entity entity, ServerWorld currentWorld, ServerWorld destWorld, float yaw, Function<Boolean, Entity> repositionEntity) {
        ensureArrivalPlatform(destWorld, this.targetPos);
        Entity placed = repositionEntity.apply(false);
        placed.moveTo(this.targetPos.getX() + 0.5D, this.targetPos.getY() + 1.0D, this.targetPos.getZ() + 0.5D, placed.yRot, placed.xRot);
        return placed;
    }

    private void ensureArrivalPlatform(ServerWorld world, BlockPos center) {
        BlockState floor = OreSpawnDimensions.platformBlockFor(this.targetDimension);
        BlockState accent = OreSpawnDimensions.accentBlockFor(this.targetDimension);
        BlockState marker = OreSpawnDimensions.arrivalMarkerBlockFor(this.targetDimension);

        for (int x = -4; x <= 4; x++) {
            for (int z = -4; z <= 4; z++) {
                BlockPos floorPos = center.offset(x, -1, z);
                BlockState state = (Math.abs(x) == 4 || Math.abs(z) == 4) ? accent : floor;
                world.setBlockAndUpdate(floorPos, state);
                for (int y = 0; y <= 3; y++) {
                    world.removeBlock(center.offset(x, y, z), false);
                }
            }
        }

        world.setBlockAndUpdate(center.offset(0, -1, 0), accent);
        world.setBlockAndUpdate(center.offset(0, 0, 0), marker);
        world.setBlockAndUpdate(center.offset(2, -1, 0), accent);
        world.setBlockAndUpdate(center.offset(-2, -1, 0), accent);
        world.setBlockAndUpdate(center.offset(0, -1, 2), accent);
        world.setBlockAndUpdate(center.offset(0, -1, -2), accent);
        world.setBlockAndUpdate(center.offset(4, 0, 4), Blocks.TORCH.defaultBlockState());
        world.setBlockAndUpdate(center.offset(-4, 0, 4), Blocks.TORCH.defaultBlockState());
        world.setBlockAndUpdate(center.offset(4, 0, -4), Blocks.TORCH.defaultBlockState());
        world.setBlockAndUpdate(center.offset(-4, 0, -4), Blocks.TORCH.defaultBlockState());
    }
}
