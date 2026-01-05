package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AnguillavusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart anguillavus;
	private final ModelPart frontLeftFin;
	private final ModelPart frontRightFin;
	private final ModelPart jaw;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart backLeftFin;
	private final ModelPart backRightFin;
	private final ModelPart body4;
	private final ModelPart body5;
	private final ModelPart body6;
	private final ModelPart body7;
	private final ModelPart anguillavus2;
	private final ModelPart frontLeftFin2;
	private final ModelPart frontRightFin2;
	private final ModelPart jaw2;
	private final ModelPart body8;
	private final ModelPart body9;
	private final ModelPart body10;
	private final ModelPart backLeftFin2;
	private final ModelPart backRightFin2;
	private final ModelPart body11;
	private final ModelPart body12;
	private final ModelPart body13;
	private final ModelPart body14;
	private final ModelPart matrix;

	public AnguillavusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.anguillavus = this.fossil.getChild("anguillavus");
		this.frontLeftFin = this.anguillavus.getChild("frontLeftFin");
		this.frontRightFin = this.anguillavus.getChild("frontRightFin");
		this.jaw = this.anguillavus.getChild("jaw");
		this.body = this.anguillavus.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.backLeftFin = this.body3.getChild("backLeftFin");
		this.backRightFin = this.body3.getChild("backRightFin");
		this.body4 = this.body3.getChild("body4");
		this.body5 = this.body4.getChild("body5");
		this.body6 = this.body5.getChild("body6");
		this.body7 = this.body6.getChild("body7");
		this.anguillavus2 = this.fossil.getChild("anguillavus2");
		this.frontLeftFin2 = this.anguillavus2.getChild("frontLeftFin2");
		this.frontRightFin2 = this.anguillavus2.getChild("frontRightFin2");
		this.jaw2 = this.anguillavus2.getChild("jaw2");
		this.body8 = this.anguillavus2.getChild("body8");
		this.body9 = this.body8.getChild("body9");
		this.body10 = this.body9.getChild("body10");
		this.backLeftFin2 = this.body10.getChild("backLeftFin2");
		this.backRightFin2 = this.body10.getChild("backRightFin2");
		this.body11 = this.body10.getChild("body11");
		this.body12 = this.body11.getChild("body12");
		this.body13 = this.body12.getChild("body13");
		this.body14 = this.body13.getChild("body14");
		this.matrix = this.fossil.getChild("matrix");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition anguillavus = fossil.addOrReplaceChild("anguillavus", CubeListBuilder.create().texOffs(65, 51).addBox(-1.5F, -1.747F, 1.4652F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(59, 72).addBox(-0.5F, -1.747F, -2.2598F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F))
				.texOffs(74, 63).addBox(0.5F, -1.747F, -0.5098F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(14, 74).addBox(-1.5F, -1.747F, -0.5098F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(14.8361F, 0.647F, -0.6578F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r1 = anguillavus.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(7, 74).addBox(0.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.247F, -0.5098F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r2 = anguillavus.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(74, 67).addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -1.247F, -0.5098F, 0.0F, 0.5236F, 0.0F));

		PartDefinition frontLeftFin = anguillavus.addOrReplaceChild("frontLeftFin", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, 0.503F, 1.4652F, -0.6127F, 0.3644F, -0.2455F));

		PartDefinition frontRightFin = anguillavus.addOrReplaceChild("frontRightFin", CubeListBuilder.create().texOffs(31, 78).addBox(2.225F, -0.5F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.503F, 1.4652F, 0.3491F, 0.0F, -1.5708F));

		PartDefinition jaw = anguillavus.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.378F, -0.2598F));

		PartDefinition body = anguillavus.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 44).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, -0.247F, 3.9652F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(17, 44).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.5F, 0.0F, -0.0175F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 4.7F, 0.0436F, -0.0873F, 0.0F));

		PartDefinition cube_r3 = body3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(49, 44).addBox(-0.462F, 0.0F, -0.1334F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.5F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition backLeftFin = body3.addOrReplaceChild("backLeftFin", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 1.0F, 1.5F, -0.7691F, 0.3446F, -0.4024F));

		PartDefinition backRightFin = body3.addOrReplaceChild("backRightFin", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 1.0F, 1.5F, -0.7691F, -0.3446F, 0.4024F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2175F, 4.6565F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r4 = body4.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(34, 44).addBox(-0.4719F, -0.0018F, -0.0926F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, -1.5175F, 0.0435F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.251F, 4.7656F, 0.0436F, -0.2182F, 0.0F));

		PartDefinition cube_r5 = body5.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(52, 58).addBox(1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.0415F, 0.0279F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(26, 59).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0028F, -0.116F, 4.6884F, -0.0873F, -0.2618F, 0.0F));

		PartDefinition body7 = body6.addOrReplaceChild("body7", CubeListBuilder.create(), PartPose.offset(0.0F, -0.05F, 5.0F));

		PartDefinition anguillavus2 = fossil.addOrReplaceChild("anguillavus2", CubeListBuilder.create().texOffs(70, 72).addBox(0.5F, -1.747F, 1.4652F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(76, 56).addBox(0.5F, 0.253F, -0.5098F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F))
				.texOffs(22, 73).addBox(0.475F, -0.322F, -2.2598F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(77, 44).addBox(0.5F, -0.322F, -0.5098F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-5.3953F, 0.372F, -16.566F, 0.3927F, 0.0F, -1.5708F));

		PartDefinition cube_r6 = anguillavus2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(7, 78).addBox(1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.525F, -1.2294F, -0.4667F, 0.4669F, 0.0F, 0.0F));

		PartDefinition cube_r7 = anguillavus2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(76, 60).addBox(-0.4F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.925F, -0.2634F, -0.4829F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r8 = anguillavus2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(31, 73).addBox(0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.025F, -1.747F, 1.4652F, 0.2618F, 0.0F, 0.0F));

		PartDefinition frontLeftFin2 = anguillavus2.addOrReplaceChild("frontLeftFin2", CubeListBuilder.create().texOffs(26, 78).addBox(0.025F, -0.5F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.503F, 1.4652F, -0.6545F, 0.0F, 0.0F));

		PartDefinition frontRightFin2 = anguillavus2.addOrReplaceChild("frontRightFin2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, 0.503F, 1.4652F, -0.6127F, -0.3644F, 0.2455F));

		PartDefinition jaw2 = anguillavus2.addOrReplaceChild("jaw2", CubeListBuilder.create().texOffs(14, 78).addBox(0.975F, -0.125F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 0.378F, -0.2598F));

		PartDefinition body8 = anguillavus2.addOrReplaceChild("body8", CubeListBuilder.create().texOffs(0, 51).addBox(0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, -0.247F, 3.9652F));

		PartDefinition cube_r9 = body8.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(38, 73).addBox(1.475F, 0.0F, -3.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2819F, 4.5048F, 0.2182F, 0.0F, 0.0F));

		PartDefinition body9 = body8.addOrReplaceChild("body9", CubeListBuilder.create().texOffs(13, 51).addBox(0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body9.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(52, 65).addBox(1.45F, 0.0F, -5.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, 5.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition body10 = body9.addOrReplaceChild("body10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.475F, 0.0F, 4.7F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body10.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 74).addBox(1.975F, -1.475F, -3.3F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.2809F, 5.0389F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r12 = body10.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(39, 59).addBox(1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 1.5F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r13 = body10.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(65, 56).addBox(2.975F, -1.0F, 0.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(26, 51).addBox(2.0F, 0.0F, 0.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.5F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition backLeftFin2 = body10.addOrReplaceChild("backLeftFin2", CubeListBuilder.create().texOffs(48, 66).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0F, 1.5F, -1.0908F, 0.0F, 0.0F));

		PartDefinition backRightFin2 = body10.addOrReplaceChild("backRightFin2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 1.0F, 1.5F, -0.7691F, -0.3446F, 0.4024F));

		PartDefinition body11 = body10.addOrReplaceChild("body11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2175F, 4.6565F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r14 = body11.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(26, 66).addBox(2.975F, -0.5F, 0.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 1.0825F, 0.0435F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r15 = body11.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 60).addBox(1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.0825F, 0.0435F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r16 = body11.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(63, 65).addBox(2.0F, -1.0F, 0.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(39, 51).addBox(1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, -1.5175F, 0.0435F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body12 = body11.addOrReplaceChild("body12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.475F, -0.251F, 4.7656F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r17 = body12.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(48, 72).addBox(2.475F, 0.0F, 0.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -2.0377F, 0.115F, -0.1091F, 0.0F, 0.0F));

		PartDefinition cube_r18 = body12.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(52, 51).addBox(1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.0415F, 0.0279F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r19 = body12.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(11, 67).addBox(2.475F, -0.2F, 4.8F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(64, 44).addBox(1.5F, -1.0F, 4.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.0F, 1.3335F, -4.7221F, 0.0698F, 0.0F, 0.0F));

		PartDefinition body13 = body12.addOrReplaceChild("body13", CubeListBuilder.create().texOffs(13, 60).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.0085F, 4.6779F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r20 = body13.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 67).addBox(0.45F, -1.05F, 0.25F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, 0.0F, 0.1353F, 0.0F, 0.0F));

		PartDefinition cube_r21 = body13.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(37, 66).addBox(0.45F, -0.05F, 0.25F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition body14 = body13.addOrReplaceChild("body14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.05F, 5.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r22 = body14.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(21, 78).addBox(0.475F, -2.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.6F, -0.7854F, 0.0F, 0.0F));

		PartDefinition matrix = fossil.addOrReplaceChild("matrix", CubeListBuilder.create().texOffs(0, 0).addBox(-15.0F, -2.0F, -22.0F, 36.0F, 1.0F, 42.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 1.0F, 1.0F));

		return LayerDefinition.create(meshdefinition, 160, 85);
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