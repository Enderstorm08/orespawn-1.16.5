package danger.orespawn.client.renderer;

import net.minecraft.client.renderer.entity.ChickenRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.util.ResourceLocation;

public class PeacockMobRenderer extends ChickenRenderer {
    private final ResourceLocation texture;

    public PeacockMobRenderer(EntityRendererManager manager, ResourceLocation texture) {
        super(manager);
        this.texture = texture;
    }

    @Override
    public ResourceLocation getTextureLocation(ChickenEntity entity) {
        return this.texture;
    }
}
