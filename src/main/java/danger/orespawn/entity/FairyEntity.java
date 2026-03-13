package danger.orespawn.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.world.World;

public class FairyEntity extends BeeEntity {
    public FairyEntity(EntityType<? extends FairyEntity> type, World level) {
        super(type, level);
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return BeeEntity.createAttributes();
    }
}
