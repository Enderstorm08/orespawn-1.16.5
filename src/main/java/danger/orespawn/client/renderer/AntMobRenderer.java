package danger.orespawn.client.renderer;

import danger.orespawn.entity.OreSpawnGroundBugEntity;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.EndermiteModel;
import net.minecraft.util.ResourceLocation;

public class AntMobRenderer<T extends OreSpawnGroundBugEntity> extends MobRenderer<T, EndermiteModel<T>> {
    private final ResourceLocation texture;

    public AntMobRenderer(EntityRendererManager manager, ResourceLocation texture) {
        super(manager, new EndermiteModel<>(), 0.25F);
        this.texture = texture;
    }

    @Override
    public ResourceLocation getTextureLocation(T entity) {
        return this.texture;
    }
}
