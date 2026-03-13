package danger.orespawn.registry;

import danger.orespawn.OreSpawn;
import danger.orespawn.world.ClusterLandmarkFeature;
import danger.orespawn.world.CompoundLandmarkFeature;
import danger.orespawn.world.FloraClusterFeature;
import danger.orespawn.world.GrandLandmarkFeature;
import danger.orespawn.world.MonolithFeature;
import danger.orespawn.world.ThemedRuinFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class OreSpawnFeatures {
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, OreSpawn.MODID);

    public static final RegistryObject<Feature<NoFeatureConfig>> DANGER_ISLES_RUIN = FEATURES.register("danger_isles_ruin",
            () -> new ThemedRuinFeature(NoFeatureConfig.CODEC,
                    () -> OreSpawnDimensions.platformBlockFor(OreSpawnDimensions.DANGER_ISLES),
                    () -> OreSpawnDimensions.accentBlockFor(OreSpawnDimensions.DANGER_ISLES),
                    () -> OreSpawnDimensions.arrivalMarkerBlockFor(OreSpawnDimensions.DANGER_ISLES)));

    public static final RegistryObject<Feature<NoFeatureConfig>> MINING_PARADISE_RUIN = FEATURES.register("mining_paradise_ruin",
            () -> new ThemedRuinFeature(NoFeatureConfig.CODEC,
                    () -> OreSpawnDimensions.platformBlockFor(OreSpawnDimensions.MINING_PARADISE),
                    () -> OreSpawnDimensions.accentBlockFor(OreSpawnDimensions.MINING_PARADISE),
                    () -> OreSpawnDimensions.arrivalMarkerBlockFor(OreSpawnDimensions.MINING_PARADISE)));

    public static final RegistryObject<Feature<NoFeatureConfig>> CRYSTAL_WORLD_RUIN = FEATURES.register("crystal_world_ruin",
            () -> new ThemedRuinFeature(NoFeatureConfig.CODEC,
                    () -> OreSpawnDimensions.platformBlockFor(OreSpawnDimensions.CRYSTAL_WORLD),
                    () -> OreSpawnDimensions.accentBlockFor(OreSpawnDimensions.CRYSTAL_WORLD),
                    () -> OreSpawnDimensions.arrivalMarkerBlockFor(OreSpawnDimensions.CRYSTAL_WORLD)));

    public static final RegistryObject<Feature<NoFeatureConfig>> RAINBOW_DIMENSION_RUIN = FEATURES.register("rainbow_dimension_ruin",
            () -> new ThemedRuinFeature(NoFeatureConfig.CODEC,
                    () -> OreSpawnDimensions.platformBlockFor(OreSpawnDimensions.RAINBOW_DIMENSION),
                    () -> OreSpawnDimensions.accentBlockFor(OreSpawnDimensions.RAINBOW_DIMENSION),
                    () -> OreSpawnDimensions.arrivalMarkerBlockFor(OreSpawnDimensions.RAINBOW_DIMENSION)));

    public static final RegistryObject<Feature<NoFeatureConfig>> DANGER_ISLES_GROVE = FEATURES.register("danger_isles_grove_feature",
            () -> new ClusterLandmarkFeature(NoFeatureConfig.CODEC,
                    () -> net.minecraft.block.Blocks.OAK_LOG.defaultBlockState(),
                    () -> OreSpawnBlocks.APPLE_LEAVES.get().defaultBlockState()));

    public static final RegistryObject<Feature<NoFeatureConfig>> MINING_PARADISE_SPIRE = FEATURES.register("mining_paradise_spire_feature",
            () -> new ClusterLandmarkFeature(NoFeatureConfig.CODEC,
                    () -> net.minecraft.block.Blocks.STONE.defaultBlockState(),
                    () -> OreSpawnBlocks.ORE_SALT.get().defaultBlockState()));

    public static final RegistryObject<Feature<NoFeatureConfig>> CRYSTAL_WORLD_SPIRE = FEATURES.register("crystal_world_spire_feature",
            () -> new ClusterLandmarkFeature(NoFeatureConfig.CODEC,
                    () -> OreSpawnBlocks.CRYSTAL_PINK_BLOCK.get().defaultBlockState(),
                    () -> OreSpawnBlocks.TIGERS_EYE_BLOCK.get().defaultBlockState()));

    public static final RegistryObject<Feature<NoFeatureConfig>> RAINBOW_DIMENSION_GROVE = FEATURES.register("rainbow_dimension_grove_feature",
            () -> new ClusterLandmarkFeature(NoFeatureConfig.CODEC,
                    () -> net.minecraft.block.Blocks.OAK_LOG.defaultBlockState(),
                    () -> OreSpawnBlocks.PEACH_LEAVES.get().defaultBlockState()));

    public static final RegistryObject<Feature<NoFeatureConfig>> DANGER_ISLES_MONOLITH = FEATURES.register("danger_isles_monolith_feature",
            () -> new MonolithFeature(NoFeatureConfig.CODEC,
                    () -> net.minecraft.block.Blocks.MOSSY_COBBLESTONE.defaultBlockState(),
                    () -> OreSpawnBlocks.BLOCK_RUBY.get().defaultBlockState(),
                    () -> OreSpawnBlocks.RED_ANT_NEST.get().defaultBlockState()));

    public static final RegistryObject<Feature<NoFeatureConfig>> MINING_PARADISE_MONOLITH = FEATURES.register("mining_paradise_monolith_feature",
            () -> new MonolithFeature(NoFeatureConfig.CODEC,
                    () -> net.minecraft.block.Blocks.STONE_BRICKS.defaultBlockState(),
                    () -> OreSpawnBlocks.BLOCK_TITANIUM.get().defaultBlockState(),
                    () -> OreSpawnBlocks.TERMITE_NEST.get().defaultBlockState()));

    public static final RegistryObject<Feature<NoFeatureConfig>> CRYSTAL_WORLD_MONOLITH = FEATURES.register("crystal_world_monolith_feature",
            () -> new MonolithFeature(NoFeatureConfig.CODEC,
                    () -> OreSpawnBlocks.CRYSTAL_PINK_BLOCK.get().defaultBlockState(),
                    () -> OreSpawnBlocks.TIGERS_EYE_BLOCK.get().defaultBlockState(),
                    () -> OreSpawnBlocks.CRYSTAL_TERMITE_NEST.get().defaultBlockState()));

    public static final RegistryObject<Feature<NoFeatureConfig>> RAINBOW_DIMENSION_MONOLITH = FEATURES.register("rainbow_dimension_monolith_feature",
            () -> new MonolithFeature(NoFeatureConfig.CODEC,
                    () -> net.minecraft.block.Blocks.QUARTZ_BLOCK.defaultBlockState(),
                    () -> OreSpawnBlocks.BLOCK_AMETHYST.get().defaultBlockState(),
                    () -> OreSpawnBlocks.RAINBOW_ANT_NEST.get().defaultBlockState()));

    public static final RegistryObject<Feature<NoFeatureConfig>> DANGER_ISLES_FLORA = FEATURES.register("danger_isles_flora_feature",
            () -> new FloraClusterFeature(NoFeatureConfig.CODEC,
                    () -> net.minecraft.block.Blocks.OAK_LOG.defaultBlockState(),
                    () -> OreSpawnBlocks.APPLE_LEAVES.get().defaultBlockState(),
                    () -> OreSpawnBlocks.CHERRY_LEAVES.get().defaultBlockState()));

    public static final RegistryObject<Feature<NoFeatureConfig>> MINING_PARADISE_FLORA = FEATURES.register("mining_paradise_flora_feature",
            () -> new FloraClusterFeature(NoFeatureConfig.CODEC,
                    () -> net.minecraft.block.Blocks.STONE.defaultBlockState(),
                    () -> OreSpawnBlocks.ORE_SALT.get().defaultBlockState(),
                    () -> OreSpawnBlocks.BLOCK_TITANIUM.get().defaultBlockState()));

    public static final RegistryObject<Feature<NoFeatureConfig>> CRYSTAL_WORLD_FLORA = FEATURES.register("crystal_world_flora_feature",
            () -> new FloraClusterFeature(NoFeatureConfig.CODEC,
                    () -> OreSpawnBlocks.CRYSTAL_PINK_BLOCK.get().defaultBlockState(),
                    () -> OreSpawnBlocks.BLOCK_AMETHYST.get().defaultBlockState(),
                    () -> OreSpawnBlocks.TIGERS_EYE_BLOCK.get().defaultBlockState()));

    public static final RegistryObject<Feature<NoFeatureConfig>> RAINBOW_DIMENSION_FLORA = FEATURES.register("rainbow_dimension_flora_feature",
            () -> new FloraClusterFeature(NoFeatureConfig.CODEC,
                    () -> net.minecraft.block.Blocks.OAK_LOG.defaultBlockState(),
                    () -> OreSpawnBlocks.PEACH_LEAVES.get().defaultBlockState(),
                    () -> OreSpawnBlocks.CRYSTAL_PINK_BLOCK.get().defaultBlockState()));

    public static final RegistryObject<Feature<NoFeatureConfig>> DANGER_ISLES_COMPOUND = FEATURES.register("danger_isles_compound_feature",
            () -> new CompoundLandmarkFeature(NoFeatureConfig.CODEC,
                    () -> net.minecraft.block.Blocks.DIRT.defaultBlockState(),
                    () -> net.minecraft.block.Blocks.MOSSY_COBBLESTONE.defaultBlockState(),
                    () -> OreSpawnBlocks.RED_ANT_NEST.get().defaultBlockState(),
                    () -> OreSpawnBlocks.BLOCK_RUBY.get().defaultBlockState()));

    public static final RegistryObject<Feature<NoFeatureConfig>> MINING_PARADISE_COMPOUND = FEATURES.register("mining_paradise_compound_feature",
            () -> new CompoundLandmarkFeature(NoFeatureConfig.CODEC,
                    () -> net.minecraft.block.Blocks.STONE.defaultBlockState(),
                    () -> net.minecraft.block.Blocks.STONE_BRICKS.defaultBlockState(),
                    () -> OreSpawnBlocks.TERMITE_NEST.get().defaultBlockState(),
                    () -> OreSpawnBlocks.BLOCK_TITANIUM.get().defaultBlockState()));

    public static final RegistryObject<Feature<NoFeatureConfig>> CRYSTAL_WORLD_COMPOUND = FEATURES.register("crystal_world_compound_feature",
            () -> new CompoundLandmarkFeature(NoFeatureConfig.CODEC,
                    () -> OreSpawnBlocks.CRYSTAL_PINK_BLOCK.get().defaultBlockState(),
                    () -> OreSpawnBlocks.TIGERS_EYE_BLOCK.get().defaultBlockState(),
                    () -> OreSpawnBlocks.CRYSTAL_TERMITE_NEST.get().defaultBlockState(),
                    () -> OreSpawnBlocks.BLOCK_AMETHYST.get().defaultBlockState()));

    public static final RegistryObject<Feature<NoFeatureConfig>> RAINBOW_DIMENSION_COMPOUND = FEATURES.register("rainbow_dimension_compound_feature",
            () -> new CompoundLandmarkFeature(NoFeatureConfig.CODEC,
                    () -> net.minecraft.block.Blocks.GRASS_BLOCK.defaultBlockState(),
                    () -> net.minecraft.block.Blocks.QUARTZ_BLOCK.defaultBlockState(),
                    () -> OreSpawnBlocks.RAINBOW_ANT_NEST.get().defaultBlockState(),
                    () -> OreSpawnBlocks.BLOCK_AMETHYST.get().defaultBlockState()));

    public static final RegistryObject<Feature<NoFeatureConfig>> DANGER_ISLES_GRAND = FEATURES.register("danger_isles_grand_feature",
            () -> new GrandLandmarkFeature(NoFeatureConfig.CODEC,
                    () -> net.minecraft.block.Blocks.GRASS_BLOCK.defaultBlockState(),
                    () -> net.minecraft.block.Blocks.OAK_LOG.defaultBlockState(),
                    () -> OreSpawnBlocks.APPLE_LEAVES.get().defaultBlockState(),
                    () -> OreSpawnBlocks.RED_ANT_NEST.get().defaultBlockState()));

    public static final RegistryObject<Feature<NoFeatureConfig>> MINING_PARADISE_GRAND = FEATURES.register("mining_paradise_grand_feature",
            () -> new GrandLandmarkFeature(NoFeatureConfig.CODEC,
                    () -> net.minecraft.block.Blocks.STONE.defaultBlockState(),
                    () -> net.minecraft.block.Blocks.STONE_BRICKS.defaultBlockState(),
                    () -> OreSpawnBlocks.ORE_SALT.get().defaultBlockState(),
                    () -> OreSpawnBlocks.TERMITE_NEST.get().defaultBlockState()));

    public static final RegistryObject<Feature<NoFeatureConfig>> CRYSTAL_WORLD_GRAND = FEATURES.register("crystal_world_grand_feature",
            () -> new GrandLandmarkFeature(NoFeatureConfig.CODEC,
                    () -> OreSpawnBlocks.CRYSTAL_PINK_BLOCK.get().defaultBlockState(),
                    () -> OreSpawnBlocks.TIGERS_EYE_BLOCK.get().defaultBlockState(),
                    () -> OreSpawnBlocks.BLOCK_AMETHYST.get().defaultBlockState(),
                    () -> OreSpawnBlocks.CRYSTAL_TERMITE_NEST.get().defaultBlockState()));

    public static final RegistryObject<Feature<NoFeatureConfig>> RAINBOW_DIMENSION_GRAND = FEATURES.register("rainbow_dimension_grand_feature",
            () -> new GrandLandmarkFeature(NoFeatureConfig.CODEC,
                    () -> net.minecraft.block.Blocks.GRASS_BLOCK.defaultBlockState(),
                    () -> net.minecraft.block.Blocks.OAK_LOG.defaultBlockState(),
                    () -> OreSpawnBlocks.PEACH_LEAVES.get().defaultBlockState(),
                    () -> OreSpawnBlocks.RAINBOW_ANT_NEST.get().defaultBlockState()));

    private OreSpawnFeatures() {
    }
}
