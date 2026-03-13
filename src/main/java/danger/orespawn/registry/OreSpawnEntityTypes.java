package danger.orespawn.registry;

import danger.orespawn.OreSpawn;
import danger.orespawn.entity.ButterflyEntity;
import danger.orespawn.entity.BrownAntEntity;
import danger.orespawn.entity.FairyEntity;
import danger.orespawn.entity.FireflyEntity;
import danger.orespawn.entity.GazelleEntity;
import danger.orespawn.entity.LunaMothEntity;
import danger.orespawn.entity.MantisEntity;
import danger.orespawn.entity.OreSpawnThrownItemEntity;
import danger.orespawn.entity.PeacockEntity;
import danger.orespawn.entity.RainbowAntEntity;
import danger.orespawn.entity.RatEntity;
import danger.orespawn.entity.RedAntEntity;
import danger.orespawn.entity.StinkBugEntity;
import danger.orespawn.entity.StinkyEntity;
import danger.orespawn.entity.TermiteEntity;
import danger.orespawn.entity.UnstableAntEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class OreSpawnEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, OreSpawn.MODID);

    public static final RegistryObject<EntityType<OreSpawnThrownItemEntity>> THROWN_ITEM = ENTITY_TYPES.register(
            "thrown_item",
            () -> EntityType.Builder.<OreSpawnThrownItemEntity>of(OreSpawnThrownItemEntity::new, EntityClassification.MISC)
                    .sized(0.25F, 0.25F)
                    .clientTrackingRange(4)
                    .updateInterval(10)
                    .build("thrown_item")
    );
    public static final RegistryObject<EntityType<FireflyEntity>> FIREFLY = ENTITY_TYPES.register(
            "firefly",
            () -> EntityType.Builder.of(FireflyEntity::new, EntityClassification.AMBIENT)
                    .sized(0.5F, 0.9F)
                    .clientTrackingRange(6)
                    .build("firefly")
    );
    public static final RegistryObject<EntityType<ButterflyEntity>> BUTTERFLY = ENTITY_TYPES.register(
            "butterfly",
            () -> EntityType.Builder.of(ButterflyEntity::new, EntityClassification.AMBIENT)
                    .sized(0.55F, 0.9F)
                    .clientTrackingRange(6)
                    .build("butterfly")
    );
    public static final RegistryObject<EntityType<LunaMothEntity>> MOTH = ENTITY_TYPES.register(
            "moth",
            () -> EntityType.Builder.of(LunaMothEntity::new, EntityClassification.AMBIENT)
                    .sized(0.55F, 0.9F)
                    .clientTrackingRange(6)
                    .build("moth")
    );
    public static final RegistryObject<EntityType<PeacockEntity>> PEACOCK = ENTITY_TYPES.register(
            "peacock",
            () -> EntityType.Builder.of(PeacockEntity::new, EntityClassification.CREATURE)
                    .sized(0.5F, 0.9F)
                    .clientTrackingRange(8)
                    .build("peacock")
    );
    public static final RegistryObject<EntityType<FairyEntity>> FAIRY = ENTITY_TYPES.register(
            "fairy",
            () -> EntityType.Builder.of(FairyEntity::new, EntityClassification.CREATURE)
                    .sized(0.7F, 0.6F)
                    .clientTrackingRange(8)
                    .build("fairy")
    );
    public static final RegistryObject<EntityType<RatEntity>> RAT = ENTITY_TYPES.register(
            "rat",
            () -> EntityType.Builder.of(RatEntity::new, EntityClassification.CREATURE)
                    .sized(0.6F, 0.5F)
                    .clientTrackingRange(8)
                    .build("rat")
    );
    public static final RegistryObject<EntityType<StinkBugEntity>> STINK_BUG = ENTITY_TYPES.register(
            "stink_bug",
            () -> EntityType.Builder.of(StinkBugEntity::new, EntityClassification.CREATURE)
                    .sized(0.7F, 0.6F)
                    .clientTrackingRange(8)
                    .build("stink_bug")
    );
    public static final RegistryObject<EntityType<GazelleEntity>> GAZELLE = ENTITY_TYPES.register(
            "gazelle",
            () -> EntityType.Builder.of(GazelleEntity::new, EntityClassification.CREATURE)
                    .sized(0.9F, 1.4F)
                    .clientTrackingRange(8)
                    .build("gazelle")
    );
    public static final RegistryObject<EntityType<MantisEntity>> MANTIS = ENTITY_TYPES.register(
            "mantis",
            () -> EntityType.Builder.of(MantisEntity::new, EntityClassification.MONSTER)
                    .sized(0.7F, 0.9F)
                    .clientTrackingRange(8)
                    .build("mantis")
    );
    public static final RegistryObject<EntityType<StinkyEntity>> STINKY = ENTITY_TYPES.register(
            "stinky",
            () -> EntityType.Builder.of(StinkyEntity::new, EntityClassification.CREATURE)
                    .sized(0.9F, 0.9F)
                    .clientTrackingRange(8)
                    .build("stinky")
    );
    public static final RegistryObject<EntityType<RedAntEntity>> RED_ANT = ENTITY_TYPES.register(
            "red_ant",
            () -> EntityType.Builder.of(RedAntEntity::new, EntityClassification.CREATURE)
                    .sized(0.6F, 0.4F)
                    .clientTrackingRange(6)
                    .build("red_ant")
    );
    public static final RegistryObject<EntityType<RainbowAntEntity>> RAINBOW_ANT = ENTITY_TYPES.register(
            "rainbow_ant",
            () -> EntityType.Builder.of(RainbowAntEntity::new, EntityClassification.CREATURE)
                    .sized(0.6F, 0.4F)
                    .clientTrackingRange(6)
                    .build("rainbow_ant")
    );
    public static final RegistryObject<EntityType<BrownAntEntity>> BROWN_ANT = ENTITY_TYPES.register(
            "brown_ant",
            () -> EntityType.Builder.of(BrownAntEntity::new, EntityClassification.CREATURE)
                    .sized(0.6F, 0.4F)
                    .clientTrackingRange(6)
                    .build("brown_ant")
    );
    public static final RegistryObject<EntityType<TermiteEntity>> TERMITE = ENTITY_TYPES.register(
            "termite",
            () -> EntityType.Builder.of(TermiteEntity::new, EntityClassification.CREATURE)
                    .sized(0.5F, 0.35F)
                    .clientTrackingRange(6)
                    .build("termite")
    );
    public static final RegistryObject<EntityType<UnstableAntEntity>> UNSTABLE_ANT = ENTITY_TYPES.register(
            "unstable_ant",
            () -> EntityType.Builder.of(UnstableAntEntity::new, EntityClassification.CREATURE)
                    .sized(0.62F, 0.42F)
                    .clientTrackingRange(6)
                    .build("unstable_ant")
    );

    private OreSpawnEntityTypes() {
    }
}
