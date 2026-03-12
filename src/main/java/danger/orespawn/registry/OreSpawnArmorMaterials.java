package danger.orespawn.registry;

import danger.orespawn.OreSpawn;
import java.util.function.Supplier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum OreSpawnArmorMaterials implements IArmorMaterial {
    EXPERIENCE(
            "experience",
            70,
            new int[]{5, 7, 9, 4},
            50,
            SoundEvents.ARMOR_EQUIP_IRON,
            0.0F,
            0.0F,
            () -> Ingredient.of(net.minecraft.item.Items.EXPERIENCE_BOTTLE)
    ),
    MOTH_SCALE(
            "mothscale",
            50,
            new int[]{2, 5, 7, 2},
            50,
            SoundEvents.ARMOR_EQUIP_LEATHER,
            0.0F,
            0.0F,
            () -> Ingredient.of(OreSpawnItems.MOTH_SCALE.get())
    ),
    LAVA_EEL(
            "lavaeel",
            40,
            new int[]{2, 5, 7, 2},
            35,
            SoundEvents.ARMOR_EQUIP_LEATHER,
            0.0F,
            0.0F,
            () -> Ingredient.of(OreSpawnItems.LAVA_EEL.get())
    ),
    PEACOCK(
            "peacock",
            40,
            new int[]{2, 4, 5, 2},
            30,
            SoundEvents.ARMOR_EQUIP_LEATHER,
            0.0F,
            0.0F,
            () -> Ingredient.of(OreSpawnItems.PEACOCK_FEATHER.get())
    ),
    EMERALD(
            "emerald",
            60,
            new int[]{3, 6, 8, 3},
            40,
            SoundEvents.ARMOR_EQUIP_IRON,
            0.0F,
            0.0F,
            () -> Ingredient.of(net.minecraft.item.Items.EMERALD)
    ),
    CRYSTAL_PINK(
            "pink",
            50,
            new int[]{3, 5, 7, 2},
            40,
            SoundEvents.ARMOR_EQUIP_IRON,
            0.0F,
            0.0F,
            () -> Ingredient.of(OreSpawnItems.CRYSTAL_PINK_INGOT.get())
    ),
    TIGERS_EYE(
            "tigerseye",
            80,
            new int[]{4, 7, 8, 4},
            55,
            SoundEvents.ARMOR_EQUIP_IRON,
            0.0F,
            0.0F,
            () -> Ingredient.of(OreSpawnItems.TIGERS_EYE_INGOT.get())
    ),
    RUBY(
            "ruby",
            90,
            new int[]{4, 8, 9, 4},
            40,
            SoundEvents.ARMOR_EQUIP_IRON,
            0.0F,
            0.0F,
            () -> Ingredient.of(OreSpawnItems.RUBY.get())
    ),
    AMETHYST(
            "amethyst",
            100,
            new int[]{4, 7, 8, 3},
            40,
            SoundEvents.ARMOR_EQUIP_IRON,
            0.0F,
            0.0F,
            () -> Ingredient.of(OreSpawnItems.AMETHYST.get())
    ),
    ULTIMATE(
            "ultimate",
            200,
            new int[]{6, 10, 12, 6},
            100,
            SoundEvents.ARMOR_EQUIP_DIAMOND,
            0.0F,
            0.0F,
            () -> Ingredient.of(OreSpawnItems.INGOT_TITANIUM.get(), OreSpawnItems.INGOT_URANIUM.get())
    ),
    ROYAL(
            "royal",
            2000,
            new int[]{8, 12, 14, 8},
            200,
            SoundEvents.ARMOR_EQUIP_DIAMOND,
            0.0F,
            0.0F,
            () -> Ingredient.of(OreSpawnItems.CRYSTAL_PINK_INGOT.get(), OreSpawnItems.TIGERS_EYE_INGOT.get())
    ),
    QUEEN(
            "queen",
            1500,
            new int[]{9, 14, 16, 9},
            150,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            0.0F,
            0.0F,
            () -> Ingredient.of(OreSpawnItems.QUEEN_SCALE.get())
    );

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};

    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyValue<Ingredient> repairIngredient;

    OreSpawnArmorMaterials(
            String name,
            int durabilityMultiplier,
            int[] slotProtections,
            int enchantmentValue,
            SoundEvent equipSound,
            float toughness,
            float knockbackResistance,
            Supplier<Ingredient> repairIngredient
    ) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = new LazyValue<>(repairIngredient);
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlotType slot) {
        return HEALTH_PER_SLOT[slot.getIndex()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlotType slot) {
        return this.slotProtections[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return OreSpawn.MODID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
