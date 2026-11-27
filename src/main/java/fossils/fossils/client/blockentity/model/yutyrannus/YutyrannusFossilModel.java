package fossils.fossils.client.blockentity.model.yutyrannus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class YutyrannusFossilModel extends SkullModelBase {
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

	public YutyrannusFossilModel(ModelPart root) {
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -39.8341F, 3.8699F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(48, 30).addBox(-0.003F, 1.6F, -4.95F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.88F, 1.6382F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(72, 47).addBox(0.0F, -4.5F, -5.0F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7557F, 7.49F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.9822F, 0.3974F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8924F, 3.4898F, 0.3867F, -0.0873F, 0.0F, 0.1309F));

		PartDefinition cube_r4 = bone3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(7, 111).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.4941F, -8.4392F, 2.7366F, -0.3092F, -0.0321F, -0.4016F));

		PartDefinition cube_r5 = bone3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(63, 30).addBox(-0.5827F, 3.7931F, -7.0175F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(67, 107).addBox(-0.5827F, 0.7931F, -4.5175F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5815F, -8.6405F, 5.3682F, -0.222F, -0.0321F, -0.4016F));

		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(121, 50).addBox(-0.5F, -0.8F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0658F, -4.8347F, 3.9432F, 0.6876F, -0.0327F, -0.4104F));

		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(33, 73).addBox(-0.5F, -1.4F, -3.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.2469F, -5.4363F, 5.3715F, 0.1203F, -0.0327F, -0.4104F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(113, 131).addBox(-0.5F, -0.925F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6082F, -6.1131F, 6.6109F, -0.1982F, -0.0391F, -0.4053F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(97, 83).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8785F, -6.6144F, 7.9054F, -0.3727F, -0.0391F, -0.4053F));

		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(131, 132).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4279F, -3.4356F, 2.5853F, -0.1052F, 0.0639F, 0.0248F));

		PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(103, 127).addBox(-1.1984F, -1.4223F, 0.3576F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9376F, -0.5059F, 2.7014F, 0.6772F, -0.0583F, 0.1644F));

		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(138, 24).addBox(0.2879F, 0.8531F, -7.4037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(138, 21).addBox(0.2879F, 0.8531F, -6.7037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0771F, 1.5612F, 5.4517F, 2.5326F, 0.0795F, 0.0425F));

		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(23, 113).addBox(0.2879F, -0.1032F, 0.0928F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0771F, 1.5612F, 5.4517F, 1.0927F, 0.0795F, 0.0425F));

		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(58, 138).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0905F, 1.2919F, 3.0523F, -1.4172F, -0.0583F, 0.1644F));

		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(138, 49).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2291F, 1.8313F, 3.8828F, -2.159F, -0.0583F, 0.1644F));

		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(138, 37).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3173F, 2.0136F, 4.8621F, 2.9461F, -0.0583F, 0.1644F));

		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(25, 138).addBox(-1.1984F, -0.8223F, -0.2924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4497F, 1.4545F, 5.4525F, 2.1171F, -0.0583F, 0.1644F));

		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(33, 125).addBox(-1.1984F, -3.8223F, -0.1424F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4497F, 1.4545F, 5.4525F, 1.1572F, -0.0583F, 0.1644F));

		PartDefinition cube_r19 = bone3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(98, 127).addBox(-1.1984F, 0.5777F, 0.1576F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9376F, -0.5059F, 2.7014F, 0.8517F, -0.0583F, 0.1644F));

		PartDefinition cube_r20 = bone3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(65, 47).addBox(-0.5F, -1.5F, -1.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6541F, 10.0511F, -6.1959F, -2.3117F, 0.0461F, -0.1729F));

		PartDefinition cube_r21 = bone3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(125, 72).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0134F)), PartPose.offsetAndRotation(0.861F, 11.952F, -8.864F, -0.7321F, 0.0461F, -0.1729F));

		PartDefinition cube_r22 = bone3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(137, 15).addBox(-1.1315F, 3.7023F, 9.3407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0384F, 1.7803F, -3.8473F, -1.6048F, 0.0461F, -0.1729F));

		PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(62, 120).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0456F, 11.1514F, -1.9418F, -1.6572F, 0.0461F, -0.1729F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(61, 75).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0247F, 11.8169F, -4.867F, -1.3517F, 0.0461F, -0.1729F));

		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(11, 59).addBox(-0.5F, -3.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.9115F, 11.9722F, -7.8608F, -1.5263F, 0.0461F, -0.1729F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(49, 121).addBox(-1.1315F, 6.2661F, 0.0118F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0384F, 1.7803F, -3.8473F, -0.4791F, 0.0461F, -0.1729F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(125, 62).addBox(-1.1315F, 5.6514F, -3.4111F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0384F, 1.7803F, -3.8473F, 0.1318F, 0.0461F, -0.1729F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(19, 125).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.262F, 4.4648F, -4.9283F, -0.3045F, 0.0461F, -0.1729F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 125).addBox(-1.1315F, 2.8329F, -0.532F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0384F, 1.7803F, -3.8473F, -0.3918F, 0.0461F, -0.1729F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(121, 125).addBox(-0.6064F, -2.0412F, -0.5609F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0384F, 1.7803F, -3.8473F, -0.2974F, 0.0661F, 0.018F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(40, 107).addBox(-0.6064F, -2.987F, -0.3435F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0384F, 1.7803F, -3.8473F, -0.4108F, 0.0661F, 0.018F));

		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(64, 113).addBox(-0.6064F, -1.987F, -0.5435F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0384F, 1.7803F, -3.8473F, -0.3934F, 0.0661F, 0.018F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(113, 127).addBox(-0.5F, -0.8F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.0506F, -0.6626F, -3.0846F, -0.0268F, 0.0661F, 0.018F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(57, 110).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0921F, -3.7748F, -2.7956F, -0.4106F, 0.0639F, 0.0248F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(40, 53).addBox(-0.5F, -1.3F, -3.4F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2691F, -2.4134F, 0.4992F, 0.1566F, 0.0639F, 0.0248F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(67, 0).addBox(-0.3844F, -0.3139F, -2.3767F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1504F, -4.2868F, -0.272F, -0.1925F, 0.0639F, 0.0248F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(108, 127).addBox(-0.3844F, -1.1139F, -2.7767F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1504F, -4.2868F, -0.272F, 0.0257F, 0.0639F, 0.0248F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(107, 107).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0367F, -6.3444F, -3.503F, 1.7091F, -0.3037F, -0.3808F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(134, 84).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0185F, -5.5114F, -2.461F, 0.6619F, -0.3037F, -0.3808F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(27, 96).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.3063F, -5.2754F, -5.9967F, 2.1018F, -0.3037F, -0.3808F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(105, 113).addBox(-0.5F, -1.2844F, -0.4469F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8685F, -5.7955F, -5.3164F, 1.5346F, -0.3037F, -0.3808F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(137, 66).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2847F, -8.216F, -6.4575F, 0.8364F, -0.3037F, -0.3808F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(93, 127).addBox(-0.5F, -2.7304F, 0.2166F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8685F, -5.7955F, -5.3164F, 0.531F, -0.3037F, -0.3808F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(100, 118).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.8503F, -8.789F, -3.7745F, 1.7091F, -0.3037F, -0.3808F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(107, 118).addBox(-0.5F, -2.9698F, 0.3392F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8685F, -5.7955F, -5.3164F, 0.2256F, -0.3037F, -0.3808F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(77, 87).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.6056F, -8.859F, 0.8252F, 0.0311F, -0.0321F, -0.4016F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8924F, 3.4898F, 0.3867F, -0.0873F, 0.0F, -0.1309F));

		PartDefinition cube_r47 = bone5.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(7, 111).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.4941F, -8.4392F, 2.7366F, -0.3092F, 0.0321F, 0.4016F));

		PartDefinition cube_r48 = bone5.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(63, 30).mirror().addBox(-0.4173F, 3.7931F, -7.0175F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(67, 107).mirror().addBox(-0.4173F, 0.7931F, -4.5175F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5815F, -8.6405F, 5.3682F, -0.222F, 0.0321F, 0.4016F));

		PartDefinition cube_r49 = bone5.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(121, 50).mirror().addBox(-0.5F, -0.8F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0658F, -4.8347F, 3.9432F, 0.6876F, 0.0327F, 0.4104F));

		PartDefinition cube_r50 = bone5.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(33, 73).mirror().addBox(-0.5F, -1.4F, -3.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.2469F, -5.4363F, 5.3715F, 0.1203F, 0.0327F, 0.4104F));

		PartDefinition cube_r51 = bone5.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(113, 131).mirror().addBox(-0.5F, -0.925F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.6082F, -6.1131F, 6.6109F, -0.1982F, 0.0391F, 0.4053F));

		PartDefinition cube_r52 = bone5.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(97, 83).mirror().addBox(-0.5F, 0.0F, -4.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8785F, -6.6144F, 7.9054F, -0.3727F, 0.0391F, 0.4053F));

		PartDefinition cube_r53 = bone5.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(131, 132).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4279F, -3.4356F, 2.5853F, -0.1052F, -0.0639F, -0.0248F));

		PartDefinition cube_r54 = bone5.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(103, 127).mirror().addBox(0.1983F, -1.4223F, 0.3576F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9376F, -0.5059F, 2.7014F, 0.6772F, 0.0583F, -0.1644F));

		PartDefinition cube_r55 = bone5.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(138, 24).mirror().addBox(-1.2879F, 0.8531F, -7.4037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(138, 21).mirror().addBox(-1.2879F, 0.8531F, -6.7037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0771F, 1.5612F, 5.4517F, 2.5326F, -0.0795F, -0.0425F));

		PartDefinition cube_r56 = bone5.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(23, 113).mirror().addBox(-1.2879F, -0.1032F, 0.0928F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.0771F, 1.5612F, 5.4517F, 1.0927F, -0.0795F, -0.0425F));

		PartDefinition cube_r57 = bone5.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(58, 138).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0905F, 1.2919F, 3.0523F, -1.4172F, 0.0583F, -0.1644F));

		PartDefinition cube_r58 = bone5.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(138, 49).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2291F, 1.8313F, 3.8828F, -2.159F, 0.0583F, -0.1644F));

		PartDefinition cube_r59 = bone5.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(138, 37).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.3173F, 2.0136F, 4.8621F, 2.9461F, 0.0583F, -0.1644F));

		PartDefinition cube_r60 = bone5.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(25, 138).mirror().addBox(0.1984F, -0.8223F, -0.2924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4497F, 1.4545F, 5.4525F, 2.1171F, 0.0583F, -0.1644F));

		PartDefinition cube_r61 = bone5.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(33, 125).mirror().addBox(0.1984F, -3.8223F, -0.1424F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4497F, 1.4545F, 5.4525F, 1.1572F, 0.0583F, -0.1644F));

		PartDefinition cube_r62 = bone5.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(98, 127).mirror().addBox(0.1983F, 0.5777F, 0.1576F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9376F, -0.5059F, 2.7014F, 0.8517F, 0.0583F, -0.1644F));

		PartDefinition cube_r63 = bone5.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(65, 47).mirror().addBox(-0.5F, -1.5F, -1.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6541F, 10.0511F, -6.1959F, -2.3117F, -0.0461F, 0.1729F));

		PartDefinition cube_r64 = bone5.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(125, 72).mirror().addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0134F)).mirror(false), PartPose.offsetAndRotation(-0.861F, 11.952F, -8.864F, -0.7321F, -0.0461F, 0.1729F));

		PartDefinition cube_r65 = bone5.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(137, 15).mirror().addBox(0.1314F, 3.7023F, 9.3407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0384F, 1.7803F, -3.8473F, -1.6048F, -0.0461F, 0.1729F));

		PartDefinition cube_r66 = bone5.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(62, 120).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0456F, 11.1514F, -1.9418F, -1.6572F, -0.0461F, 0.1729F));

		PartDefinition cube_r67 = bone5.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(61, 75).mirror().addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0247F, 11.8169F, -4.867F, -1.3517F, -0.0461F, 0.1729F));

		PartDefinition cube_r68 = bone5.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(11, 59).mirror().addBox(-0.5F, -3.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9115F, 11.9722F, -7.8608F, -1.5263F, -0.0461F, 0.1729F));

		PartDefinition cube_r69 = bone5.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(49, 121).mirror().addBox(0.1314F, 6.2661F, 0.0118F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0384F, 1.7803F, -3.8473F, -0.4791F, -0.0461F, 0.1729F));

		PartDefinition cube_r70 = bone5.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(125, 62).mirror().addBox(0.1314F, 5.6514F, -3.4111F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0384F, 1.7803F, -3.8473F, 0.1318F, -0.0461F, 0.1729F));

		PartDefinition cube_r71 = bone5.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(19, 125).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.262F, 4.4648F, -4.9283F, -0.3045F, -0.0461F, 0.1729F));

		PartDefinition cube_r72 = bone5.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 125).mirror().addBox(0.1314F, 2.8329F, -0.532F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0384F, 1.7803F, -3.8473F, -0.3918F, -0.0461F, 0.1729F));

		PartDefinition cube_r73 = bone5.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(121, 125).mirror().addBox(-0.3936F, -2.0412F, -0.5609F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0384F, 1.7803F, -3.8473F, -0.2974F, -0.0661F, -0.018F));

		PartDefinition cube_r74 = bone5.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(40, 107).mirror().addBox(-0.3936F, -2.987F, -0.3435F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0384F, 1.7803F, -3.8473F, -0.4108F, -0.0661F, -0.018F));

		PartDefinition cube_r75 = bone5.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(64, 113).mirror().addBox(-0.3936F, -1.987F, -0.5435F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0384F, 1.7803F, -3.8473F, -0.3934F, -0.0661F, -0.018F));

		PartDefinition cube_r76 = bone5.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(113, 127).mirror().addBox(-0.5F, -0.8F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.0506F, -0.6626F, -3.0846F, -0.0268F, -0.0661F, -0.018F));

		PartDefinition cube_r77 = bone5.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(57, 110).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0921F, -3.7748F, -2.7956F, -0.4106F, -0.0639F, -0.0248F));

		PartDefinition cube_r78 = bone5.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(40, 53).mirror().addBox(-0.5F, -1.3F, -3.4F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2691F, -2.4134F, 0.4992F, 0.1566F, -0.0639F, -0.0248F));

		PartDefinition cube_r79 = bone5.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(67, 0).mirror().addBox(-0.6156F, -0.3139F, -2.3767F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1504F, -4.2868F, -0.272F, -0.1925F, -0.0639F, -0.0248F));

		PartDefinition cube_r80 = bone5.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(108, 127).mirror().addBox(-0.6156F, -1.1139F, -2.7767F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1504F, -4.2868F, -0.272F, 0.0257F, -0.0639F, -0.0248F));

		PartDefinition cube_r81 = bone5.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(107, 107).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0367F, -6.3444F, -3.503F, 1.7091F, 0.3037F, 0.3808F));

		PartDefinition cube_r82 = bone5.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(134, 84).mirror().addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.0185F, -5.5114F, -2.461F, 0.6619F, 0.3037F, 0.3808F));

		PartDefinition cube_r83 = bone5.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(27, 96).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.3063F, -5.2754F, -5.9967F, 2.1018F, 0.3037F, 0.3808F));

		PartDefinition cube_r84 = bone5.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(105, 113).mirror().addBox(-0.5F, -1.2844F, -0.4469F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8685F, -5.7955F, -5.3164F, 1.5346F, 0.3037F, 0.3808F));

		PartDefinition cube_r85 = bone5.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(137, 66).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2847F, -8.216F, -6.4575F, 0.8364F, 0.3037F, 0.3808F));

		PartDefinition cube_r86 = bone5.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(93, 127).mirror().addBox(-0.5F, -2.7304F, 0.2166F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8685F, -5.7955F, -5.3164F, 0.531F, 0.3037F, 0.3808F));

		PartDefinition cube_r87 = bone5.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(100, 118).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.8503F, -8.789F, -3.7745F, 1.7091F, 0.3037F, 0.3808F));

		PartDefinition cube_r88 = bone5.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(107, 118).mirror().addBox(-0.5F, -2.9698F, 0.3392F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8685F, -5.7955F, -5.3164F, 0.2256F, 0.3037F, 0.3808F));

		PartDefinition cube_r89 = bone5.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(77, 87).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.6056F, -8.859F, 0.8252F, 0.0311F, 0.0321F, 0.4016F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(73, 80).addBox(-0.4F, -1.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, -0.7797F, 1.2672F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg1.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(81, 64).addBox(-1.5F, -0.1694F, -1.9209F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 15.4296F, -0.6236F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(111, 27).addBox(-1.0F, -2.5F, -0.45F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5F, 8.6871F, -0.9976F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(80, 7).addBox(-1.0F, -1.0943F, -0.7306F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(119, 112).addBox(-1.0F, -2.0943F, 0.1694F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5F, 15.4296F, -0.6236F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(42, 94).addBox(-1.0F, -2.0F, -1.45F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5F, 12.1113F, -1.1283F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg1.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(27, 100).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.497F, 13.059F, -2.8037F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg1.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(93, 123).addBox(-5.1F, 1.6099F, -0.2219F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.597F, 9.4535F, -2.5189F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg1.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 110).addBox(-5.1F, 0.1099F, -0.0219F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.6F, 6.992F, -2.1604F, -0.144F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg1.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(128, 91).addBox(-0.5F, -0.3967F, -0.7826F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 2.9817F, 0.1705F, -2.522F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg1.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(54, 121).addBox(-0.5F, -0.4085F, -0.1934F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5F, 2.9817F, 0.1705F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg1.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(111, 11).addBox(-5.1F, -0.9707F, -0.2308F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.6F, 4.1851F, -1.4601F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg1.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(74, 106).addBox(-1.1F, -0.4F, -1.7F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(20, 96).addBox(-1.1F, -0.4F, -1.2F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.6F, 1.9376F, 1.0007F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg1.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(103, 44).addBox(-1.1F, -0.4F, -2.4F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.6F, 1.9376F, 1.0007F, -0.096F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 16.9939F, -0.1717F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(120, 32).addBox(0.9F, -2.4F, -0.1F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.2F, 3.5297F, -0.7222F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(121, 87).addBox(-0.1F, -1.6F, -0.45F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.2F, 2.3693F, 0.3041F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(93, 38).addBox(-0.1F, -1.9F, 1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.2F, -0.1422F, -2.2528F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(111, 68).addBox(-0.1F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.2F, -0.1422F, -2.2528F, -1.117F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(127, 81).addBox(-0.1F, -0.5F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 33).addBox(-0.1F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(127, 0).addBox(-0.1F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 1.2303F, 1.8973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(95, 78).addBox(-0.1F, -0.5F, -1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(51, 98).addBox(-0.1F, -1.0F, -1.25F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 9.6597F, -0.0125F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(59, 80).addBox(-0.1F, 0.0F, -1.0F, 2.0F, 10.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 4.7282F, 0.8127F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightLeg2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(114, 118).addBox(-0.1F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 3.2079F, 0.3786F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightLeg2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(26, 65).addBox(-1.1F, -7.0F, -0.525F, 2.0F, 14.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.2F, 7.6471F, -0.5117F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r113 = rightLeg2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(112, 113).addBox(-1.1F, 0.0274F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 0.1471F, 0.6883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r114 = rightLeg2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(94, 57).addBox(-1.1F, -0.0365F, -0.9927F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 4.9718F, 0.5373F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r115 = rightLeg2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(5, 126).addBox(-1.1F, -0.1724F, -0.457F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.4F, 2.1197F, 0.3582F, -0.1222F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(83, 42).addBox(-1.0F, 0.0554F, -0.5239F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.2602F, -2.1348F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r116 = rightLeg3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(50, 127).addBox(0.2966F, -0.0473F, 0.0221F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, 0.1309F));

		PartDefinition cube_r117 = rightLeg3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(120, 64).addBox(0.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.9F, 3.5553F, -0.0239F, 0.0F, 0.0F, 0.1309F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(19, 51).addBox(-1.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 7.8899F, 0.3185F, 1.6319F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(23, 35).addBox(-2.5F, -0.8F, -5.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7254F, -3.9319F, -0.3889F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(0, 81).addBox(-2.6F, -1.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, -0.7797F, 1.2672F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r118 = leftLeg1.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(83, 52).addBox(-1.5F, -0.1694F, -1.9209F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 15.4296F, -0.6236F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r119 = leftLeg1.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(91, 111).addBox(-1.0F, -2.5F, -0.45F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.5F, 8.6871F, -0.9976F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r120 = leftLeg1.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(126, 114).addBox(-1.0F, -1.0943F, -0.7306F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(120, 0).addBox(-1.0F, -2.0943F, 0.1694F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.5F, 15.4296F, -0.6236F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r121 = leftLeg1.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(95, 71).addBox(-1.0F, -2.0F, -1.45F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.5F, 12.1113F, -1.1283F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r122 = leftLeg1.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(82, 101).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.497F, 13.059F, -2.8037F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r123 = leftLeg1.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(107, 123).addBox(3.1F, 1.6099F, -0.2219F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-5.597F, 9.4535F, -2.5189F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r124 = leftLeg1.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(110, 44).addBox(3.1F, 0.1099F, -0.0219F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-5.6F, 6.992F, -2.1604F, -0.144F, 0.0F, 0.0F));

		PartDefinition cube_r125 = leftLeg1.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(128, 117).addBox(-0.5F, -0.3967F, -0.7826F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 2.9817F, 0.1705F, -2.522F, 0.0F, 0.0F));

		PartDefinition cube_r126 = leftLeg1.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(40, 123).addBox(-0.5F, -0.4085F, -0.1934F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.5F, 2.9817F, 0.1705F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r127 = leftLeg1.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(111, 72).addBox(3.1F, -0.9707F, -0.2308F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-5.6F, 4.1851F, -1.4601F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r128 = leftLeg1.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(106, 83).addBox(-0.9F, -0.4F, -1.7F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(96, 48).addBox(-0.9F, -0.4F, -1.2F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.6F, 1.9376F, 1.0007F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r129 = leftLeg1.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(104, 12).addBox(-0.9F, -0.4F, -2.4F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.6F, 1.9376F, 1.0007F, -0.096F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 16.9939F, -0.1717F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r130 = leftLeg2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(33, 120).addBox(-2.9F, -2.4F, -0.1F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2F, 3.5297F, -0.7222F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r131 = leftLeg2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(67, 123).addBox(-1.9F, -1.6F, -0.45F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2F, 2.3693F, 0.3041F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r132 = leftLeg2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(98, 109).addBox(-1.9F, -1.9F, 1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.2F, -0.1422F, -2.2528F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r133 = leftLeg2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(112, 50).addBox(-1.9F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2F, -0.1422F, -2.2528F, -1.117F, 0.0F, 0.0F));

		PartDefinition cube_r134 = leftLeg2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(127, 84).addBox(-1.9F, -0.5F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 37).addBox(-1.9F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.3526F, 0.2482F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r135 = leftLeg2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(24, 127).addBox(-1.9F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 1.2303F, 1.8973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r136 = leftLeg2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(82, 96).addBox(-1.9F, -0.5F, -1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2F, 0.3526F, 0.2482F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r137 = leftLeg2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(100, 101).addBox(-1.9F, -1.0F, -1.25F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 9.6597F, -0.0125F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r138 = leftLeg2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(37, 81).addBox(-1.9F, 0.0F, -1.0F, 2.0F, 10.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 4.7282F, 0.8127F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r139 = leftLeg2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(119, 100).addBox(-1.9F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 3.2079F, 0.3786F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r140 = leftLeg2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(66, 69).addBox(-0.9F, -7.0F, -0.525F, 2.0F, 14.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2F, 7.6471F, -0.5117F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r141 = leftLeg2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(93, 118).addBox(0.1F, 0.0274F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 0.1471F, 0.6883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r142 = leftLeg2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(77, 95).addBox(0.1F, -0.0365F, -0.9927F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 4.9718F, 0.5373F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r143 = leftLeg2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(126, 125).addBox(0.1F, -0.1724F, -0.457F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.4F, 2.1197F, 0.3582F, -0.1222F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(86, 73).addBox(-2.0F, 0.0554F, -0.5239F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.2602F, -2.1348F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r144 = leftLeg3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(67, 127).addBox(-1.2966F, -0.0473F, 0.0221F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, -0.1309F));

		PartDefinition cube_r145 = leftLeg3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(76, 120).addBox(-1.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.9F, 3.5553F, -0.0239F, 0.0F, 0.0F, -0.1309F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(52, 12).addBox(-4.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 7.8899F, 0.3185F, 0.3665F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(0, 43).addBox(-3.5F, -0.8F, -5.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7254F, -3.9319F, -0.3453F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4044F, 7.5708F, -0.3657F, 0.2041F, -0.0775F));

		PartDefinition cube_r146 = tail1.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(74, 99).addBox(0.0F, -0.2F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3054F, 8.8018F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r147 = tail1.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(32, 136).addBox(0.5F, -0.1129F, -0.5754F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4781F, 4.6083F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r148 = tail1.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(129, 53).addBox(0.5F, -0.1129F, -0.5754F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1228F, 6.6769F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r149 = tail1.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(33, 65).addBox(0.5F, -3.4823F, -0.1162F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.1724F, 7.8771F, -0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r150 = tail1.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(41, 129).addBox(0.5F, -3.8073F, -0.2162F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.5249F, 6.0222F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r151 = tail1.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(28, 120).addBox(0.5F, -3.7323F, -0.0162F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2738F, 2.8321F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r152 = tail1.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(76, 113).addBox(0.5F, -3.5823F, -1.2162F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1326F, 1.0376F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r153 = tail1.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(23, 25).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0156F, 0.9925F, 0.1573F, 0.0517F, 0.0082F));

		PartDefinition cube_r154 = tail1.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(23, 25).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0156F, 0.9925F, 0.1573F, -0.0517F, -0.0082F));

		PartDefinition cube_r155 = tail1.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(0, 25).addBox(0.0F, -1.9F, -0.9F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.889F, 1.0346F, 0.1571F, 0.0F, 0.0F));

		PartDefinition tail = tail1.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.5266F, 9.791F, -0.0088F, 0.0873F, -0.0008F));

		PartDefinition cube_r156 = tail.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.0382F, 0.9544F, 0.1575F, 0.069F, 0.0109F));

		PartDefinition cube_r157 = tail.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(0, 51).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -0.0382F, 0.9544F, 0.1575F, -0.069F, -0.0109F));

		PartDefinition cube_r158 = tail.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(48, 43).addBox(0.0F, -1.9F, 9.1F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5F, 2.4308F, -8.8805F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r159 = tail.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(10, 126).addBox(0.0F, 0.7F, -0.3F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.548F, 6.0799F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r160 = tail.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(51, 64).addBox(0.0F, -0.2F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.1364F, 3.7429F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r161 = tail.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(36, 57).addBox(0.0F, -0.7F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.903F, 1.7675F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r162 = tail.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(106, 90).addBox(0.5F, -2.6073F, -0.0162F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.4867F, 5.7705F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r163 = tail.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(55, 87).addBox(0.5F, -2.5073F, -0.0162F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.6262F, 3.7753F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r164 = tail.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(80, 42).addBox(0.5F, -2.8823F, -0.0162F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.2832F, 1.8025F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r165 = tail.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(33, 87).addBox(0.5F, -3.1823F, -0.0162F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.0395F, -0.1826F, -0.096F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.4624F, 6.8232F, 0.1051F, 0.0868F, 0.0091F));

		PartDefinition cube_r166 = tail2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(118, 133).addBox(0.0F, -2.2561F, -0.0316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8424F, 7.0228F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r167 = tail2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(75, 133).addBox(0.0F, -2.1561F, 0.0684F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0254F, 4.9307F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r168 = tail2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(77, 138).addBox(0.0F, -2.2061F, -0.1316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1823F, 3.1376F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r169 = tail2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(34, 131).addBox(0.0F, -2.1811F, 0.0684F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.374F, 0.946F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r170 = tail2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(48, 0).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.005F))
				.texOffs(46, 20).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.426F, 1.046F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r171 = tail2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(129, 3).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0741F, 1.94F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r172 = tail2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(89, 128).addBox(0.0F, -0.8F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1006F, 6.0433F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r173 = tail2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(118, 127).addBox(0.0F, 0.0F, -0.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2458F, 3.5777F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r174 = tail2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(55, 53).mirror().addBox(-0.9F, 0.0F, 1.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.4564F, 0.0304F, 0.0175F, 0.0698F, 0.0012F));

		PartDefinition cube_r175 = tail2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(55, 53).addBox(-0.1F, 0.0F, 1.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.4564F, 0.0304F, 0.0175F, -0.0698F, -0.0012F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7776F, 8.1476F, 0.0701F, 0.0871F, 0.0061F));

		PartDefinition cube_r176 = tail8.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(73, 73).addBox(-0.5F, -1.9F, 7.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2035F, -7.1017F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r177 = tail8.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(138, 93).addBox(0.0F, 0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0245F, 3.9397F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r178 = tail8.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(89, 134).addBox(0.0F, -0.1F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0846F, 1.901F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r179 = tail8.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(38, 129).addBox(0.0F, -0.8F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2422F, -0.1152F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r180 = tail8.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(51, 94).addBox(0.0F, -1.6061F, -0.0316F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5965F, 2.8984F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r181 = tail8.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(92, 48).addBox(0.0F, -1.6561F, -0.0316F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5965F, 0.8984F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail6 = tail8.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5965F, 4.9983F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r182 = tail6.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(55, 92).addBox(-0.5F, -1.9F, 12.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -12.1F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r183 = tail6.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(107, 138).addBox(0.0F, 0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3057F, 2.9738F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r184 = tail6.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(138, 97).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6582F, 1.0026F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r185 = tail6.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(80, 138).addBox(0.0F, -1.4061F, -0.0316F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r186 = tail6.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(45, 123).addBox(0.0F, -1.5561F, -0.1316F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail3 = tail6.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(64, 110).addBox(0.0F, -1.6468F, -0.102F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 111).addBox(0.0F, -1.5968F, 1.898F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 115).addBox(0.0F, -1.5968F, 3.898F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3741F, 3.9039F, 0.0409F, 0.1292F, 0.0486F));

		PartDefinition cube_r187 = tail3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(113, 138).addBox(0.0F, -0.4F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1036F, 3.2148F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r188 = tail3.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(110, 138).addBox(0.0F, -0.1F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1338F, 0.8613F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r189 = tail3.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(0, 74).addBox(-0.5F, 0.1F, 0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail7 = tail3.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(139, 0).addBox(0.0F, -0.798F, 0.9119F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(139, 6).addBox(0.0F, -0.848F, 2.9119F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8489F, 4.9861F, -0.0679F, 0.0465F, 0.0405F));

		PartDefinition cube_r190 = tail7.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(93, 0).addBox(-0.5F, 0.1F, 5.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0148F, -5.2897F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r191 = tail7.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(116, 138).addBox(0.0F, -0.1F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4125F, 1.9014F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r192 = tail7.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(138, 113).addBox(0.0F, -0.3F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 0.2F, 0.5323F, 0.0F, 0.0F));

		PartDefinition tail9 = tail7.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1099F, 3.8437F, -0.0349F, 0.0015F, 0.0436F));

		PartDefinition cube_r193 = tail9.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(65, 18).addBox(-0.5F, 0.1F, 9.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0951F, -9.1335F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r194 = tail9.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(46, 139).addBox(0.0F, -0.65F, 4.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 139).addBox(0.0F, -0.625F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 139).addBox(0.0F, -0.675F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2579F, 0.5682F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r195 = tail9.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(15, 139).addBox(0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.152F, 4.4886F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r196 = tail9.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(131, 138).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3096F, 2.4724F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r197 = tail9.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(138, 125).addBox(0.0F, -0.6F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5646F, 0.4787F, 0.576F, 0.0F, 0.0F));

		PartDefinition tail4 = tail9.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3811F, 5.9106F, -0.0524F, -0.0436F, 0.0023F));

		PartDefinition cube_r198 = tail4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(108, 68).addBox(0.0F, 2.5F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 139).addBox(0.0F, 1.8F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 139).addBox(0.0F, 0.8F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5331F, -1.4219F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r199 = tail4.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(49, 139).addBox(0.0F, -0.3F, 0.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 39).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 0.2316F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(13, 74).addBox(-0.5F, -0.5698F, -0.2226F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.3471F, 6.1912F, -0.17F, -0.1956F, 0.1629F));

		PartDefinition cube_r200 = tail5.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(66, 139).addBox(0.0F, 4.3F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 139).addBox(0.0F, 3.4F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.186F, -7.6132F, 0.4276F, 0.0F, 0.0F));

		PartDefinition tail10 = tail5.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(80, 0).addBox(-0.5F, -0.5698F, -0.0226F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.8F, -0.0723F, -0.2611F, 0.0187F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create().texOffs(80, 17).addBox(-0.5F, -0.5698F, -0.0226F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.0903F, -0.2608F, 0.0233F));

		PartDefinition tail12 = tail11.addOrReplaceChild("tail12", CubeListBuilder.create().texOffs(80, 35).addBox(-0.5F, -0.0698F, -0.0226F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.5F, 5.0F, -0.0915F, -0.3042F, 0.0275F));

		PartDefinition tail13 = tail12.addOrReplaceChild("tail13", CubeListBuilder.create().texOffs(46, 80).addBox(-0.5F, -0.0698F, -0.0226F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.3597F, -0.3892F, 0.054F));

		PartDefinition tail14 = tail13.addOrReplaceChild("tail14", CubeListBuilder.create().texOffs(93, 16).addBox(-0.5F, -0.0698F, -0.0226F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone = tail1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -8.3597F, 8.6494F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1628F, -4.1022F, -0.0175F, 0.0873F, -0.0015F));

		PartDefinition cube_r201 = body.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(18, 105).addBox(-0.5F, -4.2105F, -1.1178F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.169F, -1.7704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r202 = body.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(35, 107).addBox(-0.5F, -4.1522F, -0.0114F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4213F, -5.8697F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r203 = body.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(11, 65).addBox(-1.0F, 0.0F, 2.9F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.669F, -8.7704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r204 = body.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(25, 43).addBox(-2.5F, -3.0381F, -0.0052F, 7.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 14.7465F, -8.7032F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r205 = body.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(72, 131).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -4.8704F, -0.061F, 0.01F, -0.4919F));

		PartDefinition cube_r206 = body.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(131, 99).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -4.8704F, -0.0596F, -0.0167F, -0.9274F));

		PartDefinition cube_r207 = body.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(66, 85).mirror().addBox(-4.6882F, -2.8327F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -4.8704F, -0.0401F, -0.0471F, -1.5204F));

		PartDefinition cube_r208 = body.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(40, 51).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.269F, -1.8704F, -0.0953F, -0.0504F, -0.6434F));

		PartDefinition cube_r209 = body.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(84, 26).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.269F, -1.8704F, -0.0651F, -0.086F, -1.0793F));

		PartDefinition cube_r210 = body.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(90, 71).mirror().addBox(-3.74F, -2.3355F, -0.4915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.269F, -1.8704F, -0.0058F, -0.1076F, -1.6752F));

		PartDefinition cube_r211 = body.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(66, 85).addBox(2.6881F, -2.8327F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -4.8704F, -0.0401F, 0.0471F, 1.5204F));

		PartDefinition cube_r212 = body.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(131, 99).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -4.8704F, -0.0596F, 0.0167F, 0.9274F));

		PartDefinition cube_r213 = body.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(72, 131).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -4.8704F, -0.061F, -0.01F, 0.4919F));

		PartDefinition cube_r214 = body.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(90, 71).addBox(2.74F, -2.3355F, -0.4915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.269F, -1.8704F, -0.0058F, 0.1076F, 1.6752F));

		PartDefinition cube_r215 = body.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(84, 26).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.269F, -1.8704F, -0.0651F, 0.086F, 1.0793F));

		PartDefinition cube_r216 = body.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(40, 51).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.269F, -1.8704F, -0.0953F, 0.0504F, 0.6434F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(27, 0).addBox(-0.5F, -1.1F, -9.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.394F, -5.7704F, -0.0704F, -0.1306F, 0.0092F));

		PartDefinition cube_r217 = body2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(45, 110).addBox(0.0F, -3.9122F, -1.0627F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0807F, -1.9945F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r218 = body2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(81, 107).addBox(0.0F, -3.5617F, 0.1386F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9992F, -9.195F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r219 = body2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(14, 114).addBox(0.0F, -3.8367F, 0.0386F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0263F, -6.0951F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r220 = body2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(80, 24).mirror().addBox(-8.6882F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.0338F, 0.1886F, -1.3948F));

		PartDefinition cube_r221 = body2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(128, 121).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.134F, 0.1373F, -0.7953F));

		PartDefinition cube_r222 = body2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(128, 123).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.1792F, 0.0682F, -0.3621F));

		PartDefinition cube_r223 = body2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(129, 59).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.2428F, 0.0979F, -0.3225F));

		PartDefinition cube_r224 = body2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(129, 77).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.1798F, 0.1909F, -0.7535F));

		PartDefinition cube_r225 = body2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(27, 20).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.0409F, 0.2583F, -1.3589F));

		PartDefinition cube_r226 = body2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(109, 98).mirror().addBox(-6.6882F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.0038F, 0.1421F, -1.4482F));

		PartDefinition cube_r227 = body2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(131, 127).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.0829F, 0.1155F, -0.8503F));

		PartDefinition cube_r228 = body2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(132, 7).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.1239F, 0.0698F, -0.4144F));

		PartDefinition cube_r229 = body2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(132, 7).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.1239F, -0.0698F, 0.4144F));

		PartDefinition cube_r230 = body2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(27, 12).addBox(-2.5F, -1.9948F, -4.9985F, 7.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 15.3162F, -1.7902F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r231 = body2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(131, 127).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.0829F, -0.1155F, 0.8503F));

		PartDefinition cube_r232 = body2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(109, 98).addBox(2.6881F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.0038F, -0.1421F, 1.4482F));

		PartDefinition cube_r233 = body2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(27, 20).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.0409F, -0.2583F, 1.3589F));

		PartDefinition cube_r234 = body2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(129, 77).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.1798F, -0.1909F, 0.7535F));

		PartDefinition cube_r235 = body2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(129, 59).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.2428F, -0.0979F, 0.3225F));

		PartDefinition cube_r236 = body2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(128, 123).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.1792F, -0.0682F, 0.3621F));

		PartDefinition cube_r237 = body2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(128, 121).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.134F, -0.1373F, 0.7953F));

		PartDefinition cube_r238 = body2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(80, 24).addBox(2.6881F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.0338F, -0.1886F, 1.3948F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1394F, -9.0567F, 0.1489F, -0.0863F, -0.0129F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(103, 38).addBox(-0.5F, -2.2141F, -0.0945F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.1826F, -2.8462F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(50, 113).addBox(0.0F, -3.4525F, -0.1399F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8174F, -2.7462F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(130, 23).addBox(0.0F, -3.1967F, -0.0424F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8174F, -4.8462F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(73, 69).addBox(-4.9922F, 0.5374F, -1.4239F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9922F, 11.5774F, -7.6933F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(27, 22).mirror().addBox(-7.8F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5387F, 12.9116F, -7.6338F, 0.1649F, 1.1341F, 0.2387F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(90, 69).mirror().addBox(-6.1F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7646F, 12.8331F, -7.8588F, 0.0261F, 1.0188F, 0.678F));

		PartDefinition cube_r245 = chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(52, 18).mirror().addBox(-4.547F, 0.0631F, -0.4369F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9814F, 12.321F, -8.3247F, -0.3105F, 0.9461F, 1.0462F));

		PartDefinition cube_r246 = chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(73, 10).mirror().addBox(-1.4784F, 0.7495F, -5.6232F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9922F, 11.5774F, -7.6933F, -0.5954F, -0.4069F, 0.262F));

		PartDefinition cube_r247 = chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(129, 79).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0326F, -1.8462F, 0.2109F, 0.0802F, -0.2734F));

		PartDefinition cube_r248 = chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(130, 9).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0326F, -1.8462F, 0.158F, 0.1615F, -0.7054F));

		PartDefinition cube_r249 = chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0326F, -1.8462F, 0.0398F, 0.222F, -1.3072F));

		PartDefinition cube_r250 = chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(48, 10).mirror().addBox(-13.6882F, -2.8327F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1174F, -4.3462F, 0.0622F, 0.2879F, -1.3553F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(130, 11).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1174F, -4.3462F, 0.2142F, 0.2035F, -0.749F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(130, 13).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1174F, -4.3462F, 0.2789F, 0.0953F, -0.3212F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(0, 40).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2826F, -6.2462F, 0.0756F, 0.3015F, -1.3886F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(130, 15).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2826F, -6.2462F, 0.2329F, 0.2074F, -0.7823F));

		PartDefinition cube_r255 = chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(130, 17).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2826F, -6.2462F, 0.2973F, 0.0913F, -0.3567F));

		PartDefinition cube_r256 = chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(130, 19).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2826F, -8.2462F, 0.3264F, 0.1111F, -0.441F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(130, 21).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2826F, -8.2462F, 0.2515F, 0.2373F, -0.8655F));

		PartDefinition cube_r258 = chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(65, 26).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2826F, -8.2462F, 0.0733F, 0.3365F, -1.4766F));

		PartDefinition cube_r259 = chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(65, 26).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2826F, -8.2462F, 0.0733F, -0.3365F, 1.4766F));

		PartDefinition cube_r260 = chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(130, 21).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2826F, -8.2462F, 0.2515F, -0.2373F, 0.8655F));

		PartDefinition cube_r261 = chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(130, 19).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2826F, -8.2462F, 0.3264F, -0.1111F, 0.441F));

		PartDefinition cube_r262 = chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(59, 121).addBox(0.0F, -3.3926F, -0.2837F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5174F, -8.6462F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r263 = chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(130, 17).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2826F, -6.2462F, 0.2973F, -0.0913F, 0.3567F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(130, 15).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2826F, -6.2462F, 0.2329F, -0.2074F, 0.7823F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(0, 40).addBox(2.6881F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2826F, -6.2462F, 0.0756F, -0.3015F, 1.3886F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(130, 13).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1174F, -4.3462F, 0.2789F, -0.0953F, 0.3212F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(130, 11).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1174F, -4.3462F, 0.2142F, -0.2035F, 0.749F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(48, 10).addBox(2.6881F, -2.8327F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1174F, -4.3462F, 0.0622F, -0.2879F, 1.3553F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(0, 38).addBox(2.6881F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0326F, -1.8462F, 0.0398F, -0.222F, 1.3072F));

		PartDefinition cube_r270 = chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(130, 9).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0326F, -1.8462F, 0.158F, -0.1615F, 0.7054F));

		PartDefinition cube_r271 = chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(0, 15).addBox(-3.0F, -1.975F, -7.1F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 15.0671F, 0.1549F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r272 = chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(129, 79).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0326F, -1.8462F, 0.2109F, -0.0802F, 0.2734F));

		PartDefinition cube_r273 = chest.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(19, 114).addBox(0.0F, -3.4926F, -0.2837F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5174F, -6.6462F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r274 = chest.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(73, 10).addBox(-0.5216F, 0.7495F, -5.6232F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9922F, 11.5774F, -7.6933F, -0.5954F, 0.4069F, -0.262F));

		PartDefinition cube_r275 = chest.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(52, 18).addBox(-0.453F, 0.0631F, -0.4369F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9814F, 12.321F, -8.3247F, -0.3105F, -0.9461F, -1.0462F));

		PartDefinition cube_r276 = chest.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(90, 69).addBox(0.1F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7646F, 12.8331F, -7.8588F, 0.0261F, -1.0188F, -0.678F));

		PartDefinition cube_r277 = chest.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(27, 22).addBox(-0.2F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5387F, 12.9116F, -7.6338F, 0.1649F, -1.1341F, -0.2387F));

		PartDefinition cube_r278 = chest.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(24, 81).addBox(-2.9922F, 0.7495F, -5.1868F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9922F, 11.5774F, -7.6933F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r279 = chest.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(36, 64).addBox(-0.5F, -0.1119F, -5.8679F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.9174F, -2.9462F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.2043F, 3.8382F, -8.2859F, -0.0353F, 0.0981F, -0.1959F));

		PartDefinition cube_r280 = bone2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(91, 26).addBox(-0.5F, -2.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4028F, -3.53F, 6.0301F, 0.5804F, -0.0171F, -0.0036F));

		PartDefinition cube_r281 = bone2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(27, 135).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4063F, -5.4348F, 5.4204F, 0.3098F, -0.0171F, -0.0036F));

		PartDefinition cube_r282 = bone2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(138, 90).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4081F, -5.647F, 4.4432F, 1.357F, -0.0054F, -0.0166F));

		PartDefinition cube_r283 = bone2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(138, 87).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4221F, -5.07F, 3.6266F, 0.6153F, -0.0054F, -0.0166F));

		PartDefinition cube_r284 = bone2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(104, 0).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4794F, -2.125F, 1.5738F, 0.7811F, -0.0033F, -0.0171F));

		PartDefinition cube_r285 = bone2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(58, 105).addBox(-0.5F, 0.1F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.4616F, -3.1945F, 1.4128F, 0.8858F, -0.0033F, -0.0171F));

		PartDefinition cube_r286 = bone2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(103, 51).addBox(-0.9118F, -0.0393F, 1.9497F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9035F, -1.7205F, -0.0094F, 0.7374F, -0.0033F, -0.0171F));

		PartDefinition cube_r287 = bone2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(93, 32).addBox(-0.5F, -0.4F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.529F, 0.3859F, -0.742F, 0.925F, -0.0009F, -0.0174F));

		PartDefinition cube_r288 = bone2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(121, 91).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5425F, 1.129F, -1.4111F, 0.7505F, -0.0009F, -0.0174F));

		PartDefinition cube_r289 = bone2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(100, 123).addBox(-0.425F, 0.05F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0982F, 2.9226F, -2.5249F, 1.7714F, 0.1346F, 0.2175F));

		PartDefinition cube_r290 = bone2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(13, 81).addBox(-0.4296F, -0.6006F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7689F, 4.0977F, -4.0506F, -0.0123F, 0.5095F, 1.0549F));

		PartDefinition cube_r291 = bone2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(11, 89).addBox(-0.2586F, -1.3693F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.7689F, 4.0977F, -4.0506F, -0.2F, 0.472F, 0.6608F));

		PartDefinition cube_r292 = bone2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(124, 45).addBox(-1.1114F, -1.6093F, -2.47F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8876F, 3.021F, -2.6742F, 0.1013F, 0.4221F, 0.5083F));

		PartDefinition cube_r293 = bone2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(107, 101).addBox(-0.5F, -2.0F, -0.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2175F, 3.7942F, -2.4934F, 0.4504F, 0.4221F, 0.5083F));

		PartDefinition cube_r294 = bone2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(104, 30).addBox(-1.1114F, -2.9749F, -2.0964F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8876F, 3.021F, -2.6742F, 1.0613F, 0.4221F, 0.5083F));

		PartDefinition cube_r295 = bone2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(24, 130).addBox(-0.8F, -0.4487F, -1.4266F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9555F, 1.0178F, -2.3595F, 0.9511F, 0.1346F, 0.2175F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.2043F, 3.8382F, -8.2859F, -0.0353F, -0.0981F, 0.1959F));

		PartDefinition cube_r296 = bone4.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(91, 26).mirror().addBox(-0.5F, -2.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4028F, -3.53F, 6.0301F, 0.5804F, 0.0171F, 0.0036F));

		PartDefinition cube_r297 = bone4.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(27, 135).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4063F, -5.4348F, 5.4204F, 0.3098F, 0.0171F, 0.0036F));

		PartDefinition cube_r298 = bone4.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(138, 90).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4081F, -5.647F, 4.4432F, 1.357F, 0.0054F, 0.0166F));

		PartDefinition cube_r299 = bone4.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(138, 87).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4221F, -5.07F, 3.6266F, 0.6153F, 0.0054F, 0.0166F));

		PartDefinition cube_r300 = bone4.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(104, 0).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4794F, -2.125F, 1.5738F, 0.7811F, 0.0033F, 0.0171F));

		PartDefinition cube_r301 = bone4.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(58, 105).mirror().addBox(-0.5F, 0.1F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4616F, -3.1945F, 1.4128F, 0.8858F, 0.0033F, 0.0171F));

		PartDefinition cube_r302 = bone4.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(103, 51).mirror().addBox(-0.0882F, -0.0393F, 1.9497F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9035F, -1.7205F, -0.0094F, 0.7374F, 0.0033F, 0.0171F));

		PartDefinition cube_r303 = bone4.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(93, 32).mirror().addBox(-0.5F, -0.4F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.529F, 0.3859F, -0.742F, 0.925F, 0.0009F, 0.0174F));

		PartDefinition cube_r304 = bone4.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(121, 91).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5425F, 1.129F, -1.4111F, 0.7505F, 0.0009F, 0.0174F));

		PartDefinition cube_r305 = bone4.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(100, 123).mirror().addBox(-0.575F, 0.05F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.0982F, 2.9226F, -2.5249F, 1.7714F, -0.1346F, -0.2175F));

		PartDefinition cube_r306 = bone4.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(13, 81).mirror().addBox(-0.5704F, -0.6006F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7689F, 4.0977F, -4.0506F, -0.0123F, -0.5095F, -1.0549F));

		PartDefinition cube_r307 = bone4.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(11, 89).mirror().addBox(-0.7414F, -1.3693F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.7689F, 4.0977F, -4.0506F, -0.2F, -0.472F, -0.6608F));

		PartDefinition cube_r308 = bone4.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(124, 45).mirror().addBox(0.1114F, -1.6093F, -2.47F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8876F, 3.021F, -2.6742F, 0.1013F, -0.4221F, -0.5083F));

		PartDefinition cube_r309 = bone4.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(107, 101).mirror().addBox(-0.5F, -2.0F, -0.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.2175F, 3.7942F, -2.4934F, 0.4504F, -0.4221F, -0.5083F));

		PartDefinition cube_r310 = bone4.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(104, 30).mirror().addBox(0.1114F, -2.9749F, -2.0964F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8876F, 3.021F, -2.6742F, 1.0613F, -0.4221F, -0.5083F));

		PartDefinition cube_r311 = bone4.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(24, 130).mirror().addBox(-0.2F, -0.4487F, -1.4266F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9555F, 1.0178F, -2.3595F, 0.9511F, -0.1346F, -0.2175F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5413F, 8.8334F, -10.0244F, 0.3692F, 0.0394F, -0.5414F));

		PartDefinition cube_r312 = leftArm1.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(137, 69).addBox(-0.5F, -1.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(137, 32).addBox(-0.5F, -1.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2706F, 0.9418F, -0.5192F, -0.3218F, -0.7676F, 0.1498F));

		PartDefinition cube_r313 = leftArm1.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(136, 43).addBox(-0.5F, 0.3F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 132).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2706F, 0.9418F, -0.5192F, -0.6272F, -0.7676F, 0.1498F));

		PartDefinition cube_r314 = leftArm1.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(132, 31).addBox(6.0F, -1.0842F, 0.0838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 0.9847F, -1.1107F, -0.2895F, -0.0786F, -0.067F));

		PartDefinition cube_r315 = leftArm1.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(43, 136).addBox(-0.5F, 0.0F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(136, 40).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.3582F, 0.3499F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r316 = leftArm1.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(126, 104).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 4.3165F, 1.2617F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r317 = leftArm1.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(125, 9).addBox(-0.5F, -2.9F, 0.625F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.5943F, -0.5628F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(45, 101).addBox(-0.8F, -1.2307F, -0.4734F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 107).addBox(-0.8F, -0.2307F, -1.5734F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2503F, 7.9361F, -0.301F, -1.256F, -0.2756F, -0.0769F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0301F, 5.9086F, 0.0402F, -0.0873F, 0.0F, 0.1745F));

		PartDefinition cube_r318 = leftHand.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(0, 59).addBox(0.0F, -2.5F, -0.2F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r319 = leftHand.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(0, 102).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 0.2032F, -1.2796F, -0.1833F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5413F, 8.8334F, -10.0244F, 0.1788F, 0.0879F, 0.2488F));

		PartDefinition cube_r320 = rightArm1.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(137, 72).addBox(-0.5F, -1.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(137, 60).addBox(-0.5F, -1.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.2706F, 0.9418F, -0.5192F, -0.3218F, 0.7676F, -0.1498F));

		PartDefinition cube_r321 = rightArm1.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(137, 9).addBox(-0.5F, 0.3F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(121, 132).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2706F, 0.9418F, -0.5192F, -0.6272F, 0.7676F, -0.1498F));

		PartDefinition cube_r322 = rightArm1.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(102, 132).addBox(-7.0F, -1.0842F, 0.0838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 0.9847F, -1.1107F, -0.2895F, 0.0786F, 0.067F));

		PartDefinition cube_r323 = rightArm1.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(137, 3).addBox(-0.5F, 0.0F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(136, 135).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.3582F, 0.3499F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r324 = rightArm1.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(126, 109).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 4.3165F, 1.2617F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r325 = rightArm1.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(14, 125).addBox(-0.5F, -2.9F, 0.625F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.5943F, -0.5628F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(30, 106).addBox(-0.2F, -1.2307F, -0.4734F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 90).addBox(-0.2F, -0.2307F, -1.5734F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2503F, 7.9361F, -0.301F, -1.247F, 0.3585F, 0.1057F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0301F, 5.9086F, 0.0402F, -0.0873F, 0.0F, -0.1745F));

		PartDefinition cube_r326 = rightHand.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(55, 61).addBox(-1.0F, -2.5F, -0.2F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r327 = rightHand.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(102, 22).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 0.2032F, -1.2796F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1134F, -8.6766F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r328 = neck1.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(37, 135).addBox(0.0F, -3.0459F, -0.016F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0311F, -1.8666F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r329 = neck1.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(88, 14).mirror().addBox(-8.6882F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.0943F, 0.704F, -1.6708F));

		PartDefinition cube_r330 = neck1.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(130, 29).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.5069F, 0.5195F, -0.9746F));

		PartDefinition cube_r331 = neck1.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(130, 61).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.6623F, 0.2753F, -0.5805F));

		PartDefinition cube_r332 = neck1.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(130, 61).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.6623F, -0.2753F, 0.5805F));

		PartDefinition cube_r333 = neck1.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(130, 29).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.5069F, -0.5195F, 0.9746F));

		PartDefinition cube_r334 = neck1.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(88, 14).addBox(2.6881F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.0943F, -0.704F, 1.6708F));

		PartDefinition cube_r335 = neck1.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(97, 89).addBox(-0.5F, -0.7F, 3.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.6719F, -5.6579F, 0.3142F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9438F, -2.3258F, 0.2165F, -0.1188F, -0.0703F));

		PartDefinition cube_r336 = neck2.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(40, 135).addBox(0.0F, -2.5816F, -0.0991F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1431F, -0.7163F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r337 = neck2.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(130, 63).mirror().addBox(-1.9081F, 0.0182F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, 0.0793F, 0.3638F, -1.0777F));

		PartDefinition cube_r338 = neck2.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(65, 28).mirror().addBox(-6.737F, -0.79F, -0.4755F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, -0.0891F, 0.3617F, -1.545F));

		PartDefinition cube_r339 = neck2.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(65, 28).addBox(1.737F, -0.79F, -0.4755F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, -0.0891F, -0.3617F, 1.545F));

		PartDefinition cube_r340 = neck2.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(130, 63).addBox(-0.0919F, 0.0182F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, 0.0793F, -0.3638F, 1.0777F));

		PartDefinition cube_r341 = neck2.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(99, 6).addBox(-0.5F, 1.4F, 5.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3859F, -7.7876F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3606F, -2.3471F, -0.3604F, -0.2457F, 0.0914F));

		PartDefinition cube_r342 = neck5.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(99, 57).addBox(-0.5F, 1.4F, 3.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.9754F, -5.9788F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r343 = neck5.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(104, 19).mirror().addBox(-5.7911F, -0.3926F, -0.2462F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -0.9743F, -0.2245F, 0.8077F, -1.6355F));

		PartDefinition cube_r344 = neck5.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(130, 65).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -0.9743F, 0.2415F, 0.8038F, -0.9999F));

		PartDefinition cube_r345 = neck5.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(132, 35).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9743F, 0.2994F, 0.8617F, -0.957F));

		PartDefinition cube_r346 = neck5.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(46, 73).mirror().addBox(-4.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9743F, -0.2315F, 0.8773F, -1.6408F));

		PartDefinition cube_r347 = neck5.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(46, 73).addBox(1.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9743F, -0.2315F, -0.8773F, 1.6408F));

		PartDefinition cube_r348 = neck5.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(132, 35).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9743F, 0.2994F, -0.8617F, 0.957F));

		PartDefinition cube_r349 = neck5.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(130, 65).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -0.9743F, 0.2415F, -0.8038F, 0.9999F));

		PartDefinition cube_r350 = neck5.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(104, 19).addBox(1.7911F, -0.3926F, -0.2462F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -0.9743F, -0.2245F, -0.8077F, 1.6355F));

		PartDefinition cube_r351 = neck5.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(9, 139).addBox(0.0F, -2.0566F, -0.1491F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6059F, -2.9414F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r352 = neck5.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(74, 138).addBox(0.0F, -2.3566F, -0.1491F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8842F, -0.9608F, -0.0349F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0819F, -2.7815F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r353 = neck4.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(130, 67).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, 0.5293F, 0.9484F, -0.7623F));

		PartDefinition cube_r354 = neck4.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(130, 69).mirror().addBox(-3.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, -0.151F, 1.0368F, -1.5613F));

		PartDefinition cube_r355 = neck4.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(130, 71).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, 0.5293F, 0.9484F, -0.7623F));

		PartDefinition cube_r356 = neck4.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(72, 58).mirror().addBox(-4.7663F, -0.3906F, -0.2552F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, -0.151F, 1.0368F, -1.5613F));

		PartDefinition cube_r357 = neck4.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(72, 58).addBox(1.7663F, -0.3906F, -0.2552F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, -0.151F, -1.0368F, 1.5613F));

		PartDefinition cube_r358 = neck4.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(130, 71).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, 0.5293F, -0.9484F, 0.7623F));

		PartDefinition cube_r359 = neck4.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(130, 69).addBox(1.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, -0.151F, -1.0368F, 1.5613F));

		PartDefinition cube_r360 = neck4.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(130, 67).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, 0.5293F, -0.9484F, 0.7623F));

		PartDefinition cube_r361 = neck4.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(137, 138).addBox(0.0F, -1.6677F, -0.0582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4916F, -3.9211F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r362 = neck4.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(134, 138).addBox(0.0F, -1.1677F, -0.0582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2697F, -1.931F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r363 = neck4.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(88, 7).addBox(-0.5F, 1.4F, 0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9504F, -3.9173F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5407F, -3.7756F, 0.4087F, -0.0171F, -0.0383F));

		PartDefinition cube_r364 = neck3.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(130, 73).mirror().addBox(-1.8547F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.3534F, -3.4609F, 0.416F, 0.6757F, -1.0136F));

		PartDefinition cube_r365 = neck3.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(131, 125).mirror().addBox(-3.8842F, -0.348F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.3534F, -3.4609F, 0.0301F, 0.7755F, -1.5857F));

		PartDefinition cube_r366 = neck3.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(130, 75).mirror().addBox(-1.8351F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.3306F, 0.5553F, -1.0103F));

		PartDefinition cube_r367 = neck3.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(121, 130).mirror().addBox(-3.8627F, -0.3478F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.0339F, 0.6365F, -1.5305F));

		PartDefinition cube_r368 = neck3.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(121, 130).addBox(1.8627F, -0.3478F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.0339F, -0.6365F, 1.5305F));

		PartDefinition cube_r369 = neck3.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(130, 75).addBox(-0.1649F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.3306F, -0.5553F, 1.0103F));

		PartDefinition cube_r370 = neck3.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(131, 125).addBox(1.8842F, -0.348F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3534F, -3.4609F, 0.0301F, -0.7755F, 1.5857F));

		PartDefinition cube_r371 = neck3.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(130, 73).addBox(-0.1453F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3534F, -3.4609F, 0.416F, -0.6757F, 1.0136F));

		PartDefinition cube_r372 = neck3.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(3, 139).addBox(0.5F, -1.1458F, -1.1223F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.6168F, -1.9379F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r373 = neck3.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(0, 139).addBox(0.5F, -1.669F, -0.9772F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.3795F, -0.4528F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r374 = neck3.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(86, 83).addBox(0.0F, 1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -1.3168F, 1.7621F, -0.48F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.6216F, -3.0653F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r375 = neck.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(128, 130).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4057F, -1.5945F, 0.8154F, 0.9709F, -0.7645F));

		PartDefinition cube_r376 = neck.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(0, 131).mirror().addBox(-3.6944F, -0.3859F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4057F, -1.5945F, 0.0612F, 1.1726F, -1.6082F));

		PartDefinition cube_r377 = neck.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(0, 131).addBox(1.6944F, -0.3859F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4057F, -1.5945F, 0.0612F, -1.1726F, 1.6082F));

		PartDefinition cube_r378 = neck.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(6, 139).addBox(0.5F, -1.6207F, -0.1014F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1331F, -1.8626F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r379 = neck.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(58, 99).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.4894F, 0.0579F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r380 = neck.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(128, 130).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4057F, -1.5945F, 0.8154F, -0.9709F, 0.7645F));

		PartDefinition neck6 = neck.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1345F, -2.4236F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r381 = neck6.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(13, 131).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5212F, -1.221F, 0.5806F, 0.7985F, -0.9472F));

		PartDefinition cube_r382 = neck6.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(99, 12).mirror().addBox(-2.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5212F, -1.221F, 0.0756F, 0.9458F, -1.5956F));

		PartDefinition cube_r383 = neck6.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(99, 12).addBox(1.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.0756F, -0.9458F, 1.5956F));

		PartDefinition cube_r384 = neck6.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(121, 105).addBox(0.5F, -0.8207F, 2.7987F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.074F, -4.6686F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r385 = neck6.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(99, 63).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r386 = neck6.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(13, 131).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.5806F, -0.7985F, 0.9472F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6691F, -3.7632F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r387 = head.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(106, 78).addBox(-0.7F, 0.0F, -0.05F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(0.0F, -1.4655F, -4.3239F, -1.165F, 0.0F, 0.0F));

		PartDefinition cube_r388 = head.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(118, 10).addBox(-0.5F, -1.8F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.0F, -2.2906F, -1.807F, 3.0631F, 0.0F, 0.0F));

		PartDefinition cube_r389 = head.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(86, 117).addBox(-0.5F, -1.275F, -0.875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.0F, -1.234F, -1.9288F, 1.9722F, 0.0F, 0.0F));

		PartDefinition cube_r390 = head.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(23, 106).addBox(0.0F, -0.2F, -1.8F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.5F, -1.8864F, -4.7669F, 1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r391 = head.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(117, 41).addBox(0.0F, -0.2F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.5F, -2.1111F, -5.3232F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r392 = head.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(131, 109).addBox(0.0F, -0.2F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(79, 131).addBox(0.0F, -0.2F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -2.0153F, -6.3186F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r393 = head.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(122, 54).addBox(-0.5F, -0.4296F, -2.3543F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.8151F, -14.7149F, 1.117F, 0.0F, 0.0F));

		PartDefinition cube_r394 = head.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(48, 136).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.0F, 2.8151F, -14.7149F, 2.2951F, 0.0F, 0.0F));

		PartDefinition cube_r395 = head.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(136, 46).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.8151F, -14.7149F, -2.9409F, 0.0F, 0.0F));

		PartDefinition cube_r396 = head.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(116, 22).addBox(-0.5F, -0.2F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.0F, 1.6017F, -13.5924F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r397 = head.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(116, 17).addBox(-0.5F, -0.5F, -0.825F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 2.4044F, -12.9629F, 1.9373F, 0.0F, 0.0F));

		PartDefinition cube_r398 = head.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(0, 116).addBox(-0.5F, -1.8F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.0F, 0.9931F, -12.3814F, 2.1991F, 0.0F, 0.0F));

		PartDefinition cube_r399 = head.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(108, 56).addBox(-0.5F, -1.8F, -1.75F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.2736F, -10.9514F, 2.0682F, 0.0F, 0.0F));

		PartDefinition cube_r400 = head.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(122, 77).addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.9221F, -8.7291F, 1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r401 = head.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(115, 78).addBox(-0.5F, -1.6F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.0F, -0.1236F, -8.5232F, 2.0682F, 0.0F, 0.0F));

		PartDefinition cube_r402 = head.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(115, 59).addBox(-0.5F, -0.2F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, -0.2475F, -10.0965F, 1.9373F, 0.0F, 0.0F));

		PartDefinition cube_r403 = head.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(108, 5).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.0F, -2.0249F, -6.219F, -1.117F, 0.0F, 0.0F));

		PartDefinition cube_r404 = head.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(15, 136).addBox(-0.5F, -1.9579F, -0.3112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 6.9898F, -16.0308F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r405 = head.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(7, 106).addBox(-0.5F, 0.0055F, -0.0094F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.1917F, -15.4957F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r406 = head.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(10, 136).addBox(-0.5F, -0.9695F, -0.0094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0047F, -16.0338F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r407 = head.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(5, 136).addBox(-0.5F, -1.0127F, 0.0053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 6.9898F, -16.0308F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r408 = head.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(7, 122).addBox(-0.5F, -0.8162F, -1.6985F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.7271F, -0.0365F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r409 = head.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(122, 5).addBox(-0.5F, -0.5134F, -0.9974F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.7271F, -0.0365F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r410 = head.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(78, 28).addBox(-0.5F, -1.0F, -4.95F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 6.1834F, -10.4011F, 0.1476F, 0.0F, 0.0F));

		PartDefinition cube_r411 = head.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(19, 57).addBox(-1.0F, -1.075F, -5.8F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 4.4514F, -4.8129F, 0.3134F, 0.0F, 0.0F));

		PartDefinition cube_r412 = head.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(66, 94).addBox(-1.0F, -1.075F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 4.1402F, -1.8291F, 0.1039F, 0.0F, 0.0F));

		PartDefinition cube_r413 = head.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(46, 75).addBox(-2.0F, -0.075F, -0.1F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.1488F, -1.9802F, 0.1039F, 0.0F, 0.0F));

		PartDefinition cube_r414 = head.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(0, 136).addBox(-0.5F, -0.3832F, -0.2307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.7271F, -0.0365F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r415 = head.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(81, 58).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.7736F, -2.3864F, -0.0587F, 0.0F, 0.0F));

		PartDefinition cube_r416 = head.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(9, 95).addBox(-1.9404F, -0.025F, -3.975F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4404F, -2.0453F, -0.4301F, 0.1507F, 0.0F, 0.0F));

		PartDefinition cube_r417 = head.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(66, 87).addBox(-1.5F, 0.4371F, -2.3968F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9775F, 0.3132F, 0.2531F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6012F, 6.8098F, -16.1182F, 0.0F, -0.0698F, 0.0F));

		PartDefinition cube_r418 = leftFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(115, 64).addBox(-5.2045F, 0.2332F, 2.2767F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, -0.5056F, 1.3682F, -3.0736F));

		PartDefinition cube_r419 = leftFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(66, 61).addBox(-1.5365F, 4.0619F, -1.5389F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.7646F, -5.9168F, 5.4282F, 0.3179F, 0.166F, 0.0543F));

		PartDefinition cube_r420 = leftFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(118, 72).addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.7059F, -8.5907F, 15.15F, -1.557F, 0.081F, 1.3549F));

		PartDefinition cube_r421 = leftFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(115, 5).addBox(-0.3411F, -4.8122F, -2.9541F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, -1.6415F, 0.0419F, 0.1485F));

		PartDefinition cube_r422 = leftFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(42, 118).addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.237F, -8.6784F, 12.3621F, -2.7248F, -0.331F, 1.216F));

		PartDefinition cube_r423 = leftFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(118, 27).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.7022F, -8.5982F, 12.2523F, -2.6647F, 0.2314F, 0.165F));

		PartDefinition cube_r424 = leftFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(69, 118).addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.4687F, -8.6724F, 13.3362F, -1.3448F, 0.0592F, 1.3461F));

		PartDefinition cube_r425 = leftFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(114, 107).addBox(-0.9585F, -3.1316F, -2.6493F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, -1.539F, 0.2314F, 0.165F));

		PartDefinition cube_r426 = leftFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(45, 127).addBox(-0.6155F, -1.7958F, -0.2414F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, -0.1028F, 0.374F, 0.2235F));

		PartDefinition cube_r427 = leftFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(127, 32).addBox(-0.6155F, -2.9517F, -1.0184F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, -0.6264F, 0.374F, 0.2235F));

		PartDefinition cube_r428 = leftFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(137, 29).addBox(-0.6155F, -2.4325F, -2.6434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, -1.2198F, 0.374F, 0.2235F));

		PartDefinition cube_r429 = leftFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(137, 18).addBox(-0.6155F, -3.5008F, -1.2909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, -0.6438F, 0.374F, 0.2235F));

		PartDefinition cube_r430 = leftFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(114, 123).addBox(-0.6155F, -0.8558F, -3.6317F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, -1.6299F, 0.374F, 0.2235F));

		PartDefinition cube_r431 = leftFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(20, 137).addBox(-0.6338F, -1.2228F, -1.8638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, -0.6938F, 0.3227F, 0.2021F));

		PartDefinition cube_r432 = leftFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(49, 132).addBox(-0.6348F, -3.2541F, -1.6292F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, -0.49F, 0.4255F, 0.2278F));

		PartDefinition cube_r433 = leftFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(50, 106).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0413F, -5.9196F, 9.4831F, -0.9817F, 0.1397F, 0.1746F));

		PartDefinition cube_r434 = leftFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(121, 121).addBox(-0.4658F, 2.0004F, 3.9063F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, 0.0732F, 0.1222F, 0.0F));

		PartDefinition cube_r435 = leftFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(121, 117).addBox(-0.3408F, 0.3299F, 6.2842F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, -0.3893F, 0.1222F, 0.0F));

		PartDefinition cube_r436 = leftFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(93, 96).addBox(-1.953F, -0.0672F, -0.8014F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.7646F, -5.9168F, 5.4282F, 1.89F, 0.1921F, 0.0341F));

		PartDefinition cube_r437 = leftFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(125, 27).addBox(-0.8982F, 4.4212F, 1.9035F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0561F, 0.1273F, 0.4888F, 2.0982F, 0.1572F, -0.001F));

		PartDefinition cube_r438 = leftFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(108, 62).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.2335F, -4.1259F, 1.9413F, -1.0608F, 0.1572F, -0.001F));

		PartDefinition cube_r439 = leftFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(81, 122).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4446F, -2.6578F, 0.5997F, -2.3175F, 0.1572F, -0.001F));

		PartDefinition cube_r440 = leftFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(122, 58).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5093F, -1.7498F, 0.1857F, 2.7091F, 0.1572F, -0.001F));

		PartDefinition cube_r441 = leftFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(53, 136).addBox(-0.8982F, -0.8511F, 0.754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0561F, 0.1273F, 0.5888F, 1.3564F, 0.1572F, -0.001F));

		PartDefinition cube_r442 = leftFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(131, 135).addBox(-0.8982F, -0.9997F, -0.5419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0561F, 0.1273F, 0.5888F, 0.1347F, 0.1572F, -0.001F));

		PartDefinition cube_r443 = leftFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(0, 95).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1153F, 0.1373F, 2.6588F, -2.972F, 0.1572F, -0.001F));

		PartDefinition cube_r444 = leftFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(123, 19).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.2715F, 0.2023F, 1.6732F, -1.5059F, 0.1572F, -0.001F));

		PartDefinition cube_r445 = leftFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(128, 95).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3403F, -0.8284F, 1.2456F, -0.066F, 0.1572F, -0.001F));

		PartDefinition cube_r446 = leftFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(91, 104).addBox(-0.8982F, -3.0378F, 5.0187F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0561F, 0.1273F, 0.4888F, 0.2831F, 0.1572F, -0.001F));

		PartDefinition cube_r447 = leftFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(114, 93).addBox(-0.8982F, -0.8804F, 2.3087F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0561F, 0.1273F, 0.4888F, 0.859F, 0.1572F, -0.001F));

		PartDefinition cube_r448 = leftFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(44, 87).addBox(-0.8982F, -1.8469F, 3.7126F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0561F, 0.1273F, 0.4888F, 0.5972F, 0.1572F, -0.001F));

		PartDefinition cube_r449 = leftFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(60, 131).addBox(-0.5566F, -1.6942F, -4.0466F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2346F, 0.0872F, 4.0499F, 0.2039F, 0.1398F, 0.0338F));

		PartDefinition cube_r450 = leftFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(131, 45).addBox(-0.5066F, -0.9846F, -3.0236F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2346F, 0.0872F, 4.0499F, 0.2563F, 0.1398F, 0.0338F));

		PartDefinition cube_r451 = leftFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(126, 99).addBox(-0.5066F, -1.5165F, -2.0131F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2346F, 0.0872F, 4.0499F, 0.3086F, 0.1398F, 0.0338F));

		PartDefinition cube_r452 = leftFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(79, 126).addBox(-0.5066F, -1.2401F, -1.0193F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2346F, 0.0872F, 4.0499F, 0.3959F, 0.1398F, 0.0338F));

		PartDefinition cube_r453 = leftFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(74, 126).addBox(-0.5066F, -1.0658F, -0.0192F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2346F, 0.0872F, 4.0499F, 0.457F, 0.1398F, 0.0338F));

		PartDefinition cube_r454 = leftFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(131, 41).addBox(-0.5066F, 0.0178F, 0.9808F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2346F, 0.0872F, 4.0499F, 0.5268F, 0.1398F, 0.0338F));

		PartDefinition cube_r455 = leftFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(29, 131).addBox(-0.5066F, 0.3819F, 1.9568F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2346F, 0.0872F, 4.0499F, 0.5704F, 0.1398F, 0.0338F));

		PartDefinition cube_r456 = leftFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(137, 12).addBox(-0.4F, -0.35F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(7, 132).addBox(-0.4F, -1.35F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(132, 3).addBox(-0.4F, -1.15F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7835F, -0.9205F, 8.6279F, 0.5722F, 0.1676F, 0.0756F));

		PartDefinition cube_r457 = leftFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(24, 87).addBox(-0.953F, 0.3552F, 0.2517F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7646F, -5.9168F, 5.4282F, 0.2144F, 0.1921F, 0.0341F));

		PartDefinition cube_r458 = leftFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(55, 116).addBox(-0.953F, 2.4812F, 3.7282F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7646F, -5.9168F, 5.4282F, -0.0124F, 0.1921F, 0.0341F));

		PartDefinition cube_r459 = leftFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(114, 100).addBox(-0.5473F, -1.4597F, -0.2567F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, 0.254F, 0.2094F, 0.0176F));

		PartDefinition cube_r460 = leftFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(108, 131).addBox(-0.5473F, 2.5486F, -0.4804F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, 0.0795F, 0.2094F, 0.0176F));

		PartDefinition cube_r461 = leftFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(81, 115).addBox(-0.5473F, -1.4802F, -0.632F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, 0.1667F, 0.2094F, 0.0176F));

		PartDefinition cube_r462 = leftFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(36, 101).addBox(-0.5578F, -4.9318F, -5.8388F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, -2.9389F, 0.1535F, -0.0249F));

		PartDefinition cube_r463 = leftFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(7, 117).addBox(-0.5578F, -5.6906F, -1.8338F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, -2.5026F, 0.1535F, -0.0249F));

		PartDefinition cube_r464 = leftFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(123, 23).addBox(-0.6365F, -2.5079F, 3.117F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, -1.4077F, 0.2123F, 0.0F));

		PartDefinition cube_r465 = leftFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(114, 88).addBox(-0.5473F, 2.286F, 1.1647F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, -0.1823F, 0.2094F, 0.0176F));

		PartDefinition cube_r466 = leftFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(109, 21).addBox(-0.3912F, -5.7883F, -1.5094F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, -1.3545F, 0.1222F, 0.0F));

		PartDefinition cube_r467 = leftFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(126, 136).addBox(-0.3912F, -5.0234F, 3.2478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(135, 129).addBox(-0.3912F, -4.1574F, 3.7478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, -0.5254F, 0.1222F, 0.0F));

		PartDefinition cube_r468 = leftFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(121, 136).addBox(-0.3912F, 1.1671F, 5.4743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, 0.5218F, 0.1222F, 0.0F));

		PartDefinition cube_r469 = leftFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(104, 71).addBox(-0.3912F, -0.2208F, 3.6492F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, 0.26F, 0.1222F, 0.0F));

		PartDefinition cube_r470 = leftFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(136, 110).addBox(-0.3401F, -3.4042F, -4.3077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, -2.8642F, 0.1222F, 0.0F));

		PartDefinition cube_r471 = leftFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(135, 122).addBox(-0.3401F, -5.1653F, 1.8615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, -1.6163F, 0.1222F, 0.0F));

		PartDefinition cube_r472 = leftFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(135, 119).addBox(-0.3401F, -2.7662F, 3.7474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, -1.0054F, 0.1222F, 0.0F));

		PartDefinition cube_r473 = leftFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(112, 135).addBox(-0.3401F, 1.3748F, 3.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, 0.0418F, 0.1222F, 0.0F));

		PartDefinition cube_r474 = leftFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(131, 105).addBox(-0.3401F, 0.191F, 3.5588F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, 0.1727F, 0.1222F, 0.0F));

		PartDefinition cube_r475 = leftFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(62, 126).addBox(-0.3401F, -1.7556F, 3.535F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, -0.0455F, 0.1222F, 0.0F));

		PartDefinition cube_r476 = leftFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(131, 101).addBox(-0.5309F, 1.3548F, 0.5598F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, 0.2627F, 0.2094F, 0.0176F));

		PartDefinition cube_r477 = leftFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(92, 136).addBox(-0.5309F, 0.7383F, 1.9569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, -0.3045F, 0.2094F, 0.0176F));

		PartDefinition cube_r478 = leftFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(136, 101).addBox(-0.5309F, -2.1196F, 0.536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, -1.5262F, 0.2094F, 0.0176F));

		PartDefinition cube_r479 = leftFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(136, 107).addBox(-0.5304F, 1.4789F, 0.9061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, 1.6145F, 0.2107F, 0.0129F));

		PartDefinition cube_r480 = leftFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(136, 104).addBox(-0.5304F, 1.6069F, -1.6517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, 2.4435F, 0.2107F, 0.0129F));

		PartDefinition cube_r481 = leftFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(102, 136).addBox(-0.5309F, 0.432F, -2.7337F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 57).addBox(-0.5309F, 0.2712F, -1.6903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, 2.968F, 0.2094F, 0.0176F));

		PartDefinition cube_r482 = leftFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(97, 136).addBox(-0.5309F, -2.2254F, -1.6455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, -2.2244F, 0.2094F, 0.0176F));

		PartDefinition cube_r483 = leftFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(83, 136).addBox(-0.5309F, -0.4494F, 2.0144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, -0.6972F, 0.2094F, 0.0176F));

		PartDefinition cube_r484 = leftFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(136, 77).addBox(-0.5309F, -0.6816F, 2.0314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, -0.9154F, 0.2094F, 0.0176F));

		PartDefinition cube_r485 = leftFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(69, 136).addBox(-0.5309F, 1.0178F, 0.3956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, 0.3064F, 0.2094F, 0.0176F));

		PartDefinition cube_r486 = leftFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(64, 136).addBox(-0.5309F, 0.7198F, -0.8212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, 1.5281F, 0.2094F, 0.0176F));

		PartDefinition cube_r487 = leftFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(107, 135).addBox(-0.5309F, -1.0884F, -2.4439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, -2.1807F, 0.2094F, 0.0176F));

		PartDefinition cube_r488 = leftFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(84, 128).addBox(-0.5F, 0.5F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.122F, -2.1391F, 0.9606F, 2.1331F, 0.1572F, -0.001F));

		PartDefinition cube_r489 = leftFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(133, 23).addBox(-0.6718F, 1.6294F, 0.5845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(17, 133).addBox(-0.6718F, 2.2294F, 0.5845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0561F, 0.1773F, 0.2638F, 2.4385F, 0.1572F, -0.001F));

		PartDefinition cube_r490 = leftFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(133, 26).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(21, 121).addBox(-0.5F, -0.8F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.3602F, -4.2341F, 4.0165F, 0.6234F, 0.1572F, -0.001F));

		PartDefinition cube_r491 = leftFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(14, 121).addBox(-0.6718F, -3.2294F, 3.4711F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0561F, 0.1773F, 0.2638F, 0.4314F, 0.1572F, -0.001F));

		PartDefinition cube_r492 = leftFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(121, 95).addBox(-0.6718F, -1.9853F, 2.6237F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0561F, 0.1773F, 0.2638F, 0.7368F, 0.1572F, -0.001F));

		PartDefinition cube_r493 = leftFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(134, 81).addBox(-0.8504F, -1.1611F, 1.6574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 134).addBox(-0.8504F, -0.4361F, 1.6574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7646F, -5.9168F, 5.4282F, -0.9287F, 0.1921F, 0.0341F));

		PartDefinition cube_r494 = leftFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(133, 37).addBox(-0.8504F, -1.7595F, 1.5773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7646F, -5.9168F, 5.4282F, -1.7054F, 0.1921F, 0.0341F));

		PartDefinition cube_r495 = leftFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(123, 15).addBox(-0.8504F, -3.4625F, -0.9251F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7646F, -5.9168F, 5.4282F, -2.5781F, 0.1921F, 0.0341F));

		PartDefinition cube_r496 = leftFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(134, 0).addBox(-0.8504F, -3.1317F, -2.8267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7646F, -5.9168F, 5.4282F, 2.8761F, 0.1921F, 0.0341F));

		PartDefinition cube_r497 = leftFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(100, 95).addBox(-0.8504F, 2.0818F, -3.6693F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7646F, -5.9168F, 5.4282F, 1.5234F, 0.1921F, 0.0341F));

		PartDefinition cube_r498 = leftFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(133, 116).addBox(-0.8504F, 4.0506F, 2.1487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7646F, -5.9168F, 5.4282F, 0.389F, 0.1921F, 0.0341F));

		PartDefinition cube_r499 = leftFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(88, 122).addBox(-0.8504F, -0.3309F, 3.6862F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(133, 96).addBox(-0.8504F, 1.7351F, 4.4522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7646F, -5.9168F, 5.4282F, 0.0399F, 0.1921F, 0.0341F));

		PartDefinition cube_r500 = leftFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(133, 113).addBox(-0.8504F, 4.0948F, 2.3542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(9, 100).addBox(-0.8504F, 1.5693F, 1.2853F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7646F, -5.9168F, 5.4282F, 0.5635F, 0.1921F, 0.0341F));

		PartDefinition cube_r501 = leftFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(133, 93).addBox(-0.8504F, 4.5237F, -1.5393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7646F, -5.9168F, 5.4282F, 1.5671F, 0.1921F, 0.0341F));

		PartDefinition cube_r502 = leftFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(133, 90).addBox(-0.8504F, 0.2545F, -5.5486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7646F, -5.9168F, 5.4282F, 2.9633F, 0.1921F, 0.0341F));

		PartDefinition cube_r503 = leftFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(133, 87).addBox(-0.8504F, 4.5589F, -1.208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7646F, -5.9168F, 5.4282F, 1.8289F, 0.1921F, 0.0341F));

		PartDefinition cube_r504 = leftFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(78, 135).addBox(-0.3059F, 1.3935F, -0.0278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(59, 135).addBox(-0.4809F, 1.3935F, -0.0278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, 1.7463F, 0.2094F, 0.0176F));

		PartDefinition cube_r505 = leftFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(67, 99).addBox(-0.3912F, -1.3645F, 1.8586F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.4646F, -5.9168F, 11.1283F, 0.1291F, 0.1222F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6012F, 6.8098F, -16.1182F, 0.0F, 0.0698F, 0.0F));

		PartDefinition cube_r506 = rightFace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(115, 64).mirror().addBox(4.2045F, 0.2332F, 2.2767F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, -0.5056F, -1.3682F, 3.0736F));

		PartDefinition cube_r507 = rightFace.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(66, 61).mirror().addBox(0.5365F, 4.0619F, -1.5389F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.7646F, -5.9168F, 5.4282F, 0.3179F, -0.166F, -0.0543F));

		PartDefinition cube_r508 = rightFace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(118, 72).mirror().addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.7059F, -8.5907F, 15.15F, -1.557F, -0.081F, -1.3549F));

		PartDefinition cube_r509 = rightFace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(115, 5).mirror().addBox(-0.6589F, -4.8122F, -2.9541F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, -1.6415F, -0.0419F, -0.1485F));

		PartDefinition cube_r510 = rightFace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(42, 118).mirror().addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.237F, -8.6784F, 12.3621F, -2.7248F, 0.331F, -1.216F));

		PartDefinition cube_r511 = rightFace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(118, 27).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.7022F, -8.5982F, 12.2523F, -2.6647F, -0.2314F, -0.165F));

		PartDefinition cube_r512 = rightFace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(69, 118).mirror().addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.4687F, -8.6724F, 13.3362F, -1.3448F, -0.0592F, -1.3461F));

		PartDefinition cube_r513 = rightFace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(114, 107).mirror().addBox(-0.0415F, -3.1316F, -2.6493F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, -1.539F, -0.2314F, -0.165F));

		PartDefinition cube_r514 = rightFace.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(45, 127).mirror().addBox(-0.3845F, -1.7958F, -0.2414F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, -0.1028F, -0.374F, -0.2235F));

		PartDefinition cube_r515 = rightFace.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(127, 32).mirror().addBox(-0.3845F, -2.9517F, -1.0184F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, -0.6264F, -0.374F, -0.2235F));

		PartDefinition cube_r516 = rightFace.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(137, 29).mirror().addBox(-0.3845F, -2.4325F, -2.6434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, -1.2198F, -0.374F, -0.2235F));

		PartDefinition cube_r517 = rightFace.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(137, 18).mirror().addBox(-0.3845F, -3.5008F, -1.2909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, -0.6438F, -0.374F, -0.2235F));

		PartDefinition cube_r518 = rightFace.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(114, 123).mirror().addBox(-0.3845F, -0.8558F, -3.6317F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, -1.6299F, -0.374F, -0.2235F));

		PartDefinition cube_r519 = rightFace.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(20, 137).mirror().addBox(-0.3662F, -1.2228F, -1.8638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, -0.6938F, -0.3227F, -0.2021F));

		PartDefinition cube_r520 = rightFace.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(49, 132).mirror().addBox(-0.3652F, -3.2541F, -1.6292F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, -0.49F, -0.4255F, -0.2278F));

		PartDefinition cube_r521 = rightFace.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(50, 106).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.0413F, -5.9196F, 9.4831F, -0.9817F, -0.1397F, -0.1746F));

		PartDefinition cube_r522 = rightFace.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(121, 121).mirror().addBox(-0.5342F, 2.0004F, 3.9063F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, 0.0732F, -0.1222F, 0.0F));

		PartDefinition cube_r523 = rightFace.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(121, 117).mirror().addBox(-0.6592F, 0.3299F, 6.2842F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, -0.3893F, -0.1222F, 0.0F));

		PartDefinition cube_r524 = rightFace.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(93, 96).mirror().addBox(-0.047F, -0.0672F, -0.8014F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.7646F, -5.9168F, 5.4282F, 1.89F, -0.1921F, -0.0341F));

		PartDefinition cube_r525 = rightFace.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(125, 27).mirror().addBox(-0.1018F, 4.4212F, 1.9035F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0561F, 0.1273F, 0.4888F, 2.0982F, -0.1572F, 0.001F));

		PartDefinition cube_r526 = rightFace.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(108, 62).mirror().addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.2335F, -4.1259F, 1.9413F, -1.0608F, -0.1572F, 0.001F));

		PartDefinition cube_r527 = rightFace.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(81, 122).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.4446F, -2.6578F, 0.5997F, -2.3175F, -0.1572F, 0.001F));

		PartDefinition cube_r528 = rightFace.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(122, 58).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.5093F, -1.7498F, 0.1857F, 2.7091F, -0.1572F, 0.001F));

		PartDefinition cube_r529 = rightFace.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(53, 136).mirror().addBox(-0.1018F, -0.8511F, 0.754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0561F, 0.1273F, 0.5888F, 1.3564F, -0.1572F, 0.001F));

		PartDefinition cube_r530 = rightFace.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(131, 135).mirror().addBox(-0.1018F, -0.9997F, -0.5419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0561F, 0.1273F, 0.5888F, 0.1347F, -0.1572F, 0.001F));

		PartDefinition cube_r531 = rightFace.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1153F, 0.1373F, 2.6588F, -2.972F, -0.1572F, 0.001F));

		PartDefinition cube_r532 = rightFace.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(123, 19).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.2715F, 0.2023F, 1.6732F, -1.5059F, -0.1572F, 0.001F));

		PartDefinition cube_r533 = rightFace.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(128, 95).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3403F, -0.8284F, 1.2456F, -0.066F, -0.1572F, 0.001F));

		PartDefinition cube_r534 = rightFace.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(91, 104).mirror().addBox(-0.1018F, -3.0378F, 5.0187F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0561F, 0.1273F, 0.4888F, 0.2831F, -0.1572F, 0.001F));

		PartDefinition cube_r535 = rightFace.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(114, 93).mirror().addBox(-0.1018F, -0.8804F, 2.3087F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0561F, 0.1273F, 0.4888F, 0.859F, -0.1572F, 0.001F));

		PartDefinition cube_r536 = rightFace.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(44, 87).mirror().addBox(-0.1018F, -1.8469F, 3.7126F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0561F, 0.1273F, 0.4888F, 0.5972F, -0.1572F, 0.001F));

		PartDefinition cube_r537 = rightFace.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(60, 131).mirror().addBox(-0.4434F, -1.6942F, -4.0466F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2346F, 0.0872F, 4.0499F, 0.2039F, -0.1398F, -0.0338F));

		PartDefinition cube_r538 = rightFace.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(131, 45).mirror().addBox(-0.4934F, -0.9846F, -3.0236F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2346F, 0.0872F, 4.0499F, 0.2563F, -0.1398F, -0.0338F));

		PartDefinition cube_r539 = rightFace.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(126, 99).mirror().addBox(-0.4934F, -1.5165F, -2.0131F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2346F, 0.0872F, 4.0499F, 0.3086F, -0.1398F, -0.0338F));

		PartDefinition cube_r540 = rightFace.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(79, 126).mirror().addBox(-0.4934F, -1.2401F, -1.0193F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2346F, 0.0872F, 4.0499F, 0.3959F, -0.1398F, -0.0338F));

		PartDefinition cube_r541 = rightFace.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(74, 126).mirror().addBox(-0.4934F, -1.0658F, -0.0192F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2346F, 0.0872F, 4.0499F, 0.457F, -0.1398F, -0.0338F));

		PartDefinition cube_r542 = rightFace.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(131, 41).mirror().addBox(-0.4934F, 0.0178F, 0.9808F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2346F, 0.0872F, 4.0499F, 0.5268F, -0.1398F, -0.0338F));

		PartDefinition cube_r543 = rightFace.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(29, 131).mirror().addBox(-0.4934F, 0.3819F, 1.9568F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2346F, 0.0872F, 4.0499F, 0.5704F, -0.1398F, -0.0338F));

		PartDefinition cube_r544 = rightFace.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(137, 12).mirror().addBox(-0.6F, -0.35F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(7, 132).mirror().addBox(-0.6F, -1.35F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(132, 3).mirror().addBox(-0.6F, -1.15F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7835F, -0.9205F, 8.6279F, 0.5722F, -0.1676F, -0.0756F));

		PartDefinition cube_r545 = rightFace.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(24, 87).mirror().addBox(-0.047F, 0.3552F, 0.2517F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7646F, -5.9168F, 5.4282F, 0.2144F, -0.1921F, -0.0341F));

		PartDefinition cube_r546 = rightFace.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(55, 116).mirror().addBox(-0.047F, 2.4812F, 3.7282F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7646F, -5.9168F, 5.4282F, -0.0124F, -0.1921F, -0.0341F));

		PartDefinition cube_r547 = rightFace.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(114, 100).mirror().addBox(-0.4527F, -1.4597F, -0.2567F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, 0.254F, -0.2094F, -0.0176F));

		PartDefinition cube_r548 = rightFace.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(108, 131).mirror().addBox(-0.4527F, 2.5486F, -0.4804F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, 0.0795F, -0.2094F, -0.0176F));

		PartDefinition cube_r549 = rightFace.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(81, 115).mirror().addBox(-0.4527F, -1.4802F, -0.632F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, 0.1667F, -0.2094F, -0.0176F));

		PartDefinition cube_r550 = rightFace.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(36, 101).mirror().addBox(-0.4422F, -4.9318F, -5.8388F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, -2.9389F, -0.1535F, 0.0249F));

		PartDefinition cube_r551 = rightFace.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(7, 117).mirror().addBox(-0.4422F, -5.6906F, -1.8338F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, -2.5026F, -0.1535F, 0.0249F));

		PartDefinition cube_r552 = rightFace.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(123, 23).mirror().addBox(-0.3635F, -2.5079F, 3.117F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, -1.4077F, -0.2123F, 0.0F));

		PartDefinition cube_r553 = rightFace.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(114, 88).mirror().addBox(-0.4527F, 2.286F, 1.1647F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, -0.1823F, -0.2094F, -0.0176F));

		PartDefinition cube_r554 = rightFace.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(109, 21).mirror().addBox(-0.6088F, -5.7883F, -1.5094F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, -1.3545F, -0.1222F, 0.0F));

		PartDefinition cube_r555 = rightFace.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(126, 136).mirror().addBox(-0.6088F, -5.0234F, 3.2478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(135, 129).mirror().addBox(-0.6088F, -4.1574F, 3.7478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, -0.5254F, -0.1222F, 0.0F));

		PartDefinition cube_r556 = rightFace.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(121, 136).mirror().addBox(-0.6088F, 1.1671F, 5.4743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, 0.5218F, -0.1222F, 0.0F));

		PartDefinition cube_r557 = rightFace.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(104, 71).mirror().addBox(-0.6088F, -0.2208F, 3.6492F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, 0.26F, -0.1222F, 0.0F));

		PartDefinition cube_r558 = rightFace.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(136, 110).mirror().addBox(-0.6599F, -3.4042F, -4.3077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, -2.8642F, -0.1222F, 0.0F));

		PartDefinition cube_r559 = rightFace.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(135, 122).mirror().addBox(-0.6599F, -5.1653F, 1.8615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, -1.6163F, -0.1222F, 0.0F));

		PartDefinition cube_r560 = rightFace.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(135, 119).mirror().addBox(-0.6599F, -2.7662F, 3.7474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, -1.0054F, -0.1222F, 0.0F));

		PartDefinition cube_r561 = rightFace.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(112, 135).mirror().addBox(-0.6599F, 1.3748F, 3.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, 0.0418F, -0.1222F, 0.0F));

		PartDefinition cube_r562 = rightFace.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(131, 105).mirror().addBox(-0.6599F, 0.191F, 3.5588F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, 0.1727F, -0.1222F, 0.0F));

		PartDefinition cube_r563 = rightFace.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(62, 126).mirror().addBox(-0.6599F, -1.7556F, 3.535F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, -0.0455F, -0.1222F, 0.0F));

		PartDefinition cube_r564 = rightFace.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(131, 101).mirror().addBox(-0.4691F, 1.3548F, 0.5598F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, 0.2627F, -0.2094F, -0.0176F));

		PartDefinition cube_r565 = rightFace.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(92, 136).mirror().addBox(-0.4691F, 0.7383F, 1.9569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, -0.3045F, -0.2094F, -0.0176F));

		PartDefinition cube_r566 = rightFace.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(136, 101).mirror().addBox(-0.4691F, -2.1196F, 0.536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, -1.5262F, -0.2094F, -0.0176F));

		PartDefinition cube_r567 = rightFace.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(136, 107).mirror().addBox(-0.4696F, 1.4789F, 0.9061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, 1.6145F, -0.2107F, -0.0129F));

		PartDefinition cube_r568 = rightFace.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(136, 104).mirror().addBox(-0.4696F, 1.6069F, -1.6517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, 2.4435F, -0.2107F, -0.0129F));

		PartDefinition cube_r569 = rightFace.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(102, 136).mirror().addBox(-0.4691F, 0.432F, -2.7337F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(136, 57).mirror().addBox(-0.4691F, 0.2712F, -1.6903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, 2.968F, -0.2094F, -0.0176F));

		PartDefinition cube_r570 = rightFace.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(97, 136).mirror().addBox(-0.4691F, -2.2254F, -1.6455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, -2.2244F, -0.2094F, -0.0176F));

		PartDefinition cube_r571 = rightFace.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(83, 136).mirror().addBox(-0.4691F, -0.4494F, 2.0144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, -0.6972F, -0.2094F, -0.0176F));

		PartDefinition cube_r572 = rightFace.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(136, 77).mirror().addBox(-0.4691F, -0.6816F, 2.0314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, -0.9154F, -0.2094F, -0.0176F));

		PartDefinition cube_r573 = rightFace.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(69, 136).mirror().addBox(-0.4691F, 1.0178F, 0.3956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, 0.3064F, -0.2094F, -0.0176F));

		PartDefinition cube_r574 = rightFace.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(64, 136).mirror().addBox(-0.4691F, 0.7198F, -0.8212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, 1.5281F, -0.2094F, -0.0176F));

		PartDefinition cube_r575 = rightFace.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(107, 135).mirror().addBox(-0.4691F, -1.0884F, -2.4439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, -2.1807F, -0.2094F, -0.0176F));

		PartDefinition cube_r576 = rightFace.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(84, 128).mirror().addBox(-0.5F, 0.5F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.122F, -2.1391F, 0.9606F, 2.1331F, -0.1572F, 0.001F));

		PartDefinition cube_r577 = rightFace.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(133, 23).mirror().addBox(-0.3282F, 1.6294F, 0.5845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(17, 133).mirror().addBox(-0.3282F, 2.2294F, 0.5845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0561F, 0.1773F, 0.2638F, 2.4385F, -0.1572F, 0.001F));

		PartDefinition cube_r578 = rightFace.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(133, 26).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(21, 121).mirror().addBox(-0.5F, -0.8F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.3602F, -4.2341F, 4.0165F, 0.6234F, -0.1572F, 0.001F));

		PartDefinition cube_r579 = rightFace.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(14, 121).mirror().addBox(-0.3282F, -3.2294F, 3.4711F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0561F, 0.1773F, 0.2638F, 0.4314F, -0.1572F, 0.001F));

		PartDefinition cube_r580 = rightFace.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(121, 95).mirror().addBox(-0.3282F, -1.9853F, 2.6237F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0561F, 0.1773F, 0.2638F, 0.7368F, -0.1572F, 0.001F));

		PartDefinition cube_r581 = rightFace.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(134, 81).mirror().addBox(-0.1496F, -1.1611F, 1.6574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(22, 134).mirror().addBox(-0.1496F, -0.4361F, 1.6574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7646F, -5.9168F, 5.4282F, -0.9287F, -0.1921F, -0.0341F));

		PartDefinition cube_r582 = rightFace.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(133, 37).mirror().addBox(-0.1496F, -1.7595F, 1.5773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7646F, -5.9168F, 5.4282F, -1.7054F, -0.1921F, -0.0341F));

		PartDefinition cube_r583 = rightFace.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(123, 15).mirror().addBox(-0.1496F, -3.4625F, -0.9251F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7646F, -5.9168F, 5.4282F, -2.5781F, -0.1921F, -0.0341F));

		PartDefinition cube_r584 = rightFace.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(134, 0).mirror().addBox(-0.1496F, -3.1317F, -2.8267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7646F, -5.9168F, 5.4282F, 2.8761F, -0.1921F, -0.0341F));

		PartDefinition cube_r585 = rightFace.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(100, 95).mirror().addBox(-0.1496F, 2.0818F, -3.6693F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7646F, -5.9168F, 5.4282F, 1.5234F, -0.1921F, -0.0341F));

		PartDefinition cube_r586 = rightFace.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(133, 116).mirror().addBox(-0.1496F, 4.0506F, 2.1487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7646F, -5.9168F, 5.4282F, 0.389F, -0.1921F, -0.0341F));

		PartDefinition cube_r587 = rightFace.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(88, 122).mirror().addBox(-0.1496F, -0.3309F, 3.6862F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(133, 96).mirror().addBox(-0.1496F, 1.7351F, 4.4522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7646F, -5.9168F, 5.4282F, 0.0399F, -0.1921F, -0.0341F));

		PartDefinition cube_r588 = rightFace.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(133, 113).mirror().addBox(-0.1496F, 4.0948F, 2.3542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(9, 100).mirror().addBox(-0.1496F, 1.5693F, 1.2853F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7646F, -5.9168F, 5.4282F, 0.5635F, -0.1921F, -0.0341F));

		PartDefinition cube_r589 = rightFace.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(133, 93).mirror().addBox(-0.1496F, 4.5237F, -1.5393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7646F, -5.9168F, 5.4282F, 1.5671F, -0.1921F, -0.0341F));

		PartDefinition cube_r590 = rightFace.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(133, 90).mirror().addBox(-0.1496F, 0.2545F, -5.5486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7646F, -5.9168F, 5.4282F, 2.9633F, -0.1921F, -0.0341F));

		PartDefinition cube_r591 = rightFace.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(133, 87).mirror().addBox(-0.1496F, 4.5589F, -1.208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7646F, -5.9168F, 5.4282F, 1.8289F, -0.1921F, -0.0341F));

		PartDefinition cube_r592 = rightFace.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(78, 135).mirror().addBox(-0.6941F, 1.3935F, -0.0278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(59, 135).mirror().addBox(-0.5191F, 1.3935F, -0.0278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, 1.7463F, -0.2094F, -0.0176F));

		PartDefinition cube_r593 = rightFace.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(67, 99).mirror().addBox(-0.6088F, -1.3645F, 1.8586F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4646F, -5.9168F, 11.1283F, 0.1291F, -0.1222F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.1714F, 1.8497F, 0.8514F, -0.0033F, -0.0561F));

		PartDefinition cube_r594 = jaw.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(113, 83).mirror().addBox(0.309F, -1.1974F, -1.8843F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.1567F, -0.3403F, -0.1047F, 0.0F));

		PartDefinition cube_r595 = jaw.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(128, 37).mirror().addBox(0.309F, -1.3817F, -2.7043F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.1567F, -0.2356F, -0.1047F, 0.0F));

		PartDefinition cube_r596 = jaw.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(128, 49).mirror().addBox(0.309F, -1.8293F, -3.432F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.1567F, -0.0611F, -0.1047F, 0.0F));

		PartDefinition cube_r597 = jaw.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(125, 67).mirror().addBox(0.309F, -2.0159F, -5.5652F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(70, 133).mirror().addBox(0.284F, -0.2159F, -5.4652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.1567F, 0.0262F, -0.1047F, 0.0F));

		PartDefinition cube_r598 = jaw.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(55, 128).mirror().addBox(0.309F, -2.5858F, -6.3292F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.1567F, 0.1309F, -0.1047F, 0.0F));

		PartDefinition cube_r599 = jaw.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(28, 115).mirror().addBox(0.2323F, -1.6831F, -8.303F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.1567F, -0.0131F, -0.1134F, 0.0F));

		PartDefinition cube_r600 = jaw.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(117, 46).mirror().addBox(0.3106F, -1.7952F, -12.0273F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.1567F, 0.1614F, -0.1004F, 0.0F));

		PartDefinition cube_r601 = jaw.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(132, 53).mirror().addBox(0.3106F, -1.4626F, -16.9643F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(54, 132).mirror().addBox(0.3106F, -1.8626F, -15.9643F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(65, 132).mirror().addBox(0.3106F, -1.7626F, -14.9643F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(84, 132).mirror().addBox(0.3106F, -1.5626F, -13.9643F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(92, 132).mirror().addBox(0.3106F, -1.7626F, -12.9643F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(97, 132).mirror().addBox(0.3106F, -1.7626F, -12.0643F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.1567F, 0.0131F, -0.1004F, 0.0F));

		PartDefinition cube_r602 = jaw.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(120, 83).mirror().addBox(0.3106F, 0.7026F, -13.1237F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(0, 133).mirror().addBox(0.3106F, 0.4578F, -16.868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(12, 133).mirror().addBox(0.3106F, 0.4578F, -17.168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.1567F, -0.0436F, -0.1004F, 0.0F));

		PartDefinition cube_r603 = jaw.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(92, 42).mirror().addBox(0.3056F, -2.0339F, -14.162F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.1567F, 0.1222F, -0.1004F, 0.0F));

		PartDefinition cube_r604 = jaw.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(124, 41).mirror().addBox(0.3106F, -0.536F, -16.0749F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.1567F, 0.0175F, -0.1004F, 0.0F));

		PartDefinition cube_r605 = jaw.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(137, 63).mirror().addBox(0.3106F, 8.9812F, -14.0604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.1567F, -0.576F, -0.1004F, 0.0F));

		PartDefinition cube_r606 = jaw.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(69, 113).mirror().addBox(0.3106F, -4.45F, -9.678F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.1567F, 0.3622F, -0.1004F, 0.0F));

		PartDefinition cube_r607 = jaw.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(0, 121).mirror().addBox(0.309F, -1.5151F, -0.5754F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.1567F, 0.1396F, -0.1047F, 0.0F));

		PartDefinition cube_r608 = jaw.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(0, 88).mirror().addBox(0.309F, -1.1877F, -2.1867F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.1567F, 0.4014F, -0.1047F, 0.0F));

		PartDefinition cube_r609 = jaw.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(98, 113).mirror().addBox(0.309F, -0.506F, -3.752F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.1567F, 0.0611F, -0.1047F, 0.0F));

		PartDefinition cube_r610 = jaw.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(33, 93).mirror().addBox(0.309F, -1.0011F, -6.4692F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.1567F, -0.0785F, -0.1047F, 0.0F));

		PartDefinition cube_r611 = jaw.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(35, 115).mirror().addBox(0.2323F, 0.3827F, -8.1824F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.1567F, -0.1396F, -0.1134F, 0.0F));

		PartDefinition cube_r612 = jaw.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(86, 90).mirror().addBox(0.3106F, -0.4078F, -11.6982F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.1567F, 0.0698F, -0.1004F, 0.0F));

		PartDefinition cube_r613 = jaw.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(115, 54).mirror().addBox(0.3106F, -1.864F, -14.6151F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.1567F, 0.1134F, -0.1004F, 0.0F));

		PartDefinition cube_r614 = jaw.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(113, 0).mirror().addBox(0.309F, 3.0614F, -2.4072F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.1567F, -1.4573F, -0.1047F, 0.0F));

		PartDefinition cube_r615 = jaw.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(121, 37).mirror().addBox(0.3106F, -8.6608F, -0.0648F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.1567F, 1.6275F, -0.1004F, 0.0F));

		PartDefinition cube_r616 = jaw.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(112, 41).mirror().addBox(0.3106F, -6.2812F, 5.4167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.1567F, 2.2384F, -0.1004F, 0.0F));

		PartDefinition cube_r617 = jaw.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(95, 22).mirror().addBox(0.3106F, 0.4162F, -10.0575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.1567F, -0.0175F, -0.1004F, 0.0F));

		PartDefinition cube_r618 = jaw.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(126, 132).mirror().addBox(0.3106F, 10.6341F, -1.4122F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.1567F, -1.4137F, -0.1004F, 0.0F));

		PartDefinition cube_r619 = jaw.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(137, 52).mirror().addBox(0.3106F, 13.5952F, 6.5616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.1567F, -1.9722F, -0.1004F, 0.0F));

		PartDefinition cube_r620 = jaw.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(136, 132).mirror().addBox(0.3106F, -3.1235F, 14.2398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.1567F, 3.0456F, -0.1004F, 0.0F));

		PartDefinition cube_r621 = jaw.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(128, 87).mirror().addBox(0.3106F, -2.6804F, -10.9577F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(133, 49).mirror().addBox(0.3106F, -2.6804F, -9.9577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, 1.4155F, -0.1567F, 0.1004F, -0.1004F, 0.0F));

		PartDefinition cube_r622 = jaw.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(63, 58).mirror().addBox(0.8838F, 0.8123F, -4.3129F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5148F, 1.4155F, -0.2567F, 0.0F, -0.4102F, 0.0F));

		PartDefinition cube_r623 = jaw.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(65, 61).mirror().addBox(1.2518F, 0.3336F, -1.5632F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5148F, 1.4155F, -0.2567F, 0.2853F, -0.2014F, 0.0665F));

		PartDefinition cube_r624 = jaw.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(65, 61).addBox(-1.2518F, 0.3336F, -1.5632F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5148F, 1.4155F, -0.2567F, 0.2853F, 0.2014F, -0.0665F));

		PartDefinition cube_r625 = jaw.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(63, 58).addBox(-0.8838F, 0.8123F, -4.3129F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5148F, 1.4155F, -0.2567F, 0.0F, 0.4102F, 0.0F));

		PartDefinition cube_r626 = jaw.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(126, 132).addBox(-1.3106F, 10.6341F, -1.4122F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.1567F, -1.4137F, 0.1004F, 0.0F));

		PartDefinition cube_r627 = jaw.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(115, 54).addBox(-1.3106F, -1.864F, -14.6151F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.1567F, 0.1134F, 0.1004F, 0.0F));

		PartDefinition cube_r628 = jaw.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(95, 22).addBox(-1.3106F, 0.4162F, -10.0575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.1567F, -0.0175F, 0.1004F, 0.0F));

		PartDefinition cube_r629 = jaw.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(86, 90).addBox(-1.3106F, -0.4078F, -11.6982F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.1567F, 0.0698F, 0.1004F, 0.0F));

		PartDefinition cube_r630 = jaw.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(35, 115).addBox(-1.2323F, 0.3827F, -8.1824F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.1567F, -0.1396F, 0.1134F, 0.0F));

		PartDefinition cube_r631 = jaw.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(33, 93).addBox(-1.309F, -1.0011F, -6.4692F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.1567F, -0.0785F, 0.1047F, 0.0F));

		PartDefinition cube_r632 = jaw.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(98, 113).addBox(-1.309F, -0.506F, -3.752F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.1567F, 0.0611F, 0.1047F, 0.0F));

		PartDefinition cube_r633 = jaw.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(0, 88).addBox(-1.309F, -1.1877F, -2.1867F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.1567F, 0.4014F, 0.1047F, 0.0F));

		PartDefinition cube_r634 = jaw.addOrReplaceChild("cube_r634", CubeListBuilder.create().texOffs(0, 121).addBox(-1.309F, -1.5151F, -0.5754F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.1567F, 0.1396F, 0.1047F, 0.0F));

		PartDefinition cube_r635 = jaw.addOrReplaceChild("cube_r635", CubeListBuilder.create().texOffs(112, 41).addBox(-1.3106F, -6.2812F, 5.4167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.1567F, 2.2384F, 0.1004F, 0.0F));

		PartDefinition cube_r636 = jaw.addOrReplaceChild("cube_r636", CubeListBuilder.create().texOffs(121, 37).addBox(-1.3106F, -8.6608F, -0.0648F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.1567F, 1.6275F, 0.1004F, 0.0F));

		PartDefinition cube_r637 = jaw.addOrReplaceChild("cube_r637", CubeListBuilder.create().texOffs(69, 113).addBox(-1.3106F, -4.45F, -9.678F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.1567F, 0.3622F, 0.1004F, 0.0F));

		PartDefinition cube_r638 = jaw.addOrReplaceChild("cube_r638", CubeListBuilder.create().texOffs(12, 133).addBox(-1.3106F, 0.4578F, -17.168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(0, 133).addBox(-1.3106F, 0.4578F, -16.868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(120, 83).addBox(-1.3106F, 0.7026F, -13.1237F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.1567F, -0.0436F, 0.1004F, 0.0F));

		PartDefinition cube_r639 = jaw.addOrReplaceChild("cube_r639", CubeListBuilder.create().texOffs(136, 132).addBox(-1.3106F, -3.1235F, 14.2398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.1567F, 3.0456F, 0.1004F, 0.0F));

		PartDefinition cube_r640 = jaw.addOrReplaceChild("cube_r640", CubeListBuilder.create().texOffs(137, 52).addBox(-1.3106F, 13.5952F, 6.5616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.1567F, -1.9722F, 0.1004F, 0.0F));

		PartDefinition cube_r641 = jaw.addOrReplaceChild("cube_r641", CubeListBuilder.create().texOffs(137, 63).addBox(-1.3106F, 8.9812F, -14.0604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.1567F, -0.576F, 0.1004F, 0.0F));

		PartDefinition cube_r642 = jaw.addOrReplaceChild("cube_r642", CubeListBuilder.create().texOffs(124, 41).addBox(-1.3106F, -0.536F, -16.0749F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.1567F, 0.0175F, 0.1004F, 0.0F));

		PartDefinition cube_r643 = jaw.addOrReplaceChild("cube_r643", CubeListBuilder.create().texOffs(92, 42).addBox(-1.3056F, -2.0339F, -14.162F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.1567F, 0.1222F, 0.1004F, 0.0F));

		PartDefinition cube_r644 = jaw.addOrReplaceChild("cube_r644", CubeListBuilder.create().texOffs(133, 49).addBox(-1.3106F, -2.6804F, -9.9577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(128, 87).addBox(-1.3106F, -2.6804F, -10.9577F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.1567F, 0.1004F, 0.1004F, 0.0F));

		PartDefinition cube_r645 = jaw.addOrReplaceChild("cube_r645", CubeListBuilder.create().texOffs(97, 132).addBox(-1.3106F, -1.7626F, -12.0643F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(92, 132).addBox(-1.3106F, -1.7626F, -12.9643F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(84, 132).addBox(-1.3106F, -1.5626F, -13.9643F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(65, 132).addBox(-1.3106F, -1.7626F, -14.9643F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(54, 132).addBox(-1.3106F, -1.8626F, -15.9643F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(132, 53).addBox(-1.3106F, -1.4626F, -16.9643F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.1567F, 0.0131F, 0.1004F, 0.0F));

		PartDefinition cube_r646 = jaw.addOrReplaceChild("cube_r646", CubeListBuilder.create().texOffs(117, 46).addBox(-1.3106F, -1.7952F, -12.0273F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.1567F, 0.1614F, 0.1004F, 0.0F));

		PartDefinition cube_r647 = jaw.addOrReplaceChild("cube_r647", CubeListBuilder.create().texOffs(28, 115).addBox(-1.2323F, -1.6831F, -8.303F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.1567F, -0.0131F, 0.1134F, 0.0F));

		PartDefinition cube_r648 = jaw.addOrReplaceChild("cube_r648", CubeListBuilder.create().texOffs(55, 128).addBox(-1.309F, -2.5858F, -6.3292F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.1567F, 0.1309F, 0.1047F, 0.0F));

		PartDefinition cube_r649 = jaw.addOrReplaceChild("cube_r649", CubeListBuilder.create().texOffs(70, 133).addBox(-1.284F, -0.2159F, -5.4652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(125, 67).addBox(-1.309F, -2.0159F, -5.5652F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.1567F, 0.0262F, 0.1047F, 0.0F));

		PartDefinition cube_r650 = jaw.addOrReplaceChild("cube_r650", CubeListBuilder.create().texOffs(113, 0).addBox(-1.309F, 3.0614F, -2.4072F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.1567F, -1.4573F, 0.1047F, 0.0F));

		PartDefinition cube_r651 = jaw.addOrReplaceChild("cube_r651", CubeListBuilder.create().texOffs(128, 49).addBox(-1.309F, -1.8293F, -3.432F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.1567F, -0.0611F, 0.1047F, 0.0F));

		PartDefinition cube_r652 = jaw.addOrReplaceChild("cube_r652", CubeListBuilder.create().texOffs(128, 37).addBox(-1.309F, -1.3817F, -2.7043F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.1567F, -0.2356F, 0.1047F, 0.0F));

		PartDefinition cube_r653 = jaw.addOrReplaceChild("cube_r653", CubeListBuilder.create().texOffs(113, 83).addBox(-1.309F, -1.1974F, -1.8843F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.4898F, 1.4155F, -0.1567F, -0.3403F, 0.1047F, 0.0F));

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