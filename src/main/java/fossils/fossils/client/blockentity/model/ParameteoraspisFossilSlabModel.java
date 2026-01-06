package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ParameteoraspisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Parameteoraspis;
	private final ModelPart head2;
	private final ModelPart headleft;
	private final ModelPart headright;
	private final ModelPart headleft2;
	private final ModelPart body4;
	private final ModelPart body5;
	private final ModelPart body6;

	public ParameteoraspisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Parameteoraspis = this.fossil.getChild("Parameteoraspis");
		this.head2 = this.Parameteoraspis.getChild("head2");
		this.headleft = this.head2.getChild("headleft");
		this.headright = this.head2.getChild("headright");
		this.headleft2 = this.head2.getChild("headleft2");
		this.body4 = this.head2.getChild("body4");
		this.body5 = this.body4.getChild("body5");
		this.body6 = this.body5.getChild("body6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 35).addBox(5.0F, -0.5F, -18.9F, 10.0F, 1.0F, 31.0F, new CubeDeformation(-0.01F))
				.texOffs(52, 35).addBox(-15.0F, -0.5F, -12.6F, 21.0F, 1.0F, 23.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.153F, -0.5F, -1.2456F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 68).addBox(-0.1679F, -0.5F, -0.0568F, 21.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-17.9945F, -0.5F, -1.1872F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(56, 68).addBox(3.5F, -0.5F, 10.7F, 14.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5F, -2.5F, 0.0F, -0.7418F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-9.5F, -0.5F, -15.5F, 21.0F, 1.0F, 33.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -0.5F, -2.5F, 0.0F, -0.3054F, 0.0F));

		PartDefinition Parameteoraspis = fossil.addOrReplaceChild("Parameteoraspis", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, -9.0F));

		PartDefinition head2 = Parameteoraspis.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(13, 30).addBox(-1.99F, -0.37F, -7.75F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.3F, 0.0F));

		PartDefinition cube_r5 = head2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(76, 0).addBox(-3.0F, -0.5F, -5.5F, 6.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.55F, -0.5F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r6 = head2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(21, 16).addBox(-1.5F, -0.8F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3226F, -6.5093F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r7 = head2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 61).addBox(-5.0F, -1.1F, 0.25F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition headleft = head2.addOrReplaceChild("headleft", CubeListBuilder.create(), PartPose.offset(12.3F, -0.25F, 7.25F));

		PartDefinition cube_r8 = headleft.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(11, 3).addBox(-0.779F, -0.13F, -0.0665F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r9 = headleft.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 20).addBox(4.05F, -0.13F, 0.15F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, 0.0F, -1.7F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r10 = headleft.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(22, 3).addBox(3.1F, -0.14F, -1.15F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, 0.0F, -1.7F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r11 = headleft.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(89, 94).addBox(-3.9956F, -0.15F, -0.0028F, 4.0F, 0.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.4F, 0.05F, -7.7F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r12 = headleft.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(83, 64).addBox(-3.8762F, -0.263F, -0.1173F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.4F, 0.15F, -14.85F, 0.0F, 1.1519F, 0.0F));

		PartDefinition cube_r13 = headleft.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 68).addBox(-3.8249F, -0.26F, -0.0793F, 4.0F, 0.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-7.8F, 0.15F, -13.7F, 0.0F, 1.0297F, 0.0F));

		PartDefinition cube_r14 = headleft.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(77, 60).addBox(-6.929F, -0.25F, 0.0F, 7.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.1F, 0.15F, -12.8F, 0.0F, 0.8727F, 0.0F));

		PartDefinition cube_r15 = headleft.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(52, 60).addBox(-9.8173F, -0.16F, -0.1651F, 10.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8F, 0.05F, -10.7F, 0.0F, 0.6283F, 0.0F));

		PartDefinition headright = head2.addOrReplaceChild("headright", CubeListBuilder.create(), PartPose.offset(-12.3F, -0.25F, 7.25F));

		PartDefinition cube_r16 = headright.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(11, 3).mirror().addBox(-0.221F, -0.13F, -0.0665F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r17 = headright.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 20).mirror().addBox(-6.05F, -0.13F, 0.15F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.0F, 0.0F, -1.7F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r18 = headright.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(22, 3).mirror().addBox(-6.1F, -0.14F, -1.15F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.0F, 0.0F, -1.7F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r19 = headright.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(89, 94).mirror().addBox(-0.0044F, -0.15F, -0.0028F, 4.0F, 0.0F, 4.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(1.4F, 0.05F, -7.7F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r20 = headright.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(83, 64).mirror().addBox(-0.1238F, -0.263F, -0.1173F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(10.4F, 0.15F, -14.85F, 0.0F, -1.1519F, 0.0F));

		PartDefinition cube_r21 = headright.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-0.1751F, -0.26F, -0.0793F, 4.0F, 0.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(7.8F, 0.15F, -13.7F, 0.0F, -1.0297F, 0.0F));

		PartDefinition cube_r22 = headright.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(77, 60).mirror().addBox(-0.071F, -0.25F, 0.0F, 7.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.1F, 0.15F, -12.8F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r23 = headright.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(52, 60).mirror().addBox(-0.1827F, -0.16F, -0.1651F, 10.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.8F, 0.05F, -10.7F, 0.0F, -0.6283F, 0.0F));

		PartDefinition headleft2 = head2.addOrReplaceChild("headleft2", CubeListBuilder.create(), PartPose.offset(12.3F, -0.25F, 7.25F));

		PartDefinition cube_r24 = headleft2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(11, 0).addBox(-0.779F, -0.13F, -0.0665F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r25 = headleft2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 0).addBox(4.05F, -0.13F, 0.15F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, 0.0F, -1.7F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r26 = headleft2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(22, 0).addBox(3.1F, -0.14F, -1.15F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, 0.0F, -1.7F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r27 = headleft2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(91, 27).addBox(-3.9956F, -0.15F, -0.0028F, 4.0F, 0.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.4F, 0.05F, -7.7F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r28 = headleft2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(42, 83).addBox(-3.8762F, -0.263F, -0.1173F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.4F, 0.15F, -14.85F, 0.0F, 1.1519F, 0.0F));

		PartDefinition cube_r29 = headleft2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 30).addBox(-3.8249F, -0.26F, -0.0793F, 4.0F, 0.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-7.8F, 0.15F, -13.7F, 0.0F, 1.0297F, 0.0F));

		PartDefinition cube_r30 = headleft2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(52, 52).addBox(-6.929F, -0.25F, 0.0F, 7.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.1F, 0.15F, -12.8F, 0.0F, 0.8727F, 0.0F));

		PartDefinition cube_r31 = headleft2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(43, 87).mirror().addBox(-5.633F, -1.6071F, -4.4599F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.3F, 0.1714F, -8.3821F, 0.0841F, 0.0128F, -0.2616F));

		PartDefinition cube_r32 = headleft2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(43, 87).addBox(2.633F, -1.6071F, -4.4599F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.3F, 0.1714F, -8.3821F, 0.0841F, -0.0128F, 0.2616F));

		PartDefinition cube_r33 = headleft2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 56).addBox(-9.8173F, -0.16F, -0.1651F, 10.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8F, 0.05F, -10.7F, 0.0F, 0.6283F, 0.0F));

		PartDefinition body4 = head2.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(60, 77).addBox(-3.99F, 0.0F, -0.4F, 8.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(11, 0).addBox(-0.49F, -0.452F, 0.8477F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 45).addBox(-2.49F, -0.1316F, 0.5459F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 4.4F, 0.0F, -0.1745F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(76, 13).addBox(-3.5F, 0.1F, -0.1F, 7.0F, 1.0F, 10.0F, new CubeDeformation(-0.001F))
				.texOffs(92, 60).addBox(-0.51F, -0.3205F, 0.5171F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 83).addBox(-1.5F, -0.0713F, 0.7393F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 7.8F, 0.0F, -0.2618F, 0.0F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(21, 10).addBox(-0.49F, -0.05F, -0.01F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(76, 25).addBox(-2.5F, 0.4F, 0.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 9.4F, 0.0F, -0.3042F, -0.0275F));

		return LayerDefinition.create(meshdefinition, 144, 100);
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