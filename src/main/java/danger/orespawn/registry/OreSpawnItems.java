package danger.orespawn.registry;

import danger.orespawn.OreSpawn;
import danger.orespawn.item.AutoEnchantedAxeItem;
import danger.orespawn.item.AutoEnchantedBowItem;
import danger.orespawn.item.AutoEnchantedFishingRodItem;
import danger.orespawn.item.AutoEnchantedPickaxeItem;
import danger.orespawn.item.AutoEnchantedSwordItem;
import danger.orespawn.item.BigHammerItem;
import danger.orespawn.item.CreeperLauncherItem;
import danger.orespawn.item.CritterCageItem;
import danger.orespawn.item.ChainsawItem;
import danger.orespawn.item.ExperienceCatcherItem;
import danger.orespawn.item.ExperienceSwordItem;
import danger.orespawn.item.ExactAttributeHoeItem;
import danger.orespawn.item.ExactAttributeShovelItem;
import danger.orespawn.item.FairySwordItem;
import danger.orespawn.item.InstantGardenItem;
import danger.orespawn.item.InstantShelterItem;
import danger.orespawn.item.MagicAppleItem;
import danger.orespawn.item.MantisClawItem;
import danger.orespawn.item.MinersDreamItem;
import danger.orespawn.item.NetherLostItem;
import danger.orespawn.item.OreSpawnItemGroup;
import danger.orespawn.item.OreSpawnArmorItem;
import danger.orespawn.item.OrchardTreeSeedItem;
import danger.orespawn.item.PoisonSwordItem;
import danger.orespawn.item.RandomDungeonItem;
import danger.orespawn.item.RatSwordItem;
import danger.orespawn.item.RayGunItem;
import danger.orespawn.item.RockFishItem;
import danger.orespawn.item.SifterItem;
import danger.orespawn.item.SimpleTreeSeedItem;
import danger.orespawn.item.SquidZookaItem;
import danger.orespawn.item.ThunderStaffItem;
import danger.orespawn.item.ThrownAmmoItem;
import danger.orespawn.item.WrenchItem;
import java.util.LinkedHashMap;
import java.util.Map;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.block.Blocks;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.item.BlockNamedItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
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
    public static final RegistryObject<Item> GREEN_GOO = register("greengoo");
    public static final RegistryObject<Item> KRAKEN_TOOTH = register("krakentooth");
    public static final RegistryObject<Item> SEA_MONSTER_SCALE = register("seamonsterscale");
    public static final RegistryObject<Item> WORM_TOOTH = register("wormtooth");
    public static final RegistryObject<Item> TREX_TOOTH = register("trextooth");
    public static final RegistryObject<Item> CATERKILLER_JAW = register("caterkillerjaw");
    public static final RegistryObject<Item> SEA_VIPER_TONGUE = register("seavipertongue");
    public static final RegistryObject<Item> VORTEX_EYE = register("vortexeye");
    public static final RegistryObject<Item> CRYSTAL_STICKS = register("crystalsticks");
    public static final RegistryObject<Item> SPIDER_ROBOT_KIT = register("spiderrobotkit");
    public static final RegistryObject<Item> ANT_ROBOT_KIT = register("antrobotkit");
    public static final RegistryObject<Item> SPARK_FISH = ITEMS.register(
            "sparkfish",
            () -> new Item(foodProperties(effectFoodValues(
                    1,
                    0.2F,
                    false,
                    false,
                    new EffectInstance(Effects.NIGHT_VISION, 100, 0)
            )))
    );
    public static final RegistryObject<Item> SUNSPOT_URCHIN = ITEMS.register(
            "sunspoturchin",
            () -> new ThrownAmmoItem(baseProperties().stacksTo(64), 1.1F, 0.85F, 0.9F, 0.6F)
    );
    public static final RegistryObject<Item> WATER_BALL = ITEMS.register(
            "waterball",
            () -> new ThrownAmmoItem(baseProperties().stacksTo(64), 1.25F, 0.75F, 0.6F, 0.5F)
    );
    public static final RegistryObject<Item> LASER_BALL = ITEMS.register(
            "laserball",
            () -> new ThrownAmmoItem(baseProperties().stacksTo(64), 1.75F, 0.2F, 1.2F, 0.9F)
    );
    public static final RegistryObject<Item> ICE_BALL = ITEMS.register(
            "iceball",
            () -> new ThrownAmmoItem(baseProperties().stacksTo(64), 1.15F, 0.65F, 0.8F, 0.6F)
    );
    public static final RegistryObject<Item> SMALL_ROCK = ITEMS.register(
            "rocksmall",
            () -> new ThrownAmmoItem(baseProperties().stacksTo(64), 1.0F, 1.0F, 0.7F, 0.5F)
    );
    public static final RegistryObject<Item> ROCK = ITEMS.register(
            "rock",
            () -> new ThrownAmmoItem(baseProperties().stacksTo(64), 1.1F, 0.85F, 0.65F, 0.55F)
    );
    public static final RegistryObject<Item> RED_ROCK = ITEMS.register(
            "rockred",
            () -> new ThrownAmmoItem(baseProperties().stacksTo(64), 1.2F, 0.75F, 0.8F, 0.6F)
    );
    public static final RegistryObject<Item> CRYSTAL_RED_ROCK = ITEMS.register(
            "rockcrystalred",
            () -> new ThrownAmmoItem(baseProperties().stacksTo(64), 1.25F, 0.6F, 0.95F, 0.65F)
    );
    public static final RegistryObject<Item> CRYSTAL_GREEN_ROCK = ITEMS.register(
            "rockcrystalgreen",
            () -> new ThrownAmmoItem(baseProperties().stacksTo(64), 1.25F, 0.6F, 0.95F, 0.65F)
    );
    public static final RegistryObject<Item> CRYSTAL_BLUE_ROCK = ITEMS.register(
            "rockcrystalblue",
            () -> new ThrownAmmoItem(baseProperties().stacksTo(64), 1.25F, 0.6F, 0.95F, 0.65F)
    );
    public static final RegistryObject<Item> CRYSTAL_TNT_ROCK = ITEMS.register(
            "rockcrystaltnt",
            () -> new ThrownAmmoItem(baseProperties().stacksTo(64), 1.3F, 0.55F, 1.0F, 0.7F)
    );
    public static final RegistryObject<Item> GREEN_ROCK = ITEMS.register(
            "rockgreen",
            () -> new ThrownAmmoItem(baseProperties().stacksTo(64), 1.15F, 0.75F, 0.85F, 0.6F)
    );
    public static final RegistryObject<Item> BLUE_ROCK = ITEMS.register(
            "rockblue",
            () -> new ThrownAmmoItem(baseProperties().stacksTo(64), 1.15F, 0.75F, 0.85F, 0.6F)
    );
    public static final RegistryObject<Item> PURPLE_ROCK = ITEMS.register(
            "rockpurple",
            () -> new ThrownAmmoItem(baseProperties().stacksTo(64), 1.15F, 0.75F, 0.9F, 0.6F)
    );
    public static final RegistryObject<Item> SPIKEY_ROCK = ITEMS.register(
            "rockspikey",
            () -> new ThrownAmmoItem(baseProperties().stacksTo(64), 1.2F, 0.7F, 0.8F, 0.65F)
    );
    public static final RegistryObject<Item> TNT_ROCK = ITEMS.register(
            "rocktnt",
            () -> new ThrownAmmoItem(baseProperties().stacksTo(64), 1.2F, 0.7F, 0.8F, 0.65F)
    );
    public static final RegistryObject<Item> ZOOKEEPER = register("zookeeper");
    public static final RegistryObject<Item> ZOO_2 = register("zoo2");
    public static final RegistryObject<Item> ZOO_4 = register("zoo4");
    public static final RegistryObject<Item> ZOO_6 = register("zoo6");
    public static final RegistryObject<Item> ZOO_8 = register("zoo8");
    public static final RegistryObject<Item> ZOO_10 = register("zoo10");
    public static final RegistryObject<Item> CAGE_EMPTY = ITEMS.register(
            "cageempty",
            () -> new CritterCageItem(baseProperties().stacksTo(16), null, null)
    );
    public static final RegistryObject<Item> CAGE_COW = registerCage("cagecow", net.minecraft.entity.EntityType.COW);
    public static final RegistryObject<Item> CAGE_PIG = registerCage("cagepig", net.minecraft.entity.EntityType.PIG);
    public static final RegistryObject<Item> CAGE_CHICKEN = registerCage("cagechicken", net.minecraft.entity.EntityType.CHICKEN);
    public static final RegistryObject<Item> CAGE_SHEEP = registerCage("cagesheep", net.minecraft.entity.EntityType.SHEEP);
    public static final RegistryObject<Item> CAGE_WOLF = registerCage("cagewolf", net.minecraft.entity.EntityType.WOLF);
    public static final RegistryObject<Item> CAGE_OCELOT = registerCage("cageocelot", net.minecraft.entity.EntityType.OCELOT);
    public static final RegistryObject<Item> CAGE_HORSE = registerCage("cagehorse", net.minecraft.entity.EntityType.HORSE);
    public static final RegistryObject<Item> CAGE_VILLAGER = registerCage("cagevillager", net.minecraft.entity.EntityType.VILLAGER);
    public static final RegistryObject<Item> CAGE_CREEPER = registerCage("cagecreeper", net.minecraft.entity.EntityType.CREEPER);
    public static final RegistryObject<Item> CAGE_ZOMBIE = registerCage("cagezombie", net.minecraft.entity.EntityType.ZOMBIE);
    public static final RegistryObject<Item> CAGE_SKELETON = registerCage("cageskeleton", net.minecraft.entity.EntityType.SKELETON);
    public static final RegistryObject<Item> CAGE_SPIDER = registerCage("cagespider", net.minecraft.entity.EntityType.SPIDER);
    public static final RegistryObject<Item> CAGE_BAT = registerCage("cagebat", net.minecraft.entity.EntityType.BAT);
    public static final RegistryObject<Item> CAGE_SQUID = registerCage("cagesquid", net.minecraft.entity.EntityType.SQUID);
    public static final RegistryObject<Item> CAGE_SLIME = registerCage("cageslime", net.minecraft.entity.EntityType.SLIME);
    public static final RegistryObject<Item> CAGE_GHAST = registerCage("cageghast", net.minecraft.entity.EntityType.GHAST);
    public static final RegistryObject<Item> CAGE_ENDERMAN = registerCage("cageenderman", net.minecraft.entity.EntityType.ENDERMAN);
    public static final RegistryObject<Item> CAGE_CAVE_SPIDER = registerCage("cagecavespider", net.minecraft.entity.EntityType.CAVE_SPIDER);
    public static final RegistryObject<Item> CAGE_SILVERFISH = registerCage("cagesilverfish", net.minecraft.entity.EntityType.SILVERFISH);
    public static final RegistryObject<Item> CAGE_MAGMA_CUBE = registerCage("cagemagmacube", net.minecraft.entity.EntityType.MAGMA_CUBE);
    public static final RegistryObject<Item> CAGE_WITCH = registerCage("cagewitch", net.minecraft.entity.EntityType.WITCH);
    public static final RegistryObject<Item> CAGE_BLAZE = registerCage("cageblaze", net.minecraft.entity.EntityType.BLAZE);
    public static final RegistryObject<Item> CAGE_MOOSHROOM = registerCage("cagemooshroom", net.minecraft.entity.EntityType.MOOSHROOM);
    public static final RegistryObject<Item> CAGE_WITHER_SKELETON = registerCage("cagewitherskeleton", net.minecraft.entity.EntityType.WITHER_SKELETON);
    public static final RegistryObject<Item> CAGE_SNOW_GOLEM = registerCage("cagesnowgolem", net.minecraft.entity.EntityType.SNOW_GOLEM);
    public static final RegistryObject<Item> CAGE_IRON_GOLEM = registerCage("cageirongolem", net.minecraft.entity.EntityType.IRON_GOLEM);
    public static final RegistryObject<Item> CAGE_PEACOCK = ITEMS.register(
            "cagepeacock",
            () -> new CritterCageItem(baseProperties().stacksTo(1), OreSpawnEntityTypes.PEACOCK::get, () -> CAGE_EMPTY.get())
    );
    public static final RegistryObject<Item> CAGE_FAIRY = ITEMS.register(
            "cagefairy",
            () -> new CritterCageItem(baseProperties().stacksTo(1), OreSpawnEntityTypes.FAIRY::get, () -> CAGE_EMPTY.get())
    );
    public static final RegistryObject<Item> CAGE_RAT = ITEMS.register(
            "cagerat",
            () -> new CritterCageItem(baseProperties().stacksTo(1), OreSpawnEntityTypes.RAT::get, () -> CAGE_EMPTY.get())
    );
    public static final RegistryObject<Item> CAGE_FIREFLY = ITEMS.register(
            "cagefirefly",
            () -> new CritterCageItem(baseProperties().stacksTo(1), OreSpawnEntityTypes.FIREFLY::get, () -> CAGE_EMPTY.get())
    );
    public static final RegistryObject<Item> CAGE_GAZELLE = ITEMS.register(
            "cagegazelle",
            () -> new CritterCageItem(baseProperties().stacksTo(1), OreSpawnEntityTypes.GAZELLE::get, () -> CAGE_EMPTY.get())
    );
    public static final RegistryObject<Item> CAGE_STINK = ITEMS.register(
            "cagestink",
            () -> new CritterCageItem(baseProperties().stacksTo(1), OreSpawnEntityTypes.STINK_BUG::get, () -> CAGE_EMPTY.get())
    );
    public static final RegistryObject<Item> CAGE_MANTIS = ITEMS.register(
            "cagemantis",
            () -> new CritterCageItem(baseProperties().stacksTo(1), OreSpawnEntityTypes.MANTIS::get, () -> CAGE_EMPTY.get())
    );
    public static final RegistryObject<Item> CAGE_STINKY = ITEMS.register(
            "cagestinky",
            () -> new CritterCageItem(baseProperties().stacksTo(1), OreSpawnEntityTypes.STINKY::get, () -> CAGE_EMPTY.get())
    );
    public static final RegistryObject<Item> CAGE_CRAB = registerCage("cagecrab", net.minecraft.entity.EntityType.TURTLE);
    public static final RegistryObject<Item> CAGE_CLOUD_SHARK = registerCage("cagecloudshark", net.minecraft.entity.EntityType.PHANTOM);
    public static final RegistryObject<Item> CAGE_MOTHRA = registerCage("cagemothra", net.minecraft.entity.EntityType.PHANTOM);
    public static final RegistryObject<Item> APPLETREE_SEED = ITEMS.register(
            "appletree_seed",
            () -> new OrchardTreeSeedItem(baseProperties().stacksTo(16), OreSpawnBlocks.APPLE_LEAVES.get(), 12, 6, 5, 6, 14, 6)
    );
    public static final RegistryObject<Item> FIREFLY_SEED = ITEMS.register(
            "firefly_seed",
            () -> new BlockNamedItem(OreSpawnBlocks.FIREFLY_PLANT.get(), baseProperties())
    );
    public static final RegistryObject<Item> BUTTERFLY_SEED = ITEMS.register(
            "butterfly_seed",
            () -> new BlockNamedItem(OreSpawnBlocks.BUTTERFLY_PLANT.get(), baseProperties())
    );
    public static final RegistryObject<Item> MOTH_SEED = ITEMS.register(
            "moth_seed",
            () -> new BlockNamedItem(OreSpawnBlocks.MOTH_PLANT.get(), baseProperties())
    );
    public static final RegistryObject<Item> EXPERIENCE_TREE_SEED = ITEMS.register(
            "experience_tree_seed",
            () -> new SimpleTreeSeedItem(baseProperties().stacksTo(1), Blocks.BIRCH_SAPLING, true)
    );
    public static final RegistryObject<Item> EXPERIENCE_CATCHER = ITEMS.register(
            "experience_catcher",
            () -> new ExperienceCatcherItem(baseProperties().stacksTo(16))
    );
    public static final RegistryObject<Item> NETHER_LOST = ITEMS.register(
            "netherlost",
            () -> new NetherLostItem(baseProperties().stacksTo(1).durability(3000))
    );
    public static final RegistryObject<Item> SIFTER = ITEMS.register(
            "sifter",
            () -> new SifterItem(baseProperties().stacksTo(1).durability(600))
    );
    public static final RegistryObject<Item> MINERS_DREAM = ITEMS.register(
            "minersdream",
            () -> new MinersDreamItem(baseProperties().stacksTo(16))
    );
    public static final RegistryObject<Item> INSTANT_SHELTER = ITEMS.register(
            "instantshelter",
            () -> new InstantShelterItem(baseProperties().stacksTo(16))
    );
    public static final RegistryObject<Item> INSTANT_GARDEN = ITEMS.register(
            "instantgarden",
            () -> new InstantGardenItem(baseProperties().stacksTo(16))
    );
    public static final RegistryObject<Item> RANDOM_DUNGEON = ITEMS.register(
            "randomdungeon",
            () -> new RandomDungeonItem(baseProperties().stacksTo(1))
    );
    public static final RegistryObject<Item> EGG_GAZELLE = ITEMS.register(
            "egggazelle",
            () -> new ForgeSpawnEggItem(OreSpawnEntityTypes.GAZELLE, 0xC49A6C, 0xF2E4C8, baseProperties())
    );
    public static final RegistryObject<Item> EGG_STINK = ITEMS.register(
            "eggstink",
            () -> new ForgeSpawnEggItem(OreSpawnEntityTypes.STINK_BUG, 0x6B4A1B, 0xD8C15A, baseProperties())
    );
    public static final RegistryObject<Item> EGG_MANTIS = ITEMS.register(
            "eggmantis",
            () -> new ForgeSpawnEggItem(OreSpawnEntityTypes.MANTIS, 0x4C8A34, 0xA4D95B, baseProperties())
    );
    public static final RegistryObject<Item> EGG_STINKY = ITEMS.register(
            "eggstinky",
            () -> new ForgeSpawnEggItem(OreSpawnEntityTypes.STINKY, 0xBB8A72, 0x6B7A4D, baseProperties())
    );
    public static final RegistryObject<Item> EGG_BUTTERFLY = ITEMS.register(
            "eggbutterfly",
            () -> new ForgeSpawnEggItem(OreSpawnEntityTypes.BUTTERFLY, 0xE0A0FF, 0xFFF06A, baseProperties())
    );
    public static final RegistryObject<Item> EGG_TERMITE = ITEMS.register(
            "eggtermite",
            () -> new ForgeSpawnEggItem(OreSpawnEntityTypes.TERMITE, 0xB58A5A, 0xE6D2B0, baseProperties())
    );
    public static final RegistryObject<Item> EGG_CLOUD_SHARK = ITEMS.register(
            "eggcloudshark",
            () -> new SpawnEggItem(net.minecraft.entity.EntityType.PHANTOM, 0xDCEBFF, 0x6D87B7, baseProperties())
    );
    public static final RegistryObject<Item> EGG_ROBOT_1 = ITEMS.register(
            "eggrobot1",
            () -> new SpawnEggItem(net.minecraft.entity.EntityType.CREEPER, 0x707070, 0xD4A73A, baseProperties())
    );
    public static final RegistryObject<Item> EGG_ROBOT_2 = ITEMS.register(
            "eggrobot2",
            () -> new SpawnEggItem(net.minecraft.entity.EntityType.IRON_GOLEM, 0x8A7F74, 0xC0A040, baseProperties())
    );
    public static final RegistryObject<Item> EGG_ROBOT_3 = ITEMS.register(
            "eggrobot3",
            () -> new SpawnEggItem(net.minecraft.entity.EntityType.PILLAGER, 0x6F7682, 0xA11D1D, baseProperties())
    );
    public static final RegistryObject<Item> EGG_ROBOT_4 = ITEMS.register(
            "eggrobot4",
            () -> new SpawnEggItem(net.minecraft.entity.EntityType.VINDICATOR, 0x646A78, 0xD7D7D7, baseProperties())
    );
    public static final RegistryObject<Item> EGG_RED_ANT = ITEMS.register(
            "eggredant",
            () -> new ForgeSpawnEggItem(OreSpawnEntityTypes.RED_ANT, 0xB02A2A, 0x3A120F, baseProperties())
    );
    public static final RegistryObject<Item> EGG_BROWN_ANT = ITEMS.register(
            "eggbrownant",
            () -> new ForgeSpawnEggItem(OreSpawnEntityTypes.BROWN_ANT, 0x6E4A2E, 0xC2A377, baseProperties())
    );
    public static final RegistryObject<Item> EGG_RAINBOW_ANT = ITEMS.register(
            "eggrainbowant",
            () -> new ForgeSpawnEggItem(OreSpawnEntityTypes.RAINBOW_ANT, 0xE85DFF, 0x62D7FF, baseProperties())
    );
    public static final RegistryObject<Item> EGG_UNSTABLE_ANT = ITEMS.register(
            "eggunstableant",
            () -> new ForgeSpawnEggItem(OreSpawnEntityTypes.UNSTABLE_ANT, 0xB8FF3A, 0x5B2CFF, baseProperties())
    );
    public static final RegistryObject<Item> EGG_ROBOT_5 = ITEMS.register(
            "eggrobot5",
            () -> new SpawnEggItem(net.minecraft.entity.EntityType.SKELETON, 0x909090, 0x5E0D0D, baseProperties())
    );
    public static final RegistryObject<Item> EGG_ROBOT_6 = ITEMS.register(
            "eggrobot6",
            () -> new SpawnEggItem(net.minecraft.entity.EntityType.STRAY, 0xA3A7AE, 0x2B4E71, baseProperties())
    );
    public static final RegistryObject<Item> EGG_ANT_ROBOT = ITEMS.register(
            "eggantrobot",
            () -> new SpawnEggItem(net.minecraft.entity.EntityType.ENDERMITE, 0xA31919, 0x8C8C8C, baseProperties())
    );
    public static final RegistryObject<Item> EGG_SPIDER_ROBOT = ITEMS.register(
            "eggspiderrobot",
            () -> new SpawnEggItem(net.minecraft.entity.EntityType.SPIDER, 0x2A2A2A, 0xB00000, baseProperties())
    );
    public static final RegistryObject<Item> EGG_MOTH = ITEMS.register(
            "eggmoth",
            () -> new ForgeSpawnEggItem(OreSpawnEntityTypes.MOTH, 0x7B6A59, 0xC4B08A, baseProperties())
    );
    public static final RegistryObject<Item> EGG_FIREFLY = ITEMS.register(
            "eggfirefly",
            () -> new ForgeSpawnEggItem(OreSpawnEntityTypes.FIREFLY, 0xD7FF72, 0x355B1B, baseProperties())
    );
    public static final RegistryObject<Item> EGG_MOTHRA = ITEMS.register(
            "eggmothra",
            () -> new SpawnEggItem(net.minecraft.entity.EntityType.PHANTOM, 0x5D4A37, 0xC49B4C, baseProperties())
    );
    public static final RegistryObject<Item> CREEPER_LAUNCHER = ITEMS.register(
            "creeperlauncher",
            () -> new CreeperLauncherItem(baseProperties().stacksTo(16))
    );
    public static final RegistryObject<Item> RAY_GUN = ITEMS.register(
            "raygun",
            () -> new RayGunItem(baseProperties().stacksTo(1).durability(50))
    );
    public static final RegistryObject<Item> THUNDER_STAFF = ITEMS.register(
            "thunderstaff",
            () -> new ThunderStaffItem(baseProperties().stacksTo(1).durability(50))
    );
    public static final RegistryObject<Item> WRENCH = ITEMS.register(
            "wrench",
            () -> new WrenchItem(baseProperties().stacksTo(1).durability(100))
    );
    public static final RegistryObject<Item> ACID = ITEMS.register(
            "acid",
            () -> new ThrownAmmoItem(baseProperties().stacksTo(64), 1.15F, 0.6F, 1.0F, 0.7F)
    );
    public static final RegistryObject<Item> DEAD_IRUKANDJI = ITEMS.register(
            "deadirukandji",
            () -> new ThrownAmmoItem(baseProperties().stacksTo(64), 1.05F, 0.75F, 1.0F, 0.7F)
    );
    public static final RegistryObject<Item> IRUKANDJI_ARROW = register("irukandjiarrow");
    public static final RegistryObject<Item> SQUIDZOOKA = ITEMS.register(
            "squidzookasmall",
            () -> new SquidZookaItem(baseProperties().stacksTo(1).durability(100))
    );
    public static final RegistryObject<Item> DEAD_STINK_BUG = register("deadstinkbug");
    public static final RegistryObject<Item> SALT = register("salt");
    public static final RegistryObject<Item> BUTTER = ITEMS.register(
            "butter",
            () -> new Item(foodProperties(foodValues(1, 0.5F, false, false)))
    );
    public static final RegistryObject<Item> POPCORN = ITEMS.register(
            "popcorn",
            () -> new Item(foodProperties(foodValues(1, 0.5F, false, false)))
    );
    public static final RegistryObject<Item> POPCORN_BUTTERED = ITEMS.register(
            "popcorn_buttered",
            () -> new Item(foodProperties(foodValues(2, 0.6F, false, false)))
    );
    public static final RegistryObject<Item> POPCORN_BUTTERED_SALTED = ITEMS.register(
            "popcorn_buttered_salted",
            () -> new Item(foodProperties(foodValues(3, 0.75F, false, false)))
    );
    public static final RegistryObject<Item> POPCORN_BAG = ITEMS.register(
            "popcorn_bag",
            () -> new Item(foodProperties(foodValues(10, 1.25F, false, false)))
    );
    public static final RegistryObject<Item> CORNDOG_RAW = ITEMS.register(
            "corndog_raw",
            () -> new Item(foodProperties(foodValues(4, 0.6F, true, false)))
    );
    public static final RegistryObject<Item> CORNDOG_COOKED = ITEMS.register(
            "corndog_cooked",
            () -> new Item(foodProperties(foodValues(16, 2.5F, true, false)))
    );
    public static final RegistryObject<Item> BUTTER_CANDY = ITEMS.register(
            "butter_candy",
            () -> new Item(foodProperties(effectFoodValues(
                    4,
                    0.5F,
                    false,
                    false,
                    new EffectInstance(Effects.MOVEMENT_SPEED, 2000, 0),
                    new EffectInstance(Effects.JUMP, 2000, 0)
            )))
    );
    public static final RegistryObject<Item> BACON = ITEMS.register(
            "bacon",
            () -> new Item(foodProperties(foodValues(8, 1.0F, true, false)))
    );
    public static final RegistryObject<Item> COOKED_BACON = ITEMS.register(
            "cooked_bacon",
            () -> new Item(foodProperties(effectFoodValues(
                    14,
                    1.5F,
                    true,
                    false,
                    new EffectInstance(Effects.DAMAGE_RESISTANCE, 2000, 0),
                    new EffectInstance(Effects.DAMAGE_BOOST, 2000, 0)
            )))
    );
    public static final RegistryObject<Item> CHEESE = ITEMS.register(
            "cheese",
            () -> new Item(foodProperties(foodValues(4, 0.5F, false, false)))
    );
    public static final RegistryObject<Item> SALAD = ITEMS.register(
            "salad",
            () -> new Item(foodProperties(foodValues(10, 0.95F, false, false)))
    );
    public static final RegistryObject<Item> BLT_SANDWICH = ITEMS.register(
            "blt_sandwich",
            () -> new Item(foodProperties(foodValues(12, 0.95F, true, false)))
    );
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register(
            "strawberry",
            () -> new Item(foodProperties(foodValues(2, 0.65F, false, false)))
    );
    public static final RegistryObject<Item> CHERRIES = ITEMS.register(
            "cherries",
            () -> new Item(foodProperties(foodValues(3, 0.45F, false, false)))
    );
    public static final RegistryObject<Item> PEACH = ITEMS.register(
            "peach",
            () -> new Item(foodProperties(foodValues(4, 0.55F, false, false)))
    );
    public static final RegistryObject<Item> RAW_PEACOCK = ITEMS.register(
            "rawpeacock",
            () -> new Item(foodProperties(foodValues(6, 0.7F, true, false)))
    );
    public static final RegistryObject<Item> COOKED_PEACOCK = ITEMS.register(
            "cookedpeacock",
            () -> new Item(foodProperties(foodValues(12, 1.4F, true, false)))
    );
    public static final RegistryObject<Item> ROCK_FISH = ITEMS.register(
            "rockfish",
            () -> new RockFishItem(foodProperties(foodValues(3, 0.7F, true, false)))
    );
    public static final RegistryObject<Item> RAW_CRAB_MEAT = ITEMS.register(
            "crabmeat",
            () -> new Item(foodProperties(foodValues(4, 0.25F, true, false)))
    );
    public static final RegistryObject<Item> COOKED_CRAB_MEAT = ITEMS.register(
            "cookedcrabmeat",
            () -> new Item(foodProperties(foodValues(6, 0.75F, true, false)))
    );
    public static final RegistryObject<Item> CRABBY_PATTY = ITEMS.register(
            "crabbypatty",
            () -> new Item(foodProperties(foodValues(16, 2.35F, true, false)))
    );
    public static final RegistryObject<Item> CHERRYTREE_SEED = ITEMS.register(
            "cherrytree_seed",
            () -> new OrchardTreeSeedItem(baseProperties().stacksTo(16), OreSpawnBlocks.CHERRY_LEAVES.get(), 8, 3, 3, 3, 10, 5)
    );
    public static final RegistryObject<Item> PEACHTREE_SEED = ITEMS.register(
            "peachtree_seed",
            () -> new OrchardTreeSeedItem(baseProperties().stacksTo(16), OreSpawnBlocks.PEACH_LEAVES.get(), 10, 5, 4, 5, 12, 5)
    );
    public static final RegistryObject<Item> STRAWBERRY_SEED = ITEMS.register(
            "strawberry_seed",
            () -> new BlockNamedItem(OreSpawnBlocks.STRAWBERRY_CROP.get(), baseProperties())
    );
    public static final RegistryObject<Item> CRYSTAL_APPLE = ITEMS.register(
            "crystal_apple",
            () -> new Item(foodProperties(effectFoodValues(
                    5,
                    0.85F,
                    false,
                    false,
                    new EffectInstance(Effects.DAMAGE_RESISTANCE, 3000, 0),
                    new EffectInstance(Effects.DAMAGE_BOOST, 3000, 0)
            )))
    );
    public static final RegistryObject<Item> RADISH = ITEMS.register(
            "radish",
            () -> new BlockNamedItem(OreSpawnBlocks.RADISH_CROP.get(), foodProperties(foodValues(2, 0.45F, false, false)))
    );
    public static final RegistryObject<Item> RICE = ITEMS.register(
            "rice",
            () -> new BlockNamedItem(OreSpawnBlocks.RICE_CROP.get(), foodProperties(foodValues(5, 0.65F, false, false)))
    );
    public static final RegistryObject<Item> CORN = ITEMS.register(
            "corn_seed",
            () -> new BlockNamedItem(OreSpawnBlocks.CORN_CROP.get(), foodProperties(foodValues(6, 0.75F, false, false)))
    );
    public static final RegistryObject<Item> QUINOA = ITEMS.register(
            "quinoa",
            () -> new BlockNamedItem(OreSpawnBlocks.QUINOA_CROP.get(), foodProperties(foodValues(7, 0.85F, false, false)))
    );
    public static final RegistryObject<Item> TOMATO = ITEMS.register(
            "tomato_seed",
            () -> new BlockNamedItem(OreSpawnBlocks.TOMATO_CROP.get(), foodProperties(foodValues(4, 0.55F, false, false)))
    );
    public static final RegistryObject<Item> LETTUCE = ITEMS.register(
            "lettuce_seed",
            () -> new BlockNamedItem(OreSpawnBlocks.LETTUCE_CROP.get(), foodProperties(foodValues(3, 0.45F, false, false)))
    );
    public static final RegistryObject<Item> MAGIC_APPLE = ITEMS.register(
            "magic_apple",
            () -> new MagicAppleItem(baseProperties().stacksTo(1))
    );
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
    public static final RegistryObject<Item> POISON_SWORD = ITEMS.register(
            "poisonsword",
            () -> new PoisonSwordItem(
                    OreSpawnItemTiers.EMERALD,
                    15.0F,
                    -2.4F,
                    baseProperties().stacksTo(1).durability(1300),
                    defaultPoisonSwordEnchantments()
            )
    );
    public static final RegistryObject<Item> RAT_SWORD = ITEMS.register(
            "ratsword",
            () -> new RatSwordItem(
                    OreSpawnItemTiers.EMERALD,
                    15.0F,
                    -2.4F,
                    baseProperties().stacksTo(1).durability(1300),
                    noEnchantments()
            )
    );
    public static final RegistryObject<Item> FAIRY_SWORD = ITEMS.register(
            "fairysword",
            () -> new FairySwordItem(
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
    public static final RegistryObject<Item> MANTIS_CLAW = ITEMS.register(
            "mantisclaw",
            () -> new MantisClawItem(
                    OreSpawnItemTiers.EMERALD,
                    10.0F,
                    -2.2F,
                    baseProperties().stacksTo(1).durability(1000),
                    noEnchantments()
            )
    );
    public static final RegistryObject<Item> BATTLE_AXE = ITEMS.register(
            "battleaxesmall",
            () -> new AutoEnchantedSwordItem(
                    OreSpawnItemTiers.BATTLE,
                    50.0F,
                    -2.8F,
                    baseProperties().stacksTo(1).durability(1500),
                    defaultBattleAxeEnchantments()
            )
    );
    public static final RegistryObject<Item> CHAINSAW = ITEMS.register(
            "chainsawsmall",
            () -> new ChainsawItem(
                    OreSpawnItemTiers.CHAINSAW,
                    60.0F,
                    -2.8F,
                    baseProperties().stacksTo(1).durability(1500),
                    noEnchantments()
            )
    );
    public static final RegistryObject<Item> BIG_HAMMER = ITEMS.register(
            "bighammer",
            () -> new BigHammerItem(
                    OreSpawnItemTiers.AMETHYST,
                    15.0F,
                    -2.8F,
                    baseProperties().stacksTo(1).durability(9000),
                    noEnchantments()
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
        return 236;
    }

    private static RegistryObject<Item> registerCage(String name, net.minecraft.entity.EntityType<?> entityType) {
        return ITEMS.register(name, () -> new CritterCageItem(baseProperties().stacksTo(1), () -> entityType, () -> CAGE_EMPTY.get()));
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> noEnchantments() {
        return new LinkedHashMap<>();
    }

    private static Item.Properties foodProperties(Food food) {
        return baseProperties().food(food);
    }

    private static Food foodValues(int nutrition, float saturation, boolean isMeat, boolean alwaysEat) {
        Food.Builder builder = new Food.Builder().nutrition(nutrition).saturationMod(saturation);
        if (isMeat) {
            builder.meat();
        }
        if (alwaysEat) {
            builder.alwaysEat();
        }
        return builder.build();
    }

    private static Food effectFoodValues(int nutrition, float saturation, boolean isMeat, boolean alwaysEat, EffectInstance... effects) {
        Food.Builder builder = new Food.Builder().nutrition(nutrition).saturationMod(saturation);
        if (isMeat) {
            builder.meat();
        }
        if (alwaysEat) {
            builder.alwaysEat();
        }
        for (EffectInstance effect : effects) {
            builder.effect(() -> new EffectInstance(effect), 1.0F);
        }
        return builder.build();
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

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultBattleAxeEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = new LinkedHashMap<>();
        enchantments.put(Enchantments.MOB_LOOTING, 3);
        enchantments.put(Enchantments.UNBREAKING, 3);
        return enchantments;
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultUltimatePickaxeEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = new LinkedHashMap<>();
        enchantments.put(Enchantments.BLOCK_EFFICIENCY, 5);
        enchantments.put(Enchantments.BLOCK_FORTUNE, 5);
        return enchantments;
    }

    private static Map<net.minecraft.enchantment.Enchantment, Integer> defaultPoisonSwordEnchantments() {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = new LinkedHashMap<>();
        enchantments.put(Enchantments.SHARPNESS, 1);
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
