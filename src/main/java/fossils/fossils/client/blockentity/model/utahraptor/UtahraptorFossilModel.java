package fossils.fossils.client.blockentity.model.utahraptor;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

@SuppressWarnings("unused")
public class UtahraptorFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftSickleClaw;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightSickleClaw;
	private final ModelPart rightToes;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart leftFinger;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart rightFinger;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public UtahraptorFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftSickleClaw = this.leftFoot.getChild("leftSickleClaw");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightSickleClaw = this.rightFoot.getChild("rightSickleClaw");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.leftFinger = this.leftHand.getChild("leftFinger");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.rightFinger = this.rightHand.getChild("rightFinger");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -26.0F, -7.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(9, 24).addBox(0.0F, -2.3777F, -0.0084F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 5.0F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 44).addBox(0.0F, -0.195F, 0.0432F, 0.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, -2.5F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(68, 77).mirror().addBox(-1.2007F, -5.7274F, -2.1118F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1327F, 3.8857F, 1.2931F, -1.0472F, -0.1745F, 0.1745F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(89, 29).mirror().addBox(-1.2007F, -5.1974F, -0.606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(77, 49).mirror().addBox(-1.2007F, -4.7974F, -0.806F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1327F, 3.8857F, 1.2931F, -0.7679F, -0.1745F, 0.1745F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(46, 7).mirror().addBox(-1.2007F, -5.6051F, -0.871F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1327F, 3.8857F, 1.2931F, -0.2793F, -0.1745F, 0.1745F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-1.2007F, -6.0875F, -3.5718F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1327F, 3.8857F, 1.2931F, -0.7854F, -0.1745F, 0.1745F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(64, 68).mirror().addBox(-1.4673F, -6.904F, -5.1375F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1327F, 3.8857F, 1.2931F, -0.384F, 0.0F, 0.1745F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(86, 86).mirror().addBox(-1.2793F, -10.3219F, -2.0243F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1327F, 3.8857F, 1.2931F, 0.4189F, 0.0873F, 0.1745F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(90, 55).mirror().addBox(-1.2793F, -9.0255F, -5.1454F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1327F, 3.8857F, 1.2931F, 0.0F, 0.0873F, 0.1745F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(73, 38).mirror().addBox(-1.2793F, -6.9481F, -7.1282F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.1327F, 3.8857F, 1.2931F, -0.3665F, 0.0873F, 0.1745F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(50, 57).mirror().addBox(-1.4673F, -6.7963F, -4.3204F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1327F, 3.8857F, 1.2931F, -0.2618F, 0.0F, 0.1745F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-2.0F, 0.4F, 2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 68).addBox(1.0F, 0.4F, 2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(18, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, -3.7F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(71, 63).mirror().addBox(-1.2793F, -8.0674F, -4.4674F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1327F, 3.8857F, 1.2931F, 0.1222F, 0.0873F, 0.1745F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(22, 56).mirror().addBox(0.6404F, 5.3068F, -5.2585F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1327F, 4.2857F, -1.5069F, 0.4363F, 0.0F, 0.0349F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(84, 30).mirror().addBox(0.6404F, 7.2217F, -2.0046F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1327F, 4.2857F, -1.5069F, -0.0698F, 0.0F, 0.0349F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.7418F, 3.7836F, 0.2271F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1327F, 3.8857F, 1.2931F, 0.9905F, -0.0716F, -0.0083F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(76, 82).mirror().addBox(-0.1685F, -0.0228F, -0.3149F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1327F, 3.8857F, 1.2931F, 1.126F, 0.1328F, -0.1425F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(81, 73).mirror().addBox(0.6404F, -0.8765F, 4.4148F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1327F, 4.2857F, -1.5069F, -1.693F, 0.0F, 0.0349F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(84, 15).mirror().addBox(0.6404F, 2.2563F, 3.3958F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.1327F, 4.2857F, -1.5069F, -0.9425F, 0.0F, 0.0349F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(85, 7).mirror().addBox(0.6404F, 5.3246F, 0.3647F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1327F, 4.2857F, -1.5069F, 0.1047F, 0.0F, 0.0349F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(82, 3).mirror().addBox(0.6404F, 5.5331F, -3.4227F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1327F, 4.2857F, -1.5069F, 0.7854F, 0.0F, 0.0349F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(33, 4).mirror().addBox(0.6404F, 5.3072F, -3.8652F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.1327F, 4.2857F, -1.5069F, 0.4189F, 0.0F, 0.0349F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(63, 90).mirror().addBox(0.6404F, 3.3406F, -0.9587F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1327F, 4.2857F, -1.5069F, 0.0698F, 0.0F, 0.0349F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(54, 83).mirror().addBox(-0.006F, -0.1636F, -0.4694F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1327F, 4.2857F, -1.5069F, -0.0698F, 0.0F, -0.1571F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.102F, -4.5257F, -3.2899F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1327F, 3.8857F, 1.2931F, 0.1222F, 0.0F, -0.1396F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(22, 56).addBox(-1.6404F, 5.3068F, -5.2585F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1327F, 4.2857F, -1.5069F, 0.4363F, 0.0F, -0.0349F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(84, 30).addBox(-1.6404F, 7.2217F, -2.0046F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1327F, 4.2857F, -1.5069F, -0.0698F, 0.0F, -0.0349F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(81, 73).addBox(-1.6404F, -0.8765F, 4.4148F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1327F, 4.2857F, -1.5069F, -1.693F, 0.0F, -0.0349F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(84, 15).addBox(-1.6404F, 2.2563F, 3.3958F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.1327F, 4.2857F, -1.5069F, -0.9425F, 0.0F, -0.0349F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(85, 7).addBox(-1.6404F, 5.3246F, 0.3647F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1327F, 4.2857F, -1.5069F, 0.1047F, 0.0F, -0.0349F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(82, 3).addBox(-1.6404F, 5.5331F, -3.4227F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1327F, 4.2857F, -1.5069F, 0.7854F, 0.0F, -0.0349F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(33, 4).addBox(-1.6404F, 5.3072F, -3.8652F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.1327F, 4.2857F, -1.5069F, 0.4189F, 0.0F, -0.0349F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(63, 90).addBox(-1.6404F, 3.3406F, -0.9587F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1327F, 4.2857F, -1.5069F, 0.0698F, 0.0F, -0.0349F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 0).addBox(-1.7418F, 3.7836F, 0.2271F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1327F, 3.8857F, 1.2931F, 0.9905F, 0.0716F, 0.0083F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(76, 82).addBox(-0.8315F, -0.0228F, -0.3149F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1327F, 3.8857F, 1.2931F, 1.126F, -0.1328F, 0.1425F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(54, 83).addBox(-0.994F, -0.1636F, -0.4694F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1327F, 4.2857F, -1.5069F, -0.0698F, 0.0F, 0.1571F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 0).addBox(-0.898F, -4.5257F, -3.2899F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1327F, 3.8857F, 1.2931F, 0.1222F, 0.0F, 0.1396F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(68, 77).addBox(0.2007F, -5.7274F, -2.1118F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.1327F, 3.8857F, 1.2931F, -1.0472F, 0.1745F, -0.1745F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(89, 29).addBox(0.2007F, -5.1974F, -0.606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(77, 49).addBox(0.2007F, -4.7974F, -0.806F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1327F, 3.8857F, 1.2931F, -0.7679F, 0.1745F, -0.1745F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(46, 7).addBox(0.2007F, -5.6051F, -0.871F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.1327F, 3.8857F, 1.2931F, -0.2793F, 0.1745F, -0.1745F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 74).addBox(0.2007F, -6.0875F, -3.5718F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1327F, 3.8857F, 1.2931F, -0.7854F, 0.1745F, -0.1745F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(86, 86).addBox(0.2793F, -10.3219F, -2.0243F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.1327F, 3.8857F, 1.2931F, 0.4189F, -0.0873F, -0.1745F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(90, 55).addBox(0.2793F, -9.0255F, -5.1454F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1327F, 3.8857F, 1.2931F, 0.0F, -0.0873F, -0.1745F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(71, 63).addBox(0.2793F, -8.0674F, -4.4674F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.1327F, 3.8857F, 1.2931F, 0.1222F, -0.0873F, -0.1745F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(73, 38).addBox(0.2793F, -6.9481F, -7.1282F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.1327F, 3.8857F, 1.2931F, -0.3665F, -0.0873F, -0.1745F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(64, 68).addBox(0.4673F, -6.904F, -5.1375F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1327F, 3.8857F, 1.2931F, -0.384F, 0.0F, -0.1745F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(50, 57).addBox(0.4673F, -6.7963F, -4.3204F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.1327F, 3.8857F, 1.2931F, -0.2618F, 0.0F, -0.1745F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5F, 1.3F, 0.05F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg1.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 57).addBox(-1.5F, -1.3778F, -0.4821F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2052F, -0.5638F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg1.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(68, 52).addBox(-2.0F, 0.015F, -0.0312F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 9.6052F, 1.0362F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg1.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(73, 20).addBox(-1.5F, -0.0485F, -0.1944F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.8052F, 0.1362F, 0.3665F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 11.3139F, 2.4218F, 1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(45, 46).addBox(-0.5F, -0.3334F, -0.195F, 2.0F, 11.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6F, 1.6955F, -0.1697F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(32, 67).addBox(-0.5F, -3.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 2.9955F, 0.5303F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(56, 7).addBox(-2.4F, 2.85F, -0.35F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.01F))
				.texOffs(26, 56).addBox(-2.4F, -0.15F, -1.85F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, 0.1446F, 0.328F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(63, 44).addBox(-1.5F, -0.2237F, -1.5528F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.4546F, 0.5832F, -0.9425F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(61, 60).addBox(-1.5F, -1.5F, -2.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 4.8763F, -0.0528F, 0.4363F, 0.0F, 0.0F));

		PartDefinition leftSickleClaw = leftFoot.addOrReplaceChild("leftSickleClaw", CubeListBuilder.create().texOffs(0, 85).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.0F, -0.8F, -0.7418F, 0.3054F, 0.0F));

		PartDefinition cube_r54 = leftSickleClaw.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 32).addBox(0.0F, -0.4284F, -3.8555F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -1.6F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftSickleClaw.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(84, 57).addBox(-2.5F, -0.5F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.0F, 0.0F, -1.3F, -0.8727F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(17, 49).addBox(-2.0F, -1.5F, -4.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offset(0.5F, 0.0F, -2.5F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5005F, 1.2783F, 0.0519F, -0.0872F, -0.0038F, -0.0435F));

		PartDefinition cube_r56 = rightLeg1.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, -1.3778F, -0.4821F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2052F, -0.5638F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r57 = rightLeg1.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(51, 27).addBox(-1.0F, 0.015F, -0.0312F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 9.6052F, 1.0362F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r58 = rightLeg1.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(72, 57).addBox(-0.5F, -0.0485F, -0.1944F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.8052F, 0.1362F, 0.3665F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 11.3139F, 2.4218F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r59 = rightLeg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(36, 46).addBox(-1.5F, -0.3334F, -0.195F, 2.0F, 11.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6F, 1.6955F, -0.1697F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightLeg2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(57, 66).addBox(-1.5F, -3.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 2.9955F, 0.5303F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(54, 44).addBox(0.4F, 2.85F, -0.35F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.01F))
				.texOffs(13, 56).addBox(0.4F, -0.15F, -1.85F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, 0.1446F, 0.328F, -0.0524F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(63, 0).addBox(-1.5F, -0.2237F, -1.5528F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.4546F, 0.5832F, -1.2477F, 0.0419F, 0.012F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(36, 61).addBox(-1.5F, -1.5F, -2.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 4.8763F, -0.0528F, 0.4363F, 0.0F, 0.0F));

		PartDefinition rightSickleClaw = rightFoot.addOrReplaceChild("rightSickleClaw", CubeListBuilder.create().texOffs(84, 52).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -1.0F, -0.8F, -0.7418F, -0.3054F, 0.0F));

		PartDefinition cube_r62 = rightSickleClaw.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(18, 0).addBox(0.0F, -0.4284F, -3.8555F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -1.6F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightSickleClaw.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(84, 34).addBox(1.5F, -0.5F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.0F, 0.0F, -1.3F, -0.8727F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(47, 35).addBox(-1.0F, -1.5F, -4.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -2.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, -3.7F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(9, 59).addBox(0.0F, -3.8907F, 0.0412F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -2.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(9, 17).addBox(0.0F, -4.1284F, -0.0175F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, -3.9F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(80, 0).mirror().addBox(-0.9F, -0.4F, 5.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(58, 34).mirror().addBox(-1.2F, -0.4F, 3.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(63, 22).mirror().addBox(-1.3F, -0.4F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(65, 29).mirror().addBox(-1.3F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.7312F, -7.2723F, -0.1515F, 0.0869F, 0.517F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(87, 38).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2951F, -1.4784F, -0.0814F, -0.1129F, -1.1738F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(87, 65).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2951F, -1.4784F, -0.1214F, -0.068F, -0.7379F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(7, 57).mirror().addBox(-5.9915F, -2.5102F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.7951F, -3.3784F, -0.003F, -0.0172F, -1.5184F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(87, 70).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.7951F, -3.3784F, -0.0106F, -0.0138F, -1.0384F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(88, 13).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.7951F, -3.3784F, -0.0155F, -0.0081F, -0.6021F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(-8.9915F, -2.5102F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.0951F, -5.3784F, 0.0061F, 0.0344F, -1.4834F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(19, 88).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.0951F, -5.3784F, 0.0213F, 0.0277F, -1.0033F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(88, 47).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.0951F, -5.3784F, 0.031F, 0.0161F, -0.567F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(64, 88).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.3951F, -7.3784F, 0.0783F, 0.0387F, -0.5307F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(71, 88).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.3951F, -7.3784F, 0.0547F, 0.0681F, -0.9667F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(33, 0).mirror().addBox(-9.9915F, -2.5102F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.3951F, -7.3784F, 0.017F, 0.0857F, -1.4478F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(87, 65).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2951F, -1.4784F, -0.1214F, 0.068F, 0.7379F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(87, 38).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2951F, -1.4784F, -0.0814F, 0.1129F, 1.1738F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(88, 13).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.7951F, -3.3784F, -0.0155F, 0.0081F, 0.6021F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(87, 70).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.7951F, -3.3784F, -0.0106F, 0.0138F, 1.0384F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(7, 57).addBox(2.9915F, -2.5102F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.7951F, -3.3784F, -0.003F, 0.0172F, 1.5184F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(88, 47).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0951F, -5.3784F, 0.031F, -0.0161F, 0.567F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(19, 88).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0951F, -5.3784F, 0.0213F, -0.0277F, 1.0033F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(0, 13).addBox(2.9915F, -2.5102F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0951F, -5.3784F, 0.0061F, -0.0344F, 1.4834F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(64, 88).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.3951F, -7.3784F, 0.0783F, -0.0387F, 0.5307F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(71, 88).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.3951F, -7.3784F, 0.0547F, -0.0681F, 0.9667F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(33, 0).addBox(2.9915F, -2.5102F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.3951F, -7.3784F, 0.017F, -0.0857F, 1.4478F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(68, 74).addBox(0.0F, -6.9808F, 0.8967F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 88).addBox(0.0F, -6.6808F, -1.1033F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -7.3F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(80, 0).addBox(-1.1F, -0.4F, 5.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(58, 34).addBox(-0.8F, -0.4F, 3.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(63, 22).addBox(-0.7F, -0.4F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(65, 29).addBox(-0.7F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -2.7312F, -7.2723F, -0.1515F, -0.0869F, -0.517F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(32, 26).addBox(-3.0F, -2.0192F, -5.9784F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.0F, -6.7F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(17, 17).addBox(-4.0F, -3.0638F, -5.0703F, 8.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.7F, -1.9F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(34, 35).addBox(-1.0F, -1.9F, -7.8F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.9F, -0.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7F, -8.2F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(46, 60).addBox(0.0F, -2.6F, -5.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 44).addBox(0.0F, -3.9F, -1.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 34).addBox(0.0F, -3.1F, -3.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 38).addBox(-1.0F, -1.2F, -7.6F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, -0.1F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(86, 26).mirror().addBox(-0.5F, -0.3F, -2.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 65).mirror().addBox(-1.0F, -0.3F, 1.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(83, 77).mirror().addBox(-1.0F, -0.3F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.3675F, -3.1272F, -0.0732F, 0.0475F, 0.5742F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(76, 5).mirror().addBox(-1.7256F, -4.2167F, -2.2698F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9561F, 2.7093F, -4.4524F, 2.0983F, -0.4251F, -0.4221F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-6.0022F, -0.0354F, -0.0841F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 7.9277F, -4.2168F, -0.7293F, 0.9212F, -0.4189F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(17, 26).mirror().addBox(-4.0022F, -0.0354F, -0.0841F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 7.5277F, -4.8168F, -0.7577F, 0.8166F, -0.0399F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(33, 15).mirror().addBox(-3.0022F, -0.0354F, -0.0841F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 6.6277F, -5.8168F, -1.0748F, 0.7772F, 0.1017F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(61, 16).mirror().addBox(-2.2F, -0.7F, -1.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.4277F, -5.8168F, -0.6005F, 0.1084F, 0.1897F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(72, 71).mirror().addBox(-1.7819F, -3.1827F, -2.859F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9561F, 2.7093F, -4.4524F, 1.1813F, -0.4758F, -0.3204F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(57, 27).mirror().addBox(-1.1439F, -1.6922F, -2.5894F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9561F, 2.7093F, -4.4524F, 0.4014F, -0.1396F, 0.0F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(14, 76).mirror().addBox(-1.1439F, -2.4103F, 1.8033F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9561F, 2.7093F, -4.4524F, 0.0524F, -0.1396F, 0.0F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(23, 77).mirror().addBox(-1.1439F, -2.1544F, 2.0106F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9561F, 2.7093F, -4.4524F, 0.192F, -0.1396F, 0.0F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(57, 37).mirror().addBox(-1.1439F, -2.0109F, -2.8499F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9561F, 2.7093F, -4.4524F, 0.2618F, -0.1396F, 0.0F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(18, 13).mirror().addBox(-8.9915F, -2.5102F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2951F, -5.1784F, 0.0496F, 0.2573F, -1.4767F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(88, 74).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2951F, -5.1784F, 0.1642F, 0.205F, -0.9862F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(88, 84).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2951F, -5.1784F, 0.2348F, 0.1171F, -0.5529F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(33, 2).mirror().addBox(-9.9915F, -2.5102F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.0951F, -3.0784F, 0.0318F, 0.1717F, -1.4283F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 89).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.0951F, -3.0784F, 0.1079F, 0.1375F, -0.9436F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(89, 5).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.0951F, -3.0784F, 0.1557F, 0.0792F, -0.5086F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(51, 25).mirror().addBox(-10.9915F, -2.5102F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8951F, -1.1784F, 0.0244F, 0.1375F, -1.3946F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(7, 89).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8951F, -1.1784F, 0.0853F, 0.1106F, -0.9116F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(89, 15).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8951F, -1.1784F, 0.124F, 0.0643F, -0.476F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(88, 84).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2951F, -5.1784F, 0.2348F, -0.1171F, 0.5529F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(88, 74).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2951F, -5.1784F, 0.1642F, -0.205F, 0.9862F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(18, 13).addBox(2.9915F, -2.5102F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2951F, -5.1784F, 0.0496F, -0.2573F, 1.4767F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(89, 5).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0951F, -3.0784F, 0.1557F, -0.0792F, 0.5086F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(0, 89).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0951F, -3.0784F, 0.1079F, -0.1375F, 0.9436F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(33, 2).addBox(2.9915F, -2.5102F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0951F, -3.0784F, 0.0318F, -0.1717F, 1.4283F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(51, 25).addBox(2.9915F, -2.5102F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8951F, -1.1784F, 0.0244F, -0.1375F, 1.3946F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(7, 89).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8951F, -1.1784F, 0.0853F, -0.1106F, 0.9116F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(89, 15).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8951F, -1.1784F, 0.124F, -0.0643F, 0.476F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(80, 65).addBox(-1.0F, -0.3F, 1.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(86, 26).addBox(-1.5F, -0.3F, -2.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(83, 77).addBox(-1.0F, -0.3F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.3675F, -3.1272F, -0.0732F, -0.0475F, -0.5742F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(14, 76).addBox(0.1439F, -2.4103F, 1.8033F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.9561F, 2.7093F, -4.4524F, 0.0524F, 0.1396F, 0.0F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(23, 77).addBox(0.1439F, -2.1544F, 2.0106F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9561F, 2.7093F, -4.4524F, 0.192F, 0.1396F, 0.0F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(57, 27).addBox(0.1439F, -1.6922F, -2.5894F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9561F, 2.7093F, -4.4524F, 0.4014F, 0.1396F, 0.0F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(76, 5).addBox(0.7256F, -4.2167F, -2.2698F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9561F, 2.7093F, -4.4524F, 2.0983F, 0.4251F, 0.4221F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(72, 71).addBox(0.7819F, -3.1827F, -2.859F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9561F, 2.7093F, -4.4524F, 1.1813F, 0.4758F, 0.3204F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(57, 37).addBox(0.1439F, -2.0109F, -2.8499F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.9561F, 2.7093F, -4.4524F, 0.2618F, 0.1396F, 0.0F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(0, 11).addBox(0.0022F, -0.0354F, -0.0841F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 7.9277F, -4.2168F, -0.7293F, -0.9212F, 0.4189F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(17, 26).addBox(0.0022F, -0.0354F, -0.0841F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 7.5277F, -4.8168F, -0.7577F, -0.8166F, 0.0399F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(33, 15).addBox(0.0022F, -0.0354F, -0.0841F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 6.6277F, -5.8168F, -1.0748F, -0.7772F, -0.1017F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(61, 16).addBox(0.2F, -0.7F, -1.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.4277F, -5.8168F, -0.6005F, -0.1084F, -0.1897F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create().texOffs(9, 76).addBox(-0.5059F, -0.5647F, -0.6475F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.7474F, 3.9395F, -6.0157F, 0.2691F, -0.4755F, -1.2957F));

		PartDefinition cube_r135 = leftArm1.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(87, 61).addBox(0.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0941F, 6.0353F, -0.6475F, -0.9498F, 0.1575F, 0.2628F));

		PartDefinition cube_r136 = leftArm2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(87, 42).addBox(-0.5F, -2.9106F, -0.7981F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.05F, 4.0245F, 0.7278F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r137 = leftArm2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(87, 19).addBox(-0.5F, -1.5F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.05F, 5.3245F, 0.2278F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r138 = leftArm2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(43, 87).addBox(-1.75F, -1.7F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2F, 1.05F, 1.2F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r139 = leftArm2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(66, 82).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.05F, 2.25F, -0.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r140 = leftArm2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(71, 82).addBox(-0.5F, -2.1F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.05F, 5.3364F, -1.0914F, -0.096F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(59, 81).addBox(-1.0F, -0.25F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(33, 73).addBox(-1.0F, 1.7F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(43, 79).addBox(-1.0F, 1.7F, 0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2F, 7.2F, -0.5F, 0.7836F, -0.0692F, 0.0532F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create().texOffs(72, 29).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create().texOffs(38, 75).addBox(-0.4941F, -0.5647F, -0.6475F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.7474F, 3.9395F, -6.0157F, 0.2211F, 0.3356F, 1.2749F));

		PartDefinition cube_r141 = rightArm1.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(86, 80).addBox(-1.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0941F, 6.0353F, -0.6475F, -1.0807F, -0.1575F, -0.2628F));

		PartDefinition cube_r142 = rightArm2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(30, 87).addBox(-0.5F, -2.9106F, -0.7981F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.05F, 4.0245F, 0.7278F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r143 = rightArm2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(87, 0).addBox(-0.5F, -1.5F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.05F, 5.3245F, 0.2278F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r144 = rightArm2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(51, 73).addBox(0.75F, -1.7F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2F, 1.05F, 1.2F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r145 = rightArm2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(21, 82).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.05F, 2.25F, -0.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r146 = rightArm2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(26, 82).addBox(-0.5F, -2.1F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.05F, 5.3364F, -1.0914F, -0.096F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(14, 81).addBox(0.0F, -0.25F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(56, 72).addBox(0.0F, 1.7F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(79, 32).addBox(0.0F, 1.7F, 0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.2F, 7.2F, -0.5F, 0.7836F, 0.0692F, -0.0532F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create().texOffs(0, 44).addBox(0.0F, 0.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.3927F, 0.0F, 0.0F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -6.9F, 0.0451F, 0.1289F, 0.0229F));

		PartDefinition cube_r147 = neck3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(0, 68).addBox(0.0F, -1.4787F, 0.0635F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -0.5F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r148 = neck3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(18, 0).addBox(0.0F, -1.3056F, -0.0778F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1F, -2.0F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r149 = neck3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(59, 53).addBox(-1.0F, -1.98F, -0.1177F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.0F, -3.9F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r150 = neck3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(85, 11).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.7951F, -2.7784F, 0.3701F, 0.6637F, -0.7413F));

		PartDefinition cube_r151 = neck3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(86, 72).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1951F, -0.5784F, 0.2475F, 0.3364F, -0.8074F));

		PartDefinition cube_r152 = neck3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(14, 44).mirror().addBox(-4.8126F, -0.8452F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1951F, -0.5784F, 0.0764F, 0.4082F, -1.2701F));

		PartDefinition cube_r153 = neck3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(85, 11).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.7951F, -2.7784F, 0.3701F, -0.6637F, 0.7413F));

		PartDefinition cube_r154 = neck3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(14, 44).addBox(1.8126F, -0.8452F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1951F, -0.5784F, 0.0764F, -0.4082F, 1.2701F));

		PartDefinition cube_r155 = neck3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(86, 72).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1951F, -0.5784F, 0.2475F, -0.3364F, 0.8074F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -3.1F, -0.041F, 0.1719F, 0.0306F));

		PartDefinition cube_r156 = neck2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(68, 90).addBox(0.0F, -1.8119F, 2.0322F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 90).addBox(0.0F, -1.8119F, 0.0322F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.6F, -1.5F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r157 = neck2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(40, 89).addBox(0.0F, -2.2501F, 1.9896F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 90).addBox(0.0F, -1.6501F, -0.0104F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 15).addBox(-1.0F, -0.1501F, -0.0104F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.4F, -4.3F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r158 = neck2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(65, 14).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -3.9951F, -4.8784F, 0.2584F, 0.5853F, -1.1421F));

		PartDefinition cube_r159 = neck2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(40, 67).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.8951F, -3.8784F, 0.3208F, 0.6017F, -1.0541F));

		PartDefinition cube_r160 = neck2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(7, 70).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.4951F, -2.7784F, 0.1911F, 0.5867F, -1.0371F));

		PartDefinition cube_r161 = neck2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(43, 75).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1049F, -1.2784F, 0.2413F, 0.6058F, -0.9457F));

		PartDefinition cube_r162 = neck2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(65, 14).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.9951F, -4.8784F, 0.2584F, -0.5853F, 1.1421F));

		PartDefinition cube_r163 = neck2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(40, 67).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.8951F, -3.8784F, 0.3208F, -0.6017F, 1.0541F));

		PartDefinition cube_r164 = neck2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(7, 70).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4951F, -2.7784F, 0.1911F, -0.5867F, 1.0371F));

		PartDefinition cube_r165 = neck2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(43, 75).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1049F, -1.2784F, 0.2413F, -0.6058F, 0.9457F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.7F, -4.4F, -0.1273F, 0.1718F, -0.0302F));

		PartDefinition cube_r166 = neck.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(90, 76).addBox(0.0F, -1.5F, 0.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 70).addBox(-1.0F, 0.0F, -0.1F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.3F, -2.7F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r167 = neck.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(14, 32).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1951F, -1.7784F, 0.0083F, 0.6629F, -1.3308F));

		PartDefinition cube_r168 = neck.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(14, 32).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1951F, -1.7784F, 0.0083F, -0.6629F, 1.3308F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3366F, -2.9073F, 0.0005F, 0.1857F, -0.0345F));

		PartDefinition cube_r169 = head.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(83, 47).mirror().addBox(-0.33F, 2.9878F, -8.4966F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(90, 33).mirror().addBox(-0.7F, 4.2878F, -5.3966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(83, 47).addBox(-0.07F, 2.9878F, -8.4966F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(90, 33).addBox(0.3F, 4.2878F, -5.3966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3F, -7.4646F, -5.9954F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r170 = head.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(80, 17).mirror().addBox(0.2F, -0.3F, 0.3F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.01F, 0.7786F, -10.2155F, 0.0943F, -0.0266F, 0.0194F));

		PartDefinition cube_r171 = head.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(46, 73).mirror().addBox(0.4F, -0.5F, -1.5F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.938F, 0.6219F, -12.5596F, -0.1812F, -0.0291F, -0.0214F));

		PartDefinition cube_r172 = head.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(53, 89).mirror().addBox(-0.8F, -0.2245F, -0.0824F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0105F)).mirror(false)
				.texOffs(53, 89).addBox(-0.4F, -0.2245F, -0.0824F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0105F)), PartPose.offsetAndRotation(0.1F, -1.6924F, -12.3372F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r173 = head.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(61, 74).mirror().addBox(-0.8F, -3.8767F, 0.9066F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(61, 74).addBox(-0.4F, -3.8767F, 0.9066F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(32, 26).addBox(-0.6F, -3.9767F, 0.0066F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.1F, -2.6924F, -12.3372F, -1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r174 = head.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(79, 10).mirror().addBox(-0.7F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(79, 10).addBox(-0.3F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.1504F, -13.4613F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r175 = head.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(8, 0).mirror().addBox(-0.7F, -1.9F, 2.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1013F, 0.0022F, -9.7893F, -0.1396F, -0.1571F, 0.0F));

		PartDefinition cube_r176 = head.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(65, 34).mirror().addBox(-0.7F, -1.2177F, -0.0408F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0705F, -10.4288F, 0.0698F, -0.1571F, 0.0F));

		PartDefinition cube_r177 = head.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(19, 32).mirror().addBox(-0.5F, -0.865F, -1.6255F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.13F)).mirror(false), PartPose.offsetAndRotation(-0.93F, -1.7771F, -7.1156F, 0.288F, -0.1396F, 0.0F));

		PartDefinition cube_r178 = head.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(28, 43).mirror().addBox(-0.5F, -0.9023F, -0.0277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.93F, -1.7771F, -7.1156F, 0.0262F, -0.1396F, 0.0F));

		PartDefinition cube_r179 = head.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(74, 0).mirror().addBox(-0.5F, 0.0306F, -1.7853F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-0.93F, -1.7771F, -7.1156F, -0.2705F, -0.1396F, 0.0F));

		PartDefinition cube_r180 = head.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(28, 49).mirror().addBox(-0.5F, -1.2373F, -0.9256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-0.93F, -1.7771F, -7.1156F, -1.6144F, -0.1396F, 0.0F));

		PartDefinition cube_r181 = head.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(74, 44).mirror().addBox(-0.5F, -0.3851F, -1.7788F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-0.93F, -1.7771F, -7.1156F, -0.0087F, -0.1396F, 0.0F));

		PartDefinition cube_r182 = head.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(9, 64).mirror().addBox(-1.5F, -2.0463F, -2.9946F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4363F, -4.3548F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r183 = head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(25, 89).mirror().addBox(-0.5F, -1.1F, -1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(25, 89).addBox(2.74F, -1.1F, -1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.62F, -0.1078F, -0.9866F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r184 = head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(59, 86).mirror().addBox(-1.32F, -0.7F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(59, 86).addBox(1.92F, -0.7F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.8F, -1.1261F, -0.9298F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r185 = head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(48, 84).mirror().addBox(-1.32F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(48, 84).addBox(1.92F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, -1.1261F, -0.9298F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r186 = head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.46F, -0.4146F, -0.8932F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.26F, -1.6142F, -4.2571F, -0.0785F, -0.192F, 0.0175F));

		PartDefinition cube_r187 = head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(81, 86).mirror().addBox(-0.46F, -1.4267F, -1.1565F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.26F, -1.6142F, -4.2571F, -0.096F, -0.192F, 0.0175F));

		PartDefinition cube_r188 = head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(89, 50).mirror().addBox(-0.46F, -1.5564F, -0.4982F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.26F, -1.6142F, -4.2571F, -0.288F, -0.192F, 0.0175F));

		PartDefinition cube_r189 = head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(48, 89).mirror().addBox(-0.46F, -1.6213F, -0.8852F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.26F, -1.6142F, -4.2571F, 0.096F, -0.192F, 0.0175F));

		PartDefinition cube_r190 = head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(79, 54).mirror().addBox(-0.88F, -1.2296F, -0.9382F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(80, 42).mirror().addBox(-0.57F, -1.2296F, -0.9382F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.26F, -1.6142F, -4.2571F, -0.1658F, -0.192F, 0.0175F));

		PartDefinition cube_r191 = head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(35, 89).mirror().addBox(-0.46F, -1.6261F, -0.0716F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.26F, -1.6142F, -4.2571F, -0.6545F, -0.192F, 0.0175F));

		PartDefinition cube_r192 = head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(86, 67).mirror().addBox(1.3519F, -1.9894F, -0.3169F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0908F, -3.2559F, -7.6426F, -1.5105F, -1.1085F, -0.0068F));

		PartDefinition cube_r193 = head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(17, 17).mirror().addBox(-0.1489F, -2.5774F, -0.1504F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0908F, -3.2559F, -7.6426F, -1.4675F, -0.4014F, 0.0219F));

		PartDefinition cube_r194 = head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(65, 34).addBox(-0.3F, -1.2177F, -0.0408F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0705F, -10.4288F, 0.0698F, 0.1571F, 0.0F));

		PartDefinition cube_r195 = head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(8, 0).addBox(-0.3F, -1.9F, 2.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1013F, 0.0022F, -9.7893F, -0.1396F, 0.1571F, 0.0F));

		PartDefinition cube_r196 = head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(86, 67).addBox(-3.3519F, -1.9894F, -0.3169F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0908F, -3.2559F, -7.6426F, -1.5105F, 1.1085F, 0.0068F));

		PartDefinition cube_r197 = head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(17, 17).addBox(-0.8511F, -2.5774F, -0.1504F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0908F, -3.2559F, -7.6426F, -1.4675F, 0.4014F, -0.0219F));

		PartDefinition cube_r198 = head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(46, 66).addBox(-1.0F, -3.0258F, -0.0547F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2051F, -8.4729F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r199 = head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(74, 5).addBox(-0.5F, 0.4233F, 0.0066F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(74, 49).addBox(-0.5F, 0.0233F, 0.0066F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -2.6924F, -12.3372F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r200 = head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(18, 90).addBox(-0.4F, -2.0598F, 0.0949F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1496F, -14.3613F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r201 = head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(80, 17).addBox(-0.2F, -0.3F, 0.3F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.01F, 0.7786F, -10.2155F, 0.0943F, 0.0266F, -0.0194F));

		PartDefinition cube_r202 = head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(46, 73).addBox(-0.4F, -0.5F, -1.5F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.938F, 0.6219F, -12.5596F, -0.1812F, 0.0291F, 0.0214F));

		PartDefinition cube_r203 = head.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(46, 15).mirror().addBox(-2.0F, -0.5147F, -0.8498F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(46, 15).addBox(1.0F, -0.5147F, -0.8498F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.3686F, 0.5626F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r204 = head.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(14, 86).mirror().addBox(-2.0F, 0.4F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(14, 86).addBox(1.0F, 0.4F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.1686F, -0.2374F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r205 = head.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(78, 68).addBox(0.0F, -0.1321F, -0.226F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, -2.6384F, -1.1606F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r206 = head.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(28, 38).addBox(-1.0F, -0.0321F, -0.026F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, -2.6384F, -1.1606F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r207 = head.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(70, 14).addBox(-1.0F, 0.0453F, -1.5011F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -3.4384F, -4.6606F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r208 = head.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(22, 71).addBox(-1.0F, -0.0095F, -2.0106F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, -3.2384F, -2.6606F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r209 = head.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(22, 64).addBox(-1.0F, -0.0321F, -1.626F, 4.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0F, -2.6384F, -1.1606F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r210 = head.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(65, 8).addBox(-1.0F, -1.9912F, 0.0353F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.4616F, -1.8606F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r211 = head.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(28, 43).addBox(-0.5F, -0.9023F, -0.0277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.93F, -1.7771F, -7.1156F, 0.0262F, 0.1396F, 0.0F));

		PartDefinition cube_r212 = head.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(19, 32).addBox(-0.5F, -0.865F, -1.6255F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.13F)), PartPose.offsetAndRotation(0.93F, -1.7771F, -7.1156F, 0.288F, 0.1396F, 0.0F));

		PartDefinition cube_r213 = head.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(28, 49).addBox(-0.5F, -1.2373F, -0.9256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.93F, -1.7771F, -7.1156F, -1.6144F, 0.1396F, 0.0F));

		PartDefinition cube_r214 = head.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(74, 0).addBox(-0.5F, 0.0306F, -1.7853F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.93F, -1.7771F, -7.1156F, -0.2705F, 0.1396F, 0.0F));

		PartDefinition cube_r215 = head.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(74, 44).addBox(-0.5F, -0.3851F, -1.7788F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.93F, -1.7771F, -7.1156F, -0.0087F, 0.1396F, 0.0F));

		PartDefinition cube_r216 = head.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(79, 54).addBox(-0.12F, -1.2296F, -0.9382F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(80, 42).addBox(-0.43F, -1.2296F, -0.9382F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.26F, -1.6142F, -4.2571F, -0.1658F, 0.192F, -0.0175F));

		PartDefinition cube_r217 = head.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(48, 89).addBox(-0.54F, -1.6213F, -0.8852F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.26F, -1.6142F, -4.2571F, 0.096F, 0.192F, -0.0175F));

		PartDefinition cube_r218 = head.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(35, 89).addBox(-0.54F, -1.6261F, -0.0716F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.26F, -1.6142F, -4.2571F, -0.6545F, 0.192F, -0.0175F));

		PartDefinition cube_r219 = head.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(89, 50).addBox(-0.54F, -1.5564F, -0.4982F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.26F, -1.6142F, -4.2571F, -0.288F, 0.192F, -0.0175F));

		PartDefinition cube_r220 = head.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(0, 80).addBox(-0.54F, -0.4146F, -0.8932F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.26F, -1.6142F, -4.2571F, -0.0785F, 0.192F, -0.0175F));

		PartDefinition cube_r221 = head.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(81, 86).addBox(-0.54F, -1.4267F, -1.1565F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.26F, -1.6142F, -4.2571F, -0.096F, 0.192F, -0.0175F));

		PartDefinition cube_r222 = head.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(46, 0).addBox(-1.5F, -1.8623F, -4.0165F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.4363F, -0.4548F, -0.2967F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 3.2165F, 0.1666F, -0.1561F, 0.0F, 0.0F));

		PartDefinition cube_r223 = jaw.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(23, 0).mirror().addBox(-1.061F, 0.5746F, 3.4631F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 4.2728F, -2.6625F, 1.0006F, -0.1676F, 0.2022F));

		PartDefinition cube_r224 = jaw.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(9, 45).mirror().addBox(0.0F, -0.9959F, -0.0419F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 4.2728F, -2.6625F, 0.6482F, -0.3248F, -0.0682F));

		PartDefinition cube_r225 = jaw.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(66, 23).mirror().addBox(-1.5F, -1.0771F, -3.9548F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(66, 23).addBox(1.3F, -1.0771F, -3.9548F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.8F, 0.8285F, 0.116F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r226 = jaw.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(7, 85).mirror().addBox(-1.5F, -0.0373F, -0.0063F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.3285F, -2.184F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r227 = jaw.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(48, 79).mirror().addBox(-1.5F, -0.0373F, -2.0063F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.3285F, -2.184F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r228 = jaw.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(78, 60).mirror().addBox(-1.5F, -0.6648F, -2.6476F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(78, 60).addBox(1.3F, -0.6648F, -2.6476F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.8F, 0.1285F, 0.516F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r229 = jaw.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(74, 77).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 4.1606F, -4.5725F, 0.5864F, -0.0727F, -0.0483F));

		PartDefinition cube_r230 = jaw.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(39, 69).mirror().addBox(-0.5588F, -0.0393F, -3.8951F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.3864F, -3.8643F, 0.7376F, -0.0352F, -0.1044F));

		PartDefinition cube_r231 = jaw.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(39, 15).mirror().addBox(-0.3615F, -1.9817F, -3.651F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 3.6864F, -2.6643F, 0.6067F, -0.0352F, -0.1044F));

		PartDefinition cube_r232 = jaw.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(38, 84).mirror().addBox(0.1482F, -0.7821F, -2.0414F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3097F, 6.7472F, -10.1335F, 1.2843F, -0.0478F, -0.0624F));

		PartDefinition cube_r233 = jaw.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(14, 34).mirror().addBox(0.0F, -1.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2008F, 5.9408F, -8.2619F, 0.7074F, -0.008F, -0.0283F));

		PartDefinition cube_r234 = jaw.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(39, 17).mirror().addBox(-0.2922F, -0.45F, -1.0106F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(39, 17).addBox(0.5078F, -0.45F, -1.0106F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0078F, 7.8938F, -9.1613F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r235 = jaw.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(23, 0).addBox(1.061F, 0.5746F, 3.4631F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 4.2728F, -2.6625F, 1.0006F, 0.1676F, -0.2022F));

		PartDefinition cube_r236 = jaw.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(9, 45).addBox(0.0F, -0.9959F, -0.0419F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 4.2728F, -2.6625F, 0.6482F, 0.3248F, 0.0682F));

		PartDefinition cube_r237 = jaw.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(7, 85).addBox(0.5F, -0.0373F, -0.0063F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3285F, -2.184F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r238 = jaw.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(48, 79).addBox(0.5F, -0.0373F, -2.0063F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.3285F, -2.184F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r239 = jaw.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(74, 77).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 4.1606F, -4.5725F, 0.5864F, 0.0727F, 0.0483F));

		PartDefinition cube_r240 = jaw.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(39, 69).addBox(-0.4412F, -0.0393F, -3.8951F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.6F, 1.3864F, -3.8643F, 0.7376F, 0.0352F, 0.1044F));

		PartDefinition cube_r241 = jaw.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(39, 15).addBox(-0.6385F, -1.9817F, -3.651F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.6F, 3.6864F, -2.6643F, 0.6067F, 0.0352F, 0.1044F));

		PartDefinition cube_r242 = jaw.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(38, 84).addBox(-0.1482F, -0.7821F, -2.0414F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5097F, 6.7472F, -10.1335F, 1.2843F, 0.0478F, 0.0624F));

		PartDefinition cube_r243 = jaw.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(14, 34).addBox(0.0F, -1.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4008F, 5.9408F, -8.2619F, 0.7074F, 0.008F, 0.0283F));

		PartDefinition cube_r244 = jaw.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(31, 83).mirror().addBox(-0.2922F, -0.9726F, -0.172F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(31, 83).addBox(0.5078F, -0.9726F, -0.172F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.0078F, 6.6938F, -6.6613F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r245 = jaw.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(54, 66).mirror().addBox(-0.2922F, 0.1132F, -0.6922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(19, 70).mirror().addBox(-0.2922F, 0.1132F, -1.0922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(54, 66).addBox(0.5078F, 0.1132F, -0.6922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F))
				.texOffs(19, 70).addBox(0.5078F, 0.1132F, -1.0922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.0078F, 7.8938F, -9.1613F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r246 = jaw.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(77, 77).mirror().addBox(-0.2922F, -0.9371F, 0.0692F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.015F)).mirror(false)
				.texOffs(77, 77).addBox(0.5078F, -0.9371F, 0.0692F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-1.0078F, 8.8938F, -8.7613F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r247 = jaw.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(82, 22).mirror().addBox(-0.2922F, 0.0567F, -1.8371F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(82, 22).addBox(0.5078F, 0.0567F, -1.8371F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.0078F, 6.8938F, -9.0613F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r248 = jaw.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(82, 38).mirror().addBox(-0.2922F, -0.0448F, -1.7034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)).mirror(false)
				.texOffs(82, 38).addBox(0.5078F, -0.0448F, -1.7034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.0078F, 5.6938F, -7.7613F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r249 = jaw.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(81, 82).mirror().addBox(-0.2922F, -0.0609F, -1.9756F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.016F)).mirror(false)
				.texOffs(81, 82).addBox(0.5078F, -0.0609F, -1.9756F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-1.0078F, 3.9938F, -6.7613F, 1.0472F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.6F, 5.6F, -0.186F, -0.2069F, 0.0823F));

		PartDefinition cube_r250 = tail.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(5, 32).addBox(0.0F, -1.2633F, -0.0667F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 7.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r251 = tail.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(0, 32).addBox(0.0F, -1.3232F, -0.4078F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 5.4F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r252 = tail.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(18, 49).addBox(0.0F, -2.4F, 1.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 0).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 1.0F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r253 = tail.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(3, 91).addBox(0.0F, 0.0317F, -0.1265F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6555F, 7.5123F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r254 = tail.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(6, 91).addBox(0.0F, 0.0317F, -0.1265F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0028F, 5.5427F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r255 = tail.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(14, 34).addBox(0.0F, -0.0295F, 0.1497F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3848F, 3.3761F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r256 = tail.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(47, 35).addBox(0.0F, -0.5F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7848F, 1.5761F, 0.9861F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.8F, 0.2673F, -0.2224F, 0.0035F));

		PartDefinition cube_r257 = tail2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(12, 91).addBox(0.0F, -2.0F, 10.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 91).addBox(0.0F, -1.7F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 17).addBox(0.0F, -1.5F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 23).addBox(0.0F, -1.3F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 40).addBox(0.0F, -1.2F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 32).addBox(0.0F, -1.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r258 = tail2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(0, 74).addBox(0.0F, 1.8371F, 10.0094F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 0).addBox(0.0F, 1.6371F, 8.0094F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 91).addBox(0.0F, 1.3371F, 6.0094F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 91).addBox(0.0F, 1.1371F, 4.0094F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 90).addBox(0.0F, -0.0381F, 1.9946F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 91).addBox(0.0F, -0.3105F, 0.0032F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6729F, 0.7122F, 0.2269F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(19, 26).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.005F))
				.texOffs(9, 91).addBox(0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 84).addBox(0.0F, -1.5F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 10).addBox(0.0F, -1.5F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 77).addBox(0.0F, -1.5F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 77).addBox(0.0F, -1.5F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 11.9F, 0.1353F, -0.1624F, 0.1859F));

		PartDefinition cube_r259 = tail3.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(32, 53).addBox(0.0F, -0.5F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 60).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1453F, 7.5765F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r260 = tail3.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(19, 64).addBox(0.0F, -0.5F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 66).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1734F, 3.588F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r261 = tail3.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(70, 41).addBox(0.0F, 2.0371F, 12.0094F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6729F, -11.1878F, 0.2269F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(34, 4).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(20, 76).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 59).addBox(0.0F, -0.9F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 76).addBox(0.0F, -0.9F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 44).addBox(0.0F, -0.9F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 74).addBox(0.0F, -0.7F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 10.0F, 0.2523F, -0.1743F, 0.0092F));

		PartDefinition cube_r262 = tail4.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(33, 4).addBox(0.0F, -0.6F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 4).addBox(0.0F, -0.6F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 7).addBox(0.0F, -0.6F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 7).addBox(0.0F, -0.5F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3547F, -2.4235F, 0.0F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.9F, 0.2918F, -0.2592F, 0.0373F));

		return LayerDefinition.create(meshdefinition, 96, 96);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

}
