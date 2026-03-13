package danger.orespawn.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.BatEntity;
import net.minecraft.world.World;

public abstract class OreSpawnFlyingInsectEntity extends BatEntity {
    protected OreSpawnFlyingInsectEntity(EntityType<? extends BatEntity> type, World level) {
        super(type, level);
    }

    @Override
    public void tick() {
        super.tick();
        if (this.isResting()) {
            this.setResting(false);
        }
    }

    @Override
    protected void customServerAiStep() {
        this.setResting(false);
        super.customServerAiStep();
    }
}
