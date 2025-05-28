package fossils.fossils.client.blockentity.model.klamelisaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class KlamelisaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftFoot;
	private final ModelPart leftFoot2;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightFoot;
	private final ModelPart rightFoot2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart neck7;
	private final ModelPart neck6;
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;

	public KlamelisaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftFoot = this.leftLeg2.getChild("leftFoot");
		this.leftFoot2 = this.leftFoot.getChild("leftFoot2");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightFoot = this.rightLeg2.getChild("rightFoot");
		this.rightFoot2 = this.rightFoot.getChild("rightFoot2");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.neck7 = this.chest.getChild("neck7");
		this.neck6 = this.neck7.getChild("neck6");
		this.neck5 = this.neck6.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, -40.0F, 14.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 46.0F, 6.0F, 0.0F, 0.0F, 1.0036F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(-7, 100).addBox(-0.5F, -0.5F, -12.0F, 1.0F, 1.0F, 26.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.3859F, 0.9147F, -1.5708F, -0.2094F, -1.5708F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(8, 116).addBox(-0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3422F, 1.3306F, -1.7802F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 107).addBox(-0.5F, -4.2F, 0.2F, 1.0F, 5.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8F, -7.4F, -0.2094F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(15.5F, -1.3F, 0.0F, -0.1061F, 0.1107F, 0.4039F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.7F, 31.5159F, -0.177F, 0.7732F, -0.1576F, 0.1514F));

		PartDefinition leftFoot = leftLeg2.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 21.1765F, 1.4434F, 0.0436F, -0.0015F, 0.0349F));

		PartDefinition leftFoot2 = leftFoot.addOrReplaceChild("leftFoot2", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, -7.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-15.5F, -1.3F, 0.0F, -0.5934F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.7F, 31.5159F, -0.177F, 1.4221F, -0.0403F, 0.0167F));

		PartDefinition rightFoot = rightLeg2.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 21.1765F, 1.4434F, 0.0051F, 0.3237F, 0.305F));

		PartDefinition rightFoot2 = rightFoot.addOrReplaceChild("rightFoot2", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, -7.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.7F, -7.4F, 0.0F, 0.0F, -0.1571F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, -32.0F, 1.0F, 5.0F, 35.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -1.6F, -0.3752F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.3F, -31.6F, 0.0154F, 0.1739F, -0.1296F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(78, -4).addBox(5.7203F, -0.5F, -12.9658F, 1.0F, 1.0F, 26.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1456F, 17.9088F, -16.4409F, -1.6146F, 0.3653F, 1.6778F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(75, -7).addBox(-0.1456F, -0.5F, -19.7932F, 1.0F, 1.0F, 29.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1456F, 17.9088F, -16.4409F, -1.9286F, -0.0873F, 0.0F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(82, 0).addBox(-0.5F, -1.0F, -22.0F, 1.0F, 5.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3578F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(12.0F, 24.45F, -18.5F, 0.3458F, -0.0521F, 0.8345F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 24.9487F, 0.2168F, -0.6981F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, 15.8963F, -2.6258F, 0.8116F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-10.0F, 23.45F, -18.5F, 0.3049F, -0.0663F, 0.5286F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 24.9487F, 0.2168F, -1.414F, -0.08F, -0.1306F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, 15.8963F, -2.6258F, 1.2479F, 0.0F, 0.0F));

		PartDefinition neck7 = chest.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.0F, -18.0F, -0.0718F, 0.12F, -0.2253F));

		PartDefinition cube_r8 = neck7.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(85, 40).addBox(-0.5F, 0.7969F, -1.65F, 1.0F, 4.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -15.1F, -15.2F, -0.733F, 0.0F, 0.0F));

		PartDefinition neck6 = neck7.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -14.0F, -17.0F, -0.0296F, 0.1275F, -0.2288F));

		PartDefinition cube_r9 = neck6.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(82, 68).addBox(-0.5F, 0.6245F, -0.5866F, 1.0F, 4.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -21.0F, -8.0F, -1.1345F, 0.0F, 0.0F));

		PartDefinition neck5 = neck6.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -20.0F, -8.0F, 0.0842F, 0.1745F, -0.105F));

		PartDefinition cube_r10 = neck5.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 41).addBox(-0.5F, 0.681F, -0.2796F, 1.0F, 3.0F, 33.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -33.5F, -4.2F, -1.4312F, 0.0024F, -0.0173F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -34.0F, -5.0F, 0.1638F, 0.1742F, -0.062F));

		PartDefinition cube_r11 = neck4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(46, 0).addBox(-0.5F, 1.2329F, -0.2956F, 1.0F, 2.0F, 31.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -30.0F, -2.0F, -1.4573F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -30.0F, -3.0F, 0.1309F, 0.1396F, 0.0F));

		PartDefinition cube_r12 = neck3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(116, 0).addBox(-0.5F, 0.9064F, -0.0733F, 1.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -17.2F, -5.4F, -1.2305F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -17.0F, -6.0F, 0.2269F, 0.1571F, 0.0F));

		PartDefinition cube_r13 = neck2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(139, 0).addBox(-0.5F, 0.933F, -0.0558F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.8F, -6.8F, -0.9599F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.0F, -7.0F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r14 = neck.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(163, 25).addBox(-0.5F, 0.9342F, -0.0316F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.5F, -4.9F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r15 = neck.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(185, 134).addBox(-0.5F, 0.3F, -0.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.9F, -7.1F, -0.4538F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.0F, -7.0F, 0.0242F, -0.0316F, 0.1271F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.7F, 0.7F, 0.6109F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 78).addBox(-0.5F, -0.2491F, 0.0696F, 1.0F, 4.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4F, 12.9F, -0.3627F, -0.1221F, -0.4532F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(48, 62).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 25.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 24.0F, -0.0678F, -0.2213F, -0.1502F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, 25.0F, -0.0271F, -0.4532F, -0.2486F));

		PartDefinition cube_r16 = tail3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(76, 125).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6493F, 2.9289F, 0.0F, 0.0F, 0.0698F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, 15.0F, -0.0852F, -0.396F, -0.1403F));

		PartDefinition cube_r17 = tail4.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(109, 103).addBox(-0.5F, 1.0F, -1.1F, 1.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.1222F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, 21.0F, -0.1241F, -0.4537F, 0.0085F));

		PartDefinition cube_r18 = tail5.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(114, 67).addBox(-0.5F, 0.2F, -0.3F, 1.0F, 1.0F, 19.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(55, 122).addBox(-0.5F, 0.3F, -0.6F, 1.0F, 1.0F, 17.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 19.0F, 0.3549F, 0.6603F, 0.068F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(33, 119).addBox(-0.5F, 0.2F, -0.7F, 1.0F, 1.0F, 18.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 17.0F, -0.1041F, 0.5282F, -0.1907F));

		return LayerDefinition.create(meshdefinition, 208, 208);
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
