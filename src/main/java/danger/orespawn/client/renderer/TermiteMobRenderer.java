package danger.orespawn.client.renderer;

import danger.orespawn.entity.TermiteEntity;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.SilverfishModel;
import net.minecraft.util.ResourceLocation;

public class TermiteMobRenderer extends MobRenderer<TermiteEntity, SilverfishModel<TermiteEntity>> {
    private final ResourceLocation texture;

    public TermiteMobRenderer(EntityRendererManager manager, ResourceLocation texture) {
        super(manager, new SilverfishModel<>(), 0.25F);
        this.texture = texture;
    }

    @Override
    public ResourceLocation getTextureLocation(TermiteEntity entity) {
        return this.texture;
    }
}
