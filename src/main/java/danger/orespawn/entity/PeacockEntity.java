package danger.orespawn.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.world.World;

public class PeacockEntity extends ChickenEntity {
    public PeacockEntity(EntityType<? extends PeacockEntity> type, World level) {
        super(type, level);
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return ChickenEntity.createAttributes();
    }
}
