package danger.orespawn.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.world.World;

public class StinkyEntity extends PigEntity {
    public StinkyEntity(EntityType<? extends StinkyEntity> type, World level) {
        super(type, level);
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return PigEntity.createAttributes();
    }
}
