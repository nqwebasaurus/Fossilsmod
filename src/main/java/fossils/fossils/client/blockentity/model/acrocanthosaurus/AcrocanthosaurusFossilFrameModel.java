package fossils.fossils.client.blockentity.model.acrocanthosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AcrocanthosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Acrocanthosaurus;
	private final ModelPart hips;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart tail1;
	private final ModelPart bone;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public AcrocanthosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Acrocanthosaurus = this.fossil.getChild("Acrocanthosaurus");
		this.hips = this.Acrocanthosaurus.getChild("hips");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.tail1 = this.hips.getChild("tail1");
		this.bone = this.tail1.getChild("bone");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.3F, -6.0F, -0.5F, 1.0F, 37.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-9.2F, -31.0F, -28.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-2.7F, -8.0F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-9.2F, -31.0F, -28.0F, -0.3054F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(5.5F, -7.0F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -31.0F, 4.3F, -0.2269F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 1).addBox(-1.1F, -6.0F, -0.5F, 1.0F, 37.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.5F, -31.0F, 4.3F, 0.0F, 0.2269F, 0.0F));

		PartDefinition Acrocanthosaurus = fossil.addOrReplaceChild("Acrocanthosaurus", CubeListBuilder.create(), PartPose.offset(0.0F, -41.0F, 4.5F));

		PartDefinition hips = Acrocanthosaurus.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, -0.0903F, 0.2608F, -0.0233F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(25, 50).addBox(-0.5F, -0.9822F, -0.6026F, 1.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(6.5F, 0.0F, 0.3F, -0.6074F, 0.0705F, 0.111F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.7F, 0.0F, 1.2217F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 16.1472F, -1.4617F, -0.6963F, -0.0561F, -0.0669F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.5553F, -1.5739F, 0.6109F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -1.25F, -0.4326F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5F, 0.0F, 0.3F, 0.0967F, 0.0041F, -0.1973F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.7F, 0.0F, 0.9058F, 0.0408F, 0.0575F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 16.1472F, -1.4617F, -0.9205F, 0.0935F, 0.1829F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.5553F, -1.5739F, 0.3962F, 0.0015F, -0.0349F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -1.25F, -0.3453F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, 8.6F, -0.1314F, 0.0865F, -0.0114F));

		PartDefinition cube_r6 = tail1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(21, 28).addBox(0.0F, -0.9F, 0.1F, 1.0F, 2.0F, 16.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.1562F, 0.0709F, 0.1571F, 0.0F, 0.0F));

		PartDefinition bone = tail1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -8.0925F, 7.6858F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.6938F, 15.7709F, 0.2184F, 0.0426F, 0.0094F));

		PartDefinition cube_r7 = tail2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(33, 9).addBox(-0.5F, -0.9F, 0.0F, 1.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2627F, -0.0616F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0627F, 16.0384F, -0.0443F, -0.1744F, 0.0077F));

		PartDefinition cube_r8 = tail3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(43, 32).addBox(-0.5F, 1.1F, 0.2F, 1.0F, 2.0F, 15.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.059F, -0.4024F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.109F, 14.6976F, -0.0886F, -0.1739F, 0.0154F));

		PartDefinition cube_r9 = tail4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, 1.0F, -0.2F, 1.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6459F, 0.1329F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(57, 15).addBox(-0.5F, 0.3052F, -0.2213F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5041F, 15.9329F, -0.1839F, 0.0858F, -0.0159F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(53, 75).addBox(-0.5F, 0.8F, -0.3F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4448F, 12.8787F, -0.1329F, 0.173F, -0.023F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(45, 54).addBox(-0.5F, 0.6386F, -0.4016F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.15F, 10.0F, -0.3193F, 0.2909F, -0.0945F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(54, 0).addBox(-0.5F, -0.669F, -19.9704F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -5.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 83).addBox(-1.0F, 1.0F, -0.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.669F, -7.8704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.069F, -19.8704F, 0.131F, 0.0433F, 0.0057F));

		PartDefinition cube_r11 = chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(114, 52).addBox(-0.5F, -1.2141F, -0.0945F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.5F, -3.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r12 = chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(40, 69).addBox(-0.5F, -0.9F, 0.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, -12.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(8.0F, 9.2F, -10.7F, 0.2106F, 0.0059F, -0.056F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 5.0347F, 0.6893F, -1.0908F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 3.8693F, 0.2266F, 0.0F, 0.0F, 0.4363F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.0F, 9.2F, -10.7F, 0.2618F, -0.2618F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 5.0347F, 0.6893F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 3.8693F, 0.2266F, 0.0F, 0.0F, -0.4363F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6F, -12.0F, -0.6504F, -0.1915F, 0.0368F));

		PartDefinition cube_r13 = neck1.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(97, 14).addBox(-0.3F, -1.0F, 0.1F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 2.7415F, -5.052F, 0.3146F, -0.0304F, -0.0172F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7415F, -4.952F, 0.1095F, -0.2314F, -0.1578F));

		PartDefinition cube_r14 = neck2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(36, 81).addBox(-0.5F, 0.9F, -1.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7F, -6.3F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8572F, -7.4387F, 0.3514F, -0.4393F, -0.2005F));

		PartDefinition cube_r15 = neck3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(50, 87).addBox(0.0F, 0.8815F, -6.9683F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.1315F, -2.0346F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r16 = neck3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(36, 115).addBox(0.0F, 0.5F, -3.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.0685F, 1.3654F, -0.48F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6315F, -8.6346F, 0.3505F, -0.0791F, -0.037F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6718F, 0.2449F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6718F, 0.2449F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.6782F, 2.3449F, 0.5236F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 138, 138);
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