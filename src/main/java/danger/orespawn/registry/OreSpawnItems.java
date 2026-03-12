package danger.orespawn.registry;

import danger.orespawn.OreSpawn;
import danger.orespawn.item.OreSpawnItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class OreSpawnItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OreSpawn.MODID);

    // Ore drops.
    public static final RegistryObject<Item> INGOT_URANIUM = register("ingot_uranium");
    public static final RegistryObject<Item> INGOT_TITANIUM = register("ingot_titanium");
    public static final RegistryObject<Item> CRYSTAL_PINK_INGOT = register("crystal_pink_ingot");
    public static final RegistryObject<Item> TIGERS_EYE_INGOT = register("tigers_eye_ingot");
    public static final RegistryObject<Item> RUBY = register("ruby");
    public static final RegistryObject<Item> AMETHYST = register("amethyst");
    public static final RegistryObject<Item> NIGHTMARE_SCALE = register("nightmare_scale");
    public static final RegistryObject<Item> BERTHA_HANDLE = register("bertha_handle");
    public static final RegistryObject<Item> BERTHA_GUARD = register("bertha_guard");
    public static final RegistryObject<Item> BERTHA_BLADE = register("bertha_blade");

    // Weapons and tools.
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register(
            "ruby_sword",
            () -> new SwordItem(OreSpawnItemTiers.RUBY, 3, -2.4F, baseProperties().stacksTo(1))
    );
    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register(
            "amethyst_sword",
            () -> new SwordItem(OreSpawnItemTiers.AMETHYST, 3, -2.4F, baseProperties().stacksTo(1))
    );
    public static final RegistryObject<Item> ULTIMATE_SWORD = ITEMS.register(
            "ultimate_sword",
            () -> new SwordItem(OreSpawnItemTiers.ULTIMATE, 6, -2.2F, baseProperties().stacksTo(1).durability(3000))
    );
    public static final RegistryObject<Item> NIGHTMARE_SWORD = ITEMS.register(
            "nightmare_sword",
            () -> new SwordItem(OreSpawnItemTiers.NIGHTMARE, 7, -2.2F, baseProperties().stacksTo(1).durability(3200))
    );
    public static final RegistryObject<Item> BERTHA = ITEMS.register(
            "bertha",
            () -> new SwordItem(OreSpawnItemTiers.BERTHA, 4, -2.6F, baseProperties().stacksTo(1).durability(9000))
    );
    public static final RegistryObject<Item> ULTIMATE_PICKAXE = ITEMS.register(
            "ultimate_pickaxe",
            () -> new PickaxeItem(OreSpawnItemTiers.ULTIMATE, 2, -2.6F, baseProperties().stacksTo(1).durability(3000))
    );

    private OreSpawnItems() {
    }

    private static RegistryObject<Item> register(String name) {
        return ITEMS.register(name, () -> new Item(baseProperties()));
    }

    private static Item.Properties baseProperties() {
        return new Item.Properties().tab(OreSpawnItemGroup.INSTANCE);
    }

    public static int portedStandaloneItemCount() {
        return 16;
    }
}
