package fossils.fossils.client.blockentity.model.carnotaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CarnotaurusFossilModel extends SkullModelBase {
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

	public CarnotaurusFossilModel(ModelPart root) {
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -33.8369F, -0.4331F, 0.0523F, 0.0023F, -0.0436F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 27).addBox(-0.006F, -4.5F, 0.0F, 0.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9927F, -2.1753F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0322F, 1.3974F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.02F, 4.2208F, 3.2566F, -0.0436F, 0.0F, 0.1309F));

		PartDefinition cube_r3 = bone3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(67, 35).addBox(-0.5827F, 3.7931F, -8.2175F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6795F, -9.3081F, 5.4213F, -0.222F, -0.0321F, -0.4016F));

		PartDefinition cube_r4 = bone3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(85, 75).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7065F, -9.5366F, 0.8398F, -0.1347F, -0.0321F, -0.4016F));

		PartDefinition cube_r5 = bone3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(89, 97).addBox(-0.5F, -0.875F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5093F, -6.7253F, 2.4546F, 0.3385F, -0.0327F, -0.4104F));

		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(62, 84).addBox(-0.5F, -1.6F, -2.3F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.3449F, -6.104F, 5.4246F, -0.2113F, -0.0327F, -0.4104F));

		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(66, 125).addBox(-0.5F, -1.5F, 0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3007F, -5.736F, 7.67F, 0.4651F, -0.0391F, -0.4053F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(51, 125).addBox(-0.5F, -0.925F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3007F, -5.736F, 7.67F, 1.2068F, -0.0391F, -0.4053F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(112, 57).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.911F, -7.0927F, 8.3309F, 1.3377F, -0.0391F, -0.4053F));

		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(118, 13).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.5689F, -8.5965F, 8.6249F, 0.945F, -0.0391F, -0.4053F));

		PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(114, 69).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7152F, -9.1282F, 6.7024F, 1.2941F, -0.0391F, -0.4053F));

		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(80, 97).addBox(-0.5F, -0.475F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4339F, -8.6697F, 4.7184F, 0.0287F, -0.0391F, -0.4053F));

		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(105, 126).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 126).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2886F, 8.8004F, 6.3967F, -1.6774F, -0.0288F, -0.1106F));

		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(121, 69).addBox(-0.5F, -1.45F, -1.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2279F, 8.4569F, 7.1734F, -0.2811F, -0.0288F, -0.1106F));

		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(122, 4).addBox(-0.5F, -0.6F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1006F, 7.348F, 7.3161F, 0.8969F, -0.0308F, -0.1079F));

		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(18, 95).addBox(-1.1086F, -0.264F, -0.6562F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2216F, 1.7295F, 3.5333F, 0.5478F, -0.0308F, -0.1079F));

		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(97, 11).addBox(-0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1763F, 0.7678F, 1.1461F, 0.5768F, -0.0159F, 0.1731F));

		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(38, 116).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3695F, 1.7455F, 2.5149F, 0.5899F, 0.1451F, 0.0242F));

		PartDefinition cube_r19 = bone3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(56, 122).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.208F, 0.8426F, 2.294F, 0.7949F, -0.0159F, 0.1731F));

		PartDefinition cube_r20 = bone3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(80, 92).addBox(-0.5F, -0.8F, -0.775F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0422F, -0.0594F, 0.8585F, 2.2873F, -0.0313F, 0.1956F));

		PartDefinition cube_r21 = bone3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(132, 123).addBox(-1.142F, -4.0627F, -0.342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2216F, 1.2295F, 4.4583F, 0.9806F, -0.0911F, 0.1489F));

		PartDefinition cube_r22 = bone3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(107, 93).addBox(-0.5F, 0.0F, -1.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3025F, -3.2669F, 2.6953F, 0.0788F, -0.0767F, 0.0803F));

		PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(115, 82).addBox(-0.6737F, -1.0487F, -0.4517F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2216F, -0.7705F, 2.0833F, 0.4279F, -0.0219F, 0.1723F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 115).addBox(-0.5F, -1.6F, -2.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3134F, -3.7673F, 2.7886F, 0.462F, 0.0639F, 0.0248F));

		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(23, 102).addBox(-0.5F, -1.775F, -4.1F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0277F, 1.2701F, -1.8047F, -1.2309F, 0.0639F, 0.0248F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(15, 133).addBox(-0.5F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5825F, 9.8086F, -7.9253F, -2.2576F, -0.0125F, -0.1832F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(10, 133).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6957F, 10.4733F, -7.1473F, -2.5194F, -0.0125F, -0.1832F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(99, 132).addBox(-0.5F, 0.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4803F, 10.0102F, -9.9365F, 0.0102F, 0.0487F, -0.1659F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(119, 60).addBox(-0.5F, 0.0F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4803F, 10.0102F, -9.9365F, 0.7956F, 0.0487F, -0.1659F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(30, 133).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6919F, 11.0187F, -9.0715F, -0.0335F, 0.0487F, -0.1659F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(85, 126).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.6069F, 10.4084F, -8.7246F, -1.2988F, 0.0487F, -0.1659F));

		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(27, 120).addBox(-0.5F, -2.1F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3752F, 8.8085F, -9.1239F, -0.3744F, 0.0461F, -0.1729F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(57, 115).addBox(-0.5F, -1.5F, -0.625F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1447F, 4.4386F, -6.8368F, -0.3232F, 0.0624F, -0.1677F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(62, 115).addBox(-0.4901F, -4.8052F, -0.9866F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3159F, 3.2016F, -5.9879F, -0.4284F, 0.0668F, 0.0151F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(113, 10).addBox(-0.4901F, -0.6052F, -0.9866F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.171F, -0.8013F, -4.7248F, -0.3236F, 0.0668F, 0.0151F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(96, 106).addBox(-0.5F, -2.4F, -1.425F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0318F, -2.7272F, -3.7049F, -0.2884F, 0.0639F, 0.0248F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(40, 58).addBox(-0.3844F, -0.3139F, -2.6767F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0524F, -5.1544F, -1.5189F, -0.1925F, 0.0639F, 0.0248F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(103, 106).addBox(-0.5F, 1.5F, -3.3F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.3769F, -5.8537F, -8.7325F, 2.3736F, -0.3289F, -0.3595F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(105, 122).addBox(-0.9819F, -2.014F, -0.9926F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.4356F, -6.3231F, -7.8854F, -1.9897F, -0.3289F, -0.3595F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(71, 130).addBox(-0.9819F, -1.014F, 0.0074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.3288F, -7.1472F, -8.4417F, -0.9425F, -0.3289F, -0.3595F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(45, 130).addBox(-0.9819F, -0.039F, 0.0324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1422F, -8.0216F, -8.8313F, 0.4102F, -0.3289F, -0.3595F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(14, 118).addBox(-0.9819F, -0.039F, -0.9676F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6796F, -8.7065F, -8.2684F, 0.9338F, -0.3289F, -0.3595F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(47, 70).addBox(-0.9819F, -0.039F, -1.9676F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2232F, -9.623F, -6.7371F, 0.6283F, -0.3289F, -0.3595F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(114, 74).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.7079F, -9.843F, -4.141F, 1.3251F, -0.3037F, -0.3808F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(95, 20).addBox(0.1F, 0.15F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.284F, -9.7695F, -4.3537F, 0.2343F, -0.3037F, -0.3808F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(106, 41).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.6809F, -9.7193F, -2.1154F, 0.0747F, -0.0321F, -0.4016F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(24, 86).addBox(-0.58F, 0.205F, 1.0796F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.6795F, -10.0081F, -3.1787F, -0.0562F, -0.0321F, -0.4016F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.02F, 6.218F, 3.1519F, -0.0436F, 0.0F, -0.1309F));

		PartDefinition cube_r48 = bone4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(67, 35).mirror().addBox(-0.4173F, 3.7931F, -8.2175F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6795F, -11.3054F, 5.526F, -0.222F, 0.0321F, 0.4016F));

		PartDefinition cube_r49 = bone4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(85, 75).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7065F, -11.5339F, 0.9444F, -0.1347F, 0.0321F, 0.4016F));

		PartDefinition cube_r50 = bone4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(89, 97).mirror().addBox(-0.5F, -0.875F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5093F, -8.7226F, 2.5593F, 0.3385F, 0.0327F, 0.4104F));

		PartDefinition cube_r51 = bone4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(62, 84).mirror().addBox(-0.5F, -1.6F, -2.3F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.3449F, -8.1013F, 5.5293F, -0.2113F, 0.0327F, 0.4104F));

		PartDefinition cube_r52 = bone4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(66, 125).mirror().addBox(-0.5F, -1.5F, 0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3007F, -7.7332F, 7.7747F, 0.4651F, 0.0391F, 0.4053F));

		PartDefinition cube_r53 = bone4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(51, 125).mirror().addBox(-0.5F, -0.925F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.3007F, -7.7332F, 7.7747F, 1.2068F, 0.0391F, 0.4053F));

		PartDefinition cube_r54 = bone4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(112, 57).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.911F, -9.0899F, 8.4356F, 1.3377F, 0.0391F, 0.4053F));

		PartDefinition cube_r55 = bone4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(118, 13).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.5689F, -10.5938F, 8.7296F, 0.945F, 0.0391F, 0.4053F));

		PartDefinition cube_r56 = bone4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(114, 69).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7152F, -11.1255F, 6.8071F, 1.2941F, 0.0391F, 0.4053F));

		PartDefinition cube_r57 = bone4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(80, 97).mirror().addBox(-0.5F, -0.475F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.4339F, -10.667F, 4.8231F, 0.0287F, 0.0391F, 0.4053F));

		PartDefinition cube_r58 = bone4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(105, 126).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(100, 126).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2886F, 6.8031F, 6.5013F, -1.6774F, 0.0288F, 0.1106F));

		PartDefinition cube_r59 = bone4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(121, 69).mirror().addBox(-0.5F, -1.45F, -1.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2279F, 6.4596F, 7.2781F, -0.2811F, 0.0288F, 0.1106F));

		PartDefinition cube_r60 = bone4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(122, 4).mirror().addBox(-0.5F, -0.6F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.1006F, 5.3507F, 7.4207F, 0.8969F, 0.0308F, 0.1079F));

		PartDefinition cube_r61 = bone4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(18, 95).mirror().addBox(0.1086F, -0.264F, -0.6562F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2216F, -0.2678F, 3.638F, 0.5478F, 0.0308F, 0.1079F));

		PartDefinition cube_r62 = bone4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(97, 11).mirror().addBox(-0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1763F, -1.2294F, 1.2507F, 0.5768F, 0.0159F, -0.1731F));

		PartDefinition cube_r63 = bone4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(38, 116).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3695F, -0.2518F, 2.6195F, 0.5899F, -0.1451F, -0.0242F));

		PartDefinition cube_r64 = bone4.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(56, 122).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.208F, -1.1547F, 2.3987F, 0.7949F, 0.0159F, -0.1731F));

		PartDefinition cube_r65 = bone4.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(80, 92).mirror().addBox(-0.5F, -0.8F, -0.775F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.0422F, -2.0567F, 0.9631F, 2.2873F, 0.0313F, -0.1956F));

		PartDefinition cube_r66 = bone4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(132, 123).mirror().addBox(0.142F, -4.0627F, -0.342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2216F, -0.7678F, 4.5629F, 0.9806F, 0.0911F, -0.1489F));

		PartDefinition cube_r67 = bone4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(107, 93).mirror().addBox(-0.5F, 0.0F, -1.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3025F, -5.2641F, 2.8F, 0.0788F, 0.0767F, -0.0803F));

		PartDefinition cube_r68 = bone4.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(115, 82).mirror().addBox(-0.3263F, -1.0487F, -0.4517F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2216F, -2.7678F, 2.1879F, 0.4279F, 0.0219F, -0.1723F));

		PartDefinition cube_r69 = bone4.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(0, 115).mirror().addBox(-0.5F, -1.6F, -2.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3134F, -5.7645F, 2.8932F, 0.462F, -0.0639F, -0.0248F));

		PartDefinition cube_r70 = bone4.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(23, 102).mirror().addBox(-0.5F, -1.775F, -4.1F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0277F, -0.7271F, -1.7F, -1.2309F, -0.0639F, -0.0248F));

		PartDefinition cube_r71 = bone4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(15, 133).mirror().addBox(-0.5F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5825F, 7.8114F, -7.8206F, -2.2576F, 0.0125F, 0.1832F));

		PartDefinition cube_r72 = bone4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(10, 133).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6957F, 8.476F, -7.0426F, -2.5194F, 0.0125F, 0.1832F));

		PartDefinition cube_r73 = bone4.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(99, 132).mirror().addBox(-0.5F, 0.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4803F, 8.0129F, -9.8318F, 0.0102F, -0.0487F, 0.1659F));

		PartDefinition cube_r74 = bone4.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(119, 60).mirror().addBox(-0.5F, 0.0F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4803F, 8.0129F, -9.8318F, 0.7956F, -0.0487F, 0.1659F));

		PartDefinition cube_r75 = bone4.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(30, 133).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6919F, 9.0214F, -8.9668F, -0.0335F, -0.0487F, 0.1659F));

		PartDefinition cube_r76 = bone4.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(85, 126).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6069F, 8.4111F, -8.6199F, -1.2988F, -0.0487F, 0.1659F));

		PartDefinition cube_r77 = bone4.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(27, 120).mirror().addBox(-0.5F, -2.1F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3752F, 6.8112F, -9.0192F, -0.3744F, -0.0461F, 0.1729F));

		PartDefinition cube_r78 = bone4.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(57, 115).mirror().addBox(-0.5F, -1.5F, -0.625F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1447F, 2.4413F, -6.7322F, -0.3232F, -0.0624F, 0.1677F));

		PartDefinition cube_r79 = bone4.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(62, 115).mirror().addBox(-0.5099F, -4.8052F, -0.9866F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3159F, 1.2044F, -5.8833F, -0.4284F, -0.0668F, -0.0151F));

		PartDefinition cube_r80 = bone4.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(113, 10).mirror().addBox(-0.5099F, -0.6052F, -0.9866F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.171F, -2.7986F, -4.6201F, -0.3236F, -0.0668F, -0.0151F));

		PartDefinition cube_r81 = bone4.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(96, 106).mirror().addBox(-0.5F, -2.4F, -1.425F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0318F, -4.7245F, -3.6003F, -0.2884F, -0.0639F, -0.0248F));

		PartDefinition cube_r82 = bone4.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(40, 58).mirror().addBox(-0.6156F, -0.3139F, -2.6767F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.0524F, -7.1517F, -1.4142F, -0.1925F, -0.0639F, -0.0248F));

		PartDefinition cube_r83 = bone4.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(103, 106).mirror().addBox(-0.5F, 1.5F, -3.3F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.3769F, -7.851F, -8.6278F, 2.3736F, 0.3289F, 0.3595F));

		PartDefinition cube_r84 = bone4.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(105, 122).mirror().addBox(-0.0181F, -2.014F, -0.9926F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4356F, -8.3203F, -7.7807F, -1.9897F, 0.3289F, 0.3595F));

		PartDefinition cube_r85 = bone4.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(71, 130).mirror().addBox(-0.0181F, -1.014F, 0.0074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3288F, -9.1444F, -8.337F, -0.9425F, 0.3289F, 0.3595F));

		PartDefinition cube_r86 = bone4.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(45, 130).mirror().addBox(-0.0181F, -0.039F, 0.0324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1422F, -10.0189F, -8.7266F, 0.4102F, 0.3289F, 0.3595F));

		PartDefinition cube_r87 = bone4.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(14, 118).mirror().addBox(-0.0181F, -0.039F, -0.9676F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6796F, -10.7038F, -8.1637F, 0.9338F, 0.3289F, 0.3595F));

		PartDefinition cube_r88 = bone4.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(47, 70).mirror().addBox(-0.0181F, -0.039F, -1.9676F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2232F, -11.6203F, -6.6324F, 0.6283F, 0.3289F, 0.3595F));

		PartDefinition cube_r89 = bone4.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(114, 74).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.7079F, -11.8402F, -4.0364F, 1.3251F, 0.3037F, 0.3808F));

		PartDefinition cube_r90 = bone4.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(95, 20).mirror().addBox(-1.1F, 0.15F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.284F, -11.7668F, -4.249F, 0.2343F, 0.3037F, 0.3808F));

		PartDefinition cube_r91 = bone4.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(106, 41).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.6809F, -11.7166F, -2.0107F, 0.0747F, 0.0321F, 0.4016F));

		PartDefinition cube_r92 = bone4.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(24, 86).mirror().addBox(-0.42F, 0.205F, 1.0796F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.6795F, -12.0054F, -3.074F, -0.0562F, 0.0321F, 0.4016F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 0.9292F, 3.0443F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(5, 120).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0F, 13.4131F, -0.4377F, -1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg1.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(14, 109).addBox(-1.5F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.0F, 14.3267F, -0.8445F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg1.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(118, 102).addBox(-1.5F, -1.0F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0F, 14.878F, -2.767F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg1.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(116, 21).addBox(-5.1F, -2.0807F, -0.918F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.6F, 12.8054F, -0.9045F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg1.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(107, 62).addBox(-1.0F, -3.2F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 12.3655F, -1.746F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg1.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(48, 105).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5F, 8.2751F, -3.1299F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg1.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(104, 21).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, 6.3304F, -2.6631F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg1.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(24, 94).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5F, -0.4757F, -1.8473F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg1.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(67, 106).addBox(-1.0F, -4.075F, -0.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.5F, 2.4113F, 1.0303F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg1.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(33, 95).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, 2.4113F, 1.0303F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg1.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(87, 55).addBox(-1.0F, -5.0F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.5F, 6.3304F, -2.6631F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg1.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(33, 87).addBox(-5.1F, -5.232F, -0.7683F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.6F, 14.7773F, -2.92F, -0.0611F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 14.9751F, -1.0181F, 1.8413F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(71, 0).addBox(-1.0F, -0.75F, -1.9F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3F, 1.1606F, -0.8554F, -1.117F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(96, 60).addBox(-1.0F, -1.25F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F))
				.texOffs(99, 41).addBox(-1.0F, -0.95F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.3F, -0.1188F, -2.8654F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(0, 88).addBox(-0.1F, -1.05F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(62, 77).addBox(-1.0F, -2.625F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.3F, 13.348F, -1.8443F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(19, 68).addBox(-1.0F, -12.2F, -0.5F, 2.0F, 16.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.3F, 12.0497F, -0.6659F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(14, 113).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3F, -0.7173F, 1.2168F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightLeg2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(33, 68).addBox(-1.1F, -1.0318F, 0.0813F, 2.0F, 15.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.2F, 1.8471F, -0.5117F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightLeg2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(97, 89).addBox(-0.5F, -5.6115F, -0.7135F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, 5.6612F, -0.2063F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r113 = rightLeg2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(57, 106).addBox(-0.5F, 2.1143F, -0.2626F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.8F, 5.6612F, -0.2063F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r114 = rightLeg2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(52, 110).addBox(-0.5F, -6.0422F, -0.4124F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.8F, 7.8424F, -0.4934F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r115 = rightLeg2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(47, 110).addBox(-0.5F, -6.0422F, -0.4124F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.8F, 7.8424F, -0.4934F, -0.0785F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(15, 86).addBox(-1.0F, 0.0554F, -0.5239F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.6819F, -1.6544F, -2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r116 = rightLeg3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(122, 105).addBox(0.2966F, -0.5473F, 0.7221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, 0.1309F));

		PartDefinition cube_r117 = rightLeg3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(67, 119).addBox(0.2966F, -3.0522F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.9F, 3.5553F, -0.0239F, 0.1309F, 0.0F, 0.1309F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(65, 21).addBox(-1.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 6.999F, 0.1898F, 1.7191F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(44, 33).addBox(-2.5F, -0.8F, -4.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7254F, -3.9319F, -0.3889F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 0.9292F, 3.0443F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r118 = leftLeg1.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(120, 43).addBox(-0.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.0F, 13.4131F, -0.4377F, -1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r119 = leftLeg1.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(110, 26).addBox(-0.5F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.0F, 14.3267F, -0.8445F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r120 = leftLeg1.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(120, 40).addBox(-0.5F, -1.0F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.0F, 14.878F, -2.767F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r121 = leftLeg1.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(119, 56).addBox(3.1F, -2.0807F, -0.918F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-5.6F, 12.8054F, -0.9045F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r122 = leftLeg1.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(107, 68).addBox(-1.0F, -3.2F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 12.3655F, -1.746F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r123 = leftLeg1.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(106, 5).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5F, 8.2751F, -3.1299F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r124 = leftLeg1.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(105, 75).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5F, 6.3304F, -2.6631F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r125 = leftLeg1.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(9, 95).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5F, -0.4757F, -1.8473F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r126 = leftLeg1.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(106, 88).addBox(-1.0F, -4.075F, -0.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.5F, 2.4113F, 1.0303F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r127 = leftLeg1.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(96, 75).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5F, 2.4113F, 1.0303F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r128 = leftLeg1.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(0, 94).addBox(-1.0F, -5.0F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.5F, 6.3304F, -2.6631F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r129 = leftLeg1.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(71, 92).addBox(3.1F, -5.232F, -0.7683F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-5.6F, 14.7773F, -2.92F, -0.0611F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 14.9751F, -1.0181F, 0.726F, 0.1615F, -0.1167F));

		PartDefinition cube_r130 = leftLeg2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(47, 77).addBox(-1.0F, -0.75F, -1.9F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3F, 1.1606F, -0.8554F, -1.117F, 0.0F, 0.0F));

		PartDefinition cube_r131 = leftLeg2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(97, 0).addBox(-1.0F, -1.25F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F))
				.texOffs(116, 79).addBox(-1.0F, -0.95F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.3F, -0.1188F, -2.8654F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r132 = leftLeg2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(92, 14).addBox(-1.9F, -1.05F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.2F, 0.3526F, 0.2482F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r133 = leftLeg2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(0, 102).addBox(-1.0F, -2.625F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.3F, 13.348F, -1.8443F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r134 = leftLeg2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(26, 68).addBox(-1.0F, -12.2F, -0.5F, 2.0F, 16.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.3F, 12.0497F, -0.6659F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r135 = leftLeg2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(114, 93).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, -0.7173F, 1.2168F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r136 = leftLeg2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(40, 70).addBox(-0.9F, -1.0318F, 0.0813F, 2.0F, 15.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.2F, 1.8471F, -0.5117F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r137 = leftLeg2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(69, 100).addBox(-0.5F, -5.6115F, -0.7135F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, 5.6612F, -0.2063F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r138 = leftLeg2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(62, 106).addBox(-0.5F, 2.1143F, -0.2626F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.8F, 5.6612F, -0.2063F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r139 = leftLeg2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(67, 111).addBox(-0.5F, -6.0422F, -0.4124F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.8F, 7.8424F, -0.4934F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r140 = leftLeg2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(110, 105).addBox(-0.5F, -6.0422F, -0.4124F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.8F, 7.8424F, -0.4934F, -0.0785F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(86, 20).addBox(-2.0F, 0.0554F, -0.5239F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.6819F, -1.6544F, -0.728F, -0.0125F, 0.2459F));

		PartDefinition cube_r141 = leftLeg3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(25, 125).addBox(-1.2966F, -0.5473F, 0.7221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, -0.1309F));

		PartDefinition cube_r142 = leftLeg3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(80, 119).addBox(-1.2966F, -3.0522F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.9F, 3.5553F, -0.0239F, 0.1309F, 0.0F, -0.1309F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(65, 27).addBox(-4.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 6.999F, 0.1898F, 0.3665F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(44, 40).addBox(-3.5F, -0.8F, -4.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7254F, -3.9319F, -0.6507F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8302F, 9.0336F, -0.359F, -0.0817F, 0.0306F));

		PartDefinition cube_r143 = tail1.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(113, 17).addBox(0.0F, -1.2F, -0.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9878F, 8.5295F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r144 = tail1.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(40, 50).addBox(0.5F, 0.0871F, -0.1754F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.5299F, 3.2583F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r145 = tail1.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(15, 73).addBox(0.5F, -0.1129F, -0.7754F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.604F, 5.5805F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r146 = tail1.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(120, 82).addBox(0.5F, -3.6573F, -0.1162F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.4588F, 6.7807F, 0.0305F, 0.0F, 0.0F));

		PartDefinition cube_r147 = tail1.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(42, 108).addBox(0.5F, -4.1073F, -0.0162F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8208F, 3.7257F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r148 = tail1.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(37, 108).addBox(0.497F, -4.1323F, -1.0162F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5471F, 1.7357F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r149 = tail1.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(50, 11).mirror().addBox(-2.3F, -0.2F, -3.5F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4642F, -0.4873F, 4.2668F, 0.0464F, -0.0228F, 0.9605F));

		PartDefinition cube_r150 = tail1.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(50, 11).addBox(-0.7F, -0.2F, -3.5F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4642F, -0.4873F, 4.2668F, 0.0464F, 0.0228F, -0.9605F));

		PartDefinition cube_r151 = tail1.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(23, 27).addBox(0.0F, -1.9F, 0.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.6157F, -0.0618F, 0.1571F, 0.0F, 0.0F));

		PartDefinition tail = tail1.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -0.7998F, 8.6946F, 0.0526F, -0.0871F, -0.0046F));

		PartDefinition cube_r152 = tail.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(19, 60).mirror().addBox(-2.0F, 0.0F, -3.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2344F, -0.9246F, 3.3549F, 0.082F, -0.098F, 0.8249F));

		PartDefinition cube_r153 = tail.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(19, 60).addBox(0.0F, 0.0F, -3.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7656F, -0.9246F, 3.3549F, 0.082F, 0.098F, -0.8249F));

		PartDefinition cube_r154 = tail.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(55, 58).addBox(0.0F, -1.9F, 9.1F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5F, 2.4308F, -8.8805F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r155 = tail.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(116, 113).addBox(0.0F, -0.5F, -0.3F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.3858F, 7.2538F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r156 = tail.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(43, 116).addBox(0.0F, 0.3F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7395F, 4.0982F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r157 = tail.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(72, 111).addBox(0.0F, -0.6F, -0.6F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.903F, 1.7675F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r158 = tail.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(116, 121).addBox(0.5F, -3.5073F, -0.0162F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.6262F, 5.7753F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r159 = tail.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(119, 118).addBox(0.5F, -3.4073F, -0.0162F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.6262F, 3.7753F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r160 = tail.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(53, 118).addBox(0.5F, -3.7823F, -0.0162F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.2832F, 1.8025F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r161 = tail.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(11, 88).addBox(0.5F, -3.7073F, -0.0162F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.0395F, -0.1826F, -0.0611F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.4624F, 6.8232F, 0.1577F, -0.0862F, -0.0137F));

		PartDefinition cube_r162 = tail2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(92, 124).addBox(0.0F, -3.5561F, -0.1566F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8424F, 7.0228F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r163 = tail2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(116, 127).addBox(0.0F, -3.5561F, 0.0684F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0254F, 4.9307F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r164 = tail2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(113, 122).addBox(0.0F, -3.5061F, -0.1316F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1823F, 3.1376F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r165 = tail2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(110, 122).addBox(0.0F, -3.3811F, 0.0684F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.374F, 0.946F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r166 = tail2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(0, 55).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.005F))
				.texOffs(52, 0).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.426F, 1.046F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r167 = tail2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(24, 117).addBox(0.0F, -0.8F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6829F, 2.6141F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r168 = tail2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(72, 120).addBox(0.0F, 0.0F, 0.1F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3999F, 6.1401F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r169 = tail2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(21, 117).addBox(0.0F, -0.6F, -0.2F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4489F, 4.297F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r170 = tail2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-1.6F, 0.0F, -3.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4386F, -1.0348F, 4.5174F, 0.0313F, 0.0035F, 0.8729F));

		PartDefinition cube_r171 = tail2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(0, 65).addBox(-0.4F, 0.0F, -3.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4386F, -1.0348F, 4.5174F, 0.0313F, -0.0035F, -0.8729F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7776F, 8.1476F, 0.0613F, -0.0871F, -0.0053F));

		PartDefinition cube_r172 = tail8.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(63, 47).mirror().addBox(-1.4F, 0.0F, -0.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3376F, 0.9727F, 0.0383F, 0.0074F, 0.9167F));

		PartDefinition cube_r173 = tail8.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(63, 47).addBox(-0.6F, 0.0F, -0.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3376F, 0.9727F, 0.0383F, -0.0074F, -0.9167F));

		PartDefinition cube_r174 = tail8.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(23, 39).addBox(-0.5F, -1.9F, 7.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2035F, -7.1016F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r175 = tail8.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(119, 125).addBox(0.0F, 4.2F, 3.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 123).addBox(0.0F, 2.0F, 1.7F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 123).addBox(0.0F, 0.5F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7643F, 2.89F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r176 = tail8.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(122, 118).addBox(0.0F, -0.2F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2632F, 1.244F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r177 = tail8.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(88, 130).addBox(0.0F, -2.5811F, -0.0316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 6.8984F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r178 = tail8.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(85, 130).addBox(0.0F, -2.6561F, -0.1316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 4.9984F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r179 = tail8.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(130, 79).addBox(0.0F, -2.8061F, -0.0316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 2.8984F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r180 = tail8.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(76, 130).addBox(0.0F, -2.8561F, -0.0316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 0.8984F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2223F, 8.9023F, 0.066F, -0.1306F, -0.0086F));

		PartDefinition cube_r181 = tail3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(43, 133).addBox(0.0F, -1.6128F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 133).addBox(0.0F, -1.9128F, 2.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 5.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r182 = tail3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(115, 132).addBox(0.0F, -1.5628F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 3.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r183 = tail3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(86, 29).addBox(0.0F, -1.7628F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 1.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r184 = tail3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(15, 82).addBox(0.0F, -1.9128F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.1037F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r185 = tail3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(131, 24).addBox(0.0F, 2.0F, 3.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 130).addBox(0.0F, 0.8F, 1.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 130).addBox(0.0F, -0.3F, -0.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.332F, 2.3058F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r186 = tail3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(44, 23).mirror().addBox(-0.9F, 0.0F, -4.5F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4356F, -0.6815F, 4.4289F, 0.036F, -0.0097F, 0.7424F));

		PartDefinition cube_r187 = tail3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(44, 23).addBox(-0.1F, 0.0F, -4.5F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4356F, -0.6815F, 4.4289F, 0.036F, 0.0097F, -0.7424F));

		PartDefinition cube_r188 = tail3.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(0, 44).addBox(-0.5F, 0.1F, 0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail9 = tail3.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7389F, 8.8298F, -0.0352F, -0.1308F, 0.0046F));

		PartDefinition cube_r189 = tail9.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(71, 8).addBox(-0.5F, 0.1F, 9.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0951F, -9.1335F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r190 = tail9.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(71, 127).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7103F, 5.0517F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r191 = tail9.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(33, 113).addBox(0.0F, -1.025F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5232F, 3.058F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r192 = tail9.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(133, 78).addBox(0.0F, 6.3F, 9.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 74).addBox(0.0F, 5.3F, 7.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 133).addBox(0.0F, 4.2F, 5.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0709F, -6.524F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r193 = tail9.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(46, 133).addBox(0.0F, -1.125F, -0.025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.487F, 1.0827F, -0.1134F, 0.0F, 0.0F));

		PartDefinition tail4 = tail9.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3811F, 5.9106F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r194 = tail4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(134, 110).addBox(0.0F, -0.475F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2883F, 5.0293F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r195 = tail4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(109, 134).addBox(0.0F, -0.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3581F, 3.0305F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r196 = tail4.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(134, 107).addBox(0.0F, -0.65F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 1.2316F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r197 = tail4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(134, 53).addBox(0.0F, 0.25F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 93).addBox(0.0F, -1.95F, -1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0108F, 3.2718F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r198 = tail4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(72, 57).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 0.2316F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(70, 68).addBox(-0.5F, -0.5698F, -0.2226F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.3471F, 6.1912F, -0.1063F, 0.1736F, -0.0184F));

		PartDefinition cube_r199 = tail5.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(0, 135).addBox(0.0F, 4.05F, 6.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 134).addBox(0.0F, 1.45F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6637F, -2.9195F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r200 = tail5.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(122, 134).addBox(0.0F, -0.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4277F, 2.9853F, 0.6021F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(21, 50).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5057F, 5.6774F, -0.132F, 0.1298F, -0.0172F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 73).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.1664F, 0.0861F, -0.0144F));

		PartDefinition tail10 = tail7.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(70, 76).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0223F, 5.9976F, -0.0983F, 0.2171F, -0.0212F));

		PartDefinition bone = tail1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -7.633F, 7.5531F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1802F, -3.1023F, -0.0525F, 0.0894F, 0.039F));

		PartDefinition cube_r201 = body.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(107, 54).addBox(-0.503F, -4.4022F, -1.0364F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2486F, -3.8492F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r202 = body.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(114, 62).addBox(-0.503F, -4.0022F, -2.0364F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3533F, -5.8465F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r203 = body.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(23, 109).addBox(-0.503F, -4.5522F, -0.0364F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1091F, -1.8541F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r204 = body.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(44, 47).addBox(-1.0F, 0.0F, 1.9F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.669F, -9.7704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r205 = body.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(27, 0).addBox(-3.5F, -5.0F, -0.1F, 7.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.309F, -8.5923F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r206 = body.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(124, 115).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -3.9704F, 0.0443F, 0.0544F, -0.6431F));

		PartDefinition cube_r207 = body.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(121, 96).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -3.9704F, 0.0171F, 0.068F, -1.0801F));

		PartDefinition cube_r208 = body.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(95, 27).mirror().addBox(-7.74F, -2.3355F, -0.4915F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -3.9704F, -0.0239F, 0.0659F, -1.6748F));

		PartDefinition cube_r209 = body.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(125, 102).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.119F, -0.9704F, -0.0534F, -0.019F, -0.6448F));

		PartDefinition cube_r210 = body.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(125, 121).mirror().addBox(-4.74F, -2.3355F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.119F, -0.9704F, -0.0113F, -0.0556F, -1.6748F));

		PartDefinition cube_r211 = body.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(56, 126).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.119F, -0.9704F, -0.0404F, -0.0398F, -1.0809F));

		PartDefinition cube_r212 = body.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(125, 8).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -6.9704F, 0.0623F, 0.0757F, -0.4866F));

		PartDefinition cube_r213 = body.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(125, 10).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -6.9704F, 0.0244F, 0.095F, -0.9241F));

		PartDefinition cube_r214 = body.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(75, 18).mirror().addBox(-9.6882F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -6.9704F, -0.033F, 0.0923F, -1.5202F));

		PartDefinition cube_r215 = body.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(75, 18).addBox(2.6881F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -6.9704F, -0.033F, -0.0923F, 1.5202F));

		PartDefinition cube_r216 = body.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(125, 10).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -6.9704F, 0.0244F, -0.095F, 0.9241F));

		PartDefinition cube_r217 = body.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(125, 8).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -6.9704F, 0.0623F, -0.0757F, 0.4866F));

		PartDefinition cube_r218 = body.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(56, 126).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.119F, -0.9704F, -0.0404F, 0.0398F, 1.0809F));

		PartDefinition cube_r219 = body.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(125, 121).addBox(2.74F, -2.3355F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.119F, -0.9704F, -0.0113F, 0.0556F, 1.6748F));

		PartDefinition cube_r220 = body.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(125, 102).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.119F, -0.9704F, -0.0534F, 0.019F, 0.6448F));

		PartDefinition cube_r221 = body.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(95, 27).addBox(2.74F, -2.3355F, -0.4915F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -3.9704F, -0.0239F, -0.0659F, 1.6748F));

		PartDefinition cube_r222 = body.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(121, 96).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -3.9704F, 0.0171F, -0.068F, 1.0801F));

		PartDefinition cube_r223 = body.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(124, 115).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -3.9704F, 0.0443F, -0.0544F, 0.6431F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(29, 11).addBox(-0.5F, -1.1F, -9.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3765F, -7.7702F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r224 = body2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(76, 108).addBox(0.0F, -3.8122F, -1.0627F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0895F, -1.9945F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r225 = body2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(28, 113).addBox(0.0F, -3.4117F, -0.8614F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9992F, -8.195F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r226 = body2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(112, 50).addBox(0.0F, -3.7367F, -0.9614F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0263F, -5.0951F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r227 = body2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(63, 55).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.0291F, 0.1628F, -1.3956F));

		PartDefinition cube_r228 = body2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(33, 85).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.1156F, 0.1186F, -0.7977F));

		PartDefinition cube_r229 = body2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(121, 77).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.1546F, 0.0589F, -0.3637F));

		PartDefinition cube_r230 = body2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(122, 38).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.2096F, 0.0868F, -0.3256F));

		PartDefinition cube_r231 = body2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(122, 46).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.154F, 0.1669F, -0.7581F));

		PartDefinition cube_r232 = body2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(67, 33).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.0333F, 0.2242F, -1.3607F));

		PartDefinition cube_r233 = body2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(67, 44).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, -0.0037F, 0.0814F, -1.449F));

		PartDefinition cube_r234 = body2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(122, 109).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.0425F, 0.0696F, -0.854F));

		PartDefinition cube_r235 = body2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(122, 111).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.0687F, 0.0439F, -0.4002F));

		PartDefinition cube_r236 = body2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(122, 111).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.0687F, -0.0439F, 0.4002F));

		PartDefinition cube_r237 = body2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(0, 15).addBox(-3.5F, -2.3102F, -4.2685F, 7.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.446F, -3.2803F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r238 = body2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(122, 109).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.0425F, -0.0696F, 0.854F));

		PartDefinition cube_r239 = body2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(67, 44).addBox(2.6881F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, -0.0037F, -0.0814F, 1.449F));

		PartDefinition cube_r240 = body2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(67, 33).addBox(2.6881F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.0333F, -0.2242F, 1.3607F));

		PartDefinition cube_r241 = body2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(122, 46).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.154F, -0.1669F, 0.7581F));

		PartDefinition cube_r242 = body2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(122, 38).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.2096F, -0.0868F, 0.3256F));

		PartDefinition cube_r243 = body2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(121, 77).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.1546F, -0.0589F, 0.3637F));

		PartDefinition cube_r244 = body2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(33, 85).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.1156F, -0.1186F, 0.7977F));

		PartDefinition cube_r245 = body2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(63, 55).addBox(2.6881F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.0291F, -0.1628F, 1.3956F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8461F, -9.0012F, 0.1747F, 0.043F, 0.0076F));

		PartDefinition cube_r246 = chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(113, 41).addBox(-0.5F, -2.2141F, -0.0945F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.9391F, -1.9368F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r247 = chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(17, 124).addBox(0.0F, -3.2525F, -0.1399F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0609F, -1.8368F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r248 = chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(131, 46).addBox(0.0F, -3.1217F, -0.0424F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0609F, -3.9368F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r249 = chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(82, 40).addBox(-4.9365F, 0.1974F, -1.2304F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9365F, 11.3277F, -6.2079F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r250 = chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(82, 53).mirror().addBox(-7.0F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4186F, 12.5188F, -6.2665F, -0.3538F, 1.0202F, -0.2808F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(29, 25).mirror().addBox(-4.8F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7123F, 12.3685F, -6.3011F, -0.4126F, 1.0899F, 0.2233F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(87, 63).mirror().addBox(-2.7018F, 1.2591F, -0.4613F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9365F, 11.3277F, -6.2079F, -0.7946F, 1.076F, 0.4695F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(123, 17).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6891F, -1.4368F, 0.0261F, 0.0273F, -0.3357F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(123, 19).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6891F, -1.4368F, 0.0121F, 0.0358F, -0.7722F));

		PartDefinition cube_r255 = chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(50, 19).mirror().addBox(-13.6882F, -2.8327F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6891F, -1.4368F, -0.01F, 0.0364F, -1.366F));

		PartDefinition cube_r256 = chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(71, 16).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7391F, -3.4368F, 0.0176F, 0.0831F, -1.4159F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(123, 21).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7391F, -3.4368F, 0.0611F, 0.0591F, -0.8215F));

		PartDefinition cube_r258 = chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(123, 23).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7391F, -3.4368F, 0.0803F, 0.0277F, -0.3858F));

		PartDefinition cube_r259 = chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(72, 65).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -5.3368F, 0.0438F, 0.1298F, -1.4827F));

		PartDefinition cube_r260 = chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(123, 79).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -5.3368F, 0.109F, 0.0831F, -0.8876F));

		PartDefinition cube_r261 = chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(123, 81).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -5.3368F, 0.1337F, 0.0294F, -0.4538F));

		PartDefinition cube_r262 = chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(123, 83).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -7.3368F, 0.2F, 0.0507F, -0.4513F));

		PartDefinition cube_r263 = chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(123, 85).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -7.3368F, 0.1604F, 0.1302F, -0.8822F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(29, 23).mirror().addBox(-8.6882F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0391F, -7.3368F, 0.0599F, 0.1975F, -1.4802F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-1.4539F, 0.3925F, -5.4555F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9365F, 11.3277F, -6.2079F, -0.7488F, -0.3643F, 0.3198F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(29, 23).addBox(2.6881F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -7.3368F, 0.0599F, -0.1975F, 1.4802F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(123, 85).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -7.3368F, 0.1604F, -0.1302F, 0.8822F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(123, 83).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -7.3368F, 0.2F, -0.0507F, 0.4513F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(14, 124).addBox(0.0F, -3.4926F, -0.2837F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2391F, -7.7368F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r270 = chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(123, 81).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -5.3368F, 0.1337F, -0.0294F, 0.4538F));

		PartDefinition cube_r271 = chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(123, 79).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -5.3368F, 0.109F, -0.0831F, 0.8876F));

		PartDefinition cube_r272 = chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(72, 65).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0391F, -5.3368F, 0.0438F, -0.1298F, 1.4827F));

		PartDefinition cube_r273 = chest.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(123, 23).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7391F, -3.4368F, 0.0803F, -0.0277F, 0.3858F));

		PartDefinition cube_r274 = chest.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(123, 21).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7391F, -3.4368F, 0.0611F, -0.0591F, 0.8215F));

		PartDefinition cube_r275 = chest.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(71, 16).addBox(2.6881F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7391F, -3.4368F, 0.0176F, -0.0831F, 1.4159F));

		PartDefinition cube_r276 = chest.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(50, 19).addBox(2.6881F, -2.8327F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6891F, -1.4368F, -0.01F, -0.0364F, 1.366F));

		PartDefinition cube_r277 = chest.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(123, 19).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6891F, -1.4368F, 0.0121F, -0.0358F, 0.7722F));

		PartDefinition cube_r278 = chest.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(82, 35).addBox(-3.0F, 0.2596F, -7.1205F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 14.8118F, 4.1957F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r279 = chest.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(123, 17).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6891F, -1.4368F, 0.0261F, -0.0273F, 0.3357F));

		PartDefinition cube_r280 = chest.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(11, 123).addBox(0.0F, -3.3927F, -0.2837F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2391F, -5.7368F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r281 = chest.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(0, 81).addBox(-0.5461F, 0.3925F, -5.4555F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9365F, 11.3277F, -6.2079F, -0.7488F, 0.3643F, -0.3198F));

		PartDefinition cube_r282 = chest.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(87, 63).addBox(-0.2982F, 1.2591F, -0.4613F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9365F, 11.3277F, -6.2079F, -0.7946F, -1.076F, -0.4695F));

		PartDefinition cube_r283 = chest.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(29, 25).addBox(-0.2F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7123F, 12.3685F, -6.3011F, -0.4126F, -1.0899F, -0.2233F));

		PartDefinition cube_r284 = chest.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(82, 53).addBox(0.0F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4186F, 12.5188F, -6.2665F, -0.3538F, -1.0202F, 0.2808F));

		PartDefinition cube_r285 = chest.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(47, 85).addBox(-2.9365F, 0.3925F, -5.0268F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9365F, 11.3277F, -6.2079F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r286 = chest.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(55, 68).addBox(-0.5F, -0.1119F, -5.8679F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1609F, -2.0368F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.6226F, 5.6508F, -4.3492F, -0.428F, 0.0981F, -0.1959F));

		PartDefinition cube_r287 = bone2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(104, 16).addBox(-0.5F, -0.4F, -2.85F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F))
				.texOffs(14, 104).addBox(-0.5F, -0.9F, -2.95F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5002F, -2.1639F, -0.5243F, 1.3134F, -0.0148F, -0.0092F));

		PartDefinition cube_r288 = bone2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(81, 114).addBox(-1.0027F, -0.3082F, -4.095F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.949F, 0.6577F, -2.1781F, 0.528F, -0.0148F, 0.5143F));

		PartDefinition cube_r289 = bone2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(118, 98).addBox(-1.0027F, -2.7003F, 2.0024F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F))
				.texOffs(95, 118).addBox(-1.0027F, -3.3003F, 2.0024F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.949F, 0.6577F, -2.1781F, -3.1284F, -0.0148F, 0.5143F));

		PartDefinition cube_r290 = bone2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(88, 114).addBox(-1.0027F, -5.0741F, -3.0793F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.949F, 0.6577F, -2.1781F, 2.0639F, -0.0148F, 0.5143F));

		PartDefinition cube_r291 = bone2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(101, 29).addBox(-1.0027F, -0.1293F, -5.9339F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.949F, 0.6577F, -2.1781F, 1.0604F, -0.0148F, 0.5143F));

		PartDefinition cube_r292 = bone2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(0, 109).addBox(-1.0027F, 3.2218F, -0.0002F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.949F, 0.6577F, -2.1781F, -0.205F, -0.0148F, 0.5143F));

		PartDefinition cube_r293 = bone2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(60, 100).addBox(-1.0027F, -0.9572F, 3.4515F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.949F, 0.6577F, -2.1781F, -1.3046F, -0.0148F, 0.5143F));

		PartDefinition cube_r294 = bone2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(88, 108).addBox(-1.0027F, -5.8338F, 0.9164F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.949F, 0.6577F, -2.1781F, -2.2645F, -0.0148F, 0.5143F));

		PartDefinition cube_r295 = bone2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(131, 113).addBox(-1.0027F, -1.9155F, -5.5861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.949F, 0.6577F, -2.1781F, 2.6224F, -0.0148F, 0.5143F));

		PartDefinition cube_r296 = bone2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(110, 131).addBox(-1.0027F, 0.2919F, -5.5112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.949F, 0.6577F, -2.1781F, 2.2297F, -0.0148F, 0.5143F));

		PartDefinition cube_r297 = bone2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(30, 107).addBox(-1.0027F, 1.2862F, -3.9101F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.949F, 0.6577F, -2.1781F, 1.3571F, -0.0148F, 0.5143F));

		PartDefinition cube_r298 = bone2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(62, 92).addBox(-1.0027F, -0.1131F, -1.3705F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.949F, 0.6577F, -2.1781F, 0.2662F, -0.0148F, 0.5143F));

		PartDefinition cube_r299 = bone2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(53, 91).addBox(-1.0027F, -0.7781F, -3.1951F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.949F, 0.6577F, -2.1781F, 0.7462F, -0.0148F, 0.5143F));

		PartDefinition cube_r300 = bone2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(42, 91).addBox(-0.5F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5002F, -2.1639F, -0.5243F, 1.008F, -0.0148F, -0.0092F));

		PartDefinition cube_r301 = bone2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(87, 103).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4578F, -4.9403F, 0.6114F, 1.1825F, -0.0148F, -0.0092F));

		PartDefinition cube_r302 = bone2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(78, 103).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.432F, -8.094F, 0.3804F, 1.3222F, -0.0148F, -0.0092F));

		PartDefinition cube_r303 = bone2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(46, 118).addBox(-0.5F, -0.8F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F))
				.texOffs(39, 103).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4378F, -6.8688F, 0.7529F, 1.1913F, -0.0148F, -0.0092F));

		PartDefinition cube_r304 = bone2.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(103, 11).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4657F, -3.708F, 0.8461F, 1.2785F, -0.0148F, -0.0092F));

		PartDefinition cube_r305 = bone2.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(0, 125).addBox(-0.9453F, -1.2136F, -0.7843F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.9555F, -0.9822F, -0.4595F, 0.3011F, -0.0148F, -0.0092F));

		PartDefinition cube_r306 = bone2.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(30, 102).addBox(-0.9453F, -0.7136F, 0.0157F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.9555F, -0.9822F, -0.4595F, 1.2174F, -0.0148F, -0.0092F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.6226F, 5.6508F, -4.3492F, -0.428F, -0.0981F, 0.1959F));

		PartDefinition cube_r307 = bone5.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(104, 16).mirror().addBox(-0.5F, -0.4F, -2.85F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(14, 104).mirror().addBox(-0.5F, -0.9F, -2.95F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5002F, -2.1639F, -0.5243F, 1.3134F, 0.0148F, 0.0092F));

		PartDefinition cube_r308 = bone5.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(81, 114).mirror().addBox(0.0027F, -0.3082F, -4.095F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.949F, 0.6577F, -2.1781F, 0.528F, 0.0148F, -0.5143F));

		PartDefinition cube_r309 = bone5.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(118, 98).mirror().addBox(0.0027F, -2.7003F, 2.0024F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(95, 118).mirror().addBox(0.0027F, -3.3003F, 2.0024F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.949F, 0.6577F, -2.1781F, -3.1284F, 0.0148F, -0.5143F));

		PartDefinition cube_r310 = bone5.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(88, 114).mirror().addBox(0.0027F, -5.0741F, -3.0793F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.949F, 0.6577F, -2.1781F, 2.0639F, 0.0148F, -0.5143F));

		PartDefinition cube_r311 = bone5.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(101, 29).mirror().addBox(0.0027F, -0.1293F, -5.9339F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.949F, 0.6577F, -2.1781F, 1.0604F, 0.0148F, -0.5143F));

		PartDefinition cube_r312 = bone5.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(0, 109).mirror().addBox(0.0027F, 3.2218F, -0.0002F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-0.949F, 0.6577F, -2.1781F, -0.205F, 0.0148F, -0.5143F));

		PartDefinition cube_r313 = bone5.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(60, 100).mirror().addBox(0.0027F, -0.9572F, 3.4515F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.949F, 0.6577F, -2.1781F, -1.3046F, 0.0148F, -0.5143F));

		PartDefinition cube_r314 = bone5.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(88, 108).mirror().addBox(0.0027F, -5.8338F, 0.9164F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.949F, 0.6577F, -2.1781F, -2.2645F, 0.0148F, -0.5143F));

		PartDefinition cube_r315 = bone5.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(131, 113).mirror().addBox(0.0027F, -1.9155F, -5.5861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.949F, 0.6577F, -2.1781F, 2.6224F, 0.0148F, -0.5143F));

		PartDefinition cube_r316 = bone5.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(110, 131).mirror().addBox(0.0027F, 0.2919F, -5.5112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.949F, 0.6577F, -2.1781F, 2.2297F, 0.0148F, -0.5143F));

		PartDefinition cube_r317 = bone5.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(30, 107).mirror().addBox(0.0027F, 1.2862F, -3.9101F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.949F, 0.6577F, -2.1781F, 1.3571F, 0.0148F, -0.5143F));

		PartDefinition cube_r318 = bone5.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(62, 92).mirror().addBox(0.0027F, -0.1131F, -1.3705F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.949F, 0.6577F, -2.1781F, 0.2662F, 0.0148F, -0.5143F));

		PartDefinition cube_r319 = bone5.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(53, 91).mirror().addBox(0.0027F, -0.7781F, -3.1951F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.949F, 0.6577F, -2.1781F, 0.7462F, 0.0148F, -0.5143F));

		PartDefinition cube_r320 = bone5.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(42, 91).mirror().addBox(-0.5F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5002F, -2.1639F, -0.5243F, 1.008F, 0.0148F, 0.0092F));

		PartDefinition cube_r321 = bone5.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(87, 103).mirror().addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4578F, -4.9403F, 0.6114F, 1.1825F, 0.0148F, 0.0092F));

		PartDefinition cube_r322 = bone5.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(78, 103).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.432F, -8.094F, 0.3804F, 1.3222F, 0.0148F, 0.0092F));

		PartDefinition cube_r323 = bone5.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(46, 118).mirror().addBox(-0.5F, -0.8F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(39, 103).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4378F, -6.8688F, 0.7529F, 1.1913F, 0.0148F, 0.0092F));

		PartDefinition cube_r324 = bone5.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(103, 11).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4657F, -3.708F, 0.8461F, 1.2785F, 0.0148F, 0.0092F));

		PartDefinition cube_r325 = bone5.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(0, 125).mirror().addBox(-0.0547F, -1.2136F, -0.7843F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9555F, -0.9822F, -0.4595F, 0.3011F, 0.0148F, 0.0092F));

		PartDefinition cube_r326 = bone5.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(30, 102).mirror().addBox(-0.0547F, -0.7136F, 0.0157F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9555F, -0.9822F, -0.4595F, 1.2174F, 0.0148F, 0.0092F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(5.2843F, 6.9455F, -5.6331F, 1.3835F, 0.2368F, 0.1128F));

		PartDefinition cube_r327 = leftArm1.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(127, 43).addBox(0.0F, -0.625F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3037F, 0.0186F, 0.0504F, -0.8463F, -0.2207F, -0.0253F));

		PartDefinition cube_r328 = leftArm1.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(35, 126).addBox(-0.325F, -1.9F, 0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5706F, 1.1418F, -1.0192F, -0.14F, -0.5589F, 0.0126F));

		PartDefinition cube_r329 = leftArm1.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(33, 116).addBox(6.0F, -1.0842F, 0.4838F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.2F, 1.1847F, -1.6107F, -0.4204F, -0.0786F, -0.067F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(61, 122).addBox(-0.8F, -0.4307F, -1.5734F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(75, 122).addBox(-0.8F, -0.4307F, -0.6734F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0087F, 4.4016F, -0.9799F, -0.5654F, -0.0785F, -0.1308F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1086F, 1.6668F, 0.207F, -0.0873F, 0.0F, 0.1745F));

		PartDefinition cube_r330 = leftHand.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(115, 4).addBox(0.0F, -2.6F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r331 = leftHand.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(130, 84).addBox(0.0F, -1.1F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 0.2032F, -1.2796F, -0.1833F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1877F, 6.9346F, -5.6096F, 1.3835F, -0.2368F, -0.1128F));

		PartDefinition cube_r332 = rightArm1.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(56, 128).addBox(-1.0F, -0.625F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3037F, 0.0186F, 0.0504F, -0.8463F, 0.2207F, 0.0253F));

		PartDefinition cube_r333 = rightArm1.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(126, 56).addBox(-0.675F, -1.9F, 0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5706F, 1.1418F, -1.0192F, -0.14F, 0.5589F, -0.0126F));

		PartDefinition cube_r334 = rightArm1.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(75, 116).addBox(-7.0F, -1.0842F, 0.4838F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.2F, 1.1847F, -1.6107F, -0.4204F, 0.0786F, 0.067F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(122, 88).addBox(-0.2F, -0.4307F, -1.5734F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(95, 122).addBox(-0.2F, -0.4307F, -0.6734F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0087F, 4.4017F, -0.9799F, -0.5654F, 0.0785F, 0.1308F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1086F, 1.6668F, 0.207F, -0.0873F, 0.0F, -0.1745F));

		PartDefinition cube_r335 = rightHand.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(115, 35).addBox(-1.0F, -2.6F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r336 = rightHand.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(66, 132).addBox(-1.0F, -1.1F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 0.2032F, -1.2796F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8698F, -7.7672F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r337 = neck1.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(42, 124).addBox(0.0F, -3.3459F, -0.016F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0311F, -1.8666F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r338 = neck1.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(88, 44).mirror().addBox(-5.6882F, -2.8327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.0688F, 0.8688F, -1.6889F));

		PartDefinition cube_r339 = neck1.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(124, 0).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.624F, 0.6538F, -0.9096F));

		PartDefinition cube_r340 = neck1.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(124, 2).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.8105F, 0.3631F, -0.5339F));

		PartDefinition cube_r341 = neck1.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(124, 2).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.8105F, -0.3631F, 0.5339F));

		PartDefinition cube_r342 = neck1.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(124, 0).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.624F, -0.6538F, 0.9096F));

		PartDefinition cube_r343 = neck1.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(88, 44).addBox(2.6881F, -2.8327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.0688F, -0.8688F, 1.6889F));

		PartDefinition cube_r344 = neck1.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(98, 95).addBox(-0.5F, -0.7F, 3.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.6719F, -5.6579F, 0.3142F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9438F, -2.3258F, 0.3077F, 0.1538F, 0.0937F));

		PartDefinition cube_r345 = neck2.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(63, 131).addBox(0.0F, -2.3816F, -0.0991F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1431F, -0.7163F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r346 = neck2.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(124, 29).mirror().addBox(-1.9081F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, 0.1948F, 0.546F, -1.0268F));

		PartDefinition cube_r347 = neck2.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(113, 46).mirror().addBox(-4.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, -0.0828F, 0.571F, -1.5421F));

		PartDefinition cube_r348 = neck2.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(113, 46).addBox(1.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, -0.0828F, -0.571F, 1.5421F));

		PartDefinition cube_r349 = neck2.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(124, 29).addBox(-0.0919F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, 0.1948F, -0.546F, 1.0268F));

		PartDefinition cube_r350 = neck2.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(97, 5).addBox(-0.5F, 1.4F, 5.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3859F, -7.7876F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3606F, -2.3471F, -0.2036F, 0.0089F, 0.0423F));

		PartDefinition cube_r351 = neck5.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(99, 35).addBox(-0.5F, 1.4F, 3.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.9754F, -5.9788F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r352 = neck5.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(105, 80).mirror().addBox(-5.7911F, -0.3926F, -0.2462F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -0.9742F, -0.25F, 1.0165F, -1.6558F));

		PartDefinition cube_r353 = neck5.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(124, 31).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -0.9742F, 0.442F, 0.9714F, -0.8436F));

		PartDefinition cube_r354 = neck5.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(124, 48).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9742F, 0.463F, 0.9843F, -0.8263F));

		PartDefinition cube_r355 = neck5.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(50, 21).mirror().addBox(-6.7911F, -0.3926F, -0.2462F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9742F, -0.2529F, 1.0339F, -1.6583F));

		PartDefinition cube_r356 = neck5.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(50, 21).addBox(1.7911F, -0.3926F, -0.2462F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9742F, -0.2529F, -1.0339F, 1.6583F));

		PartDefinition cube_r357 = neck5.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(124, 48).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9742F, 0.463F, -0.9843F, 0.8263F));

		PartDefinition cube_r358 = neck5.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(124, 31).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -0.9742F, 0.442F, -0.9714F, 0.8436F));

		PartDefinition cube_r359 = neck5.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(105, 80).addBox(1.7911F, -0.3926F, -0.2462F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -0.9742F, -0.25F, -1.0165F, 1.6558F));

		PartDefinition cube_r360 = neck5.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(55, 131).addBox(0.0F, -2.8566F, -0.1491F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6059F, -2.9414F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r361 = neck5.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(131, 51).addBox(0.0F, -2.5566F, -0.1491F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8842F, -0.9608F, -0.0785F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0819F, -2.7815F, 0.0057F, 0.1786F, 0.0209F));

		PartDefinition cube_r362 = neck4.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(124, 50).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, 0.6221F, 0.9947F, -0.6856F));

		PartDefinition cube_r363 = neck4.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(106, 48).mirror().addBox(-5.7663F, -0.3906F, -0.2552F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, -0.1495F, 1.1066F, -1.5599F));

		PartDefinition cube_r364 = neck4.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(124, 52).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, 0.5513F, 0.9603F, -0.7443F));

		PartDefinition cube_r365 = neck4.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(107, 99).mirror().addBox(-5.7663F, -0.3906F, -0.2552F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, -0.1507F, 1.0542F, -1.561F));

		PartDefinition cube_r366 = neck4.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(107, 99).addBox(1.7663F, -0.3906F, -0.2552F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, -0.1507F, -1.0542F, 1.561F));

		PartDefinition cube_r367 = neck4.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(124, 52).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, 0.5513F, -0.9603F, 0.7443F));

		PartDefinition cube_r368 = neck4.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(106, 48).addBox(1.7663F, -0.3906F, -0.2552F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, -0.1495F, -1.1066F, 1.5599F));

		PartDefinition cube_r369 = neck4.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(124, 50).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, 0.6221F, -0.9947F, 0.6856F));

		PartDefinition cube_r370 = neck4.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(134, 35).addBox(0.0F, -1.3677F, -0.0582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4916F, -3.9211F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r371 = neck4.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(134, 24).addBox(0.0F, -1.6677F, -0.0582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2697F, -1.931F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r372 = neck4.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(86, 0).addBox(-0.5F, 1.4F, 0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9504F, -3.9173F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5407F, -3.7756F, 0.3136F, 0.0636F, 0.0714F));

		PartDefinition cube_r373 = neck3.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(124, 54).mirror().addBox(-1.8547F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.3534F, -3.4609F, 0.3293F, 0.5553F, -1.0638F));

		PartDefinition cube_r374 = neck3.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(107, 101).mirror().addBox(-5.8842F, -0.3479F, -0.6322F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.3534F, -3.4609F, 0.0326F, 0.6359F, -1.584F));

		PartDefinition cube_r375 = neck3.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(124, 64).mirror().addBox(-1.8351F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.3306F, 0.5553F, -1.0103F));

		PartDefinition cube_r376 = neck3.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(107, 103).mirror().addBox(-5.8627F, -0.3478F, -0.617F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.0339F, 0.6365F, -1.5305F));

		PartDefinition cube_r377 = neck3.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(107, 103).addBox(1.8627F, -0.3478F, -0.617F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.0339F, -0.6365F, 1.5305F));

		PartDefinition cube_r378 = neck3.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(124, 64).addBox(-0.1649F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.3306F, -0.5553F, 1.0103F));

		PartDefinition cube_r379 = neck3.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(107, 101).addBox(1.8842F, -0.3479F, -0.6322F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3534F, -3.4609F, 0.0326F, -0.6359F, 1.584F));

		PartDefinition cube_r380 = neck3.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(124, 54).addBox(-0.1453F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3534F, -3.4609F, 0.3293F, -0.5553F, 1.0638F));

		PartDefinition cube_r381 = neck3.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(134, 49).addBox(0.5F, -1.4458F, -0.0223F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.6988F, -3.1055F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r382 = neck3.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(134, 45).addBox(0.5F, -1.269F, 0.0228F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.887F, -1.3144F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r383 = neck3.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(86, 7).addBox(0.0F, 1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -1.3168F, 1.7621F, -0.48F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6682F, -3.2726F, -0.5387F, -0.1539F, 0.0826F));

		PartDefinition cube_r384 = neck.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(124, 66).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4212F, -1.621F, 0.7519F, 0.9336F, -0.8163F));

		PartDefinition cube_r385 = neck.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(85, 124).mirror().addBox(-3.6944F, -0.3859F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4212F, -1.621F, 0.0657F, 1.1202F, -1.6041F));

		PartDefinition cube_r386 = neck.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(85, 124).addBox(1.6944F, -0.3859F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4212F, -1.621F, 0.0657F, -1.1202F, 1.6041F));

		PartDefinition cube_r387 = neck.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(58, 134).addBox(0.5F, -1.6207F, -0.1013F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8514F, -1.8891F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r388 = neck.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(51, 99).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r389 = neck.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(124, 66).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4212F, -1.621F, 0.7519F, -0.9336F, 0.8163F));

		PartDefinition neck6 = neck.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.15F, -2.45F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r390 = neck6.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(86, 14).addBox(1.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.0783F, -0.876F, 1.5935F));

		PartDefinition cube_r391 = neck6.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(7, 103).addBox(0.5F, -2.0207F, -2.0013F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8375F, -1.0498F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r392 = neck6.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(99, 82).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r393 = neck6.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(124, 113).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.5254F, -0.741F, 0.9857F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6807F, -3.1452F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r394 = head.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(99, 50).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.005F, -2.6438F, -4.4956F, 0.1091F, 0.0F, 0.0F));

		PartDefinition cube_r395 = head.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(108, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.005F, -1.5326F, -6.1585F, 0.589F, 0.0F, 0.0F));

		PartDefinition cube_r396 = head.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(102, 118).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.005F, -0.35F, -7.7714F, 0.6327F, 0.0F, 0.0F));

		PartDefinition cube_r397 = head.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(131, 90).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.005F, 0.3093F, -8.5233F, -0.8508F, 0.0F, 0.0F));

		PartDefinition cube_r398 = head.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(131, 71).addBox(-0.5025F, -1.0206F, -0.0101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0025F, 1.2578F, -8.9004F, -0.3883F, 0.0F, 0.0F));

		PartDefinition cube_r399 = head.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(127, 126).addBox(-0.4975F, 0.7508F, -1.6414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0025F, 1.4078F, -7.5004F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r400 = head.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(131, 68).addBox(-0.4975F, -1.0373F, -0.0093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0025F, 2.2578F, -9.1003F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r401 = head.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(118, 9).addBox(-0.5F, -0.7928F, -2.1385F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -2.1649F, -1.8891F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r402 = head.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(117, 52).addBox(-0.5F, -0.7792F, -0.8971F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, -2.1649F, -1.8891F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r403 = head.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(117, 48).addBox(-0.5F, -0.7F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -2.9396F, -1.2905F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r404 = head.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(90, 29).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.77F, -8.5449F, -0.184F, 0.0F, 0.0F));

		PartDefinition cube_r405 = head.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(82, 46).addBox(-1.0F, -0.9F, 1.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.6519F, -5.9083F, 0.0428F, 0.0F, 0.0F));

		PartDefinition cube_r406 = head.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(131, 65).addBox(-0.5F, -0.9F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -2.1562F, -0.7137F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r407 = head.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(85, 67).addBox(-2.0F, 0.4371F, -3.1968F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.5775F, 1.2132F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r408 = head.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(96, 70).addBox(-2.0F, -1.2F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.126F, -1.6979F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r409 = head.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(96, 65).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.4598F, -0.7553F, 1.9111F, 0.0F, 0.0F));

		PartDefinition cube_r410 = head.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(96, 55).addBox(-2.0F, -0.3F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.3075F, -0.4968F, 1.0385F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.701F, 2.3848F, -8.4379F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r411 = leftFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(20, 125).addBox(-0.5F, -1.925F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.3659F, -5.2785F, 7.8936F, 1.7792F, 1.1839F, -0.2465F));

		PartDefinition cube_r412 = leftFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(110, 30).addBox(-0.8F, -1.0F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5544F, -4.8269F, 7.2025F, 2.5F, 1.1384F, 0.0631F));

		PartDefinition cube_r413 = leftFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(40, 130).addBox(-0.8702F, -2.2757F, 0.6453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0681F, -2.9488F, 2.0024F, 2.913F, -0.2227F, 0.3521F));

		PartDefinition cube_r414 = leftFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(127, 123).addBox(-0.6354F, -0.0201F, 0.948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0681F, -2.9488F, 2.0024F, -2.2267F, -0.1801F, 0.5249F));

		PartDefinition cube_r415 = leftFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(0, 120).addBox(-0.7014F, -3.6195F, -0.7631F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0681F, -2.9488F, 2.0024F, -0.9598F, -0.0852F, 0.6F));

		PartDefinition cube_r416 = leftFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(121, 73).addBox(-0.6354F, -0.8192F, -0.7132F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0681F, -2.9488F, 2.0024F, -0.9003F, -0.1801F, 0.5249F));

		PartDefinition cube_r417 = leftFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(125, 117).addBox(-5.0784F, 1.8475F, 1.4774F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -2.8452F, -0.1996F, 0.8272F));

		PartDefinition cube_r418 = leftFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(80, 125).addBox(-5.0784F, 0.7182F, 2.9625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 3.0017F, -0.1996F, 0.8272F));

		PartDefinition cube_r419 = leftFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(119, 113).addBox(-5.0784F, 1.5951F, 0.3693F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -2.6008F, -0.1996F, 0.8272F));

		PartDefinition cube_r420 = leftFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(117, 30).addBox(-0.8933F, 0.7215F, -0.0277F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 0.0711F, 0.1745F, -0.0308F));

		PartDefinition cube_r421 = leftFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(127, 104).addBox(-0.3034F, 0.1551F, -9.2521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 0.0566F, 0.3009F, 0.0164F));

		PartDefinition cube_r422 = leftFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(75, 126).addBox(-0.2804F, 2.1991F, -7.3835F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -0.2811F, 0.3018F, -0.0086F));

		PartDefinition cube_r423 = leftFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(115, 88).addBox(-0.2804F, -7.7722F, -5.1269F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 1.1588F, 0.3018F, -0.0086F));

		PartDefinition cube_r424 = leftFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(90, 119).addBox(-0.2804F, -0.1351F, -6.1867F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -0.0629F, 0.3018F, -0.0086F));

		PartDefinition cube_r425 = leftFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(85, 119).addBox(-0.2804F, 0.6479F, -6.7598F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -0.1938F, 0.3018F, -0.0086F));

		PartDefinition cube_r426 = leftFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(108, 82).addBox(-0.3034F, -8.7163F, -3.0974F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 1.3045F, 0.3009F, 0.0164F));

		PartDefinition cube_r427 = leftFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(42, 97).addBox(-0.8988F, 3.3011F, 0.9421F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -2.7489F, 0.2155F, 0.0446F));

		PartDefinition cube_r428 = leftFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(97, 44).addBox(-0.8988F, -4.7648F, 2.8703F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 2.138F, 0.2155F, 0.0446F));

		PartDefinition cube_r429 = leftFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(7, 110).addBox(-0.5215F, -6.4366F, -5.9266F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 0.7076F, 0.2822F, 0.0889F));

		PartDefinition cube_r430 = leftFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(30, 126).addBox(-0.5096F, -1.4475F, -2.8198F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(126, 25).addBox(-0.5096F, -0.9475F, -1.8198F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3122F, 1.383F, 2.4685F, -0.0359F, 0.2706F, 0.0347F));

		PartDefinition cube_r431 = leftFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(125, 98).addBox(-0.5096F, -0.7906F, -0.9254F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3122F, 1.383F, 2.4685F, 0.095F, 0.2706F, 0.0347F));

		PartDefinition cube_r432 = leftFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(126, 68).addBox(-0.5096F, -0.3752F, -0.0422F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3122F, 1.383F, 2.4685F, 0.2696F, 0.2706F, 0.0347F));

		PartDefinition cube_r433 = leftFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(126, 72).addBox(-0.5096F, -0.0234F, 0.8332F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3122F, 1.383F, 2.4685F, 0.4005F, 0.2706F, 0.0347F));

		PartDefinition cube_r434 = leftFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(32, 122).addBox(-0.5096F, 0.3377F, 1.4778F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3122F, 1.383F, 2.4685F, 0.575F, 0.2706F, 0.0347F));

		PartDefinition cube_r435 = leftFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(122, 131).addBox(-0.3853F, -2.8998F, 1.3351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 2.8882F, 0.3316F, -0.0133F));

		PartDefinition cube_r436 = leftFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(75, 84).addBox(-0.422F, 3.0004F, -3.1212F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -1.4349F, 0.2811F, -0.0311F));

		PartDefinition cube_r437 = leftFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(122, 124).addBox(-0.3983F, 0.7104F, -5.5996F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -0.035F, 0.2793F, -0.0176F));

		PartDefinition cube_r438 = leftFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(131, 62).addBox(-0.834F, -3.1128F, -1.6216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -0.6992F, 0.1705F, -0.0159F));

		PartDefinition cube_r439 = leftFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(109, 113).addBox(-0.8437F, -2.8447F, -4.6145F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -0.4485F, 0.1734F, -0.0199F));

		PartDefinition cube_r440 = leftFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(88, 89).addBox(-0.796F, -3.412F, -3.1301F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 0.1619F, 0.1745F, -0.0308F));

		PartDefinition cube_r441 = leftFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(102, 113).addBox(-0.796F, -3.7645F, -2.0738F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 0.031F, 0.1745F, -0.0308F));

		PartDefinition cube_r442 = leftFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(100, 122).addBox(-0.796F, -3.4699F, -1.3198F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -0.3181F, 0.1745F, -0.0308F));

		PartDefinition cube_r443 = leftFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(81, 108).addBox(-0.8186F, -2.4834F, -1.0981F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 0.0834F, 0.1745F, -0.0308F));

		PartDefinition cube_r444 = leftFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(119, 64).addBox(-0.8186F, -1.5187F, 0.1606F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 0.476F, 0.1745F, -0.0308F));

		PartDefinition cube_r445 = leftFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(108, 35).addBox(-0.8187F, -1.1781F, -1.2219F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 0.223F, 0.1745F, -0.0308F));

		PartDefinition cube_r446 = leftFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(0, 132).addBox(-0.7502F, 0.1714F, -0.9505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 0.3146F, 0.1745F, -0.0308F));

		PartDefinition cube_r447 = leftFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(131, 59).addBox(-0.7502F, -1.3856F, -1.3593F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 1.6236F, 0.1745F, -0.0308F));

		PartDefinition cube_r448 = leftFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(132, 9).addBox(-0.7699F, -0.8507F, -1.6886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 0.1924F, 0.1745F, -0.0308F));

		PartDefinition cube_r449 = leftFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(58, 131).addBox(-0.7699F, 0.6931F, -0.0212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -1.2911F, 0.1745F, -0.0308F));

		PartDefinition cube_r450 = leftFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(5, 132).addBox(-0.7651F, -0.6497F, -3.1233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -1.2475F, 0.1745F, -0.0308F));

		PartDefinition cube_r451 = leftFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(125, 12).addBox(-0.7651F, -2.2187F, -0.9246F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 0.0615F, 0.1745F, -0.0308F));

		PartDefinition cube_r452 = leftFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(131, 56).addBox(-0.7651F, -2.029F, 0.1961F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 0.7597F, 0.1745F, -0.0308F));

		PartDefinition cube_r453 = leftFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(132, 3).addBox(-0.7651F, -2.189F, -2.1946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -0.3748F, 0.1745F, -0.0308F));

		PartDefinition cube_r454 = leftFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(131, 29).addBox(-0.7651F, -1.0983F, -2.5813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -0.6802F, 0.1745F, -0.0308F));

		PartDefinition cube_r455 = leftFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(132, 6).addBox(-0.7524F, 0.5983F, -1.489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -1.1602F, 0.1745F, -0.0308F));

		PartDefinition cube_r456 = leftFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(131, 0).addBox(-0.7524F, -1.4903F, -2.1286F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -0.113F, 0.1745F, -0.0308F));

		PartDefinition cube_r457 = leftFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(88, 83).addBox(-0.7524F, -0.9518F, -0.9274F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 1.6978F, 0.1745F, -0.0308F));

		PartDefinition cube_r458 = leftFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(128, 76).addBox(-0.2313F, 5.9425F, 4.9383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(61, 128).addBox(-0.2313F, 5.9425F, 4.3383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -2.2593F, 0.2804F, 0.0231F));

		PartDefinition cube_r459 = leftFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(50, 132).addBox(-0.2313F, 1.105F, 7.7011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -3.0011F, 0.2804F, 0.0231F));

		PartDefinition cube_r460 = leftFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(132, 42).addBox(-0.2313F, -3.0356F, 7.6202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 2.8021F, 0.2804F, 0.0231F));

		PartDefinition cube_r461 = leftFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(130, 117).addBox(-0.2313F, -9.0672F, -1.3597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 1.4931F, 0.2804F, 0.0231F));

		PartDefinition cube_r462 = leftFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(94, 132).addBox(-0.3908F, -5.5839F, -2.9924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(132, 87).addBox(-0.3908F, -5.5839F, -3.3924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 0.725F, 0.2608F, -0.0013F));

		PartDefinition cube_r463 = leftFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(132, 120).addBox(-0.3908F, -1.3775F, -6.3675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -0.104F, 0.2608F, -0.0013F));

		PartDefinition cube_r464 = leftFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(132, 126).addBox(-0.3908F, -3.5408F, 3.6153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 2.5576F, 0.2608F, -0.0013F));

		PartDefinition cube_r465 = leftFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(126, 92).addBox(-0.3908F, 1.8594F, 4.428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -2.722F, 0.2608F, -0.0013F));

		PartDefinition cube_r466 = leftFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(132, 132).addBox(-0.3908F, 4.8262F, -2.6923F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -1.3258F, 0.2608F, -0.0013F));

		PartDefinition cube_r467 = leftFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(132, 104).addBox(-0.3908F, 2.3822F, -5.0435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -0.8458F, 0.2608F, -0.0013F));

		PartDefinition cube_r468 = leftFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(45, 126).addBox(-0.1529F, -4.0887F, -4.7168F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.096F))
				.texOffs(104, 132).addBox(-0.1529F, -3.3888F, -4.4168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 0.4438F, 0.3061F, 0.0021F));

		PartDefinition cube_r469 = leftFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(132, 101).addBox(-0.1529F, -5.19F, -0.5031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 1.491F, 0.3061F, 0.0021F));

		PartDefinition cube_r470 = leftFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(79, 132).addBox(-0.1529F, -1.8596F, 4.1007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 2.9309F, 0.3061F, 0.0021F));

		PartDefinition cube_r471 = leftFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(127, 132).addBox(-0.2003F, -3.2411F, 2.7794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(132, 129).addBox(-0.3753F, -3.2411F, 2.7794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 1.7488F, 0.2268F, -0.0477F));

		PartDefinition cube_r472 = leftFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(25, 132).addBox(-0.4505F, 0.8765F, -4.8889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -0.939F, 0.2268F, -0.0477F));

		PartDefinition cube_r473 = leftFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(20, 132).addBox(-0.4505F, -3.6142F, -3.4966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 0.0646F, 0.2268F, -0.0477F));

		PartDefinition cube_r474 = leftFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(127, 33).addBox(-0.4505F, -3.0146F, 2.8139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 1.8535F, 0.2268F, -0.0477F));

		PartDefinition cube_r475 = leftFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(130, 98).addBox(-0.4505F, -4.4611F, -0.6302F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 0.7627F, 0.2268F, -0.0477F));

		PartDefinition cube_r476 = leftFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(132, 39).addBox(-0.5024F, -0.0812F, 2.7075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(95, 126).addBox(-0.5024F, 0.2188F, 2.7075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 3.1281F, 0.2048F, -0.0913F));

		PartDefinition cube_r477 = leftFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(132, 32).addBox(-0.5024F, -1.8875F, 2.2336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 2.6045F, 0.2048F, -0.0913F));

		PartDefinition cube_r478 = leftFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(127, 87).addBox(-0.5024F, -3.4096F, -0.4499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 1.2955F, 0.2048F, -0.0913F));

		PartDefinition cube_r479 = leftFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(117, 0).addBox(-0.4505F, 2.4693F, -3.4512F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -1.3841F, 0.2268F, -0.0477F));

		PartDefinition cube_r480 = leftFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(119, 25).addBox(-0.8627F, -1.5422F, 0.0735F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -2.579F, 0.1596F, -0.0364F));

		PartDefinition cube_r481 = leftFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(109, 118).addBox(-0.8627F, 1.5138F, 0.0943F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -1.3136F, 0.1596F, -0.0364F));

		PartDefinition cube_r482 = leftFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(95, 113).addBox(-0.8172F, 1.2766F, -2.0135F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -0.6145F, 0.1738F, -0.0293F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.701F, 2.3848F, -8.4379F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r483 = rightFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(20, 125).mirror().addBox(-0.5F, -1.925F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.3659F, -5.2785F, 7.8936F, 1.7792F, -1.1839F, 0.2465F));

		PartDefinition cube_r484 = rightFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(110, 30).mirror().addBox(-0.2F, -1.0F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5544F, -4.8269F, 7.2025F, 2.5F, -1.1384F, -0.0631F));

		PartDefinition cube_r485 = rightFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(40, 130).mirror().addBox(-0.1298F, -2.2757F, 0.6453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0681F, -2.9488F, 2.0024F, 2.913F, 0.2227F, -0.3521F));

		PartDefinition cube_r486 = rightFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(127, 123).mirror().addBox(-0.3646F, -0.0201F, 0.948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0681F, -2.9488F, 2.0024F, -2.2267F, 0.1801F, -0.5249F));

		PartDefinition cube_r487 = rightFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(0, 120).mirror().addBox(-0.2986F, -3.6195F, -0.7631F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0681F, -2.9488F, 2.0024F, -0.9598F, 0.0852F, -0.6F));

		PartDefinition cube_r488 = rightFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(121, 73).mirror().addBox(-0.3646F, -0.8192F, -0.7132F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0681F, -2.9488F, 2.0024F, -0.9003F, 0.1801F, -0.5249F));

		PartDefinition cube_r489 = rightFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(125, 117).mirror().addBox(4.0784F, 1.8475F, 1.4774F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -2.8452F, 0.1996F, -0.8272F));

		PartDefinition cube_r490 = rightFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(80, 125).mirror().addBox(4.0784F, 0.7182F, 2.9625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 3.0017F, 0.1996F, -0.8272F));

		PartDefinition cube_r491 = rightFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(119, 113).mirror().addBox(4.0784F, 1.5951F, 0.3693F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -2.6008F, 0.1996F, -0.8272F));

		PartDefinition cube_r492 = rightFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(117, 30).mirror().addBox(-0.1067F, 0.7215F, -0.0277F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 0.0711F, -0.1745F, 0.0308F));

		PartDefinition cube_r493 = rightFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(127, 104).mirror().addBox(-0.6966F, 0.1551F, -9.2521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 0.0566F, -0.3009F, -0.0164F));

		PartDefinition cube_r494 = rightFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(75, 126).mirror().addBox(-0.7196F, 2.1991F, -7.3835F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -0.2811F, -0.3018F, 0.0086F));

		PartDefinition cube_r495 = rightFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(115, 88).mirror().addBox(-0.7196F, -7.7722F, -5.1269F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 1.1588F, -0.3018F, 0.0086F));

		PartDefinition cube_r496 = rightFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(90, 119).mirror().addBox(-0.7196F, -0.1351F, -6.1867F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -0.0629F, -0.3018F, 0.0086F));

		PartDefinition cube_r497 = rightFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(85, 119).mirror().addBox(-0.7196F, 0.6479F, -6.7598F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -0.1938F, -0.3018F, 0.0086F));

		PartDefinition cube_r498 = rightFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(108, 82).mirror().addBox(-0.6966F, -8.7163F, -3.0974F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 1.3045F, -0.3009F, -0.0164F));

		PartDefinition cube_r499 = rightFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(42, 97).mirror().addBox(-0.1012F, 3.3011F, 0.9421F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -2.7489F, -0.2155F, -0.0446F));

		PartDefinition cube_r500 = rightFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(97, 44).mirror().addBox(-0.1012F, -4.7648F, 2.8703F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 2.138F, -0.2155F, -0.0446F));

		PartDefinition cube_r501 = rightFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(7, 110).mirror().addBox(-0.4785F, -6.4366F, -5.9266F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 0.7076F, -0.2822F, -0.0889F));

		PartDefinition cube_r502 = rightFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(30, 126).mirror().addBox(-0.4904F, -1.4475F, -2.8198F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(126, 25).mirror().addBox(-0.4904F, -0.9475F, -1.8198F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3122F, 1.383F, 2.4685F, -0.0359F, -0.2706F, -0.0347F));

		PartDefinition cube_r503 = rightFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(125, 98).mirror().addBox(-0.4904F, -0.7906F, -0.9254F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3122F, 1.383F, 2.4685F, 0.095F, -0.2706F, -0.0347F));

		PartDefinition cube_r504 = rightFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(126, 68).mirror().addBox(-0.4904F, -0.3752F, -0.0422F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3122F, 1.383F, 2.4685F, 0.2696F, -0.2706F, -0.0347F));

		PartDefinition cube_r505 = rightFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(126, 72).mirror().addBox(-0.4904F, -0.0234F, 0.8332F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3122F, 1.383F, 2.4685F, 0.4005F, -0.2706F, -0.0347F));

		PartDefinition cube_r506 = rightFace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(32, 122).mirror().addBox(-0.4904F, 0.3377F, 1.4778F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3122F, 1.383F, 2.4685F, 0.575F, -0.2706F, -0.0347F));

		PartDefinition cube_r507 = rightFace.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(122, 131).mirror().addBox(-0.6147F, -2.8998F, 1.3351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 2.8882F, -0.3316F, 0.0133F));

		PartDefinition cube_r508 = rightFace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(75, 84).mirror().addBox(-0.578F, 3.0004F, -3.1212F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -1.4349F, -0.2811F, 0.0311F));

		PartDefinition cube_r509 = rightFace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(122, 124).mirror().addBox(-0.6017F, 0.7104F, -5.5996F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -0.035F, -0.2793F, 0.0176F));

		PartDefinition cube_r510 = rightFace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(131, 62).mirror().addBox(-0.166F, -3.1128F, -1.6216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -0.6992F, -0.1705F, 0.0159F));

		PartDefinition cube_r511 = rightFace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(109, 113).mirror().addBox(-0.1563F, -2.8447F, -4.6145F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -0.4485F, -0.1734F, 0.0199F));

		PartDefinition cube_r512 = rightFace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(88, 89).mirror().addBox(-0.204F, -3.412F, -3.1301F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 0.1619F, -0.1745F, 0.0308F));

		PartDefinition cube_r513 = rightFace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(102, 113).mirror().addBox(-0.204F, -3.7645F, -2.0738F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 0.031F, -0.1745F, 0.0308F));

		PartDefinition cube_r514 = rightFace.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(100, 122).mirror().addBox(-0.204F, -3.4699F, -1.3198F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -0.3181F, -0.1745F, 0.0308F));

		PartDefinition cube_r515 = rightFace.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(81, 108).mirror().addBox(-0.1814F, -2.4834F, -1.0981F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 0.0834F, -0.1745F, 0.0308F));

		PartDefinition cube_r516 = rightFace.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(119, 64).mirror().addBox(-0.1814F, -1.5187F, 0.1606F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 0.476F, -0.1745F, 0.0308F));

		PartDefinition cube_r517 = rightFace.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(108, 35).mirror().addBox(-0.1813F, -1.1781F, -1.2219F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 0.223F, -0.1745F, 0.0308F));

		PartDefinition cube_r518 = rightFace.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(0, 132).mirror().addBox(-0.2498F, 0.1714F, -0.9505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 0.3146F, -0.1745F, 0.0308F));

		PartDefinition cube_r519 = rightFace.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(131, 59).mirror().addBox(-0.2498F, -1.3856F, -1.3593F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 1.6236F, -0.1745F, 0.0308F));

		PartDefinition cube_r520 = rightFace.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(132, 9).mirror().addBox(-0.2301F, -0.8507F, -1.6886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 0.1924F, -0.1745F, 0.0308F));

		PartDefinition cube_r521 = rightFace.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(58, 131).mirror().addBox(-0.2301F, 0.6931F, -0.0212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -1.2911F, -0.1745F, 0.0308F));

		PartDefinition cube_r522 = rightFace.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(5, 132).mirror().addBox(-0.2349F, -0.6497F, -3.1233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -1.2475F, -0.1745F, 0.0308F));

		PartDefinition cube_r523 = rightFace.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(125, 12).mirror().addBox(-0.2349F, -2.2187F, -0.9246F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 0.0615F, -0.1745F, 0.0308F));

		PartDefinition cube_r524 = rightFace.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(131, 56).mirror().addBox(-0.2349F, -2.029F, 0.1961F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 0.7597F, -0.1745F, 0.0308F));

		PartDefinition cube_r525 = rightFace.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(132, 3).mirror().addBox(-0.2349F, -2.189F, -2.1946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -0.3748F, -0.1745F, 0.0308F));

		PartDefinition cube_r526 = rightFace.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(131, 29).mirror().addBox(-0.2349F, -1.0983F, -2.5813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -0.6802F, -0.1745F, 0.0308F));

		PartDefinition cube_r527 = rightFace.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(132, 6).mirror().addBox(-0.2476F, 0.5983F, -1.489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -1.1602F, -0.1745F, 0.0308F));

		PartDefinition cube_r528 = rightFace.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(131, 0).mirror().addBox(-0.2476F, -1.4903F, -2.1286F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -0.113F, -0.1745F, 0.0308F));

		PartDefinition cube_r529 = rightFace.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(88, 83).mirror().addBox(-0.2476F, -0.9518F, -0.9274F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 1.6978F, -0.1745F, 0.0308F));

		PartDefinition cube_r530 = rightFace.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(128, 76).mirror().addBox(-0.7687F, 5.9425F, 4.9383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(61, 128).mirror().addBox(-0.7687F, 5.9425F, 4.3383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -2.2593F, -0.2804F, -0.0231F));

		PartDefinition cube_r531 = rightFace.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(50, 132).mirror().addBox(-0.7687F, 1.105F, 7.7011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -3.0011F, -0.2804F, -0.0231F));

		PartDefinition cube_r532 = rightFace.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(132, 42).mirror().addBox(-0.7687F, -3.0356F, 7.6202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 2.8021F, -0.2804F, -0.0231F));

		PartDefinition cube_r533 = rightFace.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(130, 117).mirror().addBox(-0.7687F, -9.0672F, -1.3597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 1.4931F, -0.2804F, -0.0231F));

		PartDefinition cube_r534 = rightFace.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(94, 132).mirror().addBox(-0.6092F, -5.5839F, -2.9924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(132, 87).mirror().addBox(-0.6092F, -5.5839F, -3.3924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 0.725F, -0.2608F, 0.0013F));

		PartDefinition cube_r535 = rightFace.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(132, 120).mirror().addBox(-0.6092F, -1.3775F, -6.3675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -0.104F, -0.2608F, 0.0013F));

		PartDefinition cube_r536 = rightFace.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(132, 126).mirror().addBox(-0.6092F, -3.5408F, 3.6153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 2.5576F, -0.2608F, 0.0013F));

		PartDefinition cube_r537 = rightFace.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(126, 92).mirror().addBox(-0.6092F, 1.8594F, 4.428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -2.722F, -0.2608F, 0.0013F));

		PartDefinition cube_r538 = rightFace.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(132, 132).mirror().addBox(-0.6092F, 4.8262F, -2.6923F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -1.3258F, -0.2608F, 0.0013F));

		PartDefinition cube_r539 = rightFace.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(132, 104).mirror().addBox(-0.6092F, 2.3822F, -5.0435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -0.8458F, -0.2608F, 0.0013F));

		PartDefinition cube_r540 = rightFace.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(45, 126).mirror().addBox(-0.8471F, -4.0887F, -4.7168F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false)
				.texOffs(104, 132).mirror().addBox(-0.8471F, -3.3888F, -4.4168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 0.4438F, -0.3061F, -0.0021F));

		PartDefinition cube_r541 = rightFace.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(132, 101).mirror().addBox(-0.8471F, -5.19F, -0.5031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 1.491F, -0.3061F, -0.0021F));

		PartDefinition cube_r542 = rightFace.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(79, 132).mirror().addBox(-0.8471F, -1.8596F, 4.1007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 2.9309F, -0.3061F, -0.0021F));

		PartDefinition cube_r543 = rightFace.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(127, 132).mirror().addBox(-0.7997F, -3.2411F, 2.7794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(132, 129).mirror().addBox(-0.6247F, -3.2411F, 2.7794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 1.7488F, -0.2268F, 0.0477F));

		PartDefinition cube_r544 = rightFace.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(25, 132).mirror().addBox(-0.5495F, 0.8765F, -4.8889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -0.939F, -0.2268F, 0.0477F));

		PartDefinition cube_r545 = rightFace.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(20, 132).mirror().addBox(-0.5495F, -3.6142F, -3.4966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 0.0646F, -0.2268F, 0.0477F));

		PartDefinition cube_r546 = rightFace.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(127, 33).mirror().addBox(-0.5495F, -3.0146F, 2.8139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 1.8535F, -0.2268F, 0.0477F));

		PartDefinition cube_r547 = rightFace.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(130, 98).mirror().addBox(-0.5495F, -4.4611F, -0.6302F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 0.7627F, -0.2268F, 0.0477F));

		PartDefinition cube_r548 = rightFace.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(132, 39).mirror().addBox(-0.4976F, -0.0812F, 2.7075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(95, 126).mirror().addBox(-0.4976F, 0.2188F, 2.7075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 3.1281F, -0.2048F, 0.0913F));

		PartDefinition cube_r549 = rightFace.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(132, 32).mirror().addBox(-0.4976F, -1.8875F, 2.2336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 2.6045F, -0.2048F, 0.0913F));

		PartDefinition cube_r550 = rightFace.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(127, 87).mirror().addBox(-0.4976F, -3.4096F, -0.4499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 1.2955F, -0.2048F, 0.0913F));

		PartDefinition cube_r551 = rightFace.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(117, 0).mirror().addBox(-0.5495F, 2.4693F, -3.4512F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -1.3841F, -0.2268F, 0.0477F));

		PartDefinition cube_r552 = rightFace.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(119, 25).mirror().addBox(-0.1373F, -1.5422F, 0.0735F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -2.579F, -0.1596F, 0.0364F));

		PartDefinition cube_r553 = rightFace.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(109, 118).mirror().addBox(-0.1373F, 1.5138F, 0.0943F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -1.3136F, -0.1596F, 0.0364F));

		PartDefinition cube_r554 = rightFace.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(95, 113).mirror().addBox(-0.1828F, 1.2766F, -2.0135F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -0.6145F, -0.1738F, 0.0293F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.067F, 1.9741F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r555 = jaw.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(128, 95).mirror().addBox(-0.4F, -0.025F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false)
				.texOffs(100, 129).mirror().addBox(-0.4F, 1.2882F, -5.1343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.6203F, 0.2127F, -0.2659F, -0.0349F, -0.0698F, 0.0F));

		PartDefinition cube_r556 = jaw.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(126, 60).mirror().addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6528F, -3.0043F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r557 = jaw.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(121, 92).mirror().addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6014F, 2.6528F, -1.0968F, 0.4668F, -0.0969F, 0.0654F));

		PartDefinition cube_r558 = jaw.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(110, 128).mirror().addBox(-0.4F, -0.5F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(122, 128).mirror().addBox(-0.4F, 0.1F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false)
				.texOffs(66, 129).mirror().addBox(-0.4F, -2.9077F, -0.3035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.6203F, 0.2127F, -0.2659F, 2.1031F, -0.0698F, 0.0F));

		PartDefinition cube_r559 = jaw.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(0, 129).mirror().addBox(-0.4F, 0.275F, -1.1946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6203F, 0.2127F, -0.2659F, -0.5585F, -0.0698F, 0.0F));

		PartDefinition cube_r560 = jaw.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(5, 129).mirror().addBox(-0.4F, 1.1866F, -0.3077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false)
				.texOffs(20, 129).mirror().addBox(-0.4F, 1.6866F, -0.3077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.6203F, 0.2127F, -0.2659F, -1.6493F, -0.0698F, 0.0F));

		PartDefinition cube_r561 = jaw.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(25, 129).mirror().addBox(-0.4F, 0.0145F, 2.6067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(10, 130).mirror().addBox(-0.4F, 0.0145F, 2.4567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false)
				.texOffs(98, 101).mirror().addBox(-0.4F, -0.5855F, 1.7567F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(130, 12).mirror().addBox(-0.5F, -1.1855F, 3.4317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6203F, 0.2127F, -0.2659F, -2.9496F, -0.0698F, 0.0F));

		PartDefinition cube_r562 = jaw.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(129, 36).mirror().addBox(-0.4F, -0.0863F, -1.3096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.6203F, 0.2127F, -0.2659F, 0.3142F, -0.0698F, 0.0F));

		PartDefinition cube_r563 = jaw.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(50, 129).mirror().addBox(-0.4F, -2.106F, -1.1272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-1.6203F, 0.2127F, -0.2659F, 1.7104F, -0.0698F, 0.0F));

		PartDefinition cube_r564 = jaw.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(80, 129).mirror().addBox(-0.4F, -0.8038F, 2.7858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.6203F, 0.2127F, -0.2659F, -2.7838F, -0.0698F, 0.0F));

		PartDefinition cube_r565 = jaw.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(95, 129).mirror().addBox(-0.4F, 3.3677F, 0.9126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.6203F, 0.2127F, -0.2659F, -1.5184F, -0.0698F, 0.0F));

		PartDefinition cube_r566 = jaw.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(122, 34).mirror().addBox(-0.0512F, -3.8981F, -1.1322F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.6203F, 1.5127F, -5.2659F, 1.2654F, -0.2269F, 0.0F));

		PartDefinition cube_r567 = jaw.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(37, 122).mirror().addBox(-0.0512F, -2.0612F, -0.8431F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false)
				.texOffs(115, 109).mirror().addBox(-0.0512F, -3.118F, -0.6275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6203F, 1.5127F, -5.2659F, 1.405F, -0.2269F, 0.0F));

		PartDefinition cube_r568 = jaw.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(105, 129).mirror().addBox(-1.0403F, -0.7849F, -0.0248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(0.1797F, 0.7127F, -8.6659F, 2.6616F, -0.1571F, 0.0F));

		PartDefinition cube_r569 = jaw.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(35, 133).mirror().addBox(-1.0403F, 0.7388F, 0.0105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.1797F, 0.7127F, -8.6659F, -2.3126F, -0.1571F, 0.0F));

		PartDefinition cube_r570 = jaw.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(127, 40).mirror().addBox(-1.0403F, 0.7142F, -0.2916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(0.1797F, 0.7127F, -8.6659F, -2.138F, -0.1571F, 0.0F));

		PartDefinition cube_r571 = jaw.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(127, 4).mirror().addBox(-1.0403F, -0.1736F, -0.4264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1797F, 0.7127F, -8.6659F, -1.9635F, -0.1571F, 0.0F));

		PartDefinition cube_r572 = jaw.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(42, 87).mirror().addBox(-0.0512F, 1.7367F, -0.4139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.6203F, 1.5127F, -5.2659F, -1.7802F, -0.2269F, 0.0F));

		PartDefinition cube_r573 = jaw.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(129, 107).mirror().addBox(-0.0512F, 0.8534F, -0.8898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6203F, 1.5127F, -5.2659F, -1.5184F, -0.2269F, 0.0F));

		PartDefinition cube_r574 = jaw.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(129, 110).mirror().addBox(-0.0512F, 0.0547F, -0.1413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.6203F, 1.5127F, -5.2659F, -2.8972F, -0.2269F, 0.0F));

		PartDefinition cube_r575 = jaw.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(127, 129).mirror().addBox(-0.4F, -4.0761F, 1.0386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.6203F, 0.2127F, -0.2659F, 2.0769F, -0.0698F, 0.0F));

		PartDefinition cube_r576 = jaw.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(15, 130).mirror().addBox(-0.5F, -3.7783F, 0.2486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.6203F, 0.2127F, -0.2659F, 2.1555F, -0.0698F, 0.0F));

		PartDefinition cube_r577 = jaw.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(46, 122).mirror().addBox(-0.5F, -4.5176F, -0.8794F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-1.6203F, 0.2127F, -0.2659F, 1.7628F, -0.0698F, 0.0F));

		PartDefinition cube_r578 = jaw.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(130, 15).mirror().addBox(-0.5F, -4.3852F, -2.2979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6203F, 0.2127F, -0.2659F, 1.4137F, -0.0698F, 0.0F));

		PartDefinition cube_r579 = jaw.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(130, 18).mirror().addBox(-0.5F, -2.4841F, -4.7254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-1.6203F, 0.2127F, -0.2659F, 0.7156F, -0.0698F, 0.0F));

		PartDefinition cube_r580 = jaw.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(130, 21).mirror().addBox(-0.5F, 1.44F, -4.6928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.6203F, 0.2127F, -0.2659F, -0.1134F, -0.0698F, 0.0F));

		PartDefinition cube_r581 = jaw.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(30, 130).mirror().addBox(-0.0512F, -1.034F, 0.5102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(115, 105).mirror().addBox(-0.0512F, -2.034F, -0.1898F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6203F, 1.5127F, -5.2659F, 1.5359F, -0.2269F, 0.0F));

		PartDefinition cube_r582 = jaw.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(7, 116).mirror().addBox(-0.0512F, -4.1498F, -0.7948F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6203F, 1.5127F, -5.2659F, 1.3177F, -0.2269F, 0.0F));

		PartDefinition cube_r583 = jaw.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(116, 17).mirror().addBox(-1.0403F, -1.3501F, -0.5885F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1797F, 0.7127F, -8.6659F, 1.3177F, -0.1571F, 0.0F));

		PartDefinition cube_r584 = jaw.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(35, 130).mirror().addBox(-0.4F, -0.0001F, 4.0629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.6203F, 0.2127F, -0.2659F, -2.8972F, -0.0698F, 0.0F));

		PartDefinition cube_r585 = jaw.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(121, 92).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6014F, 2.6528F, -1.0968F, 0.4668F, 0.0969F, -0.0654F));

		PartDefinition cube_r586 = jaw.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(126, 60).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6528F, -3.0043F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r587 = jaw.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(122, 128).addBox(-0.6F, 0.1F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(110, 128).addBox(-0.6F, -0.5F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(66, 129).addBox(-0.6F, -2.9077F, -0.3035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.6203F, 0.2127F, -0.2659F, 2.1031F, 0.0698F, 0.0F));

		PartDefinition cube_r588 = jaw.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(130, 21).addBox(-0.5F, 1.44F, -4.6928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.6203F, 0.2127F, -0.2659F, -0.1134F, 0.0698F, 0.0F));

		PartDefinition cube_r589 = jaw.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(130, 18).addBox(-0.5F, -2.4841F, -4.7254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(1.6203F, 0.2127F, -0.2659F, 0.7156F, 0.0698F, 0.0F));

		PartDefinition cube_r590 = jaw.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(130, 15).addBox(-0.5F, -4.3852F, -2.2979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.6203F, 0.2127F, -0.2659F, 1.4137F, 0.0698F, 0.0F));

		PartDefinition cube_r591 = jaw.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(46, 122).addBox(-0.5F, -4.5176F, -0.8794F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(1.6203F, 0.2127F, -0.2659F, 1.7628F, 0.0698F, 0.0F));

		PartDefinition cube_r592 = jaw.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(15, 130).addBox(-0.5F, -3.7783F, 0.2486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.6203F, 0.2127F, -0.2659F, 2.1555F, 0.0698F, 0.0F));

		PartDefinition cube_r593 = jaw.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(130, 12).addBox(-0.5F, -1.1855F, 3.4317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(98, 101).addBox(-0.6F, -0.5855F, 1.7567F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F))
				.texOffs(10, 130).addBox(-0.6F, 0.0145F, 2.4567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(25, 129).addBox(-0.6F, 0.0145F, 2.6067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.6203F, 0.2127F, -0.2659F, -2.9496F, 0.0698F, 0.0F));

		PartDefinition cube_r594 = jaw.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(20, 129).addBox(-0.6F, 1.6866F, -0.3077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(5, 129).addBox(-0.6F, 1.1866F, -0.3077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.6203F, 0.2127F, -0.2659F, -1.6493F, 0.0698F, 0.0F));

		PartDefinition cube_r595 = jaw.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(0, 129).addBox(-0.6F, 0.275F, -1.1946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.6203F, 0.2127F, -0.2659F, -0.5585F, 0.0698F, 0.0F));

		PartDefinition cube_r596 = jaw.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(116, 17).addBox(0.0403F, -1.3501F, -0.5885F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1797F, 0.7127F, -8.6659F, 1.3177F, 0.1571F, 0.0F));

		PartDefinition cube_r597 = jaw.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(7, 116).addBox(-0.9488F, -4.1498F, -0.7948F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6203F, 1.5127F, -5.2659F, 1.3177F, 0.2269F, 0.0F));

		PartDefinition cube_r598 = jaw.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(115, 109).addBox(-0.9488F, -3.118F, -0.6275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(37, 122).addBox(-0.9488F, -2.0612F, -0.8431F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.6203F, 1.5127F, -5.2659F, 1.405F, 0.2269F, 0.0F));

		PartDefinition cube_r599 = jaw.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(115, 105).addBox(-0.9488F, -2.034F, -0.1898F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(30, 130).addBox(-0.9488F, -1.034F, 0.5102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6203F, 1.5127F, -5.2659F, 1.5359F, 0.2269F, 0.0F));

		PartDefinition cube_r600 = jaw.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(127, 129).addBox(-0.6F, -4.0761F, 1.0386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.6203F, 0.2127F, -0.2659F, 2.0769F, 0.0698F, 0.0F));

		PartDefinition cube_r601 = jaw.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(35, 130).addBox(-0.6F, -0.0001F, 4.0629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.6203F, 0.2127F, -0.2659F, -2.8972F, 0.0698F, 0.0F));

		PartDefinition cube_r602 = jaw.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(129, 110).addBox(-0.9488F, 0.0547F, -0.1413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.6203F, 1.5127F, -5.2659F, -2.8972F, 0.2269F, 0.0F));

		PartDefinition cube_r603 = jaw.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(129, 107).addBox(-0.9488F, 0.8534F, -0.8898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.6203F, 1.5127F, -5.2659F, -1.5184F, 0.2269F, 0.0F));

		PartDefinition cube_r604 = jaw.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(42, 87).addBox(-0.9488F, 1.7367F, -0.4139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.6203F, 1.5127F, -5.2659F, -1.7802F, 0.2269F, 0.0F));

		PartDefinition cube_r605 = jaw.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(127, 4).addBox(0.0403F, -0.1736F, -0.4264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1797F, 0.7127F, -8.6659F, -1.9635F, 0.1571F, 0.0F));

		PartDefinition cube_r606 = jaw.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(127, 40).addBox(0.0403F, 0.7142F, -0.2916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.1797F, 0.7127F, -8.6659F, -2.138F, 0.1571F, 0.0F));

		PartDefinition cube_r607 = jaw.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(35, 133).addBox(0.0403F, 0.7388F, 0.0105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.1797F, 0.7127F, -8.6659F, -2.3126F, 0.1571F, 0.0F));

		PartDefinition cube_r608 = jaw.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(105, 129).addBox(0.0403F, -0.7849F, -0.0248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.1797F, 0.7127F, -8.6659F, 2.6616F, 0.1571F, 0.0F));

		PartDefinition cube_r609 = jaw.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(122, 34).addBox(-0.9488F, -3.8981F, -1.1322F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.6203F, 1.5127F, -5.2659F, 1.2654F, 0.2269F, 0.0F));

		PartDefinition cube_r610 = jaw.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(100, 129).addBox(-0.6F, 1.2882F, -5.1343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(128, 95).addBox(-0.6F, -0.025F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.6203F, 0.2127F, -0.2659F, -0.0349F, 0.0698F, 0.0F));

		PartDefinition cube_r611 = jaw.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(95, 129).addBox(-0.6F, 3.3677F, 0.9126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.6203F, 0.2127F, -0.2659F, -1.5184F, 0.0698F, 0.0F));

		PartDefinition cube_r612 = jaw.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(80, 129).addBox(-0.6F, -0.8038F, 2.7858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.6203F, 0.2127F, -0.2659F, -2.7838F, 0.0698F, 0.0F));

		PartDefinition cube_r613 = jaw.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(50, 129).addBox(-0.6F, -2.106F, -1.1272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(1.6203F, 0.2127F, -0.2659F, 1.7104F, 0.0698F, 0.0F));

		PartDefinition cube_r614 = jaw.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(129, 36).addBox(-0.6F, -0.0863F, -1.3096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.6203F, 0.2127F, -0.2659F, 0.3142F, 0.0698F, 0.0F));

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