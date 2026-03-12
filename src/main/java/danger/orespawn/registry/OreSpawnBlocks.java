package danger.orespawn.registry;

import danger.orespawn.OreSpawn;
import danger.orespawn.item.OreSpawnItemGroup;
import java.util.function.Supplier;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
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

    private OreSpawnBlocks() {
    }

    private static RegistryObject<Block> register(String name, Supplier<Block> blockSupplier) {
        RegistryObject<Block> block = BLOCKS.register(name, blockSupplier);
        OreSpawnItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(OreSpawnItemGroup.INSTANCE)));
        return block;
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

    public static int portedBlockCount() {
        return 10;
    }
}
