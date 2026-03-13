package danger.orespawn.client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.RabbitRenderer;
import net.minecraft.entity.passive.RabbitEntity;
import net.minecraft.util.ResourceLocation;

public class RatMobRenderer extends RabbitRenderer {
    private final ResourceLocation texture;

    public RatMobRenderer(EntityRendererManager manager, ResourceLocation texture) {
        super(manager);
        this.texture = texture;
    }

    @Override
    public ResourceLocation getTextureLocation(RabbitEntity entity) {
        return this.texture;
    }
}
