package fossils.fossils.client.blockentity.model.acrocanthosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AcrocanthosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Acrocanthosaurus;
	private final ModelPart hips;
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
	private final ModelPart chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public AcrocanthosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Acrocanthosaurus = this.fossil.getChild("Acrocanthosaurus");
		this.hips = this.Acrocanthosaurus.getChild("hips");
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
		this.chest = this.body.getChild("chest");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Acrocanthosaurus = fossil.addOrReplaceChild("Acrocanthosaurus", CubeListBuilder.create(), PartPose.offset(0.0F, -41.0F, 4.5F));

		PartDefinition hips = Acrocanthosaurus.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, -0.0903F, 0.2608F, -0.0233F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 44).addBox(0.0F, -11.357F, 0.1556F, 0.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.25F, -4.3F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(61, 0).mirror().addBox(1.8245F, 15.9078F, -4.1462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 2.3312F, -3.3468F, -0.2793F, 0.0F, -0.0524F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(94, 35).mirror().addBox(1.8245F, 11.1775F, -11.4617F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 2.3312F, -3.3468F, 0.192F, 0.0F, -0.0524F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(27, 118).mirror().addBox(1.8245F, 3.1143F, -15.2664F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 2.3312F, -3.3468F, 0.8378F, 0.0F, -0.0524F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(86, 15).mirror().addBox(1.8245F, 12.0991F, -9.6693F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 2.3312F, -3.3468F, 0.1396F, 0.0F, -0.0524F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(7, 44).mirror().addBox(1.8245F, -13.7664F, -6.1143F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 2.3312F, -3.3468F, 2.4086F, 0.0F, -0.0524F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(1.8245F, 9.827F, 1.5405F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 2.3312F, -3.3468F, -0.6021F, 0.0F, -0.0524F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(79, 60).mirror().addBox(-4.0F, -1.4822F, 1.8974F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 60).addBox(-1.0F, -1.4822F, 1.8974F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(25, 50).addBox(-2.0F, -1.9822F, -0.6026F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.25F, -4.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(75, 7).mirror().addBox(-0.5F, 3.4F, -2.6F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(75, 7).addBox(5.5F, 3.4F, -2.6F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.0F, -5.8688F, 0.1532F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(113, 35).mirror().addBox(-0.5F, -1.8858F, -0.1372F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(113, 35).addBox(5.5F, -1.8858F, -0.1372F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 4.5312F, 0.1532F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(63, 32).mirror().addBox(-0.5F, 8.216F, -1.5125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(112, 116).mirror().addBox(-0.5F, -0.084F, -1.0125F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.8414F, 3.9894F, 0.9021F, 0.2425F, -0.1875F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 118).mirror().addBox(0.0829F, 4.6511F, -0.2825F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 2.3312F, -3.3468F, -0.4102F, 0.0F, -0.2269F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.1854F, -0.1322F, 1.01F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 2.3312F, -3.3468F, -0.6632F, 0.0F, -0.2793F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 82).mirror().addBox(-0.1854F, -1.0195F, -1.8785F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 2.3312F, -3.3468F, -0.096F, 0.0F, -0.2793F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(41, 14).mirror().addBox(-0.2F, -2.7628F, -2.0677F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 2.3312F, -3.3468F, -0.672F, 0.0F, 0.1047F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(21, 25).mirror().addBox(-0.5F, -5.3817F, -5.231F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -2.3688F, -1.7468F, 0.2267F, 0.2725F, 0.4634F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(63, 118).mirror().addBox(-0.5F, -0.7952F, -0.8696F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -2.3688F, 4.8532F, 0.2382F, -0.0964F, 0.4034F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(120, 15).mirror().addBox(-0.5F, 0.2598F, 1.0449F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -2.3688F, 4.8532F, 0.8665F, -0.0964F, 0.4034F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.5F, -2.2877F, 0.3401F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -2.3688F, 4.8532F, 0.1858F, -0.0964F, 0.4034F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(102, 23).mirror().addBox(-0.5F, -4.273F, -0.0828F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -2.3688F, 4.8532F, -0.0323F, -0.0964F, 0.4034F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(17, 77).mirror().addBox(-0.5F, -5.0616F, -3.1173F, 1.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -2.3688F, 0.1532F, -0.1484F, 0.0F, 0.4014F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(63, 118).addBox(-0.5F, -0.7952F, -0.8696F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -2.3688F, 4.8532F, 0.2382F, 0.0964F, -0.4034F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(120, 15).addBox(-0.5F, 0.2598F, 1.0449F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.0F, -2.3688F, 4.8532F, 0.8665F, 0.0964F, -0.4034F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(100, 0).addBox(-0.5F, -2.2877F, 0.3401F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.0F, -2.3688F, 4.8532F, 0.1858F, 0.0964F, -0.4034F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(102, 23).addBox(-0.5F, -4.273F, -0.0828F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -2.3688F, 4.8532F, -0.0323F, 0.0964F, -0.4034F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(21, 25).addBox(-0.5F, -5.3817F, -5.231F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -2.3688F, -1.7468F, 0.2267F, -0.2725F, -0.4634F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 0).addBox(-0.8146F, -0.1322F, 1.01F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.3F, 2.3312F, -3.3468F, -0.6632F, 0.0F, 0.2793F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(7, 44).addBox(-2.8245F, -13.7664F, -6.1143F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 2.3312F, -3.3468F, 2.4086F, 0.0F, 0.0524F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(61, 0).addBox(-2.8245F, 15.9078F, -4.1462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.3F, 2.3312F, -3.3468F, -0.2793F, 0.0F, 0.0524F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(94, 35).addBox(-2.8245F, 11.1775F, -11.4617F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 2.3312F, -3.3468F, 0.192F, 0.0F, 0.0524F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(27, 118).addBox(-2.8245F, 3.1143F, -15.2664F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.3F, 2.3312F, -3.3468F, 0.8378F, 0.0F, 0.0524F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(86, 15).addBox(-2.8245F, 12.0991F, -9.6693F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.3F, 2.3312F, -3.3468F, 0.1396F, 0.0F, 0.0524F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 69).addBox(-2.8245F, 9.827F, 1.5405F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.3F, 2.3312F, -3.3468F, -0.6021F, 0.0F, 0.0524F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(63, 32).addBox(-0.5F, 8.216F, -1.5125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(112, 116).addBox(-0.5F, -0.084F, -1.0125F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 3.8414F, 3.9894F, 0.9021F, -0.2425F, 0.1875F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 118).addBox(-1.0829F, 4.6511F, -0.2825F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 2.3312F, -3.3468F, -0.4102F, 0.0F, 0.2269F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 82).addBox(-0.8146F, -1.0195F, -1.8785F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 2.3312F, -3.3468F, -0.096F, 0.0F, 0.2793F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(41, 14).addBox(-0.8F, -2.7628F, -2.0677F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 2.3312F, -3.3468F, -0.672F, 0.0F, -0.1047F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(17, 77).addBox(-0.5F, -5.0616F, -3.1173F, 1.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -2.3688F, 0.1532F, -0.1484F, 0.0F, -0.4014F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(44, 50).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5F, 0.0F, 0.3F, -0.6074F, 0.0705F, 0.111F));

		PartDefinition cube_r39 = leftLeg1.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(93, 76).addBox(-6.5F, -0.1109F, 0.0893F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 15.1F, -1.6F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r40 = leftLeg1.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(100, 101).addBox(-5.5F, -0.1F, 0.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.0F, 8.1F, -2.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r41 = leftLeg1.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(28, 111).addBox(-5.0F, -0.9F, -2.8F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 4.1F, 1.0F, 0.3665F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.7F, 0.0F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r42 = leftLeg2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(83, 96).addBox(-3.5F, -2.707F, -2.2331F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 2.5472F, -0.5117F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftLeg2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 94).addBox(-3.5F, -5.0F, -0.6F, 3.0F, 13.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8F, 7.6472F, -0.5117F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftLeg2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(42, 69).addBox(-2.5F, -2.6498F, -1.9321F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 3.3472F, 0.9883F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftLeg2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(10, 109).addBox(-2.5F, 0.1715F, -0.931F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.0F, 2.5472F, 0.9883F, -0.1222F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(49, 97).addBox(-2.5F, -0.4447F, -0.8239F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 16.1472F, -1.4617F, -0.6963F, -0.0561F, -0.0669F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(17, 91).addBox(-3.0F, 0.0F, -1.25F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.5553F, -1.5739F, 0.6109F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(18, 67).addBox(-4.0F, -0.5F, -6.0F, 8.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.25F, -0.4326F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(0, 25).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, 0.0F, 0.3F, 0.0967F, 0.0041F, -0.1973F));

		PartDefinition cube_r46 = rightLeg1.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(69, 92).addBox(1.5F, -0.1109F, 0.0893F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 15.1F, -1.6F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r47 = rightLeg1.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(64, 100).addBox(2.5F, -0.1F, 0.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.0F, 8.1F, -2.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r48 = rightLeg1.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(62, 87).addBox(3.0F, -0.9F, -2.8F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 4.1F, 1.0F, 0.3665F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.7F, 0.0F, 0.9058F, 0.0408F, 0.0575F));

		PartDefinition cube_r49 = rightLeg2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(96, 35).addBox(0.5F, -2.707F, -2.2331F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 2.5472F, -0.5117F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r50 = rightLeg2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(38, 92).addBox(0.5F, -5.0F, -0.6F, 3.0F, 13.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.8F, 7.6472F, -0.5117F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r51 = rightLeg2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(18, 69).addBox(1.5F, -2.6498F, -1.9321F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 3.3472F, 0.9883F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r52 = rightLeg2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(58, 107).addBox(1.5F, 0.1715F, -0.931F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.0F, 2.5472F, 0.9883F, -0.1222F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(54, 15).addBox(-2.5F, -0.4447F, -0.8239F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 16.1472F, -1.4617F, -0.9205F, 0.0935F, 0.1829F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(88, 69).addBox(-3.0F, 0.0F, -1.25F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.5553F, -1.5739F, 0.3962F, 0.0015F, -0.0349F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(63, 30).addBox(-4.0F, -0.5F, -6.0F, 8.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.25F, -0.3453F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, 8.6F, -0.1314F, 0.0865F, -0.0114F));

		PartDefinition cube_r53 = tail1.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(131, 53).addBox(0.502F, -3.0073F, -0.0872F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -5.3438F, 12.8709F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r54 = tail1.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(126, 94).addBox(0.48F, -5.023F, -0.3546F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.9438F, 13.3709F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r55 = tail1.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(95, 96).addBox(0.0F, -0.4F, -0.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 132).addBox(0.0F, -0.4F, -0.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.5616F, 13.8877F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r56 = tail1.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(36, 131).addBox(0.5F, -2.6786F, -0.4314F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.9438F, 13.3709F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r57 = tail1.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(56, 131).addBox(0.5F, -2.3788F, -0.4419F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.5438F, 11.0709F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r58 = tail1.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(74, 100).addBox(0.5F, 0.0416F, 0.0202F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -9.3438F, 11.0709F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r59 = tail1.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(123, 86).addBox(0.48F, -6.7234F, -0.3389F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.5438F, 11.0709F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r60 = tail1.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(128, 72).addBox(0.502F, -3.9129F, -0.0517F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -4.7438F, 10.5709F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r61 = tail1.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(99, 128).addBox(0.5F, -6.653F, 0.0982F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.0438F, 8.1709F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r62 = tail1.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(123, 95).addBox(0.48F, -7.2234F, -0.3389F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.0438F, 8.1709F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r63 = tail1.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(42, 132).addBox(0.002F, -1.5F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.0925F, 7.6858F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r64 = tail1.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(131, 62).addBox(0.502F, -2.8769F, -0.3983F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.0438F, 8.1709F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r65 = tail1.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(132, 44).addBox(0.002F, -0.8F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.771F, 5.5912F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r66 = tail1.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(105, 126).addBox(0.48F, -0.0853F, -0.9642F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -9.0438F, 4.9709F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r67 = tail1.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(70, 131).addBox(0.502F, -2.8682F, -0.2987F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.4438F, 5.6709F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r68 = tail1.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(59, 132).addBox(-0.001F, -0.8F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.0335F, 5.4732F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r69 = tail1.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(62, 132).addBox(0.5F, -2.7836F, -0.8451F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -5.8438F, 6.3709F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r70 = tail1.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 127).addBox(0.499F, -5.2234F, -0.2389F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.4438F, 5.6709F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r71 = tail1.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(65, 124).addBox(0.5F, -7.9F, 1.4F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4562F, 2.5709F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r72 = tail1.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(120, 109).addBox(0.48F, -4.4501F, -1.7243F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -6.2438F, 3.5709F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r73 = tail1.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(62, 124).addBox(0.502F, -0.1392F, -0.0196F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -5.8438F, 1.8709F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r74 = tail1.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(68, 124).addBox(0.502F, -0.1392F, -0.0196F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -6.1438F, -0.6291F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r75 = tail1.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(120, 117).addBox(0.48F, -4.0562F, -1.6548F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -6.9438F, 1.0709F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r76 = tail1.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(50, 124).addBox(0.5F, 8.7871F, 9.4246F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 124).addBox(0.5F, 7.4871F, 7.4246F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 124).addBox(0.5F, 5.8871F, 5.4246F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 122).addBox(0.5F, 3.9871F, 3.4246F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 122).addBox(0.5F, 1.9871F, 1.4246F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 108).addBox(0.5F, -0.2129F, -0.5754F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.1562F, 2.0709F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r77 = tail1.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(125, 0).addBox(0.5F, -7.9F, 1.4F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 28).addBox(-0.5F, -1.9F, 0.1F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.1562F, 0.0709F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r78 = tail1.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(133, 137).mirror().addBox(-3.2802F, -0.3052F, 6.8724F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(133, 137).mirror().addBox(-2.8593F, -0.1587F, 4.512F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(133, 137).mirror().addBox(-2.3953F, 0.0F, 1.9567F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(133, 137).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.7495F, 6.3501F, 0.1608F, 0.2154F, 0.0347F));

		PartDefinition cube_r79 = tail1.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(133, 137).mirror().addBox(-1.9F, -1.5257F, -0.3508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(133, 137).mirror().addBox(-1.3167F, -1.3609F, -2.9818F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.1562F, 4.0709F, 0.1608F, 0.2154F, 0.0347F));

		PartDefinition cube_r80 = tail1.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(133, 137).addBox(1.2802F, -0.3052F, 6.8724F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 137).addBox(0.8593F, -0.1587F, 4.512F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 137).addBox(0.3953F, 0.0F, 1.9567F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 137).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.7495F, 6.3501F, 0.1608F, -0.2154F, -0.0347F));

		PartDefinition cube_r81 = tail1.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(133, 137).addBox(-0.6833F, -1.3609F, -2.9818F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 137).addBox(-0.6833F, -1.3609F, -2.9818F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 137).addBox(-0.1F, -1.5257F, -0.3508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.1562F, 4.0709F, 0.1608F, -0.2154F, -0.0347F));

		PartDefinition bone = tail1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -8.0925F, 7.6858F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(131, 108).addBox(0.002F, -4.8464F, 0.4902F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 130).addBox(0.002F, -5.5464F, 2.9902F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 48).addBox(0.002F, -5.2464F, 5.0902F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.6938F, 15.7709F, 0.2184F, 0.0426F, 0.0094F));

		PartDefinition cube_r82 = tail2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(128, 0).addBox(0.5F, -4.1276F, -0.5638F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.55F, 15.5F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r83 = tail2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(128, 6).addBox(0.5F, -4.0435F, -1.0075F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.55F, 13.5F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r84 = tail2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(126, 80).addBox(0.5F, -4.3976F, -0.2199F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.55F, 10.2F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r85 = tail2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(126, 87).addBox(0.5F, -4.5266F, -0.04F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.55F, 7.5F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r86 = tail2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(87, 130).addBox(0.5F, -2.4632F, -0.1423F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.55F, 4.8F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r87 = tail2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(53, 130).addBox(0.48F, -3.2336F, -0.0478F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.55F, 4.8F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r88 = tail2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(120, 42).addBox(0.5F, -1.8297F, -0.9505F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.35F, 6.6F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r89 = tail2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(70, 87).addBox(-0.02F, -0.5F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.9082F, 3.8903F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r90 = tail2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(130, 117).addBox(0.5F, -1.7297F, -0.9505F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.35F, 4.5F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r91 = tail2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(130, 103).addBox(0.48F, -3.2336F, -0.0478F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.55F, 2.7F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r92 = tail2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(90, 130).addBox(0.5F, -2.4632F, -0.1423F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.55F, 2.7F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r93 = tail2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(90, 48).addBox(0.48F, -1.1976F, 0.0204F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -4.75F, 0.4F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r94 = tail2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(105, 23).addBox(0.5F, -0.6874F, -0.0751F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.35F, 13.6F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r95 = tail2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(3, 127).addBox(0.5F, -0.4668F, -0.1421F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.35F, 11.5F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r96 = tail2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(127, 36).addBox(0.5F, -0.0168F, 0.023F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.35F, 9.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r97 = tail2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(127, 48).addBox(0.5F, 0.345F, -0.1749F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.35F, 6.8F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r98 = tail2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(13, 84).addBox(0.5F, 0.4458F, -0.126F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.35F, 4.2F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r99 = tail2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(120, 125).addBox(0.5F, 0.3524F, -0.1196F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.35F, 1.5F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r100 = tail2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(131, 0).addBox(0.5F, -2.7297F, -0.9505F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.35F, 2.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r101 = tail2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(131, 5).addBox(0.48F, -3.2336F, -0.0478F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.55F, 0.2F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r102 = tail2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(131, 10).mirror().addBox(0.0F, -3.0576F, 8.7963F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(131, 10).mirror().addBox(0.0F, -2.552F, 6.1365F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(131, 10).mirror().addBox(0.0F, -2.3241F, 4.127F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(131, 10).mirror().addBox(0.0F, -1.9738F, 2.0468F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(131, 10).mirror().addBox(0.0F, -1.5906F, -0.5423F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2823F, 0.7502F, -0.2618F, 0.0F, -1.5708F));

		PartDefinition cube_r103 = tail2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(131, 10).addBox(0.0F, -3.0576F, 8.7963F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 10).addBox(0.0F, -2.552F, 6.1365F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 10).addBox(0.0F, -2.3241F, 4.127F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 10).addBox(0.0F, -1.9738F, 2.0468F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 10).addBox(0.0F, -1.5906F, -0.5423F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2823F, 0.7502F, -0.2618F, 0.0F, 1.5708F));

		PartDefinition cube_r104 = tail2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(131, 10).addBox(0.5F, -2.4632F, -0.1423F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.55F, 0.2F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r105 = tail2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(33, 9).addBox(-1.0F, -1.9F, 0.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2627F, -0.0616F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0627F, 16.0384F, -0.0443F, -0.1744F, 0.0077F));

		PartDefinition cube_r106 = tail3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(16, 130).addBox(0.0F, -2.9525F, -0.2477F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.059F, 14.4976F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r107 = tail3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(19, 130).addBox(0.0F, -4.0942F, 10.9025F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 130).addBox(0.0F, -4.0942F, 8.4025F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 36).addBox(0.0F, -3.7942F, 5.4025F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 127).addBox(0.0F, -3.6942F, 2.8025F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 127).addBox(0.0F, -3.5942F, -0.2975F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.059F, 1.3976F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r108 = tail3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(73, 87).addBox(0.0F, -0.1672F, -0.1912F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2196F, 14.1977F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r109 = tail3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(77, 100).addBox(0.0F, -0.0755F, -0.3559F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2196F, 12.2977F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r110 = tail3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(119, 96).addBox(0.5F, 3.2126F, 11.9249F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 128).addBox(0.5F, 2.8126F, 9.9249F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 129).addBox(0.5F, 2.3126F, 7.9249F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 129).addBox(0.5F, 1.8126F, 5.9249F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 129).addBox(0.5F, 1.2126F, 3.9249F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 129).addBox(0.5F, 0.9126F, 1.9249F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.2873F, -2.4384F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r111 = tail3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(43, 32).addBox(-1.0F, 0.1F, 0.2F, 2.0F, 2.0F, 15.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.059F, -0.4024F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.109F, 14.6976F, -0.0886F, -0.1739F, 0.0154F));

		PartDefinition cube_r112 = tail4.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(62, 87).addBox(0.0F, -1.0F, 14.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 112).addBox(0.0F, -1.2F, 12.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 28).addBox(0.0F, -1.2F, 10.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 58).addBox(0.0F, -1.5F, 8.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(120, 35).addBox(0.0F, -1.8F, 6.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(129, 95).addBox(0.0F, -2.1F, 4.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 130).addBox(0.0F, -2.2F, 2.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).addBox(-1.0F, 0.0F, -0.2F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6459F, 0.1329F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r113 = tail4.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(88, 69).addBox(0.0F, 2.6328F, 13.8088F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 91).addBox(0.0F, 2.2328F, 11.8088F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 99).addBox(0.0F, 1.9328F, 9.8088F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 107).addBox(0.0F, 1.6328F, 7.8088F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 111).addBox(0.0F, 1.3328F, 5.8088F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 80).addBox(0.0F, 1.0328F, 3.8088F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 56).addBox(0.0F, -0.1672F, 1.8088F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3287F, -0.4999F, 0.2094F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(57, 15).addBox(-0.5F, -0.4948F, -0.2213F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.005F))
				.texOffs(72, 80).addBox(0.0F, -1.4948F, 0.7787F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 80).addBox(0.0F, -1.4948F, 2.7787F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 75).addBox(0.0F, -1.4948F, 4.7787F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 6).addBox(0.0F, -1.2948F, 6.7787F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 50).addBox(0.0F, -1.1948F, 8.7787F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 49).addBox(0.0F, -1.0948F, 10.7787F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5041F, 15.9329F, -0.1839F, 0.0858F, -0.0159F));

		PartDefinition cube_r114 = tail5.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(10, 25).addBox(0.0F, 3.5062F, 10.1585F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 49).addBox(0.0F, 2.9062F, 8.1585F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 44).addBox(0.0F, 1.4062F, 6.1585F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 69).addBox(0.0F, 1.0062F, 4.1585F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 69).addBox(0.0F, 0.5062F, 2.1585F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 77).addBox(0.0F, 0.0062F, 0.1585F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8246F, -0.4329F, 0.3578F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(53, 75).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4448F, 12.8787F, -0.1329F, 0.173F, -0.023F));

		PartDefinition cube_r115 = tail6.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(0, 25).addBox(0.0F, 4.6062F, 14.2585F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 0).addBox(0.0F, 4.1062F, 12.2585F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2694F, -13.3115F, 0.3578F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(45, 54).addBox(-0.5F, -0.1614F, -0.0016F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.15F, 10.0F, -0.3193F, 0.2909F, -0.0945F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(54, 0).addBox(-1.0F, -1.669F, -19.9704F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -5.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(0, 83).addBox(-1.5F, 0.0F, -0.1F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.669F, -7.8704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(36, 121).addBox(0.0F, -6.9195F, -0.3541F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 100).addBox(0.0F, -7.25F, 2.132F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.769F, -18.4704F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(7, 118).addBox(-0.02F, -9.9578F, -0.3897F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 49).addBox(-0.02F, -10.5465F, 2.0482F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.769F, -18.4704F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(131, 71).addBox(0.002F, -9.9027F, -0.5944F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 131).addBox(0.002F, -10.3198F, 1.8787F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.769F, -18.4704F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(24, 116).addBox(0.0F, -10.8879F, -0.0201F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.569F, -2.0704F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(13, 25).addBox(-0.02F, -10.9889F, 0.2491F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.569F, -2.0704F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(86, 116).addBox(0.0F, -10.8879F, -0.0201F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.969F, -4.6704F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(106, 112).addBox(-0.02F, -10.9889F, 0.2491F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.969F, -4.6704F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(89, 116).addBox(0.0F, -10.8879F, -0.0201F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.969F, -7.3704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(83, 114).addBox(-0.02F, -10.9889F, 0.2491F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.969F, -7.3704F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(92, 116).addBox(0.0F, -10.8879F, -0.0201F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.969F, -9.6704F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(15, 116).addBox(-0.02F, -10.9889F, 0.2491F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.969F, -9.6704F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(18, 116).addBox(-0.02F, -10.9889F, 0.2491F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.969F, -12.0704F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(109, 116).addBox(0.0F, -10.8879F, -0.0201F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.969F, -12.0704F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(117, 116).addBox(0.0F, -10.8931F, -0.32F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.769F, -13.9704F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(21, 116).addBox(-0.02F, -10.9732F, -0.0505F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.769F, -13.9704F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(125, 70).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.369F, -1.6704F, -0.1146F, -0.0799F, -0.903F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(128, 123).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.369F, -1.6704F, -0.1375F, -0.0242F, -0.4696F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(49, 83).mirror().addBox(-5.6882F, -2.8327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.369F, -1.6704F, -0.0503F, -0.1303F, -1.4977F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(125, 121).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.469F, -4.2704F, -0.0859F, -0.06F, -0.8177F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(129, 21).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.469F, -4.2704F, -0.1038F, -0.0317F, -0.3939F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(73, 23).mirror().addBox(-7.6882F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.469F, -4.2704F, -0.0376F, -0.0977F, -1.4119F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(94, 55).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -7.0704F, -0.0313F, -0.0815F, -1.3252F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(126, 15).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -7.0704F, -0.0715F, -0.05F, -0.7312F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(129, 23).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -7.0704F, -0.0859F, -0.0151F, -0.2961F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(94, 44).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -9.0704F, -0.044F, -0.114F, -1.289F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(126, 31).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -9.0704F, -0.1002F, -0.07F, -0.6946F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(129, 27).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -9.0704F, -0.1203F, -0.0212F, -0.2605F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(86, 12).mirror().addBox(-13.6882F, -2.8327F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -11.2704F, -0.0376F, -0.0977F, -1.2548F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(126, 34).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -11.2704F, -0.0859F, -0.06F, -0.6606F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(129, 29).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -11.2704F, -0.1031F, -0.0182F, -0.226F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(129, 88).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -13.4704F, -0.0516F, -0.0091F, -0.2092F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(129, 81).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -13.4704F, -0.0429F, -0.03F, -0.6451F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(78, 46).mirror().addBox(-14.6882F, -2.8327F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -13.4704F, -0.0188F, -0.0489F, -1.2387F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(13, 47).mirror().addBox(-15.6882F, -2.8327F, -0.5F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -15.9704F, 0.0063F, 0.0163F, -1.2042F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(129, 83).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -15.9704F, 0.0143F, 0.01F, -0.6108F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(129, 90).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -15.9704F, 0.0172F, 0.003F, -0.1745F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(-16.6882F, -2.8327F, -0.5F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -18.4704F, 0.0251F, 0.0652F, -1.2035F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(126, 101).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -18.4704F, 0.0572F, 0.04F, -0.6097F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(129, 79).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -18.4704F, 0.0688F, 0.0121F, -0.1741F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(49, 83).addBox(2.6882F, -2.8327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.369F, -1.6704F, -0.0503F, 0.1303F, 1.4977F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(128, 123).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.369F, -1.6704F, -0.1375F, 0.0242F, 0.4696F));

		PartDefinition cube_r158 = body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(125, 70).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.369F, -1.6704F, -0.1146F, 0.0799F, 0.903F));

		PartDefinition cube_r159 = body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(73, 23).addBox(2.6882F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.469F, -4.2704F, -0.0376F, 0.0977F, 1.4119F));

		PartDefinition cube_r160 = body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(129, 21).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.469F, -4.2704F, -0.1038F, 0.0317F, 0.3939F));

		PartDefinition cube_r161 = body.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(125, 121).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.469F, -4.2704F, -0.0859F, 0.06F, 0.8177F));

		PartDefinition cube_r162 = body.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(129, 23).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -7.0704F, -0.0859F, 0.0151F, 0.2961F));

		PartDefinition cube_r163 = body.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(126, 15).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -7.0704F, -0.0715F, 0.05F, 0.7312F));

		PartDefinition cube_r164 = body.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(94, 55).addBox(2.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -7.0704F, -0.0313F, 0.0815F, 1.3252F));

		PartDefinition cube_r165 = body.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(129, 27).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -9.0704F, -0.1203F, 0.0212F, 0.2605F));

		PartDefinition cube_r166 = body.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(126, 31).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -9.0704F, -0.1002F, 0.07F, 0.6946F));

		PartDefinition cube_r167 = body.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(94, 44).addBox(2.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -9.0704F, -0.044F, 0.114F, 1.289F));

		PartDefinition cube_r168 = body.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(129, 29).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -11.2704F, -0.1031F, 0.0182F, 0.226F));

		PartDefinition cube_r169 = body.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(126, 34).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -11.2704F, -0.0859F, 0.06F, 0.6606F));

		PartDefinition cube_r170 = body.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(86, 12).addBox(2.6882F, -2.8327F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -11.2704F, -0.0376F, 0.0977F, 1.2548F));

		PartDefinition cube_r171 = body.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(78, 46).addBox(2.6882F, -2.8327F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -13.4704F, -0.0188F, 0.0489F, 1.2387F));

		PartDefinition cube_r172 = body.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(129, 81).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -13.4704F, -0.0429F, 0.03F, 0.6451F));

		PartDefinition cube_r173 = body.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(129, 88).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -13.4704F, -0.0516F, 0.0091F, 0.2092F));

		PartDefinition cube_r174 = body.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(129, 90).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -15.9704F, 0.0172F, -0.003F, 0.1745F));

		PartDefinition cube_r175 = body.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(129, 83).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -15.9704F, 0.0143F, -0.01F, 0.6108F));

		PartDefinition cube_r176 = body.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(13, 47).addBox(2.6882F, -2.8327F, -0.5F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -15.9704F, 0.0063F, -0.0163F, 1.2042F));

		PartDefinition cube_r177 = body.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(71, 0).addBox(2.6882F, -2.8327F, -0.5F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -18.4704F, 0.0251F, -0.0652F, 1.2035F));

		PartDefinition cube_r178 = body.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(126, 101).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -18.4704F, 0.0572F, -0.04F, 0.6097F));

		PartDefinition cube_r179 = body.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(129, 79).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -18.4704F, 0.0688F, -0.0121F, 0.1741F));

		PartDefinition cube_r180 = body.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(61, 50).addBox(-6.5F, -4.7F, 7.9F, 12.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-8.5F, -4.7F, -0.1F, 16.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 16.031F, -19.8704F, -0.1745F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.069F, -19.8704F, 0.131F, 0.0433F, 0.0057F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(104, 94).mirror().addBox(-7.3085F, -0.0315F, -0.275F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 12.5479F, -10.9906F, -0.4855F, 0.6104F, -0.0926F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(21, 37).mirror().addBox(-5.6F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 12.0479F, -11.5906F, -0.5463F, 0.5438F, 0.5371F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(94, 53).mirror().addBox(-9.6085F, -0.0315F, -0.275F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 12.5479F, -10.9906F, -0.2629F, 0.7674F, -0.3164F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(108, 73).mirror().addBox(0.0F, -0.5F, -2.8F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 9.606F, -13.7162F, -1.0647F, -0.2472F, 0.4157F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(73, 26).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7F, -10.5F, 0.0631F, 0.1628F, -1.234F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(100, 67).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7F, -10.5F, 0.1434F, 0.0998F, -0.6386F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(127, 25).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7F, -10.5F, 0.1719F, 0.0302F, -0.2068F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(42, 30).mirror().addBox(-14.6882F, -2.8327F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, -8.2F, 0.044F, 0.114F, -1.2018F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(105, 46).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, -8.2F, 0.1002F, 0.07F, -0.6074F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(127, 42).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, -8.2F, 0.1203F, 0.0212F, -0.1733F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(63, 44).mirror().addBox(-16.6882F, -2.8327F, -0.5F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -5.8F, 0.0251F, 0.0652F, -1.2035F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(108, 18).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -5.8F, 0.0572F, 0.04F, -0.6097F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(127, 67).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -5.8F, 0.0688F, 0.0121F, -0.1741F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(63, 40).mirror().addBox(-17.6882F, -2.8327F, -0.5F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -3.3F, 0.0063F, 0.0163F, -1.2042F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(111, 27).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -3.3F, 0.0143F, 0.01F, -0.6108F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(128, 86).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -3.3F, 0.0172F, 0.003F, -0.1745F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(128, 93).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -0.6F, -0.0516F, -0.0091F, -0.1743F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(118, 76).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -0.6F, -0.0429F, -0.03F, -0.6102F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(63, 42).mirror().addBox(-17.6882F, -2.8327F, -0.5F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -0.6F, -0.0188F, -0.0489F, -1.2038F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(54, 69).mirror().addBox(-0.5F, -0.9228F, -3.924F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.5F, 4.631F, -7.1512F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(42, 32).mirror().addBox(0.0F, -2.3496F, -5.9995F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.0F, 6.831F, -10.4512F, 0.7184F, -0.7298F, -0.4276F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(112, 58).mirror().addBox(-0.5F, -0.9228F, -3.924F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.5F, 4.631F, -7.1512F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(25, 56).mirror().addBox(0.1F, -0.9844F, 0.1548F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.1F, 4.731F, -7.1512F, 0.9076F, 0.0F, 0.0175F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(36, 85).mirror().addBox(-0.0267F, -1.6381F, 2.7976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-7.9F, 0.531F, -4.3512F, 0.8378F, 0.0F, 0.1047F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(61, 60).mirror().addBox(-0.0267F, -0.5858F, 0.0158F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.9F, 0.531F, -4.3512F, 1.2392F, 0.0F, 0.1047F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(36, 85).addBox(-0.9733F, -1.6381F, 2.7976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(7.9F, 0.531F, -4.3512F, 0.8378F, 0.0F, -0.1047F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(42, 32).addBox(-1.0F, -2.3496F, -5.9995F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, 6.831F, -10.4512F, 0.7184F, 0.7298F, 0.4276F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(54, 69).addBox(-0.5F, -0.9228F, -3.924F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.5F, 4.631F, -7.1512F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(112, 58).addBox(-0.5F, -0.9228F, -3.924F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.5F, 4.631F, -7.1512F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(25, 56).addBox(-1.1F, -0.9844F, 0.1548F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.1F, 4.731F, -7.1512F, 0.9076F, 0.0F, -0.0175F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(61, 60).addBox(-0.9733F, -0.5858F, 0.0158F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.9F, 0.531F, -4.3512F, 1.2392F, 0.0F, -0.1047F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(114, 52).addBox(-1.0F, -2.2141F, -0.0945F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.5F, -3.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(53, 118).addBox(-0.02F, -9.599F, -0.7379F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -0.4F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(73, 131).addBox(0.002F, -3.0289F, 0.007F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.1F, -0.8F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(10, 124).addBox(0.0F, -7.0543F, 7.9502F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(125, 109).addBox(0.0F, -6.0543F, 5.3502F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 124).addBox(0.0F, -7.0543F, 2.7502F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 124).addBox(0.0F, -6.9543F, 0.3502F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -9.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(102, 128).addBox(-0.02F, -3.4638F, -0.0437F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, -3.4F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(128, 107).addBox(0.002F, -3.6638F, -0.0437F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, -3.4F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(58, 81).addBox(-0.02F, 0.1F, -1.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.8738F, -5.4589F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(127, 25).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7F, -10.5F, 0.1719F, -0.0302F, 0.2068F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(100, 67).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7F, -10.5F, 0.1434F, -0.0998F, 0.6386F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(73, 26).addBox(2.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7F, -10.5F, 0.0631F, -0.1628F, 1.234F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(127, 42).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4F, -8.2F, 0.1203F, -0.0212F, 0.1733F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(105, 46).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4F, -8.2F, 0.1002F, -0.07F, 0.6074F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(42, 30).addBox(2.6882F, -2.8327F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4F, -8.2F, 0.044F, -0.114F, 1.2018F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(127, 67).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -5.8F, 0.0688F, -0.0121F, 0.1741F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(108, 18).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -5.8F, 0.0572F, -0.04F, 0.6097F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(63, 44).addBox(2.6882F, -2.8327F, -0.5F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -5.8F, 0.0251F, -0.0652F, 1.2035F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(128, 86).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -3.3F, 0.0172F, -0.003F, 0.1745F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(111, 27).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -3.3F, 0.0143F, -0.01F, 0.6108F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(63, 40).addBox(2.6882F, -2.8327F, -0.5F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -3.3F, 0.0063F, -0.0163F, 1.2042F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(63, 42).addBox(2.6882F, -2.8327F, -0.5F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -0.6F, -0.0188F, 0.0489F, 1.2038F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(118, 76).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -0.6F, -0.0429F, 0.03F, 0.6102F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(0, 14).addBox(-9.0F, -3.9994F, -6.0349F, 17.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 17.1F, -2.3F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(128, 93).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -0.6F, -0.0516F, 0.0091F, 0.1743F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(108, 74).addBox(0.002F, -0.5F, -0.7F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.8738F, -5.4589F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(33, 124).addBox(0.0F, -6.8326F, 0.0307F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -11.1F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(108, 73).addBox(-2.0F, -0.5F, -2.8F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 9.606F, -13.7162F, -1.0647F, 0.2472F, -0.4157F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(21, 37).addBox(-0.4F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 12.0479F, -11.5906F, -0.5463F, -0.5438F, -0.5371F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(104, 94).addBox(-0.6915F, -0.0315F, -0.275F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 12.5479F, -10.9906F, -0.4855F, -0.6104F, 0.0926F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(94, 53).addBox(-0.3915F, -0.0315F, -0.275F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 12.5479F, -10.9906F, -0.2629F, -0.7674F, 0.3164F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(95, 96).addBox(-3.0F, -1.104F, 0.0937F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 11.5427F, -13.2182F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(110, 97).addBox(-1.0F, 2.5F, -3.8F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 9.5427F, -10.2182F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(40, 69).addBox(-1.0F, -1.9F, 0.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, -12.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(8.0F, 9.2F, -10.7F, 0.2106F, 0.0059F, -0.056F));

		PartDefinition cube_r244 = leftArm1.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(126, 54).addBox(-1.0126F, -2.1148F, -0.0627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.8847F, 0.4893F, 0.2018F, -0.7676F, 0.1498F));

		PartDefinition cube_r245 = leftArm1.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(95, 105).addBox(-1.0F, -1.9618F, -0.1285F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.8847F, 0.4893F, 0.5713F, -0.6678F, 0.2037F));

		PartDefinition cube_r246 = leftArm1.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(97, 14).addBox(6.0F, -1.6842F, 0.0838F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 0.6847F, 0.0893F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r247 = leftArm1.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(61, 60).addBox(6.0F, 0.7F, 1.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-6.5F, 0.8847F, -0.8107F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(28, 77).addBox(-0.8F, -0.2307F, -0.4734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 25).addBox(-0.8F, -0.2307F, -1.5734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, 5.0347F, 0.6893F, -1.0908F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(45, 107).addBox(-2.0F, 0.0F, -2.5F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 3.8693F, 0.2266F, 0.0F, 0.0F, 0.4363F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.0F, 9.2F, -10.7F, 0.2618F, -0.2618F, 0.0F));

		PartDefinition cube_r248 = rightArm1.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(125, 117).addBox(0.0126F, -2.1148F, -0.0627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 1.8847F, 0.4893F, 0.2018F, 0.7676F, -0.1498F));

		PartDefinition cube_r249 = rightArm1.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(100, 2).addBox(0.0F, -1.9618F, -0.1285F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 1.8847F, 0.4893F, 0.5713F, 0.6678F, -0.2037F));

		PartDefinition cube_r250 = rightArm1.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(69, 60).addBox(-7.0F, -1.6842F, 0.0838F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 0.6847F, 0.0893F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r251 = rightArm1.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(25, 56).addBox(-7.0F, 0.7F, 1.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.5F, 0.8847F, -0.8107F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(42, 32).addBox(-0.2F, -0.2307F, -0.4734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 14).addBox(-0.2F, -0.2307F, -1.5734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 5.0347F, 0.6893F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(86, 105).addBox(0.0F, 0.0F, -2.5F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 3.8693F, 0.2266F, 0.0F, 0.0F, -0.4363F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6F, -12.0F, -0.6504F, -0.1915F, 0.0368F));

		PartDefinition cube_r252 = neck1.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(124, 35).addBox(0.0F, -3.5F, -0.1F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2932F, -3.2134F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r253 = neck1.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(56, 121).addBox(0.0F, -7.2385F, 0.7884F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8415F, -5.552F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r254 = neck1.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(97, 14).addBox(-1.0F, -2.0F, 0.1F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 2.7415F, -5.052F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r255 = neck1.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(-6.7529F, -0.8788F, -0.5554F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.451F, -3.8399F, 0.5914F, 0.9493F, -1.138F));

		PartDefinition cube_r256 = neck1.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(62, 97).mirror().addBox(-1.9601F, -0.0556F, -0.5554F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.451F, -3.8399F, 0.9222F, 0.6431F, -0.6842F));

		PartDefinition cube_r257 = neck1.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(47, 92).mirror().addBox(-3.8295F, -0.8211F, -0.3799F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7474F, -1.8213F, 0.7816F, 0.7485F, -0.5979F));

		PartDefinition cube_r258 = neck1.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(96, 90).mirror().addBox(-2.0051F, 0.029F, -0.3799F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7474F, -1.8213F, 0.9678F, 0.41F, -0.2647F));

		PartDefinition cube_r259 = neck1.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(42, 28).mirror().addBox(-7.7157F, -2.8222F, -0.3799F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7474F, -1.8213F, 0.0908F, 1.0213F, -1.4612F));

		PartDefinition cube_r260 = neck1.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(62, 97).addBox(-0.0399F, -0.0556F, -0.5554F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.451F, -3.8399F, 0.9222F, -0.6431F, 0.6842F));

		PartDefinition cube_r261 = neck1.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(0, 39).addBox(1.7529F, -0.8788F, -0.5554F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.451F, -3.8399F, 0.5914F, -0.9493F, 1.138F));

		PartDefinition cube_r262 = neck1.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(42, 28).addBox(2.7157F, -2.8222F, -0.3799F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7474F, -1.8213F, 0.0908F, -1.0213F, 1.4612F));

		PartDefinition cube_r263 = neck1.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(96, 90).addBox(0.0051F, 0.029F, -0.3799F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7474F, -1.8213F, 0.9678F, -0.41F, 0.2647F));

		PartDefinition cube_r264 = neck1.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(47, 92).addBox(1.8295F, -0.8211F, -0.3799F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7474F, -1.8213F, 0.7816F, -0.7485F, 0.5979F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7415F, -4.952F, 0.1095F, -0.2314F, -0.1578F));

		PartDefinition cube_r265 = neck2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(72, 121).addBox(0.0F, -3.9F, -0.5F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.3088F, -1.582F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r266 = neck2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(59, 122).addBox(0.0F, -3.6F, -0.5F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.8183F, -3.2832F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r267 = neck2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(86, 28).mirror().addBox(-2.0016F, -0.0199F, -0.554F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6417F, -6.5806F, 0.5856F, 0.7245F, -0.7051F));

		PartDefinition cube_r268 = neck2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(49, 81).mirror().addBox(-5.8057F, -0.8639F, -0.554F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6417F, -6.5806F, 0.151F, 0.8876F, -1.297F));

		PartDefinition cube_r269 = neck2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(13, 82).mirror().addBox(-5.7687F, -0.8843F, -0.3345F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1343F, -3.2954F, 0.151F, 0.8876F, -1.297F));

		PartDefinition cube_r270 = neck2.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(49, 87).mirror().addBox(-1.9767F, -0.0539F, -0.3345F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1343F, -3.2954F, 0.5856F, 0.7245F, -0.7051F));

		PartDefinition cube_r271 = neck2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(21, 39).mirror().addBox(-6.6888F, -0.8865F, -0.5178F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1018F, -1.0753F, 0.175F, 0.9379F, -1.2781F));

		PartDefinition cube_r272 = neck2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(9, 94).mirror().addBox(-1.9053F, -0.0897F, -0.5178F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1018F, -1.0753F, 0.6405F, 0.7577F, -0.668F));

		PartDefinition cube_r273 = neck2.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(49, 81).addBox(1.8057F, -0.8639F, -0.554F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6417F, -6.5806F, 0.151F, -0.8876F, 1.297F));

		PartDefinition cube_r274 = neck2.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(86, 28).addBox(0.0016F, -0.0199F, -0.554F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6417F, -6.5806F, 0.5856F, -0.7245F, 0.7051F));

		PartDefinition cube_r275 = neck2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(49, 87).addBox(-0.0233F, -0.0539F, -0.3345F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1343F, -3.2954F, 0.5856F, -0.7245F, 0.7051F));

		PartDefinition cube_r276 = neck2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(13, 82).addBox(1.7687F, -0.8843F, -0.3345F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1343F, -3.2954F, 0.151F, -0.8876F, 1.297F));

		PartDefinition cube_r277 = neck2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(21, 39).addBox(1.6888F, -0.8865F, -0.5178F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1018F, -1.0753F, 0.175F, -0.9379F, 1.2781F));

		PartDefinition cube_r278 = neck2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(9, 94).addBox(-0.0947F, -0.0897F, -0.5178F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1018F, -1.0753F, 0.6405F, -0.7577F, 0.668F));

		PartDefinition cube_r279 = neck2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(95, 119).addBox(0.0F, -6.6903F, -1.6933F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7F, -5.4F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r280 = neck2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(36, 81).addBox(-1.0F, -0.1F, -1.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7F, -6.3F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8572F, -7.4387F, 0.3514F, -0.4393F, -0.2005F));

		PartDefinition cube_r281 = neck3.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(30, 26).addBox(-0.02F, -0.2F, 0.4F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.4483F, -3.3481F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r282 = neck3.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(39, 121).addBox(0.5F, -4.32F, 0.0903F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.0315F, -3.7346F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r283 = neck3.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(122, 47).addBox(0.5F, -4.8857F, -0.0876F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.7315F, -5.7346F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r284 = neck3.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(123, 56).addBox(0.5F, -3.6101F, -0.1583F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.7315F, -7.8346F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r285 = neck3.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(50, 87).addBox(-0.5F, -0.1185F, -6.9683F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.1315F, -2.0346F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r286 = neck3.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(49, 7).mirror().addBox(-1.9618F, -0.0375F, -0.6859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9373F, -5.031F, 0.2884F, 0.4744F, -0.8749F));

		PartDefinition cube_r287 = neck3.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(87, 35).mirror().addBox(-3.7622F, -0.8631F, -0.6859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9373F, -5.031F, 0.0425F, 0.548F, -1.3695F));

		PartDefinition cube_r288 = neck3.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(37, 81).mirror().addBox(-1.9025F, -0.0878F, -0.5678F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9363F, -3.187F, 0.2042F, 0.3792F, -0.9098F));

		PartDefinition cube_r289 = neck3.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(54, 75).mirror().addBox(-4.6872F, -0.8836F, -0.5678F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9363F, -3.187F, 0.0157F, 0.4281F, -1.3821F));

		PartDefinition cube_r290 = neck3.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(86, 7).mirror().addBox(-2.061F, 0.0259F, -0.612F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9681F, -1.6577F, 0.2158F, 0.393F, -0.9055F));

		PartDefinition cube_r291 = neck3.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(78, 48).mirror().addBox(-5.8788F, -0.8475F, -0.612F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9681F, -1.6577F, 0.0193F, 0.4452F, -1.3805F));

		PartDefinition cube_r292 = neck3.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(87, 35).addBox(1.7622F, -0.8631F, -0.6859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9373F, -5.031F, 0.0425F, -0.548F, 1.3695F));

		PartDefinition cube_r293 = neck3.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(49, 7).addBox(-0.0382F, -0.0375F, -0.6859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9373F, -5.031F, 0.2884F, -0.4744F, 0.8749F));

		PartDefinition cube_r294 = neck3.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(54, 75).addBox(1.6872F, -0.8836F, -0.5678F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9363F, -3.187F, 0.0157F, -0.4281F, 1.3821F));

		PartDefinition cube_r295 = neck3.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(37, 81).addBox(-0.0975F, -0.0878F, -0.5678F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9363F, -3.187F, 0.2042F, -0.3792F, 0.9098F));

		PartDefinition cube_r296 = neck3.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(78, 48).addBox(1.8788F, -0.8475F, -0.612F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9681F, -1.6577F, 0.0193F, -0.4452F, 1.3805F));

		PartDefinition cube_r297 = neck3.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(86, 7).addBox(0.061F, 0.0259F, -0.612F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9681F, -1.6577F, 0.2158F, -0.393F, 0.9055F));

		PartDefinition cube_r298 = neck3.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(100, 119).addBox(0.5F, -5.7395F, -1.7692F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2315F, -0.1346F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r299 = neck3.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(36, 115).addBox(-0.5F, -0.5F, -4.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.0685F, 1.3654F, -0.48F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6315F, -8.6346F, 0.3505F, -0.0791F, -0.037F));

		PartDefinition cube_r300 = head.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(0, 70).addBox(-2.5F, -3.297F, -0.0727F, 5.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.308F, -5.3541F, -1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r301 = head.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(76, 75).addBox(-1.5F, -13.0F, 0.0F, 3.0F, 11.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.2782F, -17.1418F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r302 = head.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(66, 75).addBox(-1.5F, 1.55F, 0.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.2782F, -17.0418F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r303 = head.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(15, 109).addBox(-1.5F, -3.1632F, -0.3774F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.1782F, -17.5418F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r304 = head.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(120, 25).addBox(-1.0F, -2.9704F, 0.0021F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0357F, -17.6125F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r305 = head.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(125, 44).addBox(-1.0F, -1.9426F, 0.0181F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7357F, -18.6125F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r306 = head.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(86, 2).addBox(-1.5F, -0.05F, 1.5F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.01F))
				.texOffs(128, 128).addBox(-0.5F, -0.85F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(122, 21).addBox(-1.0F, 0.15F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 6.2791F, -16.2231F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r307 = head.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(124, 63).addBox(-1.0F, -2.0F, -2.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 6.6029F, -15.6281F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r308 = head.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(54, 7).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 6.6029F, -15.6781F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r309 = head.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(28, 77).mirror().addBox(-0.4587F, 2.6472F, 0.439F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 1.1782F, -7.8551F, -0.0727F, -0.3021F, -0.0514F));

		PartDefinition cube_r310 = head.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(115, 80).mirror().addBox(-0.1158F, -3.9362F, 3.7002F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 1.1782F, -7.8551F, -0.0411F, -0.3107F, 0.0525F));

		PartDefinition cube_r311 = head.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(108, 10).mirror().addBox(-0.1158F, -2.5392F, 0.5635F, 3.0F, 3.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 1.1782F, -7.8551F, 0.2556F, -0.3107F, 0.0525F));

		PartDefinition cube_r312 = head.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(65, 60).mirror().addBox(-0.1158F, -1.6691F, -2.3855F, 2.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 1.1782F, -7.8551F, -0.0062F, -0.3107F, 0.0525F));

		PartDefinition cube_r313 = head.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(28, 77).addBox(-0.5413F, 2.6472F, 0.439F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 1.1782F, -7.8551F, -0.0727F, 0.3021F, 0.0514F));

		PartDefinition cube_r314 = head.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(109, 0).addBox(-2.0F, -1.9707F, -3.8298F, 4.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 5.5282F, -11.8551F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r315 = head.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(87, 26).addBox(-2.0F, -2.0129F, -5.3713F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.9282F, -7.5551F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r316 = head.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(115, 80).addBox(-2.8842F, -3.9362F, 3.7002F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.7F, 1.1782F, -7.8551F, -0.0411F, 0.3107F, -0.0525F));

		PartDefinition cube_r317 = head.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(108, 10).addBox(-2.8842F, -2.5392F, 0.5635F, 3.0F, 3.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.7F, 1.1782F, -7.8551F, 0.2556F, 0.3107F, -0.0525F));

		PartDefinition cube_r318 = head.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(65, 60).addBox(-1.8842F, -1.6691F, -2.3855F, 2.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 1.1782F, -7.8551F, -0.0062F, 0.3107F, -0.0525F));

		PartDefinition cube_r319 = head.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(71, 7).addBox(-1.0F, 1.1F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -4.2865F, -2.4188F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r320 = head.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(11, 98).addBox(-3.5F, -3.0317F, -1.993F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8718F, 0.3449F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r321 = head.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(41, 0).addBox(-4.0F, -2.9931F, -3.0028F, 8.0F, 3.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 2.0282F, 0.9449F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r322 = head.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(93, 57).addBox(-4.0F, -0.9F, -3.3F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.9282F, 1.1449F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r323 = head.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(13, 49).addBox(-4.0F, -2.9F, -3.0F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 4.9282F, 1.1449F, 0.0698F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6718F, 0.2449F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(128, 58).addBox(3.0F, -0.0145F, -0.8007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(128, 113).addBox(3.0F, 0.0093F, -0.933F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7F, 0.7F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(13, 44).addBox(-1.57F, -2.2691F, 3.3145F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(113, 49).addBox(-1.85F, -2.2691F, 3.3145F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 60).addBox(-1.87F, -2.5691F, 3.5145F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.7F, 1.85F, -8.1F, -0.0062F, 0.3107F, -0.0525F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(88, 76).addBox(-1.5F, -0.8F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.03F, 4.0261F, -16.3399F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(76, 75).addBox(-0.7052F, 1.1536F, -1.2002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(123, 123).addBox(-0.7052F, -0.0464F, -0.0002F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5F, 2.25F, -12.2867F, -0.4127F, 0.0402F, 0.1195F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(54, 50).addBox(-1.97F, -0.8724F, -0.7192F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.6F, -11.4F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(105, 67).addBox(-1.97F, -0.841F, -3.5191F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 4.6F, -7.8F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(0, 110).addBox(-1.4557F, -0.4616F, -1.9237F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.35F, -6.5F, -0.1458F, 0.3107F, -0.0525F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(74, 114).addBox(-0.4341F, -1.106F, -0.0076F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.5F, 0.85F, -9.6867F, -1.0759F, 0.0402F, 0.1195F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(119, 6).addBox(-0.2698F, -0.0369F, 0.0522F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5F, 0.55F, -6.4867F, -1.5646F, 0.0402F, 0.1195F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(123, 128).addBox(-0.2818F, 0.0258F, -1.0398F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.5F, 0.65F, -6.4867F, -1.2504F, 0.0402F, 0.1195F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(90, 48).addBox(-4.0F, -1.0028F, -3.0295F, 8.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.02F, 4.2365F, -2.7703F, -1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(71, 2).addBox(-4.0F, 0.0702F, -1.9538F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.02F, 3.8365F, 0.0297F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(108, 32).addBox(-4.0F, -1.0599F, -1.0284F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.02F, 1.2365F, -2.6703F, -2.3736F, 0.0F, 0.0F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(93, 62).addBox(-4.0F, -0.0007F, -2.0464F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.02F, 2.0365F, -0.6703F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(11, 104).addBox(-4.0F, 0.0123F, -0.9563F, 8.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.02F, 0.5365F, -0.0703F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(104, 90).addBox(-4.0F, -0.074F, 0.0299F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.02F, -0.1635F, -0.7703F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(96, 84).addBox(-4.0F, -1.8F, -1.0F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.02F, 1.5365F, -1.0703F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(113, 103).addBox(-1.478F, 0.1091F, 0.1058F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.1722F, 2.283F, -5.4203F, 0.1422F, 0.3107F, -0.0525F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(114, 64).addBox(-1.0F, -0.7F, -1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1722F, 3.283F, -4.0203F, -0.8876F, 0.3107F, -0.0525F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(115, 86).addBox(-1.0F, -1.1F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0205F, 0.2868F, -4.0026F, 0.4301F, 0.3107F, -0.0525F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(113, 42).addBox(-0.3057F, -4.4426F, -2.1146F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5F, -0.25F, -9.5867F, -1.7396F, 0.0318F, 0.1219F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(0, 44).addBox(-0.7565F, -6.0072F, -0.0654F, 1.0F, 6.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5F, 1.85F, -14.5867F, -1.1806F, 0.0402F, 0.1195F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(109, 108).addBox(-1.0277F, -2.9457F, 0.0446F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 3.25F, -17.1867F, -1.041F, 0.0402F, 0.1195F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(30, 98).addBox(-0.4F, -0.5F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0369F, -1.3112F, -3.5788F, 0.6089F, 0.2133F, 1.5354F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(111, 19).addBox(-0.3057F, -3.1746F, -0.0031F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.25F, -9.5867F, -1.0065F, 0.0318F, 0.1219F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6718F, 0.2449F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(128, 58).mirror().addBox(-4.0F, -0.0145F, -0.8007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(128, 113).mirror().addBox(-4.0F, 0.0093F, -0.933F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.7F, 0.7F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(13, 44).mirror().addBox(-0.43F, -2.2691F, 3.3145F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(113, 49).mirror().addBox(-0.15F, -2.2691F, 3.3145F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 60).mirror().addBox(-0.13F, -2.5691F, 3.5145F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 1.85F, -8.1F, -0.0062F, -0.3107F, 0.0525F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(88, 76).mirror().addBox(-1.5F, -0.8F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.03F, 4.0261F, -16.3399F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(76, 75).mirror().addBox(-0.2948F, 1.1536F, -1.2002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(123, 123).mirror().addBox(-0.2948F, -0.0464F, -0.0002F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.25F, -12.2867F, -0.4127F, -0.0402F, -0.1195F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(54, 50).mirror().addBox(-2.03F, -0.8724F, -0.7192F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.6F, -11.4F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(105, 67).mirror().addBox(-2.03F, -0.841F, -3.5191F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.6F, -7.8F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(0, 110).mirror().addBox(-0.5443F, -0.4616F, -1.9237F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.35F, -6.5F, -0.1458F, -0.3107F, 0.0525F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(74, 114).mirror().addBox(-0.5659F, -1.106F, -0.0076F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.85F, -9.6867F, -1.0759F, -0.0402F, -0.1195F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(119, 6).mirror().addBox(-0.7302F, -0.0369F, 0.0522F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.55F, -6.4867F, -1.5646F, -0.0402F, -0.1195F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(123, 128).mirror().addBox(-0.7182F, 0.0258F, -1.0398F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.65F, -6.4867F, -1.2504F, -0.0402F, -0.1195F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(90, 48).mirror().addBox(-4.0F, -1.0028F, -3.0295F, 8.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.02F, 4.2365F, -2.7703F, -1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(71, 2).mirror().addBox(-4.0F, 0.0702F, -1.9538F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.02F, 3.8365F, 0.0297F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(108, 32).mirror().addBox(-4.0F, -1.0599F, -1.0284F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.02F, 1.2365F, -2.6703F, -2.3736F, 0.0F, 0.0F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(93, 62).mirror().addBox(-4.0F, -0.0007F, -2.0464F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.02F, 2.0365F, -0.6703F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(11, 104).mirror().addBox(-4.0F, 0.0123F, -0.9563F, 8.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.02F, 0.5365F, -0.0703F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(104, 90).mirror().addBox(-4.0F, -0.074F, 0.0299F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.02F, -0.1635F, -0.7703F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(96, 84).mirror().addBox(-4.0F, -1.8F, -1.0F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.02F, 1.5365F, -1.0703F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(113, 103).mirror().addBox(-0.522F, 0.1091F, 0.1058F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.1722F, 2.283F, -5.4203F, 0.1422F, -0.3107F, 0.0525F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(114, 64).mirror().addBox(-1.0F, -0.7F, -1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1722F, 3.283F, -4.0203F, -0.8876F, -0.3107F, 0.0525F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(115, 86).mirror().addBox(-1.0F, -1.1F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0205F, 0.2868F, -4.0026F, 0.4301F, -0.3107F, 0.0525F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(113, 42).mirror().addBox(-0.6943F, -4.4426F, -2.1146F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.25F, -9.5867F, -1.7396F, -0.0318F, -0.1219F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-0.2435F, -6.0072F, -0.0654F, 1.0F, 6.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.85F, -14.5867F, -1.1806F, -0.0402F, -0.1195F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(109, 108).mirror().addBox(0.0277F, -2.9457F, 0.0446F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 3.25F, -17.1867F, -1.041F, -0.0402F, -0.1195F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(30, 98).mirror().addBox(-0.6F, -0.5F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0369F, -1.3112F, -3.5788F, 0.6089F, -0.2133F, -1.5354F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(111, 19).mirror().addBox(-0.6943F, -3.1746F, -0.0031F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.25F, -9.5867F, -1.0065F, -0.0318F, -0.1219F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.6782F, 2.3449F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r376 = jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(95, 112).mirror().addBox(0.0F, -1.9627F, -0.855F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.05F, -10.7F, -0.3971F, -0.145F, 0.0605F));

		PartDefinition cube_r377 = jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(118, 64).mirror().addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 1.5056F, -2.0499F, 0.7046F, -0.1834F, 0.0263F));

		PartDefinition cube_r378 = jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(44, 118).mirror().addBox(-0.1F, -0.3116F, 2.4999F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 4.75F, -8.0F, 0.576F, -0.2618F, 0.0F));

		PartDefinition cube_r379 = jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(119, 70).mirror().addBox(-0.8506F, -2.0F, -2.8012F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 4.75F, -5.1F, -0.192F, -0.2618F, 0.0F));

		PartDefinition cube_r380 = jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(36, 111).mirror().addBox(-1.5F, 1.25F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(129, 17).mirror().addBox(-1.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.3445F, -19.9097F, 1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r381 = jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(123, 76).mirror().addBox(-1.5F, 0.0F, -4.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3396F, -15.1304F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r382 = jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(71, 105).mirror().addBox(-2.0F, 0.0F, -2.65F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3396F, -15.2804F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r383 = jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(116, 103).mirror().addBox(-2.0F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1426F, -11.9914F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r384 = jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(51, 32).mirror().addBox(-2.0F, 0.0F, -9.05F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.25F, -3.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(83, 105).mirror().addBox(-1.4666F, -0.5599F, -0.1108F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9634F, 2.3471F, -4.4468F, -2.7751F, -0.2531F, 0.0F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(108, 35).mirror().addBox(-1.2066F, -0.2838F, -2.1904F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9634F, 3.7471F, -5.4468F, -2.3387F, -0.2531F, 0.0F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(66, 80).mirror().addBox(-1.2066F, -0.8838F, -2.6904F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.9634F, 3.7471F, -5.4468F, -0.2269F, -0.2531F, 0.0F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(85, 84).mirror().addBox(-0.0163F, -2.5291F, -0.2815F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9634F, 2.5471F, -10.0468F, 0.0349F, -0.2531F, 0.0F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(63, 111).mirror().addBox(-4.0F, 3.25F, -3.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(95, 112).addBox(-1.0F, -1.9627F, -0.855F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(2.0F, 3.05F, -10.7F, -0.3971F, 0.145F, -0.0605F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(118, 64).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, 1.5056F, -2.0499F, 0.7046F, 0.1834F, -0.0263F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(44, 118).addBox(-0.9F, -0.3116F, 2.4999F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 4.75F, -8.0F, 0.576F, 0.2618F, 0.0F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(119, 70).addBox(-0.1494F, -2.0F, -2.8012F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.4F, 4.75F, -5.1F, -0.192F, 0.2618F, 0.0F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(36, 111).addBox(0.5F, 1.25F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F))
				.texOffs(129, 17).addBox(0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.3445F, -19.9097F, 1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(123, 12).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.837F, -20.7213F, 1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(25, 104).addBox(-1.5F, -0.4528F, -4.889F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2563F, -11.3213F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(115, 6).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 9).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(123, 76).addBox(0.5F, 0.0F, -4.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3396F, -15.1304F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(123, 104).addBox(-1.0F, 0.0F, -5.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3396F, -15.0804F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r399 = jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(71, 105).addBox(1.0F, 0.0F, -2.65F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3396F, -15.2804F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r400 = jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(116, 103).addBox(1.0F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.1426F, -11.9914F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r401 = jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(51, 32).addBox(1.0F, 0.0F, -9.05F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.25F, -3.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r402 = jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(83, 105).addBox(0.4666F, -0.5599F, -0.1108F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9634F, 2.3471F, -4.4468F, -2.7751F, 0.2531F, 0.0F));

		PartDefinition cube_r403 = jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(108, 35).addBox(0.2066F, -0.2838F, -2.1904F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9634F, 3.7471F, -5.4468F, -2.3387F, 0.2531F, 0.0F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(66, 80).addBox(0.2066F, -0.8838F, -2.6904F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.9634F, 3.7471F, -5.4468F, -0.2269F, 0.2531F, 0.0F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(85, 84).addBox(-0.9837F, -2.5291F, -0.2815F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9634F, 2.5471F, -10.0468F, 0.0349F, 0.2531F, 0.0F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(63, 111).addBox(3.0F, 3.25F, -3.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F));

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