package blueduck.jellyfishing.client;

import blueduck.jellyfishing.Jellyfishing;
import blueduck.jellyfishing.client.entity.model.AbstractJellyfishModel;
import blueduck.jellyfishing.client.entity.model.BlueJellyfishModel;
import blueduck.jellyfishing.client.entity.model.JellyfishModel;
import blueduck.jellyfishing.client.entity.model.SandySuitModel;
import blueduck.jellyfishing.client.entity.renderer.BlueJellyfishRenderer;
import blueduck.jellyfishing.client.entity.renderer.JellyfishRenderer;
import blueduck.jellyfishing.client.entity.renderer.SandySuitRenderer;
import blueduck.jellyfishing.misc.CloudParticle;
import blueduck.jellyfishing.registry.JellyfishingBlocks;
import blueduck.jellyfishing.registry.JellyfishingEntities;
import blueduck.jellyfishing.registry.JellyfishingItems;
import blueduck.jellyfishing.registry.JellyfishingParticles;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendereregistry.v1.LivingEntityFeatureRendererRegistrationCallback;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;

@SuppressWarnings("UnstableApiUsage")
public class JellyfishingClient implements ClientModInitializer {
    public static EntityModelLayer ABSTRACT_JELLYFISH_LAYER;
    public static EntityModelLayer JELLYFISH_LAYER;
    public static EntityModelLayer BLUE_JELLYFISH_LAYER;
    public static EntityModelLayer PATTY_WAGON_LAYER;
    public static EntityModelLayer SANDY_SUIT_LAYER;

    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(),
                JellyfishingBlocks.JELLY_BLOCK,
                JellyfishingBlocks.BLUE_JELLY_BLOCK,
                JellyfishingBlocks.BUBBLE_BLOCK
        );
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutoutMipped(),
                JellyfishingBlocks.CORAL_PLANT,
                JellyfishingBlocks.TUBE_PLANT,
                JellyfishingBlocks.SEANUT_BUSH,
                JellyfishingBlocks.PINEAPPLE_PLANT,
                JellyfishingBlocks.POTTED_PINEAPPLE,
                JellyfishingBlocks.SCRAP_METAL_WINDOW,
                JellyfishingBlocks.CHROME_DOOR,
                JellyfishingBlocks.CHROME_VENT
        );

        EntityRendererRegistry.INSTANCE.register(JellyfishingEntities.JELLYFISH, JellyfishRenderer::new);
        EntityRendererRegistry.INSTANCE.register(JellyfishingEntities.BLUE_JELLYFISH, BlueJellyfishRenderer::new);
        //EntityRendererRegistry.INSTANCE.register(JellyfishingEntities.PATTY_WAGON, PattyWagonRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityType.PLAYER, SandySuitRenderer::new);

        ParticleFactoryRegistry.getInstance().register(JellyfishingParticles.CLOUD_PARTICLE, CloudParticle.Factory::new);

        ClientUtil.registerTridentPerspective(JellyfishingItems.SPATULA, JellyfishingItems.GOLDEN_SPATULA);

        ABSTRACT_JELLYFISH_LAYER = registerMain("abstract_jellyfish");
        JELLYFISH_LAYER = registerMain("jellyfish");
        BLUE_JELLYFISH_LAYER = registerMain("blue_jellyfish");
        //PATTY_WAGON_LAYER = registerMain("patty_wagon");
        SANDY_SUIT_LAYER = registerMain("sandy_suit");

        register(ABSTRACT_JELLYFISH_LAYER, AbstractJellyfishModel::getTexturedModelData);
        register(JELLYFISH_LAYER, JellyfishModel::getTexturedModelData);
        register(BLUE_JELLYFISH_LAYER, BlueJellyfishModel::getTexturedModelData);
        //register(PATTY_WAGON_LAYER, PattyWagonModel::getTexturedModelData);
        register(SANDY_SUIT_LAYER, SandySuitModel::getTexturedModelData);

        LivingEntityFeatureRendererRegistrationCallback.EVENT.register(this::registerFeatureRenderers);
    }

    private void registerFeatureRenderers(EntityType<? extends LivingEntity> entityType, LivingEntityRenderer<?, ?> entityRenderer, LivingEntityFeatureRendererRegistrationCallback.RegistrationHelper registrationHelper, EntityRendererFactory.Context context) {
        if (entityRenderer instanceof PlayerEntityRenderer) {
//            registrationHelper.register(new SandySuitRenderer(context));
        }
    }

    private static EntityModelLayer registerMain(String id) {
        return create(id, "main");
    }

    private static EntityModelLayer create(String id, String layer) {
        return new EntityModelLayer(Jellyfishing.id(id), layer);
    }

    private static void register(EntityModelLayer layer, EntityModelLayerRegistry.TexturedModelDataProvider provider) {
        EntityModelLayerRegistry.registerModelLayer(layer, provider);
    }
}