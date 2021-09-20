package blueduck.jellyfishing.client.entity.renderer;

import blueduck.jellyfishing.Jellyfishing;
import blueduck.jellyfishing.client.JellyfishingClient;
import blueduck.jellyfishing.client.entity.model.SandySuitModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;

public class SandySuitRenderer extends LivingEntityRenderer<LivingEntity, SandySuitModel> {
    public static EntityRendererFactory.Context ctx;

    public SandySuitRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new SandySuitModel(ctx.getPart(JellyfishingClient.SANDY_SUIT_LAYER), 0.0f), 0.3F);
        SandySuitRenderer.ctx = ctx;
    }

    @Override
    public Identifier getTexture(LivingEntity entity) {
        return Jellyfishing.id("textures/entity/jellyfish.png");
    }
}