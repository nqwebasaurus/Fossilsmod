package fossils.fossils.client.blockentity.model.protoceras;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ProtocerasFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone2;
	private final ModelPart bone3;
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
	private final ModelPart bone4;
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

	public ProtocerasFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone2 = this.hips.getChild("bone2");
		this.bone3 = this.hips.getChild("bone3");
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
		this.bone4 = this.chest2.getChild("bone4");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -31.7402F, 12.4534F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(78, 80).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -1.7429F, 1.1028F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(46, 53).addBox(0.0F, -1.4F, -2.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.52F, 0.2575F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(35, 94).addBox(0.0F, -2.1201F, -1.0189F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7434F, -2.3032F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(86, 34).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1566F, -0.8295F, -0.5442F, -0.2404F, -0.6718F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(64, 37).mirror().addBox(-2.2F, 0.3F, -0.1F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6233F, -3.2027F, 0.0023F, -0.2221F, -0.36F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(64, 37).addBox(-0.8F, 0.3F, -0.1F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6233F, -3.2027F, 0.0023F, 0.2221F, 0.36F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(86, 34).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1566F, -0.8295F, -0.5442F, 0.2404F, 0.6718F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(30, 21).addBox(-1.0F, -0.675F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.7467F, 1.8131F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, -0.2F, 1.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7318F, 1.6393F, -0.0283F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bone2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(95, 0).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(0.1016F, 0.221F, 1.8072F, -0.6503F, -1.4197F, 1.9066F));

		PartDefinition cube_r11 = bone2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(94, 88).addBox(-0.775F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3658F, 0.9537F, 1.4915F, -0.0913F, -0.0103F, 1.2627F));

		PartDefinition cube_r12 = bone2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(62, 92).addBox(-0.6F, -0.5F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1497F, 0.7474F, 3.0557F, -2.9702F, 1.0072F, -1.7345F));

		PartDefinition cube_r13 = bone2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 60).addBox(-1.4467F, -0.2321F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6989F, 2.4043F, 4.5704F, 1.1483F, 0.4855F, 2.5309F));

		PartDefinition cube_r14 = bone2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(42, 59).addBox(-1.4467F, -0.7679F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6989F, 2.4043F, 4.5704F, 1.0015F, 0.8328F, 2.2955F));

		PartDefinition cube_r15 = bone2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(94, 72).addBox(0.2267F, -0.8724F, -1.0672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1878F, 1.4447F, 4.7993F, 1.7077F, -1.3273F, -0.4582F));

		PartDefinition cube_r16 = bone2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(94, 69).addBox(0.5375F, -0.8724F, 0.5287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1878F, 1.4447F, 4.7993F, 0.2821F, -0.5395F, 1.1058F));

		PartDefinition cube_r17 = bone2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(94, 66).addBox(-1.0883F, -0.8724F, 1.1664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1878F, 1.4447F, 4.7993F, 0.25F, 0.2635F, 1.32F));

		PartDefinition cube_r18 = bone2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(94, 63).addBox(-1.3268F, -0.8724F, 0.2448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(94, 36).addBox(-0.9268F, -0.8724F, 0.2448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1878F, 1.4447F, 4.7993F, 0.2662F, 0.4323F, 1.3674F));

		PartDefinition cube_r19 = bone2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(30, 94).addBox(-0.7405F, -0.8724F, -0.063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1878F, 1.4447F, 4.7993F, 0.6364F, 1.1572F, 1.8485F));

		PartDefinition cube_r20 = bone2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(47, 45).addBox(-0.6405F, -0.8724F, -0.063F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1878F, 1.4447F, 4.7993F, -2.8368F, 1.2623F, -1.5886F));

		PartDefinition cube_r21 = bone2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 80).addBox(-0.375F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.2508F, 2.5146F, 1.7289F, 0.5195F, 1.3571F, 1.4905F));

		PartDefinition cube_r22 = bone2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 94).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3477F, 1.2197F, 2.5636F, -0.2866F, 1.2426F, 0.9898F));

		PartDefinition cube_r23 = bone2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(93, 92).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.7942F, 2.4773F, 2.0956F, -3.0405F, 0.4446F, -1.8362F));

		PartDefinition cube_r24 = bone2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(54, 93).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8301F, 2.2943F, 1.1131F, -2.6313F, 1.3831F, -1.3771F));

		PartDefinition cube_r25 = bone2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(68, 39).addBox(-0.875F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5721F, 1.3376F, 0.6194F, -0.1661F, 0.9869F, 1.1229F));

		PartDefinition cube_r26 = bone2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(68, 28).addBox(-0.5215F, -0.8675F, -0.7976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0332F, 0.7294F, 0.1764F, -0.1223F, 0.7277F, 1.1802F));

		PartDefinition cube_r27 = bone2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 68).addBox(-0.6882F, -0.8675F, -1.4886F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0332F, 0.7294F, 0.1764F, -0.1023F, 0.4675F, 1.2156F));

		PartDefinition cube_r28 = bone2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(67, 43).addBox(-0.4F, -0.5F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.123F, -0.714F, -1.2559F, -0.4002F, 0.5528F, 0.698F));

		PartDefinition cube_r29 = bone2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(42, 67).addBox(0.1988F, -0.5493F, -1.7201F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.4006F, -0.453F, -0.3262F, -0.4708F, 0.7509F, 0.5824F));

		PartDefinition cube_r30 = bone2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(47, 10).addBox(-0.35F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2589F, -0.353F, -1.4932F, -0.3507F, 0.2642F, 0.8214F));

		PartDefinition cube_r31 = bone2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(49, 93).addBox(0.7397F, -0.2462F, -3.4833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4006F, -0.453F, -0.3262F, -0.7971F, 0.7579F, 0.3679F));

		PartDefinition cube_r32 = bone2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 52).addBox(-3.685F, -0.0626F, -0.9194F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4006F, -0.453F, -0.3262F, -1.7215F, -0.9471F, 2.4408F));

		PartDefinition cube_r33 = bone2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(79, 47).addBox(-5.3222F, -0.0626F, -1.0925F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4006F, -0.453F, -0.3262F, -1.6609F, -0.9523F, 2.3663F));

		PartDefinition cube_r34 = bone2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(105, 57).addBox(-2.9646F, -0.0626F, 3.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4006F, -0.453F, -0.3262F, -2.4624F, -0.4047F, -2.7644F));

		PartDefinition cube_r35 = bone2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(51, 4).addBox(1.0328F, -0.2463F, 1.8093F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4006F, -0.453F, -0.3262F, -2.5546F, 0.3541F, -1.9339F));

		PartDefinition cube_r36 = bone2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(93, 46).addBox(-3.5375F, -0.2463F, -0.8199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4006F, -0.453F, -0.3262F, -0.6635F, -0.5669F, 1.3785F));

		PartDefinition cube_r37 = bone2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(44, 93).addBox(-2.4239F, -0.2462F, -1.8438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4006F, -0.453F, -0.3262F, -0.565F, -0.2443F, 1.1332F));

		PartDefinition cube_r38 = bone2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(51, 0).addBox(-2.5169F, -0.2462F, 0.5797F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4006F, -0.453F, -0.3262F, -2.243F, -0.8447F, -2.9148F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7318F, 1.6393F, -0.0283F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(95, 0).mirror().addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-0.1016F, 0.221F, 1.8072F, -0.6503F, 1.4197F, -1.9066F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(94, 88).mirror().addBox(-0.225F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3658F, 0.9537F, 1.4915F, -0.0913F, 0.0103F, -1.2627F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(62, 92).mirror().addBox(-0.4F, -0.5F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1497F, 0.7474F, 3.0557F, -2.9702F, -1.0072F, 1.7345F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-1.5533F, -0.2321F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6989F, 2.4043F, 4.5704F, 1.1483F, -0.4855F, -2.5309F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(42, 59).mirror().addBox(-1.5533F, -0.7679F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.6989F, 2.4043F, 4.5704F, 1.0015F, -0.8328F, -2.2955F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(94, 72).mirror().addBox(-1.2267F, -0.8724F, -1.0672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1878F, 1.4447F, 4.7993F, 1.7077F, 1.3273F, 0.4582F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(94, 69).mirror().addBox(-1.5375F, -0.8724F, 0.5287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1878F, 1.4447F, 4.7993F, 0.2821F, 0.5395F, -1.1058F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(94, 66).mirror().addBox(0.0883F, -0.8724F, 1.1664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1878F, 1.4447F, 4.7993F, 0.25F, -0.2635F, -1.32F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(94, 63).mirror().addBox(0.3268F, -0.8724F, 0.2448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(94, 36).mirror().addBox(-0.0732F, -0.8724F, 0.2448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1878F, 1.4447F, 4.7993F, 0.2662F, -0.4323F, -1.3674F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(30, 94).mirror().addBox(-0.2595F, -0.8724F, -0.063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.1878F, 1.4447F, 4.7993F, 0.6364F, -1.1572F, -1.8485F));

		PartDefinition cube_r49 = bone3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(47, 45).mirror().addBox(-3.3595F, -0.8724F, -0.063F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1878F, 1.4447F, 4.7993F, -2.8368F, -1.2623F, 1.5886F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.625F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.2508F, 2.5146F, 1.7289F, 0.5195F, -1.3571F, -1.4905F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 94).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3477F, 1.2197F, 2.5636F, -0.2866F, -1.2426F, -0.9898F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(93, 92).mirror().addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.7942F, 2.4773F, 2.0956F, -3.0405F, -0.4446F, 1.8362F));

		PartDefinition cube_r53 = bone3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(54, 93).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8301F, 2.2943F, 1.1131F, -2.6313F, -1.3831F, 1.3771F));

		PartDefinition cube_r54 = bone3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(68, 39).mirror().addBox(-0.125F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5721F, 1.3376F, 0.6194F, -0.1661F, -0.9869F, -1.1229F));

		PartDefinition cube_r55 = bone3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(68, 28).mirror().addBox(-0.4785F, -0.8675F, -0.7976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.0332F, 0.7294F, 0.1764F, -0.1223F, -0.7277F, -1.1802F));

		PartDefinition cube_r56 = bone3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-0.3118F, -0.8675F, -1.4886F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0332F, 0.7294F, 0.1764F, -0.1023F, -0.4675F, -1.2156F));

		PartDefinition cube_r57 = bone3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(67, 43).mirror().addBox(-0.6F, -0.5F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.123F, -0.714F, -1.2559F, -0.4002F, -0.5528F, -0.698F));

		PartDefinition cube_r58 = bone3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(42, 67).mirror().addBox(-1.1988F, -0.5493F, -1.7201F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.4006F, -0.453F, -0.3262F, -0.4708F, -0.7509F, -0.5824F));

		PartDefinition cube_r59 = bone3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(47, 10).mirror().addBox(-0.65F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.2589F, -0.353F, -1.4932F, -0.3507F, -0.2642F, -0.8214F));

		PartDefinition cube_r60 = bone3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(49, 93).mirror().addBox(-1.7397F, -0.2462F, -3.4833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4006F, -0.453F, -0.3262F, -0.7971F, -0.7579F, -0.3679F));

		PartDefinition cube_r61 = bone3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(1.685F, -0.0626F, -0.9194F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.4006F, -0.453F, -0.3262F, -1.7215F, 0.9471F, -2.4408F));

		PartDefinition cube_r62 = bone3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(79, 47).mirror().addBox(3.3222F, -0.0626F, -1.0925F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4006F, -0.453F, -0.3262F, -1.6609F, 0.9523F, -2.3663F));

		PartDefinition cube_r63 = bone3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(105, 57).mirror().addBox(1.9646F, -0.0626F, 3.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.4006F, -0.453F, -0.3262F, -2.4624F, 0.4047F, 2.7644F));

		PartDefinition cube_r64 = bone3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(51, 4).mirror().addBox(-3.0328F, -0.2463F, 1.8093F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.4006F, -0.453F, -0.3262F, -2.5546F, -0.3541F, 1.9339F));

		PartDefinition cube_r65 = bone3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(93, 46).mirror().addBox(2.5375F, -0.2463F, -0.8199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.4006F, -0.453F, -0.3262F, -0.6635F, 0.5669F, -1.3785F));

		PartDefinition cube_r66 = bone3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(44, 93).mirror().addBox(1.4239F, -0.2462F, -1.8438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4006F, -0.453F, -0.3262F, -0.565F, 0.2443F, -1.1332F));

		PartDefinition cube_r67 = bone3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(51, 0).mirror().addBox(0.5169F, -0.2462F, 0.5797F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.4006F, -0.453F, -0.3262F, -2.243F, 0.8447F, 2.9148F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8F, 3.7503F, 2.1399F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftLeg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(51, 61).addBox(-1.0F, -1.5F, -0.325F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.0123F)), PartPose.offsetAndRotation(0.0F, 5.6861F, -0.545F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(7, 69).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 4.2691F, -1.1042F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftLeg.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(9, 52).addBox(-1.0F, -1.0F, -1.1F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 1.4221F, 0.1786F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftLeg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(39, 50).addBox(-1.0F, -0.125F, -0.95F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2597F, 0.3056F, -0.0742F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftLeg.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(59, 80).addBox(-1.0F, 0.15F, -0.525F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.0F, -0.8555F, -0.7177F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftLeg.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(69, 4).addBox(-1.0F, -0.825F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.1511F, -0.766F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftLeg.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(95, 49).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0282F, 0.5965F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftLeg.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(95, 42).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2788F, -0.6028F, -1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftLeg.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(23, 95).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.8506F, -0.2138F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftLeg.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(95, 9).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.2545F, 0.3235F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftLeg.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(95, 3).addBox(-0.5F, 3.54F, 1.4657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.0684F, -1.0302F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftLeg.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(52, 80).addBox(-1.0F, 0.7386F, 0.1064F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 6.6684F, -1.3302F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftLeg.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(60, 0).addBox(-1.0F, -1.65F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 7.4772F, -1.5222F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftLeg.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(56, 68).addBox(-1.0F, -1.0F, -0.55F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.4676F, -0.5239F, -1.9897F, 0.0F, 0.0F));

		PartDefinition cube_r82 = leftLeg.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(24, 80).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0895F, 1.2285F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r83 = leftLeg.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(16, 42).addBox(-1.0F, -0.625F, 0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 8.0874F, 0.4693F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r84 = leftLeg.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(80, 8).addBox(-1.0F, -0.65F, 0.125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 7.8882F, -0.2736F, -0.4014F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.3906F, 0.7456F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r85 = leftLeg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(35, 67).addBox(-1.0F, 0.3F, -0.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.204F, -0.4567F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r86 = leftLeg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(53, 15).addBox(-1.0F, -0.9F, -1.575F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.4984F, 0.8262F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r87 = leftLeg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(66, 80).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.7521F, 1.898F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r88 = leftLeg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(95, 52).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 1.4018F, 0.8279F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r89 = leftLeg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(105, 83).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.179F, 0.1985F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r90 = leftLeg2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(26, 70).addBox(-0.5F, -3.5F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.6248F, 0.0697F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r91 = leftLeg2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(58, 61).addBox(-0.5F, -5.0F, -0.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.5599F, -0.971F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r92 = leftLeg2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(69, 13).addBox(-0.5F, 0.2F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 2.7767F, 0.7733F, -2.1118F, 0.0F, 0.0F));

		PartDefinition cube_r93 = leftLeg2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(35, 35).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.0743F, -0.8029F, -1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r94 = leftLeg2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(24, 35).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.0781F, -0.6808F, -1.6319F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.1431F, -1.3372F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r95 = leftLeg3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(73, 80).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.025F)), PartPose.offsetAndRotation(0.0F, -1.3326F, 0.2802F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r96 = leftLeg3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(70, 66).addBox(-1.0F, -2.7136F, -0.8894F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.5F, 1.4236F, 0.4388F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r97 = leftLeg3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(11, 42).addBox(-1.0F, -0.1857F, -1.0115F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -0.1764F, 0.3388F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftLeg3.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0116F, 7.7708F, -0.2326F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r98 = leftArm5.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(63, 70).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4917F, 3.8897F, -0.0794F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r99 = leftArm5.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(70, 60).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3684F, 3.8897F, -0.0794F, 0.0F, 0.0F, -0.0873F));

		PartDefinition leftHoof = leftArm5.addOrReplaceChild("leftHoof", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4794F, 3.6267F, 0.0234F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r100 = leftHoof.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(75, 95).addBox(-0.6587F, -0.1283F, -1.1197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9945F, 0.0F, -0.5F, 0.4943F, -0.2578F, -0.1202F));

		PartDefinition cube_r101 = leftHoof.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(67, 95).addBox(-0.5883F, -0.1283F, -0.5234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.9945F, 0.0F, -0.5F, 0.4777F, -0.0647F, -0.0171F));

		PartDefinition cube_r102 = leftHoof.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(70, 24).addBox(-0.4643F, -0.1075F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.9945F, 0.0F, -0.5F, 0.4794F, -0.1035F, -0.0373F));

		PartDefinition cube_r103 = leftHoof.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(69, 52).addBox(-0.5482F, -0.1064F, -1.2003F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.4794F, 0.1035F, 0.0373F));

		PartDefinition cube_r104 = leftHoof.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(62, 95).addBox(-0.3992F, -0.1293F, -0.5237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.4777F, 0.0647F, 0.0171F));

		PartDefinition cube_r105 = leftHoof.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(95, 59).addBox(-0.329F, -0.1293F, -1.1173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.4943F, 0.2578F, 0.1202F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8F, 3.7503F, 2.1399F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(51, 61).mirror().addBox(-1.0F, -1.5F, -0.325F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.0123F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.6861F, -0.545F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(7, 69).mirror().addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.2691F, -1.1042F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(9, 52).mirror().addBox(-1.0F, -1.0F, -1.1F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4221F, 0.1786F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(39, 50).mirror().addBox(-1.0F, -0.125F, -0.95F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2597F, 0.3056F, -0.0742F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(59, 80).mirror().addBox(-1.0F, 0.15F, -0.525F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8555F, -0.7177F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightLeg.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(69, 4).mirror().addBox(-1.0F, -0.825F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1511F, -0.766F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightLeg.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(95, 49).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0282F, 0.5965F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r113 = rightLeg.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(95, 42).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2788F, -0.6028F, -1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r114 = rightLeg.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(23, 95).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8506F, -0.2138F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r115 = rightLeg.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(95, 9).mirror().addBox(-0.5F, -1.9F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2545F, 0.3235F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r116 = rightLeg.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(95, 3).mirror().addBox(-0.5F, 3.54F, 1.4657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.0684F, -1.0302F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r117 = rightLeg.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(52, 80).mirror().addBox(-1.0F, 0.7386F, 0.1064F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.6684F, -1.3302F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r118 = rightLeg.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(-1.0F, -1.65F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.4772F, -1.5222F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r119 = rightLeg.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(56, 68).mirror().addBox(-1.0F, -1.0F, -0.55F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.4676F, -0.5239F, -1.9897F, 0.0F, 0.0F));

		PartDefinition cube_r120 = rightLeg.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(24, 80).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.0895F, 1.2285F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r121 = rightLeg.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(16, 42).mirror().addBox(-1.0F, -0.625F, 0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.0874F, 0.4693F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r122 = rightLeg.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(80, 8).mirror().addBox(-1.0F, -0.65F, 0.125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.8882F, -0.2736F, -0.4014F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.3906F, 0.7456F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r123 = rightLeg2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(35, 67).mirror().addBox(-1.0F, 0.3F, -0.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.204F, -0.4567F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r124 = rightLeg2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(53, 15).mirror().addBox(-1.0F, -0.9F, -1.575F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4984F, 0.8262F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r125 = rightLeg2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(66, 80).mirror().addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7521F, 1.898F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r126 = rightLeg2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(95, 52).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4018F, 0.8279F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r127 = rightLeg2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(105, 83).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.179F, 0.1985F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r128 = rightLeg2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(26, 70).mirror().addBox(-0.5F, -3.5F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.6248F, 0.0697F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r129 = rightLeg2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(58, 61).mirror().addBox(-0.5F, -5.0F, -0.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 10.5599F, -0.971F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r130 = rightLeg2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(69, 13).mirror().addBox(-0.5F, 0.2F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.7767F, 0.7733F, -2.1118F, 0.0F, 0.0F));

		PartDefinition cube_r131 = rightLeg2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(35, 35).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.0743F, -0.8029F, -1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r132 = rightLeg2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(24, 35).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0781F, -0.6808F, -1.6319F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.1431F, -1.3372F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r133 = rightLeg3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(73, 80).mirror().addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.025F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.3326F, 0.2802F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r134 = rightLeg3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(70, 66).mirror().addBox(0.0F, -2.7136F, -0.8894F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4236F, 0.4388F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r135 = rightLeg3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(11, 42).mirror().addBox(0.0F, -0.1857F, -1.0115F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1764F, 0.3388F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightLeg3.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0116F, 7.7708F, -0.2326F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r136 = rightArm5.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(63, 70).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.4917F, 3.8897F, -0.0794F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r137 = rightArm5.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(70, 60).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3684F, 3.8897F, -0.0794F, 0.0F, 0.0F, 0.0873F));

		PartDefinition rightHoof = rightArm5.addOrReplaceChild("rightHoof", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4794F, 3.6267F, 0.0234F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r138 = rightHoof.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(75, 95).mirror().addBox(-0.3413F, -0.1283F, -1.1197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.9945F, 0.0F, -0.5F, 0.4943F, 0.2578F, 0.1202F));

		PartDefinition cube_r139 = rightHoof.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(67, 95).mirror().addBox(-0.4117F, -0.1283F, -0.5234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.9945F, 0.0F, -0.5F, 0.4777F, 0.0647F, 0.0171F));

		PartDefinition cube_r140 = rightHoof.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(70, 24).mirror().addBox(-0.5357F, -0.1075F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.9945F, 0.0F, -0.5F, 0.4794F, 0.1035F, 0.0373F));

		PartDefinition cube_r141 = rightHoof.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(69, 52).mirror().addBox(-0.4518F, -0.1064F, -1.2003F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.4794F, -0.1035F, -0.0373F));

		PartDefinition cube_r142 = rightHoof.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(62, 95).mirror().addBox(-0.6008F, -0.1293F, -0.5237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.4777F, -0.0647F, -0.0171F));

		PartDefinition cube_r143 = rightHoof.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(95, 59).mirror().addBox(-0.671F, -0.1293F, -1.1173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.4943F, -0.2578F, -0.1202F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(72, 92).addBox(0.0F, -2.8388F, -3.918F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3528F, -3.2386F, -0.0263F, -0.0872F, 0.0023F));

		PartDefinition cube_r144 = body2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(59, 92).addBox(0.0F, -2.2251F, -1.017F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4817F, -0.9002F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r145 = body2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(88, 95).mirror().addBox(-0.6078F, -0.6036F, -0.6209F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5753F, -0.602F, -5.4553F, -2.9409F, 0.0F, -1.885F));

		PartDefinition cube_r146 = body2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(88, 106).mirror().addBox(-0.5078F, -0.3036F, -0.6209F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1152F, -0.7516F, -7.3958F, -3.0718F, 0.0F, -1.885F));

		PartDefinition cube_r147 = body2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(91, 95).mirror().addBox(0.0F, -0.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4675F, 0.0075F, -3.308F, -2.9679F, 0.0491F, -1.8803F));

		PartDefinition cube_r148 = body2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(51, 105).mirror().addBox(0.0F, -0.1F, -0.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0026F, -1.2198F, -2.9888F, 0.0829F, -1.8741F));

		PartDefinition cube_r149 = body2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(51, 105).addBox(0.0F, -0.1F, -0.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0026F, -1.2198F, -2.9888F, -0.0829F, 1.8741F));

		PartDefinition cube_r150 = body2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(91, 95).addBox(0.0F, -0.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4675F, 0.0075F, -3.308F, -2.9679F, -0.0491F, 1.8803F));

		PartDefinition cube_r151 = body2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(88, 106).addBox(0.5078F, -0.3036F, -0.6209F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1152F, -0.7516F, -7.3958F, -3.0718F, 0.0F, 1.885F));

		PartDefinition cube_r152 = body2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(88, 95).addBox(0.6078F, -0.6036F, -0.6209F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5753F, -0.602F, -5.4553F, -2.9409F, 0.0F, 1.885F));

		PartDefinition cube_r153 = body2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(95, 80).addBox(-0.5753F, -2.3245F, -0.4826F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5753F, -0.602F, -5.4553F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r154 = body2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(80, 95).addBox(-0.4485F, -2.3641F, -0.1742F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4485F, -0.6806F, -7.7243F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r155 = body2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.1F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -6.9F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2814F, -7.8926F, -0.0655F, -0.0435F, 0.0029F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(43, 25).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.0707F, -5.4048F, 0.116F, 0.2946F, -0.8484F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(34, 0).mirror().addBox(-10.0551F, -2.1982F, -0.4625F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.0707F, -5.4048F, -0.0377F, 0.3138F, -1.3515F));

		PartDefinition cube_r158 = body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(88, 0).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.0707F, -5.4048F, 0.1893F, 0.2545F, -0.5795F));

		PartDefinition cube_r159 = body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(34, 6).mirror().addBox(-8.8656F, -2.2434F, -0.4174F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, -0.0255F, 0.3649F, -1.3475F));

		PartDefinition cube_r160 = body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(88, 42).mirror().addBox(-3.5988F, -0.6501F, -0.4174F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, 0.1526F, 0.3337F, -0.8371F));

		PartDefinition cube_r161 = body.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(88, 44).mirror().addBox(-1.7126F, -0.2141F, -0.4174F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, 0.2349F, 0.283F, -0.5674F));

		PartDefinition cube_r162 = body.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(51, 19).mirror().addBox(-6.8655F, -2.2334F, -0.4096F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, -0.0244F, 0.4003F, -1.3991F));

		PartDefinition cube_r163 = body.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(90, 57).mirror().addBox(-3.5942F, -0.6413F, -0.4096F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, 0.172F, 0.364F, -0.8824F));

		PartDefinition cube_r164 = body.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(67, 88).mirror().addBox(-1.7058F, -0.2069F, -0.4096F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, 0.2618F, 0.3073F, -0.6116F));

		PartDefinition cube_r165 = body.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(67, 88).addBox(-0.2942F, -0.2069F, -0.4096F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, 0.2618F, -0.3073F, 0.6116F));

		PartDefinition cube_r166 = body.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(90, 57).addBox(1.5942F, -0.6413F, -0.4096F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, 0.172F, -0.364F, 0.8824F));

		PartDefinition cube_r167 = body.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(51, 19).addBox(2.8655F, -2.2334F, -0.4096F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, -0.0244F, -0.4003F, 1.3991F));

		PartDefinition cube_r168 = body.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(88, 44).addBox(-0.2874F, -0.2141F, -0.4174F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, 0.2349F, -0.283F, 0.5674F));

		PartDefinition cube_r169 = body.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(88, 42).addBox(1.5988F, -0.6501F, -0.4174F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, 0.1526F, -0.3337F, 0.8371F));

		PartDefinition cube_r170 = body.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(34, 6).addBox(2.8656F, -2.2434F, -0.4174F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, -0.0255F, -0.3649F, 1.3475F));

		PartDefinition cube_r171 = body.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(88, 0).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.0707F, -5.4048F, 0.1893F, -0.2545F, 0.5795F));

		PartDefinition cube_r172 = body.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(34, 0).addBox(3.0551F, -2.1982F, -0.4625F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.0707F, -5.4048F, -0.0377F, -0.3138F, 1.3515F));

		PartDefinition cube_r173 = body.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(43, 25).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.0707F, -5.4048F, 0.116F, -0.2946F, 0.8484F));

		PartDefinition cube_r174 = body.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -0.3F, -7.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.2135F, 0.1404F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r175 = body.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(8, 96).addBox(0.0F, -2.8189F, -0.146F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1832F, -1.8045F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r176 = body.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(94, 95).addBox(0.0F, -2.9938F, -0.046F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1865F, -3.8596F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r177 = body.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(27, 89).addBox(0.0F, -3.4198F, -0.0541F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5865F, -5.9596F, -0.0175F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(36, 88).addBox(0.0F, -3.9417F, -0.9621F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3529F, -6.8577F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(87, 58).addBox(0.0F, -4.4213F, -0.1497F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9735F, -2.7877F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(85, 92).addBox(-0.005F, -3.7103F, -0.2312F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6985F, -4.6627F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(85, 106).addBox(0.0F, -0.7463F, -0.0997F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6985F, -4.6627F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(43, 23).mirror().addBox(-0.8F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.635F, 12.0543F, -2.9162F, -0.3366F, -0.2797F, -2.7656F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(38, 16).mirror().addBox(-0.6F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4309F, 11.7937F, -0.8874F, -0.255F, -0.2821F, -2.9123F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(39, 33).mirror().addBox(0.0F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1025F, 11.5511F, 1.1034F, -0.2735F, -0.319F, -2.8451F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(40, 8).mirror().addBox(-0.7F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2753F, 10.9335F, 3.2455F, -0.3378F, -0.3057F, -2.6187F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(34, 2).mirror().addBox(0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2753F, 10.9335F, 3.2455F, -0.4416F, -0.4953F, -2.3707F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(19, 8).mirror().addBox(-0.1F, 0.0F, 0.0F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2753F, 10.9335F, 3.2455F, -0.6331F, -0.5992F, -2.0909F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(89, 28).mirror().addBox(-1.7864F, 0.0325F, -0.7263F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4485F, -3.7877F, 0.0901F, 0.1948F, -0.6275F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(66, 90).mirror().addBox(-3.734F, -0.431F, -0.7263F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4485F, -3.7877F, 0.036F, 0.2114F, -0.8943F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(34, 4).mirror().addBox(-10.0866F, -2.1114F, -0.7263F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4485F, -3.7877F, -0.0671F, 0.2038F, -1.385F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(90, 78).mirror().addBox(-2.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1485F, -2.5877F, 0.1377F, 0.2194F, -0.5393F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(20, 91).mirror().addBox(-4.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1485F, -2.5877F, 0.0754F, 0.2475F, -0.8069F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(17, 19).mirror().addBox(-11.1393F, -2.68F, -0.1571F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1485F, -2.5877F, -0.0499F, 0.2537F, -1.3026F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(89, 40).mirror().addBox(-2.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4985F, -0.6877F, 0.1762F, 0.2417F, -0.5305F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(19, 17).mirror().addBox(-11.1393F, -2.68F, -0.1571F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4985F, -0.6877F, -0.0378F, 0.2958F, -1.2994F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(90, 76).mirror().addBox(-4.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4985F, -0.6877F, 0.1068F, 0.2788F, -0.7988F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(90, 76).addBox(2.0433F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4985F, -0.6877F, 0.1068F, -0.2788F, 0.7988F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(19, 17).addBox(3.1393F, -2.68F, -0.1571F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4985F, -0.6877F, -0.0378F, -0.2958F, 1.2994F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(89, 40).addBox(0.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4985F, -0.6877F, 0.1762F, -0.2417F, 0.5305F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(17, 19).addBox(3.1393F, -2.68F, -0.1571F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1485F, -2.5877F, -0.0499F, -0.2537F, 1.3026F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(20, 91).addBox(2.0433F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1485F, -2.5877F, 0.0754F, -0.2475F, 0.8069F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(90, 78).addBox(0.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1485F, -2.5877F, 0.1377F, -0.2194F, 0.5393F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(34, 4).addBox(3.0866F, -2.1114F, -0.7263F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4485F, -3.7877F, -0.0671F, -0.2038F, 1.385F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(66, 90).addBox(1.734F, -0.431F, -0.7263F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4485F, -3.7877F, 0.036F, -0.2114F, 0.8943F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(89, 28).addBox(-0.2136F, 0.0325F, -0.7263F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4485F, -3.7877F, 0.0901F, -0.1948F, 0.6275F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(19, 8).addBox(-8.9F, 0.0F, 0.0F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2753F, 10.9335F, 3.2455F, -0.6331F, 0.5992F, 2.0909F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(34, 2).addBox(-7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2753F, 10.9335F, 3.2455F, -0.4416F, 0.4953F, 2.3707F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(40, 8).addBox(-5.3F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2753F, 10.9335F, 3.2455F, -0.3378F, 0.3057F, 2.6187F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(39, 33).addBox(-6.0F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1025F, 11.5511F, 1.1034F, -0.2735F, 0.319F, 2.8451F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(38, 16).addBox(-5.4F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4309F, 11.7937F, -0.8874F, -0.255F, 0.2821F, 2.9123F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(43, 23).addBox(-4.2F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.635F, 12.0543F, -2.9162F, -0.3366F, 0.2797F, 2.7656F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(26, 28).addBox(-0.5F, -0.4F, -4.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0935F, -0.8312F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(13, 28).addBox(-0.5F, -0.8738F, -0.0057F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 12.2999F, -0.1132F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(0, 41).addBox(-0.5F, -0.8737F, -0.0057F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 12.718F, -4.0913F, 0.1047F, 0.0F, 0.0F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2535F, -4.7696F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r214 = chest2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(58, 97).addBox(-0.005F, -5.0235F, -0.4903F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -3.9F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r215 = chest2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(76, 106).addBox(0.0F, -2.0848F, -0.0505F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -3.9F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r216 = chest2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(5, 97).addBox(-0.005F, -4.4042F, -0.2399F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.45F, -1.95F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r217 = chest2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(21, 54).addBox(0.0F, -1.4389F, -0.0636F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.45F, -1.95F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r218 = chest2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(36, 19).mirror().addBox(-9.0781F, -2.659F, -0.4744F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.1102F, -0.134F, -1.4473F));

		PartDefinition cube_r219 = chest2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(54, 33).mirror().addBox(-1.1F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5688F, 9.7478F, -5.0934F, -0.0125F, -0.2735F, -2.8249F));

		PartDefinition cube_r220 = chest2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(55, 8).mirror().addBox(-1.2634F, -0.2563F, -2.7217F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5272F, 10.1748F, -1.1907F, -0.0187F, -0.3678F, -2.8117F));

		PartDefinition cube_r221 = chest2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(20, 89).mirror().addBox(-3.9792F, -0.9206F, -0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.1594F, -0.0683F, -0.9693F));

		PartDefinition cube_r222 = chest2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(89, 20).mirror().addBox(-2.1501F, -0.377F, -0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.1715F, -0.0249F, -0.7108F));

		PartDefinition cube_r223 = chest2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(89, 22).mirror().addBox(-2.2189F, -0.2914F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.1584F, -0.0528F, -0.7563F));

		PartDefinition cube_r224 = chest2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(59, 90).mirror().addBox(-4.0679F, -0.8557F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.1395F, -0.0919F, -1.0159F));

		PartDefinition cube_r225 = chest2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(43, 21).mirror().addBox(-8.1867F, -2.6424F, -0.3998F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.0814F, -0.1458F, -1.4963F));

		PartDefinition cube_r226 = chest2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(43, 21).addBox(3.1867F, -2.6424F, -0.3998F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.0814F, 0.1458F, 1.4963F));

		PartDefinition cube_r227 = chest2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(59, 90).addBox(2.0679F, -0.8557F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.1395F, 0.0919F, 1.0159F));

		PartDefinition cube_r228 = chest2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(89, 22).addBox(0.2189F, -0.2914F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.1584F, 0.0528F, 0.7563F));

		PartDefinition cube_r229 = chest2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(89, 20).addBox(0.1501F, -0.377F, -0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.1715F, 0.0249F, 0.7108F));

		PartDefinition cube_r230 = chest2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(20, 89).addBox(1.9792F, -0.9206F, -0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.1594F, 0.0683F, 0.9693F));

		PartDefinition cube_r231 = chest2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(55, 8).addBox(-2.7366F, -0.2563F, -2.7217F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5272F, 10.1748F, -1.1907F, -0.0187F, 0.3678F, 2.8117F));

		PartDefinition cube_r232 = chest2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(54, 33).addBox(-2.9F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5688F, 9.7478F, -5.0934F, -0.0125F, 0.2735F, 2.8249F));

		PartDefinition cube_r233 = chest2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(36, 19).addBox(3.0781F, -2.659F, -0.4744F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.1102F, 0.134F, 1.4473F));

		PartDefinition cube_r234 = chest2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(53, 53).addBox(-1.0F, 11.4919F, 0.8473F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.8F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r235 = chest2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, 10.893F, -4.7645F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.8F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r236 = chest2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(17, 21).addBox(-0.5F, -0.7357F, -5.7122F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.8F, 0.192F, 0.0F, 0.0F));

		PartDefinition bone = chest2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.731F, 2.3669F, -4.0193F, 0.1522F, 0.204F, -0.264F));

		PartDefinition cube_r237 = bone.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(0, 35).addBox(1.4374F, -3.0434F, -6.583F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9249F, -0.4785F, 2.9521F, 0.7401F, -0.3548F, 0.2451F));

		PartDefinition cube_r238 = bone.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(13, 35).addBox(2.4F, -2.5259F, -2.6985F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-2.9249F, -0.4785F, 2.9521F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r239 = bone.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(43, 96).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0249F, 3.069F, -2.914F, 1.405F, 0.0F, 0.0F));

		PartDefinition cube_r240 = bone.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(16, 62).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0249F, -1.9565F, 4.0861F, -2.4958F, 0.0F, 0.0F));

		PartDefinition cube_r241 = bone.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(96, 39).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0249F, -3.9851F, 2.6899F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r242 = bone.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(38, 96).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0249F, -4.267F, 1.7253F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r243 = bone.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(96, 26).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0249F, -3.8955F, 1.3907F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r244 = bone.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(90, 80).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0249F, -3.2798F, 0.6027F, -2.4784F, 0.0F, 0.0F));

		PartDefinition cube_r245 = bone.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(67, 0).addBox(-0.5F, 0.4F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(96, 23).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0249F, -2.126F, -0.1903F, 2.5395F, 0.0F, 0.0F));

		PartDefinition cube_r246 = bone.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(96, 20).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0249F, -1.5042F, 0.217F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r247 = bone.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(62, 14).addBox(-0.5F, -1.2F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0249F, -1.032F, 0.771F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r248 = bone.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(16, 49).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0249F, -1.3346F, 3.7528F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r249 = bone.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(16, 96).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0249F, 0.5082F, 2.5316F, -2.4086F, 0.0F, 0.0F));

		PartDefinition cube_r250 = bone.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(11, 96).addBox(-0.5F, -1.65F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(95, 85).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0249F, -0.9041F, 2.6057F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r251 = bone.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(19, 71).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0249F, 0.9229F, 1.6217F, -1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r252 = bone.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(74, 88).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0249F, 0.9229F, 1.6217F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r253 = bone.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(47, 48).addBox(-0.5F, -1.0F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.0249F, 1.1914F, 0.7568F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r254 = bone.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(39, 27).addBox(-0.5F, 0.05F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0249F, 0.6339F, -0.7383F, 0.6458F, 0.0F, 0.0F));

		PartDefinition bone4 = chest2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.731F, 2.3669F, -4.0193F, 0.1522F, -0.204F, 0.264F));

		PartDefinition cube_r255 = bone4.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-2.4374F, -3.0434F, -6.583F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.9249F, -0.4785F, 2.9521F, 0.7401F, 0.3548F, -0.2451F));

		PartDefinition cube_r256 = bone4.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(13, 35).mirror().addBox(-3.4F, -2.5259F, -2.6985F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(2.9249F, -0.4785F, 2.9521F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r257 = bone4.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(43, 96).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0249F, 3.069F, -2.914F, 1.405F, 0.0F, 0.0F));

		PartDefinition cube_r258 = bone4.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(16, 62).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0249F, -1.9565F, 4.0861F, -2.4958F, 0.0F, 0.0F));

		PartDefinition cube_r259 = bone4.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(96, 39).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0249F, -3.9851F, 2.6899F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r260 = bone4.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(38, 96).mirror().addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0249F, -4.267F, 1.7253F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r261 = bone4.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(96, 26).mirror().addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0249F, -3.8955F, 1.3907F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r262 = bone4.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(90, 80).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0249F, -3.2798F, 0.6027F, -2.4784F, 0.0F, 0.0F));

		PartDefinition cube_r263 = bone4.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(67, 0).mirror().addBox(-0.5F, 0.4F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(96, 23).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0249F, -2.126F, -0.1903F, 2.5395F, 0.0F, 0.0F));

		PartDefinition cube_r264 = bone4.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(96, 20).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0249F, -1.5042F, 0.217F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r265 = bone4.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(62, 14).mirror().addBox(-0.5F, -1.2F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0249F, -1.032F, 0.771F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r266 = bone4.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(16, 49).mirror().addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0249F, -1.3346F, 3.7528F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r267 = bone4.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(16, 96).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0249F, 0.5082F, 2.5316F, -2.4086F, 0.0F, 0.0F));

		PartDefinition cube_r268 = bone4.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(11, 96).mirror().addBox(-0.5F, -1.65F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(95, 85).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0249F, -0.9041F, 2.6057F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r269 = bone4.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(19, 71).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0249F, 0.9229F, 1.6217F, -1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r270 = bone4.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(74, 88).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0249F, 0.9229F, 1.6217F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r271 = bone4.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(47, 48).mirror().addBox(-0.5F, -1.0F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.0249F, 1.1914F, 0.7568F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r272 = bone4.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(39, 27).mirror().addBox(-0.5F, 0.05F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0249F, 0.6339F, -0.7383F, 0.6458F, 0.0F, 0.0F));

		PartDefinition leftarm = chest2.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3F, 7.0201F, -7.2897F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r273 = leftarm.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(79, 88).addBox(-0.0018F, -1.2179F, -0.9854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5117F, -0.4761F, 0.277F, 1.2216F, 0.0012F, -0.0013F));

		PartDefinition cube_r274 = leftarm.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(19, 67).addBox(-0.5F, 0.15F, 0.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0122F, -0.4915F, 1.1964F, -1.728F, 0.0014F, -0.001F));

		PartDefinition cube_r275 = leftarm.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(87, 6).addBox(-0.5F, -0.2F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0113F, 0.1026F, 1.4133F, -0.5935F, 0.0014F, -0.001F));

		PartDefinition cube_r276 = leftarm.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(31, 81).addBox(0.0F, -0.1F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5144F, 0.2216F, -1.1013F, 0.5235F, 0.0014F, -0.001F));

		PartDefinition cube_r277 = leftarm.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(53, 96).addBox(-0.5F, -0.9F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6839F, 0.5183F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r278 = leftarm.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(48, 96).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 5.1862F, 2.2197F, 1.8588F, 0.0F, 0.0F));

		PartDefinition cube_r279 = leftarm.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(31, 71).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.9348F, 0.8263F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r280 = leftarm.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(19, 81).addBox(-0.5F, -0.2F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.297F, 0.9132F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r281 = leftarm.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(5, 81).addBox(-1.0F, -0.475F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 5.9255F, 2.3135F, -1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r282 = leftarm.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(81, 0).addBox(0.0F, -0.1914F, -1.4045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.3792F, 3.0206F, -0.4014F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1384F, 6.8897F, 1.6767F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r283 = leftarm2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(36, 71).addBox(0.0303F, -0.0363F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 4.9029F, 0.1716F, 1.5708F, -1.3265F, -1.5708F));

		PartDefinition cube_r284 = leftarm2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(82, 59).addBox(0.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6064F, 4.8804F, 0.2036F, 1.5708F, -1.4399F, -1.5708F));

		PartDefinition cube_r285 = leftarm2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(82, 39).addBox(0.2889F, -1.2392F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1236F, 2.1144F, 1.0517F, 1.5708F, 0.0785F, -1.5708F));

		PartDefinition cube_r286 = leftarm2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(28, 97).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.1236F, -2.4535F, 1.5822F, -1.5708F, -1.0996F, 1.5708F));

		PartDefinition cube_r287 = leftarm2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(97, 6).addBox(-0.975F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1236F, -1.6029F, 2.0389F, -1.5708F, 0.1658F, 1.5708F));

		PartDefinition cube_r288 = leftarm2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(0, 97).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1236F, -0.6603F, 1.7051F, -1.5708F, -1.2305F, 1.5708F));

		PartDefinition cube_r289 = leftarm2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(82, 36).addBox(-1.95F, -1.25F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.1236F, -0.4558F, 1.8574F, 1.5708F, -0.733F, -1.5708F));

		PartDefinition cube_r290 = leftarm2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(86, 46).addBox(-0.8F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1236F, -1.3222F, 0.7668F, 1.5708F, -0.8639F, -1.5708F));

		PartDefinition cube_r291 = leftarm2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(82, 28).addBox(-1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1236F, 1.2551F, 0.641F, 1.5708F, -0.1658F, -1.5708F));

		PartDefinition cube_r292 = leftarm2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(81, 43).addBox(-1.0F, -0.45F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1236F, 0.2666F, 0.8F, 1.5708F, -0.2094F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(25, 49).addBox(-0.5F, -0.2044F, -0.4286F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1F, 8.8406F, 1.7054F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r293 = leftArm3.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(105, 41).addBox(5.6796F, 1.3667F, -1.3936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(41, 105).addBox(5.6796F, 1.8667F, -1.3936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-5.8147F, 6.801F, 0.4481F, 0.6545F, 0.0F, -0.3054F));

		PartDefinition cube_r294 = leftArm3.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(97, 95).addBox(5.6796F, 2.985F, -1.3822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-6.4138F, 4.9007F, 0.449F, 0.3054F, 0.0F, -0.3054F));

		PartDefinition cube_r295 = leftArm3.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(30, 55).addBox(6.0558F, -0.1521F, -1.3872F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-6.2157F, 0.8861F, 0.431F, 0.0799F, -0.0892F, -0.0308F));

		PartDefinition cube_r296 = leftArm3.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(16, 54).addBox(-0.4851F, -0.3078F, -0.7854F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3076F, 0.8861F, 0.431F, 0.0799F, 0.0892F, 0.0308F));

		PartDefinition cube_r297 = leftArm3.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(83, 97).addBox(-0.3851F, 1.0922F, -0.7854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1094F, 4.9007F, 0.449F, 0.3054F, 0.0F, 0.3054F));

		PartDefinition cube_r298 = leftArm3.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(97, 75).addBox(-0.3851F, 0.2922F, -0.1854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(97, 55).addBox(-0.3851F, -0.2079F, -0.1854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.7086F, 6.801F, 0.4481F, 0.6545F, 0.0F, 0.3054F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(10, 89).addBox(-0.5F, -0.4599F, -0.5794F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 6.9389F, 0.0537F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r299 = leftArm4.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(15, 89).addBox(5.6559F, -2.0996F, -0.4488F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-6.5233F, 0.8545F, -0.1306F, 0.0F, 0.0F, 0.2182F));

		PartDefinition cube_r300 = leftArm4.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(84, 88).addBox(-0.4076F, -0.7144F, -0.4488F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8545F, -0.1306F, 0.0F, 0.0F, -0.2182F));

		PartDefinition leftArmHoof = leftArm4.addOrReplaceChild("leftArmHoof", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4794F, 1.8267F, 0.0234F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r301 = leftArmHoof.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(98, 29).addBox(-0.6587F, -0.1283F, -1.1197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9945F, 0.0F, -0.5F, 0.8482F, -0.2013F, -0.2016F));

		PartDefinition cube_r302 = leftArmHoof.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(21, 98).addBox(-0.5883F, -0.1283F, -0.5234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.9945F, 0.0F, -0.5F, 0.8272F, -0.055F, -0.0382F));

		PartDefinition cube_r303 = leftArmHoof.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(48, 71).addBox(-0.4643F, -0.1075F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.9945F, 0.0F, -0.5F, 0.8295F, -0.0845F, -0.0705F));

		PartDefinition cube_r304 = leftArmHoof.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(41, 71).addBox(-0.5482F, -0.1064F, -1.2003F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.8295F, 0.0845F, 0.0705F));

		PartDefinition cube_r305 = leftArmHoof.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(98, 15).addBox(-0.3992F, -0.1293F, -0.5237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.8272F, 0.055F, 0.0382F));

		PartDefinition cube_r306 = leftArmHoof.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(98, 12).addBox(-0.329F, -0.1293F, -1.1173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.8482F, 0.2013F, 0.2016F));

		PartDefinition rightarm = chest2.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3F, 7.0201F, -7.2897F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r307 = rightarm.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(79, 88).mirror().addBox(-0.9982F, -1.2179F, -0.9854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5117F, -0.4761F, 0.277F, 1.2216F, -0.0012F, 0.0013F));

		PartDefinition cube_r308 = rightarm.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(19, 67).mirror().addBox(-0.5F, 0.15F, 0.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0122F, -0.4915F, 1.1964F, -1.728F, -0.0014F, 0.001F));

		PartDefinition cube_r309 = rightarm.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(87, 6).mirror().addBox(-0.5F, -0.2F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0113F, 0.1026F, 1.4133F, -0.5935F, -0.0014F, 0.001F));

		PartDefinition cube_r310 = rightarm.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(31, 81).mirror().addBox(-1.0F, -0.1F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5144F, 0.2216F, -1.1013F, 0.5235F, -0.0014F, 0.001F));

		PartDefinition cube_r311 = rightarm.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(53, 96).mirror().addBox(-0.5F, -0.9F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.6839F, 0.5183F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r312 = rightarm.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(48, 96).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.1862F, 2.2197F, 1.8588F, 0.0F, 0.0F));

		PartDefinition cube_r313 = rightarm.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(31, 71).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9348F, 0.8263F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r314 = rightarm.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(19, 81).mirror().addBox(-0.5F, -0.2F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.297F, 0.9132F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r315 = rightarm.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(5, 81).mirror().addBox(-1.0F, -0.475F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.9255F, 2.3135F, -1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r316 = rightarm.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(81, 0).mirror().addBox(-2.0F, -0.1914F, -1.4045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 6.3792F, 3.0206F, -0.4014F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1384F, 6.8897F, 1.6767F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r317 = rightarm2.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(36, 71).mirror().addBox(-1.0303F, -0.0363F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6064F, 4.9029F, 0.1716F, 1.5708F, 1.3265F, 1.5708F));

		PartDefinition cube_r318 = rightarm2.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(82, 59).mirror().addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6064F, 4.8804F, 0.2036F, 1.5708F, 1.4399F, 1.5708F));

		PartDefinition cube_r319 = rightarm2.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(82, 39).mirror().addBox(-2.2889F, -1.2392F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1236F, 2.1144F, 1.0517F, 1.5708F, -0.0785F, 1.5708F));

		PartDefinition cube_r320 = rightarm2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(28, 97).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.1236F, -2.4535F, 1.5822F, -1.5708F, 1.0996F, -1.5708F));

		PartDefinition cube_r321 = rightarm2.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(97, 6).mirror().addBox(-0.025F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1236F, -1.6029F, 2.0389F, -1.5708F, -0.1658F, -1.5708F));

		PartDefinition cube_r322 = rightarm2.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(0, 97).mirror().addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1236F, -0.6603F, 1.7051F, -1.5708F, 1.2305F, -1.5708F));

		PartDefinition cube_r323 = rightarm2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(82, 36).mirror().addBox(-0.05F, -1.25F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.1236F, -0.4558F, 1.8574F, 1.5708F, 0.733F, 1.5708F));

		PartDefinition cube_r324 = rightarm2.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(86, 46).mirror().addBox(-1.2F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1236F, -1.3222F, 0.7668F, 1.5708F, 0.8639F, 1.5708F));

		PartDefinition cube_r325 = rightarm2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(82, 28).mirror().addBox(-0.6F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1236F, 1.2551F, 0.641F, 1.5708F, 0.1658F, 1.5708F));

		PartDefinition cube_r326 = rightarm2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(81, 43).mirror().addBox(-1.0F, -0.45F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1236F, 0.2666F, 0.8F, 1.5708F, 0.2094F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(25, 49).mirror().addBox(-0.5F, -0.2044F, -0.4286F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 8.8406F, 1.7054F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r327 = rightArm3.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(105, 41).mirror().addBox(-6.6796F, 1.3667F, -1.3936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(41, 105).mirror().addBox(-6.6796F, 1.8667F, -1.3936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(5.8147F, 6.801F, 0.4481F, 0.6545F, 0.0F, 0.3054F));

		PartDefinition cube_r328 = rightArm3.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(97, 95).mirror().addBox(-6.6796F, 2.985F, -1.3822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(6.4138F, 4.9007F, 0.449F, 0.3054F, 0.0F, 0.3054F));

		PartDefinition cube_r329 = rightArm3.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(30, 55).mirror().addBox(-7.0558F, -0.1521F, -1.3872F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(6.2157F, 0.8861F, 0.431F, 0.0799F, 0.0892F, 0.0308F));

		PartDefinition cube_r330 = rightArm3.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(16, 54).mirror().addBox(-0.5149F, -0.3078F, -0.7854F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3076F, 0.8861F, 0.431F, 0.0799F, -0.0892F, -0.0308F));

		PartDefinition cube_r331 = rightArm3.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(83, 97).mirror().addBox(-0.6149F, 1.0922F, -0.7854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1094F, 4.9007F, 0.449F, 0.3054F, 0.0F, -0.3054F));

		PartDefinition cube_r332 = rightArm3.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(97, 75).mirror().addBox(-0.6149F, 0.2922F, -0.1854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(97, 55).mirror().addBox(-0.6149F, -0.2079F, -0.1854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.7086F, 6.801F, 0.4481F, 0.6545F, 0.0F, -0.3054F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(10, 89).mirror().addBox(-0.5F, -0.4599F, -0.5794F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.9389F, 0.0537F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r333 = rightArm4.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(15, 89).mirror().addBox(-6.6559F, -2.0996F, -0.4488F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(6.5233F, 0.8545F, -0.1306F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r334 = rightArm4.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(84, 88).mirror().addBox(-0.5924F, -0.7144F, -0.4488F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8545F, -0.1306F, 0.0F, 0.0F, 0.2182F));

		PartDefinition rightArmHoof = rightArm4.addOrReplaceChild("rightArmHoof", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4794F, 1.8267F, 0.0234F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r335 = rightArmHoof.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(98, 29).mirror().addBox(-0.3413F, -0.1283F, -1.1197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.9945F, 0.0F, -0.5F, 0.8482F, 0.2013F, 0.2016F));

		PartDefinition cube_r336 = rightArmHoof.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(21, 98).mirror().addBox(-0.4117F, -0.1283F, -0.5234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.9945F, 0.0F, -0.5F, 0.8272F, 0.055F, 0.0382F));

		PartDefinition cube_r337 = rightArmHoof.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(48, 71).mirror().addBox(-0.5357F, -0.1075F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.9945F, 0.0F, -0.5F, 0.8295F, 0.0845F, 0.0705F));

		PartDefinition cube_r338 = rightArmHoof.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(41, 71).mirror().addBox(-0.4518F, -0.1064F, -1.2003F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.8295F, -0.0845F, -0.0705F));

		PartDefinition cube_r339 = rightArmHoof.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(98, 15).mirror().addBox(-0.6008F, -0.1293F, -0.5237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.8272F, -0.055F, -0.0382F));

		PartDefinition cube_r340 = rightArmHoof.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(98, 12).mirror().addBox(-0.671F, -0.1293F, -1.1173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.8482F, -0.2013F, -0.2016F));

		PartDefinition neck3 = chest2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, -4.6F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r341 = neck3.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(5, 91).addBox(0.0F, -3.5069F, 0.0627F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7935F, -0.7153F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r342 = neck3.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(79, 106).addBox(0.0F, -2.9F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 35).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.9F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r343 = neck3.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(50, 25).mirror().addBox(-3.8F, -0.2F, -0.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0591F, 2.7716F, -2.7045F, 0.0196F, -0.5723F, -1.9308F));

		PartDefinition cube_r344 = neck3.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(75, 40).mirror().addBox(-3.3108F, -0.9011F, -0.7174F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(67, 92).mirror().addBox(-3.9108F, -0.9011F, -0.7174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.1F, -0.7F, -0.3714F, -0.5037F, -1.2179F));

		PartDefinition cube_r345 = neck3.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(77, 25).mirror().addBox(-1.8409F, -0.4664F, -0.7174F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.1F, -0.7F, -0.4868F, -0.3941F, -0.9537F));

		PartDefinition cube_r346 = neck3.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(77, 25).addBox(-0.1591F, -0.4664F, -0.7174F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, 0.1F, -0.7F, -0.4868F, 0.3941F, 0.9537F));

		PartDefinition cube_r347 = neck3.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(67, 92).addBox(2.9108F, -0.9011F, -0.7174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(75, 40).addBox(1.3108F, -0.9011F, -0.7174F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, 0.1F, -0.7F, -0.3714F, 0.5037F, 1.2179F));

		PartDefinition cube_r348 = neck3.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(50, 25).addBox(-0.2F, -0.2F, -0.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0591F, 2.7716F, -2.7045F, 0.0196F, 0.5723F, 1.9308F));

		PartDefinition neck5 = neck3.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, -2.766F, -0.5711F, -0.1103F, 0.0706F));

		PartDefinition cube_r349 = neck5.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(42, 56).addBox(0.0F, -0.8F, 0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2226F, -1.6821F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r350 = neck5.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(71, 56).addBox(-0.5F, -0.9F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck2 = neck5.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9205F, -1.7276F, 0.1314F, -0.0865F, -0.0114F));

		PartDefinition cube_r351 = neck2.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(26, 67).addBox(0.0F, -0.9431F, 0.9279F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 72).addBox(-0.5F, -0.1681F, 0.9279F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8922F, -1.0543F, -0.9687F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.12F, -0.4555F, -0.3554F, -0.097F, -0.0104F));

		PartDefinition cube_r352 = neck.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(14, 79).addBox(-0.5F, -1.3753F, -0.4709F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.7015F, -1.5279F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r353 = neck.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(91, 106).addBox(0.0F, -0.7681F, -1.0721F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5841F, -0.7833F, -0.6981F, 0.0F, 0.0F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(89, 36).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5662F, -2.4772F, 1.0201F, -0.0829F, -0.0511F));

		PartDefinition cube_r354 = neck4.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(82, 106).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck6 = neck4.addOrReplaceChild("neck6", CubeListBuilder.create().texOffs(39, 89).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(106, 100).addBox(0.0F, -1.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8775F, -0.0007F, 0.2585F, -0.1068F, 0.062F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3344F, -0.6726F, -1.1607F, -0.0882F, 0.1998F));

		PartDefinition cube_r355 = head.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(71, 98).addBox(-0.5F, -0.6908F, -0.8482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(66, 98).addBox(-0.5F, -0.7F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.0F, 7.5405F, -12.2622F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r356 = head.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(61, 98).addBox(-0.5F, -0.6427F, -0.2458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(98, 45).addBox(-0.5F, -0.6427F, 0.1542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 7.5045F, -12.3155F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r357 = head.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(41, 86).addBox(-1.0F, 0.45F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(24, 83).addBox(-1.0F, 0.05F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(83, 11).addBox(-1.0F, -0.35F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 5.3716F, -11.1426F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r358 = head.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(19, 10).addBox(-1.0F, -0.5F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, 3.9459F, -9.4552F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r359 = head.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, -0.3485F, -0.3023F, 2.0F, 1.0F, 7.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, 6.7045F, -11.9155F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r360 = head.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(83, 3).addBox(-1.0F, -0.6168F, -0.3751F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.202F, -0.3924F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r361 = head.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(82, 73).addBox(-1.0F, -0.1882F, -0.7452F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -1.202F, -0.3924F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r362 = head.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(98, 32).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6953F, -4.561F, 2.3213F, 0.0F, 0.0F));

		PartDefinition cube_r363 = head.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(74, 43).addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.1851F, -8.01F, 2.3126F, 0.0F, 0.0F));

		PartDefinition cube_r364 = head.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(75, 28).addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.6851F, -7.144F, -2.8362F, 0.0F, 0.0F));

		PartDefinition cube_r365 = head.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(55, 72).addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6851F, -7.144F, 2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r366 = head.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(35, 56).addBox(0.0F, -0.1F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2692F, -3.2263F, 2.1031F, 0.0F, 0.0F));

		PartDefinition cube_r367 = head.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(41, 75).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.4877F, -3.5798F, -2.6093F, 0.0F, 0.0F));

		PartDefinition cube_r368 = head.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(75, 36).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 1.4398F, -3.0821F, -3.0456F, 0.0F, 0.0F));

		PartDefinition cube_r369 = head.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(72, 47).addBox(0.0F, 0.825F, -1.475F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(23, 62).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.718F, -4.6103F, 2.1904F, 0.0F, 0.0F));

		PartDefinition cube_r370 = head.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(60, 5).addBox(-1.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, -1.276F, -3.7468F, -2.522F, 0.0F, 0.0F));

		PartDefinition cube_r371 = head.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(62, 57).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, -1.2965F, -4.3946F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r372 = head.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(16, 45).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.1206F, -3.8282F, 2.5395F, 0.0F, 0.0F));

		PartDefinition cube_r373 = head.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(27, 45).addBox(-1.0F, -1.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.6653F, -2.9895F, -1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r374 = head.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(0, 56).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, -2.1206F, -3.8282F, -2.5656F, 0.0F, 0.0F));

		PartDefinition cube_r375 = head.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(55, 35).addBox(-0.5F, -0.025F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.1043F, -1.9183F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r376 = head.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(82, 70).addBox(-1.0F, -0.575F, -0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -3.3463F, -0.1353F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r377 = head.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(82, 67).addBox(-1.0F, -1.1F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4205F, -0.5858F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r378 = head.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(72, 32).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -3.0182F, -1.8675F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r379 = head.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(72, 17).addBox(-1.0F, -1.6F, -0.625F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.8993F, 0.0763F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r380 = head.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(82, 64).addBox(-1.0F, -0.382F, -0.1476F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.202F, -0.3924F, 0.0524F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5359F, 0.9361F, -6.2986F, 0.0F, -0.0164F, -0.006F));

		PartDefinition cube_r381 = leftFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(91, 103).addBox(-0.7273F, -0.3687F, -0.3178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.5339F, -1.1497F, 4.2003F, -2.5011F, 0.064F, -0.1498F));

		PartDefinition cube_r382 = leftFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(104, 61).addBox(-0.7023F, -0.2937F, 0.0822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(86, 103).addBox(-0.7023F, -0.2937F, -0.3178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.5365F, -0.8475F, 3.9265F, -2.6058F, 0.064F, -0.1498F));

		PartDefinition cube_r383 = leftFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(81, 103).addBox(-0.7273F, -0.2659F, 0.1115F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(2.5339F, -1.1497F, 4.2003F, -2.8065F, 0.064F, -0.1498F));

		PartDefinition cube_r384 = leftFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(103, 80).addBox(-0.7273F, -0.2125F, -0.2965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.5339F, -1.1497F, 4.2003F, -2.6756F, 0.064F, -0.1498F));

		PartDefinition cube_r385 = leftFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(103, 91).addBox(-0.649F, -1.0261F, 0.246F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.2713F, -2.1647F, 4.6893F, -2.6224F, 0.0125F, -0.1844F));

		PartDefinition cube_r386 = leftFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(103, 77).addBox(-0.649F, -0.7504F, 0.31F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.2713F, -2.1647F, 4.6893F, -2.4915F, 0.0125F, -0.1844F));

		PartDefinition cube_r387 = leftFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(20, 104).addBox(-0.649F, -0.8669F, 0.0136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(76, 103).addBox(-0.649F, -0.6669F, -0.0364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.2713F, -2.1647F, 4.6893F, -2.3606F, 0.0125F, -0.1844F));

		PartDefinition cube_r388 = leftFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(61, 104).addBox(-0.649F, -0.6742F, -0.1586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(104, 33).addBox(-0.649F, -0.6492F, -0.2836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)), PartPose.offsetAndRotation(2.2713F, -2.1647F, 4.6893F, -1.8806F, 0.0125F, -0.1844F));

		PartDefinition cube_r389 = leftFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(71, 101).addBox(-0.649F, -0.6294F, -0.3908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.2713F, -2.1647F, 4.6893F, -2.2297F, 0.0125F, -0.1844F));

		PartDefinition cube_r390 = leftFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(66, 101).addBox(-0.7079F, -0.929F, -0.7585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(2.4713F, -1.7647F, 4.8893F, -0.4779F, -0.0218F, -0.3415F));

		PartDefinition cube_r391 = leftFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(61, 101).addBox(-0.6894F, -0.3095F, -0.3166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.1963F, -2.4898F, 4.7893F, 0.9487F, -0.2061F, -0.4858F));

		PartDefinition cube_r392 = leftFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(101, 38).addBox(-0.6766F, -0.3146F, -0.6912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(101, 24).addBox(-0.6766F, -0.0146F, -0.6912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.9963F, -2.7398F, 5.0143F, 2.1107F, -0.4729F, -0.67F));

		PartDefinition cube_r393 = leftFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(84, 25).addBox(-1.9766F, -0.5396F, -0.6912F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.9963F, -2.7398F, 5.0143F, 2.0472F, 0.065F, -0.3701F));

		PartDefinition cube_r394 = leftFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(89, 68).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6957F, -3.353F, 5.6363F, 2.1214F, 0.4619F, -0.1382F));

		PartDefinition cube_r395 = leftFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(0, 85).addBox(-0.7F, -1.8F, -1.175F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.7196F, -3.5276F, 5.2833F, 1.9905F, 0.4619F, -0.1382F));

		PartDefinition cube_r396 = leftFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(84, 20).addBox(-0.7F, -1.5F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.7196F, -3.5276F, 5.2833F, 2.3396F, 0.4619F, -0.1382F));

		PartDefinition cube_r397 = leftFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(12, 84).addBox(-0.2F, -2.7F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(89, 64).addBox(-0.4F, -1.7F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5192F, -4.6249F, 5.9676F, 2.3741F, -0.3853F, 0.6413F));

		PartDefinition cube_r398 = leftFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(5, 84).addBox(-0.3F, -0.7F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1422F, -4.5254F, 6.1229F, 2.4177F, -0.19F, 1.3534F));

		PartDefinition cube_r399 = leftFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(101, 21).addBox(-0.65F, 0.0F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(21, 101).addBox(-1.05F, 0.0F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6753F, -4.1191F, 5.7913F, 2.6188F, -0.1657F, 0.8625F));

		PartDefinition cube_r400 = leftFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(83, 82).addBox(-1.35F, -0.5F, -0.075F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(83, 79).addBox(-1.5F, -0.5F, -0.475F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0859F, -2.3732F, 5.3268F, 0.7263F, 0.0024F, -0.1173F));

		PartDefinition cube_r401 = leftFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(83, 76).addBox(-1.6271F, -0.1015F, 0.2132F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.9963F, -2.7398F, 5.0143F, 0.8969F, -0.555F, -0.7027F));

		PartDefinition cube_r402 = leftFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(54, 89).addBox(-0.3468F, -1.8053F, -0.3847F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(1.9691F, -1.7574F, 1.2376F, 2.5875F, 0.0449F, -0.1441F));

		PartDefinition cube_r403 = leftFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(61, 25).addBox(-2.65F, -0.6402F, -0.4718F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.4338F, -0.6305F, 0.1957F, -2.3074F, 0.0267F, -0.1596F));

		PartDefinition cube_r404 = leftFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(62, 83).addBox(-1.0F, -0.5193F, -0.676F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)), PartPose.offsetAndRotation(1.7916F, -0.0906F, 0.577F, 2.4297F, -0.0774F, -0.0639F));

		PartDefinition cube_r405 = leftFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(55, 83).addBox(-1.0F, -0.324F, -0.4807F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(1.7916F, -0.0906F, 0.577F, -2.5009F, -0.0774F, -0.0639F));

		PartDefinition cube_r406 = leftFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(83, 50).addBox(-1.4993F, -0.1857F, -0.4264F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.3021F, 0.2212F, 1.2318F, -2.1008F, 0.0471F, 0.0323F));

		PartDefinition cube_r407 = leftFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(101, 18).addBox(-0.4993F, -0.5346F, -0.5188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.3021F, 0.2212F, 1.2318F, 2.8734F, 0.0471F, 0.0323F));

		PartDefinition cube_r408 = leftFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(91, 100).addBox(-0.663F, -0.4145F, -0.5279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.4639F, 0.2332F, 1.462F, 1.6033F, 0.011F, -0.1211F));

		PartDefinition cube_r409 = leftFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(86, 100).addBox(-0.6617F, -0.4013F, -0.0729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.4639F, 0.2332F, 1.462F, 0.3021F, 0.0054F, -0.1127F));

		PartDefinition cube_r410 = leftFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(100, 84).addBox(-0.6617F, -1.2827F, -0.322F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.4639F, 0.2332F, 1.462F, -1.1378F, 0.0054F, -0.1127F));

		PartDefinition cube_r411 = leftFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(81, 100).addBox(-0.75F, -1.5881F, -0.2547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.4639F, 0.2332F, 1.462F, -1.0601F, 0.0967F, -0.068F));

		PartDefinition cube_r412 = leftFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(76, 100).addBox(-0.5F, -0.525F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(2.2725F, -1.2333F, 3.1099F, 1.6887F, 0.0967F, -0.068F));

		PartDefinition cube_r413 = leftFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(100, 58).addBox(-0.75F, 1.0499F, 1.3105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.4639F, 0.2332F, 1.462F, 1.3397F, 0.0967F, -0.068F));

		PartDefinition cube_r414 = leftFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(100, 51).addBox(-0.75F, 1.3399F, -1.4686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(100, 48).addBox(-0.75F, 1.1899F, -1.7436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(2.4639F, 0.2332F, 1.462F, 2.7359F, 0.0967F, -0.068F));

		PartDefinition cube_r415 = leftFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(100, 42).addBox(-0.75F, -1.0635F, -2.229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F))
				.texOffs(26, 100).addBox(-0.75F, -1.0635F, -1.829F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(2.4639F, 0.2332F, 1.462F, -2.3691F, 0.0967F, -0.068F));

		PartDefinition cube_r416 = leftFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(100, 9).addBox(-0.75F, -1.2898F, -1.6369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.4639F, 0.2332F, 1.462F, -2.151F, 0.0967F, -0.068F));

		PartDefinition cube_r417 = leftFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(100, 3).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.2967F, -0.5774F, 2.8985F, 2.8058F, 0.0967F, -0.068F));

		PartDefinition cube_r418 = leftFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(100, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.2841F, -0.9232F, 3.0117F, 1.2437F, 0.0967F, -0.068F));

		PartDefinition cube_r419 = leftFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(0, 100).addBox(-0.2405F, -0.2591F, -0.4012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(2.0381F, -0.3348F, 0.6921F, 3.0393F, 0.0421F, 0.0386F));

		PartDefinition cube_r420 = leftFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(83, 85).addBox(-1.2405F, -0.4684F, -0.1046F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(48, 83).addBox(-1.2405F, -0.1684F, -0.1046F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.0381F, -0.3348F, 0.6921F, 2.6466F, 0.0421F, 0.0386F));

		PartDefinition cube_r421 = leftFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(102, 54).addBox(-0.3851F, -0.6284F, -0.8328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(51, 102).addBox(-0.3851F, -0.6284F, -0.6328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(46, 102).addBox(-0.3851F, -1.0284F, -0.6328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.4545F, -2.2023F, 1.3511F, 0.6573F, 0.0464F, 0.2079F));

		PartDefinition cube_r422 = leftFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(102, 97).addBox(-0.4295F, -0.6481F, -0.3846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(102, 94).addBox(-0.4295F, -0.6481F, 0.0154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F))
				.texOffs(102, 74).addBox(-0.4295F, -1.0481F, 0.0154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(56, 102).addBox(-0.4295F, -1.0481F, -0.2846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.4545F, -2.2023F, 1.3511F, 0.8177F, -0.2318F, 0.0683F));

		PartDefinition cube_r423 = leftFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(103, 30).addBox(-0.4295F, -0.4373F, -0.9767F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(36, 105).addBox(-0.4295F, -1.0373F, -1.3767F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(26, 103).addBox(-0.4295F, -0.7373F, -1.3767F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(103, 15).addBox(-0.4295F, -0.4373F, -1.3767F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.4545F, -2.2023F, 1.3511F, -2.4984F, -0.2318F, 0.0683F));

		PartDefinition cube_r424 = leftFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(31, 105).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(2.4942F, -2.3779F, 1.5409F, -1.3203F, -0.2318F, 0.0683F));

		PartDefinition cube_r425 = leftFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(103, 27).addBox(-0.4295F, -1.084F, -0.6221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(2.4545F, -2.2023F, 1.3511F, -1.5385F, -0.2318F, 0.0683F));

		PartDefinition cube_r426 = leftFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(90, 53).addBox(-0.5F, -0.45F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(2.218F, -1.9937F, 2.5972F, -2.193F, -0.2318F, 0.0683F));

		PartDefinition cube_r427 = leftFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(103, 12).addBox(-0.4295F, 0.3763F, -0.5642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(2.4545F, -2.2023F, 1.3511F, 2.6939F, -0.2318F, 0.0683F));

		PartDefinition cube_r428 = leftFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(0, 103).addBox(-0.4295F, -0.3682F, 0.3329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.4545F, -2.2023F, 1.3511F, 1.5594F, -0.2318F, 0.0683F));

		PartDefinition cube_r429 = leftFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(41, 102).addBox(-0.3851F, -0.4452F, -1.0876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(2.4545F, -2.2023F, 1.3511F, -0.3026F, 0.0464F, 0.2079F));

		PartDefinition cube_r430 = leftFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(36, 102).addBox(-0.3851F, 0.1273F, -0.3299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.4545F, -2.2023F, 1.3511F, -1.5243F, 0.0464F, 0.2079F));

		PartDefinition cube_r431 = leftFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(75, 68).addBox(-0.3851F, -0.0251F, 0.0939F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.4545F, -2.2023F, 1.3511F, -1.8734F, 0.0464F, 0.2079F));

		PartDefinition cube_r432 = leftFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(21, 58).addBox(-1.65F, -0.7F, -1.025F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1058F, -1.0842F, 0.4923F, -2.3449F, 0.4922F, -0.2756F));

		PartDefinition cube_r433 = leftFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(17, 86).addBox(-1.7F, -0.7F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(86, 14).addBox(-1.7F, -0.7F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3566F, -2.2797F, 1.1762F, -2.7122F, 0.5893F, -0.235F));

		PartDefinition cube_r434 = leftFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(24, 86).addBox(-1.7F, -0.7F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6471F, -2.6701F, 1.9211F, -3.1119F, 0.3358F, -0.3088F));

		PartDefinition cube_r435 = leftFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(86, 17).addBox(-1.7F, -0.7F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.5538F, -2.541F, 1.5542F, -2.9025F, 0.3358F, -0.3088F));

		PartDefinition cube_r436 = leftFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(53, 57).addBox(-1.7F, -0.7F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2312F, -1.6819F, 0.8343F, -2.2194F, 0.6288F, -0.2126F));

		PartDefinition cube_r437 = leftFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(103, 45).addBox(-0.2103F, -0.2521F, -0.6261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0179F, -0.2122F, -0.0219F, 0.1334F, -1.1246F, -1.5471F));

		PartDefinition cube_r438 = leftFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(105, 48).addBox(-0.6125F, -0.2521F, -0.638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(1.0179F, -0.2122F, -0.0219F, 0.3978F, -1.4221F, -1.8204F));

		PartDefinition cube_r439 = leftFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(46, 105).addBox(-0.7561F, -0.2521F, -0.2379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0179F, -0.2122F, -0.0219F, 3.0633F, -0.7466F, 1.7682F));

		PartDefinition cube_r440 = leftFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(58, 44).addBox(-1.0816F, -0.6496F, -1.2598F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9179F, -0.2122F, -0.0219F, -2.4561F, 0.2958F, -0.0868F));

		PartDefinition cube_r441 = leftFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(34, 10).addBox(-1.4228F, -0.636F, -1.9978F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9179F, -0.2122F, -0.0219F, -2.1977F, 0.5495F, 0.372F));

		PartDefinition cube_r442 = leftFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(56, 10).addBox(-0.9546F, -0.3404F, -0.6063F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.9691F, -1.7574F, 1.2376F, -2.0876F, 0.1503F, 0.1219F));

		PartDefinition cube_r443 = leftFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(76, 85).addBox(-1.0159F, -0.8159F, -0.7436F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.9691F, -1.7574F, 1.2376F, -0.9368F, 0.1447F, 0.0772F));

		PartDefinition cube_r444 = leftFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(41, 83).addBox(-1.0659F, -0.8659F, -0.7436F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.9691F, -1.7574F, 1.2376F, -0.9211F, 0.2496F, 0.1571F));

		PartDefinition cube_r445 = leftFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(15, 105).addBox(-0.6416F, -0.5F, -0.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(99, 88).addBox(-1.0416F, -0.5F, -0.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.2138F, -2.3204F, 1.747F, 0.341F, 0.5397F, 0.2611F));

		PartDefinition cube_r446 = leftFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(39, 93).addBox(-0.389F, -0.5F, -0.6036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(93, 33).addBox(-0.589F, -0.5F, -0.6036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(99, 71).addBox(-0.989F, -0.5F, -0.6036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(2.2138F, -2.3204F, 1.747F, 0.3006F, 0.2496F, 0.1571F));

		PartDefinition cube_r447 = leftFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(99, 68).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.1286F, -2.4109F, 2.4419F, 1.2355F, 0.1062F, -0.052F));

		PartDefinition cube_r448 = leftFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(99, 65).addBox(-0.4372F, -0.0886F, 0.1599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.17F, -1.5016F, 2.9791F, 2.719F, 0.1062F, -0.052F));

		PartDefinition cube_r449 = leftFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(99, 62).addBox(-0.4372F, -0.0248F, -0.6597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.17F, -1.5016F, 2.9791F, -2.4297F, 0.1062F, -0.052F));

		PartDefinition cube_r450 = leftFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(53, 99).addBox(-0.4372F, -0.3411F, -0.5762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.17F, -1.5016F, 2.9791F, -2.6915F, 0.1062F, -0.052F));

		PartDefinition cube_r451 = leftFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(48, 99).addBox(-0.5F, -0.7317F, -0.487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.7692F, 2.4136F, 1.2665F, -0.7179F, -0.0744F, -0.0347F));

		PartDefinition cube_r452 = leftFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(43, 99).addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8065F, 2.6802F, 0.8911F, 0.5526F, -0.1488F, -0.0806F));

		PartDefinition cube_r453 = leftFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(30, 50).addBox(-0.55F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.6588F, 3.6668F, -1.2612F, 0.4182F, 0.2222F, 0.1515F));

		PartDefinition cube_r454 = leftFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(38, 99).addBox(-0.575F, -0.575F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.9894F, 3.1391F, 0.2126F, 0.4442F, 0.0507F, 0.0861F));

		PartDefinition cube_r455 = leftFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(93, 14).addBox(-0.5303F, 0.1787F, -0.7256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(13, 93).addBox(-0.5303F, -0.0213F, -0.7256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5446F, 6.3509F, -4.6002F, 1.0438F, 0.1238F, -0.4237F));

		PartDefinition cube_r456 = leftFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(93, 17).addBox(-0.5303F, -0.3358F, -0.6552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5446F, 6.3509F, -4.6002F, 0.8257F, 0.1238F, -0.4237F));

		PartDefinition cube_r457 = leftFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(31, 102).addBox(-0.35F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1944F, 4.9747F, -3.6309F, 0.5624F, 0.3178F, -0.364F));

		PartDefinition cube_r458 = leftFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(90, 59).addBox(-0.5303F, -1.6426F, -0.6523F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(88, 92).addBox(-0.5303F, -0.6257F, -0.523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5446F, 6.3509F, -4.6002F, 0.5639F, 0.1238F, -0.4237F));

		PartDefinition cube_r459 = leftFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(8, 93).addBox(-0.5303F, -0.2518F, -0.5328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)), PartPose.offsetAndRotation(0.5446F, 6.3509F, -4.6002F, 0.6031F, 0.1238F, -0.4237F));

		PartDefinition cube_r460 = leftFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(91, 24).addBox(-0.5303F, -1.6364F, -0.5298F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.5446F, 6.3509F, -4.6002F, 0.3457F, 0.1238F, -0.4237F));

		PartDefinition cube_r461 = leftFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(9, 58).addBox(-0.5F, -1.2F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.3361F, -1.071F, 2.9269F, -0.7822F, 0.0242F, -0.0935F));

		PartDefinition cube_r462 = leftFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(9, 58).addBox(-0.6327F, -5.3968F, -2.1047F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6488F, 2.5335F, 1.0535F, -0.7351F, 0.0829F, -0.0288F));

		PartDefinition cube_r463 = leftFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(42, 62).addBox(-0.431F, -3.4501F, -1.1949F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6488F, 2.5335F, 1.0535F, -0.4806F, 0.118F, -0.1203F));

		PartDefinition cube_r464 = leftFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(63, 60).addBox(-0.5F, -0.975F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6037F, 1.5643F, 1.0709F, -0.8035F, 0.118F, -0.1203F));

		PartDefinition cube_r465 = leftFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(7, 73).addBox(-0.4F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6353F, 2.2316F, 1.0149F, -0.8655F, -0.1093F, -0.1514F));

		PartDefinition cube_r466 = leftFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(49, 89).addBox(-0.5239F, -1.5074F, -0.7459F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7545F, 2.3615F, 0.8413F, 0.7333F, -0.2738F, -0.2977F));

		PartDefinition cube_r467 = leftFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(75, 60).addBox(1.1998F, -0.2541F, 1.036F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0579F, 4.0615F, -4.9032F, 3.0023F, -1.0142F, -1.1813F));

		PartDefinition cube_r468 = leftFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(48, 86).addBox(-2.3862F, -0.2541F, 1.4853F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-0.0579F, 4.0615F, -4.9032F, 0.118F, -0.8979F, 1.7493F));

		PartDefinition cube_r469 = leftFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(69, 85).addBox(-2.6547F, -0.2541F, 0.8843F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.0579F, 4.0615F, -4.9032F, 0.0981F, -0.7243F, 1.7766F));

		PartDefinition cube_r470 = leftFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(75, 64).addBox(-2.5394F, -0.2541F, -2.7295F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.0579F, 4.0615F, -4.9032F, 0.116F, 0.8844F, 1.9316F));

		PartDefinition cube_r471 = leftFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(0, 47).addBox(-2.8982F, -0.5962F, -0.841F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.0579F, 4.0615F, -4.9032F, 0.1325F, 0.4871F, 1.73F));

		PartDefinition cube_r472 = leftFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(48, 75).addBox(-2.0584F, -0.2541F, -2.1359F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0579F, 4.0615F, -4.9032F, 0.0834F, 0.4935F, 1.8813F));

		PartDefinition cube_r473 = leftFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(90, 49).addBox(-0.2F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.502F, 0.7186F, -0.416F, -0.1498F, -0.6496F, 1.9501F));

		PartDefinition cube_r474 = leftFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(90, 10).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.5191F, 0.9774F, -0.2652F, 0.1482F, -0.5269F, 1.5048F));

		PartDefinition cube_r475 = leftFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(63, 65).addBox(-0.2F, -0.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(1.929F, 0.4139F, 0.0582F, 0.3208F, -0.6748F, 1.8897F));

		PartDefinition cube_r476 = leftFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(65, 32).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(1.5191F, 0.9774F, -0.2652F, 0.5409F, -0.5269F, 1.5048F));

		PartDefinition cube_r477 = leftFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(65, 19).addBox(2.8182F, -1.204F, 2.2796F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.4572F, 2.1392F, -5.3848F, -0.1041F, -0.9579F, 1.9264F));

		PartDefinition cube_r478 = leftFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(7, 64).addBox(2.9795F, -0.1112F, 2.2796F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.4572F, 2.1392F, -5.3848F, 0.3725F, -0.9093F, 1.3395F));

		PartDefinition cube_r479 = leftFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(72, 21).addBox(1.8381F, 1.4494F, 1.4167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.4572F, 2.1392F, -5.3848F, 0.998F, -0.5579F, 1.4833F));

		PartDefinition cube_r480 = leftFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(106, 18).addBox(1.8381F, 0.3581F, 1.9061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.4572F, 2.1392F, -5.3848F, 0.5617F, -0.5579F, 1.4833F));

		PartDefinition cube_r481 = leftFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(49, 66).addBox(1.8329F, -0.7478F, 1.8228F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.4572F, 2.1392F, -5.3848F, 0.0607F, -0.6283F, 1.855F));

		PartDefinition cube_r482 = leftFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(66, 8).addBox(1.9035F, -0.1112F, 1.8228F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.4572F, 2.1392F, -5.3848F, 0.2701F, -0.5774F, 1.4887F));

		PartDefinition cube_r483 = leftFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(45, 79).addBox(0.791F, -0.3287F, 1.1758F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.4572F, 2.1392F, -5.3848F, 0.19F, -0.1995F, 1.8198F));

		PartDefinition cube_r484 = leftFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(38, 79).addBox(0.7953F, -0.1112F, 1.1758F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.4572F, 2.1392F, -5.3848F, 0.2282F, -0.154F, 1.603F));

		PartDefinition cube_r485 = leftFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(66, 104).addBox(0.4597F, -0.1112F, 0.8885F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.4572F, 2.1392F, -5.3848F, 0.2259F, 0.0586F, 1.6521F));

		PartDefinition cube_r486 = leftFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(104, 64).addBox(-0.3078F, -0.0446F, 0.7601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.6072F, 2.1392F, -5.3848F, 0.1507F, 0.623F, 1.6745F));

		PartDefinition cube_r487 = leftFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(93, 30).addBox(-0.58F, -0.0912F, -0.3339F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(18, 93).addBox(-0.58F, -0.0912F, 0.2661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.6072F, 2.1392F, -5.3848F, 0.1249F, 0.8841F, 1.7004F));

		PartDefinition cube_r488 = leftFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(24, 41).addBox(-2.5131F, -0.5962F, -2.1653F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(-0.0579F, 4.0615F, -4.9032F, 2.265F, 1.4183F, -2.3447F));

		PartDefinition cube_r489 = leftFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(56, 48).addBox(-1.0356F, -0.5962F, -1.045F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.0579F, 4.0615F, -4.9032F, 3.0242F, 0.076F, -1.4829F));

		PartDefinition cube_r490 = leftFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(56, 21).addBox(-0.5982F, -0.5962F, -1.0616F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0579F, 4.0615F, -4.9032F, 2.9906F, 0.6818F, -1.5695F));

		PartDefinition cube_r491 = leftFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(37, 41).addBox(-2.397F, -0.5962F, -1.9457F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.0579F, 4.0615F, -4.9032F, 2.6636F, 1.3142F, -1.9385F));

		PartDefinition cube_r492 = leftFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(59, 39).addBox(-0.85F, -0.525F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3213F, -0.8692F, 1.5576F, 0.7719F, 0.36F, -0.0196F));

		PartDefinition cube_r493 = leftFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(55, 86).addBox(-0.6342F, 0.5374F, -0.8944F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.0886F, 2.1516F, -2.8668F, 2.3176F, -0.5989F, 0.9834F));

		PartDefinition cube_r494 = leftFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(86, 31).addBox(-1.5583F, 0.0382F, -0.8944F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.0886F, 2.1516F, -2.8668F, 2.1668F, 0.03F, 1.4847F));

		PartDefinition cube_r495 = leftFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(30, 91).addBox(-1.5583F, 0.0866F, -0.6484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.309F)), PartPose.offsetAndRotation(0.0886F, 2.1516F, -2.8668F, 1.5123F, 0.03F, 1.4847F));

		PartDefinition cube_r496 = leftFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(50, 40).addBox(-1.786F, -0.5997F, -0.4673F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.0886F, 2.1516F, -2.8668F, 2.005F, 0.8571F, 1.4188F));

		PartDefinition cube_r497 = leftFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(65, 48).addBox(-1.786F, -0.6759F, -0.6484F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.0886F, 2.1516F, -2.8668F, 1.4814F, 0.8571F, 1.4188F));

		PartDefinition cube_r498 = leftFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(59, 28).addBox(0.1073F, -0.8924F, -0.6523F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.0886F, 2.1516F, -2.8668F, 1.6703F, 0.9002F, 1.6162F));

		PartDefinition cube_r499 = leftFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(38, 45).addBox(-2.1532F, -0.7667F, -0.6523F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.309F)), PartPose.offsetAndRotation(0.0886F, 2.1516F, -2.8668F, 1.7261F, 1.16F, 1.6807F));

		PartDefinition cube_r500 = leftFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(36, 83).addBox(-0.4871F, -0.1669F, -0.2326F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(31, 86).addBox(-0.4871F, -0.1669F, -0.6326F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.1031F, 2.9107F, -2.7446F, -0.8315F, 0.0935F, 0.0073F));

		PartDefinition cube_r501 = leftFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(99, 35).addBox(-0.3F, -0.3F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(33, 99).addBox(-0.3F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2194F, 6.3196F, -6.6219F, 1.4738F, -1.2478F, -1.5328F));

		PartDefinition cube_r502 = leftFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(16, 99).addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2179F, 6.4086F, -6.2551F, 0.4896F, -0.8368F, -0.3674F));

		PartDefinition cube_r503 = leftFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(11, 99).addBox(0.0766F, 0.067F, -2.2342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2744F, 5.1127F, -4.7103F, 0.4078F, 0.017F, 0.015F));

		PartDefinition cube_r504 = leftFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(97, 98).addBox(0.0917F, -0.4337F, -1.9864F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.2744F, 5.1127F, -4.7103F, 0.6997F, -0.0026F, 0.0435F));

		PartDefinition cube_r505 = leftFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(98, 91).addBox(-0.2055F, -0.4337F, -1.7272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2744F, 5.1127F, -4.7103F, 0.7119F, -0.1689F, -0.0983F));

		PartDefinition cube_r506 = leftFace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(79, 32).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1971F, 5.2518F, -5.4931F, 1.4558F, -0.0394F, -0.0901F));

		PartDefinition cube_r507 = leftFace.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(31, 77).addBox(-0.2017F, -0.9558F, -1.3722F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2744F, 5.1127F, -4.7103F, 1.1385F, -0.1119F, -0.0383F));

		PartDefinition cube_r508 = leftFace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(68, 72).addBox(-0.2017F, -0.4308F, -1.3722F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.2744F, 5.1127F, -4.7103F, 0.6149F, -0.1119F, -0.0383F));

		PartDefinition cube_r509 = leftFace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(80, 92).addBox(-0.1321F, -0.9981F, -1.9012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(75, 92).addBox(-0.1321F, -0.9981F, -1.6761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.2744F, 5.1127F, -4.7103F, 1.0526F, -0.1324F, -0.0409F));

		PartDefinition cube_r510 = leftFace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(69, 76).addBox(-0.4994F, -0.4802F, -1.8328F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.139F, 4.2504F, -3.3039F, 0.4646F, 0.2003F, -0.0762F));

		PartDefinition cube_r511 = leftFace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(90, 84).addBox(-0.5804F, -0.1727F, -0.4442F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.139F, 4.2504F, -3.3039F, 1.9938F, 0.274F, -0.0363F));

		PartDefinition cube_r512 = leftFace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(35, 62).addBox(-0.45F, -0.8F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7951F, -2.1527F, 5.8959F, 1.9731F, 1.5077F, -0.0288F));

		PartDefinition cube_r513 = leftFace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(101, 104).addBox(-0.6234F, -0.6603F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(98, 81).addBox(-0.6234F, -0.9103F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6968F, 3.041F, -1.5026F, -2.9063F, 0.3104F, 0.0431F));

		PartDefinition cube_r514 = leftFace.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(62, 76).addBox(-0.5616F, -0.2065F, -1.2736F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(55, 76).addBox(-0.5616F, -0.4065F, -1.2736F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.3154F, -3.817F, 3.1343F, -1.0016F, -0.3466F, 0.2248F));

		PartDefinition cube_r515 = leftFace.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(10, 105).addBox(-0.5616F, -0.5217F, -0.3627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3154F, -3.817F, 3.1343F, -0.5217F, -0.3466F, 0.2248F));

		PartDefinition cube_r516 = leftFace.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(76, 51).addBox(-0.5616F, -0.3774F, 0.2063F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3154F, -3.817F, 3.1343F, -0.1726F, -0.3466F, 0.2248F));

		PartDefinition cube_r517 = leftFace.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(24, 76).addBox(-0.5616F, -0.1586F, -0.0616F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3154F, -3.817F, 3.1343F, -1.6561F, -0.3466F, 0.2248F));

		PartDefinition cube_r518 = leftFace.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(105, 9).addBox(-0.5616F, 0.402F, -1.0776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.3154F, -3.817F, 3.1343F, -1.8307F, -0.3466F, 0.2248F));

		PartDefinition cube_r519 = leftFace.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(105, 3).addBox(-0.2634F, -0.3908F, 0.2045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.3154F, -3.817F, 3.1343F, -0.0934F, -0.347F, -0.0072F));

		PartDefinition cube_r520 = leftFace.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(76, 12).addBox(-0.2634F, -0.158F, -0.0751F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3154F, -3.817F, 3.1343F, -1.5769F, -0.347F, -0.0072F));

		PartDefinition cube_r521 = leftFace.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(105, 0).addBox(-0.2634F, -0.5337F, -0.3689F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3154F, -3.817F, 3.1343F, -0.4425F, -0.347F, -0.0072F));

		PartDefinition cube_r522 = leftFace.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(5, 105).addBox(-0.2634F, 0.4049F, -1.0907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3154F, -3.817F, 3.1343F, -1.7515F, -0.347F, -0.0072F));

		PartDefinition cube_r523 = leftFace.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(76, 4).addBox(-0.2634F, -0.4143F, -1.2846F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F))
				.texOffs(0, 76).addBox(-0.2634F, -0.2143F, -1.2846F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.3154F, -3.817F, 3.1343F, -0.9224F, -0.347F, -0.0072F));

		PartDefinition cube_r524 = leftFace.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(75, 72).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0572F, -3.9044F, 4.2436F, -1.115F, 0.7926F, 0.3365F));

		PartDefinition cube_r525 = leftFace.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(71, 104).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5135F, 0.8561F, -1.1666F, 1.4691F, 0.7363F, -1.6977F));

		PartDefinition cube_r526 = leftFace.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(104, 70).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0655F, 0.2487F, -1.7105F, 2.2065F, 0.4125F, -0.4738F));

		PartDefinition cube_r527 = leftFace.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(79, 16).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0483F, -0.2512F, -0.8446F, -2.8981F, 0.187F, -0.5845F));

		PartDefinition cube_r528 = leftFace.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(104, 87).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5277F, 0.4616F, -0.4445F, 1.4769F, 0.5162F, -1.7249F));

		PartDefinition cube_r529 = leftFace.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(104, 67).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0483F, -0.2512F, -0.8446F, 2.0037F, 0.3049F, -0.5417F));

		PartDefinition cube_r530 = leftFace.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(96, 104).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 78).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.3863F, 3.0204F, -0.3349F, 1.9862F, 0.2381F, 0.0725F));

		PartDefinition cube_r531 = leftFace.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(44, 89).addBox(-0.9871F, -1.5074F, -0.9726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.4579F, 2.615F, 0.5224F, 0.4485F, 0.094F, 0.0091F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5359F, 0.9361F, -6.2986F, 0.0F, 0.0164F, 0.006F));

		PartDefinition cube_r532 = rightFace.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(91, 103).mirror().addBox(-0.2727F, -0.3687F, -0.3178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.5339F, -1.1497F, 4.2003F, -2.5011F, -0.064F, 0.1498F));

		PartDefinition cube_r533 = rightFace.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(104, 61).mirror().addBox(-0.2977F, -0.2937F, 0.0822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(86, 103).mirror().addBox(-0.2977F, -0.2937F, -0.3178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.5365F, -0.8475F, 3.9265F, -2.6058F, -0.064F, 0.1498F));

		PartDefinition cube_r534 = rightFace.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(81, 103).mirror().addBox(-0.2727F, -0.2659F, 0.1115F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.5339F, -1.1497F, 4.2003F, -2.8065F, -0.064F, 0.1498F));

		PartDefinition cube_r535 = rightFace.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(103, 80).mirror().addBox(-0.2727F, -0.2125F, -0.2965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.5339F, -1.1497F, 4.2003F, -2.6756F, -0.064F, 0.1498F));

		PartDefinition cube_r536 = rightFace.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(103, 91).mirror().addBox(-0.351F, -1.0261F, 0.246F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.2713F, -2.1647F, 4.6893F, -2.6224F, -0.0125F, 0.1844F));

		PartDefinition cube_r537 = rightFace.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(103, 77).mirror().addBox(-0.351F, -0.7504F, 0.31F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.2713F, -2.1647F, 4.6893F, -2.4915F, -0.0125F, 0.1844F));

		PartDefinition cube_r538 = rightFace.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(20, 104).mirror().addBox(-0.351F, -0.8669F, 0.0136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(76, 103).mirror().addBox(-0.351F, -0.6669F, -0.0364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.2713F, -2.1647F, 4.6893F, -2.3606F, -0.0125F, 0.1844F));

		PartDefinition cube_r539 = rightFace.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(61, 104).mirror().addBox(-0.351F, -0.6742F, -0.1586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(104, 33).mirror().addBox(-0.351F, -0.6492F, -0.2836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)).mirror(false), PartPose.offsetAndRotation(-2.2713F, -2.1647F, 4.6893F, -1.8806F, -0.0125F, 0.1844F));

		PartDefinition cube_r540 = rightFace.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(71, 101).mirror().addBox(-0.351F, -0.6294F, -0.3908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.2713F, -2.1647F, 4.6893F, -2.2297F, -0.0125F, 0.1844F));

		PartDefinition cube_r541 = rightFace.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(66, 101).mirror().addBox(-0.2921F, -0.929F, -0.7585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.4713F, -1.7647F, 4.8893F, -0.4779F, 0.0218F, 0.3415F));

		PartDefinition cube_r542 = rightFace.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(61, 101).mirror().addBox(-0.3106F, -0.3095F, -0.3166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.1963F, -2.4898F, 4.7893F, 0.9487F, 0.2061F, 0.4858F));

		PartDefinition cube_r543 = rightFace.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(101, 38).mirror().addBox(-0.3234F, -0.3146F, -0.6912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(101, 24).mirror().addBox(-0.3234F, -0.0146F, -0.6912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.9963F, -2.7398F, 5.0143F, 2.1107F, 0.4729F, 0.67F));

		PartDefinition cube_r544 = rightFace.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(84, 25).mirror().addBox(-0.0234F, -0.5396F, -0.6912F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.9963F, -2.7398F, 5.0143F, 2.0472F, -0.065F, 0.3701F));

		PartDefinition cube_r545 = rightFace.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(89, 68).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6957F, -3.353F, 5.6363F, 2.1214F, -0.4619F, 0.1382F));

		PartDefinition cube_r546 = rightFace.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-0.3F, -1.8F, -1.175F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.7196F, -3.5276F, 5.2833F, 1.9905F, -0.4619F, 0.1382F));

		PartDefinition cube_r547 = rightFace.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(84, 20).mirror().addBox(-0.3F, -1.5F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-0.7196F, -3.5276F, 5.2833F, 2.3396F, -0.4619F, 0.1382F));

		PartDefinition cube_r548 = rightFace.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(12, 84).mirror().addBox(-0.8F, -2.7F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(89, 64).mirror().addBox(-0.6F, -1.7F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5192F, -4.6249F, 5.9676F, 2.3741F, 0.3853F, -0.6413F));

		PartDefinition cube_r549 = rightFace.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(5, 84).mirror().addBox(-1.7F, -0.7F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1422F, -4.5254F, 6.1229F, 2.4177F, 0.19F, -1.3534F));

		PartDefinition cube_r550 = rightFace.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(101, 21).mirror().addBox(-0.35F, 0.0F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(21, 101).mirror().addBox(0.05F, 0.0F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6753F, -4.1191F, 5.7913F, 2.6188F, 0.1657F, -0.8625F));

		PartDefinition cube_r551 = rightFace.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(83, 82).mirror().addBox(-0.65F, -0.5F, -0.075F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(83, 79).mirror().addBox(-0.5F, -0.5F, -0.475F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0859F, -2.3732F, 5.3268F, 0.7263F, -0.0024F, 0.1173F));

		PartDefinition cube_r552 = rightFace.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(83, 76).mirror().addBox(-0.3729F, -0.1015F, 0.2132F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.9963F, -2.7398F, 5.0143F, 0.8969F, 0.555F, 0.7027F));

		PartDefinition cube_r553 = rightFace.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(54, 89).mirror().addBox(-0.6532F, -1.8053F, -0.3847F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-1.9691F, -1.7574F, 1.2376F, 2.5875F, -0.0449F, 0.1441F));

		PartDefinition cube_r554 = rightFace.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(61, 25).mirror().addBox(-0.35F, -0.6402F, -0.4718F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.4338F, -0.6305F, 0.1957F, -2.3074F, -0.0267F, 0.1596F));

		PartDefinition cube_r555 = rightFace.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(62, 83).mirror().addBox(-1.0F, -0.5193F, -0.676F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)).mirror(false), PartPose.offsetAndRotation(-1.7916F, -0.0906F, 0.577F, 2.4297F, 0.0774F, 0.0639F));

		PartDefinition cube_r556 = rightFace.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(55, 83).mirror().addBox(-1.0F, -0.324F, -0.4807F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-1.7916F, -0.0906F, 0.577F, -2.5009F, 0.0774F, 0.0639F));

		PartDefinition cube_r557 = rightFace.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(83, 50).mirror().addBox(-0.5007F, -0.1857F, -0.4264F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.3021F, 0.2212F, 1.2318F, -2.1008F, -0.0471F, -0.0323F));

		PartDefinition cube_r558 = rightFace.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(101, 18).mirror().addBox(-0.5007F, -0.5346F, -0.5188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.3021F, 0.2212F, 1.2318F, 2.8734F, -0.0471F, -0.0323F));

		PartDefinition cube_r559 = rightFace.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(91, 100).mirror().addBox(-0.337F, -0.4145F, -0.5279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.4639F, 0.2332F, 1.462F, 1.6033F, -0.011F, 0.1211F));

		PartDefinition cube_r560 = rightFace.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(86, 100).mirror().addBox(-0.3383F, -0.4013F, -0.0729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.4639F, 0.2332F, 1.462F, 0.3021F, -0.0054F, 0.1127F));

		PartDefinition cube_r561 = rightFace.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(100, 84).mirror().addBox(-0.3383F, -1.2827F, -0.322F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.4639F, 0.2332F, 1.462F, -1.1378F, -0.0054F, 0.1127F));

		PartDefinition cube_r562 = rightFace.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(81, 100).mirror().addBox(-0.25F, -1.5881F, -0.2547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.4639F, 0.2332F, 1.462F, -1.0601F, -0.0967F, 0.068F));

		PartDefinition cube_r563 = rightFace.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(76, 100).mirror().addBox(-0.5F, -0.525F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.2725F, -1.2333F, 3.1099F, 1.6887F, -0.0967F, 0.068F));

		PartDefinition cube_r564 = rightFace.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(100, 58).mirror().addBox(-0.25F, 1.0499F, 1.3105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.4639F, 0.2332F, 1.462F, 1.3397F, -0.0967F, 0.068F));

		PartDefinition cube_r565 = rightFace.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(100, 51).mirror().addBox(-0.25F, 1.3399F, -1.4686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(100, 48).mirror().addBox(-0.25F, 1.1899F, -1.7436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.4639F, 0.2332F, 1.462F, 2.7359F, -0.0967F, 0.068F));

		PartDefinition cube_r566 = rightFace.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(100, 42).mirror().addBox(-0.25F, -1.0635F, -2.229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)).mirror(false)
				.texOffs(26, 100).mirror().addBox(-0.25F, -1.0635F, -1.829F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.4639F, 0.2332F, 1.462F, -2.3691F, -0.0967F, 0.068F));

		PartDefinition cube_r567 = rightFace.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(100, 9).mirror().addBox(-0.25F, -1.2898F, -1.6369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.4639F, 0.2332F, 1.462F, -2.151F, -0.0967F, 0.068F));

		PartDefinition cube_r568 = rightFace.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(100, 3).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.2967F, -0.5774F, 2.8985F, 2.8058F, -0.0967F, 0.068F));

		PartDefinition cube_r569 = rightFace.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.2841F, -0.9232F, 3.0117F, 1.2437F, -0.0967F, 0.068F));

		PartDefinition cube_r570 = rightFace.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-0.7595F, -0.2591F, -0.4012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.0381F, -0.3348F, 0.6921F, 3.0393F, -0.0421F, -0.0386F));

		PartDefinition cube_r571 = rightFace.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(83, 85).mirror().addBox(-0.7595F, -0.4684F, -0.1046F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(48, 83).mirror().addBox(-0.7595F, -0.1684F, -0.1046F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.0381F, -0.3348F, 0.6921F, 2.6466F, -0.0421F, -0.0386F));

		PartDefinition cube_r572 = rightFace.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(102, 54).mirror().addBox(-0.6149F, -0.6284F, -0.8328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(51, 102).mirror().addBox(-0.6149F, -0.6284F, -0.6328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(46, 102).mirror().addBox(-0.6149F, -1.0284F, -0.6328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.4545F, -2.2023F, 1.3511F, 0.6573F, -0.0464F, -0.2079F));

		PartDefinition cube_r573 = rightFace.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(102, 97).mirror().addBox(-0.5705F, -0.6481F, -0.3846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(102, 94).mirror().addBox(-0.5705F, -0.6481F, 0.0154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false)
				.texOffs(102, 74).mirror().addBox(-0.5705F, -1.0481F, 0.0154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(56, 102).mirror().addBox(-0.5705F, -1.0481F, -0.2846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.4545F, -2.2023F, 1.3511F, 0.8177F, 0.2318F, -0.0683F));

		PartDefinition cube_r574 = rightFace.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(103, 30).mirror().addBox(-0.5705F, -0.4373F, -0.9767F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(36, 105).mirror().addBox(-0.5705F, -1.0373F, -1.3767F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(26, 103).mirror().addBox(-0.5705F, -0.7373F, -1.3767F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(103, 15).mirror().addBox(-0.5705F, -0.4373F, -1.3767F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.4545F, -2.2023F, 1.3511F, -2.4984F, 0.2318F, -0.0683F));

		PartDefinition cube_r575 = rightFace.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(31, 105).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-2.4942F, -2.3779F, 1.5409F, -1.3203F, 0.2318F, -0.0683F));

		PartDefinition cube_r576 = rightFace.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(103, 27).mirror().addBox(-0.5705F, -1.084F, -0.6221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.4545F, -2.2023F, 1.3511F, -1.5385F, 0.2318F, -0.0683F));

		PartDefinition cube_r577 = rightFace.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(90, 53).mirror().addBox(-0.5F, -0.45F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-2.218F, -1.9937F, 2.5972F, -2.193F, 0.2318F, -0.0683F));

		PartDefinition cube_r578 = rightFace.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(103, 12).mirror().addBox(-0.5705F, 0.3763F, -0.5642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.4545F, -2.2023F, 1.3511F, 2.6939F, 0.2318F, -0.0683F));

		PartDefinition cube_r579 = rightFace.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(0, 103).mirror().addBox(-0.5705F, -0.3682F, 0.3329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.4545F, -2.2023F, 1.3511F, 1.5594F, 0.2318F, -0.0683F));

		PartDefinition cube_r580 = rightFace.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(41, 102).mirror().addBox(-0.6149F, -0.4452F, -1.0876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.4545F, -2.2023F, 1.3511F, -0.3026F, -0.0464F, -0.2079F));

		PartDefinition cube_r581 = rightFace.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(36, 102).mirror().addBox(-0.6149F, 0.1273F, -0.3299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.4545F, -2.2023F, 1.3511F, -1.5243F, -0.0464F, -0.2079F));

		PartDefinition cube_r582 = rightFace.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(75, 68).mirror().addBox(-0.6149F, -0.0251F, 0.0939F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.4545F, -2.2023F, 1.3511F, -1.8734F, -0.0464F, -0.2079F));

		PartDefinition cube_r583 = rightFace.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(21, 58).mirror().addBox(-0.35F, -0.7F, -1.025F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1058F, -1.0842F, 0.4923F, -2.3449F, -0.4922F, 0.2756F));

		PartDefinition cube_r584 = rightFace.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(17, 86).mirror().addBox(-0.3F, -0.7F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(86, 14).mirror().addBox(-0.3F, -0.7F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3566F, -2.2797F, 1.1762F, -2.7122F, -0.5893F, 0.235F));

		PartDefinition cube_r585 = rightFace.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(24, 86).mirror().addBox(-0.3F, -0.7F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6471F, -2.6701F, 1.9211F, -3.1119F, -0.3358F, 0.3088F));

		PartDefinition cube_r586 = rightFace.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(86, 17).mirror().addBox(-0.3F, -0.7F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.5538F, -2.541F, 1.5542F, -2.9025F, -0.3358F, 0.3088F));

		PartDefinition cube_r587 = rightFace.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(53, 57).mirror().addBox(-0.3F, -0.7F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2312F, -1.6819F, 0.8343F, -2.2194F, -0.6288F, 0.2126F));

		PartDefinition cube_r588 = rightFace.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(103, 45).mirror().addBox(-0.7897F, -0.2521F, -0.6261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0179F, -0.2122F, -0.0219F, 0.1334F, 1.1246F, 1.5471F));

		PartDefinition cube_r589 = rightFace.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(105, 48).mirror().addBox(-0.3876F, -0.2521F, -0.638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-1.0179F, -0.2122F, -0.0219F, 0.3978F, 1.4221F, 1.8204F));

		PartDefinition cube_r590 = rightFace.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(46, 105).mirror().addBox(-0.2439F, -0.2521F, -0.2379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0179F, -0.2122F, -0.0219F, 3.0633F, 0.7466F, -1.7682F));

		PartDefinition cube_r591 = rightFace.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(58, 44).mirror().addBox(-0.9184F, -0.6496F, -1.2598F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9179F, -0.2122F, -0.0219F, -2.4561F, -0.2958F, 0.0868F));

		PartDefinition cube_r592 = rightFace.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(34, 10).mirror().addBox(-0.5772F, -0.636F, -1.9978F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9179F, -0.2122F, -0.0219F, -2.1977F, -0.5495F, -0.372F));

		PartDefinition cube_r593 = rightFace.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(56, 10).mirror().addBox(-1.0454F, -0.3404F, -0.6063F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.9691F, -1.7574F, 1.2376F, -2.0876F, -0.1503F, -0.1219F));

		PartDefinition cube_r594 = rightFace.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(76, 85).mirror().addBox(-0.9841F, -0.8159F, -0.7436F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.9691F, -1.7574F, 1.2376F, -0.9368F, -0.1447F, -0.0772F));

		PartDefinition cube_r595 = rightFace.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(41, 83).mirror().addBox(-0.9341F, -0.8659F, -0.7436F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.9691F, -1.7574F, 1.2376F, -0.9211F, -0.2496F, -0.1571F));

		PartDefinition cube_r596 = rightFace.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(15, 105).mirror().addBox(-0.3584F, -0.5F, -0.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(99, 88).mirror().addBox(0.0416F, -0.5F, -0.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.2138F, -2.3204F, 1.747F, 0.341F, -0.5397F, -0.2611F));

		PartDefinition cube_r597 = rightFace.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(39, 93).mirror().addBox(-0.611F, -0.5F, -0.6036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(93, 33).mirror().addBox(-0.411F, -0.5F, -0.6036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(99, 71).mirror().addBox(-0.011F, -0.5F, -0.6036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-2.2138F, -2.3204F, 1.747F, 0.3006F, -0.2496F, -0.1571F));

		PartDefinition cube_r598 = rightFace.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(99, 68).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.1286F, -2.4109F, 2.4419F, 1.2355F, -0.1062F, 0.052F));

		PartDefinition cube_r599 = rightFace.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(99, 65).mirror().addBox(-0.5628F, -0.0886F, 0.1599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.17F, -1.5016F, 2.9791F, 2.719F, -0.1062F, 0.052F));

		PartDefinition cube_r600 = rightFace.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(99, 62).mirror().addBox(-0.5628F, -0.0248F, -0.6597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.17F, -1.5016F, 2.9791F, -2.4297F, -0.1062F, 0.052F));

		PartDefinition cube_r601 = rightFace.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(53, 99).mirror().addBox(-0.5628F, -0.3411F, -0.5762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.17F, -1.5016F, 2.9791F, -2.6915F, -0.1062F, 0.052F));

		PartDefinition cube_r602 = rightFace.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(48, 99).mirror().addBox(-0.5F, -0.7317F, -0.487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.7692F, 2.4136F, 1.2665F, -0.7179F, 0.0744F, 0.0347F));

		PartDefinition cube_r603 = rightFace.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(43, 99).mirror().addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8065F, 2.6802F, 0.8911F, 0.5526F, 0.1488F, 0.0806F));

		PartDefinition cube_r604 = rightFace.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(30, 50).mirror().addBox(-0.45F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.6588F, 3.6668F, -1.2612F, 0.4182F, -0.2222F, -0.1515F));

		PartDefinition cube_r605 = rightFace.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(38, 99).mirror().addBox(-0.425F, -0.575F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.9894F, 3.1391F, 0.2126F, 0.4442F, -0.0507F, -0.0861F));

		PartDefinition cube_r606 = rightFace.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(93, 14).mirror().addBox(-0.4696F, 0.1787F, -0.7256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(13, 93).mirror().addBox(-0.4696F, -0.0213F, -0.7256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5446F, 6.3509F, -4.6002F, 1.0438F, -0.1238F, 0.4237F));

		PartDefinition cube_r607 = rightFace.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(93, 17).mirror().addBox(-0.4696F, -0.3358F, -0.6552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5446F, 6.3509F, -4.6002F, 0.8257F, -0.1238F, 0.4237F));

		PartDefinition cube_r608 = rightFace.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(31, 102).mirror().addBox(-0.65F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1944F, 4.9747F, -3.6309F, 0.5624F, -0.3178F, 0.364F));

		PartDefinition cube_r609 = rightFace.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(90, 59).mirror().addBox(-0.4696F, -1.6426F, -0.6523F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(88, 92).mirror().addBox(-0.4696F, -0.6257F, -0.523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5446F, 6.3509F, -4.6002F, 0.5639F, -0.1238F, 0.4237F));

		PartDefinition cube_r610 = rightFace.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(8, 93).mirror().addBox(-0.4696F, -0.2518F, -0.5328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)).mirror(false), PartPose.offsetAndRotation(-0.5446F, 6.3509F, -4.6002F, 0.6031F, -0.1238F, 0.4237F));

		PartDefinition cube_r611 = rightFace.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(91, 24).mirror().addBox(-0.4696F, -1.6364F, -0.5298F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.5446F, 6.3509F, -4.6002F, 0.3457F, -0.1238F, 0.4237F));

		PartDefinition cube_r612 = rightFace.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(9, 58).mirror().addBox(-0.5F, -1.2F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.3361F, -1.071F, 2.9269F, -0.7822F, -0.0242F, 0.0935F));

		PartDefinition cube_r613 = rightFace.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(9, 58).mirror().addBox(-0.3673F, -5.3968F, -2.1047F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6488F, 2.5335F, 1.0535F, -0.7351F, -0.0829F, 0.0288F));

		PartDefinition cube_r614 = rightFace.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(42, 62).mirror().addBox(-0.569F, -3.4501F, -1.1949F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6488F, 2.5335F, 1.0535F, -0.4806F, -0.118F, 0.1203F));

		PartDefinition cube_r615 = rightFace.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(63, 60).mirror().addBox(-0.5F, -0.975F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6037F, 1.5643F, 1.0709F, -0.8035F, -0.118F, 0.1203F));

		PartDefinition cube_r616 = rightFace.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(7, 73).mirror().addBox(-0.6F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6353F, 2.2316F, 1.0149F, -0.8655F, 0.1093F, 0.1514F));

		PartDefinition cube_r617 = rightFace.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(49, 89).mirror().addBox(-0.4761F, -1.5074F, -0.7459F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7545F, 2.3615F, 0.8413F, 0.7333F, 0.2738F, 0.2977F));

		PartDefinition cube_r618 = rightFace.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(75, 60).mirror().addBox(-2.1998F, -0.2541F, 1.036F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0579F, 4.0615F, -4.9032F, 3.0023F, 1.0142F, 1.1813F));

		PartDefinition cube_r619 = rightFace.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(48, 86).mirror().addBox(0.3862F, -0.2541F, 1.4853F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(0.0579F, 4.0615F, -4.9032F, 0.118F, 0.8979F, -1.7493F));

		PartDefinition cube_r620 = rightFace.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(69, 85).mirror().addBox(0.6547F, -0.2541F, 0.8843F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.0579F, 4.0615F, -4.9032F, 0.0981F, 0.7243F, -1.7766F));

		PartDefinition cube_r621 = rightFace.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(75, 64).mirror().addBox(1.5394F, -0.2541F, -2.7295F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.0579F, 4.0615F, -4.9032F, 0.116F, -0.8844F, -1.9316F));

		PartDefinition cube_r622 = rightFace.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(0, 47).mirror().addBox(1.8982F, -0.5962F, -0.841F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.0579F, 4.0615F, -4.9032F, 0.1325F, -0.4871F, -1.73F));

		PartDefinition cube_r623 = rightFace.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(48, 75).mirror().addBox(1.0584F, -0.2541F, -2.1359F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0579F, 4.0615F, -4.9032F, 0.0834F, -0.4935F, -1.8813F));

		PartDefinition cube_r624 = rightFace.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(90, 49).mirror().addBox(-0.8F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.502F, 0.7186F, -0.416F, -0.1498F, 0.6496F, -1.9501F));

		PartDefinition cube_r625 = rightFace.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(90, 10).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.5191F, 0.9774F, -0.2652F, 0.1482F, 0.5269F, -1.5048F));

		PartDefinition cube_r626 = rightFace.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(63, 65).mirror().addBox(-0.8F, -0.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-1.929F, 0.4139F, 0.0582F, 0.3208F, 0.6748F, -1.8897F));

		PartDefinition cube_r627 = rightFace.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(65, 32).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-1.5191F, 0.9774F, -0.2652F, 0.5409F, 0.5269F, -1.5048F));

		PartDefinition cube_r628 = rightFace.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(65, 19).mirror().addBox(-3.8181F, -1.204F, 2.2796F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.4572F, 2.1392F, -5.3848F, -0.1041F, 0.9579F, -1.9264F));

		PartDefinition cube_r629 = rightFace.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(7, 64).mirror().addBox(-3.9795F, -0.1112F, 2.2796F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.4572F, 2.1392F, -5.3848F, 0.3725F, 0.9093F, -1.3395F));

		PartDefinition cube_r630 = rightFace.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(72, 21).mirror().addBox(-2.8381F, 1.4494F, 1.4167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.4572F, 2.1392F, -5.3848F, 0.998F, 0.5579F, -1.4833F));

		PartDefinition cube_r631 = rightFace.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(106, 18).mirror().addBox(-2.8381F, 0.3581F, 1.9061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-0.4572F, 2.1392F, -5.3848F, 0.5617F, 0.5579F, -1.4833F));

		PartDefinition cube_r632 = rightFace.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(49, 66).mirror().addBox(-2.8329F, -0.7478F, 1.8228F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.4572F, 2.1392F, -5.3848F, 0.0607F, 0.6283F, -1.855F));

		PartDefinition cube_r633 = rightFace.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(66, 8).mirror().addBox(-2.9035F, -0.1112F, 1.8228F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.4572F, 2.1392F, -5.3848F, 0.2701F, 0.5774F, -1.4887F));

		PartDefinition cube_r634 = rightFace.addOrReplaceChild("cube_r634", CubeListBuilder.create().texOffs(45, 79).mirror().addBox(-1.791F, -0.3287F, 1.1758F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.4572F, 2.1392F, -5.3848F, 0.19F, 0.1995F, -1.8198F));

		PartDefinition cube_r635 = rightFace.addOrReplaceChild("cube_r635", CubeListBuilder.create().texOffs(38, 79).mirror().addBox(-1.7953F, -0.1112F, 1.1758F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.4572F, 2.1392F, -5.3848F, 0.2282F, 0.154F, -1.603F));

		PartDefinition cube_r636 = rightFace.addOrReplaceChild("cube_r636", CubeListBuilder.create().texOffs(66, 104).mirror().addBox(-1.4598F, -0.1112F, 0.8885F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.4572F, 2.1392F, -5.3848F, 0.2259F, -0.0586F, -1.6521F));

		PartDefinition cube_r637 = rightFace.addOrReplaceChild("cube_r637", CubeListBuilder.create().texOffs(104, 64).mirror().addBox(-0.6922F, -0.0446F, 0.7601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.6072F, 2.1392F, -5.3848F, 0.1507F, -0.623F, -1.6745F));

		PartDefinition cube_r638 = rightFace.addOrReplaceChild("cube_r638", CubeListBuilder.create().texOffs(93, 30).mirror().addBox(-0.42F, -0.0912F, -0.3339F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(18, 93).mirror().addBox(-0.42F, -0.0912F, 0.2661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.6072F, 2.1392F, -5.3848F, 0.1249F, -0.8841F, -1.7004F));

		PartDefinition cube_r639 = rightFace.addOrReplaceChild("cube_r639", CubeListBuilder.create().texOffs(24, 41).mirror().addBox(-1.4869F, -0.5962F, -2.1653F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(0.0579F, 4.0615F, -4.9032F, 2.265F, -1.4183F, 2.3447F));

		PartDefinition cube_r640 = rightFace.addOrReplaceChild("cube_r640", CubeListBuilder.create().texOffs(56, 48).mirror().addBox(-0.9644F, -0.5962F, -1.045F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.0579F, 4.0615F, -4.9032F, 3.0242F, -0.076F, 1.4829F));

		PartDefinition cube_r641 = rightFace.addOrReplaceChild("cube_r641", CubeListBuilder.create().texOffs(56, 21).mirror().addBox(-1.4018F, -0.5962F, -1.0616F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0579F, 4.0615F, -4.9032F, 2.9906F, -0.6818F, 1.5695F));

		PartDefinition cube_r642 = rightFace.addOrReplaceChild("cube_r642", CubeListBuilder.create().texOffs(37, 41).mirror().addBox(-1.603F, -0.5962F, -1.9457F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.0579F, 4.0615F, -4.9032F, 2.6636F, -1.3142F, 1.9385F));

		PartDefinition cube_r643 = rightFace.addOrReplaceChild("cube_r643", CubeListBuilder.create().texOffs(59, 39).mirror().addBox(-1.15F, -0.525F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3213F, -0.8692F, 1.5576F, 0.7719F, -0.36F, 0.0196F));

		PartDefinition cube_r644 = rightFace.addOrReplaceChild("cube_r644", CubeListBuilder.create().texOffs(55, 86).mirror().addBox(-1.3658F, 0.5374F, -0.8944F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-0.0886F, 2.1516F, -2.8668F, 2.3176F, 0.5989F, -0.9834F));

		PartDefinition cube_r645 = rightFace.addOrReplaceChild("cube_r645", CubeListBuilder.create().texOffs(86, 31).mirror().addBox(-0.4417F, 0.0382F, -0.8944F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-0.0886F, 2.1516F, -2.8668F, 2.1668F, -0.03F, -1.4847F));

		PartDefinition cube_r646 = rightFace.addOrReplaceChild("cube_r646", CubeListBuilder.create().texOffs(30, 91).mirror().addBox(0.5583F, 0.0866F, -0.6484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.309F)).mirror(false), PartPose.offsetAndRotation(-0.0886F, 2.1516F, -2.8668F, 1.5123F, -0.03F, -1.4847F));

		PartDefinition cube_r647 = rightFace.addOrReplaceChild("cube_r647", CubeListBuilder.create().texOffs(50, 40).mirror().addBox(-1.214F, -0.5997F, -0.4673F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-0.0886F, 2.1516F, -2.8668F, 2.005F, -0.8571F, -1.4188F));

		PartDefinition cube_r648 = rightFace.addOrReplaceChild("cube_r648", CubeListBuilder.create().texOffs(65, 48).mirror().addBox(-0.214F, -0.6759F, -0.6484F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-0.0886F, 2.1516F, -2.8668F, 1.4814F, -0.8571F, -1.4188F));

		PartDefinition cube_r649 = rightFace.addOrReplaceChild("cube_r649", CubeListBuilder.create().texOffs(59, 28).mirror().addBox(-3.1073F, -0.8924F, -0.6523F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-0.0886F, 2.1516F, -2.8668F, 1.6703F, -0.9002F, -1.6162F));

		PartDefinition cube_r650 = rightFace.addOrReplaceChild("cube_r650", CubeListBuilder.create().texOffs(38, 45).mirror().addBox(-0.8468F, -0.7667F, -0.6523F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.309F)).mirror(false), PartPose.offsetAndRotation(-0.0886F, 2.1516F, -2.8668F, 1.7261F, -1.16F, -1.6807F));

		PartDefinition cube_r651 = rightFace.addOrReplaceChild("cube_r651", CubeListBuilder.create().texOffs(36, 83).mirror().addBox(-0.5129F, -0.1669F, -0.2326F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(31, 86).mirror().addBox(-0.5129F, -0.1669F, -0.6326F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.1031F, 2.9107F, -2.7446F, -0.8315F, -0.0935F, -0.0073F));

		PartDefinition cube_r652 = rightFace.addOrReplaceChild("cube_r652", CubeListBuilder.create().texOffs(99, 35).mirror().addBox(-0.7F, -0.3F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(33, 99).mirror().addBox(-0.7F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2194F, 6.3196F, -6.6219F, 1.4738F, 1.2478F, 1.5328F));

		PartDefinition cube_r653 = rightFace.addOrReplaceChild("cube_r653", CubeListBuilder.create().texOffs(16, 99).mirror().addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2179F, 6.4086F, -6.2551F, 0.4896F, 0.8368F, 0.3674F));

		PartDefinition cube_r654 = rightFace.addOrReplaceChild("cube_r654", CubeListBuilder.create().texOffs(11, 99).mirror().addBox(-1.0766F, 0.067F, -2.2342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2744F, 5.1127F, -4.7103F, 0.4078F, -0.017F, -0.015F));

		PartDefinition cube_r655 = rightFace.addOrReplaceChild("cube_r655", CubeListBuilder.create().texOffs(97, 98).mirror().addBox(-1.0917F, -0.4337F, -1.9864F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.2744F, 5.1127F, -4.7103F, 0.6997F, 0.0026F, -0.0435F));

		PartDefinition cube_r656 = rightFace.addOrReplaceChild("cube_r656", CubeListBuilder.create().texOffs(98, 91).mirror().addBox(-0.7945F, -0.4337F, -1.7272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2744F, 5.1127F, -4.7103F, 0.7119F, 0.1689F, 0.0983F));

		PartDefinition cube_r657 = rightFace.addOrReplaceChild("cube_r657", CubeListBuilder.create().texOffs(79, 32).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1971F, 5.2518F, -5.4931F, 1.4558F, 0.0394F, 0.0901F));

		PartDefinition cube_r658 = rightFace.addOrReplaceChild("cube_r658", CubeListBuilder.create().texOffs(31, 77).mirror().addBox(-0.7983F, -0.9558F, -1.3722F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2744F, 5.1127F, -4.7103F, 1.1385F, 0.1119F, 0.0383F));

		PartDefinition cube_r659 = rightFace.addOrReplaceChild("cube_r659", CubeListBuilder.create().texOffs(68, 72).mirror().addBox(-0.7983F, -0.4308F, -1.3722F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.2744F, 5.1127F, -4.7103F, 0.6149F, 0.1119F, 0.0383F));

		PartDefinition cube_r660 = rightFace.addOrReplaceChild("cube_r660", CubeListBuilder.create().texOffs(80, 92).mirror().addBox(-0.8679F, -0.9981F, -1.9012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(75, 92).mirror().addBox(-0.8679F, -0.9981F, -1.6761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.2744F, 5.1127F, -4.7103F, 1.0526F, 0.1324F, 0.0409F));

		PartDefinition cube_r661 = rightFace.addOrReplaceChild("cube_r661", CubeListBuilder.create().texOffs(69, 76).mirror().addBox(-0.5006F, -0.4802F, -1.8328F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.139F, 4.2504F, -3.3039F, 0.4646F, -0.2003F, 0.0762F));

		PartDefinition cube_r662 = rightFace.addOrReplaceChild("cube_r662", CubeListBuilder.create().texOffs(90, 84).mirror().addBox(-0.4196F, -0.1727F, -0.4442F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.139F, 4.2504F, -3.3039F, 1.9938F, -0.274F, 0.0363F));

		PartDefinition cube_r663 = rightFace.addOrReplaceChild("cube_r663", CubeListBuilder.create().texOffs(35, 62).mirror().addBox(-0.55F, -0.8F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7951F, -2.1527F, 5.8959F, 1.9731F, -1.5077F, 0.0288F));

		PartDefinition cube_r664 = rightFace.addOrReplaceChild("cube_r664", CubeListBuilder.create().texOffs(101, 104).mirror().addBox(-0.3766F, -0.6603F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(98, 81).mirror().addBox(-0.3766F, -0.9103F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6968F, 3.041F, -1.5026F, -2.9063F, -0.3104F, -0.0431F));

		PartDefinition cube_r665 = rightFace.addOrReplaceChild("cube_r665", CubeListBuilder.create().texOffs(62, 76).mirror().addBox(-0.4383F, -0.2065F, -1.2736F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(55, 76).mirror().addBox(-0.4383F, -0.4065F, -1.2736F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.3154F, -3.817F, 3.1343F, -1.0016F, 0.3466F, -0.2248F));

		PartDefinition cube_r666 = rightFace.addOrReplaceChild("cube_r666", CubeListBuilder.create().texOffs(10, 105).mirror().addBox(-0.4383F, -0.5217F, -0.3627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3154F, -3.817F, 3.1343F, -0.5217F, 0.3466F, -0.2248F));

		PartDefinition cube_r667 = rightFace.addOrReplaceChild("cube_r667", CubeListBuilder.create().texOffs(76, 51).mirror().addBox(-0.4383F, -0.3774F, 0.2063F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3154F, -3.817F, 3.1343F, -0.1726F, 0.3466F, -0.2248F));

		PartDefinition cube_r668 = rightFace.addOrReplaceChild("cube_r668", CubeListBuilder.create().texOffs(24, 76).mirror().addBox(-0.4383F, -0.1586F, -0.0616F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3154F, -3.817F, 3.1343F, -1.6561F, 0.3466F, -0.2248F));

		PartDefinition cube_r669 = rightFace.addOrReplaceChild("cube_r669", CubeListBuilder.create().texOffs(105, 9).mirror().addBox(-0.4383F, 0.402F, -1.0776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.3154F, -3.817F, 3.1343F, -1.8307F, 0.3466F, -0.2248F));

		PartDefinition cube_r670 = rightFace.addOrReplaceChild("cube_r670", CubeListBuilder.create().texOffs(105, 3).mirror().addBox(-0.7366F, -0.3908F, 0.2045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.3154F, -3.817F, 3.1343F, -0.0934F, 0.347F, 0.0072F));

		PartDefinition cube_r671 = rightFace.addOrReplaceChild("cube_r671", CubeListBuilder.create().texOffs(76, 12).mirror().addBox(-0.7366F, -0.158F, -0.0751F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3154F, -3.817F, 3.1343F, -1.5769F, 0.347F, 0.0072F));

		PartDefinition cube_r672 = rightFace.addOrReplaceChild("cube_r672", CubeListBuilder.create().texOffs(105, 0).mirror().addBox(-0.7366F, -0.5337F, -0.3689F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3154F, -3.817F, 3.1343F, -0.4425F, 0.347F, 0.0072F));

		PartDefinition cube_r673 = rightFace.addOrReplaceChild("cube_r673", CubeListBuilder.create().texOffs(5, 105).mirror().addBox(-0.7366F, 0.4049F, -1.0907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3154F, -3.817F, 3.1343F, -1.7515F, 0.347F, 0.0072F));

		PartDefinition cube_r674 = rightFace.addOrReplaceChild("cube_r674", CubeListBuilder.create().texOffs(76, 4).mirror().addBox(-0.7366F, -0.4143F, -1.2846F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(0, 76).mirror().addBox(-0.7366F, -0.2143F, -1.2846F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.3154F, -3.817F, 3.1343F, -0.9224F, 0.347F, 0.0072F));

		PartDefinition cube_r675 = rightFace.addOrReplaceChild("cube_r675", CubeListBuilder.create().texOffs(75, 72).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0572F, -3.9044F, 4.2436F, -1.115F, -0.7926F, -0.3365F));

		PartDefinition cube_r676 = rightFace.addOrReplaceChild("cube_r676", CubeListBuilder.create().texOffs(71, 104).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5135F, 0.8561F, -1.1666F, 1.4691F, -0.7363F, 1.6977F));

		PartDefinition cube_r677 = rightFace.addOrReplaceChild("cube_r677", CubeListBuilder.create().texOffs(104, 70).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0655F, 0.2487F, -1.7105F, 2.2065F, -0.4125F, 0.4738F));

		PartDefinition cube_r678 = rightFace.addOrReplaceChild("cube_r678", CubeListBuilder.create().texOffs(79, 16).mirror().addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0483F, -0.2512F, -0.8446F, -2.8981F, -0.187F, 0.5845F));

		PartDefinition cube_r679 = rightFace.addOrReplaceChild("cube_r679", CubeListBuilder.create().texOffs(104, 87).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5277F, 0.4616F, -0.4445F, 1.4769F, -0.5162F, 1.7249F));

		PartDefinition cube_r680 = rightFace.addOrReplaceChild("cube_r680", CubeListBuilder.create().texOffs(104, 67).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0483F, -0.2512F, -0.8446F, 2.0037F, -0.3049F, 0.5417F));

		PartDefinition cube_r681 = rightFace.addOrReplaceChild("cube_r681", CubeListBuilder.create().texOffs(96, 104).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(98, 78).mirror().addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3863F, 3.0204F, -0.3349F, 1.9862F, -0.2381F, -0.0725F));

		PartDefinition cube_r682 = rightFace.addOrReplaceChild("cube_r682", CubeListBuilder.create().texOffs(44, 89).mirror().addBox(-0.0129F, -1.5074F, -0.9726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4579F, 2.615F, 0.5224F, 0.4485F, -0.094F, -0.0091F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8491F, -1.4039F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r683 = jaw.addOrReplaceChild("cube_r683", CubeListBuilder.create().texOffs(89, 72).mirror().addBox(-0.5F, -1.2F, -0.725F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2804F, 0.775F, 0.2091F, -0.3589F, -0.0362F, -0.1057F));

		PartDefinition cube_r684 = jaw.addOrReplaceChild("cube_r684", CubeListBuilder.create().texOffs(96, 101).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8353F, 4.0071F, 0.0413F, -1.9548F, -0.0873F, -0.0698F));

		PartDefinition cube_r685 = jaw.addOrReplaceChild("cube_r685", CubeListBuilder.create().texOffs(50, 28).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7381F, 4.9297F, -0.3319F, -1.1694F, -0.0873F, -0.0698F));

		PartDefinition cube_r686 = jaw.addOrReplaceChild("cube_r686", CubeListBuilder.create().texOffs(62, 52).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6308F, 5.3139F, -1.2489F, 0.096F, -0.0873F, -0.0698F));

		PartDefinition cube_r687 = jaw.addOrReplaceChild("cube_r687", CubeListBuilder.create().texOffs(73, 8).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5986F, 4.4099F, -2.336F, 0.2094F, -0.0873F, -0.0698F));

		PartDefinition cube_r688 = jaw.addOrReplaceChild("cube_r688", CubeListBuilder.create().texOffs(14, 73).mirror().addBox(-0.1025F, -4.0373F, -0.0244F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7494F, 5.7899F, -4.0777F, 1.6705F, -0.1395F, -0.0702F));

		PartDefinition cube_r689 = jaw.addOrReplaceChild("cube_r689", CubeListBuilder.create().texOffs(30, 63).mirror().addBox(-0.1025F, -4.2521F, 0.7736F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(19, 75).mirror().addBox(-0.1025F, -4.4021F, 1.2736F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7494F, 5.7899F, -4.0777F, 1.7577F, -0.1395F, -0.0702F));

		PartDefinition cube_r690 = jaw.addOrReplaceChild("cube_r690", CubeListBuilder.create().texOffs(89, 88).mirror().addBox(-0.5F, -0.075F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3556F, 4.2081F, -5.2686F, 1.9722F, -0.0873F, -0.0698F));

		PartDefinition cube_r691 = jaw.addOrReplaceChild("cube_r691", CubeListBuilder.create().texOffs(5, 87).mirror().addBox(-0.8509F, -2.2551F, -0.3784F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5994F, 5.7899F, -7.5777F, 1.7216F, -0.1221F, -0.0701F));

		PartDefinition cube_r692 = jaw.addOrReplaceChild("cube_r692", CubeListBuilder.create().texOffs(62, 86).mirror().addBox(-0.8509F, -3.1015F, -0.1926F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.5994F, 5.7899F, -7.5777F, 1.8089F, -0.1221F, -0.0701F));

		PartDefinition cube_r693 = jaw.addOrReplaceChild("cube_r693", CubeListBuilder.create().texOffs(101, 101).mirror().addBox(-0.8509F, -3.1193F, 1.4081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5994F, 5.7899F, -7.5777F, 2.3761F, -0.1221F, -0.0701F));

		PartDefinition cube_r694 = jaw.addOrReplaceChild("cube_r694", CubeListBuilder.create().texOffs(5, 102).mirror().addBox(-0.8509F, -2.3123F, 2.4738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(-0.5994F, 5.7899F, -7.5777F, 2.7688F, -0.1221F, -0.0701F));

		PartDefinition cube_r695 = jaw.addOrReplaceChild("cube_r695", CubeListBuilder.create().texOffs(102, 6).mirror().addBox(-0.8509F, -1.7078F, 3.5605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5994F, 5.7899F, -7.5777F, 2.9433F, -0.1221F, -0.0701F));

		PartDefinition cube_r696 = jaw.addOrReplaceChild("cube_r696", CubeListBuilder.create().texOffs(106, 21).mirror().addBox(0.0535F, 0.075F, -0.3143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(106, 36).mirror().addBox(0.0535F, -0.325F, -0.3143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.7284F, 5.8352F, -11.8163F, -1.9894F, 0.4287F, 0.3657F));

		PartDefinition cube_r697 = jaw.addOrReplaceChild("cube_r697", CubeListBuilder.create().texOffs(105, 51).mirror().addBox(-0.001F, -0.1423F, -0.6166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(10, 102).mirror().addBox(-0.001F, 0.2577F, -0.6166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7444F, 6.3801F, -12.1019F, -2.1068F, -0.0777F, 0.0224F));

		PartDefinition cube_r698 = jaw.addOrReplaceChild("cube_r698", CubeListBuilder.create().texOffs(106, 24).mirror().addBox(-0.455F, 0.1376F, -0.3143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.7284F, 5.8352F, -11.8163F, -1.9533F, -0.1365F, 0.6032F));

		PartDefinition cube_r699 = jaw.addOrReplaceChild("cube_r699", CubeListBuilder.create().texOffs(25, 106).mirror().addBox(-0.7349F, -0.1374F, -0.3143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7284F, 5.8352F, -11.8163F, -2.2206F, -0.9134F, 1.0901F));

		PartDefinition cube_r700 = jaw.addOrReplaceChild("cube_r700", CubeListBuilder.create().texOffs(14, 67).mirror().addBox(-0.8509F, -4.004F, -0.0214F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.5994F, 5.7899F, -7.5777F, 1.8001F, -0.1221F, -0.0701F));

		PartDefinition cube_r701 = jaw.addOrReplaceChild("cube_r701", CubeListBuilder.create().texOffs(0, 106).mirror().addBox(-0.8509F, -1.0753F, 0.3933F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5994F, 5.7899F, -7.5777F, 2.1492F, -0.1221F, -0.0701F));

		PartDefinition cube_r702 = jaw.addOrReplaceChild("cube_r702", CubeListBuilder.create().texOffs(74, 0).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8353F, 4.0071F, 0.0413F, 3.0194F, -0.0873F, -0.0698F));

		PartDefinition cube_r703 = jaw.addOrReplaceChild("cube_r703", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 102).mirror().addBox(-0.5F, -1.0F, 1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.9151F, 3.0177F, 0.1627F, 1.6232F, -0.0873F, -0.0698F));

		PartDefinition cube_r704 = jaw.addOrReplaceChild("cube_r704", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(-0.5F, -1.975F, -1.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7665F, 2.8017F, -1.4732F, -0.3665F, -0.0873F, -0.0698F));

		PartDefinition cube_r705 = jaw.addOrReplaceChild("cube_r705", CubeListBuilder.create().texOffs(85, 53).mirror().addBox(-0.5F, -1.0F, -0.95F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.6383F, 3.5634F, -2.3274F, -0.8029F, -0.0873F, -0.0698F));

		PartDefinition cube_r706 = jaw.addOrReplaceChild("cube_r706", CubeListBuilder.create().texOffs(90, 2).mirror().addBox(-0.5F, -1.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.8991F, 0.5944F, -1.7214F, -0.192F, -0.0873F, -0.0698F));

		PartDefinition cube_r707 = jaw.addOrReplaceChild("cube_r707", CubeListBuilder.create().texOffs(92, 6).mirror().addBox(-0.675F, -0.55F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8912F, 5.5128F, -10.0787F, -0.0382F, -0.2611F, 1.2643F));

		PartDefinition cube_r708 = jaw.addOrReplaceChild("cube_r708", CubeListBuilder.create().texOffs(90, 2).addBox(-0.5F, -1.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.8991F, 0.5944F, -1.7214F, -0.192F, 0.0873F, 0.0698F));

		PartDefinition cube_r709 = jaw.addOrReplaceChild("cube_r709", CubeListBuilder.create().texOffs(85, 53).addBox(-0.5F, -1.0F, -0.95F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.6383F, 3.5634F, -2.3274F, -0.8029F, 0.0873F, 0.0698F));

		PartDefinition cube_r710 = jaw.addOrReplaceChild("cube_r710", CubeListBuilder.create().texOffs(0, 90).addBox(-0.5F, -1.975F, -1.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7665F, 2.8017F, -1.4732F, -0.3665F, 0.0873F, 0.0698F));

		PartDefinition cube_r711 = jaw.addOrReplaceChild("cube_r711", CubeListBuilder.create().texOffs(15, 102).addBox(-0.5F, -1.0F, 1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(0, 63).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9151F, 3.0177F, 0.1627F, 1.6232F, 0.0873F, 0.0698F));

		PartDefinition cube_r712 = jaw.addOrReplaceChild("cube_r712", CubeListBuilder.create().texOffs(74, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.8353F, 4.0071F, 0.0413F, 3.0194F, 0.0873F, 0.0698F));

		PartDefinition cube_r713 = jaw.addOrReplaceChild("cube_r713", CubeListBuilder.create().texOffs(0, 106).addBox(-0.1491F, -1.0753F, 0.3933F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5994F, 5.7899F, -7.5777F, 2.1492F, 0.1221F, 0.0701F));

		PartDefinition cube_r714 = jaw.addOrReplaceChild("cube_r714", CubeListBuilder.create().texOffs(92, 6).addBox(-0.325F, -0.55F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8912F, 5.5128F, -10.0787F, -0.0382F, 0.2611F, -1.2643F));

		PartDefinition cube_r715 = jaw.addOrReplaceChild("cube_r715", CubeListBuilder.create().texOffs(14, 67).addBox(-0.1491F, -4.004F, -0.0214F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.5994F, 5.7899F, -7.5777F, 1.8001F, 0.1221F, 0.0701F));

		PartDefinition cube_r716 = jaw.addOrReplaceChild("cube_r716", CubeListBuilder.create().texOffs(25, 106).addBox(-0.2651F, -0.1374F, -0.3143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7284F, 5.8352F, -11.8163F, -2.2206F, 0.9134F, -1.0901F));

		PartDefinition cube_r717 = jaw.addOrReplaceChild("cube_r717", CubeListBuilder.create().texOffs(106, 24).addBox(-0.545F, 0.1376F, -0.3143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.7284F, 5.8352F, -11.8163F, -1.9533F, 0.1365F, -0.6032F));

		PartDefinition cube_r718 = jaw.addOrReplaceChild("cube_r718", CubeListBuilder.create().texOffs(10, 102).addBox(-0.999F, 0.2577F, -0.6166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(105, 51).addBox(-0.999F, -0.1423F, -0.6166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7444F, 6.3801F, -12.1019F, -2.1068F, 0.0777F, -0.0224F));

		PartDefinition cube_r719 = jaw.addOrReplaceChild("cube_r719", CubeListBuilder.create().texOffs(106, 36).addBox(-1.0535F, -0.325F, -0.3143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(106, 21).addBox(-1.0535F, 0.075F, -0.3143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.7284F, 5.8352F, -11.8163F, -1.9894F, -0.4287F, -0.3657F));

		PartDefinition cube_r720 = jaw.addOrReplaceChild("cube_r720", CubeListBuilder.create().texOffs(102, 6).addBox(-0.1491F, -1.7078F, 3.5605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5994F, 5.7899F, -7.5777F, 2.9433F, 0.1221F, 0.0701F));

		PartDefinition cube_r721 = jaw.addOrReplaceChild("cube_r721", CubeListBuilder.create().texOffs(5, 102).addBox(-0.1491F, -2.3123F, 2.4738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(0.5994F, 5.7899F, -7.5777F, 2.7688F, 0.1221F, 0.0701F));

		PartDefinition cube_r722 = jaw.addOrReplaceChild("cube_r722", CubeListBuilder.create().texOffs(101, 101).addBox(-0.1491F, -3.1193F, 1.4081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5994F, 5.7899F, -7.5777F, 2.3761F, 0.1221F, 0.0701F));

		PartDefinition cube_r723 = jaw.addOrReplaceChild("cube_r723", CubeListBuilder.create().texOffs(62, 86).addBox(-0.1491F, -3.1015F, -0.1926F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.5994F, 5.7899F, -7.5777F, 1.8089F, 0.1221F, 0.0701F));

		PartDefinition cube_r724 = jaw.addOrReplaceChild("cube_r724", CubeListBuilder.create().texOffs(5, 87).addBox(-0.1491F, -2.2551F, -0.3784F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5994F, 5.7899F, -7.5777F, 1.7216F, 0.1221F, 0.0701F));

		PartDefinition cube_r725 = jaw.addOrReplaceChild("cube_r725", CubeListBuilder.create().texOffs(19, 75).addBox(-0.8975F, -4.4021F, 1.2736F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(30, 63).addBox(-0.8975F, -4.2521F, 0.7736F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.7494F, 5.7899F, -4.0777F, 1.7577F, 0.1395F, 0.0702F));

		PartDefinition cube_r726 = jaw.addOrReplaceChild("cube_r726", CubeListBuilder.create().texOffs(89, 88).addBox(-0.5F, -0.075F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3556F, 4.2081F, -5.2686F, 1.9722F, 0.0873F, 0.0698F));

		PartDefinition cube_r727 = jaw.addOrReplaceChild("cube_r727", CubeListBuilder.create().texOffs(14, 73).addBox(-0.8975F, -4.0373F, -0.0244F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7494F, 5.7899F, -4.0777F, 1.6705F, 0.1395F, 0.0702F));

		PartDefinition cube_r728 = jaw.addOrReplaceChild("cube_r728", CubeListBuilder.create().texOffs(73, 8).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5986F, 4.4099F, -2.336F, 0.2094F, 0.0873F, 0.0698F));

		PartDefinition cube_r729 = jaw.addOrReplaceChild("cube_r729", CubeListBuilder.create().texOffs(62, 52).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6308F, 5.3139F, -1.2489F, 0.096F, 0.0873F, 0.0698F));

		PartDefinition cube_r730 = jaw.addOrReplaceChild("cube_r730", CubeListBuilder.create().texOffs(50, 28).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.7381F, 4.9297F, -0.3319F, -1.1694F, 0.0873F, 0.0698F));

		PartDefinition cube_r731 = jaw.addOrReplaceChild("cube_r731", CubeListBuilder.create().texOffs(96, 101).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8353F, 4.0071F, 0.0413F, -1.9548F, 0.0873F, 0.0698F));

		PartDefinition cube_r732 = jaw.addOrReplaceChild("cube_r732", CubeListBuilder.create().texOffs(89, 72).addBox(-0.5F, -1.2F, -0.725F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2804F, 0.775F, 0.2091F, -0.3589F, 0.0362F, 0.1057F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(78, 55).addBox(-0.5F, -0.1497F, -0.0853F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2305F, 2.7086F, -0.252F, -0.0941F, 0.1593F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(76, 76).addBox(-0.5F, -0.1402F, -0.0232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, -0.0186F, 1.919F, -0.2745F, -0.1681F, 0.0471F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(7, 77).addBox(-0.5F, -0.9402F, -0.0232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.781F, 1.8269F, -0.248F, -0.1693F, 0.0426F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(77, 21).addBox(-0.5F, -0.0402F, -0.0232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 2.0F, -0.3981F, -0.1611F, 0.0674F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(54, 105).addBox(-0.5F, -0.0402F, -0.0232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.3155F, -0.2494F, 0.0804F));

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