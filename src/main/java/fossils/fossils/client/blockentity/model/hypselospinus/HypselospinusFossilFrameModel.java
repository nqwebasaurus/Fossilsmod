package fossils.fossils.client.blockentity.model.hypselospinus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HypselospinusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg5;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg5;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart opposablePinkie;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart opposablePinkie2;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart heads;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public HypselospinusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg5 = this.leftLeg4.getChild("leftLeg5");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.rightLeg5 = this.rightLeg4.getChild("rightLeg5");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.opposablePinkie = this.leftArm3.getChild("opposablePinkie");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.opposablePinkie2 = this.rightArm3.getChild("opposablePinkie2");
		this.neck4 = this.chest.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.heads = this.neck.getChild("heads");
		this.jaw = this.heads.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -26.0F, 7.0F, 1.0F, 26.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-1.8F, -6.0F, -0.5F, 1.0F, 24.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.5F, -18.0F, -16.5F, 0.0F, 0.1047F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-1.5F, -7.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -18.0F, -16.5F, -0.1047F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(5.5F, -5.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -19.0F, 7.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -25.778F, 6.3237F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 33).addBox(-0.5F, 1.0F, 1.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4076F, -4.8257F, -0.1222F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, 0.4587F, 1.241F, 0.2531F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.6475F, -1.8549F, 0.8029F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.6662F, -0.9948F, -0.8727F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.8217F, 0.1167F, 0.4102F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0696F, -1.9933F, -0.2618F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, 0.4587F, 1.241F, -0.2705F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.6475F, -1.8549F, 0.8029F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.6662F, -0.9948F, -0.8727F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.8217F, 0.1167F, 0.4102F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0696F, -1.9933F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(26, 35).addBox(-0.5F, 0.329F, -7.9355F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.6123F, -3.8127F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(20, 46).addBox(-0.5F, 0.608F, -6.9179F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2481F, -7.931F, 0.2618F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8726F, -14.6793F, -0.131F, 0.0433F, -0.0057F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(68, 20).addBox(-0.5F, 1.0855F, 2.0911F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.0199F, -4.8724F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(38, 45).addBox(-0.5F, 0.0238F, -6.7611F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5199F, -2.4724F, 0.7592F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.7523F, 10.6437F, -1.6645F, 0.8893F, 0.1356F, -0.1363F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.523F, 7.1971F, 1.8766F, -0.8283F, 0.1788F, 0.0722F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.358F, 8.781F, -0.2268F, 0.2294F, 0.3165F, 0.1985F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0365F, 0.3564F, 0.6637F, 0.48F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.7523F, 10.6437F, -1.6645F, 0.3429F, -0.2878F, 0.3105F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.523F, 7.1971F, 1.8766F, -0.8856F, -0.299F, 0.0282F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.358F, 8.781F, -0.2268F, 0.5846F, -0.2204F, -0.5468F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0365F, 0.3564F, 0.6637F, 0.48F, 0.0F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.4632F, -6.9852F, -0.3499F, 0.0852F, -0.0189F));

		PartDefinition cube_r8 = neck4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(69, 48).addBox(-0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.9F, -4.1F, 0.5411F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8524F, -2.5106F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r9 = neck3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(78, 34).addBox(-0.5F, -1.0F, 0.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5477F, -3.8023F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4523F, -3.3023F, 0.1537F, 0.3262F, 0.2153F));

		PartDefinition cube_r10 = neck2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(52, 20).addBox(-0.5F, 0.878F, 0.66F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.9F, -4.3F, -0.5934F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.1F, -4.7F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r11 = neck.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(94, 67).addBox(-0.5F, 1.2F, 1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.8F, -0.2967F, 0.0F, 0.0F));

		PartDefinition heads = neck.addOrReplaceChild("heads", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2341F, -1.3186F, -0.6329F, 0.2569F, 0.0785F));

		PartDefinition jaw = heads.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.4266F, -0.2013F, 0.7505F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(1, 17).addBox(-0.5F, 0.1732F, -0.3252F, 1.0F, 2.0F, 13.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2076F, 5.9743F, -0.062F, -0.2589F, 0.0589F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(33, 0).addBox(-0.5F, 0.2F, -0.4F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1221F, 12.6761F, 0.1052F, -0.3083F, 0.0098F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 46).addBox(-0.5F, 0.2F, -0.3F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(7, 53).addBox(-0.5F, 0.2F, 7.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -0.043F, 8.741F, -0.063F, -0.351F, -0.022F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(46, 35).addBox(-0.5F, 0.2F, -0.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0015F, 7.8855F, -0.0789F, 0.4309F, -0.1123F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0253F, 6.9951F, -0.1415F, 0.3892F, -0.054F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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