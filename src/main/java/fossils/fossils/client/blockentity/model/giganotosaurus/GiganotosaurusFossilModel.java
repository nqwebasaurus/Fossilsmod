package fossils.fossils.client.blockentity.model.giganotosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GiganotosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart tail1;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail8;
	private final ModelPart tail3;
	private final ModelPart tail9;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail10;
	private final ModelPart bone;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart bone2;
	private final ModelPart bone5;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck;
	private final ModelPart neck6;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public GiganotosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone3 = this.hips.getChild("bone3");
		this.bone4 = this.hips.getChild("bone4");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.tail1 = this.hips.getChild("tail1");
		this.tail = this.tail1.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail8 = this.tail2.getChild("tail8");
		this.tail3 = this.tail8.getChild("tail3");
		this.tail9 = this.tail3.getChild("tail9");
		this.tail4 = this.tail9.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail10 = this.tail7.getChild("tail10");
		this.bone = this.tail1.getChild("bone");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.bone2 = this.chest.getChild("bone2");
		this.bone5 = this.chest.getChild("bone5");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck5 = this.neck2.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck = this.neck3.getChild("neck");
		this.neck6 = this.neck.getChild("neck6");
		this.head = this.neck6.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -34.4345F, -0.3005F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(113, 40).addBox(0.0F, -6.2F, -0.025F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.19F, 6.7542F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(41, 109).addBox(-0.006F, -6.4F, 0.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4176F, 3.797F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(66, 104).addBox(-0.006F, -6.4F, 0.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7052F, 0.8108F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(9, 106).addBox(-0.006F, -6.3F, 0.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9927F, -2.1753F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0322F, 1.3974F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1056F, 5.5703F, 4.3211F, -0.0436F, 0.0F, 0.1309F));

		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(57, 57).addBox(-0.5827F, 3.7931F, -9.2175F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6795F, -11.3078F, 5.3864F, -0.222F, -0.0321F, -0.4016F));

		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(29, 87).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7065F, -11.5363F, 0.8049F, -0.222F, -0.0321F, -0.4016F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(88, 11).addBox(-0.5F, -1.6F, -3.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0322F, -7.502F, 3.9614F, 0.513F, -0.0327F, -0.4104F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(70, 75).addBox(-0.5F, -1.5F, -3.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.3449F, -8.1037F, 5.3897F, 0.0942F, -0.0327F, -0.4104F));

		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(137, 53).addBox(-0.5F, -2.0F, -2.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(122, 0).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9111F, -9.0924F, 8.296F, 1.3377F, -0.0391F, -0.4053F));

		PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(121, 120).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2538F, -10.0614F, 6.5803F, 1.0323F, -0.0391F, -0.4053F));

		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(40, 119).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4339F, -10.6694F, 4.6835F, -0.3203F, -0.0391F, -0.4053F));

		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(143, 103).addBox(-0.5F, -0.15F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3665F, 4.6452F, 12.9528F, -0.8422F, 0.0163F, -0.1146F));

		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(143, 106).addBox(-0.9813F, -0.9132F, 0.0488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8854F, 5.1277F, 11.663F, -0.3186F, 0.0163F, -0.1146F));

		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(124, 129).addBox(-0.9813F, -0.0132F, -0.9512F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5536F, 2.4425F, 10.2798F, 0.7722F, 0.0163F, -0.1146F));

		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(119, 129).addBox(-0.9813F, -0.0132F, -0.9512F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5536F, 2.4425F, 10.2798F, 0.9468F, 0.0133F, -0.113F));

		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(43, 79).addBox(-0.9813F, -0.2132F, -0.9512F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.058F, -1.2541F, 4.5938F, 0.9904F, 0.0133F, -0.113F));

		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(138, 101).addBox(-0.5F, 0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2956F, -0.9439F, 3.2971F, 1.2252F, -0.0858F, 0.1519F));

		PartDefinition cube_r19 = bone3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(117, 138).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2956F, -0.9439F, 3.2971F, 1.487F, -0.0858F, 0.1519F));

		PartDefinition cube_r20 = bone3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(66, 129).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.173F, -1.5433F, 2.9427F, 1.3125F, -0.0858F, 0.1519F));

		PartDefinition cube_r21 = bone3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(63, 114).addBox(-1.0708F, -3.0898F, 3.3647F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.058F, 0.0959F, 4.8938F, 2.2437F, -0.0313F, 0.1956F));

		PartDefinition cube_r22 = bone3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(76, 140).addBox(-1.142F, -4.0626F, -0.3421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2216F, -0.7702F, 4.1234F, 0.9806F, -0.0911F, 0.1489F));

		PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(133, 31).addBox(-0.5F, -1.475F, -0.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1966F, -3.7077F, 2.1058F, 0.2097F, -0.0767F, 0.0803F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(132, 129).addBox(-0.5F, -0.825F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0562F, -2.7908F, 2.137F, 0.5094F, -0.0911F, 0.1489F));

		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(54, 97).addBox(-1.142F, -3.7627F, -0.2921F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2216F, -0.7702F, 4.1234F, 0.8148F, -0.0911F, 0.1489F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(119, 33).addBox(-0.5F, -1.6F, -2.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3134F, -5.767F, 2.4536F, 0.462F, 0.0639F, 0.0248F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(30, 79).addBox(-0.5F, -0.8F, -4.1F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.2212F, -4.6951F, 1.4277F, -0.1488F, 0.0639F, 0.0248F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(49, 78).addBox(-0.5F, -2.075F, -3.1F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0277F, -0.7296F, -1.8396F, -1.2309F, 0.0639F, 0.0248F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(135, 137).addBox(-0.5F, 1.5F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(14, 123).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.57F, 9.3962F, -3.2597F, -1.5263F, 0.0461F, -0.1729F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(77, 131).addBox(-0.5238F, -0.6836F, -0.9147F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4805F, 10.1146F, -8.363F, -1.0899F, 0.0461F, -0.1729F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(78, 125).addBox(-0.5F, -4.0F, -1.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(143, 50).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5408F, 11.5855F, -10.9219F, -1.5699F, 0.0461F, -0.1729F));

		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(48, 143).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6153F, 11.7479F, -9.938F, -1.7444F, 0.0461F, -0.1729F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(143, 29).addBox(-0.5063F, -1.0471F, -0.8815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.599F, 11.6305F, -9.9855F, -1.6043F, 0.0401F, -0.1744F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(3, 142).addBox(-0.5F, 0.0F, -3.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(113, 14).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.7094F, 11.1492F, -5.0356F, -2.7388F, 0.0401F, -0.1744F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(107, 80).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.6885F, 11.7122F, -7.9822F, -2.9569F, 0.0401F, -0.1744F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(74, 143).addBox(-0.5063F, -1.9965F, -0.7965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.599F, 11.6305F, -9.9855F, -1.5171F, 0.0401F, -0.1744F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(31, 130).addBox(-0.5F, -2.1F, -0.475F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3752F, 9.6088F, -8.2088F, -0.6798F, 0.0461F, -0.1729F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(130, 26).addBox(-0.5238F, -2.5556F, 0.7426F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.4805F, 10.1146F, -8.363F, -0.1736F, 0.0461F, -0.1729F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(133, 101).addBox(-0.6F, -1.0F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4722F, 8.9768F, -5.6616F, 0.7846F, 0.0682F, -0.1655F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(33, 123).addBox(-0.5F, -1.5F, -0.625F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 120).addBox(-0.5F, -1.5F, -0.025F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1447F, 5.8389F, -5.9218F, -0.3669F, 0.0624F, -0.1677F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(14, 130).addBox(-0.4901F, -0.6934F, -1.4113F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.171F, 0.599F, -3.8097F, -0.1317F, 0.0668F, 0.0151F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(123, 95).addBox(-0.4901F, -0.6052F, 0.0134F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.171F, 0.599F, -3.8097F, -0.3935F, 0.0668F, 0.0151F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(55, 123).addBox(-0.4901F, -0.6052F, -0.9866F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.171F, 0.599F, -3.8097F, -0.3062F, 0.0668F, 0.0151F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(49, 71).addBox(-0.5F, -2.0F, -1.075F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0023F, -1.458F, -4.2958F, 0.2177F, 0.0639F, 0.0248F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(123, 27).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0545F, -5.9383F, -2.8594F, 0.0257F, 0.0639F, 0.0248F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(109, 23).addBox(-0.5F, -1.15F, 0.4F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0059F, -6.6421F, -4.0774F, -0.6288F, 0.0639F, 0.0248F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(57, 67).addBox(-0.3844F, -0.3139F, -1.6767F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0524F, -7.1541F, -1.5538F, -0.1925F, 0.0639F, 0.0248F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(137, 128).addBox(-0.9819F, -2.4083F, -3.8165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.2232F, -11.5228F, -4.672F, 1.6842F, -0.3289F, -0.3595F));

		PartDefinition cube_r49 = bone3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(116, 84).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.3769F, -7.7534F, -6.6674F, 2.3736F, -0.3289F, -0.3595F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(21, 122).addBox(-0.9819F, -1.3481F, -3.4282F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.2232F, -11.5228F, -4.672F, 1.3439F, -0.3289F, -0.3595F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(14, 110).addBox(-0.9819F, -0.039F, -1.9676F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2232F, -11.5228F, -4.672F, 0.5847F, -0.3289F, -0.3595F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(99, 6).addBox(0.1F, 0.15F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.284F, -11.6692F, -2.2886F, 0.2343F, -0.3037F, -0.3808F));

		PartDefinition cube_r53 = bone3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(95, 28).addBox(-0.58F, 0.205F, 1.0796F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.6795F, -12.0078F, -3.2136F, -0.0562F, -0.0321F, -0.4016F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1056F, 3.5707F, 4.2862F, -0.0436F, 0.0F, -0.1309F));

		PartDefinition cube_r54 = bone4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(57, 57).mirror().addBox(-0.4173F, 3.7931F, -9.2175F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6795F, -9.3081F, 5.4213F, -0.222F, 0.0321F, 0.4016F));

		PartDefinition cube_r55 = bone4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(29, 87).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7065F, -9.5367F, 0.8398F, -0.222F, 0.0321F, 0.4016F));

		PartDefinition cube_r56 = bone4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(88, 11).mirror().addBox(-0.5F, -1.6F, -3.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0322F, -5.5023F, 3.9963F, 0.513F, 0.0327F, 0.4104F));

		PartDefinition cube_r57 = bone4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(70, 75).mirror().addBox(-0.5F, -1.5F, -3.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.3449F, -6.104F, 5.4246F, 0.0942F, 0.0327F, 0.4104F));

		PartDefinition cube_r58 = bone4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(137, 53).mirror().addBox(-0.5F, -2.0F, -2.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(122, 0).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9111F, -7.0927F, 8.3309F, 1.3377F, 0.0391F, 0.4053F));

		PartDefinition cube_r59 = bone4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(121, 120).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2538F, -8.0617F, 6.6153F, 1.0323F, 0.0391F, 0.4053F));

		PartDefinition cube_r60 = bone4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(40, 119).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4339F, -8.6697F, 4.7184F, -0.3203F, 0.0391F, 0.4053F));

		PartDefinition cube_r61 = bone4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(143, 103).mirror().addBox(-0.5F, -0.15F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3665F, 6.6449F, 12.9877F, -0.8422F, -0.0163F, 0.1146F));

		PartDefinition cube_r62 = bone4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(143, 106).mirror().addBox(-0.0187F, -0.9132F, 0.0488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8854F, 7.1274F, 11.6979F, -0.3186F, -0.0163F, 0.1146F));

		PartDefinition cube_r63 = bone4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(124, 129).mirror().addBox(-0.0187F, -0.0132F, -0.9512F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5536F, 4.4422F, 10.3147F, 0.7722F, -0.0163F, 0.1146F));

		PartDefinition cube_r64 = bone4.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(119, 129).mirror().addBox(-0.0187F, -0.0132F, -0.9512F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5536F, 4.4422F, 10.3147F, 0.9468F, -0.0133F, 0.113F));

		PartDefinition cube_r65 = bone4.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(43, 79).mirror().addBox(-0.0187F, -0.2132F, -0.9512F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.058F, 0.7456F, 4.6287F, 0.9904F, -0.0133F, 0.113F));

		PartDefinition cube_r66 = bone4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(138, 101).mirror().addBox(-0.5F, 0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2956F, 1.0558F, 3.332F, 1.2252F, 0.0858F, -0.1519F));

		PartDefinition cube_r67 = bone4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(117, 138).mirror().addBox(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2956F, 1.0558F, 3.332F, 1.487F, 0.0858F, -0.1519F));

		PartDefinition cube_r68 = bone4.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(66, 129).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.173F, 0.4564F, 2.9776F, 1.3125F, 0.0858F, -0.1519F));

		PartDefinition cube_r69 = bone4.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(63, 114).mirror().addBox(0.0708F, -3.0898F, 3.3647F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.058F, 2.0956F, 4.9287F, 2.2437F, 0.0313F, -0.1956F));

		PartDefinition cube_r70 = bone4.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(76, 140).mirror().addBox(0.142F, -4.0626F, -0.3421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2216F, 1.2295F, 4.1583F, 0.9806F, 0.0911F, -0.1489F));

		PartDefinition cube_r71 = bone4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(133, 31).mirror().addBox(-0.5F, -1.475F, -0.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1966F, -1.708F, 2.1407F, 0.2097F, 0.0767F, -0.0803F));

		PartDefinition cube_r72 = bone4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(132, 129).mirror().addBox(-0.5F, -0.825F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0562F, -0.7911F, 2.1719F, 0.5094F, 0.0911F, -0.1489F));

		PartDefinition cube_r73 = bone4.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(54, 97).mirror().addBox(0.142F, -3.7627F, -0.2921F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2216F, 1.2295F, 4.1583F, 0.8148F, 0.0911F, -0.1489F));

		PartDefinition cube_r74 = bone4.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(119, 33).mirror().addBox(-0.5F, -1.6F, -2.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3134F, -3.7673F, 2.4886F, 0.462F, -0.0639F, -0.0248F));

		PartDefinition cube_r75 = bone4.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(30, 79).mirror().addBox(-0.5F, -0.8F, -4.1F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2212F, -2.6954F, 1.4626F, -0.1488F, -0.0639F, -0.0248F));

		PartDefinition cube_r76 = bone4.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(49, 78).mirror().addBox(-0.5F, -2.075F, -3.1F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0277F, 1.2701F, -1.8047F, -1.2309F, -0.0639F, -0.0248F));

		PartDefinition cube_r77 = bone4.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(135, 137).mirror().addBox(-0.5F, 1.5F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(14, 123).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.57F, 11.3958F, -3.2248F, -1.5263F, -0.0461F, 0.1729F));

		PartDefinition cube_r78 = bone4.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(77, 131).mirror().addBox(-0.4762F, -0.6836F, -0.9147F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4805F, 12.1143F, -8.3281F, -1.0899F, -0.0461F, 0.1729F));

		PartDefinition cube_r79 = bone4.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(78, 125).mirror().addBox(-0.5F, -4.0F, -1.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(143, 50).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5408F, 13.5852F, -10.887F, -1.5699F, -0.0461F, 0.1729F));

		PartDefinition cube_r80 = bone4.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(48, 143).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6153F, 13.7476F, -9.903F, -1.7444F, -0.0461F, 0.1729F));

		PartDefinition cube_r81 = bone4.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(143, 29).mirror().addBox(-0.4937F, -1.0471F, -0.8815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.599F, 13.6302F, -9.9505F, -1.6043F, -0.0401F, 0.1744F));

		PartDefinition cube_r82 = bone4.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(3, 142).mirror().addBox(-0.5F, 0.0F, -3.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(113, 14).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7094F, 13.1489F, -5.0007F, -2.7388F, -0.0401F, 0.1744F));

		PartDefinition cube_r83 = bone4.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(107, 80).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6885F, 13.7119F, -7.9473F, -2.9569F, -0.0401F, 0.1744F));

		PartDefinition cube_r84 = bone4.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(74, 143).mirror().addBox(-0.4937F, -1.9965F, -0.7965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.599F, 13.6302F, -9.9505F, -1.5171F, -0.0401F, 0.1744F));

		PartDefinition cube_r85 = bone4.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(31, 130).mirror().addBox(-0.5F, -2.1F, -0.475F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3752F, 11.6085F, -8.1739F, -0.6798F, -0.0461F, 0.1729F));

		PartDefinition cube_r86 = bone4.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(130, 26).mirror().addBox(-0.4762F, -2.5556F, 0.7426F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.4805F, 12.1143F, -8.3281F, -0.1736F, -0.0461F, 0.1729F));

		PartDefinition cube_r87 = bone4.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(133, 101).mirror().addBox(-0.4F, -1.0F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4722F, 10.9765F, -5.6267F, 0.7846F, -0.0682F, 0.1655F));

		PartDefinition cube_r88 = bone4.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(33, 123).mirror().addBox(-0.5F, -1.5F, -0.625F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 120).mirror().addBox(-0.5F, -1.5F, -0.025F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.1447F, 7.8386F, -5.8868F, -0.3669F, -0.0624F, 0.1677F));

		PartDefinition cube_r89 = bone4.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(14, 130).mirror().addBox(-0.5099F, -0.6934F, -1.4113F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.171F, 2.5987F, -3.7748F, -0.1317F, -0.0668F, -0.0151F));

		PartDefinition cube_r90 = bone4.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(123, 95).mirror().addBox(-0.5099F, -0.6052F, 0.0134F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.171F, 2.5987F, -3.7748F, -0.3935F, -0.0668F, -0.0151F));

		PartDefinition cube_r91 = bone4.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(55, 123).mirror().addBox(-0.5099F, -0.6052F, -0.9866F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.171F, 2.5987F, -3.7748F, -0.3062F, -0.0668F, -0.0151F));

		PartDefinition cube_r92 = bone4.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(49, 71).mirror().addBox(-0.5F, -2.0F, -1.075F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0023F, 0.5417F, -4.2609F, 0.2177F, -0.0639F, -0.0248F));

		PartDefinition cube_r93 = bone4.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(123, 27).mirror().addBox(-0.5F, -1.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0545F, -3.9386F, -2.8245F, 0.0257F, -0.0639F, -0.0248F));

		PartDefinition cube_r94 = bone4.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(109, 23).mirror().addBox(-0.5F, -1.15F, 0.4F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0059F, -4.6424F, -4.0425F, -0.6288F, -0.0639F, -0.0248F));

		PartDefinition cube_r95 = bone4.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(57, 67).mirror().addBox(-0.6156F, -0.3139F, -1.6767F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.0524F, -5.1544F, -1.5189F, -0.1925F, -0.0639F, -0.0248F));

		PartDefinition cube_r96 = bone4.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(137, 128).mirror().addBox(-0.0181F, -2.4083F, -3.8165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.2232F, -9.5231F, -4.6371F, 1.6842F, 0.3289F, 0.3595F));

		PartDefinition cube_r97 = bone4.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(116, 84).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.3769F, -5.7537F, -6.6325F, 2.3736F, 0.3289F, 0.3595F));

		PartDefinition cube_r98 = bone4.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(21, 122).mirror().addBox(-0.0181F, -1.3481F, -3.4282F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.2232F, -9.5231F, -4.6371F, 1.3439F, 0.3289F, 0.3595F));

		PartDefinition cube_r99 = bone4.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(14, 110).mirror().addBox(-0.0181F, -0.039F, -1.9676F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.2232F, -9.5231F, -4.6371F, 0.5847F, 0.3289F, 0.3595F));

		PartDefinition cube_r100 = bone4.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(99, 6).mirror().addBox(-1.1F, 0.15F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.284F, -9.6695F, -2.2537F, 0.2343F, 0.3037F, 0.3808F));

		PartDefinition cube_r101 = bone4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(95, 28).mirror().addBox(-0.42F, 0.205F, 1.0796F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.6795F, -10.0082F, -3.1787F, -0.0562F, 0.0321F, 0.4016F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 1.2098F, 4.0094F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg1.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(90, 131).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0F, 13.8131F, -1.3377F, -1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg1.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(116, 23).addBox(-1.5F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.0F, 14.7267F, -1.7445F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg1.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(109, 94).addBox(-1.5F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0F, 15.278F, -3.667F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg1.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(95, 18).addBox(-1.0F, -7.9F, -1.0F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5F, 9.6208F, -2.2666F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg1.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(112, 123).addBox(-5.1F, -2.0807F, -0.518F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.6F, 13.2054F, -1.8045F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg1.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(28, 110).addBox(-5.1F, -2.532F, 0.2317F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6F, 12.2778F, -3.7694F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg1.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(7, 81).addBox(-1.0F, -1.0F, 0.825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.5F, 10.1078F, -4.2797F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg1.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(69, 94).addBox(-1.0F, -8.0F, 0.0F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, 10.1078F, -4.2797F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg1.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(21, 110).addBox(-5.1F, -5.032F, -0.7683F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.6F, 15.1773F, -3.82F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightLeg1.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(5, 138).addBox(-0.5F, -0.0843F, -0.9038F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 5.1355F, -0.752F, -3.0456F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightLeg1.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(0, 132).addBox(-0.5F, -0.5365F, -0.2291F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5F, 5.1355F, -0.752F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r113 = rightLeg1.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(52, 103).addBox(-5.1F, -2.0863F, -1.9195F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.6F, 3.4214F, 0.6287F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r114 = rightLeg1.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(76, 92).addBox(-1.5F, -1.6F, -0.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.1302F, 0.171F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r115 = rightLeg1.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(82, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5F, 2.0207F, -2.3915F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r116 = rightLeg1.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(108, 49).addBox(-1.0F, 0.7F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5F, 1.0127F, -1.0785F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 15.3105F, -2.4224F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r117 = rightLeg2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(117, 6).addBox(-1.1F, 1.5764F, -0.6545F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.2F, 1.8472F, -0.5117F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r118 = rightLeg2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(7, 122).addBox(-1.1F, -0.8465F, -1.0797F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.2F, 1.8472F, -0.5117F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r119 = rightLeg2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(83, 80).addBox(-1.0F, 0.1F, -2.3F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3F, 1.1606F, -0.8554F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r120 = rightLeg2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(76, 99).addBox(-1.0F, -0.425F, -0.65F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3F, -0.5975F, -1.523F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r121 = rightLeg2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(96, 80).addBox(-0.1F, -0.5F, -2.1F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r122 = rightLeg2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(99, 36).addBox(-0.1F, -1.175F, -2.875F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 1.2304F, 1.8973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r123 = rightLeg2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(99, 13).addBox(-0.1F, -0.5F, -1.9F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r124 = rightLeg2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(0, 124).addBox(-1.1F, 8.9387F, 1.5893F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.2F, 1.8472F, -0.5117F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r125 = rightLeg2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(107, 110).addBox(-1.1F, 6.1996F, -0.2091F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.2F, 1.8472F, -0.5117F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r126 = rightLeg2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(109, 86).addBox(-1.0F, -3.0F, -0.55F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.3F, 6.6262F, -0.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r127 = rightLeg2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(118, 90).addBox(-1.1F, -1.1916F, 0.5297F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.2F, 1.8472F, -0.5117F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r128 = rightLeg2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(60, 78).addBox(-1.1F, -0.8318F, 0.0813F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.2F, 1.8472F, -0.5117F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r129 = rightLeg2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(56, 118).addBox(-1.1F, 0.0274F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 0.0472F, 0.5883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r130 = rightLeg2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(28, 122).addBox(-1.1F, -0.009F, -0.9593F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.4F, 7.8674F, 0.2497F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r131 = rightLeg2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(114, 110).addBox(-1.1F, -0.209F, -0.1593F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.4F, 2.0197F, -0.0418F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(89, 86).addBox(-1.0F, 0.0554F, -0.5239F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.4036F, -1.2747F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r132 = rightLeg3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(30, 137).addBox(0.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, 0.1309F));

		PartDefinition cube_r133 = rightLeg3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(129, 11).addBox(0.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.9F, 3.5554F, -0.0239F, 0.0F, 0.0F, 0.1309F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(0, 59).addBox(-1.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 6.999F, 0.1898F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(42, 39).addBox(-2.5F, -0.8F, -4.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7254F, -3.9319F, 0.0038F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 1.2098F, 4.0094F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r134 = leftLeg1.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(112, 131).addBox(-0.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.0F, 13.8131F, -1.3377F, -1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r135 = leftLeg1.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(116, 80).addBox(-0.5F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.0F, 14.7267F, -1.7445F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r136 = leftLeg1.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(113, 19).addBox(-0.5F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.0F, 15.278F, -3.667F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r137 = leftLeg1.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(36, 95).addBox(-1.0F, -7.9F, -1.0F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.5F, 9.6208F, -2.2666F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r138 = leftLeg1.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(38, 124).addBox(3.1F, -2.0807F, -0.518F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-5.6F, 13.2054F, -1.8045F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r139 = leftLeg1.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(0, 112).addBox(3.1F, -2.532F, 0.2317F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.6F, 12.2778F, -3.7694F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r140 = leftLeg1.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(129, 76).addBox(-1.0F, -1.0F, 0.825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.5F, 10.1078F, -4.2797F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r141 = leftLeg1.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(0, 95).addBox(-1.0F, -8.0F, 0.0F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5F, 10.1078F, -4.2797F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r142 = leftLeg1.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(100, 111).addBox(3.1F, -5.032F, -0.7683F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-5.6F, 15.1773F, -3.82F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r143 = leftLeg1.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(19, 138).addBox(-0.5F, -0.0843F, -0.9038F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 5.1355F, -0.752F, -3.0456F, 0.0F, 0.0F));

		PartDefinition cube_r144 = leftLeg1.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(36, 132).addBox(-0.5F, -0.5365F, -0.2291F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.5F, 5.1355F, -0.752F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r145 = leftLeg1.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(59, 103).addBox(3.1F, -2.0863F, -1.9195F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-5.6F, 3.4214F, 0.6287F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r146 = leftLeg1.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(93, 43).addBox(-1.5F, -1.6F, -0.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 0.1302F, 0.171F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r147 = leftLeg1.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(82, 30).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.5F, 2.0207F, -2.3915F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r148 = leftLeg1.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(109, 70).addBox(-1.0F, 0.7F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.5F, 1.0127F, -1.0785F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 15.3105F, -2.4224F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r149 = leftLeg2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(14, 117).addBox(-0.9F, 1.5764F, -0.6545F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.2F, 1.8472F, -0.5117F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r150 = leftLeg2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(122, 17).addBox(-0.9F, -0.8465F, -1.0797F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2F, 1.8472F, -0.5117F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r151 = leftLeg2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(76, 86).addBox(-1.0F, 0.1F, -2.3F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3F, 1.1606F, -0.8554F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r152 = leftLeg2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(102, 18).addBox(-1.0F, -0.425F, -0.65F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, -0.5975F, -1.523F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r153 = leftLeg2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(98, 70).addBox(-1.9F, -0.5F, -2.1F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.2F, 0.3526F, 0.2482F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r154 = leftLeg2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(87, 101).addBox(-1.9F, -1.175F, -2.875F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 1.2304F, 1.8973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r155 = leftLeg2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(25, 101).addBox(-1.9F, -0.5F, -1.9F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2F, 0.3526F, 0.2482F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r156 = leftLeg2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(124, 49).addBox(-0.9F, 8.9387F, 1.5893F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.2F, 1.8472F, -0.5117F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r157 = leftLeg2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(86, 112).addBox(-0.9F, 6.1996F, -0.2091F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.2F, 1.8472F, -0.5117F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r158 = leftLeg2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(110, 6).addBox(-1.0F, -3.0F, -0.55F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.3F, 6.6262F, -0.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r159 = leftLeg2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(0, 119).addBox(-0.9F, -1.1916F, 0.5297F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.2F, 1.8472F, -0.5117F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r160 = leftLeg2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(0, 81).addBox(-0.9F, -0.8318F, 0.0813F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.2F, 1.8472F, -0.5117F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r161 = leftLeg2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(118, 68).addBox(0.1F, 0.0274F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 0.0472F, 0.5883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r162 = leftLeg2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(107, 122).addBox(0.1F, -0.009F, -0.9593F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.4F, 7.8674F, 0.2497F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r163 = leftLeg2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(35, 115).addBox(0.1F, -0.209F, -0.1593F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.4F, 2.0197F, -0.0418F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(7, 90).addBox(-2.0F, 0.0554F, -0.5239F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.4036F, -1.2747F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r164 = leftLeg3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(61, 137).addBox(-1.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, -0.1309F));

		PartDefinition cube_r165 = leftLeg3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(26, 129).addBox(-1.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.9F, 3.5554F, -0.0239F, 0.0F, 0.0F, -0.1309F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(65, 39).addBox(-4.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 6.999F, 0.1898F, 0.4102F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(46, 23).addBox(-3.5F, -0.8F, -4.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7254F, -3.9319F, 0.0038F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1626F, 8.8231F, -0.3052F, -0.0131F, -0.0416F));

		PartDefinition cube_r166 = tail1.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(104, 128).addBox(0.0F, -0.2F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2878F, 8.5295F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r167 = tail1.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(67, 78).addBox(0.5F, 0.5871F, -0.1754F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.8299F, 3.2583F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r168 = tail1.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(38, 49).addBox(0.5F, 0.2871F, -0.8754F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.096F, 5.5805F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r169 = tail1.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(125, 40).addBox(0.5F, -5.8573F, -0.1162F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.1588F, 6.7807F, 0.0305F, 0.0F, 0.0F));

		PartDefinition cube_r170 = tail1.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(76, 104).addBox(0.5F, -5.9073F, -0.0162F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.5208F, 3.7257F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r171 = tail1.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(71, 104).addBox(0.497F, -5.8323F, -1.0162F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2471F, 1.7357F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r172 = tail1.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(50, 10).mirror().addBox(-2.3F, -0.5F, 1.0F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0111F, -0.1038F, 0.1573F, 0.0517F, 0.0082F));

		PartDefinition cube_r173 = tail1.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(50, 10).addBox(-0.7F, -0.5F, 1.0F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0111F, -0.1038F, 0.1573F, -0.0517F, -0.0082F));

		PartDefinition cube_r174 = tail1.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(25, 27).addBox(0.0F, -1.9F, 0.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.9157F, -0.0618F, 0.1571F, 0.0F, 0.0F));

		PartDefinition tail = tail1.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.4998F, 8.6946F, 0.0809F, 0.1776F, -0.0288F));

		PartDefinition cube_r175 = tail.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(61, 46).mirror().addBox(-2.4F, -0.5F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.0382F, 0.9544F, 0.1571F, 0.0259F, 0.0041F));

		PartDefinition cube_r176 = tail.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(61, 46).addBox(0.4F, -0.5F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -0.0382F, 0.9544F, 0.1571F, -0.0259F, -0.0041F));

		PartDefinition cube_r177 = tail.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(21, 59).addBox(0.0F, -1.9F, 9.1F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5F, 2.4308F, -8.8805F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r178 = tail.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(130, 101).addBox(0.0F, -0.3F, -0.3F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.3858F, 7.2538F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r179 = tail.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(55, 130).addBox(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7395F, 4.0982F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r180 = tail.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(129, 129).addBox(0.0F, 0.4F, -0.3F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.903F, 1.7675F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r181 = tail.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(60, 123).addBox(0.5F, -5.4073F, -0.0162F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.6262F, 5.7753F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r182 = tail.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(87, 119).addBox(0.5F, -5.4073F, -0.0162F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.6262F, 3.7753F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r183 = tail.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(84, 119).addBox(0.5F, -5.6823F, -0.0162F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.2832F, 1.8024F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r184 = tail.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(47, 118).addBox(0.5F, -5.8073F, -0.0162F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.0395F, -0.1826F, -0.1047F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.4624F, 6.8232F, 0.1418F, 0.1728F, 0.0245F));

		PartDefinition cube_r185 = tail2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(52, 127).addBox(0.0F, -4.8561F, -0.0316F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8424F, 7.0228F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r186 = tail2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(45, 131).addBox(0.0F, -5.0561F, 0.0684F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0254F, 4.9307F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r187 = tail2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(22, 131).addBox(0.0F, -5.0061F, -0.1316F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1823F, 3.1376F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r188 = tail2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(19, 131).addBox(0.0F, -5.0811F, 0.0684F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.374F, 0.946F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r189 = tail2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(0, 49).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.005F))
				.texOffs(48, 0).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.426F, 1.046F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r190 = tail2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(10, 131).addBox(0.0F, -0.4F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6829F, 2.6141F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r191 = tail2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(41, 132).addBox(0.0F, -1.2F, 0.1F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2847F, 6.9508F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r192 = tail2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(7, 131).addBox(0.0F, 0.0F, -0.2F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4489F, 4.297F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r193 = tail2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(38, 57).mirror().addBox(-1.6F, -0.5F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5302F, -0.4738F, 1.0278F, 0.0175F, 0.0262F, 0.0005F));

		PartDefinition cube_r194 = tail2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(38, 57).addBox(-0.4F, -0.5F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5302F, -0.4738F, 1.0278F, 0.0175F, -0.0262F, -0.0005F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7776F, 8.1476F, 0.0264F, -0.1309F, -0.0034F));

		PartDefinition cube_r195 = tail8.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-1.4F, 0.0F, -0.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3376F, 0.9727F, 0.0175F, 0.0349F, 0.0006F));

		PartDefinition cube_r196 = tail8.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(0, 65).addBox(-0.6F, 0.0F, -0.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3376F, 0.9727F, 0.0175F, -0.0349F, -0.0006F));

		PartDefinition cube_r197 = tail8.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(29, 12).addBox(-0.5F, -1.9F, 7.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2035F, -7.1016F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r198 = tail8.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(95, 106).addBox(0.0F, 4.6F, 3.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 57).addBox(0.0F, 2.4F, 1.7F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 134).addBox(0.0F, 0.8F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7643F, 2.89F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r199 = tail8.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(134, 15).addBox(0.0F, -0.2F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2632F, 1.244F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r200 = tail8.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(40, 139).addBox(0.0F, -3.2811F, -0.0316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 6.8984F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r201 = tail8.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(134, 9).addBox(0.0F, -3.5561F, -0.1316F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 4.9984F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r202 = tail8.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(132, 133).addBox(0.0F, -3.9061F, -0.0316F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 2.8984F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r203 = tail8.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(87, 132).addBox(0.0F, -4.1561F, -0.0316F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 0.8984F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2223F, 8.9023F, 0.0268F, -0.2181F, -0.0058F));

		PartDefinition cube_r204 = tail3.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(110, 14).addBox(0.0F, -1.9128F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 90).addBox(0.0F, -2.2128F, 2.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 5.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r205 = tail3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(15, 73).addBox(0.0F, -2.0628F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 3.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r206 = tail3.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(98, 140).addBox(0.0F, -2.2628F, 0.0016F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 1.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r207 = tail3.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(95, 140).addBox(0.0F, -2.6128F, 0.0016F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.1037F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r208 = tail3.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(84, 140).addBox(0.0F, 2.7F, 3.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 140).addBox(0.0F, 1.5F, 1.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 139).addBox(0.0F, 0.2F, -0.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.332F, 2.3058F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r209 = tail3.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(21, 39).mirror().addBox(-1.5F, 0.6F, 0.2F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0349F, 0.0018F));

		PartDefinition cube_r210 = tail3.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(21, 39).addBox(0.5F, 0.6F, 0.2F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, -0.0349F, -0.0018F));

		PartDefinition cube_r211 = tail3.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(0, 38).addBox(-0.5F, 0.1F, 0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail9 = tail3.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7389F, 8.8298F, -0.0181F, -0.2618F, 0.0047F));

		PartDefinition cube_r212 = tail9.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(67, 30).addBox(-0.5F, 0.1F, 9.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0951F, -9.1335F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r213 = tail9.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(63, 111).addBox(0.0F, -1.05F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7103F, 5.0517F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r214 = tail9.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(143, 109).addBox(0.0F, -1.325F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5232F, 3.058F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r215 = tail9.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(87, 138).addBox(0.0F, 6.7F, 9.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 138).addBox(0.0F, 5.4F, 7.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 140).addBox(0.0F, 4.0F, 5.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0709F, -6.524F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r216 = tail9.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(87, 143).addBox(0.0F, -1.425F, -0.025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.487F, 1.0827F, -0.1134F, 0.0F, 0.0F));

		PartDefinition tail4 = tail9.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3811F, 5.9106F, 0.0743F, -0.3482F, -0.0254F));

		PartDefinition cube_r217 = tail4.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(26, 144).addBox(0.0F, -0.525F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2883F, 5.0293F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r218 = tail4.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(23, 144).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3581F, 3.0305F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r219 = tail4.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(13, 144).addBox(0.0F, -0.9F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 1.2316F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r220 = tail4.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(122, 140).addBox(0.0F, -0.25F, 0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(140, 116).addBox(0.0F, -1.65F, -1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0108F, 3.2718F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r221 = tail4.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(19, 69).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 0.2316F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(74, 56).addBox(-0.5F, -0.5698F, -0.2226F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F))
				.texOffs(29, 144).addBox(0.0F, -0.9448F, 0.7774F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3471F, 6.1912F, -0.0193F, -0.4363F, 0.0081F));

		PartDefinition cube_r222 = tail5.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(143, 121).addBox(0.0F, 4.25F, 6.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(143, 113).addBox(0.0F, 1.95F, 2.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6637F, -2.9195F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r223 = tail5.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(143, 117).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4277F, 2.9853F, 0.6021F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(19, 49).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5056F, 5.6774F, -0.0271F, -0.2617F, 0.007F));

		PartDefinition cube_r224 = tail6.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(32, 144).addBox(0.0F, 8.45F, 12.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 18).addBox(0.0F, 7.25F, 10.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(143, 132).addBox(0.0F, 5.25F, 8.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1693F, -8.5969F, 0.6021F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(69, 22).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.1377F, 0.008F, -0.2652F));

		PartDefinition cube_r225 = tail7.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(38, 144).addBox(0.0F, 10.65F, 16.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 144).addBox(0.0F, 9.65F, 14.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1693F, -16.4969F, 0.6021F, 0.0F, 0.0F));

		PartDefinition tail10 = tail7.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(70, 67).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0223F, 5.9976F, -0.1577F, 0.3451F, -0.0537F));

		PartDefinition bone = tail1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -8.333F, 7.5531F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1802F, -3.1023F, 0.0175F, -0.0873F, -0.0015F));

		PartDefinition cube_r226 = body.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(36, 105).addBox(-0.503F, -6.1022F, -1.0364F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2486F, -3.8492F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r227 = body.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(95, 111).addBox(-0.503F, -6.0022F, -2.0364F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3533F, -5.8465F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r228 = body.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(104, 23).addBox(-0.503F, -6.1522F, -0.0364F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1091F, -1.8541F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r229 = body.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(42, 46).addBox(-1.0F, 0.0F, 1.9F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.669F, -9.7704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r230 = body.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(0, 27).addBox(-3.5F, -3.3668F, 2.3086F, 7.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.1247F, -10.8153F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r231 = body.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(135, 99).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -3.9704F, 0.1004F, 0.0962F, -0.6389F));

		PartDefinition cube_r232 = body.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(43, 95).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -3.9704F, 0.0503F, 0.1296F, -1.0768F));

		PartDefinition cube_r233 = body.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(104, 33).mirror().addBox(-7.74F, -2.3355F, -0.4915F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -3.9704F, -0.0312F, 0.1354F, -1.6756F));

		PartDefinition cube_r234 = body.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(60, 92).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.119F, -0.9704F, -0.0534F, -0.019F, -0.6448F));

		PartDefinition cube_r235 = body.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(119, 38).mirror().addBox(-5.74F, -2.3355F, -0.4915F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.119F, -0.9704F, -0.0113F, -0.0556F, -1.6748F));

		PartDefinition cube_r236 = body.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(92, 9).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.119F, -0.9704F, -0.0404F, -0.0398F, -1.0809F));

		PartDefinition cube_r237 = body.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(136, 51).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -6.9704F, 0.2183F, 0.1561F, -0.4685F));

		PartDefinition cube_r238 = body.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(90, 136).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -6.9704F, 0.1322F, 0.2334F, -0.9064F));

		PartDefinition cube_r239 = body.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(82, 7).mirror().addBox(-9.6882F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -6.9704F, -0.0239F, 0.2666F, -1.5186F));

		PartDefinition cube_r240 = body.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(82, 7).addBox(2.6881F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -6.9704F, -0.0239F, -0.2666F, 1.5186F));

		PartDefinition cube_r241 = body.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(90, 136).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -6.9704F, 0.1322F, -0.2334F, 0.9064F));

		PartDefinition cube_r242 = body.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(136, 51).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -6.9704F, 0.2183F, -0.1561F, 0.4685F));

		PartDefinition cube_r243 = body.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(92, 9).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.119F, -0.9704F, -0.0404F, 0.0398F, 1.0809F));

		PartDefinition cube_r244 = body.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(119, 38).addBox(2.74F, -2.3355F, -0.4915F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.119F, -0.9704F, -0.0113F, 0.0556F, 1.6748F));

		PartDefinition cube_r245 = body.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(60, 92).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.119F, -0.9704F, -0.0534F, 0.019F, 0.6448F));

		PartDefinition cube_r246 = body.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(104, 33).addBox(2.74F, -2.3355F, -0.4915F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -3.9704F, -0.0312F, -0.1354F, 1.6756F));

		PartDefinition cube_r247 = body.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(43, 95).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -3.9704F, 0.0503F, -0.1296F, 1.0768F));

		PartDefinition cube_r248 = body.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(135, 99).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -3.9704F, 0.1004F, -0.0962F, 0.6389F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(27, 0).addBox(-0.5F, -1.1F, -9.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3765F, -7.7702F, 0.0176F, -0.1309F, -0.0023F));

		PartDefinition cube_r249 = body2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(81, 104).addBox(0.0F, -5.9122F, -1.0627F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0895F, -1.9945F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r250 = body2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(51, 111).addBox(0.0F, -5.2117F, -0.8614F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9992F, -8.195F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r251 = body2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(46, 109).addBox(0.0F, -5.7367F, -0.9614F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0263F, -5.0951F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r252 = body2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(61, 54).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.0697F, 0.3775F, -1.3847F));

		PartDefinition cube_r253 = body2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(76, 84).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.2732F, 0.2727F, -0.7669F));

		PartDefinition cube_r254 = body2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(86, 43).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.3602F, 0.1347F, -0.3437F));

		PartDefinition cube_r255 = body2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(109, 31).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.4102F, 0.1516F, -0.3016F));

		PartDefinition cube_r256 = body2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(111, 68).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.3131F, 0.3083F, -0.7205F));

		PartDefinition cube_r257 = body2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(50, 18).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.081F, 0.4287F, -1.3453F));

		PartDefinition cube_r258 = body2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(73, 19).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.0238F, 0.2979F, -1.4438F));

		PartDefinition cube_r259 = body2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(113, 61).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.1892F, 0.2327F, -0.8318F));

		PartDefinition cube_r260 = body2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(133, 117).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.2689F, 0.1321F, -0.3998F));

		PartDefinition cube_r261 = body2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(133, 117).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.2689F, -0.1321F, 0.3998F));

		PartDefinition cube_r262 = body2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(0, 15).addBox(-3.5F, -2.2555F, -4.5635F, 7.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.446F, -3.2803F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r263 = body2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(113, 61).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.1892F, -0.2327F, 0.8318F));

		PartDefinition cube_r264 = body2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(73, 19).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.0238F, -0.2979F, 1.4438F));

		PartDefinition cube_r265 = body2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(50, 18).addBox(2.6881F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.081F, -0.4287F, 1.3453F));

		PartDefinition cube_r266 = body2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(111, 68).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.3131F, -0.3083F, 0.7205F));

		PartDefinition cube_r267 = body2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(109, 31).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.4102F, -0.1516F, 0.3016F));

		PartDefinition cube_r268 = body2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(86, 43).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.3602F, -0.1347F, 0.3437F));

		PartDefinition cube_r269 = body2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(76, 84).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.2732F, -0.2727F, 0.7669F));

		PartDefinition cube_r270 = body2.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(61, 54).addBox(2.6881F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.0697F, -0.3775F, 1.3847F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8461F, -9.0012F, 0.1051F, -0.0868F, -0.0091F));

		PartDefinition cube_r271 = chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(119, 110).addBox(-0.5F, -2.2141F, -0.0945F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.9391F, -1.9368F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r272 = chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(63, 125).addBox(0.0F, -5.0525F, -0.1399F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0609F, -1.8368F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r273 = chest.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(71, 131).addBox(0.0F, -4.7217F, -0.0424F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0609F, -3.9368F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r274 = chest.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(29, 23).addBox(-4.9365F, 0.1974F, -1.2304F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9365F, 11.3277F, -5.9079F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r275 = chest.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(15, 77).mirror().addBox(-1.4539F, 0.3925F, -5.4555F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9365F, 11.3277F, -5.9079F, -0.7488F, -0.3643F, 0.3198F));

		PartDefinition cube_r276 = chest.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(134, 63).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6891F, -1.4368F, 0.2954F, 0.1035F, -0.2656F));

		PartDefinition cube_r277 = chest.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(134, 65).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6891F, -1.4368F, 0.226F, 0.2177F, -0.6926F));

		PartDefinition cube_r278 = chest.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(50, 20).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6891F, -1.4368F, 0.0636F, 0.3061F, -1.301F));

		PartDefinition cube_r279 = chest.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(71, 9).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7391F, -3.4368F, 0.0741F, 0.339F, -1.3517F));

		PartDefinition cube_r280 = chest.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(134, 67).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7391F, -3.4368F, 0.2537F, 0.239F, -0.7403F));

		PartDefinition cube_r281 = chest.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(134, 69).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7391F, -3.4368F, 0.3289F, 0.1117F, -0.316F));

		PartDefinition cube_r282 = chest.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(74, 64).mirror().addBox(-9.6882F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -5.3368F, 0.0926F, 0.3873F, -1.3828F));

		PartDefinition cube_r283 = chest.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(134, 71).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -5.3368F, 0.297F, 0.2685F, -0.7672F));

		PartDefinition cube_r284 = chest.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(134, 73).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -5.3368F, 0.3796F, 0.1214F, -0.3479F));

		PartDefinition cube_r285 = chest.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(90, 134).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -7.3368F, 0.4222F, 0.1552F, -0.4283F));

		PartDefinition cube_r286 = chest.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(107, 134).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -7.3368F, 0.3229F, 0.3164F, -0.846F));

		PartDefinition cube_r287 = chest.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(100, 61).mirror().addBox(-7.6882F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -7.3368F, 0.0841F, 0.4407F, -1.4725F));

		PartDefinition cube_r288 = chest.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(100, 61).addBox(2.6881F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -7.3368F, 0.0841F, -0.4407F, 1.4725F));

		PartDefinition cube_r289 = chest.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(107, 134).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -7.3368F, 0.3229F, -0.3164F, 0.846F));

		PartDefinition cube_r290 = chest.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(90, 134).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -7.3368F, 0.4222F, -0.1552F, 0.4283F));

		PartDefinition cube_r291 = chest.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(58, 131).addBox(0.0F, -4.4927F, -0.2837F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2391F, -7.7368F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r292 = chest.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(134, 73).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -5.3368F, 0.3796F, -0.1214F, 0.3479F));

		PartDefinition cube_r293 = chest.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(134, 71).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -5.3368F, 0.297F, -0.2685F, 0.7672F));

		PartDefinition cube_r294 = chest.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(74, 64).addBox(2.6881F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -5.3368F, 0.0926F, -0.3873F, 1.3828F));

		PartDefinition cube_r295 = chest.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(134, 69).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7391F, -3.4368F, 0.3289F, -0.1117F, 0.316F));

		PartDefinition cube_r296 = chest.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(134, 67).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7391F, -3.4368F, 0.2537F, -0.239F, 0.7403F));

		PartDefinition cube_r297 = chest.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(71, 9).addBox(2.6881F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7391F, -3.4368F, 0.0741F, -0.339F, 1.3517F));

		PartDefinition cube_r298 = chest.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(50, 20).addBox(2.6881F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6891F, -1.4368F, 0.0636F, -0.3061F, 1.301F));

		PartDefinition cube_r299 = chest.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(134, 65).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6891F, -1.4368F, 0.226F, -0.2177F, 0.6926F));

		PartDefinition cube_r300 = chest.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(38, 65).addBox(-3.0F, 0.0117F, -7.416F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 14.8118F, 4.1957F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r301 = chest.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(134, 63).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6891F, -1.4368F, 0.2954F, -0.1035F, 0.2656F));

		PartDefinition cube_r302 = chest.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(48, 131).addBox(0.0F, -4.7927F, -0.2837F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2391F, -5.7368F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r303 = chest.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(15, 77).addBox(-0.5461F, 0.3925F, -5.4555F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9365F, 11.3277F, -5.9079F, -0.7488F, 0.3643F, -0.3198F));

		PartDefinition cube_r304 = chest.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(91, 63).mirror().addBox(-6.4763F, 1.2332F, -0.8208F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9365F, 11.3277F, -5.9079F, 0.356F, 1.1049F, 0.5245F));

		PartDefinition cube_r305 = chest.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(99, 41).mirror().addBox(-5.2F, 0.0F, -0.8F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8839F, 12.3258F, -5.6423F, 0.2555F, 0.9192F, 1.0269F));

		PartDefinition cube_r306 = chest.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(99, 41).addBox(0.2F, 0.0F, -0.8F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8839F, 12.3258F, -5.6423F, 0.2555F, -0.9192F, -1.0269F));

		PartDefinition cube_r307 = chest.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(91, 63).addBox(0.4763F, 1.2332F, -0.8208F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9365F, 11.3277F, -5.9079F, 0.356F, -1.1049F, -0.5245F));

		PartDefinition cube_r308 = chest.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(7, 84).addBox(-2.9365F, 0.3925F, -5.0268F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9365F, 11.3277F, -5.9079F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r309 = chest.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(67, 0).addBox(-0.5F, -0.1119F, -5.8679F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1609F, -2.0368F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3535F, 5.0271F, -5.7978F, -0.079F, 0.0981F, -0.1959F));

		PartDefinition cube_r310 = bone2.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(98, 86).addBox(-0.9453F, -1.1885F, 0.0157F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.9555F, -0.9822F, -0.4595F, 0.9295F, -0.0148F, -0.0092F));

		PartDefinition cube_r311 = bone2.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(66, 125).addBox(-0.9453F, -2.2253F, 3.6137F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9555F, -0.9822F, -0.4595F, 0.6589F, -0.0148F, -0.0092F));

		PartDefinition cube_r312 = bone2.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(142, 6).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4335F, -5.9329F, 1.9785F, 1.9853F, 0.0027F, -0.0172F));

		PartDefinition cube_r313 = bone2.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(90, 127).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4534F, -4.5501F, 0.5337F, 0.7636F, 0.0027F, -0.0172F));

		PartDefinition cube_r314 = bone2.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(127, 72).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4757F, -3.0466F, -0.785F, 0.8508F, 0.0027F, -0.0172F));

		PartDefinition cube_r315 = bone2.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(142, 9).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.53F, 0.4187F, -2.7717F, 1.2435F, 0.0027F, -0.0172F));

		PartDefinition cube_r316 = bone2.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(112, 127).addBox(-0.5F, -0.1F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5015F, -1.3748F, -1.887F, 1.1126F, 0.0027F, -0.0172F));

		PartDefinition cube_r317 = bone2.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(125, 53).addBox(-0.9433F, -1.489F, -0.522F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9555F, -0.9822F, -0.4595F, 0.9381F, 0.0027F, -0.0172F));

		PartDefinition cube_r318 = bone2.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(25, 95).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5491F, 1.5157F, -2.8839F, 1.1432F, 0.003F, -0.0172F));

		PartDefinition cube_r319 = bone2.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(44, 138).addBox(-0.425F, -1.05F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0982F, 2.9226F, -2.5249F, 1.0297F, 0.1346F, 0.2175F));

		PartDefinition cube_r320 = bone2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(104, 43).addBox(-0.1317F, 2.5826F, -2.2852F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9181F, 2.5781F, -2.9873F, 0.0351F, 0.5144F, 1.282F));

		PartDefinition cube_r321 = bone2.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(110, 35).addBox(-1.0673F, 1.7238F, -2.2852F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9181F, 2.5781F, -2.9873F, -0.159F, 0.4925F, 0.8837F));

		PartDefinition cube_r322 = bone2.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(123, 102).addBox(-1.0673F, -0.2729F, -2.8494F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9181F, 2.5781F, -2.9873F, 0.5827F, 0.4925F, 0.8837F));

		PartDefinition cube_r323 = bone2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(28, 117).addBox(-1.0673F, -0.8336F, -1.9078F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9181F, 2.5781F, -2.9873F, 1.2372F, 0.4925F, 0.8837F));

		PartDefinition cube_r324 = bone2.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(138, 104).addBox(-1.1422F, -1.2384F, -0.2062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9555F, 2.6178F, -2.4595F, 1.0512F, 0.0827F, 0.2417F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3535F, 5.0271F, -5.7978F, -0.079F, -0.0981F, 0.1959F));

		PartDefinition cube_r325 = bone5.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(98, 86).mirror().addBox(-0.0547F, -1.1885F, 0.0157F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9555F, -0.9822F, -0.4595F, 0.9295F, 0.0148F, 0.0092F));

		PartDefinition cube_r326 = bone5.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(66, 125).mirror().addBox(-0.0547F, -2.2253F, 3.6137F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9555F, -0.9822F, -0.4595F, 0.6589F, 0.0148F, 0.0092F));

		PartDefinition cube_r327 = bone5.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(142, 6).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4335F, -5.9329F, 1.9785F, 1.9853F, -0.0027F, 0.0172F));

		PartDefinition cube_r328 = bone5.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(90, 127).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4534F, -4.5501F, 0.5337F, 0.7636F, -0.0027F, 0.0172F));

		PartDefinition cube_r329 = bone5.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(127, 72).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4757F, -3.0466F, -0.785F, 0.8508F, -0.0027F, 0.0172F));

		PartDefinition cube_r330 = bone5.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(142, 9).mirror().addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.53F, 0.4187F, -2.7717F, 1.2435F, -0.0027F, 0.0172F));

		PartDefinition cube_r331 = bone5.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(112, 127).mirror().addBox(-0.5F, -0.1F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5015F, -1.3748F, -1.887F, 1.1126F, -0.0027F, 0.0172F));

		PartDefinition cube_r332 = bone5.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(125, 53).mirror().addBox(-0.0567F, -1.489F, -0.522F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9555F, -0.9822F, -0.4595F, 0.9381F, -0.0027F, 0.0172F));

		PartDefinition cube_r333 = bone5.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(25, 95).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5491F, 1.5157F, -2.8839F, 1.1432F, -0.003F, 0.0172F));

		PartDefinition cube_r334 = bone5.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(44, 138).mirror().addBox(-0.575F, -1.05F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.0982F, 2.9226F, -2.5249F, 1.0297F, -0.1346F, -0.2175F));

		PartDefinition cube_r335 = bone5.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(104, 43).mirror().addBox(-0.8683F, 2.5826F, -2.2852F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9181F, 2.5781F, -2.9873F, 0.0351F, -0.5144F, -1.282F));

		PartDefinition cube_r336 = bone5.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(110, 35).mirror().addBox(0.0673F, 1.7238F, -2.2852F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9181F, 2.5781F, -2.9873F, -0.159F, -0.4925F, -0.8837F));

		PartDefinition cube_r337 = bone5.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(123, 102).mirror().addBox(0.0673F, -0.2729F, -2.8494F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9181F, 2.5781F, -2.9873F, 0.5827F, -0.4925F, -0.8837F));

		PartDefinition cube_r338 = bone5.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(28, 117).mirror().addBox(0.0673F, -0.8336F, -1.9078F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9181F, 2.5781F, -2.9873F, 1.2372F, -0.4925F, -0.8837F));

		PartDefinition cube_r339 = bone5.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(138, 104).mirror().addBox(0.1422F, -1.2384F, -0.2062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9555F, 2.6178F, -2.4595F, 1.0512F, -0.0827F, -0.2417F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.7927F, 9.4815F, -8.1801F, 0.3158F, 0.0432F, -0.2341F));

		PartDefinition cube_r340 = leftArm1.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(102, 139).addBox(-0.2F, -0.625F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3037F, 0.0186F, 0.0503F, -0.8463F, -0.2207F, -0.0253F));

		PartDefinition cube_r341 = leftArm1.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(119, 134).addBox(-0.5F, -1.9F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5706F, 1.1418F, -1.0192F, -0.3218F, -0.7676F, 0.1498F));

		PartDefinition cube_r342 = leftArm1.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(137, 8).addBox(-0.5F, -1.7F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5706F, 1.1418F, -1.0192F, -0.6272F, -0.7676F, 0.1498F));

		PartDefinition cube_r343 = leftArm1.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(114, 134).addBox(6.0F, -1.0842F, 0.4838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.2F, 1.1847F, -1.6107F, -0.4204F, -0.0786F, -0.067F));

		PartDefinition cube_r344 = leftArm1.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(142, 82).addBox(-0.5F, -0.425F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3F, 3.8413F, -0.3535F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r345 = leftArm1.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(66, 134).addBox(-0.5F, -1.9F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3F, 3.5346F, 0.1087F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(90, 119).addBox(-0.8F, -1.2307F, -0.4734F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 125).addBox(-0.8F, -0.4307F, -1.5734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.601F, 5.0694F, -0.7678F, -1.15F, -0.6327F, -0.0802F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3159F, 3.9465F, 0.2145F, -0.0873F, 0.0F, 0.1745F));

		PartDefinition cube_r346 = leftHand.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(16, 94).addBox(0.0F, -2.5F, -0.2F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r347 = leftHand.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(116, 98).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 0.2032F, -1.2796F, -0.576F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.7927F, 9.4815F, -8.1801F, 0.2971F, -0.2618F, 0.1543F));

		PartDefinition cube_r348 = rightArm1.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(49, 140).addBox(-0.8F, -0.625F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3037F, 0.0186F, 0.0503F, -0.8463F, 0.2207F, 0.0253F));

		PartDefinition cube_r349 = rightArm1.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(25, 137).addBox(-0.5F, -1.9F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5706F, 1.1418F, -1.0192F, -0.3218F, 0.7676F, -0.1498F));

		PartDefinition cube_r350 = rightArm1.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(137, 20).addBox(-0.5F, -1.7F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5706F, 1.1418F, -1.0192F, -0.6272F, 0.7676F, -0.1498F));

		PartDefinition cube_r351 = rightArm1.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(137, 16).addBox(-7.0F, -1.0842F, 0.4838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.2F, 1.1847F, -1.6107F, -0.4204F, 0.0786F, 0.067F));

		PartDefinition cube_r352 = rightArm1.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(142, 85).addBox(-0.5F, -0.425F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3F, 3.8413F, -0.3535F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r353 = rightArm1.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(137, 12).addBox(-0.5F, -1.9F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.3F, 3.5346F, 0.1087F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(50, 120).addBox(-0.2F, -1.2307F, -0.4734F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(128, 114).addBox(-0.2F, -0.4307F, -1.5734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.601F, 5.0694F, -0.7678F, -1.6234F, 0.6351F, 0.185F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3159F, 3.9465F, 0.2145F, -0.0873F, 0.0F, -0.1745F));

		PartDefinition cube_r354 = rightHand.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(60, 94).addBox(-1.0F, -2.5F, -0.2F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r355 = rightHand.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(116, 104).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 0.2032F, -1.2796F, -0.576F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8698F, -7.7672F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r356 = neck1.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(74, 131).addBox(0.0F, -4.3459F, -0.016F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0311F, -1.8666F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r357 = neck1.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(124, 9).mirror().addBox(-5.6882F, -2.8327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.0549F, 0.9381F, -1.6998F));

		PartDefinition cube_r358 = neck1.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(25, 135).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.6804F, 0.7081F, -0.8741F));

		PartDefinition cube_r359 = neck1.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(135, 26).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.8756F, 0.3979F, -0.5097F));

		PartDefinition cube_r360 = neck1.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(135, 26).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.8756F, -0.3979F, 0.5097F));

		PartDefinition cube_r361 = neck1.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(25, 135).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.6804F, -0.7081F, 0.8741F));

		PartDefinition cube_r362 = neck1.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(124, 9).addBox(2.6881F, -2.8327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.0549F, -0.9381F, 1.6998F));

		PartDefinition cube_r363 = neck1.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(98, 105).addBox(-0.5F, -0.7F, 3.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.6719F, -5.6579F, 0.3142F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9438F, -2.3258F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r364 = neck2.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(16, 135).addBox(0.0F, -3.7816F, -0.0991F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1431F, -0.7163F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r365 = neck2.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(135, 28).mirror().addBox(-1.9081F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, 0.2054F, 0.5609F, -1.0212F));

		PartDefinition cube_r366 = neck2.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(125, 57).mirror().addBox(-4.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, -0.0822F, 0.5885F, -1.5418F));

		PartDefinition cube_r367 = neck2.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(125, 57).addBox(1.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, -0.0822F, -0.5885F, 1.5418F));

		PartDefinition cube_r368 = neck2.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(135, 28).addBox(-0.0919F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, 0.2054F, -0.5609F, 1.0212F));

		PartDefinition cube_r369 = neck2.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(43, 103).addBox(-0.5F, 1.4F, 5.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3859F, -7.7876F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3606F, -2.3471F, -0.3153F, -0.083F, 0.027F));

		PartDefinition cube_r370 = neck5.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(0, 106).addBox(-0.5F, 1.4F, 3.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.9754F, -5.9788F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r371 = neck5.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(125, 68).mirror().addBox(-4.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -0.9742F, -0.2704F, 1.1208F, -1.6737F));

		PartDefinition cube_r372 = neck5.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(135, 35).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -0.9742F, 0.581F, 1.0455F, -0.7259F));

		PartDefinition cube_r373 = neck5.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(135, 37).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9742F, 0.463F, 0.9843F, -0.8263F));

		PartDefinition cube_r374 = neck5.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(125, 70).mirror().addBox(-4.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9742F, -0.2529F, 1.0339F, -1.6583F));

		PartDefinition cube_r375 = neck5.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(125, 70).addBox(1.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9742F, -0.2529F, -1.0339F, 1.6583F));

		PartDefinition cube_r376 = neck5.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(135, 37).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9742F, 0.463F, -0.9843F, 0.8263F));

		PartDefinition cube_r377 = neck5.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(135, 35).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -0.9742F, 0.581F, -1.0455F, 0.7259F));

		PartDefinition cube_r378 = neck5.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(125, 68).addBox(1.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -0.9742F, -0.2704F, -1.1208F, 1.6737F));

		PartDefinition cube_r379 = neck5.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(125, 140).addBox(0.0F, -3.4566F, -0.1491F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6059F, -2.9414F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r380 = neck5.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(124, 134).addBox(0.0F, -3.3566F, -0.1491F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8842F, -0.9608F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0819F, -2.7815F, -0.2633F, -0.1289F, 0.0229F));

		PartDefinition cube_r381 = neck4.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(135, 39).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, 0.6221F, 0.9947F, -0.6856F));

		PartDefinition cube_r382 = neck4.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(135, 41).mirror().addBox(-3.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, -0.1495F, 1.1066F, -1.5599F));

		PartDefinition cube_r383 = neck4.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(135, 43).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, 0.508F, 0.9362F, -0.7795F));

		PartDefinition cube_r384 = neck4.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(135, 45).mirror().addBox(-3.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, -0.1513F, 1.0193F, -1.5615F));

		PartDefinition cube_r385 = neck4.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(135, 45).addBox(1.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, -0.1513F, -1.0193F, 1.5615F));

		PartDefinition cube_r386 = neck4.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(135, 43).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, 0.508F, -0.9362F, 0.7795F));

		PartDefinition cube_r387 = neck4.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(135, 41).addBox(1.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, -0.1495F, -1.1066F, 1.5599F));

		PartDefinition cube_r388 = neck4.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(135, 39).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, 0.6221F, -0.9947F, 0.6856F));

		PartDefinition cube_r389 = neck4.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(140, 132).addBox(0.0F, -1.8677F, -0.0582F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4916F, -3.9211F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r390 = neck4.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(128, 140).addBox(0.0F, -2.2677F, -0.0582F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2697F, -1.931F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r391 = neck4.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(40, 88).addBox(-0.5F, 1.4F, 0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9504F, -3.9173F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5407F, -3.7756F, 0.6922F, -0.3189F, -0.2333F));

		PartDefinition cube_r392 = neck3.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(135, 83).mirror().addBox(-1.8547F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.3534F, -3.4609F, 0.3293F, 0.5553F, -1.0638F));

		PartDefinition cube_r393 = neck3.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(137, 24).mirror().addBox(-3.8842F, -0.3479F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.3534F, -3.4609F, 0.0326F, 0.6359F, -1.584F));

		PartDefinition cube_r394 = neck3.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(135, 85).mirror().addBox(-1.8351F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.3306F, 0.5553F, -1.0103F));

		PartDefinition cube_r395 = neck3.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(135, 87).mirror().addBox(-3.8627F, -0.3478F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.0339F, 0.6365F, -1.5305F));

		PartDefinition cube_r396 = neck3.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(135, 87).addBox(1.8627F, -0.3478F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.0339F, -0.6365F, 1.5305F));

		PartDefinition cube_r397 = neck3.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(135, 85).addBox(-0.1649F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.3306F, -0.5553F, 1.0103F));

		PartDefinition cube_r398 = neck3.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(137, 24).addBox(1.8842F, -0.3479F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3534F, -3.4609F, 0.0326F, -0.6359F, 1.584F));

		PartDefinition cube_r399 = neck3.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(135, 83).addBox(-0.1453F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3534F, -3.4609F, 0.3293F, -0.5553F, 1.0638F));

		PartDefinition cube_r400 = neck3.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(143, 136).addBox(0.5F, -1.7458F, -0.0223F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.6988F, -3.1055F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r401 = neck3.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(140, 137).addBox(0.5F, -1.869F, 0.0228F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.887F, -1.3144F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r402 = neck3.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(89, 56).addBox(0.0F, 1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -1.3168F, 1.7621F, -0.48F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6682F, -3.2726F, -0.2634F, -0.1072F, -0.0612F));

		PartDefinition cube_r403 = neck.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(135, 93).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4212F, -1.621F, 0.7519F, 0.9336F, -0.8163F));

		PartDefinition cube_r404 = neck.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(135, 95).mirror().addBox(-3.6944F, -0.3859F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4212F, -1.621F, 0.0657F, 1.1202F, -1.6041F));

		PartDefinition cube_r405 = neck.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(135, 95).addBox(1.6944F, -0.3859F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4212F, -1.621F, 0.0657F, -1.1202F, 1.6041F));

		PartDefinition cube_r406 = neck.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(0, 141).addBox(0.5F, -2.1207F, -0.1013F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8514F, -1.8891F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r407 = neck.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(106, 0).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0315F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r408 = neck.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(135, 93).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4212F, -1.621F, 0.7519F, -0.9336F, 0.8163F));

		PartDefinition neck6 = neck.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.15F, -2.45F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r409 = neck6.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(106, 63).mirror().addBox(-2.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5212F, -1.221F, 0.0783F, 0.876F, -1.5935F));

		PartDefinition cube_r410 = neck6.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(135, 97).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5212F, -1.221F, 0.5254F, 0.741F, -0.9857F));

		PartDefinition cube_r411 = neck6.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(106, 63).addBox(1.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.0783F, -0.876F, 1.5935F));

		PartDefinition cube_r412 = neck6.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(13, 135).addBox(0.5F, -2.6207F, -0.0013F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8375F, -1.0498F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r413 = neck6.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(120, 59).addBox(0.0F, 1.3815F, -2.2683F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r414 = neck6.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(135, 97).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.5254F, -0.741F, 0.9857F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0889F, -1.6354F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r415 = head.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(98, 76).addBox(-2.0F, -0.831F, -0.05F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.0167F))
				.texOffs(85, 70).addBox(-2.0F, -1.131F, -0.05F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.0F, -1.4099F, -2.6888F, -1.7322F, 0.0F, 0.0F));

		PartDefinition cube_r416 = head.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(86, 37).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(0.0F, -1.4768F, -2.8128F, -1.3744F, 0.0F, 0.0F));

		PartDefinition cube_r417 = head.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(100, 65).addBox(-1.5F, -1.9875F, -0.0549F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(0.0F, -0.535F, -7.1914F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r418 = head.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(100, 56).addBox(-1.5F, -0.0224F, -0.027F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.5519F, -7.1711F, -1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r419 = head.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(86, 106).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 2.6094F, -13.5455F, -1.0516F, 0.0F, 0.0F));

		PartDefinition cube_r420 = head.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(111, 75).addBox(-1.0F, 0.8141F, -0.1061F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.1231F, -8.9711F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r421 = head.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(25, 106).addBox(-1.5F, -0.0686F, -0.0641F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 0.1231F, -8.9711F, -1.1214F, 0.0F, 0.0F));

		PartDefinition cube_r422 = head.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(97, 136).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.005F, 3.7746F, -15.1286F, 2.2035F, 0.0F, 0.0F));

		PartDefinition cube_r423 = head.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(142, 12).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.005F, 4.5544F, -15.7545F, 0.8945F, 0.0F, 0.0F));

		PartDefinition cube_r424 = head.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(135, 141).addBox(-0.5025F, -2.0064F, -0.1696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0025F, 6.3578F, -16.6504F, -0.5454F, 0.0F, 0.0F));

		PartDefinition cube_r425 = head.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(115, 141).addBox(-0.5025F, -1.0206F, -0.0101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0025F, 6.3578F, -16.6504F, -0.3883F, 0.0F, 0.0F));

		PartDefinition cube_r426 = head.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(90, 138).addBox(-0.4975F, 0.7508F, -1.6414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0025F, 6.5078F, -15.2504F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r427 = head.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(110, 141).addBox(-0.4975F, -1.0373F, -0.0093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0025F, 7.3578F, -16.8504F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r428 = head.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(127, 63).addBox(-0.5F, -0.7928F, -2.1384F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.8649F, -2.0891F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r429 = head.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(127, 59).addBox(-0.5F, -0.7792F, -0.8971F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.8649F, -2.0891F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r430 = head.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(45, 127).addBox(-0.5F, 0.1824F, -0.598F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.8649F, -2.0891F, 1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r431 = head.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(80, 45).addBox(-0.4975F, -0.9556F, -0.0606F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0025F, 8.2634F, -15.8651F, 0.1912F, 0.0F, 0.0F));

		PartDefinition cube_r432 = head.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(73, 11).addBox(-0.5F, -0.9815F, 0.0167F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 7.3767F, -11.0946F, 0.2872F, 0.0F, 0.0F));

		PartDefinition cube_r433 = head.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(46, 30).addBox(-1.5F, -1.9078F, 5.7018F, 3.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 7.3767F, -11.0946F, 0.1301F, 0.0F, 0.0F));

		PartDefinition cube_r434 = head.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(90, 141).addBox(-0.5F, 0.4061F, 0.2489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.8649F, -2.0891F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r435 = head.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(83, 75).addBox(-2.5F, 0.0F, -2.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.3061F, -1.2927F, 0.0722F, 0.0F, 0.0F));

		PartDefinition cube_r436 = head.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(0, 73).addBox(-2.5F, 0.4371F, -3.1968F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2775F, 1.3132F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r437 = head.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(85, 66).addBox(-1.5F, -1.025F, -2.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.9979F, -0.3737F, 1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r438 = head.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(82, 52).addBox(-2.5F, 0.0F, -2.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0075F, -0.3968F, 0.9512F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.4011F, 7.8848F, -15.7879F));

		PartDefinition cube_r439 = leftFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(133, 113).addBox(-6.2335F, 5.3151F, 0.5407F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(133, 109).addBox(-6.2335F, 5.3151F, 0.9407F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.6439F, -2.3727F, 8.8888F, 2.8491F, 1.1384F, 0.0631F));

		PartDefinition cube_r440 = leftFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(34, 71).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.2992F, -1.2179F, 5.3777F, 0.3044F, 0.0806F, 0.0509F));

		PartDefinition cube_r441 = leftFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(141, 76).addBox(-0.2671F, -8.074F, 5.1865F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.8916F, -9.1735F, 9.9984F, 2.7065F, -0.1664F, 0.5021F));

		PartDefinition cube_r442 = leftFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(141, 73).addBox(-0.2671F, 2.0069F, 7.9211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.8916F, -9.1735F, 9.9984F, -2.3986F, -0.1664F, 0.5021F));

		PartDefinition cube_r443 = leftFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(138, 110).addBox(-0.2671F, 7.437F, -0.9931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.8916F, -9.1735F, 9.9984F, -1.0721F, -0.1664F, 0.5021F));

		PartDefinition cube_r444 = leftFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(141, 70).addBox(-0.2671F, -1.3777F, -7.4505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.8916F, -9.1735F, 9.9984F, 0.551F, -0.1664F, 0.5021F));

		PartDefinition cube_r445 = leftFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(121, 115).addBox(-0.2671F, -1.6059F, -6.4609F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.8916F, -9.1735F, 9.9984F, 0.586F, -0.1664F, 0.5021F));

		PartDefinition cube_r446 = leftFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(77, 120).addBox(0.1315F, -0.6059F, -4.7295F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.8916F, -9.1735F, 9.9984F, 0.3702F, -0.0725F, 0.485F));

		PartDefinition cube_r447 = leftFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(120, 73).addBox(-0.4797F, -1.7989F, -1.1779F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(1.4317F, -8.5436F, 8.807F, 2.2007F, -0.0284F, 0.4853F));

		PartDefinition cube_r448 = leftFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(138, 113).addBox(-0.4857F, 0.0331F, -0.1731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4317F, -8.5436F, 8.807F, 2.0873F, -0.0284F, 0.4853F));

		PartDefinition cube_r449 = leftFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(143, 100).addBox(-0.4857F, 0.1167F, -0.2755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.4317F, -8.5436F, 8.807F, 2.3055F, -0.0284F, 0.4853F));

		PartDefinition cube_r450 = leftFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(35, 137).addBox(-0.4857F, -0.6697F, -1.047F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.4317F, -8.5436F, 8.807F, 2.9163F, -0.0284F, 0.4853F));

		PartDefinition cube_r451 = leftFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(61, 133).addBox(-3.6479F, 3.8709F, -2.5445F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(1.6439F, -2.3727F, 8.8888F, -2.951F, 0.0111F, 0.4979F));

		PartDefinition cube_r452 = leftFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(118, 54).addBox(-3.6106F, -1.469F, -6.3977F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(1.6439F, -2.3727F, 8.8888F, -1.7763F, 0.1821F, 0.4625F));

		PartDefinition cube_r453 = leftFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(19, 127).addBox(-0.9943F, -1.2844F, 2.8368F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2439F, -2.3727F, 13.2888F, 0.0741F, 0.0174F, -0.0174F));

		PartDefinition cube_r454 = leftFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(138, 107).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2459F, -0.3114F, -0.4247F, 0.1851F, 0.106F, 0.0299F));

		PartDefinition cube_r455 = leftFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(137, 89).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0337F, 0.3704F, 1.4985F, 0.0717F, 0.106F, 0.0299F));

		PartDefinition cube_r456 = leftFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(54, 138).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1413F, 0.4388F, 0.5067F, 1.5116F, 0.106F, 0.0299F));

		PartDefinition cube_r457 = leftFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(107, 129).addBox(-0.49F, -0.4469F, -2.6208F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2713F, -2.5557F, 3.6365F, 0.1589F, 0.106F, 0.0299F));

		PartDefinition cube_r458 = leftFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(98, 98).addBox(-0.49F, -0.5737F, -1.8499F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2713F, -2.5557F, 3.6365F, 0.2418F, 0.106F, 0.0299F));

		PartDefinition cube_r459 = leftFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(97, 132).addBox(-0.5F, -0.025F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2307F, -1.662F, -0.6617F, 1.3021F, 0.106F, 0.0299F));

		PartDefinition cube_r460 = leftFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(111, 63).addBox(-0.49F, -3.5277F, 2.5235F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2713F, -2.5557F, 3.6365F, 0.2986F, 0.106F, 0.0299F));

		PartDefinition cube_r461 = leftFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(84, 21).addBox(-0.49F, -2.9703F, -0.653F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2713F, -2.5557F, 3.6365F, 0.4731F, 0.106F, 0.0299F));

		PartDefinition cube_r462 = leftFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(107, 98).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0469F, -3.3775F, 0.3205F, 2.4366F, 0.106F, 0.0299F));

		PartDefinition cube_r463 = leftFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(70, 120).addBox(-0.5F, -1.65F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0007F, -1.678F, 1.2326F, 1.0403F, 0.106F, 0.0299F));

		PartDefinition cube_r464 = leftFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(82, 136).addBox(-0.8593F, -0.4469F, -10.3597F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1939F, -2.0227F, 9.2888F, 0.2027F, 0.1049F, 0.0336F));

		PartDefinition cube_r465 = leftFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(132, 79).addBox(-0.8593F, -0.2719F, -9.4097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2939F, -2.0227F, 9.2888F, 0.2027F, 0.1049F, 0.0336F));

		PartDefinition cube_r466 = leftFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(77, 136).addBox(-0.8593F, -0.2943F, -8.4303F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2939F, -2.0227F, 9.2888F, 0.2551F, 0.1049F, 0.0336F));

		PartDefinition cube_r467 = leftFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(136, 75).addBox(-0.9093F, -0.5101F, -7.4485F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2939F, -2.0227F, 9.2888F, 0.3075F, 0.1049F, 0.0336F));

		PartDefinition cube_r468 = leftFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(136, 47).addBox(-0.9093F, -0.9091F, -6.4695F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2939F, -2.0227F, 9.2888F, 0.3947F, 0.1049F, 0.0336F));

		PartDefinition cube_r469 = leftFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(136, 4).addBox(-0.9093F, -1.0673F, -5.4549F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2939F, -2.0227F, 9.2888F, 0.4558F, 0.1049F, 0.0336F));

		PartDefinition cube_r470 = leftFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(136, 0).addBox(-0.9093F, -1.3369F, -4.4138F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2939F, -2.0227F, 9.2888F, 0.5256F, 0.1049F, 0.0336F));

		PartDefinition cube_r471 = leftFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(135, 133).addBox(-0.9093F, -1.4323F, -3.3986F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(127, 136).addBox(-0.9093F, -1.2323F, -1.1986F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(135, 119).addBox(-0.9093F, -1.2323F, -2.3986F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2939F, -2.0227F, 9.2888F, 0.5693F, 0.1049F, 0.0336F));

		PartDefinition cube_r472 = leftFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(51, 88).addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6134F, -1.0457F, 7.1805F, 0.3509F, 0.106F, 0.0299F));

		PartDefinition cube_r473 = leftFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(56, 111).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3937F, -0.4471F, 5.2849F, 0.3073F, 0.106F, 0.0299F));

		PartDefinition cube_r474 = leftFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(67, 84).addBox(-1.2953F, -5.3302F, -0.3858F, 1.0F, 6.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.6439F, -2.3727F, 8.8888F, 0.2238F, 0.237F, 0.0287F));

		PartDefinition cube_r475 = leftFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(20, 84).addBox(-1.1196F, -5.7729F, 1.4869F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6439F, -2.3727F, 8.8888F, 0.0523F, 0.1745F, -0.0002F));

		PartDefinition cube_r476 = leftFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(69, 141).addBox(-0.9566F, -6.3699F, -2.2895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.2439F, -2.3727F, 13.2888F, -0.9167F, 0.0134F, -0.0028F));

		PartDefinition cube_r477 = leftFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(137, 57).addBox(-2.9916F, -0.2766F, -6.2726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.123F)), PartPose.offsetAndRotation(2.2439F, -2.3727F, 13.2888F, -1.7737F, -0.0068F, 0.371F));

		PartDefinition cube_r478 = leftFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(125, 22).addBox(-2.9916F, -6.2693F, -1.8119F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.123F)), PartPose.offsetAndRotation(2.2439F, -2.3727F, 13.2888F, -0.4647F, -0.0068F, 0.371F));

		PartDefinition cube_r479 = leftFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(141, 67).addBox(-2.9916F, -1.971F, -6.2229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(2.2439F, -2.3727F, 13.2888F, -1.4682F, -0.0068F, 0.371F));

		PartDefinition cube_r480 = leftFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(130, 84).addBox(-3.1326F, -5.5419F, -5.3454F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(1.6439F, -2.3727F, 8.8888F, -1.2839F, 0.1671F, 0.3747F));

		PartDefinition cube_r481 = leftFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(132, 89).addBox(-5.9541F, -0.2765F, -2.4186F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(2.2439F, -2.3727F, 13.2888F, -1.7248F, 0.1328F, 1.1105F));

		PartDefinition cube_r482 = leftFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(102, 135).addBox(-5.4508F, -5.3371F, -1.6845F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(1.6439F, -2.3727F, 8.8888F, -1.2469F, -0.0687F, 1.0897F));

		PartDefinition cube_r483 = leftFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(7, 127).addBox(-0.8271F, -6.051F, 2.429F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6439F, -2.3727F, 8.8888F, -0.0112F, 0.1222F, -0.0177F));

		PartDefinition cube_r484 = leftFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(63, 120).addBox(-0.897F, -5.95F, 0.9045F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.2439F, -2.3727F, 13.2888F, 0.1649F, 0.0174F, -0.0174F));

		PartDefinition cube_r485 = leftFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(133, 124).addBox(-0.897F, -6.5376F, 0.6105F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.2439F, -2.3727F, 13.2888F, -0.1842F, 0.0174F, -0.0174F));

		PartDefinition cube_r486 = leftFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(133, 105).addBox(-0.897F, -6.7316F, -0.1364F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.2439F, -2.3727F, 13.2888F, -0.446F, 0.0174F, -0.0174F));

		PartDefinition cube_r487 = leftFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(7, 116).addBox(-0.9197F, -3.9246F, 2.2614F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.2439F, -2.3727F, 13.2888F, 0.2609F, 0.0174F, -0.0174F));

		PartDefinition cube_r488 = leftFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(129, 17).addBox(-0.9197F, -2.2339F, 3.5837F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.2439F, -2.3727F, 13.2888F, 0.4791F, 0.0174F, -0.0174F));

		PartDefinition cube_r489 = leftFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(115, 0).addBox(-0.9197F, -2.7275F, 1.9131F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2439F, -2.3727F, 13.2888F, 0.226F, 0.0174F, -0.0174F));

		PartDefinition cube_r490 = leftFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(0, 128).addBox(-0.8203F, -2.6086F, -4.4533F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.2439F, -2.3727F, 13.2888F, -1.2794F, 0.0174F, -0.0174F));

		PartDefinition cube_r491 = leftFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(126, 125).addBox(-0.8203F, -3.425F, -1.951F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.2439F, -2.3727F, 13.2888F, -0.8867F, 0.0174F, -0.0174F));

		PartDefinition cube_r492 = leftFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(107, 136).addBox(-0.8216F, 0.2002F, 1.1243F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.2439F, -2.3727F, 13.2888F, 1.6702F, 0.0174F, -0.0174F));

		PartDefinition cube_r493 = leftFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(141, 64).addBox(-0.8412F, -1.6688F, -1.9099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.2439F, -2.3727F, 13.2888F, -0.9827F, 0.0174F, -0.0174F));

		PartDefinition cube_r494 = leftFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(142, 18).addBox(-0.8238F, -3.5655F, 3.7538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.2439F, -2.3727F, 13.2888F, 0.7627F, 0.0174F, -0.0174F));

		PartDefinition cube_r495 = leftFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(18, 142).addBox(-0.8238F, -5.6473F, 0.849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.2439F, -2.3727F, 13.2888F, 0.1518F, 0.0174F, -0.0174F));

		PartDefinition cube_r496 = leftFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(142, 15).addBox(-0.8238F, -4.4412F, -3.5901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.2439F, -2.3727F, 13.2888F, -0.6772F, 0.0174F, -0.0174F));

		PartDefinition cube_r497 = leftFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(126, 110).addBox(-0.8238F, -4.8312F, -1.1789F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.2439F, -2.3727F, 13.2888F, -0.11F, 0.0174F, -0.0174F));

		PartDefinition cube_r498 = leftFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(100, 123).addBox(-0.8238F, -0.2288F, 1.9943F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.2439F, -2.3727F, 13.2888F, 1.7008F, 0.0174F, -0.0174F));

		PartDefinition cube_r499 = leftFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(64, 141).addBox(-0.8203F, 2.2871F, -0.9712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2439F, -2.3727F, 13.2888F, 2.5298F, 0.0174F, -0.0174F));

		PartDefinition cube_r500 = leftFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(126, 32).addBox(-0.5F, -0.45F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.1306F, -2.7106F, 0.4346F, 1.0501F, 0.0946F, 0.0433F));

		PartDefinition cube_r501 = leftFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(141, 61).addBox(-0.5017F, -0.9888F, -1.0598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1782F, -2.9591F, 0.8029F, 1.9261F, 0.0708F, 0.0577F));

		PartDefinition cube_r502 = leftFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(59, 141).addBox(-0.5017F, -0.1975F, -0.6988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.1782F, -2.9591F, 0.8029F, 0.9138F, 0.0708F, 0.0577F));

		PartDefinition cube_r503 = leftFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(54, 141).addBox(-0.5017F, -0.7286F, -0.1816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1782F, -2.9591F, 0.8029F, -0.2556F, 0.0708F, 0.0577F));

		PartDefinition cube_r504 = leftFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(71, 138).addBox(-0.5017F, -0.7031F, -1.3329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.1782F, -2.9591F, 0.8029F, -2.0445F, 0.0708F, 0.0577F));

		PartDefinition cube_r505 = leftFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(141, 47).addBox(-0.5018F, -0.224F, -1.4432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1782F, -2.9591F, 0.8029F, -2.4842F, 0.0946F, 0.0433F));

		PartDefinition cube_r506 = leftFace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(43, 141).addBox(-0.5F, -0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.1807F, -3.507F, 0.5984F, 2.2719F, 0.0946F, 0.0433F));

		PartDefinition cube_r507 = leftFace.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(142, 97).addBox(-0.472F, -0.8648F, 0.4918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.3213F, -3.6557F, 3.6365F, -0.6701F, 0.106F, 0.0299F));

		PartDefinition cube_r508 = leftFace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(142, 94).addBox(-0.472F, -0.5803F, 0.2898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3213F, -3.6557F, 3.6365F, 0.028F, 0.106F, 0.0299F));

		PartDefinition cube_r509 = leftFace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(142, 88).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9916F, -4.3308F, 9.4796F, -2.1449F, 0.106F, 0.0299F));

		PartDefinition cube_r510 = leftFace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(142, 129).addBox(-0.5F, -2.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F))
				.texOffs(137, 79).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0212F, -6.796F, 9.0648F, -2.9739F, 0.106F, 0.0299F));

		PartDefinition cube_r511 = leftFace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(142, 126).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.9822F, -7.6003F, 8.4718F, 2.2097F, 0.106F, 0.0299F));

		PartDefinition cube_r512 = leftFace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(140, 142).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8746F, -7.5319F, 7.48F, 1.6425F, 0.106F, 0.0299F));

		PartDefinition cube_r513 = leftFace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(122, 12).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6623F, -6.5292F, 5.7675F, -0.9755F, 0.106F, 0.0299F));

		PartDefinition cube_r514 = leftFace.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(101, 142).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5614F, -5.9012F, 4.9959F, -2.4591F, 0.106F, 0.0299F));

		PartDefinition cube_r515 = leftFace.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(128, 120).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4723F, -5.1197F, 4.3783F, 2.4715F, 0.106F, 0.0299F));

		PartDefinition cube_r516 = leftFace.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(142, 91).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3957F, -4.2419F, 3.9054F, 1.0752F, 0.106F, 0.0299F));

		PartDefinition cube_r517 = leftFace.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(98, 92).addBox(-0.5F, -3.4F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F))
				.texOffs(16, 103).addBox(-0.5F, -3.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5401F, -2.7131F, 5.6927F, -1.3944F, 0.106F, 0.0299F));

		PartDefinition cube_r518 = leftFace.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(129, 0).addBox(-0.472F, -1.9793F, -0.8837F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3213F, -3.6557F, 3.6365F, -1.4817F, 0.106F, 0.0299F));

		PartDefinition cube_r519 = leftFace.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(34, 141).addBox(-0.8653F, 2.1895F, 4.4425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(29, 141).addBox(-1.0903F, 2.1895F, 4.4425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.6439F, -2.3727F, 8.8888F, 1.7503F, 0.1919F, 0.0355F));

		PartDefinition cube_r520 = leftFace.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(119, 125).addBox(-1.1155F, -1.5866F, 4.4632F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(1.6439F, -2.3727F, 8.8888F, 0.9823F, 0.1919F, 0.0355F));

		PartDefinition cube_r521 = leftFace.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(66, 138).addBox(-1.1155F, 2.6496F, 4.6502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.6439F, -2.3727F, 8.8888F, 1.7677F, 0.1919F, 0.0355F));

		PartDefinition cube_r522 = leftFace.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(142, 36).addBox(-0.9336F, -3.1751F, -4.0425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(1.6439F, -2.3727F, 8.8888F, -1.3544F, 0.17F, -0.0078F));

		PartDefinition cube_r523 = leftFace.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(142, 33).addBox(-0.9336F, -4.4595F, -1.8726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(1.6439F, -2.3727F, 8.8888F, -0.8308F, 0.17F, -0.0078F));

		PartDefinition cube_r524 = leftFace.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(24, 141).addBox(-0.9336F, -3.1766F, 2.3496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.6439F, -2.3727F, 8.8888F, 0.2077F, 0.17F, -0.0078F));

		PartDefinition cube_r525 = leftFace.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(13, 141).addBox(-0.9336F, 0.6787F, 2.7371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.6439F, -2.3727F, 8.8888F, 1.2287F, 0.17F, -0.0078F));

		PartDefinition cube_r526 = leftFace.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(125, 89).addBox(-0.9336F, 1.9558F, 0.8445F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.6439F, -2.3727F, 8.8888F, 1.7959F, 0.17F, -0.0078F));

		PartDefinition cube_r527 = leftFace.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(142, 21).addBox(-0.9336F, -1.4103F, 2.2279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.6439F, -2.3727F, 8.8888F, 0.5306F, 0.17F, -0.0078F));

		PartDefinition cube_r528 = leftFace.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(8, 143).addBox(-0.9336F, -0.3119F, -4.803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.6439F, -2.3727F, 8.8888F, -1.9565F, 0.17F, -0.0078F));

		PartDefinition cube_r529 = leftFace.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(142, 26).addBox(-0.9336F, 2.7742F, -2.3422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(1.6439F, -2.3727F, 8.8888F, -3.0037F, 0.17F, -0.0078F));

		PartDefinition cube_r530 = leftFace.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(141, 3).addBox(-0.9336F, 2.0369F, 1.5029F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.6439F, -2.3727F, 8.8888F, 1.9705F, 0.17F, -0.0078F));

		PartDefinition cube_r531 = leftFace.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(125, 80).addBox(-1.1155F, -3.259F, -4.9634F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.6439F, -2.3727F, 8.8888F, -1.2953F, 0.1919F, 0.0355F));

		PartDefinition cube_r532 = leftFace.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(141, 0).addBox(-1.1155F, -6.3036F, -0.5435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.6439F, -2.3727F, 8.8888F, -0.2569F, 0.1919F, 0.0355F));

		PartDefinition cube_r533 = leftFace.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(111, 54).addBox(-0.9196F, -3.9899F, -0.0669F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.2439F, -2.3727F, 13.2888F, 0.0864F, 0.0167F, -0.0159F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.4011F, 7.8848F, -15.7879F));

		PartDefinition cube_r534 = rightFace.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(133, 113).mirror().addBox(5.2335F, 5.3151F, 0.5407F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false)
				.texOffs(133, 109).mirror().addBox(5.2335F, 5.3151F, 0.9407F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.6439F, -2.3727F, 8.8888F, 2.8491F, -1.1384F, -0.0631F));

		PartDefinition cube_r535 = rightFace.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(34, 71).mirror().addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.2992F, -1.2179F, 5.3777F, 0.3044F, -0.0806F, -0.0509F));

		PartDefinition cube_r536 = rightFace.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(141, 76).mirror().addBox(-0.7329F, -8.074F, 5.1865F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.8916F, -9.1735F, 9.9984F, 2.7065F, 0.1664F, -0.5021F));

		PartDefinition cube_r537 = rightFace.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(141, 73).mirror().addBox(-0.7329F, 2.0069F, 7.9211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8916F, -9.1735F, 9.9984F, -2.3986F, 0.1664F, -0.5021F));

		PartDefinition cube_r538 = rightFace.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(138, 110).mirror().addBox(-0.7329F, 7.437F, -0.9931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.8916F, -9.1735F, 9.9984F, -1.0721F, 0.1664F, -0.5021F));

		PartDefinition cube_r539 = rightFace.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(141, 70).mirror().addBox(-0.7329F, -1.3777F, -7.4505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8916F, -9.1735F, 9.9984F, 0.551F, 0.1664F, -0.5021F));

		PartDefinition cube_r540 = rightFace.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(121, 115).mirror().addBox(-0.7329F, -1.6059F, -6.4609F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.8916F, -9.1735F, 9.9984F, 0.586F, 0.1664F, -0.5021F));

		PartDefinition cube_r541 = rightFace.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(77, 120).mirror().addBox(-1.1315F, -0.6059F, -4.7295F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.8916F, -9.1735F, 9.9984F, 0.3702F, 0.0725F, -0.485F));

		PartDefinition cube_r542 = rightFace.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(120, 73).mirror().addBox(-0.5203F, -1.7989F, -1.1779F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-1.4317F, -8.5436F, 8.807F, 2.2007F, 0.0284F, -0.4853F));

		PartDefinition cube_r543 = rightFace.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(138, 113).mirror().addBox(-0.5143F, 0.0331F, -0.1731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4317F, -8.5436F, 8.807F, 2.0873F, 0.0284F, -0.4853F));

		PartDefinition cube_r544 = rightFace.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(143, 100).mirror().addBox(-0.5143F, 0.1167F, -0.2755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.4317F, -8.5436F, 8.807F, 2.3055F, 0.0284F, -0.4853F));

		PartDefinition cube_r545 = rightFace.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(35, 137).mirror().addBox(-0.5143F, -0.6697F, -1.047F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.4317F, -8.5436F, 8.807F, 2.9163F, 0.0284F, -0.4853F));

		PartDefinition cube_r546 = rightFace.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(61, 133).mirror().addBox(2.6479F, 3.8709F, -2.5445F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-1.6439F, -2.3727F, 8.8888F, -2.951F, -0.0111F, -0.4979F));

		PartDefinition cube_r547 = rightFace.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(118, 54).mirror().addBox(2.6106F, -1.469F, -6.3977F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-1.6439F, -2.3727F, 8.8888F, -1.7763F, -0.1821F, -0.4625F));

		PartDefinition cube_r548 = rightFace.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(19, 127).mirror().addBox(-0.0057F, -1.2844F, 2.8368F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2439F, -2.3727F, 13.2888F, 0.0741F, -0.0174F, 0.0174F));

		PartDefinition cube_r549 = rightFace.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(138, 107).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.2459F, -0.3114F, -0.4247F, 0.1851F, -0.106F, -0.0299F));

		PartDefinition cube_r550 = rightFace.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(137, 89).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0337F, 0.3704F, 1.4985F, 0.0717F, -0.106F, -0.0299F));

		PartDefinition cube_r551 = rightFace.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(54, 138).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1413F, 0.4388F, 0.5067F, 1.5116F, -0.106F, -0.0299F));

		PartDefinition cube_r552 = rightFace.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(107, 129).mirror().addBox(-0.51F, -0.4469F, -2.6208F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2713F, -2.5557F, 3.6365F, 0.1589F, -0.106F, -0.0299F));

		PartDefinition cube_r553 = rightFace.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(98, 98).mirror().addBox(-0.51F, -0.5737F, -1.8499F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2713F, -2.5557F, 3.6365F, 0.2418F, -0.106F, -0.0299F));

		PartDefinition cube_r554 = rightFace.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(97, 132).mirror().addBox(-0.5F, -0.025F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.2307F, -1.662F, -0.6617F, 1.3021F, -0.106F, -0.0299F));

		PartDefinition cube_r555 = rightFace.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(111, 63).mirror().addBox(-0.51F, -3.5277F, 2.5235F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2713F, -2.5557F, 3.6365F, 0.2986F, -0.106F, -0.0299F));

		PartDefinition cube_r556 = rightFace.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(84, 21).mirror().addBox(-0.51F, -2.9703F, -0.653F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2713F, -2.5557F, 3.6365F, 0.4731F, -0.106F, -0.0299F));

		PartDefinition cube_r557 = rightFace.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(107, 98).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0469F, -3.3775F, 0.3205F, 2.4366F, -0.106F, -0.0299F));

		PartDefinition cube_r558 = rightFace.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(70, 120).mirror().addBox(-0.5F, -1.65F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0007F, -1.678F, 1.2326F, 1.0403F, -0.106F, -0.0299F));

		PartDefinition cube_r559 = rightFace.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(82, 136).mirror().addBox(-0.1407F, -0.4469F, -10.3597F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1939F, -2.0227F, 9.2888F, 0.2027F, -0.1049F, -0.0336F));

		PartDefinition cube_r560 = rightFace.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(132, 79).mirror().addBox(-0.1407F, -0.2719F, -9.4097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2939F, -2.0227F, 9.2888F, 0.2027F, -0.1049F, -0.0336F));

		PartDefinition cube_r561 = rightFace.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(77, 136).mirror().addBox(-0.1407F, -0.2943F, -8.4303F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2939F, -2.0227F, 9.2888F, 0.2551F, -0.1049F, -0.0336F));

		PartDefinition cube_r562 = rightFace.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(136, 75).mirror().addBox(-0.0907F, -0.5101F, -7.4485F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2939F, -2.0227F, 9.2888F, 0.3075F, -0.1049F, -0.0336F));

		PartDefinition cube_r563 = rightFace.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(136, 47).mirror().addBox(-0.0907F, -0.9091F, -6.4695F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2939F, -2.0227F, 9.2888F, 0.3947F, -0.1049F, -0.0336F));

		PartDefinition cube_r564 = rightFace.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(136, 4).mirror().addBox(-0.0907F, -1.0673F, -5.4549F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2939F, -2.0227F, 9.2888F, 0.4558F, -0.1049F, -0.0336F));

		PartDefinition cube_r565 = rightFace.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(136, 0).mirror().addBox(-0.0907F, -1.3369F, -4.4138F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2939F, -2.0227F, 9.2888F, 0.5256F, -0.1049F, -0.0336F));

		PartDefinition cube_r566 = rightFace.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(135, 133).mirror().addBox(-0.0907F, -1.4323F, -3.3986F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(127, 136).mirror().addBox(-0.0907F, -1.2323F, -1.1986F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(135, 119).mirror().addBox(-0.0907F, -1.2323F, -2.3986F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2939F, -2.0227F, 9.2888F, 0.5693F, -0.1049F, -0.0336F));

		PartDefinition cube_r567 = rightFace.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(51, 88).mirror().addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6134F, -1.0457F, 7.1805F, 0.3509F, -0.106F, -0.0299F));

		PartDefinition cube_r568 = rightFace.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(56, 111).mirror().addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3937F, -0.4471F, 5.2849F, 0.3073F, -0.106F, -0.0299F));

		PartDefinition cube_r569 = rightFace.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(67, 84).mirror().addBox(0.2953F, -5.3302F, -0.3858F, 1.0F, 6.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6439F, -2.3727F, 8.8888F, 0.2238F, -0.237F, -0.0287F));

		PartDefinition cube_r570 = rightFace.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(20, 84).mirror().addBox(0.1196F, -5.7729F, 1.4869F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6439F, -2.3727F, 8.8888F, 0.0523F, -0.1745F, 0.0002F));

		PartDefinition cube_r571 = rightFace.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(69, 141).mirror().addBox(-0.0434F, -6.3699F, -2.2895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2439F, -2.3727F, 13.2888F, -0.9167F, -0.0134F, 0.0028F));

		PartDefinition cube_r572 = rightFace.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(137, 57).mirror().addBox(1.9916F, -0.2766F, -6.2726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.123F)).mirror(false), PartPose.offsetAndRotation(-2.2439F, -2.3727F, 13.2888F, -1.7737F, 0.0068F, -0.371F));

		PartDefinition cube_r573 = rightFace.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(125, 22).mirror().addBox(1.9916F, -6.2693F, -1.8119F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.123F)).mirror(false), PartPose.offsetAndRotation(-2.2439F, -2.3727F, 13.2888F, -0.4647F, 0.0068F, -0.371F));

		PartDefinition cube_r574 = rightFace.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(141, 67).mirror().addBox(1.9916F, -1.971F, -6.2229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-2.2439F, -2.3727F, 13.2888F, -1.4682F, 0.0068F, -0.371F));

		PartDefinition cube_r575 = rightFace.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(130, 84).mirror().addBox(2.1326F, -5.5419F, -5.3454F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-1.6439F, -2.3727F, 8.8888F, -1.2839F, -0.1671F, -0.3747F));

		PartDefinition cube_r576 = rightFace.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(132, 89).mirror().addBox(4.9541F, -0.2765F, -2.4186F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-2.2439F, -2.3727F, 13.2888F, -1.7248F, -0.1328F, -1.1105F));

		PartDefinition cube_r577 = rightFace.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(102, 135).mirror().addBox(4.4508F, -5.3371F, -1.6845F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-1.6439F, -2.3727F, 8.8888F, -1.2469F, 0.0687F, -1.0897F));

		PartDefinition cube_r578 = rightFace.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(7, 127).mirror().addBox(-0.1729F, -6.051F, 2.429F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6439F, -2.3727F, 8.8888F, -0.0112F, -0.1222F, 0.0177F));

		PartDefinition cube_r579 = rightFace.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(63, 120).mirror().addBox(-0.103F, -5.95F, 0.9045F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2439F, -2.3727F, 13.2888F, 0.1649F, -0.0174F, 0.0174F));

		PartDefinition cube_r580 = rightFace.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(133, 124).mirror().addBox(-0.103F, -6.5376F, 0.6105F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.2439F, -2.3727F, 13.2888F, -0.1842F, -0.0174F, 0.0174F));

		PartDefinition cube_r581 = rightFace.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(133, 105).mirror().addBox(-0.103F, -6.7316F, -0.1364F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2439F, -2.3727F, 13.2888F, -0.446F, -0.0174F, 0.0174F));

		PartDefinition cube_r582 = rightFace.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(7, 116).mirror().addBox(-0.0803F, -3.9246F, 2.2614F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.2439F, -2.3727F, 13.2888F, 0.2609F, -0.0174F, 0.0174F));

		PartDefinition cube_r583 = rightFace.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(129, 17).mirror().addBox(-0.0803F, -2.2339F, 3.5837F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2439F, -2.3727F, 13.2888F, 0.4791F, -0.0174F, 0.0174F));

		PartDefinition cube_r584 = rightFace.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(115, 0).mirror().addBox(-0.0803F, -2.7275F, 1.9131F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2439F, -2.3727F, 13.2888F, 0.226F, -0.0174F, 0.0174F));

		PartDefinition cube_r585 = rightFace.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(0, 128).mirror().addBox(-0.1797F, -2.6086F, -4.4533F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.2439F, -2.3727F, 13.2888F, -1.2794F, -0.0174F, 0.0174F));

		PartDefinition cube_r586 = rightFace.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(126, 125).mirror().addBox(-0.1797F, -3.425F, -1.951F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2439F, -2.3727F, 13.2888F, -0.8867F, -0.0174F, 0.0174F));

		PartDefinition cube_r587 = rightFace.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(107, 136).mirror().addBox(-0.1784F, 0.2002F, 1.1243F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2439F, -2.3727F, 13.2888F, 1.6702F, -0.0174F, 0.0174F));

		PartDefinition cube_r588 = rightFace.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(141, 64).mirror().addBox(-0.1588F, -1.6688F, -1.9099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2439F, -2.3727F, 13.2888F, -0.9827F, -0.0174F, 0.0174F));

		PartDefinition cube_r589 = rightFace.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(142, 18).mirror().addBox(-0.1762F, -3.5655F, 3.7538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2439F, -2.3727F, 13.2888F, 0.7627F, -0.0174F, 0.0174F));

		PartDefinition cube_r590 = rightFace.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(18, 142).mirror().addBox(-0.1762F, -5.6473F, 0.849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2439F, -2.3727F, 13.2888F, 0.1518F, -0.0174F, 0.0174F));

		PartDefinition cube_r591 = rightFace.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(142, 15).mirror().addBox(-0.1762F, -4.4412F, -3.5901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2439F, -2.3727F, 13.2888F, -0.6772F, -0.0174F, 0.0174F));

		PartDefinition cube_r592 = rightFace.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(126, 110).mirror().addBox(-0.1762F, -4.8312F, -1.1789F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2439F, -2.3727F, 13.2888F, -0.11F, -0.0174F, 0.0174F));

		PartDefinition cube_r593 = rightFace.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(100, 123).mirror().addBox(-0.1762F, -0.2288F, 1.9943F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.2439F, -2.3727F, 13.2888F, 1.7008F, -0.0174F, 0.0174F));

		PartDefinition cube_r594 = rightFace.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(64, 141).mirror().addBox(-0.1797F, 2.2871F, -0.9712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2439F, -2.3727F, 13.2888F, 2.5298F, -0.0174F, 0.0174F));

		PartDefinition cube_r595 = rightFace.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(126, 32).mirror().addBox(-0.5F, -0.45F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.1306F, -2.7106F, 0.4346F, 1.0501F, -0.0946F, -0.0433F));

		PartDefinition cube_r596 = rightFace.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(141, 61).mirror().addBox(-0.4983F, -0.9888F, -1.0598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1782F, -2.9591F, 0.8029F, 1.9261F, -0.0708F, -0.0577F));

		PartDefinition cube_r597 = rightFace.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(59, 141).mirror().addBox(-0.4983F, -0.1975F, -0.6988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.1782F, -2.9591F, 0.8029F, 0.9138F, -0.0708F, -0.0577F));

		PartDefinition cube_r598 = rightFace.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(54, 141).mirror().addBox(-0.4983F, -0.7286F, -0.1816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1782F, -2.9591F, 0.8029F, -0.2556F, -0.0708F, -0.0577F));

		PartDefinition cube_r599 = rightFace.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(71, 138).mirror().addBox(-0.4983F, -0.7031F, -1.3329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.1782F, -2.9591F, 0.8029F, -2.0445F, -0.0708F, -0.0577F));

		PartDefinition cube_r600 = rightFace.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(141, 47).mirror().addBox(-0.4982F, -0.224F, -1.4432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1782F, -2.9591F, 0.8029F, -2.4842F, -0.0946F, -0.0433F));

		PartDefinition cube_r601 = rightFace.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(43, 141).mirror().addBox(-0.5F, -0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.1807F, -3.507F, 0.5984F, 2.2719F, -0.0946F, -0.0433F));

		PartDefinition cube_r602 = rightFace.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(142, 97).mirror().addBox(-0.528F, -0.8648F, 0.4918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3213F, -3.6557F, 3.6365F, -0.6701F, -0.106F, -0.0299F));

		PartDefinition cube_r603 = rightFace.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(142, 94).mirror().addBox(-0.528F, -0.5803F, 0.2898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3213F, -3.6557F, 3.6365F, 0.028F, -0.106F, -0.0299F));

		PartDefinition cube_r604 = rightFace.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(142, 88).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9916F, -4.3308F, 9.4796F, -2.1449F, -0.106F, -0.0299F));

		PartDefinition cube_r605 = rightFace.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(142, 129).mirror().addBox(-0.5F, -2.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(137, 79).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0212F, -6.796F, 9.0648F, -2.9739F, -0.106F, -0.0299F));

		PartDefinition cube_r606 = rightFace.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(142, 126).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.9822F, -7.6003F, 8.4718F, 2.2097F, -0.106F, -0.0299F));

		PartDefinition cube_r607 = rightFace.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(140, 142).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8746F, -7.5319F, 7.48F, 1.6425F, -0.106F, -0.0299F));

		PartDefinition cube_r608 = rightFace.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(122, 12).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6623F, -6.5292F, 5.7675F, -0.9755F, -0.106F, -0.0299F));

		PartDefinition cube_r609 = rightFace.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(101, 142).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5614F, -5.9012F, 4.9959F, -2.4591F, -0.106F, -0.0299F));

		PartDefinition cube_r610 = rightFace.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(128, 120).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4723F, -5.1197F, 4.3783F, 2.4715F, -0.106F, -0.0299F));

		PartDefinition cube_r611 = rightFace.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(142, 91).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3957F, -4.2419F, 3.9054F, 1.0752F, -0.106F, -0.0299F));

		PartDefinition cube_r612 = rightFace.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(98, 92).mirror().addBox(-0.5F, -3.4F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(16, 103).mirror().addBox(-0.5F, -3.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5401F, -2.7131F, 5.6927F, -1.3944F, -0.106F, -0.0299F));

		PartDefinition cube_r613 = rightFace.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(129, 0).mirror().addBox(-0.528F, -1.9793F, -0.8837F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3213F, -3.6557F, 3.6365F, -1.4817F, -0.106F, -0.0299F));

		PartDefinition cube_r614 = rightFace.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(34, 141).mirror().addBox(-0.1347F, 2.1895F, 4.4425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(29, 141).mirror().addBox(0.0903F, 2.1895F, 4.4425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6439F, -2.3727F, 8.8888F, 1.7503F, -0.1919F, -0.0355F));

		PartDefinition cube_r615 = rightFace.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(119, 125).mirror().addBox(0.1155F, -1.5866F, 4.4632F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-1.6439F, -2.3727F, 8.8888F, 0.9823F, -0.1919F, -0.0355F));

		PartDefinition cube_r616 = rightFace.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(66, 138).mirror().addBox(0.1155F, 2.6496F, 4.6502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.6439F, -2.3727F, 8.8888F, 1.7677F, -0.1919F, -0.0355F));

		PartDefinition cube_r617 = rightFace.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(142, 36).mirror().addBox(-0.0664F, -3.1751F, -4.0425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-1.6439F, -2.3727F, 8.8888F, -1.3544F, -0.17F, 0.0078F));

		PartDefinition cube_r618 = rightFace.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(142, 33).mirror().addBox(-0.0664F, -4.4595F, -1.8726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-1.6439F, -2.3727F, 8.8888F, -0.8308F, -0.17F, 0.0078F));

		PartDefinition cube_r619 = rightFace.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(24, 141).mirror().addBox(-0.0664F, -3.1766F, 2.3496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.6439F, -2.3727F, 8.8888F, 0.2077F, -0.17F, 0.0078F));

		PartDefinition cube_r620 = rightFace.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(13, 141).mirror().addBox(-0.0664F, 0.6787F, 2.7371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6439F, -2.3727F, 8.8888F, 1.2287F, -0.17F, 0.0078F));

		PartDefinition cube_r621 = rightFace.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(125, 89).mirror().addBox(-0.0664F, 1.9558F, 0.8445F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.6439F, -2.3727F, 8.8888F, 1.7959F, -0.17F, 0.0078F));

		PartDefinition cube_r622 = rightFace.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(142, 21).mirror().addBox(-0.0664F, -1.4103F, 2.2279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6439F, -2.3727F, 8.8888F, 0.5306F, -0.17F, 0.0078F));

		PartDefinition cube_r623 = rightFace.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(8, 143).mirror().addBox(-0.0664F, -0.3119F, -4.803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6439F, -2.3727F, 8.8888F, -1.9565F, -0.17F, 0.0078F));

		PartDefinition cube_r624 = rightFace.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(142, 26).mirror().addBox(-0.0664F, 2.7742F, -2.3422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-1.6439F, -2.3727F, 8.8888F, -3.0037F, -0.17F, 0.0078F));

		PartDefinition cube_r625 = rightFace.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(141, 3).mirror().addBox(-0.0664F, 2.0369F, 1.5029F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6439F, -2.3727F, 8.8888F, 1.9705F, -0.17F, 0.0078F));

		PartDefinition cube_r626 = rightFace.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(125, 80).mirror().addBox(0.1155F, -3.259F, -4.9634F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.6439F, -2.3727F, 8.8888F, -1.2953F, -0.1919F, -0.0355F));

		PartDefinition cube_r627 = rightFace.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(141, 0).mirror().addBox(0.1155F, -6.3036F, -0.5435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6439F, -2.3727F, 8.8888F, -0.2569F, -0.1919F, -0.0355F));

		PartDefinition cube_r628 = rightFace.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(111, 54).mirror().addBox(-0.0804F, -3.9899F, -0.0669F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2439F, -2.3727F, 13.2888F, 0.0864F, -0.0167F, 0.0159F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.2629F, 2.3099F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r629 = jaw.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(124, 5).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(124, 5).addBox(3.9407F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.2203F, -0.1873F, 0.0341F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r630 = jaw.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(100, 118).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(100, 118).addBox(3.9407F, -1.0F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2203F, 0.5337F, -2.8469F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r631 = jaw.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(43, 97).mirror().addBox(0.2F, -0.6655F, -2.9192F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.015F)).mirror(false)
				.texOffs(43, 97).addBox(4.6407F, -0.6655F, -2.9192F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-2.9204F, 0.463F, 0.142F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r632 = jaw.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(97, 50).mirror().addBox(0.2F, -0.2871F, -2.9811F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.0153F)).mirror(false)
				.texOffs(97, 50).addBox(4.6407F, -0.2871F, -2.9811F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(-2.9204F, 0.463F, 0.142F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r633 = jaw.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(82, 132).mirror().addBox(-0.5F, -2.0F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false)
				.texOffs(82, 132).addBox(3.9407F, -2.0F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(-2.2203F, 2.9449F, -2.2182F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r634 = jaw.addOrReplaceChild("cube_r634", CubeListBuilder.create().texOffs(123, 84).mirror().addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.2278F, -4.1043F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r635 = jaw.addOrReplaceChild("cube_r635", CubeListBuilder.create().texOffs(107, 117).mirror().addBox(-0.6193F, -0.0979F, 2.7933F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.2278F, -4.1043F, 0.2923F, -0.0969F, 0.0654F));

		PartDefinition cube_r636 = jaw.addOrReplaceChild("cube_r636", CubeListBuilder.create().texOffs(123, 106).mirror().addBox(-0.5F, -1.025F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(123, 106).addBox(3.9407F, -1.025F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.2203F, 2.9449F, -2.2182F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r637 = jaw.addOrReplaceChild("cube_r637", CubeListBuilder.create().texOffs(120, 64).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false)
				.texOffs(120, 64).addBox(3.9407F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(-2.2203F, 2.4449F, -1.3521F, -2.4696F, 0.0F, 0.0F));

		PartDefinition cube_r638 = jaw.addOrReplaceChild("cube_r638", CubeListBuilder.create().texOffs(77, 114).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.5981F, -3.304F, 0.0175F, -0.1745F, 0.0F));

		PartDefinition cube_r639 = jaw.addOrReplaceChild("cube_r639", CubeListBuilder.create().texOffs(70, 114).mirror().addBox(0.0F, -0.0349F, -3.9997F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.5981F, -3.304F, 0.0349F, -0.1745F, 0.0F));

		PartDefinition cube_r640 = jaw.addOrReplaceChild("cube_r640", CubeListBuilder.create().texOffs(118, 45).mirror().addBox(0.0F, -1.6236F, -3.818F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.5981F, -3.304F, 1.789F, -0.1745F, 0.0F));

		PartDefinition cube_r641 = jaw.addOrReplaceChild("cube_r641", CubeListBuilder.create().texOffs(114, 118).mirror().addBox(0.0F, -4.019F, 1.0866F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.5981F, -3.304F, -3.0543F, -0.1745F, 0.0F));

		PartDefinition cube_r642 = jaw.addOrReplaceChild("cube_r642", CubeListBuilder.create().texOffs(107, 104).mirror().addBox(0.0F, 1.7352F, 1.7611F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.5981F, -3.304F, -1.789F, -0.1745F, 0.0F));

		PartDefinition cube_r643 = jaw.addOrReplaceChild("cube_r643", CubeListBuilder.create().texOffs(116, 27).mirror().addBox(-1.1F, -2.5029F, 2.6908F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4204F, 2.1368F, -10.9037F, 0.0349F, -0.1222F, 0.0F));

		PartDefinition cube_r644 = jaw.addOrReplaceChild("cube_r644", CubeListBuilder.create().texOffs(7, 99).mirror().addBox(-0.8934F, -3.0012F, -2.7072F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6415F, 2.4474F, -9.7659F, -1.7933F, -0.192F, 0.0F));

		PartDefinition cube_r645 = jaw.addOrReplaceChild("cube_r645", CubeListBuilder.create().texOffs(142, 39).mirror().addBox(-0.8935F, -2.1719F, 2.0257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4204F, 2.1368F, -10.9037F, 0.1484F, -0.192F, 0.0F));

		PartDefinition cube_r646 = jaw.addOrReplaceChild("cube_r646", CubeListBuilder.create().texOffs(117, 49).mirror().addBox(0.0F, 3.5835F, -2.1276F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.5204F, 2.9417F, -7.9811F, -1.693F, -0.0698F, 0.0F));

		PartDefinition cube_r647 = jaw.addOrReplaceChild("cube_r647", CubeListBuilder.create().texOffs(118, 40).mirror().addBox(-0.8935F, -2.1009F, -2.1531F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-0.4204F, 2.1368F, -10.9037F, -1.405F, -0.192F, 0.0F));

		PartDefinition cube_r648 = jaw.addOrReplaceChild("cube_r648", CubeListBuilder.create().texOffs(21, 117).mirror().addBox(-0.8935F, -1.3139F, -1.642F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0175F)).mirror(false), PartPose.offsetAndRotation(-0.4204F, 2.1368F, -10.9037F, -1.7802F, -0.192F, 0.0F));

		PartDefinition cube_r649 = jaw.addOrReplaceChild("cube_r649", CubeListBuilder.create().texOffs(131, 4).mirror().addBox(0.0F, 2.6749F, -3.1539F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false)
				.texOffs(131, 48).mirror().addBox(0.0F, 7.1022F, -2.396F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.0175F)).mirror(false)
				.texOffs(142, 79).mirror().addBox(0.0F, 2.4749F, -3.8539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(128, 36).mirror().addBox(0.0F, 3.4749F, -4.1539F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5204F, 2.9417F, -7.9811F, -1.501F, -0.0698F, 0.0F));

		PartDefinition cube_r650 = jaw.addOrReplaceChild("cube_r650", CubeListBuilder.create().texOffs(132, 22).mirror().addBox(0.0F, 5.3663F, -1.5126F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false)
				.texOffs(132, 53).mirror().addBox(0.0F, 5.3663F, -2.4626F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0175F)).mirror(false), PartPose.offsetAndRotation(-1.5204F, 2.9417F, -7.9811F, -1.6232F, -0.0698F, 0.0F));

		PartDefinition cube_r651 = jaw.addOrReplaceChild("cube_r651", CubeListBuilder.create().texOffs(0, 137).mirror().addBox(0.0F, 7.3334F, -2.3337F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-1.5204F, 2.9417F, -7.9811F, -1.6406F, -0.0698F, 0.0F));

		PartDefinition cube_r652 = jaw.addOrReplaceChild("cube_r652", CubeListBuilder.create().texOffs(142, 42).mirror().addBox(0.0F, 9.1728F, -2.7364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0175F)).mirror(false)
				.texOffs(142, 53).mirror().addBox(0.0F, 9.7228F, -2.7364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-1.5204F, 2.9417F, -7.9811F, -1.597F, -0.0698F, 0.0F));

		PartDefinition cube_r653 = jaw.addOrReplaceChild("cube_r653", CubeListBuilder.create().texOffs(95, 0).mirror().addBox(0.0F, 2.6173F, 6.2544F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.014F)).mirror(false)
				.texOffs(142, 56).mirror().addBox(0.0F, 2.1423F, 9.2544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-1.5204F, 2.9417F, -7.9811F, -2.9932F, -0.0698F, 0.0F));

		PartDefinition cube_r654 = jaw.addOrReplaceChild("cube_r654", CubeListBuilder.create().texOffs(38, 128).mirror().addBox(0.0F, 5.9421F, -3.2963F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(128, 44).mirror().addBox(0.0F, 6.9421F, -3.2463F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(83, 128).mirror().addBox(0.0F, 7.9421F, -3.1463F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(128, 93).mirror().addBox(0.0F, 8.9421F, -3.0463F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(97, 128).mirror().addBox(0.0F, 9.9421F, -2.8463F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5204F, 2.9417F, -7.9811F, -1.6755F, -0.0698F, 0.0F));

		PartDefinition cube_r655 = jaw.addOrReplaceChild("cube_r655", CubeListBuilder.create().texOffs(128, 40).mirror().addBox(0.0F, 4.7305F, -3.8246F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5204F, 2.9417F, -7.9811F, -1.5882F, -0.0698F, 0.0F));

		PartDefinition cube_r656 = jaw.addOrReplaceChild("cube_r656", CubeListBuilder.create().texOffs(87, 95).mirror().addBox(-0.225F, 2.1437F, -4.1504F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.5981F, -3.304F, 0.0698F, -0.1745F, 0.0F));

		PartDefinition cube_r657 = jaw.addOrReplaceChild("cube_r657", CubeListBuilder.create().texOffs(138, 123).mirror().addBox(-0.225F, 1.9021F, -2.0194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.5981F, -3.304F, 0.3752F, -0.1745F, 0.0F));

		PartDefinition cube_r658 = jaw.addOrReplaceChild("cube_r658", CubeListBuilder.create().texOffs(112, 138).mirror().addBox(-0.225F, -2.4998F, -2.9789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.5981F, -3.304F, 1.9024F, -0.1745F, 0.0F));

		PartDefinition cube_r659 = jaw.addOrReplaceChild("cube_r659", CubeListBuilder.create().texOffs(118, 95).mirror().addBox(-0.225F, 1.9167F, 3.1757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(138, 30).mirror().addBox(-0.225F, 2.4167F, 3.1757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.5981F, -3.304F, -1.7715F, -0.1745F, 0.0F));

		PartDefinition cube_r660 = jaw.addOrReplaceChild("cube_r660", CubeListBuilder.create().texOffs(128, 97).mirror().addBox(-0.225F, -3.4924F, 1.2735F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7203F, -0.5981F, -3.304F, -3.0805F, -0.1745F, 0.0F));

		PartDefinition cube_r661 = jaw.addOrReplaceChild("cube_r661", CubeListBuilder.create().texOffs(107, 117).addBox(0.6193F, -0.0979F, 2.7933F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2278F, -4.1043F, 0.2923F, 0.0969F, -0.0654F));

		PartDefinition cube_r662 = jaw.addOrReplaceChild("cube_r662", CubeListBuilder.create().texOffs(123, 84).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2278F, -4.1043F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r663 = jaw.addOrReplaceChild("cube_r663", CubeListBuilder.create().texOffs(118, 40).addBox(-0.1065F, -2.1009F, -2.1531F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(0.4204F, 2.1368F, -10.9037F, -1.405F, 0.192F, 0.0F));

		PartDefinition cube_r664 = jaw.addOrReplaceChild("cube_r664", CubeListBuilder.create().texOffs(21, 117).addBox(-0.1065F, -1.3139F, -1.642F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0175F)), PartPose.offsetAndRotation(0.4204F, 2.1368F, -10.9037F, -1.7802F, 0.192F, 0.0F));

		PartDefinition cube_r665 = jaw.addOrReplaceChild("cube_r665", CubeListBuilder.create().texOffs(128, 40).addBox(-1.0F, 4.7305F, -3.8246F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5204F, 2.9417F, -7.9811F, -1.5882F, 0.0698F, 0.0F));

		PartDefinition cube_r666 = jaw.addOrReplaceChild("cube_r666", CubeListBuilder.create().texOffs(97, 128).addBox(-1.0F, 9.9421F, -2.8463F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(128, 93).addBox(-1.0F, 8.9421F, -3.0463F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(83, 128).addBox(-1.0F, 7.9421F, -3.1463F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(128, 44).addBox(-1.0F, 6.9421F, -3.2463F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(38, 128).addBox(-1.0F, 5.9421F, -3.2963F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5204F, 2.9417F, -7.9811F, -1.6755F, 0.0698F, 0.0F));

		PartDefinition cube_r667 = jaw.addOrReplaceChild("cube_r667", CubeListBuilder.create().texOffs(128, 36).addBox(-1.0F, 3.4749F, -4.1539F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(142, 79).addBox(-1.0F, 2.4749F, -3.8539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(131, 4).addBox(-1.0F, 2.6749F, -3.1539F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.018F))
				.texOffs(131, 48).addBox(-1.0F, 7.1022F, -2.396F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.0175F)), PartPose.offsetAndRotation(1.5204F, 2.9417F, -7.9811F, -1.501F, 0.0698F, 0.0F));

		PartDefinition cube_r668 = jaw.addOrReplaceChild("cube_r668", CubeListBuilder.create().texOffs(132, 53).addBox(-1.0F, 5.3663F, -2.4626F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0175F))
				.texOffs(132, 22).addBox(-1.0F, 5.3663F, -1.5126F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(1.5204F, 2.9417F, -7.9811F, -1.6232F, 0.0698F, 0.0F));

		PartDefinition cube_r669 = jaw.addOrReplaceChild("cube_r669", CubeListBuilder.create().texOffs(142, 56).addBox(-1.0F, 2.1423F, 9.2544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F))
				.texOffs(95, 0).addBox(-1.0F, 2.6173F, 6.2544F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.5204F, 2.9417F, -7.9811F, -2.9932F, 0.0698F, 0.0F));

		PartDefinition cube_r670 = jaw.addOrReplaceChild("cube_r670", CubeListBuilder.create().texOffs(142, 53).addBox(-1.0F, 9.7228F, -2.7364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F))
				.texOffs(142, 42).addBox(-1.0F, 9.1728F, -2.7364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0175F)), PartPose.offsetAndRotation(1.5204F, 2.9417F, -7.9811F, -1.597F, 0.0698F, 0.0F));

		PartDefinition cube_r671 = jaw.addOrReplaceChild("cube_r671", CubeListBuilder.create().texOffs(0, 137).addBox(-1.0F, 7.3334F, -2.3337F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(1.5204F, 2.9417F, -7.9811F, -1.6406F, 0.0698F, 0.0F));

		PartDefinition cube_r672 = jaw.addOrReplaceChild("cube_r672", CubeListBuilder.create().texOffs(117, 49).addBox(-1.0F, 3.5835F, -2.1276F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.5204F, 2.9417F, -7.9811F, -1.693F, 0.0698F, 0.0F));

		PartDefinition cube_r673 = jaw.addOrReplaceChild("cube_r673", CubeListBuilder.create().texOffs(7, 99).addBox(-0.1066F, -3.0012F, -2.7072F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6415F, 2.4474F, -9.7659F, -1.7933F, 0.192F, 0.0F));

		PartDefinition cube_r674 = jaw.addOrReplaceChild("cube_r674", CubeListBuilder.create().texOffs(107, 104).addBox(-1.0F, 1.7352F, 1.7611F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.7203F, -0.5981F, -3.304F, -1.789F, 0.1745F, 0.0F));

		PartDefinition cube_r675 = jaw.addOrReplaceChild("cube_r675", CubeListBuilder.create().texOffs(114, 118).addBox(-1.0F, -4.019F, 1.0866F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(2.7203F, -0.5981F, -3.304F, -3.0543F, 0.1745F, 0.0F));

		PartDefinition cube_r676 = jaw.addOrReplaceChild("cube_r676", CubeListBuilder.create().texOffs(118, 45).addBox(-1.0F, -1.6236F, -3.818F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.7203F, -0.5981F, -3.304F, 1.789F, 0.1745F, 0.0F));

		PartDefinition cube_r677 = jaw.addOrReplaceChild("cube_r677", CubeListBuilder.create().texOffs(142, 39).addBox(-0.1065F, -2.1719F, 2.0257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4204F, 2.1368F, -10.9037F, 0.1484F, 0.192F, 0.0F));

		PartDefinition cube_r678 = jaw.addOrReplaceChild("cube_r678", CubeListBuilder.create().texOffs(116, 27).addBox(0.1F, -2.5029F, 2.6908F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4204F, 2.1368F, -10.9037F, 0.0349F, 0.1222F, 0.0F));

		PartDefinition cube_r679 = jaw.addOrReplaceChild("cube_r679", CubeListBuilder.create().texOffs(70, 114).addBox(-1.0F, -0.0349F, -3.9997F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7203F, -0.5981F, -3.304F, 0.0349F, 0.1745F, 0.0F));

		PartDefinition cube_r680 = jaw.addOrReplaceChild("cube_r680", CubeListBuilder.create().texOffs(128, 97).addBox(-0.775F, -3.4924F, 1.2735F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7203F, -0.5981F, -3.304F, -3.0805F, 0.1745F, 0.0F));

		PartDefinition cube_r681 = jaw.addOrReplaceChild("cube_r681", CubeListBuilder.create().texOffs(138, 30).addBox(-0.775F, 2.4167F, 3.1757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(118, 95).addBox(-0.775F, 1.9167F, 3.1757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.7203F, -0.5981F, -3.304F, -1.7715F, 0.1745F, 0.0F));

		PartDefinition cube_r682 = jaw.addOrReplaceChild("cube_r682", CubeListBuilder.create().texOffs(112, 138).addBox(-0.775F, -2.4998F, -2.9789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.7203F, -0.5981F, -3.304F, 1.9024F, 0.1745F, 0.0F));

		PartDefinition cube_r683 = jaw.addOrReplaceChild("cube_r683", CubeListBuilder.create().texOffs(138, 123).addBox(-0.775F, 1.9021F, -2.0194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7203F, -0.5981F, -3.304F, 0.3752F, 0.1745F, 0.0F));

		PartDefinition cube_r684 = jaw.addOrReplaceChild("cube_r684", CubeListBuilder.create().texOffs(87, 95).addBox(-0.775F, 2.1437F, -4.1504F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(2.7203F, -0.5981F, -3.304F, 0.0698F, 0.1745F, 0.0F));

		PartDefinition cube_r685 = jaw.addOrReplaceChild("cube_r685", CubeListBuilder.create().texOffs(77, 114).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.7203F, -0.5981F, -3.304F, 0.0175F, 0.1745F, 0.0F));

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