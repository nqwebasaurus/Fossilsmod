package fossils.fossils.client.blockentity.model.ornatops;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class OrnatopsFossilFrameModel extends SkullModelBase {
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
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public OrnatopsFossilFrameModel(ModelPart root) {
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
		this.leftFace = this.heads.getChild("leftFace");
		this.rightFace = this.heads.getChild("rightFace");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -39.0F, 2.2F, 1.0F, 45.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 18.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(1.9F, -7.45F, -0.5F, 1.0F, 40.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.5F, -26.55F, -28.3F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-5.95F, -4.5F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -26.55F, -28.3F, 0.2182F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(4.7F, -8.0F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -32.0F, 2.7F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -39.1666F, 3.3439F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(34, 53).addBox(-0.5F, 0.9F, 1.0F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4114F, -5.2615F, -0.1396F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(6.5F, 1.4219F, 0.131F, -0.3142F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 19.4952F, 0.4663F, 0.7418F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 19.2315F, -1.3948F, -0.6109F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.4414F, -0.3063F, 0.4451F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1995F, -4.5791F, -0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5F, 1.4219F, 0.131F, -0.096F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 19.4952F, 0.4663F, 1.0036F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 19.2315F, -1.3948F, -0.6109F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.4414F, -0.3063F, 0.4451F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1995F, -4.5791F, -0.2182F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(63, 37).addBox(-0.5F, 0.2661F, -10.0274F, 1.0F, 2.0F, 11.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.7114F, -5.2632F, -0.0175F, -0.0873F, 0.0015F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(1, 69).addBox(-0.5F, 0.9034F, -8.0741F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6339F, -9.9274F, 0.1571F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2161F, -17.9746F, -0.219F, -0.0852F, 0.0189F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(103, 45).addBox(-0.5F, 0.9552F, -0.0381F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.2579F, -3.5104F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(87, 87).addBox(-0.5F, 0.9135F, -1.1546F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 4.8579F, -6.8104F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(63, 51).addBox(-0.5F, 0.9369F, -8.9239F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7081F, -7.6365F, 1.1868F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.1591F, 19.2059F, -3.4503F, 1.1734F, 0.0072F, -0.0364F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6294F, 8.6365F, 1.5062F, -1.4303F, 0.9045F, -1.1025F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2276F, 12.7369F, -0.2626F, 0.4074F, 0.2391F, 0.635F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1321F, 0.1729F, 0.6956F, 0.1222F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.1591F, 19.2059F, -3.4503F, 0.5189F, -0.0072F, 0.0364F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6294F, 8.6365F, 1.5062F, -1.4375F, -0.8612F, 1.1119F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2276F, 12.7369F, -0.2626F, 0.3863F, -0.2729F, -0.5518F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1321F, 0.1729F, 0.6956F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.4779F, -9.7815F, 0.1891F, 0.3588F, 0.2717F));

		PartDefinition cube_r9 = neck4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(88, 96).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.6772F, -3.6376F, 0.5411F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5772F, -3.4376F, 0.3529F, 0.346F, 0.1392F));

		PartDefinition cube_r10 = neck3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(88, 35).addBox(-0.5F, -1.0487F, -0.5339F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.7F, -5.6F, -0.4712F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.4F, -4.7F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r11 = neck2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(108, 0).addBox(-0.5F, 0.6982F, 6.2419F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -6.6263F, -7.1488F, -0.6807F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9991F, -2.6096F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r12 = neck.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(108, 7).addBox(-0.5F, 0.2F, -2.6F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7867F, -1.2451F, -0.2967F, 0.0F, 0.0F));

		PartDefinition heads = neck.addOrReplaceChild("heads", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0366F, -3.3024F, -0.048F, 0.329F, -0.0296F));

		PartDefinition leftFace = heads.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.5F, -2.0417F, 0.306F));

		PartDefinition rightFace = heads.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.5F, -2.0417F, 0.306F));

		PartDefinition jaw = heads.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.7006F, 0.6661F, 0.6545F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8886F, 7.3385F, -0.0886F, -0.1739F, 0.0154F));

		PartDefinition cube_r13 = tail.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(1, 19).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 15.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.4099F, -0.0798F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(33, 37).addBox(-0.5F, 0.4F, -0.5F, 1.0F, 2.0F, 13.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2099F, 14.9202F, 0.0542F, -0.2614F, -0.014F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(34, 18).addBox(-0.5F, 0.3F, -0.7F, 1.0F, 2.0F, 16.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 12.9F, -0.0452F, -0.2615F, 0.0117F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(37, 0).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0397F, 15.0011F, 0.0F, 0.3927F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 1.0F, 17.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0052F, 15.0608F, 0.0F, 0.6109F, 0.0F));

		return LayerDefinition.create(meshdefinition, 144, 144);
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