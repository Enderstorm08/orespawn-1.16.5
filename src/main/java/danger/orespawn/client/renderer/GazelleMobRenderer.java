package danger.orespawn.client.renderer;

import net.minecraft.client.renderer.entity.CowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.util.ResourceLocation;

public class GazelleMobRenderer extends CowRenderer {
    private final ResourceLocation texture;

    public GazelleMobRenderer(EntityRendererManager manager, ResourceLocation texture) {
        super(manager);
        this.texture = texture;
    }

    @Override
    public ResourceLocation getTextureLocation(CowEntity entity) {
        return this.texture;
    }
}
