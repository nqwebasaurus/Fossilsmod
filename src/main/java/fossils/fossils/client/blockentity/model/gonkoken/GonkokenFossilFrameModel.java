package fossils.fossils.client.blockentity.model.gonkoken;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GonkokenFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart leftArm4;
	private final ModelPart leftArm7;
	private final ModelPart leftArm8;
	private final ModelPart opposablePinkie3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm7;
	private final ModelPart rightArm8;
	private final ModelPart opposablePinkie2;
	private final ModelPart chest3;
	private final ModelPart chest2;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart bone;
	private final ModelPart bone3;
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
	private final ModelPart tail8;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail9;

	public GonkokenFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body3 = this.body.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.leftArm4 = this.chest.getChild("leftArm4");
		this.leftArm7 = this.leftArm4.getChild("leftArm7");
		this.leftArm8 = this.leftArm7.getChild("leftArm8");
		this.opposablePinkie3 = this.leftArm8.getChild("opposablePinkie3");
		this.rightArm4 = this.chest.getChild("rightArm4");
		this.rightArm7 = this.rightArm4.getChild("rightArm7");
		this.rightArm8 = this.rightArm7.getChild("rightArm8");
		this.opposablePinkie2 = this.rightArm8.getChild("opposablePinkie2");
		this.chest3 = this.chest.getChild("chest3");
		this.chest2 = this.chest3.getChild("chest2");
		this.neck4 = this.chest2.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck5 = this.neck2.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.neck = this.neck6.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
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
		this.tail8 = this.hips.getChild("tail8");
		this.tail = this.tail8.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail9 = this.tail7.getChild("tail9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -8.2F, -31.2F, 0.0F, 0.0F, -1.3963F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-0.4F, -3.0F, -0.5F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.5F, -15.0F, -31.2F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-2.0F, -6.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -20.5F, 3.0F, -0.2182F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 21.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.5F, -20.5F, 3.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -21.6998F, 0.8126F, -0.1377F, 0.2175F, 0.0174F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(32, 0).addBox(-0.45F, 0.75F, 4.85F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4114F, -5.2615F, -0.1396F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(68, 51).addBox(-0.45F, 0.8F, -6.2F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8146F, -0.2962F, 0.0872F, -0.1309F, 0.0011F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create().texOffs(1, 55).addBox(-0.45F, -1.1554F, -7.0493F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.9847F, -6.0835F, -0.096F, 0.0F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -1.9956F, -6.9303F, 0.0612F, -0.0432F, -0.0065F));

		PartDefinition cube_r6 = body3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(74, 0).addBox(-0.45F, 0.6906F, -0.2631F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6401F, -5.8941F, 0.0785F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.4275F, -5.8865F, -0.3509F, -0.1278F, 0.0285F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(77, 74).addBox(-0.5F, -1.0F, 0.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.15F, 2.9219F, -3.2352F, 0.5242F, 0.0453F, 0.0262F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, 6.2418F, -2.3653F, -0.1309F, 0.0F, 0.0F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, 6.2418F, -2.3653F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm4 = chest.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(5.4921F, 17.9588F, -6.928F, 0.8838F, 0.0663F, -0.0455F));

		PartDefinition leftArm7 = leftArm4.addOrReplaceChild("leftArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.316F, 10.2404F, 1.6679F, -1.6156F, -0.4953F, -1.6017F));

		PartDefinition leftArm8 = leftArm7.addOrReplaceChild("leftArm8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2666F, 11.075F, -0.192F, 0.0276F, 0.0337F, 0.1753F));

		PartDefinition opposablePinkie3 = leftArm8.addOrReplaceChild("opposablePinkie3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1322F, -0.8271F, 0.6956F, 0.1222F, 0.0F, 0.0F));

		PartDefinition rightArm4 = chest.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.4921F, 17.9588F, -6.928F, 1.471F, -0.3533F, -0.057F));

		PartDefinition rightArm7 = rightArm4.addOrReplaceChild("rightArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.316F, 10.2404F, 1.6679F, -1.8633F, 0.6928F, 1.251F));

		PartDefinition rightArm8 = rightArm7.addOrReplaceChild("rightArm8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2666F, 11.075F, -0.192F, 0.0677F, -0.1614F, -0.1343F));

		PartDefinition opposablePinkie2 = rightArm8.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1322F, -0.8271F, 0.6956F, 0.1222F, 0.0F, 0.0F));

		PartDefinition chest3 = chest.addOrReplaceChild("chest3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8612F, -4.6119F, -0.0646F, -0.1335F, -0.0347F));

		PartDefinition cube_r8 = chest3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(70, 88).addBox(-0.525F, 0.8552F, -3.3381F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2F, 0.0F, 0.7243F, 0.0F, 0.0F));

		PartDefinition chest2 = chest3.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 2.8832F, -2.327F, 0.1747F, -0.043F, -0.0076F));

		PartDefinition cube_r9 = chest2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(20, 57).addBox(-0.5F, 0.9385F, -1.8546F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 2.943F, -3.7443F, 0.8203F, 0.0F, 0.0F));

		PartDefinition neck4 = chest2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 4.6509F, -4.2561F, 0.2112F, -0.128F, -0.0274F));

		PartDefinition cube_r10 = neck4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(104, 0).addBox(-0.5F, -1.1F, 2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.6772F, -3.6376F, 0.5411F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.2016F, -2.0737F, 0.7437F, -0.3923F, -0.199F));

		PartDefinition cube_r11 = neck3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(104, 34).addBox(-0.5F, -0.9487F, 6.3661F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(101, 31).addBox(-0.5F, -0.9487F, 2.6661F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.8164F, -6.3763F, -0.4712F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5735F, -3.3438F, -0.4497F, -0.0213F, 0.1557F));

		PartDefinition cube_r12 = neck2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(102, 79).addBox(-0.625F, -0.3F, 3.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(99, 76).addBox(-0.625F, -0.3F, -0.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1301F, -2.8537F, -2.9952F, -0.673F, -0.134F, -0.139F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7838F, -2.5662F, 0.4762F, -0.2129F, 0.0394F));

		PartDefinition cube_r13 = neck5.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(119, 12).addBox(-0.6F, -2.0F, -1.9F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.05F, -1.45F, -0.0206F, -0.0031F, -0.0872F, 0.035F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create().texOffs(123, 0).addBox(-0.5F, -2.7F, -1.975F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.2939F, 0.002F, -0.0519F, -0.1216F, 0.1811F));

		PartDefinition neck = neck6.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5632F, 0.2188F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r14 = neck.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(127, 16).addBox(-0.5F, 0.2F, -1.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4867F, -1.3451F, -0.2967F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1694F, -1.769F, 0.1212F, -0.3395F, -0.1081F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2997F, -2.37F, -2.4145F, 0.0F, 0.0F, 0.0436F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2997F, -2.37F, -2.4145F, 0.0F, 0.0F, -0.0436F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.3814F, -0.3747F, 0.2531F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7829F, 0.6012F, 4.4686F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7829F, 0.6012F, 4.4686F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 2.746F, 3.2778F, -1.625F, -0.2614F, 0.014F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 20.2036F, -0.4077F, 2.2253F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 21.4887F, -2.3122F, -1.7017F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.7201F, -0.1904F, 1.3609F, 0.0866F, -0.0107F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4765F, -2.7717F, -0.1403F, -0.0254F, 0.0137F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 2.746F, 3.2778F, -1.4916F, 0.1305F, 0.0103F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 20.2036F, -0.4077F, 2.4435F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 21.4887F, -2.3122F, -1.6144F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.7201F, -0.1904F, 0.7941F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.4765F, -2.7717F));

		PartDefinition tail8 = hips.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5241F, 8.3792F, -0.2629F, 0.0832F, -0.0266F));

		PartDefinition cube_r15 = tail8.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(74, 34).addBox(-0.5F, -1.125F, 1.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.8911F, -1.0954F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail = tail8.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0141F, 5.7948F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r16 = tail.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(1, 44).addBox(-0.5F, -1.175F, 7.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.9401F, -6.9786F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(25, 43).addBox(-0.5F, 0.4F, -0.3F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2599F, 8.0214F, 0.0077F, 0.1744F, 0.0443F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0057F, 8.8748F, 0.0564F, 0.172F, 0.0527F));

		PartDefinition cube_r17 = tail3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(12, 12).addBox(-0.5F, -0.3F, 13.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 0).addBox(-0.5F, -0.3F, -0.2F, 1.0F, 2.0F, 14.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7F, -0.5F, 0.0262F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(38, 63).addBox(-0.5F, 0.1F, 0.6F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0371F, 13.9019F, 0.033F, 0.1723F, 0.0916F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(57, 63).addBox(-0.5F, 0.1F, 0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0094F, 8.0654F, 0.0365F, 0.1294F, 0.048F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, 0.0753F, 0.2617F, 0.0082F));

		PartDefinition cube_r18 = tail6.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 65).addBox(-0.5F, 0.1F, -0.2F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0087F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(19, 67).addBox(-0.5F, 0.1F, -0.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(26, 74).addBox(-0.5F, 0.1F, 7.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, 0.0297F, 0.1742F, -0.01F));

		PartDefinition tail9 = tail7.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, 0.1F, -0.25F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0047F, 8.0006F, -0.0167F, 0.3485F, -0.0206F));

		return LayerDefinition.create(meshdefinition, 155, 155);
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