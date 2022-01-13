package blueduck.jellyfishing.client.entity.model;

import blueduck.jellyfishing.Jellyfishing;
import blueduck.jellyfishing.client.JellyfishingClient;
import com.google.common.collect.ImmutableList;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

/**
 * Created using Blockbench 3.7.4
 * For Minecraft 1.15
 */

////TODO
//public class AirSuitModel extends BipedEntityModel<LivingEntity> {
//	private final ModelPart flower;
//	private final ModelPart cube_r1;
//
//	public AirSuitModel(ModelPart root, float modelSize) {
//		super(root);
//		this.flower = this.head.getChild("flower");
//		this.cube_r1 = this.flower.getChild("cube_r1");
//		setRotationAngle(cube_r1, 0.0F, 0.3927F, 0.3927F);
//	}
//
//	public static TexturedModelData getTexturedModelData() {
//		var modelData = getModelData(new Dilation(0.5f), 0.0F);
////		ModelData modelData = new ModelData();
//		var modelPartData = modelData.getRoot();
//
//		modelPartData.getChild("");
//		ModelPartData modelPartData1 = modelPartData.addChild("head", ModelPartBuilder.create().uv(5,0).cuboid(-6.0F, -11.0F, -5.0F, 12.0F, 12.0F, 12.0F), ModelTransform.pivot(0.0F,0.0F,-1.0F));
//		ModelPartData modelPartData2 = modelPartData1.addChild("flower", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,0.0F));
//		modelPartData2.addChild("cube_r1", ModelPartBuilder.create().uv(0,26).cuboid(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 0.0F), ModelTransform.pivot(-5.7362F,-11.2977F,-5.2504F));
//		modelPartData.addChild("body", ModelPartBuilder.create().uv(13,25).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.2F)), ModelTransform.pivot(0.0F,0.0F,0.0F));
//		modelPartData.addChild("rightArm", ModelPartBuilder.create().uv(37,25).cuboid(-3.2F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.4F)), ModelTransform.pivot(-5.0F,2.0F,0.0F));
//		modelPartData.addChild("leftArm", ModelPartBuilder.create().uv(37,25).cuboid(-0.6F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.4F)), ModelTransform.pivot(5.0F,2.0F,0.0F));
//		modelPartData.addChild("rightLeg", ModelPartBuilder.create().uv(0,38).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F, new Dilation(0.1F)).uv(31,42).cuboid(-3F, 9.0F, -4.0F, 5.0F, 3.0F, 6.0F), ModelTransform.pivot(-1.9F,12.0F,0.0F));
//		modelPartData.addChild("leftLeg", ModelPartBuilder.create().uv(0,38).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F, new Dilation(0.1F)).uv(31,42).cuboid(-2.0F, 9.0F, -4.0F, 5.0F, 3.0F, 6.0F), ModelTransform.pivot(1.9F,12.0F,0.0F));
//
//		return TexturedModelData.of(modelData, 64, 64);
//	}
//
//	public static void setRotationAngle(ModelPart bone, float x, float y, float z) {
//		bone.pitch = x;
//		bone.yaw = y;
//		bone.roll = z;
//	}
//
//	public void setVisible(boolean visible) {
//		this.head.visible = visible;
//		this.hat.visible = false;
//		this.body.visible = visible;
//		this.rightArm.visible = visible;
//		this.leftArm.visible = visible;
//		this.rightLeg.visible = visible;
//		this.leftLeg.visible = visible;
//	}
//
//	public Iterable<ModelPart> getBodyParts() {
//		return ImmutableList.of(this.body, this.rightArm, this.leftArm, this.rightLeg, this.leftLeg);
//	}
//}

//public class AirSuitModel extends BipedEntityModel<LivingEntity> {
//	private final ModelPart flower;
//	private final ModelPart cube_r1;
//
//	public AirSuitModel(ModelPart root, float modelSize) {
//		super(root);
//
//		flower = head.getChild("flower");
//		cube_r1 = flower.getChild("cube_r1");
//
//		setRotationAngle(cube_r1, 0.0F, 0.3927F, 0.3927F);
//	}
//
//	public static TexturedModelData getTexturedModelData() {
//		ModelData data = getModelData(new Dilation(0.5f), 0.0F);
////		ModelData data = new ModelData();
//		ModelPartData root = data.getRoot();
//
//		ModelPartData head = root.addChild(
//				"head",
//				ModelPartBuilder.create()
//						.uv(5, 0)
//						.mirrored(false)
//						.cuboid(-6.0F, -11.0F, -5.0F, 12.0F, 12.0F, 12.0F, new Dilation(0.0F)),
//				ModelTransform.of(0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F)
//		);
//
//		ModelPartData flower = head.addChild(
//				"flower",
//				ModelPartBuilder.create(),
//				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F)
//		);
//
//		flower.addChild(
//				"cube_r1",
//				ModelPartBuilder.create()
//						.uv(0, 26)
//						.mirrored(false)
//						.cuboid(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 0.0F, new Dilation(0.0F)),
//				ModelTransform.of(-5.7362F, -11.2977F, -5.2504F, 0.0F, 0.3927F, 0.3927F)
//		);
//
//		root.addChild(
//				"body",
//				ModelPartBuilder.create()
//						.uv(13, 25)
//						.mirrored(false)
//						.cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.2F)),
//				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F)
//		);
//
//		root.addChild(
//				"rightArm",
//				ModelPartBuilder.create()
//						.uv(37, 25)
//						.mirrored(false)
//						.cuboid(-3.2F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.4F)),
//				ModelTransform.of(-5.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F)
//		);
//
//		root.addChild(
//				"leftArm",
//				ModelPartBuilder.create()
//						.uv(37, 25)
//						.mirrored(false)
//						.cuboid(-0.6F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.4F)),
//				ModelTransform.of(5.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F)
//		);
//
//		root.addChild(
//				"rightLeg",
//				ModelPartBuilder.create()
//						.uv(0, 38)
//						.mirrored(false)
//						.cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F, new Dilation(0.1F))
//						.uv(31, 42)
//						.mirrored(false)
//						.cuboid(-3.0F, 9.0F, -4.0F, 5.0F, 3.0F, 6.0F, new Dilation(0.0F)),
//				ModelTransform.of(-1.9F, 12.0F, 0.0F, 0.0F, 0.0F, 0.0F)
//		);
//
//		root.addChild(
//				"leftLeg",
//				ModelPartBuilder.create()
//						.uv(0, 38)
//						.mirrored(false)
//						.cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F, new Dilation(0.1F))
//						.uv(31, 42)
//						.mirrored(false)
//						.cuboid(-2.0F, 9.0F, -4.0F, 5.0F, 3.0F, 6.0F, new Dilation(0.0F)),
//				ModelTransform.of(1.9F, 12.0F, 0.0F, 0.0F, 0.0F, 0.0F)
//		);
//
//		return TexturedModelData.of(data, 64, 64);
//	}
//
//	public static void setRotationAngle(ModelPart bone, float x, float y, float z) {
//		bone.pitch = x;
//		bone.yaw = y;
//		bone.roll = z;
//	}
//
//	public void setVisible(boolean visible) {
//		this.head.visible = visible;
//		this.hat.visible = false;
//		this.body.visible = visible;
//		this.rightArm.visible = visible;
//		this.leftArm.visible = visible;
//		this.rightLeg.visible = visible;
//		this.leftLeg.visible = visible;
//	}
//
//	public Iterable<ModelPart> getBodyParts() {
//		return ImmutableList.of(this.body, this.rightArm, this.leftArm, this.rightLeg, this.leftLeg);
//	}
//}

@Environment(EnvType.CLIENT)
public class AirSuitModel extends BipedEntityModel<LivingEntity> {
	public ModelPart head;
	public ModelPart cube_r1;

	public AirSuitModel(ModelPart root) {
		super(root);
		this.head = root.getChild(EntityModelPartNames.HEAD);
		this.cube_r1 = root.getChild("cube_r1");
		setRotationAngle(cube_r1, 0.0F, 0.3927F, 0.3927F);
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = getModelData(Dilation.NONE, 0);
		ModelPartData modelPartData = modelData.getRoot().getChild(EntityModelPartNames.HEAD);

//		ModelPartData bipedHead = modelPartData.addChild(EntityModelPartNames.HEAD, ModelPartBuilder.create().uv(5, 0).cuboid(-6.0F, -11.0F, -5.0F, 12.0F, 12.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -1.0F));

		ModelPartData flower = modelPartData.addChild("flower", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		flower.addChild("cube_r1", ModelPartBuilder.create().uv(0, 26).cuboid(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-5.7362F, -11.2977F, -5.2504F, 0.0F, 0.3927F, 0.3927F));

//		ModelPartData bipedBody = modelPartData.addOrReplaceChild("bipedBody", CubeListBuilder.create().texOffs(13, 25).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		ModelPartData bipedRightArm = modelPartData.addOrReplaceChild("bipedRightArm", CubeListBuilder.create().texOffs(37, 25).addBox(-3.2F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.4F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
//
//		ModelPartData bipedLeftArm = modelPartData.addOrReplaceChild("bipedLeftArm", CubeListBuilder.create().texOffs(37, 25).addBox(-0.6F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.4F)), PartPose.offset(5.0F, 2.0F, 0.0F));
//
//		ModelPartData bipedRightLeg = modelPartData.addOrReplaceChild("bipedRightLeg", CubeListBuilder.create().texOffs(0, 38).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.1F))
//				.texOffs(31, 42).addBox(-3.0F, 9.0F, -4.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9F, 12.0F, 0.0F));
//
//		ModelPartData bipedLeftLeg = modelPartData.addOrReplaceChild("bipedLeftLeg", CubeListBuilder.create().texOffs(0, 38).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.1F))
//				.texOffs(31, 42).addBox(-2.0F, 9.0F, -4.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9F, 12.0F, 0.0F));

		return TexturedModelData.of(modelData, 64, 64);
	}

	public static void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
	}
//
//	public void setVisible(boolean visible) {
//		this.head.visible = visible;
//		this.hat.visible = false;
//		this.body.visible = visible;
//		this.rightArm.visible = visible;
//		this.leftArm.visible = visible;
//		this.rightLeg.visible = visible;
//		this.leftLeg.visible = visible;
//	}
//
//	public Iterable<ModelPart> getBodyParts() {
//		return ImmutableList.of(this.body, this.rightArm, this.leftArm, this.rightLeg, this.leftLeg);
//	}
}