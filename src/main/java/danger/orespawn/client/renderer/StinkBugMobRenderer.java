package danger.orespawn.client.renderer;

import net.minecraft.client.renderer.entity.BeeRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.util.ResourceLocation;

public class StinkBugMobRenderer extends BeeRenderer {
    private final ResourceLocation texture;

    public StinkBugMobRenderer(EntityRendererManager manager, ResourceLocation texture) {
        super(manager);
        this.texture = texture;
    }

    @Override
    public ResourceLocation getTextureLocation(BeeEntity entity) {
        return this.texture;
    }
}
