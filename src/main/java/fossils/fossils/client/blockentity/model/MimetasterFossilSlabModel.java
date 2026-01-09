package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MimetasterFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart leg2R;
	private final ModelPart leg2L;
	private final ModelPart legL1;
	private final ModelPart legL2;
	private final ModelPart legR1;
	private final ModelPart legR2;
	private final ModelPart antennaL;
	private final ModelPart antennaR;
	private final ModelPart eyeL;
	private final ModelPart eyeR;
	private final ModelPart body2;
	private final ModelPart leg2R2;
	private final ModelPart leg2L2;
	private final ModelPart legL3;
	private final ModelPart legL4;
	private final ModelPart legR3;
	private final ModelPart legR4;
	private final ModelPart antennaL2;
	private final ModelPart antennaR2;
	private final ModelPart eyeL2;
	private final ModelPart eyeR2;

	public MimetasterFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.leg2R = this.body.getChild("leg2R");
		this.leg2L = this.body.getChild("leg2L");
		this.legL1 = this.body.getChild("legL1");
		this.legL2 = this.legL1.getChild("legL2");
		this.legR1 = this.body.getChild("legR1");
		this.legR2 = this.legR1.getChild("legR2");
		this.antennaL = this.body.getChild("antennaL");
		this.antennaR = this.body.getChild("antennaR");
		this.eyeL = this.body.getChild("eyeL");
		this.eyeR = this.body.getChild("eyeR");
		this.body2 = this.fossil.getChild("body2");
		this.leg2R2 = this.body2.getChild("leg2R2");
		this.leg2L2 = this.body2.getChild("leg2L2");
		this.legL3 = this.body2.getChild("legL3");
		this.legL4 = this.legL3.getChild("legL4");
		this.legR3 = this.body2.getChild("legR3");
		this.legR4 = this.legR3.getChild("legR4");
		this.antennaL2 = this.body2.getChild("antennaL2");
		this.antennaR2 = this.body2.getChild("antennaR2");
		this.eyeL2 = this.body2.getChild("eyeL2");
		this.eyeR2 = this.body2.getChild("eyeR2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 68).addBox(-0.0895F, -1.0F, -15.9849F, 27.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-18.0F, -1.0F, 7.5F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-39.0865F, -1.0F, -30.8992F, 39.0F, 2.0F, 31.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(4.0F, -1.0F, 22.8F, 0.0F, -1.1345F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 34).addBox(-10.0F, -1.0F, -15.5F, 27.0F, 2.0F, 31.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.0F, -1.0F, 0.5F, 0.0F, -0.6109F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 58).addBox(-1.5F, -2.4F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(19, 10).addBox(-0.5F, -2.35F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(16.0F, 0.0F, 3.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, -0.5F, -0.2F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.85F, 2.25F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, -0.5F, 0.2F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.25F, 3.5F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 46).addBox(-4.0F, 0.0F, -1.5F, 8.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3532F, -2.0F, -21.4185F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 54).addBox(1.3093F, -0.1F, -2.5514F, 7.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -1.9F, -16.4611F, -3.1416F, 0.5672F, 3.1416F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 42).addBox(-8.25F, -2.7F, -2.5F, 8.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.0F, 0.0F, 1.0472F, 0.0F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 46).addBox(0.25F, -2.7F, -2.5F, 8.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.0F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 54).addBox(1.5F, -2.7F, -4.0F, 7.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -2.75F, -10.25F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.0F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 34).addBox(-2.5F, -2.75F, -10.25F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 50).addBox(-8.5F, -2.7F, -4.0F, 7.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition leg2R = body.addOrReplaceChild("leg2R", CubeListBuilder.create().texOffs(0, 8).addBox(-6.0F, -0.2F, -0.5F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -2.05F, -1.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition leg2L = body.addOrReplaceChild("leg2L", CubeListBuilder.create().texOffs(0, 14).addBox(0.0F, -0.3F, -0.5F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.95F, -1.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition legL1 = body.addOrReplaceChild("legL1", CubeListBuilder.create().texOffs(14, 25).addBox(0.0F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -2.2F, -2.0F, 0.0F, 0.829F, 0.0F));

		PartDefinition legL2 = legL1.addOrReplaceChild("legL2", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.01F, -0.5F, 12.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 0.0F, 0.0F, 0.0F, -1.6581F, 0.0F));

		PartDefinition legR1 = body.addOrReplaceChild("legR1", CubeListBuilder.create().texOffs(0, 28).addBox(-7.0F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -2.2F, -2.0F, 0.0F, -0.829F, 0.0F));

		PartDefinition legR2 = legR1.addOrReplaceChild("legR2", CubeListBuilder.create().texOffs(0, 4).addBox(-12.0F, 0.01F, -0.5F, 12.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 0.0F, 0.0F, 0.0F, 2.2689F, 0.0F));

		PartDefinition antennaL = body.addOrReplaceChild("antennaL", CubeListBuilder.create().texOffs(14, 20).addBox(0.0F, -0.01F, -4.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -2.25F, -4.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition antennaR = body.addOrReplaceChild("antennaR", CubeListBuilder.create().texOffs(14, 34).addBox(-4.0F, 0.0F, -4.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -2.25F, -4.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition eyeL = body.addOrReplaceChild("eyeL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -2.4F, -3.0F, 1.5708F, -1.0472F, 0.0F));

		PartDefinition cube_r14 = eyeL.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, 0.1F, 0.0F, 3.1416F, 0.0F));

		PartDefinition eyeR = body.addOrReplaceChild("eyeR", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -2.4F, -3.0F, 1.5708F, 1.0472F, 0.0F));

		PartDefinition cube_r15 = eyeR.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(18, 8).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, 0.1F, 0.0F, 3.1416F, 0.0F));

		PartDefinition body2 = fossil.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 58).addBox(-1.5F, -2.4F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(19, 10).addBox(-0.5F, -2.35F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.0F, 0.0F, -2.6F, 0.0F, -1.8326F, 0.0F));

		PartDefinition cube_r16 = body2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, -0.5F, -0.2F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.85F, 2.25F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r17 = body2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, -0.5F, 0.2F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.25F, 3.5F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r18 = body2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 42).addBox(-8.25F, -2.7F, -2.5F, 8.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.0F, 0.0F, 1.0472F, 0.0F));

		PartDefinition cube_r19 = body2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 46).addBox(0.25F, -2.7F, -2.5F, 8.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.0F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube_r20 = body2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 54).addBox(1.5F, -2.7F, -4.0F, 7.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r21 = body2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -2.75F, -10.25F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.0F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r22 = body2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 34).addBox(-2.5F, -2.75F, -10.25F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r23 = body2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 50).addBox(-8.5F, -2.7F, -4.0F, 7.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition leg2R2 = body2.addOrReplaceChild("leg2R2", CubeListBuilder.create().texOffs(0, 8).addBox(-6.0F, -0.2F, -0.5F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -2.05F, -1.0F, 0.0F, -0.48F, 0.0F));

		PartDefinition leg2L2 = body2.addOrReplaceChild("leg2L2", CubeListBuilder.create().texOffs(0, 14).addBox(0.0F, -0.3F, -0.5F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.95F, -1.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition legL3 = body2.addOrReplaceChild("legL3", CubeListBuilder.create().texOffs(14, 25).addBox(0.0F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -2.2F, -2.0F, 0.0F, 1.4399F, 0.0F));

		PartDefinition legL4 = legL3.addOrReplaceChild("legL4", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.01F, -0.5F, 12.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 0.0F, 0.0F, 0.0F, -1.0036F, 0.0F));

		PartDefinition legR3 = body2.addOrReplaceChild("legR3", CubeListBuilder.create().texOffs(0, 28).addBox(-7.0F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -2.2F, -2.0F, 0.0F, -1.8762F, 0.0F));

		PartDefinition legR4 = legR3.addOrReplaceChild("legR4", CubeListBuilder.create().texOffs(0, 4).addBox(-12.0F, 0.01F, -0.5F, 12.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 0.0F, 0.0F, 0.0F, 2.138F, 0.0F));

		PartDefinition antennaL2 = body2.addOrReplaceChild("antennaL2", CubeListBuilder.create().texOffs(14, 20).addBox(0.0F, -0.01F, -4.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -2.25F, -4.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition antennaR2 = body2.addOrReplaceChild("antennaR2", CubeListBuilder.create().texOffs(14, 34).addBox(-4.0F, 0.0F, -4.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -2.25F, -4.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition eyeL2 = body2.addOrReplaceChild("eyeL2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -2.4F, -3.0F, 1.5708F, -1.0472F, 0.0F));

		PartDefinition cube_r24 = eyeL2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, 0.1F, 0.0F, 3.1416F, 0.0F));

		PartDefinition eyeR2 = body2.addOrReplaceChild("eyeR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -2.4F, -3.0F, 1.5708F, 1.0472F, 0.0F));

		PartDefinition cube_r25 = eyeR2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(18, 8).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, 0.1F, 0.0F, 3.1416F, 0.0F));

		return LayerDefinition.create(meshdefinition, 144, 90);
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