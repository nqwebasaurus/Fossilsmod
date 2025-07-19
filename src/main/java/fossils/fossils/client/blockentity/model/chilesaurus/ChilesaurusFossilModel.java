package fossils.fossils.client.blockentity.model.chilesaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ChilesaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart bodyMiddle;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart bodyFront;
	private final ModelPart neckBase;
	private final ModelPart neckMiddlebase;
	private final ModelPart neckMiddlefront;
	private final ModelPart neckFront;
	private final ModelPart neckFront2;
	private final ModelPart head;
	private final ModelPart headSlope;
	private final ModelPart upperJawback;
	private final ModelPart upperJawslopefront;
	private final ModelPart upperJawslopeback;
	private final ModelPart lowerJawbase;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart chestSlope;
	private final ModelPart leftUpperarm;
	private final ModelPart leftLowerarm;
	private final ModelPart leftHand;
	private final ModelPart leftHand2;
	private final ModelPart rightUpperarm;
	private final ModelPart rightLowerarm;
	private final ModelPart rightHand;
	private final ModelPart rightHand2;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart tailBase;
	private final ModelPart tailMiddlebase;
	private final ModelPart tailMiddle;
	private final ModelPart tailMiddleend;
	private final ModelPart tailEnd;
	private final ModelPart tailEnd2;
	private final ModelPart tailEnd3;
	private final ModelPart tailEnd4;
	private final ModelPart tailEnd5;
	private final ModelPart tailEnd6;
	private final ModelPart rightThigh;
	private final ModelPart rightShin;
	private final ModelPart rightAnkle;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart leftThigh;
	private final ModelPart leftShin;
	private final ModelPart leftAnkle;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart bone;
	private final ModelPart bone3;

	public ChilesaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.bodyMiddle = this.hips.getChild("bodyMiddle");
		this.body = this.bodyMiddle.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.bodyFront = this.body2.getChild("bodyFront");
		this.neckBase = this.bodyFront.getChild("neckBase");
		this.neckMiddlebase = this.neckBase.getChild("neckMiddlebase");
		this.neckMiddlefront = this.neckMiddlebase.getChild("neckMiddlefront");
		this.neckFront = this.neckMiddlefront.getChild("neckFront");
		this.neckFront2 = this.neckFront.getChild("neckFront2");
		this.head = this.neckFront2.getChild("head");
		this.headSlope = this.head.getChild("headSlope");
		this.upperJawback = this.head.getChild("upperJawback");
		this.upperJawslopefront = this.upperJawback.getChild("upperJawslopefront");
		this.upperJawslopeback = this.upperJawslopefront.getChild("upperJawslopeback");
		this.lowerJawbase = this.head.getChild("lowerJawbase");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.chestSlope = this.bodyFront.getChild("chestSlope");
		this.leftUpperarm = this.bodyFront.getChild("leftUpperarm");
		this.leftLowerarm = this.leftUpperarm.getChild("leftLowerarm");
		this.leftHand = this.leftLowerarm.getChild("leftHand");
		this.leftHand2 = this.leftLowerarm.getChild("leftHand2");
		this.rightUpperarm = this.bodyFront.getChild("rightUpperarm");
		this.rightLowerarm = this.rightUpperarm.getChild("rightLowerarm");
		this.rightHand = this.rightLowerarm.getChild("rightHand");
		this.rightHand2 = this.rightLowerarm.getChild("rightHand2");
		this.bone2 = this.bodyFront.getChild("bone2");
		this.bone4 = this.bodyFront.getChild("bone4");
		this.tailBase = this.hips.getChild("tailBase");
		this.tailMiddlebase = this.tailBase.getChild("tailMiddlebase");
		this.tailMiddle = this.tailMiddlebase.getChild("tailMiddle");
		this.tailMiddleend = this.tailMiddle.getChild("tailMiddleend");
		this.tailEnd = this.tailMiddleend.getChild("tailEnd");
		this.tailEnd2 = this.tailEnd.getChild("tailEnd2");
		this.tailEnd3 = this.tailEnd2.getChild("tailEnd3");
		this.tailEnd4 = this.tailEnd3.getChild("tailEnd4");
		this.tailEnd5 = this.tailEnd4.getChild("tailEnd5");
		this.tailEnd6 = this.tailEnd5.getChild("tailEnd6");
		this.rightThigh = this.hips.getChild("rightThigh");
		this.rightShin = this.rightThigh.getChild("rightShin");
		this.rightAnkle = this.rightShin.getChild("rightAnkle");
		this.rightFoot = this.rightAnkle.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.leftThigh = this.hips.getChild("leftThigh");
		this.leftShin = this.leftThigh.getChild("leftShin");
		this.leftAnkle = this.leftShin.getChild("leftAnkle");
		this.leftFoot = this.leftAnkle.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.2056F, -2.4941F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F))
				.texOffs(17, 10).addBox(0.5F, 0.2944F, -2.4941F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(17, 10).mirror().addBox(-1.5F, 0.2944F, -2.4941F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.0405F, 0.6247F, -0.1236F, 0.0F, 0.0F));

		PartDefinition hips_r1 = hips.addOrReplaceChild("hips_r1", CubeListBuilder.create().texOffs(14, 81).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2056F, 3.5059F, -0.3491F, 0.0F, 0.0F));

		PartDefinition hips_r2 = hips.addOrReplaceChild("hips_r2", CubeListBuilder.create().texOffs(11, 81).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2056F, 1.5059F, -0.1309F, 0.0F, 0.0F));

		PartDefinition hips_r3 = hips.addOrReplaceChild("hips_r3", CubeListBuilder.create().texOffs(8, 81).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2056F, -0.4941F, -0.0873F, 0.0F, 0.0F));

		PartDefinition hips_r4 = hips.addOrReplaceChild("hips_r4", CubeListBuilder.create().texOffs(0, 81).addBox(0.0F, -1.225F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2056F, -2.4941F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bodyMiddle = hips.addOrReplaceChild("bodyMiddle", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, -0.3735F, -3.869F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(83, 9).addBox(0.0F, -1.3735F, -3.869F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1366F, -2.5961F, 0.0653F, -0.0871F, -0.0057F));

		PartDefinition bodyMiddle_r1 = bodyMiddle.addOrReplaceChild("bodyMiddle_r1", CubeListBuilder.create().texOffs(83, 12).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3735F, -1.869F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bodyMiddle.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(81, 58).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1885F, -1.5041F, 0.3598F, 0.209F, -0.8295F));

		PartDefinition cube_r2 = bodyMiddle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(81, 56).mirror().addBox(-1.7767F, -0.525F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1885F, -1.5041F, 0.1601F, 0.3609F, -1.3757F));

		PartDefinition cube_r3 = bodyMiddle.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(45, 81).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2885F, -3.5041F, 0.4669F, 0.2766F, -0.6834F));

		PartDefinition cube_r4 = bodyMiddle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(63, 64).mirror().addBox(-2.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2885F, -3.5041F, 0.2188F, 0.4726F, -1.2315F));

		PartDefinition cube_r5 = bodyMiddle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(81, 56).addBox(0.7767F, -0.525F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1885F, -1.5041F, 0.1601F, -0.3609F, 1.3757F));

		PartDefinition cube_r6 = bodyMiddle.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(81, 58).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1885F, -1.5041F, 0.3598F, -0.209F, 0.8295F));

		PartDefinition cube_r7 = bodyMiddle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(63, 64).addBox(0.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2885F, -3.5041F, 0.2188F, -0.4726F, 1.2315F));

		PartDefinition cube_r8 = bodyMiddle.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(45, 81).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2885F, -3.5041F, 0.4669F, -0.2766F, 0.6834F));

		PartDefinition body = bodyMiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(11, 40).addBox(-1.762F, -0.3402F, -3.9893F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(83, 3).addBox(-1.262F, -1.2652F, -3.9893F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 6).addBox(-1.262F, -1.3402F, -1.9893F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2446F, -0.0507F, -3.6812F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(40, 81).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.762F, 0.1218F, -1.5994F, 0.4366F, 0.2276F, -0.624F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(64, 33).mirror().addBox(-2.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.762F, 0.1218F, -1.5994F, 0.219F, 0.4155F, -1.1644F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(81, 37).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2584F, 2.2618F, -0.5166F, 0.0458F, 0.4647F, -1.5665F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(81, 35).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.762F, 0.1718F, -3.6244F, 0.478F, 0.2286F, -0.5295F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(53, 47).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.762F, 0.1718F, -3.6244F, 0.2565F, 0.437F, -1.0638F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(27, 46).mirror().addBox(-3.9922F, -2.343F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.762F, 0.1718F, -3.6244F, -0.0143F, 0.5024F, -1.6483F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(81, 37).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7343F, 2.2618F, -0.5166F, 0.0458F, -0.4647F, 1.5665F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(64, 33).addBox(0.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.762F, 0.1218F, -1.5994F, 0.219F, -0.4155F, 1.1644F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(40, 81).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.762F, 0.1218F, -1.5994F, 0.4366F, -0.2276F, 0.624F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(81, 35).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.762F, 0.1718F, -3.6244F, 0.478F, -0.2286F, 0.5295F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(53, 47).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.762F, 0.1718F, -3.6244F, 0.2565F, -0.437F, 1.0638F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(27, 46).addBox(2.9922F, -2.343F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.762F, 0.1718F, -3.6244F, -0.0143F, -0.5024F, 1.6483F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(22, 40).addBox(-1.0F, -0.446F, -3.9973F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(82, 76).addBox(-0.5F, -1.046F, -3.9973F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 0).addBox(-0.5F, -1.246F, -1.9973F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7924F, 0.0998F, -3.8198F, 0.0354F, -0.1744F, -0.0062F));

		PartDefinition cube_r21 = body2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(81, 19).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1159F, -3.6324F, 0.467F, 0.2117F, -0.4452F));

		PartDefinition cube_r22 = body2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(53, 45).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1159F, -3.6324F, 0.2558F, 0.417F, -0.9774F));

		PartDefinition cube_r23 = body2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(54, 2).mirror().addBox(-5.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1159F, -3.6324F, -0.0025F, 0.4852F, -1.556F));

		PartDefinition cube_r24 = body2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(79, 54).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0409F, -1.6324F, 0.4337F, 0.1987F, -0.4868F));

		PartDefinition cube_r25 = body2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(53, 43).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0409F, -1.6324F, 0.2325F, 0.3893F, -1.0213F));

		PartDefinition cube_r26 = body2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(64, 31).mirror().addBox(-4.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0409F, -1.6324F, -0.0058F, 0.4503F, -1.5923F));

		PartDefinition cube_r27 = body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(54, 2).addBox(2.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1159F, -3.6324F, -0.0025F, -0.4852F, 1.556F));

		PartDefinition cube_r28 = body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(53, 45).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1159F, -3.6324F, 0.2558F, -0.417F, 0.9774F));

		PartDefinition cube_r29 = body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(81, 19).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1159F, -3.6324F, 0.467F, -0.2117F, 0.4452F));

		PartDefinition cube_r30 = body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(64, 31).addBox(2.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0409F, -1.6324F, -0.0058F, -0.4503F, 1.5923F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(53, 43).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0409F, -1.6324F, 0.2325F, -0.3893F, 1.0213F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(79, 54).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0409F, -1.6324F, 0.4337F, -0.1987F, 0.4868F));

		PartDefinition bodyFront = body2.addOrReplaceChild("bodyFront", CubeListBuilder.create().texOffs(13, 26).addBox(-0.5F, -0.2957F, -4.9493F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(82, 70).addBox(0.0F, -0.8957F, -3.9493F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 73).addBox(0.0F, -0.8957F, -1.9493F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1184F, -3.9124F, 0.0887F, -0.0435F, -0.0039F));

		PartDefinition cube_r33 = bodyFront.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(78, 68).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2343F, -1.545F, 0.4575F, 0.2106F, -0.5169F));

		PartDefinition cube_r34 = bodyFront.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(23, 53).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2343F, -1.545F, 0.2476F, 0.4114F, -1.0504F));

		PartDefinition cube_r35 = bodyFront.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(62, 46).mirror().addBox(-4.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2343F, -1.545F, -0.0061F, 0.4764F, -1.6274F));

		PartDefinition cube_r36 = bodyFront.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(28, 8).mirror().addBox(-3.9922F, -2.343F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3593F, -3.62F, -0.0205F, 0.684F, -1.8115F));

		PartDefinition cube_r37 = bodyFront.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(19, 8).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3593F, -3.62F, 0.3719F, 0.5886F, -1.1667F));

		PartDefinition cube_r38 = bodyFront.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(68, 12).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3593F, -3.62F, 0.6472F, 0.3088F, -0.6441F));

		PartDefinition cube_r39 = bodyFront.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(62, 46).addBox(2.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2343F, -1.545F, -0.0061F, -0.4764F, 1.6274F));

		PartDefinition cube_r40 = bodyFront.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(23, 53).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2343F, -1.545F, 0.2476F, -0.4114F, 1.0504F));

		PartDefinition cube_r41 = bodyFront.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(78, 68).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2343F, -1.545F, 0.4575F, -0.2106F, 0.5169F));

		PartDefinition cube_r42 = bodyFront.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(68, 12).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3593F, -3.62F, 0.6472F, -0.3088F, 0.6441F));

		PartDefinition cube_r43 = bodyFront.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(19, 8).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3593F, -3.62F, 0.3719F, -0.5886F, 1.1667F));

		PartDefinition cube_r44 = bodyFront.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(28, 8).addBox(2.9922F, -2.343F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3593F, -3.62F, -0.0205F, -0.684F, 1.8115F));

		PartDefinition neckBase = bodyFront.addOrReplaceChild("neckBase", CubeListBuilder.create().texOffs(36, 49).addBox(-0.5F, -0.4389F, -2.9988F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F))
				.texOffs(82, 46).addBox(0.0F, -1.0389F, -2.9988F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(82, 49).addBox(0.0F, -1.0389F, -0.9988F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.1771F, -4.7726F, -0.0477F, -0.2615F, 0.0123F));

		PartDefinition cube_r45 = neckBase.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(34, 65).mirror().addBox(-2.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1822F, -2.6473F, 0.027F, 0.9551F, -1.5717F));

		PartDefinition cube_r46 = neckBase.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(62, 81).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1822F, -2.6473F, 0.6732F, 0.7469F, -0.7899F));

		PartDefinition cube_r47 = neckBase.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(81, 60).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1822F, -0.6473F, 0.4622F, 0.4391F, -0.7175F));

		PartDefinition cube_r48 = neckBase.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1822F, -0.6473F, 0.1115F, 0.6068F, -1.3193F));

		PartDefinition cube_r49 = neckBase.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(62, 81).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1822F, -2.6473F, 0.6732F, -0.7469F, 0.7899F));

		PartDefinition cube_r50 = neckBase.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(34, 65).addBox(0.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1822F, -2.6473F, 0.027F, -0.9551F, 1.5717F));

		PartDefinition cube_r51 = neckBase.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(54, 0).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1822F, -0.6473F, 0.1115F, -0.6068F, 1.3193F));

		PartDefinition cube_r52 = neckBase.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(81, 60).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1822F, -0.6473F, 0.4622F, -0.4391F, 0.7175F));

		PartDefinition neckMiddlebase = neckBase.addOrReplaceChild("neckMiddlebase", CubeListBuilder.create().texOffs(27, 48).addBox(-0.5F, -0.2F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(36, 82).addBox(0.0F, -0.7F, -2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2089F, -2.7621F, -0.6235F, -0.3896F, 0.1574F));

		PartDefinition cube_r53 = neckMiddlebase.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-1.9348F, 0.0314F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4911F, -1.6853F, 0.1245F, 1.0562F, -1.2981F));

		PartDefinition cube_r54 = neckMiddlebase.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 66).addBox(-0.0652F, 0.0314F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4911F, -1.6853F, 0.1245F, -1.0562F, 1.2981F));

		PartDefinition neckMiddlefront = neckMiddlebase.addOrReplaceChild("neckMiddlefront", CubeListBuilder.create().texOffs(47, 5).addBox(-0.5F, -0.2271F, -3.0081F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F))
				.texOffs(81, 81).addBox(0.0F, -0.7271F, -3.0081F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(33, 82).addBox(0.0F, -0.7271F, -1.0081F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0111F, -2.8602F, -0.5288F, 0.0F, 0.0F));

		PartDefinition cube_r55 = neckMiddlefront.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(66, 6).mirror().addBox(-1.9348F, 0.0064F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.48F, -2.825F, 0.3748F, 1.0007F, -1.1937F));

		PartDefinition cube_r56 = neckMiddlefront.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(66, 4).mirror().addBox(-1.9348F, 0.0314F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.48F, -0.825F, 0.4134F, 1.1517F, -1.0497F));

		PartDefinition cube_r57 = neckMiddlefront.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(66, 6).addBox(-0.0652F, 0.0064F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.48F, -2.825F, 0.3748F, -1.0007F, 1.1937F));

		PartDefinition cube_r58 = neckMiddlefront.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(66, 4).addBox(-0.0652F, 0.0314F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.48F, -0.825F, 0.4134F, -1.1517F, 1.0497F));

		PartDefinition neckFront = neckMiddlefront.addOrReplaceChild("neckFront", CubeListBuilder.create().texOffs(18, 46).addBox(-0.49F, -0.3932F, -2.8992F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(78, 81).addBox(0.01F, -0.8932F, -1.8992F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 0.1729F, -3.0081F, -0.0962F, -0.1674F, -0.4374F));

		PartDefinition cube_r59 = neckFront.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(13, 66).mirror().addBox(-1.9348F, 0.0314F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.4071F, -1.7169F, 0.4535F, 1.1772F, -1.1267F));

		PartDefinition cube_r60 = neckFront.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(13, 66).addBox(-0.0652F, 0.0314F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.4071F, -1.7169F, 0.4535F, -1.1772F, 1.1267F));

		PartDefinition neckFront2 = neckFront.addOrReplaceChild("neckFront2", CubeListBuilder.create().texOffs(0, 46).addBox(-0.49F, -0.3931F, -2.8992F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(72, 81).addBox(0.01F, -0.9931F, -2.8992F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 81).addBox(0.01F, -0.9931F, -0.8992F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0107F, -2.856F, 0.6727F, -0.2851F, -0.7118F));

		PartDefinition cube_r61 = neckFront2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(66, 14).mirror().addBox(-1.9348F, 0.0064F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.4106F, -0.7822F, 0.5024F, 1.399F, -1.0569F));

		PartDefinition cube_r62 = neckFront2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(67, 81).mirror().addBox(-0.9348F, 0.0814F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.4106F, -2.4822F, 0.77F, 1.1848F, -0.8868F));

		PartDefinition cube_r63 = neckFront2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(66, 14).addBox(-0.0652F, 0.0064F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.4106F, -0.7822F, 0.5024F, -1.399F, 1.0569F));

		PartDefinition cube_r64 = neckFront2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(67, 81).addBox(-0.0652F, 0.0814F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.4106F, -2.4822F, 0.77F, -1.1848F, 0.8868F));

		PartDefinition head = neckFront2.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 55).addBox(-0.99F, -0.8671F, -1.0823F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.213F, -2.5777F, 0.0398F, -0.0975F, -0.1815F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(7, 57).addBox(-1.5F, 0.0F, -1.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.5888F, -2.739F, 0.2618F, 0.0F, 0.0F));

		PartDefinition head_r2 = head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(16, 56).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.51F, -0.7223F, -2.0519F, 0.192F, 0.0F, 0.0F));

		PartDefinition head_r3 = head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(56, 10).addBox(-1.0F, -2.0F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 1.1329F, -0.8823F, 0.1396F, 0.0F, 0.0F));

		PartDefinition headSlope = head.addOrReplaceChild("headSlope", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -1.1921F, -2.9723F, 0.0848F, 0.0F, 0.0F));

		PartDefinition headSlope_r1 = headSlope.addOrReplaceChild("headSlope_r1", CubeListBuilder.create().texOffs(59, 61).addBox(-1.0F, 0.0F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.02F, 0.2588F, 2.2659F, -0.4363F, 0.0F, 0.0F));

		PartDefinition headSlope_r2 = headSlope.addOrReplaceChild("headSlope_r2", CubeListBuilder.create().texOffs(10, 72).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.02F, 0.0F, 1.3F, -0.0524F, 0.0F, 0.0F));

		PartDefinition headSlope_r3 = headSlope.addOrReplaceChild("headSlope_r3", CubeListBuilder.create().texOffs(59, 40).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.02F, 0.0F, 1.3F, -0.2662F, 0.0F, 0.0F));

		PartDefinition headSlope_r4 = headSlope.addOrReplaceChild("headSlope_r4", CubeListBuilder.create().texOffs(62, 43).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.02F, 0.0F, 1.3F, 0.0698F, 0.0F, 0.0F));

		PartDefinition upperJawback = head.addOrReplaceChild("upperJawback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7621F, -2.9323F, 0.2759F, 0.0F, 0.0F));

		PartDefinition upperJawslopefront = upperJawback.addOrReplaceChild("upperJawslopefront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, -0.41F, -0.02F, 0.1061F, 0.0F, 0.0F));

		PartDefinition upperJawslopeback = upperJawslopefront.addOrReplaceChild("upperJawslopeback", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.02F, 0.0F, 0.0F, -0.3609F, 0.0F, 0.0F));

		PartDefinition upperJawslopeback_r1 = upperJawslopeback.addOrReplaceChild("upperJawslopeback_r1", CubeListBuilder.create().texOffs(78, 0).addBox(-1.0F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 2.725F, -2.7842F, 0.2313F, 0.0F, 0.0F));

		PartDefinition upperJawslopeback_r2 = upperJawslopeback.addOrReplaceChild("upperJawslopeback_r2", CubeListBuilder.create().texOffs(0, 78).addBox(-0.98F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.5F, 2.725F, -2.7842F, 1.0996F, 0.0F, 0.0F));

		PartDefinition upperJawslopeback_r3 = upperJawslopeback.addOrReplaceChild("upperJawslopeback_r3", CubeListBuilder.create().texOffs(77, 70).addBox(-0.98F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 2.0177F, -2.4204F, 0.7287F, 0.0F, 0.0F));

		PartDefinition upperJawslopeback_r4 = upperJawslopeback.addOrReplaceChild("upperJawslopeback_r4", CubeListBuilder.create().texOffs(79, 24).addBox(-0.4613F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0187F, 3.1988F, -2.3462F, 0.2431F, 0.0F, 0.0F));

		PartDefinition upperJawslopeback_r5 = upperJawslopeback.addOrReplaceChild("upperJawslopeback_r5", CubeListBuilder.create().texOffs(30, 77).addBox(-0.48F, -0.0985F, -0.8803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, 0.9765F, -1.2636F, 0.7199F, 0.0F, 0.0F));

		PartDefinition upperJawslopeback_r6 = upperJawslopeback.addOrReplaceChild("upperJawslopeback_r6", CubeListBuilder.create().texOffs(22, 68).addBox(-0.98F, -0.0199F, 0.0817F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0455F, -1.3098F, 0.637F, 0.0F, 0.0F));

		PartDefinition upperJawslopeback_r7 = upperJawslopeback.addOrReplaceChild("upperJawslopeback_r7", CubeListBuilder.create().texOffs(17, 68).addBox(-0.98F, -0.0235F, -0.9827F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 0.0491F, 0.4131F, 0.4102F, 0.0F, 0.0F));

		PartDefinition lowerJawbase = head.addOrReplaceChild("lowerJawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1286F, -0.3168F, 0.7418F, 0.0F, 0.0F));

		PartDefinition lowerJawbase_r1 = lowerJawbase.addOrReplaceChild("lowerJawbase_r1", CubeListBuilder.create().texOffs(73, 64).mirror().addBox(-0.625F, -0.4916F, -1.3859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(59, 73).mirror().addBox(-0.625F, -0.4916F, -1.7859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(15, 72).mirror().addBox(-0.5F, -0.6916F, -1.1859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(73, 64).addBox(1.005F, -0.4916F, -1.3859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(59, 73).addBox(1.005F, -0.4916F, -1.7859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(15, 72).addBox(0.88F, -0.6916F, -1.1859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.68F, 0.4F, -0.1F, 0.0873F, 0.0F, 0.0F));

		PartDefinition lowerJawbase_r2 = lowerJawbase.addOrReplaceChild("lowerJawbase_r2", CubeListBuilder.create().texOffs(54, 73).mirror().addBox(-0.1712F, -0.5145F, -0.9005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.43F, 0.575F, -4.175F, -0.0218F, -0.1222F, 0.0F));

		PartDefinition lowerJawbase_r3 = lowerJawbase.addOrReplaceChild("lowerJawbase_r3", CubeListBuilder.create().texOffs(37, 73).mirror().addBox(-0.2F, -0.4688F, -0.819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.98F, 0.4F, -2.7F, 0.1091F, -0.384F, 0.0F));

		PartDefinition lowerJawbase_r4 = lowerJawbase.addOrReplaceChild("lowerJawbase_r4", CubeListBuilder.create().texOffs(73, 12).mirror().addBox(-0.2F, -0.4299F, -1.7163F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(57, 32).mirror().addBox(-0.2F, -0.2299F, -1.7163F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.98F, 0.4F, -2.7F, 0.0654F, -0.384F, 0.0F));

		PartDefinition lowerJawbase_r5 = lowerJawbase.addOrReplaceChild("lowerJawbase_r5", CubeListBuilder.create().texOffs(73, 9).mirror().addBox(-0.1712F, -0.2868F, -1.0907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(73, 0).mirror().addBox(-0.1712F, -0.2868F, -0.6907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.43F, 0.575F, -4.175F, 0.1876F, -0.1222F, 0.0F));

		PartDefinition lowerJawbase_r6 = lowerJawbase.addOrReplaceChild("lowerJawbase_r6", CubeListBuilder.create().texOffs(73, 6).mirror().addBox(-0.1712F, -0.2978F, -1.1003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(73, 3).mirror().addBox(-0.1712F, -0.2978F, -0.7004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.43F, 0.575F, -4.175F, 0.0829F, -0.1222F, 0.0F));

		PartDefinition lowerJawbase_r7 = lowerJawbase.addOrReplaceChild("lowerJawbase_r7", CubeListBuilder.create().texOffs(72, 72).mirror().addBox(-0.2F, -0.3191F, -0.7032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.98F, 0.4F, -2.7F, 0.24F, -0.384F, 0.0F));

		PartDefinition lowerJawbase_r8 = lowerJawbase.addOrReplaceChild("lowerJawbase_r8", CubeListBuilder.create().texOffs(67, 72).mirror().addBox(-0.5F, -0.4562F, -0.0055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false)
				.texOffs(49, 72).mirror().addBox(-0.5F, -0.4562F, -0.3555F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(67, 72).addBox(1.08F, -0.4562F, -0.0055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F))
				.texOffs(49, 72).addBox(1.08F, -0.4562F, -0.3555F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.78F, 0.4F, -0.1F, 0.48F, 0.0F, 0.0F));

		PartDefinition lowerJawbase_r9 = lowerJawbase.addOrReplaceChild("lowerJawbase_r9", CubeListBuilder.create().texOffs(44, 72).mirror().addBox(-0.5F, -0.675F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(32, 71).mirror().addBox(-0.4F, -0.575F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(44, 72).addBox(1.08F, -0.675F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(32, 71).addBox(0.98F, -0.575F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.78F, 0.4F, -0.1F, -0.1745F, 0.0F, 0.0F));

		PartDefinition lowerJawbase_r10 = lowerJawbase.addOrReplaceChild("lowerJawbase_r10", CubeListBuilder.create().texOffs(57, 28).mirror().addBox(-0.5F, -0.1827F, -2.8663F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(57, 28).addBox(0.88F, -0.1827F, -2.8663F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.68F, 0.4F, -0.1F, -0.0218F, 0.0F, 0.0F));

		PartDefinition lowerJawbase_r11 = lowerJawbase.addOrReplaceChild("lowerJawbase_r11", CubeListBuilder.create().texOffs(57, 24).mirror().addBox(-0.5F, -0.7757F, -2.7393F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(57, 24).addBox(0.88F, -0.7757F, -2.7393F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.68F, 0.4F, -0.1F, 0.1745F, 0.0F, 0.0F));

		PartDefinition lowerJawbase_r12 = lowerJawbase.addOrReplaceChild("lowerJawbase_r12", CubeListBuilder.create().texOffs(25, 72).mirror().addBox(-0.5F, -0.4295F, -1.372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(25, 72).addBox(0.88F, -0.4295F, -1.372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-0.68F, 0.4F, -0.1F, 0.1833F, 0.0F, 0.0F));

		PartDefinition lowerJawbase_r13 = lowerJawbase.addOrReplaceChild("lowerJawbase_r13", CubeListBuilder.create().texOffs(20, 72).mirror().addBox(-0.5F, -0.5565F, -0.8366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(20, 72).addBox(0.88F, -0.5565F, -0.8366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.68F, 0.4F, -0.1F, 0.3927F, 0.0F, 0.0F));

		PartDefinition lowerJawbase_r14 = lowerJawbase.addOrReplaceChild("lowerJawbase_r14", CubeListBuilder.create().texOffs(72, 72).addBox(-0.8F, -0.3191F, -0.7032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 0.4F, -2.7F, 0.24F, 0.384F, 0.0F));

		PartDefinition lowerJawbase_r15 = lowerJawbase.addOrReplaceChild("lowerJawbase_r15", CubeListBuilder.create().texOffs(73, 6).addBox(-0.8288F, -0.2978F, -1.1003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(73, 3).addBox(-0.8288F, -0.2978F, -0.7004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.45F, 0.575F, -4.175F, 0.0829F, 0.1222F, 0.0F));

		PartDefinition lowerJawbase_r16 = lowerJawbase.addOrReplaceChild("lowerJawbase_r16", CubeListBuilder.create().texOffs(73, 9).addBox(-0.8288F, -0.2868F, -1.0907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(73, 0).addBox(-0.8288F, -0.2868F, -0.6907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.45F, 0.575F, -4.175F, 0.1876F, 0.1222F, 0.0F));

		PartDefinition lowerJawbase_r17 = lowerJawbase.addOrReplaceChild("lowerJawbase_r17", CubeListBuilder.create().texOffs(37, 73).addBox(-0.8F, -0.4688F, -0.819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.0F, 0.4F, -2.7F, 0.1091F, 0.384F, 0.0F));

		PartDefinition lowerJawbase_r18 = lowerJawbase.addOrReplaceChild("lowerJawbase_r18", CubeListBuilder.create().texOffs(54, 73).addBox(-0.8288F, -0.5145F, -0.9005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.45F, 0.575F, -4.175F, -0.0218F, 0.1222F, 0.0F));

		PartDefinition lowerJawbase_r19 = lowerJawbase.addOrReplaceChild("lowerJawbase_r19", CubeListBuilder.create().texOffs(73, 12).addBox(-0.8F, -0.4299F, -1.7163F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(57, 32).addBox(-0.8F, -0.2299F, -1.7163F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.0F, 0.4F, -2.7F, 0.0654F, 0.384F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.285F, 2.1329F, -0.5823F));

		PartDefinition upperJawslopeback_r8 = leftFace.addOrReplaceChild("upperJawslopeback_r8", CubeListBuilder.create().texOffs(79, 21).addBox(-0.45F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.18F, -0.4473F, -2.9285F, 0.4394F, 0.3761F, 0.1419F));

		PartDefinition upperJawslopeback_r9 = leftFace.addOrReplaceChild("upperJawslopeback_r9", CubeListBuilder.create().texOffs(79, 40).addBox(-0.475F, -0.4625F, -0.3511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.2826F, -0.0895F, -4.5667F, 0.1559F, 0.2136F, 0.0836F));

		PartDefinition upperJawslopeback_r10 = leftFace.addOrReplaceChild("upperJawslopeback_r10", CubeListBuilder.create().texOffs(77, 78).addBox(-0.5F, -0.125F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0096F, -0.6355F, -3.6347F, 0.2905F, 0.2571F, 0.0845F));

		PartDefinition upperJawslopeback_r11 = leftFace.addOrReplaceChild("upperJawslopeback_r11", CubeListBuilder.create().texOffs(71, 58).addBox(-0.296F, -0.1805F, -0.682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.205F, -3.2559F, -1.9569F, 0.4083F, 0.3103F, 0.1395F));

		PartDefinition upperJawslopeback_r12 = leftFace.addOrReplaceChild("upperJawslopeback_r12", CubeListBuilder.create().texOffs(71, 29).addBox(-0.3887F, -0.1917F, -1.1827F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.205F, -3.2559F, -1.9569F, 0.4342F, 0.1526F, 0.0627F));

		PartDefinition upperJawslopeback_r13 = leftFace.addOrReplaceChild("upperJawslopeback_r13", CubeListBuilder.create().texOffs(71, 19).addBox(-0.0271F, -0.2304F, 0.0254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.205F, -2.2595F, -3.6798F, 0.664F, -0.4732F, -0.4578F));

		PartDefinition upperJawslopeback_r14 = leftFace.addOrReplaceChild("upperJawslopeback_r14", CubeListBuilder.create().texOffs(20, 78).addBox(-0.1422F, -0.2437F, -1.0996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.295F, -2.3285F, -3.6336F, 0.8595F, 0.201F, 0.176F));

		PartDefinition upperJawslopeback_r15 = leftFace.addOrReplaceChild("upperJawslopeback_r15", CubeListBuilder.create().texOffs(15, 78).addBox(-0.1203F, -0.1625F, -0.4893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.295F, -2.3285F, -3.6336F, 0.6875F, 0.3046F, 0.1932F));

		PartDefinition upperJawslopeback_r16 = leftFace.addOrReplaceChild("upperJawslopeback_r16", CubeListBuilder.create().texOffs(25, 78).addBox(-0.6306F, -0.1937F, -0.0164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.205F, -2.2595F, -3.6798F, 0.728F, 0.4021F, 0.287F));

		PartDefinition upperJawslopeback_r17 = leftFace.addOrReplaceChild("upperJawslopeback_r17", CubeListBuilder.create().texOffs(71, 38).addBox(-0.525F, -0.55F, -0.6875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(71, 61).addBox(-0.525F, -0.55F, -0.3875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.21F, -1.8728F, -3.0764F, 0.7179F, 0.3697F, 0.1944F));

		PartDefinition upperJawslopeback_r18 = leftFace.addOrReplaceChild("upperJawslopeback_r18", CubeListBuilder.create().texOffs(78, 12).addBox(-0.9549F, -0.8391F, -0.8732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.742F, -1.3381F, -2.8741F, 0.2849F, 0.4791F, 0.0713F));

		PartDefinition upperJawslopeback_r19 = leftFace.addOrReplaceChild("upperJawslopeback_r19", CubeListBuilder.create().texOffs(35, 79).addBox(-0.5F, -0.3037F, -0.5455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2335F, -0.6194F, -4.2567F, 0.2401F, 0.2239F, 0.0201F));

		PartDefinition upperJawslopeback_r20 = leftFace.addOrReplaceChild("upperJawslopeback_r20", CubeListBuilder.create().texOffs(10, 78).addBox(-0.5F, -0.6347F, -0.3501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2335F, -0.6194F, -4.2567F, 0.8536F, 0.2663F, 0.0308F));

		PartDefinition upperJawslopeback_r21 = leftFace.addOrReplaceChild("upperJawslopeback_r21", CubeListBuilder.create().texOffs(78, 9).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1222F, -1.2763F, -3.7713F, 0.7078F, 0.3354F, 0.0221F));

		PartDefinition upperJawslopeback_r22 = leftFace.addOrReplaceChild("upperJawslopeback_r22", CubeListBuilder.create().texOffs(78, 3).addBox(-0.955F, -0.0327F, -0.8732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.742F, -1.3381F, -2.8741F, 0.3082F, 0.3744F, 0.1363F));

		PartDefinition upperJawslopeback_r23 = leftFace.addOrReplaceChild("upperJawslopeback_r23", CubeListBuilder.create().texOffs(78, 6).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1154F, -0.6355F, -3.6347F, 0.2905F, 0.2571F, 0.0845F));

		PartDefinition head_r4 = leftFace.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(15, 75).addBox(-0.5F, -0.475F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.05F, -0.5552F, -4.7156F, -0.2618F, 0.0F, 0.0F));

		PartDefinition head_r5 = leftFace.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(20, 75).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.05F, -0.7801F, -4.9218F, -0.4974F, 0.0F, 0.0F));

		PartDefinition upperJawslopeback_r24 = leftFace.addOrReplaceChild("upperJawslopeback_r24", CubeListBuilder.create().texOffs(78, 62).addBox(-0.55F, -0.2382F, -0.8467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(62, 78).addBox(-0.55F, -0.2382F, -0.7467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.2137F, -1.4367F, -3.446F, 1.8377F, 0.3407F, 0.0759F));

		PartDefinition upperJawslopeback_r25 = leftFace.addOrReplaceChild("upperJawslopeback_r25", CubeListBuilder.create().texOffs(67, 78).addBox(-0.45F, -0.9205F, -0.5668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(0.2137F, -1.4367F, -3.446F, 2.0297F, 0.3407F, 0.0759F));

		PartDefinition upperJawslopeback_r26 = leftFace.addOrReplaceChild("upperJawslopeback_r26", CubeListBuilder.create().texOffs(78, 65).addBox(-0.55F, -0.5199F, -0.7841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.2137F, -1.4367F, -3.446F, 1.3316F, 0.3407F, 0.0759F));

		PartDefinition upperJawslopeback_r27 = leftFace.addOrReplaceChild("upperJawslopeback_r27", CubeListBuilder.create().texOffs(40, 78).addBox(-0.55F, -0.6378F, -0.6552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2137F, -1.4367F, -3.446F, 1.0523F, 0.3407F, 0.0759F));

		PartDefinition upperJawslopeback_r28 = leftFace.addOrReplaceChild("upperJawslopeback_r28", CubeListBuilder.create().texOffs(45, 78).addBox(-0.55F, -0.2538F, -0.3421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.2137F, -1.4367F, -3.446F, 2.1868F, 0.3407F, 0.0759F));

		PartDefinition head_r6 = leftFace.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(74, 53).addBox(0.0F, -0.8967F, -0.1122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.125F, -1.7155F, -1.0292F, 1.693F, 0.0F, 0.0F));

		PartDefinition head_r7 = leftFace.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(74, 41).addBox(0.0F, -0.2467F, 0.0628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(-0.125F, -1.1237F, -1.3447F, 2.3998F, 0.0F, 0.0F));

		PartDefinition head_r8 = leftFace.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(30, 74).addBox(0.0F, -0.0967F, -0.0873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.125F, -1.1388F, -1.5578F, -3.1154F, 0.0F, 0.0F));

		PartDefinition head_r9 = leftFace.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(74, 25).addBox(0.0F, -0.8967F, -0.8623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.125F, -1.1278F, -2.3802F, -0.8552F, 0.0F, 0.0F));

		PartDefinition head_r10 = leftFace.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(5, 74).addBox(0.0F, -0.0967F, -0.1123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.125F, -2.4151F, -2.9234F, 0.0785F, 0.0F, 0.0F));

		PartDefinition head_r11 = leftFace.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(74, 47).addBox(0.0F, -0.0967F, -0.1122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.125F, -2.9632F, -2.3211F, -0.0742F, 0.0F, 0.0F));

		PartDefinition head_r12 = leftFace.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(74, 22).addBox(0.0F, -0.1191F, -0.8982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.125F, -2.9463F, -2.319F, 0.7069F, 0.0F, 0.0F));

		PartDefinition head_r13 = leftFace.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(0, 75).addBox(0.15F, -0.425F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(74, 50).addBox(-0.075F, -0.425F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.125F, -2.1634F, -1.9263F, 0.3578F, 0.0F, 0.0F));

		PartDefinition head_r14 = leftFace.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(74, 44).addBox(0.0F, -0.1217F, -0.8873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.125F, -2.8763F, -1.5353F, 0.8421F, 0.0F, 0.0F));

		PartDefinition head_r15 = leftFace.addOrReplaceChild("head_r15", CubeListBuilder.create().texOffs(69, 75).addBox(0.0F, -0.1967F, -0.2123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(74, 75).addBox(0.0F, 0.1033F, -0.2123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(76, 15).addBox(0.1F, 0.3283F, -0.3123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.05F, -2.4727F, -0.7883F, 0.1745F, 0.0F, 0.0F));

		PartDefinition head_r16 = leftFace.addOrReplaceChild("head_r16", CubeListBuilder.create().texOffs(10, 75).addBox(0.0F, 0.9033F, -0.8122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.05F, -1.1237F, -1.3947F, 2.3998F, 0.0F, 0.0F));

		PartDefinition head_r17 = leftFace.addOrReplaceChild("head_r17", CubeListBuilder.create().texOffs(42, 75).addBox(0.0F, -0.7967F, -0.2122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(47, 75).addBox(0.0F, -0.7967F, 0.0878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.05F, -1.9717F, 0.1961F, 1.5272F, 0.0F, 0.0F));

		PartDefinition head_r18 = leftFace.addOrReplaceChild("head_r18", CubeListBuilder.create().texOffs(64, 75).addBox(0.0F, -0.1967F, -0.8122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(-0.05F, -2.897F, -0.364F, 0.7854F, 0.0F, 0.0F));

		PartDefinition head_r19 = leftFace.addOrReplaceChild("head_r19", CubeListBuilder.create().texOffs(72, 78).addBox(0.0F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -2.6754F, 0.5339F, 1.1781F, 0.0F, 0.0F));

		PartDefinition head_r20 = leftFace.addOrReplaceChild("head_r20", CubeListBuilder.create().texOffs(0, 72).addBox(0.0F, -1.25F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.265F, 2.1329F, -0.5823F));

		PartDefinition upperJawslopeback_r29 = rightFace.addOrReplaceChild("upperJawslopeback_r29", CubeListBuilder.create().texOffs(79, 21).mirror().addBox(-0.55F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.18F, -0.4473F, -2.9285F, 0.4394F, -0.3761F, -0.1419F));

		PartDefinition upperJawslopeback_r30 = rightFace.addOrReplaceChild("upperJawslopeback_r30", CubeListBuilder.create().texOffs(79, 40).mirror().addBox(-0.525F, -0.4625F, -0.3511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.2826F, -0.0895F, -4.5667F, 0.1559F, -0.2136F, -0.0836F));

		PartDefinition upperJawslopeback_r31 = rightFace.addOrReplaceChild("upperJawslopeback_r31", CubeListBuilder.create().texOffs(77, 78).mirror().addBox(-0.5F, -0.125F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0096F, -0.6355F, -3.6347F, 0.2905F, -0.2571F, -0.0845F));

		PartDefinition upperJawslopeback_r32 = rightFace.addOrReplaceChild("upperJawslopeback_r32", CubeListBuilder.create().texOffs(71, 58).mirror().addBox(-0.7041F, -0.1805F, -0.682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.205F, -3.2559F, -1.9569F, 0.4083F, -0.3103F, -0.1395F));

		PartDefinition upperJawslopeback_r33 = rightFace.addOrReplaceChild("upperJawslopeback_r33", CubeListBuilder.create().texOffs(71, 29).mirror().addBox(-0.6113F, -0.1917F, -1.1827F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.205F, -3.2559F, -1.9569F, 0.4342F, -0.1526F, -0.0627F));

		PartDefinition upperJawslopeback_r34 = rightFace.addOrReplaceChild("upperJawslopeback_r34", CubeListBuilder.create().texOffs(71, 19).mirror().addBox(-0.9729F, -0.2304F, 0.0254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.205F, -2.2595F, -3.6798F, 0.664F, 0.4732F, 0.4578F));

		PartDefinition upperJawslopeback_r35 = rightFace.addOrReplaceChild("upperJawslopeback_r35", CubeListBuilder.create().texOffs(20, 78).mirror().addBox(-0.8578F, -0.2437F, -1.0996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.295F, -2.3285F, -3.6336F, 0.8595F, -0.201F, -0.176F));

		PartDefinition upperJawslopeback_r36 = rightFace.addOrReplaceChild("upperJawslopeback_r36", CubeListBuilder.create().texOffs(15, 78).mirror().addBox(-0.8797F, -0.1625F, -0.4893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.295F, -2.3285F, -3.6336F, 0.6875F, -0.3046F, -0.1932F));

		PartDefinition upperJawslopeback_r37 = rightFace.addOrReplaceChild("upperJawslopeback_r37", CubeListBuilder.create().texOffs(25, 78).mirror().addBox(-0.3694F, -0.1937F, -0.0164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.205F, -2.2595F, -3.6798F, 0.728F, -0.4021F, -0.287F));

		PartDefinition upperJawslopeback_r38 = rightFace.addOrReplaceChild("upperJawslopeback_r38", CubeListBuilder.create().texOffs(71, 38).mirror().addBox(-0.475F, -0.55F, -0.6875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(71, 61).mirror().addBox(-0.475F, -0.55F, -0.3875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.21F, -1.8728F, -3.0764F, 0.7179F, -0.3697F, -0.1944F));

		PartDefinition upperJawslopeback_r39 = rightFace.addOrReplaceChild("upperJawslopeback_r39", CubeListBuilder.create().texOffs(78, 12).mirror().addBox(-0.0451F, -0.8391F, -0.8732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.742F, -1.3381F, -2.8741F, 0.2849F, -0.4791F, -0.0713F));

		PartDefinition upperJawslopeback_r40 = rightFace.addOrReplaceChild("upperJawslopeback_r40", CubeListBuilder.create().texOffs(35, 79).mirror().addBox(-0.5F, -0.3037F, -0.5455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.2335F, -0.6194F, -4.2567F, 0.2401F, -0.2239F, -0.0201F));

		PartDefinition upperJawslopeback_r41 = rightFace.addOrReplaceChild("upperJawslopeback_r41", CubeListBuilder.create().texOffs(10, 78).mirror().addBox(-0.5F, -0.6347F, -0.3501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.2335F, -0.6194F, -4.2567F, 0.8536F, -0.2663F, -0.0308F));

		PartDefinition upperJawslopeback_r42 = rightFace.addOrReplaceChild("upperJawslopeback_r42", CubeListBuilder.create().texOffs(78, 9).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1222F, -1.2763F, -3.7713F, 0.7078F, -0.3354F, -0.0221F));

		PartDefinition upperJawslopeback_r43 = rightFace.addOrReplaceChild("upperJawslopeback_r43", CubeListBuilder.create().texOffs(78, 3).mirror().addBox(-0.045F, -0.0327F, -0.8732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.742F, -1.3381F, -2.8741F, 0.3082F, -0.3744F, -0.1363F));

		PartDefinition upperJawslopeback_r44 = rightFace.addOrReplaceChild("upperJawslopeback_r44", CubeListBuilder.create().texOffs(78, 6).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1154F, -0.6355F, -3.6347F, 0.2905F, -0.2571F, -0.0845F));

		PartDefinition head_r21 = rightFace.addOrReplaceChild("head_r21", CubeListBuilder.create().texOffs(15, 75).mirror().addBox(-0.5F, -0.475F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.05F, -0.5552F, -4.7156F, -0.2618F, 0.0F, 0.0F));

		PartDefinition head_r22 = rightFace.addOrReplaceChild("head_r22", CubeListBuilder.create().texOffs(20, 75).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.05F, -0.7801F, -4.9218F, -0.4974F, 0.0F, 0.0F));

		PartDefinition upperJawslopeback_r45 = rightFace.addOrReplaceChild("upperJawslopeback_r45", CubeListBuilder.create().texOffs(78, 62).mirror().addBox(-0.45F, -0.2382F, -0.8467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(62, 78).mirror().addBox(-0.45F, -0.2382F, -0.7467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.2137F, -1.4367F, -3.446F, 1.8377F, -0.3407F, -0.0759F));

		PartDefinition upperJawslopeback_r46 = rightFace.addOrReplaceChild("upperJawslopeback_r46", CubeListBuilder.create().texOffs(67, 78).mirror().addBox(-0.55F, -0.9205F, -0.5668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(-0.2137F, -1.4367F, -3.446F, 2.0297F, -0.3407F, -0.0759F));

		PartDefinition upperJawslopeback_r47 = rightFace.addOrReplaceChild("upperJawslopeback_r47", CubeListBuilder.create().texOffs(78, 65).mirror().addBox(-0.45F, -0.5199F, -0.7841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.2137F, -1.4367F, -3.446F, 1.3316F, -0.3407F, -0.0759F));

		PartDefinition upperJawslopeback_r48 = rightFace.addOrReplaceChild("upperJawslopeback_r48", CubeListBuilder.create().texOffs(40, 78).mirror().addBox(-0.45F, -0.6378F, -0.6552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2137F, -1.4367F, -3.446F, 1.0523F, -0.3407F, -0.0759F));

		PartDefinition upperJawslopeback_r49 = rightFace.addOrReplaceChild("upperJawslopeback_r49", CubeListBuilder.create().texOffs(45, 78).mirror().addBox(-0.45F, -0.2538F, -0.3421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.2137F, -1.4367F, -3.446F, 2.1868F, -0.3407F, -0.0759F));

		PartDefinition head_r23 = rightFace.addOrReplaceChild("head_r23", CubeListBuilder.create().texOffs(74, 53).mirror().addBox(-1.0F, -0.8967F, -0.1122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.125F, -1.7155F, -1.0292F, 1.693F, 0.0F, 0.0F));

		PartDefinition head_r24 = rightFace.addOrReplaceChild("head_r24", CubeListBuilder.create().texOffs(74, 41).mirror().addBox(-1.0F, -0.2467F, 0.0628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false), PartPose.offsetAndRotation(0.125F, -1.1237F, -1.3447F, 2.3998F, 0.0F, 0.0F));

		PartDefinition head_r25 = rightFace.addOrReplaceChild("head_r25", CubeListBuilder.create().texOffs(30, 74).mirror().addBox(-1.0F, -0.0967F, -0.0873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.125F, -1.1388F, -1.5578F, -3.1154F, 0.0F, 0.0F));

		PartDefinition head_r26 = rightFace.addOrReplaceChild("head_r26", CubeListBuilder.create().texOffs(74, 25).mirror().addBox(-1.0F, -0.8967F, -0.8623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.125F, -1.1278F, -2.3802F, -0.8552F, 0.0F, 0.0F));

		PartDefinition head_r27 = rightFace.addOrReplaceChild("head_r27", CubeListBuilder.create().texOffs(5, 74).mirror().addBox(-1.0F, -0.0967F, -0.1123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.125F, -2.4151F, -2.9234F, 0.0785F, 0.0F, 0.0F));

		PartDefinition head_r28 = rightFace.addOrReplaceChild("head_r28", CubeListBuilder.create().texOffs(74, 47).mirror().addBox(-1.0F, -0.0967F, -0.1122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.125F, -2.9632F, -2.3211F, -0.0742F, 0.0F, 0.0F));

		PartDefinition head_r29 = rightFace.addOrReplaceChild("head_r29", CubeListBuilder.create().texOffs(74, 22).mirror().addBox(-1.0F, -0.1191F, -0.8982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.125F, -2.9463F, -2.319F, 0.7069F, 0.0F, 0.0F));

		PartDefinition head_r30 = rightFace.addOrReplaceChild("head_r30", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-1.15F, -0.425F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(74, 50).mirror().addBox(-0.925F, -0.425F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.125F, -2.1634F, -1.9263F, 0.3578F, 0.0F, 0.0F));

		PartDefinition head_r31 = rightFace.addOrReplaceChild("head_r31", CubeListBuilder.create().texOffs(74, 44).mirror().addBox(-1.0F, -0.1217F, -0.8873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.125F, -2.8763F, -1.5353F, 0.8421F, 0.0F, 0.0F));

		PartDefinition head_r32 = rightFace.addOrReplaceChild("head_r32", CubeListBuilder.create().texOffs(69, 75).mirror().addBox(-1.0F, -0.1967F, -0.2123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(74, 75).mirror().addBox(-1.0F, 0.1033F, -0.2123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(76, 15).mirror().addBox(-1.1F, 0.3283F, -0.3123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.05F, -2.4727F, -0.7883F, 0.1745F, 0.0F, 0.0F));

		PartDefinition head_r33 = rightFace.addOrReplaceChild("head_r33", CubeListBuilder.create().texOffs(10, 75).mirror().addBox(-1.0F, 0.9033F, -0.8122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.05F, -1.1237F, -1.3947F, 2.3998F, 0.0F, 0.0F));

		PartDefinition head_r34 = rightFace.addOrReplaceChild("head_r34", CubeListBuilder.create().texOffs(42, 75).mirror().addBox(-1.0F, -0.7967F, -0.2122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(47, 75).mirror().addBox(-1.0F, -0.7967F, 0.0878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(0.05F, -1.9717F, 0.1961F, 1.5272F, 0.0F, 0.0F));

		PartDefinition head_r35 = rightFace.addOrReplaceChild("head_r35", CubeListBuilder.create().texOffs(64, 75).mirror().addBox(-1.0F, -0.1967F, -0.8122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(0.05F, -2.897F, -0.364F, 0.7854F, 0.0F, 0.0F));

		PartDefinition head_r36 = rightFace.addOrReplaceChild("head_r36", CubeListBuilder.create().texOffs(72, 78).mirror().addBox(-1.0F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.6754F, 0.5339F, 1.1781F, 0.0F, 0.0F));

		PartDefinition head_r37 = rightFace.addOrReplaceChild("head_r37", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-1.0F, -1.25F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition chestSlope = bodyFront.addOrReplaceChild("chestSlope", CubeListBuilder.create().texOffs(45, 0).addBox(-0.51F, 0.2F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 4.7043F, -3.9493F, -0.4033F, 0.0F, 0.0F));

		PartDefinition chestSlope_r1 = chestSlope.addOrReplaceChild("chestSlope_r1", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-0.5F, 0.0F, -0.8F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.22F, 0.7F, 1.9F, 0.3229F, -0.5435F, 0.2586F));

		PartDefinition chestSlope_r2 = chestSlope.addOrReplaceChild("chestSlope_r2", CubeListBuilder.create().texOffs(39, 25).mirror().addBox(-0.5F, 0.0F, -0.6F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.22F, 0.7F, 1.9F, 0.5483F, -0.7214F, 0.1446F));

		PartDefinition chestSlope_r3 = chestSlope.addOrReplaceChild("chestSlope_r3", CubeListBuilder.create().texOffs(43, 14).mirror().addBox(-0.7F, 0.0F, -0.3F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.22F, 0.7F, 1.9F, 1.0069F, -0.9628F, -0.0271F));

		PartDefinition chestSlope_r4 = chestSlope.addOrReplaceChild("chestSlope_r4", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, 0.0F, -0.8F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.7F, 1.9F, 0.3229F, 0.5435F, -0.2586F));

		PartDefinition chestSlope_r5 = chestSlope.addOrReplaceChild("chestSlope_r5", CubeListBuilder.create().texOffs(39, 25).addBox(-0.5F, 0.0F, -0.6F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.7F, 1.9F, 0.5483F, 0.7214F, -0.1446F));

		PartDefinition chestSlope_r6 = chestSlope.addOrReplaceChild("chestSlope_r6", CubeListBuilder.create().texOffs(43, 14).addBox(-0.3F, 0.0F, -0.3F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.7F, 1.9F, 1.0069F, 0.9628F, 0.0271F));

		PartDefinition leftUpperarm = bodyFront.addOrReplaceChild("leftUpperarm", CubeListBuilder.create().texOffs(64, 56).addBox(-0.3291F, -0.47F, 0.09F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.0854F, 4.6679F, -4.017F, 0.1712F, 0.2078F, 0.0195F));

		PartDefinition leftUpperarm_r1 = leftUpperarm.addOrReplaceChild("leftUpperarm_r1", CubeListBuilder.create().texOffs(68, 66).addBox(-0.5F, 0.65F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(66, 20).addBox(-0.5F, -0.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1709F, 1.8961F, 2.6765F, 0.7156F, 0.0F, 0.0F));

		PartDefinition leftUpperarm_r2 = leftUpperarm.addOrReplaceChild("leftUpperarm_r2", CubeListBuilder.create().texOffs(76, 34).addBox(-0.5F, 0.65F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1709F, 2.084F, 0.7132F, 1.1345F, 0.0F, 0.0F));

		PartDefinition leftUpperarm_r3 = leftUpperarm.addOrReplaceChild("leftUpperarm_r3", CubeListBuilder.create().texOffs(76, 31).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1709F, 1.4752F, -0.0802F, 1.1781F, 0.0F, 0.0F));

		PartDefinition leftUpperarm_r4 = leftUpperarm.addOrReplaceChild("leftUpperarm_r4", CubeListBuilder.create().texOffs(76, 28).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1709F, 0.4838F, -0.2107F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftUpperarm_r5 = leftUpperarm.addOrReplaceChild("leftUpperarm_r5", CubeListBuilder.create().texOffs(76, 18).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1709F, -0.47F, 0.09F, -0.3054F, 0.0F, 0.0F));

		PartDefinition leftUpperarm_r6 = leftUpperarm.addOrReplaceChild("leftUpperarm_r6", CubeListBuilder.create().texOffs(66, 35).addBox(-0.5F, -0.6F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.1709F, 0.6301F, 1.09F, 0.7418F, 0.0F, 0.0F));

		PartDefinition leftLowerarm = leftUpperarm.addOrReplaceChild("leftLowerarm", CubeListBuilder.create().texOffs(59, 49).addBox(-0.0029F, -0.6639F, -0.2419F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(14, 60).addBox(-0.0029F, 0.3361F, -0.9419F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.2093F, 3.5266F, 3.2686F, -0.4244F, -0.2664F, -0.078F));

		PartDefinition leftHand = leftLowerarm.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(45, 49).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9168F, 2.9829F, -0.0402F, 0.2759F, 0.0F, 0.3396F));

		PartDefinition leftHand2 = leftLowerarm.addOrReplaceChild("leftHand2", CubeListBuilder.create().texOffs(52, 38).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8573F, 2.9575F, -0.3715F, -0.2423F, -0.0413F, 0.0811F));

		PartDefinition rightUpperarm = bodyFront.addOrReplaceChild("rightUpperarm", CubeListBuilder.create().texOffs(66, 39).addBox(-0.6709F, -0.47F, 0.09F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.0854F, 4.6679F, -4.017F, -0.396F, -0.2078F, -0.0195F));

		PartDefinition rightUpperarm_r1 = rightUpperarm.addOrReplaceChild("rightUpperarm_r1", CubeListBuilder.create().texOffs(69, 26).addBox(-0.5F, 0.65F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(69, 23).addBox(-0.5F, -0.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1709F, 1.8961F, 2.6765F, 0.7156F, 0.0F, 0.0F));

		PartDefinition rightUpperarm_r2 = rightUpperarm.addOrReplaceChild("rightUpperarm_r2", CubeListBuilder.create().texOffs(76, 56).addBox(-0.5F, 0.65F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1709F, 2.084F, 0.7132F, 1.1345F, 0.0F, 0.0F));

		PartDefinition rightUpperarm_r3 = rightUpperarm.addOrReplaceChild("rightUpperarm_r3", CubeListBuilder.create().texOffs(52, 76).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1709F, 1.4752F, -0.0802F, 1.1781F, 0.0F, 0.0F));

		PartDefinition rightUpperarm_r4 = rightUpperarm.addOrReplaceChild("rightUpperarm_r4", CubeListBuilder.create().texOffs(76, 37).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.1709F, 0.4838F, -0.2107F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightUpperarm_r5 = rightUpperarm.addOrReplaceChild("rightUpperarm_r5", CubeListBuilder.create().texOffs(35, 76).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1709F, -0.47F, 0.09F, -0.3054F, 0.0F, 0.0F));

		PartDefinition rightUpperarm_r6 = rightUpperarm.addOrReplaceChild("rightUpperarm_r6", CubeListBuilder.create().texOffs(41, 66).addBox(-0.5F, -0.6F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.1709F, 0.6301F, 1.09F, 0.7418F, 0.0F, 0.0F));

		PartDefinition rightLowerarm = rightUpperarm.addOrReplaceChild("rightLowerarm", CubeListBuilder.create().texOffs(59, 55).addBox(-0.9971F, -0.6639F, -0.2419F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(38, 60).addBox(-0.9971F, 0.3361F, -0.9419F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2093F, 3.5266F, 3.2686F, -0.36F, 0.3501F, 0.2896F));

		PartDefinition rightHand = rightLowerarm.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(9, 51).addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9168F, 2.9829F, -0.0402F, 0.2759F, 0.0F, -0.3396F));

		PartDefinition rightHand2 = rightLowerarm.addOrReplaceChild("rightHand2", CubeListBuilder.create().texOffs(52, 49).addBox(0.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8573F, 2.9575F, -0.3715F, -0.2423F, 0.0413F, -0.0811F));

		PartDefinition bone2 = bodyFront.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.1882F, 2.578F, -1.9343F));

		PartDefinition bodyFront_r1 = bone2.addOrReplaceChild("bodyFront_r1", CubeListBuilder.create().texOffs(32, 54).addBox(0.0118F, 0.0F, 0.1136F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5421F, 1.1458F, 0.3054F, 0.0F, 0.0F));

		PartDefinition bodyFront_r2 = bone2.addOrReplaceChild("bodyFront_r2", CubeListBuilder.create().texOffs(54, 20).addBox(0.0118F, 0.0F, 0.0136F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -2.5421F, 1.1458F, 0.4363F, 0.0F, 0.0F));

		PartDefinition bodyFront_r3 = bone2.addOrReplaceChild("bodyFront_r3", CubeListBuilder.create().texOffs(63, 0).addBox(-1.0F, -1.4049F, -0.2763F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0118F, 0.14F, -1.881F, 1.4399F, 0.4712F, 0.0F));

		PartDefinition bodyFront_r4 = bone2.addOrReplaceChild("bodyFront_r4", CubeListBuilder.create().texOffs(16, 51).addBox(-0.9F, -1.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2134F, 1.1851F, -3.1842F, 0.7902F, 0.893F, 0.4101F));

		PartDefinition bodyFront_r5 = bone2.addOrReplaceChild("bodyFront_r5", CubeListBuilder.create().texOffs(58, 64).addBox(-1.0F, -0.9536F, -1.5098F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0118F, 0.14F, -1.881F, 0.5236F, 0.4712F, 0.0F));

		PartDefinition bodyFront_r6 = bone2.addOrReplaceChild("bodyFront_r6", CubeListBuilder.create().texOffs(34, 67).addBox(-1.0F, -1.3598F, -0.9964F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0118F, 0.14F, -1.881F, 1.0472F, 0.4712F, 0.0F));

		PartDefinition bodyFront_r7 = bone2.addOrReplaceChild("bodyFront_r7", CubeListBuilder.create().texOffs(69, 52).addBox(0.0118F, -1.0F, -0.9864F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0868F, -0.8471F, 0.8378F, 0.0F, 0.0F));

		PartDefinition bodyFront_r8 = bone2.addOrReplaceChild("bodyFront_r8", CubeListBuilder.create().texOffs(69, 49).addBox(0.0118F, -1.0F, -0.9864F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.0868F, -0.8471F, 0.4363F, 0.0F, 0.0F));

		PartDefinition bodyFront_r9 = bone2.addOrReplaceChild("bodyFront_r9", CubeListBuilder.create().texOffs(9, 46).addBox(0.0118F, -0.1F, -0.8864F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3294F, -0.5716F, 0.5672F, 0.0F, 0.0F));

		PartDefinition bone4 = bodyFront.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-2.1882F, 2.578F, -1.9343F));

		PartDefinition bodyFront_r10 = bone4.addOrReplaceChild("bodyFront_r10", CubeListBuilder.create().texOffs(32, 54).mirror().addBox(-1.0118F, 0.0F, 0.1136F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.5421F, 1.1458F, 0.3054F, 0.0F, 0.0F));

		PartDefinition bodyFront_r11 = bone4.addOrReplaceChild("bodyFront_r11", CubeListBuilder.create().texOffs(54, 20).mirror().addBox(-1.0118F, 0.0F, 0.0136F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.5421F, 1.1458F, 0.4363F, 0.0F, 0.0F));

		PartDefinition bodyFront_r12 = bone4.addOrReplaceChild("bodyFront_r12", CubeListBuilder.create().texOffs(63, 0).mirror().addBox(0.0F, -1.4049F, -0.2763F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0118F, 0.14F, -1.881F, 1.4399F, -0.4712F, 0.0F));

		PartDefinition bodyFront_r13 = bone4.addOrReplaceChild("bodyFront_r13", CubeListBuilder.create().texOffs(16, 51).mirror().addBox(-0.1F, -1.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2134F, 1.1851F, -3.1842F, 0.7902F, -0.893F, -0.4101F));

		PartDefinition bodyFront_r14 = bone4.addOrReplaceChild("bodyFront_r14", CubeListBuilder.create().texOffs(58, 64).mirror().addBox(0.0F, -0.9536F, -1.5098F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0118F, 0.14F, -1.881F, 0.5236F, -0.4712F, 0.0F));

		PartDefinition bodyFront_r15 = bone4.addOrReplaceChild("bodyFront_r15", CubeListBuilder.create().texOffs(34, 67).mirror().addBox(0.0F, -1.3598F, -0.9964F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0118F, 0.14F, -1.881F, 1.0472F, -0.4712F, 0.0F));

		PartDefinition bodyFront_r16 = bone4.addOrReplaceChild("bodyFront_r16", CubeListBuilder.create().texOffs(69, 52).mirror().addBox(-1.0118F, -1.0F, -0.9864F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0868F, -0.8471F, 0.8378F, 0.0F, 0.0F));

		PartDefinition bodyFront_r17 = bone4.addOrReplaceChild("bodyFront_r17", CubeListBuilder.create().texOffs(69, 49).mirror().addBox(-1.0118F, -1.0F, -0.9864F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0868F, -0.8471F, 0.4363F, 0.0F, 0.0F));

		PartDefinition bodyFront_r18 = bone4.addOrReplaceChild("bodyFront_r18", CubeListBuilder.create().texOffs(9, 46).mirror().addBox(-1.0118F, -0.1F, -0.8864F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.3294F, -0.5716F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tailBase = hips.addOrReplaceChild("tailBase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2961F, 5.2741F, 0.1901F, 0.156F, 0.1174F));

		PartDefinition tailBase_r1 = tailBase.addOrReplaceChild("tailBase_r1", CubeListBuilder.create().texOffs(17, 81).addBox(0.0F, -1.9553F, 0.011F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0798F, 4.0388F, -0.5236F, 0.0F, 0.0F));

		PartDefinition tailBase_r2 = tailBase.addOrReplaceChild("tailBase_r2", CubeListBuilder.create().texOffs(50, 79).addBox(0.0F, -1.8553F, 0.011F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1813F, 2.0559F, -0.4363F, 0.0F, 0.0F));

		PartDefinition tailBase_r3 = tailBase.addOrReplaceChild("tailBase_r3", CubeListBuilder.create().texOffs(10, 61).addBox(0.0F, -3.3553F, -0.989F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0619F, 2.998F, -2.7053F, 0.0F, 0.0F));

		PartDefinition tailBase_r4 = tailBase.addOrReplaceChild("tailBase_r4", CubeListBuilder.create().texOffs(81, 31).addBox(0.0F, -3.5553F, -0.189F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5415F, 0.0861F, -2.4435F, 0.0F, 0.0F));

		PartDefinition tailBase_r5 = tailBase.addOrReplaceChild("tailBase_r5", CubeListBuilder.create().texOffs(81, 15).addBox(0.0F, -1.8553F, 0.011F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5415F, 0.0861F, -0.5672F, 0.0F, 0.0F));

		PartDefinition tailBase_r6 = tailBase.addOrReplaceChild("tailBase_r6", CubeListBuilder.create().texOffs(39, 31).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0259F, -0.131F, 0.0346F, -0.0046F));

		PartDefinition tailBase_r7 = tailBase.addOrReplaceChild("tailBase_r7", CubeListBuilder.create().texOffs(39, 31).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0259F, -0.131F, -0.0346F, 0.0046F));

		PartDefinition tailBase_r8 = tailBase.addOrReplaceChild("tailBase_r8", CubeListBuilder.create().texOffs(26, 33).addBox(-0.5F, -0.4553F, 0.011F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0458F, 0.0208F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tailMiddlebase = tailBase.addOrReplaceChild("tailMiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.535F, 4.9797F, -0.0418F, 0.1744F, -0.0073F));

		PartDefinition tailMiddlebase_r1 = tailMiddlebase.addOrReplaceChild("tailMiddlebase_r1", CubeListBuilder.create().texOffs(23, 81).addBox(0.0F, -1.6577F, -0.0596F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.1747F, 2.9485F, -0.3142F, 0.0F, 0.0F));

		PartDefinition tailMiddlebase_r2 = tailMiddlebase.addOrReplaceChild("tailMiddlebase_r2", CubeListBuilder.create().texOffs(20, 81).addBox(0.0F, -1.7577F, 0.0404F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2846F, 0.8514F, -0.3578F, 0.0F, 0.0F));

		PartDefinition tailMiddlebase_r3 = tailMiddlebase.addOrReplaceChild("tailMiddlebase_r3", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.1592F, 0.8686F, -0.0524F, 0.0523F, -0.0027F));

		PartDefinition tailMiddlebase_r4 = tailMiddlebase.addOrReplaceChild("tailMiddlebase_r4", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.1592F, 0.8686F, -0.0524F, -0.0523F, 0.0027F));

		PartDefinition tailMiddlebase_r5 = tailMiddlebase.addOrReplaceChild("tailMiddlebase_r5", CubeListBuilder.create().texOffs(30, 18).addBox(-0.5F, -0.5577F, -0.0597F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.1676F, -0.0735F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tailBase_r9 = tailMiddlebase.addOrReplaceChild("tailBase_r9", CubeListBuilder.create().texOffs(56, 68).addBox(0.0F, -1.6F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4394F, 3.4222F, -2.618F, 0.0F, 0.0F));

		PartDefinition tailBase_r10 = tailMiddlebase.addOrReplaceChild("tailBase_r10", CubeListBuilder.create().texOffs(59, 68).addBox(0.0F, -4.1553F, -2.989F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4769F, -1.9797F, -2.7053F, 0.0F, 0.0F));

		PartDefinition tailMiddle = tailMiddlebase.addOrReplaceChild("tailMiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3781F, 4.8875F, -0.059F, 0.1394F, 0.1218F));

		PartDefinition tailMiddle_r1 = tailMiddle.addOrReplaceChild("tailMiddle_r1", CubeListBuilder.create().texOffs(39, 83).addBox(0.0F, -1.0004F, -0.018F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6708F, 3.8956F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tailMiddle_r2 = tailMiddle.addOrReplaceChild("tailMiddle_r2", CubeListBuilder.create().texOffs(81, 27).addBox(0.0F, -1.2004F, -0.018F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5836F, 1.8976F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tailMiddle_r3 = tailMiddle.addOrReplaceChild("tailMiddle_r3", CubeListBuilder.create().texOffs(26, 81).addBox(0.0F, -1.5004F, -0.018F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4963F, -0.1005F, -0.3054F, 0.0F, 0.0F));

		PartDefinition tailMiddle_r4 = tailMiddle.addOrReplaceChild("tailMiddle_r4", CubeListBuilder.create().texOffs(39, 37).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.0036F, -0.0967F, 0.0437F, 0.0523F, 0.0023F));

		PartDefinition tailMiddle_r5 = tailMiddle.addOrReplaceChild("tailMiddle_r5", CubeListBuilder.create().texOffs(39, 37).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.0036F, -0.0967F, 0.0437F, -0.0523F, -0.0023F));

		PartDefinition tailMiddle_r6 = tailMiddle.addOrReplaceChild("tailMiddle_r6", CubeListBuilder.create().texOffs(26, 26).addBox(-0.5F, -0.6004F, -0.118F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0988F, 0.0255F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tailBase_r11 = tailMiddle.addOrReplaceChild("tailBase_r11", CubeListBuilder.create().texOffs(53, 79).addBox(0.0F, -3.4F, -4.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 50).addBox(0.0F, -2.5F, -2.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0613F, -1.4653F, -2.618F, 0.0F, 0.0F));

		PartDefinition tailMiddleend = tailMiddle.addOrReplaceChild("tailMiddleend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1315F, 4.7805F, -0.171F, 0.172F, -0.0295F));

		PartDefinition tailMiddleend_r1 = tailMiddleend.addOrReplaceChild("tailMiddleend_r1", CubeListBuilder.create().texOffs(48, 83).addBox(0.0F, -0.7252F, 0.0091F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.1898F, 4.9225F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tailMiddleend_r2 = tailMiddleend.addOrReplaceChild("tailMiddleend_r2", CubeListBuilder.create().texOffs(45, 83).addBox(0.0F, -0.8252F, 0.0091F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.9288F, 2.9396F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tailMiddleend_r3 = tailMiddleend.addOrReplaceChild("tailMiddleend_r3", CubeListBuilder.create().texOffs(42, 83).addBox(0.0F, -0.9002F, 0.0091F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6678F, 0.9567F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tailMiddleend_r4 = tailMiddleend.addOrReplaceChild("tailMiddleend_r4", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -0.8252F, 0.0091F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2559F, 0.0697F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tailBase_r12 = tailMiddleend.addOrReplaceChild("tailBase_r12", CubeListBuilder.create().texOffs(79, 73).addBox(0.0F, -6.1F, -10.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 79).addBox(0.0F, -5.2F, -8.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 79).addBox(0.0F, -4.2F, -6.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1928F, -6.2458F, -2.618F, 0.0F, 0.0F));

		PartDefinition tailEnd = tailMiddleend.addOrReplaceChild("tailEnd", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8711F, 5.986F, -0.0661F, 0.2278F, 0.1131F));

		PartDefinition tailEnd_r1 = tailEnd.addOrReplaceChild("tailEnd_r1", CubeListBuilder.create().texOffs(54, 83).addBox(0.0F, -1.1118F, 0.0393F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3493F, 2.8989F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tailEnd_r2 = tailEnd.addOrReplaceChild("tailEnd_r2", CubeListBuilder.create().texOffs(51, 83).addBox(0.0F, -0.6118F, 0.0393F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.584F, 0.8507F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tailBase_r13 = tailEnd.addOrReplaceChild("tailBase_r13", CubeListBuilder.create().texOffs(5, 80).addBox(0.0F, -7.5F, -14.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 80).addBox(0.0F, -6.8F, -12.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0639F, -12.2318F, -2.618F, 0.0F, 0.0F));

		PartDefinition tailEnd_r3 = tailEnd.addOrReplaceChild("tailEnd_r3", CubeListBuilder.create().texOffs(34, 7).addBox(-0.5F, -0.5118F, -0.2607F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0031F, 0.222F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tailEnd2 = tailEnd.addOrReplaceChild("tailEnd2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5714F, 4.9177F, -0.0594F, 0.1742F, -0.0103F));

		PartDefinition tailEnd_r4 = tailEnd2.addOrReplaceChild("tailEnd_r4", CubeListBuilder.create().texOffs(60, 83).addBox(0.0F, -1.0118F, 3.7393F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 83).addBox(0.0F, -1.0118F, 1.7393F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 55).addBox(0.0F, -1.0118F, -0.2607F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 26).addBox(-0.5F, -0.5118F, -0.2607F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0719F, 0.222F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tailBase_r14 = tailEnd2.addOrReplaceChild("tailBase_r14", CubeListBuilder.create().texOffs(24, 61).addBox(0.0F, -9.1F, -20.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 55).addBox(0.0F, -8.6F, -18.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 46).addBox(0.0F, -7.9F, -16.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6353F, -17.1495F, -2.618F, 0.0F, 0.0F));

		PartDefinition tailEnd3 = tailEnd2.addOrReplaceChild("tailEnd3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6821F, 4.8995F, -0.0151F, -0.1745F, 0.0026F));

		PartDefinition tailEnd_r5 = tailEnd3.addOrReplaceChild("tailEnd_r5", CubeListBuilder.create().texOffs(63, 83).addBox(0.0F, -0.7618F, 2.7393F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 0).addBox(-0.5F, -0.5118F, -0.2607F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0469F, 0.272F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tailEnd_r6 = tailEnd3.addOrReplaceChild("tailEnd_r6", CubeListBuilder.create().texOffs(83, 62).addBox(0.0F, -0.55F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5178F, 1.4599F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tailBase_r15 = tailEnd3.addOrReplaceChild("tailBase_r15", CubeListBuilder.create().texOffs(3, 84).addBox(0.0F, -1.2F, -2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 83).addBox(0.0F, -0.9F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.025F, 1.4536F, -2.8362F, 0.0F, 0.0F));

		PartDefinition tailEnd4 = tailEnd3.addOrReplaceChild("tailEnd4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6517F, 4.8942F, 0.0081F, -0.175F, -0.1303F));

		PartDefinition tailEnd_r7 = tailEnd4.addOrReplaceChild("tailEnd_r7", CubeListBuilder.create().texOffs(66, 83).addBox(0.0F, -0.6618F, 1.7393F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 65).addBox(0.0F, -0.7118F, -0.2607F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 33).addBox(-0.5F, -0.5118F, -0.2607F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0469F, 0.272F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tailBase_r16 = tailEnd4.addOrReplaceChild("tailBase_r16", CubeListBuilder.create().texOffs(84, 24).addBox(0.0F, -0.7F, -4.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 21).addBox(0.0F, -0.7F, -2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 15).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2369F, 0.6148F, -2.9234F, 0.0F, 0.0F));

		PartDefinition tailEnd5 = tailEnd4.addOrReplaceChild("tailEnd5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6697F, 4.8803F, 0.0816F, -0.4786F, -0.0377F));

		PartDefinition tailEnd_r8 = tailEnd5.addOrReplaceChild("tailEnd_r8", CubeListBuilder.create().texOffs(13, 33).addBox(-0.5F, -0.5118F, -0.2607F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0469F, 0.272F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tailEnd6 = tailEnd5.addOrReplaceChild("tailEnd6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6532F, 4.8462F, 0.1216F, -0.3033F, -0.0365F));

		PartDefinition tailEnd_r9 = tailEnd6.addOrReplaceChild("tailEnd_r9", CubeListBuilder.create().texOffs(15, 18).addBox(-0.5F, -0.5118F, -0.2607F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0469F, 0.272F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightThigh = hips.addOrReplaceChild("rightThigh", CubeListBuilder.create().texOffs(23, 55).addBox(-0.5F, -0.7682F, -0.6545F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 1.4696F, 1.5587F, -0.7158F, 0.0F, 0.0F));

		PartDefinition rightThigh_r1 = rightThigh.addOrReplaceChild("rightThigh_r1", CubeListBuilder.create().texOffs(63, 66).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.2318F, 0.0705F, 0.5236F, 0.0F, 0.0F));

		PartDefinition rightThigh_r2 = rightThigh.addOrReplaceChild("rightThigh_r2", CubeListBuilder.create().texOffs(71, 35).addBox(2.6F, 0.0F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1F, 6.1296F, 0.1469F, 0.48F, 0.0F, 0.0F));

		PartDefinition rightThigh_r3 = rightThigh.addOrReplaceChild("rightThigh_r3", CubeListBuilder.create().texOffs(19, 61).addBox(2.6F, 0.0F, -0.025F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.1F, 3.2318F, -0.6295F, 0.2618F, 0.0F, 0.0F));

		PartDefinition rightThigh_r4 = rightThigh.addOrReplaceChild("rightThigh_r4", CubeListBuilder.create().texOffs(66, 16).addBox(2.6F, -1.975F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.1F, 1.3318F, -0.6295F, 0.2618F, 0.0F, 0.0F));

		PartDefinition rightShin = rightThigh.addOrReplaceChild("rightShin", CubeListBuilder.create().texOffs(59, 14).addBox(-0.5F, -0.1F, -1.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F))
				.texOffs(29, 64).addBox(-0.5F, 0.6F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.4F, 6.7197F, 1.4192F, 0.8125F, 0.0F, 0.0F));

		PartDefinition rightShin_r1 = rightShin.addOrReplaceChild("rightShin_r1", CubeListBuilder.create().texOffs(56, 4).addBox(-0.5F, -3.8F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.9F, 3.6586F, 0.2168F, 0.1571F, 0.0F, 0.0F));

		PartDefinition rightShin_r2 = rightShin.addOrReplaceChild("rightShin_r2", CubeListBuilder.create().texOffs(44, 55).addBox(-0.5F, -3.8F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.9F, 3.6586F, 0.2168F, 0.0175F, 0.0F, 0.0F));

		PartDefinition rightShin_r3 = rightShin.addOrReplaceChild("rightShin_r3", CubeListBuilder.create().texOffs(54, 58).addBox(-0.5F, -3.7F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.9F, 6.859F, 1.4688F, 0.2269F, 0.0F, 0.0F));

		PartDefinition rightShin_r4 = rightShin.addOrReplaceChild("rightShin_r4", CubeListBuilder.create().texOffs(52, 24).addBox(3.3F, -0.375F, 0.075F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-3.8F, 2.8F, -0.1F, 0.2094F, 0.0F, 0.0F));

		PartDefinition rightShin_r5 = rightShin.addOrReplaceChild("rightShin_r5", CubeListBuilder.create().texOffs(0, 68).addBox(-0.5F, -1.0F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 0.8376F, -0.4451F, 0.829F, 0.0F, 0.0F));

		PartDefinition rightShin_r6 = rightShin.addOrReplaceChild("rightShin_r6", CubeListBuilder.create().texOffs(24, 64).addBox(3.3F, -2.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.8F, 2.8F, -0.1F, 0.48F, 0.0F, 0.0F));

		PartDefinition rightAnkle = rightShin.addOrReplaceChild("rightAnkle", CubeListBuilder.create().texOffs(54, 14).addBox(-0.5F, -0.1387F, -0.5359F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.39F, 7.2018F, 1.328F, -0.8372F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightAnkle.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(34, 14).addBox(-1.0F, -0.5F, -1.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0756F, 0.1494F, 1.5186F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(43, 19).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.009F, -1.5201F, -0.5672F, 0.0F, 0.0F));

		PartDefinition leftThigh = hips.addOrReplaceChild("leftThigh", CubeListBuilder.create().texOffs(49, 58).addBox(-0.5F, -0.7682F, -0.6545F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2F, 1.4696F, 1.5587F, 0.2442F, 0.0F, 0.0F));

		PartDefinition leftThigh_r1 = leftThigh.addOrReplaceChild("leftThigh_r1", CubeListBuilder.create().texOffs(7, 67).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 0.2318F, 0.0705F, 0.5236F, 0.0F, 0.0F));

		PartDefinition leftThigh_r2 = leftThigh.addOrReplaceChild("leftThigh_r2", CubeListBuilder.create().texOffs(73, 67).addBox(-3.6F, 0.0F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1F, 6.1296F, 0.1469F, 0.48F, 0.0F, 0.0F));

		PartDefinition leftThigh_r3 = leftThigh.addOrReplaceChild("leftThigh_r3", CubeListBuilder.create().texOffs(43, 61).addBox(-3.6F, 0.0F, -0.025F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.1F, 3.2318F, -0.6295F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftThigh_r4 = leftThigh.addOrReplaceChild("leftThigh_r4", CubeListBuilder.create().texOffs(66, 60).addBox(-3.6F, -1.975F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.1F, 1.3318F, -0.6295F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftShin = leftThigh.addOrReplaceChild("leftShin", CubeListBuilder.create().texOffs(59, 36).addBox(-0.5F, -0.1F, -1.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F))
				.texOffs(53, 64).addBox(-0.5F, 0.6F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.4F, 6.7197F, 1.4192F, 0.8125F, 0.0F, 0.0F));

		PartDefinition leftShin_r1 = leftShin.addOrReplaceChild("leftShin_r1", CubeListBuilder.create().texOffs(33, 58).addBox(-0.5F, -3.8F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.9F, 3.6586F, 0.2168F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftShin_r2 = leftShin.addOrReplaceChild("leftShin_r2", CubeListBuilder.create().texOffs(28, 58).addBox(-0.5F, -3.8F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.9F, 3.6586F, 0.2168F, 0.0175F, 0.0F, 0.0F));

		PartDefinition leftShin_r3 = leftShin.addOrReplaceChild("leftShin_r3", CubeListBuilder.create().texOffs(0, 59).addBox(-0.5F, -3.7F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(-0.9F, 6.859F, 1.4688F, 0.2269F, 0.0F, 0.0F));

		PartDefinition leftShin_r4 = leftShin.addOrReplaceChild("leftShin_r4", CubeListBuilder.create().texOffs(52, 31).addBox(-4.3F, -0.375F, 0.075F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(3.8F, 2.8F, -0.1F, 0.2094F, 0.0F, 0.0F));

		PartDefinition leftShin_r5 = leftShin.addOrReplaceChild("leftShin_r5", CubeListBuilder.create().texOffs(68, 0).addBox(-0.5F, -1.0F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 0.8376F, -0.4451F, 0.829F, 0.0F, 0.0F));

		PartDefinition leftShin_r6 = leftShin.addOrReplaceChild("leftShin_r6", CubeListBuilder.create().texOffs(64, 27).addBox(-4.3F, -2.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.8F, 2.8F, -0.1F, 0.48F, 0.0F, 0.0F));

		PartDefinition leftAnkle = leftShin.addOrReplaceChild("leftAnkle", CubeListBuilder.create().texOffs(39, 54).addBox(-0.5F, -0.1387F, -0.5359F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.39F, 7.2018F, 1.328F, -0.4882F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftAnkle.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(47, 10).addBox(-1.0F, -0.5F, -1.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0756F, 0.1494F, 0.2969F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(33, 43).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.009F, -1.5201F, 0.3491F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.785F, 2.1521F, 2.8288F, 0.0F, 0.0F, -0.0873F));

		PartDefinition hips_r5 = bone.addOrReplaceChild("hips_r5", CubeListBuilder.create().texOffs(64, 52).addBox(1.5F, -0.1444F, 0.5941F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-1.2843F, -2.8915F, 2.2871F, -2.0595F, 0.0F, 0.0F));

		PartDefinition hips_r6 = bone.addOrReplaceChild("hips_r6", CubeListBuilder.create().texOffs(48, 64).addBox(1.5F, 0.0056F, -0.0059F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.2843F, -2.8915F, 2.2871F, -1.8413F, 0.0F, 0.0F));

		PartDefinition hips_r7 = bone.addOrReplaceChild("hips_r7", CubeListBuilder.create().texOffs(39, 70).addBox(1.5F, 0.0056F, -0.0059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.2843F, -3.7396F, 1.7572F, -1.0123F, 0.0F, 0.0F));

		PartDefinition hips_r8 = bone.addOrReplaceChild("hips_r8", CubeListBuilder.create().texOffs(68, 69).addBox(1.5F, 0.0056F, -0.0059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2843F, -3.9218F, 0.7739F, -0.1833F, 0.0F, 0.0F));

		PartDefinition hips_r9 = bone.addOrReplaceChild("hips_r9", CubeListBuilder.create().texOffs(52, 54).addBox(1.5F, -0.9944F, -0.6059F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.2843F, -0.9854F, -4.6944F, 0.5585F, 0.0F, 0.0F));

		PartDefinition hips_r10 = bone.addOrReplaceChild("hips_r10", CubeListBuilder.create().texOffs(71, 16).addBox(1.5F, 0.0056F, -1.0059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.2843F, -2.1848F, -5.4438F, 1.3439F, 0.0F, 0.0F));

		PartDefinition hips_r11 = bone.addOrReplaceChild("hips_r11", CubeListBuilder.create().texOffs(5, 71).addBox(1.5F, 0.0056F, -1.0059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2843F, -3.0464F, -4.9363F, 1.0385F, 0.0F, 0.0F));

		PartDefinition hips_r12 = bone.addOrReplaceChild("hips_r12", CubeListBuilder.create().texOffs(62, 70).addBox(1.5F, 0.0056F, -1.0059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.2843F, -3.7473F, -4.223F, 0.7767F, 0.0F, 0.0F));

		PartDefinition hips_r13 = bone.addOrReplaceChild("hips_r13", CubeListBuilder.create().texOffs(69, 55).addBox(-1.025F, -0.2628F, -0.2889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 32).addBox(-1.025F, -1.8628F, -2.4889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1657F, -1.9931F, -0.5213F, 0.733F, 0.0F, 0.1396F));

		PartDefinition hips_r14 = bone.addOrReplaceChild("hips_r14", CubeListBuilder.create().texOffs(68, 8).addBox(-0.8773F, -0.5126F, -0.3472F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7657F, -0.2931F, -0.5213F, 0.449F, -0.1275F, 0.4225F));

		PartDefinition hips_r15 = bone.addOrReplaceChild("hips_r15", CubeListBuilder.create().texOffs(61, 4).addBox(-0.3773F, 1.974F, -0.4425F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.6525F, 1.6631F, -0.0547F, 1.0083F, 0.1275F, 0.4225F));

		PartDefinition hips_r16 = bone.addOrReplaceChild("hips_r16", CubeListBuilder.create().texOffs(63, 9).addBox(-0.3773F, -0.4224F, -0.363F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6525F, 1.6631F, -0.0547F, 0.9734F, 0.1275F, 0.4225F));

		PartDefinition hips_r17 = bone.addOrReplaceChild("hips_r17", CubeListBuilder.create().texOffs(61, 18).addBox(-0.5512F, 0.1349F, -3.2185F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(1.1657F, -1.9931F, -0.5213F, 0.8814F, 0.0F, 0.4189F));

		PartDefinition hips_r18 = bone.addOrReplaceChild("hips_r18", CubeListBuilder.create().texOffs(69, 46).addBox(-0.5512F, 1.8998F, -0.3635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1657F, -1.9931F, -0.5213F, -0.7767F, 0.0F, 0.4189F));

		PartDefinition hips_r19 = bone.addOrReplaceChild("hips_r19", CubeListBuilder.create().texOffs(33, 40).addBox(-0.5512F, 1.4394F, -2.8648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1657F, -1.9931F, -0.5213F, 0.0524F, 0.0F, 0.4189F));

		PartDefinition hips_r20 = bone.addOrReplaceChild("hips_r20", CubeListBuilder.create().texOffs(64, 23).addBox(-0.5512F, -1.0741F, -3.2665F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.1657F, -1.9931F, -0.5213F, 0.7941F, 0.0F, 0.4189F));

		PartDefinition hips_r21 = bone.addOrReplaceChild("hips_r21", CubeListBuilder.create().texOffs(64, 48).addBox(-0.8773F, -0.9082F, -0.747F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.7657F, -0.2931F, -0.5213F, 0.6934F, -0.1275F, 0.4225F));

		PartDefinition hips_r22 = bone.addOrReplaceChild("hips_r22", CubeListBuilder.create().texOffs(5, 61).addBox(-0.8773F, -2.1139F, -0.9898F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.7657F, -0.2931F, -0.5213F, 0.9988F, -0.1275F, 0.4225F));

		PartDefinition hips_r23 = bone.addOrReplaceChild("hips_r23", CubeListBuilder.create().texOffs(76, 59).addBox(-0.1672F, 1.0738F, -3.1766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(57, 76).addBox(-0.1672F, 1.0738F, -3.7766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7343F, 0.8069F, 1.0788F, 1.9499F, 0.0478F, 0.2798F));

		PartDefinition hips_r24 = bone.addOrReplaceChild("hips_r24", CubeListBuilder.create().texOffs(79, 43).addBox(-0.1672F, 3.559F, -0.6005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(5, 77).addBox(-0.1672F, 3.559F, -0.0005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.7343F, 0.8069F, 1.0788F, 0.8329F, 0.0478F, 0.2798F));

		PartDefinition hips_r25 = bone.addOrReplaceChild("hips_r25", CubeListBuilder.create().texOffs(69, 43).addBox(-0.1672F, 3.0282F, -0.4676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.7343F, 0.8069F, 1.0788F, 0.9551F, 0.0478F, 0.2798F));

		PartDefinition hips_r26 = bone.addOrReplaceChild("hips_r26", CubeListBuilder.create().texOffs(46, 68).addBox(-0.1672F, 1.4435F, -0.6954F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7343F, 0.8069F, 1.0788F, 1.0249F, 0.0478F, 0.2798F));

		PartDefinition hips_r27 = bone.addOrReplaceChild("hips_r27", CubeListBuilder.create().texOffs(51, 68).addBox(-0.1672F, 1.3999F, -0.4072F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.7343F, 0.8069F, 1.0788F, 0.8503F, 0.0478F, 0.2798F));

		PartDefinition hips_r28 = bone.addOrReplaceChild("hips_r28", CubeListBuilder.create().texOffs(27, 68).addBox(-0.1672F, -0.1612F, -0.6372F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.7343F, 0.8069F, 1.0788F, 0.99F, 0.0478F, 0.2798F));

		PartDefinition hips_r29 = bone.addOrReplaceChild("hips_r29", CubeListBuilder.create().texOffs(12, 68).addBox(-0.8773F, 0.5395F, -0.9401F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.7657F, -0.2931F, -0.5213F, 0.929F, -0.1275F, 0.4225F));

		PartDefinition hips_r30 = bone.addOrReplaceChild("hips_r30", CubeListBuilder.create().texOffs(44, 43).addBox(-1.025F, -0.3016F, -2.5942F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.1657F, -1.9931F, -0.5213F, 0.0349F, 0.0F, 0.1396F));

		PartDefinition hips_r31 = bone.addOrReplaceChild("hips_r31", CubeListBuilder.create().texOffs(19, 0).addBox(1.5F, 0.0056F, 0.1941F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.2843F, -3.7403F, -4.4229F, 0.0349F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.785F, 2.1521F, 2.8288F, 0.0F, 0.0F, 0.0873F));

		PartDefinition hips_r32 = bone3.addOrReplaceChild("hips_r32", CubeListBuilder.create().texOffs(64, 52).mirror().addBox(-2.5F, -0.1444F, 0.5941F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(1.2843F, -2.8915F, 2.2871F, -2.0595F, 0.0F, 0.0F));

		PartDefinition hips_r33 = bone3.addOrReplaceChild("hips_r33", CubeListBuilder.create().texOffs(48, 64).mirror().addBox(-2.5F, 0.0056F, -0.0059F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.2843F, -2.8915F, 2.2871F, -1.8413F, 0.0F, 0.0F));

		PartDefinition hips_r34 = bone3.addOrReplaceChild("hips_r34", CubeListBuilder.create().texOffs(39, 70).mirror().addBox(-2.5F, 0.0056F, -0.0059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.2843F, -3.7396F, 1.7572F, -1.0123F, 0.0F, 0.0F));

		PartDefinition hips_r35 = bone3.addOrReplaceChild("hips_r35", CubeListBuilder.create().texOffs(68, 69).mirror().addBox(-2.5F, 0.0056F, -0.0059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2843F, -3.9218F, 0.7739F, -0.1833F, 0.0F, 0.0F));

		PartDefinition hips_r36 = bone3.addOrReplaceChild("hips_r36", CubeListBuilder.create().texOffs(52, 54).mirror().addBox(-2.5F, -0.9944F, -0.6059F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.2843F, -0.9854F, -4.6944F, 0.5585F, 0.0F, 0.0F));

		PartDefinition hips_r37 = bone3.addOrReplaceChild("hips_r37", CubeListBuilder.create().texOffs(71, 16).mirror().addBox(-2.5F, 0.0056F, -1.0059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.2843F, -2.1848F, -5.4438F, 1.3439F, 0.0F, 0.0F));

		PartDefinition hips_r38 = bone3.addOrReplaceChild("hips_r38", CubeListBuilder.create().texOffs(5, 71).mirror().addBox(-2.5F, 0.0056F, -1.0059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2843F, -3.0464F, -4.9363F, 1.0385F, 0.0F, 0.0F));

		PartDefinition hips_r39 = bone3.addOrReplaceChild("hips_r39", CubeListBuilder.create().texOffs(62, 70).mirror().addBox(-2.5F, 0.0056F, -1.0059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.2843F, -3.7473F, -4.223F, 0.7767F, 0.0F, 0.0F));

		PartDefinition hips_r40 = bone3.addOrReplaceChild("hips_r40", CubeListBuilder.create().texOffs(69, 55).mirror().addBox(0.025F, -0.2628F, -0.2889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(71, 32).mirror().addBox(0.025F, -1.8628F, -2.4889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1657F, -1.9931F, -0.5213F, 0.733F, 0.0F, -0.1396F));

		PartDefinition hips_r41 = bone3.addOrReplaceChild("hips_r41", CubeListBuilder.create().texOffs(68, 8).mirror().addBox(-0.1227F, -0.5126F, -0.3472F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7657F, -0.2931F, -0.5213F, 0.449F, 0.1275F, -0.4225F));

		PartDefinition hips_r42 = bone3.addOrReplaceChild("hips_r42", CubeListBuilder.create().texOffs(61, 4).mirror().addBox(-0.6227F, 1.974F, -0.4425F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.6525F, 1.6631F, -0.0547F, 1.0083F, -0.1275F, -0.4225F));

		PartDefinition hips_r43 = bone3.addOrReplaceChild("hips_r43", CubeListBuilder.create().texOffs(63, 9).mirror().addBox(-0.6227F, -0.4224F, -0.363F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.6525F, 1.6631F, -0.0547F, 0.9734F, -0.1275F, -0.4225F));

		PartDefinition hips_r44 = bone3.addOrReplaceChild("hips_r44", CubeListBuilder.create().texOffs(61, 18).mirror().addBox(-0.4488F, 0.1349F, -3.2185F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-1.1657F, -1.9931F, -0.5213F, 0.8814F, 0.0F, -0.4189F));

		PartDefinition hips_r45 = bone3.addOrReplaceChild("hips_r45", CubeListBuilder.create().texOffs(69, 46).mirror().addBox(-0.4488F, 1.8998F, -0.3635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1657F, -1.9931F, -0.5213F, -0.7767F, 0.0F, -0.4189F));

		PartDefinition hips_r46 = bone3.addOrReplaceChild("hips_r46", CubeListBuilder.create().texOffs(33, 40).mirror().addBox(-0.4488F, 1.4394F, -2.8648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1657F, -1.9931F, -0.5213F, 0.0524F, 0.0F, -0.4189F));

		PartDefinition hips_r47 = bone3.addOrReplaceChild("hips_r47", CubeListBuilder.create().texOffs(64, 23).mirror().addBox(-0.4488F, -1.0741F, -3.2665F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.1657F, -1.9931F, -0.5213F, 0.7941F, 0.0F, -0.4189F));

		PartDefinition hips_r48 = bone3.addOrReplaceChild("hips_r48", CubeListBuilder.create().texOffs(64, 48).mirror().addBox(-0.1227F, -0.9082F, -0.747F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.7657F, -0.2931F, -0.5213F, 0.6934F, 0.1275F, -0.4225F));

		PartDefinition hips_r49 = bone3.addOrReplaceChild("hips_r49", CubeListBuilder.create().texOffs(5, 61).mirror().addBox(-0.1227F, -2.1139F, -0.9898F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.7657F, -0.2931F, -0.5213F, 0.9988F, 0.1275F, -0.4225F));

		PartDefinition hips_r50 = bone3.addOrReplaceChild("hips_r50", CubeListBuilder.create().texOffs(76, 59).mirror().addBox(-0.8328F, 1.0738F, -3.1766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(57, 76).mirror().addBox(-0.8328F, 1.0738F, -3.7766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.7343F, 0.8069F, 1.0788F, 1.9499F, -0.0478F, -0.2798F));

		PartDefinition hips_r51 = bone3.addOrReplaceChild("hips_r51", CubeListBuilder.create().texOffs(79, 43).mirror().addBox(-0.8328F, 3.559F, -0.6005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(5, 77).mirror().addBox(-0.8328F, 3.559F, -0.0005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.7343F, 0.8069F, 1.0788F, 0.8329F, -0.0478F, -0.2798F));

		PartDefinition hips_r52 = bone3.addOrReplaceChild("hips_r52", CubeListBuilder.create().texOffs(69, 43).mirror().addBox(-0.8328F, 3.0282F, -0.4676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.7343F, 0.8069F, 1.0788F, 0.9551F, -0.0478F, -0.2798F));

		PartDefinition hips_r53 = bone3.addOrReplaceChild("hips_r53", CubeListBuilder.create().texOffs(46, 68).mirror().addBox(-0.8328F, 1.4435F, -0.6954F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.7343F, 0.8069F, 1.0788F, 1.0249F, -0.0478F, -0.2798F));

		PartDefinition hips_r54 = bone3.addOrReplaceChild("hips_r54", CubeListBuilder.create().texOffs(51, 68).mirror().addBox(-0.8328F, 1.3999F, -0.4072F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.7343F, 0.8069F, 1.0788F, 0.8503F, -0.0478F, -0.2798F));

		PartDefinition hips_r55 = bone3.addOrReplaceChild("hips_r55", CubeListBuilder.create().texOffs(27, 68).mirror().addBox(-0.8328F, -0.1612F, -0.6372F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.7343F, 0.8069F, 1.0788F, 0.99F, -0.0478F, -0.2798F));

		PartDefinition hips_r56 = bone3.addOrReplaceChild("hips_r56", CubeListBuilder.create().texOffs(12, 68).mirror().addBox(-0.1227F, 0.5395F, -0.9401F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.7657F, -0.2931F, -0.5213F, 0.929F, 0.1275F, -0.4225F));

		PartDefinition hips_r57 = bone3.addOrReplaceChild("hips_r57", CubeListBuilder.create().texOffs(44, 43).mirror().addBox(0.025F, -0.3016F, -2.5942F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.1657F, -1.9931F, -0.5213F, 0.0349F, 0.0F, -0.1396F));

		PartDefinition hips_r58 = bone3.addOrReplaceChild("hips_r58", CubeListBuilder.create().texOffs(19, 0).mirror().addBox(-2.5F, 0.0056F, 0.1941F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.2843F, -3.7403F, -4.4229F, 0.0349F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 87, 87);
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