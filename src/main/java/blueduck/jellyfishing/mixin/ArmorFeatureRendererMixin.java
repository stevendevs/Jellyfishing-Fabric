package blueduck.jellyfishing.mixin;

import net.minecraft.client.render.entity.feature.ArmorFeatureRenderer;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;

@Mixin(ArmorFeatureRenderer.class)
public abstract class ArmorFeatureRendererMixin {
    @Final @Shadow private static Map<String, Identifier> ARMOR_TEXTURE_CACHE;

    //TODO put this in differentiate
    @Inject(method = "getArmorTexture", at = @At(value = "HEAD"), cancellable = true)
    private void getArmorTexture(ArmorItem item, boolean legs, String overlay, CallbackInfoReturnable<Identifier> cir) {
        var itemMaterialNameId = new Identifier(item.getMaterial().getName());
        var id = new Identifier(itemMaterialNameId.getNamespace(), "textures/models/armor/" + itemMaterialNameId.getPath() + "_layer_" + (legs ? 2 : 1) + (overlay == null ? "" : "_" + overlay) + ".png");
        cir.setReturnValue(ARMOR_TEXTURE_CACHE.computeIfAbsent(id.toString(), Identifier::new));
    }
}