package fossils.fossils.client.blockentity.model.dynamosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DynamosuchusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hip;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart chest2;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;

	public DynamosuchusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hip = this.fossil.getChild("hip");
		this.bone = this.hip.getChild("bone");
		this.bone4 = this.hip.getChild("bone4");
		this.leftLeg = this.hip.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hip.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.body = this.hip.getChild("body");
		this.chest = this.body.getChild("chest");
		this.chest2 = this.chest.getChild("chest2");
		this.leftArm = this.chest2.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightArm = this.chest2.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.bone2 = this.chest2.getChild("bone2");
		this.bone3 = this.chest2.getChild("bone3");
		this.neck2 = this.chest2.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hip.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -15.0F, 3.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-4.7F, -2.7F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-4.4F, -13.0F, -14.3F, -0.4363F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-0.55F, -0.1F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-4.4F, -13.0F, -14.3F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(0.3F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, -13.0F, 4.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hip = fossil.addOrReplaceChild("hip", CubeListBuilder.create(), PartPose.offset(0.0F, -14.3F, 3.3F));

		PartDefinition cube_r4 = hip.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(15, 22).addBox(-1.0F, 0.5F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -1.5F, -1.4F, -0.1222F, 0.0F, 0.0F));

		PartDefinition bone = hip.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9507F, -0.8655F, 0.5377F, 0.0F, 0.0F, 0.4276F));

		PartDefinition bone4 = hip.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9507F, -0.8655F, 0.5377F, 0.0F, 0.0F, -0.4276F));

		PartDefinition leftLeg = hip.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7F, 0.0673F, 0.5503F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 7.8533F, -1.0231F, 0.48F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 5.6891F, 0.9363F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3342F, -2.606F, -0.4102F, 0.0F, 0.0F));

		PartDefinition rightLeg = hip.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, 0.0673F, 0.5503F, 0.6109F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 7.8533F, -1.0231F, 0.48F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 5.6891F, 0.9363F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3342F, -2.606F, -0.4102F, 0.0F, 0.0F));

		PartDefinition body = hip.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3F, -1.7F, -0.0354F, 0.1744F, -0.0062F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(5, 12).addBox(-1.0F, 0.0F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 7).addBox(-1.0F, 0.0F, -5.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.3F, -0.3F, 0.0524F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -5.8F, 0.0175F, 0.0873F, 0.0015F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, 0.2F, -5.525F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.4F, 0.1745F, 0.0F, 0.0F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8991F, -4.775F, -0.0175F, 0.0873F, -0.0015F));

		PartDefinition cube_r7 = chest2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(28, 22).addBox(-0.5F, 0.2F, -10.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.9F, 5.2F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftArm = chest2.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1411F, 5.7441F, -5.9386F, -1.4258F, 0.284F, -0.2058F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3597F, -0.104F, 5.3574F, 0.5753F, -0.2839F, -0.0695F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.7864F, -0.2086F, 1.405F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7079F, -1.4886F, -0.6021F, 0.0025F, 0.0013F));

		PartDefinition rightArm = chest2.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1411F, 5.7441F, -5.9386F, -0.5095F, -0.284F, 0.2058F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3597F, -0.104F, 5.3574F, 0.4444F, 0.2839F, 0.0695F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.7864F, -0.2086F, 1.405F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7079F, -1.4886F, -0.8203F, -0.0025F, -0.0013F));

		PartDefinition bone2 = chest2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, 6.9862F, -6.635F, 0.0436F, 0.0F, 0.0F));

		PartDefinition bone3 = chest2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, 6.9862F, -6.635F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck2 = chest2.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, -4.9F, -0.0873F, 0.1745F, 0.0F));

		PartDefinition cube_r8 = neck2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(41, 43).addBox(-0.5F, 0.2F, 0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(39, 41).addBox(-0.5F, 0.2F, -3.45F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1F, -0.7F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(0, 57).addBox(-0.5F, 0.2F, -3.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(2, 59).addBox(-0.5F, 0.2F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5F, -3.9F, -0.0951F, 0.218F, 0.0077F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(26, 29).addBox(-0.5F, 0.2F, -4.65F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0039F, -2.9767F, -0.2822F, 0.3048F, -0.0192F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0961F, -3.6233F, 0.0F, 0.0F, 0.0873F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9926F, 1.716F, 1.285F, -0.1746F, -0.0344F, 0.0061F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9926F, 1.716F, 1.285F, -0.1746F, 0.0344F, -0.0061F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.2895F, 1.0899F, 1.2553F, 0.0F, 0.0F));

		PartDefinition tail = hip.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(44, 47).addBox(-0.5F, 0.2F, -0.25F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(47, 50).addBox(-0.5F, 0.2F, 3.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6F, 3.4F, -0.2356F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(30, 7).addBox(-0.5F, 0.65F, 0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, 4.0F, -0.1329F, -0.173F, 0.023F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(11, 42).addBox(-0.5F, -0.35F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(14, 45).addBox(-0.5F, -0.35F, 3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.9935F, 4.9253F, -0.128F, -0.3031F, 0.0384F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(22, 42).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 45).addBox(-0.5F, -0.3F, 3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0823F, -0.3045F, -0.0247F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.2464F, -0.127F, -0.0318F));

		PartDefinition cube_r9 = tail5.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(43, 7).addBox(-0.5F, -0.825F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6F, 0.2F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(45, 13).addBox(-0.5F, -0.3F, -0.375F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(48, 16).addBox(-0.5F, -0.3F, 3.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0079F, 3.9715F, 0.1276F, 0.1298F, 0.0166F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0191F, 3.9725F, 0.1006F, 0.304F, 0.0302F));

		PartDefinition cube_r10 = tail7.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(3, 49).addBox(-0.5F, -0.3F, 3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(0, 46).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.1F, 0.0F, 0.0175F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0017F, 4.0095F, 0.0452F, 0.2615F, 0.0117F));

		PartDefinition cube_r11 = tail8.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(36, 50).addBox(-0.5F, -0.7F, 3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(33, 47).addBox(-0.5F, -0.7F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.0F, 0.0F, 0.0175F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(15, 7).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0004F, 4.0038F, 0.1156F, 0.3926F, 0.0108F));

		return LayerDefinition.create(meshdefinition, 102, 102);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}