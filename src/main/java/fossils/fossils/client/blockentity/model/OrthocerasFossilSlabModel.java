package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class OrthocerasFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart shellbase;
	private final ModelPart shellbasebottom;
	private final ModelPart shellbasetop;
	private final ModelPart shell1;
	private final ModelPart shell2;
	private final ModelPart shell3;
	private final ModelPart shell4;
	private final ModelPart shell5;
	private final ModelPart shell6;
	private final ModelPart shell7;
	private final ModelPart shell8;
	private final ModelPart shell9;
	private final ModelPart shell10;
	private final ModelPart shell11;
	private final ModelPart shelltip;
	private final ModelPart shell10top;
	private final ModelPart shell10bottom;
	private final ModelPart shell9top;
	private final ModelPart shell9bottom;
	private final ModelPart shell8top;
	private final ModelPart shell8bottom;
	private final ModelPart shell7top;
	private final ModelPart shell7bottom;
	private final ModelPart shell6top;
	private final ModelPart shell6bottom;
	private final ModelPart shell5top;
	private final ModelPart shell5bottom;
	private final ModelPart shell4top;
	private final ModelPart shell4bottom;
	private final ModelPart shell3top;
	private final ModelPart shell3bottom;
	private final ModelPart shell2top;
	private final ModelPart shell2bottom;
	private final ModelPart shell1top;
	private final ModelPart shell1bottom;

	public OrthocerasFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.shellbase = this.root.getChild("shellbase");
		this.shellbasebottom = this.shellbase.getChild("shellbasebottom");
		this.shellbasetop = this.shellbase.getChild("shellbasetop");
		this.shell1 = this.shellbase.getChild("shell1");
		this.shell2 = this.shell1.getChild("shell2");
		this.shell3 = this.shell2.getChild("shell3");
		this.shell4 = this.shell3.getChild("shell4");
		this.shell5 = this.shell4.getChild("shell5");
		this.shell6 = this.shell5.getChild("shell6");
		this.shell7 = this.shell6.getChild("shell7");
		this.shell8 = this.shell7.getChild("shell8");
		this.shell9 = this.shell8.getChild("shell9");
		this.shell10 = this.shell9.getChild("shell10");
		this.shell11 = this.shell10.getChild("shell11");
		this.shelltip = this.shell11.getChild("shelltip");
		this.shell10top = this.shell10.getChild("shell10top");
		this.shell10bottom = this.shell10.getChild("shell10bottom");
		this.shell9top = this.shell9.getChild("shell9top");
		this.shell9bottom = this.shell9.getChild("shell9bottom");
		this.shell8top = this.shell8.getChild("shell8top");
		this.shell8bottom = this.shell8.getChild("shell8bottom");
		this.shell7top = this.shell7.getChild("shell7top");
		this.shell7bottom = this.shell7.getChild("shell7bottom");
		this.shell6top = this.shell6.getChild("shell6top");
		this.shell6bottom = this.shell6.getChild("shell6bottom");
		this.shell5top = this.shell5.getChild("shell5top");
		this.shell5bottom = this.shell5.getChild("shell5bottom");
		this.shell4top = this.shell4.getChild("shell4top");
		this.shell4bottom = this.shell4.getChild("shell4bottom");
		this.shell3top = this.shell3.getChild("shell3top");
		this.shell3bottom = this.shell3.getChild("shell3bottom");
		this.shell2top = this.shell2.getChild("shell2top");
		this.shell2bottom = this.shell2.getChild("shell2bottom");
		this.shell1top = this.shell1.getChild("shell1top");
		this.shell1bottom = this.shell1.getChild("shell1bottom");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(102, 69).addBox(-7.0F, -6.0F, -72.0F, 14.0F, 6.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(73, 126).addBox(-5.0F, -5.0F, -76.0F, 10.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(87, 95).addBox(-7.0F, -6.0F, 32.0F, 14.0F, 6.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(126, 24).addBox(-5.0F, -5.0F, 41.0F, 10.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(51, 69).addBox(-8.0F, -7.0F, 18.0F, 16.0F, 7.0F, 18.0F, new CubeDeformation(0.0F))
				.texOffs(59, 43).addBox(-10.0F, -7.0F, 0.0F, 20.0F, 7.0F, 18.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-12.0F, -7.0F, -27.0F, 24.0F, 7.0F, 27.0F, new CubeDeformation(0.0F))
				.texOffs(0, 35).addBox(-10.0F, -7.0F, -45.0F, 20.0F, 7.0F, 18.0F, new CubeDeformation(0.0F))
				.texOffs(0, 61).addBox(-8.0F, -7.0F, -63.0F, 16.0F, 7.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition shellbase = root.addOrReplaceChild("shellbase", CubeListBuilder.create().texOffs(76, 0).addBox(-6.5F, -2.1018F, -0.1047F, 13.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 19.2F, 34.4F, -3.0718F, 0.0F, 3.1416F));

		PartDefinition shellbasebottom = shellbase.addOrReplaceChild("shellbasebottom", CubeListBuilder.create(), PartPose.offset(0.0F, 5.5F, 10.0F));

		PartDefinition shellbasetop = shellbase.addOrReplaceChild("shellbasetop", CubeListBuilder.create().texOffs(38, 95).addBox(-5.5F, 3.3982F, -10.1047F, 11.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(0, 42).addBox(-0.5F, 3.0982F, -3.1047F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.5F, 10.0F));

		PartDefinition shell1 = shellbase.addOrReplaceChild("shell1", CubeListBuilder.create().texOffs(0, 87).addBox(-6.0F, -2.1F, 0.0F, 12.0F, 5.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 12.6F, -0.0698F, 0.0F, 0.0F));

		PartDefinition shell2 = shell1.addOrReplaceChild("shell2", CubeListBuilder.create().texOffs(90, 22).addBox(-5.5F, -2.0003F, 0.0367F, 11.0F, 4.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 13.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition shell3 = shell2.addOrReplaceChild("shell3", CubeListBuilder.create().texOffs(81, 111).addBox(-5.0F, -1.9003F, 0.0297F, 10.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 13.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition shell4 = shell3.addOrReplaceChild("shell4", CubeListBuilder.create().texOffs(114, 116).addBox(-4.5F, -2.1002F, 0.0175F, 9.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.4F, 11.0F));

		PartDefinition shell5 = shell4.addOrReplaceChild("shell5", CubeListBuilder.create().texOffs(118, 40).addBox(-4.0F, -2.6F, 0.0F, 8.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.4F, 10.0F));

		PartDefinition shell6 = shell5.addOrReplaceChild("shell6", CubeListBuilder.create().texOffs(126, 13).addBox(-3.5F, -2.1F, 0.0F, 7.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 10.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition shell7 = shell6.addOrReplaceChild("shell7", CubeListBuilder.create().texOffs(123, 131).addBox(-3.0F, -1.6F, 0.0F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.2F, 8.0F));

		PartDefinition shell8 = shell7.addOrReplaceChild("shell8", CubeListBuilder.create().texOffs(136, 54).addBox(-2.5F, -1.1F, 0.0F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.4F, 7.0F));

		PartDefinition shell9 = shell8.addOrReplaceChild("shell9", CubeListBuilder.create().texOffs(43, 139).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition shell10 = shell9.addOrReplaceChild("shell10", CubeListBuilder.create().texOffs(0, 35).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.4F, 7.0F));

		PartDefinition shell11 = shell10.addOrReplaceChild("shell11", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.1F, 5.0F));

		PartDefinition shelltip = shell11.addOrReplaceChild("shelltip", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 3.0F));

		PartDefinition shell10top = shell10.addOrReplaceChild("shell10top", CubeListBuilder.create().texOffs(59, 35).addBox(-1.0F, 0.5F, -10.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.5F, 10.0F));

		PartDefinition shell10bottom = shell10.addOrReplaceChild("shell10bottom", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5F, 10.0F));

		PartDefinition shell9top = shell9.addOrReplaceChild("shell9top", CubeListBuilder.create().texOffs(74, 95).addBox(-1.5F, 0.0F, -10.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 10.0F));

		PartDefinition shell9bottom = shell9.addOrReplaceChild("shell9bottom", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 10.0F));

		PartDefinition shell8top = shell8.addOrReplaceChild("shell8top", CubeListBuilder.create().texOffs(66, 139).addBox(-2.0F, 0.4F, -10.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.5F, 10.0F));

		PartDefinition shell8bottom = shell8.addOrReplaceChild("shell8bottom", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5F, 10.0F));

		PartDefinition shell7top = shell7.addOrReplaceChild("shell7top", CubeListBuilder.create().texOffs(18, 139).addBox(-2.5F, 0.4F, -10.0F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, 10.0F));

		PartDefinition shell7bottom = shell7.addOrReplaceChild("shell7bottom", CubeListBuilder.create(), PartPose.offset(0.0F, 2.0F, 10.0F));

		PartDefinition shell6top = shell6.addOrReplaceChild("shell6top", CubeListBuilder.create().texOffs(94, 131).addBox(-3.0F, 0.4F, -10.0F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 6).addBox(-0.5F, 0.2F, -10.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.5F, 10.0F));

		PartDefinition shell6bottom = shell6.addOrReplaceChild("shell6bottom", CubeListBuilder.create(), PartPose.offset(0.0F, 2.5F, 10.0F));

		PartDefinition shell5top = shell5.addOrReplaceChild("shell5top", CubeListBuilder.create().texOffs(124, 101).addBox(-3.5F, 0.4F, -10.0F, 7.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(68, 110).addBox(-0.5F, 0.2F, -10.0F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 10.0F));

		PartDefinition shell5bottom = shell5.addOrReplaceChild("shell5bottom", CubeListBuilder.create(), PartPose.offset(0.0F, 3.0F, 10.0F));

		PartDefinition shell4top = shell4.addOrReplaceChild("shell4top", CubeListBuilder.create().texOffs(0, 121).addBox(-4.0F, 1.3998F, -9.9825F, 8.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 133).addBox(-1.0F, 1.1998F, -9.9825F, 2.0F, 0.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(82, 136).addBox(-0.5F, 0.9998F, -9.9825F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.5F, 10.0F));

		PartDefinition shell4bottom = shell4.addOrReplaceChild("shell4bottom", CubeListBuilder.create(), PartPose.offset(0.0F, 3.5F, 10.0F));

		PartDefinition shell3top = shell3.addOrReplaceChild("shell3top", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 1.8997F, -9.9703F, 2.0F, 0.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(0, 12).addBox(-0.5F, 1.6998F, -9.9668F, 1.0F, 0.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(116, 0).addBox(-4.5F, 2.0997F, -9.9703F, 9.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, 10.0F));

		PartDefinition shell3bottom = shell3.addOrReplaceChild("shell3bottom", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, 10.0F));

		PartDefinition shell2top = shell2.addOrReplaceChild("shell2top", CubeListBuilder.create().texOffs(0, 106).addBox(-5.0F, 2.4997F, -9.9633F, 10.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(24, 125).addBox(-1.0F, 2.2997F, -9.9633F, 2.0F, 0.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(125, 85).addBox(-0.5F, 2.0997F, -9.9599F, 1.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.5F, 10.0F));

		PartDefinition shell2bottom = shell2.addOrReplaceChild("shell2bottom", CubeListBuilder.create(), PartPose.offset(0.0F, 4.5F, 10.0F));

		PartDefinition shell1top = shell1.addOrReplaceChild("shell1top", CubeListBuilder.create().texOffs(34, 110).addBox(-5.0F, 2.9F, -10.0F, 10.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(55, 125).addBox(-1.0F, 2.8F, -10.0F, 2.0F, 0.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(42, 125).addBox(-0.5F, 2.6001F, -7.993F, 1.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 10.0F));

		PartDefinition shell1bottom = shell1.addOrReplaceChild("shell1bottom", CubeListBuilder.create(), PartPose.offset(0.0F, 5.0F, 10.0F));

		return LayerDefinition.create(meshdefinition, 160, 160);
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