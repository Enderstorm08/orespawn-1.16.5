package danger.orespawn;

import danger.orespawn.registry.OreSpawnBlocks;
import danger.orespawn.registry.OreSpawnItems;
import danger.orespawn.registry.OreSpawnSoundEvents;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
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
        OreSpawnItems.ITEMS.register(modBus);
        OreSpawnSoundEvents.SOUND_EVENTS.register(modBus);
        modBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info(
                "Loaded OreSpawn port foundation from legacy {} with {} blocks, {} standalone items, and {} sound events.",
                LEGACY_VERSION,
                OreSpawnBlocks.portedBlockCount(),
                OreSpawnItems.portedStandaloneItemCount(),
                OreSpawnSoundEvents.portedSoundCount()
        );
    }
}
