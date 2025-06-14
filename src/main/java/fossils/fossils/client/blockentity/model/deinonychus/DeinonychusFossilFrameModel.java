package fossils.fossils.client.blockentity.model.deinonychus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DeinonychusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Deinonychus;
	private final ModelPart hips;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart leftFinger;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart rightFinger;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftSickleClaw;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightSickleClaw;
	private final ModelPart rightToes;

	public DeinonychusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Deinonychus = this.fossil.getChild("Deinonychus");
		this.hips = this.Deinonychus.getChild("hips");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.leftFinger = this.leftHand.getChild("leftFinger");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.rightFinger = this.rightHand.getChild("rightFinger");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftLeg1 = this.Deinonychus.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftSickleClaw = this.leftFoot.getChild("leftSickleClaw");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.Deinonychus.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightSickleClaw = this.rightFoot.getChild("rightSickleClaw");
		this.rightToes = this.rightFoot.getChild("rightToes");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.1F, -3.0F, -0.5F, 1.0F, 20.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, -16.6F, -16.0F, 0.0F, -0.1047F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(0.2F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, -16.6F, -16.0F, 0.1047F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(0.85F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, -17.35F, -5.3F, -0.0349F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -1.65F, -0.5F, 1.0F, 19.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, -17.35F, -5.3F, 0.0F, 0.0349F, 0.0F));

		PartDefinition Deinonychus = fossil.addOrReplaceChild("Deinonychus", CubeListBuilder.create(), PartPose.offset(0.0F, -19.0F, -6.25F));

		PartDefinition hips = Deinonychus.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(31, 13).addBox(-0.5F, 0.7F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.1F, -1.35F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 3.5F, 0.176F, -0.1289F, -0.0229F));

		PartDefinition cube_r6 = tail1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(-1, -1).addBox(-0.5F, 0.2F, 0.4F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.1191F, -0.1029F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(-2, 17).addBox(-0.5F, 0.4916F, -0.3257F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.4309F, 6.8971F, 0.1942F, -0.1726F, -0.0261F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5F, 0.1605F, 0.1122F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.3416F, 12.9743F, 0.096F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.4286F, -0.3954F, 1.0F, 1.0F, 17.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.1895F, 12.0122F, -0.2545F, -0.1291F, 0.0217F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.75F, -1.25F, 0.0437F, -0.0436F, -0.0019F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, 0.6286F, 0.2735F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.45F, -4.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(45, 11).addBox(-0.5F, 0.75F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.05F, -7.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.35F, -6.9F, 0.3494F, -0.041F, -0.0149F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(20, 6).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.4339F, -3.9914F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0474F, 2.7395F, -2.4157F, 0.9188F, 0.1396F, -0.3903F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0941F, 4.6353F, -0.6475F, -2.0512F, 0.0387F, -0.0202F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 4.5F, -0.5F, 0.886F, -0.2748F, 0.218F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0474F, 2.7395F, -2.4157F, -0.0861F, -0.0696F, 0.2183F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0941F, 4.6353F, -0.6475F, -1.5276F, -0.0387F, 0.0202F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 4.5F, -0.5F, 0.7343F, 0.3108F, -0.3105F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.258F, -0.045F, -0.1687F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1661F, -3.6914F, -0.5477F, -0.2031F, -0.0791F));

		PartDefinition cube_r10 = neck1.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(34, 44).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.4208F, -2.9F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1292F, -2.8F, -0.3124F, -0.2079F, 0.0666F));

		PartDefinition cube_r11 = neck2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, 0.6F, 1.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.805F, -4.8573F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.655F, -4.0573F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r12 = neck3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(45, 31).addBox(-0.5F, 0.7F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.1069F, -2.7077F, -0.0524F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7137F, -3.7587F, 0.2182F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7548F, 0.6772F, -0.2783F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = Deinonychus.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 0.5F, 0.9F, -0.1739F, 0.0151F, 0.0859F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.1052F, 0.2362F, 1.6148F, -0.1308F, -0.0057F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.0946F, 0.178F, -0.8722F, -0.0334F, -0.0281F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.7934F, -0.3088F, 1.0472F, 0.0F, 0.0F));

		PartDefinition leftSickleClaw = leftFoot.addOrReplaceChild("leftSickleClaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -0.3491F, 0.3054F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.0F, -2.5F, 0.3491F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = Deinonychus.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 0.5F, 0.9F, -0.8271F, -0.0643F, -0.059F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.1052F, 0.2362F, 1.1759F, 0.1264F, -0.0341F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.0946F, 0.178F, -0.4744F, -0.0327F, 0.182F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 3.7934F, -0.3088F, 0.4367F, 0.0395F, 0.0184F));

		PartDefinition rightSickleClaw = rightFoot.addOrReplaceChild("rightSickleClaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, -0.6981F, -0.3054F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.0F, -2.5F, -0.2618F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 80, 80);
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