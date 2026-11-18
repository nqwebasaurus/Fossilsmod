package fossils.fossils.client.blockentity.model.spectrovenator;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SpectrovenatorFossilModel extends SkullModelBase {
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
	private final ModelPart bone2;
	private final ModelPart bone4;

	public SpectrovenatorFossilModel(ModelPart root) {
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
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -21.1335F, 0.8251F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(27, 25).addBox(-0.006F, -2.4F, 0.0F, 0.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9927F, -2.1753F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -2.0322F, 1.3974F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9408F, 3.3772F, 3.1961F, 0.0873F, 0.0F, 0.1309F));

		PartDefinition cube_r3 = bone3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(69, 0).addBox(-0.5827F, 3.7931F, -8.2175F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4909F, -7.9022F, 5.397F, -0.222F, -0.0321F, -0.4016F));

		PartDefinition cube_r4 = bone3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(103, 42).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.574F, -8.0986F, 2.8144F, -0.1347F, -0.0321F, -0.4016F));

		PartDefinition cube_r5 = bone3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(92, 52).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5179F, -8.1307F, 0.8154F, -0.0038F, -0.0321F, -0.4016F));

		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(44, 74).addBox(-0.479F, -2.5549F, 0.0659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.2453F, -7.2638F, 3.9941F, -2.5185F, 0.0153F, -0.4102F));

		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(110, 42).addBox(-0.5F, -1.5F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0988F, -4.7483F, 3.1755F, -1.4505F, -0.0327F, -0.4104F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(95, 14).addBox(-0.5F, -1.175F, -2.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3207F, -5.3194F, 2.4303F, 0.3385F, -0.0327F, -0.4104F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(113, 79).addBox(-0.4786F, 1.3048F, -0.5574F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2453F, -7.2638F, 3.9941F, -0.0006F, 0.009F, -0.405F));

		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(28, 110).addBox(-0.4786F, -0.2357F, 1.2689F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.2453F, -7.2638F, 3.9941F, -0.3061F, 0.009F, -0.405F));

		PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(117, 41).addBox(-0.4786F, -3.3449F, 0.881F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2453F, -7.2638F, 3.9941F, -1.4842F, 0.009F, -0.405F));

		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(130, 127).addBox(-0.4786F, -4.3372F, -0.1774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.2453F, -7.2638F, 3.9941F, -2.0078F, 0.009F, -0.405F));

		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(71, 130).addBox(-0.4786F, -1.6722F, -4.0058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.2453F, -7.2638F, 3.9941F, 3.141F, 0.009F, -0.405F));

		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(84, 131).addBox(-0.4786F, 0.7045F, -4.3182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2453F, -7.2638F, 3.9941F, 2.7483F, 0.009F, -0.405F));

		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(5, 120).addBox(-0.4786F, 2.5638F, -0.8975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.2453F, -7.2638F, 3.9941F, 1.352F, 0.009F, -0.405F));

		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(93, 38).addBox(-0.4726F, -0.7409F, -0.3017F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.2453F, -7.2638F, 3.9941F, -0.0792F, 0.009F, -0.405F));

		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(87, 120).addBox(-0.6927F, -2.1842F, -0.7551F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.323F, 2.1302F, 2.7133F, 0.585F, 0.0001F, 0.0892F));

		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(48, 125).addBox(-0.6927F, 0.6378F, -0.7715F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.323F, 2.1302F, 2.7133F, 0.6286F, 0.0001F, 0.0892F));

		PartDefinition cube_r19 = bone3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(98, 95).addBox(-0.6927F, -0.8741F, -0.3655F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.323F, 2.1302F, 2.7133F, 2.4525F, 0.0001F, 0.0892F));

		PartDefinition cube_r20 = bone3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(97, 120).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1078F, 4.7838F, 3.718F, 0.6984F, 0.0001F, 0.0892F));

		PartDefinition cube_r21 = bone3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(95, 125).addBox(-0.6927F, 2.6477F, -1.0023F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.323F, 2.1302F, 2.7133F, 0.7159F, 0.0001F, 0.0892F));

		PartDefinition cube_r22 = bone3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(97, 26).addBox(-0.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4524F, -1.5201F, 2.3142F, 1.5529F, 0.0639F, 0.0248F));

		PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(115, 16).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -2.3535F, 1.1728F, 0.1566F, 0.0639F, 0.0248F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(123, 123).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.6986F, 10.9214F, -6.6105F, 2.8852F, 0.0014F, -0.1728F));

		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(68, 120).addBox(-0.5F, 0.7F, 0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.8681F, 11.8703F, -3.742F, -3.1013F, 0.0014F, -0.1728F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(110, 123).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.8681F, 11.8703F, -3.742F, -2.665F, 0.0014F, -0.1728F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(56, 123).addBox(-0.4807F, -1.4534F, -0.1038F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7094F, 11.0848F, -5.1926F, -1.5742F, 0.0014F, -0.1728F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(29, 69).addBox(-1.1643F, 4.0237F, 0.0159F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3477F, 4.214F, -5.1717F, -0.1847F, 0.0781F, -0.1611F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(70, 109).addBox(-1.0235F, -0.2792F, -0.2479F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3477F, 4.214F, -5.1717F, -0.1332F, 0.0932F, -0.1529F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(75, 109).addBox(-1.1183F, -7.4678F, -0.6699F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3477F, 6.614F, -5.5717F, -0.3406F, 0.0607F, 0.0319F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(92, 114).addBox(-1.1183F, -7.2791F, 0.0313F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3477F, 6.614F, -5.5717F, -0.0614F, 0.0607F, 0.0319F));

		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(95, 6).addBox(-0.5F, -2.5F, -1.175F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1614F, -1.7688F, -3.831F, -0.0877F, 0.0639F, 0.0248F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 61).addBox(-0.3844F, -0.3889F, -2.7767F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.241F, -3.7485F, -1.5432F, -0.1925F, 0.0639F, 0.0248F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(65, 48).addBox(-0.5F, -1.425F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.218F, -6.0118F, -5.0437F, 2.0602F, -0.2637F, -0.388F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(93, 59).addBox(-1.0083F, -1.7F, -2.8399F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.9894F, -8.5011F, -2.8984F, 1.6057F, -0.3289F, -0.3595F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(110, 64).addBox(-1.0083F, -5.3737F, -0.8867F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.9894F, -8.5011F, -2.8984F, 2.4609F, -0.3289F, -0.3595F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(113, 74).addBox(-1.0083F, -4.9861F, 2.054F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9894F, -8.5011F, -2.8984F, 2.7663F, -0.3289F, -0.3595F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(136, 16).addBox(-1.0083F, 1.0179F, 5.3451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.9894F, -8.5011F, -2.8984F, -2.4696F, -0.3289F, -0.3595F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(113, 23).addBox(-1.0083F, 3.1111F, 2.2672F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.9894F, -8.5011F, -2.8984F, -1.9024F, -0.3289F, -0.3595F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(7, 110).addBox(-1.0083F, 3.5599F, -0.5921F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.9894F, -8.5011F, -2.8984F, -1.3788F, -0.3289F, -0.3595F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 110).addBox(-1.0083F, -0.2796F, -3.5979F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.9894F, -8.5011F, -2.8984F, 0.1047F, -0.3289F, -0.3595F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(14, 116).addBox(-0.5F, -0.1F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.4923F, -8.3134F, -2.1398F, -0.0998F, -0.0321F, -0.4016F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(71, 90).addBox(-0.5F, -2.05F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.7197F, -6.3805F, -0.7551F, -0.0736F, -0.0321F, -0.4016F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9408F, 3.3772F, 3.1961F, 0.0873F, 0.0F, -0.1309F));

		PartDefinition cube_r44 = bone5.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(69, 0).mirror().addBox(-0.4173F, 3.7931F, -8.2175F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4909F, -7.9022F, 5.397F, -0.222F, 0.0321F, 0.4016F));

		PartDefinition cube_r45 = bone5.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(103, 42).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.574F, -8.0986F, 2.8144F, -0.1347F, 0.0321F, 0.4016F));

		PartDefinition cube_r46 = bone5.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(92, 52).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5179F, -8.1307F, 0.8154F, -0.0038F, 0.0321F, 0.4016F));

		PartDefinition cube_r47 = bone5.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(44, 74).mirror().addBox(-0.521F, -2.5549F, 0.0659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.2453F, -7.2638F, 3.9941F, -2.5185F, -0.0153F, 0.4102F));

		PartDefinition cube_r48 = bone5.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(110, 42).mirror().addBox(-0.5F, -1.5F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0988F, -4.7483F, 3.1755F, -1.4505F, 0.0327F, 0.4104F));

		PartDefinition cube_r49 = bone5.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(95, 14).mirror().addBox(-0.5F, -1.175F, -2.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3207F, -5.3194F, 2.4303F, 0.3385F, 0.0327F, 0.4104F));

		PartDefinition cube_r50 = bone5.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(113, 79).mirror().addBox(-0.5214F, 1.3048F, -0.5574F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2453F, -7.2638F, 3.9941F, -0.0006F, -0.009F, 0.405F));

		PartDefinition cube_r51 = bone5.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(28, 110).mirror().addBox(-0.5214F, -0.2357F, 1.2689F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.2453F, -7.2638F, 3.9941F, -0.3061F, -0.009F, 0.405F));

		PartDefinition cube_r52 = bone5.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(117, 41).mirror().addBox(-0.5214F, -3.3449F, 0.881F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2453F, -7.2638F, 3.9941F, -1.4842F, -0.009F, 0.405F));

		PartDefinition cube_r53 = bone5.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(130, 127).mirror().addBox(-0.5214F, -4.3372F, -0.1774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.2453F, -7.2638F, 3.9941F, -2.0078F, -0.009F, 0.405F));

		PartDefinition cube_r54 = bone5.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(71, 130).mirror().addBox(-0.5214F, -1.6722F, -4.0058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.2453F, -7.2638F, 3.9941F, 3.141F, -0.009F, 0.405F));

		PartDefinition cube_r55 = bone5.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(84, 131).mirror().addBox(-0.5214F, 0.7045F, -4.3182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2453F, -7.2638F, 3.9941F, 2.7483F, -0.009F, 0.405F));

		PartDefinition cube_r56 = bone5.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(5, 120).mirror().addBox(-0.5214F, 2.5638F, -0.8975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.2453F, -7.2638F, 3.9941F, 1.352F, -0.009F, 0.405F));

		PartDefinition cube_r57 = bone5.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(93, 38).mirror().addBox(-0.5274F, -0.7409F, -0.3017F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.2453F, -7.2638F, 3.9941F, -0.0792F, -0.009F, 0.405F));

		PartDefinition cube_r58 = bone5.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(87, 120).mirror().addBox(-0.3073F, -2.1842F, -0.7551F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.323F, 2.1302F, 2.7133F, 0.585F, -0.0001F, -0.0892F));

		PartDefinition cube_r59 = bone5.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(48, 125).mirror().addBox(-0.3073F, 0.6378F, -0.7715F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.323F, 2.1302F, 2.7133F, 0.6286F, -0.0001F, -0.0892F));

		PartDefinition cube_r60 = bone5.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(98, 95).mirror().addBox(-0.3073F, -0.8741F, -0.3655F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.323F, 2.1302F, 2.7133F, 2.4525F, -0.0001F, -0.0892F));

		PartDefinition cube_r61 = bone5.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(97, 120).mirror().addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1078F, 4.7838F, 3.718F, 0.6984F, -0.0001F, -0.0892F));

		PartDefinition cube_r62 = bone5.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(95, 125).mirror().addBox(-0.3073F, 2.6477F, -1.0023F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.323F, 2.1302F, 2.7133F, 0.7159F, -0.0001F, -0.0892F));

		PartDefinition cube_r63 = bone5.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(97, 26).mirror().addBox(-0.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4524F, -1.5201F, 2.3142F, 1.5529F, -0.0639F, -0.0248F));

		PartDefinition cube_r64 = bone5.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(115, 16).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.3535F, 1.1728F, 0.1566F, -0.0639F, -0.0248F));

		PartDefinition cube_r65 = bone5.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(123, 123).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6986F, 10.9214F, -6.6105F, 2.8852F, -0.0014F, 0.1728F));

		PartDefinition cube_r66 = bone5.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(68, 120).mirror().addBox(-0.5F, 0.7F, 0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8681F, 11.8703F, -3.742F, -3.1013F, -0.0014F, 0.1728F));

		PartDefinition cube_r67 = bone5.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(110, 123).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8681F, 11.8703F, -3.742F, -2.665F, -0.0014F, 0.1728F));

		PartDefinition cube_r68 = bone5.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(56, 123).mirror().addBox(-0.5193F, -1.4534F, -0.1038F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7094F, 11.0848F, -5.1926F, -1.5742F, -0.0014F, 0.1728F));

		PartDefinition cube_r69 = bone5.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(29, 69).mirror().addBox(0.1643F, 4.0237F, 0.0159F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3477F, 4.214F, -5.1717F, -0.1847F, -0.0781F, 0.1611F));

		PartDefinition cube_r70 = bone5.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(70, 109).mirror().addBox(0.0235F, -0.2792F, -0.2479F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3477F, 4.214F, -5.1717F, -0.1332F, -0.0932F, 0.1529F));

		PartDefinition cube_r71 = bone5.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(75, 109).mirror().addBox(0.1183F, -7.4678F, -0.6699F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3477F, 6.614F, -5.5717F, -0.3406F, -0.0607F, -0.0319F));

		PartDefinition cube_r72 = bone5.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(92, 114).mirror().addBox(0.1183F, -7.2791F, 0.0313F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3477F, 6.614F, -5.5717F, -0.0614F, -0.0607F, -0.0319F));

		PartDefinition cube_r73 = bone5.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(95, 6).mirror().addBox(-0.5F, -2.5F, -1.175F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1614F, -1.7688F, -3.831F, -0.0877F, -0.0639F, -0.0248F));

		PartDefinition cube_r74 = bone5.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-0.6156F, -0.3889F, -2.7767F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.241F, -3.7485F, -1.5432F, -0.1925F, -0.0639F, -0.0248F));

		PartDefinition cube_r75 = bone5.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(65, 48).mirror().addBox(-0.5F, -1.425F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.218F, -6.0118F, -5.0437F, 2.0602F, 0.2637F, 0.388F));

		PartDefinition cube_r76 = bone5.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(93, 59).mirror().addBox(0.0083F, -1.7F, -2.8399F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.9894F, -8.5011F, -2.8984F, 1.6057F, 0.3289F, 0.3595F));

		PartDefinition cube_r77 = bone5.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(110, 64).mirror().addBox(0.0083F, -5.3737F, -0.8867F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.9894F, -8.5011F, -2.8984F, 2.4609F, 0.3289F, 0.3595F));

		PartDefinition cube_r78 = bone5.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(113, 74).mirror().addBox(0.0083F, -4.9861F, 2.054F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.9894F, -8.5011F, -2.8984F, 2.7663F, 0.3289F, 0.3595F));

		PartDefinition cube_r79 = bone5.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(136, 16).mirror().addBox(0.0083F, 1.0179F, 5.3451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.9894F, -8.5011F, -2.8984F, -2.4696F, 0.3289F, 0.3595F));

		PartDefinition cube_r80 = bone5.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(113, 23).mirror().addBox(0.0083F, 3.1111F, 2.2672F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.9894F, -8.5011F, -2.8984F, -1.9024F, 0.3289F, 0.3595F));

		PartDefinition cube_r81 = bone5.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(7, 110).mirror().addBox(0.0083F, 3.5599F, -0.5921F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.9894F, -8.5011F, -2.8984F, -1.3788F, 0.3289F, 0.3595F));

		PartDefinition cube_r82 = bone5.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(0, 110).mirror().addBox(0.0083F, -0.2796F, -3.5979F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.9894F, -8.5011F, -2.8984F, 0.1047F, 0.3289F, 0.3595F));

		PartDefinition cube_r83 = bone5.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(14, 116).mirror().addBox(-0.5F, -0.1F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.4923F, -8.3134F, -2.1398F, -0.0998F, 0.0321F, 0.4016F));

		PartDefinition cube_r84 = bone5.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(71, 90).mirror().addBox(-0.5F, -2.05F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.7197F, -6.3805F, -0.7551F, -0.0736F, 0.0321F, 0.4016F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 0.3101F, 1.1584F, -1.1478F, -0.2396F, -0.1064F));

		PartDefinition cube_r85 = rightLeg1.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(123, 83).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5F, 17.1949F, -3.4849F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg1.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(118, 49).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.5F, 17.1688F, -2.4852F, -1.5446F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg1.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(107, 98).addBox(-1.0F, -0.5F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.5F, 16.0267F, -2.0907F, -2.33F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg1.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(66, 105).addBox(-1.0F, -1.1F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(123, 45).addBox(-1.0F, -0.8F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.5F, 15.2026F, -1.2656F, -2.8972F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg1.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(77, 116).addBox(-5.1F, -2.1557F, 0.207F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.6F, 15.4054F, -1.1045F, 1.597F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg1.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(112, 114).addBox(-1.0F, -2.45F, -1.05F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5F, 7.2071F, -0.0888F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(0, 104).addBox(-1.0F, -2.3F, -1.2F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 13.1655F, -1.746F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(32, 104).addBox(-1.0F, 0.0F, -0.1F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5F, 11.0532F, -3.4256F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 81).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.5F, 11.4868F, -1.6521F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg1.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(99, 82).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, 9.0927F, -3.057F, 1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg1.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(50, 101).addBox(-1.0F, 2.0F, 0.075F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5F, 7.1304F, -2.6631F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg1.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(73, 120).addBox(-1.0F, 2.0F, 1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5F, 1.1242F, -0.9473F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg1.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(63, 95).addBox(-1.0F, 0.338F, -0.9542F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.5F, 1.0113F, -0.1904F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg1.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(104, 15).addBox(-1.0F, -0.9019F, -0.4597F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, 1.0113F, -0.1904F, 1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg1.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(49, 84).addBox(-1.0F, -0.045F, -1.4895F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, 1.0113F, -0.1904F, 1.501F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg1.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(89, 101).addBox(-1.0F, -1.5714F, -0.0572F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.0113F, -0.1904F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg1.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(94, 44).addBox(-1.0F, -1.8F, -0.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 3.4911F, -0.7251F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg1.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(90, 77).addBox(-1.0F, 0.0F, -0.1F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, 3.4239F, -1.1433F, -0.2923F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg1.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(41, 101).addBox(-1.0F, -1.525F, -1.225F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, 16.1618F, -2.8135F, -0.1484F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 17.7332F, -1.3082F, 2.3649F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(120, 11).addBox(-1.0F, 0.55F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3F, 1.1606F, -0.8554F, -1.8588F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(90, 33).addBox(-1.0F, -0.75F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3F, -0.4551F, -1.2224F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(98, 105).addBox(-1.0F, -0.65F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.3F, -0.4141F, -2.4581F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(119, 111).addBox(-1.0F, -1.0F, -1.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.3F, 2.2753F, 0.6252F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(102, 6).addBox(-1.0F, -1.0F, -1.15F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.3F, 0.8F, -0.4169F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(59, 103).addBox(-1.0F, -2.625F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.3F, 13.348F, -1.8443F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(15, 69).addBox(-1.0F, -12.2F, -0.5F, 2.0F, 15.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.3F, 12.0497F, -0.6659F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightLeg2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(109, 83).addBox(-1.0F, -1.5F, -0.925F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3F, 1.1565F, 1.3545F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightLeg2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(74, 48).addBox(-1.1F, -1.0318F, 0.0813F, 2.0F, 14.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.2F, 1.8471F, -0.5117F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r113 = rightLeg2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(110, 69).addBox(-0.5F, -5.6115F, -0.7135F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, 4.8612F, -0.2063F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r114 = rightLeg2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(21, 28).addBox(-0.5F, 5.7012F, 0.7602F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.8F, 1.1424F, -0.4934F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r115 = rightLeg2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(107, 102).addBox(-0.5F, -0.2712F, 0.8143F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.8F, 1.1424F, -0.4934F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r116 = rightLeg2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(60, 109).addBox(-0.5F, -0.1604F, 0.0505F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.8F, 1.1424F, -0.4934F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(59, 77).addBox(-1.0F, 0.0554F, -0.5239F, 3.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.9763F, -1.7706F, -2.5307F, 0.0F, 0.0F));

		PartDefinition cube_r117 = rightLeg3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(43, 128).addBox(-0.8F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.438F, 8.3493F, 1.1445F, 0.8727F, 0.0F, 0.1309F));

		PartDefinition cube_r118 = rightLeg3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(48, 129).addBox(0.2966F, -0.5473F, 0.7221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0958F, 7.2425F, -0.1239F, 0.4363F, 0.0F, 0.1309F));

		PartDefinition cube_r119 = rightLeg3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(14, 108).addBox(0.2966F, -5.0522F, -0.2F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.9F, 5.7553F, 0.3761F, 0.1309F, 0.0F, 0.1309F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(50, 33).addBox(-1.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 10.0042F, 0.4527F, 2.1555F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(42, 41).addBox(-2.5F, -0.8F, -4.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7254F, -3.9319F, -0.3889F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 0.3101F, 1.1584F, -0.8446F, 0.1866F, 0.1137F));

		PartDefinition cube_r120 = leftLeg1.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(123, 94).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.5F, 17.1949F, -3.4849F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r121 = leftLeg1.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(36, 121).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-1.5F, 17.1688F, -2.4852F, -1.5446F, 0.0F, 0.0F));

		PartDefinition cube_r122 = leftLeg1.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(19, 108).addBox(-1.0F, -0.5F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-1.5F, 16.0267F, -2.0907F, -2.33F, 0.0F, 0.0F));

		PartDefinition cube_r123 = leftLeg1.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(86, 106).addBox(-1.0F, -1.1F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(123, 91).addBox(-1.0F, -0.8F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-1.5F, 15.2026F, -1.2656F, -2.8972F, 0.0F, 0.0F));

		PartDefinition cube_r124 = leftLeg1.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(38, 117).addBox(3.1F, -2.1557F, 0.207F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-5.6F, 15.4054F, -1.1045F, 1.597F, 0.0F, 0.0F));

		PartDefinition cube_r125 = leftLeg1.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(7, 115).addBox(-1.0F, -2.45F, -1.05F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.5F, 7.2071F, -0.0888F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r126 = leftLeg1.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(7, 104).addBox(-1.0F, -2.3F, -1.2F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 13.1655F, -1.746F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r127 = leftLeg1.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(48, 106).addBox(-1.0F, 0.0F, -0.1F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.5F, 11.0532F, -3.4256F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r128 = leftLeg1.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(7, 81).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.5F, 11.4868F, -1.6521F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r129 = leftLeg1.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(101, 32).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5F, 9.0927F, -3.057F, 1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r130 = leftLeg1.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(101, 70).addBox(-1.0F, 2.0F, 0.075F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5F, 7.1304F, -2.6631F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r131 = leftLeg1.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(80, 120).addBox(-1.0F, 2.0F, 1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5F, 1.1242F, -0.9473F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r132 = leftLeg1.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(120, 80).addBox(-1.0F, 0.338F, -0.9542F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.5F, 1.0113F, -0.1904F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r133 = leftLeg1.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(39, 106).addBox(-1.0F, -0.9019F, -0.4597F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.5F, 1.0113F, -0.1904F, 1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r134 = leftLeg1.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(23, 98).addBox(-1.0F, -0.045F, -1.4895F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5F, 1.0113F, -0.1904F, 1.501F, 0.0F, 0.0F));

		PartDefinition cube_r135 = leftLeg1.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(102, 37).addBox(-1.0F, -1.5714F, -0.0572F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 1.0113F, -0.1904F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r136 = leftLeg1.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(95, 0).addBox(-1.0F, -1.8F, -0.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 3.4911F, -0.7251F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r137 = leftLeg1.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(80, 90).addBox(-1.0F, 0.0F, -0.1F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.5F, 3.4239F, -1.1433F, -0.2923F, 0.0F, 0.0F));

		PartDefinition cube_r138 = leftLeg1.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(101, 65).addBox(-1.0F, -1.525F, -1.225F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.5F, 16.1618F, -2.8135F, -0.1484F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 17.7332F, -1.3082F, 1.9722F, 0.0F, 0.0F));

		PartDefinition cube_r139 = leftLeg2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(24, 120).addBox(-1.0F, 0.55F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3F, 1.1606F, -0.8554F, -1.8588F, 0.0F, 0.0F));

		PartDefinition cube_r140 = leftLeg2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(89, 90).addBox(-1.0F, -0.75F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, -0.4551F, -1.2224F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r141 = leftLeg2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(107, 94).addBox(-1.0F, -0.65F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.3F, -0.4141F, -2.4581F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r142 = leftLeg2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(119, 119).addBox(-1.0F, -1.0F, -1.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.3F, 2.2753F, 0.6252F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r143 = leftLeg2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(102, 57).addBox(-1.0F, -1.0F, -1.15F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3F, 0.8F, -0.4169F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r144 = leftLeg2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(79, 103).addBox(-1.0F, -2.625F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.3F, 13.348F, -1.8443F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r145 = leftLeg2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(22, 69).addBox(-1.0F, -12.2F, -0.5F, 2.0F, 15.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.3F, 12.0497F, -0.6659F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r146 = leftLeg2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(95, 109).addBox(-1.0F, -1.5F, -0.925F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, 1.1565F, 1.3545F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r147 = leftLeg2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(77, 9).addBox(-0.9F, -1.0318F, 0.0813F, 2.0F, 14.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.2F, 1.8471F, -0.5117F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r148 = leftLeg2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(112, 102).addBox(-0.5F, -5.6115F, -0.7135F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, 4.8612F, -0.2063F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r149 = leftLeg2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(18, 99).addBox(-0.5F, 5.7012F, 0.7602F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.8F, 1.1424F, -0.4934F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r150 = leftLeg2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(108, 75).addBox(-0.5F, -0.2712F, 0.8143F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.8F, 1.1424F, -0.4934F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r151 = leftLeg2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(65, 109).addBox(-0.5F, -0.1604F, 0.0505F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.8F, 1.1424F, -0.4934F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(68, 77).addBox(-2.0F, 0.0554F, -0.5239F, 3.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.9763F, -1.7706F, -2.5706F, -0.1133F, -0.0657F));

		PartDefinition cube_r152 = leftLeg3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(15, 129).addBox(-0.2F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.438F, 8.3493F, 1.1445F, 0.8727F, 0.0F, -0.1309F));

		PartDefinition cube_r153 = leftLeg3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(79, 129).addBox(-1.2966F, -0.5473F, 0.7221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0958F, 7.2425F, -0.1239F, 0.4363F, 0.0F, -0.1309F));

		PartDefinition cube_r154 = leftLeg3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(55, 109).addBox(-1.2966F, -5.0522F, -0.2F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.9F, 5.7553F, 0.3761F, 0.1309F, 0.0F, -0.1309F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(56, 19).addBox(-4.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 10.0042F, 0.4527F, 1.5446F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(42, 48).addBox(-3.5F, -0.8F, -4.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7254F, -3.9319F, 0.0038F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8302F, 9.0336F, -0.4104F, 0.0414F, -0.0139F));

		PartDefinition cube_r155 = tail1.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(53, 117).addBox(0.0F, -1.2F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9878F, 8.5295F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r156 = tail1.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(92, 121).addBox(0.5F, 0.0871F, -0.1754F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.5299F, 3.2583F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r157 = tail1.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(50, 117).addBox(0.5F, -0.1129F, -0.7754F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.604F, 5.5805F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r158 = tail1.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(43, 132).addBox(0.5F, -2.1573F, -0.1162F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.4588F, 6.7807F, -0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r159 = tail1.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(45, 117).addBox(0.5F, -2.5073F, -0.0162F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8208F, 3.7257F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r160 = tail1.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(42, 110).addBox(0.497F, -2.5323F, -1.0162F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5471F, 1.7357F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r161 = tail1.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(50, 25).mirror().addBox(-2.3F, -0.2F, -3.5F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4642F, -0.4873F, 4.2668F, 0.0464F, -0.0228F, 0.9605F));

		PartDefinition cube_r162 = tail1.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(50, 25).addBox(-0.7F, -0.2F, -3.5F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4642F, -0.4873F, 4.2668F, 0.0464F, 0.0228F, -0.9605F));

		PartDefinition cube_r163 = tail1.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(0, 28).addBox(0.0F, -1.9F, 0.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.6157F, -0.0618F, 0.1571F, 0.0F, 0.0F));

		PartDefinition tail = tail1.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(34, 61).addBox(-1.0F, -3.4335F, 5.7591F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.7998F, 8.6946F, -0.0175F, 0.0873F, -0.0015F));

		PartDefinition cube_r164 = tail.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(55, 55).mirror().addBox(-2.0F, 0.0F, -3.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2344F, -0.9246F, 3.3549F, 0.082F, -0.098F, 0.8249F));

		PartDefinition cube_r165 = tail.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(55, 55).addBox(0.0F, 0.0F, -3.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7656F, -0.9246F, 3.3549F, 0.082F, 0.098F, -0.8249F));

		PartDefinition cube_r166 = tail.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(38, 55).addBox(0.0F, -1.9F, 9.1F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5F, 2.4308F, -8.8805F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r167 = tail.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(61, 121).addBox(0.0F, -0.2F, -0.3F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.3858F, 7.2538F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r168 = tail.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(107, 120).addBox(0.0F, 0.3F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7395F, 4.0982F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r169 = tail.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(102, 109).addBox(0.0F, -0.6F, -0.6F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.903F, 1.7675F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r170 = tail.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(53, 131).addBox(0.5F, -1.4073F, -0.0162F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.8262F, 3.7753F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r171 = tail.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(76, 130).addBox(0.5F, -1.7823F, -0.0162F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.4832F, 1.8025F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r172 = tail.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(40, 130).addBox(0.5F, -2.0073F, -0.0162F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.2395F, -0.1826F, -0.0611F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.4624F, 6.8232F, 0.1512F, 0.1713F, 0.0336F));

		PartDefinition cube_r173 = tail2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(25, 86).addBox(0.0F, -2.3561F, -0.1566F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8424F, 7.0228F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r174 = tail2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(120, 136).addBox(0.0F, -2.2561F, 0.0684F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0254F, 4.9307F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r175 = tail2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(92, 131).addBox(0.0F, -2.1061F, -0.1316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1823F, 3.1376F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r176 = tail2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(89, 131).addBox(0.0F, -1.9811F, 0.0684F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.374F, 0.946F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r177 = tail2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(19, 51).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.005F))
				.texOffs(0, 51).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.426F, 1.046F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r178 = tail2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(64, 121).addBox(0.0F, -0.4F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6829F, 2.6141F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r179 = tail2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(63, 128).addBox(0.0F, 0.4F, 0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3999F, 6.1401F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r180 = tail2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(115, 123).addBox(0.0F, -0.1F, -0.2F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4489F, 4.297F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r181 = tail2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(15, 61).mirror().addBox(-1.6F, 0.0F, -3.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4386F, -1.0348F, 4.5174F, 0.0313F, 0.0035F, 0.8729F));

		PartDefinition cube_r182 = tail2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(15, 61).addBox(-0.4F, 0.0F, -3.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4386F, -1.0348F, 4.5174F, 0.0313F, -0.0035F, -0.8729F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7776F, 8.1476F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r183 = tail8.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(56, 11).mirror().addBox(-1.4F, 0.0F, -0.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3376F, 0.9727F, 0.0383F, 0.0074F, 0.9167F));

		PartDefinition cube_r184 = tail8.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(56, 11).addBox(-0.6F, 0.0F, -0.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3376F, 0.9727F, 0.0383F, -0.0074F, -0.9167F));

		PartDefinition cube_r185 = tail8.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(29, 0).addBox(-0.5F, -1.9F, 7.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2035F, -7.1016F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r186 = tail8.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(95, 131).addBox(0.0F, 4.4F, 3.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 126).addBox(0.0F, 1.9F, 1.7F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 125).addBox(0.0F, 0.3F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7643F, 2.89F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r187 = tail8.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(53, 125).addBox(0.0F, -0.3F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2632F, 1.244F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r188 = tail8.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(92, 110).addBox(0.0F, -1.6811F, -0.0316F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5965F, 6.8984F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r189 = tail8.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(75, 105).addBox(0.0F, -1.6561F, -0.1316F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5965F, 4.9984F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r190 = tail8.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(14, 104).addBox(0.0F, -1.6061F, -0.0316F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5965F, 2.8984F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r191 = tail8.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(90, 60).addBox(0.0F, -1.7561F, -0.0316F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5965F, 0.8984F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2223F, 8.9023F, 0.031F, 0.1745F, 0.0054F));

		PartDefinition cube_r192 = tail3.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(24, 112).addBox(0.0F, -1.0128F, 0.0016F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 106).addBox(0.0F, -1.3128F, 2.0016F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 5.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r193 = tail3.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(55, 106).addBox(0.0F, -1.1628F, 0.0016F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 3.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r194 = tail3.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(51, 136).addBox(0.0F, -1.2628F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 1.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r195 = tail3.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(76, 135).addBox(0.0F, -1.2128F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.1037F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r196 = tail3.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(0, 132).addBox(0.0F, 2.2F, 3.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 131).addBox(0.0F, 1.1F, 1.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 131).addBox(0.0F, -0.1F, -0.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.332F, 2.3058F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r197 = tail3.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(21, 41).mirror().addBox(-0.9F, 0.0F, -4.5F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4356F, -0.6815F, 4.4289F, 0.036F, -0.0097F, 0.7424F));

		PartDefinition cube_r198 = tail3.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(21, 41).addBox(-0.1F, 0.0F, -4.5F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4356F, -0.6815F, 4.4289F, 0.036F, 0.0097F, -0.7424F));

		PartDefinition cube_r199 = tail3.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, 0.1F, 0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail9 = tail3.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7389F, 8.8298F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r200 = tail9.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(71, 25).addBox(-0.5F, 0.1F, 9.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0951F, -9.1335F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r201 = tail9.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(137, 0).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7103F, 5.0517F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r202 = tail9.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(0, 137).addBox(0.0F, -0.725F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5232F, 3.058F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r203 = tail9.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(136, 62).addBox(0.0F, 7.0F, 9.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 136).addBox(0.0F, 5.7F, 7.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 136).addBox(0.0F, 4.4F, 5.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0709F, -6.524F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r204 = tail9.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(135, 136).addBox(0.0F, -0.725F, -0.025F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.487F, 1.0827F, -0.1134F, 0.0F, 0.0F));

		PartDefinition tail4 = tail9.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3811F, 5.9106F, -0.0438F, 0.0872F, -0.0038F));

		PartDefinition cube_r205 = tail4.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(45, 92).addBox(0.0F, -0.3F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3581F, 3.0305F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r206 = tail4.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(8, 137).addBox(0.0F, -0.35F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 1.2316F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r207 = tail4.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(38, 51).addBox(0.0F, -0.25F, 0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 136).addBox(0.0F, -1.45F, -1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0108F, 3.2718F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r208 = tail4.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(49, 69).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 0.2316F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(64, 69).addBox(-0.5F, -0.0011F, 0.0757F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.2496F, 5.954F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r209 = tail5.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(137, 19).addBox(0.0F, 4.05F, 6.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 103).addBox(0.0F, 1.85F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2323F, -2.6211F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r210 = tail5.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(137, 9).addBox(0.0F, -0.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9963F, 3.2837F, 0.6021F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(77, 77).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.063F, 5.9757F, -0.0626F, 0.2178F, -0.0135F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(77, 84).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.9F, -0.124F, 0.1732F, -0.0215F));

		PartDefinition tail10 = tail7.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(0, 73).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0223F, 3.9976F, -0.096F, 0.0F, 0.0F));

		PartDefinition bone = tail1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -7.633F, 7.5531F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1802F, -3.1023F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r211 = body.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(102, 120).addBox(-0.503F, -2.0022F, -1.0364F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2486F, -3.8492F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r212 = body.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(0, 120).addBox(-0.503F, -2.0022F, -2.0364F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3533F, -5.8465F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r213 = body.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(117, 68).addBox(-0.503F, -2.1522F, -0.0364F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1091F, -1.8541F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r214 = body.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(50, 0).addBox(-1.0F, 0.0F, 1.9F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.669F, -9.7704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r215 = body.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -4.8F, 0.0F, 7.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 14.1632F, -8.2617F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r216 = body.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(127, 71).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -3.9704F, 0.1286F, 0.117F, -0.6359F));

		PartDefinition cube_r217 = body.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(124, 109).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -3.9704F, 0.067F, 0.1603F, -1.0744F));

		PartDefinition cube_r218 = body.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(115, 21).mirror().addBox(-3.74F, -2.3355F, -0.4915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -3.9704F, -0.0349F, 0.1701F, -1.6761F));

		PartDefinition cube_r219 = body.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(129, 43).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -6.9704F, 0.1399F, 0.1163F, -0.4791F));

		PartDefinition cube_r220 = body.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(129, 64).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -6.9704F, 0.0777F, 0.1644F, -0.9172F));

		PartDefinition cube_r221 = body.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(129, 33).mirror().addBox(-4.6882F, -2.8327F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -6.9704F, -0.0285F, 0.1795F, -1.5196F));

		PartDefinition cube_r222 = body.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(129, 33).addBox(2.6881F, -2.8327F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -6.9704F, -0.0285F, -0.1795F, 1.5196F));

		PartDefinition cube_r223 = body.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(129, 64).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -6.9704F, 0.0777F, -0.1644F, 0.9172F));

		PartDefinition cube_r224 = body.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(129, 43).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -6.9704F, 0.1399F, -0.1163F, 0.4791F));

		PartDefinition cube_r225 = body.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(115, 21).addBox(2.74F, -2.3355F, -0.4915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -3.9704F, -0.0349F, -0.1701F, 1.6761F));

		PartDefinition cube_r226 = body.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(124, 109).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -3.9704F, 0.067F, -0.1603F, 1.0744F));

		PartDefinition cube_r227 = body.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(127, 71).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -3.9704F, 0.1286F, -0.117F, 0.6359F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(65, 39).addBox(-0.5F, -1.1F, -6.1F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3765F, -7.7702F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r228 = body2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(56, 117).addBox(0.0F, -2.0122F, -1.0627F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0895F, -1.9945F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r229 = body2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(120, 74).addBox(0.0F, -1.8367F, -0.9614F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0262F, -5.0951F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r230 = body2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(79, 75).mirror().addBox(-8.6882F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.048F, 0.2659F, -1.3916F));

		PartDefinition cube_r231 = body2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(125, 25).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.19F, 0.1932F, -0.7861F));

		PartDefinition cube_r232 = body2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(125, 77).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.253F, 0.0958F, -0.356F));

		PartDefinition cube_r233 = body2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(100, 92).mirror().addBox(-6.6882F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.007F, 0.168F, -1.4477F));

		PartDefinition cube_r234 = body2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(29, 126).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.1003F, 0.1352F, -0.8481F));

		PartDefinition cube_r235 = body2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(126, 101).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.1493F, 0.0777F, -0.3953F));

		PartDefinition cube_r236 = body2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(126, 101).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.1493F, -0.0777F, 0.3953F));

		PartDefinition cube_r237 = body2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(27, 13).addBox(-3.0F, -4.0F, 0.0F, 7.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 13.5321F, -7.0061F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r238 = body2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(29, 126).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.1003F, -0.1352F, 0.8481F));

		PartDefinition cube_r239 = body2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(100, 92).addBox(2.6881F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.007F, -0.168F, 1.4477F));

		PartDefinition cube_r240 = body2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(125, 77).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.253F, -0.0958F, 0.356F));

		PartDefinition cube_r241 = body2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(125, 25).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.19F, -0.1932F, 0.7861F));

		PartDefinition cube_r242 = body2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(79, 75).addBox(2.6881F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.048F, -0.2659F, 1.3916F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8763F, -6.0766F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(84, 7).addBox(-0.5F, -2.2141F, -2.0945F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.9391F, -1.9368F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(117, 136).addBox(0.0F, -1.992F, -2.135F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 136).addBox(0.0F, -1.9525F, -0.1399F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0609F, -1.8368F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r245 = chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(104, 136).addBox(0.0F, -1.6614F, -2.0236F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, -0.3148F, -4.0031F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r246 = chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(71, 33).addBox(-4.9365F, 0.1974F, -1.2304F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9365F, 11.3277F, -6.2079F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r247 = chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(79, 73).mirror().addBox(-7.0F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4186F, 12.5188F, -6.2665F, 0.6476F, 1.0215F, 0.7703F));

		PartDefinition cube_r248 = chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(94, 75).mirror().addBox(-5.3F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7123F, 12.3685F, -6.3011F, 0.4509F, 0.9828F, 0.8098F));

		PartDefinition cube_r249 = chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(104, 4).mirror().addBox(-3.9F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0316F, 11.8896F, -6.5413F, -0.0052F, 0.7184F, 1.2342F));

		PartDefinition cube_r250 = chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(44, 77).mirror().addBox(-1.4539F, 0.3925F, -5.4555F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9365F, 11.3277F, -6.2079F, -0.5214F, -0.424F, 0.2321F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(128, 8).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6891F, -1.4368F, 0.2246F, 0.0953F, -0.3235F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(29, 128).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6891F, -1.4368F, 0.1641F, 0.1809F, -0.7557F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(29, 11).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6891F, -1.4368F, 0.0336F, 0.2414F, -1.3599F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(36, 128).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5891F, -3.4368F, 0.19F, 0.2048F, -0.7507F));

		PartDefinition cube_r255 = chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(56, 128).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5891F, -3.4368F, 0.2579F, 0.1064F, -0.3202F));

		PartDefinition cube_r256 = chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(71, 37).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5891F, -3.4368F, 0.0412F, 0.2755F, -1.358F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(74, 64).mirror().addBox(-10.7153F, -3.3347F, -0.536F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.004F, 0.7852F, -5.4031F, 0.0584F, 0.333F, -1.4074F));

		PartDefinition cube_r258 = chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(72, 128).mirror().addBox(-4.1158F, -1.2462F, -0.536F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.004F, 0.7852F, -5.4031F, 0.2377F, 0.2425F, -0.7948F));

		PartDefinition cube_r259 = chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(128, 97).mirror().addBox(-2.4442F, -0.2353F, -0.536F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.004F, 0.7852F, -5.4031F, 0.3162F, 0.1213F, -0.3682F));

		PartDefinition cube_r260 = chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(50, 39).mirror().addBox(-8.7808F, -3.3242F, -0.4211F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.004F, 1.0852F, -7.4031F, 0.0684F, 0.3905F, -1.4763F));

		PartDefinition cube_r261 = chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(129, 18).mirror().addBox(-4.1642F, -1.2009F, -0.4211F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.004F, 1.0852F, -7.4031F, 0.28F, 0.284F, -0.8561F));

		PartDefinition cube_r262 = chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(128, 99).mirror().addBox(-2.469F, -0.1738F, -0.4211F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.004F, 1.0852F, -7.4031F, 0.371F, 0.1423F, -0.4333F));

		PartDefinition cube_r263 = chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(118, 128).mirror().addBox(-2.4875F, -0.1638F, -0.7299F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.004F, 1.0852F, -9.1031F, 0.4383F, 0.1624F, -0.4258F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(129, 27).mirror().addBox(-4.1853F, -1.1997F, -0.7299F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.004F, 1.0852F, -9.1031F, 0.3351F, 0.3295F, -0.8421F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(23, 96).mirror().addBox(-7.7989F, -3.3349F, -0.7299F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.004F, 1.0852F, -9.1031F, 0.086F, 0.4581F, -1.4717F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(23, 96).addBox(2.7989F, -3.3349F, -0.7299F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, 1.0852F, -9.1031F, 0.086F, -0.4581F, 1.4717F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(129, 27).addBox(2.1853F, -1.1997F, -0.7299F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, 1.0852F, -9.1031F, 0.3351F, -0.3295F, 0.8421F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(118, 128).addBox(0.4875F, -0.1638F, -0.7299F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, 1.0852F, -9.1031F, 0.4383F, -0.1624F, 0.4258F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(101, 136).addBox(0.0F, -1.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, 0.3685F, -9.5376F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r270 = chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(128, 99).addBox(0.469F, -0.1738F, -0.4211F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, 1.0852F, -7.4031F, 0.371F, -0.1423F, 0.4333F));

		PartDefinition cube_r271 = chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(129, 18).addBox(2.1643F, -1.2009F, -0.4211F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, 1.0852F, -7.4031F, 0.28F, -0.284F, 0.8561F));

		PartDefinition cube_r272 = chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(50, 39).addBox(2.7808F, -3.3242F, -0.4211F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, 1.0852F, -7.4031F, 0.0684F, -0.3905F, 1.4763F));

		PartDefinition cube_r273 = chest.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(128, 97).addBox(0.4442F, -0.2353F, -0.536F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, 0.7852F, -5.4031F, 0.3162F, -0.1213F, 0.3682F));

		PartDefinition cube_r274 = chest.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(72, 128).addBox(2.1158F, -1.2462F, -0.536F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, 0.7852F, -5.4031F, 0.2377F, -0.2425F, 0.7948F));

		PartDefinition cube_r275 = chest.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(74, 64).addBox(2.7153F, -3.3347F, -0.536F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, 0.7852F, -5.4031F, 0.0584F, -0.333F, 1.4074F));

		PartDefinition cube_r276 = chest.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(71, 37).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5891F, -3.4368F, 0.0412F, -0.2755F, 1.358F));

		PartDefinition cube_r277 = chest.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(56, 128).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5891F, -3.4368F, 0.2579F, -0.1064F, 0.3202F));

		PartDefinition cube_r278 = chest.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(36, 128).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5891F, -3.4368F, 0.19F, -0.2048F, 0.7507F));

		PartDefinition cube_r279 = chest.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(29, 11).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6891F, -1.4368F, 0.0336F, -0.2414F, 1.3599F));

		PartDefinition cube_r280 = chest.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(29, 128).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6891F, -1.4368F, 0.1641F, -0.1809F, 0.7557F));

		PartDefinition cube_r281 = chest.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(55, 63).addBox(-3.0F, -2.0F, 1.0F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 12.5622F, -6.4731F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r282 = chest.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(128, 8).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6891F, -1.4368F, 0.2246F, -0.0953F, 0.3235F));

		PartDefinition cube_r283 = chest.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(98, 136).addBox(0.0F, -1.0386F, -4.0292F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, -0.3148F, -4.0031F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r284 = chest.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(44, 77).addBox(-0.5461F, 0.3925F, -5.4555F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9365F, 11.3277F, -6.2079F, -0.5214F, 0.424F, -0.2321F));

		PartDefinition cube_r285 = chest.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(104, 4).addBox(-0.1F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0316F, 11.8896F, -6.5413F, -0.0052F, -0.7184F, -1.2342F));

		PartDefinition cube_r286 = chest.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(94, 75).addBox(0.3F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7123F, 12.3685F, -6.3011F, 0.4509F, -0.9828F, -0.8098F));

		PartDefinition cube_r287 = chest.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(79, 73).addBox(0.0F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4186F, 12.5188F, -6.2665F, 0.6476F, -1.0215F, -0.7703F));

		PartDefinition cube_r288 = chest.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(81, 46).addBox(-2.9365F, 0.3925F, -5.0268F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9365F, 11.3277F, -6.2079F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r289 = chest.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(34, 65).addBox(-0.5F, -0.0257F, -5.9615F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, -0.3148F, -4.0031F, 0.096F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5448F, 8.6283F, -8.5335F, 0.8677F, 0.1287F, -0.1151F));

		PartDefinition cube_r290 = leftArm1.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(31, 115).addBox(6.0F, -0.8092F, 0.0838F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 1.2847F, -1.5107F, 0.1032F, -0.0786F, -0.067F));

		PartDefinition cube_r291 = leftArm1.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(120, 21).addBox(-0.5F, -2.5F, -0.225F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 4.0833F, -0.6626F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r292 = leftArm1.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(9, 93).addBox(-0.5F, -1.9F, -0.575F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.6346F, 0.2087F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r293 = leftArm1.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(24, 115).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.9966F, 1.4861F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r294 = leftArm1.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(118, 123).addBox(-0.5F, -2.9F, -0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 3.6346F, 0.2087F, -0.3054F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(118, 5).addBox(-0.8F, 0.4693F, -0.9734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1271F, 4.9422F, -0.2146F, -0.5594F, 0.2132F, 0.1095F));

		PartDefinition cube_r295 = leftArm2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(19, 112).addBox(6.5F, -4.3F, -1.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.3F, 3.9693F, 1.1266F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3235F, 4.8035F, 0.1164F, -0.0873F, 0.0F, 0.1745F));

		PartDefinition cube_r296 = leftHand.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(47, 112).addBox(0.0F, -2.5F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.5F, -0.9F, 0.0785F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5448F, 8.6283F, -8.5335F, 0.8677F, -0.1287F, 0.1151F));

		PartDefinition cube_r297 = rightArm1.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(105, 115).addBox(-7.0F, -0.8092F, 0.0838F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 1.2847F, -1.5107F, 0.1032F, 0.0786F, 0.067F));

		PartDefinition cube_r298 = rightArm1.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(31, 120).addBox(-0.5F, -2.5F, -0.225F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 4.0833F, -0.6626F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r299 = rightArm1.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(97, 114).addBox(-0.5F, -1.9F, -0.575F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.6346F, 0.2087F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r300 = rightArm1.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(85, 115).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.9966F, 1.4861F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r301 = rightArm1.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(5, 124).addBox(-0.5F, -2.9F, -0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 3.6346F, 0.2087F, -0.3054F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(19, 119).addBox(-0.2F, 0.4693F, -0.9734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1271F, 4.9422F, -0.2146F, -0.5594F, -0.2132F, -0.1095F));

		PartDefinition cube_r302 = rightArm2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(112, 107).addBox(-7.5F, -4.3F, -1.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.3F, 3.9693F, 1.1266F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3235F, 4.8035F, 0.1164F, -0.0873F, 0.0F, -0.1745F));

		PartDefinition cube_r303 = rightHand.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(113, 11).addBox(-1.0F, -2.5F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, -0.9F, 0.0785F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.1827F, -9.7449F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r304 = neck1.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(69, 136).addBox(0.0F, -1.1459F, -0.016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0061F, -2.3916F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r305 = neck1.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(69, 9).mirror().addBox(-4.6882F, -2.8327F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6058F, -1.7946F, 0.0806F, 0.7994F, -1.6802F));

		PartDefinition cube_r306 = neck1.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(126, 103).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6058F, -1.7946F, 0.5721F, 0.598F, -0.94F));

		PartDefinition cube_r307 = neck1.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(126, 111).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6058F, -1.7946F, 0.747F, 0.3269F, -0.5554F));

		PartDefinition cube_r308 = neck1.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(126, 111).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6058F, -1.7946F, 0.747F, -0.3269F, 0.5554F));

		PartDefinition cube_r309 = neck1.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(126, 103).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6058F, -1.7946F, 0.5721F, -0.598F, 0.94F));

		PartDefinition cube_r310 = neck1.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(69, 9).addBox(2.6881F, -2.8327F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6058F, -1.7946F, 0.0806F, -0.7994F, 1.6802F));

		PartDefinition cube_r311 = neck1.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(45, 95).addBox(-0.5F, -0.7F, 3.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.6969F, -6.1829F, 0.3142F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0312F, -2.8508F, 0.1796F, -0.2763F, -0.2184F));

		PartDefinition cube_r312 = neck2.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(95, 136).addBox(0.0F, -0.6816F, -0.0991F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1431F, -0.7163F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r313 = neck2.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(48, 11).mirror().addBox(-1.9081F, 0.0182F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, 0.1948F, 0.546F, -1.0268F));

		PartDefinition cube_r314 = neck2.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(113, 62).mirror().addBox(-4.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, -0.0828F, 0.571F, -1.5421F));

		PartDefinition cube_r315 = neck2.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(113, 62).addBox(1.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, -0.0828F, -0.571F, 1.5421F));

		PartDefinition cube_r316 = neck2.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(48, 11).addBox(-0.0919F, 0.0182F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, 0.1948F, -0.546F, 1.0268F));

		PartDefinition cube_r317 = neck2.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(0, 93).addBox(-0.5F, 1.4F, 5.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3859F, -7.7876F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3605F, -2.3471F, -0.4775F, -0.1553F, 0.0799F));

		PartDefinition cube_r318 = neck5.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(92, 66).addBox(-0.5F, 1.4F, 3.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.9754F, -5.9788F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r319 = neck5.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(106, 29).mirror().addBox(-5.7911F, -0.3926F, -0.2462F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -0.9743F, -0.2747F, 1.1381F, -1.6776F));

		PartDefinition cube_r320 = neck5.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(91, 129).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -0.9743F, 0.6076F, 1.057F, -0.7028F));

		PartDefinition cube_r321 = neck5.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(126, 113).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9743F, 0.5555F, 1.0338F, -0.7479F));

		PartDefinition cube_r322 = neck5.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(94, 50).mirror().addBox(-6.7911F, -0.3926F, -0.2462F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9743F, -0.2664F, 1.1034F, -1.6702F));

		PartDefinition cube_r323 = neck5.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(94, 50).addBox(1.7911F, -0.3926F, -0.2462F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9743F, -0.2664F, -1.1034F, 1.6702F));

		PartDefinition cube_r324 = neck5.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(126, 113).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9743F, 0.5555F, -1.0338F, 0.7479F));

		PartDefinition cube_r325 = neck5.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(91, 129).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -0.9743F, 0.6076F, -1.057F, 0.7028F));

		PartDefinition cube_r326 = neck5.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(106, 29).addBox(1.7911F, -0.3926F, -0.2462F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -0.9743F, -0.2747F, -1.1381F, 1.6776F));

		PartDefinition cube_r327 = neck5.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(72, 136).addBox(0.0F, -1.3566F, -0.1491F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6059F, -2.9414F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r328 = neck5.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(129, 136).addBox(0.0F, -0.9566F, -0.1491F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8842F, -0.9608F, -0.0785F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0819F, -2.7815F, -0.22F, -0.1278F, 0.0285F));

		PartDefinition cube_r329 = neck4.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(130, 20).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, 0.7283F, 1.0364F, -0.5953F));

		PartDefinition cube_r330 = neck4.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(107, 50).mirror().addBox(-5.7663F, -0.3906F, -0.2552F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, -0.1475F, 1.1764F, -1.5582F));

		PartDefinition cube_r331 = neck4.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(126, 115).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, 0.7004F, 1.0265F, -0.6193F));

		PartDefinition cube_r332 = neck4.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(102, 62).mirror().addBox(-5.7663F, -0.3906F, -0.2552F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, -0.1481F, 1.1589F, -1.5587F));

		PartDefinition cube_r333 = neck4.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(102, 62).addBox(1.7663F, -0.3906F, -0.2552F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, -0.1481F, -1.1589F, 1.5587F));

		PartDefinition cube_r334 = neck4.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(126, 115).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, 0.7004F, -1.0265F, 0.6193F));

		PartDefinition cube_r335 = neck4.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(107, 50).addBox(1.7663F, -0.3906F, -0.2552F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, -0.1475F, -1.1764F, 1.5582F));

		PartDefinition cube_r336 = neck4.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(130, 20).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, 0.7283F, -1.0364F, 0.5953F));

		PartDefinition cube_r337 = neck4.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(79, 136).addBox(0.0F, -0.5677F, -0.0582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4916F, -3.9211F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r338 = neck4.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(132, 136).addBox(0.0F, -0.5677F, -0.0582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2697F, -1.931F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r339 = neck4.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(84, 14).addBox(-0.5F, 1.4F, 0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9504F, -3.9173F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5407F, -3.7756F, 0.3583F, -0.1974F, -0.0934F));

		PartDefinition cube_r340 = neck3.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(126, 117).mirror().addBox(-1.8351F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.3879F, 0.6284F, -0.9783F));

		PartDefinition cube_r341 = neck3.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(103, 48).mirror().addBox(-5.8627F, -0.3478F, -0.617F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.0386F, 0.7236F, -1.5276F));

		PartDefinition cube_r342 = neck3.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(103, 48).addBox(1.8627F, -0.3478F, -0.617F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.0386F, -0.7236F, 1.5276F));

		PartDefinition cube_r343 = neck3.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(126, 117).addBox(-0.1649F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.3879F, -0.6284F, 0.9783F));

		PartDefinition cube_r344 = neck3.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(89, 136).addBox(0.5F, -0.569F, 0.0228F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.887F, -1.3144F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r345 = neck3.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(54, 95).addBox(0.0F, 1.0F, -4.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -1.3168F, 1.7621F, -0.48F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1746F, -2.2289F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r346 = neck.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(126, 119).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.3212F, -0.621F, 0.4757F, 0.6822F, -1.0181F));

		PartDefinition cube_r347 = neck.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(114, 47).mirror().addBox(-4.6944F, -0.3859F, -0.6156F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.3212F, -0.621F, 0.0806F, 0.8062F, -1.5918F));

		PartDefinition cube_r348 = neck.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(114, 47).addBox(1.6944F, -0.3859F, -0.6156F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3212F, -0.621F, 0.0806F, -0.8062F, 1.5918F));

		PartDefinition cube_r349 = neck.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(92, 136).addBox(0.5F, -0.8207F, -0.1013F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0486F, -0.8891F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r350 = neck.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(85, 110).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.574F, 1.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r351 = neck.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(126, 119).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3212F, -0.621F, 0.4757F, -0.6822F, 1.0181F));

		PartDefinition neck6 = neck.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0811F, -1.5528F, -0.0073F, -0.1291F, -0.0217F));

		PartDefinition cube_r352 = neck6.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(126, 121).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5212F, -1.221F, 0.7519F, 0.9336F, -0.8163F));

		PartDefinition cube_r353 = neck6.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(66, 103).mirror().addBox(-2.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5212F, -1.221F, 0.0657F, 1.1202F, -1.6041F));

		PartDefinition cube_r354 = neck6.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(66, 103).addBox(1.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.0657F, -1.1202F, 1.6041F));

		PartDefinition cube_r355 = neck6.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(122, 0).addBox(0.5F, -1.2207F, -0.9014F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8375F, -1.0498F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r356 = neck6.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(89, 95).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r357 = neck6.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(126, 121).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.7519F, -0.9336F, 0.8163F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9501F, -2.5057F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r358 = head.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(100, 87).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.005F, -2.2495F, -5.325F, 0.3447F, 0.0F, 0.0F));

		PartDefinition cube_r359 = head.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(61, 117).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.005F, -2.6739F, -3.3705F, 0.2138F, 0.0F, 0.0F));

		PartDefinition cube_r360 = head.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(67, 126).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.005F, -1.5656F, -7.23F, -1.261F, 0.0F, 0.0F));

		PartDefinition cube_r361 = head.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(133, 121).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.5235F, -10.2192F, 1.9635F, 0.0F, 0.0F));

		PartDefinition cube_r362 = head.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(119, 133).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0618F, -11.1062F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r363 = head.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(133, 118).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.5118F, -11.9254F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r364 = head.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(133, 115).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.2778F, -12.5682F, -2.2689F, 0.0F, 0.0F));

		PartDefinition cube_r365 = head.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(114, 133).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 2.1212F, -13.1055F, 2.5744F, 0.0F, 0.0F));

		PartDefinition cube_r366 = head.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(133, 112).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 3.0275F, -13.5281F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r367 = head.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(132, 79).addBox(-0.4975F, -0.9093F, -0.0226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0025F, 3.937F, -13.5452F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r368 = head.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(134, 38).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, -2.5332F, -1.3559F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r369 = head.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(134, 51).addBox(-0.5F, -0.9801F, -0.0481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, -2.8383F, -2.8491F, -2.8536F, 0.0F, 0.0F));

		PartDefinition cube_r370 = head.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(132, 76).addBox(-0.5F, -0.0301F, -0.0481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, -2.97F, -1.8668F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r371 = head.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(132, 66).addBox(-0.5F, 0.1957F, -0.1057F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -2.5044F, -1.307F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r372 = head.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(80, 109).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 4.3326F, -9.8528F, 1.8231F, 0.0F, 0.0F));

		PartDefinition cube_r373 = head.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(122, 68).addBox(-0.5F, -1.5F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.603F, -11.2943F, 1.4827F, 0.0F, 0.0F));

		PartDefinition cube_r374 = head.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(9, 99).addBox(-0.5F, -0.225F, 2.45F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.77F, -8.5448F, 0.1214F, 0.0F, 0.0F));

		PartDefinition cube_r375 = head.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(111, 36).addBox(-1.0F, -3.0F, -1.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.2297F, -2.2758F, -1.4843F, 0.0F, 0.0F));

		PartDefinition cube_r376 = head.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(122, 18).addBox(-1.0F, -0.725F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.6242F, -2.9496F, -0.0444F, 0.0F, 0.0F));

		PartDefinition cube_r377 = head.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(88, 84).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9116F, 0.5112F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r378 = head.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(0, 99).addBox(-2.0F, 0.0371F, -2.0968F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.5775F, 1.2132F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r379 = head.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(106, 19).addBox(-1.5F, -1.0F, -1.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5F, -2.6204F, -1.6168F, -2.8536F, 0.0F, 0.0F));

		PartDefinition cube_r380 = head.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(122, 60).addBox(-1.0F, -0.675F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0686F, -2.7939F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r381 = head.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(122, 15).addBox(-1.5F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6204F, -1.6168F, 1.6144F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.401F, 2.3333F, 1.7521F, 0.0076F, -0.0782F, -0.0875F));

		PartDefinition cube_r382 = leftFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(110, 31).addBox(-0.5F, -0.85F, -1.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2762F, -4.0747F, -2.2949F, 2.176F, 1.1021F, -0.3875F));

		PartDefinition cube_r383 = leftFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(115, 130).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6818F, -4.9084F, -3.38F, 1.5325F, 0.0452F, -1.3546F));

		PartDefinition cube_r384 = leftFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(66, 130).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6293F, -4.9381F, -4.6326F, 1.5032F, -0.1708F, -1.3432F));

		PartDefinition cube_r385 = leftFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(120, 130).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6155F, -5.0283F, -5.1242F, 1.3996F, -1.1695F, -1.1969F));

		PartDefinition cube_r386 = leftFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(104, 0).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.7878F, -5.3495F, -1.8457F, 3.0821F, 0.2874F, -1.3602F));

		PartDefinition cube_r387 = leftFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(3, 136).addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.2719F, -5.1364F, -5.9586F, 0.4571F, 0.0758F, 1.2403F));

		PartDefinition cube_r388 = leftFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(8, 131).addBox(-0.8082F, -0.9071F, 1.4613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F))
				.texOffs(130, 130).addBox(-0.8082F, -0.9071F, 0.9613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4634F, -3.7704F, -7.6329F, 0.3664F, 0.2896F, 0.7531F));

		PartDefinition cube_r389 = leftFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(13, 136).addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(1.0521F, -5.0969F, -6.406F, 0.4571F, 0.0758F, 1.2403F));

		PartDefinition cube_r390 = leftFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(129, 39).addBox(0.0F, -1.05F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4002F, -4.69F, -7.7185F, -1.004F, -0.16F, 1.1556F));

		PartDefinition cube_r391 = leftFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(83, 125).addBox(-0.6069F, -1.2133F, -0.6657F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4634F, -3.7704F, -7.6329F, -1.0018F, 0.151F, 0.6793F));

		PartDefinition cube_r392 = leftFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(129, 14).addBox(0.0F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.4411F, -3.7866F, -9.6769F, -1.096F, -0.2813F, 1.0792F));

		PartDefinition cube_r393 = leftFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(12, 122).addBox(-0.9F, 0.2F, -0.675F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5249F, -3.5598F, -7.8962F, -1.0249F, 0.0246F, 0.5437F));

		PartDefinition cube_r394 = leftFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(29, 74).addBox(-0.7142F, -0.2913F, -4.5894F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.3585F, -0.1426F, -5.4462F, 0.1228F, 0.1739F, 0.0107F));

		PartDefinition cube_r395 = leftFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(111, 6).addBox(-0.45F, -1.5F, -1.125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4811F, -0.3147F, -0.9369F, 0.4436F, 0.2286F, -0.017F));

		PartDefinition cube_r396 = leftFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(84, 0).addBox(-1.525F, -1.0F, -2.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4189F, -2.5127F, -7.7061F, 1.7691F, 0.2464F, -0.0585F));

		PartDefinition cube_r397 = leftFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(36, 92).addBox(-0.4F, -1.7F, -0.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3215F, -0.8334F, -10.461F, 0.0972F, 0.257F, -0.0733F));

		PartDefinition cube_r398 = leftFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(130, 92).addBox(-0.5F, -0.8F, 1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(49, 65).addBox(-0.5F, -1.5F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(21, 37).addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3388F, 2.06F, -8.8601F, 0.3405F, 0.2308F, 0.0506F));

		PartDefinition cube_r399 = leftFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(123, 97).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1275F, 2.1781F, -9.7326F, 0.2532F, 0.2308F, 0.0506F));

		PartDefinition cube_r400 = leftFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(124, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0829F, 2.3163F, -10.5967F, 0.1659F, 0.2308F, 0.0506F));

		PartDefinition cube_r401 = leftFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(124, 63).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.29F, 2.3373F, -11.4723F, 0.0787F, 0.2308F, 0.0506F));

		PartDefinition cube_r402 = leftFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(124, 52).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4928F, 2.2585F, -12.3513F, 0.035F, 0.2308F, 0.0506F));

		PartDefinition cube_r403 = leftFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(124, 40).addBox(-0.5F, -0.7F, 1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(36, 124).addBox(-0.5F, -0.8F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0802F, 1.7919F, -14.9623F, -0.0544F, 0.2269F, 0.0341F));

		PartDefinition cube_r404 = leftFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(124, 27).addBox(-0.8744F, -1.0504F, -1.0978F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5802F, 1.7919F, -14.4623F, -0.0493F, 0.3665F, 0.0356F));

		PartDefinition cube_r405 = leftFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(110, 52).addBox(-0.5F, -1.9F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3064F, 1.5138F, -8.7896F, -1.2508F, 0.2362F, -0.0379F));

		PartDefinition cube_r406 = leftFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(110, 128).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1003F, 1.8694F, -9.7013F, 0.3549F, 0.2362F, -0.0379F));

		PartDefinition cube_r407 = leftFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(118, 36).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1153F, 2.1422F, -10.6389F, 1.8384F, 0.2362F, -0.0379F));

		PartDefinition cube_r408 = leftFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(60, 89).addBox(-0.7566F, -1.1281F, -0.6702F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0203F, 0.1658F, -10.8617F, 2.1455F, 0.2189F, -0.0899F));

		PartDefinition cube_r409 = leftFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(29, 82).addBox(-0.5112F, -0.1087F, -1.9271F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.331F, -1.9042F, -7.6257F, 1.701F, 0.2536F, -0.0003F));

		PartDefinition cube_r410 = leftFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(81, 52).addBox(-0.5131F, -2.9162F, -1.9271F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.331F, -1.9042F, -7.6257F, 1.8051F, 0.2363F, -0.0026F));

		PartDefinition cube_r411 = leftFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(25, 90).addBox(-0.7566F, -0.132F, -0.7323F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0203F, 0.1658F, -10.8617F, 1.8401F, 0.2189F, -0.0899F));

		PartDefinition cube_r412 = leftFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(49, 89).addBox(-0.7566F, -0.7044F, -0.743F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0203F, 0.1658F, -10.8617F, 1.971F, 0.2189F, -0.0899F));

		PartDefinition cube_r413 = leftFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(123, 5).addBox(-0.7566F, -3.4951F, -1.3807F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0203F, 0.1658F, -10.8617F, 0.7929F, 0.2189F, -0.0899F));

		PartDefinition cube_r414 = leftFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(101, 52).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.1857F, -0.4173F, -14.6796F, -0.5614F, 0.2362F, -0.0379F));

		PartDefinition cube_r415 = leftFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(135, 133).addBox(-0.9561F, 0.2337F, -1.8879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5802F, 1.7919F, -14.4623F, -2.0069F, 0.3758F, -0.0396F));

		PartDefinition cube_r416 = leftFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(130, 73).addBox(-0.9561F, -0.0079F, 0.1516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5802F, 1.7919F, -14.4623F, 2.7927F, 0.3758F, -0.0396F));

		PartDefinition cube_r417 = leftFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(118, 56).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.822F, 1.9255F, -13.5385F, 1.4021F, 0.2362F, -0.0379F));

		PartDefinition cube_r418 = leftFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(129, 52).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5851F, 2.0845F, -12.5801F, -0.1687F, 0.2362F, -0.0379F));

		PartDefinition cube_r419 = leftFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(119, 115).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3489F, 2.1569F, -11.6111F, -1.6522F, 0.2362F, -0.0379F));

		PartDefinition cube_r420 = leftFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(20, 129).addBox(-0.9883F, -0.8041F, 4.8632F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.4639F, 1.2493F, -6.0297F, -3.1357F, 0.2362F, -0.0379F));

		PartDefinition cube_r421 = leftFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(72, 98).addBox(-0.9883F, -0.9507F, -2.4452F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.4639F, 1.2493F, -6.0297F, -1.4689F, 0.2362F, -0.0379F));

		PartDefinition cube_r422 = leftFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(132, 10).addBox(-0.4941F, -0.664F, 0.1125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0625F, -4.4935F, -2.5345F, 0.2867F, 0.2761F, -0.0693F));

		PartDefinition cube_r423 = leftFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(14, 92).addBox(-1.025F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7405F, -2.2775F, -5.0535F, 0.1689F, 0.4131F, -0.013F));

		PartDefinition cube_r424 = leftFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(98, 100).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.4619F, -3.8278F, -2.9464F, 0.1625F, 0.2769F, -0.0191F));

		PartDefinition cube_r425 = leftFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(40, 84).addBox(-2.0001F, -6.0604F, 0.0256F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.0585F, 1.3574F, -4.8462F, 0.0284F, 0.3141F, -0.0312F));

		PartDefinition cube_r426 = leftFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(81, 60).addBox(-1.0F, -0.5F, -1.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.2012F, -4.2058F, -3.7123F, -0.1461F, 0.3141F, -0.0312F));

		PartDefinition cube_r427 = leftFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(38, 135).addBox(-0.4997F, -0.5773F, -0.6294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.0625F, -4.4935F, -2.5345F, 0.669F, 0.2905F, -0.0742F));

		PartDefinition cube_r428 = leftFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(104, 11).addBox(-2.1876F, -0.4004F, -0.4421F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0901F, -2.0398F, -1.416F, 0.6768F, 0.2618F, -0.0128F));

		PartDefinition cube_r429 = leftFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(115, 0).addBox(-1.1876F, -2.8514F, -0.7619F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0901F, -2.0398F, -1.416F, 0.1969F, 0.2618F, -0.0128F));

		PartDefinition cube_r430 = leftFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(0, 115).addBox(-1.1876F, -2.0139F, -0.444F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0901F, -2.0398F, -1.416F, 0.5023F, 0.2618F, -0.0128F));

		PartDefinition cube_r431 = leftFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(117, 52).addBox(-0.5148F, -0.6364F, -1.6795F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.1537F, -1.5731F, -2.6423F, 1.5371F, 0.2095F, -0.0304F));

		PartDefinition cube_r432 = leftFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(134, 29).addBox(-0.5148F, -0.6222F, 0.7189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.1537F, -1.5731F, -2.6423F, -2.2154F, 0.2095F, -0.0304F));

		PartDefinition cube_r433 = leftFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(134, 13).addBox(-0.5148F, 0.1943F, 0.152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.1537F, -1.5731F, -2.6423F, -1.4736F, 0.2095F, -0.0304F));

		PartDefinition cube_r434 = leftFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(8, 134).addBox(-0.5148F, -0.2301F, -0.9256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.1537F, -1.5731F, -2.6423F, -0.47F, 0.2095F, -0.0304F));

		PartDefinition cube_r435 = leftFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(3, 129).addBox(-0.5148F, -1.3824F, -0.8864F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.1537F, -1.5731F, -2.6423F, -0.0337F, 0.2095F, -0.0304F));

		PartDefinition cube_r436 = leftFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(125, 128).addBox(-0.5148F, -2.1317F, -0.3638F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.1537F, -1.5731F, -2.6423F, 0.359F, 0.2095F, -0.0304F));

		PartDefinition cube_r437 = leftFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(130, 133).addBox(-0.5148F, -0.7032F, -0.2481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.1537F, -1.5731F, -2.6423F, -0.8627F, 0.2095F, -0.0304F));

		PartDefinition cube_r438 = leftFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(133, 124).addBox(-0.5148F, 0.2126F, 0.0073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1537F, -1.5731F, -2.6423F, 0.0972F, 0.2095F, -0.0304F));

		PartDefinition cube_r439 = leftFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(132, 0).addBox(-0.5148F, 0.5538F, -0.7339F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.1537F, -1.5731F, -2.6423F, 0.6208F, 0.2095F, -0.0304F));

		PartDefinition cube_r440 = leftFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(112, 119).addBox(-0.4542F, -0.6753F, -0.7885F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.6588F, -0.953F, -13.5909F, 0.6583F, 0.2263F, -0.0041F));

		PartDefinition cube_r441 = leftFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(135, 130).addBox(-0.4542F, -0.3866F, -0.1855F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.6588F, -0.953F, -13.5909F, 1.0947F, 0.2263F, -0.0041F));

		PartDefinition cube_r442 = leftFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(135, 127).addBox(-0.5503F, -0.6076F, -0.5001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6588F, -0.953F, -13.5909F, 2.7091F, 0.2263F, -0.0041F));

		PartDefinition cube_r443 = leftFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(124, 135).addBox(-0.5503F, -0.7061F, -0.212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.6588F, -0.953F, -13.5909F, -2.9632F, 0.2263F, -0.0041F));

		PartDefinition cube_r444 = leftFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(130, 89).addBox(-0.5F, -0.6F, -1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F))
				.texOffs(130, 86).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(-0.2108F, -0.8255F, -10.9726F, -3.12F, 0.2528F, -0.0613F));

		PartDefinition cube_r445 = leftFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(130, 83).addBox(-0.5F, -0.875F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.1601F, -1.5363F, -10.6081F, -2.0292F, 0.2528F, -0.0613F));

		PartDefinition cube_r446 = leftFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(117, 32).addBox(-0.5F, -0.075F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(-0.0614F, -2.1421F, -10.0829F, -0.7638F, 0.2528F, -0.0613F));

		PartDefinition cube_r447 = leftFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(35, 110).addBox(-0.5F, -0.075F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.061F, -2.6183F, -9.4971F, 0.6324F, 0.2528F, -0.0613F));

		PartDefinition cube_r448 = leftFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(130, 56).addBox(-0.5F, -0.875F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.1861F, -3.1275F, -8.8929F, 2.2469F, 0.2528F, -0.0613F));

		PartDefinition cube_r449 = leftFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(56, 130).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(0.304F, -3.663F, -8.3104F, -2.4219F, 0.2528F, -0.0613F));

		PartDefinition cube_r450 = leftFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(130, 48).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.5185F, -2.7336F, -7.7021F, -1.7674F, 0.2528F, -0.0613F));

		PartDefinition cube_r451 = leftFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(117, 28).addBox(-0.5F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.6566F, -1.7933F, -7.3911F, -1.2438F, 0.2528F, -0.0613F));

		PartDefinition cube_r452 = leftFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(116, 97).addBox(-0.5F, -0.9F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(0.6746F, -1.0022F, -7.5091F, -0.153F, 0.2528F, -0.0613F));

		PartDefinition cube_r453 = leftFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(125, 86).addBox(-0.4864F, 0.3391F, -0.4143F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.0919F, -2.0627F, -9.4547F, 0.8593F, 0.2528F, -0.0613F));

		PartDefinition cube_r454 = leftFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(116, 93).addBox(-0.4864F, -0.0527F, -2.1962F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.0919F, -2.0627F, -9.4547F, 1.9065F, 0.2528F, -0.0613F));

		PartDefinition cube_r455 = leftFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(116, 83).addBox(-0.4864F, -2.0548F, -0.8288F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0919F, -2.0627F, -9.4547F, -3.1113F, 0.2528F, -0.0613F));

		PartDefinition cube_r456 = leftFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(135, 35).addBox(-0.2361F, -0.1876F, 0.4831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(135, 22).addBox(-0.4611F, -0.1876F, 0.4831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2521F, -2.1832F, -5.5431F, 1.7409F, 0.388F, -0.0501F));

		PartDefinition cube_r457 = leftFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(135, 6).addBox(-0.4846F, -0.1469F, -1.8354F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(1.2503F, -2.1856F, -5.5425F, -1.6926F, 0.4403F, -0.0866F));

		PartDefinition cube_r458 = leftFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(135, 82).addBox(-0.4863F, 0.0058F, -0.6666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(1.2521F, -2.1832F, -5.5431F, 2.1074F, 0.388F, -0.0501F));

		PartDefinition cube_r459 = leftFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(43, 123).addBox(-0.4863F, -1.3954F, -0.5613F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(1.2521F, -2.1832F, -5.5431F, -0.0306F, 0.388F, -0.0501F));

		PartDefinition cube_r460 = leftFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(129, 29).addBox(-0.4863F, -1.7007F, -0.7617F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2521F, -2.1832F, -5.5431F, -0.0481F, 0.388F, -0.0501F));

		PartDefinition cube_r461 = leftFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(109, 135).addBox(-0.4863F, 0.0877F, -0.4636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(1.2521F, -2.1832F, -5.5431F, -0.7724F, 0.388F, -0.0501F));

		PartDefinition cube_r462 = leftFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(135, 97).addBox(-0.4863F, -0.1861F, 0.6734F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2521F, -2.1832F, -5.5431F, -1.9505F, 0.388F, -0.0501F));

		PartDefinition cube_r463 = leftFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(135, 94).addBox(-0.4863F, -1.4367F, 0.7423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(1.2521F, -2.1832F, -5.5431F, -2.6923F, 0.388F, -0.0501F));

		PartDefinition cube_r464 = leftFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(135, 91).addBox(-0.4863F, -2.0055F, 0.0235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(135, 88).addBox(-0.4863F, -2.0055F, -0.1765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2521F, -2.1832F, -5.5431F, -3.1286F, 0.388F, -0.0501F));

		PartDefinition cube_r465 = leftFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(135, 85).addBox(-0.4863F, -1.5652F, -1.3207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(135, 72).addBox(-0.4863F, -1.1652F, -1.3207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(1.2521F, -2.1832F, -5.5431F, 2.5001F, 0.388F, -0.0501F));

		PartDefinition cube_r466 = leftFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(63, 98).addBox(-0.525F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6056F, -4.9754F, -5.1316F, 0.2744F, 0.3064F, 0.1529F));

		PartDefinition cube_r467 = leftFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(135, 54).addBox(-0.4863F, 0.1635F, 0.0019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2521F, -2.1832F, -5.5431F, 1.4529F, 0.388F, -0.0501F));

		PartDefinition cube_r468 = leftFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(135, 48).addBox(-0.4863F, -1.2089F, 0.4598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.2521F, -2.1832F, -5.5431F, 0.3621F, 0.388F, -0.0501F));

		PartDefinition cube_r469 = leftFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(135, 45).addBox(-0.4863F, -1.8321F, -1.1804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(1.2521F, -2.1832F, -5.5431F, -0.6851F, 0.388F, -0.0501F));

		PartDefinition cube_r470 = leftFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(134, 104).addBox(-0.4863F, -0.712F, -2.0537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2521F, -2.1832F, -5.5431F, -1.3833F, 0.388F, -0.0501F));

		PartDefinition cube_r471 = leftFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(106, 23).addBox(-1.0078F, -0.3101F, -0.1975F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.7936F, 0.9265F, -1.8993F, 2.2298F, 0.2435F, 0.0096F));

		PartDefinition cube_r472 = leftFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(128, 123).addBox(-1.0078F, -0.2553F, -0.9245F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.6585F, 1.3574F, -2.9462F, -2.7631F, 0.1653F, -0.0926F));

		PartDefinition cube_r473 = leftFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(118, 87).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.8708F, 1.5438F, -3.7456F, -1.6989F, 0.3134F, -0.0296F));

		PartDefinition cube_r474 = leftFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(129, 60).addBox(-1.0231F, -2.0782F, 0.0008F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.0585F, 1.3574F, -4.8462F, -0.2591F, 0.3134F, -0.0296F));

		PartDefinition cube_r475 = leftFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(105, 110).addBox(0.1267F, -1.0143F, -0.3584F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4585F, -0.1426F, -5.4462F, -0.3604F, 0.418F, -0.049F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.401F, 2.3333F, 1.7521F, 0.0076F, 0.0782F, 0.0875F));

		PartDefinition cube_r476 = rightFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(110, 31).mirror().addBox(-0.5F, -0.85F, -1.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.2762F, -4.0747F, -2.2949F, 2.176F, -1.1021F, 0.3875F));

		PartDefinition cube_r477 = rightFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(115, 130).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6818F, -4.9084F, -3.38F, 1.5325F, -0.0452F, 1.3546F));

		PartDefinition cube_r478 = rightFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(66, 130).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6293F, -4.9381F, -4.6326F, 1.5032F, 0.1708F, 1.3432F));

		PartDefinition cube_r479 = rightFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(120, 130).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6155F, -5.0283F, -5.1242F, 1.3996F, 1.1695F, 1.1969F));

		PartDefinition cube_r480 = rightFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(104, 0).mirror().addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7878F, -5.3495F, -1.8457F, 3.0821F, -0.2874F, 1.3602F));

		PartDefinition cube_r481 = rightFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(3, 136).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.2719F, -5.1364F, -5.9586F, 0.4571F, -0.0758F, -1.2403F));

		PartDefinition cube_r482 = rightFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(8, 131).mirror().addBox(-0.1919F, -0.9071F, 1.4613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false)
				.texOffs(130, 130).mirror().addBox(-0.1919F, -0.9071F, 0.9613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.4634F, -3.7704F, -7.6329F, 0.3664F, -0.2896F, -0.7531F));

		PartDefinition cube_r483 = rightFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(13, 136).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-1.0521F, -5.0969F, -6.406F, 0.4571F, -0.0758F, -1.2403F));

		PartDefinition cube_r484 = rightFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(129, 39).mirror().addBox(-1.0F, -1.05F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.4002F, -4.69F, -7.7185F, -1.004F, 0.16F, -1.1556F));

		PartDefinition cube_r485 = rightFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(83, 125).mirror().addBox(-0.3931F, -1.2133F, -0.6657F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.4634F, -3.7704F, -7.6329F, -1.0018F, -0.151F, -0.6793F));

		PartDefinition cube_r486 = rightFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(129, 14).mirror().addBox(-1.0F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.4411F, -3.7866F, -9.6769F, -1.096F, 0.2813F, -1.0792F));

		PartDefinition cube_r487 = rightFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(12, 122).mirror().addBox(-0.1F, 0.2F, -0.675F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5249F, -3.5598F, -7.8962F, -1.0249F, -0.0246F, -0.5437F));

		PartDefinition cube_r488 = rightFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(29, 74).mirror().addBox(-0.2858F, -0.2913F, -4.5894F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-0.3585F, -0.1426F, -5.4462F, 0.1228F, -0.1739F, -0.0107F));

		PartDefinition cube_r489 = rightFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(111, 6).mirror().addBox(-0.55F, -1.5F, -1.125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4811F, -0.3147F, -0.9369F, 0.4436F, -0.2286F, 0.017F));

		PartDefinition cube_r490 = rightFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(84, 0).mirror().addBox(-0.475F, -1.0F, -2.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4189F, -2.5127F, -7.7061F, 1.7691F, -0.2464F, 0.0585F));

		PartDefinition cube_r491 = rightFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(36, 92).mirror().addBox(-0.6F, -1.7F, -0.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3215F, -0.8334F, -10.461F, 0.0972F, -0.257F, 0.0733F));

		PartDefinition cube_r492 = rightFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(130, 92).mirror().addBox(-0.5F, -0.8F, 1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(49, 65).mirror().addBox(-0.5F, -1.5F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(21, 37).mirror().addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3388F, 2.06F, -8.8601F, 0.3405F, -0.2308F, -0.0506F));

		PartDefinition cube_r493 = rightFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(123, 97).mirror().addBox(-0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1275F, 2.1781F, -9.7326F, 0.2532F, -0.2308F, -0.0506F));

		PartDefinition cube_r494 = rightFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(124, 31).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0829F, 2.3163F, -10.5967F, 0.1659F, -0.2308F, -0.0506F));

		PartDefinition cube_r495 = rightFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(124, 63).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.29F, 2.3373F, -11.4723F, 0.0787F, -0.2308F, -0.0506F));

		PartDefinition cube_r496 = rightFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(124, 52).mirror().addBox(-0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4928F, 2.2585F, -12.3513F, 0.035F, -0.2308F, -0.0506F));

		PartDefinition cube_r497 = rightFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(124, 40).mirror().addBox(-0.5F, -0.7F, 1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(36, 124).mirror().addBox(-0.5F, -0.8F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0802F, 1.7919F, -14.9623F, -0.0544F, -0.2269F, -0.0341F));

		PartDefinition cube_r498 = rightFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(124, 27).mirror().addBox(-0.1256F, -1.0504F, -1.0978F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5802F, 1.7919F, -14.4623F, -0.0493F, -0.3665F, -0.0356F));

		PartDefinition cube_r499 = rightFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(110, 52).mirror().addBox(-0.5F, -1.9F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3064F, 1.5138F, -8.7896F, -1.2508F, -0.2362F, 0.0379F));

		PartDefinition cube_r500 = rightFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(110, 128).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1003F, 1.8694F, -9.7013F, 0.3549F, -0.2362F, 0.0379F));

		PartDefinition cube_r501 = rightFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(118, 36).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.1153F, 2.1422F, -10.6389F, 1.8384F, -0.2362F, 0.0379F));

		PartDefinition cube_r502 = rightFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(60, 89).mirror().addBox(-0.2435F, -1.1281F, -0.6702F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0203F, 0.1658F, -10.8617F, 2.1455F, -0.2189F, 0.0899F));

		PartDefinition cube_r503 = rightFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(29, 82).mirror().addBox(-0.4888F, -0.1087F, -1.9271F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.331F, -1.9042F, -7.6257F, 1.701F, -0.2536F, 0.0003F));

		PartDefinition cube_r504 = rightFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(81, 52).mirror().addBox(-0.4869F, -2.9162F, -1.9271F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.331F, -1.9042F, -7.6257F, 1.8051F, -0.2363F, 0.0026F));

		PartDefinition cube_r505 = rightFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(25, 90).mirror().addBox(-0.2435F, -0.132F, -0.7323F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.0203F, 0.1658F, -10.8617F, 1.8401F, -0.2189F, 0.0899F));

		PartDefinition cube_r506 = rightFace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(49, 89).mirror().addBox(-0.2435F, -0.7044F, -0.743F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0203F, 0.1658F, -10.8617F, 1.971F, -0.2189F, 0.0899F));

		PartDefinition cube_r507 = rightFace.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(123, 5).mirror().addBox(-0.2435F, -3.4951F, -1.3807F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0203F, 0.1658F, -10.8617F, 0.7929F, -0.2189F, 0.0899F));

		PartDefinition cube_r508 = rightFace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(101, 52).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.1857F, -0.4173F, -14.6796F, -0.5614F, -0.2362F, 0.0379F));

		PartDefinition cube_r509 = rightFace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(135, 133).mirror().addBox(-0.0439F, 0.2337F, -1.8879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5802F, 1.7919F, -14.4623F, -2.0069F, -0.3758F, 0.0396F));

		PartDefinition cube_r510 = rightFace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(130, 73).mirror().addBox(-0.0439F, -0.0079F, 0.1516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5802F, 1.7919F, -14.4623F, 2.7927F, -0.3758F, 0.0396F));

		PartDefinition cube_r511 = rightFace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(118, 56).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.822F, 1.9255F, -13.5385F, 1.4021F, -0.2362F, 0.0379F));

		PartDefinition cube_r512 = rightFace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(129, 52).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5851F, 2.0845F, -12.5801F, -0.1687F, -0.2362F, 0.0379F));

		PartDefinition cube_r513 = rightFace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(119, 115).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.3489F, 2.1569F, -11.6111F, -1.6522F, -0.2362F, 0.0379F));

		PartDefinition cube_r514 = rightFace.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(20, 129).mirror().addBox(-0.0117F, -0.8041F, 4.8632F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4639F, 1.2493F, -6.0297F, -3.1357F, -0.2362F, 0.0379F));

		PartDefinition cube_r515 = rightFace.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(72, 98).mirror().addBox(-0.0117F, -0.9507F, -2.4452F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.4639F, 1.2493F, -6.0297F, -1.4689F, -0.2362F, 0.0379F));

		PartDefinition cube_r516 = rightFace.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(132, 10).mirror().addBox(-0.5059F, -0.664F, 0.1125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0625F, -4.4935F, -2.5345F, 0.2867F, -0.2761F, 0.0693F));

		PartDefinition cube_r517 = rightFace.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(14, 92).mirror().addBox(-0.975F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7405F, -2.2775F, -5.0535F, 0.1689F, -0.4131F, 0.013F));

		PartDefinition cube_r518 = rightFace.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(98, 100).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.4619F, -3.8278F, -2.9464F, 0.1625F, -0.2769F, 0.0191F));

		PartDefinition cube_r519 = rightFace.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(40, 84).mirror().addBox(0.0001F, -6.0604F, 0.0256F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.0585F, 1.3574F, -4.8462F, 0.0284F, -0.3141F, 0.0312F));

		PartDefinition cube_r520 = rightFace.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(81, 60).mirror().addBox(-1.0F, -0.5F, -1.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2012F, -4.2058F, -3.7123F, -0.1461F, -0.3141F, 0.0312F));

		PartDefinition cube_r521 = rightFace.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(38, 135).mirror().addBox(-0.5003F, -0.5773F, -0.6294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0625F, -4.4935F, -2.5345F, 0.669F, -0.2905F, 0.0742F));

		PartDefinition cube_r522 = rightFace.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(104, 11).mirror().addBox(-0.8124F, -0.4004F, -0.4421F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0901F, -2.0398F, -1.416F, 0.6768F, -0.2618F, 0.0128F));

		PartDefinition cube_r523 = rightFace.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(115, 0).mirror().addBox(-0.8124F, -2.8514F, -0.7619F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0901F, -2.0398F, -1.416F, 0.1969F, -0.2618F, 0.0128F));

		PartDefinition cube_r524 = rightFace.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(0, 115).mirror().addBox(-0.8124F, -2.0139F, -0.444F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0901F, -2.0398F, -1.416F, 0.5023F, -0.2618F, 0.0128F));

		PartDefinition cube_r525 = rightFace.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(117, 52).mirror().addBox(-0.4852F, -0.6364F, -1.6795F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.1537F, -1.5731F, -2.6423F, 1.5371F, -0.2095F, 0.0304F));

		PartDefinition cube_r526 = rightFace.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(134, 29).mirror().addBox(-0.4852F, -0.6222F, 0.7189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.1537F, -1.5731F, -2.6423F, -2.2154F, -0.2095F, 0.0304F));

		PartDefinition cube_r527 = rightFace.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(134, 13).mirror().addBox(-0.4852F, 0.1943F, 0.152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1537F, -1.5731F, -2.6423F, -1.4736F, -0.2095F, 0.0304F));

		PartDefinition cube_r528 = rightFace.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(8, 134).mirror().addBox(-0.4852F, -0.2301F, -0.9256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.1537F, -1.5731F, -2.6423F, -0.47F, -0.2095F, 0.0304F));

		PartDefinition cube_r529 = rightFace.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(3, 129).mirror().addBox(-0.4852F, -1.3824F, -0.8864F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1537F, -1.5731F, -2.6423F, -0.0337F, -0.2095F, 0.0304F));

		PartDefinition cube_r530 = rightFace.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(125, 128).mirror().addBox(-0.4852F, -2.1317F, -0.3638F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.1537F, -1.5731F, -2.6423F, 0.359F, -0.2095F, 0.0304F));

		PartDefinition cube_r531 = rightFace.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(130, 133).mirror().addBox(-0.4852F, -0.7032F, -0.2481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.1537F, -1.5731F, -2.6423F, -0.8627F, -0.2095F, 0.0304F));

		PartDefinition cube_r532 = rightFace.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(133, 124).mirror().addBox(-0.4852F, 0.2126F, 0.0073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1537F, -1.5731F, -2.6423F, 0.0972F, -0.2095F, 0.0304F));

		PartDefinition cube_r533 = rightFace.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(132, 0).mirror().addBox(-0.4852F, 0.5538F, -0.7339F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.1537F, -1.5731F, -2.6423F, 0.6208F, -0.2095F, 0.0304F));

		PartDefinition cube_r534 = rightFace.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(112, 119).mirror().addBox(-0.5458F, -0.6753F, -0.7885F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.6588F, -0.953F, -13.5909F, 0.6583F, -0.2263F, 0.0041F));

		PartDefinition cube_r535 = rightFace.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(135, 130).mirror().addBox(-0.5458F, -0.3866F, -0.1855F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.6588F, -0.953F, -13.5909F, 1.0947F, -0.2263F, 0.0041F));

		PartDefinition cube_r536 = rightFace.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(135, 127).mirror().addBox(-0.4497F, -0.6076F, -0.5001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6588F, -0.953F, -13.5909F, 2.7091F, -0.2263F, 0.0041F));

		PartDefinition cube_r537 = rightFace.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(124, 135).mirror().addBox(-0.4497F, -0.7061F, -0.212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(0.6588F, -0.953F, -13.5909F, -2.9632F, -0.2263F, 0.0041F));

		PartDefinition cube_r538 = rightFace.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(130, 89).mirror().addBox(-0.5F, -0.6F, -1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false)
				.texOffs(130, 86).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(0.2108F, -0.8255F, -10.9726F, -3.12F, -0.2528F, 0.0613F));

		PartDefinition cube_r539 = rightFace.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(130, 83).mirror().addBox(-0.5F, -0.875F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.1601F, -1.5363F, -10.6081F, -2.0292F, -0.2528F, 0.0613F));

		PartDefinition cube_r540 = rightFace.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(117, 32).mirror().addBox(-0.5F, -0.075F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(0.0614F, -2.1421F, -10.0829F, -0.7638F, -0.2528F, 0.0613F));

		PartDefinition cube_r541 = rightFace.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(35, 110).mirror().addBox(-0.5F, -0.075F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.061F, -2.6183F, -9.4971F, 0.6324F, -0.2528F, 0.0613F));

		PartDefinition cube_r542 = rightFace.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(130, 56).mirror().addBox(-0.5F, -0.875F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-0.1861F, -3.1275F, -8.8929F, 2.2469F, -0.2528F, 0.0613F));

		PartDefinition cube_r543 = rightFace.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(56, 130).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-0.304F, -3.663F, -8.3104F, -2.4219F, -0.2528F, 0.0613F));

		PartDefinition cube_r544 = rightFace.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(130, 48).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.5185F, -2.7336F, -7.7021F, -1.7674F, -0.2528F, 0.0613F));

		PartDefinition cube_r545 = rightFace.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(117, 28).mirror().addBox(-0.5F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-0.6566F, -1.7933F, -7.3911F, -1.2438F, -0.2528F, 0.0613F));

		PartDefinition cube_r546 = rightFace.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(116, 97).mirror().addBox(-0.5F, -0.9F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-0.6746F, -1.0022F, -7.5091F, -0.153F, -0.2528F, 0.0613F));

		PartDefinition cube_r547 = rightFace.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(125, 86).mirror().addBox(-0.5137F, 0.3391F, -0.4143F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.0919F, -2.0627F, -9.4547F, 0.8593F, -0.2528F, 0.0613F));

		PartDefinition cube_r548 = rightFace.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(116, 93).mirror().addBox(-0.5137F, -0.0527F, -2.1962F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-0.0919F, -2.0627F, -9.4547F, 1.9065F, -0.2528F, 0.0613F));

		PartDefinition cube_r549 = rightFace.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(116, 83).mirror().addBox(-0.5137F, -2.0548F, -0.8288F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.0919F, -2.0627F, -9.4547F, -3.1113F, -0.2528F, 0.0613F));

		PartDefinition cube_r550 = rightFace.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(135, 35).mirror().addBox(-0.7639F, -0.1876F, 0.4831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(135, 22).mirror().addBox(-0.5389F, -0.1876F, 0.4831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2521F, -2.1832F, -5.5431F, 1.7409F, -0.388F, 0.0501F));

		PartDefinition cube_r551 = rightFace.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(135, 6).mirror().addBox(-0.5154F, -0.1469F, -1.8354F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-1.2503F, -2.1856F, -5.5425F, -1.6926F, -0.4403F, 0.0866F));

		PartDefinition cube_r552 = rightFace.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(135, 82).mirror().addBox(-0.5137F, 0.0058F, -0.6666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-1.2521F, -2.1832F, -5.5431F, 2.1074F, -0.388F, 0.0501F));

		PartDefinition cube_r553 = rightFace.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(43, 123).mirror().addBox(-0.5137F, -1.3954F, -0.5613F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(-1.2521F, -2.1832F, -5.5431F, -0.0306F, -0.388F, 0.0501F));

		PartDefinition cube_r554 = rightFace.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(129, 29).mirror().addBox(-0.5137F, -1.7007F, -0.7617F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2521F, -2.1832F, -5.5431F, -0.0481F, -0.388F, 0.0501F));

		PartDefinition cube_r555 = rightFace.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(109, 135).mirror().addBox(-0.5137F, 0.0877F, -0.4636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-1.2521F, -2.1832F, -5.5431F, -0.7724F, -0.388F, 0.0501F));

		PartDefinition cube_r556 = rightFace.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(135, 97).mirror().addBox(-0.5137F, -0.1861F, 0.6734F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2521F, -2.1832F, -5.5431F, -1.9505F, -0.388F, 0.0501F));

		PartDefinition cube_r557 = rightFace.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(135, 94).mirror().addBox(-0.5137F, -1.4367F, 0.7423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-1.2521F, -2.1832F, -5.5431F, -2.6923F, -0.388F, 0.0501F));

		PartDefinition cube_r558 = rightFace.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(135, 91).mirror().addBox(-0.5137F, -2.0055F, 0.0235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(135, 88).mirror().addBox(-0.5137F, -2.0055F, -0.1765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2521F, -2.1832F, -5.5431F, -3.1286F, -0.388F, 0.0501F));

		PartDefinition cube_r559 = rightFace.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(135, 85).mirror().addBox(-0.5137F, -1.5652F, -1.3207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(135, 72).mirror().addBox(-0.5137F, -1.1652F, -1.3207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-1.2521F, -2.1832F, -5.5431F, 2.5001F, -0.388F, 0.0501F));

		PartDefinition cube_r560 = rightFace.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(63, 98).mirror().addBox(-0.475F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6056F, -4.9754F, -5.1316F, 0.2744F, -0.3064F, -0.1529F));

		PartDefinition cube_r561 = rightFace.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(135, 54).mirror().addBox(-0.5137F, 0.1635F, 0.0019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2521F, -2.1832F, -5.5431F, 1.4529F, -0.388F, 0.0501F));

		PartDefinition cube_r562 = rightFace.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(135, 48).mirror().addBox(-0.5137F, -1.2089F, 0.4598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.2521F, -2.1832F, -5.5431F, 0.3621F, -0.388F, 0.0501F));

		PartDefinition cube_r563 = rightFace.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(135, 45).mirror().addBox(-0.5137F, -1.8321F, -1.1804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-1.2521F, -2.1832F, -5.5431F, -0.6851F, -0.388F, 0.0501F));

		PartDefinition cube_r564 = rightFace.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(134, 104).mirror().addBox(-0.5137F, -0.712F, -2.0537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2521F, -2.1832F, -5.5431F, -1.3833F, -0.388F, 0.0501F));

		PartDefinition cube_r565 = rightFace.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(106, 23).mirror().addBox(0.0078F, -0.3101F, -0.1975F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7936F, 0.9265F, -1.8993F, 2.2298F, -0.2435F, -0.0096F));

		PartDefinition cube_r566 = rightFace.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(128, 123).mirror().addBox(0.0078F, -0.2553F, -0.9245F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6585F, 1.3574F, -2.9462F, -2.7631F, -0.1653F, 0.0926F));

		PartDefinition cube_r567 = rightFace.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(118, 87).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8708F, 1.5438F, -3.7456F, -1.6989F, -0.3134F, 0.0296F));

		PartDefinition cube_r568 = rightFace.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(129, 60).mirror().addBox(0.0231F, -2.0782F, 0.0008F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0585F, 1.3574F, -4.8462F, -0.2591F, -0.3134F, 0.0296F));

		PartDefinition cube_r569 = rightFace.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(105, 110).mirror().addBox(-1.1267F, -1.0143F, -0.3584F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4585F, -0.1426F, -5.4462F, -0.3604F, -0.418F, 0.049F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.358F, 1.8645F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r570 = jaw.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(109, 132).mirror().addBox(-0.5998F, -0.4951F, -0.43F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, 0.8833F, 2.3649F, -0.1047F, 0.0F));

		PartDefinition cube_r571 = jaw.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(125, 132).mirror().addBox(-0.5998F, -0.5435F, 0.367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(3, 133).mirror().addBox(-0.5998F, -0.5435F, 1.067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, 0.8833F, -2.6093F, -0.1047F, 0.0F));

		PartDefinition cube_r572 = jaw.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(133, 3).mirror().addBox(-0.5998F, 1.9853F, -0.2087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(84, 134).mirror().addBox(-0.5998F, 1.9853F, -0.5087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, 0.8833F, -1.1606F, -0.1047F, 0.0F));

		PartDefinition cube_r573 = jaw.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(30, 130).mirror().addBox(-0.5998F, 2.9037F, -0.7239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, 0.8833F, -0.9861F, -0.1047F, 0.0F));

		PartDefinition cube_r574 = jaw.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(18, 136).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9741F, 2.7174F, -3.7433F, -1.2043F, -0.1047F, 0.0F));

		PartDefinition cube_r575 = jaw.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(13, 133).mirror().addBox(-0.5998F, 0.3625F, -5.5255F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, -0.0167F, 0.3665F, -0.1047F, 0.0F));

		PartDefinition cube_r576 = jaw.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(127, 0).mirror().addBox(-0.5F, -1.4F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7201F, 2.9126F, -6.1604F, 1.6319F, -0.1047F, 0.0F));

		PartDefinition cube_r577 = jaw.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(74, 66).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4276F, 3.1005F, -8.2367F, 1.8986F, -0.1639F, -0.0602F));

		PartDefinition cube_r578 = jaw.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(18, 133).mirror().addBox(-0.6015F, 1.2709F, -1.5605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9308F, 3.652F, -10.4128F, 2.0732F, -0.1639F, -0.0602F));

		PartDefinition cube_r579 = jaw.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(17, 125).mirror().addBox(-0.6015F, -0.6623F, -1.5036F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9308F, 3.652F, -10.4128F, 2.0295F, -0.1639F, -0.0602F));

		PartDefinition cube_r580 = jaw.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(136, 32).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9436F, 5.2971F, -10.3583F, 2.0732F, -0.1639F, -0.0602F));

		PartDefinition cube_r581 = jaw.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(35, 130).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.416F, 5.5589F, -12.8892F, -1.3341F, -0.2293F, -0.0851F));

		PartDefinition cube_r582 = jaw.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(23, 133).mirror().addBox(-0.5F, -0.675F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.3027F, -0.3201F, 0.2832F, -2.9147F, -0.1047F, 0.0F));

		PartDefinition cube_r583 = jaw.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(28, 133).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2157F, 0.1285F, -0.5451F, -2.7838F, -0.1047F, 0.0F));

		PartDefinition cube_r584 = jaw.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(33, 133).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1845F, -0.2842F, -0.8415F, 1.5446F, -0.1047F, 0.0F));

		PartDefinition cube_r585 = jaw.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(10, 127).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.0816F, -0.301F, -1.8206F, 0.096F, -0.1047F, 0.0F));

		PartDefinition cube_r586 = jaw.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(127, 10).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8763F, 0.2003F, -4.6737F, 0.2269F, -0.1047F, 0.0F));

		PartDefinition cube_r587 = jaw.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(127, 67).mirror().addBox(-0.5998F, -1.7096F, -5.3645F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, -0.0167F, 0.4538F, -0.1047F, 0.0F));

		PartDefinition cube_r588 = jaw.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(46, 133).mirror().addBox(-0.5F, -0.7957F, 0.6763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.968F, 1.3756F, -4.9583F, 0.2355F, -0.1045F, 0.0F));

		PartDefinition cube_r589 = jaw.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(127, 79).mirror().addBox(-0.5F, -0.575F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-2.0151F, 1.1427F, -4.5086F, -0.9426F, -0.1045F, 0.0F));

		PartDefinition cube_r590 = jaw.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(56, 133).mirror().addBox(-0.5F, 0.5938F, 0.0243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.968F, 1.3756F, -4.9583F, -1.536F, -0.1045F, 0.0F));

		PartDefinition cube_r591 = jaw.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(66, 133).mirror().addBox(-0.5F, -0.8898F, -0.0563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-1.968F, 1.3756F, -4.9583F, -2.9323F, -0.1045F, 0.0F));

		PartDefinition cube_r592 = jaw.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(71, 133).mirror().addBox(-0.5F, -0.2802F, -0.8702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.968F, 1.3756F, -4.9583F, 1.9546F, -0.1045F, 0.0F));

		PartDefinition cube_r593 = jaw.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(79, 133).mirror().addBox(-0.5F, 0.0693F, 0.0942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false)
				.texOffs(98, 133).mirror().addBox(-0.5F, 0.0693F, 0.2942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.968F, 1.3756F, -4.9583F, 0.8638F, -0.1045F, 0.0F));

		PartDefinition cube_r594 = jaw.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(111, 57).mirror().addBox(-0.5998F, -2.1706F, -7.1951F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, -0.0167F, 0.5411F, -0.1047F, 0.0F));

		PartDefinition cube_r595 = jaw.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(117, 64).mirror().addBox(-0.6015F, 0.1947F, -0.2836F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9308F, 3.652F, -10.4128F, 0.5896F, -0.1639F, -0.0602F));

		PartDefinition cube_r596 = jaw.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(70, 116).mirror().addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9024F, 4.7427F, -10.8089F, 0.5285F, -0.1639F, -0.0602F));

		PartDefinition cube_r597 = jaw.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(130, 35).mirror().addBox(-0.7212F, 0.5597F, -2.6156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9308F, 3.652F, -10.4128F, 0.3327F, -0.2293F, -0.0851F));

		PartDefinition cube_r598 = jaw.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(33, 136).mirror().addBox(-0.5336F, -0.6014F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3344F, 5.5356F, -13.0983F, -1.4563F, -0.2293F, -0.0851F));

		PartDefinition cube_r599 = jaw.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(130, 45).mirror().addBox(-0.4477F, -0.1569F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3344F, 5.5356F, -13.0983F, -1.5538F, -0.0524F, 0.0033F));

		PartDefinition cube_r600 = jaw.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(96, 72).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(130, 22).mirror().addBox(-0.5F, 0.0F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.3067F, 2.9604F, -9.0174F, 0.6333F, -0.1639F, -0.0602F));

		PartDefinition cube_r601 = jaw.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(133, 101).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5594F, 2.0236F, -7.8334F, 0.5547F, -0.1639F, -0.0602F));

		PartDefinition cube_r602 = jaw.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(125, 21).mirror().addBox(-0.6015F, -0.2984F, 1.7929F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9308F, 3.652F, -10.4128F, 0.6769F, -0.1639F, -0.0602F));

		PartDefinition cube_r603 = jaw.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(73, 124).mirror().addBox(-0.6015F, -0.5036F, 1.0172F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9308F, 3.652F, -10.4128F, 0.6071F, -0.1639F, -0.0602F));

		PartDefinition cube_r604 = jaw.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(78, 124).mirror().addBox(-0.6015F, -0.5916F, 0.2344F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9308F, 3.652F, -10.4128F, 0.5547F, -0.1639F, -0.0602F));

		PartDefinition cube_r605 = jaw.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(125, 48).mirror().addBox(-0.6015F, -0.6866F, -0.5472F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9308F, 3.652F, -10.4128F, 0.4675F, -0.1639F, -0.0602F));

		PartDefinition cube_r606 = jaw.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(125, 56).mirror().addBox(-0.6015F, -0.7499F, -1.3371F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9308F, 3.652F, -10.4128F, 0.4238F, -0.1639F, -0.0602F));

		PartDefinition cube_r607 = jaw.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(125, 73).mirror().addBox(-0.7212F, -0.5719F, -2.095F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9308F, 3.652F, -10.4128F, 0.4287F, -0.2293F, -0.0851F));

		PartDefinition cube_r608 = jaw.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(125, 35).mirror().addBox(-0.7212F, -0.3895F, -2.8573F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(124, 105).mirror().addBox(-0.7212F, -0.3645F, -3.6573F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9308F, 3.652F, -10.4128F, 0.3414F, -0.2293F, -0.0851F));

		PartDefinition cube_r609 = jaw.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(105, 127).mirror().addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.3528F, -2.5043F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r610 = jaw.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(128, 4).mirror().addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6014F, 3.3528F, -0.5968F, 0.4696F, -0.0811F, 0.0342F));

		PartDefinition cube_r611 = jaw.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(136, 25).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(28, 136).mirror().addBox(-0.5F, 0.0F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7719F, 5.7691F, -11.223F, -2.6654F, -0.1639F, -0.0602F));

		PartDefinition cube_r612 = jaw.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(136, 41).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2192F, 6.4938F, -13.3886F, -0.4091F, -0.2293F, -0.0851F));

		PartDefinition cube_r613 = jaw.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(134, 59).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6032F, 1.6688F, -7.2725F, -0.9425F, -0.1047F, 0.0F));

		PartDefinition cube_r614 = jaw.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(61, 134).mirror().addBox(-0.5F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6268F, 3.0674F, -7.0478F, 1.9809F, -0.1047F, 0.0F));

		PartDefinition cube_r615 = jaw.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(25, 130).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7865F, 3.4748F, -5.5284F, 0.4538F, -0.1047F, 0.0F));

		PartDefinition cube_r616 = jaw.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(119, 101).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9776F, -0.2051F, -2.8105F, -1.3439F, -0.1047F, 0.0F));

		PartDefinition cube_r617 = jaw.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(134, 69).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0404F, 2.2084F, -2.213F, 0.2793F, -0.1047F, 0.0F));

		PartDefinition cube_r618 = jaw.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(128, 4).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6014F, 3.3528F, -0.5968F, 0.4696F, 0.0811F, -0.0342F));

		PartDefinition cube_r619 = jaw.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(105, 127).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3528F, -2.5043F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r620 = jaw.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(124, 105).addBox(-0.2788F, -0.3645F, -3.6573F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(125, 35).addBox(-0.2788F, -0.3895F, -2.8573F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9308F, 3.652F, -10.4128F, 0.3414F, 0.2293F, 0.0851F));

		PartDefinition cube_r621 = jaw.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(125, 73).addBox(-0.2788F, -0.5719F, -2.095F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9308F, 3.652F, -10.4128F, 0.4287F, 0.2293F, 0.0851F));

		PartDefinition cube_r622 = jaw.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(125, 56).addBox(-0.3985F, -0.7499F, -1.3371F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9308F, 3.652F, -10.4128F, 0.4238F, 0.1639F, 0.0602F));

		PartDefinition cube_r623 = jaw.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(125, 48).addBox(-0.3985F, -0.6866F, -0.5472F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9308F, 3.652F, -10.4128F, 0.4675F, 0.1639F, 0.0602F));

		PartDefinition cube_r624 = jaw.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(78, 124).addBox(-0.3985F, -0.5916F, 0.2344F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9308F, 3.652F, -10.4128F, 0.5547F, 0.1639F, 0.0602F));

		PartDefinition cube_r625 = jaw.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(73, 124).addBox(-0.3985F, -0.5036F, 1.0172F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9308F, 3.652F, -10.4128F, 0.6071F, 0.1639F, 0.0602F));

		PartDefinition cube_r626 = jaw.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(125, 21).addBox(-0.3985F, -0.2984F, 1.7929F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9308F, 3.652F, -10.4128F, 0.6769F, 0.1639F, 0.0602F));

		PartDefinition cube_r627 = jaw.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(133, 101).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5594F, 2.0236F, -7.8334F, 0.5547F, 0.1639F, 0.0602F));

		PartDefinition cube_r628 = jaw.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(130, 22).addBox(-0.5F, 0.0F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(96, 72).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.3067F, 2.9604F, -9.0174F, 0.6333F, 0.1639F, 0.0602F));

		PartDefinition cube_r629 = jaw.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(130, 45).addBox(-0.5523F, -0.1569F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3344F, 5.5356F, -13.0983F, -1.5538F, 0.0524F, -0.0033F));

		PartDefinition cube_r630 = jaw.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(136, 41).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2192F, 6.4938F, -13.3886F, -0.4091F, 0.2293F, 0.0851F));

		PartDefinition cube_r631 = jaw.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(33, 136).addBox(-0.4664F, -0.6014F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3344F, 5.5356F, -13.0983F, -1.4563F, 0.2293F, 0.0851F));

		PartDefinition cube_r632 = jaw.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(130, 35).addBox(-0.2788F, 0.5597F, -2.6156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9308F, 3.652F, -10.4128F, 0.3327F, 0.2293F, 0.0851F));

		PartDefinition cube_r633 = jaw.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(70, 116).addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9024F, 4.7427F, -10.8089F, 0.5285F, 0.1639F, 0.0602F));

		PartDefinition cube_r634 = jaw.addOrReplaceChild("cube_r634", CubeListBuilder.create().texOffs(117, 64).addBox(-0.3985F, 0.1947F, -0.2836F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9308F, 3.652F, -10.4128F, 0.5896F, 0.1639F, 0.0602F));

		PartDefinition cube_r635 = jaw.addOrReplaceChild("cube_r635", CubeListBuilder.create().texOffs(134, 59).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.6032F, 1.6688F, -7.2725F, -0.9425F, 0.1047F, 0.0F));

		PartDefinition cube_r636 = jaw.addOrReplaceChild("cube_r636", CubeListBuilder.create().texOffs(111, 57).addBox(-0.4002F, -2.1706F, -7.1951F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, -0.0167F, 0.5411F, 0.1047F, 0.0F));

		PartDefinition cube_r637 = jaw.addOrReplaceChild("cube_r637", CubeListBuilder.create().texOffs(98, 133).addBox(-0.5F, 0.0693F, 0.2942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(79, 133).addBox(-0.5F, 0.0693F, 0.0942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(1.968F, 1.3756F, -4.9583F, 0.8638F, 0.1045F, 0.0F));

		PartDefinition cube_r638 = jaw.addOrReplaceChild("cube_r638", CubeListBuilder.create().texOffs(71, 133).addBox(-0.5F, -0.2802F, -0.8702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.968F, 1.3756F, -4.9583F, 1.9546F, 0.1045F, 0.0F));

		PartDefinition cube_r639 = jaw.addOrReplaceChild("cube_r639", CubeListBuilder.create().texOffs(66, 133).addBox(-0.5F, -0.8898F, -0.0563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(1.968F, 1.3756F, -4.9583F, -2.9323F, 0.1045F, 0.0F));

		PartDefinition cube_r640 = jaw.addOrReplaceChild("cube_r640", CubeListBuilder.create().texOffs(56, 133).addBox(-0.5F, 0.5938F, 0.0243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.968F, 1.3756F, -4.9583F, -1.536F, 0.1045F, 0.0F));

		PartDefinition cube_r641 = jaw.addOrReplaceChild("cube_r641", CubeListBuilder.create().texOffs(127, 79).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(2.0151F, 1.1427F, -4.5086F, -0.9426F, 0.1045F, 0.0F));

		PartDefinition cube_r642 = jaw.addOrReplaceChild("cube_r642", CubeListBuilder.create().texOffs(46, 133).addBox(-0.5F, -0.7957F, 0.6763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.968F, 1.3756F, -4.9583F, 0.2355F, 0.1045F, 0.0F));

		PartDefinition cube_r643 = jaw.addOrReplaceChild("cube_r643", CubeListBuilder.create().texOffs(127, 67).addBox(-0.4002F, -1.7096F, -5.3645F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, -0.0167F, 0.4538F, 0.1047F, 0.0F));

		PartDefinition cube_r644 = jaw.addOrReplaceChild("cube_r644", CubeListBuilder.create().texOffs(127, 10).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.8763F, 0.2003F, -4.6737F, 0.2269F, 0.1047F, 0.0F));

		PartDefinition cube_r645 = jaw.addOrReplaceChild("cube_r645", CubeListBuilder.create().texOffs(119, 101).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9776F, -0.2051F, -2.8105F, -1.3439F, 0.1047F, 0.0F));

		PartDefinition cube_r646 = jaw.addOrReplaceChild("cube_r646", CubeListBuilder.create().texOffs(10, 127).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.0816F, -0.301F, -1.8206F, 0.096F, 0.1047F, 0.0F));

		PartDefinition cube_r647 = jaw.addOrReplaceChild("cube_r647", CubeListBuilder.create().texOffs(33, 133).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.1845F, -0.2842F, -0.8415F, 1.5446F, 0.1047F, 0.0F));

		PartDefinition cube_r648 = jaw.addOrReplaceChild("cube_r648", CubeListBuilder.create().texOffs(28, 133).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2157F, 0.1285F, -0.5451F, -2.7838F, 0.1047F, 0.0F));

		PartDefinition cube_r649 = jaw.addOrReplaceChild("cube_r649", CubeListBuilder.create().texOffs(23, 133).addBox(-0.5F, -0.675F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.3027F, -0.3201F, 0.2832F, -2.9147F, 0.1047F, 0.0F));

		PartDefinition cube_r650 = jaw.addOrReplaceChild("cube_r650", CubeListBuilder.create().texOffs(35, 130).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.416F, 5.5589F, -12.8892F, -1.3341F, 0.2293F, 0.0851F));

		PartDefinition cube_r651 = jaw.addOrReplaceChild("cube_r651", CubeListBuilder.create().texOffs(28, 136).addBox(-0.5F, 0.0F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(136, 25).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7719F, 5.7691F, -11.223F, -2.6654F, 0.1639F, 0.0602F));

		PartDefinition cube_r652 = jaw.addOrReplaceChild("cube_r652", CubeListBuilder.create().texOffs(136, 32).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9436F, 5.2971F, -10.3583F, 2.0732F, 0.1639F, 0.0602F));

		PartDefinition cube_r653 = jaw.addOrReplaceChild("cube_r653", CubeListBuilder.create().texOffs(17, 125).addBox(-0.3985F, -0.6623F, -1.5036F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9308F, 3.652F, -10.4128F, 2.0295F, 0.1639F, 0.0602F));

		PartDefinition cube_r654 = jaw.addOrReplaceChild("cube_r654", CubeListBuilder.create().texOffs(18, 133).addBox(-0.3985F, 1.2709F, -1.5605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9308F, 3.652F, -10.4128F, 2.0732F, 0.1639F, 0.0602F));

		PartDefinition cube_r655 = jaw.addOrReplaceChild("cube_r655", CubeListBuilder.create().texOffs(74, 66).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4276F, 3.1005F, -8.2367F, 1.8986F, 0.1639F, 0.0602F));

		PartDefinition cube_r656 = jaw.addOrReplaceChild("cube_r656", CubeListBuilder.create().texOffs(61, 134).addBox(-0.5F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6268F, 3.0674F, -7.0478F, 1.9809F, 0.1047F, 0.0F));

		PartDefinition cube_r657 = jaw.addOrReplaceChild("cube_r657", CubeListBuilder.create().texOffs(25, 130).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.7865F, 3.4748F, -5.5284F, 0.4538F, 0.1047F, 0.0F));

		PartDefinition cube_r658 = jaw.addOrReplaceChild("cube_r658", CubeListBuilder.create().texOffs(127, 0).addBox(-0.5F, -1.4F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.7201F, 2.9126F, -6.1604F, 1.6319F, 0.1047F, 0.0F));

		PartDefinition cube_r659 = jaw.addOrReplaceChild("cube_r659", CubeListBuilder.create().texOffs(13, 133).addBox(-0.4002F, 0.3625F, -5.5255F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, -0.0167F, 0.3665F, 0.1047F, 0.0F));

		PartDefinition cube_r660 = jaw.addOrReplaceChild("cube_r660", CubeListBuilder.create().texOffs(18, 136).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9741F, 2.7174F, -3.7433F, -1.2043F, 0.1047F, 0.0F));

		PartDefinition cube_r661 = jaw.addOrReplaceChild("cube_r661", CubeListBuilder.create().texOffs(134, 69).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0404F, 2.2084F, -2.213F, 0.2793F, 0.1047F, 0.0F));

		PartDefinition cube_r662 = jaw.addOrReplaceChild("cube_r662", CubeListBuilder.create().texOffs(30, 130).addBox(-0.4002F, 2.9037F, -0.7239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, 0.8833F, -0.9861F, 0.1047F, 0.0F));

		PartDefinition cube_r663 = jaw.addOrReplaceChild("cube_r663", CubeListBuilder.create().texOffs(84, 134).addBox(-0.4002F, 1.9853F, -0.5087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(133, 3).addBox(-0.4002F, 1.9853F, -0.2087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, 0.8833F, -1.1606F, 0.1047F, 0.0F));

		PartDefinition cube_r664 = jaw.addOrReplaceChild("cube_r664", CubeListBuilder.create().texOffs(3, 133).addBox(-0.4002F, -0.5435F, 1.067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(125, 132).addBox(-0.4002F, -0.5435F, 0.367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, 0.8833F, -2.6093F, 0.1047F, 0.0F));

		PartDefinition cube_r665 = jaw.addOrReplaceChild("cube_r665", CubeListBuilder.create().texOffs(109, 132).addBox(-0.4002F, -0.4951F, -0.43F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, 0.8833F, 2.3649F, 0.1047F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.468F, 6.5991F, -5.7227F, -0.428F, 0.0981F, -0.1959F));

		PartDefinition cube_r666 = bone2.addOrReplaceChild("cube_r666", CubeListBuilder.create().texOffs(86, 27).addBox(-0.5F, -0.85F, -3.95F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5002F, -2.1639F, -0.5243F, 1.2262F, -0.0148F, -0.0092F));

		PartDefinition cube_r667 = bone2.addOrReplaceChild("cube_r667", CubeListBuilder.create().texOffs(80, 97).addBox(-0.5F, -1.05F, -1.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4014F, 2.0826F, -4.0784F, 0.5717F, -0.0148F, 0.5143F));

		PartDefinition cube_r668 = bone2.addOrReplaceChild("cube_r668", CubeListBuilder.create().texOffs(80, 39).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.0603F, 5.0213F, -4.1787F, -1.9154F, -0.0148F, 0.5143F));

		PartDefinition cube_r669 = bone2.addOrReplaceChild("cube_r669", CubeListBuilder.create().texOffs(24, 124).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-1.7728F, 4.5374F, -5.0053F, -0.5977F, -0.0148F, 0.5143F));

		PartDefinition cube_r670 = bone2.addOrReplaceChild("cube_r670", CubeListBuilder.create().texOffs(23, 103).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.3917F, 3.8827F, -5.658F, 0.7113F, -0.0148F, 0.5143F));

		PartDefinition cube_r671 = bone2.addOrReplaceChild("cube_r671", CubeListBuilder.create().texOffs(111, 88).addBox(-0.5F, -1.275F, 0.125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.2163F, 3.5355F, -4.4374F, 1.9767F, -0.0148F, 0.5143F));

		PartDefinition cube_r672 = bone2.addOrReplaceChild("cube_r672", CubeListBuilder.create().texOffs(133, 109).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-2.3318F, 5.4455F, -2.3119F, 2.9453F, -0.0148F, 0.5143F));

		PartDefinition cube_r673 = bone2.addOrReplaceChild("cube_r673", CubeListBuilder.create().texOffs(46, 136).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.0583F, 4.9371F, -1.4954F, 2.1861F, -0.0148F, 0.5143F));

		PartDefinition cube_r674 = bone2.addOrReplaceChild("cube_r674", CubeListBuilder.create().texOffs(98, 129).addBox(-0.5F, -0.8F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.5423F, 4.0521F, -2.4338F, 1.2698F, -0.0148F, 0.5143F));

		PartDefinition cube_r675 = bone2.addOrReplaceChild("cube_r675", CubeListBuilder.create().texOffs(129, 105).addBox(-0.5F, -0.2F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.8375F, 2.8207F, -2.96F, 0.2226F, -0.0148F, 0.5143F));

		PartDefinition cube_r676 = bone2.addOrReplaceChild("cube_r676", CubeListBuilder.create().texOffs(100, 125).addBox(-0.5F, -1.0F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.7965F, 2.7444F, -2.8375F, 0.6153F, -0.0148F, 0.5143F));

		PartDefinition cube_r677 = bone2.addOrReplaceChild("cube_r677", CubeListBuilder.create().texOffs(23, 136).addBox(-1.0027F, 0.6219F, -0.795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.949F, 0.6577F, -2.1781F, 0.2662F, -0.0148F, 0.5143F));

		PartDefinition cube_r678 = bone2.addOrReplaceChild("cube_r678", CubeListBuilder.create().texOffs(97, 20).addBox(-1.0027F, -0.7781F, -3.1951F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.949F, 0.6577F, -2.1781F, 0.7462F, -0.0148F, 0.5143F));

		PartDefinition cube_r679 = bone2.addOrReplaceChild("cube_r679", CubeListBuilder.create().texOffs(86, 21).addBox(-0.5F, -1.125F, -3.55F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5002F, -2.1639F, -0.5243F, 1.0953F, -0.0148F, -0.0092F));

		PartDefinition cube_r680 = bone2.addOrReplaceChild("cube_r680", CubeListBuilder.create().texOffs(99, 77).addBox(-0.5F, -0.8F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5009F, -2.3322F, -0.6715F, 1.3134F, -0.0148F, -0.0092F));

		PartDefinition cube_r681 = bone2.addOrReplaceChild("cube_r681", CubeListBuilder.create().texOffs(32, 99).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.432F, -8.094F, 0.3804F, 1.3658F, -0.0148F, -0.0092F));

		PartDefinition cube_r682 = bone2.addOrReplaceChild("cube_r682", CubeListBuilder.create().texOffs(117, 107).addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4344F, -8.0382F, 0.2505F, 1.5403F, -0.0148F, -0.0092F));

		PartDefinition cube_r683 = bone2.addOrReplaceChild("cube_r683", CubeListBuilder.create().texOffs(79, 66).addBox(-0.5F, -1.9F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4657F, -3.708F, 0.8461F, 1.2785F, -0.0148F, -0.0092F));

		PartDefinition cube_r684 = bone2.addOrReplaceChild("cube_r684", CubeListBuilder.create().texOffs(14, 86).addBox(-0.9453F, -1.2135F, 1.0157F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.9555F, -0.9822F, -0.4595F, 1.3222F, -0.0148F, -0.0092F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.468F, 6.5991F, -5.7227F, -0.428F, -0.0981F, 0.1959F));

		PartDefinition cube_r685 = bone4.addOrReplaceChild("cube_r685", CubeListBuilder.create().texOffs(86, 27).mirror().addBox(-0.5F, -0.85F, -3.95F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5002F, -2.1639F, -0.5243F, 1.2262F, 0.0148F, 0.0092F));

		PartDefinition cube_r686 = bone4.addOrReplaceChild("cube_r686", CubeListBuilder.create().texOffs(80, 97).mirror().addBox(-0.5F, -1.05F, -1.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.4014F, 2.0826F, -4.0784F, 0.5717F, 0.0148F, -0.5143F));

		PartDefinition cube_r687 = bone4.addOrReplaceChild("cube_r687", CubeListBuilder.create().texOffs(80, 39).mirror().addBox(-0.5F, -1.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.0603F, 5.0213F, -4.1787F, -1.9154F, 0.0148F, -0.5143F));

		PartDefinition cube_r688 = bone4.addOrReplaceChild("cube_r688", CubeListBuilder.create().texOffs(24, 124).mirror().addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(1.7728F, 4.5374F, -5.0053F, -0.5977F, 0.0148F, -0.5143F));

		PartDefinition cube_r689 = bone4.addOrReplaceChild("cube_r689", CubeListBuilder.create().texOffs(23, 103).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.3917F, 3.8827F, -5.658F, 0.7113F, 0.0148F, -0.5143F));

		PartDefinition cube_r690 = bone4.addOrReplaceChild("cube_r690", CubeListBuilder.create().texOffs(111, 88).mirror().addBox(-0.5F, -1.275F, 0.125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.2163F, 3.5355F, -4.4374F, 1.9767F, 0.0148F, -0.5143F));

		PartDefinition cube_r691 = bone4.addOrReplaceChild("cube_r691", CubeListBuilder.create().texOffs(133, 109).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(2.3318F, 5.4455F, -2.3119F, 2.9453F, 0.0148F, -0.5143F));

		PartDefinition cube_r692 = bone4.addOrReplaceChild("cube_r692", CubeListBuilder.create().texOffs(46, 136).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.0583F, 4.9371F, -1.4954F, 2.1861F, 0.0148F, -0.5143F));

		PartDefinition cube_r693 = bone4.addOrReplaceChild("cube_r693", CubeListBuilder.create().texOffs(98, 129).mirror().addBox(-0.5F, -0.8F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.5423F, 4.0521F, -2.4338F, 1.2698F, 0.0148F, -0.5143F));

		PartDefinition cube_r694 = bone4.addOrReplaceChild("cube_r694", CubeListBuilder.create().texOffs(129, 105).mirror().addBox(-0.5F, -0.2F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(0.8375F, 2.8207F, -2.96F, 0.2226F, 0.0148F, -0.5143F));

		PartDefinition cube_r695 = bone4.addOrReplaceChild("cube_r695", CubeListBuilder.create().texOffs(100, 125).mirror().addBox(-0.5F, -1.0F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.7965F, 2.7444F, -2.8375F, 0.6153F, 0.0148F, -0.5143F));

		PartDefinition cube_r696 = bone4.addOrReplaceChild("cube_r696", CubeListBuilder.create().texOffs(23, 136).mirror().addBox(0.0027F, 0.6219F, -0.795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-0.949F, 0.6577F, -2.1781F, 0.2662F, 0.0148F, -0.5143F));

		PartDefinition cube_r697 = bone4.addOrReplaceChild("cube_r697", CubeListBuilder.create().texOffs(97, 20).mirror().addBox(0.0027F, -0.7781F, -3.1951F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.949F, 0.6577F, -2.1781F, 0.7462F, 0.0148F, -0.5143F));

		PartDefinition cube_r698 = bone4.addOrReplaceChild("cube_r698", CubeListBuilder.create().texOffs(86, 21).mirror().addBox(-0.5F, -1.125F, -3.55F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5002F, -2.1639F, -0.5243F, 1.0953F, 0.0148F, 0.0092F));

		PartDefinition cube_r699 = bone4.addOrReplaceChild("cube_r699", CubeListBuilder.create().texOffs(99, 77).mirror().addBox(-0.5F, -0.8F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5009F, -2.3322F, -0.6715F, 1.3134F, 0.0148F, 0.0092F));

		PartDefinition cube_r700 = bone4.addOrReplaceChild("cube_r700", CubeListBuilder.create().texOffs(32, 99).mirror().addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.432F, -8.094F, 0.3804F, 1.3658F, 0.0148F, 0.0092F));

		PartDefinition cube_r701 = bone4.addOrReplaceChild("cube_r701", CubeListBuilder.create().texOffs(117, 107).mirror().addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4344F, -8.0382F, 0.2505F, 1.5403F, 0.0148F, 0.0092F));

		PartDefinition cube_r702 = bone4.addOrReplaceChild("cube_r702", CubeListBuilder.create().texOffs(79, 66).mirror().addBox(-0.5F, -1.9F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4657F, -3.708F, 0.8461F, 1.2785F, 0.0148F, 0.0092F));

		PartDefinition cube_r703 = bone4.addOrReplaceChild("cube_r703", CubeListBuilder.create().texOffs(14, 86).mirror().addBox(-0.0547F, -1.2135F, 1.0157F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9555F, -0.9822F, -0.4595F, 1.3222F, 0.0148F, 0.0092F));

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