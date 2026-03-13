package danger.orespawn.world;

import danger.orespawn.OreSpawn;
import danger.orespawn.registry.OreSpawnBlocks;
import danger.orespawn.registry.OreSpawnFeatures;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.BlockStateFeatureConfig;
import net.minecraft.world.gen.feature.BlockStateProvidingFeatureConfig;
import net.minecraft.world.gen.feature.BlockWithContextConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.blockstateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;

public final class OreSpawnConfiguredFeatures {
    public static ConfiguredFeature<?, ?> DANGER_RUBY_ORE;
    public static ConfiguredFeature<?, ?> DANGER_SALT_ORE;
    public static ConfiguredFeature<?, ?> DANGER_RED_ANT_TROLL_PATCH;
    public static ConfiguredFeature<?, ?> DANGER_RED_ANT_NESTS;
    public static ConfiguredFeature<?, ?> DANGER_APPLE_MARKERS;
    public static ConfiguredFeature<?, ?> DANGER_CHERRY_MARKERS;
    public static ConfiguredFeature<?, ?> DANGER_RUBY_BOULDERS;
    public static ConfiguredFeature<?, ?> DANGER_ORCHARD_HEAPS;
    public static ConfiguredFeature<?, ?> DANGER_DRIED_FIELDS;
    public static ConfiguredFeature<?, ?> DANGER_RUINS;
    public static ConfiguredFeature<?, ?> DANGER_GROVES;
    public static ConfiguredFeature<?, ?> DANGER_MONOLITHS;
    public static ConfiguredFeature<?, ?> DANGER_FLORA_CLUSTERS;
    public static ConfiguredFeature<?, ?> DANGER_COMPOUNDS;
    public static ConfiguredFeature<?, ?> DANGER_GRAND_LANDMARKS;
    public static ConfiguredFeature<?, ?> MINING_TITANIUM_ORE;
    public static ConfiguredFeature<?, ?> MINING_URANIUM_ORE;
    public static ConfiguredFeature<?, ?> MINING_TERMITE_TROLL_PATCH;
    public static ConfiguredFeature<?, ?> MINING_TERMITE_NESTS;
    public static ConfiguredFeature<?, ?> MINING_SALT_SPIRES;
    public static ConfiguredFeature<?, ?> MINING_TITANIUM_BOULDERS;
    public static ConfiguredFeature<?, ?> MINING_SCRAP_HEAPS;
    public static ConfiguredFeature<?, ?> MINING_DRIED_FIELDS;
    public static ConfiguredFeature<?, ?> MINING_RUINS;
    public static ConfiguredFeature<?, ?> MINING_SPIRES;
    public static ConfiguredFeature<?, ?> MINING_MONOLITHS;
    public static ConfiguredFeature<?, ?> MINING_FLORA_CLUSTERS;
    public static ConfiguredFeature<?, ?> MINING_COMPOUNDS;
    public static ConfiguredFeature<?, ?> MINING_GRAND_LANDMARKS;
    public static ConfiguredFeature<?, ?> CRYSTAL_AMETHYST_VEIN;
    public static ConfiguredFeature<?, ?> CRYSTAL_TIGERS_EYE_VEIN;
    public static ConfiguredFeature<?, ?> CRYSTAL_TERMITE_NESTS;
    public static ConfiguredFeature<?, ?> CRYSTAL_TIGERS_EYE_SPIRES;
    public static ConfiguredFeature<?, ?> CRYSTAL_PINK_BOULDERS;
    public static ConfiguredFeature<?, ?> CRYSTAL_GROWTH_HEAPS;
    public static ConfiguredFeature<?, ?> CRYSTAL_DRIED_FIELDS;
    public static ConfiguredFeature<?, ?> CRYSTAL_RUINS;
    public static ConfiguredFeature<?, ?> CRYSTAL_SPIRES;
    public static ConfiguredFeature<?, ?> CRYSTAL_MONOLITHS;
    public static ConfiguredFeature<?, ?> CRYSTAL_FLORA_CLUSTERS;
    public static ConfiguredFeature<?, ?> CRYSTAL_COMPOUNDS;
    public static ConfiguredFeature<?, ?> CRYSTAL_GRAND_LANDMARKS;
    public static ConfiguredFeature<?, ?> RAINBOW_RUBY_ORE;
    public static ConfiguredFeature<?, ?> RAINBOW_AMETHYST_ORE;
    public static ConfiguredFeature<?, ?> RAINBOW_CRYSTAL_PATCH;
    public static ConfiguredFeature<?, ?> RAINBOW_ANT_NESTS;
    public static ConfiguredFeature<?, ?> UNSTABLE_ANT_NESTS;
    public static ConfiguredFeature<?, ?> RAINBOW_PEACH_MARKERS;
    public static ConfiguredFeature<?, ?> RAINBOW_CRYSTAL_MARKERS;
    public static ConfiguredFeature<?, ?> RAINBOW_AMETHYST_BOULDERS;
    public static ConfiguredFeature<?, ?> RAINBOW_GARDEN_HEAPS;
    public static ConfiguredFeature<?, ?> RAINBOW_DRIED_FIELDS;
    public static ConfiguredFeature<?, ?> RAINBOW_RUINS;
    public static ConfiguredFeature<?, ?> RAINBOW_GROVES;
    public static ConfiguredFeature<?, ?> RAINBOW_MONOLITHS;
    public static ConfiguredFeature<?, ?> RAINBOW_FLORA_CLUSTERS;
    public static ConfiguredFeature<?, ?> RAINBOW_COMPOUNDS;
    public static ConfiguredFeature<?, ?> RAINBOW_GRAND_LANDMARKS;

    private static boolean registered;

    private OreSpawnConfiguredFeatures() {
    }

    public static void registerAll() {
        if (registered) {
            return;
        }
        registered = true;

        DANGER_RUBY_ORE = register("danger_ruby_ore",
                Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                OreSpawnBlocks.ORE_RUBY.get().defaultBlockState(), 7))
                        .range(80)
                        .squared()
                        .count(12));
        DANGER_SALT_ORE = register("danger_salt_ore",
                Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                OreSpawnBlocks.ORE_SALT.get().defaultBlockState(), 12))
                        .range(128)
                        .squared()
                        .count(18));
        DANGER_RED_ANT_TROLL_PATCH = register("danger_red_ant_troll_patch",
                Feature.ORE.configured(new OreFeatureConfig(
                                new BlockMatchRuleTest(Blocks.DIRT),
                                OreSpawnBlocks.RED_ANT_TROLL.get().defaultBlockState(),
                                20))
                        .range(120)
                        .squared()
                        .count(3));
        DANGER_RED_ANT_NESTS = register("danger_red_ant_nests",
                Feature.ORE.configured(new OreFeatureConfig(
                                new BlockMatchRuleTest(Blocks.DIRT),
                                OreSpawnBlocks.RED_ANT_NEST.get().defaultBlockState(),
                                4))
                        .range(96)
                        .squared()
                        .count(2));
        DANGER_APPLE_MARKERS = register("danger_apple_markers",
                Feature.SIMPLE_BLOCK.configured(surfaceBlock(
                                OreSpawnBlocks.APPLE_LEAVES.get().defaultBlockState(),
                                Blocks.GRASS_BLOCK.defaultBlockState(),
                                Blocks.DIRT.defaultBlockState()))
                        .range(120)
                        .squared()
                        .count(10));
        DANGER_CHERRY_MARKERS = register("danger_cherry_markers",
                Feature.SIMPLE_BLOCK.configured(surfaceBlock(
                                OreSpawnBlocks.CHERRY_LEAVES.get().defaultBlockState(),
                                Blocks.GRASS_BLOCK.defaultBlockState(),
                                Blocks.DIRT.defaultBlockState()))
                        .range(120)
                        .squared()
                        .count(8));
        DANGER_RUBY_BOULDERS = register("danger_ruby_boulders",
                Feature.FOREST_ROCK.configured(new BlockStateFeatureConfig(OreSpawnBlocks.BLOCK_RUBY.get().defaultBlockState()))
                        .range(110)
                        .squared()
                        .count(2));
        DANGER_ORCHARD_HEAPS = register("danger_orchard_heaps",
                Feature.BLOCK_PILE.configured(new BlockStateProvidingFeatureConfig(
                                weightedProvider(
                                        OreSpawnBlocks.APPLE_LEAVES.get().defaultBlockState(), 5,
                                        OreSpawnBlocks.CHERRY_LEAVES.get().defaultBlockState(), 4,
                                        Blocks.OAK_LEAVES.defaultBlockState(), 3,
                                        Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 2)))
                        .range(116)
                        .squared()
                        .count(1));
        DANGER_DRIED_FIELDS = register("danger_dried_fields",
                Feature.BLOCK_PILE.configured(new BlockStateProvidingFeatureConfig(
                                weightedProvider(
                                        OreSpawnBlocks.ANCIENT_DRIED_COW.get().defaultBlockState(), 4,
                                        OreSpawnBlocks.ANCIENT_DRIED_PIG.get().defaultBlockState(), 4,
                                        OreSpawnBlocks.ANCIENT_DRIED_CHICKEN.get().defaultBlockState(), 3,
                                        OreSpawnBlocks.ANCIENT_DRIED_SHEEP.get().defaultBlockState(), 2)))
                        .range(116)
                        .squared()
                        .count(1));
        DANGER_RUINS = register("danger_ruins",
                OreSpawnFeatures.DANGER_ISLES_RUIN.get().configured(net.minecraft.world.gen.feature.NoFeatureConfig.NONE)
                        .range(116)
                        .squared()
                        .count(1));
        DANGER_GROVES = register("danger_groves",
                OreSpawnFeatures.DANGER_ISLES_GROVE.get().configured(net.minecraft.world.gen.feature.NoFeatureConfig.NONE)
                        .range(120)
                        .squared()
                        .count(3));
        DANGER_MONOLITHS = register("danger_monoliths",
                OreSpawnFeatures.DANGER_ISLES_MONOLITH.get().configured(net.minecraft.world.gen.feature.NoFeatureConfig.NONE)
                        .range(120)
                        .squared()
                        .count(1));
        DANGER_FLORA_CLUSTERS = register("danger_flora_clusters",
                OreSpawnFeatures.DANGER_ISLES_FLORA.get().configured(net.minecraft.world.gen.feature.NoFeatureConfig.NONE)
                        .range(120)
                        .squared()
                        .count(2));
        DANGER_COMPOUNDS = register("danger_compounds",
                OreSpawnFeatures.DANGER_ISLES_COMPOUND.get().configured(net.minecraft.world.gen.feature.NoFeatureConfig.NONE)
                        .range(120)
                        .squared()
                        .count(1));
        DANGER_GRAND_LANDMARKS = register("danger_grand_landmarks",
                OreSpawnFeatures.DANGER_ISLES_GRAND.get().configured(net.minecraft.world.gen.feature.NoFeatureConfig.NONE)
                        .range(120)
                        .squared()
                        .count(1));

        MINING_TITANIUM_ORE = register("mining_titanium_ore",
                Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                OreSpawnBlocks.ORE_TITANIUM.get().defaultBlockState(), 6))
                        .range(36)
                        .squared()
                        .count(8));
        MINING_URANIUM_ORE = register("mining_uranium_ore",
                Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                OreSpawnBlocks.ORE_URANIUM.get().defaultBlockState(), 5))
                        .range(28)
                        .squared()
                        .count(6));
        MINING_TERMITE_TROLL_PATCH = register("mining_termite_troll_patch",
                Feature.ORE.configured(new OreFeatureConfig(
                                new BlockMatchRuleTest(Blocks.STONE),
                                OreSpawnBlocks.TERMITE_TROLL.get().defaultBlockState(),
                                24))
                        .range(96)
                        .squared()
                        .count(4));
        MINING_TERMITE_NESTS = register("mining_termite_nests",
                Feature.ORE.configured(new OreFeatureConfig(
                                new BlockMatchRuleTest(Blocks.STONE),
                                OreSpawnBlocks.TERMITE_NEST.get().defaultBlockState(),
                                5))
                        .range(72)
                        .squared()
                        .count(2));
        MINING_SALT_SPIRES = register("mining_salt_spires",
                Feature.SIMPLE_BLOCK.configured(surfaceBlock(
                                OreSpawnBlocks.ORE_SALT.get().defaultBlockState(),
                                Blocks.STONE.defaultBlockState(),
                                Blocks.ANDESITE.defaultBlockState(),
                                Blocks.GRAVEL.defaultBlockState()))
                        .range(100)
                        .squared()
                        .count(9));
        MINING_TITANIUM_BOULDERS = register("mining_titanium_boulders",
                Feature.FOREST_ROCK.configured(new BlockStateFeatureConfig(OreSpawnBlocks.BLOCK_TITANIUM.get().defaultBlockState()))
                        .range(96)
                        .squared()
                        .count(2));
        MINING_SCRAP_HEAPS = register("mining_scrap_heaps",
                Feature.BLOCK_PILE.configured(new BlockStateProvidingFeatureConfig(
                                weightedProvider(
                                        Blocks.STONE.defaultBlockState(), 5,
                                        Blocks.COBBLESTONE.defaultBlockState(), 4,
                                        OreSpawnBlocks.ORE_SALT.get().defaultBlockState(), 3,
                                        OreSpawnBlocks.BLOCK_TITANIUM.get().defaultBlockState(), 1)))
                        .range(96)
                        .squared()
                        .count(1));
        MINING_DRIED_FIELDS = register("mining_dried_fields",
                Feature.BLOCK_PILE.configured(new BlockStateProvidingFeatureConfig(
                                weightedProvider(
                                        OreSpawnBlocks.ANCIENT_DRIED_CREEPER.get().defaultBlockState(), 4,
                                        OreSpawnBlocks.ANCIENT_DRIED_SKELETON.get().defaultBlockState(), 4,
                                        OreSpawnBlocks.ANCIENT_DRIED_ZOMBIE.get().defaultBlockState(), 4,
                                        OreSpawnBlocks.ANCIENT_DRIED_SILVERFISH.get().defaultBlockState(), 2)))
                        .range(92)
                        .squared()
                        .count(1));
        MINING_RUINS = register("mining_ruins",
                OreSpawnFeatures.MINING_PARADISE_RUIN.get().configured(net.minecraft.world.gen.feature.NoFeatureConfig.NONE)
                        .range(96)
                        .squared()
                        .count(1));
        MINING_SPIRES = register("mining_spires",
                OreSpawnFeatures.MINING_PARADISE_SPIRE.get().configured(net.minecraft.world.gen.feature.NoFeatureConfig.NONE)
                        .range(100)
                        .squared()
                        .count(3));
        MINING_MONOLITHS = register("mining_monoliths",
                OreSpawnFeatures.MINING_PARADISE_MONOLITH.get().configured(net.minecraft.world.gen.feature.NoFeatureConfig.NONE)
                        .range(100)
                        .squared()
                        .count(1));
        MINING_FLORA_CLUSTERS = register("mining_flora_clusters",
                OreSpawnFeatures.MINING_PARADISE_FLORA.get().configured(net.minecraft.world.gen.feature.NoFeatureConfig.NONE)
                        .range(100)
                        .squared()
                        .count(2));
        MINING_COMPOUNDS = register("mining_compounds",
                OreSpawnFeatures.MINING_PARADISE_COMPOUND.get().configured(net.minecraft.world.gen.feature.NoFeatureConfig.NONE)
                        .range(100)
                        .squared()
                        .count(1));
        MINING_GRAND_LANDMARKS = register("mining_grand_landmarks",
                OreSpawnFeatures.MINING_PARADISE_GRAND.get().configured(net.minecraft.world.gen.feature.NoFeatureConfig.NONE)
                        .range(100)
                        .squared()
                        .count(1));

        CRYSTAL_AMETHYST_VEIN = register("crystal_amethyst_vein",
                Feature.ORE.configured(new OreFeatureConfig(
                                new BlockMatchRuleTest(OreSpawnBlocks.CRYSTAL_PINK_BLOCK.get()),
                                OreSpawnBlocks.ORE_AMETHYST.get().defaultBlockState(),
                                10))
                        .range(120)
                        .squared()
                        .count(16));
        CRYSTAL_TIGERS_EYE_VEIN = register("crystal_tigers_eye_vein",
                Feature.ORE.configured(new OreFeatureConfig(
                                new BlockMatchRuleTest(OreSpawnBlocks.CRYSTAL_PINK_BLOCK.get()),
                                OreSpawnBlocks.TIGERS_EYE_BLOCK.get().defaultBlockState(),
                                18))
                        .range(140)
                        .squared()
                        .count(7));
        CRYSTAL_TERMITE_NESTS = register("crystal_termite_nests",
                Feature.ORE.configured(new OreFeatureConfig(
                                new BlockMatchRuleTest(OreSpawnBlocks.CRYSTAL_PINK_BLOCK.get()),
                                OreSpawnBlocks.CRYSTAL_TERMITE_NEST.get().defaultBlockState(),
                                4))
                        .range(96)
                        .squared()
                        .count(2));
        CRYSTAL_TIGERS_EYE_SPIRES = register("crystal_tigers_eye_spires",
                Feature.SIMPLE_BLOCK.configured(surfaceBlock(
                                OreSpawnBlocks.TIGERS_EYE_BLOCK.get().defaultBlockState(),
                                OreSpawnBlocks.CRYSTAL_PINK_BLOCK.get().defaultBlockState()))
                        .range(132)
                        .squared()
                        .count(10));
        CRYSTAL_PINK_BOULDERS = register("crystal_pink_boulders",
                Feature.FOREST_ROCK.configured(new BlockStateFeatureConfig(OreSpawnBlocks.CRYSTAL_PINK_BLOCK.get().defaultBlockState()))
                        .range(132)
                        .squared()
                        .count(3));
        CRYSTAL_GROWTH_HEAPS = register("crystal_growth_heaps",
                Feature.BLOCK_PILE.configured(new BlockStateProvidingFeatureConfig(
                                weightedProvider(
                                        OreSpawnBlocks.CRYSTAL_PINK_BLOCK.get().defaultBlockState(), 6,
                                        OreSpawnBlocks.TIGERS_EYE_BLOCK.get().defaultBlockState(), 4,
                                        OreSpawnBlocks.BLOCK_AMETHYST.get().defaultBlockState(), 2)))
                        .range(132)
                        .squared()
                        .count(1));
        CRYSTAL_DRIED_FIELDS = register("crystal_dried_fields",
                Feature.BLOCK_PILE.configured(new BlockStateProvidingFeatureConfig(
                                weightedProvider(
                                        OreSpawnBlocks.ANCIENT_DRIED_BAT.get().defaultBlockState(), 4,
                                        OreSpawnBlocks.ANCIENT_DRIED_WITCH.get().defaultBlockState(), 3,
                                        OreSpawnBlocks.ANCIENT_DRIED_ENDERMAN.get().defaultBlockState(), 3,
                                        OreSpawnBlocks.ANCIENT_DRIED_MOTHRA.get().defaultBlockState(), 1)))
                        .range(128)
                        .squared()
                        .count(1));
        CRYSTAL_RUINS = register("crystal_ruins",
                OreSpawnFeatures.CRYSTAL_WORLD_RUIN.get().configured(net.minecraft.world.gen.feature.NoFeatureConfig.NONE)
                        .range(128)
                        .squared()
                        .count(1));
        CRYSTAL_SPIRES = register("crystal_spires",
                OreSpawnFeatures.CRYSTAL_WORLD_SPIRE.get().configured(net.minecraft.world.gen.feature.NoFeatureConfig.NONE)
                        .range(132)
                        .squared()
                        .count(3));
        CRYSTAL_MONOLITHS = register("crystal_monoliths",
                OreSpawnFeatures.CRYSTAL_WORLD_MONOLITH.get().configured(net.minecraft.world.gen.feature.NoFeatureConfig.NONE)
                        .range(132)
                        .squared()
                        .count(1));
        CRYSTAL_FLORA_CLUSTERS = register("crystal_flora_clusters",
                OreSpawnFeatures.CRYSTAL_WORLD_FLORA.get().configured(net.minecraft.world.gen.feature.NoFeatureConfig.NONE)
                        .range(132)
                        .squared()
                        .count(2));
        CRYSTAL_COMPOUNDS = register("crystal_compounds",
                OreSpawnFeatures.CRYSTAL_WORLD_COMPOUND.get().configured(net.minecraft.world.gen.feature.NoFeatureConfig.NONE)
                        .range(132)
                        .squared()
                        .count(1));
        CRYSTAL_GRAND_LANDMARKS = register("crystal_grand_landmarks",
                OreSpawnFeatures.CRYSTAL_WORLD_GRAND.get().configured(net.minecraft.world.gen.feature.NoFeatureConfig.NONE)
                        .range(132)
                        .squared()
                        .count(1));

        RAINBOW_RUBY_ORE = register("rainbow_ruby_ore",
                Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                OreSpawnBlocks.ORE_RUBY.get().defaultBlockState(), 8))
                        .range(72)
                        .squared()
                        .count(10));
        RAINBOW_AMETHYST_ORE = register("rainbow_amethyst_ore",
                Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                OreSpawnBlocks.ORE_AMETHYST.get().defaultBlockState(), 8))
                        .range(72)
                        .squared()
                        .count(10));
        RAINBOW_CRYSTAL_PATCH = register("rainbow_crystal_patch",
                Feature.ORE.configured(new OreFeatureConfig(
                                new BlockMatchRuleTest(Blocks.DIRT),
                                OreSpawnBlocks.CRYSTAL_PINK_BLOCK.get().defaultBlockState(),
                                18))
                        .range(110)
                        .squared()
                        .count(5));
        RAINBOW_ANT_NESTS = register("rainbow_ant_nests",
                Feature.ORE.configured(new OreFeatureConfig(
                                new BlockMatchRuleTest(Blocks.DIRT),
                                OreSpawnBlocks.RAINBOW_ANT_NEST.get().defaultBlockState(),
                                4))
                        .range(96)
                        .squared()
                        .count(2));
        UNSTABLE_ANT_NESTS = register("unstable_ant_nests",
                Feature.ORE.configured(new OreFeatureConfig(
                                new BlockMatchRuleTest(Blocks.DIRT),
                                OreSpawnBlocks.UNSTABLE_ANT_NEST.get().defaultBlockState(),
                                3))
                        .range(128)
                        .squared()
                        .count(1));
        RAINBOW_PEACH_MARKERS = register("rainbow_peach_markers",
                Feature.SIMPLE_BLOCK.configured(surfaceBlock(
                                OreSpawnBlocks.PEACH_LEAVES.get().defaultBlockState(),
                                Blocks.GRASS_BLOCK.defaultBlockState(),
                                Blocks.DIRT.defaultBlockState(),
                                Blocks.PODZOL.defaultBlockState()))
                        .range(120)
                        .squared()
                        .count(12));
        RAINBOW_CRYSTAL_MARKERS = register("rainbow_crystal_markers",
                Feature.SIMPLE_BLOCK.configured(surfaceBlock(
                                OreSpawnBlocks.CRYSTAL_PINK_BLOCK.get().defaultBlockState(),
                                Blocks.GRASS_BLOCK.defaultBlockState(),
                                Blocks.DIRT.defaultBlockState()))
                        .range(120)
                        .squared()
                        .count(7));
        RAINBOW_AMETHYST_BOULDERS = register("rainbow_amethyst_boulders",
                Feature.FOREST_ROCK.configured(new BlockStateFeatureConfig(OreSpawnBlocks.BLOCK_AMETHYST.get().defaultBlockState()))
                        .range(112)
                        .squared()
                        .count(2));
        RAINBOW_GARDEN_HEAPS = register("rainbow_garden_heaps",
                Feature.BLOCK_PILE.configured(new BlockStateProvidingFeatureConfig(
                                weightedProvider(
                                        OreSpawnBlocks.PEACH_LEAVES.get().defaultBlockState(), 4,
                                        OreSpawnBlocks.CHERRY_LEAVES.get().defaultBlockState(), 4,
                                        OreSpawnBlocks.CRYSTAL_PINK_BLOCK.get().defaultBlockState(), 3,
                                        OreSpawnBlocks.BLOCK_AMETHYST.get().defaultBlockState(), 2)))
                        .range(116)
                        .squared()
                        .count(1));
        RAINBOW_DRIED_FIELDS = register("rainbow_dried_fields",
                Feature.BLOCK_PILE.configured(new BlockStateProvidingFeatureConfig(
                                weightedProvider(
                                        OreSpawnBlocks.ANCIENT_DRIED_MOOSHROOM.get().defaultBlockState(), 4,
                                        OreSpawnBlocks.ANCIENT_DRIED_VILLAGER.get().defaultBlockState(), 3,
                                        OreSpawnBlocks.ANCIENT_DRIED_OCELOT.get().defaultBlockState(), 3,
                                        OreSpawnBlocks.ANCIENT_DRIED_CLOUD_SHARK.get().defaultBlockState(), 1)))
                        .range(116)
                        .squared()
                        .count(1));
        RAINBOW_RUINS = register("rainbow_ruins",
                OreSpawnFeatures.RAINBOW_DIMENSION_RUIN.get().configured(net.minecraft.world.gen.feature.NoFeatureConfig.NONE)
                        .range(116)
                        .squared()
                        .count(1));
        RAINBOW_GROVES = register("rainbow_groves",
                OreSpawnFeatures.RAINBOW_DIMENSION_GROVE.get().configured(net.minecraft.world.gen.feature.NoFeatureConfig.NONE)
                        .range(120)
                        .squared()
                        .count(3));
        RAINBOW_MONOLITHS = register("rainbow_monoliths",
                OreSpawnFeatures.RAINBOW_DIMENSION_MONOLITH.get().configured(net.minecraft.world.gen.feature.NoFeatureConfig.NONE)
                        .range(120)
                        .squared()
                        .count(1));
        RAINBOW_FLORA_CLUSTERS = register("rainbow_flora_clusters",
                OreSpawnFeatures.RAINBOW_DIMENSION_FLORA.get().configured(net.minecraft.world.gen.feature.NoFeatureConfig.NONE)
                        .range(120)
                        .squared()
                        .count(2));
        RAINBOW_COMPOUNDS = register("rainbow_compounds",
                OreSpawnFeatures.RAINBOW_DIMENSION_COMPOUND.get().configured(net.minecraft.world.gen.feature.NoFeatureConfig.NONE)
                        .range(120)
                        .squared()
                        .count(1));
        RAINBOW_GRAND_LANDMARKS = register("rainbow_grand_landmarks",
                OreSpawnFeatures.RAINBOW_DIMENSION_GRAND.get().configured(net.minecraft.world.gen.feature.NoFeatureConfig.NONE)
                        .range(120)
                        .squared()
                        .count(1));
    }

    private static WeightedBlockStateProvider weightedProvider(Object... entries) {
        WeightedBlockStateProvider provider = new WeightedBlockStateProvider();
        for (int i = 0; i < entries.length; i += 2) {
            provider.add((net.minecraft.block.BlockState) entries[i], (Integer) entries[i + 1]);
        }
        return provider;
    }

    private static BlockWithContextConfig surfaceBlock(net.minecraft.block.BlockState toPlace, net.minecraft.block.BlockState... placeOn) {
        java.util.List<net.minecraft.block.BlockState> supports = java.util.Arrays.asList(placeOn);
        return new BlockWithContextConfig(
                toPlace,
                supports,
                java.util.Collections.singletonList(Blocks.AIR.defaultBlockState()),
                supports
        );
    }

    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> feature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(OreSpawn.MODID, name), feature);
    }
}
