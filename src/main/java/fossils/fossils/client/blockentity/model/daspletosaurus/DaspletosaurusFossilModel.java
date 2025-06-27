package fossils.fossils.client.blockentity.model.daspletosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DaspletosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone3;
	private final ModelPart bone5;
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
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public DaspletosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone3 = this.hips.getChild("bone3");
		this.bone5 = this.hips.getChild("bone5");
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
		this.body2 = this.body.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck = this.neck3.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -38.7306F, -0.1063F, -0.0524F, -0.0873F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 40).addBox(0.0F, -1.3F, -4.7F, 0.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.3724F, 1.8478F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(46, 77).mirror().addBox(-2.0F, -1.4822F, 1.8974F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 77).addBox(1.0F, -1.4822F, 1.8974F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(39, 0).addBox(-1.0F, -1.9822F, 0.3974F, 2.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.4F, -5.8867F, 5.1549F));

		PartDefinition cube_r3 = bone3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(124, 124).addBox(-0.324F, 2.6007F, 0.2098F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2581F, 10.9371F, 2.0361F, 0.8796F, 0.1543F, 0.2083F));

		PartDefinition cube_r4 = bone3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(134, 111).addBox(-1.4143F, 2.3604F, -0.9428F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.4419F, 8.4371F, -0.6639F, 0.8454F, -0.222F, 0.2663F));

		PartDefinition cube_r5 = bone3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(114, 134).addBox(-1.4143F, 1.4037F, -2.2473F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.4419F, 8.4371F, -0.6639F, 1.1944F, -0.222F, 0.2663F));

		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(131, 34).addBox(-0.1098F, -0.1613F, -0.5988F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2581F, 10.9371F, 2.0361F, 1.193F, 0.0946F, 0.2724F));

		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(120, 25).addBox(-1.191F, 0.5605F, -0.9961F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.4419F, 8.4371F, -0.6639F, 0.5685F, -0.4288F, 0.1231F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(125, 107).addBox(-1.191F, -0.6619F, -2.9839F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.4419F, 8.4371F, -0.6639F, 1.6593F, -0.4288F, 0.1231F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(94, 45).addBox(-3.5669F, -0.3024F, -0.5318F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7925F, 20.0608F, -12.5753F, 0.4079F, 0.0041F, 0.0197F));

		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(106, 6).addBox(-3.5429F, -0.733F, -4.073F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.7925F, 20.0608F, -8.4753F, 0.1112F, 0.0058F, 0.0193F));

		PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(105, 68).addBox(-3.1536F, -16.917F, -3.528F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7925F, 1.4608F, -5.9753F, 3.0259F, 0.0094F, 0.0178F));

		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(95, 85).addBox(-3.4312F, -0.3424F, -4.8533F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.7925F, 17.9608F, -4.2753F, 0.1985F, 0.0094F, 0.0178F));

		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(94, 52).addBox(-3.1536F, 15.7158F, -9.0002F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.7925F, 1.4608F, -5.9753F, 0.3556F, 0.0094F, 0.0178F));

		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(55, 117).addBox(-2.5698F, 8.5433F, 0.8927F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.7925F, 5.8608F, -5.9753F, -0.3784F, 0.0221F, 0.0675F));

		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(78, 117).addBox(-2.5698F, 8.9127F, -1.2959F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.7925F, 5.8608F, -5.9753F, -0.134F, 0.0221F, 0.0675F));

		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(120, 30).addBox(-3.1536F, 2.2167F, -13.6617F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.7925F, 5.8608F, -5.9753F, 1.0711F, 0.0094F, 0.0178F));

		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(113, 74).addBox(-1.6839F, -0.1377F, -0.7858F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(2.7925F, 9.4608F, -5.9753F, 0.0407F, 0.0573F, 0.2323F));

		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(79, 107).addBox(-1.5839F, -0.1377F, -0.4858F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.7925F, 9.4608F, -5.9753F, -0.3564F, 0.0652F, 0.25F));

		PartDefinition cube_r19 = bone3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(71, 113).addBox(-0.7685F, -0.4867F, -2.7586F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2925F, 6.5608F, -5.2753F, 0.3712F, -0.0852F, 0.2229F));

		PartDefinition cube_r20 = bone3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 81).addBox(1.6639F, -4.5105F, -7.6265F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 9.6F, 2.2F, 0.1658F, -0.0349F, 0.0F));

		PartDefinition cube_r21 = bone3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(92, 125).addBox(-1.1807F, -0.1351F, -1.357F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4419F, 8.4371F, -0.6639F, 0.9792F, -0.4335F, 0.1811F));

		PartDefinition cube_r22 = bone3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(91, 75).addBox(-0.5827F, 0.6931F, -3.5175F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.6F, -0.222F, -0.0321F, -0.4016F));

		PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(69, 120).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.7952F, 2.3811F, 4.9903F, 0.6347F, 0.0291F, -0.4282F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(111, 32).addBox(0.475F, -1.3F, -1.8F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1094F, 3.086F, 0.6268F, 0.4258F, 0.0325F, -0.4167F));

		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(13, 89).addBox(-0.5F, -1.2F, -3.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.703F, 2.0261F, 3.1372F, -0.0498F, -0.0391F, -0.4053F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(70, 37).addBox(-0.5F, -2.5F, -3.5F, 1.0F, 5.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.7287F, 5.0123F, -4.1936F, -0.1484F, -0.0047F, -0.0928F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(124, 35).addBox(-0.5F, -1.5004F, -1.3269F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.3992F, 2.8359F, -10.1042F, 1.1932F, -0.2676F, -0.5107F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(57, 104).addBox(-0.5F, -0.6211F, -1.5378F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.3992F, 2.8359F, -10.1042F, 0.8877F, -0.2676F, -0.5107F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(122, 56).addBox(-2.2903F, 0.2704F, 1.9769F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0557F, -0.628F, -8.1309F, -0.7693F, -0.3037F, -0.4681F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(95, 0).addBox(-2.2903F, -0.4296F, -3.1231F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0557F, -0.628F, -8.1309F, 0.4525F, -0.3037F, -0.4681F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(78, 78).addBox(-0.58F, 0.205F, 0.0796F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -8.0F, -0.0562F, -0.0321F, -0.4016F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-0.4F, -5.8867F, 5.1549F));

		PartDefinition cube_r32 = bone5.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(124, 124).mirror().addBox(-0.676F, 2.6007F, 0.2098F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2581F, 10.9371F, 2.0361F, 0.8796F, -0.1543F, -0.2083F));

		PartDefinition cube_r33 = bone5.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(134, 111).mirror().addBox(0.4143F, 2.3604F, -0.9428F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.4419F, 8.4371F, -0.6639F, 0.8454F, 0.222F, -0.2663F));

		PartDefinition cube_r34 = bone5.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(114, 134).mirror().addBox(0.4143F, 1.4037F, -2.2473F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4419F, 8.4371F, -0.6639F, 1.1944F, 0.222F, -0.2663F));

		PartDefinition cube_r35 = bone5.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(131, 34).mirror().addBox(-0.8902F, -0.1613F, -0.5988F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2581F, 10.9371F, 2.0361F, 1.193F, -0.0946F, -0.2724F));

		PartDefinition cube_r36 = bone5.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(120, 25).mirror().addBox(0.191F, 0.5605F, -0.9961F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4419F, 8.4371F, -0.6639F, 0.5685F, 0.4288F, -0.1231F));

		PartDefinition cube_r37 = bone5.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(125, 107).mirror().addBox(0.191F, -0.6619F, -2.9839F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4419F, 8.4371F, -0.6639F, 1.6593F, 0.4288F, -0.1231F));

		PartDefinition cube_r38 = bone5.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(94, 45).mirror().addBox(2.5669F, -0.3024F, -0.5318F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7925F, 20.0608F, -12.5753F, 0.4079F, -0.0041F, -0.0197F));

		PartDefinition cube_r39 = bone5.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(106, 6).mirror().addBox(2.5429F, -0.733F, -4.073F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.7925F, 20.0608F, -8.4753F, 0.1112F, -0.0058F, -0.0193F));

		PartDefinition cube_r40 = bone5.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(105, 68).mirror().addBox(2.1536F, -16.917F, -3.528F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7925F, 1.4608F, -5.9753F, 3.0259F, -0.0094F, -0.0178F));

		PartDefinition cube_r41 = bone5.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(95, 85).mirror().addBox(2.4312F, -0.3424F, -4.8533F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.7925F, 17.9608F, -4.2753F, 0.1985F, -0.0094F, -0.0178F));

		PartDefinition cube_r42 = bone5.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(94, 52).mirror().addBox(2.1536F, 15.7158F, -9.0002F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.7925F, 1.4608F, -5.9753F, 0.3556F, -0.0094F, -0.0178F));

		PartDefinition cube_r43 = bone5.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(55, 117).mirror().addBox(1.5698F, 8.5433F, 0.8927F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7925F, 5.8608F, -5.9753F, -0.3784F, -0.0221F, -0.0675F));

		PartDefinition cube_r44 = bone5.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(78, 117).mirror().addBox(1.5698F, 8.9127F, -1.2959F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.7925F, 5.8608F, -5.9753F, -0.134F, -0.0221F, -0.0675F));

		PartDefinition cube_r45 = bone5.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(120, 30).mirror().addBox(2.1536F, 2.2167F, -13.6617F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.7925F, 5.8608F, -5.9753F, 1.0711F, -0.0094F, -0.0178F));

		PartDefinition cube_r46 = bone5.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(113, 74).mirror().addBox(0.6839F, -0.1377F, -0.7858F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-2.7925F, 9.4608F, -5.9753F, 0.0407F, -0.0573F, -0.2323F));

		PartDefinition cube_r47 = bone5.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(79, 107).mirror().addBox(0.5839F, -0.1377F, -0.4858F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.7925F, 9.4608F, -5.9753F, -0.3564F, -0.0652F, -0.25F));

		PartDefinition cube_r48 = bone5.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(71, 113).mirror().addBox(-0.2315F, -0.4867F, -2.7586F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2925F, 6.5608F, -5.2753F, 0.3712F, 0.0852F, -0.2229F));

		PartDefinition cube_r49 = bone5.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-2.6639F, -4.5105F, -7.6265F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.5F, 9.6F, 2.2F, 0.1658F, 0.0349F, 0.0F));

		PartDefinition cube_r50 = bone5.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(92, 125).mirror().addBox(0.1807F, -0.1351F, -1.357F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4419F, 8.4371F, -0.6639F, 0.9792F, 0.4335F, -0.1811F));

		PartDefinition cube_r51 = bone5.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(91, 75).mirror().addBox(-0.4173F, 0.6931F, -3.5175F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.6F, -0.222F, 0.0321F, 0.4016F));

		PartDefinition cube_r52 = bone5.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(69, 120).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7952F, 2.3811F, 4.9903F, 0.6347F, -0.0291F, 0.4282F));

		PartDefinition cube_r53 = bone5.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(111, 32).mirror().addBox(-1.475F, -1.3F, -1.8F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1094F, 3.086F, 0.6268F, 0.4258F, -0.0325F, 0.4167F));

		PartDefinition cube_r54 = bone5.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(13, 89).mirror().addBox(-0.5F, -1.2F, -3.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.703F, 2.0261F, 3.1372F, -0.0498F, 0.0391F, 0.4053F));

		PartDefinition cube_r55 = bone5.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(70, 37).mirror().addBox(-0.5F, -2.5F, -3.5F, 1.0F, 5.0F, 7.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7287F, 5.0123F, -4.1936F, -0.1484F, 0.0047F, 0.0928F));

		PartDefinition cube_r56 = bone5.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(124, 35).mirror().addBox(-0.5F, -1.5004F, -1.3269F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3992F, 2.8359F, -10.1042F, 1.1932F, 0.2676F, 0.5107F));

		PartDefinition cube_r57 = bone5.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(57, 104).mirror().addBox(-0.5F, -0.6211F, -1.5378F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3992F, 2.8359F, -10.1042F, 0.8877F, 0.2676F, 0.5107F));

		PartDefinition cube_r58 = bone5.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(122, 56).mirror().addBox(1.2903F, 0.2704F, 1.9769F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0557F, -0.628F, -8.1309F, -0.7693F, 0.3037F, 0.4681F));

		PartDefinition cube_r59 = bone5.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(95, 0).mirror().addBox(1.2903F, -0.4296F, -3.1231F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0557F, -0.628F, -8.1309F, 0.4525F, 0.3037F, 0.4681F));

		PartDefinition cube_r60 = bone5.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(78, 78).mirror().addBox(-0.42F, 0.205F, 0.0796F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7F, -8.0F, -0.0562F, 0.0321F, 0.4016F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(58, 88).addBox(-2.0F, -1.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7F, -0.0489F, 1.18F, 0.0602F, 0.003F, -0.0187F));

		PartDefinition cube_r61 = leftLeg1.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(37, 96).addBox(-2.5F, -3.8F, -2.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 13.9323F, 2.6981F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg1.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(111, 18).addBox(-5.5F, 0.0009F, -0.2005F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(4.0F, 8.9831F, -1.407F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg1.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(86, 116).addBox(-5.5F, 0.1293F, 0.0942F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.0F, 5.8856F, -1.5392F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg1.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(115, 113).addBox(-5.5F, -0.0247F, -2.1619F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 4.0F, 1.6F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg1.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(7, 124).addBox(-1.5F, -1.5F, -0.7F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 4.9182F, -0.6382F, -0.0785F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 14.6021F, 0.9481F, 0.9069F, 0.0044F, -0.0145F));

		PartDefinition cube_r66 = leftLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(20, 112).addBox(-0.5F, -2.4F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.8F, 3.5297F, -0.7222F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(105, 119).addBox(-2.5F, 0.4073F, -1.8549F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2F, 2.5472F, 2.7883F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(63, 97).addBox(-2.5F, -2.707F, -1.7331F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 2.5472F, -0.5117F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(117, 0).addBox(-0.5F, -5.3F, -1.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.8F, 17.7687F, -1.7911F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftLeg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(125, 65).addBox(-2.5F, 0.0749F, -1.9599F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.2F, 11.5472F, 0.7883F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftLeg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(124, 78).addBox(-2.5F, 0.0749F, -1.2599F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.2F, 11.5472F, 0.7883F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftLeg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(98, 101).addBox(-2.5F, -6.0F, 0.2F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(104, 18).addBox(-2.5F, -6.0F, -0.5F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.2F, 7.6471F, -0.5117F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftLeg2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(118, 51).addBox(-2.5F, 0.0275F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8F, 0.6471F, 0.6883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftLeg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(14, 126).addBox(-2.5F, -0.2365F, 0.0073F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8F, 9.4039F, -1.2457F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftLeg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(45, 117).addBox(-2.5F, 1.9276F, -0.457F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.8F, 0.6471F, 0.6883F, -0.1658F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(25, 40).addBox(-2.5F, 0.0553F, -0.4239F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 14.2483F, -1.7474F, -0.7419F, -0.0018F, -0.0033F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(73, 50).addBox(-4.0F, -1.0746F, -3.9368F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 8.5561F, 1.3765F, 0.7831F, 0.0225F, -0.0391F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(46, 68).addBox(-4.0F, -1.0F, -5.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0746F, -3.9311F, -0.9083F, 0.034F, 0.0692F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(71, 88).addBox(-1.0F, -1.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7F, -0.0489F, 1.18F, -0.8414F, 0.1913F, 0.0673F));

		PartDefinition cube_r76 = rightLeg1.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(50, 97).addBox(-0.5F, -3.8F, -2.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 13.9323F, 2.6981F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg1.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(111, 25).addBox(3.5F, 0.0009F, -0.2005F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-4.0F, 8.9831F, -1.407F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg1.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(116, 100).addBox(3.5F, 0.1293F, 0.0942F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.0F, 5.8856F, -1.5392F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg1.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(116, 65).addBox(3.5F, -0.0247F, -2.1619F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 4.0F, 1.6F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg1.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(26, 124).addBox(-0.5F, -1.5F, -0.7F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 4.9182F, -0.6382F, -0.0785F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 14.6021F, 0.9481F, 2.079F, 0.0843F, -0.0694F));

		PartDefinition cube_r81 = rightLeg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 113).addBox(-1.5F, -2.4F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8F, 3.5297F, -0.7222F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(112, 119).addBox(0.5F, 0.4073F, -1.8549F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.2F, 2.5472F, 2.7883F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(13, 98).addBox(0.5F, -2.707F, -1.7331F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 2.5472F, -0.5117F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(117, 5).addBox(-1.5F, -5.3F, -1.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8F, 17.7687F, -1.7911F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(69, 125).addBox(0.5F, 0.0749F, -1.9599F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.2F, 11.5472F, 0.7883F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(125, 51).addBox(0.5F, 0.0749F, -1.2599F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.2F, 11.5472F, 0.7883F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(37, 103).addBox(0.5F, -6.0F, 0.2F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(104, 30).addBox(0.5F, -6.0F, -0.5F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.2F, 7.6471F, -0.5117F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(62, 119).addBox(1.5F, 0.0275F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8F, 0.6471F, 0.6883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(83, 127).addBox(1.5F, -0.2365F, 0.0073F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8F, 9.4039F, -1.2457F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(50, 117).addBox(1.5F, 1.9276F, -0.457F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-3.8F, 0.6471F, 0.6883F, -0.1658F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(84, 88).addBox(-0.5F, 0.0553F, -0.4239F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 14.2483F, -1.7474F, -1.7407F, 0.0678F, 0.0434F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(73, 57).addBox(-2.0F, -1.0746F, -3.9368F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 8.5561F, 1.3765F, 0.8699F, 0.0281F, -0.0443F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(70, 0).addBox(-2.0F, -1.0F, -5.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0746F, -3.9311F, 0.4818F, 0.0098F, -0.0403F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, 8.6F, -0.1572F, 0.0003F, -0.0038F));

		PartDefinition cube_r91 = tail1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(19, 131).addBox(0.5F, 8.3871F, 8.4246F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 131).addBox(0.5F, 6.8871F, 6.4246F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(126, 130).addBox(0.5F, 5.4871F, 4.4246F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 105).addBox(0.5F, 3.7871F, 2.4246F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 71).addBox(0.5F, 1.9871F, 0.4246F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 92).addBox(0.5F, -0.2129F, -1.5754F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.1562F, 2.0709F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r92 = tail1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(7, 129).addBox(0.5F, -2.4823F, 11.7838F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(34, 129).addBox(0.5F, -2.5823F, 8.7838F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(119, 124).addBox(0.5F, -2.6823F, 5.7838F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9438F, 1.0709F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r93 = tail1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(124, 87).addBox(0.5F, -3.0136F, 0.0674F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2438F, 3.7709F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r94 = tail1.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(39, 122).addBox(0.5F, -3.4823F, -0.2162F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9438F, 1.0709F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r95 = tail1.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(134, 123).mirror().addBox(-3.2593F, -0.1587F, 5.912F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(132, 109).mirror().addBox(-2.6953F, 0.0F, 3.0567F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(134, 127).mirror().addBox(-2.0F, 0.0F, 0.2F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2505F, 7.3501F, 0.1608F, 0.2154F, 0.0347F));

		PartDefinition cube_r96 = tail1.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(134, 97).mirror().addBox(-1.3167F, -1.3609F, -2.9818F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(134, 81).mirror().addBox(-1.9F, -1.5257F, -0.3508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 2.1562F, 5.0709F, 0.1608F, 0.2154F, 0.0347F));

		PartDefinition cube_r97 = tail1.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(134, 123).addBox(1.2593F, -0.1587F, 5.912F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 109).addBox(0.6953F, 0.0F, 3.0567F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 127).addBox(0.0F, 0.0F, 0.2F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2505F, 7.3501F, 0.1608F, -0.2154F, -0.0347F));

		PartDefinition cube_r98 = tail1.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(134, 97).addBox(-0.6833F, -1.3609F, -2.9818F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 81).addBox(-0.1F, -1.5257F, -0.3508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 2.1562F, 5.0709F, 0.1608F, -0.2154F, -0.0347F));

		PartDefinition cube_r99 = tail1.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -1.9F, 0.1F, 2.0F, 3.0F, 16.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.1562F, 0.0709F, 0.1571F, 0.0F, 0.0F));

		PartDefinition bone = tail1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -8.0925F, 7.6858F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(127, 40).addBox(0.0F, -2.8801F, 6.0157F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(71, 129).addBox(0.0F, -2.8801F, 9.0157F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(93, 129).addBox(0.0F, -2.8801F, 12.0157F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(104, 129).addBox(0.0F, -2.7801F, 15.0157F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8119F, 15.7733F, 0.3065F, -0.0834F, -0.0256F));

		PartDefinition cube_r100 = tail2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(0, 130).addBox(0.0F, -0.4F, 2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(129, 127).addBox(0.0F, -0.9F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5886F, 13.9632F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r101 = tail2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(126, 0).addBox(0.5F, -1.2508F, -1.0249F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5882F, 10.6089F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r102 = tail2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(109, 59).addBox(0.5F, 0.445F, 0.8251F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 50).addBox(0.5F, -0.555F, -1.6749F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5882F, 5.9089F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r103 = tail2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(131, 111).addBox(0.5F, 0.6524F, -0.1196F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5882F, 0.6089F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r104 = tail2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(18, 138).mirror().addBox(-0.6F, -3.0576F, 9.9963F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(24, 138).mirror().addBox(-0.6F, -2.552F, 7.3365F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(21, 138).mirror().addBox(-0.5F, -2.3241F, 4.327F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(101, 137).mirror().addBox(-0.5F, -1.9738F, 1.5468F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 135).mirror().addBox(-0.6F, -1.2906F, -1.3423F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.4795F, 1.8591F, -0.2618F, 0.0F, -1.5708F));

		PartDefinition cube_r105 = tail2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(18, 138).addBox(0.6F, -3.0576F, 9.9963F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 138).addBox(0.6F, -2.552F, 7.3365F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 138).addBox(0.5F, -2.3241F, 4.327F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 137).addBox(0.5F, -1.9738F, 1.5468F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 135).addBox(0.6F, -1.2906F, -1.3423F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.4795F, 1.8591F, -0.2618F, 0.0F, 1.5708F));

		PartDefinition cube_r106 = tail2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(88, 129).addBox(0.0F, -1.8811F, 0.0684F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.299F, 2.9473F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r107 = tail2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(129, 87).addBox(0.0F, -2.0811F, 0.0684F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.299F, -0.0527F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r108 = tail2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.9F, -1.0F, 2.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.501F, 1.0473F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(109, 129).addBox(0.0F, -2.3218F, 0.7993F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(114, 129).addBox(0.0F, -2.4218F, 3.7993F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(44, 133).addBox(0.0F, -2.4218F, 9.7993F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(129, 122).addBox(0.0F, -2.4218F, 6.7993F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.699F, 17.1473F, 0.035F, -0.0872F, -0.0031F));

		PartDefinition cube_r109 = tail3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(134, 72).addBox(0.0F, -0.3F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1875F, 14.7201F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r110 = tail3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(71, 134).addBox(0.0F, 0.1F, 5.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(119, 133).addBox(0.0F, -0.3F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6102F, 5.71F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r111 = tail3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(134, 68).addBox(0.0F, -0.3F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4693F, 8.7133F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r112 = tail3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(133, 117).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0196F, 2.6781F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r113 = tail3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(81, 133).addBox(0.0F, -1.3628F, 0.0016F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.059F, 12.7976F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r114 = tail3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(37, 37).addBox(-0.5F, 0.1F, 0.2F, 1.0F, 2.0F, 15.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.059F, -0.4024F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.109F, 14.6976F, -0.1377F, -0.2163F, 0.0279F));

		PartDefinition cube_r115 = tail4.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(131, 0).addBox(0.0F, -0.4756F, 0.1004F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6459F, 0.8329F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r116 = tail4.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(50, 55).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6459F, 0.1329F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(25, 55).addBox(-0.5F, -0.4948F, -0.2213F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.2423F, 9.9386F, -0.2292F, -0.2617F, -0.0038F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(13, 81).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4853F, 10.7962F, -0.1957F, -0.1268F, -0.0323F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(71, 68).addBox(-0.5F, -0.1614F, -0.0016F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.1654F, 5.871F, -0.1047F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1628F, -4.1022F, 0.1133F, 0.0003F, -0.0038F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(100, 117).addBox(-0.5F, -4.1105F, -0.1178F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.169F, -1.7704F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(117, 82).addBox(-0.5F, -4.5272F, -0.0114F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.369F, -4.8704F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(95, 117).addBox(-0.5F, -4.3372F, 0.0022F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.669F, -7.8704F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(23, 68).addBox(-1.5F, 0.0F, -0.1F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.669F, -8.7704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(111, 66).mirror().addBox(-3.6882F, -2.8327F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.069F, -1.4704F, -0.0271F, -0.0645F, -1.6396F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(64, 134).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.069F, -1.4704F, -0.0585F, -0.0384F, -1.046F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(134, 91).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.069F, -1.4704F, -0.0693F, -0.01F, -0.6104F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(134, 89).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.269F, -4.0704F, -0.0693F, -0.01F, -0.4708F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(134, 31).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.269F, -4.0704F, -0.0585F, -0.0384F, -0.9064F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(125, 69).mirror().addBox(-5.6882F, -2.8327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.269F, -4.0704F, -0.0271F, -0.0645F, -1.5F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(70, 9).mirror().addBox(-2.5F, -3.138F, -4.9322F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 13.9114F, -13.2384F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(86, 134).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.469F, -6.9704F, -0.111F, -0.0228F, -0.4003F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(134, 17).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.469F, -6.9704F, -0.0911F, -0.0675F, -0.8348F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(106, 98).mirror().addBox(-7.6882F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.469F, -6.9704F, -0.0377F, -0.1068F, -1.4293F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(37, 20).mirror().addBox(-3.0F, -5.3102F, -8.6475F, 8.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 15.0114F, -4.6384F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(134, 91).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.069F, -1.4704F, -0.0693F, 0.01F, 0.6104F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(64, 134).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.069F, -1.4704F, -0.0585F, 0.0384F, 1.046F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(111, 66).addBox(2.6881F, -2.8327F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.069F, -1.4704F, -0.0271F, 0.0645F, 1.6396F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(125, 69).addBox(2.6881F, -2.8327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.269F, -4.0704F, -0.0271F, 0.0645F, 1.5F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(134, 31).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.269F, -4.0704F, -0.0585F, 0.0384F, 0.9064F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(134, 89).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.269F, -4.0704F, -0.0693F, 0.01F, 0.4708F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(86, 134).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.469F, -6.9704F, -0.111F, 0.0228F, 0.4003F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(134, 17).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.469F, -6.9704F, -0.0911F, 0.0675F, 0.8348F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(106, 98).addBox(2.6881F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.469F, -6.9704F, -0.0377F, 0.1068F, 1.4293F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 58).addBox(-1.0F, -1.1F, -9.1F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.569F, -8.7704F, 0.0426F, 0.0871F, -0.0092F));

		PartDefinition cube_r141 = body2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(134, 121).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1F, -1.2F, -0.0023F, 0.0104F, -0.3833F));

		PartDefinition cube_r142 = body2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(134, 115).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1F, -1.2F, -0.0065F, 0.0084F, -0.8197F));

		PartDefinition cube_r143 = body2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(96, 64).mirror().addBox(-9.6882F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1F, -1.2F, -0.0101F, 0.0034F, -1.4131F));

		PartDefinition cube_r144 = body2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(134, 85).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1F, -4.1F, 0.084F, 0.0249F, -0.33F));

		PartDefinition cube_r145 = body2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(134, 15).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1F, -4.1F, 0.0656F, 0.0581F, -0.7655F));

		PartDefinition cube_r146 = body2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(28, 86).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1F, -4.1F, 0.0219F, 0.0848F, -1.3599F));

		PartDefinition cube_r147 = body2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(134, 13).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -8.5F, 0.1107F, 0.0853F, -0.8154F));

		PartDefinition cube_r148 = body2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(134, 83).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -8.5F, 0.1363F, 0.0307F, -0.3817F));

		PartDefinition cube_r149 = body2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(134, 87).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1F, -6.6F, 0.1192F, 0.0271F, -0.3298F));

		PartDefinition cube_r150 = body2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(134, 29).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1F, -6.6F, 0.0967F, 0.0749F, -0.7642F));

		PartDefinition cube_r151 = body2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(64, 18).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1F, -6.6F, 0.0382F, 0.1161F, -1.359F));

		PartDefinition cube_r152 = body2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(39, 17).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -8.5F, 0.044F, 0.1326F, -1.4106F));

		PartDefinition cube_r153 = body2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(65, 18).addBox(2.6881F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1F, -6.6F, 0.0382F, -0.1161F, 1.359F));

		PartDefinition cube_r154 = body2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(134, 29).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1F, -6.6F, 0.0967F, -0.0749F, 0.7642F));

		PartDefinition cube_r155 = body2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(134, 87).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1F, -6.6F, 0.1192F, -0.0271F, 0.3298F));

		PartDefinition cube_r156 = body2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(14, 118).addBox(0.0F, -3.9122F, 6.8373F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(134, 19).addBox(0.0F, -3.1122F, -0.1627F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -8.9F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r157 = body2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(34, 122).addBox(0.0F, -3.7117F, 0.0386F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -5.1F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r158 = body2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(61, 134).addBox(0.0F, -3.4646F, -0.162F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -6.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r159 = body2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(134, 121).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1F, -1.2F, -0.0023F, -0.0104F, 0.3833F));

		PartDefinition cube_r160 = body2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(134, 115).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1F, -1.2F, -0.0065F, -0.0084F, 0.8197F));

		PartDefinition cube_r161 = body2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(96, 64).addBox(2.6881F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1F, -1.2F, -0.0101F, -0.0034F, 1.4131F));

		PartDefinition cube_r162 = body2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(134, 85).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1F, -4.1F, 0.084F, -0.0249F, 0.33F));

		PartDefinition cube_r163 = body2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(134, 15).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1F, -4.1F, 0.0656F, -0.0581F, 0.7655F));

		PartDefinition cube_r164 = body2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(28, 86).addBox(2.6881F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1F, -4.1F, 0.0219F, -0.0848F, 1.3599F));

		PartDefinition cube_r165 = body2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(40, 17).addBox(2.6881F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2F, -8.5F, 0.044F, -0.1326F, 1.4106F));

		PartDefinition cube_r166 = body2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(134, 13).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2F, -8.5F, 0.1107F, -0.0853F, 0.8154F));

		PartDefinition cube_r167 = body2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(134, 83).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2F, -8.5F, 0.1363F, -0.0307F, 0.3817F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.495F, -8.9735F, 0.1305F, 0.0434F, -0.0046F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(11, 105).addBox(-1.0F, -2.2141F, -0.0945F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.5F, -3.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(134, 55).addBox(0.0F, -3.1775F, -0.1399F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.9F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(7, 113).addBox(0.0F, -2.8717F, -0.0424F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -4.0F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(87, 99).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6F, -5.4F, 0.1719F, 0.0302F, -0.3988F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(76, 97).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6F, -5.4F, 0.1434F, 0.0998F, -0.8306F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(49, 86).mirror().addBox(-7.6882F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6F, -5.4F, 0.0631F, 0.1628F, -1.426F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(133, 7).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -3.4F, 0.0859F, 0.0151F, -0.2961F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(133, 5).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -3.4F, 0.0715F, 0.05F, -0.7312F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(73, 66).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -3.4F, 0.0313F, 0.0815F, -1.3252F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(90, 68).mirror().addBox(-1.8838F, -0.1552F, -3.1426F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4872F, 10.8907F, -5.0578F, -0.8365F, -0.3356F, 0.3499F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(111, 39).mirror().addBox(-4.3F, -0.3F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7244F, 12.1145F, -3.9193F, -0.647F, 0.2617F, 0.2463F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(28, 81).mirror().addBox(-2.5128F, 0.0129F, 0.3726F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4872F, 10.8907F, -5.0578F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(87, 99).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6F, -5.4F, 0.1719F, -0.0302F, 0.3988F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(76, 97).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6F, -5.4F, 0.1434F, -0.0998F, 0.8306F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(49, 86).addBox(2.6881F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6F, -5.4F, 0.0631F, -0.1628F, 1.426F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(133, 7).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -3.4F, 0.0859F, -0.0151F, 0.2961F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(133, 5).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -3.4F, 0.0715F, -0.05F, 0.7312F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(74, 66).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -3.4F, 0.0313F, -0.0815F, 1.3252F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(134, 27).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -1.6F, 0.0572F, 0.04F, -0.7843F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(134, 25).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -1.6F, 0.0688F, 0.0121F, -0.3486F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(73, 64).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -1.6F, 0.0251F, 0.0652F, -1.378F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(96, 66).mirror().addBox(-5.2F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5386F, 11.9714F, -3.1945F, -0.2762F, 0.8828F, -0.3353F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(103, 83).mirror().addBox(-4.1F, 0.0F, -0.8F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5968F, 12.1407F, -2.8407F, -0.4127F, 0.5999F, 0.0286F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(73, 64).addBox(2.6881F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -1.6F, 0.0251F, -0.0652F, 1.378F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(134, 27).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -1.6F, 0.0572F, -0.04F, 0.7843F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(134, 25).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -1.6F, 0.0688F, -0.0121F, 0.3486F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(101, 131).addBox(0.0F, -2.9926F, -0.2837F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -5.8F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(90, 68).addBox(-0.1162F, -0.1552F, -3.1426F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4872F, 10.8907F, -5.0578F, -0.8365F, 0.3356F, -0.3499F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(111, 39).addBox(-0.4F, -0.3F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7244F, 12.1145F, -3.9193F, -0.5289F, -0.3015F, -0.546F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(103, 83).addBox(-0.9F, 0.0F, -0.8F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5968F, 12.1407F, -2.8407F, -0.4342F, -0.5856F, 0.0098F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(96, 66).addBox(0.2F, 0.3F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5386F, 11.9714F, -3.1945F, -0.0664F, -0.9415F, 0.036F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(44, 104).addBox(-1.4872F, -0.1552F, -3.1737F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4872F, 10.8907F, -5.0578F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(87, 37).addBox(-1.0F, -0.1119F, -4.9679F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -3.1F, 0.1833F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(4.4913F, 8.1208F, -4.3982F));

		PartDefinition cube_r201 = bone2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(109, 134).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8955F, -8.026F, 4.7846F, 1.1618F, -0.0235F, -0.1021F));

		PartDefinition cube_r202 = bone2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(137, 99).addBox(-0.4276F, -6.4067F, 7.0821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.7087F, -0.8112F, -1.4386F, 0.1059F, -0.0235F, -0.1021F));

		PartDefinition cube_r203 = bone2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(36, 117).addBox(-0.5F, -0.375F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.1038F, -6.1792F, 3.9735F, 0.7953F, -0.0235F, -0.1021F));

		PartDefinition cube_r204 = bone2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(127, 26).addBox(-0.4276F, 1.8302F, 7.4578F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.7087F, -0.8112F, -1.4386F, 1.1008F, -0.0235F, -0.1021F));

		PartDefinition cube_r205 = bone2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(117, 10).addBox(-0.447F, 1.6617F, 5.7742F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7087F, -0.8112F, -1.4386F, 1.1442F, -0.019F, -0.103F));

		PartDefinition cube_r206 = bone2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(106, 0).addBox(-0.9118F, 0.1857F, -0.0503F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.7087F, -3.1112F, 0.2614F, 0.7941F, -0.0009F, -0.0174F));

		PartDefinition cube_r207 = bone2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(105, 101).addBox(-0.9118F, -0.1393F, -0.0503F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7087F, -3.1112F, 0.2614F, 0.8378F, -0.0009F, -0.0174F));

		PartDefinition cube_r208 = bone2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(106, 92).addBox(-0.9F, -0.4436F, -4.0786F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.7087F, -3.2112F, 0.7364F, 1.0471F, 0.1346F, 0.2175F));

		PartDefinition cube_r209 = bone2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(106, 12).addBox(-0.9F, -0.2487F, -4.5266F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7087F, -3.2112F, 0.7364F, 1.2042F, 0.1346F, 0.2175F));

		PartDefinition cube_r210 = bone2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(44, 110).addBox(-0.0516F, -2.9527F, -5.607F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.0F, 0.0F, 1.0108F, 0.9752F, 0.5835F));

		PartDefinition cube_r211 = bone2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(87, 101).addBox(-0.0516F, 0.2745F, -4.4556F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.6F, 0.0F, 0.0F, 0.3825F, 0.9752F, 0.5835F));

		PartDefinition cube_r212 = bone2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(76, 99).addBox(-0.0516F, -1.1317F, -4.051F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6F, 0.0F, 0.0F, 0.0509F, 0.9752F, 0.5835F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-4.4913F, 8.1208F, -4.3982F));

		PartDefinition cube_r213 = bone4.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(109, 134).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8955F, -8.026F, 4.7846F, 1.1618F, 0.0235F, 0.1021F));

		PartDefinition cube_r214 = bone4.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(137, 99).mirror().addBox(-0.5724F, -6.4067F, 7.0821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.7087F, -0.8112F, -1.4386F, 0.1059F, 0.0235F, 0.1021F));

		PartDefinition cube_r215 = bone4.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(36, 117).mirror().addBox(-0.5F, -0.375F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1038F, -6.1792F, 3.9735F, 0.7953F, 0.0235F, 0.1021F));

		PartDefinition cube_r216 = bone4.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(127, 26).mirror().addBox(-0.5724F, 1.8302F, 7.4578F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7087F, -0.8112F, -1.4386F, 1.1008F, 0.0235F, 0.1021F));

		PartDefinition cube_r217 = bone4.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(117, 10).mirror().addBox(-0.553F, 1.6617F, 5.7742F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7087F, -0.8112F, -1.4386F, 1.1442F, 0.019F, 0.103F));

		PartDefinition cube_r218 = bone4.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(106, 0).mirror().addBox(-0.0882F, 0.1857F, -0.0503F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7087F, -3.1112F, 0.2614F, 0.7941F, 0.0009F, 0.0174F));

		PartDefinition cube_r219 = bone4.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(105, 101).mirror().addBox(-0.0882F, -0.1393F, -0.0503F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7087F, -3.1112F, 0.2614F, 0.8378F, 0.0009F, 0.0174F));

		PartDefinition cube_r220 = bone4.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(106, 92).mirror().addBox(-0.1F, -0.4436F, -4.0786F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.7087F, -3.2112F, 0.7364F, 1.0471F, -0.1346F, -0.2175F));

		PartDefinition cube_r221 = bone4.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(106, 12).mirror().addBox(-0.1F, -0.2487F, -4.5266F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7087F, -3.2112F, 0.7364F, 1.2042F, -0.1346F, -0.2175F));

		PartDefinition cube_r222 = bone4.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(44, 110).mirror().addBox(-0.9484F, -2.9527F, -5.607F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.0F, 0.0F, 1.0108F, -0.9752F, -0.5835F));

		PartDefinition cube_r223 = bone4.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(87, 101).mirror().addBox(-0.9484F, 0.2745F, -4.4556F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.0F, 0.0F, 0.3825F, -0.9752F, -0.5835F));

		PartDefinition cube_r224 = bone4.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(76, 99).mirror().addBox(-0.9484F, -1.1317F, -4.051F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.0F, 0.0F, 0.0509F, -0.9752F, -0.5835F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5846F, 9.5278F, -4.7488F, 0.4883F, 0.2423F, -0.0917F));

		PartDefinition cube_r225 = leftArm1.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(132, 105).addBox(-1.0126F, -2.1148F, -0.0627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.8847F, 0.8893F, 0.2018F, -0.7676F, 0.1498F));

		PartDefinition cube_r226 = leftArm1.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(12, 132).addBox(-1.0F, -1.9618F, -0.1286F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.8847F, 0.8893F, 0.5713F, -0.6678F, 0.2037F));

		PartDefinition cube_r227 = leftArm1.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(61, 129).addBox(6.0F, -1.2842F, 0.0838F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 0.6847F, 0.0893F, -0.2895F, -0.0786F, -0.067F));

		PartDefinition cube_r228 = leftArm1.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(129, 71).addBox(-0.5F, -1.4F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.2943F, 0.6372F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(129, 55).addBox(-0.8F, -0.2307F, -0.4734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 129).addBox(-0.8F, -0.2307F, -1.5734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, 5.1584F, 1.4871F, -1.0064F, 0.0156F, 0.0164F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 3.8693F, 0.2266F, 0.0F, 0.0F, 0.4363F));

		PartDefinition cube_r229 = leftHand.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(19, 125).addBox(0.0F, -2.5F, 0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.5F, -1.4F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r230 = leftHand.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(24, 129).addBox(0.0F, -2.5F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.5F, -1.4F, -0.1396F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5846F, 9.5278F, -4.7488F, 0.4861F, -0.2463F, 0.1116F));

		PartDefinition cube_r231 = rightArm1.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(129, 132).addBox(0.0126F, -2.1148F, -0.0627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 1.8847F, 0.8893F, 0.2018F, 0.7676F, -0.1498F));

		PartDefinition cube_r232 = rightArm1.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(132, 41).addBox(0.0F, -1.9618F, -0.1286F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 1.8847F, 0.8893F, 0.5713F, 0.6678F, -0.2037F));

		PartDefinition cube_r233 = rightArm1.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(66, 129).addBox(-7.0F, -1.2842F, 0.0838F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 0.6847F, 0.0893F, -0.2895F, 0.0786F, 0.067F));

		PartDefinition cube_r234 = rightArm1.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(76, 129).addBox(-0.5F, -1.4F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.2943F, 0.6372F, 0.2618F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(56, 129).addBox(-0.2F, -0.2307F, -0.4734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 129).addBox(-0.2F, -0.2307F, -1.5734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 5.1584F, 1.4871F, -1.0064F, -0.0156F, -0.0164F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 3.8693F, 0.2266F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r235 = rightHand.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(125, 45).addBox(-1.0F, -2.5F, 0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, -1.4F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r236 = rightHand.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(29, 129).addBox(-1.0F, -2.5F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, -1.4F, -0.1396F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1447F, -7.3617F, -0.6721F, 0.002F, 0.0055F));

		PartDefinition cube_r237 = neck1.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(134, 129).addBox(0.0F, -3.2709F, -1.016F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6932F, -1.0134F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r238 = neck1.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(0, 107).addBox(-1.0F, -1.0F, 3.1F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.8415F, -5.552F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r239 = neck1.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(134, 125).mirror().addBox(-2.0051F, 0.029F, -0.3799F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5474F, -1.3213F, 1.2422F, 0.7448F, -0.1542F));

		PartDefinition cube_r240 = neck1.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(116, 111).mirror().addBox(-5.8295F, -0.8211F, -0.3799F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5474F, -1.3213F, 0.9672F, 1.1395F, -0.4865F));

		PartDefinition cube_r241 = neck1.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(134, 125).addBox(0.0051F, 0.029F, -0.3799F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5474F, -1.3213F, 1.2422F, -0.7448F, 0.1542F));

		PartDefinition cube_r242 = neck1.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(116, 111).addBox(1.8295F, -0.8211F, -0.3799F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5474F, -1.3213F, 0.9672F, -1.1395F, 0.4865F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(137, 133).addBox(0.0F, -2.6565F, -3.5092F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.34F, -2.4258F, 0.1569F, -0.0036F, 0.0069F));

		PartDefinition cube_r243 = neck2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(15, 136).addBox(0.0F, -2.3566F, -0.8491F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9999F, -0.6601F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r244 = neck2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(137, 129).addBox(0.0F, -1.6677F, -0.0582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2094F, -5.3613F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r245 = neck2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(132, 66).mirror().addBox(-1.9767F, -0.0539F, -0.3344F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0254F, -5.3736F, 0.7398F, 0.8094F, -0.5979F));

		PartDefinition cube_r246 = neck2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(116, 71).mirror().addBox(-5.7687F, -0.8843F, -0.3344F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0254F, -5.3736F, 0.2231F, 1.021F, -1.2381F));

		PartDefinition cube_r247 = neck2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(132, 51).mirror().addBox(-1.9767F, -0.0539F, -0.3345F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0746F, -3.5736F, 0.7825F, 0.8286F, -0.5667F));

		PartDefinition cube_r248 = neck2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(113, 80).mirror().addBox(-5.7687F, -0.8843F, -0.3345F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0746F, -3.5736F, 0.2462F, 1.0538F, -1.2182F));

		PartDefinition cube_r249 = neck2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(122, 61).mirror().addBox(-4.6888F, -0.8865F, -0.5178F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3071F, -1.0534F, 0.3734F, 1.1821F, -1.1036F));

		PartDefinition cube_r250 = neck2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(132, 103).mirror().addBox(-1.9053F, -0.0897F, -0.5178F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3071F, -1.0534F, 0.9714F, 0.8951F, -0.4231F));

		PartDefinition cube_r251 = neck2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(116, 71).addBox(1.7687F, -0.8843F, -0.3344F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0254F, -5.3736F, 0.2231F, -1.021F, 1.2381F));

		PartDefinition cube_r252 = neck2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(132, 66).addBox(-0.0233F, -0.0539F, -0.3344F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0254F, -5.3736F, 0.7398F, -0.8094F, 0.5979F));

		PartDefinition cube_r253 = neck2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(132, 51).addBox(-0.0233F, -0.0539F, -0.3345F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0746F, -3.5736F, 0.7825F, -0.8286F, 0.5667F));

		PartDefinition cube_r254 = neck2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(113, 80).addBox(1.7687F, -0.8843F, -0.3345F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0746F, -3.5736F, 0.2462F, -1.0538F, 1.2182F));

		PartDefinition cube_r255 = neck2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(122, 61).addBox(1.6888F, -0.8865F, -0.5178F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3071F, -1.0534F, 0.3734F, -1.1821F, 1.1036F));

		PartDefinition cube_r256 = neck2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(132, 103).addBox(-0.0948F, -0.0897F, -0.5178F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3071F, -1.0534F, 0.9714F, -0.8951F, 0.4231F));

		PartDefinition cube_r257 = neck2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(0, 71).addBox(-1.0F, 0.9F, 1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3911F, -7.3781F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6064F, -6.1365F, 0.5846F, -0.0008F, 0.0018F));

		PartDefinition cube_r258 = neck3.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(122, 63).mirror().addBox(-4.8788F, -0.8475F, -0.612F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2681F, -0.7577F, 0.0268F, 0.4795F, -1.3772F));

		PartDefinition cube_r259 = neck3.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(117, 96).mirror().addBox(-2.061F, 0.0259F, -0.612F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2681F, -0.7577F, 0.2394F, 0.4203F, -0.8961F));

		PartDefinition cube_r260 = neck3.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(132, 53).mirror().addBox(-3.8788F, -0.8475F, -0.612F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2681F, -2.3577F, 0.0345F, 0.5137F, -1.3735F));

		PartDefinition cube_r261 = neck3.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(36, 115).mirror().addBox(-2.061F, 0.0259F, -0.612F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2681F, -2.3577F, 0.2636F, 0.4475F, -0.886F));

		PartDefinition cube_r262 = neck3.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(122, 63).addBox(1.8788F, -0.8475F, -0.612F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2681F, -0.7577F, 0.0268F, -0.4795F, 1.3772F));

		PartDefinition cube_r263 = neck3.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(117, 96).addBox(0.061F, 0.0259F, -0.612F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2681F, -0.7577F, 0.2394F, -0.4203F, 0.8961F));

		PartDefinition cube_r264 = neck3.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(132, 53).addBox(1.8788F, -0.8475F, -0.612F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2681F, -2.3577F, 0.0345F, -0.5137F, 1.3735F));

		PartDefinition cube_r265 = neck3.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(36, 115).addBox(0.061F, 0.0259F, -0.612F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2681F, -2.3577F, 0.2636F, -0.4475F, 0.886F));

		PartDefinition cube_r266 = neck3.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(57, 135).addBox(0.5F, -1.9458F, -0.1223F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.0315F, -2.3346F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r267 = neck3.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(137, 137).addBox(0.5F, -1.969F, -0.0772F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1315F, -0.6346F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r268 = neck3.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(107, 42).addBox(-0.5F, 0.5F, -4.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -0.7315F, 1.3654F, -0.48F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6363F, -2.487F, -0.3487F, -0.0046F, -0.0148F));

		PartDefinition cube_r269 = neck.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(132, 39).mirror().addBox(-1.9619F, -0.0375F, -0.6859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4991F, -3.1439F, 0.6311F, 0.7523F, -0.6745F));

		PartDefinition cube_r270 = neck.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(62, 111).mirror().addBox(-2.7622F, -0.8631F, -0.6859F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4991F, -3.1439F, 0.1708F, 0.9295F, -1.2815F));

		PartDefinition cube_r271 = neck.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(132, 64).mirror().addBox(-3.6872F, -0.8836F, -0.5678F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, -1.3F, 0.0835F, 0.7015F, -1.3455F));

		PartDefinition cube_r272 = neck.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(131, 79).mirror().addBox(-1.9025F, -0.0878F, -0.5678F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, -1.3F, 0.4096F, 0.592F, -0.8132F));

		PartDefinition cube_r273 = neck.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(132, 64).addBox(1.6872F, -0.8836F, -0.5678F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -1.3F, 0.0835F, -0.7015F, 1.3455F));

		PartDefinition cube_r274 = neck.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(132, 39).addBox(-0.0382F, -0.0375F, -0.6859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4991F, -3.1439F, 0.6311F, -0.7523F, 0.6745F));

		PartDefinition cube_r275 = neck.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(62, 111).addBox(1.7622F, -0.8631F, -0.6859F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4991F, -3.1439F, 0.1708F, -0.9295F, 1.2815F));

		PartDefinition cube_r276 = neck.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(134, 135).addBox(0.5F, -2.2874F, 0.0754F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2952F, -1.9476F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r277 = neck.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(99, 125).addBox(0.5F, -1.5207F, -0.0014F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9952F, -4.7476F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r278 = neck.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(28, 88).addBox(-0.5F, 0.8815F, -4.9683F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.3952F, -0.0476F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r279 = neck.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(131, 79).addBox(-0.0975F, -0.0878F, -0.5678F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -1.3F, 0.4096F, -0.592F, 0.8132F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1803F, -4.6288F, 0.0508F, 0.1293F, -0.0172F));

		PartDefinition cube_r280 = head.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(0, 91).addBox(-1.0F, -0.041F, -0.2653F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(0.0F, -1.2218F, -5.1418F, -1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r281 = head.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(95, 9).addBox(-0.5F, -5.8995F, -0.1794F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.3023F, -12.6889F, -1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r282 = head.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(64, 136).addBox(-0.5F, -0.8388F, -0.5916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.1461F, -11.3063F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r283 = head.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(27, 135).addBox(-0.5F, -0.1892F, -0.6019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.1461F, -11.3063F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r284 = head.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(136, 36).addBox(-0.5F, -0.8388F, -0.5916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.7461F, -10.3813F, -1.5621F, 0.0F, 0.0F));

		PartDefinition cube_r285 = head.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(22, 135).addBox(-0.5F, -0.1892F, -0.6019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.0F, 0.7461F, -10.3813F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r286 = head.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(136, 33).addBox(-0.5F, -0.8388F, -0.5916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.3211F, -9.0563F, -1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r287 = head.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(102, 42).addBox(-0.5F, -0.1892F, -0.6019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.0F, 0.3211F, -9.0563F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r288 = head.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(22, 105).addBox(-0.5F, -1.9276F, -0.0467F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 1.3023F, -12.6889F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r289 = head.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(7, 118).addBox(-1.0F, -1.5F, -0.525F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.4488F, -12.7125F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r290 = head.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(124, 113).addBox(-1.0F, -2.0278F, -0.0329F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 2.4039F, -14.4311F, -0.9992F, 0.0F, 0.0F));

		PartDefinition cube_r291 = head.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(137, 105).addBox(-1.0F, -0.8858F, -0.0409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.0857F, -14.8883F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r292 = head.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(119, 137).addBox(-0.5F, -1.45F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 5.5791F, -11.4231F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r293 = head.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(132, 99).addBox(-1.0F, -2.6822F, -4.0767F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, 5.6029F, -10.7781F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r294 = head.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(10, 136).addBox(0.0F, 0.5191F, -0.524F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -2.4865F, -1.7188F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r295 = head.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(0, 126).addBox(0.0F, -0.516F, -1.465F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -2.4865F, -0.7188F, 1.946F, 0.0F, 0.0F));

		PartDefinition cube_r296 = head.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(43, 88).addBox(-9.1F, 0.1713F, -1.9121F, 3.0F, 3.0F, 4.0F, new CubeDeformation(-0.01F))
				.texOffs(74, 20).addBox(-9.6F, -1.9287F, -0.9121F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(7.6F, 0.5782F, -4.3551F, -0.027F, 0.0F, 0.0F));

		PartDefinition cube_r297 = head.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(136, 0).addBox(0.0F, 1.4999F, 0.3188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -2.6865F, -3.0188F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r298 = head.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(74, 29).addBox(-1.9404F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4404F, -0.2761F, -3.5885F, 0.1987F, 0.0F, 0.0F));

		PartDefinition cube_r299 = head.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(68, 107).addBox(-1.5F, -0.0629F, -1.9968F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6305F, -0.0333F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r300 = head.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(107, 54).addBox(-1.5F, 0.0016F, -1.7458F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9718F, -2.0551F, 1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r301 = head.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(89, 29).addBox(-1.5F, -3.0931F, -3.0028F, 4.0F, 3.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 3.6282F, 0.3449F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r302 = head.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(94, 59).addBox(-1.5F, -4.0F, -2.8F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 6.5282F, 0.5449F, 0.0698F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5994F, 0.9282F, -0.3813F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(120, 35).addBox(-0.3121F, -1.3445F, -2.3794F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2001F, 4.4426F, -8.2079F, 0.2531F, 0.1396F, 0.0F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(133, 9).addBox(0.2963F, -2.5418F, -1.1859F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.3F, -4.7147F, 0.0363F, -1.2216F, 1.1737F, 2.4784F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(91, 18).addBox(-0.95F, -0.0245F, -0.0294F, 1.0F, 5.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.2261F, -1.3468F, -7.4977F, -1.2188F, 0.1279F, 0.0442F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(0, 99).addBox(-1.1F, 0.0972F, 0.0293F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(2.6559F, -2.324F, -5.4542F, 0.1987F, 0.0076F, 0.0287F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(138, 9).addBox(-0.3162F, -1.4741F, -0.9577F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2001F, 4.4426F, -8.2079F, 0.2522F, 0.0891F, 0.0544F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(129, 82).addBox(0.3F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8734F, 3.327F, -7.1215F, 0.6566F, 0.0776F, 0.0798F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(27, 138).addBox(-0.6525F, -1.6033F, -2.1891F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7751F, 4.4426F, -11.2079F, 0.2772F, 0.0499F, 0.0333F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(95, 109).addBox(-0.4031F, -0.7903F, -0.7916F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7751F, 4.4426F, -11.2079F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(76, 134).addBox(0.5223F, -5.465F, -2.6427F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.2001F, 4.4426F, -8.2079F, 0.3812F, 0.2742F, -0.5367F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(124, 94).addBox(0.0409F, -3.7695F, -2.0223F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.7751F, 4.4426F, -11.2079F, -0.1316F, 0.1839F, -0.5243F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(105, 124).addBox(-0.9121F, -2.1391F, -1.9711F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.7751F, 4.4426F, -11.2079F, -0.0292F, 0.18F, -0.0354F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(62, 124).addBox(-0.4265F, -1.9971F, -3.6685F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.7751F, 4.4426F, -11.2079F, -0.0881F, 0.461F, -0.0256F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(32, 135).addBox(0.4717F, 2.9774F, -1.4667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.7751F, 4.4426F, -11.2079F, -2.1889F, 0.3798F, -0.6059F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(137, 58).addBox(0.4717F, -2.4132F, -2.9472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7751F, 4.4426F, -11.2079F, -0.2691F, 0.3798F, -0.6059F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(137, 19).addBox(0.4717F, -3.3688F, -1.8748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7751F, 4.4426F, -11.2079F, 0.1236F, 0.3798F, -0.6059F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(0, 135).addBox(0.1103F, -3.9874F, -3.0114F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.2001F, 4.4426F, -8.2079F, -0.0122F, 0.1047F, -0.5438F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(5, 135).addBox(-1.0719F, -2.2754F, -3.0114F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.2001F, 4.4426F, -8.2079F, 0.0436F, 0.096F, 0.0F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(118, 45).addBox(0.1962F, -5.0447F, -2.0218F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2001F, 4.4426F, -8.2079F, 0.0015F, 0.1525F, -0.533F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(55, 124).addBox(-0.9968F, -2.3688F, -2.0218F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2001F, 4.4426F, -8.2079F, 0.0785F, 0.1309F, 0.0F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(102, 75).addBox(-0.3491F, -4.1521F, -2.9453F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3251F, 3.2426F, -5.4079F, 0.3557F, 0.2519F, -0.2531F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(127, 18).addBox(0.2225F, -2.4255F, 0.6722F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0604F, -0.0628F, -2.666F, -1.0856F, -0.0378F, -0.0022F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(137, 55).addBox(0.2225F, -0.1172F, 1.5534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(127, 14).addBox(0.2225F, 0.4828F, 1.5534F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0604F, -0.0628F, -2.666F, -0.2129F, -0.0378F, -0.0022F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(126, 118).addBox(0.2225F, -0.4831F, 1.2927F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0604F, -0.0628F, -2.666F, 0.2234F, -0.0378F, -0.0022F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(44, 126).addBox(0.2225F, -2.7442F, 0.5792F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0604F, -0.0628F, -2.666F, -0.5184F, -0.0378F, -0.0022F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(105, 107).addBox(0.2225F, -1.9623F, -2.0763F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.013F))
				.texOffs(95, 92).addBox(0.1974F, -3.9623F, -1.0763F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0604F, -0.0628F, -2.666F, -1.5656F, -0.0378F, -0.0022F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(127, 22).addBox(-0.5F, 0.0F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.6282F, 0.8415F, 0.825F, -1.0856F, -0.0378F, -0.0022F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(76, 124).addBox(0.1571F, 0.5038F, 0.6114F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0604F, -0.0628F, -2.666F, -0.6929F, 0.0058F, -0.002F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(129, 136).addBox(0.5364F, -1.7564F, -0.8822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(86, 136).addBox(0.3614F, -1.7564F, -0.8822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0604F, -0.0628F, -2.666F, 0.0485F, 0.2589F, -0.0018F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(137, 47).addBox(0.2114F, -0.7405F, -0.5855F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(2.0604F, -0.0628F, -2.666F, 0.2667F, 0.2589F, -0.0018F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(137, 44).addBox(0.2114F, -0.0032F, -0.5011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0604F, -0.0628F, -2.666F, -0.2133F, 0.2589F, -0.0018F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(104, 134).addBox(0.2114F, -0.8987F, -1.4068F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0604F, -0.0628F, -2.666F, 0.5721F, 0.2589F, -0.0018F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(134, 93).addBox(0.2114F, -1.4475F, -1.541F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0604F, -0.0628F, -2.666F, -0.3878F, 0.2589F, -0.0018F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(93, 134).addBox(0.2114F, -2.031F, -0.6287F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.0604F, -0.0628F, -2.666F, 0.1358F, 0.2589F, -0.0018F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(26, 96).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2927F, 0.8776F, -4.379F, 0.0049F, 0.2589F, -0.0018F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(106, 113).addBox(-0.7961F, 0.3893F, 1.8545F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0604F, -0.0628F, -2.666F, 0.8006F, -0.0362F, -0.004F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(95, 113).addBox(-1.8299F, 0.6882F, 1.5053F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0604F, -0.0628F, -2.666F, 1.1488F, -0.0374F, 0.0107F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(126, 10).addBox(0.1701F, -0.0942F, 1.0043F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(25, 51).addBox(-1.8299F, 0.9058F, 1.0043F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0604F, -0.0628F, -2.666F, 1.5328F, -0.0374F, 0.0107F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(27, 118).addBox(0.1126F, -1.6839F, 0.7613F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0604F, -0.0628F, -2.666F, 1.8968F, 0.2893F, 0.0265F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(122, 73).addBox(-0.4589F, -0.3176F, -0.8278F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0009F, -1.8903F, -5.2222F, 1.103F, 0.2764F, 0.1197F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(42, 137).addBox(-0.4589F, -0.626F, 0.0437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(137, 41).addBox(-0.4589F, -0.626F, -0.4563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.0009F, -1.8903F, -5.2222F, 0.8324F, 0.2764F, 0.1197F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(137, 22).addBox(-0.4589F, -0.5549F, -1.3383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.0009F, -1.8903F, -5.2222F, 0.6579F, 0.2764F, 0.1197F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(107, 48).addBox(-0.7133F, -1.4119F, -2.9149F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3251F, 3.2426F, -5.4079F, 0.4412F, 0.1541F, -0.002F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(120, 20).addBox(-1.2849F, -2.3871F, -2.6799F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0604F, -0.0628F, -2.666F, 0.1104F, 0.1835F, 0.0495F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(130, 48).addBox(-0.8507F, 1.013F, 1.6181F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(130, 45).addBox(-0.8507F, 1.013F, 1.9181F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.274F, -1.1878F, -5.8022F, -1.8251F, 0.3026F, -0.0962F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(44, 130).addBox(-0.8507F, 2.3712F, 1.1135F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.274F, -1.1878F, -5.8022F, -1.1706F, 0.3026F, -0.0962F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(119, 130).addBox(-0.8507F, 2.2761F, -1.6315F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.274F, -1.1878F, -5.8022F, 0.3566F, 0.3026F, -0.0962F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(126, 6).addBox(-0.8507F, 1.6536F, -1.4096F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.274F, -1.1878F, -5.8022F, 0.0075F, 0.3026F, -0.0962F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(85, 122).addBox(-0.8507F, 0.9201F, -0.7414F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.274F, -1.1878F, -5.8022F, -0.4288F, 0.3026F, -0.0962F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(122, 82).addBox(-0.8507F, 0.2986F, -0.3484F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.274F, -1.1878F, -5.8022F, -0.1234F, 0.3026F, -0.0962F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(68, 104).addBox(-0.8507F, -0.3376F, -0.6413F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.274F, -1.1878F, -5.8022F, 0.4438F, 0.3026F, -0.0962F));

		PartDefinition cube_r353 = leftFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(118, 41).addBox(-0.8507F, -0.4755F, -2.5351F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.274F, -1.1878F, -5.8022F, 0.6184F, 0.3026F, -0.0962F));

		PartDefinition cube_r354 = leftFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(63, 78).addBox(-0.025F, -0.7299F, -7.1719F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.01F))
				.texOffs(0, 121).addBox(-0.025F, -0.7299F, -1.2219F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(1.274F, -1.1878F, -5.8022F, 0.363F, 0.2809F, -0.1333F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5994F, 0.9282F, -0.3813F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(120, 35).mirror().addBox(0.3121F, -1.3445F, -2.3794F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2001F, 4.4426F, -8.2079F, 0.2531F, -0.1396F, 0.0F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(133, 9).mirror().addBox(-1.2963F, -2.5418F, -1.1859F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -4.7147F, 0.0363F, -1.2216F, -1.1737F, -2.4784F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(91, 18).mirror().addBox(-0.05F, -0.0245F, -0.0294F, 1.0F, 5.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.2261F, -1.3468F, -7.4977F, -1.2188F, -0.1279F, -0.0442F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(0, 99).mirror().addBox(0.1F, 0.0972F, 0.0293F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-2.6559F, -2.324F, -5.4542F, 0.1987F, -0.0076F, -0.0287F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(138, 9).mirror().addBox(0.3162F, -1.4741F, -0.9577F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2001F, 4.4426F, -8.2079F, 0.2522F, -0.0891F, -0.0544F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(129, 82).mirror().addBox(-0.3F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8734F, 3.327F, -7.1215F, 0.6566F, -0.0776F, -0.0798F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(27, 138).mirror().addBox(0.6525F, -1.6033F, -2.1891F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7751F, 4.4426F, -11.2079F, 0.2772F, -0.0499F, -0.0333F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(95, 109).mirror().addBox(0.4031F, -0.7903F, -0.7916F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7751F, 4.4426F, -11.2079F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(76, 134).mirror().addBox(-1.5223F, -5.465F, -2.6427F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.2001F, 4.4426F, -8.2079F, 0.3812F, -0.2742F, 0.5367F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(124, 94).mirror().addBox(-1.0409F, -3.7695F, -2.0223F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7751F, 4.4426F, -11.2079F, -0.1316F, -0.1839F, 0.5243F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(105, 124).mirror().addBox(-0.0879F, -2.1391F, -1.9711F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7751F, 4.4426F, -11.2079F, -0.0292F, -0.18F, 0.0354F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(62, 124).mirror().addBox(-0.5735F, -1.9971F, -3.6685F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7751F, 4.4426F, -11.2079F, -0.0881F, -0.461F, 0.0256F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(32, 135).mirror().addBox(-1.4717F, 2.9774F, -1.4667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7751F, 4.4426F, -11.2079F, -2.1889F, -0.3798F, 0.6059F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(137, 58).mirror().addBox(-1.4717F, -2.4132F, -2.9472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7751F, 4.4426F, -11.2079F, -0.2691F, -0.3798F, 0.6059F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(137, 19).mirror().addBox(-1.4717F, -3.3688F, -1.8748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7751F, 4.4426F, -11.2079F, 0.1236F, -0.3798F, 0.6059F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(0, 135).mirror().addBox(-1.1103F, -3.9874F, -3.0114F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2001F, 4.4426F, -8.2079F, -0.0122F, -0.1047F, 0.5438F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(5, 135).mirror().addBox(0.0719F, -2.2754F, -3.0114F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2001F, 4.4426F, -8.2079F, 0.0436F, -0.096F, 0.0F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(118, 45).mirror().addBox(-1.1961F, -5.0447F, -2.0218F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2001F, 4.4426F, -8.2079F, 0.0015F, -0.1525F, 0.533F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(55, 124).mirror().addBox(-0.0032F, -2.3688F, -2.0218F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2001F, 4.4426F, -8.2079F, 0.0785F, -0.1309F, 0.0F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(102, 75).mirror().addBox(-0.6509F, -4.1521F, -2.9453F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3251F, 3.2426F, -5.4079F, 0.3557F, -0.2519F, 0.2531F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(127, 18).mirror().addBox(-1.2225F, -2.4255F, 0.6722F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0604F, -0.0628F, -2.666F, -1.0856F, 0.0378F, 0.0022F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(137, 55).mirror().addBox(-1.2225F, -0.1172F, 1.5534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(127, 14).mirror().addBox(-1.2225F, 0.4828F, 1.5534F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0604F, -0.0628F, -2.666F, -0.2129F, 0.0378F, 0.0022F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(126, 118).mirror().addBox(-1.2225F, -0.4831F, 1.2927F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0604F, -0.0628F, -2.666F, 0.2234F, 0.0378F, 0.0022F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(44, 126).mirror().addBox(-1.2225F, -2.7442F, 0.5792F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0604F, -0.0628F, -2.666F, -0.5184F, 0.0378F, 0.0022F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(105, 107).mirror().addBox(-1.2225F, -1.9623F, -2.0763F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.013F)).mirror(false)
				.texOffs(95, 92).mirror().addBox(-1.1975F, -3.9623F, -1.0763F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0604F, -0.0628F, -2.666F, -1.5656F, 0.0378F, 0.0022F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(127, 22).mirror().addBox(-0.5F, 0.0F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.6282F, 0.8415F, 0.825F, -1.0856F, 0.0378F, 0.0022F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(76, 124).mirror().addBox(-1.1571F, 0.5038F, 0.6114F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0604F, -0.0628F, -2.666F, -0.6929F, -0.0058F, 0.002F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(129, 136).mirror().addBox(-1.5364F, -1.7564F, -0.8822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(86, 136).mirror().addBox(-1.3614F, -1.7564F, -0.8822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0604F, -0.0628F, -2.666F, 0.0485F, -0.2589F, 0.0018F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(137, 47).mirror().addBox(-1.2114F, -0.7405F, -0.5855F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-2.0604F, -0.0628F, -2.666F, 0.2667F, -0.2589F, 0.0018F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(137, 44).mirror().addBox(-1.2114F, -0.0032F, -0.5011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0604F, -0.0628F, -2.666F, -0.2133F, -0.2589F, 0.0018F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(104, 134).mirror().addBox(-1.2114F, -0.8987F, -1.4068F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0604F, -0.0628F, -2.666F, 0.5721F, -0.2589F, 0.0018F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(134, 93).mirror().addBox(-1.2114F, -1.4475F, -1.541F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0604F, -0.0628F, -2.666F, -0.3878F, -0.2589F, 0.0018F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(93, 134).mirror().addBox(-1.2114F, -2.031F, -0.6287F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0604F, -0.0628F, -2.666F, 0.1358F, -0.2589F, 0.0018F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(26, 96).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2927F, 0.8776F, -4.379F, 0.0049F, -0.2589F, 0.0018F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(106, 113).mirror().addBox(-1.2039F, 0.3893F, 1.8545F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0604F, -0.0628F, -2.666F, 0.8006F, 0.0362F, 0.004F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(95, 113).mirror().addBox(-1.1701F, 0.6882F, 1.5053F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0604F, -0.0628F, -2.666F, 1.1488F, 0.0374F, -0.0107F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(126, 10).mirror().addBox(-1.1701F, -0.0942F, 1.0043F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(25, 51).mirror().addBox(-1.1701F, 0.9058F, 1.0043F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0604F, -0.0628F, -2.666F, 1.5328F, 0.0374F, -0.0107F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(27, 118).mirror().addBox(-1.1126F, -1.6839F, 0.7613F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0604F, -0.0628F, -2.666F, 1.8968F, -0.2893F, -0.0265F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(122, 73).mirror().addBox(-0.5411F, -0.3176F, -0.8278F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0009F, -1.8903F, -5.2222F, 1.103F, -0.2764F, -0.1197F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(42, 137).mirror().addBox(-0.5411F, -0.626F, 0.0437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(137, 41).mirror().addBox(-0.5411F, -0.626F, -0.4563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0009F, -1.8903F, -5.2222F, 0.8324F, -0.2764F, -0.1197F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(137, 22).mirror().addBox(-0.5411F, -0.5549F, -1.3383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0009F, -1.8903F, -5.2222F, 0.6579F, -0.2764F, -0.1197F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(107, 48).mirror().addBox(-0.2867F, -1.4119F, -2.9149F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3251F, 3.2426F, -5.4079F, 0.4412F, -0.1541F, 0.002F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(120, 20).mirror().addBox(-0.7151F, -2.3871F, -2.6799F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.0604F, -0.0628F, -2.666F, 0.1104F, -0.1835F, -0.0495F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(130, 48).mirror().addBox(-1.1493F, 1.013F, 1.6181F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(130, 45).mirror().addBox(-1.1493F, 1.013F, 1.9181F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.274F, -1.1878F, -5.8022F, -1.8251F, -0.3026F, 0.0962F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(44, 130).mirror().addBox(-1.1493F, 2.3712F, 1.1135F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.274F, -1.1878F, -5.8022F, -1.1706F, -0.3026F, 0.0962F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(119, 130).mirror().addBox(-1.1493F, 2.2761F, -1.6315F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.274F, -1.1878F, -5.8022F, 0.3566F, -0.3026F, 0.0962F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(126, 6).mirror().addBox(-1.1493F, 1.6536F, -1.4096F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.274F, -1.1878F, -5.8022F, 0.0075F, -0.3026F, 0.0962F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(85, 122).mirror().addBox(-1.1493F, 0.9201F, -0.7414F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.274F, -1.1878F, -5.8022F, -0.4288F, -0.3026F, 0.0962F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(122, 82).mirror().addBox(-1.1493F, 0.2986F, -0.3484F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.274F, -1.1878F, -5.8022F, -0.1234F, -0.3026F, 0.0962F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(68, 104).mirror().addBox(-1.1493F, -0.3376F, -0.6413F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.274F, -1.1878F, -5.8022F, 0.4438F, -0.3026F, 0.0962F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(118, 41).mirror().addBox(-1.1493F, -0.4755F, -2.5351F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.274F, -1.1878F, -5.8022F, 0.6184F, -0.3026F, 0.0962F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(63, 78).mirror().addBox(-0.975F, -0.7299F, -7.1719F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(0, 121).mirror().addBox(-0.975F, -0.7299F, -1.2219F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-1.274F, -1.1878F, -5.8022F, 0.363F, -0.2809F, 0.1333F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.3962F, 1.0047F, 0.6955F, 0.0029F, 0.0302F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(124, 137).mirror().addBox(-0.0571F, -2.0622F, -1.1445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.5398F, 0.7655F, -12.0817F, 1.3003F, -0.0785F, 0.0F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(81, 137).mirror().addBox(-0.0571F, -2.4904F, -1.7721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.5398F, 0.7655F, -12.0817F, 0.9512F, -0.0785F, 0.0F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(30, 138).mirror().addBox(-0.1F, -1.0F, -0.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.7014F, -13.0154F, -0.2452F, -0.0847F, 0.0212F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(118, 56).mirror().addBox(0.1F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4719F, -0.2499F, -11.8491F, -0.1518F, -0.1068F, -0.0273F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(117, 15).mirror().addBox(0.0F, -0.325F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9463F, -0.3473F, -7.7804F, 0.063F, -0.1487F, -0.0092F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(91, 85).mirror().addBox(0.0F, -0.5F, 0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 78).mirror().addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5343F, -0.541F, -10.5431F, -0.0679F, -0.1487F, -0.0092F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(112, 124).mirror().addBox(-0.0571F, -0.9764F, -1.2866F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5398F, 0.7655F, -12.0817F, -0.2007F, -0.0785F, 0.0F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(127, 30).mirror().addBox(-0.0571F, -0.9126F, -2.7512F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5398F, 0.7655F, -12.0817F, -0.2094F, -0.0785F, 0.0F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(113, 59).mirror().addBox(0.1195F, -0.2663F, -4.9587F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3398F, 0.8155F, -6.5567F, -0.1309F, -0.1222F, 0.0F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(116, 106).mirror().addBox(0.1195F, -0.6044F, -5.528F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.3398F, 0.8155F, -6.5567F, -0.0742F, -0.1222F, 0.0F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(27, 112).mirror().addBox(-0.4805F, 1.4544F, 1.2821F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(27, 112).addBox(2.9602F, 1.4544F, 1.2821F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.7398F, 0.8155F, -5.0567F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(49, 135).mirror().addBox(-0.5F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(49, 135).addBox(2.9907F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.7453F, 0.6159F, -1.0723F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(125, 103).mirror().addBox(-0.5055F, 1.1414F, -0.7489F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(62, 113).mirror().addBox(-0.4805F, 0.9414F, -0.7489F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(125, 103).addBox(2.9852F, 1.1414F, -0.7489F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(62, 113).addBox(2.9602F, 0.9414F, -0.7489F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.7398F, 0.8155F, -5.0567F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(19, 120).mirror().addBox(-0.6193F, -0.0979F, 2.7933F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.4278F, -3.7043F, 0.2923F, -0.0969F, 0.0654F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(87, 45).mirror().addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.4278F, -3.7043F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(86, 109).mirror().addBox(-0.4805F, -0.2947F, -1.5725F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.015F)).mirror(false)
				.texOffs(86, 109).addBox(2.9602F, -0.2947F, -1.5725F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-1.7398F, 0.8155F, -5.0567F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(11, 112).mirror().addBox(0.1195F, 0.1305F, -2.3461F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.3398F, 0.8155F, -6.5567F, -0.2967F, -0.1222F, 0.0F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(125, 99).mirror().addBox(-0.4805F, -3.9477F, 3.4736F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(125, 99).addBox(2.9602F, -3.9477F, 3.4736F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.7398F, 0.8155F, -5.0567F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(120, 15).mirror().addBox(-0.4805F, -0.5972F, 3.9774F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.015F)).mirror(false)
				.texOffs(108, 85).mirror().addBox(-0.4805F, -1.646F, -1.2613F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(120, 15).addBox(2.9602F, -0.5972F, 3.9774F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.015F))
				.texOffs(108, 85).addBox(2.9602F, -1.646F, -1.2613F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.7398F, 0.8155F, -5.0567F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(119, 119).mirror().addBox(-0.4805F, -2.7995F, 2.6399F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(119, 119).addBox(2.9602F, -2.7995F, 2.6399F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.7398F, 0.8155F, -5.0567F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(117, 90).mirror().addBox(-0.4805F, -1.9061F, 1.3641F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.015F)).mirror(false)
				.texOffs(117, 90).addBox(2.9602F, -1.9061F, 1.3641F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-1.7398F, 0.8155F, -5.0567F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(53, 111).mirror().addBox(0.1195F, -1.4067F, -2.5761F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-2.3398F, 0.8155F, -6.5567F, 0.2705F, -0.1222F, 0.0F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(124, 137).addBox(-0.9429F, -2.0622F, -1.1445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.5398F, 0.7655F, -12.0817F, 1.3003F, 0.0785F, 0.0F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(81, 137).addBox(-0.9429F, -2.4904F, -1.7721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.5398F, 0.7655F, -12.0817F, 0.9512F, 0.0785F, 0.0F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(131, 76).addBox(-1.5F, -0.0214F, -0.0535F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 0.0092F, -15.6067F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(30, 138).addBox(0.1F, -1.0F, -0.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.7014F, -13.0154F, -0.2452F, 0.0847F, -0.0212F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(118, 56).addBox(-0.1F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4719F, -0.2499F, -11.8491F, -0.1518F, 0.1068F, 0.0273F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(117, 15).addBox(0.0F, -0.325F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9463F, -0.3473F, -7.7804F, 0.063F, 0.1487F, 0.0092F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(91, 85).addBox(0.0F, -0.5F, 0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 78).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5343F, -0.541F, -10.5431F, -0.0679F, 0.1487F, 0.0092F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(37, 135).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8256F, -14.4735F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(131, 61).addBox(-1.5F, -1.0293F, -1.4267F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.39F, -14.2157F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(112, 124).addBox(-0.9429F, -0.9764F, -1.2866F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5398F, 0.7655F, -12.0817F, -0.2007F, 0.0785F, 0.0F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(127, 30).addBox(-0.9429F, -0.9126F, -2.7512F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5398F, 0.7655F, -12.0817F, -0.2094F, 0.0785F, 0.0F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(113, 59).addBox(-1.1195F, -0.2663F, -4.9587F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3398F, 0.8155F, -6.5567F, -0.1309F, 0.1222F, 0.0F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(116, 106).addBox(-1.1195F, -0.6044F, -5.528F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.3398F, 0.8155F, -6.5567F, -0.0742F, 0.1222F, 0.0F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(19, 120).addBox(0.6193F, -0.0979F, 2.7933F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4278F, -3.7043F, 0.2923F, 0.0969F, -0.0654F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(87, 45).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4278F, -3.7043F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(11, 112).addBox(-1.1195F, 0.1305F, -2.3461F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.3398F, 0.8155F, -6.5567F, -0.2967F, 0.1222F, 0.0F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(53, 111).addBox(-1.1195F, -1.4067F, -2.5761F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(2.3398F, 0.8155F, -6.5567F, 0.2705F, 0.1222F, 0.0F));

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