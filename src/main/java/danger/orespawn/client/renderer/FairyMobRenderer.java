package danger.orespawn.client.renderer;

import net.minecraft.client.renderer.entity.BeeRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.util.ResourceLocation;

public class FairyMobRenderer extends BeeRenderer {
    private final ResourceLocation texture;

    public FairyMobRenderer(EntityRendererManager manager, ResourceLocation texture) {
        super(manager);
        this.texture = texture;
    }

    @Override
    public ResourceLocation getTextureLocation(BeeEntity entity) {
        return this.texture;
    }
}
