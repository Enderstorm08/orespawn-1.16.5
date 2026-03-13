package danger.orespawn.client.renderer;

import net.minecraft.client.renderer.entity.BatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.passive.BatEntity;
import net.minecraft.util.ResourceLocation;

public class GenericBatMobRenderer<T extends BatEntity> extends BatRenderer {
    private final ResourceLocation texture;

    public GenericBatMobRenderer(EntityRendererManager manager, ResourceLocation texture) {
        super(manager);
        this.texture = texture;
    }

    @Override
    public ResourceLocation getTextureLocation(BatEntity entity) {
        return this.texture;
    }
}
