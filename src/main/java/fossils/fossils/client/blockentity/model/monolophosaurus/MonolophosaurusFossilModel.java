package fossils.fossils.client.blockentity.model.monolophosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MonolophosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone3;
	private final ModelPart bone5;
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
	private final ModelPart tail6;
	private final ModelPart tail3;
	private final ModelPart tail7;
	private final ModelPart tail9;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail10;
	private final ModelPart tail11;
	private final ModelPart tail12;
	private final ModelPart tail13;
	private final ModelPart tail14;
	private final ModelPart bone;
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
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck;
	private final ModelPart neck6;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public MonolophosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone3 = this.hips.getChild("bone3");
		this.bone5 = this.hips.getChild("bone5");
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
		this.tail6 = this.tail8.getChild("tail6");
		this.tail3 = this.tail6.getChild("tail3");
		this.tail7 = this.tail3.getChild("tail7");
		this.tail9 = this.tail7.getChild("tail9");
		this.tail4 = this.tail9.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail10 = this.tail5.getChild("tail10");
		this.tail11 = this.tail10.getChild("tail11");
		this.tail12 = this.tail11.getChild("tail12");
		this.tail13 = this.tail12.getChild("tail13");
		this.tail14 = this.tail13.getChild("tail14");
		this.bone = this.tail1.getChild("bone");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -33.0876F, 1.1574F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(63, 102).addBox(0.0F, -3.7F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -1.9288F, -2.1361F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(41, 77).addBox(-0.003F, 2.5F, -1.95F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.88F, 1.6382F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(58, 124).addBox(0.0F, -3.6F, -1.7F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 63).addBox(0.0F, -3.5F, -5.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7556F, 7.49F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.9822F, 0.3974F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8948F, 6.3646F, 0.2106F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r5 = bone3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(106, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.5781F, -10.634F, 3.4662F, -0.3092F, -0.0321F, -0.4016F));

		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(69, 26).addBox(-0.5827F, 3.7931F, -7.0175F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(101, 104).addBox(-0.5827F, 0.7931F, -4.5175F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6656F, -10.8353F, 6.0978F, -0.222F, -0.0321F, -0.4016F));

		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(97, 117).addBox(-0.5F, -1.3F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0183F, -7.0295F, 4.6727F, 0.6876F, -0.0327F, -0.4104F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(15, 72).addBox(-0.5F, -1.4F, -3.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.331F, -7.6312F, 6.1011F, 0.1203F, -0.0327F, -0.4104F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(5, 126).addBox(-0.5F, -0.925F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6923F, -8.3079F, 7.3405F, -0.1982F, -0.0391F, -0.4053F));

		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(93, 28).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9626F, -8.8092F, 8.635F, -0.3727F, -0.0391F, -0.4053F));

		PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(37, 121).addBox(-0.5F, -0.5F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3438F, -5.6304F, 3.3149F, -0.1052F, 0.0639F, 0.0248F));

		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(61, 125).addBox(-0.1061F, -0.0681F, -0.9868F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7937F, -0.1413F, 5.3512F, 0.5323F, 0.1146F, -0.0803F));

		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(132, 126).addBox(-0.1061F, -2.7956F, 2.6327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7937F, -0.1413F, 5.3512F, -1.8152F, 0.1146F, -0.0803F));

		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(52, 128).addBox(-0.1061F, -0.0064F, 3.5839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.7937F, -0.1413F, 5.3512F, -1.1607F, 0.1146F, -0.0803F));

		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(122, 128).addBox(-0.1061F, 2.9439F, 1.5387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7937F, -0.1413F, 5.3512F, -0.3753F, 0.1146F, -0.0803F));

		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(66, 125).addBox(-0.1061F, 1.7791F, -0.3199F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7937F, -0.1413F, 5.3512F, 0.1919F, 0.1146F, -0.0803F));

		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(125, 63).addBox(-0.1061F, 1.9238F, -0.8149F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7937F, -0.1413F, 5.3512F, 0.4974F, 0.1146F, -0.0803F));

		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(125, 57).addBox(-0.1061F, -0.0673F, -0.9833F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7937F, -0.1413F, 5.3512F, 0.5846F, 0.1146F, -0.0803F));

		PartDefinition cube_r19 = bone3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(33, 113).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0872F, -1.4243F, 3.7669F, 0.6336F, -0.0583F, 0.1644F));

		PartDefinition cube_r20 = bone3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(17, 121).addBox(-0.5F, -1.5F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.57F, 5.2563F, -5.8663F, -2.3117F, 0.0461F, -0.1729F));

		PartDefinition cube_r21 = bone3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(45, 113).addBox(-0.5F, -2.7F, -0.45F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0134F)), PartPose.offsetAndRotation(0.533F, 5.3123F, -6.8651F, -0.3394F, 0.0461F, -0.1729F));

		PartDefinition cube_r22 = bone3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(117, 128).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(82, 128).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8394F, 6.8959F, -6.2272F, -1.9102F, 0.0461F, -0.1729F));

		PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(121, 14).addBox(-0.5F, -3.3F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.8274F, 7.1774F, -7.5313F, -1.5263F, 0.0461F, -0.1729F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(23, 80).addBox(-1.1315F, 5.6514F, -3.9111F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1224F, -3.0145F, -3.5177F, 0.1318F, 0.0461F, -0.1729F));

		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(99, 110).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.346F, -0.33F, -4.5987F, -0.3482F, 0.0461F, -0.1729F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(92, 117).addBox(-1.1315F, 2.8329F, -0.532F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1224F, -3.0145F, -3.5177F, -0.3918F, 0.0461F, -0.1729F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(50, 113).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.1995F, -2.7816F, -3.0068F, -0.8035F, 0.0661F, 0.018F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(113, 64).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.1995F, -2.7816F, -3.0068F, -0.4544F, 0.0661F, 0.018F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(102, 39).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1921F, -4.9143F, -3.4756F, -0.3934F, 0.0661F, 0.018F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(120, 34).addBox(-0.5F, -1.1F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1733F, -3.7566F, -2.8762F, -0.0879F, 0.0661F, 0.018F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(21, 108).addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3843F, -0.4442F, -5.1639F, -0.4806F, 0.0661F, 0.018F));

		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(38, 52).addBox(-0.5F, -1.0F, -4.3F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.185F, -4.6083F, 1.2287F, 0.1566F, 0.0639F, 0.0248F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(15, 60).addBox(-0.3844F, -0.3139F, -2.3767F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0663F, -6.4816F, 0.4576F, -0.1925F, 0.0639F, 0.0248F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(102, 26).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0473F, -8.5392F, -2.7735F, 1.7091F, -0.3037F, -0.3808F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(133, 23).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.0655F, -7.7062F, -1.7315F, 0.6619F, -0.3037F, -0.3808F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(120, 43).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.2223F, -7.4702F, -5.2671F, 2.1018F, -0.3037F, -0.3808F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(108, 50).addBox(-0.5F, -1.2844F, -0.4469F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7844F, -7.9904F, -4.5868F, 1.5346F, -0.3037F, -0.3808F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(132, 129).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2006F, -10.4108F, -5.728F, 0.8364F, -0.3037F, -0.3808F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(57, 119).addBox(-0.5F, -2.7304F, 0.2166F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7844F, -7.9904F, -4.5868F, 0.531F, -0.3037F, -0.3808F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(52, 108).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.9343F, -10.9838F, -3.045F, 1.7091F, -0.3037F, -0.3808F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(45, 108).addBox(-0.5F, -2.9698F, 0.3392F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7844F, -7.9904F, -4.5868F, 0.2256F, -0.3037F, -0.3808F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(34, 87).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.6897F, -11.0539F, 1.5548F, 0.0311F, -0.0321F, -0.4016F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8948F, 4.1154F, 0.2695F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r43 = bone5.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(106, 0).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.5781F, -8.3848F, 3.4073F, -0.3092F, 0.0321F, 0.4016F));

		PartDefinition cube_r44 = bone5.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(69, 26).mirror().addBox(-0.4173F, 3.7931F, -7.0175F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(101, 104).mirror().addBox(-0.4173F, 0.7931F, -4.5175F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6656F, -8.5861F, 6.0389F, -0.222F, 0.0321F, 0.4016F));

		PartDefinition cube_r45 = bone5.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(97, 117).mirror().addBox(-0.5F, -1.3F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0183F, -4.7803F, 4.6138F, 0.6876F, 0.0327F, 0.4104F));

		PartDefinition cube_r46 = bone5.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(15, 72).mirror().addBox(-0.5F, -1.4F, -3.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.331F, -5.3819F, 6.0422F, 0.1203F, 0.0327F, 0.4104F));

		PartDefinition cube_r47 = bone5.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(5, 126).mirror().addBox(-0.5F, -0.925F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.6923F, -6.0587F, 7.2816F, -0.1982F, 0.0391F, 0.4053F));

		PartDefinition cube_r48 = bone5.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(93, 28).mirror().addBox(-0.5F, 0.0F, -4.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9626F, -6.56F, 8.5761F, -0.3727F, 0.0391F, 0.4053F));

		PartDefinition cube_r49 = bone5.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(37, 121).mirror().addBox(-0.5F, -0.5F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3438F, -3.3812F, 3.256F, -0.1052F, -0.0639F, -0.0248F));

		PartDefinition cube_r50 = bone5.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(61, 125).mirror().addBox(-0.8939F, -0.0681F, -0.9868F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7937F, 2.1079F, 5.2923F, 0.5323F, -0.1146F, 0.0803F));

		PartDefinition cube_r51 = bone5.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(132, 126).mirror().addBox(-0.8939F, -2.7956F, 2.6327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.7937F, 2.1079F, 5.2923F, -1.8152F, -0.1146F, 0.0803F));

		PartDefinition cube_r52 = bone5.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(52, 128).mirror().addBox(-0.8939F, -0.0064F, 3.5839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.7937F, 2.1079F, 5.2923F, -1.1607F, -0.1146F, 0.0803F));

		PartDefinition cube_r53 = bone5.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(122, 128).mirror().addBox(-0.8939F, 2.9439F, 1.5387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7937F, 2.1079F, 5.2923F, -0.3753F, -0.1146F, 0.0803F));

		PartDefinition cube_r54 = bone5.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(66, 125).mirror().addBox(-0.8939F, 1.7791F, -0.3199F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.7937F, 2.1079F, 5.2923F, 0.1919F, -0.1146F, 0.0803F));

		PartDefinition cube_r55 = bone5.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(125, 63).mirror().addBox(-0.8939F, 1.9238F, -0.8149F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7937F, 2.1079F, 5.2923F, 0.4974F, -0.1146F, 0.0803F));

		PartDefinition cube_r56 = bone5.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(125, 57).mirror().addBox(-0.8939F, -0.0673F, -0.9833F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.7937F, 2.1079F, 5.2923F, 0.5846F, -0.1146F, 0.0803F));

		PartDefinition cube_r57 = bone5.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(33, 113).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0872F, 0.825F, 3.708F, 0.6336F, 0.0583F, -0.1644F));

		PartDefinition cube_r58 = bone5.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(17, 121).mirror().addBox(-0.5F, -1.5F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.57F, 7.5055F, -5.9252F, -2.3117F, -0.0461F, 0.1729F));

		PartDefinition cube_r59 = bone5.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(45, 113).mirror().addBox(-0.5F, -2.7F, -0.45F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0134F)).mirror(false), PartPose.offsetAndRotation(-0.533F, 7.5615F, -6.924F, -0.3394F, -0.0461F, 0.1729F));

		PartDefinition cube_r60 = bone5.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(117, 128).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(82, 128).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8394F, 9.1452F, -6.2861F, -1.9102F, -0.0461F, 0.1729F));

		PartDefinition cube_r61 = bone5.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(121, 14).mirror().addBox(-0.5F, -3.3F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8274F, 9.4266F, -7.5902F, -1.5263F, -0.0461F, 0.1729F));

		PartDefinition cube_r62 = bone5.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(23, 80).mirror().addBox(0.1314F, 5.6514F, -3.9111F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1224F, -0.7653F, -3.5766F, 0.1318F, -0.0461F, 0.1729F));

		PartDefinition cube_r63 = bone5.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(99, 110).mirror().addBox(-0.5F, 0.0F, -0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.346F, 1.9192F, -4.6576F, -0.3482F, -0.0461F, 0.1729F));

		PartDefinition cube_r64 = bone5.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(92, 117).mirror().addBox(0.1314F, 2.8329F, -0.532F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.1224F, -0.7653F, -3.5766F, -0.3918F, -0.0461F, 0.1729F));

		PartDefinition cube_r65 = bone5.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(50, 113).mirror().addBox(-0.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.1995F, -0.5324F, -3.0657F, -0.8035F, -0.0661F, -0.018F));

		PartDefinition cube_r66 = bone5.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(113, 64).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.1995F, -0.5324F, -3.0657F, -0.4544F, -0.0661F, -0.018F));

		PartDefinition cube_r67 = bone5.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(102, 39).mirror().addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1921F, -2.6651F, -3.5345F, -0.3934F, -0.0661F, -0.018F));

		PartDefinition cube_r68 = bone5.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(120, 34).mirror().addBox(-0.5F, -1.1F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1733F, -1.5073F, -2.9352F, -0.0879F, -0.0661F, -0.018F));

		PartDefinition cube_r69 = bone5.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(21, 108).mirror().addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3843F, 1.805F, -5.2228F, -0.4806F, -0.0661F, -0.018F));

		PartDefinition cube_r70 = bone5.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(38, 52).mirror().addBox(-0.5F, -1.0F, -4.3F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.185F, -2.359F, 1.1698F, 0.1566F, -0.0639F, -0.0248F));

		PartDefinition cube_r71 = bone5.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(15, 60).mirror().addBox(-0.6156F, -0.3139F, -2.3767F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0663F, -4.2323F, 0.3987F, -0.1925F, -0.0639F, -0.0248F));

		PartDefinition cube_r72 = bone5.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(102, 26).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0473F, -6.29F, -2.8324F, 1.7091F, 0.3037F, 0.3808F));

		PartDefinition cube_r73 = bone5.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(133, 23).mirror().addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.0655F, -5.457F, -1.7904F, 0.6619F, 0.3037F, 0.3808F));

		PartDefinition cube_r74 = bone5.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(120, 43).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.2223F, -5.221F, -5.326F, 2.1018F, 0.3037F, 0.3808F));

		PartDefinition cube_r75 = bone5.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(108, 50).mirror().addBox(-0.5F, -1.2844F, -0.4469F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7844F, -5.7411F, -4.6457F, 1.5346F, 0.3037F, 0.3808F));

		PartDefinition cube_r76 = bone5.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(132, 129).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2006F, -8.1616F, -5.7869F, 0.8364F, 0.3037F, 0.3808F));

		PartDefinition cube_r77 = bone5.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(57, 119).mirror().addBox(-0.5F, -2.7304F, 0.2166F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7844F, -5.7411F, -4.6457F, 0.531F, 0.3037F, 0.3808F));

		PartDefinition cube_r78 = bone5.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(52, 108).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.9343F, -8.7345F, -3.1039F, 1.7091F, 0.3037F, 0.3808F));

		PartDefinition cube_r79 = bone5.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(45, 108).mirror().addBox(-0.5F, -2.9698F, 0.3392F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7844F, -5.7411F, -4.6457F, 0.2256F, 0.3037F, 0.3808F));

		PartDefinition cube_r80 = bone5.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(34, 87).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.6897F, -8.8046F, 1.4959F, 0.0311F, 0.0321F, 0.4016F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(28, 72).addBox(-0.4F, -1.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 0.7956F, 0.9375F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightLeg1.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(79, 69).addBox(-1.5F, -0.1694F, -1.9209F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 13.8295F, -0.8236F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg1.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(7, 107).addBox(-1.0F, -2.5F, -0.45F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5F, 8.6871F, -0.9976F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg1.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(116, 74).addBox(-1.0F, -1.0943F, -0.7306F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(104, 110).addBox(-1.0F, -2.0943F, 0.1694F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5F, 13.8295F, -0.8236F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg1.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(75, 89).addBox(-1.0F, -2.0F, -1.45F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5F, 12.1113F, -1.1283F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg1.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(97, 34).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.497F, 13.059F, -2.8037F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg1.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(116, 70).addBox(-5.1F, 1.6099F, -0.2219F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.597F, 9.4535F, -2.5189F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg1.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(19, 102).addBox(-5.1F, 0.1099F, -0.0219F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.6F, 6.992F, -2.1604F, -0.144F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg1.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(96, 125).addBox(-0.5F, -0.3967F, -0.7826F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 4.1817F, 0.4705F, -2.8274F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg1.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(69, 117).addBox(-0.5F, -0.4085F, -0.1934F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5F, 4.1817F, 0.4705F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg1.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(0, 107).addBox(-5.1F, -0.9707F, -0.2309F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.6F, 4.1851F, -1.4601F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(102, 6).addBox(-1.1F, -0.4F, -1.7F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(92, 65).addBox(-1.1F, -0.4F, -1.2F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.6F, 1.9376F, 1.0007F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(35, 101).addBox(-1.1F, -0.4F, -2.4F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.6F, 1.9376F, 1.0007F, -0.096F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 15.258F, -1.0414F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(26, 113).addBox(0.9F, -2.4F, -0.1F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.2F, 3.5297F, -0.7222F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(24, 118).addBox(-0.1F, -1.6F, -0.45F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.2F, 2.3693F, 0.3041F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(99, 70).addBox(-0.1F, -1.9F, 1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.2F, -0.1422F, -2.2528F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(103, 59).addBox(-0.1F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.2F, -0.1422F, -2.2528F, -1.117F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(43, 119).addBox(-0.1F, -0.5F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 90).addBox(-0.1F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(95, 13).addBox(-0.1F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 1.2303F, 1.8973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(22, 92).addBox(-0.1F, -0.5F, -1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(100, 97).addBox(-0.1F, -1.0F, -1.25F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 9.6597F, -0.0125F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(9, 80).addBox(-0.1F, 0.0F, -1.0F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 4.7282F, 0.8127F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 113).addBox(-0.1F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 3.2078F, 0.3786F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(43, 62).addBox(-1.1F, -7.0F, -0.525F, 2.0F, 13.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.2F, 7.6471F, -0.5117F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(112, 84).addBox(-1.1F, 0.0274F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 0.1471F, 0.6883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(9, 97).addBox(-1.1F, -0.0365F, -0.9927F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 4.9718F, 0.5373F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(104, 119).addBox(-1.1F, -0.1724F, -0.457F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.4F, 2.1197F, 0.3582F, -0.1222F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(76, 79).addBox(-1.0F, 0.0554F, -0.5239F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.6809F, -2.0575F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(119, 83).addBox(0.2966F, -0.0473F, 0.0221F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, 0.1309F));

		PartDefinition cube_r108 = rightLeg3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(114, 9).addBox(0.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.9F, 3.5553F, -0.0239F, 0.0F, 0.0F, 0.1309F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(0, 50).addBox(-1.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 7.8899F, 0.3185F, 0.2793F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(21, 34).addBox(-2.5F, -0.8F, -5.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7254F, -3.9319F, -0.0835F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(78, 7).addBox(-2.6F, -1.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 0.7956F, 0.9375F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r109 = leftLeg1.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(85, 79).addBox(-1.5F, -0.1694F, -1.9209F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 13.8295F, -0.8236F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r110 = leftLeg1.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(107, 94).addBox(-1.0F, -2.5F, -0.45F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.5F, 8.6871F, -0.9976F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r111 = leftLeg1.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(50, 119).addBox(-1.0F, -1.0943F, -0.7306F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(111, 110).addBox(-1.0F, -2.0943F, 0.1694F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.5F, 13.8295F, -0.8236F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r112 = leftLeg1.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(84, 91).addBox(-1.0F, -2.0F, -1.45F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.5F, 12.1113F, -1.1283F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r113 = leftLeg1.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(42, 97).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.497F, 13.059F, -2.8037F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r114 = leftLeg1.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(62, 117).addBox(3.1F, 1.6099F, -0.2219F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-5.597F, 9.4535F, -2.5189F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r115 = leftLeg1.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(102, 20).addBox(3.1F, 0.1099F, -0.0219F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-5.6F, 6.992F, -2.1604F, -0.144F, 0.0F, 0.0F));

		PartDefinition cube_r116 = leftLeg1.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(112, 125).addBox(-0.5F, -0.3967F, -0.7826F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 4.1817F, 0.4705F, -2.8274F, 0.0F, 0.0F));

		PartDefinition cube_r117 = leftLeg1.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(74, 117).addBox(-0.5F, -0.4085F, -0.1934F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.5F, 4.1817F, 0.4705F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r118 = leftLeg1.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(107, 78).addBox(3.1F, -0.9707F, -0.2309F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-5.6F, 4.1851F, -1.4601F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r119 = leftLeg1.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(102, 13).addBox(-0.9F, -0.4F, -1.7F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(68, 92).addBox(-0.9F, -0.4F, -1.2F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.6F, 1.9376F, 1.0007F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r120 = leftLeg1.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(68, 101).addBox(-0.9F, -0.4F, -2.4F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.6F, 1.9376F, 1.0007F, -0.096F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 15.258F, -1.0414F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r121 = leftLeg2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(113, 30).addBox(-2.9F, -2.4F, -0.1F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2F, 3.5297F, -0.7222F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r122 = leftLeg2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(79, 118).addBox(-1.9F, -1.6F, -0.45F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2F, 2.3693F, 0.3041F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r123 = leftLeg2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(102, 74).addBox(-1.9F, -1.9F, 1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.2F, -0.1422F, -2.2528F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r124 = leftLeg2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(92, 104).addBox(-1.9F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2F, -0.1422F, -2.2528F, -1.117F, 0.0F, 0.0F));

		PartDefinition cube_r125 = leftLeg2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(119, 54).addBox(-1.9F, -0.5F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 103).addBox(-1.9F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.3526F, 0.2482F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r126 = leftLeg2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(116, 27).addBox(-1.9F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 1.2303F, 1.8973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r127 = leftLeg2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(92, 60).addBox(-1.9F, -0.5F, -1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2F, 0.3526F, 0.2482F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r128 = leftLeg2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(28, 101).addBox(-1.9F, -1.0F, -1.25F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 9.6597F, -0.0125F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r129 = leftLeg2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(16, 80).addBox(-1.9F, 0.0F, -1.0F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 4.7282F, 0.8127F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r130 = leftLeg2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(113, 0).addBox(-1.9F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 3.2078F, 0.3786F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r131 = leftLeg2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(68, 49).addBox(-0.9F, -7.0F, -0.525F, 2.0F, 13.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2F, 7.6471F, -0.5117F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r132 = leftLeg2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(112, 89).addBox(0.1F, 0.0274F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 0.1471F, 0.6883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r133 = leftLeg2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(14, 97).addBox(0.1F, -0.0365F, -0.9927F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 4.9718F, 0.5373F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r134 = leftLeg2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(109, 119).addBox(0.1F, -0.1724F, -0.457F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.4F, 2.1197F, 0.3582F, -0.1222F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(0, 80).addBox(-2.0F, 0.0554F, -0.5239F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.6809F, -2.0575F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r135 = leftLeg3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(119, 88).addBox(-1.2966F, -0.0473F, 0.0221F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, -0.1309F));

		PartDefinition cube_r136 = leftLeg3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(19, 115).addBox(-1.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.9F, 3.5553F, -0.0239F, 0.0F, 0.0F, -0.1309F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(50, 0).addBox(-4.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 7.8899F, 0.3185F, 0.8029F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(0, 42).addBox(-3.5F, -0.8F, -5.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7254F, -3.9319F, -0.738F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4044F, 7.5708F, -0.2446F, 0.0423F, -0.0106F));

		PartDefinition cube_r137 = tail1.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(118, 110).addBox(0.0F, -0.2F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3054F, 8.8017F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r138 = tail1.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(14, 124).addBox(0.5F, 0.0871F, -0.2754F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.1168F, 1.8803F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r139 = tail1.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(31, 119).addBox(0.5F, -0.1129F, -0.5754F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4781F, 4.6083F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r140 = tail1.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(34, 119).addBox(0.5F, -0.1129F, -0.5754F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1228F, 6.6769F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r141 = tail1.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(130, 26).addBox(0.5F, -2.7823F, -0.1162F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.1724F, 7.8771F, -0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r142 = tail1.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(9, 131).addBox(0.5F, -3.1073F, -0.2162F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.5249F, 6.0222F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r143 = tail1.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(45, 122).addBox(0.5F, -3.4323F, 0.9838F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2738F, 2.8321F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r144 = tail1.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(79, 124).addBox(0.5F, -3.1823F, -1.2162F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 122).addBox(0.5F, -3.3823F, 0.7838F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1326F, 1.0376F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r145 = tail1.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(27, 0).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0156F, 0.9925F, 0.1573F, 0.0517F, 0.0082F));

		PartDefinition cube_r146 = tail1.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(27, 0).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0156F, 0.9925F, 0.1573F, -0.0517F, -0.0082F));

		PartDefinition cube_r147 = tail1.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(0, 15).addBox(0.0F, -1.9F, -0.9F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.889F, 1.0345F, 0.1571F, 0.0F, 0.0F));

		PartDefinition tail = tail1.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.5266F, 9.791F, 0.0088F, 0.0873F, 0.0008F));

		PartDefinition cube_r148 = tail.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(48, 20).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.0382F, 0.9544F, 0.1575F, 0.069F, 0.0109F));

		PartDefinition cube_r149 = tail.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(48, 20).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -0.0382F, 0.9544F, 0.1575F, -0.069F, -0.0109F));

		PartDefinition cube_r150 = tail.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(48, 10).addBox(0.0F, -1.9F, 9.1F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5F, 2.4308F, -8.8805F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r151 = tail.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(121, 118).addBox(0.0F, 0.7F, -0.3F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.548F, 6.0799F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r152 = tail.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(50, 62).addBox(0.0F, -0.2F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.1364F, 3.7429F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r153 = tail.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(118, 117).addBox(0.0F, -0.7F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.903F, 1.7675F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r154 = tail.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(97, 129).addBox(0.5F, -2.6073F, -0.0162F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.4867F, 5.7705F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r155 = tail.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(27, 128).addBox(0.5F, -2.2073F, -0.0162F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.6262F, 3.7754F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r156 = tail.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(76, 127).addBox(0.5F, -2.1823F, -0.0162F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.2832F, 1.8025F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r157 = tail.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(10, 126).addBox(0.5F, -2.3823F, -0.0162F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.0395F, -0.1826F, -0.096F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.4624F, 6.8232F, 0.1747F, 0.043F, 0.0076F));

		PartDefinition cube_r158 = tail2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(129, 117).addBox(0.0F, -2.7561F, -0.0316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8424F, 7.0228F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r159 = tail2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(114, 129).addBox(0.0F, -2.6561F, 0.0684F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0254F, 4.9307F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r160 = tail2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(51, 97).addBox(0.0F, -2.6061F, -0.1316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1823F, 3.1376F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r161 = tail2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(111, 129).addBox(0.0F, -2.4811F, 0.0684F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.374F, 0.946F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r162 = tail2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(44, 42).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.005F))
				.texOffs(25, 42).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.426F, 1.046F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r163 = tail2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(25, 122).addBox(0.0F, 0.3F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0741F, 1.94F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r164 = tail2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(22, 122).addBox(0.0F, 0.2F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1005F, 6.0433F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r165 = tail2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(114, 119).addBox(0.0F, 0.9F, -0.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2458F, 3.5777F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r166 = tail2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(21, 52).mirror().addBox(-0.9F, 0.0F, 1.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.4564F, 0.0304F, 0.0175F, 0.0698F, 0.0012F));

		PartDefinition cube_r167 = tail2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(21, 52).addBox(-0.1F, 0.0F, 1.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.4564F, 0.0304F, 0.0175F, -0.0698F, -0.0012F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7776F, 8.1476F, 0.1051F, 0.0868F, 0.0091F));

		PartDefinition cube_r168 = tail8.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(75, 56).addBox(-0.5F, -1.9F, 7.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2035F, -7.1016F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r169 = tail8.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(130, 21).addBox(0.0F, 0.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0245F, 3.9397F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r170 = tail8.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(13, 130).addBox(0.0F, 0.8F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0846F, 1.901F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r171 = tail8.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(28, 122).addBox(0.0F, 0.2F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2422F, -0.1152F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r172 = tail8.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(133, 92).addBox(0.0F, -2.0061F, -0.0316F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 2.8984F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r173 = tail8.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(108, 70).addBox(0.0F, -2.1561F, -0.0316F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 0.8984F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail6 = tail8.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5964F, 4.9984F, 0.0263F, 0.0872F, 0.0023F));

		PartDefinition cube_r174 = tail6.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(0, 91).addBox(-0.5F, -1.9F, 12.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -12.1F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r175 = tail6.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(3, 130).addBox(0.0F, 0.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3057F, 2.9738F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r176 = tail6.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(0, 130).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6582F, 1.0026F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r177 = tail6.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(134, 6).addBox(0.0F, -2.0061F, -0.0316F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r178 = tail6.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(127, 133).addBox(0.0F, -2.0561F, -0.1316F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail3 = tail6.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(21, 134).addBox(0.0F, -2.2468F, -0.102F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 134).addBox(0.0F, -2.2968F, 1.898F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 104).addBox(0.0F, -2.2968F, 3.898F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3741F, 3.9039F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r179 = tail3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(24, 134).addBox(0.0F, 0.3F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1036F, 3.2148F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r180 = tail3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(6, 130).addBox(0.0F, -0.1F, -0.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1338F, 0.8613F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r181 = tail3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(0, 73).addBox(-0.5F, 0.1F, 0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail7 = tail3.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(47, 134).addBox(0.0F, -1.398F, 0.9119F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 47).addBox(0.0F, -1.348F, 2.9119F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8488F, 4.9861F, -0.0352F, -0.1308F, 0.0046F));

		PartDefinition cube_r182 = tail7.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(91, 7).addBox(-0.5F, 0.1F, 5.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0148F, -5.2897F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r183 = tail7.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(44, 134).addBox(0.0F, 0.5F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4125F, 1.9014F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r184 = tail7.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(41, 134).addBox(0.0F, 0.3F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 0.2F, 0.5323F, 0.0F, 0.0F));

		PartDefinition tail9 = tail7.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1099F, 3.8437F, -0.0352F, -0.1308F, 0.0046F));

		PartDefinition cube_r185 = tail9.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(53, 61).addBox(-0.5F, 0.1F, 9.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0951F, -9.1335F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r186 = tail9.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(88, 60).addBox(0.0F, -1.15F, 4.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 16).addBox(0.0F, -1.225F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 134).addBox(0.0F, -1.275F, 0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2579F, 0.5682F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r187 = tail9.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(134, 83).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.152F, 4.4886F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r188 = tail9.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(82, 134).addBox(0.0F, -0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3096F, 2.4724F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r189 = tail9.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(53, 134).addBox(0.0F, -0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5646F, 0.4787F, 0.576F, 0.0F, 0.0F));

		PartDefinition tail4 = tail9.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3811F, 5.9106F, 0.0709F, -0.1741F, -0.0123F));

		PartDefinition cube_r190 = tail4.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(100, 134).addBox(0.0F, 2.5F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 134).addBox(0.0F, 1.8F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 96).addBox(0.0F, 0.8F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5331F, -1.4219F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r191 = tail4.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(87, 124).addBox(0.0F, -0.5F, 4.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 34).addBox(0.0F, -0.6F, 2.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 91).addBox(0.0F, -0.7F, 0.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 65).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 0.2316F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(78, 41).addBox(-0.5F, -0.5698F, -0.2226F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.3471F, 6.1912F, -0.1232F, -0.1299F, 0.016F));

		PartDefinition cube_r192 = tail5.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(134, 100).addBox(0.0F, 4.3F, 9.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(121, 134).addBox(0.0F, 3.4F, 7.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.186F, -7.6131F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r193 = tail5.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(0, 135).addBox(0.0F, -0.5F, 8.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(124, 134).addBox(0.0F, -0.5F, 6.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7681F, -5.9596F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail10 = tail5.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(73, 0).addBox(-0.5F, -0.5698F, -0.0226F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.8F, -0.0352F, -0.1308F, 0.0046F));

		PartDefinition cube_r194 = tail10.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(115, 134).addBox(0.0F, 6.0F, 13.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 134).addBox(0.0F, 5.2F, 11.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.186F, -12.4131F, 0.4276F, 0.0F, 0.0F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create().texOffs(50, 73).addBox(-0.5F, -0.5698F, -0.0226F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.0886F, -0.1739F, 0.0154F));

		PartDefinition cube_r195 = tail11.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(3, 135).addBox(0.0F, 9.3F, 19.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(135, 0).addBox(0.0F, 8.4F, 17.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(118, 134).addBox(0.0F, 6.7F, 15.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.186F, -17.4131F, 0.4276F, 0.0F, 0.0F));

		PartDefinition tail12 = tail11.addOrReplaceChild("tail12", CubeListBuilder.create().texOffs(63, 74).addBox(-0.5F, -0.0698F, -0.0226F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.5F, 5.0F, -0.088F, 0.1304F, -0.0115F));

		PartDefinition cube_r196 = tail12.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(12, 135).addBox(0.0F, 10.9F, 23.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 135).addBox(0.0F, 10.1F, 21.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.686F, -22.4131F, 0.4276F, 0.0F, 0.0F));

		PartDefinition tail13 = tail12.addOrReplaceChild("tail13", CubeListBuilder.create().texOffs(75, 49).addBox(-0.5F, -0.0698F, -0.0226F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.0443F, 0.1744F, -0.0077F));

		PartDefinition tail14 = tail13.addOrReplaceChild("tail14", CubeListBuilder.create().texOffs(28, 62).addBox(-0.5F, -0.0698F, -0.0226F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.0876F, 0.0869F, -0.0076F));

		PartDefinition bone = tail1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -8.3597F, 8.6494F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1628F, -4.1022F, -0.0175F, 0.0873F, -0.0015F));

		PartDefinition cube_r197 = body.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(109, 6).addBox(-0.5F, -3.2105F, -0.1178F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.169F, -1.7704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r198 = body.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(40, 108).addBox(-0.5F, -3.1522F, 0.9886F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4213F, -5.8697F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r199 = body.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(53, 52).addBox(-1.0F, 0.0F, 2.9F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.669F, -8.7704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r200 = body.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(23, 15).addBox(-2.5F, -6.1381F, 0.2948F, 7.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 14.7465F, -8.7032F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r201 = body.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(120, 61).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.269F, -0.8704F, -0.1796F, -0.113F, -0.6365F));

		PartDefinition cube_r202 = body.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(120, 47).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.269F, -0.8704F, -0.1153F, -0.1781F, -1.0727F));

		PartDefinition cube_r203 = body.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(103, 63).mirror().addBox(-3.74F, -2.3355F, -0.4915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.269F, -0.8704F, 0.0053F, -0.2118F, -1.677F));

		PartDefinition cube_r204 = body.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(121, 93).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -3.8704F, -0.1688F, -0.0476F, -0.4898F));

		PartDefinition cube_r205 = body.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(121, 95).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -3.8704F, -0.1332F, -0.1143F, -0.9226F));

		PartDefinition cube_r206 = body.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(34, 70).mirror().addBox(-5.6882F, -2.8327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -3.8704F, -0.0463F, -0.1691F, -1.5197F));

		PartDefinition cube_r207 = body.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(34, 70).addBox(2.6881F, -2.8327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -3.8704F, -0.0463F, 0.1691F, 1.5197F));

		PartDefinition cube_r208 = body.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(121, 95).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -3.8704F, -0.1332F, 0.1143F, 0.9226F));

		PartDefinition cube_r209 = body.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(121, 93).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -3.8704F, -0.1688F, 0.0476F, 0.4898F));

		PartDefinition cube_r210 = body.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(103, 63).addBox(2.74F, -2.3355F, -0.4915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.269F, -0.8704F, 0.0053F, 0.2118F, 1.677F));

		PartDefinition cube_r211 = body.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(120, 47).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.269F, -0.8704F, -0.1153F, 0.1781F, 1.0727F));

		PartDefinition cube_r212 = body.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(120, 61).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.269F, -0.8704F, -0.1796F, 0.113F, 0.6365F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -1.1F, -9.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.394F, -5.7704F, -0.0262F, 0.0436F, -0.0011F));

		PartDefinition cube_r213 = body2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(87, 111).addBox(0.0F, -3.2122F, -0.0627F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0807F, -1.9945F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r214 = body2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(86, 118).addBox(0.0F, -2.8617F, 1.1386F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9992F, -9.195F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r215 = body2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(38, 115).addBox(0.0F, -3.0367F, 1.0386F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0262F, -6.0951F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r216 = body2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(82, 37).mirror().addBox(-8.6882F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -4.0F, 0.0215F, 0.1199F, -1.3967F));

		PartDefinition cube_r217 = body2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(48, 122).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -4.0F, 0.085F, 0.0873F, -0.8008F));

		PartDefinition cube_r218 = body2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(122, 49).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -4.0F, 0.1138F, 0.0433F, -0.3657F));

		PartDefinition cube_r219 = body2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(34, 85).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -7.0F, 0.2262F, 0.0923F, -0.3241F));

		PartDefinition cube_r220 = body2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(118, 68).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -7.0F, 0.1669F, 0.1789F, -0.7559F));

		PartDefinition cube_r221 = body2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(0, 40).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -7.0F, 0.0371F, 0.2413F, -1.3598F));

		PartDefinition cube_r222 = body2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(102, 32).mirror().addBox(-6.6882F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -1.0F, -0.0133F, 0.0035F, -1.4494F));

		PartDefinition cube_r223 = body2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(124, 91).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -1.0F, -0.0091F, 0.0103F, -0.8561F));

		PartDefinition cube_r224 = body2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(124, 122).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -1.0F, -0.0039F, 0.0131F, -0.4197F));

		PartDefinition cube_r225 = body2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(124, 122).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -1.0F, -0.0039F, -0.0131F, 0.4197F));

		PartDefinition cube_r226 = body2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(48, 28).addBox(-2.5F, -2.0698F, -2.9985F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 13.1109F, -6.559F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r227 = body2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(23, 25).addBox(-2.5F, -3.0698F, -4.9985F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 13.329F, -1.5638F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r228 = body2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(124, 91).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -1.0F, -0.0091F, -0.0103F, 0.8561F));

		PartDefinition cube_r229 = body2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(102, 32).addBox(2.6881F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -1.0F, -0.0133F, -0.0035F, 1.4494F));

		PartDefinition cube_r230 = body2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(0, 40).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -7.0F, 0.0371F, -0.2413F, 1.3598F));

		PartDefinition cube_r231 = body2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(118, 68).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -7.0F, 0.1669F, -0.1789F, 0.7559F));

		PartDefinition cube_r232 = body2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(34, 85).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -7.0F, 0.2262F, -0.0923F, 0.3241F));

		PartDefinition cube_r233 = body2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(122, 49).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -4.0F, 0.1138F, -0.0433F, 0.3657F));

		PartDefinition cube_r234 = body2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(48, 122).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -4.0F, 0.085F, -0.0873F, 0.8008F));

		PartDefinition cube_r235 = body2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(82, 37).addBox(2.6881F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -4.0F, 0.0215F, -0.1199F, 1.3967F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1394F, -9.0567F, 0.1927F, 0.0857F, 0.0167F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(97, 0).addBox(-0.5F, -2.2141F, -0.0945F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.1826F, -2.8462F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(7, 113).addBox(0.0F, -3.1525F, 0.8601F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8174F, -2.7462F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(33, 130).addBox(0.0F, -3.0967F, -0.0424F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9029F, -3.8057F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(50, 69).addBox(-4.829F, -0.1081F, -1.5882F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.829F, 9.2308F, -7.4229F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(91, 45).mirror().addBox(-4.6F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6066F, 9.9092F, -6.9878F, -0.2326F, 1.0702F, -0.2444F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(28, 60).mirror().addBox(-2.3F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.797F, 9.8397F, -7.3117F, -0.3524F, 1.0286F, 0.1378F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(67, 34).mirror().addBox(-1.7273F, 0.1227F, -5.7478F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.829F, 9.2308F, -7.4229F, -0.5027F, -0.428F, 0.2244F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(122, 51).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0326F, -0.8462F, 0.1772F, 0.0707F, -0.2759F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(79, 122).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0326F, -0.8462F, 0.1311F, 0.1388F, -0.7094F));

		PartDefinition cube_r245 = chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(27, 10).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0326F, -0.8462F, 0.0305F, 0.1883F, -1.3091F));

		PartDefinition cube_r246 = chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(50, 6).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1174F, -3.3462F, 0.0622F, 0.2879F, -1.3553F));

		PartDefinition cube_r247 = chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(122, 97).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1174F, -3.3462F, 0.2142F, 0.2035F, -0.749F));

		PartDefinition cube_r248 = chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(122, 99).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1174F, -3.3462F, 0.2789F, 0.0953F, -0.3212F));

		PartDefinition cube_r249 = chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(50, 8).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2826F, -5.2462F, 0.0857F, 0.353F, -1.3853F));

		PartDefinition cube_r250 = chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(122, 101).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2826F, -5.2462F, 0.2711F, 0.2441F, -0.7738F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(122, 103).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2826F, -5.2462F, 0.3466F, 0.1095F, -0.3517F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(122, 105).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2826F, -7.2462F, 0.3901F, 0.1406F, -0.3632F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(122, 107).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2826F, -7.2462F, 0.2987F, 0.2902F, -0.7834F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(27, 12).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2826F, -7.2462F, 0.0804F, 0.406F, -1.4042F));

		PartDefinition cube_r255 = chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(27, 12).addBox(2.6881F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2826F, -7.2462F, 0.0804F, -0.406F, 1.4042F));

		PartDefinition cube_r256 = chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(122, 107).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2826F, -7.2462F, 0.2987F, -0.2902F, 0.7834F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(122, 105).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2826F, -7.2462F, 0.3901F, -0.1406F, 0.3632F));

		PartDefinition cube_r258 = chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(130, 31).addBox(0.0F, -3.3927F, 0.7163F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5174F, -8.6462F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r259 = chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(122, 103).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2826F, -5.2462F, 0.3466F, -0.1095F, 0.3517F));

		PartDefinition cube_r260 = chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(122, 101).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2826F, -5.2462F, 0.2711F, -0.2441F, 0.7738F));

		PartDefinition cube_r261 = chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(50, 8).addBox(2.6881F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2826F, -5.2462F, 0.0857F, -0.353F, 1.3853F));

		PartDefinition cube_r262 = chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(122, 99).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1174F, -3.3462F, 0.2789F, -0.0953F, 0.3212F));

		PartDefinition cube_r263 = chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(122, 97).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1174F, -3.3462F, 0.2142F, -0.2035F, 0.749F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(50, 6).addBox(2.6881F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1174F, -3.3462F, 0.0622F, -0.2879F, 1.3553F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(27, 10).addBox(2.6881F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0326F, -0.8462F, 0.0305F, -0.1883F, 1.3091F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(79, 122).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0326F, -0.8462F, 0.1311F, -0.1388F, 0.7094F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(46, 34).addBox(-3.0F, -2.0F, -7.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 13.3956F, -0.0609F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(122, 51).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0326F, -0.8462F, 0.1772F, -0.0707F, 0.2759F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(30, 130).addBox(0.0F, -3.4927F, 0.7163F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5174F, -6.6462F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r270 = chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(67, 34).addBox(-0.2727F, 0.1227F, -5.7478F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.829F, 9.2308F, -7.4229F, -0.5027F, 0.428F, -0.2244F));

		PartDefinition cube_r271 = chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(28, 60).addBox(-0.7F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.797F, 9.8397F, -7.3117F, -0.3524F, -1.0286F, -0.1378F));

		PartDefinition cube_r272 = chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(91, 45).addBox(-0.4F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6066F, 9.9092F, -6.9878F, -0.2326F, -1.0702F, 0.2444F));

		PartDefinition cube_r273 = chest.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(28, 79).addBox(-2.829F, 0.1227F, -5.4123F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.829F, 9.2308F, -7.4229F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r274 = chest.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, -0.1119F, -5.8679F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.9174F, -2.9462F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8651F, 2.1681F, -8.1212F, -0.0353F, 0.0981F, -0.1959F));

		PartDefinition cube_r275 = bone2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(88, 54).addBox(-0.5F, -0.1F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.529F, 0.3859F, -0.742F, 0.7941F, -0.0009F, -0.0174F));

		PartDefinition cube_r276 = bone2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(131, 14).addBox(-0.5F, 0.0F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(131, 11).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4561F, -3.6597F, 1.8795F, 0.9687F, -0.0009F, -0.0174F));

		PartDefinition cube_r277 = bone2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(99, 52).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4826F, -2.0621F, 3.2706F, -2.4347F, -0.0009F, -0.0174F));

		PartDefinition cube_r278 = bone2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(99, 47).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4662F, -2.9334F, 4.6125F, -2.5656F, -0.0009F, -0.0174F));

		PartDefinition cube_r279 = bone2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(41, 131).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4497F, -3.8969F, 4.3452F, -2.8711F, -0.0009F, -0.0174F));

		PartDefinition cube_r280 = bone2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(109, 13).addBox(-0.5F, -5.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4387F, -4.5659F, 3.6021F, 2.4086F, -0.0009F, -0.0174F));

		PartDefinition cube_r281 = bone2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(22, 131).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4367F, -4.7309F, 2.6158F, 1.405F, -0.0009F, -0.0174F));

		PartDefinition cube_r282 = bone2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(104, 115).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.495F, -1.4341F, 1.6677F, 1.0123F, -0.0009F, -0.0174F));

		PartDefinition cube_r283 = bone2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(63, 41).addBox(-0.5F, -0.775F, -1.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5425F, 1.129F, -1.4111F, 0.7505F, -0.0009F, -0.0174F));

		PartDefinition cube_r284 = bone2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(73, 113).addBox(-0.425F, 0.05F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0982F, 2.9226F, -2.5249F, 1.7714F, 0.1346F, 0.2175F));

		PartDefinition cube_r285 = bone2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(85, 84).addBox(-0.4296F, -0.6006F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7689F, 4.0977F, -4.0506F, -0.0123F, 0.5095F, 1.0549F));

		PartDefinition cube_r286 = bone2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(88, 48).addBox(-0.2586F, -1.3693F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.7689F, 4.0977F, -4.0506F, -0.2F, 0.472F, 0.6608F));

		PartDefinition cube_r287 = bone2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(118, 64).addBox(-1.1114F, -1.6093F, -2.47F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8876F, 3.021F, -2.6742F, 0.1013F, 0.4221F, 0.5083F));

		PartDefinition cube_r288 = bone2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(14, 108).addBox(-0.5F, -2.0F, -0.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2175F, 3.7942F, -2.4934F, 0.4504F, 0.4221F, 0.5083F));

		PartDefinition cube_r289 = bone2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(93, 97).addBox(-1.1114F, -2.9749F, -2.0964F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8876F, 3.021F, -2.6742F, 1.0613F, 0.4221F, 0.5083F));

		PartDefinition cube_r290 = bone2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(126, 14).addBox(-0.8F, -0.4487F, -1.4266F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9555F, 1.0178F, -2.3595F, 0.9511F, 0.1346F, 0.2175F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8651F, 2.1681F, -8.1212F, -0.0353F, -0.0981F, 0.1959F));

		PartDefinition cube_r291 = bone4.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(88, 54).mirror().addBox(-0.5F, -0.1F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.529F, 0.3859F, -0.742F, 0.7941F, 0.0009F, 0.0174F));

		PartDefinition cube_r292 = bone4.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(131, 14).mirror().addBox(-0.5F, 0.0F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(131, 11).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4561F, -3.6597F, 1.8795F, 0.9687F, 0.0009F, 0.0174F));

		PartDefinition cube_r293 = bone4.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(99, 52).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4826F, -2.0621F, 3.2706F, -2.4347F, 0.0009F, 0.0174F));

		PartDefinition cube_r294 = bone4.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(99, 47).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4662F, -2.9334F, 4.6125F, -2.5656F, 0.0009F, 0.0174F));

		PartDefinition cube_r295 = bone4.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(41, 131).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4497F, -3.8969F, 4.3452F, -2.8711F, 0.0009F, 0.0174F));

		PartDefinition cube_r296 = bone4.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(109, 13).mirror().addBox(-0.5F, -5.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4387F, -4.5659F, 3.6021F, 2.4086F, 0.0009F, 0.0174F));

		PartDefinition cube_r297 = bone4.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(22, 131).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4367F, -4.7309F, 2.6158F, 1.405F, 0.0009F, 0.0174F));

		PartDefinition cube_r298 = bone4.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(104, 115).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.495F, -1.4341F, 1.6677F, 1.0123F, 0.0009F, 0.0174F));

		PartDefinition cube_r299 = bone4.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(63, 41).mirror().addBox(-0.5F, -0.775F, -1.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5425F, 1.129F, -1.4111F, 0.7505F, 0.0009F, 0.0174F));

		PartDefinition cube_r300 = bone4.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(73, 113).mirror().addBox(-0.575F, 0.05F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.0982F, 2.9226F, -2.5249F, 1.7714F, -0.1346F, -0.2175F));

		PartDefinition cube_r301 = bone4.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(85, 84).mirror().addBox(-0.5704F, -0.6006F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7689F, 4.0977F, -4.0506F, -0.0123F, -0.5095F, -1.0549F));

		PartDefinition cube_r302 = bone4.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(88, 48).mirror().addBox(-0.7414F, -1.3693F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.7689F, 4.0977F, -4.0506F, -0.2F, -0.472F, -0.6608F));

		PartDefinition cube_r303 = bone4.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(118, 64).mirror().addBox(0.1114F, -1.6093F, -2.47F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8876F, 3.021F, -2.6742F, 0.1013F, -0.4221F, -0.5083F));

		PartDefinition cube_r304 = bone4.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(14, 108).mirror().addBox(-0.5F, -2.0F, -0.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.2175F, 3.7942F, -2.4934F, 0.4504F, -0.4221F, -0.5083F));

		PartDefinition cube_r305 = bone4.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(93, 97).mirror().addBox(0.1114F, -2.9749F, -2.0964F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8876F, 3.021F, -2.6742F, 1.0613F, -0.4221F, -0.5083F));

		PartDefinition cube_r306 = bone4.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(126, 14).mirror().addBox(-0.2F, -0.4487F, -1.4266F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9555F, 1.0178F, -2.3595F, 0.9511F, -0.1346F, -0.2175F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.1354F, 7.1076F, -9.6072F, 0.6073F, 0.3124F, -0.0742F));

		PartDefinition cube_r307 = leftArm1.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(133, 29).addBox(-0.5F, -1.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 26).addBox(-0.5F, -1.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2706F, 0.9418F, -0.5192F, -0.3218F, -0.7676F, 0.1498F));

		PartDefinition cube_r308 = leftArm1.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(130, 36).addBox(-0.5F, 0.3F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(126, 53).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2706F, 0.9418F, -0.5192F, -0.6272F, -0.7676F, 0.1498F));

		PartDefinition cube_r309 = leftArm1.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(31, 126).addBox(6.0F, -1.0842F, 0.0838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 0.9847F, -1.1107F, -0.2895F, -0.0786F, -0.067F));

		PartDefinition cube_r310 = leftArm1.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(130, 0).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.3582F, 0.3499F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r311 = leftArm1.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(123, 18).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 4.3165F, 1.2617F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r312 = leftArm1.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(0, 118).addBox(-0.5F, -2.9F, 0.625F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.5943F, -0.5628F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(82, 103).addBox(-0.8F, -1.2307F, -0.4734F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 70).addBox(-0.8F, -0.2307F, -1.5734F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2661F, 7.6979F, 0.4626F, -1.5564F, -0.6034F, 0.2852F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1429F, 4.9275F, 0.1273F, 0.0837F, -0.2711F, -0.242F));

		PartDefinition cube_r313 = leftHand.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(50, 80).addBox(0.0F, -2.5F, -0.2F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r314 = leftHand.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(54, 94).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 0.2032F, -1.2796F, -0.4887F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.1354F, 7.1076F, -9.6072F, 0.6178F, -0.3835F, 0.021F));

		PartDefinition cube_r315 = rightArm1.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(133, 55).addBox(-0.5F, -1.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 39).addBox(-0.5F, -1.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.2706F, 0.9418F, -0.5192F, -0.3218F, 0.7676F, -0.1498F));

		PartDefinition cube_r316 = rightArm1.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(132, 120).addBox(-0.5F, 0.3F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(126, 109).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2706F, 0.9418F, -0.5192F, -0.6272F, 0.7676F, -0.1498F));

		PartDefinition cube_r317 = rightArm1.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(126, 76).addBox(-7.0F, -1.0842F, 0.0838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 0.9847F, -1.1107F, -0.2895F, 0.0786F, 0.067F));

		PartDefinition cube_r318 = rightArm1.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(132, 117).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.3582F, 0.3499F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r319 = rightArm1.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(37, 125).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 4.3165F, 1.2617F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r320 = rightArm1.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(12, 118).addBox(-0.5F, -2.9F, 0.625F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.5943F, -0.5628F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(87, 103).addBox(-0.2F, -1.2307F, -0.4734F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 111).addBox(-0.2F, -0.2307F, -1.5734F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2661F, 7.6979F, 0.4626F, -2.1436F, 0.6571F, -0.7157F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1429F, 4.9275F, 0.1273F, 0.0843F, -0.0226F, 0.0863F));

		PartDefinition cube_r321 = rightHand.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(68, 81).addBox(-1.0F, -2.5F, -0.2F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r322 = rightHand.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(61, 94).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 0.2032F, -1.2796F, -0.5323F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1134F, -8.6766F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r323 = neck1.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(130, 39).addBox(0.0F, -2.6459F, -0.016F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5304F, -1.0177F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r324 = neck1.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(15, 70).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1692F, -0.2696F, 0.4274F, 0.9939F, -1.3857F));

		PartDefinition cube_r325 = neck1.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(123, 22).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1692F, -0.2696F, 0.9232F, 0.6046F, -0.7188F));

		PartDefinition cube_r326 = neck1.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(123, 24).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1692F, -0.2696F, 1.0344F, 0.2402F, -0.4532F));

		PartDefinition cube_r327 = neck1.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(123, 24).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1692F, -0.2696F, 1.0344F, -0.2402F, 0.4532F));

		PartDefinition cube_r328 = neck1.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(123, 22).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1692F, -0.2696F, 0.9232F, -0.6046F, 0.7188F));

		PartDefinition cube_r329 = neck1.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(15, 70).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1692F, -0.2696F, 0.4274F, -0.9939F, 1.3857F));

		PartDefinition cube_r330 = neck1.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(33, 95).addBox(-0.5F, -0.7F, 3.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.6719F, -5.6579F, 0.3142F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9438F, -2.3258F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r331 = neck2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(79, 130).addBox(0.0F, -2.2816F, -0.0991F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1431F, -0.7163F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r332 = neck2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(123, 26).mirror().addBox(-1.9081F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, 0.6303F, 0.4651F, -0.7822F));

		PartDefinition cube_r333 = neck2.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(78, 14).mirror().addBox(-8.737F, -0.79F, -0.4755F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, 0.3794F, 0.6805F, -1.2369F));

		PartDefinition cube_r334 = neck2.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(78, 14).addBox(1.737F, -0.79F, -0.4755F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, 0.3794F, -0.6805F, 1.2369F));

		PartDefinition cube_r335 = neck2.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(123, 26).addBox(-0.0919F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, 0.6303F, -0.4651F, 0.7822F));

		PartDefinition cube_r336 = neck2.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(75, 96).addBox(-0.5F, 1.4F, 5.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3859F, -7.7876F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3605F, -2.3471F, -0.343F, 0.1175F, 0.0375F));

		PartDefinition cube_r337 = neck5.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(96, 84).addBox(-0.5F, 1.4F, 3.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.9754F, -5.9788F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r338 = neck5.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(99, 57).mirror().addBox(-5.7911F, -0.3926F, -0.2462F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -0.9742F, -0.2514F, 1.0252F, -1.657F));

		PartDefinition cube_r339 = neck5.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(123, 28).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -0.9742F, 0.4524F, 0.9779F, -0.835F));

		PartDefinition cube_r340 = neck5.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(125, 67).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9742F, 0.4024F, 0.9449F, -0.8761F));

		PartDefinition cube_r341 = neck5.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(114, 81).mirror().addBox(-4.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9742F, -0.2447F, 0.9817F, -1.6513F));

		PartDefinition cube_r342 = neck5.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(114, 81).addBox(1.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9742F, -0.2447F, -0.9817F, 1.6513F));

		PartDefinition cube_r343 = neck5.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(125, 67).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9742F, 0.4024F, -0.9449F, 0.8761F));

		PartDefinition cube_r344 = neck5.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(123, 28).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -0.9742F, 0.4524F, -0.9779F, 0.835F));

		PartDefinition cube_r345 = neck5.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(99, 57).addBox(1.7911F, -0.3926F, -0.2462F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -0.9742F, -0.2514F, -1.0252F, 1.657F));

		PartDefinition cube_r346 = neck5.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(27, 133).addBox(0.0F, -3.1566F, -0.1491F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6059F, -2.9414F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r347 = neck5.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(76, 132).addBox(0.0F, -2.6566F, -0.1491F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8842F, -0.9608F, -0.0349F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0819F, -2.7815F, -0.0875F, 0.1369F, 0.1392F));

		PartDefinition cube_r348 = neck4.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(123, 38).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, 0.5293F, 0.9484F, -0.7623F));

		PartDefinition cube_r349 = neck4.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(123, 40).mirror().addBox(-3.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, -0.151F, 1.0368F, -1.5613F));

		PartDefinition cube_r350 = neck4.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(67, 123).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, 0.5293F, 0.9484F, -0.7623F));

		PartDefinition cube_r351 = neck4.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(82, 39).mirror().addBox(-4.7663F, -0.3906F, -0.2552F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, -0.151F, 1.0368F, -1.5613F));

		PartDefinition cube_r352 = neck4.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(82, 39).addBox(1.7663F, -0.3906F, -0.2552F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, -0.151F, -1.0368F, 1.5613F));

		PartDefinition cube_r353 = neck4.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(67, 123).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, 0.5293F, -0.9484F, 0.7623F));

		PartDefinition cube_r354 = neck4.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(123, 40).addBox(1.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, -0.151F, -1.0368F, 1.5613F));

		PartDefinition cube_r355 = neck4.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(123, 38).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, 0.5293F, -0.9484F, 0.7623F));

		PartDefinition cube_r356 = neck4.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(130, 57).addBox(0.0F, -2.2677F, -0.0582F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4916F, -3.9212F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r357 = neck4.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(57, 130).addBox(0.0F, -2.6677F, -0.0582F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2697F, -1.931F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r358 = neck4.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(86, 0).addBox(-0.5F, 1.4F, 0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9504F, -3.9173F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5407F, -3.7756F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r359 = neck3.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(123, 70).mirror().addBox(-1.8547F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.3534F, -3.4609F, 0.416F, 0.6757F, -1.0136F));

		PartDefinition cube_r360 = neck3.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(124, 12).mirror().addBox(-3.8842F, -0.3479F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.3534F, -3.4609F, 0.0301F, 0.7755F, -1.5857F));

		PartDefinition cube_r361 = neck3.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(123, 72).mirror().addBox(-1.8351F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.3306F, 0.5553F, -1.0103F));

		PartDefinition cube_r362 = neck3.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(123, 74).mirror().addBox(-3.8627F, -0.3478F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.0339F, 0.6365F, -1.5305F));

		PartDefinition cube_r363 = neck3.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(123, 74).addBox(1.8627F, -0.3478F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.0339F, -0.6365F, 1.5305F));

		PartDefinition cube_r364 = neck3.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(123, 72).addBox(-0.1649F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.3306F, -0.5553F, 1.0103F));

		PartDefinition cube_r365 = neck3.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(124, 12).addBox(1.8842F, -0.3479F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3534F, -3.4609F, 0.0301F, -0.7755F, 1.5857F));

		PartDefinition cube_r366 = neck3.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(123, 70).addBox(-0.1453F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3534F, -3.4609F, 0.416F, -0.6757F, 1.0136F));

		PartDefinition cube_r367 = neck3.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(106, 134).addBox(0.5F, -1.5458F, -1.1223F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.6168F, -1.9379F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r368 = neck3.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(130, 62).addBox(0.5F, -2.069F, -0.9772F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.3795F, -0.4528F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r369 = neck3.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(57, 81).addBox(0.0F, 1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -1.3168F, 1.7621F, -0.48F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.6216F, -3.0653F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r370 = neck.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(123, 81).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4057F, -1.5945F, 0.8154F, 0.9709F, -0.7645F));

		PartDefinition cube_r371 = neck.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(0, 124).mirror().addBox(-3.6944F, -0.3859F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4057F, -1.5945F, 0.0612F, 1.1726F, -1.6082F));

		PartDefinition cube_r372 = neck.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(0, 124).addBox(1.6944F, -0.3859F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4057F, -1.5945F, 0.0612F, -1.1726F, 1.6082F));

		PartDefinition cube_r373 = neck.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(109, 134).addBox(0.5F, -1.8207F, -0.1014F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1331F, -1.8626F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r374 = neck.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(0, 97).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.4894F, 0.0579F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r375 = neck.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(123, 81).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4057F, -1.5945F, 0.8154F, -0.9709F, 0.7645F));

		PartDefinition neck6 = neck.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1345F, -2.4236F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r376 = neck6.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(7, 124).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5212F, -1.221F, 0.5806F, 0.7985F, -0.9472F));

		PartDefinition cube_r377 = neck6.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(131, 78).mirror().addBox(-2.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5212F, -1.221F, 0.0756F, 0.9458F, -1.5956F));

		PartDefinition cube_r378 = neck6.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(131, 78).addBox(1.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.0756F, -0.9458F, 1.5956F));

		PartDefinition cube_r379 = neck6.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(115, 44).addBox(0.5F, -0.8207F, 2.7987F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.074F, -4.6686F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r380 = neck6.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(82, 16).addBox(0.0F, 1.3815F, -4.2683F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r381 = neck6.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(7, 124).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.5806F, -0.7985F, 0.9472F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2754F, -3.3488F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r382 = head.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(46, 131).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.01F, -2.0814F, -4.4579F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r383 = head.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(102, 124).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.01F, -2.2065F, -5.2481F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r384 = head.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(111, 115).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.01F, -2.0883F, -6.0393F, -1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r385 = head.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(82, 30).addBox(-0.5F, -1.9F, -3.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.01F, -0.8825F, -9.6429F, -2.8187F, 0.0F, 0.0F));

		PartDefinition cube_r386 = head.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(109, 39).addBox(-0.5F, -0.7F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.01F, -0.3471F, -10.7168F, 2.0333F, 0.0F, 0.0F));

		PartDefinition cube_r387 = head.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(124, 87).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.01F, -0.1767F, -11.2921F, 1.8588F, 0.0F, 0.0F));

		PartDefinition cube_r388 = head.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(124, 83).addBox(-0.5F, -0.1F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.01F, 0.1589F, -11.7896F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r389 = head.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(109, 25).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.01F, 0.3981F, -12.9655F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r390 = head.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(109, 20).addBox(-0.5F, -1.9F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.01F, 1.5309F, -14.3643F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r391 = head.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(82, 124).addBox(-0.5F, -1.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.01F, 2.2166F, -14.7764F, -2.1118F, 0.0F, 0.0F));

		PartDefinition cube_r392 = head.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(115, 106).addBox(-0.5F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.01F, 2.9356F, -15.1271F, 2.6878F, 0.0F, 0.0F));

		PartDefinition cube_r393 = head.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(92, 132).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.01F, 3.7355F, -15.141F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r394 = head.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(131, 3).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.01F, 3.7355F, -15.141F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r395 = head.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(115, 98).addBox(-0.5F, -0.8162F, -1.9735F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.4271F, -1.6365F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r396 = head.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(55, 115).addBox(-0.5F, -0.3134F, -1.1974F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, -1.4271F, -1.6365F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r397 = head.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(91, 39).addBox(-0.5F, -1.2679F, 0.7068F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 5.6834F, -14.6011F, 0.2785F, 0.0F, 0.0F));

		PartDefinition cube_r398 = head.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(67, 19).addBox(-1.0F, -0.9F, -2.15F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.8016F, -8.1696F, 0.1737F, 0.0F, 0.0F));

		PartDefinition cube_r399 = head.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(79, 63).addBox(-1.0F, -1.075F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.9401F, -2.1291F, 0.1563F, 0.0F, 0.0F));

		PartDefinition cube_r400 = head.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(76, 74).addBox(-2.0F, -0.075F, -0.1F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.9488F, -2.2802F, 0.1039F, 0.0F, 0.0F));

		PartDefinition cube_r401 = head.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(91, 74).addBox(-1.5F, 0.4F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -2.0735F, -2.6864F, -0.0587F, 0.0F, 0.0F));

		PartDefinition cube_r402 = head.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(108, 105).addBox(-0.9404F, 0.675F, -3.975F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4404F, -2.6453F, -0.7301F, 0.1507F, 0.0F, 0.0F));

		PartDefinition cube_r403 = head.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(11, 91).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9225F, -0.7572F, 0.6021F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5733F, 4.5098F, -16.0191F, 0.0F, -0.0698F, 0.0F));

		PartDefinition cube_r404 = leftFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(121, 4).addBox(-3.7045F, -1.9668F, 0.5267F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1282F, -0.5056F, 1.3682F, -3.0736F));

		PartDefinition cube_r405 = leftFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(108, 100).addBox(-0.965F, -1.459F, -0.2313F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.1265F, -5.2928F, 13.0894F, -2.8242F, -0.2721F, 1.2425F));

		PartDefinition cube_r406 = leftFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(82, 23).addBox(0.1151F, -0.9045F, -0.2313F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(1.1265F, -5.2928F, 13.0894F, -2.7636F, 0.1757F, 0.142F));

		PartDefinition cube_r407 = leftFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(92, 108).addBox(-0.9584F, -1.7371F, -0.5383F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.1265F, -5.2928F, 13.0894F, -1.433F, 0.1282F, 1.3348F));

		PartDefinition cube_r408 = leftFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(75, 108).addBox(0.1151F, -1.7371F, -1.0884F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.1265F, -5.2928F, 13.0894F, -1.6379F, 0.1757F, 0.142F));

		PartDefinition cube_r409 = leftFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(115, 50).addBox(-0.3408F, 0.7299F, 5.4842F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1282F, -0.3893F, 0.1222F, 0.0F));

		PartDefinition cube_r410 = leftFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(68, 64).addBox(-1.0F, -3.0F, -1.5F, 2.0F, 6.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.4171F, -3.5077F, 8.9253F, 1.8013F, 0.1581F, 0.0259F));

		PartDefinition cube_r411 = leftFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(127, 130).addBox(-0.5102F, -1.2528F, -0.4098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1651F, -0.2151F, 2.2997F, 1.6655F, 0.1502F, -0.0232F));

		PartDefinition cube_r412 = leftFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(133, 32).addBox(-0.5102F, -0.0434F, -1.3174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1651F, -0.2151F, 2.2997F, 0.4437F, 0.1502F, -0.0232F));

		PartDefinition cube_r413 = leftFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(105, 84).addBox(-0.5F, -0.6F, -3.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1153F, 0.1373F, 2.6588F, -2.972F, 0.1572F, -0.001F));

		PartDefinition cube_r414 = leftFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(131, 75).addBox(-0.9F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6436F, -6.5912F, 11.5444F, 0.558F, 0.0412F, -0.4611F));

		PartDefinition cube_r415 = leftFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(117, 124).addBox(-0.9F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5885F, -6.7163F, 10.7562F, -0.1718F, -0.0027F, -0.4306F));

		PartDefinition cube_r416 = leftFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(65, 132).addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8496F, -5.3681F, 8.7385F, -2.4994F, 0.2242F, -0.3613F));

		PartDefinition cube_r417 = leftFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(60, 132).addBox(-0.6F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6717F, -5.2838F, 8.7732F, -2.5164F, 0.1746F, -0.4427F));

		PartDefinition cube_r418 = leftFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(132, 44).addBox(-0.8F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7643F, -6.1456F, 9.9172F, -2.5F, 0.2243F, -0.3613F));

		PartDefinition cube_r419 = leftFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(36, 132).addBox(-0.775F, -0.7F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(116, 39).addBox(-0.9F, -0.9F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5333F, -6.5981F, 9.9669F, -1.4656F, 0.1259F, -0.4349F));

		PartDefinition cube_r420 = leftFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(23, 85).addBox(-0.9F, -1.9F, -3.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2819F, -5.3923F, 6.3721F, -2.8759F, 0.1983F, -0.4211F));

		PartDefinition cube_r421 = leftFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(122, 124).addBox(-0.9F, -0.7F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(124, 118).addBox(-0.9F, -0.7F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.207F, -4.8569F, 5.3008F, 1.9674F, 0.2541F, -0.4015F));

		PartDefinition cube_r422 = leftFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(125, 0).addBox(-0.9F, -0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1669F, -4.6865F, 4.7269F, 1.8118F, 0.1737F, -0.3817F));

		PartDefinition cube_r423 = leftFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(131, 89).addBox(-0.9F, 0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(82, 131).addBox(-0.9F, -0.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1322F, -4.351F, 4.2307F, 0.5337F, 0.2816F, -0.3366F));

		PartDefinition cube_r424 = leftFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(131, 111).addBox(-0.9F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1206F, -4.2391F, 4.0653F, 1.0537F, -0.9738F, -1.4677F));

		PartDefinition cube_r425 = leftFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(59, 110).addBox(-0.9F, -0.1F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0501F, -4.1117F, 3.0576F, 0.1782F, 0.1161F, -0.241F));

		PartDefinition cube_r426 = leftFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(125, 34).addBox(-0.9F, -1.9F, 0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(17, 125).addBox(-0.9F, -1.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0474F, -2.979F, 1.6622F, -0.9184F, 0.2214F, -0.1939F));

		PartDefinition cube_r427 = leftFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(125, 30).addBox(-0.9F, -1.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0762F, -2.2932F, 1.2511F, -2.1319F, 0.2634F, -0.1203F));

		PartDefinition cube_r428 = leftFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(105, 131).addBox(-0.9F, -0.1F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(100, 131).addBox(-0.9F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1007F, -1.5742F, 0.9013F, 2.6702F, 0.273F, -0.1026F));

		PartDefinition cube_r429 = leftFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(131, 108).addBox(-0.9F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1016F, -0.7743F, 0.8874F, 1.5524F, 0.3316F, -0.0048F));

		PartDefinition cube_r430 = leftFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(43, 87).addBox(-0.4946F, -1.4608F, -0.9339F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1651F, -0.2151F, 2.2997F, -1.3278F, 0.1502F, -0.0232F));

		PartDefinition cube_r431 = leftFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(5, 120).addBox(-0.4946F, -0.9022F, -0.5294F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1651F, -0.2151F, 2.2997F, 0.243F, 0.1502F, -0.0232F));

		PartDefinition cube_r432 = leftFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(75, 102).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3584F, 0.2532F, 5.6468F, 0.1958F, 0.1572F, -0.001F));

		PartDefinition cube_r433 = leftFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(93, 22).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0631F, -2.8466F, 3.0077F, 0.8328F, 0.1572F, -0.001F));

		PartDefinition cube_r434 = leftFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(93, 16).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3492F, -4.2655F, 5.6186F, 0.4925F, 0.1572F, -0.001F));

		PartDefinition cube_r435 = leftFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(53, 124).addBox(-0.5066F, -1.4846F, -3.0236F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2346F, 0.6872F, 4.9499F, 0.2563F, 0.1398F, 0.0338F));

		PartDefinition cube_r436 = leftFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(125, 42).addBox(-0.5066F, -1.3165F, -2.0131F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2346F, 0.6872F, 4.9499F, 0.3086F, 0.1398F, 0.0338F));

		PartDefinition cube_r437 = leftFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(48, 124).addBox(-0.5066F, -1.0401F, -1.0193F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2346F, 0.6872F, 4.9499F, 0.3959F, 0.1398F, 0.0338F));

		PartDefinition cube_r438 = leftFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(124, 8).addBox(-0.5066F, -0.8658F, -0.0192F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2346F, 0.6872F, 4.9499F, 0.457F, 0.1398F, 0.0338F));

		PartDefinition cube_r439 = leftFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(0, 126).addBox(-0.5066F, -0.1822F, 0.9808F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2346F, 0.6872F, 4.9499F, 0.5268F, 0.1398F, 0.0338F));

		PartDefinition cube_r440 = leftFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(126, 4).addBox(-0.5066F, -0.0181F, 1.9568F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2346F, 0.6872F, 4.9499F, 0.5704F, 0.1398F, 0.0338F));

		PartDefinition cube_r441 = leftFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(132, 123).addBox(-0.4F, -0.35F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(28, 97).addBox(-0.4F, -1.15F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(120, 30).addBox(-0.4F, -1.15F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7835F, -0.3205F, 9.5279F, 0.5722F, 0.1676F, 0.0756F));

		PartDefinition cube_r442 = leftFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(65, 10).addBox(-0.45F, -3.1F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9971F, -0.3794F, 9.4415F, 0.2063F, 0.1875F, -0.0078F));

		PartDefinition cube_r443 = leftFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(56, 102).addBox(-0.5473F, -0.0597F, -0.2567F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4787F, -5.5293F, 11.2266F, 0.1667F, 0.2094F, 0.0176F));

		PartDefinition cube_r444 = leftFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(106, 34).addBox(-0.5F, -1.05F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5225F, -1.9705F, 11.9552F, 0.1667F, 0.2094F, 0.0176F));

		PartDefinition cube_r445 = leftFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(119, 9).addBox(-0.5473F, 0.5198F, -0.632F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1282F, 0.1667F, 0.2094F, 0.0176F));

		PartDefinition cube_r446 = leftFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(121, 114).addBox(-0.5F, -1.6F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1802F, -2.8552F, 15.6352F, -2.328F, 0.1535F, -0.0249F));

		PartDefinition cube_r447 = leftFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(84, 98).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0223F, -1.2625F, 14.3593F, -2.9389F, 0.1535F, -0.0249F));

		PartDefinition cube_r448 = leftFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(98, 79).addBox(-0.6365F, -2.5079F, 2.167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1282F, -1.4077F, 0.2123F, 0.0F));

		PartDefinition cube_r449 = leftFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(33, 108).addBox(-0.5473F, 2.286F, 1.1647F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1282F, -0.1823F, 0.2094F, 0.0176F));

		PartDefinition cube_r450 = leftFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(68, 108).addBox(-0.5F, -1.3F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.9554F, -5.081F, 14.2325F, -1.8344F, 0.1222F, 0.0F));

		PartDefinition cube_r451 = leftFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(16, 132).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1469F, -6.0335F, 15.2047F, -1.6163F, 0.1222F, 0.0F));

		PartDefinition cube_r452 = leftFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(87, 130).addBox(-0.3912F, -5.0234F, 3.2478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.3896F, -3.3168F, 9.9282F, -0.5254F, 0.1222F, 0.0F));

		PartDefinition cube_r453 = leftFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(61, 129).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(2.2524F, -5.532F, 16.0633F, 1.089F, 0.1222F, 0.0F));

		PartDefinition cube_r454 = leftFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(49, 102).addBox(-0.5F, -1.0F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0808F, -4.0467F, 15.254F, 0.4781F, 0.1222F, 0.0F));

		PartDefinition cube_r455 = leftFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(130, 80).addBox(-0.3401F, -3.4042F, -4.3077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.4646F, -5.1168F, 10.7032F, -2.8642F, 0.1222F, 0.0F));

		PartDefinition cube_r456 = leftFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(129, 86).addBox(-0.5F, 1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(129, 83).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.2364F, -2.0236F, 15.6762F, -2.4017F, 0.1222F, 0.0F));

		PartDefinition cube_r457 = leftFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(130, 72).addBox(-0.3401F, -5.1653F, 1.8615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.4646F, -5.1168F, 10.7032F, -1.6163F, 0.1222F, 0.0F));

		PartDefinition cube_r458 = leftFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(71, 130).addBox(-0.3401F, -2.7662F, 3.7474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4646F, -5.1168F, 10.7032F, -1.0054F, 0.1222F, 0.0F));

		PartDefinition cube_r459 = leftFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(130, 69).addBox(-0.3401F, 1.3748F, 3.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.4646F, -5.1168F, 10.7032F, 0.0418F, 0.1222F, 0.0F));

		PartDefinition cube_r460 = leftFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(91, 123).addBox(-0.3401F, 0.1911F, 3.5588F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4646F, -5.1168F, 10.7032F, 0.1727F, 0.1222F, 0.0F));

		PartDefinition cube_r461 = leftFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(74, 123).addBox(-0.3401F, -0.7556F, 3.535F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4646F, -5.1168F, 10.7032F, -0.0455F, 0.1222F, 0.0F));

		PartDefinition cube_r462 = leftFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(122, 131).addBox(-0.5F, 0.6F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 131).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.9383F, -4.8845F, 13.6138F, -0.3481F, 0.2094F, 0.0176F));

		PartDefinition cube_r463 = leftFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(131, 114).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.8334F, -5.7051F, 13.052F, -0.959F, 0.2094F, 0.0176F));

		PartDefinition cube_r464 = leftFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(92, 129).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6249F, -5.6642F, 12.0748F, -1.5262F, 0.2094F, 0.0176F));

		PartDefinition cube_r465 = leftFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(129, 105).addBox(-0.5F, -1.7F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(129, 102).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.8042F, -4.1034F, 13.0474F, -2.8352F, 0.2094F, 0.0176F));

		PartDefinition cube_r466 = leftFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(129, 99).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5103F, -3.8617F, 11.6853F, 2.5317F, 0.2094F, 0.0176F));

		PartDefinition cube_r467 = leftFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(129, 96).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4914F, -4.8468F, 11.5145F, -2.9661F, 0.2094F, 0.0176F));

		PartDefinition cube_r468 = leftFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(129, 49).addBox(-0.5309F, -1.0884F, -2.4439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.3146F, -3.7168F, 10.6282F, -2.1807F, 0.2094F, 0.0176F));

		PartDefinition cube_r469 = leftFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(129, 8).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0494F, -1.6613F, 2.2442F, -1.4885F, 0.1572F, -0.001F));

		PartDefinition cube_r470 = leftFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(131, 52).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5768F, -2.5213F, 5.5771F, 1.3041F, 0.1572F, -0.001F));

		PartDefinition cube_r471 = leftFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(51, 131).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.5336F, -1.9904F, 5.3009F, 2.6567F, 0.1572F, -0.001F));

		PartDefinition cube_r472 = leftFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(116, 23).addBox(-0.5F, 0.1F, -2.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F))
				.texOffs(99, 65).addBox(-0.5F, -0.2F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.1514F, -1.1128F, 2.8835F, -2.7974F, 0.1572F, -0.001F));

		PartDefinition cube_r473 = leftFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(66, 129).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1213F, -2.0448F, 2.7F, -0.8776F, 0.1572F, -0.001F));

		PartDefinition cube_r474 = leftFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(116, 19).addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3323F, -2.898F, 4.037F, 0.5623F, 0.1572F, -0.001F));

		PartDefinition cube_r475 = leftFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(12, 114).addBox(-0.6718F, -3.2294F, 3.9211F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1189F, 1.5773F, 1.5638F, 0.4314F, 0.1572F, -0.001F));

		PartDefinition cube_r476 = leftFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(73, 7).addBox(-0.4778F, -1.5173F, -0.0892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0208F, -3.255F, 9.291F, 2.1776F, 0.1834F, 0.0166F));

		PartDefinition cube_r477 = leftFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(22, 128).addBox(-0.2528F, -2.7414F, -2.5455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(63, 49).addBox(-0.4778F, -1.6164F, -1.7205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0208F, -3.255F, 9.291F, 1.2177F, 0.1834F, 0.0166F));

		PartDefinition cube_r478 = leftFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(127, 124).addBox(-0.4778F, 0.4555F, -1.1053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.0208F, -3.255F, 9.291F, -0.0477F, 0.1834F, 0.0166F));

		PartDefinition cube_r479 = leftFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(87, 127).addBox(-0.4778F, -0.7057F, 0.4293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0208F, -3.255F, 9.291F, -1.4876F, 0.1834F, 0.0166F));

		PartDefinition cube_r480 = leftFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(71, 127).addBox(-0.4778F, -1.5633F, -1.3117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0208F, -3.255F, 9.291F, -2.7965F, 0.1834F, 0.0166F));

		PartDefinition cube_r481 = leftFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(127, 46).addBox(-0.4778F, -0.9423F, -1.8101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(102, 94).addBox(-0.4778F, -0.4423F, -1.8101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0208F, -3.255F, 9.291F, 3.0939F, 0.1834F, 0.0166F));

		PartDefinition cube_r482 = leftFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(15, 56).addBox(-0.4778F, -0.8923F, -0.1519F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0208F, -3.255F, 9.291F, 0.4759F, 0.1834F, 0.0166F));

		PartDefinition cube_r483 = leftFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(128, 18).addBox(-0.4778F, 0.7244F, -0.0046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0208F, -3.255F, 9.291F, 1.9158F, 0.1834F, 0.0166F));

		PartDefinition cube_r484 = leftFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(127, 127).addBox(-0.4778F, 0.8026F, -0.5814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0208F, -3.255F, 9.291F, 2.134F, 0.1834F, 0.0166F));

		PartDefinition cube_r485 = leftFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(120, 57).addBox(-0.4778F, -0.874F, -0.7401F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0208F, -3.255F, 9.291F, 0.5632F, 0.1834F, 0.0166F));

		PartDefinition cube_r486 = leftFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(36, 129).addBox(-0.3059F, 1.5935F, 0.1722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(17, 129).addBox(-0.4809F, 1.5935F, 0.1722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3146F, -3.7168F, 10.6282F, 1.7463F, 0.2094F, 0.0176F));

		PartDefinition cube_r487 = leftFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(107, 124).addBox(-0.3912F, 0.2605F, 1.7586F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(42, 102).addBox(-0.3912F, 1.6355F, 1.8586F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1282F, 0.1291F, 0.1222F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5733F, 4.5098F, -16.0191F, 0.0F, 0.0698F, 0.0F));

		PartDefinition cube_r488 = rightFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(121, 4).mirror().addBox(2.7045F, -1.9668F, 0.5267F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1282F, -0.5056F, -1.3682F, 3.0736F));

		PartDefinition cube_r489 = rightFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(108, 100).mirror().addBox(-0.035F, -1.459F, -0.2313F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.1265F, -5.2928F, 13.0894F, -2.8242F, 0.2721F, -1.2425F));

		PartDefinition cube_r490 = rightFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(82, 23).mirror().addBox(-1.1151F, -0.9045F, -0.2313F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-1.1265F, -5.2928F, 13.0894F, -2.7636F, -0.1757F, -0.142F));

		PartDefinition cube_r491 = rightFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(92, 108).mirror().addBox(-0.0416F, -1.7371F, -0.5383F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.1265F, -5.2928F, 13.0894F, -1.433F, -0.1282F, -1.3348F));

		PartDefinition cube_r492 = rightFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(75, 108).mirror().addBox(-1.1151F, -1.7371F, -1.0884F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.1265F, -5.2928F, 13.0894F, -1.6379F, -0.1757F, -0.142F));

		PartDefinition cube_r493 = rightFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(115, 50).mirror().addBox(-0.6592F, 0.7299F, 5.4842F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1282F, -0.3893F, -0.1222F, 0.0F));

		PartDefinition cube_r494 = rightFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(68, 64).mirror().addBox(-1.0F, -3.0F, -1.5F, 2.0F, 6.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.4171F, -3.5077F, 8.9253F, 1.8013F, -0.1581F, -0.0259F));

		PartDefinition cube_r495 = rightFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(127, 130).mirror().addBox(-0.4898F, -1.2528F, -0.4098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.1651F, -0.2151F, 2.2997F, 1.6655F, -0.1502F, 0.0232F));

		PartDefinition cube_r496 = rightFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(133, 32).mirror().addBox(-0.4898F, -0.0434F, -1.3174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1651F, -0.2151F, 2.2997F, 0.4437F, -0.1502F, 0.0232F));

		PartDefinition cube_r497 = rightFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(105, 84).mirror().addBox(-0.5F, -0.6F, -3.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1153F, 0.1373F, 2.6588F, -2.972F, -0.1572F, 0.001F));

		PartDefinition cube_r498 = rightFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(131, 75).mirror().addBox(-0.1F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6436F, -6.5912F, 11.5444F, 0.558F, -0.0412F, 0.4611F));

		PartDefinition cube_r499 = rightFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(117, 124).mirror().addBox(-0.1F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5885F, -6.7163F, 10.7562F, -0.1718F, 0.0027F, 0.4306F));

		PartDefinition cube_r500 = rightFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(65, 132).mirror().addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8496F, -5.3681F, 8.7385F, -2.4994F, -0.2242F, 0.3613F));

		PartDefinition cube_r501 = rightFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(60, 132).mirror().addBox(-0.4F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6717F, -5.2838F, 8.7732F, -2.5164F, -0.1746F, 0.4427F));

		PartDefinition cube_r502 = rightFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(132, 44).mirror().addBox(-0.2F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7643F, -6.1456F, 9.9172F, -2.5F, -0.2243F, 0.3613F));

		PartDefinition cube_r503 = rightFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(36, 132).mirror().addBox(-0.225F, -0.7F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(116, 39).mirror().addBox(-0.1F, -0.9F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5333F, -6.5981F, 9.9669F, -1.4656F, -0.1259F, 0.4349F));

		PartDefinition cube_r504 = rightFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(23, 85).mirror().addBox(-0.1F, -1.9F, -3.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2819F, -5.3923F, 6.3721F, -2.8759F, -0.1983F, 0.4211F));

		PartDefinition cube_r505 = rightFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(122, 124).mirror().addBox(-0.1F, -0.7F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(124, 118).mirror().addBox(-0.1F, -0.7F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.207F, -4.8569F, 5.3008F, 1.9674F, -0.2541F, 0.4015F));

		PartDefinition cube_r506 = rightFace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(125, 0).mirror().addBox(-0.1F, -0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1669F, -4.6865F, 4.7269F, 1.8118F, -0.1737F, 0.3817F));

		PartDefinition cube_r507 = rightFace.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(131, 89).mirror().addBox(-0.1F, 0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(82, 131).mirror().addBox(-0.1F, -0.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1322F, -4.351F, 4.2307F, 0.5337F, -0.2816F, 0.3366F));

		PartDefinition cube_r508 = rightFace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(131, 111).mirror().addBox(-0.1F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1206F, -4.2391F, 4.0653F, 1.0537F, 0.9738F, 1.4677F));

		PartDefinition cube_r509 = rightFace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(59, 110).mirror().addBox(-0.1F, -0.1F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0501F, -4.1117F, 3.0576F, 0.1782F, -0.1161F, 0.241F));

		PartDefinition cube_r510 = rightFace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(125, 34).mirror().addBox(-0.1F, -1.9F, 0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(17, 125).mirror().addBox(-0.1F, -1.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0474F, -2.979F, 1.6622F, -0.9184F, -0.2214F, 0.1939F));

		PartDefinition cube_r511 = rightFace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(125, 30).mirror().addBox(-0.1F, -1.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0762F, -2.2932F, 1.2511F, -2.1319F, -0.2634F, 0.1203F));

		PartDefinition cube_r512 = rightFace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(105, 131).mirror().addBox(-0.1F, -0.1F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(100, 131).mirror().addBox(-0.1F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1007F, -1.5742F, 0.9013F, 2.6702F, -0.273F, 0.1026F));

		PartDefinition cube_r513 = rightFace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(131, 108).mirror().addBox(-0.1F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1016F, -0.7743F, 0.8874F, 1.5524F, -0.3316F, 0.0048F));

		PartDefinition cube_r514 = rightFace.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(43, 87).mirror().addBox(-0.5054F, -1.4608F, -0.9339F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.1651F, -0.2151F, 2.2997F, -1.3278F, -0.1502F, 0.0232F));

		PartDefinition cube_r515 = rightFace.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(5, 120).mirror().addBox(-0.5054F, -0.9022F, -0.5294F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1651F, -0.2151F, 2.2997F, 0.243F, -0.1502F, 0.0232F));

		PartDefinition cube_r516 = rightFace.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(75, 102).mirror().addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3584F, 0.2532F, 5.6468F, 0.1958F, -0.1572F, 0.001F));

		PartDefinition cube_r517 = rightFace.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(93, 22).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0631F, -2.8466F, 3.0077F, 0.8328F, -0.1572F, 0.001F));

		PartDefinition cube_r518 = rightFace.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(93, 16).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3492F, -4.2655F, 5.6186F, 0.4925F, -0.1572F, 0.001F));

		PartDefinition cube_r519 = rightFace.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(53, 124).mirror().addBox(-0.4934F, -1.4846F, -3.0236F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2346F, 0.6872F, 4.9499F, 0.2563F, -0.1398F, -0.0338F));

		PartDefinition cube_r520 = rightFace.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(125, 42).mirror().addBox(-0.4934F, -1.3165F, -2.0131F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2346F, 0.6872F, 4.9499F, 0.3086F, -0.1398F, -0.0338F));

		PartDefinition cube_r521 = rightFace.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(48, 124).mirror().addBox(-0.4934F, -1.0401F, -1.0193F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2346F, 0.6872F, 4.9499F, 0.3959F, -0.1398F, -0.0338F));

		PartDefinition cube_r522 = rightFace.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(124, 8).mirror().addBox(-0.4934F, -0.8658F, -0.0192F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2346F, 0.6872F, 4.9499F, 0.457F, -0.1398F, -0.0338F));

		PartDefinition cube_r523 = rightFace.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(0, 126).mirror().addBox(-0.4934F, -0.1822F, 0.9808F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2346F, 0.6872F, 4.9499F, 0.5268F, -0.1398F, -0.0338F));

		PartDefinition cube_r524 = rightFace.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(126, 4).mirror().addBox(-0.4934F, -0.0181F, 1.9568F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2346F, 0.6872F, 4.9499F, 0.5704F, -0.1398F, -0.0338F));

		PartDefinition cube_r525 = rightFace.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(132, 123).mirror().addBox(-0.6F, -0.35F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(28, 97).mirror().addBox(-0.6F, -1.15F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(120, 30).mirror().addBox(-0.6F, -1.15F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7835F, -0.3205F, 9.5279F, 0.5722F, -0.1676F, -0.0756F));

		PartDefinition cube_r526 = rightFace.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(65, 10).mirror().addBox(-0.55F, -3.1F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9971F, -0.3794F, 9.4415F, 0.2063F, -0.1875F, 0.0078F));

		PartDefinition cube_r527 = rightFace.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(56, 102).mirror().addBox(-0.4527F, -0.0597F, -0.2567F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4787F, -5.5293F, 11.2266F, 0.1667F, -0.2094F, -0.0176F));

		PartDefinition cube_r528 = rightFace.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(106, 34).mirror().addBox(-0.5F, -1.05F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5225F, -1.9705F, 11.9552F, 0.1667F, -0.2094F, -0.0176F));

		PartDefinition cube_r529 = rightFace.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(119, 9).mirror().addBox(-0.4527F, 0.5198F, -0.632F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1282F, 0.1667F, -0.2094F, -0.0176F));

		PartDefinition cube_r530 = rightFace.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(121, 114).mirror().addBox(-0.5F, -1.6F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1802F, -2.8552F, 15.6352F, -2.328F, -0.1535F, 0.0249F));

		PartDefinition cube_r531 = rightFace.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(84, 98).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0223F, -1.2625F, 14.3593F, -2.9389F, -0.1535F, 0.0249F));

		PartDefinition cube_r532 = rightFace.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(98, 79).mirror().addBox(-0.3635F, -2.5079F, 2.167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1282F, -1.4077F, -0.2123F, 0.0F));

		PartDefinition cube_r533 = rightFace.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(33, 108).mirror().addBox(-0.4527F, 2.286F, 1.1647F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1282F, -0.1823F, -0.2094F, -0.0176F));

		PartDefinition cube_r534 = rightFace.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(68, 108).mirror().addBox(-0.5F, -1.3F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.9554F, -5.081F, 14.2325F, -1.8344F, -0.1222F, 0.0F));

		PartDefinition cube_r535 = rightFace.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(16, 132).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1469F, -6.0335F, 15.2047F, -1.6163F, -0.1222F, 0.0F));

		PartDefinition cube_r536 = rightFace.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(87, 130).mirror().addBox(-0.6088F, -5.0234F, 3.2478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3896F, -3.3168F, 9.9282F, -0.5254F, -0.1222F, 0.0F));

		PartDefinition cube_r537 = rightFace.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(61, 129).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-2.2524F, -5.532F, 16.0633F, 1.089F, -0.1222F, 0.0F));

		PartDefinition cube_r538 = rightFace.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(49, 102).mirror().addBox(-0.5F, -1.0F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0808F, -4.0467F, 15.254F, 0.4781F, -0.1222F, 0.0F));

		PartDefinition cube_r539 = rightFace.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(130, 80).mirror().addBox(-0.6599F, -3.4042F, -4.3077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.1168F, 10.7032F, -2.8642F, -0.1222F, 0.0F));

		PartDefinition cube_r540 = rightFace.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(129, 86).mirror().addBox(-0.5F, 1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(129, 83).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.2364F, -2.0236F, 15.6762F, -2.4017F, -0.1222F, 0.0F));

		PartDefinition cube_r541 = rightFace.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(130, 72).mirror().addBox(-0.6599F, -5.1653F, 1.8615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.1168F, 10.7032F, -1.6163F, -0.1222F, 0.0F));

		PartDefinition cube_r542 = rightFace.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(71, 130).mirror().addBox(-0.6599F, -2.7662F, 3.7474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.1168F, 10.7032F, -1.0054F, -0.1222F, 0.0F));

		PartDefinition cube_r543 = rightFace.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(130, 69).mirror().addBox(-0.6599F, 1.3748F, 3.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.1168F, 10.7032F, 0.0418F, -0.1222F, 0.0F));

		PartDefinition cube_r544 = rightFace.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(91, 123).mirror().addBox(-0.6599F, 0.1911F, 3.5588F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.1168F, 10.7032F, 0.1727F, -0.1222F, 0.0F));

		PartDefinition cube_r545 = rightFace.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(74, 123).mirror().addBox(-0.6599F, -0.7556F, 3.535F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.1168F, 10.7032F, -0.0455F, -0.1222F, 0.0F));

		PartDefinition cube_r546 = rightFace.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(122, 131).mirror().addBox(-0.5F, 0.6F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(117, 131).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9383F, -4.8845F, 13.6138F, -0.3481F, -0.2094F, -0.0176F));

		PartDefinition cube_r547 = rightFace.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(131, 114).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8334F, -5.7051F, 13.052F, -0.959F, -0.2094F, -0.0176F));

		PartDefinition cube_r548 = rightFace.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(92, 129).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6249F, -5.6642F, 12.0748F, -1.5262F, -0.2094F, -0.0176F));

		PartDefinition cube_r549 = rightFace.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(129, 105).mirror().addBox(-0.5F, -1.7F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(129, 102).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8042F, -4.1034F, 13.0474F, -2.8352F, -0.2094F, -0.0176F));

		PartDefinition cube_r550 = rightFace.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(129, 99).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5103F, -3.8617F, 11.6853F, 2.5317F, -0.2094F, -0.0176F));

		PartDefinition cube_r551 = rightFace.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(129, 96).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4914F, -4.8468F, 11.5145F, -2.9661F, -0.2094F, -0.0176F));

		PartDefinition cube_r552 = rightFace.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(129, 49).mirror().addBox(-0.4691F, -1.0884F, -2.4439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3146F, -3.7168F, 10.6282F, -2.1807F, -0.2094F, -0.0176F));

		PartDefinition cube_r553 = rightFace.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(129, 8).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0494F, -1.6613F, 2.2442F, -1.4885F, -0.1572F, 0.001F));

		PartDefinition cube_r554 = rightFace.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(131, 52).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5768F, -2.5213F, 5.5771F, 1.3041F, -0.1572F, 0.001F));

		PartDefinition cube_r555 = rightFace.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(51, 131).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.5336F, -1.9904F, 5.3009F, 2.6567F, -0.1572F, 0.001F));

		PartDefinition cube_r556 = rightFace.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(116, 23).mirror().addBox(-0.5F, 0.1F, -2.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(99, 65).mirror().addBox(-0.5F, -0.2F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.1514F, -1.1128F, 2.8835F, -2.7974F, -0.1572F, 0.001F));

		PartDefinition cube_r557 = rightFace.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(66, 129).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1213F, -2.0448F, 2.7F, -0.8776F, -0.1572F, 0.001F));

		PartDefinition cube_r558 = rightFace.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(116, 19).mirror().addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3323F, -2.898F, 4.037F, 0.5623F, -0.1572F, 0.001F));

		PartDefinition cube_r559 = rightFace.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(12, 114).mirror().addBox(-0.3282F, -3.2294F, 3.9211F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1189F, 1.5773F, 1.5638F, 0.4314F, -0.1572F, 0.001F));

		PartDefinition cube_r560 = rightFace.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(73, 7).mirror().addBox(-0.5222F, -1.5173F, -0.0892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0208F, -3.255F, 9.291F, 2.1776F, -0.1834F, -0.0166F));

		PartDefinition cube_r561 = rightFace.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(22, 128).mirror().addBox(-0.7472F, -2.7414F, -2.5455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(63, 49).mirror().addBox(-0.5222F, -1.6164F, -1.7205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0208F, -3.255F, 9.291F, 1.2177F, -0.1834F, -0.0166F));

		PartDefinition cube_r562 = rightFace.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(127, 124).mirror().addBox(-0.5222F, 0.4555F, -1.1053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0208F, -3.255F, 9.291F, -0.0477F, -0.1834F, -0.0166F));

		PartDefinition cube_r563 = rightFace.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(87, 127).mirror().addBox(-0.5222F, -0.7057F, 0.4293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0208F, -3.255F, 9.291F, -1.4876F, -0.1834F, -0.0166F));

		PartDefinition cube_r564 = rightFace.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(71, 127).mirror().addBox(-0.5222F, -1.5633F, -1.3117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0208F, -3.255F, 9.291F, -2.7965F, -0.1834F, -0.0166F));

		PartDefinition cube_r565 = rightFace.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(127, 46).mirror().addBox(-0.5222F, -0.9423F, -1.8101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(102, 94).mirror().addBox(-0.5222F, -0.4423F, -1.8101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0208F, -3.255F, 9.291F, 3.0939F, -0.1834F, -0.0166F));

		PartDefinition cube_r566 = rightFace.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(15, 56).mirror().addBox(-0.5222F, -0.8923F, -0.1519F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0208F, -3.255F, 9.291F, 0.4759F, -0.1834F, -0.0166F));

		PartDefinition cube_r567 = rightFace.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(128, 18).mirror().addBox(-0.5222F, 0.7244F, -0.0046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0208F, -3.255F, 9.291F, 1.9158F, -0.1834F, -0.0166F));

		PartDefinition cube_r568 = rightFace.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(127, 127).mirror().addBox(-0.5222F, 0.8026F, -0.5814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0208F, -3.255F, 9.291F, 2.134F, -0.1834F, -0.0166F));

		PartDefinition cube_r569 = rightFace.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(120, 57).mirror().addBox(-0.5222F, -0.874F, -0.7401F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0208F, -3.255F, 9.291F, 0.5632F, -0.1834F, -0.0166F));

		PartDefinition cube_r570 = rightFace.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(36, 129).mirror().addBox(-0.6941F, 1.5935F, 0.1722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(17, 129).mirror().addBox(-0.5191F, 1.5935F, 0.1722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3146F, -3.7168F, 10.6282F, 1.7463F, -0.2094F, -0.0176F));

		PartDefinition cube_r571 = rightFace.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(107, 124).mirror().addBox(-0.6088F, 0.2605F, 1.7586F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(42, 102).mirror().addBox(-0.6088F, 1.6355F, 1.8586F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1282F, 0.1291F, -0.1222F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9351F, 1.0489F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r572 = jaw.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(114, 15).mirror().addBox(0.309F, -1.5224F, -1.8843F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(114, 94).mirror().addBox(0.309F, -1.1224F, -1.8843F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -1.1567F, 0.0175F, -0.1047F, 0.0F));

		PartDefinition cube_r573 = jaw.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(97, 121).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4729F, 0.4325F, -3.092F, -0.0175F, -0.1047F, 0.0F));

		PartDefinition cube_r574 = jaw.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(120, 0).mirror().addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3814F, 0.9078F, -3.9627F, -0.192F, -0.1047F, 0.0F));

		PartDefinition cube_r575 = jaw.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(26, 108).mirror().addBox(0.309F, 2.9364F, -2.0322F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -1.1567F, -1.4573F, -0.1047F, 0.0F));

		PartDefinition cube_r576 = jaw.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(128, 93).mirror().addBox(0.309F, -1.5909F, -5.5652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(70, 133).mirror().addBox(0.284F, -0.5159F, -3.9652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(87, 133).mirror().addBox(0.284F, -0.5159F, -2.9652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -1.1567F, 0.0262F, -0.1047F, 0.0F));

		PartDefinition cube_r577 = jaw.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(101, 128).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1038F, -0.0064F, -6.6041F, 0.1658F, -0.1047F, 0.0F));

		PartDefinition cube_r578 = jaw.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(115, 102).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0225F, 0.153F, -7.5663F, 0.336F, -0.1134F, 0.0F));

		PartDefinition cube_r579 = jaw.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(132, 132).mirror().addBox(0.3106F, -0.9626F, -14.9643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(133, 17).mirror().addBox(0.3106F, -1.1626F, -13.9643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(62, 121).mirror().addBox(0.3106F, -1.2626F, -12.9643F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(121, 77).mirror().addBox(0.3106F, -1.2626F, -12.0643F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.5567F, 0.0131F, -0.1004F, 0.0F));

		PartDefinition cube_r580 = jaw.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(121, 110).mirror().addBox(0.3106F, -2.1805F, -10.9577F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(42, 128).mirror().addBox(0.3106F, -2.1805F, -9.9577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(47, 128).mirror().addBox(0.3106F, -2.1805F, -8.9577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.5567F, 0.1004F, -0.1004F, 0.0F));

		PartDefinition cube_r581 = jaw.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(19, 97).mirror().addBox(-0.5F, -0.575F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4663F, 1.8715F, -13.212F, 0.0785F, -0.1004F, 0.0F));

		PartDefinition cube_r582 = jaw.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(113, 60).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3971F, 1.2102F, -14.3764F, -0.0175F, -0.1004F, 0.0F));

		PartDefinition cube_r583 = jaw.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(133, 58).mirror().addBox(0.3106F, 8.9812F, -14.0604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-2.8148F, 1.4655F, 1.5433F, -0.576F, -0.1004F, 0.0F));

		PartDefinition cube_r584 = jaw.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(133, 61).mirror().addBox(0.3106F, 0.4578F, -16.868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(133, 64).mirror().addBox(0.3106F, 0.4578F, -17.168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.8148F, 1.4655F, 1.5433F, -0.0436F, -0.1004F, 0.0F));

		PartDefinition cube_r585 = jaw.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(92, 113).mirror().addBox(-0.5F, -0.75F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7656F, 1.7314F, -10.1897F, 0.1876F, -0.1004F, 0.0F));

		PartDefinition cube_r586 = jaw.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(113, 35).mirror().addBox(0.309F, -1.5151F, -0.5754F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -1.1567F, 0.1396F, -0.1047F, 0.0F));

		PartDefinition cube_r587 = jaw.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(57, 88).mirror().addBox(0.309F, -0.9877F, -2.1867F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -1.1567F, 0.4451F, -0.1047F, 0.0F));

		PartDefinition cube_r588 = jaw.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(106, 128).mirror().addBox(0.309F, 0.094F, -3.7521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -1.1567F, 0.0611F, -0.1047F, 0.0F));

		PartDefinition cube_r589 = jaw.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(93, 91).mirror().addBox(0.309F, -0.4011F, -6.4692F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -1.1567F, -0.0785F, -0.1047F, 0.0F));

		PartDefinition cube_r590 = jaw.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(114, 5).mirror().addBox(0.2323F, 0.9827F, -8.1824F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false)
				.texOffs(66, 113).mirror().addBox(0.2323F, 0.4827F, -8.1824F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -1.1567F, -0.1396F, -0.1134F, 0.0F));

		PartDefinition cube_r591 = jaw.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(43, 91).mirror().addBox(0.3106F, -0.5578F, -11.3982F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -1.1567F, 0.0698F, -0.1004F, 0.0F));

		PartDefinition cube_r592 = jaw.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(126, 113).mirror().addBox(0.3106F, 10.8091F, -1.5122F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -1.1567F, -1.4137F, -0.1004F, 0.0F));

		PartDefinition cube_r593 = jaw.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(108, 45).mirror().addBox(0.8838F, 0.8123F, -4.3129F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5148F, 1.4155F, -1.2567F, 0.0F, -0.4102F, 0.0F));

		PartDefinition cube_r594 = jaw.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(112, 55).mirror().addBox(1.2518F, 0.3336F, -1.5632F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5148F, 1.4155F, -1.2567F, 0.2853F, -0.2014F, 0.0665F));

		PartDefinition cube_r595 = jaw.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(114, 77).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-1.4051F, 2.6755F, -3.7376F, -1.1606F, -0.1047F, 0.0F));

		PartDefinition cube_r596 = jaw.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(133, 20).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3663F, 2.7232F, -14.6826F, -1.7541F, -0.1004F, 0.0F));

		PartDefinition cube_r597 = jaw.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(112, 55).addBox(-1.2518F, 0.3336F, -1.5632F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5148F, 1.4155F, -1.2567F, 0.2853F, 0.2014F, -0.0665F));

		PartDefinition cube_r598 = jaw.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(108, 45).addBox(-0.8838F, 0.8123F, -4.3129F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5148F, 1.4155F, -1.2567F, 0.0F, 0.4102F, 0.0F));

		PartDefinition cube_r599 = jaw.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(126, 113).addBox(-1.3106F, 10.8091F, -1.5122F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -1.1567F, -1.4137F, 0.1004F, 0.0F));

		PartDefinition cube_r600 = jaw.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(43, 91).addBox(-1.3106F, -0.5578F, -11.3982F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -1.1567F, 0.0698F, 0.1004F, 0.0F));

		PartDefinition cube_r601 = jaw.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(66, 113).addBox(-1.2323F, 0.4827F, -8.1824F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F))
				.texOffs(114, 5).addBox(-1.2323F, 0.9827F, -8.1824F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -1.1567F, -0.1396F, 0.1134F, 0.0F));

		PartDefinition cube_r602 = jaw.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(93, 91).addBox(-1.309F, -0.4011F, -6.4692F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -1.1567F, -0.0785F, 0.1047F, 0.0F));

		PartDefinition cube_r603 = jaw.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(114, 77).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(1.4051F, 2.6755F, -3.7376F, -1.1606F, 0.1047F, 0.0F));

		PartDefinition cube_r604 = jaw.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(106, 128).addBox(-1.309F, 0.094F, -3.7521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -1.1567F, 0.0611F, 0.1047F, 0.0F));

		PartDefinition cube_r605 = jaw.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(57, 88).addBox(-1.309F, -0.9877F, -2.1867F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -1.1567F, 0.4451F, 0.1047F, 0.0F));

		PartDefinition cube_r606 = jaw.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(113, 35).addBox(-1.309F, -1.5151F, -0.5754F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -1.1567F, 0.1396F, 0.1047F, 0.0F));

		PartDefinition cube_r607 = jaw.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(92, 113).addBox(-0.5F, -0.75F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7656F, 1.7314F, -10.1897F, 0.1876F, 0.1004F, 0.0F));

		PartDefinition cube_r608 = jaw.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(133, 64).addBox(-1.3106F, 0.4578F, -17.168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(133, 61).addBox(-1.3106F, 0.4578F, -16.868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.8148F, 1.4655F, 1.5433F, -0.0436F, 0.1004F, 0.0F));

		PartDefinition cube_r609 = jaw.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(133, 20).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3663F, 2.7232F, -14.6826F, -1.7541F, 0.1004F, 0.0F));

		PartDefinition cube_r610 = jaw.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(133, 58).addBox(-1.3106F, 8.9812F, -14.0604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(2.8148F, 1.4655F, 1.5433F, -0.576F, 0.1004F, 0.0F));

		PartDefinition cube_r611 = jaw.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(113, 60).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3971F, 1.2102F, -14.3764F, -0.0175F, 0.1004F, 0.0F));

		PartDefinition cube_r612 = jaw.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(19, 97).addBox(-0.5F, -0.575F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4663F, 1.8715F, -13.212F, 0.0785F, 0.1004F, 0.0F));

		PartDefinition cube_r613 = jaw.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(47, 128).addBox(-1.3106F, -2.1805F, -8.9577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(42, 128).addBox(-1.3106F, -2.1805F, -9.9577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(121, 110).addBox(-1.3106F, -2.1805F, -10.9577F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.5567F, 0.1004F, 0.1004F, 0.0F));

		PartDefinition cube_r614 = jaw.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(121, 77).addBox(-1.3106F, -1.2626F, -12.0643F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(62, 121).addBox(-1.3106F, -1.2626F, -12.9643F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(133, 17).addBox(-1.3106F, -1.1626F, -13.9643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(132, 132).addBox(-1.3106F, -0.9626F, -14.9643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.5567F, 0.0131F, 0.1004F, 0.0F));

		PartDefinition cube_r615 = jaw.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(115, 102).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0225F, 0.153F, -7.5663F, 0.336F, 0.1134F, 0.0F));

		PartDefinition cube_r616 = jaw.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(101, 128).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1038F, -0.0064F, -6.6041F, 0.1658F, 0.1047F, 0.0F));

		PartDefinition cube_r617 = jaw.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(87, 133).addBox(-1.284F, -0.5159F, -2.9652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(70, 133).addBox(-1.284F, -0.5159F, -3.9652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(128, 93).addBox(-1.309F, -1.5909F, -5.5652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -1.1567F, 0.0262F, 0.1047F, 0.0F));

		PartDefinition cube_r618 = jaw.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(26, 108).addBox(-1.309F, 2.9364F, -2.0322F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -1.1567F, -1.4573F, 0.1047F, 0.0F));

		PartDefinition cube_r619 = jaw.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(120, 0).addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3814F, 0.9078F, -3.9627F, -0.192F, 0.1047F, 0.0F));

		PartDefinition cube_r620 = jaw.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(97, 121).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4729F, 0.4325F, -3.092F, -0.0175F, 0.1047F, 0.0F));

		PartDefinition cube_r621 = jaw.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(114, 94).addBox(-1.309F, -1.1224F, -1.8843F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F))
				.texOffs(114, 15).addBox(-1.309F, -1.5224F, -1.8843F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -1.1567F, 0.0175F, 0.1047F, 0.0F));

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