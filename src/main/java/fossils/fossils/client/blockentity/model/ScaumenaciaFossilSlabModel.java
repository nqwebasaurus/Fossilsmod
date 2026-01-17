package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ScaumenaciaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart pectoralfinR;
	private final ModelPart body2;
	private final ModelPart pelvicfinR;
	private final ModelPart body3;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart bodyfront;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart body4;
	private final ModelPart pectoralfinL2;
	private final ModelPart body5;
	private final ModelPart pelvicfinL2;
	private final ModelPart body6;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart bodyfront2;
	private final ModelPart head2;
	private final ModelPart jaw2;

	public ScaumenaciaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.pectoralfinR = this.body.getChild("pectoralfinR");
		this.body2 = this.body.getChild("body2");
		this.pelvicfinR = this.body2.getChild("pelvicfinR");
		this.body3 = this.body2.getChild("body3");
		this.tail = this.body3.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.bodyfront = this.body.getChild("bodyfront");
		this.head = this.bodyfront.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.body4 = this.fossil.getChild("body4");
		this.pectoralfinL2 = this.body4.getChild("pectoralfinL2");
		this.body5 = this.body4.getChild("body5");
		this.pelvicfinL2 = this.body5.getChild("pelvicfinL2");
		this.body6 = this.body5.getChild("body6");
		this.tail3 = this.body6.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.bodyfront2 = this.body4.getChild("bodyfront2");
		this.head2 = this.bodyfront2.getChild("head2");
		this.jaw2 = this.head2.getChild("jaw2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 57).addBox(-30.3407F, -1.0F, -0.4908F, 30.0F, 6.0F, 27.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-28.3F, -5.0F, -8.6F, 0.0F, 1.7366F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-4.6509F, 0.0F, 4.1253F, 9.0F, 5.0F, 14.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 91).addBox(-20.6509F, -1.0F, -1.8747F, 16.0F, 6.0F, 21.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-16.0F, -5.0F, -24.5F, 0.0F, 0.9948F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-13.0F, 2.0F, -28.5F, 26.0F, 3.0F, 53.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(9.0F, -5.0F, 0.5F, 0.0F, 0.48F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 20).addBox(-2.5F, -1.375F, -6.5F, 5.0F, 7.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(14, 40).addBox(0.0F, -3.125F, -3.5F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, -3.125F, 9.5F, -3.098F, 0.0F, 1.5708F));

		PartDefinition pectoralfinR = body.addOrReplaceChild("pectoralfinR", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6F, 3.625F, -6.2F, 0.3042F, -0.004F, 0.0262F));

		PartDefinition cube_r4 = pectoralfinR.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(85, 91).addBox(-3.0F, -1.0F, 0.0F, 0.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(106, 0).addBox(-2.0F, -2.025F, -1.0F, 4.0F, 5.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(94, 112).addBox(0.0F, -7.0F, -1.0F, 0.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.625F, 5.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(106, 42).addBox(-1.5F, 0.175F, -0.5F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition pelvicfinR = body2.addOrReplaceChild("pelvicfinR", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9F, 2.75F, 3.0F, -0.0881F, 0.1719F, -0.0398F));

		PartDefinition cube_r6 = pelvicfinR.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 57).addBox(-3.0F, -1.75F, 0.0F, 2.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(28, 119).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 91).addBox(-0.01F, -7.5F, 0.0F, 0.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 7.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(118, 69).addBox(0.0F, -0.75F, -0.5F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition tail = body3.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5F, 3.0F));

		PartDefinition cube_r8 = tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, -1.5F, -0.75F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(106, 14).addBox(0.0F, -0.5F, -0.75F, 0.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offset(0.0F, -2.75F, 9.65F));

		PartDefinition cube_r9 = tail2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(118, 81).addBox(0.0F, -1.5F, 10.25F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.75F, -9.65F, 0.2618F, 0.0F, 0.0F));

		PartDefinition bodyfront = body.addOrReplaceChild("bodyfront", CubeListBuilder.create().texOffs(74, 91).addBox(-2.0F, -2.0F, -4.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.625F, -6.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bodyfront.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(35, 22).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -4.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r11 = bodyfront.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(85, 106).addBox(-1.5F, -1.05F, 4.55F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -1.0F, -8.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition head = bodyfront.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 25).addBox(-3.0F, -0.55F, -2.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offset(1.5F, -1.0F, -4.0F));

		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(13, 119).addBox(-3.0F, 1.1F, 0.65F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(31, 44).addBox(-3.0F, 0.1F, -0.35F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(41, 119).addBox(-3.0F, -1.0F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 2.0F, -0.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(56, 119).addBox(-1.0F, 0.0F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 2.0F, -0.3F));

		PartDefinition body4 = fossil.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(88, 57).addBox(-2.5F, -1.375F, -6.5F, 5.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-17.6F, -6.125F, -12.5F, 0.3491F, 0.0F, -1.5708F));

		PartDefinition cube_r14 = body4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(118, 14).addBox(0.0F, -1.0F, -4.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.125F, 0.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition pectoralfinL2 = body4.addOrReplaceChild("pectoralfinL2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 3.625F, -6.2F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r15 = pectoralfinL2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(24, 29).addBox(0.0F, -1.0F, 0.0F, 3.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(102, 98).addBox(-2.0F, -2.025F, -1.0F, 4.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.625F, 5.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r16 = body5.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(33, 0).addBox(0.0F, -2.5F, -4.0F, 0.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5F, 3.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r17 = body5.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(75, 106).addBox(0.0F, -3.0F, -4.5F, 0.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -4.0F, 11.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r18 = body5.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 72).addBox(-1.5F, 0.475F, -1.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition pelvicfinL2 = body5.addOrReplaceChild("pelvicfinL2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9F, 2.75F, 3.0F, 0.1309F, 0.0436F, 0.0F));

		PartDefinition cube_r19 = pelvicfinL2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 128).addBox(-1.0F, -0.75F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 127).addBox(-1.0F, -0.75F, 1.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 97).addBox(-1.0F, -1.75F, 2.0F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(22, 127).addBox(-1.0F, -0.75F, 7.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 127).addBox(-1.0F, -0.75F, 8.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(0, 119).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 7.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r20 = body6.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(111, 57).addBox(0.0F, -1.5F, -4.0F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9898F, 3.2547F, -2.9234F, 0.0F, -3.1416F));

		PartDefinition tail3 = body6.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5F, 3.0F));

		PartDefinition cube_r21 = tail3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(104, 80).addBox(-0.5F, -1.5F, -0.75F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r22 = tail3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(106, 28).addBox(0.0F, -1.0F, -5.5F, 0.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2536F, 4.7176F, 2.8798F, 0.0F, -3.1416F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offset(0.0F, -2.75F, 9.65F));

		PartDefinition cube_r23 = tail4.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.5F, -3.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6453F, 2.8897F, 2.8798F, 0.0F, -3.1416F));

		PartDefinition bodyfront2 = body4.addOrReplaceChild("bodyfront2", CubeListBuilder.create().texOffs(111, 112).addBox(-2.0F, -2.0F, -4.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.625F, -6.5F, 0.0886F, 0.1739F, 0.0154F));

		PartDefinition cube_r24 = bodyfront2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(88, 77).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -4.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r25 = bodyfront2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(118, 28).addBox(-1.5F, -1.05F, 4.55F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -1.0F, -8.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition head2 = bodyfront2.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(0, 20).addBox(-3.0F, -0.55F, -2.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offset(1.5F, -1.0F, -4.0F));

		PartDefinition cube_r26 = head2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(54, 106).addBox(-3.0F, 1.1F, 0.65F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(23, 20).addBox(-3.0F, 0.1F, -0.35F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r27 = head2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(69, 106).addBox(-3.0F, -1.0F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 2.0F, -0.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition jaw2 = head2.addOrReplaceChild("jaw2", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, 0.0F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 2.0F, -0.3F, -0.3054F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 160, 130);
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