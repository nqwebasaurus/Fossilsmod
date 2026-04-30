package fossils.fossils.client.blockentity.model.panochthus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PanochthusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftArm7;
	private final ModelPart leftArm6;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightArm7;
	private final ModelPart rightArm6;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart body2;
	private final ModelPart body5;
	private final ModelPart body;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart leftSygomaticarch;
	private final ModelPart rightSygomaticarch;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public PanochthusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone2 = this.hips.getChild("bone2");
		this.bone4 = this.hips.getChild("bone4");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftArm7 = this.leftLeg3.getChild("leftArm7");
		this.leftArm6 = this.leftArm7.getChild("leftArm6");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightArm7 = this.rightLeg3.getChild("rightArm7");
		this.rightArm6 = this.rightArm7.getChild("rightArm6");
		this.body4 = this.hips.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.body2 = this.body3.getChild("body2");
		this.body5 = this.body2.getChild("body5");
		this.body = this.body5.getChild("body");
		this.bone = this.body.getChild("bone");
		this.bone3 = this.body.getChild("bone3");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.leftSygomaticarch = this.head.getChild("leftSygomaticarch");
		this.rightSygomaticarch = this.head.getChild("rightSygomaticarch");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -21.2608F, 7.7124F, 0.4385F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(62, 109).addBox(-0.5F, -0.525F, -0.95F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.4322F, -5.1098F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(90, 103).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -0.8366F, -1.407F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(66, 75).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.015F, 0.9344F, -1.696F, -0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(92, 81).addBox(-0.5F, -3.3002F, 1.8237F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2672F, -0.5033F, -1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(68, 97).addBox(-0.5F, -2.8159F, -1.5173F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2672F, -0.5033F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 83).addBox(-0.5F, -1.0924F, -7.8164F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0378F, 2.952F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 111).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -5.2941F, -1.7524F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(19, 123).addBox(-0.5F, -6.5127F, 1.7044F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.2672F, -0.5033F, -1.9373F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(38, 108).addBox(-0.5F, -0.7011F, 4.3991F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.2672F, -0.5033F, -0.9338F, 0.0F, 0.0F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.8565F, 4.7946F, -2.9189F));

		PartDefinition cube_r10 = bone2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(47, 111).addBox(-1.9F, -1.8F, -1.1F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.1565F, -10.5138F, -1.9777F, -0.1332F, 0.0419F, 0.3026F));

		PartDefinition cube_r11 = bone2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(63, 118).addBox(-1.25F, -0.2F, -2.15F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.4979F, -12.1122F, -1.3481F, -0.6136F, 0.5242F, -0.263F));

		PartDefinition cube_r12 = bone2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(52, 124).addBox(-0.3F, -1.15F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2441F, -5.0645F, -2.801F, -1.7132F, 0.0709F, 0.0263F));

		PartDefinition cube_r13 = bone2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(123, 128).addBox(-0.5F, -0.425F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1383F, -6.9665F, -2.6683F, -1.8492F, -0.0052F, -0.1309F));

		PartDefinition cube_r14 = bone2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(44, 141).addBox(-0.5F, -0.55F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(140, 83).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7968F, -11.2129F, -2.5631F, -1.5874F, -0.0052F, -0.4363F));

		PartDefinition cube_r15 = bone2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(130, 45).addBox(-1.0F, -0.8F, -1.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6085F, -9.8469F, -2.5117F, -1.3256F, -0.0052F, -0.4363F));

		PartDefinition cube_r16 = bone2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(116, 128).addBox(-1.0F, -0.8F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6085F, -9.8469F, -2.5117F, -1.6311F, -0.0052F, -0.4363F));

		PartDefinition cube_r17 = bone2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(97, 88).addBox(-0.9623F, -0.1781F, -3.9918F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1969F, -8.1427F, -2.05F, -1.7707F, -0.0052F, -0.4363F));

		PartDefinition cube_r18 = bone2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(128, 108).addBox(-0.5077F, 0.6889F, -1.5435F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1082F, -6.7384F, -1.2196F, -1.5874F, -0.0052F, -0.1309F));

		PartDefinition cube_r19 = bone2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(77, 144).addBox(-0.5F, 0.5114F, 0.1118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1836F, -4.1541F, -1.0811F, -2.8996F, 0.0257F, 0.165F));

		PartDefinition cube_r20 = bone2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(140, 54).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5188F, -5.3991F, -1.5406F, -2.9664F, 0.0169F, -0.0972F));

		PartDefinition cube_r21 = bone2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(52, 135).addBox(-0.5F, -2.312F, -0.0835F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1836F, -4.1541F, -1.0811F, -2.4196F, 0.0257F, 0.165F));

		PartDefinition cube_r22 = bone2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(75, 89).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1129F, -3.0239F, 2.0917F, -1.6749F, 0.166F, 0.0735F));

		PartDefinition cube_r23 = bone2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(64, 84).addBox(-0.5F, -2.3F, -1.6F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0793F, -1.5918F, 2.8045F, -1.1018F, 0.1695F, 0.1087F));

		PartDefinition cube_r24 = bone2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(59, 93).addBox(-0.5885F, -6.4662F, 1.0622F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.0F, 0.6F, -2.6F, -0.8836F, 0.1695F, 0.1087F));

		PartDefinition cube_r25 = bone2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(144, 73).addBox(-0.5F, -0.9F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(141, 32).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.1426F, 5.2951F, 0.0722F, -0.2291F, 0.1695F, 0.1087F));

		PartDefinition cube_r26 = bone2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(30, 141).addBox(-0.5F, 0.0F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.9633F, 4.8953F, 0.8599F, -1.1454F, 0.1695F, 0.1087F));

		PartDefinition cube_r27 = bone2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(124, 123).addBox(-0.5F, -0.8F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9633F, 3.7465F, 0.1317F, -1.6254F, 0.1695F, 0.1087F));

		PartDefinition cube_r28 = bone2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(123, 112).addBox(-0.5F, -1.45F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.7973F, 2.7064F, 0.4369F, -2.2799F, 0.1695F, 0.1087F));

		PartDefinition cube_r29 = bone2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(123, 96).addBox(-0.5885F, -4.5153F, 2.5622F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.6F, -2.6F, -1.0581F, 0.1695F, 0.1087F));

		PartDefinition cube_r30 = bone2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(29, 136).addBox(-1.0614F, -3.3651F, -2.039F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(24, 136).addBox(-1.0614F, -3.3651F, -1.539F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0539F, -1.9246F, 4.8904F, -0.5412F, -0.1613F, -0.0675F));

		PartDefinition cube_r31 = bone2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(110, 119).addBox(-1.0614F, -2.9027F, -1.7858F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0539F, -1.9246F, 4.8904F, -0.9339F, -0.1613F, -0.0675F));

		PartDefinition cube_r32 = bone2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(103, 119).addBox(-1.0614F, -2.8328F, -0.6686F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0539F, -1.9246F, 4.8904F, -1.2394F, -0.1613F, -0.0675F));

		PartDefinition cube_r33 = bone2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(38, 119).addBox(-1.0614F, -3.1275F, -0.127F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0539F, -1.9246F, 4.8904F, -1.7193F, -0.1613F, -0.0675F));

		PartDefinition cube_r34 = bone2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(89, 110).addBox(-0.5F, -4.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.237F, 2.4627F, 3.5011F, -0.744F, 0.1695F, 0.1087F));

		PartDefinition cube_r35 = bone2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(125, 6).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2256F, 3.1533F, -1.2931F, -1.6871F, 0.1753F, 0.1284F));

		PartDefinition cube_r36 = bone2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(103, 140).addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1097F, 2.8367F, -0.8732F, -1.2944F, 0.1753F, 0.1284F));

		PartDefinition cube_r37 = bone2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(108, 85).addBox(-0.4842F, -3.405F, -1.6245F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.6F, -2.6F, -1.4288F, 0.1069F, 0.2185F));

		PartDefinition cube_r38 = bone2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(79, 97).addBox(-0.5F, -0.5F, -3.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3684F, -1.7339F, -1.4106F, -1.007F, 0.2346F, 0.2235F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.8565F, 4.7946F, -2.9189F));

		PartDefinition cube_r39 = bone4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(47, 111).mirror().addBox(-0.1F, -1.8F, -1.1F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(2.1565F, -10.5138F, -1.9777F, -0.1332F, -0.0419F, -0.3026F));

		PartDefinition cube_r40 = bone4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(63, 118).mirror().addBox(-0.75F, -0.2F, -2.15F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.4979F, -12.1122F, -1.3481F, -0.6136F, -0.5242F, 0.263F));

		PartDefinition cube_r41 = bone4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(52, 124).mirror().addBox(-0.7F, -1.15F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2441F, -5.0645F, -2.801F, -1.7132F, -0.0709F, -0.0263F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(123, 128).mirror().addBox(-0.5F, -0.425F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1383F, -6.9665F, -2.6683F, -1.8492F, 0.0052F, 0.1309F));

		PartDefinition cube_r43 = bone4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(44, 141).mirror().addBox(-0.5F, -0.55F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(140, 83).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7968F, -11.2129F, -2.5631F, -1.5874F, 0.0052F, 0.4363F));

		PartDefinition cube_r44 = bone4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(130, 45).mirror().addBox(0.0F, -0.8F, -1.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.6085F, -9.8469F, -2.5117F, -1.3256F, 0.0052F, 0.4363F));

		PartDefinition cube_r45 = bone4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(116, 128).mirror().addBox(0.0F, -0.8F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6085F, -9.8469F, -2.5117F, -1.6311F, 0.0052F, 0.4363F));

		PartDefinition cube_r46 = bone4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(97, 88).mirror().addBox(-0.0377F, -0.1781F, -3.9918F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1969F, -8.1427F, -2.05F, -1.7707F, 0.0052F, 0.4363F));

		PartDefinition cube_r47 = bone4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(128, 108).mirror().addBox(-0.4923F, 0.6889F, -1.5435F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.1082F, -6.7384F, -1.2196F, -1.5874F, 0.0052F, 0.1309F));

		PartDefinition cube_r48 = bone4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(77, 144).mirror().addBox(-0.5F, 0.5114F, 0.1118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1836F, -4.1541F, -1.0811F, -2.8996F, -0.0257F, -0.165F));

		PartDefinition cube_r49 = bone4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(140, 54).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5188F, -5.3991F, -1.5406F, -2.9664F, -0.0169F, 0.0972F));

		PartDefinition cube_r50 = bone4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(52, 135).mirror().addBox(-0.5F, -2.312F, -0.0835F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.1836F, -4.1541F, -1.0811F, -2.4196F, -0.0257F, -0.165F));

		PartDefinition cube_r51 = bone4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(75, 89).mirror().addBox(-0.5F, -0.2F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1129F, -3.0239F, 2.0917F, -1.6749F, -0.166F, -0.0735F));

		PartDefinition cube_r52 = bone4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(64, 84).mirror().addBox(-0.5F, -2.3F, -1.6F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0793F, -1.5918F, 2.8045F, -1.1018F, -0.1695F, -0.1087F));

		PartDefinition cube_r53 = bone4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(59, 93).mirror().addBox(-0.4115F, -6.4662F, 1.0622F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.6F, -2.6F, -0.8836F, -0.1695F, -0.1087F));

		PartDefinition cube_r54 = bone4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(144, 73).mirror().addBox(-0.5F, -0.9F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(141, 32).mirror().addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.1426F, 5.2951F, 0.0722F, -0.2291F, -0.1695F, -0.1087F));

		PartDefinition cube_r55 = bone4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(30, 141).mirror().addBox(-0.5F, 0.0F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.9633F, 4.8953F, 0.8599F, -1.1454F, -0.1695F, -0.1087F));

		PartDefinition cube_r56 = bone4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(124, 123).mirror().addBox(-0.5F, -0.8F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9633F, 3.7465F, 0.1317F, -1.6254F, -0.1695F, -0.1087F));

		PartDefinition cube_r57 = bone4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(123, 112).mirror().addBox(-0.5F, -1.45F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.7973F, 2.7064F, 0.4369F, -2.2799F, -0.1695F, -0.1087F));

		PartDefinition cube_r58 = bone4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(123, 96).mirror().addBox(-0.4115F, -4.5153F, 2.5622F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.6F, -2.6F, -1.0581F, -0.1695F, -0.1087F));

		PartDefinition cube_r59 = bone4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(29, 136).mirror().addBox(0.0614F, -3.3651F, -2.039F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(24, 136).mirror().addBox(0.0614F, -3.3651F, -1.539F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0539F, -1.9246F, 4.8904F, -0.5412F, 0.1613F, 0.0675F));

		PartDefinition cube_r60 = bone4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(110, 119).mirror().addBox(0.0614F, -2.9027F, -1.7858F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0539F, -1.9246F, 4.8904F, -0.9339F, 0.1613F, 0.0675F));

		PartDefinition cube_r61 = bone4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(103, 119).mirror().addBox(0.0614F, -2.8328F, -0.6686F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0539F, -1.9246F, 4.8904F, -1.2394F, 0.1613F, 0.0675F));

		PartDefinition cube_r62 = bone4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(38, 119).mirror().addBox(0.0614F, -3.1275F, -0.127F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0539F, -1.9246F, 4.8904F, -1.7193F, 0.1613F, 0.0675F));

		PartDefinition cube_r63 = bone4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(89, 110).mirror().addBox(-0.5F, -4.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.237F, 2.4627F, 3.5011F, -0.744F, -0.1695F, -0.1087F));

		PartDefinition cube_r64 = bone4.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(125, 6).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2256F, 3.1533F, -1.2931F, -1.6871F, -0.1753F, -0.1284F));

		PartDefinition cube_r65 = bone4.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(103, 140).mirror().addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1097F, 2.8367F, -0.8732F, -1.2944F, -0.1753F, -0.1284F));

		PartDefinition cube_r66 = bone4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(108, 85).mirror().addBox(-0.5158F, -3.405F, -1.6245F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.6F, -2.6F, -1.4288F, -0.1069F, -0.2185F));

		PartDefinition cube_r67 = bone4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(79, 97).mirror().addBox(-0.5F, -0.5F, -3.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3684F, -1.7339F, -1.4106F, -1.007F, -0.2346F, -0.2235F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8696F, 1.306F, -3.1694F, -0.184F, -0.3741F, 0.0838F));

		PartDefinition cube_r68 = leftLeg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(62, 128).addBox(-1.0F, -1.95F, -0.625F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.0805F, -3.0203F, -2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(116, 34).addBox(-1.5F, -0.5683F, -0.9249F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 0.7008F, -1.5685F, -2.9147F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftLeg.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(128, 50).addBox(-1.5F, -1.5114F, -2.0769F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.5F, 1.5008F, -0.6684F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftLeg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 124).addBox(-1.0F, -1.8F, -0.55F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2072F, -0.8869F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftLeg.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(30, 71).addBox(-0.5F, -3.9486F, -0.4345F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 3.9326F, -1.944F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftLeg.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(133, 132).addBox(-0.5F, -0.5F, 0.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 2.057F, -2.7331F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftLeg.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(138, 137).addBox(-0.5F, -1.0F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.8358F, -2.3011F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftLeg.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(19, 128).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 11.2752F, -6.7835F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftLeg.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(80, 127).addBox(-1.0F, 0.1F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.8431F, -4.4925F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftLeg.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(123, 42).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3262F, 8.9984F, -2.2975F, 1.3215F, -0.2289F, 0.3715F));

		PartDefinition cube_r78 = leftLeg.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(89, 66).addBox(-1.0F, 0.383F, -1.8214F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5537F, 8.5476F, -2.9129F, 0.7979F, -0.2289F, 0.3715F));

		PartDefinition cube_r79 = leftLeg.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(29, 111).addBox(-1.0F, -1.225F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 11.1703F, -3.732F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftLeg.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(117, 123).addBox(-0.5F, 0.4F, -0.875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 8.0533F, -3.4364F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftLeg.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(75, 127).addBox(-0.5F, -1.2F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.6496F, -3.3914F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r82 = leftLeg.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(127, 64).addBox(-0.5F, -1.625F, -0.475F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 8.3169F, -3.0434F, -0.1833F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9073F, 12.2378F, -3.8723F, 1.4549F, 0.5531F, 0.3419F));

		PartDefinition cube_r83 = leftLeg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(140, 80).addBox(-1.2756F, -0.8301F, 0.1778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9781F, 2.1552F, -0.4312F, -0.4478F, -0.6868F, 2.2881F));

		PartDefinition cube_r84 = leftLeg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(128, 104).addBox(-1.7756F, -1.3084F, 0.8686F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9781F, 2.1552F, -0.4312F, -0.6834F, -0.6868F, 2.2881F));

		PartDefinition cube_r85 = leftLeg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(117, 82).addBox(-1.7755F, -1.9703F, -0.3452F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2781F, 2.1552F, -0.4312F, -1.9313F, -0.6868F, 2.2881F));

		PartDefinition cube_r86 = leftLeg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(135, 49).addBox(-1.8366F, 0.0585F, 0.9639F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.2781F, 3.2552F, -1.4312F, -2.8738F, -0.6868F, 2.2881F));

		PartDefinition cube_r87 = leftLeg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(138, 131).addBox(-1.7755F, 3.3339F, -0.4604F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3781F, 2.1552F, -0.4312F, -2.1495F, -0.6868F, 2.2881F));

		PartDefinition cube_r88 = leftLeg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(140, 77).addBox(-1.2756F, -0.2878F, -0.6993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.9781F, 2.1552F, -0.4312F, -2.0622F, -0.6868F, 2.2881F));

		PartDefinition cube_r89 = leftLeg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(56, 140).addBox(-1.2756F, -1.1434F, -0.7333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9781F, 2.1552F, -0.4312F, -2.2368F, -0.6868F, 2.2881F));

		PartDefinition cube_r90 = leftLeg2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(45, 135).addBox(-1.8366F, 1.081F, 0.1998F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2781F, 3.2552F, -1.4312F, -1.8877F, -0.6868F, 2.2881F));

		PartDefinition cube_r91 = leftLeg2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(106, 134).addBox(-1.8366F, 1.7342F, -0.1533F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.2781F, 3.2552F, -1.4312F, -1.7132F, -0.6868F, 2.2881F));

		PartDefinition cube_r92 = leftLeg2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(99, 134).addBox(-1.8366F, 0.4943F, 0.9204F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(134, 33).addBox(-1.8366F, 0.4943F, 1.1204F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.2781F, 3.2552F, -1.4312F, -2.804F, -0.6868F, 2.2881F));

		PartDefinition cube_r93 = leftLeg2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(134, 17).addBox(-1.8366F, 1.0358F, 1.2271F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2781F, 3.2552F, -1.4312F, -2.4986F, -0.6868F, 2.2881F));

		PartDefinition cube_r94 = leftLeg2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(133, 87).addBox(-1.8366F, 1.1627F, 0.5357F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.2781F, 2.1552F, -0.4312F, -0.0987F, -0.6868F, 2.2881F));

		PartDefinition cube_r95 = leftLeg2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(43, 82).addBox(-1.8366F, 0.2314F, 1.0085F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.2781F, 2.1552F, -0.4312F, -0.7969F, -0.6868F, 2.2881F));

		PartDefinition cube_r96 = leftLeg2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(45, 124).addBox(-1.8366F, -1.1831F, 0.6056F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.2781F, 3.2552F, -1.4312F, -2.2193F, -0.6868F, 2.2881F));

		PartDefinition cube_r97 = leftLeg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(62, 136).addBox(-1.8366F, -0.0048F, 0.6664F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(128, 90).addBox(-1.8366F, -1.5048F, 0.6664F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2781F, 2.1552F, -0.4312F, -2.0186F, -0.6868F, 2.2881F));

		PartDefinition cube_r98 = leftLeg2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(87, 127).addBox(-1.2756F, -0.2912F, -0.8041F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9781F, 2.1552F, -0.4312F, -1.8877F, -0.6868F, 2.2881F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5503F, 4.8167F, -3.7678F, -2.3988F, -0.3585F, 0.3504F));

		PartDefinition cube_r99 = leftLeg3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(85, 117).addBox(-1.5F, -0.5F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.4103F, -0.1519F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftArm7 = leftLeg3.addOrReplaceChild("leftArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0384F, 1.8182F, 0.0204F, 0.2725F, -0.008F, 0.0104F));

		PartDefinition cube_r100 = leftArm7.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(117, 86).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition leftArm6 = leftArm7.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r101 = leftArm6.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(139, 8).addBox(1.7175F, -1.0101F, -0.5488F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.4618F, -0.8404F, -1.0822F, -0.2308F, -0.1246F));

		PartDefinition cube_r102 = leftArm6.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(139, 4).addBox(0.541F, -1.0859F, -0.5237F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.4618F, -0.8404F, -1.0914F, -0.0385F, -0.0205F));

		PartDefinition cube_r103 = leftArm6.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(139, 0).addBox(-0.7088F, -1.2375F, -0.4976F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.4618F, -0.8404F, -1.0844F, 0.1154F, 0.0619F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8696F, 1.306F, -3.1694F, -0.664F, 0.3741F, -0.0838F));

		PartDefinition cube_r104 = rightLeg.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(133, 20).addBox(-1.0F, -1.95F, -0.625F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.0805F, -3.0203F, -2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(117, 55).addBox(-0.5F, -0.5683F, -0.9249F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 0.7008F, -1.5685F, -2.9147F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(7, 133).addBox(-0.5F, -1.5114F, -2.0769F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.5F, 1.5008F, -0.6684F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(102, 125).addBox(-1.0F, -1.8F, -0.55F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2072F, -0.8869F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(14, 123).addBox(-0.5F, -3.9486F, -0.4345F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 3.9326F, -1.944F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(39, 138).addBox(-0.5F, -0.5F, 0.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 2.057F, -2.7331F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 140).addBox(-0.5F, -1.0F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.8358F, -2.3011F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightLeg.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(0, 133).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 11.2752F, -6.7835F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightLeg.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(126, 132).addBox(-1.0F, 0.1F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.8431F, -4.4925F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r113 = rightLeg.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(125, 34).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3262F, 8.9984F, -2.2975F, 1.3215F, 0.2289F, -0.3715F));

		PartDefinition cube_r114 = rightLeg.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(125, 17).addBox(-1.0F, 0.383F, -1.8214F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5537F, 8.5476F, -2.9129F, 0.7979F, 0.2289F, -0.3715F));

		PartDefinition cube_r115 = rightLeg.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(116, 72).addBox(-1.0F, -1.225F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 11.1703F, -3.732F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r116 = rightLeg.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(125, 75).addBox(-0.5F, 0.4F, -0.875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 8.0533F, -3.4364F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r117 = rightLeg.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(121, 132).addBox(-0.5F, -1.2F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.6496F, -3.3914F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r118 = rightLeg.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(40, 132).addBox(-0.5F, -1.625F, -0.475F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 8.3169F, -3.0434F, -0.1833F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9073F, 12.2378F, -3.8723F, 1.2803F, -0.5531F, -0.3419F));

		PartDefinition cube_r119 = rightLeg2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(140, 102).addBox(0.2755F, -0.8301F, 0.1778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9781F, 2.1552F, -0.4312F, -0.4478F, 0.6868F, -2.2881F));

		PartDefinition cube_r120 = rightLeg2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(133, 79).addBox(-0.2245F, -1.3084F, 0.8686F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9781F, 2.1552F, -0.4312F, -0.6834F, 0.6868F, -2.2881F));

		PartDefinition cube_r121 = rightLeg2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(121, 38).addBox(-0.2245F, -1.9703F, -0.3452F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.2781F, 2.1552F, -0.4312F, -1.9313F, 0.6868F, -2.2881F));

		PartDefinition cube_r122 = rightLeg2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(138, 124).addBox(-0.1634F, 0.0585F, 0.9639F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.2781F, 3.2552F, -1.4312F, -2.8738F, 0.6868F, -2.2881F));

		PartDefinition cube_r123 = rightLeg2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(138, 134).addBox(-0.2245F, 3.3339F, -0.4604F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3781F, 2.1552F, -0.4312F, -2.1495F, 0.6868F, -2.2881F));

		PartDefinition cube_r124 = rightLeg2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(98, 140).addBox(0.2755F, -0.2878F, -0.6993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.9781F, 2.1552F, -0.4312F, -2.0622F, 0.6868F, -2.2881F));

		PartDefinition cube_r125 = rightLeg2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(140, 86).addBox(0.2755F, -1.1434F, -0.7333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.9781F, 2.1552F, -0.4312F, -2.2368F, 0.6868F, -2.2881F));

		PartDefinition cube_r126 = rightLeg2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(138, 121).addBox(-0.1634F, 1.081F, 0.1998F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2781F, 3.2552F, -1.4312F, -1.8877F, 0.6868F, -2.2881F));

		PartDefinition cube_r127 = rightLeg2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(138, 118).addBox(-0.1634F, 1.7342F, -0.1533F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.2781F, 3.2552F, -1.4312F, -1.7132F, 0.6868F, -2.2881F));

		PartDefinition cube_r128 = rightLeg2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(138, 115).addBox(-0.1634F, 0.4943F, 0.9204F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(86, 138).addBox(-0.1634F, 0.4943F, 1.1204F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.2781F, 3.2552F, -1.4312F, -2.804F, 0.6868F, -2.2881F));

		PartDefinition cube_r129 = rightLeg2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(79, 138).addBox(-0.1634F, 1.0358F, 1.2271F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2781F, 3.2552F, -1.4312F, -2.4986F, 0.6868F, -2.2881F));

		PartDefinition cube_r130 = rightLeg2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(138, 58).addBox(-0.1634F, 1.1627F, 0.5357F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.2781F, 2.1552F, -0.4312F, -0.0987F, 0.6868F, -2.2881F));

		PartDefinition cube_r131 = rightLeg2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(44, 138).addBox(-0.1634F, 0.2314F, 1.0085F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(-0.2781F, 2.1552F, -0.4312F, -0.7969F, 0.6868F, -2.2881F));

		PartDefinition cube_r132 = rightLeg2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(109, 125).addBox(-0.1634F, -1.1831F, 0.6056F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-0.2781F, 3.2552F, -1.4312F, -2.2193F, 0.6868F, -2.2881F));

		PartDefinition cube_r133 = rightLeg2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(137, 128).addBox(-0.1634F, -0.0048F, 0.6664F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(133, 54).addBox(-0.1634F, -1.5048F, 0.6664F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2781F, 2.1552F, -0.4312F, -2.0186F, 0.6868F, -2.2881F));

		PartDefinition cube_r134 = rightLeg2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(74, 133).addBox(0.2755F, -0.2912F, -0.8041F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9781F, 2.1552F, -0.4312F, -1.8877F, 0.6868F, -2.2881F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5503F, 4.8167F, -3.7678F, -2.0061F, 0.3585F, -0.3504F));

		PartDefinition cube_r135 = rightLeg3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(121, 46).addBox(-1.5F, -0.5F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.4103F, -0.1519F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightArm7 = rightLeg3.addOrReplaceChild("rightArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0384F, 1.8182F, 0.0204F, 0.447F, 0.008F, -0.0104F));

		PartDefinition cube_r136 = rightArm7.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(93, 122).addBox(-2.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightArm6 = rightArm7.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r137 = rightArm6.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(51, 140).addBox(-2.7175F, -1.0101F, -0.5488F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4618F, -0.8404F, -1.0822F, 0.2308F, 0.1246F));

		PartDefinition cube_r138 = rightArm6.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(140, 20).addBox(-1.541F, -1.0859F, -0.5237F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4618F, -0.8404F, -1.0914F, 0.0385F, 0.0205F));

		PartDefinition cube_r139 = rightArm6.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(5, 140).addBox(-0.2912F, -1.2375F, -0.4976F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4618F, -0.8404F, -1.0844F, -0.1154F, -0.0619F));

		PartDefinition body4 = hips.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.3337F, -5.209F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r140 = body4.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(130, 37).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.005F, -1.097F, -16.6169F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r141 = body4.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(71, 109).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.005F, -2.944F, -14.2529F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r142 = body4.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(109, 66).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.005F, -4.3524F, -11.6041F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r143 = body4.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(96, 111).addBox(-0.5F, -0.7F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -1.622F, -8.4704F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r144 = body4.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(48, 92).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.008F, -5.4697F, -7.7597F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r145 = body4.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(140, 105).addBox(-0.5F, 1.3647F, -8.3042F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -6.0975F, -17.9984F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r146 = body4.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(66, 69).mirror().addBox(-4.0F, 0.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -6.2351F, -1.1183F, -0.27F, -0.1949F, -0.5625F));

		PartDefinition cube_r147 = body4.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(132, 71).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 1.032F, 10.7671F, -0.8289F, 0.1791F, -0.192F));

		PartDefinition cube_r148 = body4.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(54, 111).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -3.3905F, -17.6573F, 1.0144F, -0.1166F, -0.1848F));

		PartDefinition cube_r149 = body4.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(132, 75).mirror().addBox(-0.05F, 0.0F, -1.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -1.7037F, -18.7319F, 1.1014F, -0.1041F, -0.202F));

		PartDefinition cube_r150 = body4.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(84, 22).mirror().addBox(-3.9848F, -0.0198F, -2.9989F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -8.0627F, -8.8914F, 0.0394F, -0.0121F, -0.5955F));

		PartDefinition cube_r151 = body4.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(86, 13).mirror().addBox(-7.6031F, -1.702F, -2.9989F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -8.0627F, -8.8914F, 0.0408F, 0.0056F, -1.0314F));

		PartDefinition cube_r152 = body4.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(67, 13).mirror().addBox(-12.5624F, -4.1998F, -2.9989F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -8.0627F, -8.8914F, 0.0364F, 0.0192F, -1.3803F));

		PartDefinition cube_r153 = body4.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(48, 36).mirror().addBox(-19.6423F, -6.3174F, -2.9989F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -8.0627F, -8.8914F, 0.0325F, 0.0253F, -1.5547F));

		PartDefinition cube_r154 = body4.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(19, 42).mirror().addBox(-4.0F, 0.0F, 0.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -8.0848F, -8.8951F, -0.1545F, -0.1136F, -0.5851F));

		PartDefinition cube_r155 = body4.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(19, 59).mirror().addBox(-7.6252F, -1.6905F, 1.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -8.0848F, -8.8951F, -0.0921F, -0.1682F, -1.0224F));

		PartDefinition cube_r156 = body4.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(-12.5872F, -4.1965F, 1.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -8.0848F, -8.8951F, -0.0285F, -0.1895F, -1.3766F));

		PartDefinition cube_r157 = body4.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-20.4979F, -6.6217F, 1.0F, 9.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -8.0848F, -8.8951F, 0.0103F, -0.1913F, -1.581F));

		PartDefinition cube_r158 = body4.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(71, 7).mirror().addBox(-3.9339F, 0.0406F, -2.8336F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.9F, -3.8351F, -1.1183F, -0.1498F, -0.297F, -1.0247F));

		PartDefinition cube_r159 = body4.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(53, 57).mirror().addBox(-9.7488F, -1.1934F, -2.8336F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.9F, -3.8351F, -1.1183F, -0.0464F, -0.3285F, -1.358F));

		PartDefinition cube_r160 = body4.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(48, 7).mirror().addBox(-6.9555F, -0.0788F, -3.5856F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-9.982F, 5.2371F, -3.5124F, 0.0732F, -0.333F, -1.5431F));

		PartDefinition cube_r161 = body4.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(79, 75).mirror().addBox(-8.1592F, -0.0788F, -4.9436F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.982F, 5.2371F, -3.5124F, 0.0694F, -0.0719F, -1.5241F));

		PartDefinition cube_r162 = body4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(71, 34).mirror().addBox(-4.0F, 0.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -4.6265F, 2.5352F, -0.4067F, -0.2947F, -0.5104F));

		PartDefinition cube_r163 = body4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(72, 63).mirror().addBox(-7.5952F, -1.7535F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -4.6265F, 2.5352F, -0.2377F, -0.4412F, -0.9718F));

		PartDefinition cube_r164 = body4.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(30, 78).mirror().addBox(-17.5232F, -6.6132F, 0.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -4.6265F, 2.5352F, 0.0379F, -0.4961F, -1.5673F));

		PartDefinition cube_r165 = body4.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(63, 27).mirror().addBox(-4.0F, 0.0F, 0.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -3.6722F, 4.2928F, -0.5228F, -0.3102F, -0.4936F));

		PartDefinition cube_r166 = body4.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-7.6103F, -1.722F, 0.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -3.6722F, 4.2928F, -0.3463F, -0.5009F, -0.9328F));

		PartDefinition cube_r167 = body4.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(29, 0).mirror().addBox(-6.0F, 0.0F, -2.5F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-8.9349F, 2.3636F, 3.2137F, -0.1506F, -0.5836F, -1.326F));

		PartDefinition cube_r168 = body4.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(52, 0).mirror().addBox(-10.8898F, -1.1449F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-8.9349F, 2.3636F, 3.2137F, -0.0215F, -0.6001F, -1.5566F));

		PartDefinition cube_r169 = body4.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-10.7793F, -1.1449F, -9.1982F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.9349F, 2.3636F, 3.2137F, -0.0178F, 0.0106F, -1.569F));

		PartDefinition cube_r170 = body4.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(110, 31).mirror().addBox(-4.0F, -0.5F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.3852F, -5.6181F, -9.2958F, -0.091F, -0.0639F, -1.0321F));

		PartDefinition cube_r171 = body4.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(88, 0).mirror().addBox(-4.0F, 0.0F, 0.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.8355F, 0.8923F, 7.0449F, -0.3939F, -0.5595F, -0.9065F));

		PartDefinition cube_r172 = body4.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(88, 5).mirror().addBox(-4.0F, 0.0F, 0.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.8355F, 8.4193F, -0.5857F, -0.3507F, -0.4779F));

		PartDefinition cube_r173 = body4.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(17, 66).mirror().addBox(-6.0F, 0.0F, 0.0F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-8.9255F, 3.5614F, 4.9218F, -0.144F, -0.6587F, -1.3383F));

		PartDefinition cube_r174 = body4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(88, 34).mirror().addBox(-4.0F, 0.0F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-10.019F, 10.046F, 3.5971F, -0.0278F, -0.6715F, -1.5262F));

		PartDefinition cube_r175 = body4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(105, 72).mirror().addBox(-0.3F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.1585F, 13.1745F, 1.1085F, -0.0219F, -0.1131F, -1.541F));

		PartDefinition cube_r176 = body4.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(101, 94).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 1.032F, 10.7671F, -0.37F, 0.7768F, 0.7115F));

		PartDefinition cube_r177 = body4.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(11, 102).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.7032F, 3.1943F, 9.7354F, -0.673F, 0.5543F, 0.2297F));

		PartDefinition cube_r178 = body4.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(11, 92).mirror().addBox(0.0F, 0.0F, -3.0F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-8.1755F, 7.3425F, 8.9452F, -0.7868F, 0.3435F, -0.0298F));

		PartDefinition cube_r179 = body4.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(110, 21).mirror().addBox(-0.5F, -0.55F, -2.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.3366F, 11.9594F, 3.028F, -0.0363F, 0.2176F, -0.1557F));

		PartDefinition cube_r180 = body4.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(86, 121).mirror().addBox(0.0F, -0.45F, -2.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-9.4792F, 11.6202F, 4.9449F, -0.6472F, 0.2176F, -0.1557F));

		PartDefinition cube_r181 = body4.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(101, 17).mirror().addBox(-4.0F, 0.0F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.1418F, 3.8849F, 13.1861F, -0.9973F, -0.2625F, -0.5919F));

		PartDefinition cube_r182 = body4.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(103, 34).mirror().addBox(-4.0F, 0.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.9824F, 2.4333F, 12.0969F, -1.0049F, -0.2621F, -0.592F));

		PartDefinition cube_r183 = body4.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(51, 102).mirror().addBox(-4.0F, 0.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.1883F, 4.5892F, 11.0605F, -0.838F, -0.561F, -0.9533F));

		PartDefinition cube_r184 = body4.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(13, 81).mirror().addBox(-6.0F, 0.0F, 0.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-8.1494F, 7.3506F, 8.9324F, -0.6574F, -0.7734F, -1.2423F));

		PartDefinition cube_r185 = body4.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(99, 106).mirror().addBox(0.075F, 0.0F, -1.4F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.8554F, 13.5096F, 5.1272F, -0.3567F, -0.046F, -1.8017F));

		PartDefinition cube_r186 = body4.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(110, 27).mirror().addBox(-4.0F, 0.0F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -7.6561F, -12.8422F, -1.129F, 0.2909F, -0.5451F));

		PartDefinition cube_r187 = body4.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(112, 43).mirror().addBox(-4.0F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -7.9568F, -11.8885F, 0.2528F, 0.1733F, -0.5888F));

		PartDefinition cube_r188 = body4.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(123, 101).mirror().addBox(-3.0F, 1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-6.7766F, -5.6692F, -11.6951F, -1.251F, 0.422F, -0.8909F));

		PartDefinition cube_r189 = body4.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(114, 17).mirror().addBox(-4.0F, 0.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.7766F, -5.6692F, -11.6951F, -1.2796F, 0.047F, -1.0116F));

		PartDefinition cube_r190 = body4.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(63, 115).mirror().addBox(-4.0F, 0.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-8.8963F, -2.2822F, -11.5071F, -1.3163F, 0.1505F, -1.3788F));

		PartDefinition cube_r191 = body4.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(101, 102).mirror().addBox(-4.0F, 0.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -4.9772F, -16.4398F, 0.6439F, 0.3979F, -0.4766F));

		PartDefinition cube_r192 = body4.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(74, 115).mirror().addBox(-4.0F, -1.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -6.6561F, -14.5743F, -2.5394F, 0.3776F, -0.4923F));

		PartDefinition cube_r193 = body4.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(110, 47).mirror().addBox(-3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.7766F, -3.2857F, -14.8898F, 0.4839F, 0.5865F, -0.8112F));

		PartDefinition cube_r194 = body4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(137, 36).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-8.4973F, -1.4739F, -13.2295F, 0.2689F, 0.7001F, -1.1667F));

		PartDefinition cube_r195 = body4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(103, 0).mirror().addBox(-3.8F, 0.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -3.3905F, -17.6573F, 0.7883F, 0.4118F, -0.4724F));

		PartDefinition cube_r196 = body4.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(110, 91).mirror().addBox(-3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.6009F, -1.806F, -16.1363F, 0.6379F, 0.6363F, -0.7694F));

		PartDefinition cube_r197 = body4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(110, 95).mirror().addBox(-3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-8.3342F, -0.1274F, -14.3536F, 0.4065F, 0.7906F, -1.1199F));

		PartDefinition cube_r198 = body4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(89, 61).mirror().addBox(-3.9F, 0.0F, 0.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-8.3342F, -0.1274F, -14.3536F, 0.2798F, -0.0526F, -1.3775F));

		PartDefinition cube_r199 = body4.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-9.0F, 0.0F, 0.0F, 9.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-9.0823F, 3.6947F, -14.5587F, 0.2845F, 0.001F, -1.5619F));

		PartDefinition cube_r200 = body4.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(95, 51).mirror().addBox(-1.75F, -0.5F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.461F, 11.2815F, -9.1331F, 0.0102F, -0.104F, -1.5801F));

		PartDefinition cube_r201 = body4.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(56, 85).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -3.3905F, -17.6573F, 0.6375F, -0.8596F, 0.5397F));

		PartDefinition cube_r202 = body4.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(121, 90).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.572F, -1.7894F, -16.0955F, 0.885F, -0.6421F, 0.2437F));

		PartDefinition cube_r203 = body4.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(121, 106).mirror().addBox(0.0F, 0.6F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.572F, -1.7894F, -16.0955F, 0.536F, -0.6421F, 0.2437F));

		PartDefinition cube_r204 = body4.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(37, 92).mirror().addBox(0.0F, -3.0F, -4.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-8.3798F, -0.2812F, -14.2362F, 1.4992F, -0.6425F, 0.2382F));

		PartDefinition cube_r205 = body4.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(27, 24).mirror().addBox(0.0F, -3.0F, -8.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-9.1546F, 3.6364F, -14.4654F, 1.5753F, -0.6557F, -0.0024F));

		PartDefinition cube_r206 = body4.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(63, 122).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.3279F, 11.6453F, -16.815F, 1.2262F, -0.6557F, -0.0024F));

		PartDefinition cube_r207 = body4.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(116, 0).mirror().addBox(-0.05F, 0.0F, -1.925F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -1.7037F, -18.7319F, 0.7472F, -0.9106F, 0.4514F));

		PartDefinition cube_r208 = body4.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(126, 85).mirror().addBox(-0.05F, 0.0F, -1.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.212F, 0.0002F, -17.0647F, 0.4311F, -0.757F, 0.1856F));

		PartDefinition cube_r209 = body4.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(125, 70).mirror().addBox(-0.05F, -2.0F, -2.225F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-7.1114F, 1.6801F, -16.4572F, 1.4103F, -0.7531F, 0.2212F));

		PartDefinition cube_r210 = body4.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(7, 123).mirror().addBox(-0.5F, -0.625F, -1.75F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.258F, 8.862F, -17.102F, 0.9654F, -0.7667F, -0.0192F));

		PartDefinition cube_r211 = body4.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(36, 69).mirror().addBox(-0.05F, -2.0F, -6.025F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-7.3531F, 3.8517F, -16.7138F, 1.5762F, -0.7667F, -0.0192F));

		PartDefinition cube_r212 = body4.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(93, 126).mirror().addBox(-0.05F, -2.0F, -1.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.7569F, 1.9605F, -17.9326F, 1.3637F, -0.9677F, 0.2822F));

		PartDefinition cube_r213 = body4.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(7, 116).mirror().addBox(-0.05F, 0.0F, -1.925F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.5501F, 0.0248F, -19.6318F, 0.9376F, -1.0274F, 0.2211F));

		PartDefinition cube_r214 = body4.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(123, 0).mirror().addBox(-0.5F, -1.4F, -1.525F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8218F, 7.8445F, -18.3163F, 1.0107F, -0.9849F, -0.0213F));

		PartDefinition cube_r215 = body4.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(79, 81).mirror().addBox(-0.05F, -2.0F, -5.025F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.9656F, 3.836F, -18.1541F, 1.5779F, -0.9849F, -0.0213F));

		PartDefinition cube_r216 = body4.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(126, 117).mirror().addBox(0.0F, -0.2F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -3.3905F, -17.6573F, 0.6811F, -0.8596F, 0.5397F));

		PartDefinition cube_r217 = body4.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(88, 10).mirror().addBox(-12.3894F, -4.0728F, -1.8675F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -4.6265F, 2.5352F, -0.0711F, -0.3616F, -1.3398F));

		PartDefinition cube_r218 = body4.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(82, 27).mirror().addBox(-12.6463F, -4.0728F, 0.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -4.6265F, 2.5352F, -0.0754F, -0.4921F, -1.3293F));

		PartDefinition cube_r219 = body4.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(133, 83).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-9.5344F, 11.4143F, 4.741F, -0.552F, -0.843F, -1.3879F));

		PartDefinition cube_r220 = body4.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(137, 36).addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(8.4973F, -1.4739F, -13.2295F, 0.2689F, -0.7001F, 1.1667F));

		PartDefinition cube_r221 = body4.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(110, 47).addBox(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.7766F, -3.2857F, -14.8898F, 0.4839F, -0.5865F, 0.8112F));

		PartDefinition cube_r222 = body4.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(101, 102).addBox(0.0F, 0.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5F, -4.9772F, -16.4398F, 0.6439F, -0.3979F, 0.4766F));

		PartDefinition cube_r223 = body4.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(67, 18).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -4.9772F, -16.4398F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r224 = body4.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(0, 35).addBox(0.0F, 0.0F, 0.0F, 9.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(9.0823F, 3.6947F, -14.5587F, 0.2845F, -0.001F, 1.5619F));

		PartDefinition cube_r225 = body4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(89, 61).addBox(-0.1F, 0.0F, 0.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(8.3342F, -0.1274F, -14.3536F, 0.2798F, 0.0526F, 1.3775F));

		PartDefinition cube_r226 = body4.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(110, 95).addBox(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(8.3342F, -0.1274F, -14.3536F, 0.4065F, -0.7906F, 1.1199F));

		PartDefinition cube_r227 = body4.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(110, 91).addBox(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.6009F, -1.806F, -16.1363F, 0.6379F, -0.6363F, 0.7694F));

		PartDefinition cube_r228 = body4.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(103, 0).addBox(-0.2F, 0.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5F, -3.3905F, -17.6573F, 0.7883F, -0.4118F, 0.4724F));

		PartDefinition cube_r229 = body4.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(59, 53).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -3.3905F, -17.6573F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r230 = body4.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(101, 13).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0703F, -19.6554F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r231 = body4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(123, 0).addBox(-0.5F, -1.4F, -1.525F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8218F, 7.8445F, -18.3163F, 1.0107F, 0.9849F, 0.0213F));

		PartDefinition cube_r232 = body4.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(79, 81).addBox(-0.95F, -2.0F, -5.025F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.9656F, 3.836F, -18.1541F, 1.5779F, 0.9849F, 0.0213F));

		PartDefinition cube_r233 = body4.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(36, 69).addBox(-0.95F, -2.0F, -6.025F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(7.3531F, 3.8517F, -16.7138F, 1.5762F, 0.7667F, 0.0192F));

		PartDefinition cube_r234 = body4.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(7, 123).addBox(-0.5F, -0.625F, -1.75F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.258F, 8.862F, -17.102F, 0.9654F, 0.7667F, 0.0192F));

		PartDefinition cube_r235 = body4.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(93, 126).addBox(-0.95F, -2.0F, -1.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.7569F, 1.9605F, -17.9326F, 1.3637F, 0.9677F, -0.2822F));

		PartDefinition cube_r236 = body4.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(125, 70).addBox(-0.95F, -2.0F, -2.225F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(7.1114F, 1.6801F, -16.4572F, 1.4103F, 0.7531F, -0.2212F));

		PartDefinition cube_r237 = body4.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(126, 85).addBox(-0.95F, 0.0F, -1.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.212F, 0.0002F, -17.0647F, 0.4311F, 0.757F, -0.1856F));

		PartDefinition cube_r238 = body4.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(7, 116).addBox(-0.95F, 0.0F, -1.925F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.5501F, 0.0248F, -19.6318F, 0.9376F, 1.0274F, -0.2211F));

		PartDefinition cube_r239 = body4.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(116, 0).addBox(-0.95F, 0.0F, -1.925F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.0F, -1.7037F, -18.7319F, 0.7472F, 0.9106F, -0.4514F));

		PartDefinition cube_r240 = body4.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(132, 100).mirror().addBox(-0.05F, 0.0F, -1.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.5501F, 0.0248F, -19.6318F, 1.2585F, -0.1041F, -0.202F));

		PartDefinition cube_r241 = body4.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(132, 100).addBox(-0.95F, 0.0F, -1.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.5501F, 0.0248F, -19.6318F, 1.2585F, 0.1041F, 0.202F));

		PartDefinition cube_r242 = body4.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(132, 75).addBox(-0.95F, 0.0F, -1.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -1.7037F, -18.7319F, 1.1014F, 0.1041F, 0.202F));

		PartDefinition cube_r243 = body4.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(86, 18).addBox(-2.5F, 0.0F, -2.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.7037F, -18.7319F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r244 = body4.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(121, 106).addBox(-1.0F, 0.6F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.572F, -1.7894F, -16.0955F, 0.536F, 0.6421F, -0.2437F));

		PartDefinition cube_r245 = body4.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(63, 122).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.3279F, 11.6453F, -16.815F, 1.2262F, 0.6557F, 0.0024F));

		PartDefinition cube_r246 = body4.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(27, 24).addBox(-1.0F, -3.0F, -8.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(9.1546F, 3.6364F, -14.4654F, 1.5753F, 0.6557F, 0.0024F));

		PartDefinition cube_r247 = body4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(37, 92).addBox(-1.0F, -3.0F, -4.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(8.3798F, -0.2812F, -14.2362F, 1.4992F, 0.6425F, -0.2382F));

		PartDefinition cube_r248 = body4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(121, 90).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.572F, -1.7894F, -16.0955F, 0.885F, 0.6421F, -0.2437F));

		PartDefinition cube_r249 = body4.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(126, 117).addBox(-1.0F, -0.2F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5F, -3.3905F, -17.6573F, 0.6811F, 0.8596F, -0.5397F));

		PartDefinition cube_r250 = body4.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(56, 85).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -3.3905F, -17.6573F, 0.6375F, 0.8596F, -0.5397F));

		PartDefinition cube_r251 = body4.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(54, 111).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -3.3905F, -17.6573F, 1.0144F, 0.1166F, 0.1848F));

		PartDefinition cube_r252 = body4.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(74, 57).addBox(-3.0F, 0.0F, -2.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -3.3905F, -17.6573F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r253 = body4.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(74, 115).addBox(0.0F, -1.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5F, -6.6561F, -14.5743F, -2.5394F, -0.3776F, 0.4923F));

		PartDefinition cube_r254 = body4.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(82, 44).addBox(-3.5F, -1.0F, 0.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -6.6561F, -14.5743F, -2.4435F, 0.0F, 0.0F));

		PartDefinition cube_r255 = body4.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(63, 115).addBox(0.0F, 0.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(8.8963F, -2.2822F, -11.5071F, -1.3163F, -0.1505F, 1.3788F));

		PartDefinition cube_r256 = body4.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(114, 17).addBox(0.0F, 0.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.7766F, -5.6692F, -11.6951F, -1.2796F, -0.047F, 1.0116F));

		PartDefinition cube_r257 = body4.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(123, 101).addBox(0.0F, 1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(6.7766F, -5.6692F, -11.6951F, -1.251F, -0.422F, 0.8909F));

		PartDefinition cube_r258 = body4.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(110, 27).addBox(0.0F, 0.0F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5F, -7.6561F, -12.8422F, -1.129F, -0.2909F, 0.5451F));

		PartDefinition cube_r259 = body4.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(78, 53).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -7.6561F, -12.8422F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r260 = body4.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(112, 43).addBox(0.0F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5F, -7.9568F, -11.8885F, 0.2528F, -0.1733F, 0.5888F));

		PartDefinition cube_r261 = body4.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(82, 31).addBox(-3.5F, 0.0F, -1.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -7.9568F, -11.8885F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r262 = body4.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(48, 36).addBox(11.6423F, -6.3174F, -2.9989F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5F, -8.0627F, -8.8914F, 0.0325F, -0.0253F, 1.5547F));

		PartDefinition cube_r263 = body4.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(67, 13).addBox(6.5624F, -4.1998F, -2.9989F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5F, -8.0627F, -8.8914F, 0.0364F, -0.0192F, 1.3803F));

		PartDefinition cube_r264 = body4.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(86, 13).addBox(3.6031F, -1.702F, -2.9989F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5F, -8.0627F, -8.8914F, 0.0408F, -0.0056F, 1.0314F));

		PartDefinition cube_r265 = body4.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(84, 22).addBox(-0.0152F, -0.0198F, -2.9989F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5F, -8.0627F, -8.8914F, 0.0394F, 0.0121F, 0.5955F));

		PartDefinition cube_r266 = body4.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(63, 22).addBox(-3.5F, 0.0F, -3.0F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -8.0877F, -8.8914F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r267 = body4.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(82, 40).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 2.4828F, 12.1438F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r268 = body4.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(80, 47).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.032F, 10.7671F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r269 = body4.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(99, 106).addBox(-2.075F, 0.0F, -1.4F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.8554F, 13.5096F, 5.1272F, -0.3567F, 0.046F, 1.8017F));

		PartDefinition cube_r270 = body4.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(133, 83).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(9.5344F, 11.4143F, 4.741F, -0.552F, 0.843F, 1.3879F));

		PartDefinition cube_r271 = body4.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(13, 81).addBox(0.0F, 0.0F, 0.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(8.1494F, 7.3506F, 8.9324F, -0.6574F, 0.7734F, 1.2423F));

		PartDefinition cube_r272 = body4.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(51, 102).addBox(0.0F, 0.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.1883F, 4.5892F, 11.0605F, -0.838F, 0.561F, 0.9533F));

		PartDefinition cube_r273 = body4.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(103, 34).addBox(0.0F, 0.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.9824F, 2.4333F, 12.0969F, -1.0049F, 0.2621F, 0.592F));

		PartDefinition cube_r274 = body4.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(101, 17).addBox(0.0F, 0.0F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.1418F, 3.8849F, 13.1861F, -0.9973F, 0.2625F, 0.5919F));

		PartDefinition cube_r275 = body4.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(110, 21).addBox(-0.5F, -0.55F, -2.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.3366F, 11.9594F, 3.028F, -0.0363F, -0.2176F, 0.1557F));

		PartDefinition cube_r276 = body4.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(86, 121).addBox(-1.0F, -0.45F, -2.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(9.4792F, 11.6202F, 4.9449F, -0.6472F, -0.2176F, 0.1557F));

		PartDefinition cube_r277 = body4.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(11, 92).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(8.1755F, 7.3425F, 8.9452F, -0.7868F, -0.3435F, 0.0298F));

		PartDefinition cube_r278 = body4.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(11, 102).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.7032F, 3.1943F, 9.7354F, -0.673F, -0.5543F, -0.2297F));

		PartDefinition cube_r279 = body4.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(101, 94).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5F, 1.032F, 10.7671F, -0.37F, -0.7768F, -0.7115F));

		PartDefinition cube_r280 = body4.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(132, 71).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 1.032F, 10.7671F, -0.8289F, -0.1791F, 0.192F));

		PartDefinition cube_r281 = body4.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(88, 5).addBox(0.0F, 0.0F, 0.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5F, -0.8355F, 8.4193F, -0.5857F, 0.3507F, 0.4779F));

		PartDefinition cube_r282 = body4.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(105, 72).addBox(-1.7F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.1585F, 13.1745F, 1.1085F, -0.0219F, 0.1131F, 1.541F));

		PartDefinition cube_r283 = body4.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(88, 34).addBox(0.0F, 0.0F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(10.019F, 10.046F, 3.5971F, -0.0278F, 0.6715F, 1.5262F));

		PartDefinition cube_r284 = body4.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(17, 66).addBox(0.0F, 0.0F, 0.0F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(8.9255F, 3.5614F, 4.9218F, -0.144F, 0.6587F, 1.3383F));

		PartDefinition cube_r285 = body4.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(88, 0).addBox(0.0F, 0.0F, 0.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.8355F, 0.8923F, 7.0449F, -0.3939F, 0.5595F, 0.9065F));

		PartDefinition cube_r286 = body4.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(59, 48).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.8355F, 8.4193F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r287 = body4.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(0, 66).addBox(7.7793F, -1.1449F, -9.1982F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.9349F, 2.3636F, 3.2137F, -0.0178F, -0.0106F, 1.569F));

		PartDefinition cube_r288 = body4.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(52, 0).addBox(5.8898F, -1.1449F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(8.9349F, 2.3636F, 3.2137F, -0.0215F, 0.6001F, 1.5566F));

		PartDefinition cube_r289 = body4.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(29, 0).addBox(0.0F, 0.0F, -2.5F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(8.9349F, 2.3636F, 3.2137F, -0.1506F, 0.5836F, 1.326F));

		PartDefinition cube_r290 = body4.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(0, 59).addBox(3.6103F, -1.722F, 0.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5F, -3.6722F, 4.2928F, -0.3463F, 0.5009F, 0.9328F));

		PartDefinition cube_r291 = body4.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(63, 27).addBox(0.0F, 0.0F, 0.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5F, -3.6722F, 4.2928F, -0.5228F, 0.3102F, 0.4936F));

		PartDefinition cube_r292 = body4.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(23, 7).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -3.6722F, 4.2928F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r293 = body4.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(88, 10).addBox(6.3894F, -4.0728F, -1.8675F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5F, -4.6265F, 2.5352F, -0.0711F, 0.3616F, 1.3398F));

		PartDefinition cube_r294 = body4.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(30, 78).addBox(11.5231F, -6.6132F, 0.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5F, -4.6265F, 2.5352F, 0.0379F, 0.4961F, 1.5673F));

		PartDefinition cube_r295 = body4.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(82, 27).addBox(6.6463F, -4.0728F, 0.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -4.6265F, 2.5352F, -0.0754F, 0.4921F, 1.3293F));

		PartDefinition cube_r296 = body4.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(72, 63).addBox(3.5952F, -1.7535F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5F, -4.6265F, 2.5352F, -0.2377F, 0.4412F, 0.9718F));

		PartDefinition cube_r297 = body4.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(71, 34).addBox(0.0F, 0.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5F, -4.6265F, 2.5352F, -0.4067F, 0.2947F, 0.5104F));

		PartDefinition cube_r298 = body4.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(25, 36).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -5.5808F, 0.7776F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r299 = body4.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(40, 42).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -6.8863F, -3.0093F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r300 = body4.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(79, 75).addBox(5.1592F, -0.0788F, -4.9436F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.982F, 5.2371F, -3.5124F, 0.0694F, 0.0719F, 1.5241F));

		PartDefinition cube_r301 = body4.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(48, 7).addBox(-0.0445F, -0.0788F, -3.5856F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(9.982F, 5.2371F, -3.5124F, 0.0732F, 0.333F, 1.5431F));

		PartDefinition cube_r302 = body4.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(53, 57).addBox(3.7488F, -1.1934F, -2.8336F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.9F, -3.8351F, -1.1183F, -0.0464F, 0.3285F, 1.358F));

		PartDefinition cube_r303 = body4.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(71, 7).addBox(-0.0661F, 0.0406F, -2.8336F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.9F, -3.8351F, -1.1183F, -0.1498F, 0.297F, 1.0247F));

		PartDefinition cube_r304 = body4.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(66, 69).addBox(0.0F, 0.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5F, -6.2351F, -1.1183F, -0.27F, 0.1949F, 0.5625F));

		PartDefinition cube_r305 = body4.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(95, 51).addBox(-1.25F, -0.5F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.461F, 11.2815F, -9.1331F, 0.0102F, 0.104F, 1.5801F));

		PartDefinition cube_r306 = body4.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(0, 0).addBox(11.4979F, -6.6217F, 1.0F, 9.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5F, -8.0848F, -8.8951F, 0.0103F, 0.1913F, 1.581F));

		PartDefinition cube_r307 = body4.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(0, 28).addBox(6.5872F, -4.1965F, 1.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5F, -8.0848F, -8.8951F, -0.0285F, 0.1895F, 1.3766F));

		PartDefinition cube_r308 = body4.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(110, 31).addBox(0.0F, -0.5F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3852F, -5.6181F, -9.2958F, -0.091F, 0.0639F, 1.0321F));

		PartDefinition cube_r309 = body4.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(19, 59).addBox(3.6252F, -1.6905F, 1.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5F, -8.0848F, -8.8951F, -0.0921F, 0.1682F, 1.0224F));

		PartDefinition cube_r310 = body4.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(19, 42).addBox(0.0F, 0.0F, 0.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5F, -8.0848F, -8.8951F, -0.1545F, 0.1136F, 0.5851F));

		PartDefinition cube_r311 = body4.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(0, 20).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -8.0848F, -8.8951F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r312 = body4.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(72, 118).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -5.7399F, -5.7777F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r313 = body4.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(139, 12).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -5.6614F, -4.7807F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r314 = body4.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(38, 57).addBox(-0.5F, -5.0F, -5.7F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 0.577F, -0.6266F, -0.2531F, 0.0F, 0.0F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9233F, -1.33F, -5.2721F, 0.0349F, -0.0436F, -0.0015F));

		PartDefinition cube_r315 = body3.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(29, 104).addBox(-0.5F, -1.9061F, 3.9442F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9233F, -1.2943F, -6.8627F, -0.1222F, 0.0F, 0.0F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9233F, -0.0965F, -2.8954F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r316 = body2.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(74, 61).mirror().addBox(-7.9634F, -6.3807F, -0.1722F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0585F, -4.4543F, -0.0737F, 0.5524F, -1.8565F));

		PartDefinition cube_r317 = body2.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(128, 94).mirror().addBox(-6.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0585F, -4.4543F, 0.2998F, 0.5134F, -1.1446F));

		PartDefinition cube_r318 = body2.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(45, 129).mirror().addBox(-4.8362F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0585F, -4.4543F, 0.51F, 0.3439F, -0.6491F));

		PartDefinition cube_r319 = body2.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(63, 34).mirror().addBox(-2.0073F, 0.1202F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0585F, -4.4543F, 0.6082F, 0.1071F, -0.2194F));

		PartDefinition cube_r320 = body2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(19, 40).mirror().addBox(-4.9634F, -6.3807F, -0.1722F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1415F, -3.1543F, -0.2291F, 0.4518F, -1.8666F));

		PartDefinition cube_r321 = body2.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(130, 0).mirror().addBox(-4.8362F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1415F, -3.1543F, 0.357F, 0.4369F, -0.6426F));

		PartDefinition cube_r322 = body2.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(130, 2).mirror().addBox(-6.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1415F, -3.1543F, 0.1052F, 0.5246F, -1.1765F));

		PartDefinition cube_r323 = body2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(98, 72).mirror().addBox(-2.0073F, 0.1202F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1415F, -3.1543F, 0.5199F, 0.2524F, -0.1704F));

		PartDefinition cube_r324 = body2.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(37, 90).mirror().addBox(-4.9113F, -2.9566F, -0.3511F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3416F, -2.1543F, 0.0932F, 0.8418F, -1.3112F));

		PartDefinition cube_r325 = body2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(139, 43).mirror().addBox(-2.0073F, 0.1203F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3416F, -2.1543F, 0.8075F, 0.4175F, -0.202F));

		PartDefinition cube_r326 = body2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(130, 31).mirror().addBox(-4.8362F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3416F, -2.1543F, 0.558F, 0.7062F, -0.6597F));

		PartDefinition cube_r327 = body2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(130, 31).addBox(1.8363F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3416F, -2.1543F, 0.558F, -0.7062F, 0.6597F));

		PartDefinition cube_r328 = body2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(139, 43).addBox(0.0073F, 0.1203F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3416F, -2.1543F, 0.8075F, -0.4175F, 0.202F));

		PartDefinition cube_r329 = body2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(37, 90).addBox(3.9113F, -2.9566F, -0.3511F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3416F, -2.1543F, 0.0932F, -0.8418F, 1.3112F));

		PartDefinition cube_r330 = body2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(98, 72).addBox(0.0073F, 0.1202F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1415F, -3.1543F, 0.5199F, -0.2524F, 0.1704F));

		PartDefinition cube_r331 = body2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(130, 2).addBox(3.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1415F, -3.1543F, 0.1052F, -0.5246F, 1.1765F));

		PartDefinition cube_r332 = body2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(130, 0).addBox(1.8363F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1415F, -3.1543F, 0.357F, -0.4369F, 0.6426F));

		PartDefinition cube_r333 = body2.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(19, 40).addBox(3.9634F, -6.3807F, -0.1722F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1415F, -3.1543F, -0.2291F, -0.4518F, 1.8666F));

		PartDefinition cube_r334 = body2.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(63, 34).addBox(0.0073F, 0.1202F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0585F, -4.4543F, 0.6082F, -0.1071F, 0.2194F));

		PartDefinition cube_r335 = body2.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(45, 129).addBox(1.8363F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0585F, -4.4543F, 0.51F, -0.3439F, 0.6491F));

		PartDefinition cube_r336 = body2.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(128, 94).addBox(3.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0585F, -4.4543F, 0.2998F, -0.5134F, 1.1446F));

		PartDefinition cube_r337 = body2.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(74, 61).addBox(3.9634F, -6.3807F, -0.1722F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0585F, -4.4543F, -0.0737F, -0.5524F, 1.8565F));

		PartDefinition cube_r338 = body2.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(51, 77).addBox(-0.5F, -2.0F, -4.9F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.1F, 0.0524F, 0.0F, 0.0F));

		PartDefinition body5 = body2.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, -4.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r339 = body5.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(114, 104).mirror().addBox(-7.9634F, -6.3807F, -0.1722F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1585F, -3.5543F, 0.0751F, 0.0843F, -1.81F));

		PartDefinition cube_r340 = body5.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(130, 25).mirror().addBox(-6.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1585F, -3.5543F, 0.1193F, 0.0559F, -1.1983F));

		PartDefinition cube_r341 = body5.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(26, 130).mirror().addBox(-4.8362F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1585F, -3.5543F, 0.1375F, 0.0186F, -0.7194F));

		PartDefinition cube_r342 = body5.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(118, 70).mirror().addBox(-2.0073F, 0.1202F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1585F, -3.5543F, 0.1365F, -0.0228F, -0.2412F));

		PartDefinition cube_r343 = body5.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(48, 22).mirror().addBox(-8.9634F, -6.3807F, -0.1722F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2416F, -1.9543F, 0.0465F, 0.1137F, -1.7621F));

		PartDefinition cube_r344 = body5.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(130, 27).mirror().addBox(-4.8362F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2416F, -1.9543F, 0.1505F, 0.0575F, -0.6681F));

		PartDefinition cube_r345 = body5.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(130, 29).mirror().addBox(-6.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2416F, -1.9543F, 0.1129F, 0.0964F, -1.148F));

		PartDefinition cube_r346 = body5.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(135, 52).mirror().addBox(-2.0073F, 0.1203F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2416F, -1.9543F, 0.1659F, 0.0057F, -0.1906F));

		PartDefinition cube_r347 = body5.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(135, 52).addBox(0.0073F, 0.1203F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2416F, -1.9543F, 0.1659F, -0.0057F, 0.1906F));

		PartDefinition cube_r348 = body5.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(130, 29).addBox(3.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2416F, -1.9543F, 0.1129F, -0.0964F, 1.148F));

		PartDefinition cube_r349 = body5.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(130, 27).addBox(1.8363F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2416F, -1.9543F, 0.1505F, -0.0575F, 0.6681F));

		PartDefinition cube_r350 = body5.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(48, 22).addBox(3.9634F, -6.3807F, -0.1722F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2416F, -1.9543F, 0.0465F, -0.1137F, 1.7621F));

		PartDefinition cube_r351 = body5.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(118, 70).addBox(0.0073F, 0.1202F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1585F, -3.5543F, 0.1365F, 0.0228F, 0.2412F));

		PartDefinition cube_r352 = body5.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(26, 130).addBox(1.8363F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1585F, -3.5543F, 0.1375F, -0.0186F, 0.7194F));

		PartDefinition cube_r353 = body5.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(130, 25).addBox(3.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1585F, -3.5543F, 0.1193F, -0.0559F, 1.1983F));

		PartDefinition cube_r354 = body5.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(114, 104).addBox(3.9634F, -6.3807F, -0.1722F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1585F, -3.5543F, 0.0751F, -0.0843F, 1.81F));

		PartDefinition cube_r355 = body5.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(99, 28).addBox(-0.5F, -1.0F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.1F, 0.0524F, 0.0F, 0.0F));

		PartDefinition body = body5.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1007F, -4.0019F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r356 = body.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(104, 61).mirror().addBox(-0.5F, 0.0F, -0.2F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5079F, 9.0806F, -4.5493F, -1.2968F, -0.5528F, 1.4533F));

		PartDefinition cube_r357 = body.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(24, 90).mirror().addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4472F, 9.9006F, -4.0275F, -0.9504F, -0.5175F, 1.4365F));

		PartDefinition cube_r358 = body.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4376F, 10.7831F, -3.5141F, -0.7739F, -0.5096F, 1.3939F));

		PartDefinition cube_r359 = body.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(48, 13).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3708F, 10.7909F, -3.53F, -0.5594F, -0.4024F, 1.1474F));

		PartDefinition cube_r360 = body.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(27, 14).mirror().addBox(-0.5F, 0.0F, 0.1F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4602F, 10.8691F, -3.4512F, -0.3204F, -0.4309F, 1.0134F));

		PartDefinition cube_r361 = body.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(51, 100).mirror().addBox(-2.0073F, 0.1202F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3399F, -1.1713F, 0.006F, -0.0343F, -0.3025F));

		PartDefinition cube_r362 = body.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(130, 4).mirror().addBox(-4.8362F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3399F, -1.1713F, 0.0271F, -0.0518F, -0.7827F));

		PartDefinition cube_r363 = body.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(130, 11).mirror().addBox(-6.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3399F, -1.1713F, 0.0539F, -0.0575F, -1.2633F));

		PartDefinition cube_r364 = body.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(130, 13).mirror().addBox(-6.9634F, -6.3807F, -0.1722F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3399F, -1.1713F, 0.0866F, -0.0462F, -1.8749F));

		PartDefinition cube_r365 = body.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(80, 51).mirror().addBox(-7.7432F, -2.9834F, -0.2853F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3399F, -2.8713F, 0.0938F, -0.0871F, -1.4792F));

		PartDefinition cube_r366 = body.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(130, 15).mirror().addBox(-4.7012F, -0.9198F, -0.3931F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3399F, -2.8713F, 0.0488F, -0.0964F, -0.9973F));

		PartDefinition cube_r367 = body.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(117, 59).mirror().addBox(-1.9357F, -0.0311F, -0.4395F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3399F, -2.8713F, 0.0045F, -0.0839F, -0.5155F));

		PartDefinition cube_r368 = body.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(117, 59).addBox(-0.0643F, -0.0311F, -0.4395F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3399F, -2.8713F, 0.0045F, 0.0839F, 0.5155F));

		PartDefinition cube_r369 = body.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(130, 15).addBox(1.7012F, -0.9198F, -0.3931F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3399F, -2.8713F, 0.0488F, 0.0964F, 0.9973F));

		PartDefinition cube_r370 = body.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(80, 51).addBox(3.7432F, -2.9834F, -0.2853F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3399F, -2.8713F, 0.0938F, 0.0871F, 1.4792F));

		PartDefinition cube_r371 = body.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(130, 13).addBox(3.9634F, -6.3807F, -0.1722F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3399F, -1.1713F, 0.0866F, 0.0462F, 1.8749F));

		PartDefinition cube_r372 = body.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(130, 11).addBox(3.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3399F, -1.1713F, 0.0539F, 0.0575F, 1.2633F));

		PartDefinition cube_r373 = body.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(130, 4).addBox(1.8363F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3399F, -1.1713F, 0.0271F, 0.0518F, 0.7827F));

		PartDefinition cube_r374 = body.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(51, 100).addBox(0.0073F, 0.1202F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3399F, -1.1713F, 0.006F, 0.0343F, 0.3025F));

		PartDefinition cube_r375 = body.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(118, 66).addBox(-2.4624F, 0.7819F, -3.2328F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4624F, 9.6396F, -3.3203F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r376 = body.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(27, 14).addBox(-0.5F, 0.0F, 0.1F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4602F, 10.8691F, -3.4512F, -0.3204F, 0.4309F, -1.0134F));

		PartDefinition cube_r377 = body.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(48, 13).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3708F, 10.7909F, -3.53F, -0.5594F, 0.4024F, -1.1474F));

		PartDefinition cube_r378 = body.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(73, 0).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4376F, 10.7831F, -3.5141F, -0.7739F, 0.5096F, -1.3939F));

		PartDefinition cube_r379 = body.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(24, 90).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4472F, 9.9006F, -4.0275F, -0.9504F, 0.5175F, -1.4365F));

		PartDefinition cube_r380 = body.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(104, 61).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5079F, 9.0806F, -4.5493F, -1.2968F, 0.5528F, -1.4533F));

		PartDefinition cube_r381 = body.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(20, 112).addBox(-1.9624F, 0.3287F, -1.7115F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4624F, 9.6396F, -3.3203F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r382 = body.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(29, 96).addBox(-1.0F, -0.0269F, -1.9388F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2399F, -1.8713F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r383 = body.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(7, 129).addBox(-0.5F, -0.0401F, -2.1382F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.2F, 0.3491F, 0.0F, 0.0F));

		PartDefinition bone = body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(6.5569F, 4.6449F, 0.8843F, -0.219F, -0.0852F, 0.0189F));

		PartDefinition cube_r384 = bone.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(0, 92).addBox(-0.5F, -2.95F, -0.375F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1297F, 1.5073F, 0.0047F, 0.0367F, 0.3028F, -0.2662F));

		PartDefinition cube_r385 = bone.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(10, 141).addBox(-0.5F, -0.3F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.1012F, 0.7376F, -0.0605F, 0.604F, 0.3028F, -0.2662F));

		PartDefinition cube_r386 = bone.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(124, 59).addBox(-0.5F, -1.3F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0913F, 0.6275F, 3.7154F, -0.2687F, 0.3028F, -0.2662F));

		PartDefinition cube_r387 = bone.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(139, 61).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.1642F, -0.5144F, 4.9021F, -0.8796F, 0.3028F, -0.2662F));

		PartDefinition cube_r388 = bone.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(116, 77).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6309F, 1.4796F, 4.6646F, -1.4468F, 0.3028F, -0.2662F));

		PartDefinition cube_r389 = bone.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(86, 89).addBox(-0.5F, -1.375F, -1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3523F, -2.3598F, 1.7721F, -0.9668F, 0.3028F, -0.2662F));

		PartDefinition cube_r390 = bone.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(20, 105).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2897F, -4.9489F, -2.0047F, 0.6738F, 0.3028F, -0.2662F));

		PartDefinition cube_r391 = bone.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(14, 136).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.0748F, -5.2601F, -1.079F, 0.2462F, 0.3028F, -0.2662F));

		PartDefinition cube_r392 = bone.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(119, 20).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3932F, -4.9656F, 0.7781F, -0.2338F, 0.3028F, -0.2662F));

		PartDefinition cube_r393 = bone.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(47, 118).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6193F, -3.942F, 2.3065F, -0.6352F, 0.3028F, -0.2662F));

		PartDefinition cube_r394 = bone.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(106, 56).addBox(-0.8604F, -1.2864F, 1.9247F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.5813F, 0.3028F, -0.2662F));

		PartDefinition cube_r395 = bone.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(108, 140).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6438F, 3.1398F, -3.7589F, 2.8293F, 0.3028F, -0.2662F));

		PartDefinition cube_r396 = bone.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(139, 24).addBox(-0.5F, -1.0F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.6358F, 1.7593F, -2.572F, -3.1049F, 0.3028F, -0.2662F));

		PartDefinition cube_r397 = bone.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(0, 129).addBox(-0.7604F, -2.7939F, 0.38F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.9165F, 0.3028F, -0.2662F));

		PartDefinition cube_r398 = bone.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(19, 136).addBox(-0.5F, -3.0F, -1.4F, 2.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6772F, -0.6704F, -2.4003F, 2.4229F, -0.2261F, -0.003F));

		PartDefinition cube_r399 = bone.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(75, 104).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4013F, -0.5044F, -0.3955F, 3.0121F, -0.2687F, -0.2694F));

		PartDefinition cube_r400 = bone.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(20, 96).addBox(-0.7604F, -2.773F, -0.2958F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.5675F, 0.3028F, -0.2662F));

		PartDefinition cube_r401 = bone.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(0, 118).addBox(-0.5F, -1.5F, -1.275F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.2473F, -0.1671F, -2.8386F, 2.3057F, 0.3028F, -0.2662F));

		PartDefinition cube_r402 = bone.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(57, 135).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.5904F, 0.4065F, -4.3544F, 1.6948F, 0.3028F, -0.2662F));

		PartDefinition cube_r403 = bone.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(96, 116).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.882F, -0.5422F, -4.4831F, 1.2585F, 0.3028F, -0.2662F));

		PartDefinition cube_r404 = bone.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(21, 117).addBox(-0.5F, -2.025F, -0.95F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.6535F, -2.2862F, -2.3087F, 1.6512F, 0.3028F, -0.2662F));

		PartDefinition bone3 = body.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5569F, 4.6449F, 0.8843F, -0.219F, 0.0852F, -0.0189F));

		PartDefinition cube_r405 = bone3.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-0.5F, -2.95F, -0.375F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1297F, 1.5073F, 0.0047F, 0.0367F, -0.3028F, 0.2662F));

		PartDefinition cube_r406 = bone3.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(10, 141).mirror().addBox(-0.5F, -0.3F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.1012F, 0.7376F, -0.0605F, 0.604F, -0.3028F, 0.2662F));

		PartDefinition cube_r407 = bone3.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(124, 59).mirror().addBox(-0.5F, -1.3F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.0913F, 0.6275F, 3.7154F, -0.2687F, -0.3028F, 0.2662F));

		PartDefinition cube_r408 = bone3.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(139, 61).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1642F, -0.5144F, 4.9021F, -0.8796F, -0.3028F, 0.2662F));

		PartDefinition cube_r409 = bone3.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(116, 77).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6309F, 1.4796F, 4.6646F, -1.4468F, -0.3028F, 0.2662F));

		PartDefinition cube_r410 = bone3.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(86, 89).mirror().addBox(-0.5F, -1.375F, -1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3523F, -2.3598F, 1.7721F, -0.9668F, -0.3028F, 0.2662F));

		PartDefinition cube_r411 = bone3.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(20, 105).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2897F, -4.9489F, -2.0047F, 0.6738F, -0.3028F, 0.2662F));

		PartDefinition cube_r412 = bone3.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(14, 136).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(2.0748F, -5.2601F, -1.079F, 0.2462F, -0.3028F, 0.2662F));

		PartDefinition cube_r413 = bone3.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(119, 20).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.3932F, -4.9656F, 0.7781F, -0.2338F, -0.3028F, 0.2662F));

		PartDefinition cube_r414 = bone3.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(47, 118).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.6193F, -3.942F, 2.3065F, -0.6352F, -0.3028F, 0.2662F));

		PartDefinition cube_r415 = bone3.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(106, 56).mirror().addBox(-1.1396F, -1.2864F, 1.9247F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.5813F, -0.3028F, 0.2662F));

		PartDefinition cube_r416 = bone3.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(108, 140).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.6438F, 3.1398F, -3.7589F, 2.8293F, -0.3028F, 0.2662F));

		PartDefinition cube_r417 = bone3.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(139, 24).mirror().addBox(-0.5F, -1.0F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.6358F, 1.7593F, -2.572F, -3.1049F, -0.3028F, 0.2662F));

		PartDefinition cube_r418 = bone3.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(0, 129).mirror().addBox(-0.2396F, -2.7939F, 0.38F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.9165F, -0.3028F, 0.2662F));

		PartDefinition cube_r419 = bone3.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(19, 136).mirror().addBox(-1.5F, -3.0F, -1.4F, 2.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6772F, -0.6704F, -2.4003F, 2.4229F, 0.2261F, 0.003F));

		PartDefinition cube_r420 = bone3.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(75, 104).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4013F, -0.5044F, -0.3955F, 3.0121F, 0.2687F, 0.2694F));

		PartDefinition cube_r421 = bone3.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(20, 96).mirror().addBox(-0.2396F, -2.773F, -0.2958F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.5675F, -0.3028F, 0.2662F));

		PartDefinition cube_r422 = bone3.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(0, 118).mirror().addBox(-0.5F, -1.5F, -1.275F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.2473F, -0.1671F, -2.8386F, 2.3057F, -0.3028F, 0.2662F));

		PartDefinition cube_r423 = bone3.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(57, 135).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.5904F, 0.4065F, -4.3544F, 1.6948F, -0.3028F, 0.2662F));

		PartDefinition cube_r424 = bone3.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(96, 116).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.882F, -0.5422F, -4.4831F, 1.2585F, -0.3028F, 0.2662F));

		PartDefinition cube_r425 = bone3.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(21, 117).mirror().addBox(-0.5F, -2.025F, -0.95F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.6535F, -2.2862F, -2.3087F, 1.6512F, -0.3028F, 0.2662F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7679F, -3.1309F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r426 = chest.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(130, 96).addBox(-0.5F, -1.0F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.486F, -1.4626F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r427 = chest.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(47, 78).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8245F, 0.0937F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.1676F, 5.4007F, 0.1914F, -1.5954F, 0.3285F, -0.2644F));

		PartDefinition cube_r428 = leftArm.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(79, 135).addBox(-1.0F, -0.35F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.02F, 0.413F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r429 = leftArm.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(68, 93).addBox(-1.0F, -0.65F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -0.6F, 0.7F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r430 = leftArm.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(20, 141).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -0.6522F, 7.5255F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r431 = leftArm.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(138, 141).addBox(-0.5F, 0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 141).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.578F, 6.4455F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r432 = leftArm.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(79, 141).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -1.5211F, 6.4701F, 1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r433 = leftArm.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(100, 130).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -1.3474F, 5.4852F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r434 = leftArm.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(141, 16).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9419F, 6.0645F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r435 = leftArm.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(15, 141).addBox(-0.5F, -0.775F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6454F, -0.0873F, 3.5032F, 0.3054F, 0.0F, -0.5672F));

		PartDefinition cube_r436 = leftArm.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(114, 12).addBox(-0.5F, -0.7484F, -2.6016F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0016F, 2.7516F, 0.1745F, 0.0F, -0.5672F));

		PartDefinition cube_r437 = leftArm.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(112, 38).addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 1.2F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(135, 90).addBox(-0.5F, -0.2965F, -0.3472F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(135, 109).addBox(-0.5F, -0.4965F, 0.0528F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1397F, -0.9011F, 8.7672F, 0.2184F, 0.5677F, -0.1971F));

		PartDefinition cube_r438 = leftArm2.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(70, 124).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.33F, 3.1496F, -0.4132F, -0.1128F, -0.2618F, 0.0826F));

		PartDefinition cube_r439 = leftArm2.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(92, 135).addBox(-1.0F, 0.0F, -1.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 0.0035F, 1.7528F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r440 = leftArm2.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(93, 138).addBox(-0.5F, -1.1F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 3.4731F, 0.2055F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r441 = leftArm2.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(139, 39).addBox(-0.5F, -1.1F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 1.5035F, 0.5528F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r442 = leftArm2.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(139, 28).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5035F, 0.5528F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(126, 20).addBox(-0.9856F, 0.0926F, -1.0522F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.6054F, 5.3293F, 0.1577F, -0.6666F, 0.4024F, -1.0618F));

		PartDefinition cube_r443 = leftArm3.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(54, 129).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4856F, 2.3941F, 1.4624F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r444 = leftArm3.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(135, 104).addBox(-0.5F, -0.8F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4856F, 2.4987F, 0.267F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r445 = leftArm3.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(24, 85).addBox(-0.5F, -1.1F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4856F, 2.5926F, -0.5522F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.1676F, 5.4007F, 0.1914F, -2.2062F, -0.3285F, 0.2644F));

		PartDefinition cube_r446 = rightArm.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(137, 45).addBox(-1.0F, -0.35F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.02F, 0.413F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r447 = rightArm.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(126, 55).addBox(-1.0F, -0.65F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, -0.6F, 0.7F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r448 = rightArm.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(144, 70).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -0.6522F, 7.5255F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r449 = rightArm.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(144, 67).addBox(-0.5F, 0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(144, 64).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.578F, 6.4455F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r450 = rightArm.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(144, 61).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, -1.5211F, 6.4701F, 1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r451 = rightArm.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(114, 132).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, -1.3474F, 5.4852F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r452 = rightArm.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(50, 144).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9419F, 6.0645F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r453 = rightArm.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(144, 45).addBox(-0.5F, -0.775F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6454F, -0.0873F, 3.5032F, 0.3054F, 0.0F, 0.5672F));

		PartDefinition cube_r454 = rightArm.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(29, 116).addBox(-0.5F, -0.7484F, -2.6016F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, -0.0016F, 2.7516F, 0.1745F, 0.0F, 0.5672F));

		PartDefinition cube_r455 = rightArm.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(116, 7).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 1.2F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(99, 137).addBox(-1.5F, -0.2965F, -0.3472F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 137).addBox(-1.5F, -0.4965F, 0.0528F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1397F, -0.9011F, 8.7672F, 0.06F, -0.5766F, 0.2479F));

		PartDefinition cube_r456 = rightArm2.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(40, 125).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.33F, 3.1496F, -0.4132F, -0.1128F, 0.2618F, -0.0826F));

		PartDefinition cube_r457 = rightArm2.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(137, 112).addBox(-1.0F, 0.0F, -1.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 0.0035F, 1.7528F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r458 = rightArm2.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(120, 138).addBox(-0.5F, -1.1F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 3.4731F, 0.2055F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r459 = rightArm2.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(125, 139).addBox(-0.5F, -1.1F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 1.5035F, 0.5528F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r460 = rightArm2.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(113, 139).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.5035F, 0.5528F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(126, 80).addBox(-0.0144F, 0.0926F, -1.0522F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.6054F, 5.3293F, 0.1577F, -0.3187F, -0.9427F, 0.4138F));

		PartDefinition cube_r461 = rightArm3.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(69, 131).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4856F, 2.3941F, 1.4624F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r462 = rightArm3.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(133, 137).addBox(-0.5F, -0.8F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4856F, 2.4987F, 0.267F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r463 = rightArm3.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(87, 133).addBox(-0.5F, -1.1F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4856F, 2.5926F, -0.5522F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4433F, -1.4657F, -0.4233F, -0.2063F, 0.1841F));

		PartDefinition cube_r464 = neck3.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(20, 92).addBox(0.0F, -1.5477F, 0.0842F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.372F, -1.3523F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r465 = neck3.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(25, 141).addBox(-0.5F, -0.175F, 3.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.128F, -4.7523F, 0.4014F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2191F, -1.0418F, -0.6658F, -0.1782F, 0.1265F));

		PartDefinition cube_r466 = neck2.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(13, 78).addBox(0.0F, -0.7373F, -0.0576F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2408F, -1.9045F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r467 = neck2.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(38, 114).addBox(-0.5F, -1.0F, -1.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.5504F, -1.3541F, 0.3316F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6848F, -0.6576F, -1.042F, 0.0068F, 0.1392F));

		PartDefinition cube_r468 = head.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(17, 71).addBox(-0.5F, -3.4F, -3.8F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 5.0309F, 0.1975F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r469 = head.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(35, 143).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.009F, 7.5876F, -1.6669F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r470 = head.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(119, 143).addBox(0.0F, 0.0522F, -0.2013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(130, 142).addBox(0.0F, -0.1478F, -0.2013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.491F, 7.1274F, -2.6543F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r471 = head.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(26, 125).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 6.3202F, -0.5753F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r472 = head.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(79, 121).addBox(-0.509F, -1.75F, -1.15F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.009F, 6.6309F, -1.0935F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r473 = head.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(54, 120).addBox(-0.5F, -0.0019F, 0.0123F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.491F, 6.4274F, -3.2543F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r474 = head.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(105, 114).addBox(0.0F, -0.0019F, 0.0123F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.991F, 4.7496F, -4.3068F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r475 = head.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(117, 119).addBox(0.0F, -0.0019F, 0.0123F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.006F, 3.761F, -4.4663F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r476 = head.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(64, 104).addBox(-0.5F, -0.7019F, 0.0123F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.991F, 2.4921F, -4.1678F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r477 = head.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(29, 100).addBox(-2.5F, 0.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -0.4042F, -1.8849F, -1.5097F, 0.0F, 0.0F));

		PartDefinition cube_r478 = head.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(108, 51).addBox(-2.5F, 0.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, -0.1618F, -1.4476F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r479 = head.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(105, 77).addBox(-2.5F, 0.0F, -1.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -0.1531F, -0.9477F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r480 = head.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(139, 65).addBox(-0.5F, -1.0F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 6.2123F, 0.5589F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r481 = head.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(62, 139).addBox(-1.0F, -1.7943F, -0.7851F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.5F, 7.4012F, 0.8457F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r482 = head.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(99, 43).addBox(-1.5F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.491F, 0.1851F, -2.4291F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r483 = head.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(99, 39).addBox(-1.5F, 0.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.491F, -0.277F, -3.436F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r484 = head.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(121, 30).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, 5.1057F, -4.7889F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r485 = head.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(110, 110).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, 3.1459F, -5.1876F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r486 = head.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(51, 106).addBox(-2.0F, -0.7F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, 1.1234F, -3.9837F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r487 = head.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(97, 47).addBox(-1.0F, 0.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.997F, 0.6437F, -3.8109F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r488 = head.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(119, 51).addBox(-1.5F, -1.1F, -0.075F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.938F, -1.4423F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r489 = head.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(83, 69).addBox(-1.5F, -0.1F, 0.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.491F, 1.6253F, -3.9628F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r490 = head.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(142, 48).addBox(-0.6177F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1177F, 7.8355F, 0.3176F, -0.4786F, -0.0357F, -0.0253F));

		PartDefinition leftSygomaticarch = head.addOrReplaceChild("leftSygomaticarch", CubeListBuilder.create(), PartPose.offset(2.9479F, 7.4281F, 0.4418F));

		PartDefinition cube_r491 = leftSygomaticarch.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(114, 99).addBox(-0.8F, -0.375F, -2.85F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.1921F, 0.1504F, 0.3726F, -0.7716F, -0.0097F, -0.2825F));

		PartDefinition cube_r492 = leftSygomaticarch.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(126, 136).addBox(-1.5233F, -0.4936F, -0.5242F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.4528F, -2.6719F, -3.3594F, -0.604F, -0.6544F, 1.5319F));

		PartDefinition cube_r493 = leftSygomaticarch.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(144, 9).addBox(-0.07F, -0.6595F, -0.5242F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4528F, -2.6719F, -3.3594F, 0.1695F, -0.8466F, 0.4593F));

		PartDefinition cube_r494 = leftSygomaticarch.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(142, 108).addBox(-0.2714F, 0.1928F, -0.5243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4528F, -2.6719F, -3.3594F, 0.6502F, -0.6086F, -0.2423F));

		PartDefinition cube_r495 = leftSygomaticarch.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(132, 41).addBox(-0.5F, -0.825F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(130, 128).addBox(-0.5F, -0.525F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5601F, -2.4431F, -2.0111F, 0.5903F, 0.538F, 0.4057F));

		PartDefinition cube_r496 = leftSygomaticarch.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(33, 132).addBox(-0.5F, -0.8F, -1.525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1524F, -5.6505F, -2.851F, 1.536F, 0.2168F, -0.0397F));

		PartDefinition cube_r497 = leftSygomaticarch.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(144, 0).addBox(-0.5F, -0.475F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1524F, -5.6505F, -2.851F, 1.8414F, 0.2168F, -0.0397F));

		PartDefinition cube_r498 = leftSygomaticarch.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(142, 95).addBox(-0.9753F, 0.8185F, 0.0463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5485F, -4.0942F, -3.5439F, 2.1032F, 0.2168F, -0.0397F));

		PartDefinition cube_r499 = leftSygomaticarch.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(79, 118).addBox(-0.9503F, -0.3228F, -0.0078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6079F, -3.9111F, -2.2253F, 2.5261F, 0.1029F, 0.1489F));

		PartDefinition cube_r500 = leftSygomaticarch.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(144, 6).addBox(-0.5F, -0.825F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1341F, -3.4682F, -1.7426F, 3.0061F, 0.1029F, 0.1489F));

		PartDefinition cube_r501 = leftSygomaticarch.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(142, 92).addBox(-0.5F, -0.825F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1994F, -4.0551F, -1.9608F, -2.6663F, 0.1029F, 0.1489F));

		PartDefinition cube_r502 = leftSygomaticarch.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(130, 112).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1916F, -4.1776F, -1.1614F, 2.2487F, 0.0103F, 0.1345F));

		PartDefinition cube_r503 = leftSygomaticarch.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(54, 115).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(115, 61).addBox(-1.0F, 0.4F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.9389F, -4.9348F, -4.5972F, -0.2415F, 0.0379F, 0.1525F));

		PartDefinition cube_r504 = leftSygomaticarch.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(15, 144).addBox(-1.0F, -0.025F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.1579F, -3.5932F, -4.9317F, 0.1935F, 0.3905F, 0.2645F));

		PartDefinition cube_r505 = leftSygomaticarch.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(62, 132).addBox(-1.0F, -1.0F, -1.675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.6036F, -2.0149F, -0.969F, -0.0019F, -0.8394F, -0.1991F));

		PartDefinition cube_r506 = leftSygomaticarch.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(132, 63).addBox(-0.875F, -0.15F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.9466F, -1.4905F, -0.4532F, -0.7349F, 0.0039F, 0.1518F));

		PartDefinition cube_r507 = leftSygomaticarch.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(42, 100).addBox(-0.925F, -2.0F, -3.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.6356F, -2.3785F, 0.722F, -0.3447F, 0.0301F, 0.1955F));

		PartDefinition cube_r508 = leftSygomaticarch.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(131, 120).addBox(-1.0F, -0.025F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.1579F, -3.5932F, -4.9317F, 0.1789F, 0.0301F, 0.1955F));

		PartDefinition cube_r509 = leftSygomaticarch.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(144, 12).addBox(-1.0F, -0.025F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.3391F, -2.651F, -4.7583F, 0.5628F, 0.3369F, 0.3835F));

		PartDefinition cube_r510 = leftSygomaticarch.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(131, 124).addBox(-1.0F, -0.025F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.3391F, -2.651F, -4.7583F, 0.528F, 0.0301F, 0.1955F));

		PartDefinition cube_r511 = leftSygomaticarch.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(10, 144).addBox(-1.0F, -0.05F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.492F, -1.8006F, -4.2548F, 0.6391F, 0.2692F, 0.4816F));

		PartDefinition cube_r512 = leftSygomaticarch.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(132, 6).addBox(-1.0F, -0.05F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.492F, -1.8006F, -4.2548F, 0.6135F, -0.0504F, 0.251F));

		PartDefinition cube_r513 = leftSygomaticarch.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(7, 137).addBox(-2.0F, -0.0785F, -1.0056F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.2804F, -1.5602F, -2.9514F, 1.1115F, 0.7078F, 1.6673F));

		PartDefinition cube_r514 = leftSygomaticarch.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(20, 144).addBox(-1.0F, -0.0785F, -0.0056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.7225F, -1.0207F, -3.668F, 0.7719F, -0.0044F, 0.691F));

		PartDefinition cube_r515 = leftSygomaticarch.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(19, 132).addBox(-1.0F, 0.9215F, -0.0806F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.492F, -1.8006F, -4.2548F, 0.7008F, -0.0504F, 0.251F));

		PartDefinition cube_r516 = leftSygomaticarch.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(109, 143).addBox(-0.4825F, -0.199F, -0.9408F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.1464F, -1.1044F, -2.3705F, 0.6736F, -0.0498F, 0.2721F));

		PartDefinition cube_r517 = leftSygomaticarch.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(114, 143).addBox(-0.4825F, -1.0116F, -0.6272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.1464F, -1.1044F, -2.3705F, -0.7663F, -0.0498F, 0.2721F));

		PartDefinition cube_r518 = leftSygomaticarch.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(139, 73).addBox(-0.4825F, -1.2618F, -0.4978F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.1464F, -1.1044F, -2.3705F, -0.0682F, -0.0498F, 0.2721F));

		PartDefinition cube_r519 = leftSygomaticarch.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(104, 143).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(94, 143).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.3637F, -0.4015F, -2.7111F, 0.7407F, -0.2627F, 0.2855F));

		PartDefinition cube_r520 = leftSygomaticarch.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(99, 143).addBox(-0.8F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.6389F, 0.5802F, -2.0533F, 0.8006F, -0.4724F, 0.4029F));

		PartDefinition cube_r521 = leftSygomaticarch.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(142, 89).addBox(-0.5F, -0.1F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0636F, -3.3217F, -0.6855F, -2.228F, -0.0007F, 0.1481F));

		PartDefinition cube_r522 = leftSygomaticarch.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(105, 111).addBox(-0.35F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.102F, -2.2274F, 2.7671F, 2.179F, -0.0007F, 0.1481F));

		PartDefinition cube_r523 = leftSygomaticarch.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(143, 140).addBox(-0.35F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.128F, -2.0499F, 2.0905F, -2.8825F, -0.0007F, 0.1481F));

		PartDefinition cube_r524 = leftSygomaticarch.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(143, 137).addBox(-0.35F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.1408F, -1.9613F, 1.3963F, -1.4426F, -0.0007F, 0.1481F));

		PartDefinition cube_r525 = leftSygomaticarch.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(0, 144).addBox(-0.35F, -1.125F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(143, 143).addBox(-0.35F, -1.125F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.14F, -1.9631F, 0.6963F, -0.3081F, -0.0007F, 0.1481F));

		PartDefinition cube_r526 = leftSygomaticarch.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(124, 143).addBox(-0.35F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.14F, -1.9631F, 0.6963F, -0.0027F, -0.0007F, 0.1481F));

		PartDefinition cube_r527 = leftSygomaticarch.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(26, 132).addBox(-0.5F, -0.1F, -2.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.009F, -2.842F, 0.8409F, -0.4826F, -0.0007F, 0.1481F));

		PartDefinition cube_r528 = leftSygomaticarch.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(107, 130).addBox(-0.5F, -1.1F, -0.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1145F, -2.125F, -1.2745F, -0.1336F, -0.0007F, 0.1481F));

		PartDefinition cube_r529 = leftSygomaticarch.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(67, 142).addBox(-0.0731F, 3.0116F, 3.4067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4521F, -7.9317F, -3.0363F, -0.5479F, -0.087F, 0.1487F));

		PartDefinition cube_r530 = leftSygomaticarch.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(0, 137).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2128F, -7.2248F, -3.2615F, 0.2362F, 0.2079F, 0.5232F));

		PartDefinition cube_r531 = leftSygomaticarch.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(142, 51).addBox(-0.7469F, -0.7869F, -0.4661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2859F, -6.4013F, -3.2308F, -0.02F, 0.3128F, -0.4035F));

		PartDefinition cube_r532 = leftSygomaticarch.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(5, 144).addBox(-0.8F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6095F, -4.5481F, -4.1513F, -0.3771F, 0.5154F, 0.7106F));

		PartDefinition cube_r533 = leftSygomaticarch.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(113, 136).addBox(-1.8F, -0.8F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1631F, -4.1963F, -4.3436F, -0.5936F, -0.1593F, -0.4999F));

		PartDefinition cube_r534 = leftSygomaticarch.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(137, 93).addBox(0.0F, 0.175F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.9407F, -7.1777F, -4.5825F, -0.3862F, -0.2976F, 0.1417F));

		PartDefinition cube_r535 = leftSygomaticarch.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(69, 137).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3593F, -3.9026F, -5.3466F, -0.4294F, -0.2282F, 0.3076F));

		PartDefinition cube_r536 = leftSygomaticarch.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(45, 144).addBox(-1.0F, -2.125F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5214F, -2.1202F, -5.1299F, 0.1549F, -0.151F, 0.1752F));

		PartDefinition cube_r537 = leftSygomaticarch.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(139, 98).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5214F, -2.1202F, -5.1299F, 0.1105F, -0.1858F, 0.4384F));

		PartDefinition cube_r538 = leftSygomaticarch.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(74, 139).addBox(-1.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.4449F, -0.7556F, -3.8909F, 0.4164F, -0.2075F, 0.436F));

		PartDefinition cube_r539 = leftSygomaticarch.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(144, 3).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3089F, -4.7424F, -3.6019F, -0.6269F, 0.0459F, -0.1201F));

		PartDefinition cube_r540 = leftSygomaticarch.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(14, 130).addBox(-0.5F, -2.7F, -0.575F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.2719F, -1.6661F, 0.5171F, -0.31F, 0.0588F, 0.1547F));

		PartDefinition rightSygomaticarch = head.addOrReplaceChild("rightSygomaticarch", CubeListBuilder.create(), PartPose.offset(-2.9479F, 7.4281F, 0.4418F));

		PartDefinition cube_r541 = rightSygomaticarch.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(114, 99).mirror().addBox(-0.2F, -0.375F, -2.85F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.1921F, 0.1504F, 0.3726F, -0.7716F, 0.0097F, 0.2825F));

		PartDefinition cube_r542 = rightSygomaticarch.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(126, 136).mirror().addBox(-0.4767F, -0.4936F, -0.5242F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.4528F, -2.6719F, -3.3594F, -0.604F, 0.6544F, -1.5319F));

		PartDefinition cube_r543 = rightSygomaticarch.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(144, 9).mirror().addBox(-0.93F, -0.6595F, -0.5242F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4528F, -2.6719F, -3.3594F, 0.1695F, 0.8466F, -0.4593F));

		PartDefinition cube_r544 = rightSygomaticarch.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(142, 108).mirror().addBox(-0.7286F, 0.1928F, -0.5243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.4528F, -2.6719F, -3.3594F, 0.6502F, 0.6086F, 0.2423F));

		PartDefinition cube_r545 = rightSygomaticarch.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(132, 41).mirror().addBox(-0.5F, -0.825F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(130, 128).mirror().addBox(-0.5F, -0.525F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5601F, -2.4431F, -2.0111F, 0.5903F, -0.538F, -0.4057F));

		PartDefinition cube_r546 = rightSygomaticarch.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(33, 132).mirror().addBox(-0.5F, -0.8F, -1.525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1524F, -5.6505F, -2.851F, 1.536F, -0.2168F, 0.0397F));

		PartDefinition cube_r547 = rightSygomaticarch.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(144, 0).mirror().addBox(-0.5F, -0.475F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1524F, -5.6505F, -2.851F, 1.8414F, -0.2168F, 0.0397F));

		PartDefinition cube_r548 = rightSygomaticarch.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(142, 95).mirror().addBox(-0.0247F, 0.8185F, 0.0463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5485F, -4.0942F, -3.5439F, 2.1032F, -0.2168F, 0.0397F));

		PartDefinition cube_r549 = rightSygomaticarch.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(79, 118).mirror().addBox(-0.0497F, -0.3228F, -0.0078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6079F, -3.9111F, -2.2253F, 2.5261F, -0.1029F, -0.1489F));

		PartDefinition cube_r550 = rightSygomaticarch.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(144, 6).mirror().addBox(-0.5F, -0.825F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1341F, -3.4682F, -1.7426F, 3.0061F, -0.1029F, -0.1489F));

		PartDefinition cube_r551 = rightSygomaticarch.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(142, 92).mirror().addBox(-0.5F, -0.825F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1994F, -4.0551F, -1.9608F, -2.6663F, -0.1029F, -0.1489F));

		PartDefinition cube_r552 = rightSygomaticarch.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(130, 112).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1916F, -4.1776F, -1.1614F, 2.2487F, -0.0103F, -0.1345F));

		PartDefinition cube_r553 = rightSygomaticarch.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(54, 115).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(115, 61).mirror().addBox(0.0F, 0.4F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.9389F, -4.9348F, -4.5972F, -0.2415F, -0.0379F, -0.1525F));

		PartDefinition cube_r554 = rightSygomaticarch.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(15, 144).mirror().addBox(0.0F, -0.025F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.1579F, -3.5932F, -4.9317F, 0.1935F, -0.3905F, -0.2645F));

		PartDefinition cube_r555 = rightSygomaticarch.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(62, 132).mirror().addBox(0.0F, -1.0F, -1.675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.6036F, -2.0149F, -0.969F, -0.0019F, 0.8394F, 0.1991F));

		PartDefinition cube_r556 = rightSygomaticarch.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(132, 63).mirror().addBox(-0.125F, -0.15F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.9466F, -1.4905F, -0.4532F, -0.7349F, -0.0039F, -0.1518F));

		PartDefinition cube_r557 = rightSygomaticarch.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(42, 100).mirror().addBox(-0.075F, -2.0F, -3.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.6356F, -2.3785F, 0.722F, -0.3447F, -0.0301F, -0.1955F));

		PartDefinition cube_r558 = rightSygomaticarch.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(131, 120).mirror().addBox(0.0F, -0.025F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.1579F, -3.5932F, -4.9317F, 0.1789F, -0.0301F, -0.1955F));

		PartDefinition cube_r559 = rightSygomaticarch.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(144, 12).mirror().addBox(0.0F, -0.025F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.3391F, -2.651F, -4.7583F, 0.5628F, -0.3369F, -0.3835F));

		PartDefinition cube_r560 = rightSygomaticarch.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(131, 124).mirror().addBox(0.0F, -0.025F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.3391F, -2.651F, -4.7583F, 0.528F, -0.0301F, -0.1955F));

		PartDefinition cube_r561 = rightSygomaticarch.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(10, 144).mirror().addBox(0.0F, -0.05F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.492F, -1.8006F, -4.2548F, 0.6391F, -0.2692F, -0.4816F));

		PartDefinition cube_r562 = rightSygomaticarch.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(132, 6).mirror().addBox(0.0F, -0.05F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.492F, -1.8006F, -4.2548F, 0.6135F, 0.0504F, -0.251F));

		PartDefinition cube_r563 = rightSygomaticarch.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(7, 137).mirror().addBox(0.0F, -0.0785F, -1.0056F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.2804F, -1.5602F, -2.9514F, 1.1115F, -0.7078F, -1.6673F));

		PartDefinition cube_r564 = rightSygomaticarch.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(20, 144).mirror().addBox(0.0F, -0.0785F, -0.0056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.7225F, -1.0207F, -3.668F, 0.7719F, 0.0044F, -0.691F));

		PartDefinition cube_r565 = rightSygomaticarch.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(19, 132).mirror().addBox(0.0F, 0.9215F, -0.0806F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.492F, -1.8006F, -4.2548F, 0.7008F, 0.0504F, -0.251F));

		PartDefinition cube_r566 = rightSygomaticarch.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(109, 143).mirror().addBox(-0.5175F, -0.199F, -0.9408F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.1464F, -1.1044F, -2.3705F, 0.6736F, 0.0498F, -0.2721F));

		PartDefinition cube_r567 = rightSygomaticarch.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(114, 143).mirror().addBox(-0.5175F, -1.0116F, -0.6272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.1464F, -1.1044F, -2.3705F, -0.7663F, 0.0498F, -0.2721F));

		PartDefinition cube_r568 = rightSygomaticarch.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(139, 73).mirror().addBox(-0.5175F, -1.2618F, -0.4978F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.1464F, -1.1044F, -2.3705F, -0.0682F, 0.0498F, -0.2721F));

		PartDefinition cube_r569 = rightSygomaticarch.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(104, 143).mirror().addBox(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(94, 143).mirror().addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.3637F, -0.4015F, -2.7111F, 0.7407F, 0.2627F, -0.2855F));

		PartDefinition cube_r570 = rightSygomaticarch.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(99, 143).mirror().addBox(-0.2F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.6389F, 0.5802F, -2.0533F, 0.8006F, 0.4724F, -0.4029F));

		PartDefinition cube_r571 = rightSygomaticarch.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(142, 89).mirror().addBox(-0.5F, -0.1F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0636F, -3.3217F, -0.6855F, -2.228F, 0.0007F, -0.1481F));

		PartDefinition cube_r572 = rightSygomaticarch.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(105, 111).mirror().addBox(-0.65F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.102F, -2.2274F, 2.7671F, 2.179F, 0.0007F, -0.1481F));

		PartDefinition cube_r573 = rightSygomaticarch.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(143, 140).mirror().addBox(-0.65F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.128F, -2.0499F, 2.0905F, -2.8825F, 0.0007F, -0.1481F));

		PartDefinition cube_r574 = rightSygomaticarch.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(143, 137).mirror().addBox(-0.65F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.1408F, -1.9613F, 1.3963F, -1.4426F, 0.0007F, -0.1481F));

		PartDefinition cube_r575 = rightSygomaticarch.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(0, 144).mirror().addBox(-0.65F, -1.125F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(143, 143).mirror().addBox(-0.65F, -1.125F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.14F, -1.9631F, 0.6963F, -0.3081F, 0.0007F, -0.1481F));

		PartDefinition cube_r576 = rightSygomaticarch.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(124, 143).mirror().addBox(-0.65F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.14F, -1.9631F, 0.6963F, -0.0027F, 0.0007F, -0.1481F));

		PartDefinition cube_r577 = rightSygomaticarch.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(26, 132).mirror().addBox(-0.5F, -0.1F, -2.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.009F, -2.842F, 0.8409F, -0.4826F, 0.0007F, -0.1481F));

		PartDefinition cube_r578 = rightSygomaticarch.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(107, 130).mirror().addBox(-0.5F, -1.1F, -0.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1145F, -2.125F, -1.2745F, -0.1336F, 0.0007F, -0.1481F));

		PartDefinition cube_r579 = rightSygomaticarch.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(67, 142).mirror().addBox(-0.9269F, 3.0116F, 3.4067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4521F, -7.9317F, -3.0363F, -0.5479F, 0.087F, -0.1487F));

		PartDefinition cube_r580 = rightSygomaticarch.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(0, 137).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2128F, -7.2248F, -3.2615F, 0.2362F, -0.2079F, -0.5232F));

		PartDefinition cube_r581 = rightSygomaticarch.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(142, 51).mirror().addBox(-0.2531F, -0.7869F, -0.4661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2859F, -6.4013F, -3.2308F, -0.02F, -0.3128F, 0.4035F));

		PartDefinition cube_r582 = rightSygomaticarch.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(5, 144).mirror().addBox(-0.2F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6095F, -4.5481F, -4.1513F, -0.3771F, -0.5154F, -0.7106F));

		PartDefinition cube_r583 = rightSygomaticarch.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(113, 136).mirror().addBox(-0.2F, -0.8F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1631F, -4.1963F, -4.3436F, -0.5936F, 0.1593F, 0.4999F));

		PartDefinition cube_r584 = rightSygomaticarch.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(137, 93).mirror().addBox(-1.0F, 0.175F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.9407F, -7.1777F, -4.5825F, -0.3862F, 0.2976F, -0.1417F));

		PartDefinition cube_r585 = rightSygomaticarch.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(69, 137).mirror().addBox(0.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3593F, -3.9026F, -5.3466F, -0.4294F, 0.2282F, -0.3076F));

		PartDefinition cube_r586 = rightSygomaticarch.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(45, 144).mirror().addBox(0.0F, -2.125F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.5214F, -2.1202F, -5.1299F, 0.1549F, 0.151F, -0.1752F));

		PartDefinition cube_r587 = rightSygomaticarch.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(139, 98).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5214F, -2.1202F, -5.1299F, 0.1105F, 0.1858F, -0.4384F));

		PartDefinition cube_r588 = rightSygomaticarch.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(74, 139).mirror().addBox(0.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.4449F, -0.7556F, -3.8909F, 0.4164F, 0.2075F, -0.436F));

		PartDefinition cube_r589 = rightSygomaticarch.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(144, 3).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3089F, -4.7424F, -3.6019F, -0.6269F, -0.0459F, 0.1201F));

		PartDefinition cube_r590 = rightSygomaticarch.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(14, 130).mirror().addBox(-0.5F, -2.7F, -0.575F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.2719F, -1.6661F, 0.5171F, -0.31F, -0.0588F, -0.1547F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1826F, -1.8015F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r591 = jaw.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(94, 74).mirror().addBox(-0.5F, -1.0F, -1.3F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3589F, 1.1166F, 2.1041F, 0.1658F, 0.0F, -0.1047F));

		PartDefinition cube_r592 = jaw.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(34, 136).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.5913F, -1.0948F, 4.0612F, -0.2618F, 0.0F, -0.1047F));

		PartDefinition cube_r593 = jaw.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(45, 131).mirror().addBox(0.0F, 1.6251F, -2.9603F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -0.2F, 4.2F, -0.6545F, 0.0F, -0.1047F));

		PartDefinition cube_r594 = jaw.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(114, 114).mirror().addBox(0.0F, -0.851F, -2.8967F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -0.2F, 4.2F, 0.2793F, 0.0F, -0.1047F));

		PartDefinition cube_r595 = jaw.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(123, 12).mirror().addBox(0.2232F, -0.4074F, -0.4344F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.9615F, 2.452F, 4.9219F, -0.4701F, -0.0226F, -0.1023F));

		PartDefinition cube_r596 = jaw.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(139, 69).mirror().addBox(0.2232F, -0.8693F, 0.1333F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9615F, 2.452F, 4.9219F, 0.0099F, -0.0226F, -0.1023F));

		PartDefinition cube_r597 = jaw.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(131, 59).mirror().addBox(0.0F, 1.5565F, -1.2147F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -0.2F, 4.2F, -0.3229F, 0.0F, -0.1047F));

		PartDefinition cube_r598 = jaw.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(79, 103).mirror().addBox(0.0892F, -0.0476F, -0.2323F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9615F, 2.452F, 4.9219F, -1.8636F, -0.0413F, -0.1875F));

		PartDefinition cube_r599 = jaw.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(56, 143).mirror().addBox(-0.3057F, 1.2622F, 3.1409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.9615F, 2.452F, 4.9219F, -1.483F, -0.0633F, -0.2901F));

		PartDefinition cube_r600 = jaw.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(0.3255F, 0.4568F, -0.0769F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9615F, 2.452F, 4.9219F, -1.8312F, -0.0121F, -0.1744F));

		PartDefinition cube_r601 = jaw.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(80, 131).mirror().addBox(0.0892F, -0.8583F, 1.492F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9615F, 2.452F, 4.9219F, -1.8462F, -0.0413F, -0.1875F));

		PartDefinition cube_r602 = jaw.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(92, 131).mirror().addBox(1.6699F, 0.3373F, 3.1098F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.9615F, 2.452F, 4.9219F, -1.7843F, 0.045F, 0.2046F));

		PartDefinition cube_r603 = jaw.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(61, 143).mirror().addBox(2.7391F, 0.3373F, 3.4911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9615F, 2.452F, 4.9219F, -1.7658F, 0.0984F, 0.4616F));

		PartDefinition cube_r604 = jaw.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(72, 143).mirror().addBox(1.7454F, 0.3264F, 4.7152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.9615F, 2.452F, 4.9219F, -1.7888F, 0.0076F, 0.0341F));

		PartDefinition cube_r605 = jaw.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(131, 116).mirror().addBox(0.0932F, -2.4862F, 1.0084F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9615F, 2.452F, 4.9219F, -2.2999F, -0.0413F, -0.1875F));

		PartDefinition cube_r606 = jaw.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(89, 143).mirror().addBox(-0.3057F, -2.957F, 2.464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9615F, 2.452F, 4.9219F, -2.4778F, -0.0633F, -0.2901F));

		PartDefinition cube_r607 = jaw.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(103, 85).mirror().addBox(0.2721F, -2.2854F, 0.3919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9615F, 2.452F, 4.9219F, -2.1369F, -0.0226F, -0.1023F));

		PartDefinition cube_r608 = jaw.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(144, 24).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5563F, -0.7623F, 0.8622F, -1.7017F, 0.0F, -0.1047F));

		PartDefinition cube_r609 = jaw.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(25, 144).mirror().addBox(-0.5F, -0.625F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2757F, 1.9076F, 0.992F, 0.0436F, 0.0F, -0.1047F));

		PartDefinition cube_r610 = jaw.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(80, 109).mirror().addBox(0.0026F, 0.0287F, -3.0579F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0701F, -0.8413F, 5.0581F, 0.6109F, 0.0F, -0.1047F));

		PartDefinition cube_r611 = jaw.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(144, 27).mirror().addBox(0.0026F, 1.0408F, -1.4404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0701F, -0.8413F, 5.0581F, 0.9599F, 0.0F, -0.1047F));

		PartDefinition cube_r612 = jaw.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(14, 117).mirror().addBox(0.0F, -3.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.9074F, 0.6814F, 6.4772F, 1.8334F, 0.1578F, -0.6336F));

		PartDefinition cube_r613 = jaw.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(30, 144).mirror().addBox(0.2721F, -1.061F, -2.0618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9615F, 2.452F, 4.9219F, 2.881F, -0.0226F, -0.1023F));

		PartDefinition cube_r614 = jaw.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(144, 35).mirror().addBox(0.2721F, 0.9166F, -0.7625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9615F, 2.452F, 4.9219F, 1.6592F, -0.0226F, -0.1023F));

		PartDefinition cube_r615 = jaw.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(144, 38).mirror().addBox(2.293F, 0.3264F, 4.1634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.9615F, 2.452F, 4.9219F, -1.7822F, 0.0542F, 0.2473F));

		PartDefinition cube_r616 = jaw.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(40, 144).mirror().addBox(-1.3781F, 0.3373F, 4.2659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.9615F, 2.452F, 4.9219F, -1.7755F, -0.0759F, -0.35F));

		PartDefinition cube_r617 = jaw.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(132, 67).mirror().addBox(0.9345F, -3.1057F, 2.3536F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9615F, 2.452F, 4.9219F, -2.5281F, 0.0115F, 0.0413F));

		PartDefinition cube_r618 = jaw.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(11, 110).mirror().addBox(0.0026F, 0.0287F, -3.0579F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.8988F, 0.788F, 6.2052F, 0.4578F, 0.2909F, -0.5465F));

		PartDefinition cube_r619 = jaw.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(144, 35).addBox(-1.2721F, 0.9166F, -0.7625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.9615F, 2.452F, 4.9219F, 1.6592F, 0.0226F, 0.1023F));

		PartDefinition cube_r620 = jaw.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(30, 144).addBox(-1.2721F, -1.061F, -2.0618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.9615F, 2.452F, 4.9219F, 2.881F, 0.0226F, 0.1023F));

		PartDefinition cube_r621 = jaw.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(103, 85).addBox(-1.2721F, -2.2854F, 0.3919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.9615F, 2.452F, 4.9219F, -2.1369F, 0.0226F, 0.1023F));

		PartDefinition cube_r622 = jaw.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(89, 143).addBox(-0.6943F, -2.957F, 2.464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.9615F, 2.452F, 4.9219F, -2.4778F, 0.0633F, 0.2901F));

		PartDefinition cube_r623 = jaw.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(131, 116).addBox(-1.0932F, -2.4862F, 1.0084F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9615F, 2.452F, 4.9219F, -2.2999F, 0.0413F, 0.1875F));

		PartDefinition cube_r624 = jaw.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(132, 67).addBox(-1.9345F, -3.1057F, 2.3536F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9615F, 2.452F, 4.9219F, -2.5281F, -0.0115F, -0.0413F));

		PartDefinition cube_r625 = jaw.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(144, 38).addBox(-3.293F, 0.3264F, 4.1634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.9615F, 2.452F, 4.9219F, -1.7822F, -0.0542F, -0.2473F));

		PartDefinition cube_r626 = jaw.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(72, 143).addBox(-2.7454F, 0.3264F, 4.7152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.9615F, 2.452F, 4.9219F, -1.7888F, -0.0076F, -0.0341F));

		PartDefinition cube_r627 = jaw.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(40, 144).addBox(0.3781F, 0.3373F, 4.2659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.9615F, 2.452F, 4.9219F, -1.7755F, 0.0759F, 0.35F));

		PartDefinition cube_r628 = jaw.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(61, 143).addBox(-3.7391F, 0.3373F, 3.4911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9615F, 2.452F, 4.9219F, -1.7658F, -0.0984F, -0.4616F));

		PartDefinition cube_r629 = jaw.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(92, 131).addBox(-2.6699F, 0.3373F, 3.1098F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.9615F, 2.452F, 4.9219F, -1.7843F, -0.045F, -0.2046F));

		PartDefinition cube_r630 = jaw.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(28, 121).addBox(-3.0615F, -3.1707F, 2.472F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9615F, 2.452F, 4.9219F, -2.5307F, 0.0F, 0.0F));

		PartDefinition cube_r631 = jaw.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(121, 26).addBox(-3.0615F, 0.3264F, 3.5626F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.9615F, 2.452F, 4.9219F, -1.789F, 0.0F, 0.0F));

		PartDefinition cube_r632 = jaw.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(80, 131).addBox(-1.0892F, -0.8583F, 1.492F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.9615F, 2.452F, 4.9219F, -1.8462F, 0.0413F, 0.1875F));

		PartDefinition cube_r633 = jaw.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(0, 100).addBox(-1.3255F, 0.4568F, -0.0769F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9615F, 2.452F, 4.9219F, -1.8312F, 0.0121F, 0.1744F));

		PartDefinition cube_r634 = jaw.addOrReplaceChild("cube_r634", CubeListBuilder.create().texOffs(56, 143).addBox(-0.6943F, 1.2622F, 3.1409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.9615F, 2.452F, 4.9219F, -1.483F, 0.0633F, 0.2901F));

		PartDefinition cube_r635 = jaw.addOrReplaceChild("cube_r635", CubeListBuilder.create().texOffs(79, 103).addBox(-1.0892F, -0.0476F, -0.2323F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9615F, 2.452F, 4.9219F, -1.8636F, 0.0413F, 0.1875F));

		PartDefinition cube_r636 = jaw.addOrReplaceChild("cube_r636", CubeListBuilder.create().texOffs(131, 59).addBox(-1.0F, 1.5565F, -1.2147F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(3.0F, -0.2F, 4.2F, -0.3229F, 0.0F, 0.1047F));

		PartDefinition cube_r637 = jaw.addOrReplaceChild("cube_r637", CubeListBuilder.create().texOffs(139, 69).addBox(-1.2232F, -0.8693F, 0.1333F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9615F, 2.452F, 4.9219F, 0.0099F, 0.0226F, 0.1023F));

		PartDefinition cube_r638 = jaw.addOrReplaceChild("cube_r638", CubeListBuilder.create().texOffs(123, 12).addBox(-1.2232F, -0.4074F, -0.4344F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.9615F, 2.452F, 4.9219F, -0.4701F, 0.0226F, 0.1023F));

		PartDefinition cube_r639 = jaw.addOrReplaceChild("cube_r639", CubeListBuilder.create().texOffs(114, 114).addBox(-1.0F, -0.851F, -2.8967F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.0F, -0.2F, 4.2F, 0.2793F, 0.0F, 0.1047F));

		PartDefinition cube_r640 = jaw.addOrReplaceChild("cube_r640", CubeListBuilder.create().texOffs(144, 24).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5563F, -0.7623F, 0.8622F, -1.7017F, 0.0F, 0.1047F));

		PartDefinition cube_r641 = jaw.addOrReplaceChild("cube_r641", CubeListBuilder.create().texOffs(45, 131).addBox(-1.0F, 1.6251F, -2.9603F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -0.2F, 4.2F, -0.6545F, 0.0F, 0.1047F));

		PartDefinition cube_r642 = jaw.addOrReplaceChild("cube_r642", CubeListBuilder.create().texOffs(14, 117).addBox(-1.0F, -3.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.9074F, 0.6814F, 6.4772F, 1.8334F, -0.1578F, 0.6336F));

		PartDefinition cube_r643 = jaw.addOrReplaceChild("cube_r643", CubeListBuilder.create().texOffs(144, 27).addBox(-1.0026F, 1.0408F, -1.4404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0701F, -0.8413F, 5.0581F, 0.9599F, 0.0F, 0.1047F));

		PartDefinition cube_r644 = jaw.addOrReplaceChild("cube_r644", CubeListBuilder.create().texOffs(11, 110).addBox(-1.0026F, 0.0287F, -3.0579F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.8988F, 0.788F, 6.2052F, 0.4578F, -0.2909F, 0.5465F));

		PartDefinition cube_r645 = jaw.addOrReplaceChild("cube_r645", CubeListBuilder.create().texOffs(80, 109).addBox(-1.0026F, 0.0287F, -3.0579F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.0701F, -0.8413F, 5.0581F, 0.6109F, 0.0F, 0.1047F));

		PartDefinition cube_r646 = jaw.addOrReplaceChild("cube_r646", CubeListBuilder.create().texOffs(34, 136).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.5913F, -1.0948F, 4.0612F, -0.2618F, 0.0F, 0.1047F));

		PartDefinition cube_r647 = jaw.addOrReplaceChild("cube_r647", CubeListBuilder.create().texOffs(94, 74).addBox(-0.5F, -1.0F, -1.3F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.3589F, 1.1166F, 2.1041F, 0.1658F, 0.0F, 0.1047F));

		PartDefinition cube_r648 = jaw.addOrReplaceChild("cube_r648", CubeListBuilder.create().texOffs(25, 144).addBox(-0.5F, -0.625F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.2757F, 1.9076F, 0.992F, 0.0436F, 0.0F, 0.1047F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(11, 85).addBox(-0.5F, -0.9067F, -0.1029F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F))
				.texOffs(7, 111).addBox(0.0F, -3.7067F, -0.1029F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.64F, 3.1459F, -1.077F, 0.0623F, -0.1152F));

		PartDefinition cube_r649 = tail.addOrReplaceChild("cube_r649", CubeListBuilder.create().texOffs(23, 14).addBox(0.0F, -0.4889F, -0.9938F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.414F, 4.1511F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r650 = tail.addOrReplaceChild("cube_r650", CubeListBuilder.create().texOffs(23, 28).addBox(0.0F, 0.124F, -0.9997F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1844F, 1.7768F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r651 = tail.addOrReplaceChild("cube_r651", CubeListBuilder.create().texOffs(59, 124).addBox(0.0F, -1.0196F, -1.7998F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2063F, 0.4353F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r652 = tail.addOrReplaceChild("cube_r652", CubeListBuilder.create().texOffs(135, 142).addBox(0.0F, -2.5F, 2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 73).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9067F, 1.8971F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r653 = tail.addOrReplaceChild("cube_r653", CubeListBuilder.create().texOffs(53, 63).mirror().addBox(-5.0F, 0.0F, -2.5F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -4.1203F, 1.4627F, 0.1487F, 0.1603F, -0.8171F));

		PartDefinition cube_r654 = tail.addOrReplaceChild("cube_r654", CubeListBuilder.create().texOffs(0, 7).mirror().addBox(-5.5F, -0.5F, -4.0F, 6.0F, 7.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.4058F, -0.2726F, 2.8175F, -0.006F, 0.3802F, -1.3601F));

		PartDefinition cube_r655 = tail.addOrReplaceChild("cube_r655", CubeListBuilder.create().texOffs(103, 4).mirror().addBox(-4.0F, 0.0F, -2.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -4.3452F, 4.9627F, 0.1487F, 0.1603F, -0.8171F));

		PartDefinition cube_r656 = tail.addOrReplaceChild("cube_r656", CubeListBuilder.create().texOffs(46, 24).mirror().addBox(-5.0049F, 0.0F, -2.9762F, 5.0F, 8.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.1319F, -1.6074F, 5.0241F, -0.088F, 0.5746F, -1.4936F));

		PartDefinition cube_r657 = tail.addOrReplaceChild("cube_r657", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.5F, -4.0F, 6.0F, 7.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.4058F, -0.2726F, 2.8175F, -0.006F, -0.3802F, 1.3601F));

		PartDefinition cube_r658 = tail.addOrReplaceChild("cube_r658", CubeListBuilder.create().texOffs(91, 57).addBox(-2.5F, -2.7326F, -1.827F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.5317F, 4.8971F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r659 = tail.addOrReplaceChild("cube_r659", CubeListBuilder.create().texOffs(46, 24).addBox(0.0049F, 0.0F, -2.9762F, 5.0F, 8.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.1319F, -1.6074F, 5.0241F, -0.088F, -0.5746F, 1.4936F));

		PartDefinition cube_r660 = tail.addOrReplaceChild("cube_r660", CubeListBuilder.create().texOffs(103, 4).addBox(0.0F, 0.0F, -2.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -4.3452F, 4.9627F, 0.1487F, -0.1603F, 0.8171F));

		PartDefinition cube_r661 = tail.addOrReplaceChild("cube_r661", CubeListBuilder.create().texOffs(53, 63).addBox(0.0F, 0.0F, -2.5F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -4.1203F, 1.4627F, 0.1487F, -0.1603F, 0.8171F));

		PartDefinition cube_r662 = tail.addOrReplaceChild("cube_r662", CubeListBuilder.create().texOffs(63, 41).addBox(-2.5F, -2.7326F, -1.827F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.3067F, 1.3971F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(90, 97).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0616F, 4.7602F, 0.0785F, 0.1708F, 0.0565F));

		PartDefinition cube_r663 = tail2.addOrReplaceChild("cube_r663", CubeListBuilder.create().texOffs(97, 94).addBox(0.0F, 1.0716F, 0.8148F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 144).addBox(0.0F, 0.4715F, -1.1852F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2689F, 1.6651F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r664 = tail2.addOrReplaceChild("cube_r664", CubeListBuilder.create().texOffs(38, 104).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 3.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r665 = tail2.addOrReplaceChild("cube_r665", CubeListBuilder.create().texOffs(75, 84).addBox(0.0F, -1.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r666 = tail2.addOrReplaceChild("cube_r666", CubeListBuilder.create().texOffs(110, 106).addBox(-4.2699F, -3.3203F, -1.3478F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.77F, -0.3799F, 2.4879F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r667 = tail2.addOrReplaceChild("cube_r667", CubeListBuilder.create().texOffs(103, 81).mirror().addBox(-0.9114F, -2.2827F, -1.4231F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4074F, -0.2184F, 1.3279F, 0.0887F, 0.0964F, -0.8248F));

		PartDefinition cube_r668 = tail2.addOrReplaceChild("cube_r668", CubeListBuilder.create().texOffs(0, 73).mirror().addBox(-0.625F, -3.5F, -0.4F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5109F, 2.6114F, 2.1873F, 0.0399F, 0.5625F, -1.4644F));

		PartDefinition cube_r669 = tail2.addOrReplaceChild("cube_r669", CubeListBuilder.create().texOffs(30, 82).mirror().addBox(-3.6731F, 0.0F, -2.053F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.4825F, -1.7202F, 2.9912F, 0.026F, 0.5205F, -1.4541F));

		PartDefinition cube_r670 = tail2.addOrReplaceChild("cube_r670", CubeListBuilder.create().texOffs(0, 106).mirror().addBox(-0.3696F, -2.0442F, -1.3478F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7737F, -0.3783F, 2.488F, 0.059F, 0.0643F, -0.8271F));

		PartDefinition cube_r671 = tail2.addOrReplaceChild("cube_r671", CubeListBuilder.create().texOffs(0, 106).addBox(-2.6304F, -2.0442F, -1.3478F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7737F, -0.3783F, 2.488F, 0.059F, -0.0643F, 0.8271F));

		PartDefinition cube_r672 = tail2.addOrReplaceChild("cube_r672", CubeListBuilder.create().texOffs(30, 82).addBox(-0.3269F, 0.0F, -2.053F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.4825F, -1.7202F, 2.9912F, 0.026F, -0.5205F, 1.4541F));

		PartDefinition cube_r673 = tail2.addOrReplaceChild("cube_r673", CubeListBuilder.create().texOffs(103, 8).addBox(-4.9036F, -3.8193F, -1.4231F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.9036F, -0.2201F, 1.3277F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r674 = tail2.addOrReplaceChild("cube_r674", CubeListBuilder.create().texOffs(103, 81).addBox(-3.0886F, -2.2827F, -1.4231F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4074F, -0.2184F, 1.3279F, 0.0887F, -0.0964F, 0.8248F));

		PartDefinition cube_r675 = tail2.addOrReplaceChild("cube_r675", CubeListBuilder.create().texOffs(0, 73).addBox(-3.375F, -3.5F, -0.4F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.5109F, 2.6114F, 2.1873F, 0.0399F, -0.5625F, 1.4644F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(98, 66).addBox(-0.5F, -0.475F, 0.025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4723F, 3.8774F, 0.0581F, 0.1702F, 0.094F));

		PartDefinition cube_r676 = tail3.addOrReplaceChild("cube_r676", CubeListBuilder.create().texOffs(0, 50).addBox(-1.5F, -1.775F, -6.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1295F, 4.8427F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r677 = tail3.addOrReplaceChild("cube_r677", CubeListBuilder.create().texOffs(0, 40).addBox(-1.5F, -1.35F, -3.1F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.7172F, 2.0932F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(99, 22).addBox(-0.5F, -0.45F, -0.075F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.038F, 4.0597F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r678 = tail4.addOrReplaceChild("cube_r678", CubeListBuilder.create().texOffs(19, 50).addBox(-1.5F, -1.975F, -0.075F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.4231F, 0.7492F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r679 = tail4.addOrReplaceChild("cube_r679", CubeListBuilder.create().texOffs(40, 48).addBox(-1.5F, -1.25F, -3.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3143F, 3.6923F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(51, 69).addBox(-0.5F, -0.5773F, -0.0539F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0941F, 3.9206F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r680 = tail5.addOrReplaceChild("cube_r680", CubeListBuilder.create().texOffs(43, 85).addBox(-1.0F, -1.075F, -2.6F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.3536F, 5.107F, 0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 150, 150);
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