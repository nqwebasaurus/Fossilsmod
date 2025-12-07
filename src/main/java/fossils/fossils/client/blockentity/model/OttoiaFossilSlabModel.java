package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class OttoiaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart tail;
	private final ModelPart body18;
	private final ModelPart body17;
	private final ModelPart body16;
	private final ModelPart body15;
	private final ModelPart body14;
	private final ModelPart body13;
	private final ModelPart body12;
	private final ModelPart body11;
	private final ModelPart body10;
	private final ModelPart body9;
	private final ModelPart body8;
	private final ModelPart body7;
	private final ModelPart body6;
	private final ModelPart body5;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart body2;
	private final ModelPart body1;
	private final ModelPart head;
	private final ModelPart mouth;
	private final ModelPart mouth2;

	public OttoiaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.tail = this.fossil.getChild("tail");
		this.body18 = this.tail.getChild("body18");
		this.body17 = this.body18.getChild("body17");
		this.body16 = this.body17.getChild("body16");
		this.body15 = this.body16.getChild("body15");
		this.body14 = this.body15.getChild("body14");
		this.body13 = this.body14.getChild("body13");
		this.body12 = this.body13.getChild("body12");
		this.body11 = this.body12.getChild("body11");
		this.body10 = this.body11.getChild("body10");
		this.body9 = this.body10.getChild("body9");
		this.body8 = this.body9.getChild("body8");
		this.body7 = this.body8.getChild("body7");
		this.body6 = this.body7.getChild("body6");
		this.body5 = this.body6.getChild("body5");
		this.body4 = this.body5.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.body2 = this.body3.getChild("body2");
		this.body1 = this.body2.getChild("body1");
		this.head = this.body1.getChild("head");
		this.mouth = this.head.getChild("mouth");
		this.mouth2 = this.mouth.getChild("mouth2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(69, 32).addBox(-0.2198F, -0.5F, 0.316F, 10.0F, 1.0F, 16.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-20.023F, -0.5F, 14.3719F, 0.0F, 0.5585F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-14.9F, -0.5F, -17.5F, 29.0F, 1.0F, 30.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(2.4244F, -0.5F, 14.7169F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 32).addBox(-0.1679F, -0.5F, -16.0568F, 18.0F, 1.0F, 32.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-17.9945F, -0.5F, -1.1872F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 66).addBox(-11.5F, -0.5F, -9.5F, 23.0F, 1.0F, 17.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.214F, -0.5F, -1.2193F, 0.0F, -2.2689F, 0.0F));

		PartDefinition tail = fossil.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(15, 0).addBox(0.0F, 2.0F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(20, 17).addBox(-0.05F, -1.0F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -1.0F, -4.8F, 3.098F, 0.0F, 1.5708F));

		PartDefinition body18 = tail.addOrReplaceChild("body18", CubeListBuilder.create().texOffs(10, 0).addBox(-0.09F, -3.0F, -2.01F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition body17 = body18.addOrReplaceChild("body17", CubeListBuilder.create().texOffs(83, 50).addBox(-0.04F, -2.0F, -2.4F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition body16 = body17.addOrReplaceChild("body16", CubeListBuilder.create().texOffs(0, 44).addBox(-0.09F, -3.0F, -3.51F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition body15 = body16.addOrReplaceChild("body15", CubeListBuilder.create().texOffs(0, 0).addBox(-0.11F, -3.0F, -4.5F, 0.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition body14 = body15.addOrReplaceChild("body14", CubeListBuilder.create().texOffs(10, 4).addBox(-0.09F, -3.0F, -4.51F, 0.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition body13 = body14.addOrReplaceChild("body13", CubeListBuilder.create().texOffs(0, 13).addBox(-0.13F, -3.0F, -4.5F, 0.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition body12 = body13.addOrReplaceChild("body12", CubeListBuilder.create().texOffs(10, 17).addBox(-0.09F, -3.0F, -4.51F, 0.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition body11 = body12.addOrReplaceChild("body11", CubeListBuilder.create().texOffs(10, 35).addBox(-0.12F, -2.0F, -4.5F, 0.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body11.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 32).addBox(0.0F, -1.0F, -4.5F, 0.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -1.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition body10 = body11.addOrReplaceChild("body10", CubeListBuilder.create().texOffs(0, 66).addBox(-0.09F, -2.0F, -3.51F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition body9 = body10.addOrReplaceChild("body9", CubeListBuilder.create().texOffs(15, 47).addBox(-0.1F, -2.0F, -3.6F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(27, 17).addBox(-0.2F, -1.9564F, -0.3019F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition body8 = body9.addOrReplaceChild("body8", CubeListBuilder.create().texOffs(69, 50).addBox(-0.09F, -2.0F, -2.81F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition body7 = body8.addOrReplaceChild("body7", CubeListBuilder.create().texOffs(0, 55).addBox(-0.12F, -2.0F, -2.5F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body7.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(27, 5).addBox(0.0F, -1.5F, -0.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.5F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition body6 = body7.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(72, 72).addBox(-0.09F, -2.0F, -2.51F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body6.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(16, 17).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.19F, -0.5F, -0.01F, -0.0698F, 0.0F, 0.0F));

		PartDefinition body5 = body6.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(77, 55).addBox(-0.13F, -2.0F, -2.5F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition body4 = body5.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(78, 66).addBox(-0.09F, -2.0F, -2.51F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(13, 17).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.19F, 0.5F, -0.01F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(78, 80).addBox(-0.12F, -2.0F, -2.5F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(10, 17).addBox(-0.2F, -2.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 13).addBox(0.01F, -2.0F, -2.01F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition body1 = body2.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.01F, -3.0F, -2.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3F, -0.1F, 0.1745F, 0.0F, 0.0F));

		PartDefinition head = body1.addOrReplaceChild("head", CubeListBuilder.create().texOffs(20, 32).addBox(-0.11F, -4.0F, -2.5F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(64, 66).addBox(0.0F, -4.0F, -3.0F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(25, 0).addBox(-0.12F, -4.01F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(5, 0).addBox(0.0F, 2.3F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.08F, -4.4296F, 1.3937F, -1.9635F, 0.0F, 0.0F));

		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.08F, -4.3063F, 2.8025F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(10, 0).addBox(0.0F, -0.5F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.08F, -4.3679F, 2.0981F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 13).addBox(0.03F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.11F, -4.6F, -1.5F, 0.5236F, 0.0F, 0.0F));

		PartDefinition mouth = head.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(20, 0).addBox(-0.1F, -6.0F, -1.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 0.0F));

		PartDefinition mouth2 = mouth.addOrReplaceChild("mouth2", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition cube_r13 = mouth2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(22, 7).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.13F, -3.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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