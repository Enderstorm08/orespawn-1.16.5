package danger.orespawn.registry;

import java.util.function.Supplier;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum OreSpawnItemTiers implements IItemTier {
    RUBY(2, 900, 7.5F, 2.5F, 18, () -> Ingredient.of(OreSpawnItems.RUBY.get())),
    AMETHYST(2, 1000, 8.0F, 2.5F, 18, () -> Ingredient.of(OreSpawnItems.AMETHYST.get())),
    ULTIMATE(4, 2800, 11.0F, 5.0F, 30, () -> Ingredient.of(OreSpawnItems.INGOT_TITANIUM.get(), OreSpawnItems.INGOT_URANIUM.get())),
    NIGHTMARE(4, 3200, 11.5F, 6.0F, 24, () -> Ingredient.of(OreSpawnItems.NIGHTMARE_SCALE.get())),
    BERTHA(3, 9000, 15.0F, 496.0F, 100, () -> Ingredient.of(OreSpawnItems.BERTHA_BLADE.get(), OreSpawnItems.BERTHA_GUARD.get(), OreSpawnItems.BERTHA_HANDLE.get()));

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
