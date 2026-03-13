package danger.orespawn.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.world.World;

public class RedAntEntity extends OreSpawnGroundBugEntity {
    public RedAntEntity(EntityType<? extends RedAntEntity> type, World level) {
        super(type, level);
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return net.minecraft.entity.passive.AnimalEntity.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 10.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.28D);
    }
}
