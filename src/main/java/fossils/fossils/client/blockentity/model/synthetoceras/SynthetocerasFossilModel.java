package fossils.fossils.client.blockentity.model.synthetoceras;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SynthetocerasFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftArm5;
	private final ModelPart leftHoof;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightArm5;
	private final ModelPart rightHoof;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart chest2;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArmHoof;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArmHoof;
	private final ModelPart neck3;
	private final ModelPart neck5;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck4;
	private final ModelPart neck6;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public SynthetocerasFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone2 = this.hips.getChild("bone2");
		this.bone4 = this.hips.getChild("bone4");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftArm5 = this.leftLeg3.getChild("leftArm5");
		this.leftHoof = this.leftArm5.getChild("leftHoof");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightArm5 = this.rightLeg3.getChild("rightArm5");
		this.rightHoof = this.rightArm5.getChild("rightHoof");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.chest = this.body.getChild("chest");
		this.chest2 = this.chest.getChild("chest2");
		this.bone = this.chest2.getChild("bone");
		this.bone3 = this.chest2.getChild("bone3");
		this.leftarm = this.chest2.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArmHoof = this.leftArm4.getChild("leftArmHoof");
		this.rightarm = this.chest2.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArmHoof = this.rightArm4.getChild("rightArmHoof");
		this.neck3 = this.chest2.getChild("neck3");
		this.neck5 = this.neck3.getChild("neck5");
		this.neck2 = this.neck5.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck4 = this.neck.getChild("neck4");
		this.neck6 = this.neck4.getChild("neck6");
		this.head = this.neck6.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1569F, -29.9472F, 12.469F, 0.0087F, 0.0008F, -0.0873F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(33, 84).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -1.7429F, 1.1028F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(7, 52).addBox(0.0F, -1.4F, -2.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.52F, 0.2575F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(68, 101).addBox(0.0F, -2.1201F, -1.0189F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7434F, -2.3032F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(43, 25).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1566F, -0.8294F, -0.5442F, -0.2404F, -0.6718F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(64, 15).mirror().addBox(-2.2F, 0.3F, -0.1F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6233F, -3.2027F, 0.0023F, -0.2221F, -0.36F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(64, 15).addBox(-0.8F, 0.3F, -0.1F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6233F, -3.2027F, 0.0023F, 0.2221F, 0.36F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(43, 25).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1566F, -0.8294F, -0.5442F, 0.2404F, 0.6718F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(34, 10).addBox(-1.0F, -0.675F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.7467F, 1.8131F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, -0.2F, 1.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7318F, 1.6393F, -0.0283F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bone2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(101, 99).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(0.1016F, 0.221F, 1.8072F, -0.6503F, -1.4197F, 1.9066F));

		PartDefinition cube_r11 = bone2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(101, 96).addBox(-0.775F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3658F, 0.9537F, 1.4915F, -0.0913F, -0.0103F, 1.2627F));

		PartDefinition cube_r12 = bone2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(20, 101).addBox(-0.6F, -0.5F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1497F, 0.7474F, 3.0557F, -2.9702F, 1.0072F, -1.7345F));

		PartDefinition cube_r13 = bone2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(56, 12).addBox(-1.4467F, -0.2321F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6989F, 2.4043F, 4.5704F, 1.1483F, 0.4855F, 2.5309F));

		PartDefinition cube_r14 = bone2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(54, 32).addBox(-1.4467F, -0.7679F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6989F, 2.4043F, 4.5704F, 1.0015F, 0.8328F, 2.2955F));

		PartDefinition cube_r15 = bone2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(111, 96).addBox(0.2267F, -0.8724F, -1.0672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1878F, 1.4447F, 4.7993F, 1.7077F, -1.3273F, -0.4582F));

		PartDefinition cube_r16 = bone2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(111, 70).addBox(0.5375F, -0.8724F, 0.5287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1878F, 1.4447F, 4.7993F, 0.2821F, -0.5395F, 1.1058F));

		PartDefinition cube_r17 = bone2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(111, 48).addBox(-1.0883F, -0.8724F, 1.1664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1878F, 1.4447F, 4.7993F, 0.25F, 0.2635F, 1.32F));

		PartDefinition cube_r18 = bone2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(43, 111).addBox(-1.3268F, -0.8724F, 0.2448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(111, 28).addBox(-0.9268F, -0.8724F, 0.2448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1878F, 1.4447F, 4.7993F, 0.2662F, 0.4323F, 1.3674F));

		PartDefinition cube_r19 = bone2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(23, 111).addBox(-0.7405F, -0.8724F, -0.063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1878F, 1.4447F, 4.7993F, 0.6364F, 1.1572F, 1.8485F));

		PartDefinition cube_r20 = bone2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(50, 25).addBox(-0.6405F, -0.8724F, -0.063F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1878F, 1.4447F, 4.7993F, -2.8368F, 1.2623F, -1.5886F));

		PartDefinition cube_r21 = bone2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(51, 58).addBox(-0.375F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.2508F, 2.5146F, 1.7289F, 0.5195F, 1.3571F, 1.4905F));

		PartDefinition cube_r22 = bone2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(38, 104).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3477F, 1.2197F, 2.5636F, -0.2866F, 1.2426F, 0.9898F));

		PartDefinition cube_r23 = bone2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(104, 35).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.7942F, 2.4774F, 2.0956F, -3.0405F, 0.4446F, -1.8362F));

		PartDefinition cube_r24 = bone2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(33, 104).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8301F, 2.2943F, 1.1131F, -2.6313F, 1.3831F, -1.3771F));

		PartDefinition cube_r25 = bone2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(69, 63).addBox(-0.875F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5721F, 1.3376F, 0.6193F, -0.1661F, 0.9869F, 1.1229F));

		PartDefinition cube_r26 = bone2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(68, 43).addBox(-0.5215F, -0.8675F, -0.7976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0332F, 0.7294F, 0.1764F, -0.1223F, 0.7277F, 1.1802F));

		PartDefinition cube_r27 = bone2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(68, 28).addBox(-0.6882F, -0.8675F, -1.4886F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0332F, 0.7294F, 0.1764F, -0.1023F, 0.4675F, 1.2156F));

		PartDefinition cube_r28 = bone2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(79, 16).addBox(-0.4F, -0.5F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.123F, -0.714F, -1.2559F, -0.4002F, 0.5528F, 0.698F));

		PartDefinition cube_r29 = bone2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(79, 12).addBox(0.1988F, -0.5493F, -1.7201F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.4006F, -0.453F, -0.3263F, -0.4708F, 0.7509F, 0.5824F));

		PartDefinition cube_r30 = bone2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(44, 40).addBox(-0.35F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2589F, -0.353F, -1.4932F, -0.3507F, 0.2642F, 0.8214F));

		PartDefinition cube_r31 = bone2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(111, 9).addBox(0.7397F, -0.2462F, -3.4833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4006F, -0.453F, -0.3263F, -0.7971F, 0.7579F, 0.3679F));

		PartDefinition cube_r32 = bone2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(47, 50).addBox(-3.685F, -0.0626F, -0.9194F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4006F, -0.453F, -0.3263F, -1.7215F, -0.9471F, 2.4408F));

		PartDefinition cube_r33 = bone2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(51, 79).addBox(-5.3222F, -0.0626F, -1.0925F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4006F, -0.453F, -0.3263F, -1.6609F, -0.9523F, 2.3663F));

		PartDefinition cube_r34 = bone2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(99, 43).addBox(-2.9646F, -0.0626F, 3.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4006F, -0.453F, -0.3263F, -2.4624F, -0.4047F, -2.7644F));

		PartDefinition cube_r35 = bone2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(26, 58).addBox(1.0328F, -0.2462F, 1.8093F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4006F, -0.453F, -0.3263F, -2.5546F, 0.3541F, -1.9339F));

		PartDefinition cube_r36 = bone2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(101, 52).addBox(-3.5375F, -0.2462F, -0.8199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4006F, -0.453F, -0.3263F, -0.6635F, -0.5669F, 1.3785F));

		PartDefinition cube_r37 = bone2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(111, 21).addBox(-2.4239F, -0.2462F, -1.8438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.4006F, -0.453F, -0.3263F, -0.565F, -0.2443F, 1.1332F));

		PartDefinition cube_r38 = bone2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(50, 28).addBox(-2.5169F, -0.2462F, 0.5797F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4006F, -0.453F, -0.3263F, -2.243F, -0.8447F, -2.9148F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7318F, 1.6393F, -0.0283F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r39 = bone4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(101, 99).mirror().addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-0.1016F, 0.221F, 1.8072F, -0.6503F, 1.4197F, -1.9066F));

		PartDefinition cube_r40 = bone4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(101, 96).mirror().addBox(-0.225F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3658F, 0.9537F, 1.4915F, -0.0913F, 0.0103F, -1.2627F));

		PartDefinition cube_r41 = bone4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(20, 101).mirror().addBox(-0.4F, -0.5F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1497F, 0.7474F, 3.0557F, -2.9702F, -1.0072F, 1.7345F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(56, 12).mirror().addBox(-1.5533F, -0.2321F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6989F, 2.4043F, 4.5704F, 1.1483F, -0.4855F, -2.5309F));

		PartDefinition cube_r43 = bone4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(54, 32).mirror().addBox(-1.5533F, -0.7679F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.6989F, 2.4043F, 4.5704F, 1.0015F, -0.8328F, -2.2955F));

		PartDefinition cube_r44 = bone4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(111, 96).mirror().addBox(-1.2266F, -0.8724F, -1.0672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1878F, 1.4447F, 4.7993F, 1.7077F, 1.3273F, 0.4582F));

		PartDefinition cube_r45 = bone4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(111, 70).mirror().addBox(-1.5375F, -0.8724F, 0.5287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1878F, 1.4447F, 4.7993F, 0.2821F, 0.5395F, -1.1058F));

		PartDefinition cube_r46 = bone4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(111, 48).mirror().addBox(0.0883F, -0.8724F, 1.1664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1878F, 1.4447F, 4.7993F, 0.25F, -0.2635F, -1.32F));

		PartDefinition cube_r47 = bone4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(43, 111).mirror().addBox(0.3268F, -0.8724F, 0.2448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(111, 28).mirror().addBox(-0.0732F, -0.8724F, 0.2448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1878F, 1.4447F, 4.7993F, 0.2662F, -0.4323F, -1.3674F));

		PartDefinition cube_r48 = bone4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(23, 111).mirror().addBox(-0.2595F, -0.8724F, -0.063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.1878F, 1.4447F, 4.7993F, 0.6364F, -1.1572F, -1.8485F));

		PartDefinition cube_r49 = bone4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(50, 25).mirror().addBox(-3.3595F, -0.8724F, -0.063F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1878F, 1.4447F, 4.7993F, -2.8368F, -1.2623F, 1.5886F));

		PartDefinition cube_r50 = bone4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(51, 58).mirror().addBox(-0.625F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.2508F, 2.5146F, 1.7289F, 0.5195F, -1.3571F, -1.4905F));

		PartDefinition cube_r51 = bone4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(38, 104).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3477F, 1.2197F, 2.5636F, -0.2866F, -1.2426F, -0.9898F));

		PartDefinition cube_r52 = bone4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(104, 35).mirror().addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.7942F, 2.4774F, 2.0956F, -3.0405F, -0.4446F, 1.8362F));

		PartDefinition cube_r53 = bone4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(33, 104).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8301F, 2.2943F, 1.1131F, -2.6313F, -1.3831F, 1.3771F));

		PartDefinition cube_r54 = bone4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(69, 63).mirror().addBox(-0.125F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5721F, 1.3376F, 0.6193F, -0.1661F, -0.9869F, -1.1229F));

		PartDefinition cube_r55 = bone4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(68, 43).mirror().addBox(-0.4785F, -0.8675F, -0.7976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.0332F, 0.7294F, 0.1764F, -0.1223F, -0.7277F, -1.1802F));

		PartDefinition cube_r56 = bone4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(68, 28).mirror().addBox(-0.3118F, -0.8675F, -1.4886F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0332F, 0.7294F, 0.1764F, -0.1023F, -0.4675F, -1.2156F));

		PartDefinition cube_r57 = bone4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(79, 16).mirror().addBox(-0.6F, -0.5F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.123F, -0.714F, -1.2559F, -0.4002F, -0.5528F, -0.698F));

		PartDefinition cube_r58 = bone4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(79, 12).mirror().addBox(-1.1988F, -0.5493F, -1.7201F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.4006F, -0.453F, -0.3263F, -0.4708F, -0.7509F, -0.5824F));

		PartDefinition cube_r59 = bone4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(44, 40).mirror().addBox(-0.65F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.2589F, -0.353F, -1.4932F, -0.3507F, -0.2642F, -0.8214F));

		PartDefinition cube_r60 = bone4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(111, 9).mirror().addBox(-1.7397F, -0.2462F, -3.4833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4006F, -0.453F, -0.3263F, -0.7971F, -0.7579F, -0.3679F));

		PartDefinition cube_r61 = bone4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(47, 50).mirror().addBox(1.685F, -0.0626F, -0.9194F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.4006F, -0.453F, -0.3263F, -1.7215F, 0.9471F, -2.4408F));

		PartDefinition cube_r62 = bone4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(51, 79).mirror().addBox(3.3222F, -0.0626F, -1.0925F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4006F, -0.453F, -0.3263F, -1.6609F, 0.9523F, -2.3663F));

		PartDefinition cube_r63 = bone4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(99, 43).mirror().addBox(1.9646F, -0.0626F, 3.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.4006F, -0.453F, -0.3263F, -2.4624F, 0.4047F, 2.7644F));

		PartDefinition cube_r64 = bone4.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(26, 58).mirror().addBox(-3.0328F, -0.2462F, 1.8093F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.4006F, -0.453F, -0.3263F, -2.5546F, -0.3541F, 1.9339F));

		PartDefinition cube_r65 = bone4.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(101, 52).mirror().addBox(2.5375F, -0.2462F, -0.8199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.4006F, -0.453F, -0.3263F, -0.6635F, 0.5669F, -1.3785F));

		PartDefinition cube_r66 = bone4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(111, 21).mirror().addBox(1.4239F, -0.2462F, -1.8438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.4006F, -0.453F, -0.3263F, -0.565F, 0.2443F, -1.1332F));

		PartDefinition cube_r67 = bone4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(50, 28).mirror().addBox(0.5169F, -0.2462F, 0.5797F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.4006F, -0.453F, -0.3263F, -2.243F, 0.8447F, 2.9148F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8F, 3.7503F, 2.1399F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftLeg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(61, 24).addBox(-1.0F, -1.5F, -0.325F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.0123F)), PartPose.offsetAndRotation(0.0F, 5.6861F, -0.545F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(70, 67).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 4.2691F, -1.1042F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftLeg.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 52).addBox(-1.0F, -1.0F, -1.1F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 1.4221F, 0.1786F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftLeg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(51, 0).addBox(-1.0F, -0.125F, -0.95F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2597F, 0.3056F, -0.0742F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftLeg.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(66, 82).addBox(-1.0F, 0.15F, -0.525F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.0F, -0.8555F, -0.7177F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftLeg.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(7, 70).addBox(-1.0F, -0.825F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.1511F, -0.766F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftLeg.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(104, 41).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0282F, 0.5965F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftLeg.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(104, 38).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2788F, -0.6028F, -1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftLeg.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(104, 44).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.8506F, -0.2138F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftLeg.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(25, 102).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.2545F, 0.3235F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftLeg.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(55, 101).addBox(-0.5F, 3.54F, 1.4657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.0684F, -1.0302F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftLeg.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(82, 60).addBox(-1.0F, 0.7386F, 0.1064F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 6.6684F, -1.3302F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftLeg.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(44, 58).addBox(-1.0F, -1.65F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 7.4772F, -1.5222F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftLeg.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(51, 75).addBox(-1.0F, -1.0F, -0.55F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.4676F, -0.5239F, -1.9897F, 0.0F, 0.0F));

		PartDefinition cube_r82 = leftLeg.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(45, 91).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0895F, 1.2285F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r83 = leftLeg.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(90, 91).addBox(-1.0F, -0.625F, 0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 8.0874F, 0.4693F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r84 = leftLeg.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(59, 82).addBox(-1.0F, -0.65F, 0.125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 7.8882F, -0.2736F, -0.4014F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.3906F, 0.7456F, 1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r85 = leftLeg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(63, 67).addBox(-1.0F, 0.3F, -0.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.204F, -0.4567F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r86 = leftLeg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(29, 50).addBox(-1.0F, -0.9F, -1.575F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.4984F, 0.8262F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r87 = leftLeg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(80, 28).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.7521F, 1.898F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r88 = leftLeg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(99, 49).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 1.4018F, 0.8279F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r89 = leftLeg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(15, 100).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.179F, 0.1985F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r90 = leftLeg2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(75, 25).addBox(-0.5F, -3.5F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.6248F, 0.0697F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r91 = leftLeg2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(9, 63).addBox(-0.5F, -5.0F, -0.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.56F, -0.971F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r92 = leftLeg2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(79, 31).addBox(-0.5F, 0.2F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 2.7767F, 0.7733F, -2.1118F, 0.0F, 0.0F));

		PartDefinition cube_r93 = leftLeg2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(33, 35).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.0743F, -0.8029F, -1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r94 = leftLeg2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(22, 41).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.0781F, -0.6808F, -1.6319F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.1431F, -1.3372F, -1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r95 = leftLeg3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(84, 66).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.025F)), PartPose.offsetAndRotation(0.0F, -1.3326F, 0.2802F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r96 = leftLeg3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(68, 47).addBox(-1.0F, -2.7136F, -0.8894F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.5F, 1.4236F, 0.4388F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r97 = leftLeg3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(0, 42).addBox(-1.0F, -0.1857F, -1.0115F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -0.1764F, 0.3388F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftLeg3.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0116F, 7.7708F, -0.2326F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r98 = leftArm5.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(36, 75).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4917F, 3.8897F, -0.0794F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r99 = leftArm5.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(31, 75).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3684F, 3.8897F, -0.0794F, 0.0F, 0.0F, -0.0873F));

		PartDefinition leftHoof = leftArm5.addOrReplaceChild("leftHoof", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4794F, 3.6267F, 0.0234F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r100 = leftHoof.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(98, 111).addBox(-0.6587F, -0.1283F, -1.1197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9945F, 0.0F, -0.5F, 0.4943F, -0.2578F, -0.1202F));

		PartDefinition cube_r101 = leftHoof.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(88, 110).addBox(-0.5883F, -0.1283F, -0.5234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.9945F, 0.0F, -0.5F, 0.4777F, -0.0647F, -0.0171F));

		PartDefinition cube_r102 = leftHoof.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(12, 78).addBox(-0.4643F, -0.1075F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.9945F, 0.0F, -0.5F, 0.4794F, -0.1035F, -0.0373F));

		PartDefinition cube_r103 = leftHoof.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(79, 4).addBox(-0.5482F, -0.1064F, -1.2003F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.4794F, 0.1035F, 0.0373F));

		PartDefinition cube_r104 = leftHoof.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(80, 109).addBox(-0.3992F, -0.1293F, -0.5237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.4777F, 0.0647F, 0.0171F));

		PartDefinition cube_r105 = leftHoof.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(103, 111).addBox(-0.329F, -0.1293F, -1.1173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.4943F, 0.2578F, 0.1202F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8F, 3.7503F, 2.1399F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(49, 66).addBox(-1.0F, -1.5F, -0.325F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.0123F)), PartPose.offsetAndRotation(0.0F, 5.6861F, -0.545F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(24, 75).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 4.2691F, -1.1042F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(58, 0).addBox(-1.0F, -1.0F, -1.1F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 1.4221F, 0.1786F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(0, 58).addBox(-1.0F, -0.125F, -0.95F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2597F, 0.3056F, -0.0742F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(89, 55).addBox(-1.0F, 0.15F, -0.525F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.0F, -0.8555F, -0.7177F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightLeg.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(75, 21).addBox(-1.0F, -0.825F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.1511F, -0.766F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightLeg.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(107, 61).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0282F, 0.5965F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r113 = rightLeg.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(58, 107).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2788F, -0.6028F, -1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r114 = rightLeg.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(53, 107).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.8506F, -0.2138F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r115 = rightLeg.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(48, 107).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.2545F, 0.3235F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r116 = rightLeg.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(60, 101).addBox(-0.5F, 3.54F, 1.4657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.0684F, -1.0302F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r117 = rightLeg.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(31, 89).addBox(-1.0F, 0.7386F, 0.1064F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 6.6684F, -1.3302F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r118 = rightLeg.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(42, 66).addBox(-1.0F, -1.65F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 7.4772F, -1.5222F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r119 = rightLeg.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(76, 63).addBox(-1.0F, -1.0F, -0.55F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.4676F, -0.5239F, -1.9897F, 0.0F, 0.0F));

		PartDefinition cube_r120 = rightLeg.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(69, 91).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0895F, 1.2285F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r121 = rightLeg.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(31, 92).addBox(-1.0F, -0.625F, 0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 8.0874F, 0.4693F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r122 = rightLeg.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(89, 19).addBox(-1.0F, -0.65F, 0.125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 7.8882F, -0.2736F, -0.4014F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.3906F, 0.7456F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r123 = rightLeg2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(68, 24).addBox(-1.0F, 0.3F, -0.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.204F, -0.4567F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r124 = rightLeg2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(38, 50).addBox(-1.0F, -0.9F, -1.575F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.4984F, 0.8262F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r125 = rightLeg2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(80, 45).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.7521F, 1.898F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r126 = rightLeg2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(99, 70).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 1.4018F, 0.8279F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r127 = rightLeg2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(85, 100).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.179F, 0.1985F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r128 = rightLeg2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(75, 40).addBox(-0.5F, -3.5F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.6248F, 0.0697F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r129 = rightLeg2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(14, 67).addBox(-0.5F, -5.0F, -0.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.56F, -0.971F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r130 = rightLeg2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(79, 35).addBox(-0.5F, 0.2F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 2.7767F, 0.7733F, -2.1118F, 0.0F, 0.0F));

		PartDefinition cube_r131 = rightLeg2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(39, 27).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.0743F, -0.8029F, -1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r132 = rightLeg2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(33, 41).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.0781F, -0.6808F, -1.6319F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.1431F, -1.3372F, -1.5776F, -0.002F, 0.0221F));

		PartDefinition cube_r133 = rightLeg3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(89, 58).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.025F)), PartPose.offsetAndRotation(0.0F, -1.3326F, 0.2802F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r134 = rightLeg3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(68, 53).addBox(0.0F, -2.7136F, -0.8894F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.5F, 1.4236F, 0.4388F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r135 = rightLeg3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(5, 42).addBox(0.0F, -0.1857F, -1.0115F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.1764F, 0.3388F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightLeg3.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0116F, 7.7708F, -0.2326F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r136 = rightArm5.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(46, 75).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4917F, 3.8897F, -0.0794F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r137 = rightArm5.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(41, 75).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3684F, 3.8897F, -0.0794F, 0.0F, 0.0F, 0.0873F));

		PartDefinition rightHoof = rightArm5.addOrReplaceChild("rightHoof", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4794F, 3.6267F, 0.0234F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r138 = rightHoof.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(111, 99).addBox(-0.3413F, -0.1283F, -1.1197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9945F, 0.0F, -0.5F, 0.4943F, 0.2578F, 0.1202F));

		PartDefinition cube_r139 = rightHoof.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(111, 6).addBox(-0.4117F, -0.1283F, -0.5234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.9945F, 0.0F, -0.5F, 0.4777F, 0.0647F, 0.0171F));

		PartDefinition cube_r140 = rightHoof.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(79, 0).addBox(-0.5357F, -0.1075F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.9945F, 0.0F, -0.5F, 0.4794F, 0.1035F, 0.0373F));

		PartDefinition cube_r141 = rightHoof.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(79, 8).addBox(-0.4518F, -0.1064F, -1.2003F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.4794F, -0.1035F, -0.0373F));

		PartDefinition cube_r142 = rightHoof.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(109, 82).addBox(-0.6008F, -0.1293F, -0.5237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.4777F, -0.0647F, -0.0171F));

		PartDefinition cube_r143 = rightHoof.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(108, 111).addBox(-0.671F, -0.1293F, -1.1173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.4943F, -0.2578F, -0.1202F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(102, 57).addBox(0.0F, -2.8388F, -3.918F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3528F, -3.2386F, -0.1136F, 0.0434F, -0.0049F));

		PartDefinition cube_r144 = body2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(102, 76).addBox(0.0F, -2.2251F, -1.017F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4817F, -0.9002F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r145 = body2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(71, 100).mirror().addBox(-0.6078F, -0.6036F, -0.6209F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5753F, -0.602F, -5.4552F, -2.9409F, 0.0F, -1.885F));

		PartDefinition cube_r146 = body2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(39, 113).mirror().addBox(-0.5078F, -0.3036F, -0.6209F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1151F, -0.7516F, -7.3958F, -3.0718F, 0.0F, -1.885F));

		PartDefinition cube_r147 = body2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(15, 108).mirror().addBox(0.0F, -0.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4675F, 0.0075F, -3.308F, -2.9679F, 0.0491F, -1.8803F));

		PartDefinition cube_r148 = body2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(85, 109).mirror().addBox(0.0F, -0.1F, -0.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0026F, -1.2198F, -2.9888F, 0.0829F, -1.8741F));

		PartDefinition cube_r149 = body2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(85, 109).addBox(0.0F, -0.1F, -0.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0026F, -1.2198F, -2.9888F, -0.0829F, 1.8741F));

		PartDefinition cube_r150 = body2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(15, 108).addBox(0.0F, -0.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4675F, 0.0075F, -3.308F, -2.9679F, -0.0491F, 1.8803F));

		PartDefinition cube_r151 = body2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(39, 113).addBox(0.5078F, -0.3036F, -0.6209F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1152F, -0.7516F, -7.3958F, -3.0718F, 0.0F, 1.885F));

		PartDefinition cube_r152 = body2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(71, 100).addBox(0.6078F, -0.6036F, -0.6209F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5753F, -0.602F, -5.4552F, -2.9409F, 0.0F, 1.885F));

		PartDefinition cube_r153 = body2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(47, 100).addBox(-0.5753F, -2.3245F, -0.4826F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5753F, -0.602F, -5.4552F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r154 = body2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(30, 102).addBox(-0.4485F, -2.3641F, -0.1742F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4485F, -0.6806F, -7.7242F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r155 = body2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.1F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -6.9F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2814F, -7.8925F, 0.0694F, 0.0841F, 0.0494F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(98, 0).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.0707F, -5.4048F, 0.116F, 0.2946F, -0.8484F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(34, 4).mirror().addBox(-10.0551F, -2.1982F, -0.4625F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.0707F, -5.4048F, -0.0377F, 0.3138F, -1.3515F));

		PartDefinition cube_r158 = body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(98, 2).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.0707F, -5.4048F, 0.1893F, 0.2545F, -0.5795F));

		PartDefinition cube_r159 = body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(34, 6).mirror().addBox(-8.8656F, -2.2434F, -0.4174F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, -0.0255F, 0.3649F, -1.3475F));

		PartDefinition cube_r160 = body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(89, 69).mirror().addBox(-3.5988F, -0.6501F, -0.4174F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, 0.1526F, 0.3337F, -0.8371F));

		PartDefinition cube_r161 = body.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(93, 4).mirror().addBox(-1.7126F, -0.2141F, -0.4174F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, 0.2349F, 0.283F, -0.5674F));

		PartDefinition cube_r162 = body.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(51, 18).mirror().addBox(-6.8655F, -2.2335F, -0.4096F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, -0.0244F, 0.4003F, -1.3991F));

		PartDefinition cube_r163 = body.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(96, 68).mirror().addBox(-3.5942F, -0.6413F, -0.4096F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, 0.172F, 0.364F, -0.8824F));

		PartDefinition cube_r164 = body.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(94, 26).mirror().addBox(-1.7058F, -0.2069F, -0.4096F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, 0.2618F, 0.3073F, -0.6116F));

		PartDefinition cube_r165 = body.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(94, 26).addBox(-0.2942F, -0.2069F, -0.4096F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, 0.2618F, -0.3073F, 0.6116F));

		PartDefinition cube_r166 = body.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(96, 68).addBox(1.5942F, -0.6413F, -0.4096F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, 0.172F, -0.364F, 0.8824F));

		PartDefinition cube_r167 = body.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(51, 18).addBox(2.8655F, -2.2335F, -0.4096F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, -0.0244F, -0.4003F, 1.3991F));

		PartDefinition cube_r168 = body.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(93, 4).addBox(-0.2874F, -0.2141F, -0.4174F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, 0.2349F, -0.283F, 0.5674F));

		PartDefinition cube_r169 = body.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(89, 69).addBox(1.5988F, -0.6501F, -0.4174F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, 0.1526F, -0.3337F, 0.8371F));

		PartDefinition cube_r170 = body.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(34, 6).addBox(2.8656F, -2.2434F, -0.4174F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, -0.0255F, -0.3649F, 1.3475F));

		PartDefinition cube_r171 = body.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(98, 2).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.0707F, -5.4048F, 0.1893F, -0.2545F, 0.5795F));

		PartDefinition cube_r172 = body.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(34, 4).addBox(3.0551F, -2.1982F, -0.4625F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.0707F, -5.4048F, -0.0377F, -0.3138F, 1.3515F));

		PartDefinition cube_r173 = body.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(98, 0).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.0707F, -5.4048F, 0.116F, -0.2946F, 0.8484F));

		PartDefinition cube_r174 = body.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -0.3F, -7.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.2135F, 0.1404F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r175 = body.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(100, 102).addBox(0.0F, -2.8189F, -0.146F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1832F, -1.8045F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r176 = body.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(65, 101).addBox(0.0F, -2.9938F, -0.046F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1865F, -3.8596F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r177 = body.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(98, 12).addBox(0.0F, -3.4198F, -0.0541F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5865F, -5.9596F, -0.0175F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(72, 94).addBox(0.0F, -3.9417F, -0.9621F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3529F, -6.8577F, -0.0159F, 0.0442F, 0.0342F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(98, 6).addBox(0.0F, -4.4213F, -0.1497F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9735F, -2.7877F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(103, 30).addBox(-0.005F, -3.7103F, -0.2312F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6985F, -4.6627F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(33, 113).addBox(0.0F, -0.7463F, -0.0997F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6985F, -4.6627F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(43, 21).mirror().addBox(-0.8F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.635F, 12.0543F, -2.9162F, -0.3366F, -0.2797F, -2.7656F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(38, 16).mirror().addBox(-0.6F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4309F, 11.7937F, -0.8874F, -0.255F, -0.2821F, -2.9123F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(96, 19).mirror().addBox(-1.7864F, 0.0325F, -0.7263F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4485F, -3.7877F, 0.0901F, 0.1948F, -0.6275F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(97, 87).mirror().addBox(-3.734F, -0.431F, -0.7263F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4485F, -3.7877F, 0.036F, 0.2114F, -0.8943F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(34, 0).mirror().addBox(-10.0866F, -2.1114F, -0.7263F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4485F, -3.7877F, -0.0671F, 0.2038F, -1.385F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(96, 55).mirror().addBox(-2.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1485F, -2.5877F, 0.1377F, 0.2194F, -0.5393F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(97, 89).mirror().addBox(-4.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1485F, -2.5877F, 0.0754F, 0.2475F, -0.8069F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(17, 19).mirror().addBox(-11.1393F, -2.68F, -0.1571F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1485F, -2.5877F, -0.0499F, 0.2537F, -1.3026F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(96, 66).mirror().addBox(-2.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4985F, -0.6877F, 0.1762F, 0.2417F, -0.5305F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(19, 17).mirror().addBox(-11.1393F, -2.68F, -0.1571F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4985F, -0.6877F, -0.0378F, 0.2958F, -1.2994F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(97, 91).mirror().addBox(-4.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4985F, -0.6877F, 0.1068F, 0.2788F, -0.7988F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(40, 8).mirror().addBox(0.0F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1025F, 11.5511F, 1.1034F, -0.2735F, -0.319F, -2.8451F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(39, 33).mirror().addBox(-0.7F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2753F, 10.9335F, 3.2455F, -0.3378F, -0.3057F, -2.6187F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(34, 2).mirror().addBox(0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2753F, 10.9335F, 3.2455F, -0.4416F, -0.4953F, -2.3707F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(19, 8).mirror().addBox(-0.1F, 0.0F, 0.0F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2753F, 10.9335F, 3.2455F, -0.6331F, -0.5992F, -2.0909F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(97, 91).addBox(2.0433F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4985F, -0.6877F, 0.1068F, -0.2788F, 0.7988F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(19, 17).addBox(3.1393F, -2.68F, -0.1571F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4985F, -0.6877F, -0.0378F, -0.2958F, 1.2994F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(96, 66).addBox(0.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4985F, -0.6877F, 0.1762F, -0.2417F, 0.5305F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(17, 19).addBox(3.1393F, -2.68F, -0.1571F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1485F, -2.5877F, -0.0499F, -0.2537F, 1.3026F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(97, 89).addBox(2.0433F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1485F, -2.5877F, 0.0754F, -0.2475F, 0.8069F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(96, 55).addBox(0.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1485F, -2.5877F, 0.1377F, -0.2194F, 0.5393F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(34, 0).addBox(3.0866F, -2.1114F, -0.7263F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4485F, -3.7877F, -0.0671F, -0.2038F, 1.385F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(97, 87).addBox(1.734F, -0.431F, -0.7263F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4485F, -3.7877F, 0.036F, -0.2114F, 0.8943F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(96, 19).addBox(-0.2136F, 0.0325F, -0.7263F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4485F, -3.7877F, 0.0901F, -0.1948F, 0.6275F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(19, 8).addBox(-8.9F, 0.0F, 0.0F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2753F, 10.9335F, 3.2455F, -0.6331F, 0.5992F, 2.0909F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(34, 2).addBox(-7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2753F, 10.9335F, 3.2455F, -0.4416F, 0.4953F, 2.3707F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(39, 33).addBox(-5.3F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2753F, 10.9335F, 3.2455F, -0.3378F, 0.3057F, 2.6187F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(40, 8).addBox(-6.0F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1025F, 11.5511F, 1.1034F, -0.2735F, 0.319F, 2.8451F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(38, 16).addBox(-5.4F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4309F, 11.7937F, -0.8874F, -0.255F, 0.2821F, 2.9123F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(43, 21).addBox(-4.2F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.635F, 12.0543F, -2.9162F, -0.3366F, 0.2797F, 2.7656F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(13, 28).addBox(-0.5F, -0.4F, -4.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0935F, -0.8312F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(26, 28).addBox(-0.5F, -0.8737F, -0.0057F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 12.2999F, -0.1132F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(11, 41).addBox(-0.5F, -0.8737F, -0.0057F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 12.718F, -4.0913F, 0.1047F, 0.0F, 0.0F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2535F, -4.7696F, 0.3503F, 0.082F, 0.0299F));

		PartDefinition cube_r214 = chest2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(15, 103).addBox(-0.005F, -5.0235F, -0.4903F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -3.9F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r215 = chest2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(51, 113).addBox(0.0F, -2.0848F, -0.0505F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -3.9F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r216 = chest2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(99, 57).addBox(-0.005F, -4.4042F, -0.2399F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.45F, -1.95F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r217 = chest2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(48, 113).addBox(0.0F, -1.4389F, -0.0636F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.45F, -1.95F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r218 = chest2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(36, 19).mirror().addBox(-9.0781F, -2.659F, -0.4744F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.1102F, -0.134F, -1.4473F));

		PartDefinition cube_r219 = chest2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(49, 6).mirror().addBox(-1.1F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5688F, 9.7478F, -5.0934F, -0.0125F, -0.2735F, -2.8249F));

		PartDefinition cube_r220 = chest2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(53, 15).mirror().addBox(-1.2634F, -0.2563F, -2.7217F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5272F, 10.1748F, -1.1907F, -0.0187F, -0.3678F, -2.8117F));

		PartDefinition cube_r221 = chest2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(94, 53).mirror().addBox(-3.9792F, -0.9206F, -0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.1594F, -0.0683F, -0.9693F));

		PartDefinition cube_r222 = chest2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(94, 75).mirror().addBox(-2.1501F, -0.377F, -0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.1715F, -0.0249F, -0.7108F));

		PartDefinition cube_r223 = chest2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(86, 94).mirror().addBox(-2.2189F, -0.2914F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.1584F, -0.0528F, -0.7563F));

		PartDefinition cube_r224 = chest2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(97, 85).mirror().addBox(-4.0679F, -0.8557F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.1395F, -0.0919F, -1.0159F));

		PartDefinition cube_r225 = chest2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(43, 23).mirror().addBox(-8.1866F, -2.6424F, -0.3998F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.0814F, -0.1458F, -1.4963F));

		PartDefinition cube_r226 = chest2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(43, 23).addBox(3.1866F, -2.6424F, -0.3998F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.0814F, 0.1458F, 1.4963F));

		PartDefinition cube_r227 = chest2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(97, 85).addBox(2.0679F, -0.8557F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.1395F, 0.0919F, 1.0159F));

		PartDefinition cube_r228 = chest2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(86, 94).addBox(0.2189F, -0.2914F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.1584F, 0.0528F, 0.7563F));

		PartDefinition cube_r229 = chest2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(94, 75).addBox(0.1501F, -0.377F, -0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.1715F, 0.0249F, 0.7108F));

		PartDefinition cube_r230 = chest2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(94, 53).addBox(1.9792F, -0.9206F, -0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.1594F, 0.0683F, 0.9693F));

		PartDefinition cube_r231 = chest2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(53, 15).addBox(-2.7366F, -0.2563F, -2.7217F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5272F, 10.1748F, -1.1907F, -0.0187F, 0.3678F, 2.8117F));

		PartDefinition cube_r232 = chest2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(49, 6).addBox(-2.9F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5688F, 9.7478F, -5.0934F, -0.0125F, 0.2735F, 2.8249F));

		PartDefinition cube_r233 = chest2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(36, 19).addBox(3.0781F, -2.659F, -0.4744F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.1102F, 0.134F, 1.4473F));

		PartDefinition cube_r234 = chest2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(35, 58).addBox(-1.0F, 11.4919F, 0.8473F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.8F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r235 = chest2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(17, 21).addBox(-0.5F, 10.893F, -4.7645F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.8F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r236 = chest2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -0.7357F, -5.7122F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.8F, 0.192F, 0.0F, 0.0F));

		PartDefinition bone = chest2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.731F, 2.3669F, -4.0193F, 0.1522F, 0.204F, -0.264F));

		PartDefinition cube_r237 = bone.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(30, 21).addBox(1.4374F, -3.0434F, -6.583F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9249F, -0.4785F, 2.9521F, 0.7401F, -0.3548F, 0.2451F));

		PartDefinition cube_r238 = bone.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(0, 35).addBox(2.4F, -2.5259F, -2.6985F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-2.9249F, -0.4785F, 2.9521F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r239 = bone.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(99, 46).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0249F, 3.069F, -2.914F, 1.405F, 0.0F, 0.0F));

		PartDefinition cube_r240 = bone.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(61, 44).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0249F, -1.9565F, 4.0861F, -2.4958F, 0.0F, 0.0F));

		PartDefinition cube_r241 = bone.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(104, 19).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0249F, -3.9851F, 2.6899F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r242 = bone.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(18, 104).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0249F, -4.267F, 1.7253F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r243 = bone.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(10, 104).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0249F, -3.8955F, 1.3907F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r244 = bone.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(38, 93).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0249F, -3.2798F, 0.6027F, -2.4784F, 0.0F, 0.0F));

		PartDefinition cube_r245 = bone.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(77, 67).addBox(-0.5F, 0.4F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(5, 104).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0249F, -2.126F, -0.1903F, 2.5395F, 0.0F, 0.0F));

		PartDefinition cube_r246 = bone.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(0, 104).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0249F, -1.5042F, 0.217F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r247 = bone.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(0, 67).addBox(-0.5F, -1.2F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0249F, -1.032F, 0.771F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r248 = bone.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(22, 35).addBox(2.4F, -2.8499F, -6.8635F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.9249F, -0.4785F, 2.9521F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r249 = bone.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(10, 47).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0249F, -1.3346F, 3.7528F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r250 = bone.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(103, 93).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0249F, 0.5082F, 2.5316F, -2.4086F, 0.0F, 0.0F));

		PartDefinition cube_r251 = bone.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(103, 102).addBox(-0.5F, -1.65F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(84, 103).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0249F, -0.9041F, 2.6056F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r252 = bone.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(72, 32).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0249F, 0.9229F, 1.6217F, -1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r253 = bone.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(67, 94).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0249F, 0.9229F, 1.6217F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r254 = bone.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(44, 45).addBox(-0.5F, -1.0F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.0249F, 1.1914F, 0.7568F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r255 = bone.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(11, 35).addBox(-0.5F, 0.05F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0249F, 0.6339F, -0.7383F, 0.6458F, 0.0F, 0.0F));

		PartDefinition bone3 = chest2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.731F, 2.3669F, -4.0193F, 0.1522F, -0.204F, 0.264F));

		PartDefinition cube_r256 = bone3.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(30, 21).mirror().addBox(-2.4374F, -3.0434F, -6.583F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.9249F, -0.4785F, 2.9521F, 0.7401F, 0.3548F, -0.2451F));

		PartDefinition cube_r257 = bone3.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-3.4F, -2.5259F, -2.6985F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(2.9249F, -0.4785F, 2.9521F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r258 = bone3.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(99, 46).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0249F, 3.069F, -2.914F, 1.405F, 0.0F, 0.0F));

		PartDefinition cube_r259 = bone3.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(61, 44).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0249F, -1.9565F, 4.0861F, -2.4958F, 0.0F, 0.0F));

		PartDefinition cube_r260 = bone3.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(104, 19).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0249F, -3.9851F, 2.6899F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r261 = bone3.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(18, 104).mirror().addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0249F, -4.267F, 1.7253F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r262 = bone3.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(10, 104).mirror().addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0249F, -3.8955F, 1.3907F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r263 = bone3.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(38, 93).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0249F, -3.2798F, 0.6027F, -2.4784F, 0.0F, 0.0F));

		PartDefinition cube_r264 = bone3.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(77, 67).mirror().addBox(-0.5F, 0.4F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(5, 104).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0249F, -2.126F, -0.1903F, 2.5395F, 0.0F, 0.0F));

		PartDefinition cube_r265 = bone3.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(0, 104).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0249F, -1.5042F, 0.217F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r266 = bone3.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.5F, -1.2F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0249F, -1.032F, 0.771F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r267 = bone3.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(22, 35).mirror().addBox(-3.4F, -2.8499F, -6.8635F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(2.9249F, -0.4785F, 2.9521F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r268 = bone3.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(10, 47).mirror().addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0249F, -1.3346F, 3.7528F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r269 = bone3.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(103, 93).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0249F, 0.5082F, 2.5316F, -2.4086F, 0.0F, 0.0F));

		PartDefinition cube_r270 = bone3.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(103, 102).mirror().addBox(-0.5F, -1.65F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(84, 103).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0249F, -0.9041F, 2.6056F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r271 = bone3.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(72, 32).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0249F, 0.9229F, 1.6217F, -1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r272 = bone3.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(67, 94).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0249F, 0.9229F, 1.6217F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r273 = bone3.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(44, 45).mirror().addBox(-0.5F, -1.0F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.0249F, 1.1914F, 0.7568F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r274 = bone3.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(11, 35).mirror().addBox(-0.5F, 0.05F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0249F, 0.6339F, -0.7383F, 0.6458F, 0.0F, 0.0F));

		PartDefinition leftarm = chest2.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3F, 7.0201F, -7.2897F, 0.6485F, 0.1222F, -0.017F));

		PartDefinition cube_r275 = leftarm.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(94, 71).addBox(-0.0018F, -1.2179F, -0.9854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5117F, -0.4761F, 0.277F, 1.2216F, 0.0012F, -0.0013F));

		PartDefinition cube_r276 = leftarm.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(24, 71).addBox(-0.5F, 0.15F, 0.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0122F, -0.4915F, 1.1964F, -1.728F, 0.0014F, -0.001F));

		PartDefinition cube_r277 = leftarm.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(5, 93).addBox(-0.5F, -0.2F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0113F, 0.1026F, 1.4133F, -0.5935F, 0.0014F, -0.001F));

		PartDefinition cube_r278 = leftarm.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(82, 74).addBox(0.0F, -0.1F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5144F, 0.2216F, -1.1013F, 0.5235F, 0.0014F, -0.001F));

		PartDefinition cube_r279 = leftarm.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(0, 101).addBox(-0.5F, -0.9F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6839F, 0.5183F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r280 = leftarm.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(102, 62).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 5.1862F, 2.2197F, 1.8588F, 0.0F, 0.0F));

		PartDefinition cube_r281 = leftarm.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(19, 71).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.9348F, 0.8263F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r282 = leftarm.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(14, 82).addBox(-0.5F, -0.2F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.297F, 0.9132F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r283 = leftarm.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(73, 82).addBox(-1.0F, -0.475F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 5.9255F, 2.3135F, -1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r284 = leftarm.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(45, 82).addBox(0.0F, -0.1914F, -1.4046F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.3792F, 3.0206F, -0.4014F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1384F, 6.8897F, 1.6767F, -1.6672F, 0.1438F, 0.1165F));

		PartDefinition cube_r285 = leftarm2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(58, 75).addBox(0.0303F, -0.0363F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 4.9029F, 0.1716F, 1.5708F, -1.3265F, -1.5708F));

		PartDefinition cube_r286 = leftarm2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(80, 82).addBox(0.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6064F, 4.8804F, 0.2036F, 1.5708F, -1.4399F, -1.5708F));

		PartDefinition cube_r287 = leftarm2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(82, 79).addBox(0.2889F, -1.2392F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1236F, 2.1144F, 1.0517F, 1.5708F, 0.0785F, -1.5708F));

		PartDefinition cube_r288 = leftarm2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(101, 7).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.1236F, -2.4535F, 1.5822F, -1.5708F, -1.0996F, 1.5708F));

		PartDefinition cube_r289 = leftarm2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(10, 101).addBox(-0.975F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1236F, -1.6029F, 2.0389F, -1.5708F, 0.1658F, 1.5708F));

		PartDefinition cube_r290 = leftarm2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(5, 101).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1236F, -0.6603F, 1.7051F, -1.5708F, -1.2305F, 1.5708F));

		PartDefinition cube_r291 = leftarm2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(0, 80).addBox(-1.95F, -1.25F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.1236F, -0.4558F, 1.8574F, 1.5708F, -0.733F, -1.5708F));

		PartDefinition cube_r292 = leftarm2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(63, 79).addBox(-0.8F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1236F, -1.3222F, 0.7668F, 1.5708F, -0.8639F, -1.5708F));

		PartDefinition cube_r293 = leftarm2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(80, 54).addBox(-1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1236F, 1.2551F, 0.641F, 1.5708F, -0.1658F, -1.5708F));

		PartDefinition cube_r294 = leftarm2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(80, 48).addBox(-1.0F, -0.45F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1236F, 0.2666F, 0.8F, 1.5708F, -0.2094F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(19, 47).addBox(-0.5F, -0.2045F, -0.4286F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1F, 8.8406F, 1.7054F, 1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r295 = leftArm3.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(110, 74).addBox(5.6796F, 1.3667F, -1.3936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(111, 12).addBox(5.6796F, 1.8667F, -1.3936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-5.8147F, 6.801F, 0.4481F, 0.6545F, 0.0F, -0.3054F));

		PartDefinition cube_r296 = leftArm3.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(5, 110).addBox(5.6796F, 2.9849F, -1.3822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-6.4138F, 4.9007F, 0.449F, 0.3054F, 0.0F, -0.3054F));

		PartDefinition cube_r297 = leftArm3.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(53, 39).addBox(6.0558F, -0.1521F, -1.3872F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-6.2157F, 0.8861F, 0.4309F, 0.0799F, -0.0892F, -0.0308F));

		PartDefinition cube_r298 = leftArm3.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(14, 52).addBox(-0.4851F, -0.3079F, -0.7854F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3076F, 0.8861F, 0.4309F, 0.0799F, 0.0892F, 0.0308F));

		PartDefinition cube_r299 = leftArm3.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(0, 110).addBox(-0.3851F, 1.0921F, -0.7854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1094F, 4.9007F, 0.449F, 0.3054F, 0.0F, 0.3054F));

		PartDefinition cube_r300 = leftArm3.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(110, 0).addBox(-0.3851F, 0.2922F, -0.1854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(109, 108).addBox(-0.3851F, -0.2078F, -0.1854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.7086F, 6.801F, 0.4481F, 0.6545F, 0.0F, 0.3054F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(86, 96).addBox(-0.5F, -0.4599F, -0.5794F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 6.9389F, 0.0537F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r301 = leftArm4.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(94, 41).addBox(5.656F, -2.0996F, -0.4488F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-6.5233F, 0.8545F, -0.1306F, 0.0F, 0.0F, 0.2182F));

		PartDefinition cube_r302 = leftArm4.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(94, 22).addBox(-0.4076F, -0.7144F, -0.4488F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8545F, -0.1306F, 0.0F, 0.0F, -0.2182F));

		PartDefinition leftArmHoof = leftArm4.addOrReplaceChild("leftArmHoof", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4794F, 1.8267F, 0.0234F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r303 = leftArmHoof.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(48, 110).addBox(-0.6587F, -0.1283F, -1.1197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9945F, 0.0F, -0.5F, 0.8482F, -0.2013F, -0.2016F));

		PartDefinition cube_r304 = leftArmHoof.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(38, 110).addBox(-0.5883F, -0.1283F, -0.5234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.9945F, 0.0F, -0.5F, 0.8272F, -0.055F, -0.0382F));

		PartDefinition cube_r305 = leftArmHoof.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(63, 75).addBox(-0.4643F, -0.1075F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.9945F, 0.0F, -0.5F, 0.8295F, -0.0845F, -0.0705F));

		PartDefinition cube_r306 = leftArmHoof.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(75, 59).addBox(-0.5482F, -0.1064F, -1.2002F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.8295F, 0.0845F, 0.0705F));

		PartDefinition cube_r307 = leftArmHoof.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(109, 85).addBox(-0.3992F, -0.1293F, -0.5237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.8272F, 0.055F, 0.0382F));

		PartDefinition cube_r308 = leftArmHoof.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(58, 110).addBox(-0.329F, -0.1293F, -1.1173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.8482F, 0.2013F, 0.2016F));

		PartDefinition rightarm = chest2.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3F, 7.0201F, -7.2897F, 0.501F, -0.0675F, 0.2117F));

		PartDefinition cube_r309 = rightarm.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(80, 97).addBox(-0.9982F, -1.2179F, -0.9854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5117F, -0.4761F, 0.277F, 1.2216F, -0.0012F, 0.0013F));

		PartDefinition cube_r310 = rightarm.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(12, 74).addBox(-0.5F, 0.15F, 0.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0122F, -0.4915F, 1.1964F, -1.728F, -0.0014F, 0.001F));

		PartDefinition cube_r311 = rightarm.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(93, 29).addBox(-0.5F, -0.2F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0113F, 0.1026F, 1.4133F, -0.5935F, -0.0014F, 0.001F));

		PartDefinition cube_r312 = rightarm.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(64, 88).addBox(-1.0F, -0.1F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5144F, 0.2216F, -1.1013F, 0.5235F, -0.0014F, 0.001F));

		PartDefinition cube_r313 = rightarm.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(101, 4).addBox(-0.5F, -0.9F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6839F, 0.5183F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r314 = rightarm.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(38, 107).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 5.1862F, 2.2197F, 1.8588F, 0.0F, 0.0F));

		PartDefinition cube_r315 = rightarm.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(74, 10).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.9348F, 0.8263F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r316 = rightarm.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(52, 88).addBox(-0.5F, -0.2F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.297F, 0.9132F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r317 = rightarm.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(45, 88).addBox(-1.0F, -0.475F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 5.9255F, 2.3135F, -1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r318 = rightarm.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(82, 57).addBox(-2.0F, -0.1914F, -1.4046F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.3792F, 3.0206F, -0.4014F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1384F, 6.8897F, 1.6767F, -0.546F, -0.0683F, -0.1118F));

		PartDefinition cube_r319 = rightarm2.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(70, 75).addBox(-1.0303F, -0.0363F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6064F, 4.9029F, 0.1716F, 1.5708F, 1.3265F, 1.5708F));

		PartDefinition cube_r320 = rightarm2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(85, 88).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.6064F, 4.8804F, 0.2036F, 1.5708F, 1.4399F, 1.5708F));

		PartDefinition cube_r321 = rightarm2.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(69, 88).addBox(-2.2889F, -1.2392F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1236F, 2.1144F, 1.0517F, 1.5708F, -0.0785F, 1.5708F));

		PartDefinition cube_r322 = rightarm2.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(101, 16).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.1236F, -2.4535F, 1.5822F, -1.5708F, 1.0996F, -1.5708F));

		PartDefinition cube_r323 = rightarm2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(101, 13).addBox(-0.025F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.1236F, -1.6029F, 2.0389F, -1.5708F, -0.1658F, -1.5708F));

		PartDefinition cube_r324 = rightarm2.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(101, 10).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1236F, -0.6603F, 1.7051F, -1.5708F, 1.2305F, -1.5708F));

		PartDefinition cube_r325 = rightarm2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(80, 25).addBox(-0.05F, -1.25F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.1236F, -0.4558F, 1.8574F, 1.5708F, 0.733F, 1.5708F));

		PartDefinition cube_r326 = rightarm2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(75, 79).addBox(-1.2F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1236F, -1.3222F, 0.7668F, 1.5708F, 0.8639F, 1.5708F));

		PartDefinition cube_r327 = rightarm2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(82, 20).addBox(-0.6F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.1236F, 1.2551F, 0.641F, 1.5708F, 0.1658F, 1.5708F));

		PartDefinition cube_r328 = rightarm2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(80, 51).addBox(-1.0F, -0.45F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1236F, 0.2666F, 0.8F, 1.5708F, 0.2094F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(24, 47).addBox(-0.5F, -0.2045F, -0.4286F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1F, 8.8406F, 1.7054F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r329 = rightArm3.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(111, 3).addBox(-6.6796F, 1.3667F, -1.3936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(111, 15).addBox(-6.6796F, 1.8667F, -1.3936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.8147F, 6.801F, 0.4481F, 0.6545F, 0.0F, 0.3054F));

		PartDefinition cube_r330 = rightArm3.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(33, 110).addBox(-6.6796F, 2.9849F, -1.3822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(6.4138F, 4.9007F, 0.449F, 0.3054F, 0.0F, 0.3054F));

		PartDefinition cube_r331 = rightArm3.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(56, 55).addBox(-7.0558F, -0.1521F, -1.3872F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(6.2157F, 0.8861F, 0.4309F, 0.0799F, 0.0892F, 0.0308F));

		PartDefinition cube_r332 = rightArm3.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(56, 47).addBox(-0.5149F, -0.3079F, -0.7854F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3076F, 0.8861F, 0.4309F, 0.0799F, -0.0892F, -0.0308F));

		PartDefinition cube_r333 = rightArm3.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(28, 110).addBox(-0.6149F, 1.0921F, -0.7854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1094F, 4.9007F, 0.449F, 0.3054F, 0.0F, -0.3054F));

		PartDefinition cube_r334 = rightArm3.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(18, 110).addBox(-0.6149F, 0.2922F, -0.1854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 110).addBox(-0.6149F, -0.2078F, -0.1854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.7086F, 6.801F, 0.4481F, 0.6545F, 0.0F, -0.3054F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(97, 81).addBox(-0.5F, -0.4599F, -0.5794F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 6.9389F, 0.0537F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r335 = rightArm4.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(94, 58).addBox(-6.6559F, -2.0996F, -0.4488F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(6.5233F, 0.8545F, -0.1306F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r336 = rightArm4.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(94, 49).addBox(-0.5923F, -0.7144F, -0.4488F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8545F, -0.1306F, 0.0F, 0.0F, 0.2182F));

		PartDefinition rightArmHoof = rightArm4.addOrReplaceChild("rightArmHoof", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4793F, 1.8267F, 0.0234F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r337 = rightArmHoof.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(110, 53).addBox(-0.3413F, -0.1283F, -1.1197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9945F, 0.0F, -0.5F, 0.8482F, 0.2013F, 0.2016F));

		PartDefinition cube_r338 = rightArmHoof.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(53, 110).addBox(-0.4117F, -0.1283F, -0.5234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.9945F, 0.0F, -0.5F, 0.8272F, 0.055F, 0.0382F));

		PartDefinition cube_r339 = rightArmHoof.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(0, 76).addBox(-0.5357F, -0.1075F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.9945F, 0.0F, -0.5F, 0.8295F, 0.0845F, 0.0705F));

		PartDefinition cube_r340 = rightArmHoof.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(75, 75).addBox(-0.4518F, -0.1064F, -1.2002F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.8295F, -0.0845F, -0.0705F));

		PartDefinition cube_r341 = rightArmHoof.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(109, 88).addBox(-0.6008F, -0.1293F, -0.5237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.8272F, -0.055F, -0.0382F));

		PartDefinition cube_r342 = rightArmHoof.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(73, 110).addBox(-0.671F, -0.1293F, -1.1173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.8482F, -0.2013F, -0.2016F));

		PartDefinition neck3 = chest2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, -4.6F, 0.1671F, 0.1008F, -0.0712F));

		PartDefinition cube_r343 = neck3.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(48, 94).addBox(0.0F, -3.5069F, 0.0627F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7935F, -0.7153F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r344 = neck3.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(36, 113).addBox(0.0F, -2.9F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 35).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.9F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r345 = neck3.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(38, 84).mirror().addBox(-1.8409F, -0.4664F, -0.7174F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.1F, -0.7F, -0.4868F, -0.3941F, -0.9537F));

		PartDefinition cube_r346 = neck3.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(89, 66).mirror().addBox(-3.3108F, -0.9011F, -0.7174F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(110, 56).mirror().addBox(-3.9108F, -0.9011F, -0.7174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.1F, -0.7F, -0.3714F, -0.5037F, -1.2179F));

		PartDefinition cube_r347 = neck3.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(29, 47).mirror().addBox(-3.8F, -0.2F, -0.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0591F, 2.7716F, -2.7045F, 0.0196F, -0.5723F, -1.9308F));

		PartDefinition cube_r348 = neck3.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(38, 84).addBox(-0.1591F, -0.4664F, -0.7174F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, 0.1F, -0.7F, -0.4868F, 0.3941F, 0.9537F));

		PartDefinition cube_r349 = neck3.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(110, 56).addBox(2.9108F, -0.9011F, -0.7174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(89, 66).addBox(1.3108F, -0.9011F, -0.7174F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, 0.1F, -0.7F, -0.3714F, 0.5037F, 1.2179F));

		PartDefinition cube_r350 = neck3.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(29, 47).addBox(-0.2F, -0.2F, -0.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0591F, 2.7716F, -2.7045F, 0.0196F, 0.5723F, 1.9308F));

		PartDefinition neck5 = neck3.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, -2.766F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r351 = neck5.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(40, 47).addBox(0.0F, -0.8F, 0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2226F, -1.6821F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r352 = neck5.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(31, 71).addBox(-0.5F, -0.9F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck2 = neck5.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9205F, -1.7276F, 0.1642F, 0.1437F, -0.064F));

		PartDefinition cube_r353 = neck2.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(53, 47).addBox(0.0F, -0.9431F, 0.9279F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 71).addBox(-0.5F, -0.1681F, 0.9279F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8922F, -1.0543F, -0.9687F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.12F, -0.4555F, -0.4028F, 0.0803F, -0.0342F));

		PartDefinition cube_r354 = neck.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(0, 83).addBox(-0.5F, -1.3753F, -0.4709F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.7015F, -1.5279F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r355 = neck.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(72, 21).addBox(0.0F, -0.7681F, -1.0721F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5841F, -0.7833F, -0.6981F, 0.0F, 0.0F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(93, 94).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5662F, -2.4772F, 1.0119F, 0.037F, -0.0231F));

		PartDefinition cube_r356 = neck4.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(20, 113).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck6 = neck4.addOrReplaceChild("neck6", CubeListBuilder.create().texOffs(27, 95).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(58, 44).addBox(0.0F, -1.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8775F, -0.0007F, -0.0436F, 0.0F, 0.0F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3344F, -0.6725F, -1.0646F, 0.0F, 0.0F));

		PartDefinition cube_r357 = head.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(78, 112).addBox(-0.5F, -0.6908F, -0.8482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(112, 77).addBox(-0.5F, -0.7F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.0F, 7.5405F, -12.2622F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r358 = head.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(99, 21).addBox(-0.5F, -0.6427F, -0.2458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(98, 28).addBox(-0.5F, -0.6427F, 0.1542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 7.5045F, -12.3155F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r359 = head.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(80, 42).addBox(-1.0F, 0.1F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(80, 39).addBox(-1.0F, -0.3F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 5.3716F, -11.1426F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r360 = head.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(19, 10).addBox(-1.0F, -0.9485F, 1.0977F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.303F))
				.texOffs(0, 10).addBox(-1.0F, -0.3485F, -0.3023F, 2.0F, 1.0F, 7.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, 6.7045F, -11.9155F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r361 = head.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(83, 63).addBox(-1.0F, -0.6168F, -0.3751F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.202F, -0.3924F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r362 = head.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(19, 83).addBox(-1.0F, -0.1882F, -0.7452F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -1.202F, -0.3924F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r363 = head.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(104, 47).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6953F, -4.561F, 2.3213F, 0.0F, 0.0F));

		PartDefinition cube_r364 = head.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(14, 62).addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.0653F, -6.8193F, 2.2777F, 0.0F, 0.0F));

		PartDefinition cube_r365 = head.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(19, 56).addBox(0.0F, -0.1F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2692F, -3.2263F, 2.1031F, 0.0F, 0.0F));

		PartDefinition cube_r366 = head.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(65, 6).addBox(0.0F, -0.4F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(61, 59).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.718F, -4.6103F, 2.1904F, 0.0F, 0.0F));

		PartDefinition cube_r367 = head.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(59, 29).addBox(-1.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.276F, -3.7469F, -2.522F, 0.0F, 0.0F));

		PartDefinition cube_r368 = head.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(47, 54).addBox(-1.0F, -2.0F, 1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 54).addBox(-1.0F, -2.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.5106F, -2.7291F, -2.2602F, 0.0F, 0.0F));

		PartDefinition cube_r369 = head.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(29, 54).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.0182F, -1.8675F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r370 = head.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(52, 85).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.6661F, 0.5724F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r371 = head.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(45, 85).addBox(-1.0F, -0.575F, -0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -3.3463F, -0.1353F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r372 = head.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(5, 85).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4205F, -0.5858F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r373 = head.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(59, 71).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -3.0182F, -1.8675F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r374 = head.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(52, 71).addBox(-1.0F, -1.6F, -0.625F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.8993F, 0.0763F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r375 = head.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(32, 95).addBox(-0.5F, -1.0F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.9175F, -0.3189F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r376 = head.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(45, 71).addBox(-1.0F, -1.182F, -0.1476F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.202F, -0.3924F, 0.0524F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5359F, 0.9361F, -6.2987F, 0.0F, -0.0164F, -0.006F));

		PartDefinition cube_r377 = leftFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(106, 96).addBox(-0.7079F, -0.3019F, -0.6228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.4713F, -1.7647F, 4.5893F, -1.8306F, -0.0218F, -0.3415F));

		PartDefinition cube_r378 = leftFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(84, 106).addBox(-0.7079F, -0.929F, -0.7585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(2.4713F, -1.7647F, 4.5893F, -0.4779F, -0.0218F, -0.3415F));

		PartDefinition cube_r379 = leftFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(106, 71).addBox(-0.6894F, -0.3095F, -0.3166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.1963F, -2.4898F, 4.4893F, 0.9487F, -0.2061F, -0.4858F));

		PartDefinition cube_r380 = leftFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(65, 106).addBox(-0.6766F, -0.3146F, -0.6912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(103, 27).addBox(-0.6766F, -0.0146F, -0.6912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.9963F, -2.7398F, 4.7143F, 2.1107F, -0.4729F, -0.67F));

		PartDefinition cube_r381 = leftFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(87, 74).addBox(-1.9766F, -0.5396F, -0.6912F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.9963F, -2.7398F, 4.7143F, 2.0472F, 0.065F, -0.3701F));

		PartDefinition cube_r382 = leftFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(61, 97).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6957F, -3.3531F, 5.6363F, 2.1214F, 0.4619F, -0.1382F));

		PartDefinition cube_r383 = leftFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(19, 86).addBox(-0.7F, -1.8F, -1.175F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.7196F, -3.5276F, 5.2833F, 1.9905F, 0.4619F, -0.1382F));

		PartDefinition cube_r384 = leftFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(86, 11).addBox(-0.7F, -1.5F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.7196F, -3.5276F, 5.2833F, 2.3396F, 0.4619F, -0.1382F));

		PartDefinition cube_r385 = leftFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(86, 6).addBox(-0.2F, -2.7F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(56, 97).addBox(-0.4F, -1.7F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5192F, -4.625F, 5.9676F, 2.3741F, -0.3853F, 0.6413F));

		PartDefinition cube_r386 = leftFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(80, 71).addBox(-0.3F, -0.7F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1422F, -4.5254F, 6.123F, 2.4177F, -0.19F, 1.3534F));

		PartDefinition cube_r387 = leftFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(106, 6).addBox(-0.65F, 0.0F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(102, 81).addBox(-1.05F, 0.0F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6752F, -4.1191F, 5.7913F, 2.6188F, -0.1657F, 0.8625F));

		PartDefinition cube_r388 = leftFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(78, 87).addBox(-1.35F, -0.5F, -0.075F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(38, 90).addBox(-1.5F, -0.5F, -0.475F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0859F, -2.3732F, 5.0268F, 0.7263F, 0.0024F, -0.1173F));

		PartDefinition cube_r389 = leftFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(26, 84).addBox(-1.6271F, -0.1015F, 0.2132F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.9963F, -2.7398F, 4.7143F, 0.8969F, -0.555F, -0.7027F));

		PartDefinition cube_r390 = leftFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(73, 51).addBox(-1.0F, -0.3F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(1.7716F, -0.677F, 1.8208F, 2.6216F, -0.0638F, -0.0775F));

		PartDefinition cube_r391 = leftFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(65, 0).addBox(-2.25F, -0.1402F, -0.4718F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(87, 23).addBox(-1.25F, -0.5402F, -0.4718F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.0384F, -0.4624F, 1.8393F, -2.3089F, -0.0638F, -0.0775F));

		PartDefinition cube_r392 = leftFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(87, 26).addBox(-1.0F, -0.3F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)), PartPose.offsetAndRotation(1.8137F, -0.1135F, 1.8475F, -3.007F, -0.0638F, -0.0775F));

		PartDefinition cube_r393 = leftFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(86, 16).addBox(-1.4993F, -0.1857F, -0.4265F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.3021F, -0.1788F, 2.4318F, -2.1008F, 0.0471F, 0.0323F));

		PartDefinition cube_r394 = leftFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(106, 9).addBox(-0.4993F, -0.5346F, -0.5188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.3021F, -0.1788F, 2.4318F, 2.8734F, 0.0471F, 0.0323F));

		PartDefinition cube_r395 = leftFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(108, 102).addBox(-0.663F, -0.4145F, -0.5279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.4639F, -0.1669F, 2.662F, 1.6033F, 0.011F, -0.1211F));

		PartDefinition cube_r396 = leftFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(99, 108).addBox(-0.6617F, -0.4013F, -0.0729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.4639F, -0.1669F, 2.662F, 0.3021F, 0.0054F, -0.1127F));

		PartDefinition cube_r397 = leftFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(108, 93).addBox(-0.6617F, -1.2827F, -0.322F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.4639F, -0.1669F, 2.662F, -1.1378F, 0.0054F, -0.1127F));

		PartDefinition cube_r398 = leftFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(108, 64).addBox(-0.75F, -1.5881F, -0.2547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.4639F, -0.1669F, 2.662F, -1.0601F, 0.0967F, -0.068F));

		PartDefinition cube_r399 = leftFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(109, 36).addBox(-0.75F, 0.6499F, 1.3105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(109, 33).addBox(-0.75F, 1.0499F, 1.3105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.4639F, -0.1669F, 2.662F, 1.3397F, 0.0967F, -0.068F));

		PartDefinition cube_r400 = leftFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(109, 39).addBox(-0.75F, 1.1899F, -1.5436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(109, 18).addBox(-0.75F, 1.1899F, -1.7436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(2.4639F, -0.1669F, 2.662F, 2.7359F, 0.0967F, -0.068F));

		PartDefinition cube_r401 = leftFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(108, 105).addBox(-0.75F, -1.0635F, -2.229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F))
				.texOffs(104, 108).addBox(-0.75F, -1.0635F, -1.829F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(2.4639F, -0.1669F, 2.662F, -2.3691F, 0.0967F, -0.068F));

		PartDefinition cube_r402 = leftFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(43, 108).addBox(-0.75F, -1.2898F, -1.6369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.4639F, -0.1669F, 2.662F, -2.151F, 0.0967F, -0.068F));

		PartDefinition cube_r403 = leftFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(108, 25).addBox(-0.75F, 0.3629F, -1.8257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.4639F, -0.1669F, 2.662F, 3.085F, 0.0967F, -0.068F));

		PartDefinition cube_r404 = leftFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(23, 108).addBox(-0.75F, 1.0196F, 0.4075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.4639F, -0.1669F, 2.662F, 1.7324F, 0.0967F, -0.068F));

		PartDefinition cube_r405 = leftFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(89, 107).addBox(-0.75F, 1.1113F, -1.688F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.4639F, -0.1669F, 2.662F, 3.0414F, 0.0967F, -0.068F));

		PartDefinition cube_r406 = leftFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(109, 67).addBox(-0.2405F, -0.2591F, -0.4012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(2.0381F, -0.5348F, 1.9921F, 3.0393F, 0.0421F, 0.0386F));

		PartDefinition cube_r407 = leftFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(12, 87).addBox(-1.2405F, -0.2434F, -0.1046F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.0381F, -0.5348F, 1.9921F, 2.6466F, 0.0421F, 0.0386F));

		PartDefinition cube_r408 = leftFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(56, 8).addBox(-1.1936F, 0.1163F, -1.579F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.0608F, -0.9383F, 2.4574F, -2.0526F, 0.146F, 0.1271F));

		PartDefinition cube_r409 = leftFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(86, 34).addBox(-1.5F, -0.3F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.6335F, -2.6327F, 2.5195F, -0.8148F, 0.2319F, 0.1824F));

		PartDefinition cube_r410 = leftFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(24, 87).addBox(-1.5F, -0.3F, -0.65F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.7452F, -2.7731F, 2.877F, 0.457F, 0.5097F, 0.3192F));

		PartDefinition cube_r411 = leftFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(86, 31).addBox(-1.5F, -0.3F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(2.7452F, -2.7731F, 2.877F, 0.4069F, 0.2319F, 0.1824F));

		PartDefinition cube_r412 = leftFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(63, 109).addBox(-0.75F, -0.304F, 1.9542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.4639F, -0.1669F, 2.662F, 1.3833F, 0.0967F, -0.068F));

		PartDefinition cube_r413 = leftFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(109, 45).addBox(-0.75F, 1.9037F, -0.0501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.4639F, -0.1669F, 2.662F, 2.5614F, 0.0967F, -0.068F));

		PartDefinition cube_r414 = leftFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(109, 42).addBox(-0.75F, 0.6268F, -2.5541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.4639F, -0.1669F, 2.662F, -2.5873F, 0.0967F, -0.068F));

		PartDefinition cube_r415 = leftFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(107, 79).addBox(-0.75F, 0.7787F, -2.2374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.4639F, -0.1669F, 2.662F, -2.8491F, 0.0967F, -0.068F));

		PartDefinition cube_r416 = leftFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(75, 107).addBox(-0.525F, -0.7317F, -0.487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.7692F, 2.4136F, 1.2665F, -0.7179F, -0.0744F, -0.0347F));

		PartDefinition cube_r417 = leftFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(70, 107).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8065F, 2.6802F, 0.8911F, 0.5475F, -0.0744F, -0.0347F));

		PartDefinition cube_r418 = leftFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(72, 36).addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.6588F, 3.6668F, -1.2612F, 0.4182F, 0.2222F, 0.1515F));

		PartDefinition cube_r419 = leftFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(89, 104).addBox(-0.575F, -0.575F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.9894F, 3.1391F, 0.2126F, 0.4442F, 0.0507F, 0.0861F));

		PartDefinition cube_r420 = leftFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(66, 98).addBox(-0.4978F, -0.0257F, -0.6268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(42, 98).addBox(-0.4978F, -0.2257F, -0.6268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F)), PartPose.offsetAndRotation(0.5185F, 6.3545F, -5.0811F, 0.8106F, 0.2441F, -0.4046F));

		PartDefinition cube_r421 = leftFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(98, 34).addBox(-0.4978F, -0.5808F, -0.5837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(98, 31).addBox(-0.4978F, -0.3808F, -0.5837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F)), PartPose.offsetAndRotation(0.5185F, 6.3545F, -5.0811F, 0.5924F, 0.2441F, -0.4046F));

		PartDefinition cube_r422 = leftFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(92, 84).addBox(-0.4978F, -1.7271F, -0.6242F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.402F))
				.texOffs(98, 93).addBox(-0.4978F, -0.3102F, -0.4948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(96, 98).addBox(-0.4978F, -0.7102F, -0.4948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F))
				.texOffs(91, 98).addBox(-0.4978F, -0.5102F, -0.4948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F)), PartPose.offsetAndRotation(0.5185F, 6.3545F, -5.0811F, 0.3306F, 0.2441F, -0.4046F));

		PartDefinition cube_r423 = leftFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(92, 80).addBox(-0.4978F, -1.7249F, -0.5206F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.5185F, 6.3545F, -5.0811F, 0.1124F, 0.2441F, -0.4046F));

		PartDefinition cube_r424 = leftFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(7, 58).addBox(-0.6F, -2.05F, -1.45F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.8878F, -0.3837F, 2.7988F, -0.7227F, -0.0161F, 0.0956F));

		PartDefinition cube_r425 = leftFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(62, 93).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.2217F, 0.2793F, 1.9538F, -1.0108F, -1.0177F, 0.9982F));

		PartDefinition cube_r426 = leftFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(57, 93).addBox(-0.6F, -2.05F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7762F, 1.4038F, 1.9086F, -0.4619F, 0.0493F, 0.0378F));

		PartDefinition cube_r427 = leftFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(76, 93).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.127F, 1.5324F, 0.996F, -1.2899F, -0.6695F, 1.2301F));

		PartDefinition cube_r428 = leftFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(52, 93).addBox(-0.6F, -0.25F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7762F, 1.4038F, 1.9086F, -0.8546F, 0.0493F, 0.0378F));

		PartDefinition cube_r429 = leftFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(50, 101).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6354F, 2.2316F, 1.0149F, -0.8655F, -0.1093F, -0.1514F));

		PartDefinition cube_r430 = leftFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(40, 101).addBox(-0.524F, -0.5074F, -0.7459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7545F, 2.3615F, 0.8413F, 0.7333F, -0.2738F, -0.2977F));

		PartDefinition cube_r431 = leftFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(56, 67).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1295F, -0.5022F, 1.6286F, -0.1819F, 0.7883F, -1.4754F));

		PartDefinition cube_r432 = leftFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(50, 104).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7043F, -1.2207F, 1.0783F, 0.6709F, 0.4837F, -0.1809F));

		PartDefinition cube_r433 = leftFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(51, 63).addBox(-1.5885F, -0.5047F, 0.0105F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(42, 63).addBox(-1.6885F, -0.5047F, -0.2895F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.1329F, 3.1615F, -4.9032F, 2.7982F, 0.8673F, -1.8695F));

		PartDefinition cube_r434 = leftFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(63, 32).addBox(-1.9594F, -0.5046F, -0.6113F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1329F, 3.1615F, -4.9032F, 2.734F, 0.9892F, -1.9495F));

		PartDefinition cube_r435 = leftFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(33, 107).addBox(0.2358F, -0.203F, -0.754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3329F, 3.1615F, -4.8032F, 2.881F, 1.0644F, -1.7901F));

		PartDefinition cube_r436 = leftFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(90, 88).addBox(-0.528F, -0.265F, -0.7328F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.4869F, 2.4965F, -5.9781F, 3.0614F, 1.0766F, -1.6318F));

		PartDefinition cube_r437 = leftFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(90, 63).addBox(-1.0757F, -0.265F, 0.0603F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4869F, 2.4965F, -5.9781F, 3.0765F, 0.946F, -1.6139F));

		PartDefinition cube_r438 = leftFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(10, 90).addBox(-1.0799F, -0.6708F, -0.4475F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(0, 64).addBox(-1.0799F, -0.6708F, 0.0525F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.4869F, 2.4965F, -5.9781F, 2.929F, 0.9371F, -1.7333F));

		PartDefinition cube_r439 = leftFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(85, 82).addBox(-1.7524F, -0.4962F, -0.5936F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.1329F, 3.1615F, -4.9032F, 2.9276F, 0.117F, -1.5863F));

		PartDefinition cube_r440 = leftFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(60, 104).addBox(-0.9932F, -0.4962F, -0.0924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1329F, 3.1615F, -4.9032F, 2.8781F, 0.6266F, -1.7178F));

		PartDefinition cube_r441 = leftFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(71, 85).addBox(-1.126F, -0.4962F, 0.034F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.1329F, 3.1615F, -4.9032F, 2.5922F, 1.1549F, -2.0714F));

		PartDefinition cube_r442 = leftFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(89, 77).addBox(-0.4332F, -0.6708F, -0.1401F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(57, 90).addBox(-0.5332F, -0.6708F, -0.7401F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(79, 101).addBox(-1.1332F, -0.6708F, -0.7401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4869F, 2.4965F, -5.9781F, 2.881F, 1.0644F, -1.7901F));

		PartDefinition cube_r443 = leftFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(43, 105).addBox(0.1365F, -0.7786F, -1.3652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(105, 0).addBox(-0.3635F, -0.7786F, -1.3652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.7427F, 1.1628F, -9.3816F, -2.8011F, 0.9121F, -0.9725F));

		PartDefinition cube_r444 = leftFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(23, 105).addBox(-0.8594F, -0.7786F, -0.7193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7427F, 1.1628F, -9.3816F, -0.2724F, 0.7077F, 1.7163F));

		PartDefinition cube_r445 = leftFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(94, 107).addBox(-1.3213F, -0.7786F, -0.1633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.7427F, 1.1628F, -9.3816F, -0.2914F, -0.7793F, 2.1037F));

		PartDefinition cube_r446 = leftFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(104, 84).addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5359F, 0.8461F, -9.7266F, 0.0809F, -0.8156F, 1.5739F));

		PartDefinition cube_r447 = leftFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(79, 104).addBox(0.3268F, -0.7976F, -2.8176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7349F, 1.687F, -6.9947F, 0.0731F, 0.7086F, 1.6805F));

		PartDefinition cube_r448 = leftFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(74, 104).addBox(1.3081F, -0.7976F, 0.1466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-0.7349F, 1.687F, -6.9947F, 3.0467F, 0.946F, -1.5857F));

		PartDefinition cube_r449 = leftFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(86, 0).addBox(-0.252F, -0.7976F, 0.081F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7349F, 1.687F, -6.9947F, 3.0405F, 0.9894F, -1.5933F));

		PartDefinition cube_r450 = leftFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(91, 9).addBox(-1.029F, -0.5F, -0.3362F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2999F, -0.2634F, -10.0866F, -2.7875F, 0.5408F, -0.9673F));

		PartDefinition cube_r451 = leftFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(106, 3).addBox(-2.7677F, -0.1697F, -0.7509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(103, 105).addBox(-2.4677F, -0.1697F, -0.7509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7439F, -1.7092F, -11.3443F, -0.2362F, 0.4025F, 1.7123F));

		PartDefinition cube_r452 = leftFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(105, 76).addBox(-0.547F, -0.1697F, -1.938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.7439F, -1.7092F, -11.3443F, -2.3902F, 1.2499F, -0.61F));

		PartDefinition cube_r453 = leftFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(105, 58).addBox(-0.6977F, -0.1697F, -1.3613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7439F, -1.7092F, -11.3443F, -2.0232F, 1.3291F, -0.2286F));

		PartDefinition cube_r454 = leftFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(86, 3).addBox(-0.0582F, -0.1697F, -0.8911F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.7439F, -1.7092F, -11.3443F, -2.9242F, -0.0622F, -1.349F));

		PartDefinition cube_r455 = leftFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(105, 55).addBox(-0.2295F, -0.1697F, -0.7967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.7439F, -1.7092F, -11.3443F, -2.9241F, 0.0656F, -1.3208F));

		PartDefinition cube_r456 = leftFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(76, 90).addBox(-0.2F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.6804F, -0.5319F, -10.8565F, -2.8163F, 0.3762F, -1.032F));

		PartDefinition cube_r457 = leftFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(91, 12).addBox(-0.1854F, -0.5F, -0.6657F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6885F, -0.7844F, -10.553F, -2.8104F, 0.4175F, -1.0168F));

		PartDefinition cube_r458 = leftFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(91, 6).addBox(-0.9854F, -0.5F, -0.6657F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.2999F, -0.2634F, -10.0866F, -2.7671F, 0.6224F, -0.9301F));

		PartDefinition cube_r459 = leftFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(94, 104).addBox(1.2388F, -0.7976F, -0.3857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(104, 90).addBox(1.8388F, -0.7976F, -0.3857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(104, 68).addBox(2.4388F, -0.7976F, -0.3857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.7349F, 1.687F, -6.9947F, 3.0455F, 0.9547F, -1.5872F));

		PartDefinition cube_r460 = leftFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(85, 85).addBox(-0.2309F, -0.7976F, -0.5214F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.7349F, 1.687F, -6.9947F, 3.0316F, 1.0415F, -1.6037F));

		PartDefinition cube_r461 = leftFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(62, 35).addBox(-2.4039F, -0.5046F, -0.8449F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.1329F, 3.1615F, -4.9032F, 2.5316F, 1.1809F, -2.1772F));

		PartDefinition cube_r462 = leftFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(51, 97).addBox(-0.2F, -0.2F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1772F, 2.6282F, -1.2214F, 1.2539F, 0.1502F, 2.963F));

		PartDefinition cube_r463 = leftFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(24, 90).addBox(-1.8F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4742F, 3.3537F, -2.5134F, 0.7739F, 1.1255F, 2.2664F));

		PartDefinition cube_r464 = leftFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(64, 85).addBox(-2.6426F, -0.3937F, -0.4273F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1329F, 3.1615F, -4.9032F, 1.3545F, 1.2744F, 2.8828F));

		PartDefinition cube_r465 = leftFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(65, 11).addBox(-1.2F, -0.2F, -0.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.972F, 2.7633F, -2.3389F, 1.4491F, 0.7331F, 2.1961F));

		PartDefinition cube_r466 = leftFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(60, 64).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3709F, 2.4617F, -2.1465F, 0.4965F, 0.8833F, 1.966F));

		PartDefinition cube_r467 = leftFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(62, 17).addBox(-0.5293F, -0.6689F, -0.5303F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9115F, 1.9688F, -1.5643F, 0.8382F, 0.7331F, 2.1961F));

		PartDefinition cube_r468 = leftFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(104, 87).addBox(-0.3F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(1.4779F, 1.1191F, -1.436F, 1.4929F, -0.8547F, 2.1101F));

		PartDefinition cube_r469 = leftFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(55, 104).addBox(-0.6943F, 0.0472F, -0.5303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9115F, 1.9688F, -1.5643F, 0.8546F, -0.5205F, 3.0587F));

		PartDefinition cube_r470 = leftFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(73, 47).addBox(-1.8F, -1.0F, -0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9545F, 1.1918F, -0.1314F, -1.2953F, 0.5488F, -1.6502F));

		PartDefinition cube_r471 = leftFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(37, 97).addBox(-0.425F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5128F, 1.1602F, -0.3172F, -0.9643F, -0.0397F, -0.5189F));

		PartDefinition cube_r472 = leftFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(43, 94).addBox(0.0692F, -1.7936F, -0.5303F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.9115F, 1.9688F, -1.5643F, -0.8335F, -0.5601F, -0.9409F));

		PartDefinition cube_r473 = leftFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(97, 62).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4973F, 0.0847F, -0.2867F, -0.5666F, 0.4036F, -0.192F));

		PartDefinition cube_r474 = leftFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(5, 97).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4973F, 0.0847F, -0.2867F, -0.53F, 0.2172F, -0.0727F));

		PartDefinition cube_r475 = leftFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(20, 97).addBox(-1.0F, -0.1F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1094F, -0.5301F, 1.6774F, -1.6222F, 0.768F, -1.4876F));

		PartDefinition cube_r476 = leftFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(10, 97).addBox(-1.0F, -0.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7043F, -1.2207F, 1.0783F, -0.8757F, 0.3614F, -0.2438F));

		PartDefinition cube_r477 = leftFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(0, 97).addBox(-1.0F, -0.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7043F, -1.2207F, 1.0783F, -0.8267F, 0.2172F, -0.0727F));

		PartDefinition cube_r478 = leftFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(56, 20).addBox(-1.35F, -0.475F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3213F, -0.8692F, 1.5576F, 0.7546F, 0.3118F, 0.0338F));

		PartDefinition cube_r479 = leftFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(33, 67).addBox(-1.7F, -0.3F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.1337F, 1.4027F, -2.0213F, 2.0872F, 0.8515F, 1.3669F));

		PartDefinition cube_r480 = leftFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(26, 67).addBox(-1.7F, -0.3F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.1337F, 1.4027F, -2.0213F, 1.4763F, 0.8515F, 1.3669F));

		PartDefinition cube_r481 = leftFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(93, 15).addBox(-0.7F, -0.3F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.1278F, 1.5395F, -2.1671F, 0.6393F, 0.4318F, -0.4694F));

		PartDefinition cube_r482 = leftFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(10, 93).addBox(-0.4743F, -0.8923F, 0.8658F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F))
				.texOffs(0, 93).addBox(-0.4743F, -0.8923F, 0.6408F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1031F, 2.9107F, -2.7446F, 0.7521F, 0.0619F, -0.0227F));

		PartDefinition cube_r483 = leftFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(17, 91).addBox(-0.4871F, -0.1669F, -0.2326F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(59, 85).addBox(-0.4871F, -0.1669F, -0.6326F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.1031F, 2.9107F, -2.7446F, -0.8315F, 0.0935F, 0.0073F));

		PartDefinition cube_r484 = leftFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(35, 62).addBox(-0.7F, -1.0F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0929F, 2.4181F, -2.8623F, -0.6896F, 0.534F, -0.3596F));

		PartDefinition cube_r485 = leftFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(61, 49).addBox(-0.4912F, -1.3536F, -0.6554F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.1031F, 2.9107F, -2.7446F, -0.5813F, 0.0725F, -0.0097F));

		PartDefinition cube_r486 = leftFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(93, 0).addBox(-0.7F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1211F, 1.6934F, -2.331F, 0.6425F, 0.4266F, -0.4617F));

		PartDefinition cube_r487 = leftFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(28, 113).addBox(-0.3F, -0.3F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(113, 24).addBox(-0.3F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2194F, 6.3196F, -6.6219F, 1.4738F, -1.2478F, -1.5328F));

		PartDefinition cube_r488 = leftFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(15, 113).addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2179F, 6.4086F, -6.2551F, 0.4896F, -0.8368F, -0.3674F));

		PartDefinition cube_r489 = leftFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(10, 113).addBox(0.0766F, 0.067F, -2.2343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2744F, 5.1127F, -4.7102F, 0.4078F, 0.017F, 0.015F));

		PartDefinition cube_r490 = leftFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(0, 113).addBox(0.0917F, -0.4337F, -1.9864F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.2744F, 5.1127F, -4.7102F, 0.6997F, -0.0026F, 0.0435F));

		PartDefinition cube_r491 = leftFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(25, 99).addBox(-0.2055F, -0.4337F, -1.7272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2744F, 5.1127F, -4.7102F, 0.7119F, -0.1689F, -0.0983F));

		PartDefinition cube_r492 = leftFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(65, 20).addBox(-0.0742F, -0.7572F, -1.3703F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2744F, 5.1127F, -4.7102F, 0.8886F, -0.0394F, -0.0901F));

		PartDefinition cube_r493 = leftFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(19, 67).addBox(-0.2017F, -0.4308F, -1.3722F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2744F, 5.1127F, -4.7102F, 0.6149F, -0.1119F, -0.0383F));

		PartDefinition cube_r494 = leftFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(73, 55).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.3315F, -2.4565F, 2.3936F, 0.1336F, 0.7608F, -0.9975F));

		PartDefinition cube_r495 = leftFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(38, 81).addBox(1.4393F, 0.0887F, -0.3609F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.7229F, -2.8453F, 2.8689F, 0.8469F, 0.0178F, -0.7752F));

		PartDefinition cube_r496 = leftFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(87, 43).addBox(2.3765F, 0.8119F, -1.3831F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7229F, -2.8453F, 2.8689F, 0.8767F, -0.0211F, -1.2084F));

		PartDefinition cube_r497 = leftFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(87, 49).addBox(2.925F, 0.8119F, -2.9604F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(87, 46).addBox(2.925F, 0.8119F, -3.3604F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(2.7229F, -2.8453F, 2.8689F, 0.932F, -0.2936F, -1.5546F));

		PartDefinition cube_r498 = leftFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(87, 71).addBox(3.4296F, 0.8119F, -4.0459F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7229F, -2.8453F, 2.8689F, 1.0159F, -0.4415F, -1.7865F));

		PartDefinition cube_r499 = leftFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(106, 30).addBox(-3.206F, 0.8119F, -6.9459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7229F, -2.8453F, 2.8689F, 2.0104F, -0.5563F, 2.8017F));

		PartDefinition cube_r500 = leftFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(101, 24).addBox(3.6732F, 0.8119F, -5.613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(2.7229F, -2.8453F, 2.8689F, 1.1698F, -0.5832F, -2.0977F));

		PartDefinition cube_r501 = leftFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(106, 22).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(5.1784F, -8.8295F, 4.5676F, 1.0575F, -0.4904F, -1.879F));

		PartDefinition cube_r502 = leftFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(87, 52).addBox(2.7466F, 0.8119F, -5.0612F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.7229F, -2.8453F, 2.8689F, 1.0961F, -0.5276F, -1.9582F));

		PartDefinition cube_r503 = leftFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(87, 40).addBox(2.2175F, 0.8119F, -2.101F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.7229F, -2.8453F, 2.8689F, 0.88F, -0.0769F, -1.2756F));

		PartDefinition cube_r504 = leftFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(7, 82).addBox(1.4509F, 0.0887F, -1.0744F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7229F, -2.8453F, 2.8689F, 0.8476F, -0.0399F, -0.8406F));

		PartDefinition cube_r505 = leftFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(106, 50).addBox(2.0179F, 0.0887F, 0.9144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.7229F, -2.8453F, 2.8689F, 0.969F, 0.4304F, -0.2494F));

		PartDefinition cube_r506 = leftFace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(106, 15).addBox(1.7561F, 0.0887F, 0.1787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.7229F, -2.8453F, 2.8689F, 0.9385F, 0.3799F, -0.3268F));

		PartDefinition cube_r507 = leftFace.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(52, 82).addBox(0.1834F, -0.2208F, -0.4252F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.7229F, -2.8453F, 2.8689F, 0.8482F, 0.0664F, -0.4651F));

		PartDefinition cube_r508 = leftFace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(31, 81).addBox(-0.1399F, -0.2208F, -0.0539F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7229F, -2.8453F, 2.8689F, 0.8458F, 0.0086F, -0.5306F));

		PartDefinition cube_r509 = leftFace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(65, 3).addBox(-2.351F, -0.2761F, -0.0195F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.7229F, -2.8453F, 2.8689F, 0.9663F, 0.1743F, -0.064F));

		PartDefinition cube_r510 = leftFace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(38, 87).addBox(-1.3316F, -0.2761F, -0.3598F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7229F, -2.8453F, 2.8689F, 0.9485F, 0.0737F, -0.2078F));

		PartDefinition cube_r511 = leftFace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(87, 37).addBox(-0.975F, -0.55F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.7602F, -2.8144F, 3.8098F, 0.8852F, 0.3701F, 0.1696F));

		PartDefinition cube_r512 = leftFace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(53, 35).addBox(-2.275F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.8511F, -3.0951F, 3.0244F, 0.7125F, 0.322F, 0.0297F));

		PartDefinition cube_r513 = leftFace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(5, 113).addBox(-0.1321F, -0.9981F, -1.9012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(112, 59).addBox(-0.1321F, -0.9981F, -1.6761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.2744F, 5.1127F, -4.7102F, 1.0526F, -0.1324F, -0.0409F));

		PartDefinition cube_r514 = leftFace.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(68, 59).addBox(-0.4994F, -0.4802F, -1.8328F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.139F, 4.2504F, -3.3039F, 0.4646F, 0.2003F, -0.0762F));

		PartDefinition cube_r515 = leftFace.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(93, 33).addBox(-0.5804F, -0.1727F, -0.4442F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.139F, 4.2504F, -3.3039F, 1.9938F, 0.274F, -0.0363F));

		PartDefinition cube_r516 = leftFace.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(61, 54).addBox(-0.45F, -0.8F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7951F, -2.1527F, 5.5959F, 1.9731F, 1.5077F, -0.0288F));

		PartDefinition cube_r517 = leftFace.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(30, 99).addBox(-0.6234F, -0.8603F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6967F, 3.041F, -1.5026F, -2.9063F, 0.3104F, 0.0431F));

		PartDefinition cube_r518 = leftFace.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(99, 40).addBox(-1.0F, -0.7F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.2986F, 2.6767F, -0.7977F, 1.9939F, -0.2235F, 1.0211F));

		PartDefinition cube_r519 = leftFace.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(99, 37).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.3863F, 3.0204F, -0.3348F, 1.9862F, 0.2381F, 0.0725F));

		PartDefinition cube_r520 = leftFace.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(90, 101).addBox(-0.9871F, -0.0075F, -0.4726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.3973F, 2.3807F, -0.142F, 0.3199F, -0.333F, 0.9806F));

		PartDefinition cube_r521 = leftFace.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(28, 62).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0284F, -0.4517F, 0.294F, 2.1387F, 0.2633F, -0.3584F));

		PartDefinition cube_r522 = leftFace.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(21, 62).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0452F, 0.129F, -0.5199F, 2.2238F, 0.2935F, -0.3364F));

		PartDefinition cube_r523 = leftFace.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(22, 93).addBox(-0.3F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-0.0531F, 0.4994F, -0.9681F, 2.5066F, -0.2615F, 2.4794F));

		PartDefinition cube_r524 = leftFace.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(101, 73).addBox(-0.9871F, -0.5074F, -0.9726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.4579F, 2.615F, 0.5224F, 0.4485F, 0.094F, 0.0091F));

		PartDefinition cube_r525 = leftFace.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(106, 12).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0431F, -3.4407F, 3.5531F, -0.9516F, -0.38F, -0.3549F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5359F, 0.9361F, -6.2987F, 0.0F, 0.0164F, 0.006F));

		PartDefinition cube_r526 = rightFace.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(106, 96).mirror().addBox(-0.2921F, -0.3019F, -0.6228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.4713F, -1.7647F, 4.5893F, -1.8306F, 0.0218F, 0.3415F));

		PartDefinition cube_r527 = rightFace.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(84, 106).mirror().addBox(-0.2921F, -0.929F, -0.7585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.4713F, -1.7647F, 4.5893F, -0.4779F, 0.0218F, 0.3415F));

		PartDefinition cube_r528 = rightFace.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(106, 71).mirror().addBox(-0.3106F, -0.3095F, -0.3166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.1963F, -2.4898F, 4.4893F, 0.9487F, 0.2061F, 0.4858F));

		PartDefinition cube_r529 = rightFace.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(65, 106).mirror().addBox(-0.3234F, -0.3146F, -0.6912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(103, 27).mirror().addBox(-0.3234F, -0.0146F, -0.6912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.9963F, -2.7398F, 4.7143F, 2.1107F, 0.4729F, 0.67F));

		PartDefinition cube_r530 = rightFace.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(87, 74).mirror().addBox(-0.0234F, -0.5396F, -0.6912F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.9963F, -2.7398F, 4.7143F, 2.0472F, -0.065F, 0.3701F));

		PartDefinition cube_r531 = rightFace.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(61, 97).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6957F, -3.3531F, 5.6363F, 2.1214F, -0.4619F, 0.1382F));

		PartDefinition cube_r532 = rightFace.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(19, 86).mirror().addBox(-0.3F, -1.8F, -1.175F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.7196F, -3.5276F, 5.2833F, 1.9905F, -0.4619F, 0.1382F));

		PartDefinition cube_r533 = rightFace.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(86, 11).mirror().addBox(-0.3F, -1.5F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-0.7196F, -3.5276F, 5.2833F, 2.3396F, -0.4619F, 0.1382F));

		PartDefinition cube_r534 = rightFace.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(86, 6).mirror().addBox(-0.8F, -2.7F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(56, 97).mirror().addBox(-0.6F, -1.7F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5192F, -4.625F, 5.9676F, 2.3741F, 0.3853F, -0.6413F));

		PartDefinition cube_r535 = rightFace.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(80, 71).mirror().addBox(-1.7F, -0.7F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1422F, -4.5254F, 6.123F, 2.4177F, 0.19F, -1.3534F));

		PartDefinition cube_r536 = rightFace.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(106, 6).mirror().addBox(-0.35F, 0.0F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(102, 81).mirror().addBox(0.05F, 0.0F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6753F, -4.1191F, 5.7913F, 2.6188F, 0.1657F, -0.8625F));

		PartDefinition cube_r537 = rightFace.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(78, 87).mirror().addBox(-0.65F, -0.5F, -0.075F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(38, 90).mirror().addBox(-0.5F, -0.5F, -0.475F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0859F, -2.3732F, 5.0268F, 0.7263F, -0.0024F, 0.1173F));

		PartDefinition cube_r538 = rightFace.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(26, 84).mirror().addBox(-0.3729F, -0.1015F, 0.2132F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.9963F, -2.7398F, 4.7143F, 0.8969F, 0.555F, 0.7027F));

		PartDefinition cube_r539 = rightFace.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(73, 51).mirror().addBox(-1.0F, -0.3F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-1.7716F, -0.677F, 1.8208F, 2.6216F, 0.0638F, 0.0775F));

		PartDefinition cube_r540 = rightFace.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(65, 0).mirror().addBox(-0.75F, -0.1402F, -0.4718F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(87, 23).mirror().addBox(-0.75F, -0.5402F, -0.4718F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.0384F, -0.4624F, 1.8393F, -2.3089F, 0.0638F, 0.0775F));

		PartDefinition cube_r541 = rightFace.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(87, 26).mirror().addBox(-1.0F, -0.3F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)).mirror(false), PartPose.offsetAndRotation(-1.8137F, -0.1135F, 1.8475F, -3.007F, 0.0638F, 0.0775F));

		PartDefinition cube_r542 = rightFace.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(86, 16).mirror().addBox(-0.5007F, -0.1857F, -0.4265F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.3021F, -0.1788F, 2.4318F, -2.1008F, -0.0471F, -0.0323F));

		PartDefinition cube_r543 = rightFace.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(106, 9).mirror().addBox(-0.5007F, -0.5346F, -0.5188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.3021F, -0.1788F, 2.4318F, 2.8734F, -0.0471F, -0.0323F));

		PartDefinition cube_r544 = rightFace.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(108, 102).mirror().addBox(-0.337F, -0.4145F, -0.5279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.4639F, -0.1669F, 2.662F, 1.6033F, -0.011F, 0.1211F));

		PartDefinition cube_r545 = rightFace.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(99, 108).mirror().addBox(-0.3383F, -0.4013F, -0.0729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.4639F, -0.1669F, 2.662F, 0.3021F, -0.0054F, 0.1127F));

		PartDefinition cube_r546 = rightFace.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(108, 93).mirror().addBox(-0.3383F, -1.2827F, -0.322F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.4639F, -0.1669F, 2.662F, -1.1378F, -0.0054F, 0.1127F));

		PartDefinition cube_r547 = rightFace.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(108, 64).mirror().addBox(-0.25F, -1.5881F, -0.2547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.4639F, -0.1669F, 2.662F, -1.0601F, -0.0967F, 0.068F));

		PartDefinition cube_r548 = rightFace.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(109, 36).mirror().addBox(-0.25F, 0.6499F, 1.3105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(109, 33).mirror().addBox(-0.25F, 1.0499F, 1.3105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.4639F, -0.1669F, 2.662F, 1.3397F, -0.0967F, 0.068F));

		PartDefinition cube_r549 = rightFace.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(109, 39).mirror().addBox(-0.25F, 1.1899F, -1.5436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(109, 18).mirror().addBox(-0.25F, 1.1899F, -1.7436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.4639F, -0.1669F, 2.662F, 2.7359F, -0.0967F, 0.068F));

		PartDefinition cube_r550 = rightFace.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(108, 105).mirror().addBox(-0.25F, -1.0635F, -2.229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)).mirror(false)
				.texOffs(104, 108).mirror().addBox(-0.25F, -1.0635F, -1.829F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.4639F, -0.1669F, 2.662F, -2.3691F, -0.0967F, 0.068F));

		PartDefinition cube_r551 = rightFace.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(43, 108).mirror().addBox(-0.25F, -1.2898F, -1.6369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.4639F, -0.1669F, 2.662F, -2.151F, -0.0967F, 0.068F));

		PartDefinition cube_r552 = rightFace.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(108, 25).mirror().addBox(-0.25F, 0.3629F, -1.8257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.4639F, -0.1669F, 2.662F, 3.085F, -0.0967F, 0.068F));

		PartDefinition cube_r553 = rightFace.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(23, 108).mirror().addBox(-0.25F, 1.0196F, 0.4075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.4639F, -0.1669F, 2.662F, 1.7324F, -0.0967F, 0.068F));

		PartDefinition cube_r554 = rightFace.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(89, 107).mirror().addBox(-0.25F, 1.1113F, -1.688F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.4639F, -0.1669F, 2.662F, 3.0414F, -0.0967F, 0.068F));

		PartDefinition cube_r555 = rightFace.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(109, 67).mirror().addBox(-0.7595F, -0.2591F, -0.4012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.0381F, -0.5348F, 1.9921F, 3.0393F, -0.0421F, -0.0386F));

		PartDefinition cube_r556 = rightFace.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(12, 87).mirror().addBox(-0.7595F, -0.2434F, -0.1046F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.0381F, -0.5348F, 1.9921F, 2.6466F, -0.0421F, -0.0386F));

		PartDefinition cube_r557 = rightFace.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(56, 8).mirror().addBox(-0.8064F, 0.1163F, -1.579F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.0609F, -0.9383F, 2.4574F, -2.0526F, -0.146F, -0.1271F));

		PartDefinition cube_r558 = rightFace.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(86, 34).mirror().addBox(-0.5F, -0.3F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.6335F, -2.6327F, 2.5195F, -0.8148F, -0.2319F, -0.1824F));

		PartDefinition cube_r559 = rightFace.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(24, 87).mirror().addBox(-0.5F, -0.3F, -0.65F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.7452F, -2.7731F, 2.877F, 0.457F, -0.5097F, -0.3192F));

		PartDefinition cube_r560 = rightFace.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(86, 31).mirror().addBox(-0.5F, -0.3F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-2.7452F, -2.7731F, 2.877F, 0.4069F, -0.2319F, -0.1824F));

		PartDefinition cube_r561 = rightFace.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(63, 109).mirror().addBox(-0.25F, -0.304F, 1.9542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.4639F, -0.1669F, 2.662F, 1.3833F, -0.0967F, 0.068F));

		PartDefinition cube_r562 = rightFace.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(109, 45).mirror().addBox(-0.25F, 1.9037F, -0.0501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.4639F, -0.1669F, 2.662F, 2.5614F, -0.0967F, 0.068F));

		PartDefinition cube_r563 = rightFace.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(109, 42).mirror().addBox(-0.25F, 0.6268F, -2.5541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.4639F, -0.1669F, 2.662F, -2.5873F, -0.0967F, 0.068F));

		PartDefinition cube_r564 = rightFace.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(107, 79).mirror().addBox(-0.25F, 0.7787F, -2.2374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.4639F, -0.1669F, 2.662F, -2.8491F, -0.0967F, 0.068F));

		PartDefinition cube_r565 = rightFace.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(75, 107).mirror().addBox(-0.475F, -0.7317F, -0.487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.7692F, 2.4136F, 1.2665F, -0.7179F, 0.0744F, 0.0347F));

		PartDefinition cube_r566 = rightFace.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(70, 107).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8065F, 2.6802F, 0.8911F, 0.5475F, 0.0744F, 0.0347F));

		PartDefinition cube_r567 = rightFace.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(72, 36).mirror().addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.6588F, 3.6668F, -1.2612F, 0.4182F, -0.2222F, -0.1515F));

		PartDefinition cube_r568 = rightFace.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(89, 104).mirror().addBox(-0.425F, -0.575F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.9894F, 3.1391F, 0.2126F, 0.4442F, -0.0507F, -0.0861F));

		PartDefinition cube_r569 = rightFace.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(66, 98).mirror().addBox(-0.5022F, -0.0257F, -0.6268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(42, 98).mirror().addBox(-0.5022F, -0.2257F, -0.6268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F)).mirror(false), PartPose.offsetAndRotation(-0.5185F, 6.3545F, -5.0811F, 0.8106F, -0.2441F, 0.4046F));

		PartDefinition cube_r570 = rightFace.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(98, 34).mirror().addBox(-0.5022F, -0.5808F, -0.5837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(98, 31).mirror().addBox(-0.5022F, -0.3808F, -0.5837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F)).mirror(false), PartPose.offsetAndRotation(-0.5185F, 6.3545F, -5.0811F, 0.5924F, -0.2441F, 0.4046F));

		PartDefinition cube_r571 = rightFace.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(92, 84).mirror().addBox(-0.5022F, -1.7271F, -0.6242F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.402F)).mirror(false)
				.texOffs(98, 93).mirror().addBox(-0.5022F, -0.3102F, -0.4948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(96, 98).mirror().addBox(-0.5022F, -0.7102F, -0.4948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F)).mirror(false)
				.texOffs(91, 98).mirror().addBox(-0.5022F, -0.5102F, -0.4948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F)).mirror(false), PartPose.offsetAndRotation(-0.5185F, 6.3545F, -5.0811F, 0.3306F, -0.2441F, 0.4046F));

		PartDefinition cube_r572 = rightFace.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(92, 80).mirror().addBox(-0.5022F, -1.7249F, -0.5206F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.5185F, 6.3545F, -5.0811F, 0.1124F, -0.2441F, 0.4046F));

		PartDefinition cube_r573 = rightFace.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(7, 58).mirror().addBox(-0.4F, -2.05F, -1.45F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8878F, -0.3837F, 2.7988F, -0.7227F, 0.0161F, -0.0956F));

		PartDefinition cube_r574 = rightFace.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(62, 93).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.2217F, 0.2793F, 1.9538F, -1.0108F, 1.0177F, -0.9982F));

		PartDefinition cube_r575 = rightFace.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(57, 93).mirror().addBox(-0.4F, -2.05F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7762F, 1.4038F, 1.9086F, -0.4619F, -0.0493F, -0.0378F));

		PartDefinition cube_r576 = rightFace.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(76, 93).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.127F, 1.5324F, 0.996F, -1.2899F, 0.6695F, -1.2301F));

		PartDefinition cube_r577 = rightFace.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(52, 93).mirror().addBox(-0.4F, -0.25F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7762F, 1.4038F, 1.9086F, -0.8546F, -0.0493F, -0.0378F));

		PartDefinition cube_r578 = rightFace.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(50, 101).mirror().addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6354F, 2.2316F, 1.0149F, -0.8655F, 0.1093F, 0.1514F));

		PartDefinition cube_r579 = rightFace.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(40, 101).mirror().addBox(-0.4761F, -0.5074F, -0.7459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7545F, 2.3615F, 0.8413F, 0.7333F, 0.2738F, 0.2977F));

		PartDefinition cube_r580 = rightFace.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(56, 67).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1295F, -0.5022F, 1.6286F, -0.1819F, -0.7883F, 1.4754F));

		PartDefinition cube_r581 = rightFace.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(50, 104).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7043F, -1.2207F, 1.0783F, 0.6709F, -0.4837F, 0.1809F));

		PartDefinition cube_r582 = rightFace.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(51, 63).mirror().addBox(-1.4115F, -0.5047F, 0.0105F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(42, 63).mirror().addBox(-1.3115F, -0.5047F, -0.2895F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.1329F, 3.1615F, -4.9032F, 2.7982F, -0.8673F, 1.8695F));

		PartDefinition cube_r583 = rightFace.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(63, 32).mirror().addBox(-1.0406F, -0.5046F, -0.6113F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1329F, 3.1615F, -4.9032F, 2.734F, -0.9892F, 1.9495F));

		PartDefinition cube_r584 = rightFace.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(33, 107).mirror().addBox(-1.2358F, -0.203F, -0.754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3329F, 3.1615F, -4.8032F, 2.881F, -1.0644F, 1.7901F));

		PartDefinition cube_r585 = rightFace.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(90, 88).mirror().addBox(-1.472F, -0.265F, -0.7328F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.4869F, 2.4965F, -5.9781F, 3.0614F, -1.0766F, 1.6318F));

		PartDefinition cube_r586 = rightFace.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(90, 63).mirror().addBox(-0.9243F, -0.265F, 0.0603F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4869F, 2.4965F, -5.9781F, 3.0765F, -0.946F, 1.6139F));

		PartDefinition cube_r587 = rightFace.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(10, 90).mirror().addBox(-0.9201F, -0.6708F, -0.4475F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(0, 64).mirror().addBox(-1.9201F, -0.6708F, 0.0525F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.4869F, 2.4965F, -5.9781F, 2.929F, -0.9371F, 1.7333F));

		PartDefinition cube_r588 = rightFace.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(85, 82).mirror().addBox(-0.2476F, -0.4962F, -0.5936F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.1329F, 3.1615F, -4.9032F, 2.9276F, -0.117F, 1.5863F));

		PartDefinition cube_r589 = rightFace.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(60, 104).mirror().addBox(-0.0068F, -0.4962F, -0.0924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1329F, 3.1615F, -4.9032F, 2.8781F, -0.6266F, 1.7178F));

		PartDefinition cube_r590 = rightFace.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(71, 85).mirror().addBox(-0.874F, -0.4962F, 0.034F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.1329F, 3.1615F, -4.9032F, 2.5922F, -1.1549F, 2.0714F));

		PartDefinition cube_r591 = rightFace.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(89, 77).mirror().addBox(-1.5668F, -0.6708F, -0.1401F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(57, 90).mirror().addBox(-1.4668F, -0.6708F, -0.7401F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(79, 101).mirror().addBox(0.1332F, -0.6708F, -0.7401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4869F, 2.4965F, -5.9781F, 2.881F, -1.0644F, 1.7901F));

		PartDefinition cube_r592 = rightFace.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(43, 105).mirror().addBox(-1.1365F, -0.7786F, -1.3652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(105, 0).mirror().addBox(-0.6365F, -0.7786F, -1.3652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.7427F, 1.1628F, -9.3816F, -2.8011F, -0.9121F, 0.9725F));

		PartDefinition cube_r593 = rightFace.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(23, 105).mirror().addBox(-0.1406F, -0.7786F, -0.7193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.7427F, 1.1628F, -9.3816F, -0.2724F, -0.7077F, -1.7163F));

		PartDefinition cube_r594 = rightFace.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(94, 107).mirror().addBox(0.3213F, -0.7786F, -0.1633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.7427F, 1.1628F, -9.3816F, -0.2914F, 0.7793F, -2.1037F));

		PartDefinition cube_r595 = rightFace.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(104, 84).mirror().addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5359F, 0.8461F, -9.7266F, 0.0809F, 0.8156F, -1.5739F));

		PartDefinition cube_r596 = rightFace.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(79, 104).mirror().addBox(-1.3268F, -0.7976F, -2.8176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.7349F, 1.687F, -6.9947F, 0.0731F, -0.7086F, -1.6805F));

		PartDefinition cube_r597 = rightFace.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(74, 104).mirror().addBox(-2.3081F, -0.7976F, 0.1466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(0.7349F, 1.687F, -6.9947F, 3.0467F, -0.946F, 1.5857F));

		PartDefinition cube_r598 = rightFace.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(-1.748F, -0.7976F, 0.081F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.7349F, 1.687F, -6.9947F, 3.0405F, -0.9894F, 1.5933F));

		PartDefinition cube_r599 = rightFace.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(91, 9).mirror().addBox(-0.971F, -0.5F, -0.3362F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.2634F, -10.0866F, -2.7875F, -0.5408F, 0.9673F));

		PartDefinition cube_r600 = rightFace.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(106, 3).mirror().addBox(1.7677F, -0.1697F, -0.7509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(103, 105).mirror().addBox(1.4677F, -0.1697F, -0.7509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7439F, -1.7092F, -11.3443F, -0.2362F, -0.4025F, -1.7123F));

		PartDefinition cube_r601 = rightFace.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(105, 76).mirror().addBox(-0.453F, -0.1697F, -1.938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.7439F, -1.7092F, -11.3443F, -2.3902F, -1.2499F, 0.61F));

		PartDefinition cube_r602 = rightFace.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(105, 58).mirror().addBox(-0.3023F, -0.1697F, -1.3613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7439F, -1.7092F, -11.3443F, -2.0232F, -1.3291F, 0.2286F));

		PartDefinition cube_r603 = rightFace.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(86, 3).mirror().addBox(-1.9418F, -0.1697F, -0.8911F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.7439F, -1.7092F, -11.3443F, -2.9242F, 0.0622F, 1.349F));

		PartDefinition cube_r604 = rightFace.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(105, 55).mirror().addBox(-0.7705F, -0.1697F, -0.7967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.7439F, -1.7092F, -11.3443F, -2.9241F, -0.0656F, 1.3208F));

		PartDefinition cube_r605 = rightFace.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(76, 90).mirror().addBox(-1.8F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.6804F, -0.5319F, -10.8565F, -2.8163F, -0.3762F, 1.032F));

		PartDefinition cube_r606 = rightFace.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(91, 12).mirror().addBox(-1.8146F, -0.5F, -0.6657F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6885F, -0.7844F, -10.553F, -2.8104F, -0.4175F, 1.0168F));

		PartDefinition cube_r607 = rightFace.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(91, 6).mirror().addBox(-1.0146F, -0.5F, -0.6657F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.2634F, -10.0866F, -2.7671F, -0.6224F, 0.9301F));

		PartDefinition cube_r608 = rightFace.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(94, 104).mirror().addBox(-2.2388F, -0.7976F, -0.3857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(104, 90).mirror().addBox(-2.8388F, -0.7976F, -0.3857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(104, 68).mirror().addBox(-3.4388F, -0.7976F, -0.3857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.7349F, 1.687F, -6.9947F, 3.0455F, -0.9547F, 1.5872F));

		PartDefinition cube_r609 = rightFace.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(85, 85).mirror().addBox(-1.7691F, -0.7976F, -0.5214F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.7349F, 1.687F, -6.9947F, 3.0316F, -1.0415F, 1.6037F));

		PartDefinition cube_r610 = rightFace.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(62, 35).mirror().addBox(-0.5961F, -0.5046F, -0.8449F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.1329F, 3.1615F, -4.9032F, 2.5316F, -1.1809F, 2.1772F));

		PartDefinition cube_r611 = rightFace.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(51, 97).mirror().addBox(-0.8F, -0.2F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1773F, 2.6282F, -1.2214F, 1.2539F, -0.1502F, -2.963F));

		PartDefinition cube_r612 = rightFace.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(24, 90).mirror().addBox(-0.2F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4742F, 3.3537F, -2.5134F, 0.7739F, -1.1255F, -2.2664F));

		PartDefinition cube_r613 = rightFace.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(64, 85).mirror().addBox(0.6426F, -0.3937F, -0.4273F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1329F, 3.1615F, -4.9032F, 1.3545F, -1.2744F, -2.8828F));

		PartDefinition cube_r614 = rightFace.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(65, 11).mirror().addBox(-1.8F, -0.2F, -0.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.972F, 2.7633F, -2.3389F, 1.4491F, -0.7331F, -2.1961F));

		PartDefinition cube_r615 = rightFace.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(60, 64).mirror().addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3709F, 2.4617F, -2.1465F, 0.4965F, -0.8833F, -1.966F));

		PartDefinition cube_r616 = rightFace.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(62, 17).mirror().addBox(-2.4707F, -0.6689F, -0.5303F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9115F, 1.9688F, -1.5643F, 0.8382F, -0.7331F, -2.1961F));

		PartDefinition cube_r617 = rightFace.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(104, 87).mirror().addBox(-0.7F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-1.4779F, 1.1191F, -1.436F, 1.4929F, 0.8547F, -2.1101F));

		PartDefinition cube_r618 = rightFace.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(55, 104).mirror().addBox(-0.3057F, 0.0472F, -0.5303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9115F, 1.9688F, -1.5643F, 0.8546F, 0.5205F, -3.0587F));

		PartDefinition cube_r619 = rightFace.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(73, 47).mirror().addBox(-0.2F, -1.0F, -0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9545F, 1.1918F, -0.1314F, -1.2953F, -0.5488F, 1.6502F));

		PartDefinition cube_r620 = rightFace.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(37, 97).mirror().addBox(-0.575F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5128F, 1.1602F, -0.3172F, -0.9643F, 0.0397F, 0.5189F));

		PartDefinition cube_r621 = rightFace.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(43, 94).mirror().addBox(-1.0692F, -1.7936F, -0.5303F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.9115F, 1.9688F, -1.5643F, -0.8335F, 0.5601F, 0.9409F));

		PartDefinition cube_r622 = rightFace.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(97, 62).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4973F, 0.0847F, -0.2867F, -0.5666F, -0.4036F, 0.192F));

		PartDefinition cube_r623 = rightFace.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(5, 97).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4973F, 0.0847F, -0.2867F, -0.53F, -0.2172F, 0.0727F));

		PartDefinition cube_r624 = rightFace.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(20, 97).mirror().addBox(0.0F, -0.1F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1094F, -0.5301F, 1.6774F, -1.6222F, -0.768F, 1.4876F));

		PartDefinition cube_r625 = rightFace.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(10, 97).mirror().addBox(0.0F, -0.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7043F, -1.2207F, 1.0783F, -0.8757F, -0.3614F, 0.2438F));

		PartDefinition cube_r626 = rightFace.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(0, 97).mirror().addBox(0.0F, -0.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7043F, -1.2207F, 1.0783F, -0.8267F, -0.2172F, 0.0727F));

		PartDefinition cube_r627 = rightFace.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(56, 20).mirror().addBox(-0.65F, -0.475F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3213F, -0.8692F, 1.5576F, 0.7546F, -0.3118F, -0.0338F));

		PartDefinition cube_r628 = rightFace.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(33, 67).mirror().addBox(-0.3F, -0.3F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-0.1337F, 1.4027F, -2.0213F, 2.0872F, -0.8515F, -1.3669F));

		PartDefinition cube_r629 = rightFace.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(26, 67).mirror().addBox(-0.3F, -0.3F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-0.1337F, 1.4027F, -2.0213F, 1.4763F, -0.8515F, -1.3669F));

		PartDefinition cube_r630 = rightFace.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(93, 15).mirror().addBox(-0.3F, -0.3F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-0.1278F, 1.5395F, -2.1671F, 0.6393F, -0.4318F, 0.4694F));

		PartDefinition cube_r631 = rightFace.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(10, 93).mirror().addBox(-0.5257F, -0.8923F, 0.8658F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false)
				.texOffs(0, 93).mirror().addBox(-0.5257F, -0.8923F, 0.6408F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1031F, 2.9107F, -2.7446F, 0.7521F, -0.0619F, 0.0227F));

		PartDefinition cube_r632 = rightFace.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(17, 91).mirror().addBox(-0.5129F, -0.1669F, -0.2326F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(59, 85).mirror().addBox(-0.5129F, -0.1669F, -0.6326F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.1031F, 2.9107F, -2.7446F, -0.8315F, -0.0935F, -0.0073F));

		PartDefinition cube_r633 = rightFace.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(35, 62).mirror().addBox(-0.3F, -1.0F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.0929F, 2.4181F, -2.8623F, -0.6896F, -0.534F, 0.3596F));

		PartDefinition cube_r634 = rightFace.addOrReplaceChild("cube_r634", CubeListBuilder.create().texOffs(61, 49).mirror().addBox(-0.5088F, -1.3536F, -0.6554F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.1031F, 2.9107F, -2.7446F, -0.5813F, -0.0725F, 0.0097F));

		PartDefinition cube_r635 = rightFace.addOrReplaceChild("cube_r635", CubeListBuilder.create().texOffs(93, 0).mirror().addBox(-0.3F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1211F, 1.6934F, -2.331F, 0.6425F, -0.4266F, 0.4617F));

		PartDefinition cube_r636 = rightFace.addOrReplaceChild("cube_r636", CubeListBuilder.create().texOffs(28, 113).mirror().addBox(-0.7F, -0.3F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(113, 24).mirror().addBox(-0.7F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2194F, 6.3196F, -6.6219F, 1.4738F, 1.2478F, 1.5328F));

		PartDefinition cube_r637 = rightFace.addOrReplaceChild("cube_r637", CubeListBuilder.create().texOffs(15, 113).mirror().addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2179F, 6.4086F, -6.2551F, 0.4896F, 0.8368F, 0.3674F));

		PartDefinition cube_r638 = rightFace.addOrReplaceChild("cube_r638", CubeListBuilder.create().texOffs(10, 113).mirror().addBox(-1.0767F, 0.067F, -2.2343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2744F, 5.1127F, -4.7102F, 0.4078F, -0.017F, -0.015F));

		PartDefinition cube_r639 = rightFace.addOrReplaceChild("cube_r639", CubeListBuilder.create().texOffs(0, 113).mirror().addBox(-1.0917F, -0.4337F, -1.9864F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.2744F, 5.1127F, -4.7102F, 0.6997F, 0.0026F, -0.0435F));

		PartDefinition cube_r640 = rightFace.addOrReplaceChild("cube_r640", CubeListBuilder.create().texOffs(25, 99).mirror().addBox(-0.7945F, -0.4337F, -1.7272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2744F, 5.1127F, -4.7102F, 0.7119F, 0.1689F, 0.0983F));

		PartDefinition cube_r641 = rightFace.addOrReplaceChild("cube_r641", CubeListBuilder.create().texOffs(65, 20).mirror().addBox(-0.9258F, -0.7572F, -1.3703F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2744F, 5.1127F, -4.7102F, 0.8886F, 0.0394F, 0.0901F));

		PartDefinition cube_r642 = rightFace.addOrReplaceChild("cube_r642", CubeListBuilder.create().texOffs(19, 67).mirror().addBox(-0.7983F, -0.4308F, -1.3722F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2744F, 5.1127F, -4.7102F, 0.6149F, 0.1119F, 0.0383F));

		PartDefinition cube_r643 = rightFace.addOrReplaceChild("cube_r643", CubeListBuilder.create().texOffs(73, 55).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3315F, -2.4565F, 2.3936F, 0.1336F, -0.7608F, 0.9975F));

		PartDefinition cube_r644 = rightFace.addOrReplaceChild("cube_r644", CubeListBuilder.create().texOffs(38, 81).mirror().addBox(-3.4393F, 0.0887F, -0.3609F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.7229F, -2.8453F, 2.8689F, 0.8469F, -0.0178F, 0.7752F));

		PartDefinition cube_r645 = rightFace.addOrReplaceChild("cube_r645", CubeListBuilder.create().texOffs(87, 43).mirror().addBox(-4.3765F, 0.8119F, -1.3831F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7229F, -2.8453F, 2.8689F, 0.8767F, 0.0211F, 1.2084F));

		PartDefinition cube_r646 = rightFace.addOrReplaceChild("cube_r646", CubeListBuilder.create().texOffs(87, 49).mirror().addBox(-4.925F, 0.8119F, -2.9604F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(87, 46).mirror().addBox(-4.925F, 0.8119F, -3.3604F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-2.7229F, -2.8453F, 2.8689F, 0.932F, 0.2936F, 1.5546F));

		PartDefinition cube_r647 = rightFace.addOrReplaceChild("cube_r647", CubeListBuilder.create().texOffs(87, 71).mirror().addBox(-5.4297F, 0.8119F, -4.0459F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7229F, -2.8453F, 2.8689F, 1.0159F, 0.4415F, 1.7865F));

		PartDefinition cube_r648 = rightFace.addOrReplaceChild("cube_r648", CubeListBuilder.create().texOffs(106, 30).mirror().addBox(2.206F, 0.8119F, -6.9459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7229F, -2.8453F, 2.8689F, 2.0104F, 0.5563F, -2.8017F));

		PartDefinition cube_r649 = rightFace.addOrReplaceChild("cube_r649", CubeListBuilder.create().texOffs(101, 24).mirror().addBox(-4.6732F, 0.8119F, -5.613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-2.7229F, -2.8453F, 2.8689F, 1.1698F, 0.5832F, 2.0977F));

		PartDefinition cube_r650 = rightFace.addOrReplaceChild("cube_r650", CubeListBuilder.create().texOffs(106, 22).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-5.1784F, -8.8295F, 4.5676F, 1.0575F, 0.4904F, 1.879F));

		PartDefinition cube_r651 = rightFace.addOrReplaceChild("cube_r651", CubeListBuilder.create().texOffs(87, 52).mirror().addBox(-4.7466F, 0.8119F, -5.0612F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.7229F, -2.8453F, 2.8689F, 1.0961F, 0.5276F, 1.9582F));

		PartDefinition cube_r652 = rightFace.addOrReplaceChild("cube_r652", CubeListBuilder.create().texOffs(87, 40).mirror().addBox(-4.2175F, 0.8119F, -2.101F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.7229F, -2.8453F, 2.8689F, 0.88F, 0.0769F, 1.2756F));

		PartDefinition cube_r653 = rightFace.addOrReplaceChild("cube_r653", CubeListBuilder.create().texOffs(7, 82).mirror().addBox(-3.4509F, 0.0887F, -1.0744F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7229F, -2.8453F, 2.8689F, 0.8476F, 0.0399F, 0.8406F));

		PartDefinition cube_r654 = rightFace.addOrReplaceChild("cube_r654", CubeListBuilder.create().texOffs(106, 50).mirror().addBox(-3.0179F, 0.0887F, 0.9144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.7229F, -2.8453F, 2.8689F, 0.969F, -0.4304F, 0.2494F));

		PartDefinition cube_r655 = rightFace.addOrReplaceChild("cube_r655", CubeListBuilder.create().texOffs(106, 15).mirror().addBox(-2.7561F, 0.0887F, 0.1787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.7229F, -2.8453F, 2.8689F, 0.9385F, -0.3799F, 0.3268F));

		PartDefinition cube_r656 = rightFace.addOrReplaceChild("cube_r656", CubeListBuilder.create().texOffs(52, 82).mirror().addBox(-2.1834F, -0.2208F, -0.4252F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.7229F, -2.8453F, 2.8689F, 0.8482F, -0.0664F, 0.4651F));

		PartDefinition cube_r657 = rightFace.addOrReplaceChild("cube_r657", CubeListBuilder.create().texOffs(31, 81).mirror().addBox(-1.8601F, -0.2208F, -0.0539F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7229F, -2.8453F, 2.8689F, 0.8458F, -0.0086F, 0.5306F));

		PartDefinition cube_r658 = rightFace.addOrReplaceChild("cube_r658", CubeListBuilder.create().texOffs(65, 3).mirror().addBox(-0.6491F, -0.2761F, -0.0195F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.7229F, -2.8453F, 2.8689F, 0.9663F, -0.1743F, 0.064F));

		PartDefinition cube_r659 = rightFace.addOrReplaceChild("cube_r659", CubeListBuilder.create().texOffs(38, 87).mirror().addBox(-0.6684F, -0.2761F, -0.3598F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7229F, -2.8453F, 2.8689F, 0.9485F, -0.0737F, 0.2078F));

		PartDefinition cube_r660 = rightFace.addOrReplaceChild("cube_r660", CubeListBuilder.create().texOffs(87, 37).mirror().addBox(-1.025F, -0.55F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.7602F, -2.8144F, 3.8098F, 0.8852F, -0.3701F, -0.1696F));

		PartDefinition cube_r661 = rightFace.addOrReplaceChild("cube_r661", CubeListBuilder.create().texOffs(53, 35).mirror().addBox(0.275F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.8511F, -3.0951F, 3.0244F, 0.7125F, -0.322F, -0.0297F));

		PartDefinition cube_r662 = rightFace.addOrReplaceChild("cube_r662", CubeListBuilder.create().texOffs(5, 113).mirror().addBox(-0.8679F, -0.9981F, -1.9012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(112, 59).mirror().addBox(-0.8679F, -0.9981F, -1.6761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.2744F, 5.1127F, -4.7102F, 1.0526F, 0.1324F, 0.0409F));

		PartDefinition cube_r663 = rightFace.addOrReplaceChild("cube_r663", CubeListBuilder.create().texOffs(68, 59).mirror().addBox(-0.5006F, -0.4802F, -1.8328F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.139F, 4.2504F, -3.3039F, 0.4646F, -0.2003F, 0.0762F));

		PartDefinition cube_r664 = rightFace.addOrReplaceChild("cube_r664", CubeListBuilder.create().texOffs(93, 33).mirror().addBox(-0.4196F, -0.1727F, -0.4442F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.139F, 4.2504F, -3.3039F, 1.9938F, -0.274F, 0.0363F));

		PartDefinition cube_r665 = rightFace.addOrReplaceChild("cube_r665", CubeListBuilder.create().texOffs(61, 54).mirror().addBox(-0.55F, -0.8F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7951F, -2.1527F, 5.5959F, 1.9731F, -1.5077F, 0.0288F));

		PartDefinition cube_r666 = rightFace.addOrReplaceChild("cube_r666", CubeListBuilder.create().texOffs(30, 99).mirror().addBox(-0.3766F, -0.8603F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6967F, 3.041F, -1.5026F, -2.9063F, -0.3104F, -0.0431F));

		PartDefinition cube_r667 = rightFace.addOrReplaceChild("cube_r667", CubeListBuilder.create().texOffs(99, 40).mirror().addBox(0.0F, -0.7F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2986F, 2.6767F, -0.7977F, 1.9939F, 0.2235F, -1.0211F));

		PartDefinition cube_r668 = rightFace.addOrReplaceChild("cube_r668", CubeListBuilder.create().texOffs(99, 37).mirror().addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3863F, 3.0204F, -0.3348F, 1.9862F, -0.2381F, -0.0725F));

		PartDefinition cube_r669 = rightFace.addOrReplaceChild("cube_r669", CubeListBuilder.create().texOffs(90, 101).mirror().addBox(-0.0129F, -0.0075F, -0.4726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3973F, 2.3807F, -0.142F, 0.3199F, 0.333F, -0.9806F));

		PartDefinition cube_r670 = rightFace.addOrReplaceChild("cube_r670", CubeListBuilder.create().texOffs(28, 62).mirror().addBox(0.0F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0284F, -0.4517F, 0.294F, 2.1387F, -0.2633F, 0.3584F));

		PartDefinition cube_r671 = rightFace.addOrReplaceChild("cube_r671", CubeListBuilder.create().texOffs(21, 62).mirror().addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0452F, 0.129F, -0.5199F, 2.2238F, -0.2935F, 0.3364F));

		PartDefinition cube_r672 = rightFace.addOrReplaceChild("cube_r672", CubeListBuilder.create().texOffs(22, 93).mirror().addBox(-0.7F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(0.0531F, 0.4994F, -0.9681F, 2.5066F, 0.2615F, -2.4794F));

		PartDefinition cube_r673 = rightFace.addOrReplaceChild("cube_r673", CubeListBuilder.create().texOffs(101, 73).mirror().addBox(-0.0129F, -0.5074F, -0.9726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4579F, 2.615F, 0.5224F, 0.4485F, -0.094F, -0.0091F));

		PartDefinition cube_r674 = rightFace.addOrReplaceChild("cube_r674", CubeListBuilder.create().texOffs(106, 12).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0431F, -3.4407F, 3.5531F, -0.9516F, 0.38F, 0.3549F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5822F, -1.2343F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r675 = jaw.addOrReplaceChild("cube_r675", CubeListBuilder.create().texOffs(15, 96).mirror().addBox(-0.45F, -1.35F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2819F, 0.7864F, 0.0755F, -0.0971F, -0.0362F, -0.1057F));

		PartDefinition cube_r676 = jaw.addOrReplaceChild("cube_r676", CubeListBuilder.create().texOffs(74, 101).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8353F, 3.7071F, 0.3413F, -1.9548F, -0.0873F, -0.0698F));

		PartDefinition cube_r677 = jaw.addOrReplaceChild("cube_r677", CubeListBuilder.create().texOffs(66, 71).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8353F, 3.7071F, 0.3413F, 3.0194F, -0.0873F, -0.0698F));

		PartDefinition cube_r678 = jaw.addOrReplaceChild("cube_r678", CubeListBuilder.create().texOffs(94, 37).mirror().addBox(-0.5F, -1.975F, -1.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7665F, 2.5017F, -1.1732F, -0.3665F, -0.0873F, -0.0698F));

		PartDefinition cube_r679 = jaw.addOrReplaceChild("cube_r679", CubeListBuilder.create().texOffs(65, 38).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 101).mirror().addBox(-0.5F, -1.0F, 1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.9151F, 2.7177F, 0.4627F, 1.6232F, -0.0873F, -0.0698F));

		PartDefinition cube_r680 = jaw.addOrReplaceChild("cube_r680", CubeListBuilder.create().texOffs(47, 10).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.738F, 4.6297F, -0.0319F, -1.1694F, -0.0873F, -0.0698F));

		PartDefinition cube_r681 = jaw.addOrReplaceChild("cube_r681", CubeListBuilder.create().texOffs(58, 39).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6308F, 5.0139F, -0.9489F, 0.096F, -0.0873F, -0.0698F));

		PartDefinition cube_r682 = jaw.addOrReplaceChild("cube_r682", CubeListBuilder.create().texOffs(94, 45).mirror().addBox(-0.5F, -1.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.8991F, 0.2944F, -1.4214F, -0.192F, -0.0873F, -0.0698F));

		PartDefinition cube_r683 = jaw.addOrReplaceChild("cube_r683", CubeListBuilder.create().texOffs(0, 88).mirror().addBox(-0.5F, -1.0F, -0.95F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.6383F, 3.2634F, -2.0274F, -0.8029F, -0.0873F, -0.0698F));

		PartDefinition cube_r684 = jaw.addOrReplaceChild("cube_r684", CubeListBuilder.create().texOffs(73, 71).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5986F, 4.1099F, -2.036F, 0.2094F, -0.0873F, -0.0698F));

		PartDefinition cube_r685 = jaw.addOrReplaceChild("cube_r685", CubeListBuilder.create().texOffs(74, 0).mirror().addBox(-0.1025F, -4.0373F, -0.0244F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7494F, 5.4899F, -3.7777F, 1.6705F, -0.1395F, -0.0702F));

		PartDefinition cube_r686 = jaw.addOrReplaceChild("cube_r686", CubeListBuilder.create().texOffs(75, 97).mirror().addBox(-0.8509F, -2.2551F, -0.3784F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5994F, 5.4899F, -7.2777F, 1.7216F, -0.1221F, -0.0701F));

		PartDefinition cube_r687 = jaw.addOrReplaceChild("cube_r687", CubeListBuilder.create().texOffs(97, 77).mirror().addBox(-0.8509F, -3.1015F, -0.1926F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.5994F, 5.4899F, -7.2777F, 1.8089F, -0.1221F, -0.0701F));

		PartDefinition cube_r688 = jaw.addOrReplaceChild("cube_r688", CubeListBuilder.create().texOffs(35, 101).mirror().addBox(-0.8509F, -3.1193F, 1.4081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5994F, 5.4899F, -7.2777F, 2.3761F, -0.1221F, -0.0701F));

		PartDefinition cube_r689 = jaw.addOrReplaceChild("cube_r689", CubeListBuilder.create().texOffs(7, 74).mirror().addBox(-0.8509F, -4.004F, -0.0214F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.5994F, 5.4899F, -7.2777F, 1.8001F, -0.1221F, -0.0701F));

		PartDefinition cube_r690 = jaw.addOrReplaceChild("cube_r690", CubeListBuilder.create().texOffs(93, 110).mirror().addBox(-0.8509F, -2.3123F, 2.4738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(-0.5994F, 5.4899F, -7.2777F, 2.7688F, -0.1221F, -0.0701F));

		PartDefinition cube_r691 = jaw.addOrReplaceChild("cube_r691", CubeListBuilder.create().texOffs(68, 110).mirror().addBox(-0.8509F, -1.7078F, 3.5605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5994F, 5.4899F, -7.2777F, 2.9433F, -0.1221F, -0.0701F));

		PartDefinition cube_r692 = jaw.addOrReplaceChild("cube_r692", CubeListBuilder.create().texOffs(19, 77).mirror().addBox(-0.1025F, -3.6021F, 0.7736F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(5, 88).mirror().addBox(-0.1025F, -3.8021F, 1.2736F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7494F, 5.4899F, -3.7777F, 1.7577F, -0.1395F, -0.0702F));

		PartDefinition cube_r693 = jaw.addOrReplaceChild("cube_r693", CubeListBuilder.create().texOffs(63, 112).mirror().addBox(-0.8509F, -0.4753F, 0.1933F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5994F, 5.4899F, -7.2777F, 2.1492F, -0.1221F, -0.0701F));

		PartDefinition cube_r694 = jaw.addOrReplaceChild("cube_r694", CubeListBuilder.create().texOffs(81, 93).mirror().addBox(-0.5F, -0.075F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3555F, 3.9081F, -4.9686F, 1.9722F, -0.0873F, -0.0698F));

		PartDefinition cube_r695 = jaw.addOrReplaceChild("cube_r695", CubeListBuilder.create().texOffs(106, 99).mirror().addBox(-0.7348F, -0.1374F, -0.3143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7284F, 5.5352F, -11.5163F, -2.2206F, -0.9134F, 1.0901F));

		PartDefinition cube_r696 = jaw.addOrReplaceChild("cube_r696", CubeListBuilder.create().texOffs(0, 107).mirror().addBox(-0.455F, 0.1376F, -0.3143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.7284F, 5.5352F, -11.5163F, -1.9533F, -0.1365F, 0.6032F));

		PartDefinition cube_r697 = jaw.addOrReplaceChild("cube_r697", CubeListBuilder.create().texOffs(5, 107).mirror().addBox(-0.001F, 0.2577F, -0.6166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(10, 107).mirror().addBox(-0.001F, -0.1423F, -0.6166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7444F, 6.0801F, -11.8019F, -2.1068F, -0.0777F, 0.0224F));

		PartDefinition cube_r698 = jaw.addOrReplaceChild("cube_r698", CubeListBuilder.create().texOffs(18, 107).mirror().addBox(0.0535F, -0.325F, -0.3143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(28, 107).mirror().addBox(0.0535F, 0.075F, -0.3143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.7284F, 5.5352F, -11.5163F, -1.9894F, 0.4287F, 0.3657F));

		PartDefinition cube_r699 = jaw.addOrReplaceChild("cube_r699", CubeListBuilder.create().texOffs(94, 45).addBox(-0.5F, -1.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.8991F, 0.2944F, -1.4214F, -0.192F, 0.0873F, 0.0698F));

		PartDefinition cube_r700 = jaw.addOrReplaceChild("cube_r700", CubeListBuilder.create().texOffs(0, 88).addBox(-0.5F, -1.0F, -0.95F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.6383F, 3.2634F, -2.0274F, -0.8029F, 0.0873F, 0.0698F));

		PartDefinition cube_r701 = jaw.addOrReplaceChild("cube_r701", CubeListBuilder.create().texOffs(94, 37).addBox(-0.5F, -1.975F, -1.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7665F, 2.5017F, -1.1732F, -0.3665F, 0.0873F, 0.0698F));

		PartDefinition cube_r702 = jaw.addOrReplaceChild("cube_r702", CubeListBuilder.create().texOffs(95, 101).addBox(-0.5F, -1.0F, 1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(65, 38).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9151F, 2.7177F, 0.4627F, 1.6232F, 0.0873F, 0.0698F));

		PartDefinition cube_r703 = jaw.addOrReplaceChild("cube_r703", CubeListBuilder.create().texOffs(66, 71).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.8353F, 3.7071F, 0.3413F, 3.0194F, 0.0873F, 0.0698F));

		PartDefinition cube_r704 = jaw.addOrReplaceChild("cube_r704", CubeListBuilder.create().texOffs(63, 112).addBox(-0.1491F, -0.4753F, 0.1933F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5994F, 5.4899F, -7.2777F, 2.1492F, 0.1221F, 0.0701F));

		PartDefinition cube_r705 = jaw.addOrReplaceChild("cube_r705", CubeListBuilder.create().texOffs(7, 74).addBox(-0.1491F, -4.004F, -0.0214F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.5994F, 5.4899F, -7.2777F, 1.8001F, 0.1221F, 0.0701F));

		PartDefinition cube_r706 = jaw.addOrReplaceChild("cube_r706", CubeListBuilder.create().texOffs(106, 99).addBox(-0.2651F, -0.1374F, -0.3143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7284F, 5.5352F, -11.5163F, -2.2206F, 0.9134F, -1.0901F));

		PartDefinition cube_r707 = jaw.addOrReplaceChild("cube_r707", CubeListBuilder.create().texOffs(0, 107).addBox(-0.545F, 0.1376F, -0.3143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.7284F, 5.5352F, -11.5163F, -1.9533F, 0.1365F, -0.6032F));

		PartDefinition cube_r708 = jaw.addOrReplaceChild("cube_r708", CubeListBuilder.create().texOffs(5, 107).addBox(-0.999F, 0.2577F, -0.6166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(10, 107).addBox(-0.999F, -0.1423F, -0.6166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7444F, 6.0801F, -11.8019F, -2.1068F, 0.0777F, -0.0224F));

		PartDefinition cube_r709 = jaw.addOrReplaceChild("cube_r709", CubeListBuilder.create().texOffs(18, 107).addBox(-1.0535F, -0.325F, -0.3143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(28, 107).addBox(-1.0535F, 0.075F, -0.3143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.7284F, 5.5352F, -11.5163F, -1.9894F, -0.4287F, -0.3657F));

		PartDefinition cube_r710 = jaw.addOrReplaceChild("cube_r710", CubeListBuilder.create().texOffs(68, 110).addBox(-0.1491F, -1.7078F, 3.5605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5994F, 5.4899F, -7.2777F, 2.9433F, 0.1221F, 0.0701F));

		PartDefinition cube_r711 = jaw.addOrReplaceChild("cube_r711", CubeListBuilder.create().texOffs(93, 110).addBox(-0.1491F, -2.3123F, 2.4738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(0.5994F, 5.4899F, -7.2777F, 2.7688F, 0.1221F, 0.0701F));

		PartDefinition cube_r712 = jaw.addOrReplaceChild("cube_r712", CubeListBuilder.create().texOffs(35, 101).addBox(-0.1491F, -3.1193F, 1.4081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5994F, 5.4899F, -7.2777F, 2.3761F, 0.1221F, 0.0701F));

		PartDefinition cube_r713 = jaw.addOrReplaceChild("cube_r713", CubeListBuilder.create().texOffs(97, 77).addBox(-0.1491F, -3.1015F, -0.1926F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.5994F, 5.4899F, -7.2777F, 1.8089F, 0.1221F, 0.0701F));

		PartDefinition cube_r714 = jaw.addOrReplaceChild("cube_r714", CubeListBuilder.create().texOffs(75, 97).addBox(-0.1491F, -2.2551F, -0.3784F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5994F, 5.4899F, -7.2777F, 1.7216F, 0.1221F, 0.0701F));

		PartDefinition cube_r715 = jaw.addOrReplaceChild("cube_r715", CubeListBuilder.create().texOffs(5, 88).addBox(-0.8975F, -3.8021F, 1.2736F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(19, 77).addBox(-0.8975F, -3.6021F, 0.7736F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.7494F, 5.4899F, -3.7777F, 1.7577F, 0.1395F, 0.0702F));

		PartDefinition cube_r716 = jaw.addOrReplaceChild("cube_r716", CubeListBuilder.create().texOffs(81, 93).addBox(-0.5F, -0.075F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3556F, 3.9081F, -4.9686F, 1.9722F, 0.0873F, 0.0698F));

		PartDefinition cube_r717 = jaw.addOrReplaceChild("cube_r717", CubeListBuilder.create().texOffs(74, 0).addBox(-0.8975F, -4.0373F, -0.0244F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7494F, 5.4899F, -3.7777F, 1.6705F, 0.1395F, 0.0702F));

		PartDefinition cube_r718 = jaw.addOrReplaceChild("cube_r718", CubeListBuilder.create().texOffs(73, 71).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5986F, 4.1099F, -2.036F, 0.2094F, 0.0873F, 0.0698F));

		PartDefinition cube_r719 = jaw.addOrReplaceChild("cube_r719", CubeListBuilder.create().texOffs(58, 39).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6308F, 5.0139F, -0.9489F, 0.096F, 0.0873F, 0.0698F));

		PartDefinition cube_r720 = jaw.addOrReplaceChild("cube_r720", CubeListBuilder.create().texOffs(47, 10).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.7381F, 4.6297F, -0.0319F, -1.1694F, 0.0873F, 0.0698F));

		PartDefinition cube_r721 = jaw.addOrReplaceChild("cube_r721", CubeListBuilder.create().texOffs(74, 101).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8353F, 3.7071F, 0.3413F, -1.9548F, 0.0873F, 0.0698F));

		PartDefinition cube_r722 = jaw.addOrReplaceChild("cube_r722", CubeListBuilder.create().texOffs(15, 96).addBox(-0.55F, -1.35F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2819F, 0.7864F, 0.0755F, -0.0971F, 0.0362F, 0.1057F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 72).addBox(-0.5F, -0.1497F, -0.0853F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2305F, 2.7086F, -0.2531F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(24, 79).addBox(-0.5F, -0.1402F, -0.0232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, -0.0186F, 1.919F, -0.2705F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(72, 6).addBox(-0.5F, -0.9402F, -0.0232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.781F, 1.8269F, -0.2443F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(72, 17).addBox(-0.5F, -0.0402F, -0.0232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(103, 65).addBox(-0.5F, -0.0402F, -0.0232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.3054F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 120, 120);
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