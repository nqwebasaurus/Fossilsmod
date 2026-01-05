package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ProtozoeaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Body;
	private final ModelPart matrix;

	public ProtozoeaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Body = this.fossil.getChild("Body");
		this.matrix = this.fossil.getChild("matrix");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Body = fossil.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(10.2F, -2.05F, -18.15F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(22, 68).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.6F, 0.0F, 6.4F, 0.0F, -0.0087F, 0.0F));

		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(22, 71).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-0.475F, 0.0F, 9.2F, 0.0F, 0.1876F, 0.0F));

		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(58, 71).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.325F, 0.0F, 11.625F, 0.0F, 0.5541F, 0.0F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(26, 47).addBox(-2.0F, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.325F, 0.0F, 10.725F, 0.0F, 0.5541F, 0.0F));

		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(26, 48).addBox(-2.0F, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.625F, 0.0F, 12.225F, 0.0F, 0.5541F, 0.0F));

		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(12, 67).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.85F, 0.0F, 12.025F, 0.0F, 0.8421F, 0.0F));

		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(64, 71).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.65F, 0.0F, 12.775F, 0.0F, 0.4407F, 0.0F));

		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(70, 71).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(1.65F, 0.0F, 12.775F, 0.0F, 1.7061F, 0.0F));

		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(52, 71).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(2.1F, 0.0F, 19.525F, 0.0F, 1.3788F, 0.0F));

		PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(60, 44).addBox(-8.0F, 0.0F, -1.0F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.725F, 0.0F, 21.475F, 0.0F, 1.2479F, 0.0F));

		PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(60, 45).addBox(-5.0F, 0.0F, -1.0F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.9F, 0.0F, 14.55F, 0.0F, 1.6188F, 0.0F));

		PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(64, 38).addBox(-4.0F, 0.0F, -1.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.175F, 0.025F, 11.875F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(44, 67).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.45F, 0.025F, 13.725F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 62).addBox(-1.0F, 0.0F, -1.0F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.525F, 0.0F, 16.5F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(18, 62).addBox(0.0F, 0.0F, -1.0F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.525F, 0.0F, 21.5F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(56, 62).addBox(0.0F, 0.0F, -2.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.525F, 0.025F, 21.8F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(68, 62).addBox(0.0F, 0.0F, -2.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.075F, 0.05F, 21.8F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r18 = Body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(44, 62).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.275F, 0.0F, 21.375F, 0.0F, 0.1222F, 0.0F));

		PartDefinition cube_r19 = Body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(46, 60).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-0.8F, 0.0F, 26.125F, 0.0F, 0.0175F, 0.0F));

		PartDefinition cube_r20 = Body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(66, 67).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 0.0F, 28.15F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r21 = Body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(68, 65).addBox(-1.0F, 0.0F, 2.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.425F, 0.0F, 35.05F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r22 = Body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(44, 70).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-0.9F, 0.0F, 30.8F, 0.0F, -0.1222F, 0.0F));

		PartDefinition cube_r23 = Body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(56, 67).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.2F, 0.0F, 33.25F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r24 = Body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(46, 57).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.225F, 0.0F, 10.775F, 0.0F, -0.096F, 0.0F));

		PartDefinition cube_r25 = Body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(30, 46).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1134F, 0.0F));

		PartDefinition matrix = fossil.addOrReplaceChild("matrix", CubeListBuilder.create().texOffs(0, 0).addBox(-13.0F, -2.0F, -12.0F, 19.0F, 2.0F, 31.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 0.0F, 0.0F));

		PartDefinition cube_r26 = matrix.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 47).addBox(-3.0F, -2.0F, -1.0F, 10.0F, 2.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(5.9631F, 0.0F, 5.8287F, 0.0F, 1.6275F, 0.0F));

		PartDefinition cube_r27 = matrix.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 52).addBox(4.0F, -2.0F, -1.0F, 10.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(8.3131F, 0.0F, 4.4787F, 0.0F, -1.8631F, 0.0F));

		PartDefinition cube_r28 = matrix.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(54, 52).addBox(5.0F, -2.0F, -2.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5381F, 0.0F, -11.0213F, 0.0F, 2.4129F, 0.0F));

		PartDefinition cube_r29 = matrix.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(32, 67).addBox(4.0F, -2.0F, -1.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.0381F, 0.0F, 5.1787F, 0.0F, 2.5438F, 0.0F));

		PartDefinition cube_r30 = matrix.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(32, 62).addBox(4.0F, -2.0F, -1.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-9.5619F, 0.0F, 14.6787F, 0.0F, 2.1075F, 0.0F));

		PartDefinition cube_r31 = matrix.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 67).addBox(4.0F, -2.0F, -1.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.8381F, 0.0F, 5.6787F, 0.0F, 2.0202F, 0.0F));

		PartDefinition cube_r32 = matrix.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(64, 33).addBox(4.0F, -2.0F, -1.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(8.3631F, 0.0F, 2.9787F, 0.0F, 2.1948F, 0.0F));

		PartDefinition cube_r33 = matrix.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(60, 39).addBox(0.0F, -2.0F, -14.0F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(14.875F, 0.0F, 2.65F, 0.0F, 0.973F, 0.0F));

		PartDefinition cube_r34 = matrix.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(32, 39).addBox(-1.0F, -2.0F, -16.0F, 9.0F, 2.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(21.075F, 0.0F, -8.425F, 0.0F, 1.453F, 0.0F));

		PartDefinition cube_r35 = matrix.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 33).addBox(-1.0F, -2.0F, -18.0F, 9.0F, 2.0F, 7.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(16.175F, 0.0F, -5.1F, 0.0F, 1.0167F, 0.0F));

		PartDefinition cube_r36 = matrix.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(32, 33).addBox(-1.0F, -2.0F, -17.0F, 12.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(9.05F, 0.0F, 6.15F, 0.0F, 2.8318F, 0.0F));

		PartDefinition cube_r37 = matrix.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(54, 46).addBox(-1.0F, -2.0F, -17.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.175F, 0.0F, 2.9F, 0.0F, 0.2749F, 0.0F));

		PartDefinition cube_r38 = matrix.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(12, 68).addBox(-1.0F, -2.0F, 1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.0816F, 0.0F, -14.1853F, 0.0F, -2.0071F, 0.0F));

		PartDefinition cube_r39 = matrix.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 42).addBox(-1.0F, -2.0F, 0.0F, 12.0F, 2.0F, 3.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-12.4817F, 0.0F, -13.3353F, 0.0F, -1.3526F, 0.0F));

		PartDefinition cube_r40 = matrix.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 57).addBox(-1.0F, -2.0F, 0.0F, 9.0F, 2.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-12.0816F, 0.0F, -15.4103F, 0.0F, -0.2923F, 0.0F));

		PartDefinition cube_r41 = matrix.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(24, 57).addBox(-1.0F, -2.0F, -17.0F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-10.6F, 0.0F, 4.3F, 0.0F, 0.0873F, 0.0F));

		return LayerDefinition.create(meshdefinition, 103, 80);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F) + 1.5708F;
	}
}