package blueduck.jellyfishing.client.entity.model;

import com.google.common.collect.ImmutableList;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.entity.LivingEntity;

/**
 * Created using Blockbench 3.7.4
 * For Minecraft 1.15
 */

//TODO
@Environment(EnvType.CLIENT)
public class AirSuitModel extends BipedEntityModel<LivingEntity> {
	public ModelPart head;
	public ModelPart flower;
	public ModelPart cube_r1;
	public ModelPart right_arm;
	public ModelPart left_arm;
	public ModelPart right_leg;
	public ModelPart left_leg;

	public AirSuitModel(ModelPart root) {
		super(root);
		this.head = root.getChild(EntityModelPartNames.HEAD);
		this.flower = head.getChild("flower");
		this.cube_r1 = flower.getChild("cube_r1");
		this.right_arm = root.getChild(EntityModelPartNames.RIGHT_ARM);
		this.left_arm = root.getChild(EntityModelPartNames.LEFT_ARM);
		this.right_leg = root.getChild(EntityModelPartNames.RIGHT_LEG);
		this.left_leg = root.getChild(EntityModelPartNames.LEFT_LEG);
		setRotationAngle(cube_r1, 0.0F, 0.3927F, 0.3927F);
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = getModelData(Dilation.NONE, 0);
		ModelPartData modelPartData = modelData.getRoot();

		ModelPartData head = modelPartData.addChild(EntityModelPartNames.HEAD, ModelPartBuilder.create().uv(5, 0).cuboid(-6.0F, -11.0F, -5.0F, 12.0F, 12.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -1.0F));
		ModelPartData flower = head.addChild("flower", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		flower.addChild("cube_r1", ModelPartBuilder.create().uv(0, 26).cuboid(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-5.7362F, -11.2977F, -5.2504F, 0.0F, 0.3927F, 0.3927F));
		modelPartData.addChild(EntityModelPartNames.BODY, ModelPartBuilder.create().uv(13, 25).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.2F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		modelPartData.addChild(EntityModelPartNames.RIGHT_ARM, ModelPartBuilder.create().uv(37, 25).cuboid(-3.2F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.4F)), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));
		modelPartData.addChild(EntityModelPartNames.LEFT_ARM, ModelPartBuilder.create().uv(37, 25).cuboid(-0.6F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.4F)), ModelTransform.pivot(5.0F, 2.0F, 0.0F));
		modelPartData.addChild(EntityModelPartNames.RIGHT_LEG, ModelPartBuilder.create().uv(0, 38).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F, new Dilation(0.1F))
				.uv(31, 42).cuboid(-3.0F, 9.0F, -4.0F, 5.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.9F, 12.0F, 0.0F));
		modelPartData.addChild(EntityModelPartNames.LEFT_LEG, ModelPartBuilder.create().uv(0, 38).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F, new Dilation(0.1F))
				.uv(31, 42).cuboid(-2.0F, 9.0F, -4.0F, 5.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(1.9F, 12.0F, 0.0F));

		return TexturedModelData.of(modelData, 64, 64);
	}

	public static void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
	}

	public void setVisible(boolean visible) {
		this.head.visible = visible;
		this.hat.visible = false;
		this.body.visible = visible;
		this.rightArm.visible = visible;
		this.leftArm.visible = visible;
		this.rightLeg.visible = visible;
		this.leftLeg.visible = visible;
		this.flower.visible = visible;
		this.cube_r1.visible = visible;
	}

	public Iterable<ModelPart> getBodyParts() {
		return ImmutableList.of(this.flower, this.cube_r1, this.body, this.rightArm, this.leftArm, this.rightLeg, this.leftLeg, this.hat);
	}
}