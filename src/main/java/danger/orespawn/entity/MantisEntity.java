package danger.orespawn.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.monster.CaveSpiderEntity;
import net.minecraft.world.World;

public class MantisEntity extends CaveSpiderEntity {
    public MantisEntity(EntityType<? extends MantisEntity> type, World level) {
        super(type, level);
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return CaveSpiderEntity.createAttributes();
    }
}
