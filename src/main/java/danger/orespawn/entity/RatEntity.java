package danger.orespawn.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.passive.RabbitEntity;
import net.minecraft.world.World;

public class RatEntity extends RabbitEntity {
    public RatEntity(EntityType<? extends RatEntity> type, World level) {
        super(type, level);
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return RabbitEntity.createAttributes();
    }
}
