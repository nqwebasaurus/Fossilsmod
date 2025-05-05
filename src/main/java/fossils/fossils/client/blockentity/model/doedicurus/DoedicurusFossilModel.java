package fossils.fossils.client.blockentity.model.doedicurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DoedicurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
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
	private final ModelPart body;
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
	private final ModelPart thagomizer2;
	private final ModelPart thagomizer18;
	private final ModelPart thagomizer8;
	private final ModelPart thagomizer17;
	private final ModelPart thagomizer9;
	private final ModelPart thagomizer10;
	private final ModelPart thagomizer5;
	private final ModelPart thagomizer19;
	private final ModelPart thagomizer6;
	private final ModelPart thagomizer12;
	private final ModelPart thagomizer7;
	private final ModelPart thagomizer13;
	private final ModelPart thagomizer3;
	private final ModelPart thagomizer16;
	private final ModelPart thagomizer11;
	private final ModelPart thagomizer15;
	private final ModelPart thagomizer4;
	private final ModelPart thagomizer14;

	public DoedicurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
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
		this.body = this.body2.getChild("body");
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
		this.thagomizer2 = this.tail5.getChild("thagomizer2");
		this.thagomizer18 = this.tail5.getChild("thagomizer18");
		this.thagomizer8 = this.tail5.getChild("thagomizer8");
		this.thagomizer17 = this.tail5.getChild("thagomizer17");
		this.thagomizer9 = this.tail5.getChild("thagomizer9");
		this.thagomizer10 = this.tail5.getChild("thagomizer10");
		this.thagomizer5 = this.tail5.getChild("thagomizer5");
		this.thagomizer19 = this.tail5.getChild("thagomizer19");
		this.thagomizer6 = this.tail5.getChild("thagomizer6");
		this.thagomizer12 = this.tail5.getChild("thagomizer12");
		this.thagomizer7 = this.tail5.getChild("thagomizer7");
		this.thagomizer13 = this.tail5.getChild("thagomizer13");
		this.thagomizer3 = this.tail5.getChild("thagomizer3");
		this.thagomizer16 = this.tail5.getChild("thagomizer16");
		this.thagomizer11 = this.tail5.getChild("thagomizer11");
		this.thagomizer15 = this.tail5.getChild("thagomizer15");
		this.thagomizer4 = this.tail5.getChild("thagomizer4");
		this.thagomizer14 = this.tail5.getChild("thagomizer14");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -19.2608F, 7.7124F, 0.3076F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(52, 130).addBox(-0.5F, -2.0478F, -2.8435F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.6328F, -2.1033F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(130, 20).addBox(-0.5F, -1.0855F, -2.902F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -0.5328F, 0.2967F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(116, 134).mirror().addBox(-0.4115F, -4.3947F, -0.3414F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.5565F, 5.3946F, -5.5189F, -0.9709F, -0.1695F, -0.1087F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(40, 131).mirror().addBox(-0.3011F, 2.2012F, -3.7968F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.5565F, 4.7946F, -2.9189F, -1.4434F, -0.2346F, -0.2235F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(33, 150).mirror().addBox(-0.0703F, 0.8318F, -3.5307F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5565F, 4.7946F, -2.9189F, -1.6506F, -0.2189F, -0.2666F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(38, 150).mirror().addBox(-0.0703F, -1.2873F, -3.1909F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.5565F, 4.7946F, -2.9189F, -1.9124F, -0.2189F, -0.2666F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(61, 137).mirror().addBox(-0.4115F, -4.5884F, 1.0383F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-2.5565F, 5.3946F, -5.5189F, -1.5817F, -0.1695F, -0.1087F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(139, 24).mirror().addBox(-0.4115F, -4.5153F, 2.9122F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5565F, 5.3946F, -5.5189F, -1.0581F, -0.1695F, -0.1087F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(60, 121).mirror().addBox(-0.4115F, -5.9662F, 1.6622F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.5565F, 5.3946F, -5.5189F, -0.8836F, -0.1695F, -0.1087F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 128).mirror().addBox(-4.0263F, -9.3347F, -3.1437F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.5565F, 5.3946F, -5.5189F, -1.5586F, 0.3391F, -0.0879F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(150, 41).mirror().addBox(-4.0263F, -9.7905F, -0.3224F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5565F, 5.3946F, -5.5189F, -1.1659F, 0.3391F, -0.0879F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(41, 121).mirror().addBox(-4.0263F, -9.6259F, 0.8148F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.5565F, 5.3946F, -5.5189F, -0.9477F, 0.3391F, -0.0879F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(69, 121).mirror().addBox(-0.4115F, -7.7689F, -2.1748F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5565F, 5.3946F, -5.5189F, -1.4072F, -0.1695F, -0.1087F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(9, 140).mirror().addBox(-0.4115F, -2.5829F, 4.6193F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.5565F, 5.3946F, -5.5189F, -0.4036F, -0.1695F, -0.1087F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(134, 3).mirror().addBox(-0.3737F, -0.7196F, 1.3165F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5565F, 5.3946F, -5.5189F, -0.9889F, -0.1753F, -0.1284F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(68, 139).mirror().addBox(-0.5158F, -2.305F, -0.6245F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5565F, 5.3946F, -5.5189F, -1.4288F, -0.1069F, -0.2185F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(143, 112).mirror().addBox(-0.3011F, 1.671F, -1.9853F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5565F, 4.7946F, -2.9189F, -1.0507F, -0.2346F, -0.2235F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(139, 38).mirror().addBox(-0.4923F, -1.2747F, -0.2862F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4983F, -0.2438F, -5.0385F, -2.0238F, 0.0052F, 0.1309F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(56, 143).mirror().addBox(-0.4923F, -0.7401F, -1.7424F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4983F, -0.2438F, -5.0385F, -1.6311F, 0.0052F, 0.1309F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(123, 48).mirror().addBox(-0.4877F, -1.0767F, -4.0806F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3879F, -1.5668F, -5.2755F, -1.4565F, 0.0052F, 0.4363F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(123, 4).mirror().addBox(-0.4877F, -0.6781F, -3.9918F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.3879F, -1.5668F, -5.2755F, -1.3256F, 0.0052F, 0.4363F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(143, 3).mirror().addBox(-0.4923F, -0.4111F, -1.5435F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4983F, -0.2438F, -5.0385F, -1.5874F, 0.0052F, 0.1309F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(139, 38).addBox(-0.5077F, -1.2747F, -0.2862F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4983F, -0.2438F, -5.0385F, -2.0238F, -0.0052F, -0.1309F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(56, 143).addBox(-0.5077F, -0.7401F, -1.7424F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4983F, -0.2438F, -5.0385F, -1.6311F, -0.0052F, -0.1309F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(123, 48).addBox(-0.5123F, -1.0767F, -4.0806F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3879F, -1.5668F, -5.2755F, -1.4565F, -0.0052F, -0.4363F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(123, 4).addBox(-0.5123F, -0.6781F, -3.9918F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.3879F, -1.5668F, -5.2755F, -1.3256F, -0.0052F, -0.4363F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(143, 3).addBox(-0.5077F, -0.4111F, -1.5435F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4983F, -0.2438F, -5.0385F, -1.5874F, -0.0052F, -0.1309F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(130, 77).addBox(-0.5F, -2.2025F, -0.3514F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.2672F, -0.5033F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 128).addBox(3.0263F, -9.3347F, -3.1437F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.5565F, 5.3946F, -5.5189F, -1.5586F, -0.3391F, 0.0879F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(150, 41).addBox(3.0263F, -9.7905F, -0.3224F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5565F, 5.3946F, -5.5189F, -1.1659F, -0.3391F, 0.0879F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(41, 121).addBox(3.0263F, -9.6259F, 0.8148F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.5565F, 5.3946F, -5.5189F, -0.9477F, -0.3391F, 0.0879F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(33, 150).addBox(-0.9297F, 0.8318F, -3.5307F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5565F, 4.7946F, -2.9189F, -1.6506F, 0.2189F, 0.2666F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(38, 150).addBox(-0.9297F, -1.2873F, -3.1909F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.5565F, 4.7946F, -2.9189F, -1.9124F, 0.2189F, 0.2666F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(116, 134).addBox(-0.5885F, -4.3947F, -0.3414F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.5565F, 5.3946F, -5.5189F, -0.9709F, 0.1695F, 0.1087F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(69, 121).addBox(-0.5885F, -7.7689F, -2.1748F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5565F, 5.3946F, -5.5189F, -1.4072F, 0.1695F, 0.1087F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(60, 121).addBox(-0.5885F, -5.9662F, 1.6622F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.5565F, 5.3946F, -5.5189F, -0.8836F, 0.1695F, 0.1087F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(61, 137).addBox(-0.5885F, -4.5884F, 1.0383F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(2.5565F, 5.3946F, -5.5189F, -1.5817F, 0.1695F, 0.1087F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(121, 34).addBox(-0.5F, -3.3002F, 1.8237F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2672F, -0.5033F, -1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(121, 41).addBox(-0.5F, -2.8159F, -1.5173F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2672F, -0.5033F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(30, 121).addBox(-0.5F, -1.0924F, -7.8164F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0378F, 2.952F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(132, 38).addBox(-0.5F, -3.068F, -9.2672F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.0378F, 2.952F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(139, 24).addBox(-0.5885F, -4.5153F, 2.9122F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5565F, 5.3946F, -5.5189F, -1.0581F, 0.1695F, 0.1087F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(9, 140).addBox(-0.5885F, -2.5829F, 4.6193F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.5565F, 5.3946F, -5.5189F, -0.4036F, 0.1695F, 0.1087F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(134, 3).addBox(-0.6263F, -0.7196F, 1.3165F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5565F, 5.3946F, -5.5189F, -0.9889F, 0.1753F, 0.1284F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(68, 139).addBox(-0.4842F, -2.305F, -0.6245F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5565F, 5.3946F, -5.5189F, -1.4288F, 0.1069F, 0.2185F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(40, 131).addBox(-0.6989F, 2.2012F, -3.7968F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.5565F, 4.7946F, -2.9189F, -1.4434F, 0.2346F, 0.2235F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(143, 112).addBox(-0.6989F, 1.671F, -1.9853F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5565F, 4.7946F, -2.9189F, -1.0507F, 0.2346F, 0.2235F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(89, 127).addBox(-0.5F, -3.6908F, 1.5176F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.2672F, -0.5033F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r49 = hips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(141, 66).addBox(-0.5F, -6.5127F, 1.7044F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.2672F, -0.5033F, -1.9373F, 0.0F, 0.0F));

		PartDefinition cube_r50 = hips.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(69, 129).addBox(-0.5F, -0.7011F, 4.3991F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.2672F, -0.5033F, -0.9338F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9506F, 2.762F, -4.6209F, -0.2797F, -0.6363F, 0.033F));

		PartDefinition cube_r51 = leftLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(149, 96).addBox(-1.5F, -0.7981F, -0.5886F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -1.2645F, -0.0372F, 2.3213F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(137, 144).addBox(-1.0F, -1.95F, -0.625F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.9195F, -1.5203F, -2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(94, 149).addBox(-1.5F, -0.5433F, 0.0001F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -1.2992F, -0.0685F, -2.9147F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(7, 145).addBox(-1.5F, -1.0114F, 0.3231F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.5F, -0.4992F, 0.8316F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(135, 148).addBox(-1.0F, -1.25F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1455F, -0.4609F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(130, 138).addBox(-0.5F, -1.9486F, -1.0595F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 1.9327F, -0.444F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(94, 152).addBox(-0.5F, -0.3F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.2462F, 0.1365F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(130, 148).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.057F, -1.2331F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(111, 152).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8359F, -0.8011F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(145, 7).addBox(-1.0F, -1.9F, -2.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(18, 134).addBox(-1.0F, -2.2F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 7.8431F, -2.9925F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(134, 113).addBox(-1.0F, 0.383F, -0.1786F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6287F, 6.5477F, -0.8129F, 1.6276F, 0.293F, -0.0837F));

		PartDefinition cube_r62 = leftLeg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(139, 116).addBox(-1.0F, 0.383F, -1.8214F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6287F, 6.5477F, -0.8129F, 0.755F, 0.293F, -0.0837F));

		PartDefinition cube_r63 = leftLeg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(134, 53).addBox(-1.0037F, 0.7859F, -1.7261F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0037F, 4.8103F, -1.1325F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(75, 141).addBox(-0.5F, -0.5F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 6.0533F, -1.9364F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(96, 134).addBox(-0.5F, -1.2F, -0.3F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.6496F, -1.8914F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftLeg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(149, 130).addBox(-0.5F, 0.3F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 4.0527F, -0.5418F, 0.3403F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.11F, 8.274F, -3.5275F, 0.9071F, -0.2618F, 0.1583F));

		PartDefinition cube_r67 = leftLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(155, 111).addBox(-1.2756F, -0.8301F, 0.1778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2781F, 2.1552F, -0.4312F, -0.4478F, -0.6868F, 2.2881F));

		PartDefinition cube_r68 = leftLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(123, 145).addBox(-1.7756F, -1.3085F, 0.8686F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2781F, 2.1552F, -0.4312F, -0.6834F, -0.6868F, 2.2881F));

		PartDefinition cube_r69 = leftLeg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(36, 136).addBox(-1.7756F, -1.9703F, -0.3452F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2781F, 2.1552F, -0.4312F, -1.9313F, -0.6868F, 2.2881F));

		PartDefinition cube_r70 = leftLeg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(146, 76).addBox(-1.8366F, 0.0585F, 0.9639F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.2781F, 2.1552F, -0.4312F, -2.8738F, -0.6868F, 2.2881F));

		PartDefinition cube_r71 = leftLeg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(146, 38).addBox(-1.7756F, 1.3339F, -0.4604F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2781F, 2.1552F, -0.4312F, -2.1495F, -0.6868F, 2.2881F));

		PartDefinition cube_r72 = leftLeg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(74, 154).addBox(-1.2756F, -0.2878F, -0.6993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.2781F, 2.1552F, -0.4312F, -2.0622F, -0.6868F, 2.2881F));

		PartDefinition cube_r73 = leftLeg2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(132, 155).addBox(-1.2756F, -1.1434F, -0.7333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2781F, 2.1552F, -0.4312F, -2.2368F, -0.6868F, 2.2881F));

		PartDefinition cube_r74 = leftLeg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(56, 147).addBox(-1.8366F, 1.081F, 0.1998F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 152).addBox(-1.2756F, -0.2913F, -0.8042F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2781F, 2.1552F, -0.4312F, -1.8877F, -0.6868F, 2.2881F));

		PartDefinition cube_r75 = leftLeg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(42, 147).addBox(-1.8366F, 1.7342F, -0.1533F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.2781F, 2.1552F, -0.4312F, -1.7132F, -0.6868F, 2.2881F));

		PartDefinition cube_r76 = leftLeg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(148, 27).addBox(-1.8366F, 0.4943F, 0.9204F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(148, 19).addBox(-1.8366F, 0.4943F, 1.1204F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.2781F, 2.1552F, -0.4312F, -2.804F, -0.6868F, 2.2881F));

		PartDefinition cube_r77 = leftLeg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(28, 146).addBox(-1.8366F, 1.0358F, 1.2271F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2781F, 2.1552F, -0.4312F, -2.4986F, -0.6868F, 2.2881F));

		PartDefinition cube_r78 = leftLeg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(21, 146).addBox(-1.8366F, 1.1627F, 0.5357F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.2781F, 2.1552F, -0.4312F, -0.0987F, -0.6868F, 2.2881F));

		PartDefinition cube_r79 = leftLeg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 147).addBox(-1.8366F, 0.2314F, 1.0085F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.2781F, 2.1552F, -0.4312F, -0.7969F, -0.6868F, 2.2881F));

		PartDefinition cube_r80 = leftLeg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(143, 43).addBox(-1.8366F, -0.1831F, 0.6056F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.2781F, 2.1552F, -0.4312F, -2.2193F, -0.6868F, 2.2881F));

		PartDefinition cube_r81 = leftLeg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(35, 143).addBox(-1.8366F, -1.5048F, 0.5665F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2781F, 2.1552F, -0.4312F, -2.0186F, -0.6868F, 2.2881F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8667F, 3.5895F, -3.0794F, -1.4705F, 0.2443F, -0.0981F));

		PartDefinition cube_r82 = leftLeg3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(135, 86).addBox(-1.5F, -0.5F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.4103F, -0.1519F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftArm7 = leftLeg3.addOrReplaceChild("leftArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0384F, 1.8182F, 0.0204F, 0.1409F, 0.0167F, -0.1624F));

		PartDefinition cube_r83 = leftArm7.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(136, 8).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition leftArm6 = leftArm7.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r84 = leftArm6.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(122, 151).addBox(1.7176F, -1.0101F, -0.5488F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.4618F, -0.8404F, -1.0822F, -0.2308F, -0.1246F));

		PartDefinition cube_r85 = leftArm6.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(150, 112).addBox(0.541F, -1.0859F, -0.5237F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.4618F, -0.8404F, -1.0914F, -0.0385F, -0.0205F));

		PartDefinition cube_r86 = leftArm6.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(82, 151).addBox(-0.7087F, -1.2375F, -0.4976F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.4618F, -0.8404F, -1.0844F, 0.1154F, 0.0619F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9506F, 2.762F, -4.6209F, -0.3233F, 0.6363F, -0.033F));

		PartDefinition cube_r87 = rightLeg.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(115, 149).addBox(-0.5F, -0.7981F, -0.5886F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -1.2645F, -0.0372F, 2.3213F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(144, 137).addBox(-1.0F, -1.95F, -0.625F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.9195F, -1.5203F, -2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(108, 149).addBox(-0.5F, -0.5433F, 0.0001F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -1.2992F, -0.0685F, -2.9147F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(14, 145).addBox(-0.5F, -1.0114F, 0.3231F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.5F, -0.4992F, 0.8316F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(19, 149).addBox(-1.0F, -1.25F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1455F, -0.4609F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(137, 138).addBox(-0.5F, -1.9486F, -1.0595F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 1.9327F, -0.444F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(106, 152).addBox(-0.5F, -0.3F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.2462F, 0.1365F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(14, 149).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.057F, -1.2331F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(116, 152).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8359F, -0.8011F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(145, 11).addBox(-1.0F, -1.9F, -2.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(27, 134).addBox(-1.0F, -2.2F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 7.8431F, -2.9925F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(139, 29).addBox(-1.0F, 0.383F, -0.1786F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6287F, 6.5477F, -0.8129F, 1.6276F, -0.293F, 0.0837F));

		PartDefinition cube_r98 = rightLeg.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(140, 0).addBox(-1.0F, 0.383F, -1.8214F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6287F, 6.5477F, -0.8129F, 0.755F, -0.293F, 0.0837F));

		PartDefinition cube_r99 = rightLeg.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(87, 134).addBox(-0.9963F, 0.7859F, -1.7261F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0037F, 4.8103F, -1.1325F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(141, 81).addBox(-0.5F, -0.5F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 6.0533F, -1.9364F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(134, 106).addBox(-0.5F, -1.2F, -0.3F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.6496F, -1.8914F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(149, 148).addBox(-0.5F, 0.3F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 4.0527F, -0.5418F, 0.3403F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.11F, 8.274F, -3.5275F, 0.9071F, 0.2618F, -0.1583F));

		PartDefinition cube_r103 = rightLeg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(155, 114).addBox(0.2755F, -0.8301F, 0.1778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2781F, 2.1552F, -0.4312F, -0.4478F, 0.6868F, -2.2881F));

		PartDefinition cube_r104 = rightLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(144, 145).addBox(-0.2245F, -1.3085F, 0.8686F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2781F, 2.1552F, -0.4312F, -0.6834F, 0.6868F, -2.2881F));

		PartDefinition cube_r105 = rightLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(45, 136).addBox(-0.2245F, -1.9703F, -0.3452F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.2781F, 2.1552F, -0.4312F, -1.9313F, 0.6868F, -2.2881F));

		PartDefinition cube_r106 = rightLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(77, 146).addBox(-0.1634F, 0.0585F, 0.9639F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.2781F, 2.1552F, -0.4312F, -2.8738F, 0.6868F, -2.2881F));

		PartDefinition cube_r107 = rightLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(70, 146).addBox(-0.2245F, 1.3339F, -0.4604F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2781F, 2.1552F, -0.4312F, -2.1495F, 0.6868F, -2.2881F));

		PartDefinition cube_r108 = rightLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(99, 154).addBox(0.2755F, -0.2878F, -0.6993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.2781F, 2.1552F, -0.4312F, -2.0622F, 0.6868F, -2.2881F));

		PartDefinition cube_r109 = rightLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(155, 153).addBox(0.2755F, -1.1434F, -0.7333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2781F, 2.1552F, -0.4312F, -2.2368F, 0.6868F, -2.2881F));

		PartDefinition cube_r110 = rightLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(147, 102).addBox(-0.1634F, 1.081F, 0.1998F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(152, 7).addBox(0.2755F, -0.2913F, -0.8042F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2781F, 2.1552F, -0.4312F, -1.8877F, 0.6868F, -2.2881F));

		PartDefinition cube_r111 = rightLeg2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(101, 147).addBox(-0.1634F, 1.7342F, -0.1533F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.2781F, 2.1552F, -0.4312F, -1.7132F, 0.6868F, -2.2881F));

		PartDefinition cube_r112 = rightLeg2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(148, 66).addBox(-0.1634F, 0.4943F, 0.9204F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(63, 148).addBox(-0.1634F, 0.4943F, 1.1204F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.2781F, 2.1552F, -0.4312F, -2.804F, 0.6868F, -2.2881F));

		PartDefinition cube_r113 = rightLeg2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(49, 146).addBox(-0.1634F, 1.0358F, 1.2271F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2781F, 2.1552F, -0.4312F, -2.4986F, 0.6868F, -2.2881F));

		PartDefinition cube_r114 = rightLeg2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(146, 24).addBox(-0.1634F, 1.1627F, 0.5357F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.2781F, 2.1552F, -0.4312F, -0.0987F, 0.6868F, -2.2881F));

		PartDefinition cube_r115 = rightLeg2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(35, 147).addBox(-0.1634F, 0.2314F, 1.0085F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(-0.2781F, 2.1552F, -0.4312F, -0.7969F, 0.6868F, -2.2881F));

		PartDefinition cube_r116 = rightLeg2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(143, 51).addBox(-0.1634F, -0.1831F, 0.6056F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-0.2781F, 2.1552F, -0.4312F, -2.2193F, 0.6868F, -2.2881F));

		PartDefinition cube_r117 = rightLeg2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(143, 47).addBox(-0.1634F, -1.5048F, 0.5665F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2781F, 2.1552F, -0.4312F, -2.0186F, 0.6868F, -2.2881F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8667F, 3.5895F, -3.0794F, -1.409F, 0.0549F, -0.1018F));

		PartDefinition cube_r118 = rightLeg3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(9, 136).addBox(-1.5F, -0.5F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.4103F, -0.1519F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightArm7 = rightLeg3.addOrReplaceChild("rightArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0384F, 1.8182F, 0.0204F, 0.1416F, 0.008F, -0.0104F));

		PartDefinition cube_r119 = rightArm7.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(136, 12).addBox(-2.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightArm6 = rightArm7.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r120 = rightArm6.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(151, 139).addBox(-2.7176F, -1.0101F, -0.5488F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4618F, -0.8404F, -1.0822F, 0.2308F, 0.1246F));

		PartDefinition cube_r121 = rightArm6.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(64, 151).addBox(-1.541F, -1.0859F, -0.5237F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4618F, -0.8404F, -1.0914F, 0.0385F, 0.0205F));

		PartDefinition cube_r122 = rightArm6.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(151, 135).addBox(-0.2912F, -1.2375F, -0.4976F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4618F, -0.8404F, -1.0844F, -0.1154F, -0.0619F));

		PartDefinition body4 = hips.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.3337F, -5.209F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r123 = body4.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(25, 139).mirror().addBox(0.0095F, -2.6038F, 2.3438F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6604F, 2.7367F, -12.4618F, 2.951F, 0.2352F, 0.2832F));

		PartDefinition cube_r124 = body4.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(134, 48).mirror().addBox(-0.2397F, -1.2864F, 1.9247F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.6604F, 2.7367F, -12.4618F, -2.5813F, -0.3028F, 0.2662F));

		PartDefinition cube_r125 = body4.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(154, 102).mirror().addBox(-0.2397F, -3.5383F, 2.4374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.6604F, 2.7367F, -12.4618F, 2.9602F, -0.3028F, 0.2662F));

		PartDefinition cube_r126 = body4.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(152, 11).mirror().addBox(-0.2397F, -4.0508F, 0.3598F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-5.6604F, 2.7367F, -12.4618F, 2.3493F, -0.3028F, 0.2662F));

		PartDefinition cube_r127 = body4.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(0, 135).mirror().addBox(-0.2397F, -2.3939F, -0.12F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.6604F, 2.7367F, -12.4618F, 2.9165F, -0.3028F, 0.2662F));

		PartDefinition cube_r128 = body4.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(132, 61).mirror().addBox(-0.2397F, -0.2495F, -2.1538F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.6604F, 2.7367F, -12.4618F, 0.9967F, -0.3028F, 0.2662F));

		PartDefinition cube_r129 = body4.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(124, 120).mirror().addBox(-0.2397F, -2.273F, -0.2958F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-5.6604F, 2.7367F, -12.4618F, 2.5675F, -0.3028F, 0.2662F));

		PartDefinition cube_r130 = body4.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(150, 30).mirror().addBox(-0.2397F, -3.1369F, 1.6379F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.6604F, 2.7367F, -12.4618F, 2.1748F, -0.3028F, 0.2662F));

		PartDefinition cube_r131 = body4.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-0.2397F, -3.8515F, 1.4143F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.6604F, 2.7367F, -12.4618F, 1.8257F, -0.3028F, 0.2662F));

		PartDefinition cube_r132 = body4.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(89, 148).mirror().addBox(-0.2397F, -4.4004F, 1.1517F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.6604F, 2.7367F, -12.4618F, 1.5203F, -0.3028F, 0.2662F));

		PartDefinition cube_r133 = body4.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(18, 139).mirror().addBox(-0.2397F, -4.8909F, 0.3133F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.6604F, 2.7367F, -12.4618F, 1.1276F, -0.3028F, 0.2662F));

		PartDefinition cube_r134 = body4.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(63, 144).mirror().addBox(-0.2397F, -1.0751F, -0.0537F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(119, 20).mirror().addBox(-0.2397F, -4.8225F, -2.4527F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.6604F, 2.7367F, -12.4618F, 0.2113F, -0.3028F, 0.2662F));

		PartDefinition cube_r135 = body4.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(94, 145).mirror().addBox(-0.2397F, -0.1818F, 1.7035F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-5.6604F, 2.7367F, -12.4618F, 0.6912F, -0.3028F, 0.2662F));

		PartDefinition cube_r136 = body4.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(130, 144).mirror().addBox(-0.2397F, -2.3699F, 2.2781F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.6604F, 2.7367F, -12.4618F, -0.0942F, -0.3028F, 0.2662F));

		PartDefinition cube_r137 = body4.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(145, 57).mirror().addBox(-0.2397F, -4.2047F, 1.2196F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6604F, 2.7367F, -12.4618F, -0.5741F, -0.3028F, 0.2662F));

		PartDefinition cube_r138 = body4.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(54, 136).mirror().addBox(-0.2397F, -4.3781F, -1.6938F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.6604F, 2.7367F, -12.4618F, -0.8796F, -0.3028F, 0.2662F));

		PartDefinition cube_r139 = body4.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(123, 134).mirror().addBox(-0.2397F, -4.6948F, -1.8989F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.6604F, 2.7367F, -12.4618F, -0.4869F, -0.3028F, 0.2662F));

		PartDefinition cube_r140 = body4.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(89, 142).mirror().addBox(-0.1F, -1.8F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.6854F, -0.5876F, -0.1332F, -0.0419F, -0.3026F));

		PartDefinition cube_r141 = body4.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(136, 16).mirror().addBox(-0.75F, -0.2F, -1.25F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.6586F, -3.2838F, 0.042F, -0.2037F, -0.7007F, -0.2866F));

		PartDefinition Bodymiddle_r1 = body4.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(150, 35).mirror().addBox(-5.9634F, -6.3807F, -0.1722F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.668F, -4.0218F, 0.0631F, -0.0426F, -1.9101F));

		PartDefinition Bodymiddle_r2 = body4.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(144, 125).mirror().addBox(-6.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.668F, -4.0218F, 0.0367F, -0.0411F, -1.2987F));

		PartDefinition Bodymiddle_r3 = body4.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(144, 86).mirror().addBox(-4.8362F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.668F, -4.0218F, 0.0194F, -0.0293F, -0.8185F));

		PartDefinition Bodymiddle_r4 = body4.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(151, 122).mirror().addBox(-2.0073F, 0.1202F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.668F, -4.0218F, 0.0096F, -0.0109F, -0.3388F));

		PartDefinition cube_r142 = body4.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(132, 61).addBox(-0.7603F, -0.2495F, -2.1538F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.6604F, 2.7367F, -12.4618F, 0.9967F, 0.3028F, -0.2662F));

		PartDefinition cube_r143 = body4.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(63, 144).addBox(-0.7603F, -1.0751F, -0.0537F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(119, 20).addBox(-0.7603F, -4.8225F, -2.4527F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.6604F, 2.7367F, -12.4618F, 0.2113F, 0.3028F, -0.2662F));

		PartDefinition cube_r144 = body4.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(94, 145).addBox(-0.7603F, -0.1818F, 1.7035F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.6604F, 2.7367F, -12.4618F, 0.6912F, 0.3028F, -0.2662F));

		PartDefinition cube_r145 = body4.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(130, 144).addBox(-0.7603F, -2.3699F, 2.2781F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.6604F, 2.7367F, -12.4618F, -0.0942F, 0.3028F, -0.2662F));

		PartDefinition cube_r146 = body4.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(145, 57).addBox(-0.7603F, -4.2047F, 1.2196F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6604F, 2.7367F, -12.4618F, -0.5741F, 0.3028F, -0.2662F));

		PartDefinition cube_r147 = body4.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(54, 136).addBox(-0.7603F, -4.3781F, -1.6938F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.6604F, 2.7367F, -12.4618F, -0.8796F, 0.3028F, -0.2662F));

		PartDefinition cube_r148 = body4.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(123, 134).addBox(-0.7603F, -4.6948F, -1.8989F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.6604F, 2.7367F, -12.4618F, -0.4869F, 0.3028F, -0.2662F));

		PartDefinition cube_r149 = body4.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(134, 48).addBox(-0.7603F, -1.2864F, 1.9247F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.6604F, 2.7367F, -12.4618F, -2.5813F, 0.3028F, -0.2662F));

		PartDefinition cube_r150 = body4.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(154, 102).addBox(-0.7603F, -3.5383F, 2.4374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.6604F, 2.7367F, -12.4618F, 2.9602F, 0.3028F, -0.2662F));

		PartDefinition cube_r151 = body4.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(152, 11).addBox(-0.7603F, -4.0508F, 0.3598F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(5.6604F, 2.7367F, -12.4618F, 2.3493F, 0.3028F, -0.2662F));

		PartDefinition cube_r152 = body4.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(0, 135).addBox(-0.7603F, -2.3939F, -0.12F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.6604F, 2.7367F, -12.4618F, 2.9165F, 0.3028F, -0.2662F));

		PartDefinition cube_r153 = body4.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(25, 139).addBox(-2.0095F, -2.6038F, 2.3438F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6604F, 2.7367F, -12.4618F, 2.951F, -0.2352F, -0.2832F));

		PartDefinition cube_r154 = body4.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(124, 120).addBox(-0.7603F, -2.273F, -0.2958F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.6604F, 2.7367F, -12.4618F, 2.5675F, 0.3028F, -0.2662F));

		PartDefinition cube_r155 = body4.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(150, 30).addBox(-0.7603F, -3.1369F, 1.6379F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.6604F, 2.7367F, -12.4618F, 2.1748F, 0.3028F, -0.2662F));

		PartDefinition cube_r156 = body4.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(0, 150).addBox(-0.7603F, -3.8515F, 1.4143F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.6604F, 2.7367F, -12.4618F, 1.8257F, 0.3028F, -0.2662F));

		PartDefinition cube_r157 = body4.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(89, 148).addBox(-0.7603F, -4.4004F, 1.1517F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.6604F, 2.7367F, -12.4618F, 1.5203F, 0.3028F, -0.2662F));

		PartDefinition cube_r158 = body4.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(18, 139).addBox(-0.7603F, -4.8909F, 0.3133F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.6604F, 2.7367F, -12.4618F, 1.1276F, 0.3028F, -0.2662F));

		PartDefinition cube_r159 = body4.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(123, 107).addBox(-0.5F, -0.0245F, -4.0004F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.7243F, -13.1349F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r160 = body4.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(102, 143).addBox(-0.5F, -1.6509F, -8.7528F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -4.0243F, -4.5349F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r161 = body4.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(132, 33).addBox(-0.5F, -0.7F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -1.622F, -8.4704F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r162 = body4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(11, 125).addBox(-0.5F, -0.1724F, -6.9512F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -4.0243F, -4.5349F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r163 = body4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(89, 121).addBox(-0.2F, -0.5F, -3.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.6016F, -3.1028F, -18.3412F, 1.3431F, 0.2423F, 0.1464F));

		PartDefinition cube_r164 = body4.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(128, 116).addBox(-1.1F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.0F, -2.2619F, -19.225F, 1.2402F, 0.0147F, -0.6136F));

		PartDefinition cube_r165 = body4.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(133, 125).addBox(-0.3F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-10.249F, 3.1522F, -3.4161F, -0.2491F, -0.1186F, -1.5726F));

		PartDefinition cube_r166 = body4.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(115, 73).addBox(-0.1F, 0.0F, 0.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-11.008F, -0.2415F, -3.1551F, -0.4954F, -0.136F, -1.1683F));

		PartDefinition cube_r167 = body4.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(77, 137).addBox(-2.0F, 0.0F, -1.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.6692F, -5.6818F, -0.5331F, -0.5373F, -0.4022F, -1.0123F));

		PartDefinition cube_r168 = body4.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(0, 119).addBox(-3.5F, -0.5F, -0.6F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-9.1095F, -3.5202F, -2.8696F, -0.0336F, -0.1242F, -1.1753F));

		PartDefinition cube_r169 = body4.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(81, 45).addBox(-7.0F, 0.0F, -4.0F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-6.6201F, -3.4005F, 2.7081F, -0.5205F, -0.3269F, -1.0595F));

		PartDefinition cube_r170 = body4.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(15, 112).addBox(-2.3048F, -0.2192F, -0.4484F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-6.6201F, -2.8005F, 2.7081F, -0.5776F, -0.6115F, -0.9346F));

		PartDefinition cube_r171 = body4.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(100, 63).addBox(-6.5044F, -0.2192F, -0.2576F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-6.6201F, -2.8005F, 2.7081F, -0.5205F, -0.3269F, -1.0595F));

		PartDefinition cube_r172 = body4.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(92, 79).addBox(-4.9044F, -0.2192F, 0.1424F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-6.291F, 0.2715F, 5.1523F, -0.6776F, -0.3269F, -1.0595F));

		PartDefinition cube_r173 = body4.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(60, 8).addBox(-0.1F, 0.125F, 0.0F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-9.4114F, 11.1201F, 0.7471F, -0.4838F, -0.1308F, -1.5706F));

		PartDefinition cube_r174 = body4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(23, 81).addBox(-5.7F, 0.125F, 0.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-8.728F, 4.3872F, 3.6501F, -0.5005F, -0.4979F, -1.465F));

		PartDefinition cube_r175 = body4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(84, 93).addBox(-5.7F, 0.125F, -0.2F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-9.9144F, 2.5594F, 0.537F, -0.3696F, -0.4979F, -1.465F));

		PartDefinition cube_r176 = body4.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(94, 117).addBox(-5.7F, 0.125F, 3.1F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-11.0127F, -0.2398F, -3.4578F, -0.2973F, -0.5816F, -1.436F));

		PartDefinition cube_r177 = body4.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(62, 113).addBox(-0.1F, 0.125F, 0.1F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-10.3549F, 10.7348F, -2.1806F, -0.3093F, -0.1308F, -1.5706F));

		PartDefinition cube_r178 = body4.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(51, 104).addBox(-3.3F, -0.5F, -1.5F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-10.0018F, 3.5643F, -2.4893F, -0.2581F, -0.2876F, -1.5279F));

		PartDefinition cube_r179 = body4.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(113, 78).addBox(-0.1F, 0.125F, 0.1F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-11.0153F, 10.3529F, -5.082F, -0.222F, -0.1308F, -1.5706F));

		PartDefinition cube_r180 = body4.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(77, 63).addBox(-0.1F, 0.125F, 0.4F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-11.039F, 8.7229F, -11.1674F, -0.0039F, -0.2617F, -1.5701F));

		PartDefinition cube_r181 = body4.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(54, 31).addBox(-6.7F, 0.125F, -2.5F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.0257F, -0.5359F, -6.8448F, -0.0038F, -0.0872F, -1.5708F));

		PartDefinition cube_r182 = body4.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(54, 39).addBox(-3.5F, 0.7F, -2.5F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-10.2182F, -4.3001F, -6.5155F, -0.0335F, -0.0806F, -1.1767F));

		PartDefinition cube_r183 = body4.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(87, 0).addBox(-7.0F, 0.0843F, -3.9946F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-8.4497F, -7.238F, -8.4932F, 0.2613F, -0.07F, -1.1912F));

		PartDefinition cube_r184 = body4.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(84, 87).addBox(-7.0F, 0.0843F, -3.9946F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-11.0371F, -0.7521F, -8.9828F, 0.3324F, -0.1113F, -1.5851F));

		PartDefinition cube_r185 = body4.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(87, 108).addBox(-3.325F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-9.7488F, 5.2036F, -11.3554F, 0.3438F, -0.276F, -1.644F));

		PartDefinition cube_r186 = body4.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(104, 54).addBox(-2.5F, -0.5F, -1.7F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-7.2747F, 4.2942F, -15.4588F, 0.6862F, -0.3449F, -1.7758F));

		PartDefinition cube_r187 = body4.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(107, 86).addBox(-0.45F, 0.1F, -1.7F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.3299F, 3.5027F, -19.3455F, 0.9546F, -0.4851F, -2.0233F));

		PartDefinition cube_r188 = body4.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(72, 99).addBox(0.4F, 0.1F, -1.7F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-4.3299F, 3.5027F, -19.3455F, 0.8299F, -0.2081F, -1.6631F));

		PartDefinition cube_r189 = body4.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(0, 64).addBox(-6.0F, 0.3F, -6.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-9.8999F, -0.6554F, -12.8397F, 0.6408F, 0.0713F, -1.4526F));

		PartDefinition cube_r190 = body4.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(25, 65).addBox(-5.8F, 0.0093F, -6.9946F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-8.3601F, -6.1569F, -11.4284F, 0.6861F, -0.1127F, -1.1861F));

		PartDefinition cube_r191 = body4.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(100, 21).addBox(-2.5F, 0.1F, -4.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.2354F, -4.8717F, -17.1603F, 1.0208F, 0.6805F, -0.3513F));

		PartDefinition cube_r192 = body4.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(34, 97).addBox(-1.5F, -0.5F, -3.6F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.953F, -5.646F, -13.9198F, 0.684F, -0.0628F, -1.0389F));

		PartDefinition cube_r193 = body4.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(51, 109).addBox(-7.0F, 0.0093F, -1.9946F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-3.5F, -10.5211F, -13.9449F, 0.7067F, 0.2404F, -0.7873F));

		PartDefinition cube_r194 = body4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(119, 61).addBox(-2.0F, 0.0093F, -4.9946F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-3.1678F, -9.9346F, -14.6835F, 0.7836F, 0.4658F, -0.567F));

		PartDefinition cube_r195 = body4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(54, 47).addBox(-7.0F, 0.0093F, -4.3946F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-3.5F, -12.1898F, -3.9234F, -0.059F, -0.0643F, -0.8271F));

		PartDefinition cube_r196 = body4.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(110, 0).addBox(-7.0F, 0.0093F, -1.9945F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -12.5732F, -8.3067F, 0.2446F, -0.0519F, -0.8469F));

		PartDefinition cube_r197 = body4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(0, 88).addBox(-7.0F, 0.0093F, -5.9946F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-3.5F, -12.5732F, -8.3067F, 0.2519F, 0.2443F, -0.7718F));

		PartDefinition cube_r198 = body4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(119, 14).addBox(-7.2F, 0.0093F, 0.9054F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-3.5F, -12.0503F, -2.3295F, -0.3964F, -0.2001F, -0.7628F));

		PartDefinition cube_r199 = body4.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(119, 17).addBox(-3.2F, -0.5F, -0.1F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-5.7716F, -8.9594F, -2.8205F, -0.3893F, -0.0791F, -0.8134F));

		PartDefinition cube_r200 = body4.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(46, 79).addBox(-7.0F, 0.0093F, 0.0054F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -11.0503F, -0.5975F, -0.5938F, -0.2393F, -0.7768F));

		PartDefinition cube_r201 = body4.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(17, 104).addBox(-1.9F, 0.0093F, -6.3946F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-3.4419F, -6.3998F, 3.7361F, -0.6655F, -0.4941F, -0.5792F));

		PartDefinition cube_r202 = body4.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(69, 79).addBox(-5.0F, 0.0093F, 0.0055F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-3.3727F, -6.4679F, 3.7598F, -0.5593F, -0.5692F, -0.7034F));

		PartDefinition cube_r203 = body4.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(0, 80).addBox(-5.0F, 0.0093F, 0.0054F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-3.404F, -2.267F, 8.0436F, -0.6904F, -0.7269F, -0.6838F));

		PartDefinition cube_r204 = body4.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(27, 56).addBox(-4.9F, 0.125F, 0.0F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(9.4114F, 11.1201F, 0.7471F, -0.4838F, 0.1308F, 1.5706F));

		PartDefinition cube_r205 = body4.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(104, 112).addBox(-4.9F, 0.125F, 0.1F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(10.3549F, 10.7348F, -2.1806F, -0.3093F, 0.1308F, 1.5706F));

		PartDefinition cube_r206 = body4.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(30, 112).addBox(-4.9F, 0.125F, 0.1F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(11.0153F, 10.3529F, -5.082F, -0.222F, 0.1308F, 1.5706F));

		PartDefinition cube_r207 = body4.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(50, 71).addBox(-4.9F, 0.125F, 0.4F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(11.039F, 8.7229F, -11.1674F, -0.0039F, 0.2617F, 1.5701F));

		PartDefinition cube_r208 = body4.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(104, 49).addBox(-2.7F, -0.5F, -1.5F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(10.0018F, 3.5643F, -2.4893F, -0.2581F, 0.2876F, 1.5279F));

		PartDefinition cube_r209 = body4.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(132, 45).addBox(-3.7F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(10.249F, 3.1522F, -3.4161F, -0.2491F, 0.1186F, 1.5726F));

		PartDefinition cube_r210 = body4.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(35, 8).addBox(-0.3F, 0.125F, 0.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(8.728F, 4.3872F, 3.6501F, -0.5005F, 0.4979F, 1.465F));

		PartDefinition cube_r211 = body4.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(60, 17).addBox(-0.3F, 0.125F, -0.2F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(9.9144F, 2.5594F, 0.537F, -0.3696F, 0.4979F, 1.465F));

		PartDefinition cube_r212 = body4.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(30, 117).addBox(-0.3F, 0.125F, 3.1F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(11.0127F, -0.2398F, -3.4578F, -0.2973F, 0.5816F, 1.436F));

		PartDefinition cube_r213 = body4.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(27, 40).addBox(-0.3F, 0.125F, -2.5F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.0257F, -0.5359F, -6.8448F, -0.0038F, 0.0872F, 1.5708F));

		PartDefinition cube_r214 = body4.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(62, 118).addBox(-3.5F, -0.5F, -0.6F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(9.1095F, -3.5202F, -2.8696F, -0.0336F, 0.1242F, 1.1753F));

		PartDefinition cube_r215 = body4.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(103, 136).addBox(0.0F, 0.0F, -1.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.6692F, -5.6818F, -0.5331F, -0.5373F, 0.4022F, 1.0123F));

		PartDefinition cube_r216 = body4.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(115, 69).addBox(-5.9F, 0.0F, 0.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(11.008F, -0.2415F, -3.1551F, -0.4954F, 0.136F, 1.1683F));

		PartDefinition cube_r217 = body4.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(0, 111).addBox(0.3048F, -0.2192F, -0.4484F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.6201F, -2.8005F, 2.7081F, -0.5776F, 0.6115F, 0.9346F));

		PartDefinition cube_r218 = body4.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(23, 88).addBox(-0.0956F, -0.2192F, 0.1424F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.291F, 0.2715F, 5.1523F, -0.6776F, 0.3269F, 1.0595F));

		PartDefinition cube_r219 = body4.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(100, 28).addBox(1.5044F, -0.2192F, -0.2576F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.6201F, -2.8005F, 2.7081F, -0.5205F, 0.3269F, 1.0595F));

		PartDefinition cube_r220 = body4.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(81, 39).addBox(0.0F, 0.0F, -4.0F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(6.6201F, -3.4005F, 2.7081F, -0.5205F, 0.3269F, 1.0595F));

		PartDefinition cube_r221 = body4.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(0, 40).addBox(-3.5F, 0.7F, -2.5F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(10.2182F, -4.3001F, -6.5155F, -0.0335F, 0.0806F, 1.1767F));

		PartDefinition cube_r222 = body4.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(111, 117).addBox(-3.8F, -0.5F, -0.1F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.7716F, -8.9594F, -2.8205F, -0.3893F, 0.0791F, 0.8134F));

		PartDefinition cube_r223 = body4.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(113, 83).addBox(0.2F, 0.0093F, 0.9054F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.5F, -12.0503F, -2.3295F, -0.3964F, 0.2001F, 0.7628F));

		PartDefinition cube_r224 = body4.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(35, 0).addBox(0.0F, 0.0093F, -4.3946F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5F, -12.1898F, -3.9234F, -0.059F, 0.0643F, 0.8271F));

		PartDefinition cube_r225 = body4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(108, 99).addBox(0.0F, 0.0093F, -1.9945F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -12.5732F, -8.3067F, 0.2446F, 0.0519F, 0.8469F));

		PartDefinition cube_r226 = body4.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(105, 93).addBox(-0.675F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(9.7488F, 5.2036F, -11.3554F, 0.3438F, 0.276F, 1.644F));

		PartDefinition cube_r227 = body4.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(85, 8).addBox(0.0F, 0.0843F, -3.9946F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(11.0371F, -0.7521F, -8.9828F, 0.3324F, 0.1113F, 1.5851F));

		PartDefinition cube_r228 = body4.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(81, 57).addBox(0.0F, 0.0843F, -3.9946F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(8.4497F, -7.238F, -8.4932F, 0.2613F, 0.07F, 1.1912F));

		PartDefinition cube_r229 = body4.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(81, 51).addBox(0.0F, 0.0093F, -5.9946F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5F, -12.5732F, -8.3067F, 0.2519F, -0.2443F, 0.7718F));

		PartDefinition cube_r230 = body4.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(104, 42).addBox(-0.5F, -0.5F, -1.7F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(7.2747F, 4.2942F, -15.4588F, 0.6862F, 0.3449F, 1.7758F));

		PartDefinition cube_r231 = body4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(70, 106).addBox(-2.55F, 0.1F, -1.7F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.3299F, 3.5027F, -19.3455F, 0.9546F, 0.4851F, 2.0233F));

		PartDefinition cube_r232 = body4.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(53, 97).addBox(-4.4F, 0.1F, -1.7F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.3299F, 3.5027F, -19.3455F, 0.8299F, 0.2081F, 1.6631F));

		PartDefinition cube_r233 = body4.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(52, 63).addBox(0.0F, 0.3F, -6.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(9.8999F, -0.6554F, -12.8397F, 0.6408F, -0.0713F, 1.4526F));

		PartDefinition cube_r234 = body4.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(62, 0).addBox(-0.2F, 0.0093F, -6.9946F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(8.3601F, -6.1569F, -11.4284F, 0.6861F, 0.1127F, 1.1861F));

		PartDefinition cube_r235 = body4.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(100, 14).addBox(-1.5F, 0.1F, -4.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.2354F, -4.8717F, -17.1603F, 1.0208F, -0.6805F, 0.3513F));

		PartDefinition cube_r236 = body4.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(96, 71).addBox(-2.5F, -0.5F, -3.6F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.953F, -5.646F, -13.9198F, 0.684F, 0.0628F, 1.0389F));

		PartDefinition cube_r237 = body4.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(119, 28).addBox(0.0F, 0.0093F, -4.9946F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.1678F, -9.9346F, -14.6835F, 0.7836F, -0.4658F, 0.567F));

		PartDefinition cube_r238 = body4.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(108, 103).addBox(0.0F, 0.0093F, -1.9946F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.5F, -10.5211F, -13.9449F, 0.7067F, -0.2404F, 0.7873F));

		PartDefinition cube_r239 = body4.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(78, 121).addBox(-0.8F, -0.5F, -3.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.6016F, -3.1028F, -18.3412F, 1.3431F, -0.2423F, -0.1464F));

		PartDefinition cube_r240 = body4.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(127, 102).addBox(-1.9F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.0F, -2.2619F, -19.225F, 1.2402F, -0.0147F, 0.6136F));

		PartDefinition cube_r241 = body4.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(34, 155).addBox(-0.5F, 0.0093F, -3.9946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(33, 23).addBox(-3.5F, 0.0093F, -2.9946F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -6.0975F, -17.9984F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r242 = body4.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(54, 55).addBox(-3.5F, 0.0093F, -5.9946F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -10.5211F, -13.9449F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r243 = body4.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(0, 48).addBox(-3.5F, 0.0093F, -5.9946F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -12.5732F, -8.3067F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r244 = body4.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(0, 56).addBox(-3.5F, 0.0093F, -0.0946F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.5731F, 7.8797F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r245 = body4.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(54, 23).addBox(-3.5F, 0.0093F, -0.0945F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -6.6266F, 3.456F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r246 = body4.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(0, 103).addBox(-0.1F, 0.0093F, -6.3946F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.4419F, -6.3998F, 3.7361F, -0.6655F, 0.4941F, 0.5792F));

		PartDefinition cube_r247 = body4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(73, 71).addBox(0.0F, 0.0093F, 0.0054F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.404F, -2.267F, 8.0436F, -0.6904F, 0.7269F, 0.6838F));

		PartDefinition cube_r248 = body4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(23, 73).addBox(0.0F, 0.0093F, 0.0055F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.3727F, -6.4679F, 3.7598F, -0.5593F, 0.5692F, 0.7034F));

		PartDefinition cube_r249 = body4.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(0, 72).addBox(2.0F, 0.0093F, 0.0054F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -11.0503F, -0.5975F, -0.5938F, 0.2393F, 0.7768F));

		PartDefinition cube_r250 = body4.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(27, 48).addBox(-3.5F, 0.0093F, 0.0054F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -11.0503F, -0.5975F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r251 = body4.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(104, 108).addBox(-3.5F, 0.0093F, 0.0055F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -12.0503F, -2.3295F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r252 = body4.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(33, 15).addBox(-3.5F, -1.5907F, -4.3946F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -10.5958F, -4.0629F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r253 = body4.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(22, 128).addBox(-0.5F, -0.0053F, -2.9712F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -4.0243F, -4.5349F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r254 = body4.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(98, 127).addBox(-0.5F, -0.1428F, -4.9324F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -4.4243F, 0.3651F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r255 = body4.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(132, 26).addBox(-0.5F, 0.0235F, -1.9959F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -4.4243F, 0.3651F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r256 = body4.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(136, 16).addBox(-1.25F, -0.2F, -1.25F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.6586F, -3.2838F, 0.042F, -0.2037F, 0.7007F, 0.2866F));

		PartDefinition cube_r257 = body4.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(89, 142).addBox(-0.9F, -1.8F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0F, -1.6854F, -0.5876F, -0.1332F, 0.0419F, 0.3026F));

		PartDefinition cube_r258 = body4.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(61, 130).addBox(-0.5F, -4.37F, 4.3731F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, -1.6243F, -5.3348F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r259 = body4.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(81, 17).addBox(-0.5F, -1.07F, -0.927F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -1.6243F, -5.3348F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r5 = body4.addOrReplaceChild("Bodymiddle_r5", CubeListBuilder.create().texOffs(151, 122).addBox(0.0073F, 0.1202F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.668F, -4.0218F, 0.0096F, 0.0109F, 0.3388F));

		PartDefinition Bodymiddle_r6 = body4.addOrReplaceChild("Bodymiddle_r6", CubeListBuilder.create().texOffs(144, 86).addBox(1.8363F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.668F, -4.0218F, 0.0194F, 0.0293F, 0.8185F));

		PartDefinition Bodymiddle_r7 = body4.addOrReplaceChild("Bodymiddle_r7", CubeListBuilder.create().texOffs(144, 125).addBox(3.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.668F, -4.0218F, 0.0367F, 0.0411F, 1.2987F));

		PartDefinition Bodymiddle_r8 = body4.addOrReplaceChild("Bodymiddle_r8", CubeListBuilder.create().texOffs(150, 35).addBox(3.9634F, -6.3807F, -0.1722F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.668F, -4.0218F, 0.0631F, 0.0426F, 1.9101F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9233F, -1.33F, -5.2721F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r9 = body3.addOrReplaceChild("Bodymiddle_r9", CubeListBuilder.create().texOffs(109, 69).mirror().addBox(0.1F, 0.2F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.7264F, 7.7755F, -0.3978F, -1.9042F, -1.2589F, -0.4179F));

		PartDefinition Bodymiddle_r10 = body3.addOrReplaceChild("Bodymiddle_r10", CubeListBuilder.create().texOffs(151, 93).mirror().addBox(-0.5F, 0.2F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6943F, 7.9686F, -1.784F, -0.5843F, -1.4305F, -1.7352F));

		PartDefinition Bodymiddle_r11 = body3.addOrReplaceChild("Bodymiddle_r11", CubeListBuilder.create().texOffs(110, 4).mirror().addBox(-6.9634F, -6.3807F, -0.1722F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4233F, -0.838F, -0.7496F, 0.0578F, 0.0007F, -1.8227F));

		PartDefinition Bodymiddle_r12 = body3.addOrReplaceChild("Bodymiddle_r12", CubeListBuilder.create().texOffs(100, 69).mirror().addBox(-6.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4233F, -0.838F, -0.7496F, 0.0572F, -0.0026F, -1.2118F));

		PartDefinition Bodymiddle_r13 = body3.addOrReplaceChild("Bodymiddle_r13", CubeListBuilder.create().texOffs(133, 97).mirror().addBox(-2.0073F, 0.1202F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4233F, -0.838F, -0.7496F, 0.0529F, -0.0056F, -0.2519F));

		PartDefinition Bodymiddle_r14 = body3.addOrReplaceChild("Bodymiddle_r14", CubeListBuilder.create().texOffs(98, 6).mirror().addBox(-4.8362F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4233F, -0.838F, -0.7496F, 0.0554F, -0.0046F, -0.7319F));

		PartDefinition Bodymiddle_r15 = body3.addOrReplaceChild("Bodymiddle_r15", CubeListBuilder.create().texOffs(34, 95).mirror().addBox(-7.9634F, -6.3807F, -0.1722F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4233F, -0.938F, -2.7496F, 0.0504F, 0.0614F, -1.7444F));

		PartDefinition Bodymiddle_r16 = body3.addOrReplaceChild("Bodymiddle_r16", CubeListBuilder.create().texOffs(142, 94).mirror().addBox(-4.8362F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4233F, -0.938F, -2.7496F, 0.1058F, 0.0299F, -0.6527F));

		PartDefinition Bodymiddle_r17 = body3.addOrReplaceChild("Bodymiddle_r17", CubeListBuilder.create().texOffs(141, 110).mirror().addBox(-6.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4233F, -0.938F, -2.7496F, 0.086F, 0.0513F, -1.1326F));

		PartDefinition Bodymiddle_r18 = body3.addOrReplaceChild("Bodymiddle_r18", CubeListBuilder.create().texOffs(148, 22).mirror().addBox(-2.0073F, 0.1203F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4233F, -0.938F, -2.7496F, 0.1136F, 0.0018F, -0.1735F));

		PartDefinition Bodymiddle_r19 = body3.addOrReplaceChild("Bodymiddle_r19", CubeListBuilder.create().texOffs(98, 6).addBox(1.8363F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4233F, -0.838F, -0.7496F, 0.0554F, 0.0046F, 0.7319F));

		PartDefinition Bodymiddle_r20 = body3.addOrReplaceChild("Bodymiddle_r20", CubeListBuilder.create().texOffs(133, 97).addBox(0.0073F, 0.1202F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4233F, -0.838F, -0.7496F, 0.0529F, 0.0056F, 0.2519F));

		PartDefinition Bodymiddle_r21 = body3.addOrReplaceChild("Bodymiddle_r21", CubeListBuilder.create().texOffs(100, 69).addBox(3.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4233F, -0.838F, -0.7496F, 0.0572F, 0.0026F, 1.2118F));

		PartDefinition Bodymiddle_r22 = body3.addOrReplaceChild("Bodymiddle_r22", CubeListBuilder.create().texOffs(109, 69).addBox(-1.1F, 0.2F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8797F, 7.7755F, -0.3978F, -1.9042F, 1.2589F, 0.4179F));

		PartDefinition Bodymiddle_r23 = body3.addOrReplaceChild("Bodymiddle_r23", CubeListBuilder.create().texOffs(151, 93).addBox(-1.5F, 0.2F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8476F, 7.9686F, -1.784F, -0.5843F, 1.4305F, 1.7352F));

		PartDefinition Bodymiddle_r24 = body3.addOrReplaceChild("Bodymiddle_r24", CubeListBuilder.create().texOffs(110, 4).addBox(3.9634F, -6.3807F, -0.1722F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4233F, -0.838F, -0.7496F, 0.0578F, -0.0007F, 1.8227F));

		PartDefinition Bodymiddle_r25 = body3.addOrReplaceChild("Bodymiddle_r25", CubeListBuilder.create().texOffs(148, 22).addBox(0.0073F, 0.1203F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4233F, -0.938F, -2.7496F, 0.1136F, -0.0018F, 0.1735F));

		PartDefinition Bodymiddle_r26 = body3.addOrReplaceChild("Bodymiddle_r26", CubeListBuilder.create().texOffs(141, 110).addBox(3.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4233F, -0.938F, -2.7496F, 0.086F, -0.0513F, 1.1326F));

		PartDefinition Bodymiddle_r27 = body3.addOrReplaceChild("Bodymiddle_r27", CubeListBuilder.create().texOffs(142, 94).addBox(1.8363F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4233F, -0.938F, -2.7496F, 0.1058F, -0.0299F, 0.6527F));

		PartDefinition Bodymiddle_r28 = body3.addOrReplaceChild("Bodymiddle_r28", CubeListBuilder.create().texOffs(34, 95).addBox(3.9634F, -6.3807F, -0.1722F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4233F, -0.938F, -2.7496F, 0.0504F, -0.0614F, 1.7444F));

		PartDefinition cube_r260 = body3.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(122, 128).addBox(-0.5F, -0.9061F, 3.9442F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9233F, -1.2943F, -6.8627F, -0.1222F, 0.0F, 0.0F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9233F, -0.0965F, -2.8954F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r29 = body2.addOrReplaceChild("Bodymiddle_r29", CubeListBuilder.create().texOffs(72, 97).mirror().addBox(-7.9634F, -6.3807F, -0.1722F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8416F, -1.8543F, 0.0398F, 0.148F, -1.763F));

		PartDefinition Bodymiddle_r30 = body2.addOrReplaceChild("Bodymiddle_r30", CubeListBuilder.create().texOffs(145, 17).mirror().addBox(-4.8362F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8416F, -1.8543F, 0.178F, 0.0791F, -0.6662F));

		PartDefinition Bodymiddle_r31 = body2.addOrReplaceChild("Bodymiddle_r31", CubeListBuilder.create().texOffs(145, 15).mirror().addBox(-6.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8416F, -1.8543F, 0.1274F, 0.1282F, -1.1463F));

		PartDefinition Bodymiddle_r32 = body2.addOrReplaceChild("Bodymiddle_r32", CubeListBuilder.create().texOffs(153, 24).mirror().addBox(-2.0073F, 0.1203F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8416F, -1.8543F, 0.2002F, 0.0123F, -0.1903F));

		PartDefinition Bodymiddle_r33 = body2.addOrReplaceChild("Bodymiddle_r33", CubeListBuilder.create().texOffs(87, 6).mirror().addBox(-7.9634F, -6.3807F, -0.1722F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6415F, -3.8543F, 0.0288F, 0.2346F, -1.8698F));

		PartDefinition Bodymiddle_r34 = body2.addOrReplaceChild("Bodymiddle_r34", CubeListBuilder.create().texOffs(141, 74).mirror().addBox(-6.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6415F, -3.8543F, 0.1696F, 0.2049F, -1.2441F));

		PartDefinition Bodymiddle_r35 = body2.addOrReplaceChild("Bodymiddle_r35", CubeListBuilder.create().texOffs(140, 100).mirror().addBox(-4.8362F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6415F, -3.8543F, 0.2508F, 0.1278F, -0.7634F));

		PartDefinition Bodymiddle_r36 = body2.addOrReplaceChild("Bodymiddle_r36", CubeListBuilder.create().texOffs(135, 90).mirror().addBox(-2.0073F, 0.1202F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6415F, -3.8543F, 0.2869F, 0.0227F, -0.2935F));

		PartDefinition Bodymiddle_r37 = body2.addOrReplaceChild("Bodymiddle_r37", CubeListBuilder.create().texOffs(153, 24).addBox(0.0073F, 0.1203F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8416F, -1.8543F, 0.2002F, -0.0123F, 0.1903F));

		PartDefinition Bodymiddle_r38 = body2.addOrReplaceChild("Bodymiddle_r38", CubeListBuilder.create().texOffs(145, 15).addBox(3.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8416F, -1.8543F, 0.1274F, -0.1282F, 1.1463F));

		PartDefinition Bodymiddle_r39 = body2.addOrReplaceChild("Bodymiddle_r39", CubeListBuilder.create().texOffs(145, 17).addBox(1.8363F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8416F, -1.8543F, 0.178F, -0.0791F, 0.6662F));

		PartDefinition Bodymiddle_r40 = body2.addOrReplaceChild("Bodymiddle_r40", CubeListBuilder.create().texOffs(72, 97).addBox(3.9634F, -6.3807F, -0.1722F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8416F, -1.8543F, 0.0398F, -0.148F, 1.763F));

		PartDefinition Bodymiddle_r41 = body2.addOrReplaceChild("Bodymiddle_r41", CubeListBuilder.create().texOffs(135, 90).addBox(0.0073F, 0.1202F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6415F, -3.8543F, 0.2869F, -0.0227F, 0.2935F));

		PartDefinition Bodymiddle_r42 = body2.addOrReplaceChild("Bodymiddle_r42", CubeListBuilder.create().texOffs(140, 100).addBox(1.8363F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6415F, -3.8543F, 0.2508F, -0.1278F, 0.7634F));

		PartDefinition Bodymiddle_r43 = body2.addOrReplaceChild("Bodymiddle_r43", CubeListBuilder.create().texOffs(141, 74).addBox(3.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6415F, -3.8543F, 0.1696F, -0.2049F, 1.2441F));

		PartDefinition Bodymiddle_r44 = body2.addOrReplaceChild("Bodymiddle_r44", CubeListBuilder.create().texOffs(87, 6).addBox(3.9634F, -6.3807F, -0.1722F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6415F, -3.8543F, 0.0288F, -0.2346F, 1.8698F));

		PartDefinition cube_r261 = body2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(124, 86).addBox(-0.5F, -1.0F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.1F, 0.0524F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1186F, -4.083F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r262 = body.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(104, 34).mirror().addBox(-0.2F, 0.0F, 0.1F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4108F, 9.4149F, -1.4559F, -0.3379F, -0.7989F, 0.5831F));

		PartDefinition cube_r263 = body.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(34, 104).mirror().addBox(-0.2F, 0.0F, -0.4F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4108F, 9.4149F, -1.4559F, -0.4158F, -0.9944F, 0.7046F));

		PartDefinition cube_r264 = body.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(79, 114).mirror().addBox(-0.2F, 0.0F, -0.4F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4108F, 9.4149F, -1.4559F, -0.6712F, -1.1786F, 0.9627F));

		PartDefinition cube_r265 = body.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(111, 120).mirror().addBox(-0.2F, 0.0F, -0.2F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5966F, 9.1091F, -2.3897F, -0.7463F, -1.2049F, 1.0248F));

		PartDefinition cube_r266 = body.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(47, 120).mirror().addBox(-0.5F, 0.0F, -0.2F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5949F, 8.965F, -3.0747F, -1.066F, -1.3633F, 1.5827F));

		PartDefinition cube_r267 = body.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(134, 58).mirror().addBox(-2.0479F, -1.2164F, -0.6201F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 7.2842F, -5.5621F, -0.6247F, 0.2097F, 0.2811F));

		PartDefinition Bodymiddle_r45 = body.addOrReplaceChild("Bodymiddle_r45", CubeListBuilder.create().texOffs(104, 61).mirror().addBox(-6.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5399F, -3.3713F, 0.1274F, 0.1282F, -1.3732F));

		PartDefinition Bodymiddle_r46 = body.addOrReplaceChild("Bodymiddle_r46", CubeListBuilder.create().texOffs(144, 88).mirror().addBox(-4.8362F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5399F, -3.3713F, 0.178F, 0.0791F, -0.8931F));

		PartDefinition Bodymiddle_r47 = body.addOrReplaceChild("Bodymiddle_r47", CubeListBuilder.create().texOffs(152, 54).mirror().addBox(-2.0073F, 0.1203F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5399F, -3.3713F, 0.2002F, 0.0123F, -0.4172F));

		PartDefinition Bodymiddle_r48 = body.addOrReplaceChild("Bodymiddle_r48", CubeListBuilder.create().texOffs(150, 73).mirror().addBox(-2.0073F, 0.1202F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2601F, -1.3713F, 0.1136F, 0.0018F, -0.3567F));

		PartDefinition Bodymiddle_r49 = body.addOrReplaceChild("Bodymiddle_r49", CubeListBuilder.create().texOffs(119, 67).mirror().addBox(-4.8362F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2601F, -1.3713F, 0.1058F, 0.0299F, -0.836F));

		PartDefinition Bodymiddle_r50 = body.addOrReplaceChild("Bodymiddle_r50", CubeListBuilder.create().texOffs(143, 55).mirror().addBox(-6.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2601F, -1.3713F, 0.086F, 0.0513F, -1.3159F));

		PartDefinition Bodymiddle_r51 = body.addOrReplaceChild("Bodymiddle_r51", CubeListBuilder.create().texOffs(142, 123).mirror().addBox(-6.9634F, -6.3807F, -0.1722F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2601F, -1.3713F, 0.0504F, 0.0614F, -1.9276F));

		PartDefinition Bodymiddle_r52 = body.addOrReplaceChild("Bodymiddle_r52", CubeListBuilder.create().texOffs(152, 54).addBox(0.0073F, 0.1203F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5399F, -3.3713F, 0.2002F, -0.0123F, 0.4172F));

		PartDefinition Bodymiddle_r53 = body.addOrReplaceChild("Bodymiddle_r53", CubeListBuilder.create().texOffs(144, 88).addBox(1.8363F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5399F, -3.3713F, 0.178F, -0.0791F, 0.8931F));

		PartDefinition Bodymiddle_r54 = body.addOrReplaceChild("Bodymiddle_r54", CubeListBuilder.create().texOffs(104, 61).addBox(3.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5399F, -3.3713F, 0.1274F, -0.1282F, 1.3732F));

		PartDefinition Bodymiddle_r55 = body.addOrReplaceChild("Bodymiddle_r55", CubeListBuilder.create().texOffs(142, 123).addBox(3.9634F, -6.3807F, -0.1722F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2601F, -1.3713F, 0.0504F, -0.0614F, 1.9276F));

		PartDefinition Bodymiddle_r56 = body.addOrReplaceChild("Bodymiddle_r56", CubeListBuilder.create().texOffs(143, 55).addBox(3.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2601F, -1.3713F, 0.086F, -0.0513F, 1.3159F));

		PartDefinition Bodymiddle_r57 = body.addOrReplaceChild("Bodymiddle_r57", CubeListBuilder.create().texOffs(119, 67).addBox(1.8363F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2601F, -1.3713F, 0.1058F, -0.0299F, 0.836F));

		PartDefinition Bodymiddle_r58 = body.addOrReplaceChild("Bodymiddle_r58", CubeListBuilder.create().texOffs(150, 73).addBox(0.0073F, 0.1202F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2601F, -1.3713F, 0.1136F, -0.0018F, 0.3567F));

		PartDefinition cube_r268 = body.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(134, 58).addBox(-1.9521F, -1.2164F, -0.6201F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 7.2842F, -5.5621F, -0.6247F, -0.2097F, -0.2811F));

		PartDefinition cube_r269 = body.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(111, 126).addBox(-1.0F, -0.0148F, -2.8284F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.3168F, -3.4194F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r270 = body.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(104, 34).addBox(-0.8F, 0.0F, 0.1F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4108F, 9.4149F, -1.4559F, -0.3379F, 0.7989F, -0.5831F));

		PartDefinition cube_r271 = body.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(34, 104).addBox(-0.8F, 0.0F, -0.4F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4108F, 9.4149F, -1.4559F, -0.4158F, 0.9944F, -0.7046F));

		PartDefinition cube_r272 = body.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(79, 114).addBox(-0.8F, 0.0F, -0.4F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4108F, 9.4149F, -1.4559F, -0.6712F, 1.1786F, -0.9627F));

		PartDefinition cube_r273 = body.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(111, 120).addBox(-0.8F, 0.0F, -0.2F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5966F, 9.1091F, -2.3897F, -0.7463F, 1.2049F, -1.0248F));

		PartDefinition cube_r274 = body.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(47, 120).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5949F, 8.965F, -3.0747F, -1.066F, 1.3633F, -1.5827F));

		PartDefinition cube_r275 = body.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(133, 92).addBox(-0.5F, 3.1912F, -3.0326F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.3016F, 0.4001F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r276 = body.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(100, 121).addBox(-0.5F, -0.0401F, -4.1382F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.2F, 0.3491F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, -3.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r277 = chest.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(144, 141).addBox(-0.5F, -0.9F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.1F, 0.4363F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(107, 131).addBox(0.0F, -1.1F, 0.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6909F, 4.6049F, 0.0576F, -2.2062F, 0.3285F, -0.2644F));

		PartDefinition cube_r278 = leftArm.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(149, 119).addBox(-1.0F, -0.3F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3167F, 0.2784F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r279 = leftArm.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(112, 141).addBox(-1.0F, -0.4F, -0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -0.6F, 0.9F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r280 = leftArm.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(155, 69).addBox(-0.5F, -0.3F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9941F, 6.6611F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r281 = leftArm.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(109, 145).addBox(-0.5F, -0.7F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -0.6F, 5.2F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r282 = leftArm.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(150, 153).addBox(-0.5F, -0.0947F, 0.141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7F, -0.0016F, 2.9516F, 0.6981F, 0.0F, -0.5672F));

		PartDefinition cube_r283 = leftArm.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(132, 66).addBox(-0.5F, -0.3984F, -2.2516F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0016F, 2.9516F, 0.0F, 0.0F, -0.5672F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(149, 90).addBox(-0.5F, -0.4965F, 0.2528F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2096F, -1.3264F, 6.8332F, 0.3416F, 0.1289F, 0.0173F));

		PartDefinition cube_r284 = leftArm2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(30, 139).addBox(-0.6021F, -0.2139F, 0.4965F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.9035F, -1.4472F, 0.0006F, -0.2618F, 0.0826F));

		PartDefinition cube_r285 = leftArm2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(123, 148).addBox(-1.0F, -0.1F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 0.0035F, 1.7528F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r286 = leftArm2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(49, 149).addBox(-0.5F, -1.1F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 3.4731F, 0.2055F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r287 = leftArm2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(153, 60).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 1.5035F, 0.5528F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r288 = leftArm2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(54, 150).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5035F, 0.5528F, -0.1745F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(123, 140).addBox(-0.9856F, 0.0925F, -1.0522F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.6054F, 5.3293F, 0.1577F, 0.266F, 0.8539F, 0.1514F));

		PartDefinition cube_r289 = leftArm3.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(84, 146).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4856F, 2.3941F, 1.4624F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r290 = leftArm3.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(19, 152).addBox(-0.5F, -0.8F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4856F, 2.4987F, 0.267F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r291 = leftArm3.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(152, 56).addBox(-0.5F, -1.1F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4856F, 2.5925F, -0.5522F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(133, 120).addBox(-1.0F, -1.1F, 0.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.6909F, 4.6049F, 0.0576F, -2.2062F, -0.3285F, 0.2644F));

		PartDefinition cube_r292 = rightArm.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(149, 127).addBox(-1.0F, -0.3F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.3167F, 0.2784F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r293 = rightArm.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(49, 142).addBox(-1.0F, -0.4F, -0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, -0.6F, 0.9F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r294 = rightArm.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(155, 108).addBox(-0.5F, -0.3F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9941F, 6.6611F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r295 = rightArm.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(116, 145).addBox(-0.5F, -0.7F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, -0.6F, 5.2F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r296 = rightArm.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(10, 154).addBox(-0.5F, -0.0947F, 0.141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7F, -0.0016F, 2.9516F, 0.6981F, 0.0F, 0.5672F));

		PartDefinition cube_r297 = rightArm.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(131, 133).addBox(-0.5F, -0.3984F, -2.2516F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, -0.0016F, 2.9516F, 0.0F, 0.0F, 0.5672F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(149, 99).addBox(-1.5F, -0.4965F, 0.2528F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2096F, -1.3264F, 6.8332F, 0.1319F, -0.2335F, 0.1774F));

		PartDefinition cube_r298 = rightArm2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(44, 140).addBox(-0.3979F, -0.2139F, 0.4965F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 0.9035F, -1.4472F, 0.0006F, 0.2618F, -0.0826F));

		PartDefinition cube_r299 = rightArm2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(7, 149).addBox(-1.0F, -0.1F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 0.0035F, 1.7528F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r300 = rightArm2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(77, 149).addBox(-0.5F, -1.1F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 3.4731F, 0.2055F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r301 = rightArm2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(153, 63).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 1.5035F, 0.5528F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r302 = rightArm2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(150, 69).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.5035F, 0.5528F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(141, 61).addBox(-0.0144F, 0.0925F, -1.0522F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.6054F, 5.3293F, 0.1577F, 0.3148F, -0.8034F, -0.5885F));

		PartDefinition cube_r303 = rightArm3.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(148, 61).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4856F, 2.3941F, 1.4624F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r304 = rightArm3.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(24, 152).addBox(-0.5F, -0.8F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4856F, 2.4987F, 0.267F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r305 = rightArm3.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(69, 152).addBox(-0.5F, -1.1F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4856F, 2.5925F, -0.5522F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0624F, -1.6347F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r306 = neck3.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(107, 127).addBox(0.0F, -1.5477F, 0.0842F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.172F, -1.1523F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r307 = neck3.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(142, 90).addBox(-0.5F, -0.1F, 2.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.328F, -4.5523F, 0.4014F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7425F, -1.7394F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r308 = neck2.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(112, 136).addBox(0.0F, -1.1373F, -0.0576F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2408F, -1.1045F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r309 = neck2.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(39, 155).addBox(0.0F, -0.7861F, 0.0638F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5504F, -3.0541F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r310 = neck2.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(131, 128).addBox(-0.5F, -1.0F, -2.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.5504F, -0.5541F, 0.3316F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9575F, -2.7695F, -0.3011F, 0.0522F, 0.1666F));

		PartDefinition cube_r311 = head.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(43, 154).mirror().addBox(-0.5349F, -1.1987F, 0.5084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(154, 15).mirror().addBox(-0.5349F, -1.1987F, -0.0916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(142, 119).mirror().addBox(-0.5349F, -0.5987F, -0.0916F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0849F, 4.0017F, -2.5754F, -0.7843F, 0.22F, -0.2046F));

		PartDefinition cube_r312 = head.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(0, 155).mirror().addBox(-0.2F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 4.2663F, -4.1855F, -0.3895F, -0.3619F, -0.6516F));

		PartDefinition cube_r313 = head.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(155, 21).mirror().addBox(-0.7363F, -0.4001F, -0.2377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(155, 3).mirror().addBox(-0.7363F, -0.0001F, -0.2377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.0458F, 3.2681F, -3.8064F, -0.1692F, 0.0335F, -1.125F));

		PartDefinition cube_r314 = head.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(155, 26).mirror().addBox(-0.1363F, -0.0001F, -0.2377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(29, 155).mirror().addBox(-0.1363F, -0.4001F, -0.2377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.0458F, 3.2681F, -3.8064F, -0.1719F, -0.1815F, -1.0879F));

		PartDefinition cube_r315 = head.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(155, 43).mirror().addBox(-1.3101F, -0.9275F, -0.5834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(155, 40).mirror().addBox(-1.3101F, -0.8275F, -0.5834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0849F, 4.0017F, -2.5754F, -0.3242F, -1.2503F, 0.172F));

		PartDefinition cube_r316 = head.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(155, 18).mirror().addBox(-0.5349F, -0.1632F, -1.1226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(154, 130).mirror().addBox(-0.5349F, -0.1632F, -0.6226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0849F, 4.0017F, -2.5754F, -0.7406F, 0.22F, -0.2046F));

		PartDefinition cube_r317 = head.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(140, 151).mirror().addBox(-0.5349F, -1.2866F, -0.6307F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.0849F, 4.0017F, -2.5754F, 0.2193F, 0.22F, -0.2046F));

		PartDefinition cube_r318 = head.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(43, 154).addBox(-0.4651F, -1.1987F, 0.5084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(154, 15).addBox(-0.4651F, -1.1987F, -0.0916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(142, 119).addBox(-0.4651F, -0.5987F, -0.0916F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0849F, 4.0017F, -2.5754F, -0.7843F, -0.22F, 0.2046F));

		PartDefinition cube_r319 = head.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(155, 26).addBox(-0.8637F, -0.0001F, -0.2377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(29, 155).addBox(-0.8637F, -0.4001F, -0.2377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.0458F, 3.2681F, -3.8064F, -0.1719F, 0.1815F, 1.0879F));

		PartDefinition cube_r320 = head.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(155, 21).addBox(-0.2637F, -0.4001F, -0.2377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(155, 3).addBox(-0.2637F, -0.0001F, -0.2377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.0458F, 3.2681F, -3.8064F, -0.1692F, -0.0335F, 1.125F));

		PartDefinition cube_r321 = head.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(154, 147).addBox(0.0F, -0.6251F, -0.0206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.6028F, -3.9004F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r322 = head.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(155, 43).addBox(0.3101F, -0.9275F, -0.5834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(155, 40).addBox(0.3101F, -0.8275F, -0.5834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0849F, 4.0017F, -2.5754F, -0.3242F, 1.2503F, -0.172F));

		PartDefinition cube_r323 = head.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(155, 32).addBox(-0.4717F, -0.7631F, -1.1322F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(155, 18).addBox(-0.4651F, -0.1632F, -1.1226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(155, 29).addBox(-0.4717F, -0.7631F, -0.6322F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(154, 130).addBox(-0.4651F, -0.1632F, -0.6226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0849F, 4.0017F, -2.5754F, -0.7406F, -0.22F, 0.2046F));

		PartDefinition cube_r324 = head.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(140, 151).addBox(-0.4651F, -1.2866F, -0.6307F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.0849F, 4.0017F, -2.5754F, 0.2193F, -0.22F, 0.2046F));

		PartDefinition cube_r325 = head.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(132, 71).mirror().addBox(-0.2F, -0.7F, -2.375F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.5703F, -1.4145F, -0.3374F, 0.2892F, -0.0997F));

		PartDefinition cube_r326 = head.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(78, 132).mirror().addBox(-0.2F, -1.0F, 0.225F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7818F, 2.1197F, -3.5439F, -0.5556F, 0.2892F, -0.0997F));

		PartDefinition cube_r327 = head.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(78, 132).addBox(-0.8F, -1.0F, 0.225F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7818F, 2.1197F, -3.5439F, -0.5556F, -0.2892F, 0.0997F));

		PartDefinition cube_r328 = head.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(132, 71).addBox(-0.8F, -0.7F, -2.375F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 3.5703F, -1.4145F, -0.3374F, -0.2892F, 0.0997F));

		PartDefinition cube_r329 = head.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(41, 126).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 2.1132F, -3.5632F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r330 = head.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(78, 127).addBox(-1.0F, -0.5F, -0.7F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0451F, -2.7057F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r331 = head.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(17, 119).addBox(-0.5F, -0.2269F, -0.0127F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.0F, -0.0059F, -2.4055F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r332 = head.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(85, 14).addBox(-2.5F, -0.7F, -0.8F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.3774F, -0.7048F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r333 = head.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(0, 155).addBox(-0.8F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, 4.2663F, -4.1855F, -0.3895F, 0.3619F, 0.6516F));

		PartDefinition cube_r334 = head.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(31, 128).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.8647F, -3.1184F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r335 = head.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(154, 150).addBox(-0.5F, -0.6F, -3.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(148, 116).addBox(-1.0F, -0.6F, -0.625F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 5.7286F, -1.4165F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r336 = head.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(148, 105).addBox(-1.5F, -0.15F, -0.275F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(148, 82).addBox(-1.5F, -0.725F, -0.275F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 4.7551F, -1.4901F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r337 = head.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(9, 131).addBox(-1.5F, -1.5F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.3888F, -0.144F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r338 = head.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(94, 114).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.2373F, 0.147F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r339 = head.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(0, 140).addBox(-1.5F, -0.8F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.7726F, -0.4475F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r340 = head.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(148, 79).addBox(-1.0F, 0.0F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.711F, -0.5263F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r341 = head.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(68, 135).addBox(-1.5F, -1.1F, -0.9F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.6752F, -0.2809F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r342 = head.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(121, 54).addBox(-1.0F, 0.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.0F, -0.9641F, -2.0922F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r343 = head.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(130, 83).addBox(-1.0F, 0.0F, 0.7F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(129, 0).addBox(-1.0F, 0.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.8629F, -1.6539F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r344 = head.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(139, 20).addBox(-2.0F, -1.0F, -1.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -1.2F, 0.6F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftSygomaticarch = head.addOrReplaceChild("leftSygomaticarch", CubeListBuilder.create(), PartPose.offset(2.9479F, 4.719F, 0.9216F));

		PartDefinition cube_r345 = leftSygomaticarch.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(155, 46).addBox(-0.4596F, 0.2425F, -0.5832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(155, 49).addBox(-0.4596F, -0.2575F, -0.5832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(58, 155).addBox(-0.4596F, -0.7575F, -0.5832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(-0.4277F, -0.1616F, -1.3456F, 1.1372F, -0.0433F, 0.0566F));

		PartDefinition cube_r346 = leftSygomaticarch.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(155, 78).addBox(-0.4596F, -0.4959F, -0.4712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(79, 155).addBox(-0.4596F, 0.0041F, -0.4712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.4277F, -0.1616F, -1.3456F, 1.0063F, -0.0433F, 0.0566F));

		PartDefinition cube_r347 = leftSygomaticarch.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(151, 143).addBox(-0.4752F, -1.8531F, -0.6158F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.4294F, -0.3155F, -1.4734F, 0.5625F, 0.0008F, -0.0102F));

		PartDefinition cube_r348 = leftSygomaticarch.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(59, 151).addBox(-0.4752F, -2.2383F, -0.597F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4277F, -0.1616F, -1.3456F, 0.8679F, 0.0008F, -0.0102F));

		PartDefinition cube_r349 = leftSygomaticarch.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(141, 106).addBox(-0.2717F, -1.3424F, -1.7467F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7674F, -0.9877F, -1.8192F, 0.7316F, 0.3458F, 1.1874F));

		PartDefinition cube_r350 = leftSygomaticarch.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(150, 108).addBox(-0.4847F, 0.116F, -0.5273F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1992F, -3.5198F, -2.3964F, 0.035F, 0.0087F, 0.3205F));

		PartDefinition cube_r351 = leftSygomaticarch.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(150, 50).addBox(-0.6428F, -1.8787F, -0.1999F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2521F, -3.4067F, -2.7113F, -0.1832F, 0.0052F, 0.0166F));

		PartDefinition cube_r352 = leftSygomaticarch.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(153, 75).addBox(-0.9167F, -0.7972F, -0.4368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2776F, -3.428F, -2.8647F, 0.3058F, 0.7613F, -0.6002F));

		PartDefinition cube_r353 = leftSygomaticarch.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(82, 142).addBox(-0.8494F, -3.4499F, -0.7782F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4521F, -3.4067F, -2.7113F, -0.4657F, -0.1178F, -0.3847F));

		PartDefinition cube_r354 = leftSygomaticarch.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(116, 131).addBox(-0.911F, -0.9058F, -1.2404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2776F, -3.428F, -2.8647F, -0.4709F, 0.7613F, -0.6002F));

		PartDefinition cube_r355 = leftSygomaticarch.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(11, 122).addBox(-0.4637F, -0.9058F, -2.0652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.2776F, -3.428F, -2.8647F, -0.78F, 1.0849F, -0.9811F));

		PartDefinition rightSygomaticarch = head.addOrReplaceChild("rightSygomaticarch", CubeListBuilder.create(), PartPose.offset(-2.9479F, 4.719F, 0.9216F));

		PartDefinition cube_r356 = rightSygomaticarch.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(155, 46).mirror().addBox(-0.5404F, 0.2425F, -0.5832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(155, 49).mirror().addBox(-0.5404F, -0.2575F, -0.5832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(58, 155).mirror().addBox(-0.5404F, -0.7575F, -0.5832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(0.4277F, -0.1616F, -1.3456F, 1.1372F, 0.0433F, -0.0566F));

		PartDefinition cube_r357 = rightSygomaticarch.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(155, 78).mirror().addBox(-0.5404F, -0.4959F, -0.4712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(79, 155).mirror().addBox(-0.5404F, 0.0041F, -0.4712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.4277F, -0.1616F, -1.3456F, 1.0063F, 0.0433F, -0.0566F));

		PartDefinition cube_r358 = rightSygomaticarch.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(151, 143).mirror().addBox(-0.5248F, -1.8531F, -0.6158F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.4294F, -0.3155F, -1.4734F, 0.5625F, -0.0008F, 0.0102F));

		PartDefinition cube_r359 = rightSygomaticarch.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(59, 151).mirror().addBox(-0.5248F, -2.2383F, -0.597F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.4277F, -0.1616F, -1.3456F, 0.8679F, -0.0008F, 0.0102F));

		PartDefinition cube_r360 = rightSygomaticarch.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(141, 106).mirror().addBox(-0.7283F, -1.3424F, -1.7467F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7674F, -0.9877F, -1.8192F, 0.7316F, -0.3458F, -1.1874F));

		PartDefinition cube_r361 = rightSygomaticarch.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(150, 108).mirror().addBox(-0.5153F, 0.116F, -0.5273F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1992F, -3.5198F, -2.3964F, 0.035F, -0.0087F, -0.3205F));

		PartDefinition cube_r362 = rightSygomaticarch.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(150, 50).mirror().addBox(-0.3572F, -1.8787F, -0.1999F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2521F, -3.4067F, -2.7113F, -0.1832F, -0.0052F, -0.0166F));

		PartDefinition cube_r363 = rightSygomaticarch.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(153, 75).mirror().addBox(-0.0833F, -0.7972F, -0.4368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2776F, -3.428F, -2.8647F, 0.3058F, -0.7613F, 0.6002F));

		PartDefinition cube_r364 = rightSygomaticarch.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(82, 142).mirror().addBox(-1.1506F, -3.4499F, -0.7782F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4521F, -3.4067F, -2.7113F, -0.4657F, 0.1178F, 0.3847F));

		PartDefinition cube_r365 = rightSygomaticarch.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(116, 131).mirror().addBox(-0.089F, -0.9058F, -1.2404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2776F, -3.428F, -2.8647F, -0.4709F, -0.7613F, 0.6002F));

		PartDefinition cube_r366 = rightSygomaticarch.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(11, 122).mirror().addBox(-0.5363F, -0.9058F, -2.0652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2776F, -3.428F, -2.8647F, -0.78F, -1.0849F, 0.9811F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4431F, -0.707F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(18, 131).mirror().addBox(0.0F, -0.425F, -0.425F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(18, 131).addBox(2.4F, -0.425F, -0.425F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 4.1925F, 0.5385F, -2.3126F, 0.0F, 0.0F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(135, 151).mirror().addBox(0.0F, -0.825F, -1.45F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(135, 151).addBox(2.4F, -0.825F, -1.45F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 3.2954F, 0.9915F, -2.4435F, 0.0F, 0.0F));

		PartDefinition cube_r369 = jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(155, 81).mirror().addBox(-1.0F, 0.6134F, -0.4799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(155, 81).addBox(1.0F, 0.6134F, -0.4799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 149).addBox(-0.5F, 0.0134F, 0.6201F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 149).addBox(-0.5F, 0.0134F, 0.0201F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 5.6649F, 1.3476F, -3.098F, 0.0F, 0.0F));

		PartDefinition cube_r370 = jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(150, 3).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(150, 3).addBox(2.7F, -0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.6F, 2.2299F, 3.3372F, -1.5403F, 0.0F, 0.0F));

		PartDefinition cube_r371 = jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(139, 76).mirror().addBox(-1.0F, -2.025F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(139, 76).addBox(2.2F, -2.025F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.1F, 2.0088F, -0.0066F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r372 = jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(87, 153).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(87, 153).addBox(2.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.6F, 0.9658F, 0.0667F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r373 = jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(137, 155).mirror().addBox(-1.0F, -1.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(137, 155).addBox(2.2F, -1.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.1F, 1.4F, -0.8F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r374 = jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(153, 85).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(153, 85).addBox(2.7F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.6F, 0.4036F, 1.3511F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r375 = jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(150, 46).mirror().addBox(-1.0F, 0.0045F, 0.0197F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(150, 46).addBox(1.0F, 0.0045F, 0.0197F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 3.6015F, 3.5562F, -2.2253F, 0.0F, 0.0F));

		PartDefinition cube_r376 = jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(43, 150).mirror().addBox(-1.0F, -0.0205F, -0.0053F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(43, 150).addBox(1.0F, -0.0205F, -0.0053F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 4.3735F, 2.897F, -2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r377 = jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(53, 154).mirror().addBox(-0.5F, -0.45F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(53, 154).addBox(1.5F, -0.45F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.0F, 4.9734F, 1.8159F, -2.1991F, 0.0F, 0.0F));

		PartDefinition cube_r378 = jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(153, 124).mirror().addBox(-1.0F, 2.9039F, -4.1034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(153, 124).addBox(1.0F, 2.9039F, -4.1034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 9.1F, 1.9F, -2.0682F, 0.0F, 0.0F));

		PartDefinition cube_r379 = jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(48, 154).mirror().addBox(-0.5F, -0.65F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(48, 154).addBox(1.5F, -0.65F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0F, 4.216F, 0.9998F, -1.213F, 0.0F, 0.0F));

		PartDefinition cube_r380 = jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(95, 141).mirror().addBox(-1.0F, 0.0006F, -1.9749F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 141).addBox(1.0F, 0.0006F, -1.9749F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.6866F, 3.9338F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r381 = jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(101, 150).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(101, 150).addBox(2.7F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.6F, 2.3835F, 2.8808F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r382 = jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(52, 126).mirror().addBox(-1.0F, -0.9636F, -0.0089F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 126).addBox(2.2F, -0.9636F, -0.0089F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -0.0067F, 2.5793F, -1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r383 = jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(145, 153).mirror().addBox(-1.0F, 1.1406F, 1.293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(145, 153).addBox(2.2F, 1.1406F, 1.293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.1F, 0.0068F, 5.3283F, -1.7191F, 0.0F, 0.0F));

		PartDefinition cube_r384 = jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(153, 37).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(153, 37).addBox(2.2F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.1F, 0.2698F, 3.4991F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(15, 156).mirror().addBox(-1.0F, -0.5999F, -0.4887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(15, 156).addBox(2.2F, -0.5999F, -0.4887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.1F, 0.6F, 2.1F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(0, 143).mirror().addBox(-1.0F, -2.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(127, 153).mirror().addBox(-1.0F, -1.7F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(0, 143).addBox(2.2F, -2.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(127, 153).addBox(2.2F, -1.7F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.1F, 1.4F, -0.8F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(121, 155).mirror().addBox(-1.0F, -1.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(121, 155).addBox(2.2F, -1.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 2.0088F, -0.0066F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(22, 125).addBox(-1.0F, 0.0099F, -0.0291F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 5.2259F, 2.1758F, -2.6354F, 0.0F, 0.0F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(138, 102).addBox(-1.0F, 0.3F, -2.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.9743F, -0.7928F, -2.3911F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(91, 99).addBox(-0.5F, -0.9067F, -0.1029F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F))
				.texOffs(142, 155).addBox(0.0F, -1.9067F, 0.8971F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 156).addBox(0.0F, -1.7067F, 2.8971F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 156).addBox(0.0F, -1.5067F, 4.8971F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.64F, 3.1459F, -0.9047F, -0.0904F, 0.0961F));

		PartDefinition cube_r390 = tail.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(84, 155).addBox(0.0F, 2.1F, 5.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 131).addBox(0.0F, 0.8F, 3.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 73).addBox(0.0F, -0.7F, 1.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 34).addBox(0.0F, -1.7F, -0.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0933F, 0.8971F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r391 = tail.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -2.3F, -4.1F, 9.0F, 6.0F, 8.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 1.1909F, 1.5061F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r392 = tail.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(0, 15).addBox(-4.5F, -3.0F, -3.5F, 9.0F, 5.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.3067F, 1.3971F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(108, 6).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(23, 156).addBox(0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 152).addBox(0.0F, -1.3F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 156).addBox(0.0F, -1.3F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 6.9F, 0.2463F, -0.1658F, -0.0648F));

		PartDefinition cube_r393 = tail2.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(119, 141).addBox(0.0F, 0.0F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4516F, 3.0531F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r394 = tail2.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(0, 28).addBox(-3.5F, -5.0F, -5.3F, 7.0F, 5.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 1.2942F, 3.8179F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r395 = tail2.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(27, 28).addBox(-3.5F, -2.3F, -3.5F, 7.0F, 5.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.2116F, 1.4686F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 122).addBox(-0.5F, -0.475F, 0.025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5073F, 5.9866F, 0.134F, -0.2163F, -0.0289F));

		PartDefinition cube_r396 = tail3.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(81, 28).addBox(-1.5F, -1.3F, 2.5F, 3.0F, 4.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.7043F, -4.518F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(122, 93).addBox(-0.5F, -0.45F, -0.075F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.038F, 4.0597F, 0.094F, -0.4572F, 0.2212F));

		PartDefinition cube_r397 = tail4.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(46, 87).addBox(-1.5F, -0.8F, 8.5F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.6663F, -8.5777F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 94).addBox(-0.5F, -0.5773F, -0.0539F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0941F, 3.9206F, 0.1957F, -0.3034F, -0.3508F));

		PartDefinition cube_r398 = tail5.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(47, 113).addBox(-2.0F, -0.8F, 21.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.004F))
				.texOffs(65, 87).addBox(-1.5F, -0.8F, 19.5F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.006F))
				.texOffs(17, 95).addBox(-1.0F, -0.2F, 14.5F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.7604F, -12.4983F, -0.0436F, 0.0F, 0.0F));

		PartDefinition thagomizer2 = tail5.addOrReplaceChild("thagomizer2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6769F, -1.087F, 10.825F, 3.1312F, -0.4654F, -0.6465F));

		PartDefinition cube_r399 = thagomizer2.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(127, 99).addBox(-2.0F, -0.5F, -0.8F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.962F, 0.0F, -0.0104F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r400 = thagomizer2.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(123, 10).addBox(1.0F, -0.5F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 1.0F, 0.0F, 0.1047F, 0.0F));

		PartDefinition thagomizer18 = tail5.addOrReplaceChild("thagomizer18", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6769F, -1.087F, 10.825F, 3.1312F, 0.4654F, 0.6465F));

		PartDefinition cube_r401 = thagomizer18.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(127, 99).mirror().addBox(-3.0F, -0.5F, -0.8F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.962F, 0.0F, -0.0104F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r402 = thagomizer18.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(123, 10).mirror().addBox(-6.0F, -0.5F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.0F, 1.0F, 0.0F, -0.1047F, 0.0F));

		PartDefinition thagomizer8 = tail5.addOrReplaceChild("thagomizer8", CubeListBuilder.create(), PartPose.offsetAndRotation(1.125F, 0.6757F, 10.058F, 2.9143F, -0.1417F, 0.6457F));

		PartDefinition cube_r403 = thagomizer8.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(103, 140).addBox(0.0F, -0.5F, -0.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.562F, 0.0F, -0.0104F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r404 = thagomizer8.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(140, 97).addBox(3.0F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 0.0F, 1.0F, 0.0F, 0.1047F, 0.0F));

		PartDefinition thagomizer17 = tail5.addOrReplaceChild("thagomizer17", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.125F, 0.6757F, 10.058F, 2.9143F, 0.1417F, -0.6457F));

		PartDefinition cube_r405 = thagomizer17.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(103, 140).mirror().addBox(-3.0F, -0.5F, -0.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.562F, 0.0F, -0.0104F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r406 = thagomizer17.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(140, 97).mirror().addBox(-6.0F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4F, 0.0F, 1.0F, 0.0F, -0.1047F, 0.0F));

		PartDefinition thagomizer9 = tail5.addOrReplaceChild("thagomizer9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4571F, -0.0274F, 7.4887F, 2.9098F, -0.241F, -0.5567F));

		PartDefinition cube_r407 = thagomizer9.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(140, 131).mirror().addBox(-3.0F, -0.5F, -0.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.562F, 0.0F, -0.0104F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r408 = thagomizer9.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(140, 128).mirror().addBox(-6.0F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4F, 0.0F, 1.0F, 0.0F, -0.1047F, 0.0F));

		PartDefinition thagomizer10 = tail5.addOrReplaceChild("thagomizer10", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4571F, -0.0274F, 7.4887F, 2.9098F, 0.241F, 0.5567F));

		PartDefinition cube_r409 = thagomizer10.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(141, 32).addBox(0.0F, -0.5F, -0.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.562F, 0.0F, -0.0104F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r410 = thagomizer10.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(140, 134).addBox(3.0F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 0.0F, 1.0F, 0.0F, 0.1047F, 0.0F));

		PartDefinition thagomizer5 = tail5.addOrReplaceChild("thagomizer5", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3769F, -0.9283F, 8.2804F, 3.0929F, -0.1061F, -0.2989F));

		PartDefinition cube_r411 = thagomizer5.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(121, 113).addBox(-2.0F, -0.5F, -0.8F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.962F, 0.0F, -0.0104F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r412 = thagomizer5.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(121, 58).addBox(1.0F, -0.5F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 1.0F, 0.0F, 0.1047F, 0.0F));

		PartDefinition thagomizer19 = tail5.addOrReplaceChild("thagomizer19", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3769F, -0.9283F, 8.2804F, 3.0929F, 0.1061F, 0.2989F));

		PartDefinition cube_r413 = thagomizer19.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(121, 113).mirror().addBox(-3.0F, -0.5F, -0.8F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.962F, 0.0F, -0.0104F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r414 = thagomizer19.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(121, 58).mirror().addBox(-6.0F, -0.5F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.0F, 1.0F, 0.0F, -0.1047F, 0.0F));

		PartDefinition thagomizer6 = tail5.addOrReplaceChild("thagomizer6", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1985F, -0.8383F, 7.0437F, 0.0125F, 0.724F, -0.2304F));

		PartDefinition cube_r415 = thagomizer6.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(149, 0).addBox(1.0F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.038F, 0.0F, -0.0104F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r416 = thagomizer6.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(142, 148).addBox(4.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0F, 1.0F, 0.0F, 0.1047F, 0.0F));

		PartDefinition thagomizer12 = tail5.addOrReplaceChild("thagomizer12", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1985F, -0.8383F, 7.0437F, 0.0125F, -0.724F, 0.2304F));

		PartDefinition cube_r417 = thagomizer12.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(149, 0).mirror().addBox(-3.0F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.038F, 0.0F, -0.0104F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r418 = thagomizer12.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(142, 148).mirror().addBox(-6.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.0F, 0.0F, 1.0F, 0.0F, -0.1047F, 0.0F));

		PartDefinition thagomizer7 = tail5.addOrReplaceChild("thagomizer7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1726F, -1.9963F, 7.3007F, 0.0913F, 0.5266F, -1.4403F));

		PartDefinition cube_r419 = thagomizer7.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(155, 66).addBox(1.6F, 0.4F, 2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 155).addBox(2.7F, 0.4F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(155, 105).addBox(3.8F, 0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9477F, 0.0F, 1.1126F, 0.0F, 0.1047F, 0.0F));

		PartDefinition thagomizer13 = tail5.addOrReplaceChild("thagomizer13", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1726F, -1.9963F, 7.3007F, 0.0913F, -0.5266F, 1.4403F));

		PartDefinition cube_r420 = thagomizer13.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(155, 66).mirror().addBox(-2.6F, 0.4F, 2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(63, 155).mirror().addBox(-3.7F, 0.4F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(155, 105).mirror().addBox(-4.8F, 0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.9477F, 0.0F, 1.1126F, 0.0F, -0.1047F, 0.0F));

		PartDefinition thagomizer3 = tail5.addOrReplaceChild("thagomizer3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3769F, 0.5729F, 11.0567F, 3.078F, -0.6803F, 0.8082F));

		PartDefinition cube_r421 = thagomizer3.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(141, 35).addBox(-1.2755F, -0.5124F, -1.4107F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.962F, 0.0F, -0.0104F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r422 = thagomizer3.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(86, 139).addBox(1.8357F, -0.5124F, -1.8027F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 1.0F, 0.0F, 0.1047F, 0.0F));

		PartDefinition thagomizer16 = tail5.addOrReplaceChild("thagomizer16", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3769F, 0.5729F, 11.0567F, 3.078F, 0.6803F, -0.8082F));

		PartDefinition cube_r423 = thagomizer16.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(141, 35).mirror().addBox(-1.7245F, -0.5124F, -1.4107F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.962F, 0.0F, -0.0104F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r424 = thagomizer16.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(86, 139).mirror().addBox(-4.8357F, -0.5124F, -1.8027F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.0F, 1.0F, 0.0F, -0.1047F, 0.0F));

		PartDefinition thagomizer11 = tail5.addOrReplaceChild("thagomizer11", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4908F, 1.3954F, 14.4431F, 2.0582F, -1.275F, 1.4249F));

		PartDefinition cube_r425 = thagomizer11.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(5, 156).addBox(-0.4745F, -0.5F, -0.5549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.3034F, 1.1F, 0.9739F, -0.3495F, -0.0492F, 0.1925F));

		PartDefinition cube_r426 = thagomizer11.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(156, 0).addBox(-0.5338F, -0.5F, -0.4498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3034F, 1.1F, 0.9739F, -0.3508F, 0.0984F, 0.1386F));

		PartDefinition thagomizer15 = tail5.addOrReplaceChild("thagomizer15", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4908F, 1.3954F, 14.4431F, 2.0582F, 1.275F, -1.4249F));

		PartDefinition cube_r427 = thagomizer15.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(5, 156).mirror().addBox(-0.5255F, -0.5F, -0.5549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.3034F, 1.1F, 0.9739F, -0.3495F, 0.0492F, -0.1925F));

		PartDefinition cube_r428 = thagomizer15.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(156, 0).mirror().addBox(-0.4662F, -0.5F, -0.4498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3034F, 1.1F, 0.9739F, -0.3508F, -0.0984F, -0.1386F));

		PartDefinition thagomizer4 = tail5.addOrReplaceChild("thagomizer4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5603F, -1.0399F, 12.198F, -2.1944F, -0.8089F, -1.1552F));

		PartDefinition cube_r429 = thagomizer4.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(141, 71).addBox(-1.2755F, -0.5124F, -1.4107F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.062F, 0.0F, -0.0104F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r430 = thagomizer4.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(35, 140).addBox(1.8357F, -0.5124F, -1.8027F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9F, 0.0F, 1.0F, 0.0F, 0.1047F, 0.0F));

		PartDefinition thagomizer14 = tail5.addOrReplaceChild("thagomizer14", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5603F, -1.0399F, 12.198F, -2.1944F, 0.8089F, 1.1552F));

		PartDefinition cube_r431 = thagomizer14.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(141, 71).mirror().addBox(-1.7245F, -0.5124F, -1.4107F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.062F, 0.0F, -0.0104F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r432 = thagomizer14.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(35, 140).mirror().addBox(-4.8357F, -0.5124F, -1.8027F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9F, 0.0F, 1.0F, 0.0F, -0.1047F, 0.0F));

		return LayerDefinition.create(meshdefinition, 160, 160);
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