package danger.orespawn.registry;

import danger.orespawn.OreSpawn;
import danger.orespawn.block.AncientDriedSpawnBlock;
import danger.orespawn.block.AntNestBlock;
import danger.orespawn.block.IslandSpawnerBlock;
import danger.orespawn.block.PizzaBlock;
import danger.orespawn.block.RepellentTorchBlock;
import danger.orespawn.block.RepellentWallTorchBlock;
import danger.orespawn.block.SimpleOreCropBlock;
import danger.orespawn.item.OreSpawnItemGroup;
import java.util.function.Supplier;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.TorchBlock;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.WallOrFloorItem;
import net.minecraft.particles.ParticleTypes;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class OreSpawnBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, OreSpawn.MODID);

    public static final RegistryObject<Block> ORE_URANIUM = register("ore_uranium", stoneBlock(4.5F, 6.0F, 2));
    public static final RegistryObject<Block> BLOCK_URANIUM = register("block_uranium", metalBlock(6.0F, 8.0F, 2));
    public static final RegistryObject<Block> ORE_TITANIUM = register("ore_titanium", stoneBlock(5.0F, 7.0F, 3));
    public static final RegistryObject<Block> BLOCK_TITANIUM = register("block_titanium", metalBlock(7.0F, 9.0F, 3));
    public static final RegistryObject<Block> ORE_RUBY = register("ore_ruby", stoneBlock(4.0F, 5.0F, 2));
    public static final RegistryObject<Block> BLOCK_RUBY = register("block_ruby", metalBlock(5.5F, 7.0F, 2));
    public static final RegistryObject<Block> ORE_AMETHYST = register("ore_amethyst", stoneBlock(4.0F, 5.0F, 2));
    public static final RegistryObject<Block> BLOCK_AMETHYST = register("block_amethyst", metalBlock(5.5F, 7.0F, 2));
    public static final RegistryObject<Block> CRYSTAL_PINK_BLOCK = register("crystal_pink_block", crystalBlock());
    public static final RegistryObject<Block> TIGERS_EYE_BLOCK = register("tigers_eye_block", crystalBlock());
    public static final RegistryObject<Block> BLOCK_ENDER_PEARL = register("blockenderpearl", crystalBlock());
    public static final RegistryObject<Block> BLOCK_EYE_OF_ENDER = register("blockeyeofender", crystalBlock());
    public static final RegistryObject<Block> ORE_SALT = register("ore_salt", stoneBlock(2.5F, 3.5F, 0));
    public static final RegistryObject<Block> RED_ANT_TROLL = register("red_ant_troll_block", trollBlock());
    public static final RegistryObject<Block> TERMITE_TROLL = register("termite_troll_block", trollBlock());
    public static final RegistryObject<Block> RED_ANT_NEST = register("red_ant_nest", antNestBlock(AntNestBlock.DestinationMode.RED_ANT));
    public static final RegistryObject<Block> TERMITE_NEST = register("termite_nest", antNestBlock(AntNestBlock.DestinationMode.TERMITE));
    public static final RegistryObject<Block> CRYSTAL_TERMITE_NEST = register("crystal_termite_nest", antNestBlock(AntNestBlock.DestinationMode.CRYSTAL_TERMITE));
    public static final RegistryObject<Block> RAINBOW_ANT_NEST = register("rainbow_ant_nest", antNestBlock(AntNestBlock.DestinationMode.RAINBOW_ANT));
    public static final RegistryObject<Block> UNSTABLE_ANT_NEST = register("unstable_ant_nest", antNestBlock(AntNestBlock.DestinationMode.UNSTABLE_ANT));
    public static final RegistryObject<Block> ANCIENT_DRIED_SPIDER = registerAncientDried("ancient_dried_spider_spawn_egg", () -> net.minecraft.entity.EntityType.SPIDER);
    public static final RegistryObject<Block> ANCIENT_DRIED_BAT = registerAncientDried("ancient_dried_bat_spawn_egg", () -> net.minecraft.entity.EntityType.BAT);
    public static final RegistryObject<Block> ANCIENT_DRIED_COW = registerAncientDried("ancient_dried_cow_spawn_egg", () -> net.minecraft.entity.EntityType.COW);
    public static final RegistryObject<Block> ANCIENT_DRIED_PIG = registerAncientDried("ancient_dried_pig_spawn_egg", () -> net.minecraft.entity.EntityType.PIG);
    public static final RegistryObject<Block> ANCIENT_DRIED_SQUID = registerAncientDried("ancient_dried_squid_spawn_egg", () -> net.minecraft.entity.EntityType.SQUID);
    public static final RegistryObject<Block> ANCIENT_DRIED_CHICKEN = registerAncientDried("ancient_dried_chicken_spawn_egg", () -> net.minecraft.entity.EntityType.CHICKEN);
    public static final RegistryObject<Block> ANCIENT_DRIED_CREEPER = registerAncientDried("ancient_dried_creeper_spawn_egg", () -> net.minecraft.entity.EntityType.CREEPER);
    public static final RegistryObject<Block> ANCIENT_DRIED_SKELETON = registerAncientDried("ancient_dried_skeleton_spawn_egg", () -> net.minecraft.entity.EntityType.SKELETON);
    public static final RegistryObject<Block> ANCIENT_DRIED_ZOMBIE = registerAncientDried("ancient_dried_zombie_spawn_egg", () -> net.minecraft.entity.EntityType.ZOMBIE);
    public static final RegistryObject<Block> ANCIENT_DRIED_SLIME = registerAncientDried("ancient_dried_slime_spawn_egg", () -> net.minecraft.entity.EntityType.SLIME);
    public static final RegistryObject<Block> ANCIENT_DRIED_GHAST = registerAncientDried("ancient_dried_ghast_spawn_egg", () -> net.minecraft.entity.EntityType.GHAST);
    public static final RegistryObject<Block> ANCIENT_DRIED_ENDERMAN = registerAncientDried("ancient_dried_enderman_spawn_egg", () -> net.minecraft.entity.EntityType.ENDERMAN);
    public static final RegistryObject<Block> ANCIENT_DRIED_CAVE_SPIDER = registerAncientDried("ancient_dried_cave_spider_spawn_egg", () -> net.minecraft.entity.EntityType.CAVE_SPIDER);
    public static final RegistryObject<Block> ANCIENT_DRIED_SILVERFISH = registerAncientDried("ancient_dried_silverfish_spawn_egg", () -> net.minecraft.entity.EntityType.SILVERFISH);
    public static final RegistryObject<Block> ANCIENT_DRIED_MAGMA_CUBE = registerAncientDried("ancient_dried_magma_cube_spawn_egg", () -> net.minecraft.entity.EntityType.MAGMA_CUBE);
    public static final RegistryObject<Block> ANCIENT_DRIED_WITCH = registerAncientDried("ancient_dried_witch_spawn_egg", () -> net.minecraft.entity.EntityType.WITCH);
    public static final RegistryObject<Block> ANCIENT_DRIED_SHEEP = registerAncientDried("ancient_dried_sheep_spawn_egg", () -> net.minecraft.entity.EntityType.SHEEP);
    public static final RegistryObject<Block> ANCIENT_DRIED_WOLF = registerAncientDried("ancient_dried_wolf_spawn_egg", () -> net.minecraft.entity.EntityType.WOLF);
    public static final RegistryObject<Block> ANCIENT_DRIED_MOOSHROOM = registerAncientDried("ancient_dried_mooshroom_spawn_egg", () -> net.minecraft.entity.EntityType.MOOSHROOM);
    public static final RegistryObject<Block> ANCIENT_DRIED_OCELOT = registerAncientDried("ancient_dried_ocelot_spawn_egg", () -> net.minecraft.entity.EntityType.OCELOT);
    public static final RegistryObject<Block> ANCIENT_DRIED_BLAZE = registerAncientDried("ancient_dried_blaze_spawn_egg", () -> net.minecraft.entity.EntityType.BLAZE);
    public static final RegistryObject<Block> ANCIENT_DRIED_WITHER_SKELETON = registerAncientDried("ancient_dried_wither_skeleton_spawn_egg", () -> net.minecraft.entity.EntityType.WITHER_SKELETON);
    public static final RegistryObject<Block> ANCIENT_DRIED_SNOW_GOLEM = registerAncientDried("ancient_dried_snow_golem_spawn_egg", () -> net.minecraft.entity.EntityType.SNOW_GOLEM);
    public static final RegistryObject<Block> ANCIENT_DRIED_IRON_GOLEM = registerAncientDried("ancient_dried_iron_golem_spawn_egg", () -> net.minecraft.entity.EntityType.IRON_GOLEM);
    public static final RegistryObject<Block> ANCIENT_DRIED_VILLAGER = registerAncientDried("ancient_dried_villager_spawn_egg", () -> net.minecraft.entity.EntityType.VILLAGER);
    public static final RegistryObject<Block> ANCIENT_DRIED_MOTHRA = registerAncientDried("ancient_dried_mothra_spawn_egg", () -> net.minecraft.entity.EntityType.PHANTOM);
    public static final RegistryObject<Block> ANCIENT_DRIED_CLOUD_SHARK = registerAncientDried("ancient_dried_cloud_shark_spawn_egg", () -> net.minecraft.entity.EntityType.PHANTOM);
    public static final RegistryObject<Block> PIZZA = register("pizza", PizzaBlock::new);
    public static final RegistryObject<Block> EXTREME_WALL_TORCH = registerWallTorch("extremetorch_wall");
    public static final RegistryObject<Block> EXTREME_TORCH = registerTorch("extremetorch", EXTREME_WALL_TORCH);
    public static final RegistryObject<Block> CRYSTAL_WALL_TORCH = registerWallTorch("crystaltorch_wall");
    public static final RegistryObject<Block> CRYSTAL_TORCH = registerTorch("crystaltorch", CRYSTAL_WALL_TORCH);
    public static final RegistryObject<Block> KRAKEN_REPELLENT_WALL = registerRepellentWallTorch("krakenrepellent_wall", RepellentTorchBlock.aquaticTargets(), 20.0D, 10.0D, 40.0D);
    public static final RegistryObject<Block> KRAKEN_REPELLENT = registerRepellentTorch("krakenrepellent", KRAKEN_REPELLENT_WALL, RepellentTorchBlock.aquaticTargets(), 20.0D, 10.0D, 40.0D);
    public static final RegistryObject<Block> CREEPER_REPELLENT_WALL = registerRepellentWallTorch("creeperrepellent_wall", RepellentTorchBlock.creeperTargets(), 20.0D, 10.0D, 10.0D);
    public static final RegistryObject<Block> CREEPER_REPELLENT = registerRepellentTorch("creeperrepellent", CREEPER_REPELLENT_WALL, RepellentTorchBlock.creeperTargets(), 20.0D, 10.0D, 10.0D);
    public static final RegistryObject<Block> ISLAND = register("island", IslandSpawnerBlock::new);
    public static final RegistryObject<Block> APPLE_LEAVES = register("apple_leaves", leafBlock());
    public static final RegistryObject<Block> CHERRY_LEAVES = register("cherry_leaves", leafBlock());
    public static final RegistryObject<Block> PEACH_LEAVES = register("peach_leaves", leafBlock());
    public static final RegistryObject<Block> FIREFLY_PLANT = registerNoItem("firefly_plant", () -> new SimpleOreCropBlock(() -> OreSpawnItems.FIREFLY_SEED.get()));
    public static final RegistryObject<Block> BUTTERFLY_PLANT = registerNoItem("butterfly_plant", () -> new SimpleOreCropBlock(() -> OreSpawnItems.BUTTERFLY_SEED.get()));
    public static final RegistryObject<Block> MOTH_PLANT = registerNoItem("moth_plant", () -> new SimpleOreCropBlock(() -> OreSpawnItems.MOTH_SEED.get()));
    public static final RegistryObject<Block> STRAWBERRY_CROP = registerNoItem("strawberry_crop", () -> new SimpleOreCropBlock(() -> OreSpawnItems.STRAWBERRY_SEED.get(), () -> OreSpawnItems.STRAWBERRY.get()));
    public static final RegistryObject<Block> RADISH_CROP = registerNoItem("radish_crop", () -> new SimpleOreCropBlock(() -> OreSpawnItems.RADISH.get()));
    public static final RegistryObject<Block> RICE_CROP = registerNoItem("rice_crop", () -> new SimpleOreCropBlock(() -> OreSpawnItems.RICE.get()));
    public static final RegistryObject<Block> CORN_CROP = registerNoItem("corn_crop", () -> new SimpleOreCropBlock(() -> OreSpawnItems.CORN.get()));
    public static final RegistryObject<Block> QUINOA_CROP = registerNoItem("quinoa_crop", () -> new SimpleOreCropBlock(() -> OreSpawnItems.QUINOA.get()));
    public static final RegistryObject<Block> TOMATO_CROP = registerNoItem("tomato_crop", () -> new SimpleOreCropBlock(() -> OreSpawnItems.TOMATO.get()));
    public static final RegistryObject<Block> LETTUCE_CROP = registerNoItem("lettuce_crop", () -> new SimpleOreCropBlock(() -> OreSpawnItems.LETTUCE.get()));

    private OreSpawnBlocks() {
    }

    private static RegistryObject<Block> register(String name, Supplier<Block> blockSupplier) {
        RegistryObject<Block> block = BLOCKS.register(name, blockSupplier);
        OreSpawnItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(OreSpawnItemGroup.BLOCKS)));
        return block;
    }

    private static RegistryObject<Block> registerAncientDried(String name, Supplier<net.minecraft.entity.EntityType<?>> entityTypeSupplier) {
        RegistryObject<Block> block = BLOCKS.register(name, () -> new AncientDriedSpawnBlock(
                AbstractBlock.Properties
                        .of(Material.EGG, MaterialColor.SAND)
                        .strength(0.6F)
                        .sound(SoundType.SLIME_BLOCK)
                        .noOcclusion(),
                entityTypeSupplier
        ));
        OreSpawnItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(OreSpawnItemGroup.DRIED_SPAWNS)));
        return block;
    }

    private static RegistryObject<Block> registerTorch(String name, RegistryObject<Block> wallBlock) {
        RegistryObject<Block> block = BLOCKS.register(name, () -> new TorchBlock(AbstractBlock.Properties.copy(net.minecraft.block.Blocks.TORCH), ParticleTypes.FLAME));
        OreSpawnItems.ITEMS.register(name, () -> new WallOrFloorItem(block.get(), wallBlock.get(), new Item.Properties().tab(OreSpawnItemGroup.BLOCKS)));
        return block;
    }

    private static RegistryObject<Block> registerWallTorch(String name) {
        return BLOCKS.register(name, () -> new WallTorchBlock(AbstractBlock.Properties.copy(net.minecraft.block.Blocks.WALL_TORCH).dropsLike(net.minecraft.block.Blocks.TORCH), ParticleTypes.FLAME));
    }

    private static RegistryObject<Block> registerRepellentTorch(String name, RegistryObject<Block> wallBlock, java.util.function.Predicate<net.minecraft.entity.LivingEntity> predicate, double xzRange, double belowRange, double aboveRange) {
        RegistryObject<Block> block = BLOCKS.register(name, () -> new RepellentTorchBlock(ParticleTypes.FLAME, predicate, xzRange, belowRange, aboveRange));
        OreSpawnItems.ITEMS.register(name, () -> new WallOrFloorItem(block.get(), wallBlock.get(), new Item.Properties().tab(OreSpawnItemGroup.BLOCKS)));
        return block;
    }

    private static RegistryObject<Block> registerRepellentWallTorch(String name, java.util.function.Predicate<net.minecraft.entity.LivingEntity> predicate, double xzRange, double belowRange, double aboveRange) {
        return BLOCKS.register(name, () -> new RepellentWallTorchBlock(ParticleTypes.FLAME, predicate, xzRange, belowRange, aboveRange));
    }

    private static RegistryObject<Block> registerNoItem(String name, Supplier<Block> blockSupplier) {
        return BLOCKS.register(name, blockSupplier);
    }

    private static Supplier<Block> stoneBlock(float hardness, float resistance, int harvestLevel) {
        return () -> new Block(AbstractBlock.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(hardness, resistance)
                .sound(SoundType.STONE)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(harvestLevel)
                .requiresCorrectToolForDrops());
    }

    private static Supplier<Block> metalBlock(float hardness, float resistance, int harvestLevel) {
        return () -> new Block(AbstractBlock.Properties
                .of(Material.METAL, MaterialColor.METAL)
                .strength(hardness, resistance)
                .sound(SoundType.METAL)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(harvestLevel)
                .requiresCorrectToolForDrops());
    }

    private static Supplier<Block> crystalBlock() {
        return () -> new Block(AbstractBlock.Properties
                .of(Material.GLASS, MaterialColor.COLOR_MAGENTA)
                .strength(3.0F, 5.0F)
                .sound(SoundType.GLASS)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(2)
                .requiresCorrectToolForDrops());
    }

    private static Supplier<Block> leafBlock() {
        return () -> new Block(AbstractBlock.Properties
                .of(Material.LEAVES, MaterialColor.COLOR_GREEN)
                .strength(0.2F)
                .sound(SoundType.GRASS)
                .noOcclusion());
    }

    private static Supplier<Block> trollBlock() {
        return () -> new Block(AbstractBlock.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(3.5F, 4.5F)
                .sound(SoundType.STONE));
    }

    private static Supplier<Block> antNestBlock(AntNestBlock.DestinationMode destinationMode) {
        return () -> new AntNestBlock(AbstractBlock.Properties
                .of(Material.WOOD, MaterialColor.DIRT)
                .strength(2.0F, 2.5F)
                .sound(SoundType.WOOD), destinationMode);
    }

    public static int portedBlockCount() {
        return 68;
    }
}
