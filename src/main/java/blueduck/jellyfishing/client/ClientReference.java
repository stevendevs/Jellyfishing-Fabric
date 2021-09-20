package blueduck.jellyfishing.client;

import blueduck.jellyfishing.client.entity.model.SandySuitModel;
import blueduck.jellyfishing.client.entity.renderer.SandySuitRenderer;
import net.minecraft.entity.EquipmentSlot;

//TODO
public class ClientReference {
    private static final SandySuitModel SandySuitModel = new SandySuitModel(SandySuitRenderer.ctx.getPart(JellyfishingClient.SANDY_SUIT_LAYER), 1.0f);
    private static final SandySuitModel SandySuitLeggings = new SandySuitModel(SandySuitRenderer.ctx.getPart(JellyfishingClient.SANDY_SUIT_LAYER), 0.5f);

//    public static <A> A getSandySuitModel(EquipmentSlot armorSlot) {
//        return (A) (armorSlot == EquipmentSlot.LEGS ? SandySuitLeggings : SandySuitModel);
//    }
    public static <A> A getSandySuitModel(EquipmentSlot armorSlot) {
        return (A)SandySuitModel;
    }
}