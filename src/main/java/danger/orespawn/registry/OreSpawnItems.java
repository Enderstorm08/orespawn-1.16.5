package danger.orespawn.registry;

import danger.orespawn.OreSpawn;
import danger.orespawn.item.AutoEnchantedBowItem;
import danger.orespawn.item.AutoEnchantedFishingRodItem;
import danger.orespawn.item.OreSpawnItemGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.AxeItem;
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
    public static final RegistryObject<Item> SLICE = ITEMS.register(
            "slice",
            () -> new SwordItem(OreSpawnItemTiers.BERTHA, 4, -2.4F, baseProperties().stacksTo(1).durability(9000))
    );
    public static final RegistryObject<Item> ROYAL_GUARDIAN_SWORD = ITEMS.register(
            "royal_guardian_sword",
            () -> new SwordItem(OreSpawnItemTiers.ROYAL, 4, -2.4F, baseProperties().stacksTo(1).durability(10000))
    );
    public static final RegistryObject<Item> ATTITUDE_ADJUSTER = ITEMS.register(
            "attitude_adjuster",
            () -> new SwordItem(OreSpawnItemTiers.HAMMY, 5, -2.6F, baseProperties().stacksTo(1).durability(2000))
    );
    public static final RegistryObject<Item> QUEEN_BATTLE_AXE = ITEMS.register(
            "queen_battle_axe",
            () -> new AxeItem(OreSpawnItemTiers.QUEEN_BATTLE, 12.0F, -3.0F, baseProperties().stacksTo(1).durability(2200))
    );
    public static final RegistryObject<Item> ULTIMATE_PICKAXE = ITEMS.register(
            "ultimate_pickaxe",
            () -> new PickaxeItem(OreSpawnItemTiers.ULTIMATE, 2, -2.6F, baseProperties().stacksTo(1).durability(3000))
    );
    public static final RegistryObject<Item> ULTIMATE_BOW = ITEMS.register(
            "ultimate_bow",
            () -> new AutoEnchantedBowItem(baseProperties().stacksTo(1).durability(1000), defaultUltimateBowEnchantments())
    );
    public static final RegistryObject<Item> SKATE_BOW = ITEMS.register(
            "skate_bow",
            () -> new AutoEnchantedBowItem(baseProperties().stacksTo(1).durability(300), defaultSkateBowEnchantments())
    );
    public static final RegistryObject<Item> ULTIMATE_FISHING_ROD = ITEMS.register(
            "ultimate_fishing_rod",
            () -> new AutoEnchantedFishingRodItem(
                    baseProperties().stacksTo(1).durability(3000),
                    defaultUltimateFishingRodEnchantments()
            )
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
        return 23;
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultUltimateBowEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = new LinkedHashMap<>();
        enchantments.put(Enchantments.POWER_ARROWS, 5);
        enchantments.put(Enchantments.PUNCH_ARROWS, 3);
        enchantments.put(Enchantments.FLAMING_ARROWS, 2);
        enchantments.put(Enchantments.INFINITY_ARROWS, 1);
        return enchantments;
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultSkateBowEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = new LinkedHashMap<>();
        enchantments.put(Enchantments.POWER_ARROWS, 3);
        enchantments.put(Enchantments.PUNCH_ARROWS, 2);
        enchantments.put(Enchantments.FLAMING_ARROWS, 1);
        return enchantments;
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultUltimateFishingRodEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = new LinkedHashMap<>();
        enchantments.put(Enchantments.FISHING_LUCK, 2);
        enchantments.put(Enchantments.FISHING_SPEED, 2);
        return enchantments;
    }
}
