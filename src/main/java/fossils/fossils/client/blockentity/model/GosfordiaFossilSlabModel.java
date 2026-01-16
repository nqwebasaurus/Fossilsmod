package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GosfordiaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart Body;
	private final ModelPart Tail;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Head;
	private final ModelPart Eyes;
	private final ModelPart Jaw;
	private final ModelPart BackRightFin;
	private final ModelPart FrontRightFin;

	public GosfordiaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.Body = this.main.getChild("Body");
		this.Tail = this.Body.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Head = this.Body.getChild("Head");
		this.Eyes = this.Head.getChild("Eyes");
		this.Jaw = this.Head.getChild("Jaw");
		this.BackRightFin = this.Body.getChild("BackRightFin");
		this.FrontRightFin = this.Body.getChild("FrontRightFin");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, -2.0F, -10.0F, 11.0F, 2.0F, 19.0F, new CubeDeformation(0.008F))
				.texOffs(0, 22).addBox(-2.0F, -2.0F, -1.0F, 7.0F, 2.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 52).addBox(-3.0547F, -2.0F, 0.053F, 5.0F, 2.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.6F, 0.0F, -2.3F, 0.0F, -0.7592F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(29, 44).addBox(-0.0329F, -2.0F, -0.0939F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 0.0F, -10.2F, 0.0F, -1.4137F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 44).addBox(0.0F, -2.0F, 0.2F, 9.0F, 2.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-6.0F, 0.0F, -14.0F, 0.0F, -0.4014F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 9).addBox(-5.0F, -2.0F, -0.2F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, 0.0F, -13.6F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r5 = fossil.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(34, 22).addBox(-0.0566F, -2.0F, -6.0031F, 9.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-8.0F, 0.0F, 14.4F, 0.0F, 0.3403F, 0.0F));

		PartDefinition cube_r6 = fossil.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(34, 31).addBox(0.0F, -2.0F, -7.0F, 7.0F, 2.0F, 7.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 18.0F, 0.0F, 1.0385F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.0F, -0.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Body = main.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(42, 0).addBox(-1.4F, -3.0F, -4.5F, 2.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 1.2F, 0.0F, -2.9234F, 0.0F, 3.1416F));

		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(58, 36).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.2F, -4.525F, 0.1222F, 0.0F, -3.1416F));

		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(48, 44).addBox(-1.0F, -0.25F, -5.075F, 2.0F, 1.0F, 8.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.4F, -3.0F, 0.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -1.6F, -4.675F, 2.0F, 3.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.15F, 0.0F, -4.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Tail.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(42, 0).addBox(0.0F, -1.5F, -2.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.55F, 2.05F, -2.025F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r10 = Tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(9, 22).addBox(0.0F, -2.0F, -2.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.55F, -3.2F, -2.025F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r11 = Tail.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(4, 31).addBox(-1.0F, -0.3F, -1.6F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.75F, -2.0F, -3.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Tail.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(21, 52).addBox(-1.0F, -2.018F, -4.955F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.75F, 3.0F, 0.0F, -0.3316F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(24, 44).addBox(-1.4F, -1.1F, -1.925F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offset(1.05F, 0.0F, -4.75F));

		PartDefinition cube_r13 = Tail2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(59, 59).addBox(0.0F, -4.5F, -1.5F, 0.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7F, -0.775F, 0.0F, 0.0F, -3.1416F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(11, 60).addBox(-0.5F, -0.6F, -3.725F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offset(0.1F, 0.0F, -2.2F));

		PartDefinition cube_r14 = Tail3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 22).addBox(0.0F, -4.5F, -2.0F, 0.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.7F, -2.075F, 0.0F, 0.0F, -3.1416F));

		PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(-0.3F, 0.0F, 4.5F));

		PartDefinition cube_r15 = Head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(5, 22).addBox(-2.0F, -0.425F, 0.625F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, -1.0F, 4.0F, -1.6101F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 15).addBox(-2.0F, 0.125F, -0.75F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -1.0F, 4.0F, -0.6152F, 0.0F, 0.0F));

		PartDefinition cube_r17 = Head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(56, 0).addBox(-2.0F, -1.95F, -2.625F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, 1.0F, 2.0F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r18 = Head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(49, 54).addBox(-2.0F, -2.675F, -3.6F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0F, 2.0F, -0.4712F, 0.0F, 0.0F));

		PartDefinition Eyes = Head.addOrReplaceChild("Eyes", CubeListBuilder.create().texOffs(0, 0).addBox(0.15F, -1.75F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 31).addBox(-1.125F, -1.75F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F))
				.texOffs(14, 22).addBox(-1.0F, -1.75F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.125F, 1.0F, -3.45F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offset(1.0F, 0.95F, 3.3F));

		PartDefinition cube_r19 = Jaw.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(9, 15).addBox(-2.0F, -0.0435F, -0.1309F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -0.1F, 0.3622F, 0.0F, 0.0F));

		PartDefinition BackRightFin = Body.addOrReplaceChild("BackRightFin", CubeListBuilder.create(), PartPose.offset(0.5F, 2.5F, -4.3F));

		PartDefinition cube_r20 = BackRightFin.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(59, 17).addBox(0.0F, -1.0F, -2.5F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2146F, -1.4418F, -0.7081F, 0.0F, 3.1416F));

		PartDefinition cube_r21 = BackRightFin.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(10, 0).addBox(-0.5F, -0.4776F, -3.043F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.0F, 0.05F, 0.7081F, 0.0F, 0.0F));

		PartDefinition FrontRightFin = Body.addOrReplaceChild("FrontRightFin", CubeListBuilder.create(), PartPose.offset(0.2F, 2.75F, 3.9F));

		PartDefinition cube_r22 = FrontRightFin.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(36, 52).addBox(0.0F, -1.0F, -3.0F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.15F, 1.9547F, -0.6008F, -1.333F, 0.0F, 3.1416F));

		PartDefinition cube_r23 = FrontRightFin.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 60).addBox(-0.55F, -1.2066F, -3.6326F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.6F, 1.333F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 80, 80);
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