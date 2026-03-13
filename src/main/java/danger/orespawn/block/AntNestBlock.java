package danger.orespawn.block;

import danger.orespawn.registry.OreSpawnDimensions;
import danger.orespawn.world.OreSpawnTeleporter;
import java.util.Random;
import java.util.function.Predicate;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.util.text.StringTextComponent;

public class AntNestBlock extends Block {
    public enum DestinationMode {
        RED_ANT(biome -> biome.getBiomeCategory() == Biome.Category.PLAINS || biome.getBiomeCategory() == Biome.Category.FOREST),
        TERMITE(biome -> biome.getBiomeCategory() == Biome.Category.DESERT || biome.getBiomeCategory() == Biome.Category.MESA),
        CRYSTAL_TERMITE(biome -> biome.getBiomeCategory() == Biome.Category.ICY || biome.getBiomeCategory() == Biome.Category.EXTREME_HILLS),
        RAINBOW_ANT(biome -> biome.getBiomeCategory() == Biome.Category.JUNGLE || biome.getBiomeCategory() == Biome.Category.FOREST),
        UNSTABLE_ANT(biome -> true);

        private final Predicate<Biome> biomePredicate;

        DestinationMode(Predicate<Biome> biomePredicate) {
            this.biomePredicate = biomePredicate;
        }
    }

    private final DestinationMode destinationMode;

    public AntNestBlock(Properties properties, DestinationMode destinationMode) {
        super(properties);
        this.destinationMode = destinationMode;
    }

    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit) {
        if (world.isClientSide || !(world instanceof ServerWorld)) {
            return ActionResultType.sidedSuccess(world.isClientSide);
        }

        ServerWorld serverWorld = (ServerWorld) world;
        RegistryKey<World> targetDimension = OreSpawnDimensions.targetFor(this.destinationMode, serverWorld.dimension(), serverWorld.random);
        if (targetDimension != null && player instanceof ServerPlayerEntity) {
            ServerWorld destinationWorld = OreSpawnDimensions.resolveServerWorld(serverWorld.getServer(), targetDimension);
            if (destinationWorld != null) {
                BlockPos targetPos = findDestination(destinationWorld, player.blockPosition());
                serverWorld.playSound(null, pos, SoundEvents.CHORUS_FRUIT_TELEPORT, SoundCategory.BLOCKS, 1.0F, 1.0F);
                serverWorld.sendParticles(ParticleTypes.PORTAL, pos.getX() + 0.5D, pos.getY() + 0.75D, pos.getZ() + 0.5D, 40, 0.4D, 0.5D, 0.4D, 0.02D);
                if (destinationWorld.dimension().equals(serverWorld.dimension())) {
                    player.teleportTo(targetPos.getX() + 0.5D, targetPos.getY() + 1.0D, targetPos.getZ() + 0.5D);
                } else {
                    ((ServerPlayerEntity) player).changeDimension(destinationWorld, new OreSpawnTeleporter(targetPos, targetDimension));
                }
                destinationWorld.sendParticles(ParticleTypes.PORTAL, targetPos.getX() + 0.5D, targetPos.getY() + 1.0D, targetPos.getZ() + 0.5D, 40, 0.4D, 0.8D, 0.4D, 0.02D);
                return ActionResultType.SUCCESS;
            }

            player.displayClientMessage(new StringTextComponent("OreSpawn target dimension is not available in this world yet."), false);
            return ActionResultType.CONSUME;
        }
        return ActionResultType.CONSUME;
    }

    private BlockPos findDestination(ServerWorld world, BlockPos origin) {
        Random random = world.random;
        if (this.destinationMode == DestinationMode.UNSTABLE_ANT) {
            int dx = (random.nextInt(4096) - 2048);
            int dz = (random.nextInt(4096) - 2048);
            return world.getHeightmapPos(net.minecraft.world.gen.Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, origin.offset(dx, 0, dz));
        }

        for (int attempt = 0; attempt < 96; attempt++) {
            int distance = 256 + random.nextInt(3072);
            int dx = random.nextBoolean() ? distance : -distance;
            int dz = random.nextBoolean() ? distance : -distance;
            BlockPos candidate = world.getHeightmapPos(net.minecraft.world.gen.Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, origin.offset(dx, 0, dz));
            RegistryKey<Biome> biomeKey = world.getBiomeName(candidate).orElse(null);
            Biome biome = world.getBiome(candidate);
            if (biomeKey != null && this.destinationMode.biomePredicate.test(biome)) {
                return candidate;
            }
        }

        return world.getHeightmapPos(net.minecraft.world.gen.Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, origin.offset(512, 0, 512));
    }
}
