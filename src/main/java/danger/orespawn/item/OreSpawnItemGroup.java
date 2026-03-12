package danger.orespawn.item;

import danger.orespawn.registry.OreSpawnItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class OreSpawnItemGroup extends ItemGroup {
    public static final OreSpawnItemGroup INSTANCE = new OreSpawnItemGroup();

    private OreSpawnItemGroup() {
        super("orespawn");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(OreSpawnItems.ULTIMATE_SWORD.get());
    }
}
