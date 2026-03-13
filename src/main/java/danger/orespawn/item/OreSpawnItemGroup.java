package danger.orespawn.item;

import danger.orespawn.registry.OreSpawnBlocks;
import danger.orespawn.registry.OreSpawnItems;
import java.util.function.Consumer;
import java.util.function.Supplier;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.RegistryObject;

public class OreSpawnItemGroup extends ItemGroup {
    public static final OreSpawnItemGroup BLOCKS = new OreSpawnItemGroup(
            "orespawn_blocks",
            () -> new ItemStack(OreSpawnBlocks.BLOCK_AMETHYST.get()),
            OreSpawnItemGroup::fillBlocks
    );
    public static final OreSpawnItemGroup ITEMS = new OreSpawnItemGroup(
            "orespawn_items",
            () -> new ItemStack(OreSpawnItems.RUBY.get()),
            OreSpawnItemGroup::fillItems
    );
    public static final OreSpawnItemGroup FOOD = new OreSpawnItemGroup(
            "orespawn_food",
            () -> new ItemStack(OreSpawnItems.PEACH.get()),
            OreSpawnItemGroup::fillFood
    );
    public static final OreSpawnItemGroup TOOLS = new OreSpawnItemGroup(
            "orespawn_tools",
            () -> new ItemStack(OreSpawnItems.ULTIMATE_PICKAXE.get()),
            OreSpawnItemGroup::fillTools
    );
    public static final OreSpawnItemGroup COMBAT = new OreSpawnItemGroup(
            "orespawn_combat",
            () -> new ItemStack(OreSpawnItems.ULTIMATE_SWORD.get()),
            OreSpawnItemGroup::fillCombat
    );
    public static final OreSpawnItemGroup UTILITIES = new OreSpawnItemGroup(
            "orespawn_utilities",
            () -> new ItemStack(OreSpawnItems.CAGE_EMPTY.get()),
            OreSpawnItemGroup::fillUtilities
    );
    public static final OreSpawnItemGroup DRIED_SPAWNS = new OreSpawnItemGroup(
            "orespawn_dried_spawns",
            () -> new ItemStack(OreSpawnBlocks.ANCIENT_DRIED_MOTHRA.get()),
            OreSpawnItemGroup::fillDriedSpawns
    );

    // Compatibility alias for existing registrations that still call baseProperties().
    public static final OreSpawnItemGroup INSTANCE = ITEMS;

    private final Supplier<ItemStack> iconSupplier;
    private final Consumer<NonNullList<ItemStack>> filler;

    private OreSpawnItemGroup(String label, Supplier<ItemStack> iconSupplier, Consumer<NonNullList<ItemStack>> filler) {
        super(label);
        this.iconSupplier = iconSupplier;
        this.filler = filler;
    }

    @Override
    public ItemStack makeIcon() {
        return this.iconSupplier.get();
    }

    @Override
    public void fillItemList(NonNullList<ItemStack> items) {
        this.filler.accept(items);
    }

    private static void fillBlocks(NonNullList<ItemStack> items) {
        addBlock(items, OreSpawnBlocks.ORE_SALT);
        addBlock(items, OreSpawnBlocks.RED_ANT_TROLL);
        addBlock(items, OreSpawnBlocks.TERMITE_TROLL);
        addBlock(items, OreSpawnBlocks.ORE_URANIUM);
        addBlock(items, OreSpawnBlocks.BLOCK_URANIUM);
        addBlock(items, OreSpawnBlocks.ORE_TITANIUM);
        addBlock(items, OreSpawnBlocks.BLOCK_TITANIUM);
        addBlock(items, OreSpawnBlocks.ORE_RUBY);
        addBlock(items, OreSpawnBlocks.BLOCK_RUBY);
        addBlock(items, OreSpawnBlocks.ORE_AMETHYST);
        addBlock(items, OreSpawnBlocks.BLOCK_AMETHYST);
        addBlock(items, OreSpawnBlocks.CRYSTAL_PINK_BLOCK);
        addBlock(items, OreSpawnBlocks.TIGERS_EYE_BLOCK);
        addBlock(items, OreSpawnBlocks.BLOCK_ENDER_PEARL);
        addBlock(items, OreSpawnBlocks.BLOCK_EYE_OF_ENDER);
        addBlock(items, OreSpawnBlocks.RED_ANT_NEST);
        addBlock(items, OreSpawnBlocks.TERMITE_NEST);
        addBlock(items, OreSpawnBlocks.CRYSTAL_TERMITE_NEST);
        addBlock(items, OreSpawnBlocks.RAINBOW_ANT_NEST);
        addBlock(items, OreSpawnBlocks.UNSTABLE_ANT_NEST);
        addBlock(items, OreSpawnBlocks.APPLE_LEAVES);
        addBlock(items, OreSpawnBlocks.CHERRY_LEAVES);
        addBlock(items, OreSpawnBlocks.PEACH_LEAVES);
        addBlock(items, OreSpawnBlocks.PIZZA);
        addBlock(items, OreSpawnBlocks.EXTREME_TORCH);
        addBlock(items, OreSpawnBlocks.CRYSTAL_TORCH);
        addBlock(items, OreSpawnBlocks.KRAKEN_REPELLENT);
        addBlock(items, OreSpawnBlocks.CREEPER_REPELLENT);
        addBlock(items, OreSpawnBlocks.ISLAND);
    }

    private static void fillItems(NonNullList<ItemStack> items) {
        add(items, OreSpawnItems.URANIUM_NUGGET, OreSpawnItems.TITANIUM_NUGGET);
        add(items, OreSpawnItems.INGOT_URANIUM, OreSpawnItems.INGOT_TITANIUM);
        add(items, OreSpawnItems.RUBY, OreSpawnItems.AMETHYST, OreSpawnItems.CRYSTAL_PINK_INGOT, OreSpawnItems.TIGERS_EYE_INGOT);
        add(items, OreSpawnItems.SALT, OreSpawnItems.GREEN_GOO, OreSpawnItems.CRYSTAL_STICKS, OreSpawnItems.DEAD_STINK_BUG);
        add(items, OreSpawnItems.SPIDER_ROBOT_KIT, OreSpawnItems.ANT_ROBOT_KIT, OreSpawnItems.IRUKANDJI_ARROW);
        add(items, OreSpawnItems.KRAKEN_TOOTH, OreSpawnItems.SEA_MONSTER_SCALE, OreSpawnItems.WORM_TOOTH, OreSpawnItems.TREX_TOOTH);
        add(items, OreSpawnItems.CATERKILLER_JAW, OreSpawnItems.SEA_VIPER_TONGUE, OreSpawnItems.VORTEX_EYE);
        add(items, OreSpawnItems.MOTH_SCALE, OreSpawnItems.LAVA_EEL, OreSpawnItems.PEACOCK_FEATHER);
        add(items, OreSpawnItems.NIGHTMARE_SCALE, OreSpawnItems.QUEEN_SCALE);
        add(items, OreSpawnItems.BERTHA_HANDLE, OreSpawnItems.BERTHA_GUARD, OreSpawnItems.BERTHA_BLADE);
    }

    private static void fillFood(NonNullList<ItemStack> items) {
        add(items, OreSpawnItems.STRAWBERRY, OreSpawnItems.CHERRIES, OreSpawnItems.PEACH);
        add(items, OreSpawnItems.RAW_PEACOCK, OreSpawnItems.COOKED_PEACOCK);
        add(items, OreSpawnItems.ROCK_FISH, OreSpawnItems.RAW_CRAB_MEAT, OreSpawnItems.COOKED_CRAB_MEAT, OreSpawnItems.CRABBY_PATTY);
        add(items, OreSpawnItems.RADISH, OreSpawnItems.LETTUCE, OreSpawnItems.TOMATO, OreSpawnItems.CORN, OreSpawnItems.RICE, OreSpawnItems.QUINOA);
        add(items, OreSpawnItems.STRAWBERRY_SEED, OreSpawnItems.APPLETREE_SEED, OreSpawnItems.CHERRYTREE_SEED, OreSpawnItems.PEACHTREE_SEED);
        add(items, OreSpawnItems.EXPERIENCE_TREE_SEED, OreSpawnItems.FIREFLY_SEED, OreSpawnItems.BUTTERFLY_SEED, OreSpawnItems.MOTH_SEED);
        add(items, OreSpawnItems.BUTTER, OreSpawnItems.CHEESE, OreSpawnItems.SALT, OreSpawnItems.SPARK_FISH);
        add(items, OreSpawnItems.POPCORN, OreSpawnItems.POPCORN_BUTTERED, OreSpawnItems.POPCORN_BUTTERED_SALTED, OreSpawnItems.POPCORN_BAG);
        add(items, OreSpawnItems.BACON, OreSpawnItems.COOKED_BACON, OreSpawnItems.CORNDOG_RAW, OreSpawnItems.CORNDOG_COOKED);
        add(items, OreSpawnItems.BUTTER_CANDY, OreSpawnItems.SALAD, OreSpawnItems.BLT_SANDWICH, OreSpawnItems.CRYSTAL_APPLE, OreSpawnItems.MAGIC_APPLE);
    }

    private static void fillTools(NonNullList<ItemStack> items) {
        addToolSet(items, OreSpawnItems.CRYSTAL_WOOD_PICKAXE, OreSpawnItems.CRYSTAL_WOOD_AXE, OreSpawnItems.CRYSTAL_WOOD_SHOVEL, OreSpawnItems.CRYSTAL_WOOD_HOE);
        addToolSet(items, OreSpawnItems.CRYSTAL_STONE_PICKAXE, OreSpawnItems.CRYSTAL_STONE_AXE, OreSpawnItems.CRYSTAL_STONE_SHOVEL, OreSpawnItems.CRYSTAL_STONE_HOE);
        addToolSet(items, OreSpawnItems.RUBY_PICKAXE, OreSpawnItems.RUBY_AXE, OreSpawnItems.RUBY_SHOVEL, OreSpawnItems.RUBY_HOE);
        addToolSet(items, OreSpawnItems.AMETHYST_PICKAXE, OreSpawnItems.AMETHYST_AXE, OreSpawnItems.AMETHYST_SHOVEL, OreSpawnItems.AMETHYST_HOE);
        addToolSet(items, OreSpawnItems.EMERALD_PICKAXE, OreSpawnItems.EMERALD_AXE, OreSpawnItems.EMERALD_SHOVEL, OreSpawnItems.EMERALD_HOE);
        addToolSet(items, OreSpawnItems.CRYSTAL_PINK_PICKAXE, OreSpawnItems.CRYSTAL_PINK_AXE, OreSpawnItems.CRYSTAL_PINK_SHOVEL, OreSpawnItems.CRYSTAL_PINK_HOE);
        addToolSet(items, OreSpawnItems.TIGERS_EYE_PICKAXE, OreSpawnItems.TIGERS_EYE_AXE, OreSpawnItems.TIGERS_EYE_SHOVEL, OreSpawnItems.TIGERS_EYE_HOE);
        add(items, OreSpawnItems.ULTIMATE_PICKAXE, OreSpawnItems.ULTIMATE_FISHING_ROD);
        add(items, OreSpawnItems.EXPERIENCE_CATCHER, OreSpawnItems.NETHER_LOST, OreSpawnItems.SIFTER, OreSpawnItems.WRENCH);
        add(items, OreSpawnItems.CREEPER_LAUNCHER, OreSpawnItems.MINERS_DREAM, OreSpawnItems.INSTANT_SHELTER, OreSpawnItems.INSTANT_GARDEN, OreSpawnItems.RANDOM_DUNGEON, OreSpawnItems.SQUIDZOOKA);
    }

    private static void fillCombat(NonNullList<ItemStack> items) {
        add(items, OreSpawnItems.CRYSTAL_WOOD_SWORD, OreSpawnItems.CRYSTAL_STONE_SWORD);
        add(items, OreSpawnItems.RUBY_SWORD, OreSpawnItems.AMETHYST_SWORD, OreSpawnItems.BIG_HAMMER, OreSpawnItems.EMERALD_SWORD, OreSpawnItems.POISON_SWORD, OreSpawnItems.RAT_SWORD, OreSpawnItems.FAIRY_SWORD, OreSpawnItems.MANTIS_CLAW);
        add(items, OreSpawnItems.CRYSTAL_PINK_SWORD, OreSpawnItems.TIGERS_EYE_SWORD, OreSpawnItems.EXPERIENCE_SWORD);
        add(items, OreSpawnItems.ULTIMATE_BOW, OreSpawnItems.SKATE_BOW, OreSpawnItems.RAY_GUN, OreSpawnItems.THUNDER_STAFF);
        add(items, OreSpawnItems.BATTLE_AXE, OreSpawnItems.CHAINSAW);
        add(items, OreSpawnItems.ATTITUDE_ADJUSTER, OreSpawnItems.NIGHTMARE_SWORD, OreSpawnItems.ULTIMATE_SWORD, OreSpawnItems.QUEEN_BATTLE_AXE);
        add(items, OreSpawnItems.BERTHA, OreSpawnItems.SLICE, OreSpawnItems.ROYAL_GUARDIAN_SWORD);

        addArmorSet(items, OreSpawnItems.RUBY_HELMET, OreSpawnItems.RUBY_CHESTPLATE, OreSpawnItems.RUBY_LEGGINGS, OreSpawnItems.RUBY_BOOTS);
        addArmorSet(items, OreSpawnItems.AMETHYST_HELMET, OreSpawnItems.AMETHYST_CHESTPLATE, OreSpawnItems.AMETHYST_LEGGINGS, OreSpawnItems.AMETHYST_BOOTS);
        addArmorSet(items, OreSpawnItems.EMERALD_HELMET, OreSpawnItems.EMERALD_CHESTPLATE, OreSpawnItems.EMERALD_LEGGINGS, OreSpawnItems.EMERALD_BOOTS);
        addArmorSet(items, OreSpawnItems.CRYSTAL_PINK_HELMET, OreSpawnItems.CRYSTAL_PINK_CHESTPLATE, OreSpawnItems.CRYSTAL_PINK_LEGGINGS, OreSpawnItems.CRYSTAL_PINK_BOOTS);
        addArmorSet(items, OreSpawnItems.TIGERS_EYE_HELMET, OreSpawnItems.TIGERS_EYE_CHESTPLATE, OreSpawnItems.TIGERS_EYE_LEGGINGS, OreSpawnItems.TIGERS_EYE_BOOTS);
        addArmorSet(items, OreSpawnItems.EXPERIENCE_HELMET, OreSpawnItems.EXPERIENCE_CHESTPLATE, OreSpawnItems.EXPERIENCE_LEGGINGS, OreSpawnItems.EXPERIENCE_BOOTS);
        addArmorSet(items, OreSpawnItems.MOTH_SCALE_HELMET, OreSpawnItems.MOTH_SCALE_CHESTPLATE, OreSpawnItems.MOTH_SCALE_LEGGINGS, OreSpawnItems.MOTH_SCALE_BOOTS);
        addArmorSet(items, OreSpawnItems.LAVA_EEL_HELMET, OreSpawnItems.LAVA_EEL_CHESTPLATE, OreSpawnItems.LAVA_EEL_LEGGINGS, OreSpawnItems.LAVA_EEL_BOOTS);
        addArmorSet(items, OreSpawnItems.PEACOCK_HELMET, OreSpawnItems.PEACOCK_CHESTPLATE, OreSpawnItems.PEACOCK_LEGGINGS, OreSpawnItems.PEACOCK_BOOTS);
        addArmorSet(items, OreSpawnItems.QUEEN_SCALE_HELMET, OreSpawnItems.QUEEN_SCALE_CHESTPLATE, OreSpawnItems.QUEEN_SCALE_LEGGINGS, OreSpawnItems.QUEEN_SCALE_BOOTS);
        addArmorSet(items, OreSpawnItems.ULTIMATE_HELMET, OreSpawnItems.ULTIMATE_CHESTPLATE, OreSpawnItems.ULTIMATE_LEGGINGS, OreSpawnItems.ULTIMATE_BOOTS);
        addArmorSet(items, OreSpawnItems.ROYAL_GUARDIAN_HELMET, OreSpawnItems.ROYAL_GUARDIAN_CHESTPLATE, OreSpawnItems.ROYAL_GUARDIAN_LEGGINGS, OreSpawnItems.ROYAL_GUARDIAN_BOOTS);

        add(items, OreSpawnItems.SUNSPOT_URCHIN, OreSpawnItems.WATER_BALL, OreSpawnItems.LASER_BALL, OreSpawnItems.ACID, OreSpawnItems.DEAD_IRUKANDJI, OreSpawnItems.ICE_BALL);
        add(items, OreSpawnItems.SMALL_ROCK, OreSpawnItems.ROCK, OreSpawnItems.RED_ROCK);
        add(items, OreSpawnItems.GREEN_ROCK, OreSpawnItems.BLUE_ROCK, OreSpawnItems.PURPLE_ROCK);
        add(items, OreSpawnItems.SPIKEY_ROCK, OreSpawnItems.TNT_ROCK);
        add(items, OreSpawnItems.CRYSTAL_RED_ROCK, OreSpawnItems.CRYSTAL_GREEN_ROCK, OreSpawnItems.CRYSTAL_BLUE_ROCK, OreSpawnItems.CRYSTAL_TNT_ROCK);
    }

    private static void fillUtilities(NonNullList<ItemStack> items) {
        add(items, OreSpawnItems.ZOOKEEPER, OreSpawnItems.ZOO_2, OreSpawnItems.ZOO_4, OreSpawnItems.ZOO_6, OreSpawnItems.ZOO_8, OreSpawnItems.ZOO_10);
        add(items, OreSpawnItems.CAGE_EMPTY, OreSpawnItems.CAGE_COW, OreSpawnItems.CAGE_PIG, OreSpawnItems.CAGE_CHICKEN);
        add(items, OreSpawnItems.CAGE_SHEEP, OreSpawnItems.CAGE_WOLF, OreSpawnItems.CAGE_OCELOT, OreSpawnItems.CAGE_HORSE);
        add(items, OreSpawnItems.CAGE_VILLAGER, OreSpawnItems.CAGE_CREEPER, OreSpawnItems.CAGE_ZOMBIE, OreSpawnItems.CAGE_SKELETON, OreSpawnItems.CAGE_SPIDER);
        add(items, OreSpawnItems.CAGE_BAT, OreSpawnItems.CAGE_SQUID, OreSpawnItems.CAGE_SLIME, OreSpawnItems.CAGE_GHAST);
        add(items, OreSpawnItems.CAGE_ENDERMAN, OreSpawnItems.CAGE_CAVE_SPIDER, OreSpawnItems.CAGE_SILVERFISH, OreSpawnItems.CAGE_MAGMA_CUBE);
        add(items, OreSpawnItems.CAGE_WITCH, OreSpawnItems.CAGE_BLAZE, OreSpawnItems.CAGE_MOOSHROOM, OreSpawnItems.CAGE_WITHER_SKELETON);
        add(items, OreSpawnItems.CAGE_SNOW_GOLEM, OreSpawnItems.CAGE_IRON_GOLEM);
        add(items, OreSpawnItems.CAGE_PEACOCK, OreSpawnItems.CAGE_FAIRY, OreSpawnItems.CAGE_RAT, OreSpawnItems.CAGE_FIREFLY, OreSpawnItems.CAGE_GAZELLE, OreSpawnItems.CAGE_STINK, OreSpawnItems.CAGE_MANTIS, OreSpawnItems.CAGE_STINKY, OreSpawnItems.CAGE_CRAB, OreSpawnItems.CAGE_CLOUD_SHARK, OreSpawnItems.CAGE_MOTHRA);
        add(items, OreSpawnItems.EGG_GAZELLE, OreSpawnItems.EGG_STINK, OreSpawnItems.EGG_MANTIS, OreSpawnItems.EGG_STINKY, OreSpawnItems.EGG_FIREFLY, OreSpawnItems.EGG_BUTTERFLY, OreSpawnItems.EGG_TERMITE, OreSpawnItems.EGG_CLOUD_SHARK);
        add(items, OreSpawnItems.EGG_MOTH, OreSpawnItems.EGG_MOTHRA, OreSpawnItems.EGG_BROWN_ANT, OreSpawnItems.EGG_RED_ANT, OreSpawnItems.EGG_RAINBOW_ANT, OreSpawnItems.EGG_UNSTABLE_ANT, OreSpawnItems.EGG_ROBOT_1, OreSpawnItems.EGG_ROBOT_2, OreSpawnItems.EGG_ROBOT_3, OreSpawnItems.EGG_ROBOT_4, OreSpawnItems.EGG_ROBOT_5, OreSpawnItems.EGG_ROBOT_6, OreSpawnItems.EGG_ANT_ROBOT, OreSpawnItems.EGG_SPIDER_ROBOT);
    }

    private static void fillDriedSpawns(NonNullList<ItemStack> items) {
        addBlock(items, OreSpawnBlocks.ANCIENT_DRIED_SPIDER);
        addBlock(items, OreSpawnBlocks.ANCIENT_DRIED_BAT);
        addBlock(items, OreSpawnBlocks.ANCIENT_DRIED_COW);
        addBlock(items, OreSpawnBlocks.ANCIENT_DRIED_PIG);
        addBlock(items, OreSpawnBlocks.ANCIENT_DRIED_SQUID);
        addBlock(items, OreSpawnBlocks.ANCIENT_DRIED_CHICKEN);
        addBlock(items, OreSpawnBlocks.ANCIENT_DRIED_CREEPER);
        addBlock(items, OreSpawnBlocks.ANCIENT_DRIED_SKELETON);
        addBlock(items, OreSpawnBlocks.ANCIENT_DRIED_ZOMBIE);
        addBlock(items, OreSpawnBlocks.ANCIENT_DRIED_SLIME);
        addBlock(items, OreSpawnBlocks.ANCIENT_DRIED_GHAST);
        addBlock(items, OreSpawnBlocks.ANCIENT_DRIED_ENDERMAN);
        addBlock(items, OreSpawnBlocks.ANCIENT_DRIED_CAVE_SPIDER);
        addBlock(items, OreSpawnBlocks.ANCIENT_DRIED_SILVERFISH);
        addBlock(items, OreSpawnBlocks.ANCIENT_DRIED_MAGMA_CUBE);
        addBlock(items, OreSpawnBlocks.ANCIENT_DRIED_WITCH);
        addBlock(items, OreSpawnBlocks.ANCIENT_DRIED_SHEEP);
        addBlock(items, OreSpawnBlocks.ANCIENT_DRIED_WOLF);
        addBlock(items, OreSpawnBlocks.ANCIENT_DRIED_MOOSHROOM);
        addBlock(items, OreSpawnBlocks.ANCIENT_DRIED_OCELOT);
        addBlock(items, OreSpawnBlocks.ANCIENT_DRIED_BLAZE);
        addBlock(items, OreSpawnBlocks.ANCIENT_DRIED_WITHER_SKELETON);
        addBlock(items, OreSpawnBlocks.ANCIENT_DRIED_SNOW_GOLEM);
        addBlock(items, OreSpawnBlocks.ANCIENT_DRIED_IRON_GOLEM);
        addBlock(items, OreSpawnBlocks.ANCIENT_DRIED_VILLAGER);
        addBlock(items, OreSpawnBlocks.ANCIENT_DRIED_CLOUD_SHARK);
        addBlock(items, OreSpawnBlocks.ANCIENT_DRIED_MOTHRA);
    }

    @SafeVarargs
    private static void add(NonNullList<ItemStack> items, RegistryObject<? extends Item>... entries) {
        for (RegistryObject<? extends Item> entry : entries) {
            items.add(new ItemStack(entry.get()));
        }
    }

    @SafeVarargs
    private static void addToolSet(NonNullList<ItemStack> items, RegistryObject<? extends Item>... entries) {
        add(items, entries);
    }

    @SafeVarargs
    private static void addArmorSet(NonNullList<ItemStack> items, RegistryObject<? extends Item>... entries) {
        add(items, entries);
    }

    private static void addBlock(NonNullList<ItemStack> items, RegistryObject<? extends Block> block) {
        items.add(new ItemStack(block.get()));
    }
}
