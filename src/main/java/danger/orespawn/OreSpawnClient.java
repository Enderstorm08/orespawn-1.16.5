package danger.orespawn;

import danger.orespawn.client.renderer.AntMobRenderer;
import danger.orespawn.client.renderer.FairyMobRenderer;
import danger.orespawn.client.renderer.GazelleMobRenderer;
import danger.orespawn.client.renderer.GenericBatMobRenderer;
import danger.orespawn.client.renderer.MantisMobRenderer;
import danger.orespawn.client.renderer.PeacockMobRenderer;
import danger.orespawn.client.renderer.RatMobRenderer;
import danger.orespawn.client.renderer.StinkBugMobRenderer;
import danger.orespawn.client.renderer.StinkyMobRenderer;
import danger.orespawn.client.renderer.TermiteMobRenderer;
import danger.orespawn.entity.OreSpawnThrownItemEntity;
import danger.orespawn.registry.OreSpawnBlocks;
import danger.orespawn.registry.OreSpawnEntityTypes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public final class OreSpawnClient {
    private OreSpawnClient() {
    }

    public static void onClientSetup(final FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(OreSpawnEntityTypes.THROWN_ITEM.get(), manager -> new SpriteRenderer<OreSpawnThrownItemEntity>(manager, Minecraft.getInstance().getItemRenderer()));
        RenderingRegistry.registerEntityRenderingHandler(OreSpawnEntityTypes.FIREFLY.get(), manager -> new GenericBatMobRenderer<>(manager, new ResourceLocation("minecraft", "textures/entity/bat.png")));
        RenderingRegistry.registerEntityRenderingHandler(OreSpawnEntityTypes.BUTTERFLY.get(), manager -> new GenericBatMobRenderer<>(manager, new ResourceLocation("minecraft", "textures/entity/bat.png")));
        RenderingRegistry.registerEntityRenderingHandler(OreSpawnEntityTypes.MOTH.get(), manager -> new GenericBatMobRenderer<>(manager, new ResourceLocation("minecraft", "textures/entity/bat.png")));
        RenderingRegistry.registerEntityRenderingHandler(OreSpawnEntityTypes.PEACOCK.get(), manager -> new PeacockMobRenderer(manager, new ResourceLocation("minecraft", "textures/entity/chicken.png")));
        RenderingRegistry.registerEntityRenderingHandler(OreSpawnEntityTypes.FAIRY.get(), manager -> new FairyMobRenderer(manager, new ResourceLocation("minecraft", "textures/entity/bee/bee.png")));
        RenderingRegistry.registerEntityRenderingHandler(OreSpawnEntityTypes.RAT.get(), manager -> new RatMobRenderer(manager, new ResourceLocation("minecraft", "textures/entity/rabbit/brown.png")));
        RenderingRegistry.registerEntityRenderingHandler(OreSpawnEntityTypes.STINK_BUG.get(), manager -> new StinkBugMobRenderer(manager, new ResourceLocation("minecraft", "textures/entity/bee/bee_angry.png")));
        RenderingRegistry.registerEntityRenderingHandler(OreSpawnEntityTypes.GAZELLE.get(), manager -> new GazelleMobRenderer(manager, new ResourceLocation("minecraft", "textures/entity/cow/cow.png")));
        RenderingRegistry.registerEntityRenderingHandler(OreSpawnEntityTypes.MANTIS.get(), manager -> new MantisMobRenderer(manager, new ResourceLocation("minecraft", "textures/entity/spider/cave_spider.png")));
        RenderingRegistry.registerEntityRenderingHandler(OreSpawnEntityTypes.STINKY.get(), manager -> new StinkyMobRenderer(manager, new ResourceLocation("minecraft", "textures/entity/pig/pig.png")));
        RenderingRegistry.registerEntityRenderingHandler(OreSpawnEntityTypes.RED_ANT.get(), manager -> new AntMobRenderer<>(manager, new ResourceLocation("minecraft", "textures/entity/endermite.png")));
        RenderingRegistry.registerEntityRenderingHandler(OreSpawnEntityTypes.RAINBOW_ANT.get(), manager -> new AntMobRenderer<>(manager, new ResourceLocation("minecraft", "textures/entity/endermite.png")));
        RenderingRegistry.registerEntityRenderingHandler(OreSpawnEntityTypes.BROWN_ANT.get(), manager -> new AntMobRenderer<>(manager, new ResourceLocation("minecraft", "textures/entity/endermite.png")));
        RenderingRegistry.registerEntityRenderingHandler(OreSpawnEntityTypes.TERMITE.get(), manager -> new TermiteMobRenderer(manager, new ResourceLocation("minecraft", "textures/entity/silverfish.png")));
        RenderingRegistry.registerEntityRenderingHandler(OreSpawnEntityTypes.UNSTABLE_ANT.get(), manager -> new AntMobRenderer<>(manager, new ResourceLocation("minecraft", "textures/entity/silverfish.png")));
        RenderTypeLookup.setRenderLayer(OreSpawnBlocks.EXTREME_TORCH.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OreSpawnBlocks.EXTREME_WALL_TORCH.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OreSpawnBlocks.CRYSTAL_TORCH.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OreSpawnBlocks.CRYSTAL_WALL_TORCH.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OreSpawnBlocks.KRAKEN_REPELLENT.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OreSpawnBlocks.KRAKEN_REPELLENT_WALL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OreSpawnBlocks.CREEPER_REPELLENT.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OreSpawnBlocks.CREEPER_REPELLENT_WALL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OreSpawnBlocks.ISLAND.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OreSpawnBlocks.APPLE_LEAVES.get(), RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(OreSpawnBlocks.CHERRY_LEAVES.get(), RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(OreSpawnBlocks.PEACH_LEAVES.get(), RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(OreSpawnBlocks.FIREFLY_PLANT.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OreSpawnBlocks.BUTTERFLY_PLANT.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OreSpawnBlocks.MOTH_PLANT.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OreSpawnBlocks.STRAWBERRY_CROP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OreSpawnBlocks.RADISH_CROP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OreSpawnBlocks.RICE_CROP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OreSpawnBlocks.CORN_CROP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OreSpawnBlocks.QUINOA_CROP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OreSpawnBlocks.TOMATO_CROP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OreSpawnBlocks.LETTUCE_CROP.get(), RenderType.cutout());
    }
}
