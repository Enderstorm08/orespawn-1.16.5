package danger.orespawn.registry;

import danger.orespawn.OreSpawn;
import danger.orespawn.block.AntNestBlock;
import net.minecraft.server.MinecraftServer;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public final class OreSpawnDimensions {
    public static final RegistryKey<World> DANGER_ISLES = RegistryKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(OreSpawn.MODID, "danger_isles"));
    public static final RegistryKey<World> MINING_PARADISE = RegistryKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(OreSpawn.MODID, "mining_paradise"));
    public static final RegistryKey<World> CRYSTAL_WORLD = RegistryKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(OreSpawn.MODID, "crystal_world"));
    public static final RegistryKey<World> RAINBOW_DIMENSION = RegistryKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(OreSpawn.MODID, "rainbow_dimension"));
    public static final RegistryKey<net.minecraft.world.DimensionType> DANGER_ISLES_TYPE = RegistryKey.create(Registry.DIMENSION_TYPE_REGISTRY, new ResourceLocation(OreSpawn.MODID, "danger_isles"));
    public static final RegistryKey<net.minecraft.world.DimensionType> MINING_PARADISE_TYPE = RegistryKey.create(Registry.DIMENSION_TYPE_REGISTRY, new ResourceLocation(OreSpawn.MODID, "mining_paradise"));
    public static final RegistryKey<net.minecraft.world.DimensionType> CRYSTAL_WORLD_TYPE = RegistryKey.create(Registry.DIMENSION_TYPE_REGISTRY, new ResourceLocation(OreSpawn.MODID, "crystal_world"));
    public static final RegistryKey<net.minecraft.world.DimensionType> RAINBOW_DIMENSION_TYPE = RegistryKey.create(Registry.DIMENSION_TYPE_REGISTRY, new ResourceLocation(OreSpawn.MODID, "rainbow_dimension"));

    private OreSpawnDimensions() {
    }

    public static RegistryKey<World> targetFor(AntNestBlock.DestinationMode mode) {
        switch (mode) {
            case RED_ANT:
                return DANGER_ISLES;
            case TERMITE:
                return MINING_PARADISE;
            case CRYSTAL_TERMITE:
                return CRYSTAL_WORLD;
            case RAINBOW_ANT:
                return RAINBOW_DIMENSION;
            default:
                return null;
        }
    }

    public static RegistryKey<World> randomAntDimension(java.util.Random random) {
        RegistryKey<World>[] options = new RegistryKey[] {
                DANGER_ISLES,
                MINING_PARADISE,
                CRYSTAL_WORLD,
                RAINBOW_DIMENSION
        };
        return options[random.nextInt(options.length)];
    }

    public static boolean isOreSpawnAntDimension(RegistryKey<World> dimension) {
        return DANGER_ISLES.equals(dimension)
                || MINING_PARADISE.equals(dimension)
                || CRYSTAL_WORLD.equals(dimension)
                || RAINBOW_DIMENSION.equals(dimension);
    }

    public static RegistryKey<World> targetFor(AntNestBlock.DestinationMode mode, RegistryKey<World> currentDimension, java.util.Random random) {
        if (mode == AntNestBlock.DestinationMode.UNSTABLE_ANT) {
            return isOreSpawnAntDimension(currentDimension) ? World.OVERWORLD : randomAntDimension(random);
        }

        RegistryKey<World> target = targetFor(mode);
        if (target != null && target.equals(currentDimension)) {
            return World.OVERWORLD;
        }
        return target;
    }

    public static ServerWorld resolveServerWorld(MinecraftServer server, RegistryKey<World> targetDimension) {
        ServerWorld exact = server.getLevel(targetDimension);
        if (exact != null) {
            return exact;
        }

        for (ServerWorld level : server.getAllLevels()) {
            if (level.dimension().location().equals(targetDimension.location())) {
                return level;
            }
        }

        return null;
    }

    public static BlockState platformBlockFor(RegistryKey<World> dimension) {
        if (CRYSTAL_WORLD.equals(dimension)) {
            return OreSpawnBlocks.CRYSTAL_PINK_BLOCK.get().defaultBlockState();
        }
        if (MINING_PARADISE.equals(dimension)) {
            return Blocks.STONE.defaultBlockState();
        }
        if (RAINBOW_DIMENSION.equals(dimension)) {
            return Blocks.GRASS_BLOCK.defaultBlockState();
        }
        return Blocks.DIRT.defaultBlockState();
    }

    public static BlockState accentBlockFor(RegistryKey<World> dimension) {
        if (CRYSTAL_WORLD.equals(dimension)) {
            return OreSpawnBlocks.TIGERS_EYE_BLOCK.get().defaultBlockState();
        }
        if (MINING_PARADISE.equals(dimension)) {
            return Blocks.GLOWSTONE.defaultBlockState();
        }
        if (RAINBOW_DIMENSION.equals(dimension)) {
            return Blocks.DANDELION.defaultBlockState();
        }
        return Blocks.OAK_LEAVES.defaultBlockState();
    }

    public static BlockState arrivalMarkerBlockFor(RegistryKey<World> dimension) {
        if (CRYSTAL_WORLD.equals(dimension)) {
            return OreSpawnBlocks.CRYSTAL_TERMITE_NEST.get().defaultBlockState();
        }
        if (MINING_PARADISE.equals(dimension)) {
            return OreSpawnBlocks.TERMITE_NEST.get().defaultBlockState();
        }
        if (RAINBOW_DIMENSION.equals(dimension)) {
            return OreSpawnBlocks.RAINBOW_ANT_NEST.get().defaultBlockState();
        }
        return OreSpawnBlocks.RED_ANT_NEST.get().defaultBlockState();
    }
}
