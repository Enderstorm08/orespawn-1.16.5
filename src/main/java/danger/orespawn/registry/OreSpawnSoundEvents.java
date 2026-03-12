package danger.orespawn.registry;

import danger.orespawn.OreSpawn;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class OreSpawnSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, OreSpawn.MODID);

    public static final RegistryObject<SoundEvent> CHAINSAW = register("chainsaw");
    public static final RegistryObject<SoundEvent> CHAINSAW_SHORT = register("chainsawshort");
    public static final RegistryObject<SoundEvent> BIG_SPLAT = register("big_splat");
    public static final RegistryObject<SoundEvent> ROAR = register("roar");
    public static final RegistryObject<SoundEvent> HOVER = register("hover");

    private OreSpawnSoundEvents() {
    }

    private static RegistryObject<SoundEvent> register(String name) {
        ResourceLocation id = new ResourceLocation(OreSpawn.MODID, name);
        return SOUND_EVENTS.register(name, () -> new SoundEvent(id));
    }

    public static int portedSoundCount() {
        return 5;
    }
}
