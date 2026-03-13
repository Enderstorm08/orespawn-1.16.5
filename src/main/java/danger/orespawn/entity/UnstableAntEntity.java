package danger.orespawn.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.world.World;

public class UnstableAntEntity extends OreSpawnGroundBugEntity {
    public UnstableAntEntity(EntityType<? extends UnstableAntEntity> type, World level) {
        super(type, level);
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return net.minecraft.entity.passive.AnimalEntity.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 14.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.34D);
    }
}
