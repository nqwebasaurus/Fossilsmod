package fossils.fossils.client.blockentity.model.eocarcharia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EocarchariaFossilModel extends SkullModelBase {
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

	public EocarchariaFossilModel(ModelPart root) {
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -35.9238F, 0.2558F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(106, 83).addBox(0.0F, 0.0F, -0.825F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.6645F, 8.5319F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(21, 38).addBox(0.0F, -3.1F, -4.5F, 0.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.006F, -3.5499F, 4.4152F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(121, 65).addBox(0.0F, -7.5322F, 2.3974F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 14).addBox(-0.5F, -2.0322F, 1.3974F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.989F, 3.705F, 2.9932F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r4 = bone3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 65).addBox(-0.5827F, 3.7931F, -9.2175F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5815F, -8.6405F, 5.3682F, -0.222F, -0.0321F, -0.4016F));

		PartDefinition cube_r5 = bone3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(85, 76).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6085F, -8.869F, 0.7867F, -0.222F, -0.0321F, -0.4016F));

		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(90, 14).addBox(-0.5F, -2.0F, -3.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0658F, -4.8347F, 3.9432F, 0.513F, -0.0327F, -0.4104F));

		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(78, 60).addBox(-0.5F, -1.1F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.2469F, -5.4363F, 5.3715F, 0.0942F, -0.0327F, -0.4104F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(90, 7).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.336F, -8.0021F, 4.6653F, -0.4076F, -0.0391F, -0.4053F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(88, 136).addBox(-1.1199F, 3.6274F, -0.2814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.156F, 0.8133F, 4.5756F, 0.7705F, 0.0553F, -0.1121F));

		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(88, 130).addBox(-1.1199F, 3.5749F, 1.8396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.156F, 0.8133F, 4.5756F, 0.2469F, 0.0553F, -0.1121F));

		PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 123).addBox(-1.1199F, 4.4979F, -0.4312F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.156F, 0.8133F, 4.5756F, 0.6396F, 0.0553F, -0.1121F));

		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(33, 130).addBox(-1.1227F, 4.6283F, -0.997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(129, 124).addBox(-1.1227F, 4.2283F, -1.0219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.156F, 0.8133F, 4.5756F, 1.076F, 0.0553F, -0.1121F));

		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(129, 121).addBox(-1.069F, 2.8109F, -2.9802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.156F, 0.8133F, 4.5756F, 1.5561F, 0.0464F, -0.1037F));

		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(51, 122).addBox(-0.9813F, -0.2132F, -0.9512F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.156F, 0.8133F, 4.5756F, 0.9468F, 0.0133F, -0.113F));

		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(60, 122).addBox(-0.5F, -1.8F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.075F, 0.524F, 2.9245F, 1.3125F, -0.0858F, 0.1519F));

		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(111, 51).addBox(-1.0708F, -2.0897F, 3.3647F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.156F, 2.1633F, 4.8756F, 2.2437F, -0.0313F, 0.1956F));

		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(83, 136).addBox(-1.142F, -4.0627F, -0.3421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3196F, 1.2971F, 4.1052F, 0.9806F, -0.0911F, 0.1489F));

		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(116, 51).addBox(-1.142F, -3.7627F, -0.3421F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3196F, 1.2971F, 4.1052F, 0.8148F, -0.0911F, 0.1489F));

		PartDefinition cube_r19 = bone3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(116, 31).addBox(-0.5F, -1.6F, -2.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4114F, -3.0996F, 2.4354F, 0.462F, 0.0639F, 0.0248F));

		PartDefinition cube_r20 = bone3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(78, 52).addBox(-0.5F, -0.8F, -4.1F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.3192F, -2.0278F, 1.4095F, -0.1488F, 0.0639F, 0.0248F));

		PartDefinition cube_r21 = bone3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(7, 103).addBox(-0.5F, -3.725F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0457F, 0.7049F, -2.5179F, -1.1437F, 0.0639F, 0.0248F));

		PartDefinition cube_r22 = bone3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(123, 30).addBox(-0.3869F, -3.5888F, 1.4735F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.073F, 6.7663F, -4.7279F, -1.5728F, 0.0891F, -0.1553F));

		PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(28, 123).addBox(-0.3869F, 0.8805F, 0.9886F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.073F, 6.7663F, -4.7279F, -0.8311F, 0.0891F, -0.1553F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(60, 97).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(40, 92).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5022F, 10.394F, -5.9171F, -1.311F, 0.0891F, -0.1553F));

		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(60, 115).addBox(-0.5F, -2.5F, -0.325F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5883F, 9.1135F, -2.7495F, -1.2238F, 0.0891F, -0.1553F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(83, 129).addBox(-0.3869F, 0.7481F, 0.2111F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.073F, 6.7663F, -4.7279F, -0.3598F, 0.0891F, -0.1553F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(83, 124).addBox(-0.3869F, -0.0935F, 0.0604F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.073F, 6.7663F, -4.7279F, 0.0852F, 0.0891F, -0.1553F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(129, 65).addBox(-0.3869F, 0.7955F, -0.3573F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.073F, 6.7663F, -4.7279F, 0.3906F, 0.0891F, -0.1553F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(68, 124).addBox(-1.2154F, 4.0663F, -1.1499F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.073F, 0.8663F, -2.7279F, -0.1501F, 0.0837F, -0.1583F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(112, 122).addBox(-0.4901F, -0.6934F, -1.4113F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.073F, 0.8663F, -2.7279F, -0.0005F, 0.0643F, 0.0237F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(111, 82).addBox(-0.4901F, -0.6052F, -0.9866F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.073F, 0.8663F, -2.7279F, -0.175F, 0.0643F, 0.0237F));

		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 103).addBox(-0.5F, -3.975F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0129F, 0.9743F, -4.0688F, 0.2613F, 0.0639F, 0.0248F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(9, 110).addBox(-0.5F, -1.55F, -0.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0921F, -3.9748F, -4.0956F, -0.6288F, 0.0639F, 0.0248F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(76, 43).addBox(-0.3844F, -0.3139F, -1.6767F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1504F, -4.4868F, -1.572F, -0.1925F, 0.0639F, 0.0248F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(78, 129).addBox(-0.9819F, -2.4083F, -3.8165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.1253F, -8.8554F, -4.6902F, 1.6842F, -0.3289F, -0.3595F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(97, 106).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4749F, -5.0861F, -6.6856F, 2.3736F, -0.3289F, -0.3595F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(53, 111).addBox(-0.9819F, -1.3481F, -3.4282F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1253F, -8.8554F, -4.6902F, 1.3439F, -0.3289F, -0.3595F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(103, 63).addBox(-0.9819F, -0.039F, -1.9676F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1253F, -8.8554F, -4.6902F, 0.5847F, -0.3289F, -0.3595F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(16, 98).addBox(0.1F, 0.15F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.186F, -9.0019F, -2.3068F, 0.2343F, -0.3037F, -0.3808F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(20, 90).addBox(-0.58F, 0.205F, 1.0796F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.5815F, -9.3405F, -3.2318F, -0.0562F, -0.0321F, -0.4016F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.989F, 3.705F, 2.9932F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r41 = bone4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-0.4173F, 3.7931F, -9.2175F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5815F, -8.6405F, 5.3682F, -0.222F, 0.0321F, 0.4016F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(85, 76).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6085F, -8.869F, 0.7867F, -0.222F, 0.0321F, 0.4016F));

		PartDefinition cube_r43 = bone4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(90, 14).mirror().addBox(-0.5F, -2.0F, -3.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0658F, -4.8347F, 3.9432F, 0.513F, 0.0327F, 0.4104F));

		PartDefinition cube_r44 = bone4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(78, 60).mirror().addBox(-0.5F, -1.1F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.2469F, -5.4363F, 5.3715F, 0.0942F, 0.0327F, 0.4104F));

		PartDefinition cube_r45 = bone4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(90, 7).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.336F, -8.0021F, 4.6653F, -0.4076F, 0.0391F, 0.4053F));

		PartDefinition cube_r46 = bone4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(88, 136).mirror().addBox(0.1199F, 3.6274F, -0.2814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.156F, 0.8133F, 4.5756F, 0.7705F, -0.0553F, 0.1121F));

		PartDefinition cube_r47 = bone4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(88, 130).mirror().addBox(0.1199F, 3.5749F, 1.8396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.156F, 0.8133F, 4.5756F, 0.2469F, -0.0553F, 0.1121F));

		PartDefinition cube_r48 = bone4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 123).mirror().addBox(0.1199F, 4.4979F, -0.4312F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.156F, 0.8133F, 4.5756F, 0.6396F, -0.0553F, 0.1121F));

		PartDefinition cube_r49 = bone4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(33, 130).mirror().addBox(0.1227F, 4.6283F, -0.997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(129, 124).mirror().addBox(0.1227F, 4.2283F, -1.0219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.156F, 0.8133F, 4.5756F, 1.076F, -0.0553F, 0.1121F));

		PartDefinition cube_r50 = bone4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(129, 121).mirror().addBox(0.069F, 2.8109F, -2.9802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.156F, 0.8133F, 4.5756F, 1.5561F, -0.0464F, 0.1037F));

		PartDefinition cube_r51 = bone4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(51, 122).mirror().addBox(-0.0187F, -0.2132F, -0.9512F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.156F, 0.8133F, 4.5756F, 0.9468F, -0.0133F, 0.113F));

		PartDefinition cube_r52 = bone4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(60, 122).mirror().addBox(-0.5F, -1.8F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.075F, 0.524F, 2.9245F, 1.3125F, 0.0858F, -0.1519F));

		PartDefinition cube_r53 = bone4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(111, 51).mirror().addBox(0.0708F, -2.0897F, 3.3647F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.156F, 2.1633F, 4.8756F, 2.2437F, 0.0313F, -0.1956F));

		PartDefinition cube_r54 = bone4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(83, 136).mirror().addBox(0.142F, -4.0627F, -0.3421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3196F, 1.2971F, 4.1052F, 0.9806F, 0.0911F, -0.1489F));

		PartDefinition cube_r55 = bone4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(116, 51).mirror().addBox(0.142F, -3.7627F, -0.3421F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3196F, 1.2971F, 4.1052F, 0.8148F, 0.0911F, -0.1489F));

		PartDefinition cube_r56 = bone4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(116, 31).mirror().addBox(-0.5F, -1.6F, -2.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4114F, -3.0996F, 2.4354F, 0.462F, -0.0639F, -0.0248F));

		PartDefinition cube_r57 = bone4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(78, 52).mirror().addBox(-0.5F, -0.8F, -4.1F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3192F, -2.0278F, 1.4095F, -0.1488F, -0.0639F, -0.0248F));

		PartDefinition cube_r58 = bone4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(7, 103).mirror().addBox(-0.5F, -3.725F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0457F, 0.7049F, -2.5179F, -1.1437F, -0.0639F, -0.0248F));

		PartDefinition cube_r59 = bone4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(123, 30).mirror().addBox(-0.6131F, -3.5888F, 1.4735F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.073F, 6.7663F, -4.7279F, -1.5728F, -0.0891F, 0.1553F));

		PartDefinition cube_r60 = bone4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(28, 123).mirror().addBox(-0.6131F, 0.8805F, 0.9886F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.073F, 6.7663F, -4.7279F, -0.8311F, -0.0891F, 0.1553F));

		PartDefinition cube_r61 = bone4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(60, 97).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(40, 92).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5022F, 10.394F, -5.9171F, -1.311F, -0.0891F, 0.1553F));

		PartDefinition cube_r62 = bone4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(60, 115).mirror().addBox(-0.5F, -2.5F, -0.325F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5883F, 9.1135F, -2.7495F, -1.2238F, -0.0891F, 0.1553F));

		PartDefinition cube_r63 = bone4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(83, 129).mirror().addBox(-0.6131F, 0.7481F, 0.2111F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.073F, 6.7663F, -4.7279F, -0.3598F, -0.0891F, 0.1553F));

		PartDefinition cube_r64 = bone4.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(83, 124).mirror().addBox(-0.6131F, -0.0935F, 0.0604F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.073F, 6.7663F, -4.7279F, 0.0852F, -0.0891F, 0.1553F));

		PartDefinition cube_r65 = bone4.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(129, 65).mirror().addBox(-0.6131F, 0.7955F, -0.3573F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.073F, 6.7663F, -4.7279F, 0.3906F, -0.0891F, 0.1553F));

		PartDefinition cube_r66 = bone4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(68, 124).mirror().addBox(0.2154F, 4.0663F, -1.1499F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.073F, 0.8663F, -2.7279F, -0.1501F, -0.0837F, 0.1583F));

		PartDefinition cube_r67 = bone4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(112, 122).mirror().addBox(-0.5099F, -0.6934F, -1.4113F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.073F, 0.8663F, -2.7279F, -0.0005F, -0.0643F, -0.0237F));

		PartDefinition cube_r68 = bone4.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(111, 82).mirror().addBox(-0.5099F, -0.6052F, -0.9866F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.073F, 0.8663F, -2.7279F, -0.175F, -0.0643F, -0.0237F));

		PartDefinition cube_r69 = bone4.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(0, 103).mirror().addBox(-0.5F, -3.975F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0129F, 0.9743F, -4.0688F, 0.2613F, -0.0639F, -0.0248F));

		PartDefinition cube_r70 = bone4.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(9, 110).mirror().addBox(-0.5F, -1.55F, -0.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0921F, -3.9748F, -4.0956F, -0.6288F, -0.0639F, -0.0248F));

		PartDefinition cube_r71 = bone4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(76, 43).mirror().addBox(-0.6156F, -0.3139F, -1.6767F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1504F, -4.4868F, -1.572F, -0.1925F, -0.0639F, -0.0248F));

		PartDefinition cube_r72 = bone4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(78, 129).mirror().addBox(-0.0181F, -2.4083F, -3.8165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.1253F, -8.8554F, -4.6902F, 1.6842F, 0.3289F, 0.3595F));

		PartDefinition cube_r73 = bone4.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(97, 106).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4749F, -5.0861F, -6.6856F, 2.3736F, 0.3289F, 0.3595F));

		PartDefinition cube_r74 = bone4.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(53, 111).mirror().addBox(-0.0181F, -1.3481F, -3.4282F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.1253F, -8.8554F, -4.6902F, 1.3439F, 0.3289F, 0.3595F));

		PartDefinition cube_r75 = bone4.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(103, 63).mirror().addBox(-0.0181F, -0.039F, -1.9676F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1253F, -8.8554F, -4.6902F, 0.5847F, 0.3289F, 0.3595F));

		PartDefinition cube_r76 = bone4.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(16, 98).mirror().addBox(-1.1F, 0.15F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.186F, -9.0019F, -2.3068F, 0.2343F, 0.3037F, 0.3808F));

		PartDefinition cube_r77 = bone4.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(20, 90).mirror().addBox(-0.42F, 0.205F, 1.0796F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.5815F, -9.3405F, -3.2318F, -0.0562F, 0.0321F, 0.4016F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 1.3734F, 2.1484F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg1.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(86, 23).addBox(-0.6F, -0.8957F, -1.8902F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 12.615F, -1.4005F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg1.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(23, 113).addBox(-5.1F, -1.2214F, 0.2676F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.6F, 7.6851F, -2.8601F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg1.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(5, 92).addBox(-5.1F, -1.3057F, -2.443F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(113, 94).addBox(-5.1F, -2.0057F, -0.643F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.6F, 11.6054F, -1.1045F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightLeg1.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(65, 112).addBox(-5.1F, -2.132F, 0.1317F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 108).addBox(-5.1F, -1.132F, -0.7183F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.6F, 10.6777F, -3.0694F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg1.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(107, 76).addBox(-1.0F, -3.5F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 9.0341F, -3.6887F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg1.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(68, 129).addBox(-0.5F, -0.0843F, -0.9038F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 4.1355F, -0.827F, -3.002F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg1.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(73, 124).addBox(-0.5F, -0.5365F, -0.2291F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5F, 4.1355F, -0.827F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg1.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(41, 100).addBox(-5.1F, -2.0863F, -1.9196F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.6F, 3.4214F, 0.6287F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg1.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(107, 40).addBox(-5.1F, -3.8363F, -0.2445F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.6F, 5.5302F, -2.7348F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg1.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(89, 42).addBox(-1.5F, -1.6F, -0.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.1302F, 0.171F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg1.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(97, 86).addBox(-1.1F, -2.425F, -3.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.6F, 1.5376F, 1.2007F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 13.8354F, -1.6713F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(106, 23).addBox(0.9F, -0.1F, -0.4F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-2.2F, 3.5297F, -0.7222F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(81, 110).addBox(0.9F, -2.4F, -0.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.2F, 3.5297F, -0.7222F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(93, 35).addBox(-0.1F, -1.2F, 0.4F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.2F, -0.1422F, -2.2528F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(122, 4).addBox(-1.0F, -0.425F, -0.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3F, -0.5975F, -1.523F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(91, 49).addBox(-0.1F, -0.6F, -1.9F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(5, 96).addBox(-0.1F, -0.6F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 1.2304F, 1.8973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(40, 95).addBox(-0.1F, -0.6F, -1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(113, 23).addBox(-0.1F, 1.5F, -0.85F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-1.2F, 9.6597F, -0.0125F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(100, 41).addBox(-0.1F, -8.4F, -1.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 16.4611F, -0.1532F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(99, 23).addBox(-0.1F, -6.0F, -1.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.2F, 9.6597F, -0.0125F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(16, 110).addBox(-0.1F, -3.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 4.7195F, 0.6129F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(32, 77).addBox(-1.1F, -6.6F, -0.525F, 2.0F, 13.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.2F, 7.6471F, -0.5117F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(109, 111).addBox(-1.1F, 0.0274F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 0.2472F, 0.2883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(15, 82).addBox(-1.1F, -0.209F, -0.1593F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.4F, 2.2197F, -0.3418F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(5, 83).addBox(-1.0F, 0.0553F, -0.5239F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.4644F, -1.2063F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(123, 18).addBox(0.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, 0.1309F));

		PartDefinition cube_r104 = rightLeg3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(52, 116).addBox(0.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.9F, 3.5553F, -0.0239F, 0.0F, 0.0F, 0.1309F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(0, 59).addBox(-1.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 6.999F, 0.1898F, 0.0611F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(52, 0).addBox(-2.5F, -0.8F, -4.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7254F, -3.9319F, 0.0038F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 1.3734F, 2.1484F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r105 = leftLeg1.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(55, 86).addBox(-2.4F, -0.8957F, -1.8902F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 12.615F, -1.4005F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r106 = leftLeg1.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(79, 115).addBox(3.1F, -1.2214F, 0.2676F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-5.6F, 7.6851F, -2.8601F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r107 = leftLeg1.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(0, 110).addBox(3.1F, -1.3057F, -2.443F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(114, 0).addBox(3.1F, -2.0057F, -0.643F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-5.6F, 11.6054F, -1.1045F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r108 = leftLeg1.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(97, 112).addBox(3.1F, -2.132F, 0.1317F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 105).addBox(3.1F, -1.132F, -0.7183F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-5.6F, 10.6777F, -3.0694F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r109 = leftLeg1.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(109, 55).addBox(-1.0F, -3.5F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 9.0341F, -3.6887F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r110 = leftLeg1.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(73, 129).addBox(-0.5F, -0.0843F, -0.9038F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 4.1355F, -0.827F, -3.002F, 0.0F, 0.0F));

		PartDefinition cube_r111 = leftLeg1.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(78, 124).addBox(-0.5F, -0.5365F, -0.2291F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.5F, 4.1355F, -0.827F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r112 = leftLeg1.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(102, 55).addBox(3.1F, -2.0863F, -1.9196F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-5.6F, 3.4214F, 0.6287F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r113 = leftLeg1.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(107, 70).addBox(3.1F, -3.8363F, -0.2445F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-5.6F, 5.5302F, -2.7348F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r114 = leftLeg1.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(90, 0).addBox(-1.5F, -1.6F, -0.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 0.1302F, 0.171F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r115 = leftLeg1.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(97, 93).addBox(-0.9F, -2.425F, -3.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.6F, 1.5376F, 1.2007F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 13.8354F, -1.6713F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r116 = leftLeg2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(106, 92).addBox(-2.9F, -0.1F, -0.4F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(2.2F, 3.5297F, -0.7222F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r117 = leftLeg2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(111, 46).addBox(-2.9F, -2.4F, -0.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2F, 3.5297F, -0.7222F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r118 = leftLeg2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(86, 93).addBox(-1.9F, -1.2F, 0.4F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2F, -0.1422F, -2.2528F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r119 = leftLeg2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(122, 121).addBox(-1.0F, -0.425F, -0.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, -0.5975F, -1.523F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r120 = leftLeg2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(92, 67).addBox(-1.9F, -0.6F, -1.9F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.2F, 0.3526F, 0.2482F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r121 = leftLeg2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(96, 78).addBox(-1.9F, -0.6F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 1.2304F, 1.8973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r122 = leftLeg2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(66, 95).addBox(-1.9F, -0.6F, -1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2F, 0.3526F, 0.2482F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r123 = leftLeg2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(7, 116).addBox(-1.9F, 1.5F, -0.85F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.2F, 9.6597F, -0.0125F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r124 = leftLeg2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(76, 102).addBox(-1.9F, -8.4F, -1.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 16.4611F, -0.1532F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r125 = leftLeg2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(34, 100).addBox(-1.9F, -6.0F, -1.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.2F, 9.6597F, -0.0125F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r126 = leftLeg2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(74, 110).addBox(-1.9F, -3.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 4.7195F, 0.6129F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r127 = leftLeg2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(39, 77).addBox(-0.9F, -6.6F, -0.525F, 2.0F, 13.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.2F, 7.6471F, -0.5117F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r128 = leftLeg2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(112, 10).addBox(0.1F, 0.0274F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 0.2472F, 0.2883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r129 = leftLeg2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(0, 83).addBox(0.1F, -0.209F, -0.1593F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.4F, 2.2197F, -0.3418F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(68, 86).addBox(-2.0F, 0.0553F, -0.5239F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.4644F, -1.2063F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r130 = leftLeg3.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(107, 124).addBox(-1.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, -0.1309F));

		PartDefinition cube_r131 = leftLeg3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(97, 121).addBox(-1.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.9F, 3.5553F, -0.0239F, 0.0F, 0.0F, -0.1309F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(59, 37).addBox(-4.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 6.999F, 0.1898F, 0.3229F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(52, 7).addBox(-3.5F, -0.8F, -4.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7254F, -3.9319F, 0.0038F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2161F, 8.6304F, -0.2882F, 0.0418F, -0.0124F));

		PartDefinition cube_r132 = tail1.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(91, 123).addBox(0.0F, -0.2F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2878F, 8.7295F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r133 = tail1.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(116, 105).addBox(0.5F, -0.0129F, -0.5754F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.1058F, 1.6434F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r134 = tail1.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(116, 81).addBox(0.5F, 0.5871F, -0.1754F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.8299F, 3.4583F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r135 = tail1.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(57, 116).addBox(0.5F, 0.2871F, -0.8754F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.096F, 5.7805F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r136 = tail1.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(113, 31).addBox(0.5F, -5.9823F, -0.1162F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.8326F, 4.9848F, 0.0044F, 0.0F, 0.0F));

		PartDefinition cube_r137 = tail1.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(91, 115).addBox(0.5F, -5.4573F, -0.1162F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.1588F, 6.9807F, -0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r138 = tail1.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(88, 110).addBox(0.5F, -6.3073F, -0.4162F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.5051F, 3.3259F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r139 = tail1.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(44, 108).addBox(0.497F, -5.7323F, -1.0162F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2471F, 1.9357F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r140 = tail1.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-2.3F, -0.5F, 1.0F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0111F, 0.0962F, 0.1573F, 0.0517F, 0.0082F));

		PartDefinition cube_r141 = tail1.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(0, 51).addBox(-0.7F, -0.5F, 1.0F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0111F, 0.0962F, 0.1573F, -0.0517F, -0.0082F));

		PartDefinition cube_r142 = tail1.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(27, 26).addBox(0.0F, -1.9F, 0.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.9157F, 0.1382F, 0.1571F, 0.0F, 0.0F));

		PartDefinition tail = tail1.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.4998F, 8.8946F, 0.1051F, 0.0868F, 0.0091F));

		PartDefinition cube_r143 = tail.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(59, 53).mirror().addBox(-2.4F, -0.5F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.0382F, 0.9544F, 0.1571F, 0.0259F, 0.0041F));

		PartDefinition cube_r144 = tail.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(59, 53).addBox(0.4F, -0.5F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -0.0382F, 0.9544F, 0.1571F, -0.0259F, -0.0041F));

		PartDefinition cube_r145 = tail.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(59, 43).addBox(0.0F, -1.9F, 9.1F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5F, 2.4308F, -8.8805F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r146 = tail.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(10, 129).addBox(0.0F, 1.4F, -0.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.548F, 6.0799F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r147 = tail.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(17, 124).addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7395F, 4.0982F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r148 = tail.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(65, 123).addBox(0.0F, 0.4F, -0.3F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.903F, 1.7675F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r149 = tail.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(39, 123).addBox(0.5F, -4.1073F, -0.0162F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.6262F, 5.7753F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r150 = tail.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(36, 123).addBox(0.5F, -4.2073F, -0.0162F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.6262F, 3.7753F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r151 = tail.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(33, 123).addBox(0.5F, -4.5823F, -0.0162F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.2832F, 1.8025F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r152 = tail.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(94, 115).addBox(0.5F, -5.0073F, -0.0162F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.0395F, -0.1826F, -0.1047F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.4624F, 6.8232F, 0.1402F, 0.0864F, 0.0122F));

		PartDefinition cube_r153 = tail2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(30, 128).addBox(0.0F, -3.8561F, -0.0316F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8424F, 7.0228F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r154 = tail2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(88, 124).addBox(0.0F, -3.8561F, 0.0684F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0254F, 4.9307F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r155 = tail2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(56, 124).addBox(0.0F, -3.9061F, -0.1316F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1823F, 3.1376F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r156 = tail2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(47, 124).addBox(0.0F, -3.8811F, 0.0684F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.374F, 0.946F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r157 = tail2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(40, 58).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.005F))
				.texOffs(21, 58).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.426F, 1.046F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r158 = tail2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(38, 130).addBox(0.0F, 1.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.018F, 1.9009F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r159 = tail2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(48, 100).addBox(0.0F, 1.8F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0009F, 5.4187F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r160 = tail2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(17, 130).addBox(0.0F, 1.1F, -0.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2458F, 3.5777F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r161 = tail2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(67, 24).mirror().addBox(-1.6F, -0.5F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5302F, -0.4738F, 1.0278F, 0.0175F, 0.0262F, 0.0005F));

		PartDefinition cube_r162 = tail2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(67, 24).addBox(-0.4F, -0.5F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5302F, -0.4738F, 1.0278F, 0.0175F, -0.0262F, -0.0005F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7776F, 8.1476F, 0.0264F, 0.1309F, 0.0034F));

		PartDefinition cube_r163 = tail8.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(59, 61).mirror().addBox(-1.4F, 0.0F, -0.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3376F, 0.9727F, 0.0175F, 0.0349F, 0.0006F));

		PartDefinition cube_r164 = tail8.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(59, 61).addBox(-0.6F, 0.0F, -0.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3376F, 0.9727F, 0.0175F, -0.0349F, -0.0006F));

		PartDefinition cube_r165 = tail8.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(31, 0).addBox(-0.5F, -1.9F, 7.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2035F, -7.1016F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r166 = tail8.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(136, 103).addBox(0.0F, 3.8F, 3.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 135).addBox(0.0F, 2.4F, 1.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 66).addBox(0.0F, 0.8F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7643F, 2.89F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r167 = tail8.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(30, 104).addBox(0.0F, 0.7F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.837F, 0.6886F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r168 = tail8.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(93, 130).addBox(0.0F, -2.4811F, -0.0316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 6.8984F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r169 = tail8.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(64, 130).addBox(0.0F, -2.6561F, -0.1316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 4.9984F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r170 = tail8.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(55, 130).addBox(0.0F, -2.9061F, -0.0316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 2.8984F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r171 = tail8.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(47, 130).addBox(0.0F, -3.1561F, -0.0316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 0.8984F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2223F, 8.9023F, -0.0613F, 0.0871F, -0.0053F));

		PartDefinition cube_r172 = tail3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(26, 137).addBox(0.0F, -1.9128F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 137).addBox(0.0F, -2.2128F, 2.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 5.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r173 = tail3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(20, 137).addBox(0.0F, -1.9628F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 3.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r174 = tail3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(135, 136).addBox(0.0F, -1.9628F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 1.8963F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r175 = tail3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(132, 136).addBox(0.0F, -1.9128F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.1037F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r176 = tail3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(129, 136).addBox(0.0F, 2.2F, 3.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(126, 136).addBox(0.0F, 0.8F, 1.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 107).addBox(0.0F, -0.4F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.332F, 2.3058F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r177 = tail3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-1.5F, 0.6F, 0.2F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0349F, 0.0018F));

		PartDefinition cube_r178 = tail3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(0, 41).addBox(0.5F, 0.6F, 0.2F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, -0.0349F, -0.0018F));

		PartDefinition cube_r179 = tail3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(38, 38).addBox(-0.5F, 0.1F, 0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail9 = tail3.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7389F, 8.8298F, -0.0876F, 0.0869F, -0.0076F));

		PartDefinition cube_r180 = tail9.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(51, 69).addBox(-0.5F, 0.1F, 9.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0951F, -9.1335F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r181 = tail9.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(17, 65).addBox(0.0F, -0.95F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7103F, 5.0517F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r182 = tail9.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(137, 96).addBox(0.0F, -1.225F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5232F, 3.058F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r183 = tail9.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(96, 137).addBox(0.0F, 6.1F, 9.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 137).addBox(0.0F, 4.8F, 7.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 137).addBox(0.0F, 3.4F, 5.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0709F, -6.524F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r184 = tail9.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(137, 42).addBox(0.0F, -1.325F, -0.025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.487F, 1.0827F, -0.1134F, 0.0F, 0.0F));

		PartDefinition tail4 = tail9.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3811F, 5.9106F, 0.0352F, 0.1308F, 0.0046F));

		PartDefinition cube_r185 = tail4.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(101, 18).addBox(0.0F, -0.725F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2883F, 5.0293F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r186 = tail4.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(92, 73).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3581F, 3.0305F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r187 = tail4.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(32, 74).addBox(0.0F, -0.9F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 1.2316F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r188 = tail4.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(102, 137).addBox(0.0F, -0.55F, 0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 137).addBox(0.0F, -1.95F, -1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0108F, 3.2718F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r189 = tail4.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(66, 69).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 0.2316F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(75, 8).addBox(-0.5F, -0.5698F, -0.2226F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F))
				.texOffs(138, 9).addBox(0.0F, -1.2448F, 0.7774F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 46).addBox(0.0F, -1.1698F, 2.7774F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3471F, 6.1912F, -0.1144F, 0.1301F, -0.0149F));

		PartDefinition cube_r190 = tail5.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(117, 28).addBox(0.0F, -0.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5698F, 4.7774F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r191 = tail5.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(103, 70).addBox(0.0F, 4.05F, 6.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 83).addBox(0.0F, 2.95F, 4.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 102).addBox(0.0F, 1.75F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6637F, -2.9195F, 0.6021F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(56, 14).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(44, 117).addBox(0.0F, -0.575F, 0.9987F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(137, 56).addBox(0.0F, -0.525F, 2.9987F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(138, 0).addBox(0.0F, -0.425F, 4.9987F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5057F, 5.6774F, -0.0646F, 0.2157F, -0.0328F));

		PartDefinition cube_r192 = tail6.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(137, 100).addBox(0.0F, 5.25F, 8.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1693F, -8.5969F, 0.6021F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(17, 74).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.0551F, 0.1716F, -0.0321F));

		PartDefinition tail10 = tail7.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(0, 75).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0027F, 5.9961F, -0.3717F, 0.1628F, -0.0631F));

		PartDefinition bone = tail1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -8.333F, 7.7531F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1628F, -4.1022F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r193 = body.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(21, 29).addBox(-0.503F, -5.8022F, -1.0364F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2486F, -2.8492F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r194 = body.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(60, 106).addBox(-0.503F, -5.8022F, -2.0364F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3533F, -4.8465F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r195 = body.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(104, 105).addBox(-0.503F, -5.8522F, -0.0364F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1091F, -0.8541F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r196 = body.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(48, 26).addBox(-1.0F, 0.0F, 1.9F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.669F, -8.7704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r197 = body.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -4.9018F, -0.1296F, 7.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 14.3156F, -7.9159F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r198 = body.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(128, 42).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -2.9704F, 0.0163F, 0.0335F, -0.6443F));

		PartDefinition cube_r199 = body.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(124, 71).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -2.9704F, 0.0006F, 0.0372F, -1.0809F));

		PartDefinition cube_r200 = body.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(134, 28).mirror().addBox(-3.74F, -2.3355F, -0.4915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -2.9704F, -0.0203F, 0.0312F, -1.6747F));

		PartDefinition cube_r201 = body.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(121, 55).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.119F, 0.0296F, -0.1233F, -0.0713F, -0.6417F));

		PartDefinition cube_r202 = body.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(122, 8).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.119F, 0.0296F, -0.0817F, -0.1167F, -1.0776F));

		PartDefinition cube_r203 = body.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(128, 54).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -5.9704F, 0.1244F, 0.1082F, -0.4809F));

		PartDefinition cube_r204 = body.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(128, 77).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -5.9704F, 0.0669F, 0.1506F, -0.9189F));

		PartDefinition cube_r205 = body.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(118, 49).mirror().addBox(-5.6882F, -2.8327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -5.9704F, -0.0295F, 0.162F, -1.5197F));

		PartDefinition cube_r206 = body.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(118, 49).addBox(2.6881F, -2.8327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -5.9704F, -0.0295F, -0.162F, 1.5197F));

		PartDefinition cube_r207 = body.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(128, 77).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -5.9704F, 0.0669F, -0.1506F, 0.9189F));

		PartDefinition cube_r208 = body.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(128, 54).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -5.9704F, 0.1244F, -0.1082F, 0.4809F));

		PartDefinition cube_r209 = body.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(122, 8).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.119F, 0.0296F, -0.0817F, 0.1167F, 1.0776F));

		PartDefinition cube_r210 = body.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(121, 55).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.119F, 0.0296F, -0.1233F, 0.0713F, 0.6417F));

		PartDefinition cube_r211 = body.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(134, 28).addBox(2.74F, -2.3355F, -0.4915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -2.9704F, -0.0203F, -0.0312F, 1.6747F));

		PartDefinition cube_r212 = body.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(124, 71).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -2.9704F, 0.0006F, -0.0372F, 1.0809F));

		PartDefinition cube_r213 = body.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(128, 42).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -2.9704F, 0.0163F, -0.0335F, 0.6443F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, -1.1F, -10.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.394F, -5.7704F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r214 = body2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(48, 104).addBox(0.0F, -5.6122F, -1.0627F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0895F, -2.9945F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r215 = body2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(25, 104).addBox(0.0F, -4.9117F, -0.8614F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9992F, -9.195F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r216 = body2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(92, 106).addBox(0.0F, -5.4367F, -0.9614F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0263F, -6.0951F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r217 = body2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(85, 84).mirror().addBox(-9.6882F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -6.0F, 0.0401F, 0.223F, -1.3935F));

		PartDefinition cube_r218 = body2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(128, 79).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -6.0F, 0.1588F, 0.1622F, -0.7916F));

		PartDefinition cube_r219 = body2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(129, 8).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -6.0F, 0.2119F, 0.0805F, -0.3597F));

		PartDefinition cube_r220 = body2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(7, 125).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -9.0F, 0.2762F, 0.1089F, -0.3191F));

		PartDefinition cube_r221 = body2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(125, 44).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -9.0F, 0.2059F, 0.2147F, -0.7483F));

		PartDefinition cube_r222 = body2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(46, 77).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -9.0F, 0.0485F, 0.2924F, -1.3568F));

		PartDefinition cube_r223 = body2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(99, 31).mirror().addBox(-7.6882F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -3.0F, 0.0125F, 0.2113F, -1.4467F));

		PartDefinition cube_r224 = body2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(125, 46).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -3.0F, 0.1296F, 0.1679F, -0.8437F));

		PartDefinition cube_r225 = body2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(125, 57).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -3.0F, 0.1881F, 0.0977F, -0.409F));

		PartDefinition cube_r226 = body2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(125, 57).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -3.0F, 0.1881F, -0.0977F, 0.409F));

		PartDefinition cube_r227 = body2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(27, 14).addBox(-2.5F, -3.2429F, -6.518F, 7.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 13.9955F, -2.1077F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r228 = body2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(125, 46).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -3.0F, 0.1296F, -0.1679F, 0.8437F));

		PartDefinition cube_r229 = body2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(99, 31).addBox(2.6881F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -3.0F, 0.0125F, -0.2113F, 1.4467F));

		PartDefinition cube_r230 = body2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(46, 77).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -9.0F, 0.0485F, -0.2924F, 1.3568F));

		PartDefinition cube_r231 = body2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(125, 44).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -9.0F, 0.2059F, -0.2147F, 0.7483F));

		PartDefinition cube_r232 = body2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(7, 125).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -9.0F, 0.2762F, -0.1089F, 0.3191F));

		PartDefinition cube_r233 = body2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(129, 8).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -6.0F, 0.2119F, -0.0805F, 0.3597F));

		PartDefinition cube_r234 = body2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(128, 79).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -6.0F, 0.1588F, -0.1622F, 0.7916F));

		PartDefinition cube_r235 = body2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(85, 84).addBox(2.6881F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -6.0F, 0.0401F, -0.223F, 1.3935F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0088F, -8.9481F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(113, 89).addBox(-0.5F, -2.2141F, -0.0945F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.0391F, -2.9368F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(109, 116).addBox(0.0F, -4.6525F, -0.1399F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9609F, -2.8368F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(14, 124).addBox(0.0F, -4.1967F, -0.0424F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9609F, -4.9368F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(21, 53).addBox(-4.9365F, 0.1974F, -1.2304F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9365F, 11.0277F, -6.3079F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(90, 21).mirror().addBox(-6.4763F, 1.2331F, -0.8208F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9365F, 11.0277F, -6.3079F, 0.5747F, 0.9787F, 0.6644F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(99, 33).mirror().addBox(-5.0382F, 1.2941F, -0.4971F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9365F, 11.0277F, -6.3079F, 0.0778F, 0.9079F, 0.6508F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(56, 24).mirror().addBox(-3.7018F, 1.2591F, -0.4613F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9365F, 11.0277F, -6.3079F, -0.2586F, 0.9552F, 0.9803F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(75, 16).mirror().addBox(-1.4539F, 0.3925F, -5.4555F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9365F, 11.0277F, -6.3079F, -0.4746F, -0.4336F, 0.2126F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(125, 59).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2109F, -2.4368F, 0.2785F, 0.0989F, -0.2673F));

		PartDefinition cube_r245 = chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(122, 125).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2109F, -2.4368F, 0.2123F, 0.2065F, -0.6955F));

		PartDefinition cube_r246 = chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(31, 11).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2109F, -2.4368F, 0.0588F, 0.2893F, -1.3024F));

		PartDefinition cube_r247 = chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(67, 32).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1609F, -4.4368F, 0.0741F, 0.339F, -1.3517F));

		PartDefinition cube_r248 = chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(126, 10).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1609F, -4.4368F, 0.2537F, 0.239F, -0.7403F));

		PartDefinition cube_r249 = chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(126, 12).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1609F, -4.4368F, 0.3289F, 0.1117F, -0.316F));

		PartDefinition cube_r250 = chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(67, 34).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -6.3368F, 0.0857F, 0.353F, -1.3853F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(20, 126).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -6.3368F, 0.2711F, 0.2441F, -0.7738F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(126, 81).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -6.3368F, 0.3466F, 0.1095F, -0.3517F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(126, 83).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -8.3368F, 0.4222F, 0.1552F, -0.4283F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(126, 85).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -8.3368F, 0.3229F, 0.3164F, -0.846F));

		PartDefinition cube_r255 = chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(65, 77).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -8.3368F, 0.0841F, 0.4407F, -1.4725F));

		PartDefinition cube_r256 = chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(65, 77).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -8.3368F, 0.0841F, -0.4407F, 1.4725F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(126, 85).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -8.3368F, 0.3229F, -0.3164F, 0.846F));

		PartDefinition cube_r258 = chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(126, 83).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -8.3368F, 0.4222F, -0.1552F, 0.4283F));

		PartDefinition cube_r259 = chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(13, 131).addBox(0.0F, -3.1927F, -0.2837F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6609F, -8.7368F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r260 = chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(126, 81).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -6.3368F, 0.3466F, -0.1095F, 0.3517F));

		PartDefinition cube_r261 = chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(20, 126).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -6.3368F, 0.2711F, -0.2441F, 0.7738F));

		PartDefinition cube_r262 = chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(67, 34).addBox(2.6881F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -6.3368F, 0.0857F, -0.353F, 1.3853F));

		PartDefinition cube_r263 = chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(126, 12).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1609F, -4.4368F, 0.3289F, -0.1117F, 0.316F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(126, 10).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1609F, -4.4368F, 0.2537F, -0.239F, 0.7403F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(67, 32).addBox(2.6881F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1609F, -4.4368F, 0.0741F, -0.339F, 1.3517F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(31, 11).addBox(2.6881F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2109F, -2.4368F, 0.0588F, -0.2893F, 1.3024F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(122, 125).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2109F, -2.4368F, 0.2123F, -0.2065F, 0.6955F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(17, 68).addBox(-3.5F, -2.0F, -3.0F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 13.7179F, -0.5578F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(125, 59).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2109F, -2.4368F, 0.2785F, -0.0989F, 0.2673F));

		PartDefinition cube_r270 = chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(94, 123).addBox(0.0F, -3.9926F, -0.2837F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6609F, -6.7368F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r271 = chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(75, 16).addBox(-0.5461F, 0.3925F, -5.4555F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9365F, 11.0277F, -6.3079F, -0.4746F, 0.4336F, -0.2126F));

		PartDefinition cube_r272 = chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(56, 24).addBox(-0.2982F, 1.2591F, -0.4613F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9365F, 11.0277F, -6.3079F, -0.2586F, -0.9552F, -0.9803F));

		PartDefinition cube_r273 = chest.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(99, 33).addBox(0.0382F, 1.2941F, -0.4971F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9365F, 11.0277F, -6.3079F, 0.0778F, -0.9079F, -0.6508F));

		PartDefinition cube_r274 = chest.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(90, 21).addBox(0.4763F, 1.2331F, -0.8208F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9365F, 11.0277F, -6.3079F, 0.5747F, -0.9787F, -0.6644F));

		PartDefinition cube_r275 = chest.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(80, 36).addBox(-2.9365F, 0.3925F, -5.0268F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9365F, 11.0277F, -6.3079F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r276 = chest.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(36, 68).addBox(-0.5F, -0.1119F, -5.8679F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.0609F, -3.0368F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.7145F, 5.5507F, -6.0148F, -0.079F, 0.0981F, -0.1959F));

		PartDefinition cube_r277 = bone2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(59, 79).addBox(-0.9453F, -1.1885F, 0.0157F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.9555F, -0.9822F, -0.4595F, 0.9469F, -0.0148F, -0.0092F));

		PartDefinition cube_r278 = bone2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(116, 36).addBox(-0.9453F, -2.4253F, 3.0137F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9555F, -0.9822F, -0.4595F, 0.6589F, -0.0148F, -0.0092F));

		PartDefinition cube_r279 = bone2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(101, 131).addBox(-0.5F, -1.025F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 131).addBox(-0.5F, -0.225F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4342F, -5.7598F, 1.1594F, 1.3744F, 0.0027F, -0.0172F));

		PartDefinition cube_r280 = bone2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(46, 79).addBox(-0.9433F, -1.314F, -0.522F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9555F, -0.9822F, -0.4595F, 1.1563F, 0.0027F, -0.0172F));

		PartDefinition cube_r281 = bone2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(55, 91).addBox(-0.8861F, -1.1959F, 0.7464F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9555F, 2.6178F, -2.4595F, 1.0646F, 0.003F, -0.0172F));

		PartDefinition cube_r282 = bone2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(131, 69).addBox(-0.425F, -1.05F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0982F, 2.9226F, -2.5249F, 1.0297F, 0.1346F, 0.2175F));

		PartDefinition cube_r283 = bone2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(60, 100).addBox(-0.1317F, 2.5826F, -2.2852F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9181F, 2.5781F, -2.9873F, -0.4194F, 0.6401F, 1.071F));

		PartDefinition cube_r284 = bone2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(104, 35).addBox(-1.0673F, 1.7238F, -2.2851F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9181F, 2.5781F, -2.9873F, -0.6093F, 0.4662F, 0.7137F));

		PartDefinition cube_r285 = bone2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(21, 122).addBox(-1.0673F, -0.2729F, -2.8494F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9181F, 2.5781F, -2.9873F, 0.1325F, 0.4662F, 0.7137F));

		PartDefinition cube_r286 = bone2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(113, 100).addBox(-1.0673F, -0.8336F, -1.9078F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9181F, 2.5781F, -2.9873F, 0.787F, 0.4662F, 0.7137F));

		PartDefinition cube_r287 = bone2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(58, 131).addBox(-1.1422F, -1.2384F, -0.2062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9555F, 2.6178F, -2.4595F, 1.0512F, 0.0827F, 0.2417F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.7145F, 5.5507F, -6.0148F, -0.079F, -0.0981F, 0.1959F));

		PartDefinition cube_r288 = bone5.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(59, 79).mirror().addBox(-0.0547F, -1.1885F, 0.0157F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9555F, -0.9822F, -0.4595F, 0.9469F, 0.0148F, 0.0092F));

		PartDefinition cube_r289 = bone5.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(116, 36).mirror().addBox(-0.0547F, -2.4253F, 3.0137F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9555F, -0.9822F, -0.4595F, 0.6589F, 0.0148F, 0.0092F));

		PartDefinition cube_r290 = bone5.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(101, 131).mirror().addBox(-0.5F, -1.025F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(96, 131).mirror().addBox(-0.5F, -0.225F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4342F, -5.7598F, 1.1594F, 1.3744F, -0.0027F, 0.0172F));

		PartDefinition cube_r291 = bone5.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(46, 79).mirror().addBox(-0.0567F, -1.314F, -0.522F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9555F, -0.9822F, -0.4595F, 1.1563F, -0.0027F, 0.0172F));

		PartDefinition cube_r292 = bone5.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(55, 91).mirror().addBox(-0.1139F, -1.1959F, 0.7464F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9555F, 2.6178F, -2.4595F, 1.0646F, -0.003F, 0.0172F));

		PartDefinition cube_r293 = bone5.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(131, 69).mirror().addBox(-0.575F, -1.05F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.0982F, 2.9226F, -2.5249F, 1.0297F, -0.1346F, -0.2175F));

		PartDefinition cube_r294 = bone5.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(60, 100).mirror().addBox(-0.8683F, 2.5826F, -2.2852F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9181F, 2.5781F, -2.9873F, -0.4194F, -0.6401F, -1.071F));

		PartDefinition cube_r295 = bone5.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(104, 35).mirror().addBox(0.0673F, 1.7238F, -2.2851F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9181F, 2.5781F, -2.9873F, -0.6093F, -0.4662F, -0.7137F));

		PartDefinition cube_r296 = bone5.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(21, 122).mirror().addBox(0.0673F, -0.2729F, -2.8494F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9181F, 2.5781F, -2.9873F, 0.1325F, -0.4662F, -0.7137F));

		PartDefinition cube_r297 = bone5.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(113, 100).mirror().addBox(0.0673F, -0.8336F, -1.9078F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9181F, 2.5781F, -2.9873F, 0.787F, -0.4662F, -0.7137F));

		PartDefinition cube_r298 = bone5.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(58, 131).mirror().addBox(0.1422F, -1.2384F, -0.2062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9555F, 2.6178F, -2.4595F, 1.0512F, -0.0827F, -0.2417F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0841F, 9.3185F, -8.8619F, 1.0647F, 0.2618F, 0.0F));

		PartDefinition cube_r299 = leftArm1.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(122, 131).addBox(-0.2F, -0.625F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6037F, -0.4814F, -0.2496F, -0.8463F, -0.2207F, -0.0253F));

		PartDefinition cube_r300 = leftArm1.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(117, 131).addBox(-0.5F, -1.9F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 131).addBox(-0.5F, -1.2F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2706F, 0.6418F, -1.3192F, -0.3218F, -0.7676F, 0.1498F));

		PartDefinition cube_r301 = leftArm1.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(126, 109).addBox(-0.5F, -1.7F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2706F, 0.6418F, -1.3192F, -0.6272F, -0.7676F, 0.1498F));

		PartDefinition cube_r302 = leftArm1.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(126, 105).addBox(6.0F, -1.0842F, 0.4838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 0.6847F, -1.9107F, -0.4204F, -0.0786F, -0.067F));

		PartDefinition cube_r303 = leftArm1.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(134, 120).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 5.1211F, -0.0599F, -1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r304 = leftArm1.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(131, 108).addBox(-0.5F, -0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0327F, -0.2785F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r305 = leftArm1.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(131, 105).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 4.8128F, -1.2157F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r306 = leftArm1.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(112, 116).addBox(-0.5F, -1.9F, -1.075F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.0346F, -0.1913F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(47, 113).addBox(-0.8F, -1.2307F, -0.4734F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 4).addBox(-0.8F, -0.4307F, -1.5734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2645F, 6.214F, -1.6838F, -1.4282F, -0.5226F, 0.3209F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3159F, 3.9465F, 0.2145F, -0.0873F, 0.0F, 0.1745F));

		PartDefinition cube_r307 = leftHand.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(46, 86).addBox(0.0F, -2.5F, -0.2F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r308 = leftHand.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(37, 108).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 0.2032F, -1.2796F, -0.1833F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0841F, 9.3185F, -8.8619F, 1.2828F, -0.2618F, 0.0F));

		PartDefinition cube_r309 = rightArm1.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(78, 136).addBox(-0.8F, -0.625F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6037F, -0.4814F, -0.2496F, -0.8463F, 0.2207F, 0.0253F));

		PartDefinition cube_r310 = rightArm1.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(73, 136).addBox(-0.5F, -1.9F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 68).addBox(-0.5F, -1.2F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.2706F, 0.6418F, -1.3192F, -0.3218F, 0.7676F, -0.1498F));

		PartDefinition cube_r311 = rightArm1.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(129, 61).addBox(-0.5F, -1.7F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2706F, 0.6418F, -1.3192F, -0.6272F, 0.7676F, -0.1498F));

		PartDefinition cube_r312 = rightArm1.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(42, 129).addBox(-7.0F, -1.0842F, 0.4838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 0.6847F, -1.9107F, -0.4204F, 0.0786F, 0.067F));

		PartDefinition cube_r313 = rightArm1.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(68, 136).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 5.1211F, -0.0599F, -1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r314 = rightArm1.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(63, 136).addBox(-0.5F, -0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0327F, -0.2785F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r315 = rightArm1.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(41, 136).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 4.8128F, -1.2157F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r316 = rightArm1.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(102, 121).addBox(-0.5F, -1.9F, -1.075F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.0346F, -0.1913F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(104, 114).addBox(-0.2F, -1.2307F, -0.4734F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 121).addBox(-0.2F, -0.4307F, -1.5734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2645F, 6.214F, -1.6838F, -1.3991F, -0.0156F, -0.0164F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3159F, 3.9465F, 0.2145F, -0.0873F, 0.0F, -0.1745F));

		PartDefinition cube_r317 = rightHand.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(77, 86).addBox(-1.0F, -2.5F, -0.2F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r318 = rightHand.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(110, 4).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 0.2032F, -1.2796F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0302F, -8.7672F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r319 = neck1.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(127, 131).addBox(0.0F, -2.3459F, -0.016F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0311F, -1.8666F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r320 = neck1.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(0, 101).mirror().addBox(-7.6882F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.0859F, 0.7647F, -1.6764F));

		PartDefinition cube_r321 = neck1.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(126, 87).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.5477F, 0.5697F, -0.9535F));

		PartDefinition cube_r322 = neck1.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(0, 127).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.7159F, 0.3084F, -0.5651F));

		PartDefinition cube_r323 = neck1.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(0, 127).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.7159F, -0.3084F, 0.5651F));

		PartDefinition cube_r324 = neck1.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(126, 87).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.5477F, -0.5697F, 0.9535F));

		PartDefinition cube_r325 = neck1.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(0, 101).addBox(2.6881F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.0859F, -0.7647F, 1.6764F));

		PartDefinition cube_r326 = neck1.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(95, 100).addBox(-0.5F, -0.7F, 3.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.6719F, -5.6579F, 0.3142F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9438F, -2.3258F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r327 = neck2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(137, 126).addBox(0.0F, -1.4816F, -0.0991F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1431F, -0.7163F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r328 = neck2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(7, 127).mirror().addBox(-1.9081F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, 0.1064F, 0.4098F, -1.0675F));

		PartDefinition cube_r329 = neck2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(106, 29).mirror().addBox(-5.737F, -0.79F, -0.4755F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, -0.0877F, 0.414F, -1.5444F));

		PartDefinition cube_r330 = neck2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(106, 29).addBox(1.737F, -0.79F, -0.4755F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, -0.0877F, -0.414F, 1.5444F));

		PartDefinition cube_r331 = neck2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(7, 127).addBox(-0.0919F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, 0.1064F, -0.4098F, 1.0675F));

		PartDefinition cube_r332 = neck2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(25, 98).addBox(-0.5F, 1.4F, 5.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3859F, -7.7876F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3606F, -2.3471F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r333 = neck5.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(86, 99).addBox(-0.5F, 1.4F, 3.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.9754F, -5.9788F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r334 = neck5.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(101, 0).mirror().addBox(-6.7911F, -0.3926F, -0.2462F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -0.9742F, -0.2315F, 0.8773F, -1.6408F));

		PartDefinition cube_r335 = neck5.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(127, 22).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -0.9742F, 0.2994F, 0.8617F, -0.957F));

		PartDefinition cube_r336 = neck5.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(127, 24).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9742F, 0.2994F, 0.8617F, -0.957F));

		PartDefinition cube_r337 = neck5.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(101, 2).mirror().addBox(-6.7911F, -0.3926F, -0.2462F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9742F, -0.2315F, 0.8773F, -1.6408F));

		PartDefinition cube_r338 = neck5.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(101, 2).addBox(1.7911F, -0.3926F, -0.2462F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9742F, -0.2315F, -0.8773F, 1.6408F));

		PartDefinition cube_r339 = neck5.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(127, 24).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9742F, 0.2994F, -0.8617F, 0.957F));

		PartDefinition cube_r340 = neck5.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(127, 22).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -0.9742F, 0.2994F, -0.8617F, 0.957F));

		PartDefinition cube_r341 = neck5.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(101, 0).addBox(1.7911F, -0.3926F, -0.2462F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -0.9742F, -0.2315F, -0.8773F, 1.6408F));

		PartDefinition cube_r342 = neck5.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(114, 137).addBox(0.0F, -1.6566F, -0.1491F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6059F, -2.9414F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r343 = neck5.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(111, 137).addBox(0.0F, -1.0566F, -0.1491F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8842F, -0.9608F, -0.0349F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0819F, -2.7815F, -0.3478F, 0.0298F, 0.082F));

		PartDefinition cube_r344 = neck4.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(127, 26).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, 0.5293F, 0.9484F, -0.7623F));

		PartDefinition cube_r345 = neck4.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(106, 98).mirror().addBox(-5.7663F, -0.3906F, -0.2552F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, -0.151F, 1.0368F, -1.5613F));

		PartDefinition cube_r346 = neck4.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(127, 28).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, 0.508F, 0.9362F, -0.7795F));

		PartDefinition cube_r347 = neck4.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(114, 20).mirror().addBox(-4.7663F, -0.3906F, -0.2552F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, -0.1513F, 1.0193F, -1.5615F));

		PartDefinition cube_r348 = neck4.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(114, 20).addBox(1.7663F, -0.3906F, -0.2552F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, -0.1513F, -1.0193F, 1.5615F));

		PartDefinition cube_r349 = neck4.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(127, 28).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, 0.508F, -0.9362F, 0.7795F));

		PartDefinition cube_r350 = neck4.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(106, 98).addBox(1.7663F, -0.3906F, -0.2552F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, -0.151F, -1.0368F, 1.5613F));

		PartDefinition cube_r351 = neck4.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(127, 26).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, 0.5293F, -0.9484F, 0.7623F));

		PartDefinition cube_r352 = neck4.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(130, 131).addBox(0.0F, -1.5677F, -0.0582F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4916F, -3.9212F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r353 = neck4.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(117, 137).addBox(0.0F, -1.2677F, -0.0582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2697F, -1.931F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r354 = neck4.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(86, 86).addBox(-0.5F, 1.4F, 0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9504F, -3.9173F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5407F, -3.7757F, 0.2488F, 0.1823F, 0.1777F));

		PartDefinition cube_r355 = neck3.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(127, 48).mirror().addBox(-1.8547F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.3534F, -3.4609F, 0.3293F, 0.5553F, -1.0638F));

		PartDefinition cube_r356 = neck3.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(116, 57).mirror().addBox(-4.8842F, -0.3479F, -0.6322F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.3534F, -3.4609F, 0.0326F, 0.6359F, -1.584F));

		PartDefinition cube_r357 = neck3.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(127, 89).mirror().addBox(-1.8351F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.3306F, 0.5553F, -1.0103F));

		PartDefinition cube_r358 = neck3.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(116, 59).mirror().addBox(-4.8627F, -0.3478F, -0.617F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.0339F, 0.6365F, -1.5305F));

		PartDefinition cube_r359 = neck3.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(116, 59).addBox(1.8627F, -0.3478F, -0.617F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.0339F, -0.6365F, 1.5305F));

		PartDefinition cube_r360 = neck3.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(127, 89).addBox(-0.1649F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.3306F, -0.5553F, 1.0103F));

		PartDefinition cube_r361 = neck3.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(116, 57).addBox(1.8842F, -0.3479F, -0.6322F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3534F, -3.4609F, 0.0326F, -0.6359F, 1.584F));

		PartDefinition cube_r362 = neck3.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(127, 48).addBox(-0.1453F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3534F, -3.4609F, 0.3293F, -0.5553F, 1.0638F));

		PartDefinition cube_r363 = neck3.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(120, 137).addBox(0.5F, -1.6458F, -0.0223F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.6988F, -3.1055F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r364 = neck3.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(20, 132).addBox(0.5F, -1.669F, 0.0228F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.887F, -1.3144F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r365 = neck3.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(88, 28).addBox(0.0F, 1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -1.3168F, 1.7621F, -0.48F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6682F, -3.2726F, -0.3842F, 0.211F, 0.0541F));

		PartDefinition cube_r366 = neck.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(127, 91).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4212F, -1.621F, 0.5522F, 0.7699F, -0.9673F));

		PartDefinition cube_r367 = neck.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(127, 93).mirror().addBox(-3.6944F, -0.3859F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4212F, -1.621F, 0.077F, 0.9109F, -1.5945F));

		PartDefinition cube_r368 = neck.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(127, 93).addBox(1.6944F, -0.3859F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4212F, -1.621F, 0.077F, -0.9109F, 1.5945F));

		PartDefinition cube_r369 = neck.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(123, 137).addBox(0.5F, -1.7207F, -0.1014F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8514F, -1.8891F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r370 = neck.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(101, 4).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r371 = neck.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(127, 91).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4212F, -1.621F, 0.5522F, -0.7699F, 0.9673F));

		PartDefinition neck6 = neck.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.15F, -2.45F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r372 = neck6.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(127, 95).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5212F, -1.221F, 0.5254F, 0.741F, -0.9857F));

		PartDefinition cube_r373 = neck6.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(34, 98).mirror().addBox(-2.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5212F, -1.221F, 0.0783F, 0.876F, -1.5935F));

		PartDefinition cube_r374 = neck6.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(34, 98).addBox(1.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.0783F, -0.876F, 1.5935F));

		PartDefinition cube_r375 = neck6.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(23, 132).addBox(0.5F, -1.9207F, -0.1014F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8375F, -1.0498F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r376 = neck6.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(0, 114).addBox(0.0F, 1.3815F, -2.2683F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r377 = neck6.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(127, 95).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.5254F, -0.741F, 0.9857F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create().texOffs(58, 134).addBox(-0.5F, 6.2086F, -13.0417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.1696F, -1.2074F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r378 = head.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(83, 105).addBox(-1.0F, -6.7529F, -1.2023F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(0.0F, 0.7481F, -8.0711F, -1.453F, 0.0F, 0.0F));

		PartDefinition cube_r379 = head.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(105, 18).addBox(-1.0F, -0.0222F, -0.0509F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(0.0F, -0.9519F, -3.4711F, -1.2785F, 0.0F, 0.0F));

		PartDefinition cube_r380 = head.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(65, 108).addBox(-1.0F, 1.9275F, -0.2387F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(0.0F, -0.9519F, -3.4711F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r381 = head.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(14, 105).addBox(-1.0F, 2.8407F, -0.4736F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.9519F, -3.4711F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r382 = head.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(77, 120).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.018F, 3.5552F, -11.7842F, -0.8945F, 0.0F, 0.0F));

		PartDefinition cube_r383 = head.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(70, 120).addBox(-0.5F, -1.9497F, -0.0168F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.018F, 3.5552F, -11.7842F, -0.9032F, 0.0F, 0.0F));

		PartDefinition cube_r384 = head.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(114, 66).addBox(-0.5F, -1.9948F, -0.026F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.018F, 2.3802F, -10.2592F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r385 = head.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(44, 120).addBox(-0.5F, -2.8774F, -0.1434F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.018F, 2.3802F, -10.2592F, -1.0167F, 0.0F, 0.0F));

		PartDefinition cube_r386 = head.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(134, 62).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 4.3457F, -12.3914F, -0.6763F, 0.0F, 0.0F));

		PartDefinition cube_r387 = head.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(134, 59).addBox(-0.505F, -1.0173F, 0.0007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.005F, 5.2286F, -12.8967F, -0.5192F, 0.0F, 0.0F));

		PartDefinition cube_r388 = head.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(134, 47).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.005F, 6.2036F, -13.0467F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r389 = head.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(120, 26).addBox(-0.5F, -0.7357F, -2.1414F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.647F, -3.3176F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r390 = head.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(120, 22).addBox(-0.5F, -0.7287F, -0.924F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.647F, -3.3176F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r391 = head.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(14, 120).addBox(-0.5F, 0.1869F, -0.655F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.647F, -3.3176F, 1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r392 = head.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(104, 100).addBox(-0.5F, -0.7F, -4.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 5.7089F, -7.9903F, 0.2523F, 0.0F, 0.0F));

		PartDefinition cube_r393 = head.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(72, 79).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 6.3662F, -9.3175F, 0.4268F, 0.0F, 0.0F));

		PartDefinition cube_r394 = head.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(38, 49).addBox(-1.5F, -0.7F, -3.2F, 3.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.5752F, -2.5081F, 0.2436F, 0.0F, 0.0F));

		PartDefinition cube_r395 = head.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(26, 134).addBox(-0.5F, 0.4505F, 0.2129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.647F, -3.3176F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r396 = head.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(96, 73).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.3061F, -1.2927F, 0.1594F, 0.0F, 0.0F));

		PartDefinition cube_r397 = head.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(91, 55).addBox(-1.5F, -1.5F, -0.9F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1979F, -0.5222F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r398 = head.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(101, 14).addBox(-0.5F, -1.025F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.998F, -0.3737F, 1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r399 = head.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(101, 10).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0075F, -0.3968F, 0.9512F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-1.099F, 0.6098F, -5.7129F));

		PartDefinition cube_r400 = leftFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(124, 117).addBox(0.825F, -2.075F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(124, 113).addBox(0.825F, -2.075F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.5154F, -2.5463F, 4.4125F, 2.8491F, 1.1384F, 0.0631F));

		PartDefinition cube_r401 = leftFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(75, 0).addBox(-1.7109F, -0.7839F, -6.3858F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.2084F, 0.0788F, 0.0537F));

		PartDefinition cube_r402 = leftFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(134, 25).addBox(-0.5378F, -1.9435F, -4.1966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.8F, 3.2012F, -1.7391F, 1.042F, 0.0568F, 0.1415F));

		PartDefinition cube_r403 = leftFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(134, 22).addBox(-0.5378F, -3.3729F, 0.6567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.8F, 1.8012F, -3.1391F, 2.5255F, 0.0568F, 0.1415F));

		PartDefinition cube_r404 = leftFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(134, 3).addBox(-0.5378F, 0.2178F, 1.6427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(1.8F, 1.8012F, -3.1391F, -2.3614F, 0.0568F, 0.1415F));

		PartDefinition cube_r405 = leftFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(133, 133).addBox(-0.5378F, 0.7674F, -1.0657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.8F, 1.8012F, -3.1391F, -0.8779F, 0.0568F, 0.1415F));

		PartDefinition cube_r406 = leftFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(133, 130).addBox(-0.5378F, -0.9926F, -0.8822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(1.8F, 1.8012F, -3.1391F, 0.6056F, 0.0568F, 0.1415F));

		PartDefinition cube_r407 = leftFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(114, 40).addBox(-0.4975F, -1.8903F, -1.0839F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.8F, 1.8012F, -1.7391F, 0.691F, 0.0288F, 0.1496F));

		PartDefinition cube_r408 = leftFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(121, 14).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.1929F, -0.7163F, -1.5856F, 2.124F, 0.0493F, 0.1357F));

		PartDefinition cube_r409 = leftFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(20, 128).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.9143F, 1.4673F, -1.1928F, 0.6405F, 0.0493F, 0.1357F));

		PartDefinition cube_r410 = leftFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(0, 129).addBox(-0.5F, 0.0F, -0.975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(2.3584F, -1.4628F, -0.6936F, 0.8759F, 0.0469F, 0.1369F));

		PartDefinition cube_r411 = leftFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(119, 109).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.4672F, -1.9553F, 0.1698F, 2.0977F, 0.0469F, 0.1369F));

		PartDefinition cube_r412 = leftFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(129, 4).addBox(-0.5F, -2.0F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.4617F, -1.9484F, 0.203F, -3.0336F, 0.0469F, 0.1369F));

		PartDefinition cube_r413 = leftFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(128, 18).addBox(-0.5F, -2.025F, -1.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.5196F, -2.0469F, 1.1385F, 2.2024F, 0.0469F, 0.1369F));

		PartDefinition cube_r414 = leftFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(119, 105).addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1817F, 2.0686F, 6.7772F, -0.4049F, -0.0349F, -0.0175F));

		PartDefinition cube_r415 = leftFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(87, 133).addBox(-0.5F, -0.15F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.2744F, 5.7591F, -7.3193F, -0.0416F, 0.1049F, 0.0336F));

		PartDefinition cube_r416 = leftFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(119, 85).addBox(-0.9093F, 0.0083F, -9.4037F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.7689F, 4.2773F, 2.4888F, 0.1504F, 0.1049F, 0.0336F));

		PartDefinition cube_r417 = leftFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(51, 97).addBox(-0.5F, -3.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.6729F, 6.0486F, -3.683F, -1.0932F, 0.1049F, 0.0336F));

		PartDefinition cube_r418 = leftFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(124, 66).addBox(-0.5F, -1.4F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8985F, 3.9692F, -2.2047F, 0.2769F, 0.1049F, 0.0336F));

		PartDefinition cube_r419 = leftFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(129, 117).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.2787F, 5.6184F, -7.3137F, 1.4166F, 0.0956F, 0.0547F));

		PartDefinition cube_r420 = leftFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(129, 113).addBox(-0.5F, -0.342F, 0.9397F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.2787F, 5.6184F, -7.3137F, 1.0675F, 0.0956F, 0.0547F));

		PartDefinition cube_r421 = leftFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(119, 81).addBox(-0.9093F, -3.6576F, -1.5231F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.3336F, 0.1049F, 0.0336F));

		PartDefinition cube_r422 = leftFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(20, 82).addBox(-0.5F, -1.7F, -1.5F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.0111F, 2.3028F, -1.668F, 0.7263F, 0.1049F, 0.0336F));

		PartDefinition cube_r423 = leftFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(81, 68).addBox(-0.9093F, -3.6296F, -7.0043F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.5954F, 0.1049F, 0.0336F));

		PartDefinition cube_r424 = leftFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(128, 14).addBox(-0.8593F, -0.7719F, -9.4097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7939F, 4.7773F, 1.8888F, 0.2027F, 0.1049F, 0.0336F));

		PartDefinition cube_r425 = leftFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(128, 0).addBox(-0.8593F, -1.3943F, -8.4303F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7939F, 4.7773F, 1.8888F, 0.2551F, 0.1049F, 0.0336F));

		PartDefinition cube_r426 = leftFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(127, 127).addBox(-0.9093F, -1.1101F, -7.4485F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7939F, 4.7773F, 1.8888F, 0.3075F, 0.1049F, 0.0336F));

		PartDefinition cube_r427 = leftFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(122, 127).addBox(-0.9093F, -1.809F, -6.4695F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7939F, 4.7773F, 1.8888F, 0.3947F, 0.1049F, 0.0336F));

		PartDefinition cube_r428 = leftFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(117, 127).addBox(-0.9093F, -1.9673F, -5.4549F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7939F, 4.7773F, 1.8888F, 0.4558F, 0.1049F, 0.0336F));

		PartDefinition cube_r429 = leftFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(112, 127).addBox(-0.9093F, -2.5369F, -4.4138F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7939F, 4.7773F, 1.8888F, 0.5256F, 0.1049F, 0.0336F));

		PartDefinition cube_r430 = leftFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(102, 127).addBox(-0.9093F, -2.8323F, -3.3986F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(133, 84).addBox(-0.9093F, -1.9573F, -2.3986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7939F, 4.7773F, 1.8888F, 0.5693F, 0.1049F, 0.0336F));

		PartDefinition cube_r431 = leftFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(77, 95).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8956F, 5.132F, -1.8615F, 0.4558F, 0.1049F, 0.0336F));

		PartDefinition cube_r432 = leftFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(53, 104).addBox(-0.9093F, -2.8358F, -1.9104F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.1242F, 0.1049F, 0.0336F));

		PartDefinition cube_r433 = leftFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(124, 61).addBox(-0.8948F, -3.6624F, -0.0327F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.2531F, -0.0349F, 0.0F));

		PartDefinition cube_r434 = leftFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(69, 100).addBox(-0.5F, -1.65F, -0.825F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3356F, 0.6343F, 1.7943F, 0.0524F, 0.0349F, -0.0002F));

		PartDefinition cube_r435 = leftFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(82, 133).addBox(-0.9399F, -5.0508F, 0.7245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.8439F, 3.1273F, 3.0888F, -0.5236F, -0.0349F, -0.0175F));

		PartDefinition cube_r436 = leftFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(127, 101).addBox(-0.1031F, -1.887F, -0.1293F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(2.4543F, -2.3543F, 3.0502F, -1.7927F, -0.0556F, 0.3716F));

		PartDefinition cube_r437 = leftFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(107, 128).addBox(-0.9586F, -0.1407F, -0.1203F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(3.1543F, -1.7793F, 2.4002F, -1.4901F, 0.0962F, 0.3591F));

		PartDefinition cube_r438 = leftFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(127, 97).addBox(-0.8586F, -0.1407F, -0.1203F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(3.1543F, -2.0793F, 3.1002F, -1.2047F, -0.0136F, 0.371F));

		PartDefinition cube_r439 = leftFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(133, 81).addBox(-0.129F, -0.887F, -0.1364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(2.4543F, -2.3543F, 3.0502F, -1.7719F, 0.1094F, 1.1048F));

		PartDefinition cube_r440 = leftFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(77, 133).addBox(-0.6754F, -0.1407F, 0.3854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(3.1543F, -2.0793F, 3.1002F, -1.3066F, -0.2569F, 1.0897F));

		PartDefinition cube_r441 = leftFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(37, 119).addBox(-0.5F, -0.05F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3442F, -1.5322F, 2.4638F, -0.0087F, -0.0175F, -0.0176F));

		PartDefinition cube_r442 = leftFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(37, 114).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.2526F, -1.9114F, 4.8971F, 0.1658F, -0.0349F, -0.0175F));

		PartDefinition cube_r443 = leftFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(30, 114).addBox(-0.5F, -1.225F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.2838F, -0.5246F, 4.6952F, -0.672F, -0.0349F, -0.0175F));

		PartDefinition cube_r444 = leftFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(42, 124).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.2612F, 0.7618F, 5.986F, 0.5672F, -0.0349F, -0.0175F));

		PartDefinition cube_r445 = leftFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(121, 40).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.3019F, 3.0389F, 5.9583F, -1.1781F, -0.0349F, -0.0175F));

		PartDefinition cube_r446 = leftFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(123, 35).addBox(-0.5F, -2.825F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3365F, 2.9953F, 4.9447F, 0.1309F, -0.0349F, -0.0175F));

		PartDefinition cube_r447 = leftFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(133, 72).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3104F, 0.7627F, 5.879F, -1.2785F, -0.0349F, -0.0175F));

		PartDefinition cube_r448 = leftFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(72, 133).addBox(-0.5F, -0.875F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.376F, 2.3686F, 4.8008F, 0.0305F, -0.0349F, -0.0175F));

		PartDefinition cube_r449 = leftFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(67, 133).addBox(-0.5F, -1.0F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3931F, 1.7944F, 4.0268F, -0.8072F, -0.0349F, -0.0175F));

		PartDefinition cube_r450 = leftFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(0, 136).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3519F, 0.7475F, 5.1823F, 2.3344F, -0.0349F, -0.0175F));

		PartDefinition cube_r451 = leftFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(106, 135).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.3319F, -0.1833F, 5.2873F, 1.5926F, -0.0349F, -0.0175F));

		PartDefinition cube_r452 = leftFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(135, 78).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.33F, -1.0987F, 4.8848F, 0.4145F, -0.0349F, -0.0175F));

		PartDefinition cube_r453 = leftFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(135, 75).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.3665F, -0.5684F, 4.1054F, -0.4145F, -0.0349F, -0.0175F));

		PartDefinition cube_r454 = leftFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(133, 50).addBox(-0.5F, -0.9F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3594F, -0.1189F, 4.5338F, -0.1091F, -0.0349F, -0.0175F));

		PartDefinition cube_r455 = leftFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(30, 119).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.4102F, 1.7856F, 4.0314F, 1.8326F, -0.0349F, -0.0175F));

		PartDefinition cube_r456 = leftFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(119, 10).addBox(-0.5F, -0.725F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3227F, 1.6873F, 5.9888F, 2.5307F, -0.0349F, -0.0175F));

		PartDefinition cube_r457 = leftFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(41, 133).addBox(-0.4996F, -0.6932F, -1.4219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.7025F, 3.9002F, -5.7281F, 1.085F, 0.0951F, 0.0556F));

		PartDefinition cube_r458 = leftFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(133, 39).addBox(-0.4988F, -0.4558F, -0.6666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(1.7025F, 3.9002F, -5.7281F, 0.6956F, 0.0714F, 0.0701F));

		PartDefinition cube_r459 = leftFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(133, 36).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.7176F, 4.1729F, -5.2672F, -0.3516F, 0.0714F, 0.0701F));

		PartDefinition cube_r460 = leftFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(133, 33).addBox(-0.4988F, -0.611F, -1.3653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(1.7025F, 3.9002F, -5.7281F, -2.0096F, 0.0714F, 0.0701F));

		PartDefinition cube_r461 = leftFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(135, 53).addBox(-0.5F, -0.15F, -1.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(33, 133).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.7658F, 3.5599F, -5.2687F, -2.3184F, 0.0951F, 0.0556F));

		PartDefinition cube_r462 = leftFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(133, 30).addBox(-0.4996F, -0.0925F, -0.3603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.7025F, 3.9002F, -5.7281F, 2.5249F, 0.0951F, 0.0556F));

		PartDefinition cube_r463 = leftFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(133, 19).addBox(-0.4996F, -0.6367F, -0.7712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.7025F, 3.9002F, -5.7281F, 0.9977F, 0.0951F, 0.0556F));

		PartDefinition cube_r464 = leftFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(133, 16).addBox(-0.4983F, 1.7616F, -0.9473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.0854F, 1.7139F, -1.4838F, -0.5128F, 0.1049F, 0.0336F));

		PartDefinition cube_r465 = leftFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(133, 13).addBox(-0.25F, 0.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.7368F, 2.6627F, -4.33F, 0.2202F, 0.1049F, 0.0336F));

		PartDefinition cube_r466 = leftFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(133, 10).addBox(-0.4983F, 1.0848F, -2.0439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.0854F, 1.7139F, -1.4838F, -0.0678F, 0.1049F, 0.0336F));

		PartDefinition cube_r467 = leftFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(5, 133).addBox(-0.4983F, -0.9872F, -2.1122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.0854F, 1.7139F, -1.4838F, 0.8921F, 0.1049F, 0.0336F));

		PartDefinition cube_r468 = leftFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(51, 135).addBox(-0.4983F, 1.2503F, 0.9022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.0854F, 1.7139F, -1.4838F, 1.6863F, 0.1049F, 0.0336F));

		PartDefinition cube_r469 = leftFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(46, 135).addBox(-0.4983F, -1.4237F, 1.1127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.0854F, 1.7139F, -1.4838F, 0.5605F, 0.1049F, 0.0336F));

		PartDefinition cube_r470 = leftFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(133, 0).addBox(-0.4983F, 0.5958F, 1.477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0854F, 1.7139F, -1.4838F, 1.3896F, 0.1049F, 0.0336F));

		PartDefinition cube_r471 = leftFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(97, 127).addBox(-0.4983F, -0.491F, -1.2808F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0854F, 1.7139F, -1.4838F, 1.8259F, 0.1049F, 0.0336F));

		PartDefinition cube_r472 = leftFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(134, 123).addBox(-0.4983F, -2.1634F, -1.4063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0854F, 1.7139F, -1.4838F, -2.8341F, 0.1049F, 0.0336F));

		PartDefinition cube_r473 = leftFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(0, 133).addBox(-0.4983F, -0.7533F, -2.4679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.0854F, 1.7139F, -1.4838F, 2.7509F, 0.1049F, 0.0336F));

		PartDefinition cube_r474 = leftFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(0, 119).addBox(-0.4983F, -2.0888F, -1.0827F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0854F, 1.7139F, -1.4838F, -2.9389F, 0.1049F, 0.0336F));

		PartDefinition cube_r475 = leftFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(118, 45).addBox(-0.4983F, 0.0837F, 0.0811F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.0854F, 1.7139F, -1.4838F, -1.2721F, 0.1049F, 0.0336F));

		PartDefinition cube_r476 = leftFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(23, 118).addBox(-0.4983F, 0.6885F, 0.2361F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0854F, 1.7139F, -1.4838F, -1.4466F, 0.1049F, 0.0336F));

		PartDefinition cube_r477 = leftFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(117, 117).addBox(-0.4983F, 1.2395F, -0.9927F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0854F, 1.7139F, -1.4838F, 1.695F, 0.1049F, 0.0336F));

		PartDefinition cube_r478 = leftFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(117, 113).addBox(-0.4983F, 0.6938F, -0.903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0854F, 1.7139F, -1.4838F, 2.3495F, 0.1049F, 0.0336F));

		PartDefinition cube_r479 = leftFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(114, 15).addBox(-0.4983F, -1.0095F, -1.1739F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0854F, 1.7139F, -1.4838F, 0.9096F, 0.1049F, 0.0336F));

		PartDefinition cube_r480 = leftFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(132, 127).addBox(-0.362F, -0.2708F, 0.3708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(106, 132).addBox(-0.587F, -0.2708F, 0.3708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.6128F, 0.4982F, 2.1231F, 1.7453F, 0.0524F, 0.0349F));

		PartDefinition cube_r481 = leftFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(132, 100).addBox(-0.6122F, -0.6537F, -0.2892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(2.6128F, 0.4982F, 2.1231F, 1.4573F, 0.0524F, 0.0349F));

		PartDefinition cube_r482 = leftFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(132, 97).addBox(-0.6122F, -0.893F, 0.572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.6128F, 0.4982F, 2.1231F, 0.8465F, 0.0524F, 0.0349F));

		PartDefinition cube_r483 = leftFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(59, 127).addBox(-0.6285F, -1.1335F, -0.3241F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.6128F, 0.4982F, 2.1231F, -0.1402F, 0.0281F, -0.0093F));

		PartDefinition cube_r484 = leftFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(10, 136).addBox(-0.6285F, -1.6461F, -0.8669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.6128F, 0.4982F, 2.1231F, -3.0986F, 0.0281F, -0.0093F));

		PartDefinition cube_r485 = leftFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(132, 56).addBox(-0.6285F, -0.393F, -1.0421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.6128F, 0.4982F, 2.1231F, 1.9192F, 0.0281F, -0.0093F));

		PartDefinition cube_r486 = leftFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(97, 117).addBox(-0.6285F, -0.3259F, -2.2825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.6128F, 0.4982F, 2.1231F, 1.7447F, 0.0281F, -0.0093F));

		PartDefinition cube_r487 = leftFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(136, 6).addBox(-0.6285F, -0.6655F, -0.3479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(2.6128F, 0.4982F, 2.1231F, 3.0886F, 0.0281F, -0.0093F));

		PartDefinition cube_r488 = leftFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(117, 61).addBox(-0.6285F, -0.8509F, -2.1467F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.6128F, 0.4982F, 2.1231F, 1.9978F, 0.0281F, -0.0093F));

		PartDefinition cube_r489 = leftFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(50, 132).addBox(-0.6122F, -0.8624F, -1.3761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.6128F, 0.4982F, 2.1231F, -0.9425F, 0.0524F, 0.0349F));

		PartDefinition cube_r490 = leftFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(5, 136).addBox(-0.6122F, -1.2786F, -1.6054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(2.6128F, 0.4982F, 2.1231F, -0.5236F, 0.0524F, 0.0349F));

		PartDefinition cube_r491 = leftFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(132, 44).addBox(-0.6122F, -1.5997F, -0.6918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.6128F, 0.4982F, 2.1231F, -0.0436F, 0.0524F, 0.0349F));

		PartDefinition cube_r492 = leftFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(102, 49).addBox(-0.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.3773F, 3.7223F, 4.0937F, -1.0909F, -0.0356F, -0.0159F));

		PartDefinition cube_r493 = leftFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(121, 134).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.4155F, 3.9381F, 3.118F, 0.2181F, -0.0356F, -0.0159F));

		PartDefinition cube_r494 = leftFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(65, 117).addBox(-0.5F, -5.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.4155F, 3.9381F, 3.118F, 0.0872F, -0.0356F, -0.0159F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(1.099F, 0.6098F, -5.7129F));

		PartDefinition cube_r495 = rightFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(124, 117).mirror().addBox(-1.825F, -2.075F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false)
				.texOffs(124, 113).mirror().addBox(-1.825F, -2.075F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.5154F, -2.5463F, 4.4125F, 2.8491F, -1.1384F, -0.0631F));

		PartDefinition cube_r496 = rightFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(75, 0).mirror().addBox(0.7109F, -0.7839F, -6.3858F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.2084F, -0.0788F, -0.0537F));

		PartDefinition cube_r497 = rightFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(134, 25).mirror().addBox(-0.4622F, -1.9435F, -4.1966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 3.2012F, -1.7391F, 1.042F, -0.0568F, -0.1415F));

		PartDefinition cube_r498 = rightFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(134, 22).mirror().addBox(-0.4622F, -3.3729F, 0.6567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 1.8012F, -3.1391F, 2.5255F, -0.0568F, -0.1415F));

		PartDefinition cube_r499 = rightFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(134, 3).mirror().addBox(-0.4622F, 0.2178F, 1.6427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 1.8012F, -3.1391F, -2.3614F, -0.0568F, -0.1415F));

		PartDefinition cube_r500 = rightFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(133, 133).mirror().addBox(-0.4622F, 0.7674F, -1.0657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 1.8012F, -3.1391F, -0.8779F, -0.0568F, -0.1415F));

		PartDefinition cube_r501 = rightFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(133, 130).mirror().addBox(-0.4622F, -0.9926F, -0.8822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 1.8012F, -3.1391F, 0.6056F, -0.0568F, -0.1415F));

		PartDefinition cube_r502 = rightFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(114, 40).mirror().addBox(-0.5025F, -1.8903F, -1.0839F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 1.8012F, -1.7391F, 0.691F, -0.0288F, -0.1496F));

		PartDefinition cube_r503 = rightFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(121, 14).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.1929F, -0.7163F, -1.5856F, 2.124F, -0.0493F, -0.1357F));

		PartDefinition cube_r504 = rightFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(20, 128).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.9143F, 1.4673F, -1.1928F, 0.6405F, -0.0493F, -0.1357F));

		PartDefinition cube_r505 = rightFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(0, 129).mirror().addBox(-0.5F, 0.0F, -0.975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-2.3584F, -1.4628F, -0.6936F, 0.8759F, -0.0469F, -0.1369F));

		PartDefinition cube_r506 = rightFace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(119, 109).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.4672F, -1.9553F, 0.1698F, 2.0977F, -0.0469F, -0.1369F));

		PartDefinition cube_r507 = rightFace.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(129, 4).mirror().addBox(-0.5F, -2.0F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.4617F, -1.9484F, 0.203F, -3.0336F, -0.0469F, -0.1369F));

		PartDefinition cube_r508 = rightFace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(128, 18).mirror().addBox(-0.5F, -2.025F, -1.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-2.5196F, -2.0469F, 1.1385F, 2.2024F, -0.0469F, -0.1369F));

		PartDefinition cube_r509 = rightFace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(119, 105).mirror().addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1817F, 2.0686F, 6.7772F, -0.4049F, 0.0349F, 0.0175F));

		PartDefinition cube_r510 = rightFace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(87, 133).mirror().addBox(-0.5F, -0.15F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2744F, 5.7591F, -7.3193F, -0.0416F, -0.1049F, -0.0336F));

		PartDefinition cube_r511 = rightFace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(119, 85).mirror().addBox(-0.0907F, 0.0083F, -9.4037F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7689F, 4.2773F, 2.4888F, 0.1504F, -0.1049F, -0.0336F));

		PartDefinition cube_r512 = rightFace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(51, 97).mirror().addBox(-0.5F, -3.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6729F, 6.0486F, -3.683F, -1.0932F, -0.1049F, -0.0336F));

		PartDefinition cube_r513 = rightFace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(124, 66).mirror().addBox(-0.5F, -1.4F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8985F, 3.9692F, -2.2047F, 0.2769F, -0.1049F, -0.0336F));

		PartDefinition cube_r514 = rightFace.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(129, 117).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.2787F, 5.6184F, -7.3137F, 1.4166F, -0.0956F, -0.0547F));

		PartDefinition cube_r515 = rightFace.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(129, 113).mirror().addBox(-0.5F, -0.342F, 0.9397F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2787F, 5.6184F, -7.3137F, 1.0675F, -0.0956F, -0.0547F));

		PartDefinition cube_r516 = rightFace.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(119, 81).mirror().addBox(-0.0907F, -3.6576F, -1.5231F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.3336F, -0.1049F, -0.0336F));

		PartDefinition cube_r517 = rightFace.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(20, 82).mirror().addBox(-0.5F, -1.7F, -1.5F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.0111F, 2.3028F, -1.668F, 0.7263F, -0.1049F, -0.0336F));

		PartDefinition cube_r518 = rightFace.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(81, 68).mirror().addBox(-0.0907F, -3.6296F, -7.0043F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.5954F, -0.1049F, -0.0336F));

		PartDefinition cube_r519 = rightFace.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(128, 14).mirror().addBox(-0.1407F, -0.7719F, -9.4097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7939F, 4.7773F, 1.8888F, 0.2027F, -0.1049F, -0.0336F));

		PartDefinition cube_r520 = rightFace.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(128, 0).mirror().addBox(-0.1407F, -1.3943F, -8.4303F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7939F, 4.7773F, 1.8888F, 0.2551F, -0.1049F, -0.0336F));

		PartDefinition cube_r521 = rightFace.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(127, 127).mirror().addBox(-0.0907F, -1.1101F, -7.4485F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7939F, 4.7773F, 1.8888F, 0.3075F, -0.1049F, -0.0336F));

		PartDefinition cube_r522 = rightFace.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(122, 127).mirror().addBox(-0.0907F, -1.809F, -6.4695F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7939F, 4.7773F, 1.8888F, 0.3947F, -0.1049F, -0.0336F));

		PartDefinition cube_r523 = rightFace.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(117, 127).mirror().addBox(-0.0907F, -1.9673F, -5.4549F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7939F, 4.7773F, 1.8888F, 0.4558F, -0.1049F, -0.0336F));

		PartDefinition cube_r524 = rightFace.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(112, 127).mirror().addBox(-0.0907F, -2.5369F, -4.4138F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7939F, 4.7773F, 1.8888F, 0.5256F, -0.1049F, -0.0336F));

		PartDefinition cube_r525 = rightFace.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(102, 127).mirror().addBox(-0.0907F, -2.8323F, -3.3986F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(133, 84).mirror().addBox(-0.0907F, -1.9573F, -2.3986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7939F, 4.7773F, 1.8888F, 0.5693F, -0.1049F, -0.0336F));

		PartDefinition cube_r526 = rightFace.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(77, 95).mirror().addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8956F, 5.132F, -1.8615F, 0.4558F, -0.1049F, -0.0336F));

		PartDefinition cube_r527 = rightFace.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(53, 104).mirror().addBox(-0.0907F, -2.8358F, -1.9104F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.1242F, -0.1049F, -0.0336F));

		PartDefinition cube_r528 = rightFace.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(124, 61).mirror().addBox(-0.1052F, -3.6624F, -0.0327F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.2531F, 0.0349F, 0.0F));

		PartDefinition cube_r529 = rightFace.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(69, 100).mirror().addBox(-0.5F, -1.65F, -0.825F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3356F, 0.6343F, 1.7943F, 0.0524F, -0.0349F, 0.0002F));

		PartDefinition cube_r530 = rightFace.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(82, 133).mirror().addBox(-0.0601F, -5.0508F, 0.7245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.8439F, 3.1273F, 3.0888F, -0.5236F, 0.0349F, 0.0175F));

		PartDefinition cube_r531 = rightFace.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(127, 101).mirror().addBox(-0.8969F, -1.887F, -0.1293F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-2.4543F, -2.3543F, 3.0502F, -1.7927F, 0.0556F, -0.3716F));

		PartDefinition cube_r532 = rightFace.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(107, 128).mirror().addBox(-0.0414F, -0.1407F, -0.1203F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-3.1543F, -1.7793F, 2.4002F, -1.4901F, -0.0962F, -0.3591F));

		PartDefinition cube_r533 = rightFace.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(127, 97).mirror().addBox(-0.1414F, -0.1407F, -0.1203F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-3.1543F, -2.0793F, 3.1002F, -1.2047F, 0.0136F, -0.371F));

		PartDefinition cube_r534 = rightFace.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(133, 81).mirror().addBox(-0.871F, -0.887F, -0.1364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-2.4543F, -2.3543F, 3.0502F, -1.7719F, -0.1094F, -1.1048F));

		PartDefinition cube_r535 = rightFace.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(77, 133).mirror().addBox(-0.3246F, -0.1407F, 0.3854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-3.1543F, -2.0793F, 3.1002F, -1.3066F, 0.2569F, -1.0897F));

		PartDefinition cube_r536 = rightFace.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(37, 119).mirror().addBox(-0.5F, -0.05F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3442F, -1.5322F, 2.4638F, -0.0087F, 0.0175F, 0.0176F));

		PartDefinition cube_r537 = rightFace.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(37, 114).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2526F, -1.9114F, 4.8971F, 0.1658F, 0.0349F, 0.0175F));

		PartDefinition cube_r538 = rightFace.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(30, 114).mirror().addBox(-0.5F, -1.225F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2838F, -0.5246F, 4.6952F, -0.672F, 0.0349F, 0.0175F));

		PartDefinition cube_r539 = rightFace.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(42, 124).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2612F, 0.7618F, 5.986F, 0.5672F, 0.0349F, 0.0175F));

		PartDefinition cube_r540 = rightFace.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(121, 40).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3019F, 3.0389F, 5.9583F, -1.1781F, 0.0349F, 0.0175F));

		PartDefinition cube_r541 = rightFace.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(123, 35).mirror().addBox(-0.5F, -2.825F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3365F, 2.9953F, 4.9447F, 0.1309F, 0.0349F, 0.0175F));

		PartDefinition cube_r542 = rightFace.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(133, 72).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3104F, 0.7627F, 5.879F, -1.2785F, 0.0349F, 0.0175F));

		PartDefinition cube_r543 = rightFace.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(72, 133).mirror().addBox(-0.5F, -0.875F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.376F, 2.3686F, 4.8008F, 0.0305F, 0.0349F, 0.0175F));

		PartDefinition cube_r544 = rightFace.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(67, 133).mirror().addBox(-0.5F, -1.0F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3931F, 1.7944F, 4.0268F, -0.8072F, 0.0349F, 0.0175F));

		PartDefinition cube_r545 = rightFace.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(0, 136).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3519F, 0.7475F, 5.1823F, 2.3344F, 0.0349F, 0.0175F));

		PartDefinition cube_r546 = rightFace.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(106, 135).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.3319F, -0.1833F, 5.2873F, 1.5926F, 0.0349F, 0.0175F));

		PartDefinition cube_r547 = rightFace.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(135, 78).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.33F, -1.0987F, 4.8848F, 0.4145F, 0.0349F, 0.0175F));

		PartDefinition cube_r548 = rightFace.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(135, 75).mirror().addBox(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.3665F, -0.5684F, 4.1054F, -0.4145F, 0.0349F, 0.0175F));

		PartDefinition cube_r549 = rightFace.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(133, 50).mirror().addBox(-0.5F, -0.9F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3594F, -0.1189F, 4.5338F, -0.1091F, 0.0349F, 0.0175F));

		PartDefinition cube_r550 = rightFace.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(30, 119).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.4102F, 1.7856F, 4.0314F, 1.8326F, 0.0349F, 0.0175F));

		PartDefinition cube_r551 = rightFace.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(119, 10).mirror().addBox(-0.5F, -0.725F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3227F, 1.6873F, 5.9888F, 2.5307F, 0.0349F, 0.0175F));

		PartDefinition cube_r552 = rightFace.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(41, 133).mirror().addBox(-0.5004F, -0.6932F, -1.4219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.7025F, 3.9002F, -5.7281F, 1.085F, -0.0951F, -0.0556F));

		PartDefinition cube_r553 = rightFace.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(133, 39).mirror().addBox(-0.5012F, -0.4558F, -0.6666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-1.7025F, 3.9002F, -5.7281F, 0.6956F, -0.0714F, -0.0701F));

		PartDefinition cube_r554 = rightFace.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(133, 36).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.7176F, 4.1729F, -5.2672F, -0.3516F, -0.0714F, -0.0701F));

		PartDefinition cube_r555 = rightFace.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(133, 33).mirror().addBox(-0.5012F, -0.611F, -1.3653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-1.7025F, 3.9002F, -5.7281F, -2.0096F, -0.0714F, -0.0701F));

		PartDefinition cube_r556 = rightFace.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(135, 53).mirror().addBox(-0.5F, -0.15F, -1.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(33, 133).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.7658F, 3.5599F, -5.2687F, -2.3184F, -0.0951F, -0.0556F));

		PartDefinition cube_r557 = rightFace.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(133, 30).mirror().addBox(-0.5004F, -0.0925F, -0.3603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.7025F, 3.9002F, -5.7281F, 2.5249F, -0.0951F, -0.0556F));

		PartDefinition cube_r558 = rightFace.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(133, 19).mirror().addBox(-0.5004F, -0.6367F, -0.7712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.7025F, 3.9002F, -5.7281F, 0.9977F, -0.0951F, -0.0556F));

		PartDefinition cube_r559 = rightFace.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(133, 16).mirror().addBox(-0.5017F, 1.7616F, -0.9473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.0854F, 1.7139F, -1.4838F, -0.5128F, -0.1049F, -0.0336F));

		PartDefinition cube_r560 = rightFace.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(133, 13).mirror().addBox(-0.75F, 0.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.7368F, 2.6627F, -4.33F, 0.2202F, -0.1049F, -0.0336F));

		PartDefinition cube_r561 = rightFace.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(133, 10).mirror().addBox(-0.5017F, 1.0848F, -2.0439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0854F, 1.7139F, -1.4838F, -0.0678F, -0.1049F, -0.0336F));

		PartDefinition cube_r562 = rightFace.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(5, 133).mirror().addBox(-0.5017F, -0.9872F, -2.1122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.0854F, 1.7139F, -1.4838F, 0.8921F, -0.1049F, -0.0336F));

		PartDefinition cube_r563 = rightFace.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(51, 135).mirror().addBox(-0.5017F, 1.2503F, 0.9022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0854F, 1.7139F, -1.4838F, 1.6863F, -0.1049F, -0.0336F));

		PartDefinition cube_r564 = rightFace.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(46, 135).mirror().addBox(-0.5017F, -1.4237F, 1.1127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.0854F, 1.7139F, -1.4838F, 0.5605F, -0.1049F, -0.0336F));

		PartDefinition cube_r565 = rightFace.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(133, 0).mirror().addBox(-0.5017F, 0.5958F, 1.477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0854F, 1.7139F, -1.4838F, 1.3896F, -0.1049F, -0.0336F));

		PartDefinition cube_r566 = rightFace.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(97, 127).mirror().addBox(-0.5017F, -0.491F, -1.2808F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0854F, 1.7139F, -1.4838F, 1.8259F, -0.1049F, -0.0336F));

		PartDefinition cube_r567 = rightFace.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(134, 123).mirror().addBox(-0.5017F, -2.1634F, -1.4063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0854F, 1.7139F, -1.4838F, -2.8341F, -0.1049F, -0.0336F));

		PartDefinition cube_r568 = rightFace.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(0, 133).mirror().addBox(-0.5017F, -0.7533F, -2.4679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.0854F, 1.7139F, -1.4838F, 2.7509F, -0.1049F, -0.0336F));

		PartDefinition cube_r569 = rightFace.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(0, 119).mirror().addBox(-0.5017F, -2.0888F, -1.0827F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0854F, 1.7139F, -1.4838F, -2.9389F, -0.1049F, -0.0336F));

		PartDefinition cube_r570 = rightFace.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(118, 45).mirror().addBox(-0.5017F, 0.0837F, 0.0811F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.0854F, 1.7139F, -1.4838F, -1.2721F, -0.1049F, -0.0336F));

		PartDefinition cube_r571 = rightFace.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(23, 118).mirror().addBox(-0.5017F, 0.6885F, 0.2361F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0854F, 1.7139F, -1.4838F, -1.4466F, -0.1049F, -0.0336F));

		PartDefinition cube_r572 = rightFace.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(117, 117).mirror().addBox(-0.5017F, 1.2395F, -0.9927F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0854F, 1.7139F, -1.4838F, 1.695F, -0.1049F, -0.0336F));

		PartDefinition cube_r573 = rightFace.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(117, 113).mirror().addBox(-0.5017F, 0.6938F, -0.903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0854F, 1.7139F, -1.4838F, 2.3495F, -0.1049F, -0.0336F));

		PartDefinition cube_r574 = rightFace.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(114, 15).mirror().addBox(-0.5017F, -1.0095F, -1.1739F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0854F, 1.7139F, -1.4838F, 0.9096F, -0.1049F, -0.0336F));

		PartDefinition cube_r575 = rightFace.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(132, 127).mirror().addBox(-0.638F, -0.2708F, 0.3708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(106, 132).mirror().addBox(-0.413F, -0.2708F, 0.3708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.6128F, 0.4982F, 2.1231F, 1.7453F, -0.0524F, -0.0349F));

		PartDefinition cube_r576 = rightFace.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(132, 100).mirror().addBox(-0.3879F, -0.6537F, -0.2892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-2.6128F, 0.4982F, 2.1231F, 1.4573F, -0.0524F, -0.0349F));

		PartDefinition cube_r577 = rightFace.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(132, 97).mirror().addBox(-0.3879F, -0.893F, 0.572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.6128F, 0.4982F, 2.1231F, 0.8465F, -0.0524F, -0.0349F));

		PartDefinition cube_r578 = rightFace.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(59, 127).mirror().addBox(-0.3715F, -1.1335F, -0.3241F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.6128F, 0.4982F, 2.1231F, -0.1402F, -0.0281F, 0.0093F));

		PartDefinition cube_r579 = rightFace.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(10, 136).mirror().addBox(-0.3715F, -1.6461F, -0.8669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.6128F, 0.4982F, 2.1231F, -3.0986F, -0.0281F, 0.0093F));

		PartDefinition cube_r580 = rightFace.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(132, 56).mirror().addBox(-0.3715F, -0.393F, -1.0421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.6128F, 0.4982F, 2.1231F, 1.9192F, -0.0281F, 0.0093F));

		PartDefinition cube_r581 = rightFace.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(97, 117).mirror().addBox(-0.3715F, -0.3259F, -2.2825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.6128F, 0.4982F, 2.1231F, 1.7447F, -0.0281F, 0.0093F));

		PartDefinition cube_r582 = rightFace.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(136, 6).mirror().addBox(-0.3715F, -0.6655F, -0.3479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-2.6128F, 0.4982F, 2.1231F, 3.0886F, -0.0281F, 0.0093F));

		PartDefinition cube_r583 = rightFace.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(117, 61).mirror().addBox(-0.3715F, -0.8509F, -2.1467F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.6128F, 0.4982F, 2.1231F, 1.9978F, -0.0281F, 0.0093F));

		PartDefinition cube_r584 = rightFace.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(50, 132).mirror().addBox(-0.3879F, -0.8624F, -1.3761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.6128F, 0.4982F, 2.1231F, -0.9425F, -0.0524F, -0.0349F));

		PartDefinition cube_r585 = rightFace.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(5, 136).mirror().addBox(-0.3879F, -1.2786F, -1.6054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-2.6128F, 0.4982F, 2.1231F, -0.5236F, -0.0524F, -0.0349F));

		PartDefinition cube_r586 = rightFace.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(132, 44).mirror().addBox(-0.3879F, -1.5997F, -0.6918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.6128F, 0.4982F, 2.1231F, -0.0436F, -0.0524F, -0.0349F));

		PartDefinition cube_r587 = rightFace.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(102, 49).mirror().addBox(-0.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3773F, 3.7223F, 4.0937F, -1.0909F, 0.0356F, 0.0159F));

		PartDefinition cube_r588 = rightFace.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(121, 134).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.4155F, 3.9381F, 3.118F, 0.2181F, 0.0356F, 0.0159F));

		PartDefinition cube_r589 = rightFace.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(65, 117).mirror().addBox(-0.5F, -5.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.4155F, 3.9381F, 3.118F, 0.0872F, 0.0356F, 0.0159F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0285F, 1.9681F, 1.2348F, 0.0F, 0.0F));

		PartDefinition cube_r590 = jaw.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(84, 120).mirror().addBox(0.2F, -0.5903F, -2.2933F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(84, 120).addBox(2.2407F, -0.5903F, -2.2933F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.7204F, 0.463F, -0.8581F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r591 = jaw.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(114, 71).mirror().addBox(-0.5F, -0.95F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(114, 71).addBox(1.5407F, -0.95F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0204F, 0.3689F, -5.0832F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r592 = jaw.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(114, 76).mirror().addBox(0.2F, -0.0187F, -0.3661F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(114, 76).addBox(2.2407F, -0.0187F, -0.3661F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7204F, -0.5615F, -4.5F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r593 = jaw.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(134, 65).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(134, 65).addBox(1.5907F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.0454F, 2.2798F, -5.083F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r594 = jaw.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(120, 89).mirror().addBox(0.175F, -0.5553F, -5.4225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(120, 89).addBox(2.2657F, -0.5553F, -5.4225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.7204F, 0.763F, 0.1419F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r595 = jaw.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(16, 115).mirror().addBox(-0.5F, -0.525F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(16, 115).addBox(1.5407F, -0.525F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0204F, -0.0147F, -7.3084F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r596 = jaw.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(134, 87).mirror().addBox(-1.0748F, -0.0433F, -0.741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4204F, -0.437F, -8.3581F, 0.1272F, -0.1569F, -0.0083F));

		PartDefinition cube_r597 = jaw.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(134, 90).mirror().addBox(-0.8216F, 0.3529F, -0.7319F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4204F, -0.437F, -10.0581F, 0.2074F, -0.1306F, -0.0352F));

		PartDefinition cube_r598 = jaw.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(134, 93).mirror().addBox(-0.8161F, -0.3495F, -0.686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4204F, -0.437F, -10.4581F, 0.2074F, -0.1306F, -0.0352F));

		PartDefinition cube_r599 = jaw.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(25, 128).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5705F, 0.2537F, -11.558F, 0.0765F, -0.1306F, -0.0352F));

		PartDefinition cube_r600 = jaw.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(128, 30).mirror().addBox(-0.5855F, -0.8218F, -1.0044F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4204F, 0.013F, -12.1081F, 0.1198F, -0.1318F, -0.0306F));

		PartDefinition cube_r601 = jaw.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(128, 34).mirror().addBox(-0.349F, -0.8068F, -0.2306F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4204F, 0.013F, -13.9081F, 0.0675F, -0.1318F, -0.0306F));

		PartDefinition cube_r602 = jaw.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(128, 38).mirror().addBox(-0.336F, -1.0009F, -1.1535F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4204F, 0.313F, -13.9081F, -0.1002F, -0.0477F, -0.005F));

		PartDefinition cube_r603 = jaw.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(120, 93).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5258F, 0.6291F, -11.4626F, 0.0936F, -0.1318F, -0.0306F));

		PartDefinition cube_r604 = jaw.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(120, 97).mirror().addBox(-0.3229F, -0.1198F, -0.5377F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4204F, 0.313F, -13.5081F, 0.0007F, -0.0486F, 0.0056F));

		PartDefinition cube_r605 = jaw.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(96, 134).mirror().addBox(-0.3229F, -0.1053F, -2.8085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4954F, 0.438F, -11.6581F, -0.0604F, -0.0486F, 0.0056F));

		PartDefinition cube_r606 = jaw.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(101, 134).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8646F, -0.3794F, -9.1324F, 0.3208F, -0.1306F, -0.0352F));

		PartDefinition cube_r607 = jaw.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(91, 61).mirror().addBox(0.2F, -0.6656F, -1.9192F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.015F)).mirror(false)
				.texOffs(91, 61).addBox(2.2407F, -0.6656F, -1.9192F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-1.7204F, 0.463F, -0.8581F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r608 = jaw.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(50, 128).mirror().addBox(-0.0153F, -1.9847F, -0.0153F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)).mirror(false)
				.texOffs(50, 128).addBox(2.0254F, -1.9847F, -0.0153F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(-1.505F, 2.4124F, -3.1458F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r609 = jaw.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(29, 92).mirror().addBox(0.2F, -0.3871F, -1.9811F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.0153F)).mirror(false)
				.texOffs(29, 92).addBox(2.2407F, -0.3871F, -1.9811F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(-1.7204F, 0.463F, -0.8581F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r610 = jaw.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(128, 50).mirror().addBox(-0.018F, -1.982F, -0.018F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false)
				.texOffs(128, 50).addBox(2.0281F, -1.982F, -0.018F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(-1.505F, 2.6128F, -4.0888F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r611 = jaw.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(128, 73).mirror().addBox(-0.5F, -1.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)).mirror(false)
				.texOffs(128, 73).addBox(1.5407F, -1.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(-1.0204F, 1.3795F, -7.0983F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r612 = jaw.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(111, 134).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false)
				.texOffs(121, 51).mirror().addBox(-0.5F, -0.4F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)).mirror(false)
				.texOffs(121, 51).addBox(1.5407F, -0.4F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F))
				.texOffs(111, 134).addBox(1.5407F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-1.0204F, 0.5877F, -8.2809F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r613 = jaw.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(134, 111).mirror().addBox(-1.0748F, 0.9645F, -0.5154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-0.4204F, -0.437F, -8.3581F, -0.1564F, -0.1569F, -0.0083F));

		PartDefinition cube_r614 = jaw.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(120, 101).mirror().addBox(-0.5F, -0.45F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-0.7096F, 0.861F, -9.979F, -0.0064F, -0.1306F, -0.0352F));

		PartDefinition cube_r615 = jaw.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(121, 0).mirror().addBox(-0.5F, -0.35F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-0.4426F, 0.8385F, -12.042F, 0.0893F, -0.1318F, -0.0306F));

		PartDefinition cube_r616 = jaw.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(7, 121).mirror().addBox(-0.5F, -0.525F, 0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-0.2006F, 1.0874F, -14.4705F, 0.0094F, -0.0486F, 0.0056F));

		PartDefinition cube_r617 = jaw.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(134, 114).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-0.1849F, 1.4652F, -14.5152F, -0.1127F, -0.0486F, 0.0056F));

		PartDefinition cube_r618 = jaw.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(116, 134).mirror().addBox(-0.5F, -0.6F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3408F, 0.9876F, -14.3399F, 0.7076F, -0.0486F, 0.0056F));

		PartDefinition cube_r619 = jaw.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(134, 117).mirror().addBox(-0.3229F, -1.2882F, -3.4058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(-0.6453F, 0.438F, -11.6581F, 0.3149F, -0.0486F, 0.0056F));

		PartDefinition cube_r620 = jaw.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(72, 115).mirror().addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.2278F, -5.1043F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r621 = jaw.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(110, 61).mirror().addBox(-0.6193F, -0.0979F, 2.7933F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.2278F, -5.1043F, 0.2923F, -0.0969F, 0.0654F));

		PartDefinition cube_r622 = jaw.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(5, 129).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)).mirror(false)
				.texOffs(5, 129).addBox(1.5407F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(-1.0204F, 2.124F, -6.9214F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r623 = jaw.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(121, 73).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)).mirror(false)
				.texOffs(121, 73).addBox(1.5407F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(-1.0204F, 2.4573F, -6.0096F, -1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r624 = jaw.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(0, 97).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)).mirror(false)
				.texOffs(0, 97).addBox(1.5407F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(-1.0204F, 2.7139F, -5.0684F, -3.0543F, 0.0F, 0.0F));

		PartDefinition cube_r625 = jaw.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(121, 77).mirror().addBox(-0.0153F, -0.9847F, -1.9903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0157F)).mirror(false)
				.texOffs(121, 77).addBox(2.0254F, -0.9847F, -1.9903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0157F)), PartPose.offsetAndRotation(-1.505F, 2.0551F, -2.2387F, -1.021F, 0.0F, 0.0F));

		PartDefinition cube_r626 = jaw.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(15, 136).mirror().addBox(-0.0153F, -0.0097F, -0.9903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0146F)).mirror(false)
				.texOffs(15, 136).addBox(2.0254F, -0.0097F, -0.9903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0146F)), PartPose.offsetAndRotation(-1.505F, 1.5456F, -1.4073F, -2.3736F, 0.0F, 0.0F));

		PartDefinition cube_r627 = jaw.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(31, 136).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(36, 136).mirror().addBox(-0.5F, -0.3F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.842F, -0.4425F, -9.6788F, 0.0765F, -0.1306F, -0.0352F));

		PartDefinition cube_r628 = jaw.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(110, 61).addBox(0.6193F, -0.0979F, 2.7933F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2278F, -5.1043F, 0.2923F, 0.0969F, -0.0654F));

		PartDefinition cube_r629 = jaw.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(72, 115).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2278F, -5.1043F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r630 = jaw.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(134, 117).addBox(-0.6771F, -1.2882F, -3.4058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(0.6453F, 0.438F, -11.6581F, 0.3149F, 0.0486F, -0.0056F));

		PartDefinition cube_r631 = jaw.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(116, 134).addBox(-0.5F, -0.6F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3408F, 0.9876F, -14.3399F, 0.7076F, 0.0486F, -0.0056F));

		PartDefinition cube_r632 = jaw.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(134, 114).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(0.1849F, 1.4652F, -14.5152F, -0.1127F, 0.0486F, -0.0056F));

		PartDefinition cube_r633 = jaw.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(7, 121).addBox(-0.5F, -0.525F, 0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(0.2006F, 1.0874F, -14.4705F, 0.0094F, 0.0486F, -0.0056F));

		PartDefinition cube_r634 = jaw.addOrReplaceChild("cube_r634", CubeListBuilder.create().texOffs(121, 0).addBox(-0.5F, -0.35F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(0.4426F, 0.8385F, -12.042F, 0.0893F, 0.1318F, 0.0306F));

		PartDefinition cube_r635 = jaw.addOrReplaceChild("cube_r635", CubeListBuilder.create().texOffs(120, 101).addBox(-0.5F, -0.45F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(0.7096F, 0.861F, -9.979F, -0.0064F, 0.1306F, 0.0352F));

		PartDefinition cube_r636 = jaw.addOrReplaceChild("cube_r636", CubeListBuilder.create().texOffs(134, 111).addBox(0.0748F, 0.9645F, -0.5154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(0.4204F, -0.437F, -8.3581F, -0.1564F, 0.1569F, 0.0083F));

		PartDefinition cube_r637 = jaw.addOrReplaceChild("cube_r637", CubeListBuilder.create().texOffs(101, 134).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8646F, -0.3794F, -9.1324F, 0.3208F, 0.1306F, 0.0352F));

		PartDefinition cube_r638 = jaw.addOrReplaceChild("cube_r638", CubeListBuilder.create().texOffs(96, 134).addBox(-0.6771F, -0.1053F, -2.8085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4954F, 0.438F, -11.6581F, -0.0604F, 0.0486F, -0.0056F));

		PartDefinition cube_r639 = jaw.addOrReplaceChild("cube_r639", CubeListBuilder.create().texOffs(120, 97).addBox(-0.6771F, -0.1198F, -0.5377F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4204F, 0.313F, -13.5081F, 0.0007F, 0.0486F, -0.0056F));

		PartDefinition cube_r640 = jaw.addOrReplaceChild("cube_r640", CubeListBuilder.create().texOffs(120, 93).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5258F, 0.6291F, -11.4626F, 0.0936F, 0.1318F, 0.0306F));

		PartDefinition cube_r641 = jaw.addOrReplaceChild("cube_r641", CubeListBuilder.create().texOffs(128, 38).addBox(-0.664F, -1.0009F, -1.1535F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4204F, 0.313F, -13.9081F, -0.1002F, 0.0477F, 0.005F));

		PartDefinition cube_r642 = jaw.addOrReplaceChild("cube_r642", CubeListBuilder.create().texOffs(128, 34).addBox(-0.651F, -0.8068F, -0.2306F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4204F, 0.013F, -13.9081F, 0.0675F, 0.1318F, 0.0306F));

		PartDefinition cube_r643 = jaw.addOrReplaceChild("cube_r643", CubeListBuilder.create().texOffs(128, 30).addBox(-0.4145F, -0.8218F, -1.0044F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4204F, 0.013F, -12.1081F, 0.1198F, 0.1318F, 0.0306F));

		PartDefinition cube_r644 = jaw.addOrReplaceChild("cube_r644", CubeListBuilder.create().texOffs(25, 128).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5705F, 0.2537F, -11.558F, 0.0765F, 0.1306F, 0.0352F));

		PartDefinition cube_r645 = jaw.addOrReplaceChild("cube_r645", CubeListBuilder.create().texOffs(36, 136).addBox(-0.5F, -0.3F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(31, 136).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.842F, -0.4425F, -9.6788F, 0.0765F, 0.1306F, 0.0352F));

		PartDefinition cube_r646 = jaw.addOrReplaceChild("cube_r646", CubeListBuilder.create().texOffs(134, 93).addBox(-0.1839F, -0.3495F, -0.686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4204F, -0.437F, -10.4581F, 0.2074F, 0.1306F, 0.0352F));

		PartDefinition cube_r647 = jaw.addOrReplaceChild("cube_r647", CubeListBuilder.create().texOffs(134, 90).addBox(-0.1784F, 0.3529F, -0.7319F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4204F, -0.437F, -10.0581F, 0.2074F, 0.1306F, 0.0352F));

		PartDefinition cube_r648 = jaw.addOrReplaceChild("cube_r648", CubeListBuilder.create().texOffs(134, 87).addBox(0.0748F, -0.0433F, -0.741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4204F, -0.437F, -8.3581F, 0.1272F, 0.1569F, 0.0083F));

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