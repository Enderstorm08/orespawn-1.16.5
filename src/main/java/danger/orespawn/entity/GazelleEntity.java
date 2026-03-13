package danger.orespawn.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.world.World;

public class GazelleEntity extends CowEntity {
    public GazelleEntity(EntityType<? extends GazelleEntity> type, World level) {
        super(type, level);
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return CowEntity.createAttributes();
    }
}
