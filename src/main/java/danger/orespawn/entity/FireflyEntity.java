package danger.orespawn.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.world.World;

public class FireflyEntity extends OreSpawnFlyingInsectEntity {
    public FireflyEntity(EntityType<? extends FireflyEntity> type, World level) {
        super(type, level);
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return net.minecraft.entity.passive.BatEntity.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 6.0D)
                .add(Attributes.FLYING_SPEED, 0.55D)
                .add(Attributes.MOVEMENT_SPEED, 0.25D);
    }

    @Override
    public void aiStep() {
        super.aiStep();
        if (this.level.isClientSide && this.random.nextInt(4) == 0) {
            this.level.addParticle(ParticleTypes.END_ROD, this.getX(), this.getY() + 0.2D, this.getZ(), 0.0D, 0.0D, 0.0D);
        }
    }
}
