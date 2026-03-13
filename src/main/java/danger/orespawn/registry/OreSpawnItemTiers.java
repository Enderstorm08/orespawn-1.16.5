package danger.orespawn.registry;

import java.util.function.Supplier;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum OreSpawnItemTiers implements IItemTier {
    EXPERIENCE(3, 1400, 10.0F, 6.0F, 75, () -> Ingredient.of(net.minecraft.item.Items.EXPERIENCE_BOTTLE)),
    CRYSTAL_WOOD(2, 300, 3.0F, 2.0F, 15, () -> Ingredient.of(net.minecraft.item.Items.STICK)),
    CRYSTAL_STONE(3, 800, 6.0F, 5.0F, 45, () -> Ingredient.of(net.minecraft.item.Items.COBBLESTONE)),
    EMERALD(3, 1300, 10.0F, 6.0F, 75, () -> Ingredient.of(net.minecraft.item.Items.EMERALD)),
    CRYSTAL_PINK(4, 1100, 10.0F, 7.0F, 65, () -> Ingredient.of(OreSpawnItems.CRYSTAL_PINK_INGOT.get())),
    TIGERS_EYE(4, 1600, 12.0F, 8.0F, 75, () -> Ingredient.of(OreSpawnItems.TIGERS_EYE_INGOT.get())),
    RUBY(5, 1500, 11.0F, 16.0F, 85, () -> Ingredient.of(OreSpawnItems.RUBY.get())),
    AMETHYST(4, 2000, 11.0F, 11.0F, 70, () -> Ingredient.of(OreSpawnItems.AMETHYST.get())),
    ULTIMATE(10, 3000, 15.0F, 36.0F, 100, () -> Ingredient.of(OreSpawnItems.INGOT_TITANIUM.get(), OreSpawnItems.INGOT_URANIUM.get())),
    NIGHTMARE(3, 1800, 12.0F, 26.0F, 60, () -> Ingredient.of(OreSpawnItems.NIGHTMARE_SCALE.get())),
    BATTLE(3, 1500, 15.0F, 46.0F, 75, () -> Ingredient.of(OreSpawnItems.INGOT_TITANIUM.get(), OreSpawnItems.INGOT_URANIUM.get())),
    CHAINSAW(3, 1500, 10.0F, 56.0F, 75, () -> Ingredient.of(OreSpawnItems.INGOT_TITANIUM.get(), OreSpawnItems.INGOT_URANIUM.get())),
    BERTHA(3, 9000, 15.0F, 496.0F, 100, () -> Ingredient.of(OreSpawnItems.BERTHA_BLADE.get(), OreSpawnItems.BERTHA_GUARD.get(), OreSpawnItems.BERTHA_HANDLE.get())),
    ROYAL(3, 10000, 15.0F, 746.0F, 150, () -> Ingredient.of(OreSpawnItems.CRYSTAL_PINK_INGOT.get(), OreSpawnItems.TIGERS_EYE_INGOT.get())),
    HAMMY(5, 2000, 15.0F, 82.0F, 100, () -> Ingredient.of(OreSpawnItems.INGOT_TITANIUM.get(), OreSpawnItems.INGOT_URANIUM.get())),
    QUEEN_BATTLE(3, 2200, 15.0F, 662.0F, 100, () -> Ingredient.of(OreSpawnItems.NIGHTMARE_SCALE.get()));

    private final int level;
    private final int uses;
    private final float speed;
    private final float attackDamageBonus;
    private final int enchantmentValue;
    private final LazyValue<Ingredient> repairIngredient;

    OreSpawnItemTiers(
            int level,
            int uses,
            float speed,
            float attackDamageBonus,
            int enchantmentValue,
            Supplier<Ingredient> repairIngredient
    ) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.attackDamageBonus = attackDamageBonus;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = new LazyValue<>(repairIngredient);
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamageBonus;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
