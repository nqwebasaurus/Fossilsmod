package fossils.fossils.client.blockentity.model.myrmecophaga;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MyrmecophagaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart body5;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart chest2;
	private final ModelPart neck3;
	private final ModelPart Hyoid;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart leftSygomaticarch;
	private final ModelPart rightSygomaticarch;
	private final ModelPart jaw;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart tail;
	private final ModelPart tail8;
	private final ModelPart tail2;
	private final ModelPart tail9;
	private final ModelPart tail3;
	private final ModelPart tail10;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;

	public MyrmecophagaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.body4 = this.hips.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.body5 = this.body3.getChild("body5");
		this.body2 = this.body5.getChild("body2");
		this.body = this.body2.getChild("body");
		this.chest = this.body.getChild("chest");
		this.chest2 = this.chest.getChild("chest2");
		this.neck3 = this.chest2.getChild("neck3");
		this.Hyoid = this.neck3.getChild("Hyoid");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck4 = this.neck.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.leftSygomaticarch = this.head.getChild("leftSygomaticarch");
		this.rightSygomaticarch = this.head.getChild("rightSygomaticarch");
		this.jaw = this.head.getChild("jaw");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.tail = this.hips.getChild("tail");
		this.tail8 = this.tail.getChild("tail8");
		this.tail2 = this.tail8.getChild("tail2");
		this.tail9 = this.tail2.getChild("tail9");
		this.tail3 = this.tail9.getChild("tail3");
		this.tail10 = this.tail3.getChild("tail10");
		this.tail4 = this.tail10.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -36.0258F, 15.2747F, 0.325F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(53, 110).addBox(0.0F, -3.7F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1488F, -6.3133F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(123, 132).addBox(0.0F, -2.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9092F, 3.7896F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 40).addBox(0.0F, -0.5153F, -0.817F, 0.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0477F, -0.9844F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(68, 105).mirror().addBox(0.0165F, -0.4905F, -0.2092F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5786F, -2.4814F, -5.8502F, -0.4875F, 0.5581F, 1.6326F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(68, 105).addBox(-0.0165F, -0.4905F, -0.2092F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5786F, -2.4814F, -5.8502F, -0.4875F, -0.5581F, -1.6326F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.2057F, 0.0747F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -6.4F, -0.5411F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(2.777F, 6.3211F, -1.8342F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(134, 92).addBox(-0.1014F, -5.0832F, -5.4575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.6702F, -3.5947F, -0.976F, 0.408F, -0.993F, -0.5715F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(85, 107).addBox(-0.1014F, -7.4534F, -0.2647F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.6702F, -3.5947F, -0.976F, 1.1934F, -0.993F, -0.5715F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(122, 47).addBox(-0.1014F, -1.9023F, 5.4125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.6702F, -3.5947F, -0.976F, 2.2842F, -0.993F, -0.5715F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(130, 95).addBox(-0.1014F, 3.9683F, 3.4877F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6702F, -3.5947F, -0.976F, -2.9518F, -0.993F, -0.5715F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(111, 110).addBox(-0.1014F, 4.0045F, -3.4248F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.6702F, -3.5947F, -0.976F, -1.9046F, -0.993F, -0.5715F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(78, 107).addBox(0.6723F, -2.8527F, -4.2861F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.6702F, -3.5947F, -0.976F, -0.4754F, -0.7554F, -0.5563F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(89, 12).addBox(0.3743F, -0.3226F, -3.6571F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.6702F, -3.5947F, -0.976F, -0.3542F, -0.9139F, -0.6765F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(33, 92).addBox(0.4467F, -3.3876F, -2.5209F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.6702F, -3.5947F, -0.976F, -0.3004F, -0.8277F, -0.5103F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(111, 88).addBox(0.533F, -1.3438F, -0.8634F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.6702F, -3.5947F, -0.976F, 0.2454F, -0.7528F, -0.741F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 129).addBox(0.0583F, -1.9202F, -0.4727F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6702F, -3.5947F, -0.976F, 0.381F, -0.0187F, 0.1535F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(72, 122).addBox(-0.5F, -0.65F, -0.675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.1383F, 2.9584F, 3.4225F, 1.1328F, -0.0026F, 0.1546F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(85, 134).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.2115F, 3.4388F, 2.787F, 0.6528F, -0.0026F, 0.1546F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(16, 108).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1745F, -3.2217F, 3.2418F, -1.2234F, -0.0026F, 0.1546F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(92, 107).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3665F, -2.0167F, 4.8265F, -0.6562F, -0.0026F, 0.1546F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(79, 122).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5073F, -1.1207F, 5.2476F, 0.4346F, -0.0026F, 0.1546F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(122, 81).addBox(-0.5F, -1.075F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.693F, 0.0911F, 4.0404F, 1.8745F, -0.0026F, 0.1546F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(112, 54).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.8116F, 0.8259F, 5.5915F, 1.7436F, -0.0026F, 0.1546F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(112, 27).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1037F, 2.7098F, 4.9869F, 2.8345F, -0.0026F, 0.1546F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(5, 135).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.2283F, 3.5184F, 4.412F, -2.1833F, -0.0026F, 0.1546F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(134, 45).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3351F, 4.2162F, 3.7037F, -0.7871F, -0.0026F, 0.1546F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(135, 3).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3977F, 4.6326F, 2.7966F, 0.4346F, -0.0026F, 0.1546F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(134, 80).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.3814F, 4.5453F, 1.8006F, 1.4818F, -0.0026F, 0.1546F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(134, 37).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2363F, 3.6159F, 1.7281F, 2.7472F, -0.0026F, 0.1546F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(33, 134).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3077F, 4.0879F, 0.9144F, 2.6599F, -0.0026F, 0.1546F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(30, 112).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.7167F, 0.317F, -0.282F, -2.8378F, -0.0026F, 0.1546F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(46, 110).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4374F, -1.4602F, -1.1557F, -1.1187F, -0.0026F, 0.1546F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(112, 22).addBox(-1.15F, 0.125F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5474F, -3.5674F, -0.5742F, 0.1467F, -0.0026F, 0.1546F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(30, 106).addBox(0.0579F, -4.3671F, 0.1764F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6702F, -3.5947F, -0.976F, 0.5384F, 0.1954F, 0.2207F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 103).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.413F, -3.5869F, -1.4297F, 0.8346F, 0.1152F, 0.2837F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(123, 106).addBox(0.2175F, -0.5F, -1.4544F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.277F, -3.1075F, 5.204F, -0.6682F, -0.3879F, 0.2902F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(50, 58).addBox(-5.7821F, -0.5F, -1.5905F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.277F, -3.1075F, 5.204F, -1.447F, -0.9545F, 1.4194F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(69, 45).addBox(-2.825F, -0.1F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1927F, -6.7685F, 0.6729F, -1.7812F, -1.0334F, 1.8276F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(135, 6).addBox(-0.9426F, -0.5F, -3.0848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.277F, -3.1075F, 5.204F, -0.7405F, -0.5545F, 0.4486F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(109, 12).addBox(-0.5F, -0.5F, -0.05F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.277F, -3.1075F, 5.204F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(132, 99).addBox(-2.2969F, -0.5F, 1.3834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.277F, -3.1075F, 5.204F, -2.2864F, 0.7074F, -2.4997F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-2.777F, 6.3211F, -1.8342F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(134, 92).mirror().addBox(-0.8986F, -5.0832F, -5.4575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.6702F, -3.5947F, -0.976F, 0.408F, 0.993F, 0.5715F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(85, 107).mirror().addBox(-0.8986F, -7.4534F, -0.2647F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.6702F, -3.5947F, -0.976F, 1.1934F, 0.993F, 0.5715F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(122, 47).mirror().addBox(-0.8986F, -1.9023F, 5.4125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.6702F, -3.5947F, -0.976F, 2.2842F, 0.993F, 0.5715F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(130, 95).mirror().addBox(-0.8986F, 3.9683F, 3.4877F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6702F, -3.5947F, -0.976F, -2.9518F, 0.993F, 0.5715F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(111, 110).mirror().addBox(-0.8986F, 4.0045F, -3.4248F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.6702F, -3.5947F, -0.976F, -1.9046F, 0.993F, 0.5715F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(78, 107).mirror().addBox(-1.6723F, -2.8527F, -4.2861F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.6702F, -3.5947F, -0.976F, -0.4754F, 0.7554F, 0.5563F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(89, 12).mirror().addBox(-1.3743F, -0.3226F, -3.6571F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.6702F, -3.5947F, -0.976F, -0.3542F, 0.9139F, 0.6765F));

		PartDefinition cube_r49 = bone3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(33, 92).mirror().addBox(-1.4467F, -3.3876F, -2.5209F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.6702F, -3.5947F, -0.976F, -0.3004F, 0.8277F, 0.5103F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(111, 88).mirror().addBox(-1.533F, -1.3438F, -0.8634F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.6702F, -3.5947F, -0.976F, 0.2454F, 0.7528F, 0.741F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 129).mirror().addBox(-1.0583F, -1.9202F, -0.4727F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6702F, -3.5947F, -0.976F, 0.381F, 0.0187F, -0.1535F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(72, 122).mirror().addBox(-0.5F, -0.65F, -0.675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.1383F, 2.9584F, 3.4225F, 1.1328F, 0.0026F, -0.1546F));

		PartDefinition cube_r53 = bone3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(85, 134).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.2115F, 3.4388F, 2.787F, 0.6528F, 0.0026F, -0.1546F));

		PartDefinition cube_r54 = bone3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(16, 108).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1745F, -3.2217F, 3.2418F, -1.2234F, 0.0026F, -0.1546F));

		PartDefinition cube_r55 = bone3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(92, 107).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3665F, -2.0167F, 4.8265F, -0.6562F, 0.0026F, -0.1546F));

		PartDefinition cube_r56 = bone3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(79, 122).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5073F, -1.1207F, 5.2476F, 0.4346F, 0.0026F, -0.1546F));

		PartDefinition cube_r57 = bone3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(122, 81).mirror().addBox(-0.5F, -1.075F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.693F, 0.0911F, 4.0404F, 1.8745F, 0.0026F, -0.1546F));

		PartDefinition cube_r58 = bone3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(112, 54).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.8116F, 0.8259F, 5.5915F, 1.7436F, 0.0026F, -0.1546F));

		PartDefinition cube_r59 = bone3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(112, 27).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1037F, 2.7098F, 4.9869F, 2.8345F, 0.0026F, -0.1546F));

		PartDefinition cube_r60 = bone3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(5, 135).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.2283F, 3.5184F, 4.412F, -2.1833F, 0.0026F, -0.1546F));

		PartDefinition cube_r61 = bone3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(134, 45).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3351F, 4.2162F, 3.7037F, -0.7871F, 0.0026F, -0.1546F));

		PartDefinition cube_r62 = bone3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(135, 3).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.3977F, 4.6326F, 2.7966F, 0.4346F, 0.0026F, -0.1546F));

		PartDefinition cube_r63 = bone3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(134, 80).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.3814F, 4.5453F, 1.8006F, 1.4818F, 0.0026F, -0.1546F));

		PartDefinition cube_r64 = bone3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(134, 37).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(1.2363F, 3.6159F, 1.7281F, 2.7472F, 0.0026F, -0.1546F));

		PartDefinition cube_r65 = bone3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(33, 134).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3077F, 4.0879F, 0.9144F, 2.6599F, 0.0026F, -0.1546F));

		PartDefinition cube_r66 = bone3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(30, 112).mirror().addBox(-0.5F, -4.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.7167F, 0.317F, -0.282F, -2.8378F, 0.0026F, -0.1546F));

		PartDefinition cube_r67 = bone3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(46, 110).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4374F, -1.4602F, -1.1557F, -1.1187F, 0.0026F, -0.1546F));

		PartDefinition cube_r68 = bone3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(112, 22).mirror().addBox(0.15F, 0.125F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5474F, -3.5674F, -0.5742F, 0.1467F, 0.0026F, -0.1546F));

		PartDefinition cube_r69 = bone3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(30, 106).mirror().addBox(-2.0579F, -4.3671F, 0.1764F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6702F, -3.5947F, -0.976F, 0.5384F, -0.1954F, -0.2207F));

		PartDefinition cube_r70 = bone3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 103).mirror().addBox(0.0F, 0.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.413F, -3.5869F, -1.4297F, 0.8346F, -0.1152F, -0.2837F));

		PartDefinition cube_r71 = bone3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(123, 106).mirror().addBox(-2.2175F, -0.5F, -1.4544F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.277F, -3.1075F, 5.204F, -0.6682F, 0.3879F, -0.2902F));

		PartDefinition cube_r72 = bone3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(50, 58).mirror().addBox(-0.2179F, -0.5F, -1.5905F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(2.277F, -3.1075F, 5.204F, -1.447F, 0.9545F, -1.4194F));

		PartDefinition cube_r73 = bone3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(69, 45).mirror().addBox(-0.175F, -0.1F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.1927F, -6.7685F, 0.6729F, -1.7812F, 1.0334F, -1.8276F));

		PartDefinition cube_r74 = bone3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(135, 6).mirror().addBox(-0.0574F, -0.5F, -3.0848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.277F, -3.1075F, 5.204F, -0.7405F, 0.5545F, -0.4486F));

		PartDefinition cube_r75 = bone3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(109, 12).mirror().addBox(-2.5F, -0.5F, -0.05F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.277F, -3.1075F, 5.204F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r76 = bone3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(132, 99).mirror().addBox(1.2969F, -0.5F, 1.3834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.277F, -3.1075F, 5.204F, -2.2864F, -0.7074F, 2.4997F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(43, 56).addBox(0.8F, 1.4F, 0.9F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(4.0123F, 4.8795F, -1.0744F, -0.8335F, -0.0254F, 0.0279F));

		PartDefinition cube_r77 = leftLeg.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(108, 68).addBox(-1.6F, 1.2F, 0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.5F, 15.2549F, 0.1985F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftLeg.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -0.9F, -1.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.7F, 14.4829F, 0.6444F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftLeg.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(81, 28).addBox(-2.0F, 1.1F, -0.3F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, 12.4929F, 0.3446F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftLeg.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(93, 32).addBox(-1.5F, -1.55F, -0.3F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0854F, -0.7239F, 0.0885F, -0.4247F, 0.3575F));

		PartDefinition cube_r81 = leftLeg.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(35, 80).addBox(-1.5F, -4.0F, -2.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 3.5F, 2.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r82 = leftLeg.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(50, 62).addBox(-1.3F, -5.6F, -0.5F, 2.0F, 11.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.5F, 8.0F, 1.4F, 0.0117F, -0.2615F, -0.0452F));

		PartDefinition cube_r83 = leftLeg.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(13, 69).addBox(-2.0F, -11.0F, 0.0F, 2.0F, 11.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.8F, 13.4F, 0.3F, 0.0175F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(69, 38).addBox(-1.0F, -0.5F, 7.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8106F, 16.7832F, 2.0167F, -0.7205F, 0.0194F, -0.0085F));

		PartDefinition cube_r84 = leftLeg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(62, 100).addBox(-3.985F, 0.4446F, 8.6921F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.485F, -0.4F, 3.594F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r85 = leftLeg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(20, 132).addBox(-0.5F, 0.25F, 0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(10, 132).addBox(-0.5F, 0.25F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F))
				.texOffs(77, 131).addBox(-0.5F, -0.15F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(1.3621F, -2.3371F, 1.7038F, -1.2392F, 0.0262F, 0.0F));

		PartDefinition cube_r86 = leftLeg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(72, 131).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.372F, -1.6278F, 2.0844F, -0.6283F, 0.0262F, 0.0F));

		PartDefinition cube_r87 = leftLeg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(131, 67).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.372F, -1.6278F, 2.0844F, 0.288F, 0.0262F, 0.0F));

		PartDefinition cube_r88 = leftLeg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -0.5F, -11.5F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(1.6584F, -0.4779F, 13.0204F, -0.1047F, 0.0262F, 0.0F));

		PartDefinition cube_r89 = leftLeg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 30).addBox(0.5F, 0.05F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5F, -1.2056F, 1.721F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r90 = leftLeg2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(99, 61).addBox(-0.5F, -0.425F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5839F, 0.4567F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r91 = leftLeg2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(100, 10).addBox(-0.5F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 1.591F, 0.9763F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r92 = leftLeg2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(21, 103).addBox(0.0F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 0.8146F, 3.874F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r93 = leftLeg2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 91).addBox(0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.5F, 7.6F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r94 = leftLeg2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(50, 17).addBox(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.5F, 7.6F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(67, 56).addBox(-1.6F, -1.5F, -1.1F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3445F, -0.3242F, 14.1706F, -1.7275F, 0.0F, 0.0F));

		PartDefinition cube_r95 = leftLeg3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(122, 123).addBox(-0.3F, -0.1F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, -0.5F, -2.8F, 0.3054F, -0.2182F, 0.0F));

		PartDefinition cube_r96 = leftLeg3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(115, 123).addBox(-0.3F, -1.0F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.5F, -2.8F, 0.0F, -0.2182F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(29, 15).addBox(-2.0216F, 0.1F, 0.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4216F, -1.6F, 1.9F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(58, 0).addBox(-2.8F, 1.4F, 0.9F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-4.0123F, 4.8795F, -1.0744F, -0.4408F, 0.0254F, -0.0279F));

		PartDefinition cube_r97 = rightLeg.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(108, 78).addBox(-0.4F, 1.2F, 0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5F, 15.2549F, 0.1985F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(64, 76).addBox(-2.0F, -0.9F, -1.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.7F, 14.4829F, 0.6444F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(82, 34).addBox(-1.0F, 1.1F, -0.3F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7F, 12.4929F, 0.3446F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(93, 50).addBox(-1.5F, -1.55F, -0.3F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.0854F, -0.7239F, 0.0885F, 0.4247F, -0.3575F));

		PartDefinition cube_r101 = rightLeg.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(80, 45).addBox(-1.5F, -4.0F, -2.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 3.5F, 2.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(65, 0).addBox(-0.7F, -5.6F, -0.5F, 2.0F, 11.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5F, 8.0F, 1.4F, 0.0117F, 0.2615F, 0.0452F));

		PartDefinition cube_r103 = rightLeg.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(57, 69).addBox(0.0F, -11.0F, 0.0F, 2.0F, 11.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.8F, 13.4F, 0.3F, 0.0175F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(64, 69).addBox(0.0F, -0.5F, 7.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.8106F, 16.7832F, 2.0167F, -0.8514F, -0.0194F, 0.0085F));

		PartDefinition cube_r104 = rightLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(78, 102).addBox(1.985F, 0.4446F, 8.6921F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.485F, -0.4F, 3.594F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(39, 132).addBox(-0.5F, 0.25F, 0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 132).addBox(-0.5F, 0.25F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F))
				.texOffs(5, 132).addBox(-0.5F, -0.15F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-1.3621F, -2.3371F, 1.7038F, -1.2392F, -0.0262F, 0.0F));

		PartDefinition cube_r106 = rightLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(89, 131).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.372F, -1.6278F, 2.0844F, -0.6283F, -0.0262F, 0.0F));

		PartDefinition cube_r107 = rightLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(131, 84).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-1.372F, -1.6278F, 2.0844F, 0.288F, -0.0262F, 0.0F));

		PartDefinition cube_r108 = rightLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(29, 0).addBox(-0.5F, -0.5F, -11.5F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(-1.6584F, -0.4779F, 13.0204F, -0.1047F, -0.0262F, 0.0F));

		PartDefinition cube_r109 = rightLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(19, 31).addBox(-1.5F, 0.05F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5F, -1.2056F, 1.721F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(99, 79).addBox(-1.5F, -0.425F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5839F, 0.4567F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightLeg2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(102, 44).addBox(-1.5F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 1.591F, 0.9763F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightLeg2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(103, 73).addBox(-1.0F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 0.8146F, 3.874F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r113 = rightLeg2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(91, 44).addBox(-1.5F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.5F, 7.6F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r114 = rightLeg2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(0, 52).addBox(-1.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.5F, 7.6F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(70, 61).addBox(-2.4F, -1.5F, -1.1F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3445F, -0.3242F, 14.1706F, -1.6839F, 0.0F, 0.0F));

		PartDefinition cube_r115 = rightLeg3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(31, 124).addBox(-0.7F, -0.1F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, -0.5F, -2.8F, 0.3054F, 0.2182F, 0.0F));

		PartDefinition cube_r116 = rightLeg3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(24, 124).addBox(-0.7F, -1.0F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, -0.5F, -2.8F, 0.0F, 0.2182F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(29, 23).addBox(-1.9784F, 0.1F, 0.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4216F, -1.6F, 1.9F, -0.48F, 0.0F, 0.0F));

		PartDefinition body4 = hips.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5544F, -6.3999F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r117 = body4.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(58, 129).addBox(-0.5F, -3.87F, -0.227F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7961F, -1.6252F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r118 = body4.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(49, 96).addBox(-0.5F, -3.07F, 0.0731F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.4115F, -5.6215F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r119 = body4.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(35, 72).addBox(-0.5F, -3.57F, 0.0731F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6947F, -3.7543F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r120 = body4.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(125, 100).mirror().addBox(-1.8019F, -0.2039F, -0.6142F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -1.4461F, -5.1397F, -0.491F, -0.0038F, -0.8372F));

		PartDefinition cube_r121 = body4.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(114, 107).mirror().addBox(-4.6878F, -0.6634F, -0.6142F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -1.4461F, -5.1397F, -0.4759F, -0.1261F, -1.0694F));

		PartDefinition cube_r122 = body4.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(32, 41).mirror().addBox(-5.0559F, -2.4423F, -0.6142F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -1.4461F, -5.1397F, -0.3965F, -0.2977F, -1.4412F));

		PartDefinition cube_r123 = body4.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(135, 70).mirror().addBox(0.0027F, -0.694F, -0.609F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5543F, -0.5739F, -1.44F, -0.5464F, 0.2851F, 1.568F));

		PartDefinition cube_r124 = body4.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(75, 109).mirror().addBox(0.1156F, -0.9943F, -0.5654F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5662F, -1.3155F, -3.3212F, -0.5207F, 0.2859F, 1.6589F));

		PartDefinition cube_r125 = body4.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(32, 41).addBox(4.0559F, -2.4423F, -0.6142F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -1.4461F, -5.1397F, -0.3965F, 0.2977F, 1.4412F));

		PartDefinition cube_r126 = body4.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(114, 107).addBox(1.6877F, -0.6634F, -0.6142F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -1.4461F, -5.1397F, -0.4759F, 0.1261F, 1.0694F));

		PartDefinition cube_r127 = body4.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(125, 100).addBox(-0.1981F, -0.2039F, -0.6142F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -1.4461F, -5.1397F, -0.491F, 0.0038F, 0.8372F));

		PartDefinition cube_r128 = body4.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(54, 41).addBox(-0.5F, -0.07F, 0.0731F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.4115F, -5.6215F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r129 = body4.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(135, 70).addBox(-0.0027F, -0.694F, -0.609F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5543F, -0.5739F, -1.44F, -0.5464F, -0.2851F, -1.568F));

		PartDefinition cube_r130 = body4.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(75, 109).addBox(-0.1156F, -0.9943F, -0.5654F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5662F, -1.3155F, -3.3212F, -0.5207F, -0.2859F, -1.6589F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9233F, -2.1172F, -5.5588F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r131 = body3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(77, 134).addBox(-0.5F, -2.8406F, -0.0547F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4233F, -0.7591F, -3.9136F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r132 = body3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(38, 99).addBox(-0.5F, -2.9061F, -0.0558F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4233F, -0.5869F, -1.9051F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r133 = body3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(114, 132).addBox(-0.5F, -2.6061F, -0.0558F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4233F, -1.0943F, -5.8627F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r134 = body3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(108, 82).mirror().addBox(-0.1F, 0.1F, -0.425F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2353F, 6.6215F, -1.5465F, 0.3936F, 0.9644F, 1.6297F));

		PartDefinition cube_r135 = body3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(71, 15).mirror().addBox(0.2F, -0.05F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7464F, 7.2863F, -3.0958F, 0.9023F, 1.2619F, 1.8797F));

		PartDefinition cube_r136 = body3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(81, 118).mirror().addBox(0.0F, -0.15F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3581F, 8.0285F, -5.4659F, 0.6007F, 1.2497F, 1.4301F));

		PartDefinition cube_r137 = body3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(119, 75).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3233F, -0.2289F, -1.4809F, -0.3966F, 0.0869F, -0.9206F));

		PartDefinition cube_r138 = body3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(119, 73).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3233F, -0.2289F, -1.4809F, -0.4052F, -0.0157F, -1.1616F));

		PartDefinition cube_r139 = body3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(128, 73).mirror().addBox(-7.1255F, -3.0192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3233F, -0.2289F, -1.4809F, -0.3703F, -0.1693F, -1.5345F));

		PartDefinition cube_r140 = body3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(119, 71).mirror().addBox(-5.871F, -0.7669F, -0.0516F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3233F, -0.2289F, -1.4809F, -0.4058F, -0.0558F, -1.1444F));

		PartDefinition cube_r141 = body3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(63, 119).mirror().addBox(-3.1244F, 0.0101F, -0.4988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3233F, -0.2289F, -1.4809F, -0.4021F, 0.1834F, -0.9616F));

		PartDefinition cube_r142 = body3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(128, 71).mirror().addBox(-6.9777F, -3.0119F, 0.3179F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3233F, -0.2289F, -1.4809F, -0.3806F, -0.283F, -1.4886F));

		PartDefinition cube_r143 = body3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(119, 56).mirror().addBox(-7.9777F, -3.0118F, 0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3233F, -0.5289F, -3.4809F, -0.3678F, -0.2321F, -1.422F));

		PartDefinition cube_r144 = body3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(119, 54).mirror().addBox(-3.1518F, 0.0101F, -0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3233F, -0.5289F, -3.4809F, -0.3714F, 0.2862F, -0.9103F));

		PartDefinition cube_r145 = body3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(54, 119).mirror().addBox(-5.871F, -0.7669F, 0.1484F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3233F, -0.5289F, -3.4809F, -0.377F, -0.0121F, -1.0756F));

		PartDefinition cube_r146 = body3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(122, 51).mirror().addBox(-8.1256F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3233F, -0.5289F, -3.4809F, -0.3601F, -0.1179F, -1.4662F));

		PartDefinition cube_r147 = body3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(119, 30).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3233F, -0.5289F, -3.4809F, -0.3771F, 0.0285F, -1.0916F));

		PartDefinition cube_r148 = body3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(119, 28).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3233F, -0.5289F, -3.4809F, -0.3585F, 0.1231F, -0.8467F));

		PartDefinition cube_r149 = body3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(119, 26).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3233F, -0.6289F, -5.4809F, -0.3839F, 0.099F, -0.7972F));

		PartDefinition cube_r150 = body3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(25, 119).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3233F, -0.6289F, -5.4809F, -0.3959F, -0.001F, -1.0395F));

		PartDefinition cube_r151 = body3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(19, 60).mirror().addBox(-9.1256F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3233F, -0.6289F, -5.4809F, -0.3669F, -0.1522F, -1.4129F));

		PartDefinition cube_r152 = body3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(119, 24).mirror().addBox(-5.871F, -0.7669F, 0.1484F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3233F, -0.6289F, -5.4809F, -0.3962F, -0.0413F, -1.0227F));

		PartDefinition cube_r153 = body3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(119, 22).mirror().addBox(-3.1518F, 0.0101F, -0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3233F, -0.6289F, -5.4809F, -0.396F, 0.2605F, -0.8646F));

		PartDefinition cube_r154 = body3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(16, 119).mirror().addBox(-7.9777F, -3.0118F, 0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3233F, -0.6289F, -5.4809F, -0.3763F, -0.266F, -1.3676F));

		PartDefinition cube_r155 = body3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(128, 71).addBox(4.9777F, -3.0119F, 0.3179F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5233F, -0.2289F, -1.4809F, -0.3806F, 0.283F, 1.4886F));

		PartDefinition cube_r156 = body3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(63, 119).addBox(0.1244F, 0.0101F, -0.4988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5233F, -0.2289F, -1.4809F, -0.4021F, -0.1834F, 0.9616F));

		PartDefinition cube_r157 = body3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(119, 71).addBox(2.871F, -0.7669F, -0.0516F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5233F, -0.2289F, -1.4809F, -0.4058F, 0.0558F, 1.1444F));

		PartDefinition cube_r158 = body3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(108, 82).addBox(-1.9F, 0.1F, -0.425F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3886F, 6.6215F, -1.5465F, 0.3936F, -0.9644F, -1.6297F));

		PartDefinition cube_r159 = body3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(128, 73).addBox(5.1255F, -3.0192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5233F, -0.2289F, -1.4809F, -0.3703F, 0.1693F, 1.5345F));

		PartDefinition cube_r160 = body3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(119, 73).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5233F, -0.2289F, -1.4809F, -0.4052F, 0.0157F, 1.1616F));

		PartDefinition cube_r161 = body3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(119, 75).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5233F, -0.2289F, -1.4809F, -0.3966F, -0.0869F, 0.9206F));

		PartDefinition cube_r162 = body3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(119, 28).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5233F, -0.5289F, -3.4809F, -0.3585F, -0.1231F, 0.8467F));

		PartDefinition cube_r163 = body3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(119, 30).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5233F, -0.5289F, -3.4809F, -0.3771F, -0.0285F, 1.0916F));

		PartDefinition cube_r164 = body3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(71, 15).addBox(-2.2F, -0.05F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8997F, 7.2863F, -3.0958F, 0.9023F, -1.2619F, -1.8797F));

		PartDefinition cube_r165 = body3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(122, 51).addBox(5.1255F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5233F, -0.5289F, -3.4809F, -0.3601F, 0.1179F, 1.4662F));

		PartDefinition cube_r166 = body3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(54, 119).addBox(2.871F, -0.7669F, 0.1484F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5233F, -0.5289F, -3.4809F, -0.377F, 0.0121F, 1.0756F));

		PartDefinition cube_r167 = body3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(119, 54).addBox(0.1517F, 0.0101F, -0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5233F, -0.5289F, -3.4809F, -0.3714F, -0.2862F, 0.9103F));

		PartDefinition cube_r168 = body3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(119, 56).addBox(4.9777F, -3.0118F, 0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5233F, -0.5289F, -3.4809F, -0.3678F, 0.2321F, 1.422F));

		PartDefinition cube_r169 = body3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(16, 119).addBox(4.9777F, -3.0118F, 0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5233F, -0.6289F, -5.4809F, -0.3763F, 0.266F, 1.3676F));

		PartDefinition cube_r170 = body3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(119, 22).addBox(0.1517F, 0.0101F, -0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5233F, -0.6289F, -5.4809F, -0.396F, -0.2605F, 0.8646F));

		PartDefinition cube_r171 = body3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(119, 24).addBox(2.871F, -0.7669F, 0.1484F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5233F, -0.6289F, -5.4809F, -0.3962F, 0.0413F, 1.0227F));

		PartDefinition cube_r172 = body3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(81, 118).addBox(-2.0F, -0.15F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5114F, 8.0285F, -5.4659F, 0.6007F, -1.2497F, -1.4301F));

		PartDefinition cube_r173 = body3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(19, 60).addBox(5.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5233F, -0.6289F, -5.4809F, -0.3669F, 0.1522F, 1.4129F));

		PartDefinition cube_r174 = body3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(25, 119).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5233F, -0.6289F, -5.4809F, -0.3959F, 0.001F, 1.0395F));

		PartDefinition cube_r175 = body3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(119, 26).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5233F, -0.6289F, -5.4809F, -0.3839F, -0.099F, 0.7972F));

		PartDefinition cube_r176 = body3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(15, 41).addBox(-0.5F, 0.0939F, -0.0558F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9233F, -1.2943F, -6.8627F, -0.1222F, 0.0F, 0.0F));

		PartDefinition body5 = body3.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offset(-0.9233F, -0.2411F, -6.9487F));

		PartDefinition cube_r177 = body5.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(89, 20).mirror().addBox(0.0F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8034F, 8.8501F, -0.4452F, -0.0233F, 1.1335F, 0.4054F));

		PartDefinition cube_r178 = body5.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(89, 18).mirror().addBox(-0.2F, -0.1F, 0.0F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.307F, 8.7814F, -2.7259F, 0.0327F, 0.9586F, 0.4734F));

		PartDefinition cube_r179 = body5.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(7, 119).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.5879F, -0.5322F, -0.3521F, 0.1291F, -0.7761F));

		PartDefinition cube_r180 = body5.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(118, 113).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.5879F, -0.5322F, -0.3724F, 0.0358F, -1.0217F));

		PartDefinition cube_r181 = body5.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(93, 37).mirror().addBox(-10.1256F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.5879F, -0.5322F, -0.3585F, -0.1093F, -1.3965F));

		PartDefinition cube_r182 = body5.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(118, 111).mirror().addBox(-5.871F, -0.7669F, 0.1484F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.5879F, -0.5322F, -0.3722F, -0.0048F, -1.0058F));

		PartDefinition cube_r183 = body5.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(118, 109).mirror().addBox(-3.1518F, 0.0101F, -0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.5879F, -0.5322F, -0.3652F, 0.2926F, -0.8387F));

		PartDefinition cube_r184 = body5.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(118, 90).mirror().addBox(-7.9777F, -3.0119F, 0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.5879F, -0.5322F, -0.3658F, -0.2236F, -1.3527F));

		PartDefinition cube_r185 = body5.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(118, 88).mirror().addBox(-7.9777F, -3.0119F, 0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.5879F, -2.5322F, -0.3572F, -0.19F, -1.3339F));

		PartDefinition cube_r186 = body5.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(72, 118).mirror().addBox(-3.1518F, 0.0101F, -0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.5879F, -2.5322F, -0.3402F, 0.3176F, -0.8107F));

		PartDefinition cube_r187 = body5.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(118, 12).mirror().addBox(-5.871F, -0.7669F, 0.1484F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.5879F, -2.5322F, -0.3529F, 0.0239F, -0.9852F));

		PartDefinition cube_r188 = body5.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(90, 77).mirror().addBox(-10.1256F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.5879F, -2.5322F, -0.3515F, -0.0754F, -1.3767F));

		PartDefinition cube_r189 = body5.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(116, 100).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.5879F, -2.5322F, -0.3535F, 0.0649F, -1.0003F));

		PartDefinition cube_r190 = body5.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(115, 86).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.5879F, -2.5322F, -0.3264F, 0.1526F, -0.7521F));

		PartDefinition cube_r191 = body5.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(118, 90).addBox(4.9777F, -3.0119F, 0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.5879F, -0.5322F, -0.3658F, 0.2236F, 1.3527F));

		PartDefinition cube_r192 = body5.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(118, 109).addBox(0.1517F, 0.0101F, -0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.5879F, -0.5322F, -0.3652F, -0.2926F, 0.8387F));

		PartDefinition cube_r193 = body5.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(118, 111).addBox(2.871F, -0.7669F, 0.1484F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.5879F, -0.5322F, -0.3722F, 0.0048F, 1.0058F));

		PartDefinition cube_r194 = body5.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(89, 20).addBox(-6.0F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8034F, 8.8501F, -0.4452F, -0.0233F, -1.1335F, -0.4054F));

		PartDefinition cube_r195 = body5.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(93, 37).addBox(5.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.5879F, -0.5322F, -0.3585F, 0.1093F, 1.3965F));

		PartDefinition cube_r196 = body5.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(118, 113).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.5879F, -0.5322F, -0.3724F, -0.0358F, 1.0217F));

		PartDefinition cube_r197 = body5.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(7, 119).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.5879F, -0.5322F, -0.3521F, -0.1291F, 0.7761F));

		PartDefinition cube_r198 = body5.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(89, 18).addBox(-5.8F, -0.1F, 0.0F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.307F, 8.7814F, -2.7259F, 0.0327F, -0.9586F, -0.4734F));

		PartDefinition cube_r199 = body5.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(72, 118).addBox(0.1517F, 0.0101F, -0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.5879F, -2.5322F, -0.3402F, -0.3176F, 0.8107F));

		PartDefinition cube_r200 = body5.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(115, 86).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.5879F, -2.5322F, -0.3264F, -0.1526F, 0.7521F));

		PartDefinition cube_r201 = body5.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(118, 12).addBox(2.871F, -0.7669F, 0.1484F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.5879F, -2.5322F, -0.3529F, -0.0239F, 0.9852F));

		PartDefinition cube_r202 = body5.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(116, 100).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.5879F, -2.5322F, -0.3535F, -0.0649F, 1.0003F));

		PartDefinition cube_r203 = body5.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(118, 88).addBox(4.9777F, -3.0119F, 0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.5879F, -2.5322F, -0.3572F, 0.19F, 1.3339F));

		PartDefinition cube_r204 = body5.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(90, 77).addBox(5.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.5879F, -2.5322F, -0.3515F, 0.0754F, 1.3767F));

		PartDefinition cube_r205 = body5.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(90, 69).addBox(-0.5F, -1.0F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r206 = body5.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(30, 132).addBox(-0.5F, -2.7014F, 0.0678F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8407F, -2.9843F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r207 = body5.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(90, 134).addBox(-0.5F, -2.6014F, -0.0322F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8896F, -0.8308F, -0.3229F, 0.0F, 0.0F));

		PartDefinition body2 = body5.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0983F, -3.8751F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r208 = body2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(61, 132).addBox(-0.5F, -2.9874F, -0.3422F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5071F, -4.6216F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r209 = body2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(44, 132).addBox(-0.5F, -2.7874F, -0.2422F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5212F, -2.8723F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r210 = body2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(39, 65).addBox(-0.5F, -2.8874F, -0.1422F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6233F, -0.9027F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r211 = body2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(63, 121).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2861F, -4.4571F, -0.3264F, 0.1526F, -0.6473F));

		PartDefinition cube_r212 = body2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(54, 121).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2861F, -4.4571F, -0.3535F, 0.0649F, -0.8955F));

		PartDefinition cube_r213 = body2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(96, 8).mirror().addBox(-10.1256F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2861F, -4.4571F, -0.3515F, -0.0754F, -1.272F));

		PartDefinition cube_r214 = body2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(18, 121).mirror().addBox(-5.871F, -0.7669F, 0.1484F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2861F, -4.4571F, -0.3529F, 0.0239F, -0.8804F));

		PartDefinition cube_r215 = body2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(9, 121).mirror().addBox(-3.1518F, 0.0101F, -0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2861F, -4.4571F, -0.3402F, 0.3176F, -0.706F));

		PartDefinition cube_r216 = body2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(0, 121).mirror().addBox(-7.9777F, -3.0119F, 0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2861F, -4.4571F, -0.3572F, -0.19F, -1.2292F));

		PartDefinition cube_r217 = body2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(120, 117).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.3861F, -2.4571F, -0.3264F, 0.1526F, -0.6648F));

		PartDefinition cube_r218 = body2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(120, 115).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.3861F, -2.4571F, -0.3535F, 0.0649F, -0.913F));

		PartDefinition cube_r219 = body2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(82, 42).mirror().addBox(-11.1256F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.3861F, -2.4571F, -0.3515F, -0.0754F, -1.2894F));

		PartDefinition cube_r220 = body2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(120, 94).mirror().addBox(-5.871F, -0.7669F, 0.1484F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.3861F, -2.4571F, -0.3529F, 0.0239F, -0.8979F));

		PartDefinition cube_r221 = body2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(120, 92).mirror().addBox(-3.1518F, 0.0101F, -0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.3861F, -2.4571F, -0.3402F, 0.3176F, -0.7234F));

		PartDefinition cube_r222 = body2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(90, 120).mirror().addBox(-7.9777F, -3.0118F, 0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.3861F, -2.4571F, -0.3572F, -0.19F, -1.2467F));

		PartDefinition cube_r223 = body2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(81, 120).mirror().addBox(-7.9777F, -3.0119F, 0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.5861F, -0.4571F, -0.3656F, -0.2239F, -1.2624F));

		PartDefinition cube_r224 = body2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(72, 120).mirror().addBox(-3.1518F, 0.0101F, -0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.5861F, -0.4571F, -0.3653F, 0.2922F, -0.7484F));

		PartDefinition cube_r225 = body2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(117, 119).mirror().addBox(-5.871F, -0.7669F, 0.1484F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.5861F, -0.4571F, -0.3722F, -0.0052F, -0.9155F));

		PartDefinition cube_r226 = body2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(82, 40).mirror().addBox(-11.1256F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.5861F, -0.4571F, -0.3583F, -0.1096F, -1.3063F));

		PartDefinition cube_r227 = body2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(108, 119).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.5861F, -0.4571F, -0.3724F, 0.0355F, -0.9314F));

		PartDefinition cube_r228 = body2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(99, 119).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.5861F, -0.4571F, -0.3521F, 0.1287F, -0.6858F));

		PartDefinition cube_r229 = body2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(0, 121).addBox(4.9777F, -3.0119F, 0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.2861F, -4.4571F, -0.3572F, 0.19F, 1.2292F));

		PartDefinition cube_r230 = body2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(9, 121).addBox(0.1517F, 0.0101F, -0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.2861F, -4.4571F, -0.3402F, -0.3176F, 0.706F));

		PartDefinition cube_r231 = body2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(18, 121).addBox(2.871F, -0.7669F, 0.1484F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.2861F, -4.4571F, -0.3529F, -0.0239F, 0.8804F));

		PartDefinition cube_r232 = body2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(96, 8).addBox(5.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.2861F, -4.4571F, -0.3515F, 0.0754F, 1.272F));

		PartDefinition cube_r233 = body2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(54, 121).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.2861F, -4.4571F, -0.3535F, -0.0649F, 0.8955F));

		PartDefinition cube_r234 = body2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(63, 121).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.2861F, -4.4571F, -0.3264F, -0.1526F, 0.6473F));

		PartDefinition cube_r235 = body2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(90, 120).addBox(4.9777F, -3.0118F, 0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.3861F, -2.4571F, -0.3572F, 0.19F, 1.2467F));

		PartDefinition cube_r236 = body2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(120, 92).addBox(0.1517F, 0.0101F, -0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.3861F, -2.4571F, -0.3402F, -0.3176F, 0.7234F));

		PartDefinition cube_r237 = body2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(120, 94).addBox(2.871F, -0.7669F, 0.1484F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.3861F, -2.4571F, -0.3529F, -0.0239F, 0.8979F));

		PartDefinition cube_r238 = body2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(82, 42).addBox(5.1255F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.3861F, -2.4571F, -0.3515F, 0.0754F, 1.2894F));

		PartDefinition cube_r239 = body2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(120, 115).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.3861F, -2.4571F, -0.3535F, -0.0649F, 0.913F));

		PartDefinition cube_r240 = body2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(120, 117).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.3861F, -2.4571F, -0.3264F, -0.1526F, 0.6648F));

		PartDefinition cube_r241 = body2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(99, 119).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.5861F, -0.4571F, -0.3521F, -0.1287F, 0.6858F));

		PartDefinition cube_r242 = body2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(108, 119).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.5861F, -0.4571F, -0.3724F, -0.0355F, 0.9314F));

		PartDefinition cube_r243 = body2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(82, 40).addBox(5.1255F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.5861F, -0.4571F, -0.3583F, 0.1096F, 1.3063F));

		PartDefinition cube_r244 = body2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(117, 119).addBox(2.871F, -0.7669F, 0.1484F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.5861F, -0.4571F, -0.3722F, 0.0052F, 0.9155F));

		PartDefinition cube_r245 = body2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(72, 120).addBox(0.1517F, 0.0101F, -0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.5861F, -0.4571F, -0.3653F, -0.2922F, 0.7484F));

		PartDefinition cube_r246 = body2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(81, 120).addBox(4.9777F, -3.0119F, 0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.5861F, -0.4571F, -0.3656F, 0.2239F, 1.2624F));

		PartDefinition cube_r247 = body2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(13, 62).addBox(-0.5F, -1.0F, -8.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.1F, 3.9F, 0.0524F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1989F, -5.0852F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r248 = body.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(111, 129).addBox(-0.5F, -3.1015F, -0.2561F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8395F, -3.4547F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r249 = body.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(132, 108).addBox(-0.5F, -2.9765F, 0.0189F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2136F, -1.8212F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r250 = body.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(27, 122).mirror().addBox(-7.9777F, -3.0118F, 0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.3128F, -3.0719F, -0.3064F, 0.0222F, -1.3382F));

		PartDefinition cube_r251 = body.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(122, 20).mirror().addBox(-3.1518F, 0.0101F, -0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.3128F, -3.0719F, -0.172F, 0.4712F, -0.7458F));

		PartDefinition cube_r252 = body.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(122, 18).mirror().addBox(-5.871F, -0.7669F, 0.1484F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.3128F, -3.0719F, -0.2304F, 0.2051F, -0.9711F));

		PartDefinition cube_r253 = body.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(123, 4).mirror().addBox(-8.1256F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.3128F, -3.0719F, -0.3094F, 0.1387F, -1.3754F));

		PartDefinition cube_r254 = body.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(122, 16).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.3128F, -3.0719F, -0.2327F, 0.2476F, -0.9814F));

		PartDefinition cube_r255 = body.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(122, 14).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.3128F, -3.0719F, -0.1603F, 0.299F, -0.7147F));

		PartDefinition cube_r256 = body.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(117, 121).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4128F, -1.0719F, -0.1945F, 0.2703F, -0.637F));

		PartDefinition cube_r257 = body.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(108, 121).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4128F, -1.0719F, -0.2575F, 0.2113F, -0.8997F));

		PartDefinition cube_r258 = body.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(104, 20).mirror().addBox(-9.1256F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4128F, -1.0719F, -0.3179F, 0.0959F, -1.2891F));

		PartDefinition cube_r259 = body.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(121, 104).mirror().addBox(-5.871F, -0.7669F, 0.1484F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4128F, -1.0719F, -0.2554F, 0.169F, -0.8885F));

		PartDefinition cube_r260 = body.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(121, 102).mirror().addBox(-3.1518F, 0.0101F, -0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4128F, -1.0719F, -0.2075F, 0.4413F, -0.6741F));

		PartDefinition cube_r261 = body.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(99, 121).mirror().addBox(-7.9777F, -3.0119F, 0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4128F, -1.0719F, -0.3164F, -0.0202F, -1.251F));

		PartDefinition cube_r262 = body.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(122, 14).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.3128F, -3.0719F, -0.1603F, -0.299F, 0.7147F));

		PartDefinition cube_r263 = body.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(122, 16).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.3128F, -3.0719F, -0.2327F, -0.2476F, 0.9814F));

		PartDefinition cube_r264 = body.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(123, 4).addBox(5.1255F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.3128F, -3.0719F, -0.3094F, -0.1387F, 1.3754F));

		PartDefinition cube_r265 = body.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(122, 18).addBox(2.871F, -0.7669F, 0.1484F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.3128F, -3.0719F, -0.2304F, -0.2051F, 0.9711F));

		PartDefinition cube_r266 = body.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(122, 20).addBox(0.1517F, 0.0101F, -0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.3128F, -3.0719F, -0.172F, -0.4712F, 0.7458F));

		PartDefinition cube_r267 = body.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(27, 122).addBox(4.9777F, -3.0118F, 0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.3128F, -3.0719F, -0.3064F, -0.0222F, 1.3382F));

		PartDefinition cube_r268 = body.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(99, 121).addBox(4.9777F, -3.0119F, 0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4128F, -1.0719F, -0.3164F, 0.0202F, 1.251F));

		PartDefinition cube_r269 = body.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(121, 102).addBox(0.1517F, 0.0101F, -0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4128F, -1.0719F, -0.2075F, -0.4413F, 0.6741F));

		PartDefinition cube_r270 = body.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(121, 104).addBox(2.871F, -0.7669F, 0.1484F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4128F, -1.0719F, -0.2554F, -0.169F, 0.8885F));

		PartDefinition cube_r271 = body.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(104, 20).addBox(5.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4128F, -1.0719F, -0.3179F, -0.0959F, 1.2891F));

		PartDefinition cube_r272 = body.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(108, 121).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4128F, -1.0719F, -0.2575F, -0.2113F, 0.8997F));

		PartDefinition cube_r273 = body.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(117, 121).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4128F, -1.0719F, -0.1945F, -0.2703F, 0.637F));

		PartDefinition cube_r274 = body.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(22, 92).addBox(-0.5F, -0.0401F, -4.1382F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.2F, 0.3491F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7517F, -3.3312F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r275 = chest.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(16, 99).addBox(-0.5F, -5.1653F, -0.187F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1204F, -4.6509F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r276 = chest.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(50, 25).addBox(-0.5F, -3.3653F, -0.087F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2626F, -2.086F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r277 = chest.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(77, 74).addBox(-1.5F, -4.9F, -0.4F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.6809F, -6.5036F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r278 = chest.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(64, 82).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.9053F, -2.7265F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r279 = chest.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(50, 15).mirror().addBox(-8.5F, 0.2F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0116F, 8.0585F, 5.4784F, 0.2167F, 0.6665F, 0.4445F));

		PartDefinition cube_r280 = chest.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-7.6F, 0.2F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0116F, 8.0585F, 5.4784F, 0.1565F, 0.5046F, 0.3442F));

		PartDefinition cube_r281 = chest.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(106, 41).mirror().addBox(-3.9F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5336F, 7.3389F, 0.732F, -0.1685F, 0.0636F, 0.2637F));

		PartDefinition cube_r282 = chest.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(15, 58).mirror().addBox(-5.6F, 0.0F, -0.7F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4832F, 7.8736F, 3.6836F, 0.0237F, 0.2409F, 0.3417F));

		PartDefinition cube_r283 = chest.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(65, 13).mirror().addBox(-6.7F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3407F, 8.0842F, 4.6507F, 0.1651F, 0.3698F, 0.359F));

		PartDefinition cube_r284 = chest.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(90, 75).mirror().addBox(-4.6F, 0.0F, -0.1F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5151F, 7.535F, 1.8142F, -0.17F, 0.1496F, 0.2489F));

		PartDefinition cube_r285 = chest.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(34, 129).mirror().addBox(-1.9439F, 0.0349F, -0.3471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.2611F, -3.5407F, 0.2406F, 0.094F, -0.6441F));

		PartDefinition cube_r286 = chest.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(15, 129).mirror().addBox(-3.7403F, -0.8667F, -0.3471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.2611F, -3.5407F, 0.1711F, 0.194F, -1.1187F));

		PartDefinition cube_r287 = chest.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(84, 128).mirror().addBox(-5.1042F, -2.2592F, -0.3471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.2611F, -3.5407F, 0.081F, 0.2452F, -1.5268F));

		PartDefinition cube_r288 = chest.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(129, 65).mirror().addBox(-6.9777F, -3.0119F, 0.5179F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1611F, -1.5407F, -0.2862F, 0.1071F, -1.3893F));

		PartDefinition cube_r289 = chest.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(122, 36).mirror().addBox(-3.1518F, 0.0101F, -0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1611F, -1.5407F, -0.0978F, 0.5293F, -0.7625F));

		PartDefinition cube_r290 = chest.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(36, 122).mirror().addBox(-5.871F, -0.7669F, 0.1484F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1611F, -1.5407F, -0.1792F, 0.2769F, -1.0112F));

		PartDefinition cube_r291 = chest.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(128, 75).mirror().addBox(-7.1255F, -3.0192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1611F, -1.5407F, -0.292F, 0.2243F, -1.4246F));

		PartDefinition cube_r292 = chest.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(122, 34).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1611F, -1.5407F, -0.1816F, 0.3198F, -1.0194F));

		PartDefinition cube_r293 = chest.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(122, 32).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1611F, -1.5407F, -0.09F, 0.3555F, -0.7444F));

		PartDefinition cube_r294 = chest.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(84, 128).addBox(3.1042F, -2.2592F, -0.3471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.2611F, -3.5407F, 0.081F, -0.2452F, 1.5268F));

		PartDefinition cube_r295 = chest.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(15, 129).addBox(1.7403F, -0.8667F, -0.3471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.2611F, -3.5407F, 0.1711F, -0.194F, 1.1187F));

		PartDefinition cube_r296 = chest.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(34, 129).addBox(-0.0561F, 0.0349F, -0.3471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.2611F, -3.5407F, 0.2406F, -0.094F, 0.6441F));

		PartDefinition cube_r297 = chest.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(122, 32).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1611F, -1.5407F, -0.09F, -0.3555F, 0.7444F));

		PartDefinition cube_r298 = chest.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(122, 34).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1611F, -1.5407F, -0.1816F, -0.3198F, 1.0194F));

		PartDefinition cube_r299 = chest.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(128, 75).addBox(5.1255F, -3.0192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1611F, -1.5407F, -0.292F, -0.2243F, 1.4246F));

		PartDefinition cube_r300 = chest.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(36, 122).addBox(2.871F, -0.7669F, 0.1484F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1611F, -1.5407F, -0.1792F, -0.2769F, 1.0112F));

		PartDefinition cube_r301 = chest.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(122, 36).addBox(0.1517F, 0.0101F, -0.5179F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1611F, -1.5407F, -0.0978F, -0.5293F, 0.7625F));

		PartDefinition cube_r302 = chest.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(15, 58).addBox(-0.4F, 0.0F, -0.7F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4832F, 7.8736F, 3.6836F, 0.0237F, -0.2409F, -0.3417F));

		PartDefinition cube_r303 = chest.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(50, 15).addBox(-0.5F, 0.2F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0116F, 8.0585F, 5.4784F, 0.2167F, -0.6665F, -0.4445F));

		PartDefinition cube_r304 = chest.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(0, 60).addBox(-0.4F, 0.2F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0116F, 8.0585F, 5.4784F, 0.1565F, -0.5046F, -0.3442F));

		PartDefinition cube_r305 = chest.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(65, 13).addBox(-0.3F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3407F, 8.0842F, 4.6507F, 0.1651F, -0.3698F, -0.359F));

		PartDefinition cube_r306 = chest.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(106, 41).addBox(-0.1F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5336F, 7.3389F, 0.732F, -0.1685F, -0.0636F, -0.2637F));

		PartDefinition cube_r307 = chest.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(90, 75).addBox(-0.4F, 0.0F, -0.1F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5151F, 7.535F, 1.8142F, -0.17F, -0.1496F, -0.2489F));

		PartDefinition cube_r308 = chest.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(57, 62).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.1994F, 2.1031F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r309 = chest.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(129, 65).addBox(4.9777F, -3.0119F, 0.5179F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1611F, -1.5407F, -0.2862F, -0.1071F, 1.3893F));

		PartDefinition cube_r310 = chest.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(68, 31).addBox(-0.5F, -0.9F, -6.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.4964F, 0.8878F, 0.4363F, 0.0F, 0.0F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9885F, -4.5641F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r311 = chest2.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(53, 75).addBox(-0.5F, -3.0644F, -0.0794F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4576F, -3.0098F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r312 = chest2.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(100, 97).addBox(-0.5F, -0.9F, -9.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.5F, 5.5F, 0.4363F, 0.0F, 0.0F));

		PartDefinition neck3 = chest2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4705F, -2.3326F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r313 = neck3.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(64, 132).addBox(0.0F, -2.8722F, 0.0299F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -2.4F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r314 = neck3.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(49, 101).addBox(-0.5F, -0.1F, 1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -4.9F, 0.4014F, 0.0F, 0.0F));

		PartDefinition Hyoid = neck3.addOrReplaceChild("Hyoid", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6504F, 3.3564F, 0.3612F, 0.2184F, 0.0426F, 0.0094F));

		PartDefinition cube_r315 = Hyoid.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(86, 122).mirror().addBox(-2.8935F, 8.5009F, -2.8806F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8009F, 0.0F, 0.0F, -1.2241F, -0.093F, -0.0979F));

		PartDefinition cube_r316 = Hyoid.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(19, 123).mirror().addBox(-1.2669F, 5.4693F, -0.9724F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8009F, 0.0F, 0.0F, -1.4424F, 0.0801F, -0.0756F));

		PartDefinition cube_r317 = Hyoid.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(10, 127).mirror().addBox(-0.4F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7364F, -0.0446F, -3.8901F, -1.3852F, 0.2473F, -0.0678F));

		PartDefinition cube_r318 = Hyoid.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(130, 105).mirror().addBox(-0.9F, -0.525F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(130, 102).mirror().addBox(-0.9F, -0.525F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7569F, -2.0942F, -0.1339F, -1.3018F, 0.2462F, -1.0231F));

		PartDefinition cube_r319 = Hyoid.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(7, 115).mirror().addBox(-0.5F, -0.4436F, -0.4305F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0443F, -1.8538F, 0.0727F, -0.8867F, 0.1413F, -0.6836F));

		PartDefinition cube_r320 = Hyoid.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(5, 127).mirror().addBox(-1.1253F, -0.2116F, -0.977F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8009F, 0.0F, 0.0F, -1.5123F, -0.056F, -0.0886F));

		PartDefinition cube_r321 = Hyoid.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(86, 122).addBox(1.8935F, 8.5009F, -2.8806F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -1.2241F, 0.093F, 0.0979F));

		PartDefinition cube_r322 = Hyoid.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(19, 123).addBox(0.2669F, 5.4693F, -0.9724F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -1.4424F, -0.0801F, 0.0756F));

		PartDefinition cube_r323 = Hyoid.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(10, 127).addBox(-0.6F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4356F, -0.0446F, -3.8901F, -1.3852F, -0.2473F, 0.0678F));

		PartDefinition cube_r324 = Hyoid.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(130, 105).addBox(-0.1F, -0.525F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(130, 102).addBox(-0.1F, -0.525F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.456F, -2.0942F, -0.1339F, -1.3018F, -0.2462F, 1.0231F));

		PartDefinition cube_r325 = Hyoid.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(7, 115).addBox(-0.5F, -0.4436F, -0.4305F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7434F, -1.8538F, 0.0727F, -0.8867F, -0.1413F, 0.6836F));

		PartDefinition cube_r326 = Hyoid.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(116, 96).addBox(-1.0F, -1.5F, -0.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6076F, -0.826F, 0.0237F, -1.0579F, 0.0F, 0.0F));

		PartDefinition cube_r327 = Hyoid.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(5, 127).addBox(0.1253F, -0.2116F, -0.977F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -1.5123F, 0.056F, 0.0886F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2195F, -2.6473F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r328 = neck2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(94, 132).addBox(0.0F, -2.7F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8444F, -1.3313F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r329 = neck2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(25, 135).addBox(0.0F, -2.5861F, 0.0638F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.3F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r330 = neck2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(84, 91).addBox(-0.5F, -1.0F, -3.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.8F, 0.3316F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1626F, -4.242F, -0.0086F, 0.043F, 0.0072F));

		PartDefinition cube_r331 = neck.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(77, 79).addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7058F, -2.4026F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r332 = neck.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(126, 132).addBox(0.0F, -2.6361F, -0.0862F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5568F, -0.7399F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r333 = neck.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(97, 132).addBox(0.0F, -2.3361F, 0.0138F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4288F, -2.5509F, 0.3491F, 0.0F, 0.0F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -3.475F, 0.0876F, 0.0869F, 0.0076F));

		PartDefinition cube_r334 = neck4.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(44, 89).mirror().addBox(0.1339F, 0.1316F, -1.8738F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0259F, -1.1238F, -2.1018F, 0.5468F, -0.3796F, 0.5468F));

		PartDefinition cube_r335 = neck4.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(44, 89).addBox(-0.1339F, 0.1316F, -1.8738F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0259F, -1.1238F, -2.1018F, 0.5468F, 0.3796F, -0.5468F));

		PartDefinition cube_r336 = neck4.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(92, 22).addBox(-1.0F, -0.7311F, 0.1071F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(15, 50).addBox(-0.5F, -0.3F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7058F, -2.4026F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r337 = neck4.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(43, 127).addBox(0.0F, -0.6F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.013F, -4.5346F, 0.9163F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.807F, -5.0724F, -0.3097F, 0.0537F, 0.1662F));

		PartDefinition cube_r338 = head.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(39, 70).addBox(-1.0F, -3.5F, -1.4F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.5288F, -1.4764F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r339 = head.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(70, 66).addBox(-1.0F, -0.2F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(92, 27).addBox(-1.0F, -0.2F, -0.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 11.8996F, -4.3736F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r340 = head.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(105, 102).addBox(-1.0F, -0.2F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 13.4986F, -4.4295F, 1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r341 = head.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(64, 88).addBox(-0.5F, 1.9677F, -0.1561F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.485F, 2.2245F, -3.192F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r342 = head.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(107, 0).addBox(-0.5F, 0.9862F, -0.0692F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.485F, 2.2245F, -3.192F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r343 = head.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(62, 96).addBox(-2.5F, -1.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.0F, -0.1451F, -1.6995F, -1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r344 = head.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(105, 106).addBox(-2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.496F, -0.6168F, -0.816F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r345 = head.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(106, 84).addBox(-2.5F, -0.425F, -0.95F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0F, 0.045F, 0.2359F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r346 = head.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(72, 6).addBox(-1.5F, -1.0F, -1.6F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 2.7078F, -0.6758F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r347 = head.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(109, 8).addBox(-1.5F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.509F, -0.4741F, -1.9632F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r348 = head.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(91, 122).addBox(-0.985F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.2819F, -2.8945F, -1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r349 = head.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(37, 109).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.015F, 0.3614F, -2.5037F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r350 = head.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(113, 32).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.001F, 1.7186F, 1.2404F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r351 = head.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(11, 95).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.001F, 2.7002F, 1.0495F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r352 = head.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(47, 106).addBox(-1.5F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.515F, 2.2245F, -3.192F, -0.2269F, 0.0F, 0.0F));

		PartDefinition leftSygomaticarch = head.addOrReplaceChild("leftSygomaticarch", CubeListBuilder.create(), PartPose.offset(2.9479F, 7.5262F, 1.6254F));

		PartDefinition cube_r353 = leftSygomaticarch.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(48, 129).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3241F, 0.203F, -4.8032F, -2.2238F, 1.4278F, -2.2288F));

		PartDefinition cube_r354 = leftSygomaticarch.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(42, 96).addBox(-2.0F, -3.5F, -1.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3241F, -0.7906F, -4.69F, -0.2633F, 1.1209F, -0.2382F));

		PartDefinition cube_r355 = leftSygomaticarch.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(125, 43).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.9329F, -3.3643F, -5.1952F, -0.2097F, 0.6325F, -0.0821F));

		PartDefinition cube_r356 = leftSygomaticarch.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(124, 85).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.8904F, -4.3492F, -5.0273F, 0.069F, 0.9313F, 0.2556F));

		PartDefinition cube_r357 = leftSygomaticarch.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(71, 102).addBox(-2.0F, -2.5F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.9329F, -0.8804F, -5.4782F, -0.1426F, 0.6496F, -0.0866F));

		PartDefinition cube_r358 = leftSygomaticarch.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(133, 26).addBox(-0.8F, -0.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.9245F, 15.3087F, -5.5479F, 2.2646F, 1.3859F, 2.3605F));

		PartDefinition cube_r359 = leftSygomaticarch.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(133, 23).addBox(-0.8F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0236F, 15.0096F, -5.5741F, 2.3519F, 1.3859F, 2.3605F));

		PartDefinition cube_r360 = leftSygomaticarch.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(131, 77).addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.4479F, 15.0649F, -5.9947F, 0.1841F, 0.7769F, 0.1298F));

		PartDefinition cube_r361 = leftSygomaticarch.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(75, 85).addBox(0.0F, -0.2F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.2479F, 13.1697F, -6.1176F, 1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r362 = leftSygomaticarch.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(22, 86).addBox(0.0F, -0.2F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.2479F, 9.5702F, -6.1805F, 1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r363 = leftSygomaticarch.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(131, 50).addBox(0.0F, -0.375F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.2479F, 14.8953F, -5.6641F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r364 = leftSygomaticarch.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(116, 0).addBox(-0.825F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-2.2729F, 13.1697F, -6.1176F, 1.623F, -0.0046F, 0.0871F));

		PartDefinition cube_r365 = leftSygomaticarch.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(117, 67).addBox(0.0F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.2479F, 14.7675F, -6.0339F, 1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r366 = leftSygomaticarch.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(35, 118).addBox(-0.3F, -0.8F, -0.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.93F, 14.7535F, -5.1388F, -1.343F, 1.4273F, -2.8371F));

		PartDefinition cube_r367 = leftSygomaticarch.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(118, 8).addBox(-0.8F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0014F, 14.7756F, -5.6332F, -1.9412F, 1.4208F, 2.8418F));

		PartDefinition cube_r368 = leftSygomaticarch.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(117, 77).addBox(-0.8F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.4479F, 14.7675F, -6.0339F, 1.6516F, 0.8365F, 0.1268F));

		PartDefinition cube_r369 = leftSygomaticarch.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(53, 88).addBox(-0.7957F, -0.2207F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.2363F, 9.5699F, -6.1628F, 1.5961F, 0.801F, 0.0388F));

		PartDefinition cube_r370 = leftSygomaticarch.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(88, 63).addBox(-0.0957F, -0.8207F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.7623F, 13.1586F, -4.8907F, -1.3411F, 1.4201F, -2.8862F));

		PartDefinition cube_r371 = leftSygomaticarch.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(33, 86).addBox(-0.7957F, -0.8207F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.8053F, 9.5715F, -5.7454F, -1.6907F, 1.423F, 3.0435F));

		PartDefinition cube_r372 = leftSygomaticarch.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(85, 0).addBox(-0.1F, -0.9F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6857F, 9.7301F, -4.8788F, -0.9908F, 1.3889F, -2.5306F));

		PartDefinition cube_r373 = leftSygomaticarch.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(0, 85).addBox(-0.9F, -0.9F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.7154F, 5.9992F, -5.6399F, -1.346F, 1.415F, -2.8909F));

		PartDefinition cube_r374 = leftSygomaticarch.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(53, 82).addBox(-0.8F, -0.2F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.1479F, 5.9724F, -6.0548F, 1.5208F, 0.8059F, -0.0075F));

		PartDefinition cube_r375 = leftSygomaticarch.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(42, 115).addBox(-0.8F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.1479F, 5.1729F, -6.0269F, 1.5215F, 0.7848F, -0.0349F));

		PartDefinition cube_r376 = leftSygomaticarch.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(65, 115).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.7236F, 5.1877F, -5.6029F, -1.3723F, 1.3928F, -2.9462F));

		PartDefinition cube_r377 = leftSygomaticarch.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(115, 82).addBox(-1.25F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7236F, 5.1877F, -5.6029F, -0.7225F, 1.3053F, -2.2818F));

		PartDefinition cube_r378 = leftSygomaticarch.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(130, 129).addBox(-0.9836F, -0.9836F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3166F, 1.7067F, -5.0134F, 1.2294F, 1.326F, -0.2319F));

		PartDefinition cube_r379 = leftSygomaticarch.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(113, 115).addBox(-0.8F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3931F, 2.7008F, -5.0933F, 0.7401F, 1.2838F, -0.5914F));

		PartDefinition cube_r380 = leftSygomaticarch.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(106, 115).addBox(-0.8F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.3931F, 2.7008F, -5.0933F, 1.2876F, 0.7258F, 0.0277F));

		PartDefinition cube_r381 = leftSygomaticarch.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(99, 115).addBox(-0.8336F, -0.1836F, -2.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(130, 126).addBox(-1.0336F, 0.0164F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9358F, 1.581F, -5.7902F, 1.4621F, 0.7258F, 0.0277F));

		PartDefinition cube_r382 = leftSygomaticarch.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(11, 83).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7236F, 2.6172F, -5.4195F, -1.1041F, 1.3759F, -2.6825F));

		PartDefinition cube_r383 = leftSygomaticarch.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(15, 131).addBox(-0.7637F, -0.3311F, 0.6115F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(131, 14).addBox(-0.7637F, -0.3311F, 0.0115F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3727F, 2.4198F, -3.7819F, -0.8351F, 1.1661F, -2.0863F));

		PartDefinition cube_r384 = leftSygomaticarch.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(131, 31).addBox(-0.3305F, -0.7044F, 0.4379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(131, 17).addBox(-0.3305F, -0.7044F, -0.1621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3727F, 2.4198F, -3.7819F, 0.7475F, 0.6304F, -0.0605F));

		PartDefinition cube_r385 = leftSygomaticarch.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(96, 55).addBox(-0.347F, -1.6619F, -2.5214F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3727F, 2.4198F, -3.7819F, 1.0641F, 0.69F, 0.0614F));

		PartDefinition cube_r386 = leftSygomaticarch.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(91, 97).addBox(-0.7337F, -0.3311F, -2.5214F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3727F, 2.4198F, -3.7819F, -0.6623F, 1.0762F, -1.8948F));

		PartDefinition cube_r387 = leftSygomaticarch.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(85, 6).addBox(-1.625F, -1.0F, -1.925F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.7236F, 2.6172F, -5.4195F, -0.6788F, 1.2917F, -2.2457F));

		PartDefinition cube_r388 = leftSygomaticarch.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(72, 134).addBox(-1.1745F, -0.6376F, -0.4455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4553F, 0.3575F, -3.9887F, 2.1406F, -0.2682F, -0.9915F));

		PartDefinition cube_r389 = leftSygomaticarch.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(67, 134).addBox(-1.1745F, -0.2021F, -0.7512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4553F, 0.3575F, -3.9887F, 1.4424F, -0.2682F, -0.9915F));

		PartDefinition cube_r390 = leftSygomaticarch.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(82, 12).addBox(-1.5832F, -0.5745F, -0.3905F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.4553F, 0.3575F, -3.9887F, 1.2178F, -0.58F, 0.4799F));

		PartDefinition cube_r391 = leftSygomaticarch.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(117, 39).addBox(-0.3196F, -0.2021F, -0.3905F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.4553F, 0.3575F, -3.9887F, 1.2772F, 0.0431F, 0.2677F));

		PartDefinition cube_r392 = leftSygomaticarch.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(134, 59).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.9329F, -4.8145F, -4.9299F, -0.387F, 0.9323F, -0.3163F));

		PartDefinition cube_r393 = leftSygomaticarch.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(124, 68).addBox(-2.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.1088F, -4.6871F, -4.378F, -1.9643F, 1.3248F, -1.9752F));

		PartDefinition cube_r394 = leftSygomaticarch.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(47, 133).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.9171F, -4.2393F, -2.4382F, -0.6051F, 1.1642F, -0.5659F));

		PartDefinition cube_r395 = leftSygomaticarch.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(134, 113).addBox(-0.985F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.9479F, -7.1648F, -4.1291F, -0.6371F, 0.8542F, -0.509F));

		PartDefinition cube_r396 = leftSygomaticarch.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(126, 119).addBox(-1.985F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.1288F, -6.9406F, -3.6011F, -1.8691F, 1.1497F, -1.8958F));

		PartDefinition cube_r397 = leftSygomaticarch.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(134, 121).addBox(0.015F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.8677F, -6.1659F, -1.7759F, -2.7036F, 0.3996F, -2.9614F));

		PartDefinition cube_r398 = leftSygomaticarch.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(52, 133).addBox(-0.985F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.9479F, -6.2443F, -4.5198F, -2.0842F, 0.9119F, -0.4194F));

		PartDefinition cube_r399 = leftSygomaticarch.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(124, 77).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.1039F, -6.0761F, -3.9865F, 2.8215F, 1.2484F, -1.907F));

		PartDefinition cube_r400 = leftSygomaticarch.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(133, 53).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.8948F, -5.478F, -2.0895F, 1.8965F, 0.3488F, -3.0267F));

		PartDefinition cube_r401 = leftSygomaticarch.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(134, 132).addBox(-0.991F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9479F, -8.0003F, -3.5886F, -0.8378F, 0.7627F, -0.6545F));

		PartDefinition cube_r402 = leftSygomaticarch.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(127, 11).addBox(-1.991F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1288F, -7.6921F, -3.1049F, -1.7598F, 0.992F, -1.7955F));

		PartDefinition cube_r403 = leftSygomaticarch.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(135, 0).addBox(0.009F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.885F, -6.6255F, -1.4307F, -2.527F, 0.3716F, -2.8907F));

		PartDefinition cube_r404 = leftSygomaticarch.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(123, 0).addBox(-1.3669F, -0.1456F, -0.4614F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0479F, -5.1317F, -2.1363F, -0.1833F, 0.0F, -0.4014F));

		PartDefinition cube_r405 = leftSygomaticarch.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(132, 42).addBox(-0.9828F, 0.0052F, -0.4665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.8141F, -3.8013F, -2.4308F, -0.4189F, 0.0F, -0.2793F));

		PartDefinition cube_r406 = leftSygomaticarch.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(86, 85).addBox(-0.8F, -0.2F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-2.2479F, 9.5702F, -6.1805F, 1.5882F, -0.0003F, 0.0175F));

		PartDefinition cube_r407 = leftSygomaticarch.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(85, 57).addBox(-0.8F, -0.2F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-2.1479F, 5.9724F, -6.0548F, 1.5359F, 0.0009F, 0.0262F));

		PartDefinition cube_r408 = leftSygomaticarch.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(82, 97).addBox(-0.8F, -0.2F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.9479F, 1.5841F, -5.755F, 1.484F, 0.0091F, 0.1043F));

		PartDefinition cube_r409 = leftSygomaticarch.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(97, 85).addBox(-0.8F, -0.2F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.1479F, 4.3734F, -5.999F, 1.4527F, 0.7383F, -0.0797F));

		PartDefinition rightSygomaticarch = head.addOrReplaceChild("rightSygomaticarch", CubeListBuilder.create(), PartPose.offset(-2.9479F, 7.5262F, 1.6254F));

		PartDefinition cube_r410 = rightSygomaticarch.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(48, 129).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.3241F, 0.203F, -4.8032F, -2.2238F, -1.4278F, 2.2288F));

		PartDefinition cube_r411 = rightSygomaticarch.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(42, 96).mirror().addBox(0.0F, -3.5F, -1.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.3241F, -0.7906F, -4.69F, -0.2633F, -1.1209F, 0.2382F));

		PartDefinition cube_r412 = rightSygomaticarch.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(125, 43).mirror().addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.9329F, -3.3643F, -5.1952F, -0.2097F, -0.6325F, 0.0821F));

		PartDefinition cube_r413 = rightSygomaticarch.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(124, 85).mirror().addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.8904F, -4.3492F, -5.0273F, 0.069F, -0.9313F, -0.2556F));

		PartDefinition cube_r414 = rightSygomaticarch.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(71, 102).mirror().addBox(0.0F, -2.5F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.9329F, -0.8804F, -5.4782F, -0.1426F, -0.6496F, 0.0866F));

		PartDefinition cube_r415 = rightSygomaticarch.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(133, 26).mirror().addBox(-0.2F, -0.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.9245F, 15.3087F, -5.5479F, 2.2646F, -1.3859F, -2.3605F));

		PartDefinition cube_r416 = rightSygomaticarch.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(133, 23).mirror().addBox(-0.2F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.0236F, 15.0096F, -5.5741F, 2.3519F, -1.3859F, -2.3605F));

		PartDefinition cube_r417 = rightSygomaticarch.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(131, 77).mirror().addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.4479F, 15.0649F, -5.9947F, 0.1841F, -0.7769F, -0.1298F));

		PartDefinition cube_r418 = rightSygomaticarch.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(75, 85).mirror().addBox(-1.0F, -0.2F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(3.2479F, 13.1697F, -6.1176F, 1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r419 = rightSygomaticarch.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(22, 86).mirror().addBox(-1.0F, -0.2F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(3.2479F, 9.5702F, -6.1805F, 1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r420 = rightSygomaticarch.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(131, 50).mirror().addBox(-1.0F, -0.375F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(3.2479F, 14.8953F, -5.6641F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r421 = rightSygomaticarch.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(116, 0).mirror().addBox(-0.175F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(2.2729F, 13.1697F, -6.1176F, 1.623F, 0.0046F, -0.0871F));

		PartDefinition cube_r422 = rightSygomaticarch.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(117, 67).mirror().addBox(-1.0F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(3.2479F, 14.7675F, -6.0339F, 1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r423 = rightSygomaticarch.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(35, 118).mirror().addBox(-0.7F, -0.8F, -0.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.93F, 14.7535F, -5.1388F, -1.343F, -1.4273F, 2.8371F));

		PartDefinition cube_r424 = rightSygomaticarch.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(118, 8).mirror().addBox(-0.2F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.0014F, 14.7756F, -5.6332F, -1.9412F, -1.4208F, -2.8418F));

		PartDefinition cube_r425 = rightSygomaticarch.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(117, 77).mirror().addBox(-0.2F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.4479F, 14.7675F, -6.0339F, 1.6516F, -0.8365F, -0.1268F));

		PartDefinition cube_r426 = rightSygomaticarch.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(53, 88).mirror().addBox(-0.2043F, -0.2207F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.2363F, 9.5699F, -6.1628F, 1.5961F, -0.801F, -0.0388F));

		PartDefinition cube_r427 = rightSygomaticarch.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(88, 63).mirror().addBox(-0.9043F, -0.8207F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.7623F, 13.1586F, -4.8907F, -1.3411F, -1.4201F, 2.8862F));

		PartDefinition cube_r428 = rightSygomaticarch.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(33, 86).mirror().addBox(-0.2043F, -0.8207F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.8053F, 9.5715F, -5.7454F, -1.6907F, -1.423F, -3.0435F));

		PartDefinition cube_r429 = rightSygomaticarch.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(85, 0).mirror().addBox(-0.9F, -0.9F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.6857F, 9.7301F, -4.8788F, -0.9908F, -1.3889F, 2.5306F));

		PartDefinition cube_r430 = rightSygomaticarch.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-0.1F, -0.9F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(1.7154F, 5.9992F, -5.6399F, -1.346F, -1.415F, 2.8909F));

		PartDefinition cube_r431 = rightSygomaticarch.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(53, 82).mirror().addBox(-0.2F, -0.2F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.1479F, 5.9724F, -6.0548F, 1.5208F, -0.8059F, 0.0075F));

		PartDefinition cube_r432 = rightSygomaticarch.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(42, 115).mirror().addBox(-0.2F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.1479F, 5.1729F, -6.0269F, 1.5215F, -0.7848F, 0.0349F));

		PartDefinition cube_r433 = rightSygomaticarch.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(65, 115).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.7236F, 5.1877F, -5.6029F, -1.3723F, -1.3928F, 2.9462F));

		PartDefinition cube_r434 = rightSygomaticarch.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(115, 82).mirror().addBox(0.25F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7236F, 5.1877F, -5.6029F, -0.7225F, -1.3053F, 2.2818F));

		PartDefinition cube_r435 = rightSygomaticarch.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(130, 129).mirror().addBox(-0.0164F, -0.9836F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3166F, 1.7067F, -5.0134F, 1.2294F, -1.326F, 0.2319F));

		PartDefinition cube_r436 = rightSygomaticarch.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(113, 115).mirror().addBox(-0.2F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3931F, 2.7008F, -5.0933F, 0.7401F, -1.2838F, 0.5914F));

		PartDefinition cube_r437 = rightSygomaticarch.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(106, 115).mirror().addBox(-0.2F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.3931F, 2.7008F, -5.0933F, 1.2876F, -0.7258F, -0.0277F));

		PartDefinition cube_r438 = rightSygomaticarch.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(99, 115).mirror().addBox(-0.1664F, -0.1836F, -2.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(130, 126).mirror().addBox(0.0336F, 0.0164F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9358F, 1.581F, -5.7902F, 1.4621F, -0.7258F, -0.0277F));

		PartDefinition cube_r439 = rightSygomaticarch.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(11, 83).mirror().addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7236F, 2.6172F, -5.4195F, -1.1041F, -1.3759F, 2.6825F));

		PartDefinition cube_r440 = rightSygomaticarch.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(15, 131).mirror().addBox(-0.2363F, -0.3311F, 0.6115F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(131, 14).mirror().addBox(-0.2363F, -0.3311F, 0.0115F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3727F, 2.4198F, -3.7819F, -0.8351F, -1.1661F, 2.0863F));

		PartDefinition cube_r441 = rightSygomaticarch.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(131, 31).mirror().addBox(-0.6695F, -0.7044F, 0.4379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(131, 17).mirror().addBox(-0.6695F, -0.7044F, -0.1621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3727F, 2.4198F, -3.7819F, 0.7475F, -0.6304F, 0.0605F));

		PartDefinition cube_r442 = rightSygomaticarch.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(96, 55).mirror().addBox(-0.653F, -1.6619F, -2.5214F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3727F, 2.4198F, -3.7819F, 1.0641F, -0.69F, -0.0614F));

		PartDefinition cube_r443 = rightSygomaticarch.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(91, 97).mirror().addBox(-0.2663F, -0.3311F, -2.5214F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3727F, 2.4198F, -3.7819F, -0.6623F, -1.0762F, 1.8948F));

		PartDefinition cube_r444 = rightSygomaticarch.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(85, 6).mirror().addBox(0.625F, -1.0F, -1.925F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.7236F, 2.6172F, -5.4195F, -0.6788F, -1.2917F, 2.2457F));

		PartDefinition cube_r445 = rightSygomaticarch.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(72, 134).mirror().addBox(0.1745F, -0.6376F, -0.4455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4553F, 0.3575F, -3.9887F, 2.1406F, 0.2682F, 0.9915F));

		PartDefinition cube_r446 = rightSygomaticarch.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(67, 134).mirror().addBox(0.1745F, -0.2021F, -0.7512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4553F, 0.3575F, -3.9887F, 1.4424F, 0.2682F, 0.9915F));

		PartDefinition cube_r447 = rightSygomaticarch.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(82, 12).mirror().addBox(-0.4168F, -0.5745F, -0.3905F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.4553F, 0.3575F, -3.9887F, 1.2178F, 0.58F, -0.4799F));

		PartDefinition cube_r448 = rightSygomaticarch.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(117, 39).mirror().addBox(-0.6804F, -0.2021F, -0.3905F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.4553F, 0.3575F, -3.9887F, 1.2772F, -0.0431F, -0.2677F));

		PartDefinition cube_r449 = rightSygomaticarch.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(134, 59).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.9329F, -4.8145F, -4.9299F, -0.387F, -0.9323F, 0.3163F));

		PartDefinition cube_r450 = rightSygomaticarch.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(124, 68).mirror().addBox(0.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.1088F, -4.6871F, -4.378F, -1.9643F, -1.3248F, 1.9752F));

		PartDefinition cube_r451 = rightSygomaticarch.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(47, 133).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.9171F, -4.2393F, -2.4382F, -0.6051F, -1.1642F, 0.5659F));

		PartDefinition cube_r452 = rightSygomaticarch.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(134, 113).mirror().addBox(-0.015F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.9479F, -7.1648F, -4.1291F, -0.6371F, -0.8542F, 0.509F));

		PartDefinition cube_r453 = rightSygomaticarch.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(126, 119).mirror().addBox(-0.015F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.1288F, -6.9406F, -3.6011F, -1.8691F, -1.1497F, 1.8958F));

		PartDefinition cube_r454 = rightSygomaticarch.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(134, 121).mirror().addBox(-1.015F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.8677F, -6.1659F, -1.7759F, -2.7036F, -0.3996F, 2.9614F));

		PartDefinition cube_r455 = rightSygomaticarch.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(52, 133).mirror().addBox(-0.015F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.9479F, -6.2443F, -4.5198F, -2.0842F, -0.9119F, 0.4194F));

		PartDefinition cube_r456 = rightSygomaticarch.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(124, 77).mirror().addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.1039F, -6.0761F, -3.9865F, 2.8215F, -1.2484F, 1.907F));

		PartDefinition cube_r457 = rightSygomaticarch.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(133, 53).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.8948F, -5.478F, -2.0895F, 1.8965F, -0.3488F, 3.0267F));

		PartDefinition cube_r458 = rightSygomaticarch.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(134, 132).mirror().addBox(-0.009F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9479F, -8.0003F, -3.5886F, -0.8378F, -0.7627F, 0.6545F));

		PartDefinition cube_r459 = rightSygomaticarch.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(127, 11).mirror().addBox(-0.009F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1288F, -7.6921F, -3.1049F, -1.7598F, -0.992F, 1.7955F));

		PartDefinition cube_r460 = rightSygomaticarch.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(135, 0).mirror().addBox(-1.009F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.885F, -6.6255F, -1.4307F, -2.527F, -0.3716F, 2.8907F));

		PartDefinition cube_r461 = rightSygomaticarch.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(123, 0).mirror().addBox(-0.6331F, -0.1456F, -0.4614F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0479F, -5.1317F, -2.1363F, -0.1833F, 0.0F, 0.4014F));

		PartDefinition cube_r462 = rightSygomaticarch.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(132, 42).mirror().addBox(-0.0172F, 0.0052F, -0.4665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.8141F, -3.8013F, -2.4308F, -0.4189F, 0.0F, 0.2793F));

		PartDefinition cube_r463 = rightSygomaticarch.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(86, 85).mirror().addBox(-0.2F, -0.2F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(2.2479F, 9.5702F, -6.1805F, 1.5882F, 0.0003F, -0.0175F));

		PartDefinition cube_r464 = rightSygomaticarch.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(85, 57).mirror().addBox(-0.2F, -0.2F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(2.1479F, 5.9724F, -6.0548F, 1.5359F, -0.0009F, -0.0262F));

		PartDefinition cube_r465 = rightSygomaticarch.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(82, 97).mirror().addBox(-0.2F, -0.2F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.9479F, 1.5841F, -5.755F, 1.484F, -0.0091F, -0.1043F));

		PartDefinition cube_r466 = rightSygomaticarch.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(97, 85).mirror().addBox(-0.2F, -0.2F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.1479F, 4.3734F, -5.999F, 1.4527F, -0.7383F, 0.0797F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 3.7807F, -0.218F));

		PartDefinition cube_r467 = jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(129, 57).mirror().addBox(-0.3F, -0.3446F, -0.2676F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false)
				.texOffs(96, 127).mirror().addBox(-0.3F, 0.1554F, -0.7676F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.2892F, 0.4205F, -0.0567F, 0.0F, -0.0873F));

		PartDefinition cube_r468 = jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(105, 133).mirror().addBox(-0.3F, 0.1814F, -0.1407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(100, 133).mirror().addBox(-0.3F, -0.4186F, -0.1407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.2892F, 0.4205F, 1.4268F, 0.0F, -0.0873F));

		PartDefinition cube_r469 = jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(53, 129).mirror().addBox(-0.3F, -0.8935F, -0.8405F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.2892F, 0.4205F, 0.1178F, 0.0F, -0.0873F));

		PartDefinition cube_r470 = jaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(73, 91).mirror().addBox(-0.3F, -1.1877F, -0.9604F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.2892F, 0.4205F, -1.8282F, 0.0F, -0.0873F));

		PartDefinition cube_r471 = jaw.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(104, 49).mirror().addBox(-0.3F, -0.935F, 2.5827F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(104, 32).mirror().addBox(-0.3F, -1.335F, 2.5827F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.2892F, 0.4205F, -1.8806F, 0.0F, -0.0873F));

		PartDefinition cube_r472 = jaw.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(38, 104).mirror().addBox(-0.3F, -1.2409F, 5.1917F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.2892F, 0.4205F, -1.8631F, 0.0F, -0.0873F));

		PartDefinition cube_r473 = jaw.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(0, 123).mirror().addBox(-0.3F, 1.058F, -0.2524F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.2892F, 0.4205F, -0.3185F, 0.0F, -0.0873F));

		PartDefinition cube_r474 = jaw.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(62, 127).mirror().addBox(-0.3F, 4.635F, -0.6756F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.2892F, 0.4205F, -0.2313F, 0.0F, -0.0873F));

		PartDefinition cube_r475 = jaw.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(10, 135).mirror().addBox(-0.3F, 0.2575F, 7.1747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.2892F, 0.4205F, -1.7235F, 0.0F, -0.0873F));

		PartDefinition cube_r476 = jaw.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(98, 123).mirror().addBox(-0.767F, -0.1734F, -0.3192F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.7344F, 8.2539F, -0.876F, -1.7933F, 0.0F, -0.0436F));

		PartDefinition cube_r477 = jaw.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(123, 96).mirror().addBox(-0.767F, 0.1955F, -0.3823F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(53, 33).mirror().addBox(-0.767F, 0.1955F, 1.2177F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.7344F, 8.2539F, -0.876F, -1.7061F, 0.0F, -0.0436F));

		PartDefinition cube_r478 = jaw.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(53, 25).mirror().addBox(-0.767F, -0.111F, 1.2282F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7344F, 8.2539F, -0.876F, -1.7497F, 0.0F, -0.0436F));

		PartDefinition cube_r479 = jaw.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(104, 15).mirror().addBox(-0.175F, -0.3765F, -0.035F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0344F, 14.9539F, -2.376F, -1.6319F, 0.0F, -0.096F));

		PartDefinition cube_r480 = jaw.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(62, 123).mirror().addBox(-0.2751F, -0.2028F, -0.2506F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6745F, 17.6484F, -2.3684F, -1.458F, 0.0118F, -0.2F));

		PartDefinition cube_r481 = jaw.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(53, 25).addBox(-0.233F, -0.111F, 1.2282F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7344F, 8.2539F, -0.876F, -1.7497F, 0.0F, 0.0436F));

		PartDefinition cube_r482 = jaw.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(104, 49).addBox(-0.7F, -0.935F, 2.5827F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F))
				.texOffs(104, 32).addBox(-0.7F, -1.335F, 2.5827F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9F, 0.2892F, 0.4205F, -1.8806F, 0.0F, 0.0873F));

		PartDefinition cube_r483 = jaw.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(73, 91).addBox(-0.7F, -1.1877F, -0.9604F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.9F, 0.2892F, 0.4205F, -1.8282F, 0.0F, 0.0873F));

		PartDefinition cube_r484 = jaw.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(38, 104).addBox(-0.7F, -1.2409F, 5.1917F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9F, 0.2892F, 0.4205F, -1.8631F, 0.0F, 0.0873F));

		PartDefinition cube_r485 = jaw.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(98, 123).addBox(-0.233F, -0.1734F, -0.3192F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.7344F, 8.2539F, -0.876F, -1.7933F, 0.0F, 0.0436F));

		PartDefinition cube_r486 = jaw.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(105, 133).addBox(-0.7F, 0.1814F, -0.1407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(100, 133).addBox(-0.7F, -0.4186F, -0.1407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.9F, 0.2892F, 0.4205F, 1.4268F, 0.0F, 0.0873F));

		PartDefinition cube_r487 = jaw.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(53, 129).addBox(-0.7F, -0.8935F, -0.8405F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9F, 0.2892F, 0.4205F, 0.1178F, 0.0F, 0.0873F));

		PartDefinition cube_r488 = jaw.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(129, 57).addBox(-0.7F, -0.3446F, -0.2676F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(96, 127).addBox(-0.7F, 0.1554F, -0.7676F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.9F, 0.2892F, 0.4205F, -0.0567F, 0.0F, 0.0873F));

		PartDefinition cube_r489 = jaw.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(0, 123).addBox(-0.7F, 1.058F, -0.2524F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9F, 0.2892F, 0.4205F, -0.3185F, 0.0F, 0.0873F));

		PartDefinition cube_r490 = jaw.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(62, 127).addBox(-0.7F, 4.635F, -0.6756F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.9F, 0.2892F, 0.4205F, -0.2313F, 0.0F, 0.0873F));

		PartDefinition cube_r491 = jaw.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(10, 135).addBox(-0.7F, 0.2575F, 7.1747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.9F, 0.2892F, 0.4205F, -1.7235F, 0.0F, 0.0873F));

		PartDefinition cube_r492 = jaw.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(123, 96).addBox(-0.233F, 0.1955F, -0.3823F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(53, 33).addBox(-0.233F, 0.1955F, 1.2177F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.7344F, 8.2539F, -0.876F, -1.7061F, 0.0F, 0.0436F));

		PartDefinition cube_r493 = jaw.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(104, 15).addBox(-0.825F, -0.3765F, -0.035F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0344F, 14.9539F, -2.376F, -1.6319F, 0.0F, 0.096F));

		PartDefinition cube_r494 = jaw.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(62, 123).addBox(-0.7249F, -0.2028F, -0.2506F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6745F, 17.6484F, -2.3684F, -1.458F, -0.0118F, 0.2F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6566F, 1.5832F, 0.1906F, 0.3489F, -0.1085F, 0.0335F));

		PartDefinition cube_r495 = bone2.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(54, 49).addBox(-0.5F, -1.675F, -2.15F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.961F, 1.1806F, 1.2242F, -0.4492F, 0.2457F, -0.3953F));

		PartDefinition cube_r496 = bone2.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(53, 94).addBox(-0.5F, -2.0F, -2.625F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1063F, -0.2785F, -0.4633F, 1.4794F, 0.2457F, -0.3953F));

		PartDefinition cube_r497 = bone2.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(58, 114).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5827F, 2.4567F, -2.128F, -2.2731F, 0.2457F, -0.3953F));

		PartDefinition cube_r498 = bone2.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(78, 15).addBox(-0.5F, -1.7F, -2.45F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1993F, 2.7966F, -4.0613F, -1.4877F, 0.2457F, -0.3953F));

		PartDefinition cube_r499 = bone2.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(101, 66).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.0597F, 0.5976F, -5.318F, -0.3096F, 0.2457F, -0.3953F));

		PartDefinition cube_r500 = bone2.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(95, 91).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.2072F, -0.727F, -3.8268F, 0.694F, 0.2457F, -0.3953F));

		PartDefinition cube_r501 = bone2.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(31, 99).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.6578F, 0.8272F, 4.3317F, -1.6011F, 0.2457F, -0.3953F));

		PartDefinition cube_r502 = bone2.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(0, 62).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.951F, -0.9021F, 4.3858F, -2.9275F, 0.2457F, -0.3953F));

		PartDefinition cube_r503 = bone2.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(9, 99).addBox(-0.5F, -4.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7825F, -4.0325F, 2.8127F, 2.2124F, 0.2457F, -0.3953F));

		PartDefinition cube_r504 = bone2.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(5, 123).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.9018F, 1.6882F, -6.4118F, 0.5457F, 0.2457F, -0.3953F));

		PartDefinition cube_r505 = bone2.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(117, 59).addBox(-0.5F, -0.5F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.703F, 0.399F, -6.4758F, 1.9573F, 0.3673F, -0.3445F));

		PartDefinition cube_r506 = bone2.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(7, 110).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.7823F, 0.036F, -7.1154F, 1.9419F, 0.2457F, -0.3953F));

		PartDefinition cube_r507 = bone2.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(42, 119).addBox(-1.8F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.745F, -3.6965F, -2.2937F, -3.1122F, 0.6318F, 0.876F));

		PartDefinition cube_r508 = bone2.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(127, 88).addBox(-2.0F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5468F, -2.7155F, -3.4637F, 3.0374F, 0.6249F, 0.6495F));

		PartDefinition cube_r509 = bone2.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(120, 127).addBox(0.1F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.3035F, -0.7034F, -4.1258F, 2.5846F, 0.3167F, -0.2808F));

		PartDefinition cube_r510 = bone2.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(29, 128).addBox(-1.025F, -0.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5565F, 0.6705F, -5.7897F, 2.5095F, 0.0185F, -0.7192F));

		PartDefinition cube_r511 = bone2.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(34, 131).addBox(1.8622F, 1.2255F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.8293F, 1.0474F, -5.5084F, -2.1387F, 0.2868F, 2.3861F));

		PartDefinition cube_r512 = bone2.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(131, 34).addBox(-0.9962F, 1.7255F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.8293F, 1.0474F, -5.5084F, -2.2422F, -0.593F, 2.9825F));

		PartDefinition cube_r513 = bone2.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(80, 134).addBox(-1.9848F, -0.1736F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.8293F, 1.0474F, -5.5084F, 2.7188F, -0.9696F, -1.6483F));

		PartDefinition cube_r514 = bone2.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(67, 131).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.8293F, 1.0474F, -5.5084F, 2.115F, 0.0854F, -0.5253F));

		PartDefinition cube_r515 = bone2.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(94, 113).addBox(-0.5F, -3.7F, 1.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 113).addBox(-0.5F, -3.7F, -0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4401F, -0.9721F, -1.4989F, 2.5528F, 0.2457F, -0.3953F));

		PartDefinition cube_r516 = bone2.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(128, 53).addBox(-1.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.8725F, 0.5438F, -3.3989F, 2.6958F, 0.4646F, 0.0088F));

		PartDefinition cube_r517 = bone2.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(116, 4).addBox(-1.0F, 2.0F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(124, 58).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.8725F, 0.5438F, -3.3989F, 2.5475F, 0.2311F, -0.4176F));

		PartDefinition cube_r518 = bone2.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(49, 117).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3131F, -2.5719F, -1.5655F, 2.0295F, 0.0185F, -0.7192F));

		PartDefinition cube_r519 = bone2.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(20, 135).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5133F, -2.3546F, -1.1622F, 2.5176F, -0.11F, -0.8958F));

		PartDefinition cube_r520 = bone2.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(99, 107).addBox(-0.65F, -5.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.0929F, -4.3766F, -5.1632F, 2.6612F, 0.3908F, -0.6304F));

		PartDefinition cube_r521 = bone2.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(38, 31).addBox(-0.5F, -5.0F, -6.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-3.0929F, -4.3766F, -5.1632F, 2.7273F, 0.2457F, -0.3953F));

		PartDefinition cube_r522 = bone2.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(0, 110).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.0777F, -5.4423F, -3.4708F, -2.6308F, 0.2457F, -0.3953F));

		PartDefinition cube_r523 = bone2.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(0, 97).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.619F, -5.6058F, -1.531F, -1.5836F, 0.2457F, -0.3953F));

		PartDefinition cube_r524 = bone2.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(109, 96).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.9516F, -5.2061F, 0.3115F, -0.3183F, 0.2457F, -0.3953F));

		PartDefinition cube_r525 = bone2.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(30, 56).addBox(-0.5F, 0.0F, -4.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.8435F, -4.7855F, 0.0636F, 1.0343F, 0.2457F, -0.3953F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6566F, 1.5832F, 0.1906F, 0.3489F, 0.1085F, -0.0335F));

		PartDefinition cube_r526 = bone4.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(54, 49).mirror().addBox(-0.5F, -1.675F, -2.15F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-0.961F, 1.1806F, 1.2242F, -0.4492F, -0.2457F, 0.3953F));

		PartDefinition cube_r527 = bone4.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(53, 94).mirror().addBox(-0.5F, -2.0F, -2.625F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.1063F, -0.2785F, -0.4633F, 1.4794F, -0.2457F, 0.3953F));

		PartDefinition cube_r528 = bone4.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(58, 114).mirror().addBox(-0.5F, 0.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5827F, 2.4567F, -2.128F, -2.2731F, -0.2457F, 0.3953F));

		PartDefinition cube_r529 = bone4.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(78, 15).mirror().addBox(-0.5F, -1.7F, -2.45F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1993F, 2.7966F, -4.0613F, -1.4877F, -0.2457F, 0.3953F));

		PartDefinition cube_r530 = bone4.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(101, 66).mirror().addBox(-0.5F, -0.4F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.0597F, 0.5976F, -5.318F, -0.3096F, -0.2457F, 0.3953F));

		PartDefinition cube_r531 = bone4.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(95, 91).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.2072F, -0.727F, -3.8268F, 0.694F, -0.2457F, 0.3953F));

		PartDefinition cube_r532 = bone4.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(31, 99).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.6578F, 0.8272F, 4.3317F, -1.6011F, -0.2457F, 0.3953F));

		PartDefinition cube_r533 = bone4.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.951F, -0.9021F, 4.3858F, -2.9275F, -0.2457F, 0.3953F));

		PartDefinition cube_r534 = bone4.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(9, 99).mirror().addBox(-0.5F, -4.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7825F, -4.0325F, 2.8127F, 2.2124F, -0.2457F, 0.3953F));

		PartDefinition cube_r535 = bone4.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(5, 123).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.9018F, 1.6882F, -6.4118F, 0.5457F, -0.2457F, 0.3953F));

		PartDefinition cube_r536 = bone4.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(117, 59).mirror().addBox(-0.5F, -0.5F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.703F, 0.399F, -6.4758F, 1.9573F, -0.3673F, 0.3445F));

		PartDefinition cube_r537 = bone4.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(7, 110).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.7823F, 0.036F, -7.1154F, 1.9419F, -0.2457F, 0.3953F));

		PartDefinition cube_r538 = bone4.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(42, 119).mirror().addBox(-0.2F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.745F, -3.6965F, -2.2937F, -3.1122F, -0.6318F, -0.876F));

		PartDefinition cube_r539 = bone4.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(127, 88).mirror().addBox(0.0F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5468F, -2.7155F, -3.4637F, 3.0374F, -0.6249F, -0.6495F));

		PartDefinition cube_r540 = bone4.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(120, 127).mirror().addBox(-1.1F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.3035F, -0.7034F, -4.1258F, 2.5846F, -0.3167F, 0.2808F));

		PartDefinition cube_r541 = bone4.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(29, 128).mirror().addBox(0.025F, -0.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.5565F, 0.6705F, -5.7897F, 2.5095F, -0.0185F, 0.7192F));

		PartDefinition cube_r542 = bone4.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(34, 131).mirror().addBox(-2.8622F, 1.2255F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8293F, 1.0474F, -5.5084F, -2.1387F, -0.2868F, -2.3861F));

		PartDefinition cube_r543 = bone4.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(131, 34).mirror().addBox(-0.0038F, 1.7255F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8293F, 1.0474F, -5.5084F, -2.2422F, 0.593F, -2.9825F));

		PartDefinition cube_r544 = bone4.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(80, 134).mirror().addBox(0.9848F, -0.1736F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8293F, 1.0474F, -5.5084F, 2.7188F, 0.9696F, 1.6483F));

		PartDefinition cube_r545 = bone4.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(67, 131).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8293F, 1.0474F, -5.5084F, 2.115F, -0.0854F, 0.5253F));

		PartDefinition cube_r546 = bone4.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(94, 113).mirror().addBox(-0.5F, -3.7F, 1.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(89, 113).mirror().addBox(-0.5F, -3.7F, -0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4401F, -0.9721F, -1.4989F, 2.5528F, -0.2457F, 0.3953F));

		PartDefinition cube_r547 = bone4.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(128, 53).mirror().addBox(0.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8725F, 0.5438F, -3.3989F, 2.6958F, -0.4646F, -0.0088F));

		PartDefinition cube_r548 = bone4.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(116, 4).mirror().addBox(0.0F, 2.0F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(124, 58).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8725F, 0.5438F, -3.3989F, 2.5475F, -0.2311F, 0.4176F));

		PartDefinition cube_r549 = bone4.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(49, 117).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3131F, -2.5719F, -1.5655F, 2.0295F, -0.0185F, 0.7192F));

		PartDefinition cube_r550 = bone4.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(20, 135).mirror().addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5133F, -2.3546F, -1.1622F, 2.5176F, 0.11F, 0.8958F));

		PartDefinition cube_r551 = bone4.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(99, 107).mirror().addBox(-0.35F, -5.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(3.0929F, -4.3766F, -5.1632F, 2.6612F, -0.3908F, 0.6304F));

		PartDefinition cube_r552 = bone4.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(38, 31).mirror().addBox(-0.5F, -5.0F, -6.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(3.0929F, -4.3766F, -5.1632F, 2.7273F, -0.2457F, 0.3953F));

		PartDefinition cube_r553 = bone4.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(0, 110).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(3.0777F, -5.4423F, -3.4708F, -2.6308F, -0.2457F, 0.3953F));

		PartDefinition cube_r554 = bone4.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(0, 97).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(2.619F, -5.6058F, -1.531F, -1.5836F, -0.2457F, 0.3953F));

		PartDefinition cube_r555 = bone4.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(109, 96).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.9516F, -5.2061F, 0.3115F, -0.3183F, -0.2457F, 0.3953F));

		PartDefinition cube_r556 = bone4.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(30, 56).mirror().addBox(-0.5F, 0.0F, -4.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.8435F, -4.7855F, 0.0636F, 1.0343F, -0.2457F, 0.3953F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.2206F, 6.9587F, -2.5575F, -0.3141F, 0.251F, -0.2035F));

		PartDefinition cube_r557 = leftArm.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(103, 22).addBox(-1.0F, -1.2F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 0.5041F, 2.2966F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r558 = leftArm.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(7, 106).addBox(-1.0F, 0.1F, 0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2929F, 1.7649F, -2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r559 = leftArm.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(117, 63).addBox(-2.3333F, -2.0519F, -0.9852F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8333F, 0.8608F, 6.8292F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r560 = leftArm.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(115, 18).addBox(-1.7051F, -1.8003F, -3.468F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8333F, 1.5608F, 4.6292F, -2.2947F, -0.0045F, -0.1745F));

		PartDefinition cube_r561 = leftArm.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(104, 90).addBox(-1.7051F, -2.3227F, -1.9674F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8333F, 1.5608F, 4.6292F, -1.5966F, -0.0045F, -0.1745F));

		PartDefinition cube_r562 = leftArm.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(38, 124).addBox(-0.5F, 0.0F, -1.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3132F, 1.9804F, 3.9687F, -1.6297F, -0.0257F, -0.1727F));

		PartDefinition cube_r563 = leftArm.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(129, 91).addBox(-1.1635F, -1.5227F, -1.2585F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8333F, 1.5608F, 4.6292F, -1.3722F, 0.2569F, 0.0511F));

		PartDefinition cube_r564 = leftArm.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(129, 46).addBox(-0.862F, -1.3171F, -1.2585F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.8333F, 1.5608F, 4.6292F, -1.3223F, 0.6828F, 0.1588F));

		PartDefinition cube_r565 = leftArm.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(114, 102).addBox(-2.3333F, -2.3881F, -1.2585F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.8333F, 1.5608F, 4.6292F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r566 = leftArm.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(127, 109).addBox(-1.8773F, -2.2711F, -1.4774F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8333F, 0.8608F, 6.8292F, -1.1598F, 0.0171F, 0.01F));

		PartDefinition cube_r567 = leftArm.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(52, 123).addBox(-1.923F, -3.399F, -1.8997F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8333F, 1.5608F, 4.6292F, -1.4914F, 0.0186F, 0.0069F));

		PartDefinition cube_r568 = leftArm.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(24, 128).addBox(-0.6F, 0.0F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 1.2134F, 4.0126F, -1.7882F, 0.0193F, 0.0045F));

		PartDefinition cube_r569 = leftArm.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(12, 123).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 1.3006F, 2.0145F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r570 = leftArm.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(87, 102).addBox(-1.0F, -0.625F, -0.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, -0.2929F, 1.7649F, -1.9635F, 0.0F, 0.0F));

		PartDefinition cube_r571 = leftArm.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(73, 97).addBox(-1.0F, -0.4F, -0.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.2929F, 1.7649F, -2.3998F, 0.0F, 0.0F));

		PartDefinition cube_r572 = leftArm.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(23, 108).addBox(-0.4893F, 0.1224F, -2.4862F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5713F, -0.9379F, 8.7896F, 0.4674F, 0.5601F, -0.8067F));

		PartDefinition cube_r573 = leftArm.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(75, 113).addBox(-0.4893F, 0.1013F, -0.9463F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5713F, -0.9379F, 8.7896F, -2.107F, 0.5601F, -0.8067F));

		PartDefinition cube_r574 = leftArm.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(104, 110).addBox(-0.6F, -1.325F, -1.225F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.2109F, -1.3315F, 8.349F, -1.4461F, 0.5662F, -0.8055F));

		PartDefinition cube_r575 = leftArm.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(129, 38).addBox(-0.4893F, -1.0728F, -0.7056F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5713F, -0.9379F, 8.7896F, 1.3837F, 0.5601F, -0.8067F));

		PartDefinition cube_r576 = leftArm.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(112, 72).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5331F, -0.0414F, 10.0593F, 0.3801F, 0.5601F, -0.8067F));

		PartDefinition cube_r577 = leftArm.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(129, 122).addBox(-0.4893F, 0.4316F, -1.9653F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5713F, -0.9379F, 8.7896F, 0.991F, 0.5601F, -0.8067F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3202F, -0.8877F, 10.1423F, 0.385F, 0.0706F, 0.3709F));

		PartDefinition cube_r578 = leftArm2.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(105, 123).addBox(-1.1103F, 3.6333F, -1.3441F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1164F, 6.911F, -1.7596F, 0.1323F, -0.25F, -0.1509F));

		PartDefinition cube_r579 = leftArm2.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(125, 127).addBox(-0.6265F, 0.9779F, -0.1551F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1164F, 6.911F, -1.7596F, -0.2074F, -0.2651F, -0.0164F));

		PartDefinition cube_r580 = leftArm2.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(58, 105).addBox(-0.7496F, 0.9597F, -0.3847F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1164F, 6.911F, -1.7596F, 0.0461F, -0.2614F, -0.1519F));

		PartDefinition cube_r581 = leftArm2.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(69, 126).addBox(-0.6265F, -7.126F, -1.1027F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1164F, 6.911F, -1.7596F, -0.1638F, -0.2651F, -0.0164F));

		PartDefinition cube_r582 = leftArm2.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(125, 6).addBox(-0.6265F, -6.9123F, 0.3146F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1164F, 6.911F, -1.7596F, 0.1853F, -0.2651F, -0.0164F));

		PartDefinition cube_r583 = leftArm2.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(30, 72).addBox(-0.6265F, -4.0812F, -0.3847F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1164F, 6.911F, -1.7596F, 0.0108F, -0.2651F, -0.0164F));

		PartDefinition cube_r584 = leftArm2.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(130, 6).addBox(-0.9998F, 1.5793F, -0.8715F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.0F, -0.2965F, -0.0472F, 0.2016F, 0.0052F, -0.0584F));

		PartDefinition cube_r585 = leftArm2.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(106, 129).addBox(-1.0058F, -0.2373F, -0.3952F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2965F, -0.0472F, -0.0776F, 0.0052F, -0.0584F));

		PartDefinition cube_r586 = leftArm2.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(133, 20).addBox(-1.0058F, -3.7839F, -1.0188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 133).addBox(-1.0058F, -3.7839F, -0.5938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9694F, -0.6922F, -1.4664F, -1.343F, 0.0052F, -0.0584F));

		PartDefinition cube_r587 = leftArm2.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(129, 132).addBox(-1.0058F, -1.3715F, -2.0062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0113F, -0.1713F, 0.7077F, -1.343F, 0.0052F, -0.0584F));

		PartDefinition cube_r588 = leftArm2.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(14, 114).addBox(-1.0058F, -1.9712F, -0.45F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, -0.2965F, -0.0472F, -0.5576F, 0.0052F, -0.0584F));

		PartDefinition cube_r589 = leftArm2.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(124, 63).addBox(-1.0058F, -0.2412F, 0.4795F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -0.2965F, -0.0472F, -0.2085F, 0.0052F, -0.0584F));

		PartDefinition cube_r590 = leftArm2.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(20, 69).addBox(-1.0058F, 2.8002F, -0.0068F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2965F, -0.0472F, -0.034F, 0.0052F, -0.0584F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(32, 43).addBox(-1.0F, 0.0F, -2.2F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2185F, 15.3578F, -1.2133F, 0.1319F, 1.0152F, 0.0303F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(0, 77).addBox(-1.0F, -0.025F, -1.5F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.0551F, 7.9965F, -0.7F, 0.0F, 0.0F, 1.4835F));

		PartDefinition cube_r591 = leftArm4.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(134, 56).addBox(-1.3F, -1.5F, 0.2F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9861F, 2.865F, 1.4F, 0.0F, 0.0F, -0.6545F));

		PartDefinition cube_r592 = leftArm4.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(113, 15).addBox(-2.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 2.975F, -0.6F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r593 = leftArm4.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(111, 93).addBox(-2.0F, -1.0F, -0.4F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 2.975F, -0.6F, 0.0F, -0.1309F, -0.3054F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.2206F, 6.9587F, -2.5575F, -1.0995F, -0.251F, 0.2035F));

		PartDefinition cube_r594 = rightArm.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(103, 27).addBox(-1.0F, -1.2F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 0.5041F, 2.2966F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r595 = rightArm.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(106, 37).addBox(-1.0F, 0.1F, 0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2929F, 1.7649F, -2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r596 = rightArm.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(118, 43).addBox(0.3333F, -2.0519F, -0.9852F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.8333F, 0.8608F, 6.8292F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r597 = rightArm.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(115, 35).addBox(0.7051F, -1.8003F, -3.468F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8333F, 1.5608F, 4.6292F, -2.2947F, 0.0045F, 0.1745F));

		PartDefinition cube_r598 = rightArm.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(105, 54).addBox(0.7051F, -2.3227F, -1.9674F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.8333F, 1.5608F, 4.6292F, -1.5966F, 0.0045F, 0.1745F));

		PartDefinition cube_r599 = rightArm.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(124, 38).addBox(-0.5F, 0.0F, -1.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3132F, 1.9804F, 3.9687F, -1.6297F, 0.0257F, 0.1727F));

		PartDefinition cube_r600 = rightArm.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(101, 129).addBox(0.1635F, -1.5227F, -1.2585F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.8333F, 1.5608F, 4.6292F, -1.3722F, -0.2569F, -0.0511F));

		PartDefinition cube_r601 = rightArm.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(129, 80).addBox(-0.138F, -1.3171F, -1.2585F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.8333F, 1.5608F, 4.6292F, -1.3223F, -0.6828F, -0.1588F));

		PartDefinition cube_r602 = rightArm.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(0, 115).addBox(0.3333F, -2.3881F, -1.2585F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.8333F, 1.5608F, 4.6292F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r603 = rightArm.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(115, 127).addBox(0.8773F, -2.2711F, -1.4774F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.8333F, 0.8608F, 6.8292F, -1.1598F, -0.0171F, -0.01F));

		PartDefinition cube_r604 = rightArm.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(57, 123).addBox(0.923F, -3.399F, -1.8997F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.8333F, 1.5608F, 4.6292F, -1.4914F, -0.0186F, -0.0069F));

		PartDefinition cube_r605 = rightArm.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(128, 27).addBox(-0.4F, 0.0F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 1.2134F, 4.0126F, -1.7882F, -0.0193F, -0.0045F));

		PartDefinition cube_r606 = rightArm.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(45, 123).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 1.3006F, 2.0145F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r607 = rightArm.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(96, 102).addBox(-1.0F, -0.625F, -0.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -0.2929F, 1.7649F, -1.9635F, 0.0F, 0.0F));

		PartDefinition cube_r608 = rightArm.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(22, 98).addBox(-1.0F, -0.4F, -0.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.2929F, 1.7649F, -2.3998F, 0.0F, 0.0F));

		PartDefinition cube_r609 = rightArm.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(68, 109).addBox(-0.5107F, 0.1224F, -2.4862F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5713F, -0.9379F, 8.7896F, 0.4674F, -0.5601F, 0.8067F));

		PartDefinition cube_r610 = rightArm.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(82, 113).addBox(-0.5107F, 0.1013F, -0.9463F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5713F, -0.9379F, 8.7896F, -2.107F, -0.5601F, 0.8067F));

		PartDefinition cube_r611 = rightArm.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(111, 43).addBox(-0.4F, -1.325F, -1.225F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.2109F, -1.3315F, 8.349F, -1.4461F, -0.5662F, 0.8055F));

		PartDefinition cube_r612 = rightArm.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(129, 61).addBox(-0.5107F, -1.0728F, -0.7056F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5713F, -0.9379F, 8.7896F, 1.3837F, -0.5601F, 0.8067F));

		PartDefinition cube_r613 = rightArm.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(35, 113).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5331F, -0.0414F, 10.0593F, 0.3801F, -0.5601F, 0.8067F));

		PartDefinition cube_r614 = rightArm.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(130, 0).addBox(-0.5107F, 0.4316F, -1.9653F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5713F, -0.9379F, 8.7896F, 0.991F, -0.5601F, 0.8067F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3202F, -0.8877F, 10.1423F, 0.4132F, -0.1151F, -0.2017F));

		PartDefinition cube_r615 = rightArm2.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(110, 123).addBox(0.1103F, 3.6333F, -1.3441F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1164F, 6.911F, -1.7596F, 0.1323F, 0.25F, 0.1509F));

		PartDefinition cube_r616 = rightArm2.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(128, 22).addBox(-0.3735F, 0.9779F, -0.1551F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1164F, 6.911F, -1.7596F, -0.2074F, 0.2651F, 0.0164F));

		PartDefinition cube_r617 = rightArm2.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(63, 105).addBox(-0.2504F, 0.9597F, -0.3847F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1164F, 6.911F, -1.7596F, 0.0461F, 0.2614F, 0.1519F));

		PartDefinition cube_r618 = rightArm2.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(91, 126).addBox(-0.3735F, -7.126F, -1.1027F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1164F, 6.911F, -1.7596F, -0.1638F, 0.2651F, 0.0164F));

		PartDefinition cube_r619 = rightArm2.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(79, 126).addBox(-0.3735F, -6.9123F, 0.3146F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1164F, 6.911F, -1.7596F, 0.1853F, 0.2651F, 0.0164F));

		PartDefinition cube_r620 = rightArm2.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(48, 75).addBox(-0.3735F, -4.0812F, -0.3847F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1164F, 6.911F, -1.7596F, 0.0108F, 0.2651F, 0.0164F));

		PartDefinition cube_r621 = rightArm2.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(84, 130).addBox(-0.0002F, 1.5793F, -0.8715F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.0F, -0.2965F, -0.0472F, 0.2016F, -0.0052F, 0.0584F));

		PartDefinition cube_r622 = rightArm2.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(129, 114).addBox(0.0058F, -0.2373F, -0.3952F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.2965F, -0.0472F, -0.0776F, -0.0052F, 0.0584F));

		PartDefinition cube_r623 = rightArm2.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(15, 134).addBox(0.0058F, -3.7839F, -1.0188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(134, 10).addBox(0.0058F, -3.7839F, -0.5938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9694F, -0.6922F, -1.4664F, -1.343F, -0.0052F, 0.0584F));

		PartDefinition cube_r624 = rightArm2.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(133, 118).addBox(0.0058F, -1.3715F, -2.0062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0113F, -0.1713F, 0.7077F, -1.343F, -0.0052F, 0.0584F));

		PartDefinition cube_r625 = rightArm2.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(21, 114).addBox(0.0058F, -1.9712F, -0.45F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, -0.2965F, -0.0472F, -0.5576F, -0.0052F, 0.0584F));

		PartDefinition cube_r626 = rightArm2.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(74, 126).addBox(0.0058F, -0.2412F, 0.4795F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, -0.2965F, -0.0472F, -0.2085F, -0.0052F, 0.0584F));

		PartDefinition cube_r627 = rightArm2.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(25, 72).addBox(0.0058F, 2.8002F, -0.0068F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.2965F, -0.0472F, -0.034F, -0.0052F, 0.0584F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(43, 43).addBox(0.0F, 0.0F, -2.2F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2185F, 15.3578F, -1.2133F, 0.7149F, -0.8061F, -0.7527F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(77, 66).addBox(0.0F, -0.025F, -1.5F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0551F, 7.9965F, -0.7F, 0.0F, 0.0436F, -1.7453F));

		PartDefinition cube_r628 = rightArm4.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(134, 62).addBox(-0.7F, -1.5F, 0.2F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9861F, 2.865F, 1.4F, 0.0F, 0.0F, 0.6545F));

		PartDefinition cube_r629 = rightArm4.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(113, 51).addBox(-2.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 2.975F, -0.6F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r630 = rightArm4.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(113, 48).addBox(-2.0F, -1.0F, -0.4F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 2.975F, -0.6F, 0.0F, 0.1309F, 0.3054F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(11, 89).addBox(-0.5F, -0.9067F, -0.1029F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 4.3614F, 4.4707F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r631 = tail.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(120, 132).addBox(0.0F, -2.45F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8195F, 2.8952F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r632 = tail.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(72, 115).addBox(0.0F, -0.9F, -2.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 15).addBox(0.0F, -0.3F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5187F, 2.2693F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r633 = tail.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(134, 87).addBox(0.0F, -2.6F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9067F, 0.8971F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r634 = tail.addOrReplaceChild("cube_r634", CubeListBuilder.create().texOffs(96, 0).mirror().addBox(-1.6F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4067F, 0.8971F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r635 = tail.addOrReplaceChild("cube_r635", CubeListBuilder.create().texOffs(96, 0).addBox(-0.4F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4067F, 0.8971F, 0.0F, -0.0873F, 0.0F));

		PartDefinition tail8 = tail.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(88, 79).addBox(-0.5F, -1.1F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1933F, 3.8971F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r636 = tail8.addOrReplaceChild("cube_r636", CubeListBuilder.create().texOffs(38, 135).addBox(0.0F, -2.05F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.826F, 3.0009F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r637 = tail8.addOrReplaceChild("cube_r637", CubeListBuilder.create().texOffs(135, 74).addBox(0.0F, 0.0F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 123).addBox(0.0F, -0.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1288F, 0.5003F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r638 = tail8.addOrReplaceChild("cube_r638", CubeListBuilder.create().texOffs(117, 132).addBox(0.0F, -2.15F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0501F, 1.0128F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r639 = tail8.addOrReplaceChild("cube_r639", CubeListBuilder.create().texOffs(96, 4).mirror().addBox(-1.6F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.6F, 1.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r640 = tail8.addOrReplaceChild("cube_r640", CubeListBuilder.create().texOffs(96, 4).addBox(-0.4F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.6F, 1.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition tail2 = tail8.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.122F, 3.9753F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r641 = tail2.addOrReplaceChild("cube_r641", CubeListBuilder.create().texOffs(58, 101).addBox(0.0F, -1.5F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8537F, 3.1077F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r642 = tail2.addOrReplaceChild("cube_r642", CubeListBuilder.create().texOffs(135, 105).addBox(0.0F, 0.2F, 3.375F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(135, 102).addBox(0.0F, -0.1F, 1.475F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(135, 95).addBox(0.0F, -0.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0176F, 0.5132F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r643 = tail2.addOrReplaceChild("cube_r643", CubeListBuilder.create().texOffs(82, 57).addBox(0.0F, -1.575F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 1.0F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r644 = tail2.addOrReplaceChild("cube_r644", CubeListBuilder.create().texOffs(107, 4).mirror().addBox(-0.5F, 0.0F, -1.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.5F, 2.5F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r645 = tail2.addOrReplaceChild("cube_r645", CubeListBuilder.create().texOffs(107, 4).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.5F, 2.5F, 0.0F, -0.0873F, 0.0F));

		PartDefinition tail9 = tail2.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(81, 22).addBox(-0.5F, -0.0014F, 0.0523F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0079F, 4.9003F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r646 = tail9.addOrReplaceChild("cube_r646", CubeListBuilder.create().texOffs(57, 135).addBox(0.0F, -1.1F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 135).addBox(0.0F, -1.2F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0357F, 1.07F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r647 = tail9.addOrReplaceChild("cube_r647", CubeListBuilder.create().texOffs(108, 60).mirror().addBox(-0.4F, 0.0F, -1.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.4986F, 1.5523F, 0.0032F, 0.0403F, -0.0164F));

		PartDefinition cube_r648 = tail9.addOrReplaceChild("cube_r648", CubeListBuilder.create().texOffs(108, 60).addBox(-0.6F, 0.0F, -1.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.4986F, 1.5523F, 0.0032F, -0.0403F, 0.0164F));

		PartDefinition tail3 = tail9.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(82, 51).addBox(-0.5F, -0.0055F, -0.0955F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F))
				.texOffs(108, 64).addBox(-0.1F, 0.4945F, -0.0955F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(108, 64).mirror().addBox(-0.9F, 0.4945F, -0.0955F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0014F, 4.0523F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r649 = tail3.addOrReplaceChild("cube_r649", CubeListBuilder.create().texOffs(44, 86).addBox(0.0F, -0.4F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 63).addBox(0.0F, -0.45F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4746F, 0.4038F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail10 = tail3.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(97, 39).addBox(-0.5F, 0.0018F, 0.0171F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(26, 62).addBox(0.0F, -0.5982F, 0.0171F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 83).addBox(0.0F, -0.5232F, 2.0171F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0073F, 3.8874F));

		PartDefinition tail4 = tail10.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(65, 17).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.4051F, 2.9901F, -0.0611F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(68, 24).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0138F, 4.9732F, -0.1134F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(67, 49).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(26, 65).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.1745F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 140, 140);
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