package danger.orespawn.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.world.World;

public class ButterflyEntity extends OreSpawnFlyingInsectEntity {
    public ButterflyEntity(EntityType<? extends ButterflyEntity> type, World level) {
        super(type, level);
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return net.minecraft.entity.passive.BatEntity.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 8.0D)
                .add(Attributes.FLYING_SPEED, 0.5D)
                .add(Attributes.MOVEMENT_SPEED, 0.22D);
    }

    @Override
    public void aiStep() {
        super.aiStep();
        if (this.level.isClientSide && this.random.nextInt(7) == 0) {
            this.level.addParticle(ParticleTypes.HAPPY_VILLAGER, this.getX(), this.getY() + 0.2D, this.getZ(), 0.0D, 0.0D, 0.0D);
        }
    }
}
