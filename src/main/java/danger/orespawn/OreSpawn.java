package danger.orespawn;

import danger.orespawn.registry.OreSpawnBlocks;
import danger.orespawn.registry.OreSpawnBiomes;
import danger.orespawn.registry.OreSpawnEntityTypes;
import danger.orespawn.registry.OreSpawnFeatures;
import danger.orespawn.registry.OreSpawnItems;
import danger.orespawn.registry.OreSpawnSoundEvents;
import net.minecraft.block.BlockState;
import net.minecraft.block.DispenserBlock;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.IPosition;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(OreSpawn.MODID)
public class OreSpawn {
    public static final String MODID = "orespawn";
    public static final String LEGACY_VERSION = "1.7.10-20.0";
    public static final Logger LOGGER = LogManager.getLogger();

    public OreSpawn() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        OreSpawnBlocks.BLOCKS.register(modBus);
        OreSpawnBiomes.BIOMES.register(modBus);
        OreSpawnEntityTypes.ENTITY_TYPES.register(modBus);
        OreSpawnFeatures.FEATURES.register(modBus);
        OreSpawnItems.ITEMS.register(modBus);
        OreSpawnSoundEvents.SOUND_EVENTS.register(modBus);
        modBus.addListener(this::commonSetup);
        modBus.addListener(this::entityAttributes);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modBus.addListener(this::clientSetup));
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            danger.orespawn.item.CritterCageItem.registerDefaultCaptures(
                    () -> OreSpawnItems.CAGE_COW.get(),
                    () -> OreSpawnItems.CAGE_PIG.get(),
                    () -> OreSpawnItems.CAGE_CHICKEN.get(),
                    () -> OreSpawnItems.CAGE_SHEEP.get(),
                    () -> OreSpawnItems.CAGE_WOLF.get(),
                    () -> OreSpawnItems.CAGE_OCELOT.get(),
                    () -> OreSpawnItems.CAGE_HORSE.get(),
                    () -> OreSpawnItems.CAGE_VILLAGER.get(),
                    () -> OreSpawnItems.CAGE_CREEPER.get(),
                    () -> OreSpawnItems.CAGE_ZOMBIE.get(),
                    () -> OreSpawnItems.CAGE_SKELETON.get(),
                    () -> OreSpawnItems.CAGE_SPIDER.get(),
                    () -> OreSpawnItems.CAGE_BAT.get(),
                    () -> OreSpawnItems.CAGE_SQUID.get(),
                    () -> OreSpawnItems.CAGE_SLIME.get(),
                    () -> OreSpawnItems.CAGE_GHAST.get(),
                    () -> OreSpawnItems.CAGE_ENDERMAN.get(),
                    () -> OreSpawnItems.CAGE_CAVE_SPIDER.get(),
                    () -> OreSpawnItems.CAGE_SILVERFISH.get(),
                    () -> OreSpawnItems.CAGE_MAGMA_CUBE.get(),
                    () -> OreSpawnItems.CAGE_WITCH.get(),
                    () -> OreSpawnItems.CAGE_BLAZE.get(),
                    () -> OreSpawnItems.CAGE_MOOSHROOM.get(),
                    () -> OreSpawnItems.CAGE_WITHER_SKELETON.get(),
                    () -> OreSpawnItems.CAGE_SNOW_GOLEM.get(),
                    () -> OreSpawnItems.CAGE_IRON_GOLEM.get()
            );
            danger.orespawn.item.CritterCageItem.registerCapture(danger.orespawn.entity.FireflyEntity.class, () -> OreSpawnItems.CAGE_FIREFLY.get());
            danger.orespawn.item.CritterCageItem.registerCapture(danger.orespawn.entity.PeacockEntity.class, () -> OreSpawnItems.CAGE_PEACOCK.get());
            danger.orespawn.item.CritterCageItem.registerCapture(danger.orespawn.entity.FairyEntity.class, () -> OreSpawnItems.CAGE_FAIRY.get());
            danger.orespawn.item.CritterCageItem.registerCapture(danger.orespawn.entity.RatEntity.class, () -> OreSpawnItems.CAGE_RAT.get());
            danger.orespawn.item.CritterCageItem.registerCapture(danger.orespawn.entity.StinkBugEntity.class, () -> OreSpawnItems.CAGE_STINK.get());
            danger.orespawn.item.CritterCageItem.registerCapture(danger.orespawn.entity.GazelleEntity.class, () -> OreSpawnItems.CAGE_GAZELLE.get());
            danger.orespawn.item.CritterCageItem.registerCapture(danger.orespawn.entity.MantisEntity.class, () -> OreSpawnItems.CAGE_MANTIS.get());
            danger.orespawn.item.CritterCageItem.registerCapture(danger.orespawn.entity.StinkyEntity.class, () -> OreSpawnItems.CAGE_STINKY.get());
            EntitySpawnPlacementRegistry.register(OreSpawnEntityTypes.FIREFLY.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, OreSpawn::mobSpawn);
            EntitySpawnPlacementRegistry.register(OreSpawnEntityTypes.BUTTERFLY.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, OreSpawn::mobSpawn);
            EntitySpawnPlacementRegistry.register(OreSpawnEntityTypes.MOTH.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, OreSpawn::mobSpawn);
            EntitySpawnPlacementRegistry.register(OreSpawnEntityTypes.PEACOCK.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, OreSpawn::mobSpawn);
            EntitySpawnPlacementRegistry.register(OreSpawnEntityTypes.FAIRY.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, OreSpawn::mobSpawn);
            EntitySpawnPlacementRegistry.register(OreSpawnEntityTypes.RAT.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, OreSpawn::mobSpawn);
            EntitySpawnPlacementRegistry.register(OreSpawnEntityTypes.STINK_BUG.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, OreSpawn::mobSpawn);
            EntitySpawnPlacementRegistry.register(OreSpawnEntityTypes.GAZELLE.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, OreSpawn::mobSpawn);
            EntitySpawnPlacementRegistry.register(OreSpawnEntityTypes.MANTIS.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, OreSpawn::mobSpawn);
            EntitySpawnPlacementRegistry.register(OreSpawnEntityTypes.STINKY.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, OreSpawn::mobSpawn);
            EntitySpawnPlacementRegistry.register(OreSpawnEntityTypes.RED_ANT.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, OreSpawn::mobSpawn);
            EntitySpawnPlacementRegistry.register(OreSpawnEntityTypes.RAINBOW_ANT.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, OreSpawn::mobSpawn);
            EntitySpawnPlacementRegistry.register(OreSpawnEntityTypes.BROWN_ANT.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, OreSpawn::mobSpawn);
            EntitySpawnPlacementRegistry.register(OreSpawnEntityTypes.TERMITE.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, OreSpawn::mobSpawn);
            EntitySpawnPlacementRegistry.register(OreSpawnEntityTypes.UNSTABLE_ANT.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, OreSpawn::mobSpawn);
            danger.orespawn.world.OreSpawnConfiguredFeatures.registerAll();
            registerThrownAmmoBehaviors();
        });
        LOGGER.info(
                "Loaded OreSpawn port foundation from legacy {} with {} blocks, {} standalone items, and {} sound events.",
                LEGACY_VERSION,
                OreSpawnBlocks.portedBlockCount(),
                OreSpawnItems.portedStandaloneItemCount(),
                OreSpawnSoundEvents.portedSoundCount()
        );
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        OreSpawnClient.onClientSetup(event);
    }

    private void entityAttributes(final EntityAttributeCreationEvent event) {
        event.put(OreSpawnEntityTypes.FIREFLY.get(), danger.orespawn.entity.FireflyEntity.createAttributes().build());
        event.put(OreSpawnEntityTypes.BUTTERFLY.get(), danger.orespawn.entity.ButterflyEntity.createAttributes().build());
        event.put(OreSpawnEntityTypes.MOTH.get(), danger.orespawn.entity.LunaMothEntity.createAttributes().build());
        event.put(OreSpawnEntityTypes.PEACOCK.get(), danger.orespawn.entity.PeacockEntity.createAttributes().build());
        event.put(OreSpawnEntityTypes.FAIRY.get(), danger.orespawn.entity.FairyEntity.createAttributes().build());
        event.put(OreSpawnEntityTypes.RAT.get(), danger.orespawn.entity.RatEntity.createAttributes().build());
        event.put(OreSpawnEntityTypes.STINK_BUG.get(), danger.orespawn.entity.StinkBugEntity.createAttributes().build());
        event.put(OreSpawnEntityTypes.GAZELLE.get(), danger.orespawn.entity.GazelleEntity.createAttributes().build());
        event.put(OreSpawnEntityTypes.MANTIS.get(), danger.orespawn.entity.MantisEntity.createAttributes().build());
        event.put(OreSpawnEntityTypes.STINKY.get(), danger.orespawn.entity.StinkyEntity.createAttributes().build());
        event.put(OreSpawnEntityTypes.RED_ANT.get(), danger.orespawn.entity.RedAntEntity.createAttributes().build());
        event.put(OreSpawnEntityTypes.RAINBOW_ANT.get(), danger.orespawn.entity.RainbowAntEntity.createAttributes().build());
        event.put(OreSpawnEntityTypes.BROWN_ANT.get(), danger.orespawn.entity.BrownAntEntity.createAttributes().build());
        event.put(OreSpawnEntityTypes.TERMITE.get(), danger.orespawn.entity.TermiteEntity.createAttributes().build());
        event.put(OreSpawnEntityTypes.UNSTABLE_ANT.get(), danger.orespawn.entity.UnstableAntEntity.createAttributes().build());
    }

    private static boolean mobSpawn(EntityType<? extends MobEntity> type, IServerWorld level, net.minecraft.entity.SpawnReason reason, net.minecraft.util.math.BlockPos pos, java.util.Random random) {
        return MobEntity.checkMobSpawnRules(type, level, reason, pos, random);
    }

    private static void registerThrownAmmoBehaviors() {
        registerThrownAmmoBehavior(OreSpawnItems.SUNSPOT_URCHIN.get(), 1.1F, 0.85F);
        registerThrownAmmoBehavior(OreSpawnItems.WATER_BALL.get(), 1.25F, 0.75F);
        registerThrownAmmoBehavior(OreSpawnItems.LASER_BALL.get(), 1.75F, 0.2F);
        registerThrownAmmoBehavior(OreSpawnItems.ACID.get(), 1.15F, 0.6F);
        registerThrownAmmoBehavior(OreSpawnItems.DEAD_IRUKANDJI.get(), 1.05F, 0.75F);
        registerThrownAmmoBehavior(OreSpawnItems.ICE_BALL.get(), 1.15F, 0.65F);
        registerThrownAmmoBehavior(OreSpawnItems.SMALL_ROCK.get(), 1.0F, 1.0F);
        registerThrownAmmoBehavior(OreSpawnItems.ROCK.get(), 1.1F, 0.85F);
        registerThrownAmmoBehavior(OreSpawnItems.RED_ROCK.get(), 1.2F, 0.75F);
        registerThrownAmmoBehavior(OreSpawnItems.GREEN_ROCK.get(), 1.15F, 0.75F);
        registerThrownAmmoBehavior(OreSpawnItems.BLUE_ROCK.get(), 1.15F, 0.75F);
        registerThrownAmmoBehavior(OreSpawnItems.PURPLE_ROCK.get(), 1.15F, 0.75F);
        registerThrownAmmoBehavior(OreSpawnItems.SPIKEY_ROCK.get(), 1.2F, 0.7F);
        registerThrownAmmoBehavior(OreSpawnItems.TNT_ROCK.get(), 1.2F, 0.7F);
        registerThrownAmmoBehavior(OreSpawnItems.CRYSTAL_RED_ROCK.get(), 1.25F, 0.6F);
        registerThrownAmmoBehavior(OreSpawnItems.CRYSTAL_GREEN_ROCK.get(), 1.25F, 0.6F);
        registerThrownAmmoBehavior(OreSpawnItems.CRYSTAL_BLUE_ROCK.get(), 1.25F, 0.6F);
        registerThrownAmmoBehavior(OreSpawnItems.CRYSTAL_TNT_ROCK.get(), 1.3F, 0.55F);
    }

    private static void registerThrownAmmoBehavior(Item item, float velocity, float inaccuracy) {
        DispenserBlock.registerBehavior(item, new DefaultDispenseItemBehavior() {
            @Override
            protected ItemStack execute(IBlockSource source, ItemStack stack) {
                net.minecraft.world.World world = source.getLevel();
                IPosition position = DispenserBlock.getDispensePosition(source);
                BlockState state = source.getBlockState();
                Direction direction = state.getValue(DispenserBlock.FACING);

                if (!world.isClientSide) {
                    danger.orespawn.entity.OreSpawnThrownItemEntity projectile = new danger.orespawn.entity.OreSpawnThrownItemEntity(
                            world,
                            position.x(),
                            position.y(),
                            position.z()
                    );
                    projectile.setItem(new ItemStack(item));
                    projectile.shoot(direction.getStepX(), direction.getStepY() + 0.1F, direction.getStepZ(), velocity, inaccuracy);
                    world.addFreshEntity(projectile);
                }

                stack.shrink(1);
                world.playSound(
                        null,
                        position.x(),
                        position.y(),
                        position.z(),
                        SoundEvents.SNOWBALL_THROW,
                        SoundCategory.BLOCKS,
                        0.5F,
                        0.8F
                );
                return stack;
            }
        });
    }
}
