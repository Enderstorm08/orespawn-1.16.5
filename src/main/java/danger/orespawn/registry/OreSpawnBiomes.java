package danger.orespawn.registry;

import danger.orespawn.OreSpawn;
import net.minecraft.entity.EntityClassification;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.biome.MoodSoundAmbience;
import net.minecraft.world.biome.ParticleEffectAmbience;
import net.minecraft.world.biome.SoundAdditionsAmbience;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class OreSpawnBiomes {
    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, OreSpawn.MODID);

    public static final RegistryObject<Biome> DANGER_ISLES = BIOMES.register("danger_isles", OreSpawnBiomes::dangerIsles);
    public static final RegistryObject<Biome> DANGER_ISLES_GROVE = BIOMES.register("danger_isles_grove", OreSpawnBiomes::dangerIslesGrove);
    public static final RegistryObject<Biome> DANGER_ISLES_MEADOW = BIOMES.register("danger_isles_meadow", OreSpawnBiomes::dangerIslesMeadow);
    public static final RegistryObject<Biome> MINING_PARADISE = BIOMES.register("mining_paradise", OreSpawnBiomes::miningParadise);
    public static final RegistryObject<Biome> MINING_PARADISE_PEAKS = BIOMES.register("mining_paradise_peaks", OreSpawnBiomes::miningParadisePeaks);
    public static final RegistryObject<Biome> MINING_PARADISE_DEPTHS = BIOMES.register("mining_paradise_depths", OreSpawnBiomes::miningParadiseDepths);
    public static final RegistryObject<Biome> CRYSTAL_WORLD = BIOMES.register("crystal_world", OreSpawnBiomes::crystalWorld);
    public static final RegistryObject<Biome> CRYSTAL_WORLD_SHORE = BIOMES.register("crystal_world_shore", OreSpawnBiomes::crystalWorldShore);
    public static final RegistryObject<Biome> CRYSTAL_WORLD_GLADE = BIOMES.register("crystal_world_glade", OreSpawnBiomes::crystalWorldGlade);
    public static final RegistryObject<Biome> RAINBOW_DIMENSION = BIOMES.register("rainbow_dimension", OreSpawnBiomes::rainbowDimension);
    public static final RegistryObject<Biome> RAINBOW_DIMENSION_GROVE = BIOMES.register("rainbow_dimension_grove", OreSpawnBiomes::rainbowDimensionGrove);
    public static final RegistryObject<Biome> RAINBOW_DIMENSION_MEADOW = BIOMES.register("rainbow_dimension_meadow", OreSpawnBiomes::rainbowDimensionMeadow);

    private OreSpawnBiomes() {
    }

    private static Biome dangerIsles() {
        MobSpawnInfo.Builder spawns = defaultSpawns();
        spawns.addSpawn(EntityClassification.AMBIENT, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.FIREFLY.get(), 24, 2, 6));
        spawns.addSpawn(EntityClassification.AMBIENT, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.BUTTERFLY.get(), 14, 1, 4));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.PEACOCK.get(), 7, 2, 4));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.FAIRY.get(), 5, 1, 2));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.STINK_BUG.get(), 4, 1, 2));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.RED_ANT.get(), 18, 2, 5));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.BROWN_ANT.get(), 10, 2, 4));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(net.minecraft.entity.EntityType.COW, 10, 2, 4));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(net.minecraft.entity.EntityType.PIG, 9, 2, 4));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(net.minecraft.entity.EntityType.CHICKEN, 8, 2, 5));

        BiomeGenerationSettings.Builder generation = overworldGeneration(
                SurfaceBuilder.DEFAULT.configured(new SurfaceBuilderConfig(
                        net.minecraft.block.Blocks.GRASS_BLOCK.defaultBlockState(),
                        net.minecraft.block.Blocks.DIRT.defaultBlockState(),
                        net.minecraft.block.Blocks.GRAVEL.defaultBlockState()))
        );
        DefaultBiomeFeatures.addDefaultFlowers(generation);
        DefaultBiomeFeatures.addPlainGrass(generation);
        DefaultBiomeFeatures.addDefaultMushrooms(generation);

        return biome(
                Biome.RainType.RAIN,
                Biome.Category.SWAMP,
                0.35F,
                0.45F,
                0.95F,
                0.9F,
                0x5E8C59,
                0x31443A,
                0x3F76E4,
                0x283B38,
                0x719C66,
                0x4D7C46,
                ParticleTypes.MYCELIUM,
                0.006F,
                SoundEvents.AMBIENT_UNDERWATER_LOOP,
                new SoundAdditionsAmbience(SoundEvents.WATER_AMBIENT, 0.011D),
                spawns,
                generation
        );
    }

    private static Biome miningParadise() {
        MobSpawnInfo.Builder spawns = defaultSpawns();
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.RAT.get(), 12, 2, 4));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.TERMITE.get(), 18, 2, 5));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.UNSTABLE_ANT.get(), 6, 1, 2));
        spawns.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(net.minecraft.entity.EntityType.SILVERFISH, 16, 2, 4));
        spawns.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(net.minecraft.entity.EntityType.SPIDER, 10, 1, 3));
        spawns.addSpawn(EntityClassification.AMBIENT, new MobSpawnInfo.Spawners(net.minecraft.entity.EntityType.BAT, 12, 2, 6));

        BiomeGenerationSettings.Builder generation = overworldGeneration(
                SurfaceBuilder.DEFAULT.configured(new SurfaceBuilderConfig(
                        net.minecraft.block.Blocks.STONE.defaultBlockState(),
                        net.minecraft.block.Blocks.STONE.defaultBlockState(),
                        net.minecraft.block.Blocks.GRAVEL.defaultBlockState()))
        );
        DefaultBiomeFeatures.addExtraGold(generation);

        return biome(
                Biome.RainType.NONE,
                Biome.Category.MESA,
                1.8F,
                0.18F,
                2.0F,
                0.0F,
                0xC58C54,
                0x8A5A2B,
                0x5A7FB5,
                0xCC8A46,
                0xA26F3A,
                0xA26F3A,
                ParticleTypes.WHITE_ASH,
                0.0035F,
                SoundEvents.AMBIENT_CAVE,
                new SoundAdditionsAmbience(SoundEvents.BAT_AMBIENT, 0.006D),
                spawns,
                generation
        );
    }

    private static Biome dangerIslesGrove() {
        MobSpawnInfo.Builder spawns = defaultSpawns();
        spawns.addSpawn(EntityClassification.AMBIENT, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.FIREFLY.get(), 16, 2, 5));
        spawns.addSpawn(EntityClassification.AMBIENT, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.BUTTERFLY.get(), 18, 2, 5));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.PEACOCK.get(), 8, 2, 4));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.FAIRY.get(), 6, 1, 2));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.RED_ANT.get(), 12, 2, 4));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.BROWN_ANT.get(), 8, 2, 4));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(net.minecraft.entity.EntityType.SHEEP, 10, 2, 4));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(net.minecraft.entity.EntityType.WOLF, 5, 1, 2));

        BiomeGenerationSettings.Builder generation = overworldGeneration(
                SurfaceBuilder.DEFAULT.configured(new SurfaceBuilderConfig(
                        net.minecraft.block.Blocks.GRASS_BLOCK.defaultBlockState(),
                        net.minecraft.block.Blocks.DIRT.defaultBlockState(),
                        net.minecraft.block.Blocks.COARSE_DIRT.defaultBlockState()))
        );
        DefaultBiomeFeatures.addForestFlowers(generation);
        DefaultBiomeFeatures.addLightBambooVegetation(generation);

        return biome(
                Biome.RainType.RAIN,
                Biome.Category.FOREST,
                0.18F,
                0.28F,
                0.9F,
                0.95F,
                0x4C8B68,
                0x213F32,
                0x5F88EA,
                0x253B31,
                0x5FB15B,
                0x3E8D4A,
                ParticleTypes.HAPPY_VILLAGER,
                0.0025F,
                SoundEvents.AMBIENT_UNDERWATER_LOOP_ADDITIONS,
                new SoundAdditionsAmbience(SoundEvents.PARROT_AMBIENT, 0.005D),
                spawns,
                generation
        );
    }

    private static Biome dangerIslesMeadow() {
        MobSpawnInfo.Builder spawns = defaultSpawns();
        spawns.addSpawn(EntityClassification.AMBIENT, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.BUTTERFLY.get(), 16, 2, 5));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.GAZELLE.get(), 10, 2, 4));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.PEACOCK.get(), 6, 2, 4));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.RED_ANT.get(), 10, 2, 4));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.BROWN_ANT.get(), 9, 2, 4));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(net.minecraft.entity.EntityType.SHEEP, 8, 2, 4));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(net.minecraft.entity.EntityType.HORSE, 5, 2, 3));

        BiomeGenerationSettings.Builder generation = overworldGeneration(
                SurfaceBuilder.DEFAULT.configured(new SurfaceBuilderConfig(
                        net.minecraft.block.Blocks.GRASS_BLOCK.defaultBlockState(),
                        net.minecraft.block.Blocks.DIRT.defaultBlockState(),
                        net.minecraft.block.Blocks.COARSE_DIRT.defaultBlockState()))
        );
        DefaultBiomeFeatures.addPlainGrass(generation);
        DefaultBiomeFeatures.addDefaultFlowers(generation);
        DefaultBiomeFeatures.addDefaultExtraVegetation(generation);

        return biome(
                Biome.RainType.RAIN,
                Biome.Category.PLAINS,
                0.14F,
                0.08F,
                0.85F,
                0.75F,
                0x74B96D,
                0x304635,
                0x66A8FF,
                0xA9D28B,
                0x7CCF68,
                0x62B253,
                ParticleTypes.HAPPY_VILLAGER,
                0.0018F,
                SoundEvents.AMBIENT_UNDERWATER_LOOP_ADDITIONS,
                new SoundAdditionsAmbience(SoundEvents.PARROT_AMBIENT, 0.004D),
                spawns,
                generation
        );
    }

    private static Biome miningParadisePeaks() {
        MobSpawnInfo.Builder spawns = defaultSpawns();
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.RAT.get(), 10, 2, 4));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.TERMITE.get(), 16, 2, 5));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.UNSTABLE_ANT.get(), 5, 1, 2));
        spawns.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(net.minecraft.entity.EntityType.CAVE_SPIDER, 10, 1, 3));
        spawns.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(net.minecraft.entity.EntityType.SKELETON, 12, 1, 3));

        BiomeGenerationSettings.Builder generation = overworldGeneration(
                SurfaceBuilder.DEFAULT.configured(new SurfaceBuilderConfig(
                        net.minecraft.block.Blocks.STONE.defaultBlockState(),
                        net.minecraft.block.Blocks.ANDESITE.defaultBlockState(),
                        net.minecraft.block.Blocks.GRAVEL.defaultBlockState()))
        );
        DefaultBiomeFeatures.addDefaultExtraVegetation(generation);
        DefaultBiomeFeatures.addExtraEmeralds(generation);

        return biome(
                Biome.RainType.NONE,
                Biome.Category.EXTREME_HILLS,
                1.45F,
                0.95F,
                1.2F,
                0.05F,
                0x7C6C52,
                0x5A4735,
                0x6B88C7,
                0x7C6042,
                0x8D7D5F,
                0x8D7D5F,
                ParticleTypes.ASH,
                0.004F,
                SoundEvents.AMBIENT_BASALT_DELTAS_LOOP,
                new SoundAdditionsAmbience(SoundEvents.BASALT_STEP, 0.008D),
                spawns,
                generation
        );
    }

    private static Biome miningParadiseDepths() {
        MobSpawnInfo.Builder spawns = defaultSpawns();
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.RAT.get(), 8, 2, 4));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.TERMITE.get(), 14, 2, 4));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.UNSTABLE_ANT.get(), 8, 1, 2));
        spawns.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.MANTIS.get(), 10, 1, 2));
        spawns.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(net.minecraft.entity.EntityType.CAVE_SPIDER, 12, 1, 3));
        spawns.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(net.minecraft.entity.EntityType.ZOMBIE, 10, 1, 3));
        spawns.addSpawn(EntityClassification.AMBIENT, new MobSpawnInfo.Spawners(net.minecraft.entity.EntityType.BAT, 16, 2, 6));

        BiomeGenerationSettings.Builder generation = overworldGeneration(
                SurfaceBuilder.DEFAULT.configured(new SurfaceBuilderConfig(
                        net.minecraft.block.Blocks.GRAVEL.defaultBlockState(),
                        net.minecraft.block.Blocks.STONE.defaultBlockState(),
                        net.minecraft.block.Blocks.BLACKSTONE.defaultBlockState()))
        );
        DefaultBiomeFeatures.addDefaultMushrooms(generation);
        DefaultBiomeFeatures.addExtraGold(generation);

        return biome(
                Biome.RainType.NONE,
                Biome.Category.EXTREME_HILLS,
                -0.9F,
                0.1F,
                1.6F,
                0.0F,
                0x5E5550,
                0x2A2422,
                0x576F8F,
                0x40352E,
                0x67615A,
                0x67615A,
                ParticleTypes.ASH,
                0.005F,
                SoundEvents.AMBIENT_CAVE,
                new SoundAdditionsAmbience(SoundEvents.BAT_AMBIENT, 0.003D),
                spawns,
                generation
        );
    }

    private static Biome crystalWorld() {
        MobSpawnInfo.Builder spawns = defaultSpawns();
        spawns.addSpawn(EntityClassification.AMBIENT, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.MOTH.get(), 12, 1, 3));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.FAIRY.get(), 4, 1, 2));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.TERMITE.get(), 10, 1, 3));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.UNSTABLE_ANT.get(), 8, 1, 2));
        spawns.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.MANTIS.get(), 6, 1, 2));
        spawns.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(net.minecraft.entity.EntityType.ENDERMAN, 9, 1, 2));
        spawns.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(net.minecraft.entity.EntityType.WITCH, 4, 1, 1));
        spawns.addSpawn(EntityClassification.AMBIENT, new MobSpawnInfo.Spawners(net.minecraft.entity.EntityType.BAT, 8, 1, 3));

        BiomeGenerationSettings.Builder generation = overworldGeneration(
                SurfaceBuilder.DEFAULT.configured(new SurfaceBuilderConfig(
                        OreSpawnBlocks.CRYSTAL_PINK_BLOCK.get().defaultBlockState(),
                        OreSpawnBlocks.CRYSTAL_PINK_BLOCK.get().defaultBlockState(),
                        OreSpawnBlocks.CRYSTAL_PINK_BLOCK.get().defaultBlockState()))
        );
        DefaultBiomeFeatures.addDefaultFlowers(generation);
        DefaultBiomeFeatures.addSurfaceFreezing(generation);

        return biome(
                Biome.RainType.SNOW,
                Biome.Category.ICY,
                0.6F,
                0.55F,
                -0.1F,
                0.8F,
                0xD6C8FF,
                0xD5A7E8,
                0x7A9BFF,
                0xEFD9FF,
                0xE7A9E9,
                0xE7A9E9,
                ParticleTypes.ENCHANT,
                0.0045F,
                SoundEvents.AMBIENT_WARPED_FOREST_LOOP,
                new SoundAdditionsAmbience(SoundEvents.ENDERMAN_AMBIENT, 0.006D),
                spawns,
                generation
        );
    }

    private static Biome rainbowDimension() {
        MobSpawnInfo.Builder spawns = defaultSpawns();
        spawns.addSpawn(EntityClassification.AMBIENT, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.BUTTERFLY.get(), 20, 2, 5));
        spawns.addSpawn(EntityClassification.AMBIENT, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.FIREFLY.get(), 10, 1, 3));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.PEACOCK.get(), 6, 2, 4));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.FAIRY.get(), 8, 1, 3));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.GAZELLE.get(), 8, 2, 4));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.STINKY.get(), 5, 1, 2));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.RAINBOW_ANT.get(), 16, 2, 4));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.UNSTABLE_ANT.get(), 5, 1, 2));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(net.minecraft.entity.EntityType.RABBIT, 10, 2, 4));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(net.minecraft.entity.EntityType.HORSE, 6, 2, 3));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(net.minecraft.entity.EntityType.BEE, 8, 1, 3));

        BiomeGenerationSettings.Builder generation = overworldGeneration(
                SurfaceBuilder.DEFAULT.configured(new SurfaceBuilderConfig(
                        net.minecraft.block.Blocks.GRASS_BLOCK.defaultBlockState(),
                        net.minecraft.block.Blocks.DIRT.defaultBlockState(),
                        net.minecraft.block.Blocks.SAND.defaultBlockState()))
        );
        DefaultBiomeFeatures.addDefaultFlowers(generation);
        DefaultBiomeFeatures.addPlainGrass(generation);
        DefaultBiomeFeatures.addPlainVegetation(generation);

        return biome(
                Biome.RainType.RAIN,
                Biome.Category.FOREST,
                0.22F,
                0.2F,
                0.8F,
                0.7F,
                0x92D96B,
                0xF1A2FF,
                0x57C4FF,
                0xB6F0FF,
                0x86F77E,
                0xD16CFF,
                ParticleTypes.END_ROD,
                0.003F,
                SoundEvents.AMBIENT_CRIMSON_FOREST_LOOP,
                new SoundAdditionsAmbience(SoundEvents.NOTE_BLOCK_BELL, 0.01D),
                spawns,
                generation
        );
    }

    private static Biome crystalWorldShore() {
        MobSpawnInfo.Builder spawns = defaultSpawns();
        spawns.addSpawn(EntityClassification.AMBIENT, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.MOTH.get(), 10, 1, 3));
        spawns.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(net.minecraft.entity.EntityType.ENDERMAN, 6, 1, 2));

        BiomeGenerationSettings.Builder generation = overworldGeneration(
                SurfaceBuilder.DEFAULT.configured(new SurfaceBuilderConfig(
                        OreSpawnBlocks.TIGERS_EYE_BLOCK.get().defaultBlockState(),
                        OreSpawnBlocks.CRYSTAL_PINK_BLOCK.get().defaultBlockState(),
                        OreSpawnBlocks.CRYSTAL_PINK_BLOCK.get().defaultBlockState()))
        );
        DefaultBiomeFeatures.addDefaultFlowers(generation);
        DefaultBiomeFeatures.addSurfaceFreezing(generation);

        return biome(
                Biome.RainType.SNOW,
                Biome.Category.BEACH,
                0.02F,
                0.03F,
                0.05F,
                0.65F,
                0xC9BCFF,
                0xC49ADF,
                0x89A9FF,
                0xF5E6FF,
                0xE4B4EF,
                0xE4B4EF,
                ParticleTypes.PORTAL,
                0.003F,
                SoundEvents.AMBIENT_WARPED_FOREST_MOOD,
                new SoundAdditionsAmbience(SoundEvents.ENDERMAN_AMBIENT, 0.004D),
                spawns,
                generation
        );
    }

    private static Biome crystalWorldGlade() {
        MobSpawnInfo.Builder spawns = defaultSpawns();
        spawns.addSpawn(EntityClassification.AMBIENT, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.MOTH.get(), 14, 1, 3));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.FAIRY.get(), 6, 1, 2));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.GAZELLE.get(), 5, 2, 3));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.UNSTABLE_ANT.get(), 5, 1, 2));
        spawns.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.MANTIS.get(), 8, 1, 2));
        spawns.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(net.minecraft.entity.EntityType.ENDERMAN, 6, 1, 2));

        BiomeGenerationSettings.Builder generation = overworldGeneration(
                SurfaceBuilder.DEFAULT.configured(new SurfaceBuilderConfig(
                        OreSpawnBlocks.TIGERS_EYE_BLOCK.get().defaultBlockState(),
                        OreSpawnBlocks.CRYSTAL_PINK_BLOCK.get().defaultBlockState(),
                        OreSpawnBlocks.TIGERS_EYE_BLOCK.get().defaultBlockState()))
        );
        DefaultBiomeFeatures.addDefaultFlowers(generation);
        DefaultBiomeFeatures.addPlainGrass(generation);

        return biome(
                Biome.RainType.SNOW,
                Biome.Category.FOREST,
                0.2F,
                0.24F,
                0.0F,
                0.7F,
                0xCFC2FF,
                0xBA8DDE,
                0x8AA5FF,
                0xF4E3FF,
                0xE0B8F6,
                0xE0B8F6,
                ParticleTypes.ENCHANT,
                0.0036F,
                SoundEvents.AMBIENT_WARPED_FOREST_ADDITIONS,
                new SoundAdditionsAmbience(SoundEvents.NOTE_BLOCK_CHIME, 0.008D),
                spawns,
                generation
        );
    }

    private static Biome rainbowDimensionGrove() {
        MobSpawnInfo.Builder spawns = defaultSpawns();
        spawns.addSpawn(EntityClassification.AMBIENT, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.BUTTERFLY.get(), 24, 2, 6));
        spawns.addSpawn(EntityClassification.AMBIENT, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.FIREFLY.get(), 14, 2, 4));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.PEACOCK.get(), 7, 2, 4));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.FAIRY.get(), 9, 1, 3));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.STINK_BUG.get(), 5, 1, 2));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.RAINBOW_ANT.get(), 12, 2, 4));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.UNSTABLE_ANT.get(), 4, 1, 2));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(net.minecraft.entity.EntityType.BEE, 12, 1, 3));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(net.minecraft.entity.EntityType.RABBIT, 8, 2, 4));

        BiomeGenerationSettings.Builder generation = overworldGeneration(
                SurfaceBuilder.DEFAULT.configured(new SurfaceBuilderConfig(
                        net.minecraft.block.Blocks.GRASS_BLOCK.defaultBlockState(),
                        net.minecraft.block.Blocks.DIRT.defaultBlockState(),
                        net.minecraft.block.Blocks.PODZOL.defaultBlockState()))
        );
        DefaultBiomeFeatures.addForestFlowers(generation);
        DefaultBiomeFeatures.addDefaultMushrooms(generation);

        return biome(
                Biome.RainType.RAIN,
                Biome.Category.JUNGLE,
                0.28F,
                0.38F,
                0.85F,
                0.85F,
                0x79DDB4,
                0xE37BFF,
                0x64C4FF,
                0xD5F3FF,
                0x7AF56E,
                0xC84DFF,
                ParticleTypes.TOTEM_OF_UNDYING,
                0.002F,
                SoundEvents.AMBIENT_CRIMSON_FOREST_ADDITIONS,
                new SoundAdditionsAmbience(SoundEvents.NOTE_BLOCK_CHIME, 0.012D),
                spawns,
                generation
        );
    }

    private static Biome rainbowDimensionMeadow() {
        MobSpawnInfo.Builder spawns = defaultSpawns();
        spawns.addSpawn(EntityClassification.AMBIENT, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.BUTTERFLY.get(), 18, 2, 5));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.GAZELLE.get(), 12, 2, 4));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.PEACOCK.get(), 8, 2, 4));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.STINKY.get(), 7, 1, 2));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OreSpawnEntityTypes.RAINBOW_ANT.get(), 10, 2, 4));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(net.minecraft.entity.EntityType.HORSE, 7, 2, 3));
        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(net.minecraft.entity.EntityType.RABBIT, 10, 2, 4));

        BiomeGenerationSettings.Builder generation = overworldGeneration(
                SurfaceBuilder.DEFAULT.configured(new SurfaceBuilderConfig(
                        net.minecraft.block.Blocks.GRASS_BLOCK.defaultBlockState(),
                        net.minecraft.block.Blocks.DIRT.defaultBlockState(),
                        net.minecraft.block.Blocks.SAND.defaultBlockState()))
        );
        DefaultBiomeFeatures.addPlainGrass(generation);
        DefaultBiomeFeatures.addDefaultFlowers(generation);
        DefaultBiomeFeatures.addDefaultExtraVegetation(generation);

        return biome(
                Biome.RainType.RAIN,
                Biome.Category.PLAINS,
                0.12F,
                0.1F,
                0.9F,
                0.65F,
                0x85E67A,
                0xD87FFF,
                0x5CCBFF,
                0xDDF7FF,
                0x8BFF7D,
                0xD96DFF,
                ParticleTypes.END_ROD,
                0.0024F,
                SoundEvents.AMBIENT_CRIMSON_FOREST_LOOP,
                new SoundAdditionsAmbience(SoundEvents.NOTE_BLOCK_CHIME, 0.015D),
                spawns,
                generation
        );
    }

    private static MobSpawnInfo.Builder defaultSpawns() {
        MobSpawnInfo.Builder spawns = new MobSpawnInfo.Builder();
        DefaultBiomeFeatures.farmAnimals(spawns);
        DefaultBiomeFeatures.commonSpawns(spawns);
        return spawns;
    }

    private static BiomeGenerationSettings.Builder overworldGeneration(ConfiguredSurfaceBuilder<?> surface) {
        BiomeGenerationSettings.Builder generation = new BiomeGenerationSettings.Builder().surfaceBuilder(surface);
        DefaultBiomeFeatures.addDefaultCarvers(generation);
        DefaultBiomeFeatures.addDefaultLakes(generation);
        DefaultBiomeFeatures.addDefaultMonsterRoom(generation);
        DefaultBiomeFeatures.addDefaultUndergroundVariety(generation);
        DefaultBiomeFeatures.addDefaultOres(generation);
        DefaultBiomeFeatures.addDefaultSoftDisks(generation);
        DefaultBiomeFeatures.addDefaultMushrooms(generation);
        DefaultBiomeFeatures.addDefaultSprings(generation);
        return generation;
    }

    private static Biome biome(
            Biome.RainType precipitation,
            Biome.Category category,
            float depth,
            float scale,
            float temperature,
            float downfall,
            int waterColor,
            int waterFogColor,
            int skyColor,
            int fogColor,
            int grassColor,
            int foliageColor,
            IParticleData ambientParticle,
            float ambientParticleChance,
            SoundEvent ambientLoop,
            SoundAdditionsAmbience ambientAdditions,
            MobSpawnInfo.Builder spawns,
            BiomeGenerationSettings.Builder generation) {
        BiomeAmbience.Builder ambience = new BiomeAmbience.Builder()
                .waterColor(waterColor)
                .waterFogColor(waterFogColor)
                .skyColor(skyColor)
                .fogColor(fogColor)
                .grassColorOverride(grassColor)
                .foliageColorOverride(foliageColor)
                .ambientParticle(new ParticleEffectAmbience(ambientParticle, ambientParticleChance))
                .ambientLoopSound(ambientLoop)
                .ambientMoodSound(MoodSoundAmbience.LEGACY_CAVE_SETTINGS);
        if (ambientAdditions != null) {
            ambience.ambientAdditionsSound(ambientAdditions);
        }

        return new Biome.Builder()
                .precipitation(precipitation)
                .biomeCategory(category)
                .depth(depth)
                .scale(scale)
                .temperature(temperature)
                .downfall(downfall)
                .specialEffects(ambience.build())
                .mobSpawnSettings(spawns.build())
                .generationSettings(generation.build())
                .build();
    }
}
