package danger.orespawn.client.renderer;

import net.minecraft.client.renderer.entity.CaveSpiderRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.monster.CaveSpiderEntity;
import net.minecraft.util.ResourceLocation;

public class MantisMobRenderer extends CaveSpiderRenderer {
    private final ResourceLocation texture;

    public MantisMobRenderer(EntityRendererManager manager, ResourceLocation texture) {
        super(manager);
        this.texture = texture;
    }

    @Override
    public ResourceLocation getTextureLocation(CaveSpiderEntity entity) {
        return this.texture;
    }
}
