package danger.orespawn.registry;

import danger.orespawn.OreSpawn;
import danger.orespawn.item.AutoEnchantedAxeItem;
import danger.orespawn.item.AutoEnchantedBowItem;
import danger.orespawn.item.AutoEnchantedFishingRodItem;
import danger.orespawn.item.AutoEnchantedPickaxeItem;
import danger.orespawn.item.AutoEnchantedSwordItem;
import danger.orespawn.item.ExperienceSwordItem;
import danger.orespawn.item.ExactAttributeHoeItem;
import danger.orespawn.item.ExactAttributeShovelItem;
import danger.orespawn.item.OreSpawnItemGroup;
import danger.orespawn.item.OreSpawnArmorItem;
import java.util.LinkedHashMap;
import java.util.Map;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class OreSpawnItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OreSpawn.MODID);

    // Ore drops.
    public static final RegistryObject<Item> INGOT_URANIUM = register("ingot_uranium");
    public static final RegistryObject<Item> INGOT_TITANIUM = register("ingot_titanium");
    public static final RegistryObject<Item> URANIUM_NUGGET = register("uranium_nugget");
    public static final RegistryObject<Item> TITANIUM_NUGGET = register("titanium_nugget");
    public static final RegistryObject<Item> CRYSTAL_PINK_INGOT = register("crystal_pink_ingot");
    public static final RegistryObject<Item> TIGERS_EYE_INGOT = register("tigers_eye_ingot");
    public static final RegistryObject<Item> RUBY = register("ruby");
    public static final RegistryObject<Item> AMETHYST = register("amethyst");
    public static final RegistryObject<Item> NIGHTMARE_SCALE = register("nightmare_scale");
    public static final RegistryObject<Item> QUEEN_SCALE = register("queen_scale");
    public static final RegistryObject<Item> MOTH_SCALE = register("moth_scale");
    public static final RegistryObject<Item> LAVA_EEL = register("lava_eel");
    public static final RegistryObject<Item> PEACOCK_FEATHER = register("peacock_feather");
    public static final RegistryObject<Item> BERTHA_HANDLE = register("bertha_handle");
    public static final RegistryObject<Item> BERTHA_GUARD = register("bertha_guard");
    public static final RegistryObject<Item> BERTHA_BLADE = register("bertha_blade");

    // Weapons and tools.
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register(
            "ruby_sword",
            () -> new AutoEnchantedSwordItem(
                    OreSpawnItemTiers.RUBY,
                    18.0F,
                    -2.4F,
                    baseProperties().stacksTo(1).durability(1500),
                    noEnchantments()
            )
    );
    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register(
            "amethyst_sword",
            () -> new AutoEnchantedSwordItem(
                    OreSpawnItemTiers.AMETHYST,
                    18.0F,
                    -2.4F,
                    baseProperties().stacksTo(1).durability(2000),
                    noEnchantments()
            )
    );
    public static final RegistryObject<Item> ULTIMATE_SWORD = ITEMS.register(
            "ultimate_sword",
            () -> new AutoEnchantedSwordItem(
                    OreSpawnItemTiers.ULTIMATE,
                    40.0F,
                    -2.2F,
                    baseProperties().stacksTo(1).durability(3000),
                    defaultUltimateSwordEnchantments()
            )
    );
    public static final RegistryObject<Item> NIGHTMARE_SWORD = ITEMS.register(
            "nightmare_sword",
            () -> new AutoEnchantedSwordItem(
                    OreSpawnItemTiers.NIGHTMARE,
                    30.0F,
                    -2.2F,
                    baseProperties().stacksTo(1).durability(1200),
                    defaultNightmareSwordEnchantments()
            )
    );
    public static final RegistryObject<Item> BERTHA = ITEMS.register(
            "bertha",
            () -> new AutoEnchantedSwordItem(
                    OreSpawnItemTiers.BERTHA,
                    500.0F,
                    -2.6F,
                    baseProperties().stacksTo(1).durability(9000),
                    defaultBerthaEnchantments()
            )
    );
    public static final RegistryObject<Item> SLICE = ITEMS.register(
            "slice",
            () -> new AutoEnchantedSwordItem(
                    OreSpawnItemTiers.BERTHA,
                    500.0F,
                    -2.4F,
                    baseProperties().stacksTo(1).durability(9000),
                    defaultBerthaEnchantments()
            )
    );
    public static final RegistryObject<Item> ROYAL_GUARDIAN_SWORD = ITEMS.register(
            "royal_guardian_sword",
            () -> new AutoEnchantedSwordItem(
                    OreSpawnItemTiers.ROYAL,
                    750.0F,
                    -2.4F,
                    baseProperties().stacksTo(1).durability(9000),
                    defaultRoyalGuardianSwordEnchantments()
            )
    );
    public static final RegistryObject<Item> ATTITUDE_ADJUSTER = ITEMS.register(
            "attitude_adjuster",
            () -> new AutoEnchantedSwordItem(
                    OreSpawnItemTiers.HAMMY,
                    86.0F,
                    -2.6F,
                    baseProperties().stacksTo(1).durability(9000),
                    noEnchantments()
            )
    );
    public static final RegistryObject<Item> QUEEN_BATTLE_AXE = ITEMS.register(
            "queen_battle_axe",
            () -> new AutoEnchantedAxeItem(
                    OreSpawnItemTiers.QUEEN_BATTLE,
                    666.0F,
                    -3.0F,
                    baseProperties().stacksTo(1).durability(3000),
                    defaultUltimateSwordEnchantments()
            )
    );
    public static final RegistryObject<Item> ULTIMATE_PICKAXE = ITEMS.register(
            "ultimate_pickaxe",
            () -> new AutoEnchantedPickaxeItem(
                    OreSpawnItemTiers.ULTIMATE,
                    15.0F,
                    -2.6F,
                    baseProperties().stacksTo(1).durability(3000),
                    defaultUltimatePickaxeEnchantments()
            )
    );
    public static final RegistryObject<Item> CRYSTAL_WOOD_SWORD = ITEMS.register(
            "crystal_wood_sword",
            () -> new AutoEnchantedSwordItem(
                    OreSpawnItemTiers.CRYSTAL_WOOD,
                    6.0F,
                    -2.4F,
                    baseProperties().stacksTo(1).durability(300),
                    noEnchantments()
            )
    );
    public static final RegistryObject<Item> CRYSTAL_WOOD_PICKAXE = ITEMS.register(
            "crystal_wood_pickaxe",
            () -> new AutoEnchantedPickaxeItem(
                    OreSpawnItemTiers.CRYSTAL_WOOD,
                    4.0F,
                    -2.8F,
                    baseProperties().stacksTo(1).durability(300),
                    noEnchantments()
            )
    );
    public static final RegistryObject<Item> CRYSTAL_WOOD_AXE = ITEMS.register(
            "crystal_wood_axe",
            () -> new AutoEnchantedAxeItem(
                    OreSpawnItemTiers.CRYSTAL_WOOD,
                    6.0F,
                    -3.0F,
                    baseProperties().stacksTo(1).durability(300),
                    noEnchantments()
            )
    );
    public static final RegistryObject<Item> CRYSTAL_WOOD_SHOVEL = ITEMS.register(
            "crystal_wood_shovel",
            () -> new ExactAttributeShovelItem(
                    OreSpawnItemTiers.CRYSTAL_WOOD,
                    3.0F,
                    -3.0F,
                    baseProperties().stacksTo(1).durability(300)
            )
    );
    public static final RegistryObject<Item> CRYSTAL_WOOD_HOE = ITEMS.register(
            "crystal_wood_hoe",
            () -> new ExactAttributeHoeItem(
                    OreSpawnItemTiers.CRYSTAL_WOOD,
                    2.0F,
                    -3.0F,
                    baseProperties().stacksTo(1).durability(300)
            )
    );
    public static final RegistryObject<Item> CRYSTAL_STONE_SWORD = ITEMS.register(
            "crystal_stone_sword",
            () -> new AutoEnchantedSwordItem(
                    OreSpawnItemTiers.CRYSTAL_STONE,
                    9.0F,
                    -2.4F,
                    baseProperties().stacksTo(1).durability(800),
                    noEnchantments()
            )
    );
    public static final RegistryObject<Item> CRYSTAL_STONE_PICKAXE = ITEMS.register(
            "crystal_stone_pickaxe",
            () -> new AutoEnchantedPickaxeItem(
                    OreSpawnItemTiers.CRYSTAL_STONE,
                    7.0F,
                    -2.8F,
                    baseProperties().stacksTo(1).durability(800),
                    noEnchantments()
            )
    );
    public static final RegistryObject<Item> CRYSTAL_STONE_AXE = ITEMS.register(
            "crystal_stone_axe",
            () -> new AutoEnchantedAxeItem(
                    OreSpawnItemTiers.CRYSTAL_STONE,
                    9.0F,
                    -3.0F,
                    baseProperties().stacksTo(1).durability(800),
                    noEnchantments()
            )
    );
    public static final RegistryObject<Item> CRYSTAL_STONE_SHOVEL = ITEMS.register(
            "crystal_stone_shovel",
            () -> new ExactAttributeShovelItem(
                    OreSpawnItemTiers.CRYSTAL_STONE,
                    6.0F,
                    -3.0F,
                    baseProperties().stacksTo(1).durability(800)
            )
    );
    public static final RegistryObject<Item> CRYSTAL_STONE_HOE = ITEMS.register(
            "crystal_stone_hoe",
            () -> new ExactAttributeHoeItem(
                    OreSpawnItemTiers.CRYSTAL_STONE,
                    5.0F,
                    -3.0F,
                    baseProperties().stacksTo(1).durability(800)
            )
    );
    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register(
            "emerald_sword",
            () -> new AutoEnchantedSwordItem(
                    OreSpawnItemTiers.EMERALD,
                    15.0F,
                    -2.4F,
                    baseProperties().stacksTo(1).durability(1300),
                    noEnchantments()
            )
    );
    public static final RegistryObject<Item> EXPERIENCE_SWORD = ITEMS.register(
            "experience_sword",
            () -> new ExperienceSwordItem(
                    OreSpawnItemTiers.EXPERIENCE,
                    15.0F,
                    -2.4F,
                    baseProperties().stacksTo(1).durability(1400),
                    defaultExperienceSwordEnchantments()
            )
    );
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register(
            "emerald_pickaxe",
            () -> new AutoEnchantedPickaxeItem(
                    OreSpawnItemTiers.EMERALD,
                    10.0F,
                    -2.8F,
                    baseProperties().stacksTo(1).durability(1300),
                    defaultEmeraldPickaxeEnchantments()
            )
    );
    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register(
            "emerald_axe",
            () -> new AutoEnchantedAxeItem(
                    OreSpawnItemTiers.EMERALD,
                    10.0F,
                    -3.0F,
                    baseProperties().stacksTo(1).durability(1300),
                    noEnchantments()
            )
    );
    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register(
            "emerald_shovel",
            () -> new ExactAttributeShovelItem(
                    OreSpawnItemTiers.EMERALD,
                    5.0F,
                    -3.0F,
                    baseProperties().stacksTo(1).durability(1300)
            )
    );
    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register(
            "emerald_hoe",
            () -> new ExactAttributeHoeItem(
                    OreSpawnItemTiers.EMERALD,
                    5.0F,
                    -3.0F,
                    baseProperties().stacksTo(1).durability(1300)
            )
    );
    public static final RegistryObject<Item> CRYSTAL_PINK_SWORD = ITEMS.register(
            "crystal_pink_sword",
            () -> new AutoEnchantedSwordItem(
                    OreSpawnItemTiers.CRYSTAL_PINK,
                    11.0F,
                    -2.4F,
                    baseProperties().stacksTo(1).durability(1100),
                    noEnchantments()
            )
    );
    public static final RegistryObject<Item> CRYSTAL_PINK_PICKAXE = ITEMS.register(
            "crystal_pink_pickaxe",
            () -> new AutoEnchantedPickaxeItem(
                    OreSpawnItemTiers.CRYSTAL_PINK,
                    7.0F,
                    -2.8F,
                    baseProperties().stacksTo(1).durability(1100),
                    noEnchantments()
            )
    );
    public static final RegistryObject<Item> CRYSTAL_PINK_AXE = ITEMS.register(
            "crystal_pink_axe",
            () -> new AutoEnchantedAxeItem(
                    OreSpawnItemTiers.CRYSTAL_PINK,
                    7.0F,
                    -3.0F,
                    baseProperties().stacksTo(1).durability(1100),
                    noEnchantments()
            )
    );
    public static final RegistryObject<Item> CRYSTAL_PINK_SHOVEL = ITEMS.register(
            "crystal_pink_shovel",
            () -> new ExactAttributeShovelItem(
                    OreSpawnItemTiers.CRYSTAL_PINK,
                    3.0F,
                    -3.0F,
                    baseProperties().stacksTo(1).durability(1100)
            )
    );
    public static final RegistryObject<Item> CRYSTAL_PINK_HOE = ITEMS.register(
            "crystal_pink_hoe",
            () -> new ExactAttributeHoeItem(
                    OreSpawnItemTiers.CRYSTAL_PINK,
                    3.0F,
                    -3.0F,
                    baseProperties().stacksTo(1).durability(1100)
            )
    );
    public static final RegistryObject<Item> TIGERS_EYE_SWORD = ITEMS.register(
            "tigers_eye_sword",
            () -> new AutoEnchantedSwordItem(
                    OreSpawnItemTiers.TIGERS_EYE,
                    12.0F,
                    -2.4F,
                    baseProperties().stacksTo(1).durability(1600),
                    noEnchantments()
            )
    );
    public static final RegistryObject<Item> TIGERS_EYE_PICKAXE = ITEMS.register(
            "tigers_eye_pickaxe",
            () -> new AutoEnchantedPickaxeItem(
                    OreSpawnItemTiers.TIGERS_EYE,
                    8.0F,
                    -2.8F,
                    baseProperties().stacksTo(1).durability(1600),
                    noEnchantments()
            )
    );
    public static final RegistryObject<Item> TIGERS_EYE_AXE = ITEMS.register(
            "tigers_eye_axe",
            () -> new AutoEnchantedAxeItem(
                    OreSpawnItemTiers.TIGERS_EYE,
                    8.0F,
                    -3.0F,
                    baseProperties().stacksTo(1).durability(1600),
                    noEnchantments()
            )
    );
    public static final RegistryObject<Item> TIGERS_EYE_SHOVEL = ITEMS.register(
            "tigers_eye_shovel",
            () -> new ExactAttributeShovelItem(
                    OreSpawnItemTiers.TIGERS_EYE,
                    4.0F,
                    -3.0F,
                    baseProperties().stacksTo(1).durability(1600)
            )
    );
    public static final RegistryObject<Item> TIGERS_EYE_HOE = ITEMS.register(
            "tigers_eye_hoe",
            () -> new ExactAttributeHoeItem(
                    OreSpawnItemTiers.TIGERS_EYE,
                    4.0F,
                    -3.0F,
                    baseProperties().stacksTo(1).durability(1600)
            )
    );
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register(
            "ruby_pickaxe",
            () -> new AutoEnchantedPickaxeItem(
                    OreSpawnItemTiers.RUBY,
                    12.0F,
                    -2.8F,
                    baseProperties().stacksTo(1).durability(1500),
                    noEnchantments()
            )
    );
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register(
            "ruby_axe",
            () -> new AutoEnchantedAxeItem(
                    OreSpawnItemTiers.RUBY,
                    12.0F,
                    -3.0F,
                    baseProperties().stacksTo(1).durability(1500),
                    noEnchantments()
            )
    );
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register(
            "ruby_shovel",
            () -> new ExactAttributeShovelItem(
                    OreSpawnItemTiers.RUBY,
                    5.0F,
                    -3.0F,
                    baseProperties().stacksTo(1).durability(1500)
            )
    );
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register(
            "ruby_hoe",
            () -> new ExactAttributeHoeItem(
                    OreSpawnItemTiers.RUBY,
                    5.0F,
                    -3.0F,
                    baseProperties().stacksTo(1).durability(1500)
            )
    );
    public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register(
            "amethyst_pickaxe",
            () -> new AutoEnchantedPickaxeItem(
                    OreSpawnItemTiers.AMETHYST,
                    12.0F,
                    -2.8F,
                    baseProperties().stacksTo(1).durability(2000),
                    noEnchantments()
            )
    );
    public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register(
            "amethyst_axe",
            () -> new AutoEnchantedAxeItem(
                    OreSpawnItemTiers.AMETHYST,
                    12.0F,
                    -3.0F,
                    baseProperties().stacksTo(1).durability(2000),
                    noEnchantments()
            )
    );
    public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register(
            "amethyst_shovel",
            () -> new ExactAttributeShovelItem(
                    OreSpawnItemTiers.AMETHYST,
                    5.0F,
                    -3.0F,
                    baseProperties().stacksTo(1).durability(2000)
            )
    );
    public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register(
            "amethyst_hoe",
            () -> new ExactAttributeHoeItem(
                    OreSpawnItemTiers.AMETHYST,
                    5.0F,
                    -3.0F,
                    baseProperties().stacksTo(1).durability(2000)
            )
    );
    public static final RegistryObject<Item> ULTIMATE_BOW = ITEMS.register(
            "ultimate_bow",
            () -> new AutoEnchantedBowItem(baseProperties().stacksTo(1).durability(1000), defaultUltimateBowEnchantments())
    );
    public static final RegistryObject<Item> SKATE_BOW = ITEMS.register(
            "skate_bow",
            () -> new AutoEnchantedBowItem(baseProperties().stacksTo(1).durability(300), noEnchantments())
    );
    public static final RegistryObject<Item> ULTIMATE_FISHING_ROD = ITEMS.register(
            "ultimate_fishing_rod",
            () -> new AutoEnchantedFishingRodItem(
                    baseProperties().stacksTo(1).durability(3000),
                    defaultUltimateFishingRodEnchantments()
            )
    );
    public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register(
            "emerald_helmet",
            () -> new OreSpawnArmorItem(OreSpawnArmorMaterials.EMERALD, EquipmentSlotType.HEAD, baseProperties().stacksTo(1), "emerald", noEnchantments(), 0.0D)
    );
    public static final RegistryObject<Item> EXPERIENCE_HELMET = ITEMS.register(
            "experience_helmet",
            () -> new OreSpawnArmorItem(OreSpawnArmorMaterials.EXPERIENCE, EquipmentSlotType.HEAD, baseProperties().stacksTo(1), "experience", defaultExperienceHelmetEnchantments(), 0.0D)
    );
    public static final RegistryObject<Item> EXPERIENCE_CHESTPLATE = ITEMS.register(
            "experience_chestplate",
            () -> new OreSpawnArmorItem(OreSpawnArmorMaterials.EXPERIENCE, EquipmentSlotType.CHEST, baseProperties().stacksTo(1), "experience", defaultExperienceArmorEnchantments(), 0.0D)
    );
    public static final RegistryObject<Item> EXPERIENCE_LEGGINGS = ITEMS.register(
            "experience_leggings",
            () -> new OreSpawnArmorItem(OreSpawnArmorMaterials.EXPERIENCE, EquipmentSlotType.LEGS, baseProperties().stacksTo(1), "experience", defaultExperienceArmorEnchantments(), 0.0D)
    );
    public static final RegistryObject<Item> EXPERIENCE_BOOTS = ITEMS.register(
            "experience_boots",
            () -> new OreSpawnArmorItem(OreSpawnArmorMaterials.EXPERIENCE, EquipmentSlotType.FEET, baseProperties().stacksTo(1), "experience", defaultExperienceBootsEnchantments(), 0.0D)
    );
    public static final RegistryObject<Item> MOTH_SCALE_HELMET = ITEMS.register(
            "moth_scale_helmet",
            () -> new OreSpawnArmorItem(OreSpawnArmorMaterials.MOTH_SCALE, EquipmentSlotType.HEAD, baseProperties().stacksTo(1), "mothscale", defaultMothScaleHelmetEnchantments(), 0.0D)
    );
    public static final RegistryObject<Item> MOTH_SCALE_CHESTPLATE = ITEMS.register(
            "moth_scale_chestplate",
            () -> new OreSpawnArmorItem(OreSpawnArmorMaterials.MOTH_SCALE, EquipmentSlotType.CHEST, baseProperties().stacksTo(1), "mothscale", defaultMothScaleArmorEnchantments(), 0.0D)
    );
    public static final RegistryObject<Item> MOTH_SCALE_LEGGINGS = ITEMS.register(
            "moth_scale_leggings",
            () -> new OreSpawnArmorItem(OreSpawnArmorMaterials.MOTH_SCALE, EquipmentSlotType.LEGS, baseProperties().stacksTo(1), "mothscale", defaultMothScaleArmorEnchantments(), 0.0D)
    );
    public static final RegistryObject<Item> MOTH_SCALE_BOOTS = ITEMS.register(
            "moth_scale_boots",
            () -> new OreSpawnArmorItem(OreSpawnArmorMaterials.MOTH_SCALE, EquipmentSlotType.FEET, baseProperties().stacksTo(1), "mothscale", defaultMothScaleBootsEnchantments(), 0.0D)
    );
    public static final RegistryObject<Item> LAVA_EEL_HELMET = ITEMS.register(
            "lava_eel_helmet",
            () -> new OreSpawnArmorItem(OreSpawnArmorMaterials.LAVA_EEL, EquipmentSlotType.HEAD, baseProperties().stacksTo(1), "lavaeel", defaultLavaEelHelmetEnchantments(), 0.0D)
    );
    public static final RegistryObject<Item> LAVA_EEL_CHESTPLATE = ITEMS.register(
            "lava_eel_chestplate",
            () -> new OreSpawnArmorItem(OreSpawnArmorMaterials.LAVA_EEL, EquipmentSlotType.CHEST, baseProperties().stacksTo(1), "lavaeel", defaultLavaEelArmorEnchantments(), 0.0D)
    );
    public static final RegistryObject<Item> LAVA_EEL_LEGGINGS = ITEMS.register(
            "lava_eel_leggings",
            () -> new OreSpawnArmorItem(OreSpawnArmorMaterials.LAVA_EEL, EquipmentSlotType.LEGS, baseProperties().stacksTo(1), "lavaeel", defaultLavaEelArmorEnchantments(), 0.0D)
    );
    public static final RegistryObject<Item> LAVA_EEL_BOOTS = ITEMS.register(
            "lava_eel_boots",
            () -> new OreSpawnArmorItem(OreSpawnArmorMaterials.LAVA_EEL, EquipmentSlotType.FEET, baseProperties().stacksTo(1), "lavaeel", defaultLavaEelBootsEnchantments(), 0.0D)
    );
    public static final RegistryObject<Item> PEACOCK_HELMET = ITEMS.register(
            "peacock_helmet",
            () -> new OreSpawnArmorItem(OreSpawnArmorMaterials.PEACOCK, EquipmentSlotType.HEAD, baseProperties().stacksTo(1), "peacock", noEnchantments(), 0.0D)
    );
    public static final RegistryObject<Item> PEACOCK_CHESTPLATE = ITEMS.register(
            "peacock_chestplate",
            () -> new OreSpawnArmorItem(OreSpawnArmorMaterials.PEACOCK, EquipmentSlotType.CHEST, baseProperties().stacksTo(1), "peacock", noEnchantments(), 0.0D)
    );
    public static final RegistryObject<Item> PEACOCK_LEGGINGS = ITEMS.register(
            "peacock_leggings",
            () -> new OreSpawnArmorItem(OreSpawnArmorMaterials.PEACOCK, EquipmentSlotType.LEGS, baseProperties().stacksTo(1), "peacock", noEnchantments(), 0.0D)
    );
    public static final RegistryObject<Item> PEACOCK_BOOTS = ITEMS.register(
            "peacock_boots",
            () -> new OreSpawnArmorItem(OreSpawnArmorMaterials.PEACOCK, EquipmentSlotType.FEET, baseProperties().stacksTo(1), "peacock", defaultPeacockBootsEnchantments(), -0.1D)
    );
    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register(
            "emerald_chestplate",
            () -> new OreSpawnArmorItem(OreSpawnArmorMaterials.EMERALD, EquipmentSlotType.CHEST, baseProperties().stacksTo(1), "emerald", noEnchantments(), 0.0D)
    );
    public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register(
            "emerald_leggings",
            () -> new OreSpawnArmorItem(OreSpawnArmorMaterials.EMERALD, EquipmentSlotType.LEGS, baseProperties().stacksTo(1), "emerald", noEnchantments(), 0.0D)
    );
    public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register(
            "emerald_boots",
            () -> new OreSpawnArmorItem(OreSpawnArmorMaterials.EMERALD, EquipmentSlotType.FEET, baseProperties().stacksTo(1), "emerald", noEnchantments(), 0.0D)
    );
    public static final RegistryObject<Item> CRYSTAL_PINK_HELMET = ITEMS.register(
            "crystal_pink_helmet",
            () -> new OreSpawnArmorItem(OreSpawnArmorMaterials.CRYSTAL_PINK, EquipmentSlotType.HEAD, baseProperties().stacksTo(1), "pink", noEnchantments(), 0.0D)
    );
    public static final RegistryObject<Item> CRYSTAL_PINK_CHESTPLATE = ITEMS.register(
            "crystal_pink_chestplate",
            () -> new OreSpawnArmorItem(OreSpawnArmorMaterials.CRYSTAL_PINK, EquipmentSlotType.CHEST, baseProperties().stacksTo(1), "pink", noEnchantments(), 0.0D)
    );
    public static final RegistryObject<Item> CRYSTAL_PINK_LEGGINGS = ITEMS.register(
            "crystal_pink_leggings",
            () -> new OreSpawnArmorItem(OreSpawnArmorMaterials.CRYSTAL_PINK, EquipmentSlotType.LEGS, baseProperties().stacksTo(1), "pink", noEnchantments(), 0.0D)
    );
    public static final RegistryObject<Item> CRYSTAL_PINK_BOOTS = ITEMS.register(
            "crystal_pink_boots",
            () -> new OreSpawnArmorItem(OreSpawnArmorMaterials.CRYSTAL_PINK, EquipmentSlotType.FEET, baseProperties().stacksTo(1), "pink", noEnchantments(), 0.0D)
    );
    public static final RegistryObject<Item> TIGERS_EYE_HELMET = ITEMS.register(
            "tigers_eye_helmet",
            () -> new OreSpawnArmorItem(OreSpawnArmorMaterials.TIGERS_EYE, EquipmentSlotType.HEAD, baseProperties().stacksTo(1), "tigerseye", noEnchantments(), 0.0D)
    );
    public static final RegistryObject<Item> TIGERS_EYE_CHESTPLATE = ITEMS.register(
            "tigers_eye_chestplate",
            () -> new OreSpawnArmorItem(OreSpawnArmorMaterials.TIGERS_EYE, EquipmentSlotType.CHEST, baseProperties().stacksTo(1), "tigerseye", noEnchantments(), 0.0D)
    );
    public static final RegistryObject<Item> TIGERS_EYE_LEGGINGS = ITEMS.register(
            "tigers_eye_leggings",
            () -> new OreSpawnArmorItem(OreSpawnArmorMaterials.TIGERS_EYE, EquipmentSlotType.LEGS, baseProperties().stacksTo(1), "tigerseye", noEnchantments(), 0.0D)
    );
    public static final RegistryObject<Item> TIGERS_EYE_BOOTS = ITEMS.register(
            "tigers_eye_boots",
            () -> new OreSpawnArmorItem(OreSpawnArmorMaterials.TIGERS_EYE, EquipmentSlotType.FEET, baseProperties().stacksTo(1), "tigerseye", noEnchantments(), 0.0D)
    );
    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register(
            "ruby_helmet",
            () -> new OreSpawnArmorItem(
                    OreSpawnArmorMaterials.RUBY,
                    EquipmentSlotType.HEAD,
                    baseProperties().stacksTo(1),
                    "ruby",
                    noEnchantments(),
                    0.0D
            )
    );
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register(
            "ruby_chestplate",
            () -> new OreSpawnArmorItem(
                    OreSpawnArmorMaterials.RUBY,
                    EquipmentSlotType.CHEST,
                    baseProperties().stacksTo(1),
                    "ruby",
                    noEnchantments(),
                    0.0D
            )
    );
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register(
            "ruby_leggings",
            () -> new OreSpawnArmorItem(
                    OreSpawnArmorMaterials.RUBY,
                    EquipmentSlotType.LEGS,
                    baseProperties().stacksTo(1),
                    "ruby",
                    noEnchantments(),
                    0.0D
            )
    );
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register(
            "ruby_boots",
            () -> new OreSpawnArmorItem(
                    OreSpawnArmorMaterials.RUBY,
                    EquipmentSlotType.FEET,
                    baseProperties().stacksTo(1),
                    "ruby",
                    noEnchantments(),
                    0.0D
            )
    );
    public static final RegistryObject<Item> AMETHYST_HELMET = ITEMS.register(
            "amethyst_helmet",
            () -> new OreSpawnArmorItem(
                    OreSpawnArmorMaterials.AMETHYST,
                    EquipmentSlotType.HEAD,
                    baseProperties().stacksTo(1),
                    "amethyst",
                    noEnchantments(),
                    0.0D
            )
    );
    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register(
            "amethyst_chestplate",
            () -> new OreSpawnArmorItem(
                    OreSpawnArmorMaterials.AMETHYST,
                    EquipmentSlotType.CHEST,
                    baseProperties().stacksTo(1),
                    "amethyst",
                    noEnchantments(),
                    0.0D
            )
    );
    public static final RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register(
            "amethyst_leggings",
            () -> new OreSpawnArmorItem(
                    OreSpawnArmorMaterials.AMETHYST,
                    EquipmentSlotType.LEGS,
                    baseProperties().stacksTo(1),
                    "amethyst",
                    noEnchantments(),
                    0.0D
            )
    );
    public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register(
            "amethyst_boots",
            () -> new OreSpawnArmorItem(
                    OreSpawnArmorMaterials.AMETHYST,
                    EquipmentSlotType.FEET,
                    baseProperties().stacksTo(1),
                    "amethyst",
                    noEnchantments(),
                    0.0D
            )
    );
    public static final RegistryObject<Item> ROYAL_GUARDIAN_HELMET = ITEMS.register(
            "royal_guardian_helmet",
            () -> new OreSpawnArmorItem(
                    OreSpawnArmorMaterials.ROYAL,
                    EquipmentSlotType.HEAD,
                    baseProperties().stacksTo(1),
                    "royal",
                    defaultRoyalHelmetEnchantments(),
                    0.0D
            )
    );
    public static final RegistryObject<Item> ROYAL_GUARDIAN_CHESTPLATE = ITEMS.register(
            "royal_guardian_chestplate",
            () -> new OreSpawnArmorItem(
                    OreSpawnArmorMaterials.ROYAL,
                    EquipmentSlotType.CHEST,
                    baseProperties().stacksTo(1),
                    "royal",
                    defaultRoyalArmorEnchantments(),
                    0.0D
            )
    );
    public static final RegistryObject<Item> ROYAL_GUARDIAN_LEGGINGS = ITEMS.register(
            "royal_guardian_leggings",
            () -> new OreSpawnArmorItem(
                    OreSpawnArmorMaterials.ROYAL,
                    EquipmentSlotType.LEGS,
                    baseProperties().stacksTo(1),
                    "royal",
                    defaultRoyalArmorEnchantments(),
                    0.0D
            )
    );
    public static final RegistryObject<Item> ROYAL_GUARDIAN_BOOTS = ITEMS.register(
            "royal_guardian_boots",
            () -> new OreSpawnArmorItem(
                    OreSpawnArmorMaterials.ROYAL,
                    EquipmentSlotType.FEET,
                    baseProperties().stacksTo(1),
                    "royal",
                    defaultRoyalBootsEnchantments(),
                    -0.1D
            )
    );
    public static final RegistryObject<Item> QUEEN_SCALE_HELMET = ITEMS.register(
            "queen_scale_helmet",
            () -> new OreSpawnArmorItem(
                    OreSpawnArmorMaterials.QUEEN,
                    EquipmentSlotType.HEAD,
                    baseProperties().stacksTo(1),
                    "queen",
                    noEnchantments(),
                    0.0D
            )
    );
    public static final RegistryObject<Item> QUEEN_SCALE_CHESTPLATE = ITEMS.register(
            "queen_scale_chestplate",
            () -> new OreSpawnArmorItem(
                    OreSpawnArmorMaterials.QUEEN,
                    EquipmentSlotType.CHEST,
                    baseProperties().stacksTo(1),
                    "queen",
                    noEnchantments(),
                    0.0D
            )
    );
    public static final RegistryObject<Item> QUEEN_SCALE_LEGGINGS = ITEMS.register(
            "queen_scale_leggings",
            () -> new OreSpawnArmorItem(
                    OreSpawnArmorMaterials.QUEEN,
                    EquipmentSlotType.LEGS,
                    baseProperties().stacksTo(1),
                    "queen",
                    noEnchantments(),
                    0.0D
            )
    );
    public static final RegistryObject<Item> QUEEN_SCALE_BOOTS = ITEMS.register(
            "queen_scale_boots",
            () -> new OreSpawnArmorItem(
                    OreSpawnArmorMaterials.QUEEN,
                    EquipmentSlotType.FEET,
                    baseProperties().stacksTo(1),
                    "queen",
                    noEnchantments(),
                    -0.25D
            )
    );
    public static final RegistryObject<Item> ULTIMATE_HELMET = ITEMS.register(
            "ultimate_helmet",
            () -> new OreSpawnArmorItem(
                    OreSpawnArmorMaterials.ULTIMATE,
                    EquipmentSlotType.HEAD,
                    baseProperties().stacksTo(1),
                    "ultimate",
                    defaultUltimateHelmetEnchantments(),
                    0.0D
            )
    );
    public static final RegistryObject<Item> ULTIMATE_CHESTPLATE = ITEMS.register(
            "ultimate_chestplate",
            () -> new OreSpawnArmorItem(
                    OreSpawnArmorMaterials.ULTIMATE,
                    EquipmentSlotType.CHEST,
                    baseProperties().stacksTo(1),
                    "ultimate",
                    defaultUltimateArmorEnchantments(),
                    0.0D
            )
    );
    public static final RegistryObject<Item> ULTIMATE_LEGGINGS = ITEMS.register(
            "ultimate_leggings",
            () -> new OreSpawnArmorItem(
                    OreSpawnArmorMaterials.ULTIMATE,
                    EquipmentSlotType.LEGS,
                    baseProperties().stacksTo(1),
                    "ultimate",
                    defaultUltimateArmorEnchantments(),
                    0.0D
            )
    );
    public static final RegistryObject<Item> ULTIMATE_BOOTS = ITEMS.register(
            "ultimate_boots",
            () -> new OreSpawnArmorItem(
                    OreSpawnArmorMaterials.ULTIMATE,
                    EquipmentSlotType.FEET,
                    baseProperties().stacksTo(1),
                    "ultimate",
                    defaultUltimateBootsEnchantments(),
                    0.0D
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
        return 108;
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> noEnchantments() {
        return new LinkedHashMap<>();
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultUltimateBowEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = new LinkedHashMap<>();
        enchantments.put(Enchantments.POWER_ARROWS, 5);
        enchantments.put(Enchantments.PUNCH_ARROWS, 3);
        enchantments.put(Enchantments.FLAMING_ARROWS, 2);
        enchantments.put(Enchantments.INFINITY_ARROWS, 1);
        return enchantments;
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultUltimateFishingRodEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = new LinkedHashMap<>();
        enchantments.put(Enchantments.UNBREAKING, 2);
        return enchantments;
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultEmeraldPickaxeEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = new LinkedHashMap<>();
        enchantments.put(Enchantments.SILK_TOUCH, 1);
        return enchantments;
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultNightmareSwordEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = new LinkedHashMap<>();
        enchantments.put(Enchantments.SMITE, 1);
        enchantments.put(Enchantments.SHARPNESS, 3);
        enchantments.put(Enchantments.KNOCKBACK, 1);
        return enchantments;
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultExperienceSwordEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = new LinkedHashMap<>();
        enchantments.put(Enchantments.SMITE, 2);
        enchantments.put(Enchantments.UNBREAKING, 3);
        return enchantments;
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultBerthaEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = new LinkedHashMap<>();
        enchantments.put(Enchantments.SHARPNESS, 5);
        enchantments.put(Enchantments.FIRE_ASPECT, 1);
        enchantments.put(Enchantments.KNOCKBACK, 1);
        return enchantments;
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultRoyalGuardianSwordEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = new LinkedHashMap<>();
        enchantments.put(Enchantments.UNBREAKING, 5);
        return enchantments;
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultUltimateSwordEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = new LinkedHashMap<>();
        enchantments.put(Enchantments.SMITE, 5);
        enchantments.put(Enchantments.BANE_OF_ARTHROPODS, 5);
        enchantments.put(Enchantments.FIRE_ASPECT, 5);
        enchantments.put(Enchantments.SHARPNESS, 3);
        enchantments.put(Enchantments.MOB_LOOTING, 3);
        enchantments.put(Enchantments.UNBREAKING, 3);
        enchantments.put(Enchantments.KNOCKBACK, 2);
        return enchantments;
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultUltimatePickaxeEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = new LinkedHashMap<>();
        enchantments.put(Enchantments.BLOCK_EFFICIENCY, 5);
        enchantments.put(Enchantments.BLOCK_FORTUNE, 5);
        return enchantments;
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultUltimateArmorEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = new LinkedHashMap<>();
        enchantments.put(Enchantments.ALL_DAMAGE_PROTECTION, 5);
        enchantments.put(Enchantments.FIRE_PROTECTION, 5);
        enchantments.put(Enchantments.BLAST_PROTECTION, 5);
        enchantments.put(Enchantments.PROJECTILE_PROTECTION, 5);
        return enchantments;
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultExperienceArmorEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = new LinkedHashMap<>();
        enchantments.put(Enchantments.ALL_DAMAGE_PROTECTION, 2);
        enchantments.put(Enchantments.BLAST_PROTECTION, 1);
        return enchantments;
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultExperienceHelmetEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = defaultExperienceArmorEnchantments();
        return enchantments;
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultExperienceBootsEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = defaultExperienceArmorEnchantments();
        enchantments.put(Enchantments.FALL_PROTECTION, 1);
        return enchantments;
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultMothScaleArmorEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = new LinkedHashMap<>();
        enchantments.put(Enchantments.ALL_DAMAGE_PROTECTION, 3);
        enchantments.put(Enchantments.FIRE_PROTECTION, 3);
        enchantments.put(Enchantments.BLAST_PROTECTION, 3);
        return enchantments;
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultMothScaleHelmetEnchantments() {
        return defaultMothScaleArmorEnchantments();
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultMothScaleBootsEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = defaultMothScaleArmorEnchantments();
        enchantments.put(Enchantments.FALL_PROTECTION, 5);
        return enchantments;
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultLavaEelArmorEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = new LinkedHashMap<>();
        enchantments.put(Enchantments.ALL_DAMAGE_PROTECTION, 3);
        enchantments.put(Enchantments.FIRE_PROTECTION, 2);
        enchantments.put(Enchantments.BLAST_PROTECTION, 10);
        return enchantments;
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultLavaEelHelmetEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = defaultLavaEelArmorEnchantments();
        enchantments.put(Enchantments.RESPIRATION, 1);
        enchantments.put(Enchantments.AQUA_AFFINITY, 2);
        return enchantments;
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultLavaEelBootsEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = defaultLavaEelArmorEnchantments();
        enchantments.put(Enchantments.FALL_PROTECTION, 2);
        return enchantments;
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultPeacockBootsEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = new LinkedHashMap<>();
        enchantments.put(Enchantments.FALL_PROTECTION, 10);
        return enchantments;
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultUltimateHelmetEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = defaultUltimateArmorEnchantments();
        enchantments.put(Enchantments.RESPIRATION, 2);
        enchantments.put(Enchantments.AQUA_AFFINITY, 3);
        return enchantments;
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultUltimateBootsEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = defaultUltimateArmorEnchantments();
        enchantments.put(Enchantments.FALL_PROTECTION, 3);
        return enchantments;
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultRoyalArmorEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = new LinkedHashMap<>();
        enchantments.put(Enchantments.ALL_DAMAGE_PROTECTION, 10);
        enchantments.put(Enchantments.FIRE_PROTECTION, 10);
        enchantments.put(Enchantments.BLAST_PROTECTION, 10);
        enchantments.put(Enchantments.PROJECTILE_PROTECTION, 10);
        enchantments.put(Enchantments.UNBREAKING, 5);
        return enchantments;
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultRoyalHelmetEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = defaultRoyalArmorEnchantments();
        enchantments.put(Enchantments.RESPIRATION, 1);
        enchantments.put(Enchantments.AQUA_AFFINITY, 2);
        return enchantments;
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultRoyalBootsEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = defaultRoyalArmorEnchantments();
        enchantments.put(Enchantments.FALL_PROTECTION, 10);
        return enchantments;
    }
}
