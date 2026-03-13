package danger.orespawn.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.world.World;

public class StinkBugEntity extends BeeEntity {
    public StinkBugEntity(EntityType<? extends StinkBugEntity> type, World level) {
        super(type, level);
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return BeeEntity.createAttributes();
    }
}
