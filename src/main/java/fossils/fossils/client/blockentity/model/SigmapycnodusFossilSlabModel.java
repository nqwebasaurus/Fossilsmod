package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SigmapycnodusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart sigmapycnodus;
	private final ModelPart frontLeftFin;
	private final ModelPart frontRightFin;
	private final ModelPart eye;
	private final ModelPart eye2;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart matrix;

	public SigmapycnodusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.sigmapycnodus = this.fossil.getChild("sigmapycnodus");
		this.frontLeftFin = this.sigmapycnodus.getChild("frontLeftFin");
		this.frontRightFin = this.sigmapycnodus.getChild("frontRightFin");
		this.eye = this.sigmapycnodus.getChild("eye");
		this.eye2 = this.sigmapycnodus.getChild("eye2");
		this.jaw = this.sigmapycnodus.getChild("jaw");
		this.tail = this.sigmapycnodus.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.matrix = this.fossil.getChild("matrix");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -2.7925F, 0.0F));

		PartDefinition sigmapycnodus = fossil.addOrReplaceChild("sigmapycnodus", CubeListBuilder.create().texOffs(0, 48).addBox(0.075F, -14.0086F, -8.1305F, 2.0F, 13.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(21, 68).addBox(0.0F, -12.6336F, -12.3805F, 2.0F, 9.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.6485F, -0.225F, 5.852F, 2.0508F, 0.0F, -1.5708F));

		PartDefinition cube_r1 = sigmapycnodus.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(91, 0).addBox(0.4F, -0.242F, -3.0397F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(0, 90).addBox(0.475F, -0.342F, -2.9397F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -5.9315F, -15.1817F, 1.789F, 0.0F, 0.0F));

		PartDefinition cube_r2 = sigmapycnodus.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(59, 84).addBox(0.5F, -3.0F, -4.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.525F, -8.5143F, -11.8158F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r3 = sigmapycnodus.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(48, 84).addBox(-0.5F, -0.2164F, -3.9763F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.475F, -11.2414F, -15.0658F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r4 = sigmapycnodus.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(37, 84).addBox(0.5F, 0.5373F, -3.8434F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.525F, -13.5396F, -13.1375F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r5 = sigmapycnodus.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(70, 83).addBox(0.975F, 0.7373F, -4.6756F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, -15.8339F, -9.8608F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r6 = sigmapycnodus.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(13, 83).addBox(0.5F, 0.9239F, -4.3827F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -16.8691F, -5.9971F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r7 = sigmapycnodus.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(36, 74).addBox(0.5F, 0.9848F, -3.1736F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -17.0F, -3.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r8 = sigmapycnodus.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 81).addBox(1.5F, -3.0003F, -3.3988F, 2.0F, 4.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5F, -1.5F, -8.0F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r9 = sigmapycnodus.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(59, 48).addBox(0.5F, -2.0064F, -0.3118F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.5F, -8.0F, -0.2443F, 0.0F, 0.0F));

		PartDefinition frontLeftFin = sigmapycnodus.addOrReplaceChild("frontLeftFin", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, -4.0F, -7.0F, 0.1215F, 0.253F, 0.013F));

		PartDefinition frontRightFin = sigmapycnodus.addOrReplaceChild("frontRightFin", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, -4.0F, -7.0F, 0.1215F, -0.253F, -0.013F));

		PartDefinition eye = sigmapycnodus.addOrReplaceChild("eye", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7F, -10.8616F, -12.523F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r10 = eye.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(9, 91).addBox(0.3F, 0.9264F, -2.4192F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.95F, -0.3798F, -2.5428F, 1.6581F, 0.0F, 0.0F));

		PartDefinition eye2 = sigmapycnodus.addOrReplaceChild("eye2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7F, -10.8616F, -12.523F, 0.3927F, 0.0F, 0.0F));

		PartDefinition jaw = sigmapycnodus.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.681F, -11.3479F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r11 = jaw.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(91, 5).addBox(0.45F, -0.3007F, -0.9537F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.6546F, -2.9681F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r12 = jaw.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(78, 69).addBox(0.95F, 1.5F, -3.616F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F))
				.texOffs(80, 57).addBox(0.9F, -0.4F, -4.266F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(91, 11).addBox(0.9F, -0.2F, -3.666F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 76).addBox(0.95F, -0.5F, -4.866F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.2506F, -3.8338F, 1.789F, 0.0F, 0.0F));

		PartDefinition tail = sigmapycnodus.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(21, 48).addBox(0.0F, -4.3212F, -0.9586F, 2.0F, 13.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, -8.9874F, -0.172F));

		PartDefinition cube_r13 = tail.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(26, 84).addBox(4.4F, -2.1566F, 0.5373F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -7.6817F, 1.0561F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r14 = tail.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(53, 74).addBox(0.95F, 0.9397F, 0.342F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, -8.1435F, 0.1691F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r15 = tail.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(83, 90).addBox(0.45F, -1.0865F, -0.4067F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 9.2152F, 3.5206F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r16 = tail.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(83, 83).addBox(0.45F, -1.0123F, -0.1564F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 9.3199F, -0.478F, 0.0262F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(59, 60).addBox(-0.05F, 0.1788F, -1.4586F, 2.0F, 6.0F, 7.0F, new CubeDeformation(0.006F)), PartPose.offset(0.0F, 0.0F, 5.5F));

		PartDefinition cube_r17 = tail2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(80, 48).addBox(3.425F, -0.134F, 0.5F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(38, 48).addBox(1.45F, 0.866F, 0.5F, 2.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -5.373F, -0.0088F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r18 = tail2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(38, 62).addBox(0.45F, -3.171F, -0.5592F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 8.6472F, -0.0618F, 0.4625F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 70).addBox(-0.075F, 1.6722F, -1.0017F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.5F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r19 = tail3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(70, 74).addBox(0.425F, 0.9848F, 0.1736F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1117F, 0.0447F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r20 = tail3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(78, 60).addBox(0.925F, -1.1474F, -0.2725F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.92F, -0.1922F, 0.3752F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(87, 69).addBox(0.9F, 2.0533F, -1.0868F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition matrix = fossil.addOrReplaceChild("matrix", CubeListBuilder.create(), PartPose.offset(0.0F, 2.0F, -1.0F));

		PartDefinition cube_r21 = matrix.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 26).addBox(-25.4923F, 0.0F, -17.2261F, 27.0F, 2.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.6391F, -4.0F, 8.6598F, 0.0F, -0.7418F, 0.0F));

		PartDefinition cube_r22 = matrix.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 0).addBox(-11.7164F, -1.0F, -11.0237F, 22.0F, 2.0F, 23.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(7.5F, -3.0F, 0.65F, 0.0F, -0.1309F, 0.0F));

		return LayerDefinition.create(meshdefinition, 100, 100);
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