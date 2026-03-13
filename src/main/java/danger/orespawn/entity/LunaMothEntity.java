package danger.orespawn.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.world.World;

public class LunaMothEntity extends OreSpawnFlyingInsectEntity {
    public LunaMothEntity(EntityType<? extends LunaMothEntity> type, World level) {
        super(type, level);
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return net.minecraft.entity.passive.BatEntity.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 10.0D)
                .add(Attributes.FLYING_SPEED, 0.48D)
                .add(Attributes.MOVEMENT_SPEED, 0.20D);
    }

    @Override
    public void aiStep() {
        super.aiStep();
        if (this.level.isClientSide && this.random.nextInt(5) == 0) {
            this.level.addParticle(ParticleTypes.WITCH, this.getX(), this.getY() + 0.25D, this.getZ(), 0.0D, 0.0D, 0.0D);
        }
    }
}
