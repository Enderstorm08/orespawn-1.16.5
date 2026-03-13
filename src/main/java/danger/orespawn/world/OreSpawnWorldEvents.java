package danger.orespawn.world;

import danger.orespawn.OreSpawn;
import danger.orespawn.registry.OreSpawnEntityTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = OreSpawn.MODID)
public final class OreSpawnWorldEvents {
    private OreSpawnWorldEvents() {
    }

    @SubscribeEvent
    public static void onBiomeLoading(BiomeLoadingEvent event) {
        ResourceLocation biomeName = event.getName();
        Biome.Category category = event.getCategory();
        if (category == null) {
            return;
        }

        if (biomeName != null && OreSpawn.MODID.equals(biomeName.getNamespace())) {
            addOreSpawnDimensionFeatures(event, biomeName.getPath());
            return;
        }

        if (isInsectAmbientOverworld(category)) {
            event.getSpawns().addSpawn(EntityClassification.AMBIENT, new net.minecraft.world.biome.MobSpawnInfo.Spawners(OreSpawnEntityTypes.FIREFLY.get(), 18, 2, 6));
            event.getSpawns().addSpawn(EntityClassification.AMBIENT, new net.minecraft.world.biome.MobSpawnInfo.Spawners(OreSpawnEntityTypes.BUTTERFLY.get(), 12, 1, 4));
            event.getSpawns().addSpawn(EntityClassification.AMBIENT, new net.minecraft.world.biome.MobSpawnInfo.Spawners(OreSpawnEntityTypes.MOTH.get(), 10, 1, 3));
        }

        if (category == Biome.Category.FOREST || category == Biome.Category.PLAINS || category == Biome.Category.JUNGLE) {
            event.getSpawns().addSpawn(EntityClassification.CREATURE, new net.minecraft.world.biome.MobSpawnInfo.Spawners(OreSpawnEntityTypes.PEACOCK.get(), 8, 2, 4));
        }

        if (category == Biome.Category.PLAINS || category == Biome.Category.SAVANNA || category == Biome.Category.FOREST) {
            event.getSpawns().addSpawn(EntityClassification.CREATURE, new net.minecraft.world.biome.MobSpawnInfo.Spawners(OreSpawnEntityTypes.GAZELLE.get(), 6, 2, 4));
        }

        if (category == Biome.Category.FOREST || category == Biome.Category.JUNGLE || category == Biome.Category.MUSHROOM) {
            event.getSpawns().addSpawn(EntityClassification.CREATURE, new net.minecraft.world.biome.MobSpawnInfo.Spawners(OreSpawnEntityTypes.FAIRY.get(), 6, 1, 3));
        }

        if (category == Biome.Category.SWAMP || category == Biome.Category.FOREST || category == Biome.Category.PLAINS) {
            event.getSpawns().addSpawn(EntityClassification.CREATURE, new net.minecraft.world.biome.MobSpawnInfo.Spawners(OreSpawnEntityTypes.RAT.get(), 10, 2, 4));
        }

        if (category == Biome.Category.SWAMP || category == Biome.Category.JUNGLE || category == Biome.Category.FOREST) {
            event.getSpawns().addSpawn(EntityClassification.CREATURE, new net.minecraft.world.biome.MobSpawnInfo.Spawners(OreSpawnEntityTypes.STINK_BUG.get(), 6, 1, 2));
            event.getSpawns().addSpawn(EntityClassification.MONSTER, new net.minecraft.world.biome.MobSpawnInfo.Spawners(OreSpawnEntityTypes.MANTIS.get(), 4, 1, 2));
        }

        if (category == Biome.Category.SWAMP || category == Biome.Category.PLAINS) {
            event.getSpawns().addSpawn(EntityClassification.CREATURE, new net.minecraft.world.biome.MobSpawnInfo.Spawners(OreSpawnEntityTypes.STINKY.get(), 4, 1, 2));
        }

    }

    private static boolean isInsectAmbientOverworld(Biome.Category category) {
        return category == Biome.Category.FOREST
                || category == Biome.Category.PLAINS
                || category == Biome.Category.SWAMP
                || category == Biome.Category.JUNGLE
                || category == Biome.Category.TAIGA;
    }

    private static void addOreSpawnDimensionFeatures(BiomeLoadingEvent event, String path) {
        if (path.startsWith("danger_isles")) {
            event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, OreSpawnConfiguredFeatures.DANGER_RUBY_ORE);
            event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, OreSpawnConfiguredFeatures.DANGER_SALT_ORE);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.DANGER_RED_ANT_TROLL_PATCH);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.DANGER_RED_ANT_NESTS);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.UNSTABLE_ANT_NESTS);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.DANGER_RUBY_BOULDERS);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.DANGER_ORCHARD_HEAPS);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.DANGER_DRIED_FIELDS);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.DANGER_RUINS);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.DANGER_GROVES);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.DANGER_MONOLITHS);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.DANGER_COMPOUNDS);
            event.getGeneration().addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, OreSpawnConfiguredFeatures.DANGER_GRAND_LANDMARKS);
            event.getGeneration().addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, OreSpawnConfiguredFeatures.DANGER_FLORA_CLUSTERS);
            event.getGeneration().addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, OreSpawnConfiguredFeatures.DANGER_APPLE_MARKERS);
            event.getGeneration().addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, OreSpawnConfiguredFeatures.DANGER_CHERRY_MARKERS);
            return;
        }

        if (path.startsWith("mining_paradise")) {
            event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, OreSpawnConfiguredFeatures.MINING_TITANIUM_ORE);
            event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, OreSpawnConfiguredFeatures.MINING_URANIUM_ORE);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.MINING_TERMITE_TROLL_PATCH);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.MINING_TERMITE_NESTS);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.UNSTABLE_ANT_NESTS);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.MINING_SALT_SPIRES);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.MINING_TITANIUM_BOULDERS);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.MINING_SCRAP_HEAPS);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.MINING_DRIED_FIELDS);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.MINING_RUINS);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.MINING_SPIRES);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.MINING_MONOLITHS);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.MINING_COMPOUNDS);
            event.getGeneration().addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, OreSpawnConfiguredFeatures.MINING_GRAND_LANDMARKS);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.MINING_FLORA_CLUSTERS);
            return;
        }

        if (path.startsWith("crystal_world")) {
            event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, OreSpawnConfiguredFeatures.CRYSTAL_AMETHYST_VEIN);
            event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, OreSpawnConfiguredFeatures.CRYSTAL_TIGERS_EYE_VEIN);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.CRYSTAL_TERMITE_NESTS);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.UNSTABLE_ANT_NESTS);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.CRYSTAL_TIGERS_EYE_SPIRES);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.CRYSTAL_PINK_BOULDERS);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.CRYSTAL_GROWTH_HEAPS);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.CRYSTAL_DRIED_FIELDS);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.CRYSTAL_RUINS);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.CRYSTAL_SPIRES);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.CRYSTAL_MONOLITHS);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.CRYSTAL_COMPOUNDS);
            event.getGeneration().addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, OreSpawnConfiguredFeatures.CRYSTAL_GRAND_LANDMARKS);
            event.getGeneration().addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, OreSpawnConfiguredFeatures.CRYSTAL_FLORA_CLUSTERS);
            return;
        }

        if (path.startsWith("rainbow_dimension")) {
            event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, OreSpawnConfiguredFeatures.RAINBOW_RUBY_ORE);
            event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, OreSpawnConfiguredFeatures.RAINBOW_AMETHYST_ORE);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.RAINBOW_CRYSTAL_PATCH);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.RAINBOW_ANT_NESTS);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.UNSTABLE_ANT_NESTS);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.RAINBOW_AMETHYST_BOULDERS);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.RAINBOW_GARDEN_HEAPS);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.RAINBOW_DRIED_FIELDS);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.RAINBOW_RUINS);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.RAINBOW_GROVES);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.RAINBOW_MONOLITHS);
            event.getGeneration().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, OreSpawnConfiguredFeatures.RAINBOW_COMPOUNDS);
            event.getGeneration().addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, OreSpawnConfiguredFeatures.RAINBOW_GRAND_LANDMARKS);
            event.getGeneration().addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, OreSpawnConfiguredFeatures.RAINBOW_FLORA_CLUSTERS);
            event.getGeneration().addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, OreSpawnConfiguredFeatures.RAINBOW_PEACH_MARKERS);
            event.getGeneration().addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, OreSpawnConfiguredFeatures.RAINBOW_CRYSTAL_MARKERS);
        }
    }
}
