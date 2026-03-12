package danger.orespawn.item;

import danger.orespawn.OreSpawn;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class OreSpawnArmorItem extends ArmorItem {
    private final String textureName;
    private final Map<Enchantment, Integer> defaultEnchantments;
    private final double maxFallSpeed;

    public OreSpawnArmorItem(
            IArmorMaterial material,
            EquipmentSlotType slot,
            Properties properties,
            String textureName,
            Map<Enchantment, Integer> defaultEnchantments,
            double maxFallSpeed
    ) {
        super(material, slot, properties);
        this.textureName = textureName;
        this.defaultEnchantments = defaultEnchantments;
        this.maxFallSpeed = maxFallSpeed;
    }

    @Override
    public void onCraftedBy(ItemStack stack, World world, PlayerEntity player) {
        super.onCraftedBy(stack, world, player);
        applyDefaultEnchantments(stack);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected) {
        super.inventoryTick(stack, world, entity, itemSlot, isSelected);
        if (!world.isClientSide) {
            applyDefaultEnchantments(stack);
        }
    }

    @Override
    public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
        super.onArmorTick(stack, world, player);
        if (this.slot != EquipmentSlotType.FEET || this.maxFallSpeed >= 0.0D) {
            return;
        }

        Vector3d movement = player.getDeltaMovement();
        if (movement.y < this.maxFallSpeed) {
            player.setDeltaMovement(movement.x, this.maxFallSpeed, movement.z);
        }
        player.fallDistance = 0.0F;
    }

    @Override
    public String getArmorTexture(ItemStack stack, net.minecraft.entity.Entity entity, EquipmentSlotType slot, @Nullable String type) {
        int layer = slot == EquipmentSlotType.LEGS ? 2 : 1;
        return OreSpawn.MODID + ":textures/models/armor/" + this.textureName + "_layer_" + layer + ".png";
    }

    private void applyDefaultEnchantments(ItemStack stack) {
        for (Map.Entry<Enchantment, Integer> entry : this.defaultEnchantments.entrySet()) {
            if (EnchantmentHelper.getItemEnchantmentLevel(entry.getKey(), stack) < entry.getValue()) {
                stack.enchant(entry.getKey(), entry.getValue());
            }
        }
    }
}
