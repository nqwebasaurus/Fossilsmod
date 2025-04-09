package fossils.fossils.client.blockentity.model.oviraptor;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class OviraptorFossilModel extends SkullModelBase {
	private final ModelPart fossil;
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
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftBeak;
	private final ModelPart rightBeak;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public OviraptorFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
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
		this.neck4 = this.neck.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.leftBeak = this.head.getChild("leftBeak");
		this.rightBeak = this.head.getChild("rightBeak");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -21.5958F, 0.4919F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(26, 32).addBox(-0.5F, -1.5012F, 0.0471F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9302F, -2.3024F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(5, 58).mirror().addBox(-0.6456F, -4.2444F, -1.5416F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.1973F, 4.6121F, -2.8659F, 2.8814F, -0.0381F, 0.0469F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(57, 4).mirror().addBox(-0.6456F, 2.4077F, -2.4377F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(0.1973F, 4.6121F, -2.8659F, 0.5253F, -0.0381F, 0.0469F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(12, 58).mirror().addBox(-0.6456F, 1.7587F, -3.6607F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.1973F, 4.6121F, -2.8659F, 0.9965F, -0.0381F, 0.0469F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(34, 64).mirror().addBox(-0.8902F, -0.5041F, 1.412F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1973F, 4.6121F, -2.8659F, -0.4085F, -0.0381F, -0.0404F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(62, 26).mirror().addBox(-0.5F, -1.1F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.0668F, 4.5588F, 3.636F, 1.4991F, -0.0146F, -0.3041F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(81, 46).mirror().addBox(-0.4F, 0.3F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 80).mirror().addBox(-0.4F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(35, 81).mirror().addBox(-0.4F, -0.3F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0752F, 4.1442F, 1.6468F, 1.8152F, -0.0692F, -0.2527F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(21, 48).mirror().addBox(-0.5F, -0.8226F, -0.7577F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.08F, 1.0924F, -0.4602F, 0.1302F, 0.0028F, -0.1935F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(48, 26).mirror().addBox(-0.5F, -1.2693F, -1.1331F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.08F, 1.0924F, -0.4602F, 0.6101F, 0.0028F, -0.1935F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(5, 65).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2135F, 3.5761F, 1.8014F, 1.0627F, -0.0146F, -0.3041F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(60, 79).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 79).addBox(2.3F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -0.5657F, 1.1082F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(30, 42).mirror().addBox(-0.5F, -0.3F, -2.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(30, 42).addBox(2.3F, -0.3F, -2.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.4F, -0.6081F, 2.9188F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(70, 16).mirror().addBox(-0.5F, 0.1384F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2005F, -0.2826F, -3.6251F, 2.1118F, 0.2094F, 0.0F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(70, 77).mirror().addBox(-0.5F, 0.0F, -0.3602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2338F, -1.3532F, -3.7818F, 1.2392F, 0.2094F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(79, 70).mirror().addBox(-0.5F, 0.0318F, -0.6816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(52, 57).mirror().addBox(-0.5F, 0.0318F, 0.1184F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8469F, -2.2787F, -1.9613F, -0.0524F, 0.2094F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(30, 39).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(30, 39).addBox(2.3F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -1.3092F, 2.8265F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(20, 72).mirror().addBox(-0.5F, -0.4448F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0797F, -1.6593F, -3.0568F, 0.3229F, 0.2094F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(35, 36).mirror().addBox(-0.5F, -1.5F, -1.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(35, 36).addBox(2.3F, -1.5F, -1.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.4F, -0.416F, -0.0836F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(19, 57).mirror().addBox(-3.0F, -0.0083F, -0.1022F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(19, 57).addBox(-0.2F, -0.0083F, -0.1022F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1F, -2.1241F, 0.0707F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(69, 70).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(69, 70).addBox(2.3F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4F, -1.0768F, 2.0809F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(70, 12).mirror().addBox(-0.5F, -0.8092F, -1.3217F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.7F, -0.8F, -0.7854F, 0.2094F, 0.0F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(39, 42).mirror().addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2423F, 0.3507F, -0.4091F, -0.1396F, 0.0F, -0.2618F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(64, 56).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.3898F, 2.9876F, 1.2512F, 0.67F, -0.0146F, -0.3041F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(10, 65).mirror().addBox(-0.4024F, -0.1519F, -0.7373F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.3349F, 0.542F, 0.4693F, -0.0146F, -0.3041F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(15, 70).mirror().addBox(-0.0825F, -0.7998F, -0.2672F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 2.2349F, -1.158F, 0.1559F, -0.0791F, -0.2943F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(51, 61).mirror().addBox(-0.2825F, -0.2998F, -0.8672F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9788F, 3.1532F, -0.4216F, -0.1397F, -0.1538F, -0.2071F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(32, 6).mirror().addBox(-1.0F, -0.5F, 1.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(32, 6).addBox(1.0F, -0.5F, 1.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(17, 14).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.1F, -3.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(79, 70).addBox(-0.5F, 0.0318F, -0.6816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(52, 57).addBox(-0.5F, 0.0318F, 0.1184F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.8469F, -2.2787F, -1.9613F, -0.0524F, -0.2094F, 0.0F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(70, 16).addBox(-0.5F, 0.1384F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.2005F, -0.2826F, -3.6251F, 2.1118F, -0.2094F, 0.0F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(70, 77).addBox(-0.5F, 0.0F, -0.3602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2338F, -1.3532F, -3.7818F, 1.2392F, -0.2094F, 0.0F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(20, 72).addBox(-0.5F, -0.4448F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0797F, -1.6593F, -3.0568F, 0.3229F, -0.2094F, 0.0F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(70, 12).addBox(-0.5F, -0.8092F, -1.3217F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.6F, -0.7F, -0.8F, -0.7854F, -0.2094F, 0.0F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(21, 48).addBox(-0.5F, -0.8226F, -0.7577F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.08F, 1.0924F, -0.4602F, 0.1302F, -0.0028F, 0.1935F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(48, 26).addBox(-0.5F, -1.2693F, -1.1331F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.08F, 1.0924F, -0.4602F, 0.6101F, -0.0028F, 0.1935F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(39, 42).addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2423F, 0.3507F, -0.4091F, -0.1396F, 0.0F, 0.2618F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(5, 65).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2135F, 3.5761F, 1.8014F, 1.0627F, 0.0146F, 0.3041F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(62, 26).addBox(-0.5F, -1.1F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.0668F, 4.5588F, 3.636F, 1.4991F, 0.0146F, 0.3041F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(64, 56).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.3898F, 2.9876F, 1.2512F, 0.67F, 0.0146F, 0.3041F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(10, 65).addBox(-0.5976F, -0.1519F, -0.7373F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 1.3349F, 0.542F, 0.4693F, 0.0146F, 0.3041F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(81, 46).addBox(-0.6F, 0.3F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(35, 81).addBox(-0.6F, -0.3F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 80).addBox(-0.6F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0752F, 4.1442F, 1.6468F, 1.8152F, 0.0692F, 0.2527F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(15, 70).addBox(-0.9175F, -0.7998F, -0.2672F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, 2.2349F, -1.158F, 0.1559F, 0.0791F, 0.2943F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(51, 61).addBox(-0.7175F, -0.2998F, -0.8672F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9788F, 3.1532F, -0.4216F, -0.1397F, 0.1538F, 0.2071F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(34, 64).addBox(-0.1098F, -0.5041F, 1.412F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1973F, 4.6121F, -2.8659F, -0.4085F, 0.0381F, 0.0404F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(5, 58).addBox(-0.3544F, -4.2444F, -1.5416F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.1973F, 4.6121F, -2.8659F, 2.8814F, 0.0381F, -0.0469F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(12, 58).addBox(-0.3544F, 1.7587F, -3.6607F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.1973F, 4.6121F, -2.8659F, 0.9965F, 0.0381F, -0.0469F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(57, 4).addBox(-0.3544F, 2.4077F, -2.4377F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.1973F, 4.6121F, -2.8659F, 0.5253F, 0.0381F, -0.0469F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, 0.8576F, -0.3968F, -0.5655F, 0.0468F, 0.0737F));

		PartDefinition cube_r47 = leftLeg1.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(60, 18).addBox(-0.5F, -2.8F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.1052F, -0.5638F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg1.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(60, 13).addBox(-0.5F, -2.9F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0F, 2.1052F, -0.5638F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg1.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(30, 71).addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(25, 71).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0F, 6.3371F, 1.7803F, 1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg1.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(5, 69).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 5.5489F, 0.3144F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg1.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0F, 3.9148F, -0.1542F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg1.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(65, 13).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.2052F, -0.5638F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.3714F, 2.0694F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(11, 37).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6F, 4.5516F, -0.1777F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(36, 59).addBox(-0.5F, -2.7F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6F, 2.5844F, 0.3609F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(31, 59).addBox(-0.5F, -2.7F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.6F, 2.5844F, 0.3609F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(48, 12).addBox(-0.5F, -0.3F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.6F, 0.1972F, 0.628F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(19, 61).addBox(-1.4F, -2.75F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.5F, 3.3223F, -0.0519F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(47, 47).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.4F, 6.3822F, 0.6572F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(37, 47).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4F, 2.5849F, 0.324F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(71, 62).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.4F, 0.0161F, 0.2329F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(64, 70).addBox(-0.5F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.4F, 0.4946F, 0.378F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(43, 0).addBox(-1.0F, -0.4066F, -0.6088F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 11.0765F, -0.209F, -0.8708F, -0.0668F, -0.0562F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(26, 27).addBox(-1.5F, -0.5F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7934F, -0.3088F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(11, 33).addBox(-2.0F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offset(0.5F, 0.0F, -2.5F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, 0.8576F, -0.3968F, -0.7437F, 0.0643F, -0.059F));

		PartDefinition cube_r62 = rightLeg1.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 61).addBox(-0.5F, -2.8F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.1052F, -0.5638F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg1.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(46, 60).addBox(-0.5F, -2.9F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0F, 2.1052F, -0.5638F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg1.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(71, 46).addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(44, 71).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0F, 6.3371F, 1.7803F, 1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg1.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(10, 69).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 5.5489F, 0.3144F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg1.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(70, 8).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0F, 3.9148F, -0.1542F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg1.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(65, 17).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.2052F, -0.5638F, 0.1571F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.3714F, 2.0694F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(16, 37).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6F, 4.5516F, -0.1777F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(59, 53).addBox(-0.5F, -2.7F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6F, 2.5844F, 0.3609F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(41, 59).addBox(-0.5F, -2.7F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.6F, 2.5844F, 0.3609F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(48, 19).addBox(-0.5F, -0.3F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.6F, 0.1972F, 0.628F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(61, 47).addBox(0.4F, -2.75F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.5F, 3.3223F, -0.0519F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 48).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.4F, 6.3822F, 0.6572F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(42, 47).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, 2.5849F, 0.324F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(71, 65).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.4F, 0.0161F, 0.2329F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(71, 59).addBox(-0.5F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.4F, 0.4946F, 0.378F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(43, 6).addBox(-1.0F, -0.4066F, -0.6088F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 11.0765F, -0.209F, -1.7455F, 0.043F, -0.0076F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(30, 14).addBox(-1.5F, -0.5F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7934F, -0.3088F, 1.9635F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(35, 32).addBox(-1.0F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offset(-0.5F, 0.0F, -2.5F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -3.3F, 0.0701F, -0.0871F, -0.0061F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(5, 48).addBox(-0.5F, -1.3952F, -0.0025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5476F, -0.9007F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(22, 33).addBox(-0.5F, -1.3952F, -0.0025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6F, -2.9F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(81, 60).addBox(-0.5F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7F, -4.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(82, 38).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3745F, -2.4269F, 0.06F, 0.1113F, -0.6211F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(82, 36).mirror().addBox(-3.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3745F, -2.4269F, -0.0802F, 0.127F, -1.6408F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(69, 0).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3745F, -2.4269F, -0.0029F, 0.1501F, -1.0949F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(71, 49).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2745F, -0.4268F, -0.0264F, -0.062F, -0.7822F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(21, 37).mirror().addBox(-1.891F, -0.4534F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2745F, -0.4268F, -0.001F, -0.0434F, -1.2537F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(69, 55).mirror().addBox(-4.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3745F, -4.4268F, -0.0897F, 0.2576F, -1.5728F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(65, 21).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3745F, -4.4268F, 0.0591F, 0.2661F, -1.0122F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(81, 58).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3745F, -4.4268F, 0.1682F, 0.1867F, -0.5352F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(71, 49).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2745F, -0.4268F, -0.0264F, 0.062F, 0.7822F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(21, 37).addBox(0.891F, -0.4534F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2745F, -0.4268F, -0.001F, 0.0434F, 1.2537F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(69, 0).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3745F, -2.4269F, -0.0029F, -0.1501F, 1.0949F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(82, 36).addBox(2.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3745F, -2.4269F, -0.0802F, -0.127F, 1.6408F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(82, 38).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3745F, -2.4269F, 0.06F, -0.1113F, 0.6211F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(69, 55).addBox(2.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3745F, -4.4268F, -0.0897F, -0.2576F, 1.5728F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(65, 21).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3745F, -4.4268F, 0.0591F, -0.2661F, 1.0122F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(81, 58).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3745F, -4.4268F, 0.1682F, -0.1867F, 0.5352F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(17, 8).addBox(-2.5F, -1.5964F, 2.0155F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.9169F, -6.399F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(13, 28).addBox(-2.5F, -1.9301F, -0.0046F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.9169F, -6.399F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7F, -3.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2432F, -4.8202F, -0.1584F, -0.1293F, 0.0206F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(25, 83).addBox(-0.5F, -0.7964F, -1.244F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 18).addBox(-0.5F, -0.6964F, -3.244F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 32).addBox(-1.0F, 0.0036F, -4.244F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -2.8F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(5, 82).addBox(-0.5F, -1.276F, 0.8892F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2F, -2.9F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(30, 19).mirror().addBox(-4.5F, 0.2F, -0.3F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2918F, 5.0041F, -4.5485F, -0.4129F, 1.3723F, -0.5017F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(45, 77).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(45, 77).addBox(3.3F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.9F, 1.8241F, -5.3144F, 1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(77, 43).mirror().addBox(-0.5F, -0.1393F, -0.2521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(72, 28).mirror().addBox(-0.5F, -0.1393F, -0.1521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(72, 25).mirror().addBox(-0.5F, -0.1393F, 0.4479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(77, 43).addBox(3.3F, -0.1393F, -0.2521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(72, 28).addBox(3.3F, -0.1393F, -0.1521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(72, 25).addBox(3.3F, -0.1393F, 0.4479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.9F, 1.0851F, -5.7148F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(59, 70).mirror().addBox(-0.5F, -0.179F, -0.8742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(54, 70).mirror().addBox(-0.5F, -0.379F, -0.8742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(59, 70).addBox(3.3F, -0.179F, -0.8742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(54, 70).addBox(3.3F, -0.379F, -0.8742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.9F, 1.4851F, -6.0148F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(77, 40).mirror().addBox(-0.5F, -0.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(77, 40).addBox(3.3F, -0.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-1.9F, 1.568F, -4.6944F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(40, 77).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(40, 77).addBox(3.3F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-1.9F, 1.2325F, -4.197F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(57, 0).mirror().addBox(-0.5F, -0.1798F, -1.7656F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(57, 0).addBox(3.3F, -0.1798F, -1.7656F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.9F, -0.0959F, -3.1783F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(77, 37).mirror().addBox(-0.5F, -0.4992F, 3.8051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(0, 38).mirror().addBox(-0.5F, -0.4992F, 1.3051F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(77, 37).addBox(3.3F, -0.4992F, 3.8051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(0, 38).addBox(3.3F, -0.4992F, 1.3051F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.9F, 0.5851F, -4.5148F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(32, 11).mirror().addBox(-6.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5255F, -3.5268F, -0.0788F, 0.5024F, -1.5869F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(56, 68).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5255F, -3.5268F, 0.2129F, 0.4649F, -0.975F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(82, 34).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5255F, -3.5268F, 0.3935F, 0.2975F, -0.499F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(81, 64).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0255F, -5.3269F, 0.4096F, 0.3058F, -0.5815F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(44, 65).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0255F, -5.3269F, 0.2239F, 0.4793F, -1.0573F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(52, 51).mirror().addBox(-5.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0255F, -5.3269F, -0.0792F, 0.5199F, -1.6743F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(44, 40).mirror().addBox(-6.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0255F, -1.5268F, 0.0175F, 0.4931F, -1.4868F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(69, 57).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0255F, -1.5268F, 0.2839F, 0.4091F, -0.8909F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(82, 44).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0255F, -1.5268F, 0.4271F, 0.2188F, -0.4363F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(50, 5).mirror().addBox(-1.0F, -0.9F, -0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3985F, 3.0565F, -6.0248F, 0.3096F, 0.6213F, 0.0836F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(72, 31).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false)
				.texOffs(72, 31).addBox(3.3F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-1.9F, 1.4955F, -5.6991F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(52, 47).mirror().addBox(-0.5F, -0.1798F, -1.7656F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)).mirror(false)
				.texOffs(52, 47).addBox(3.3F, -0.1798F, -1.7656F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-1.9F, -0.0959F, -3.1783F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(70, 4).mirror().addBox(0.3945F, -0.1914F, 0.0604F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6097F, 4.7261F, -6.5865F, 1.0451F, -0.0017F, 0.0376F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(50, 9).mirror().addBox(-2.5F, 0.2F, -0.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2918F, 5.0041F, -4.5485F, -0.6511F, 1.2102F, -0.746F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(82, 34).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5255F, -3.5268F, 0.3935F, -0.2975F, 0.499F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(56, 68).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5255F, -3.5268F, 0.2129F, -0.4649F, 0.975F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(32, 11).addBox(2.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5255F, -3.5268F, -0.0788F, -0.5024F, 1.5869F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(81, 64).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0255F, -5.3269F, 0.4096F, -0.3058F, 0.5815F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(44, 65).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0255F, -5.3269F, 0.2239F, -0.4793F, 1.0573F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(52, 51).addBox(2.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0255F, -5.3269F, -0.0792F, -0.5199F, 1.6743F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(44, 40).addBox(2.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0255F, -1.5268F, 0.0175F, -0.4931F, 1.4868F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(69, 57).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0255F, -1.5268F, 0.2839F, -0.4091F, 0.8909F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(82, 44).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0255F, -1.5268F, 0.4271F, -0.2188F, 0.4363F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(50, 5).addBox(-1.0F, -0.9F, -0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3985F, 3.0565F, -6.0248F, 0.3096F, -0.6213F, -0.0836F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(70, 4).addBox(-1.3945F, -0.1914F, 0.0604F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6097F, 4.7261F, -6.5865F, 1.0451F, 0.0017F, -0.0376F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(30, 19).addBox(-0.5F, 0.2F, -0.3F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2918F, 5.0041F, -4.5485F, -0.4129F, -1.3723F, 0.5017F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(50, 9).addBox(-0.5F, 0.2F, -0.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2918F, 5.0041F, -4.5485F, -0.6511F, -1.2102F, 0.746F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(26, 21).addBox(-2.0F, -2.0F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 6.2542F, -3.2113F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(46, 31).addBox(-1.5F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 5.3618F, -5.0012F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 43).addBox(-1.0F, -0.5F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.1F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create().texOffs(14, 52).addBox(-0.5059F, -0.5647F, -0.6475F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.3419F, 2.7512F, -5.3517F, 0.7119F, -0.1711F, -1.0002F));

		PartDefinition cube_r139 = leftArm1.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(72, 20).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.0059F, 0.6738F, -0.4661F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r140 = leftArm1.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(65, 5).addBox(0.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r141 = leftArm1.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(81, 49).addBox(0.0F, 0.4F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(79, 67).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5059F, 3.2353F, 0.3525F, -0.384F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0913F, 4.7205F, -0.7657F, -1.7894F, 0.0387F, -0.0202F));

		PartDefinition cube_r142 = leftArm2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(56, 63).addBox(-1.75F, -0.2F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, 1.75F, 0.3F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r143 = leftArm2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(59, 58).addBox(-1.75F, 0.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, -1.05F, 0.3F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r144 = leftArm2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(62, 38).addBox(-0.5F, -2.8F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.25F, -0.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r145 = leftArm2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(64, 0).addBox(-0.5F, -0.5991F, -0.6131F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.35F, -0.5F, 0.0175F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(48, 42).addBox(-1.0F, -0.25F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(43, 12).addBox(-1.0F, 1.7F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(0, 55).addBox(-1.0F, 1.7F, 0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.1977F, 4.7312F, -0.5441F, 1.0541F, -0.0692F, 0.0532F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create().texOffs(14, 46).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.4717F, -0.0024F, -0.2618F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create().texOffs(47, 54).addBox(-0.4941F, -0.5647F, -0.6475F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.3419F, 2.7512F, -5.3517F, 0.6559F, 0.1704F, 1.0711F));

		PartDefinition cube_r146 = rightArm1.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(75, 77).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.0059F, 0.6738F, -0.4661F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r147 = rightArm1.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(65, 9).addBox(-1.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r148 = rightArm1.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(81, 52).addBox(-1.0F, 0.4F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(79, 73).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5059F, 3.2353F, 0.3525F, -0.384F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0913F, 4.7205F, -0.7657F, -1.7894F, -0.0387F, 0.0202F));

		PartDefinition cube_r149 = rightArm2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(61, 63).addBox(0.75F, -0.2F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2F, 1.75F, 0.3F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r150 = rightArm2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(60, 8).addBox(0.75F, 0.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2F, -1.05F, 0.3F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r151 = rightArm2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(24, 63).addBox(-0.5F, -2.8F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.05F, 2.25F, -0.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r152 = rightArm2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(29, 64).addBox(-0.5F, -0.5991F, -0.6131F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.05F, 2.35F, -0.5F, 0.0175F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(50, 0).addBox(0.0F, -0.25F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(9, 46).addBox(0.0F, 1.7F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(26, 57).addBox(0.0F, 1.7F, 0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.1977F, 4.7312F, -0.5441F, 1.0541F, 0.0692F, -0.0532F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create().texOffs(30, 47).addBox(0.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.4717F, -0.0024F, -0.2618F, 0.0F, 0.0F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6473F, -6.6262F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r153 = neck3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(17, 83).addBox(-0.5F, -1.1F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3953F, 0.232F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r154 = neck3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(14, 83).addBox(-0.5F, -1.3F, -0.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 39).addBox(-1.0F, -1.0F, -0.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.6F, -2.1F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r155 = neck3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(69, 23).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.2218F, -2.5006F, 0.131F, 0.6234F, -1.3484F));

		PartDefinition cube_r156 = neck3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(69, 2).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4218F, -0.4006F, 0.2486F, 0.5172F, -1.0979F));

		PartDefinition cube_r157 = neck3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(64, 60).mirror().addBox(-4.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4218F, -0.4006F, -0.0845F, 0.5633F, -1.7295F));

		PartDefinition cube_r158 = neck3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(82, 40).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4218F, -0.4006F, 0.4481F, 0.3295F, -0.6218F));

		PartDefinition cube_r159 = neck3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(69, 23).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2218F, -2.5006F, 0.131F, -0.6234F, 1.3484F));

		PartDefinition cube_r160 = neck3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(82, 40).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.4218F, -0.4006F, 0.4481F, -0.3295F, 0.6218F));

		PartDefinition cube_r161 = neck3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(64, 60).addBox(2.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.4218F, -0.4006F, -0.0845F, -0.5633F, 1.7295F));

		PartDefinition cube_r162 = neck3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(69, 2).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.4218F, -0.4006F, 0.2486F, -0.5172F, 1.0979F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.285F, -2.6097F, -0.1728F, 0.0869F, 0.0144F));

		PartDefinition cube_r163 = neck2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(0, 83).addBox(-0.5F, -0.3262F, 1.9312F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 82).addBox(-0.5F, -0.2262F, -0.0688F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 0).addBox(-1.0F, -0.0262F, -0.0688F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.1F, -2.3F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r164 = neck2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(32, 69).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.6369F, -2.6909F, 0.0656F, 0.3712F, -1.4763F));

		PartDefinition cube_r165 = neck2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(25, 69).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1369F, -1.3909F, 0.1237F, 0.5368F, -1.3617F));

		PartDefinition cube_r166 = neck2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(32, 69).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6369F, -2.6909F, 0.0656F, -0.3712F, 1.4763F));

		PartDefinition cube_r167 = neck2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(25, 69).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1369F, -1.3909F, 0.1237F, -0.5368F, 1.3617F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7F, -2.6F, -1.3469F, 0.0948F, -0.023F));

		PartDefinition cube_r168 = neck.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(65, 82).addBox(0.0F, -0.2676F, 0.0085F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 82).addBox(0.0F, -0.2676F, -1.9915F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 21).addBox(-0.5F, -0.0676F, -2.9915F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.2F, -1.6F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r169 = neck.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(69, 53).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.3369F, -3.5909F, 0.2623F, 0.8069F, -1.309F));

		PartDefinition cube_r170 = neck.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(69, 51).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5369F, -1.6909F, 0.3593F, 0.9222F, -1.1295F));

		PartDefinition cube_r171 = neck.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(69, 53).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3369F, -3.5909F, 0.2623F, -0.8069F, 1.309F));

		PartDefinition cube_r172 = neck.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(69, 51).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5369F, -1.6909F, 0.3593F, -0.9222F, 1.1295F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(39, 21).addBox(-0.5F, -0.4F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(56, 82).addBox(0.0F, -0.7F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 82).addBox(0.0F, -0.6F, -3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -4.3F, 0.0865F, -0.0114F, 0.1304F));

		PartDefinition cube_r173 = neck4.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(82, 42).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2631F, -0.8909F, 0.3637F, 1.0822F, -1.1809F));

		PartDefinition cube_r174 = neck4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(82, 42).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2631F, -0.8909F, 0.3637F, -1.0822F, 1.1809F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -2.4F, 0.0113F, -0.0375F, -0.0479F));

		PartDefinition cube_r175 = head.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(60, 35).addBox(-0.5F, -1.0F, -2.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(44, 36).addBox(-0.5F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5F, 1.8018F, 0.4472F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r176 = head.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(21, 44).addBox(-0.5F, -0.4F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.7317F, -0.0692F, -1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r177 = head.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(26, 53).addBox(-1.0F, -0.3F, -1.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 23).addBox(-1.0F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.1466F, -3.0873F, 2.33F, 0.0F, 0.0F));

		PartDefinition cube_r178 = head.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(54, 73).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2F, 2.3903F, -2.7639F, 2.1031F, 0.0F, 0.0F));

		PartDefinition cube_r179 = head.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(12, 62).addBox(-0.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.1184F, -3.0344F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r180 = head.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(39, 26).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -0.4552F, -2.2152F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r181 = head.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(5, 62).addBox(-0.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -0.4552F, -2.2152F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r182 = head.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(51, 66).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -0.9396F, -1.4502F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r183 = head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(66, 47).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -0.8005F, -0.4599F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r184 = head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(0, 66).addBox(0.0F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -0.0951F, -0.4106F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r185 = head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(62, 43).addBox(-0.5F, -0.2618F, -0.4599F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 4.5385F, -4.6459F, -2.9932F, 0.0F, 0.0F));

		PartDefinition cube_r186 = head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(62, 31).addBox(-0.5F, -0.4618F, -0.4599F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 4.5385F, -4.6459F, 2.5045F, 0.0F, 0.0F));

		PartDefinition cube_r187 = head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(67, 38).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.0F, 3.3489F, -5.1176F, 1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r188 = head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(67, 34).addBox(-0.5F, -0.1F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.2018F, -5.4574F, 1.7802F, 0.0F, 0.0F));

		PartDefinition cube_r189 = head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(67, 30).addBox(-0.5F, -0.1F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, 1.6041F, -5.4051F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r190 = head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(49, 70).addBox(-0.5F, -0.1F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.056F, -5.161F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r191 = head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(67, 26).addBox(-0.5F, -0.1F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.0F, 0.6172F, -4.7518F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r192 = head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(81, 55).mirror().addBox(-0.7F, -0.2F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false)
				.texOffs(81, 55).addBox(-0.3F, -0.2F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.0F, 2.3618F, -4.8911F, 1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r193 = head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(66, 66).addBox(-0.5F, -0.1F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.2816F, -4.2544F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r194 = head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(66, 62).addBox(-0.5F, -0.1F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, 0.1189F, -3.7816F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r195 = head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(25, 74).addBox(-0.5F, -0.1F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.5454F, -2.2168F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r196 = head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(53, 15).addBox(-0.5F, -0.1F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.5454F, -2.2168F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r197 = head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(5, 54).addBox(-0.5F, -0.7666F, -0.1953F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.7692F, -1.7165F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r198 = head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(69, 73).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(64, 73).addBox(-0.5F, -0.7F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.0F, 3.8778F, -3.786F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r199 = head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(55, 23).addBox(-0.5F, -0.7666F, -1.6953F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.4956F, -3.1421F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r200 = head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(53, 11).addBox(-0.5F, -0.7666F, -0.1953F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, 3.4956F, -3.1421F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r201 = head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(10, 73).addBox(-0.7F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2F, 3.4891F, -3.8634F, 2.138F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.33F, 2.5023F, -6.8842F));

		PartDefinition cube_r202 = leftFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(20, 81).addBox(-0.5F, -1.2411F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(80, 79).addBox(-0.5F, -0.9F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.29F, -2.3145F, 6.9121F, 1.693F, 0.0F, 0.0F));

		PartDefinition cube_r203 = leftFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(80, 76).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.29F, -2.0551F, 6.7993F, 1.946F, 0.0F, 0.0F));

		PartDefinition cube_r204 = leftFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(75, 80).addBox(-0.5F, 0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(70, 80).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.29F, -1.1345F, 6.0232F, 1.597F, 0.0F, 0.0F));

		PartDefinition cube_r205 = leftFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(81, 0).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.29F, -1.5238F, 5.6128F, 1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r206 = leftFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(80, 12).addBox(-0.52F, -0.624F, -0.3485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(30, 80).addBox(-0.52F, -0.624F, -0.4485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.11F, -0.525F, 3.6351F, -0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r207 = leftFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(80, 9).addBox(-0.52F, -0.6733F, -0.6676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(80, 6).addBox(-0.52F, -0.4733F, -0.6676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.11F, -0.525F, 3.6351F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r208 = leftFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(25, 80).addBox(-0.5F, -0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(80, 15).addBox(-0.5F, -0.4F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.02F, -0.6571F, 2.6172F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(15, 80).addBox(-0.587F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.11F, 0.2787F, 3.1214F, 1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(80, 3).addBox(-0.52F, -0.3687F, -0.7448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.11F, -0.525F, 3.6351F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(45, 80).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.31F, -0.9149F, 4.5811F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(5, 79).addBox(-0.5F, -0.7F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.114F)), PartPose.offsetAndRotation(0.31F, -1.7267F, 4.6076F, 1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r213 = leftFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(40, 80).addBox(-0.5F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.31F, -2.0015F, 4.5897F, -1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r214 = leftFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(65, 79).addBox(-0.43F, 0.7711F, -0.0898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(35, 78).addBox(-0.61F, 0.7711F, -0.0898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.4F, -2.5441F, 3.9704F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r215 = leftFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(53, 35).addBox(-0.5F, -0.3665F, -0.0735F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.17F, -0.2795F, 5.3482F, 0.8149F, 0.0844F, 0.0082F));

		PartDefinition cube_r216 = leftFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(52, 53).addBox(-0.5F, -0.0021F, -1.7849F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.17F, -0.2795F, 5.3482F, -0.5464F, 0.0844F, 0.0082F));

		PartDefinition cube_r217 = leftFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(67, 42).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.13F, 0.9712F, 3.6037F, 2.6965F, 0.0F, 0.0F));

		PartDefinition cube_r218 = leftFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(5, 73).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.13F, -0.5915F, 2.926F, 2.8798F, 0.0F, 0.0F));

		PartDefinition cube_r219 = leftFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(72, 43).addBox(-0.5F, -0.3F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.13F, -0.805F, 3.2166F, 2.7925F, 0.0F, 0.0F));

		PartDefinition cube_r220 = leftFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(59, 73).addBox(-0.5F, -0.1411F, -0.6695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.17F, -0.2795F, 5.3482F, 0.0994F, 0.0844F, 0.0082F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(72, 34).addBox(-0.5F, -0.3293F, -0.6389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.17F, -0.2795F, 5.3482F, 1.0418F, 0.0844F, 0.0082F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(74, 71).addBox(0.0F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(74, 68).addBox(0.0F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(30, 74).addBox(0.0F, -0.8F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.03F, -2.5973F, 6.4736F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r223 = leftFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(40, 74).addBox(0.0F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(45, 74).addBox(0.0F, 0.5F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.03F, -2.3842F, 7.4809F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(55, 43).addBox(-0.2F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.33F, -1.6533F, 2.8251F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(30, 77).addBox(-0.2F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.33F, -1.2488F, 2.4409F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(77, 31).addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.33F, -1.2488F, 2.4409F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(77, 34).addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.33F, -0.7142F, 2.1685F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(39, 68).addBox(-0.2F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.33F, -0.1405F, 1.9931F, 1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(50, 79).addBox(-0.59F, -0.8897F, -0.8898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.4F, -1.5719F, 5.5368F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(10, 79).addBox(-0.59F, -0.8897F, -0.8898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4F, -0.7738F, 5.481F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(55, 79).addBox(-0.59F, -0.8897F, -1.1898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(20, 78).addBox(-0.59F, -0.8897F, -0.8898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.4F, -0.7738F, 5.481F, 0.2443F, 0.0F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.33F, 2.5023F, -6.8842F));

		PartDefinition cube_r232 = rightFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(20, 81).mirror().addBox(-0.5F, -1.2411F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(80, 79).mirror().addBox(-0.5F, -0.9F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-0.29F, -2.3145F, 6.9121F, 1.693F, 0.0F, 0.0F));

		PartDefinition cube_r233 = rightFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(80, 76).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.29F, -2.0551F, 6.7993F, 1.946F, 0.0F, 0.0F));

		PartDefinition cube_r234 = rightFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(75, 80).mirror().addBox(-0.5F, 0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(70, 80).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-0.29F, -1.1345F, 6.0232F, 1.597F, 0.0F, 0.0F));

		PartDefinition cube_r235 = rightFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(81, 0).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.29F, -1.5238F, 5.6128F, 1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r236 = rightFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(80, 12).mirror().addBox(-0.48F, -0.624F, -0.3485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(30, 80).mirror().addBox(-0.48F, -0.624F, -0.4485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.11F, -0.525F, 3.6351F, -0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r237 = rightFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(80, 9).mirror().addBox(-0.48F, -0.6733F, -0.6676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(80, 6).mirror().addBox(-0.48F, -0.4733F, -0.6676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.11F, -0.525F, 3.6351F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r238 = rightFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(25, 80).mirror().addBox(-0.5F, -0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(80, 15).mirror().addBox(-0.5F, -0.4F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.02F, -0.6571F, 2.6172F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r239 = rightFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(15, 80).mirror().addBox(-0.413F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.11F, 0.2787F, 3.1214F, 1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r240 = rightFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(80, 3).mirror().addBox(-0.48F, -0.3687F, -0.7448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.11F, -0.525F, 3.6351F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r241 = rightFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(45, 80).mirror().addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-0.31F, -0.9149F, 4.5811F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r242 = rightFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(5, 79).mirror().addBox(-0.5F, -0.7F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.114F)).mirror(false), PartPose.offsetAndRotation(-0.31F, -1.7267F, 4.6076F, 1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r243 = rightFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(40, 80).mirror().addBox(-0.5F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-0.31F, -2.0015F, 4.5897F, -1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r244 = rightFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(65, 79).mirror().addBox(-0.57F, 0.7711F, -0.0898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(35, 78).mirror().addBox(-0.39F, 0.7711F, -0.0898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.5441F, 3.9704F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r245 = rightFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(53, 35).mirror().addBox(-0.5F, -0.3665F, -0.0735F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.17F, -0.2795F, 5.3482F, 0.8149F, -0.0844F, -0.0082F));

		PartDefinition cube_r246 = rightFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(52, 53).mirror().addBox(-0.5F, -0.0021F, -1.7849F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.17F, -0.2795F, 5.3482F, -0.5464F, -0.0844F, -0.0082F));

		PartDefinition cube_r247 = rightFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(67, 42).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.13F, 0.9712F, 3.6037F, 2.6965F, 0.0F, 0.0F));

		PartDefinition cube_r248 = rightFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(5, 73).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.13F, -0.5915F, 2.926F, 2.8798F, 0.0F, 0.0F));

		PartDefinition cube_r249 = rightFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(72, 43).mirror().addBox(-0.5F, -0.3F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.13F, -0.805F, 3.2166F, 2.7925F, 0.0F, 0.0F));

		PartDefinition cube_r250 = rightFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(59, 73).mirror().addBox(-0.5F, -0.1411F, -0.6695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.17F, -0.2795F, 5.3482F, 0.0994F, -0.0844F, -0.0082F));

		PartDefinition cube_r251 = rightFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(72, 34).mirror().addBox(-0.5F, -0.3293F, -0.6389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.17F, -0.2795F, 5.3482F, 1.0418F, -0.0844F, -0.0082F));

		PartDefinition cube_r252 = rightFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(74, 71).mirror().addBox(-1.0F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(74, 68).mirror().addBox(-1.0F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(30, 74).mirror().addBox(-1.0F, -0.8F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.03F, -2.5973F, 6.4736F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r253 = rightFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(40, 74).mirror().addBox(-1.0F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(45, 74).mirror().addBox(-1.0F, 0.5F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.03F, -2.3842F, 7.4809F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r254 = rightFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(55, 43).mirror().addBox(-0.8F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(0.33F, -1.6533F, 2.8251F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r255 = rightFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(30, 77).mirror().addBox(-0.8F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.33F, -1.2488F, 2.4409F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r256 = rightFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(77, 31).mirror().addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.33F, -1.2488F, 2.4409F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r257 = rightFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(77, 34).mirror().addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.33F, -0.7142F, 2.1685F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r258 = rightFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(39, 68).mirror().addBox(-0.8F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.33F, -0.1405F, 1.9931F, 1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r259 = rightFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(50, 79).mirror().addBox(-0.41F, -0.8897F, -0.8898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -1.5719F, 5.5368F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r260 = rightFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(10, 79).mirror().addBox(-0.41F, -0.8897F, -0.8898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.7738F, 5.481F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r261 = rightFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(55, 79).mirror().addBox(-0.41F, -0.8897F, -1.1898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(20, 78).mirror().addBox(-0.41F, -0.8897F, -0.8898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.7738F, 5.481F, 0.2443F, 0.0F, 0.0F));

		PartDefinition leftBeak = head.addOrReplaceChild("leftBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2553F, 2.8357F, -4.8092F, 0.1391F, -0.0121F, 0.0864F));

		PartDefinition cube_r262 = leftBeak.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(64, 52).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0399F, 0.9219F, -0.0616F, -0.1069F, -1.2669F, -0.1043F));

		PartDefinition cube_r263 = leftBeak.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(39, 64).addBox(-0.9581F, -1.7712F, -0.3548F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6315F, 1.333F, -0.1114F, 0.026F, 0.0F, -0.2661F));

		PartDefinition cube_r264 = leftBeak.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(15, 74).addBox(-1.2581F, 0.2806F, 0.3909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(44, 67).addBox(-0.9581F, -1.1194F, 0.3909F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.5447F, 0.2808F, -0.2548F, -0.7071F, 0.0F, -0.2661F));

		PartDefinition cube_r265 = leftBeak.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(0, 74).addBox(-0.2F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(0.3557F, 1.7656F, -0.2646F, -0.4407F, -0.5725F, -1.1206F));

		PartDefinition rightBeak = head.addOrReplaceChild("rightBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2553F, 2.8357F, -4.8092F, 0.1391F, 0.0121F, -0.0864F));

		PartDefinition cube_r266 = rightBeak.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(64, 52).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0399F, 0.9219F, -0.0616F, -0.1069F, 1.2669F, 0.1043F));

		PartDefinition cube_r267 = rightBeak.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(39, 64).mirror().addBox(-0.0419F, -1.7712F, -0.3548F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.6315F, 1.333F, -0.1114F, 0.026F, 0.0F, 0.2661F));

		PartDefinition cube_r268 = rightBeak.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(15, 74).mirror().addBox(0.2581F, 0.2806F, 0.3909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(44, 67).mirror().addBox(-0.0419F, -1.1194F, 0.3909F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.5447F, 0.2808F, -0.2548F, -0.7071F, 0.0F, 0.2661F));

		PartDefinition cube_r269 = rightBeak.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.8F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)).mirror(false), PartPose.offsetAndRotation(-0.3557F, 1.7656F, -0.2646F, -0.4407F, 0.5725F, 1.1206F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 1.8859F, 0.5741F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r270 = jaw.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(20, 68).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7366F, 1.3121F, -2.1772F, 2.8919F, -0.0379F, -0.0853F));

		PartDefinition cube_r271 = jaw.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(15, 77).mirror().addBox(-0.4633F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8367F, 0.6155F, -2.0849F, -2.6218F, 0.0098F, -0.1014F));

		PartDefinition cube_r272 = jaw.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(-0.4306F, -0.1767F, -0.8869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7694F, 1.2341F, -2.5215F, -2.6211F, -0.0508F, -0.1361F));

		PartDefinition cube_r273 = jaw.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(65, 76).mirror().addBox(-0.4739F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(76, 64).mirror().addBox(-0.4739F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7361F, 1.1226F, -2.6921F, -2.2034F, -0.0302F, -0.1079F));

		PartDefinition cube_r274 = jaw.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(76, 61).mirror().addBox(-0.4606F, -0.1527F, -0.1114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7694F, 1.2341F, -2.5215F, -1.731F, -0.0508F, -0.1361F));

		PartDefinition cube_r275 = jaw.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(77, 19).mirror().addBox(-0.4606F, 0.2267F, -0.7628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(77, 22).mirror().addBox(-0.4606F, -0.1733F, -0.4628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(60, 76).mirror().addBox(-0.4606F, 0.2267F, -0.4628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7694F, 1.2341F, -2.5215F, -0.2998F, -0.0508F, -0.1361F));

		PartDefinition cube_r276 = jaw.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(77, 25).mirror().addBox(-0.4842F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(25, 77).mirror().addBox(-0.4842F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7558F, 1.0761F, -2.4328F, -0.3013F, -0.0405F, -0.1027F));

		PartDefinition cube_r277 = jaw.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(76, 58).mirror().addBox(-0.4724F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6776F, 2.0304F, -2.2043F, 0.4167F, -0.0705F, -0.1031F));

		PartDefinition cube_r278 = jaw.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(76, 55).mirror().addBox(-0.4746F, -0.4122F, -0.8544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7554F, 1.516F, -1.8587F, 0.5004F, -0.0358F, -0.1029F));

		PartDefinition cube_r279 = jaw.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(55, 76).mirror().addBox(-0.4746F, -0.474F, -0.5358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.7554F, 1.516F, -1.8587F, 0.8145F, -0.0358F, -0.1029F));

		PartDefinition cube_r280 = jaw.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(76, 52).mirror().addBox(-0.4696F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7903F, 1.2712F, -1.59F, 0.8138F, 0.0001F, -0.0648F));

		PartDefinition cube_r281 = jaw.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(40, 55).mirror().addBox(-0.2994F, -0.201F, -1.8993F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2512F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.8664F, -2.1956F, 0.6872F, -0.0705F, -0.1031F));

		PartDefinition cube_r282 = jaw.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(75, 16).mirror().addBox(-0.5F, -0.5289F, -0.7178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 2.6893F, -3.3521F, -0.734F, -0.0682F, -0.1005F));

		PartDefinition cube_r283 = jaw.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(77, 28).mirror().addBox(-0.5F, -0.3974F, -0.747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 2.6893F, -3.3521F, -0.0184F, -0.0682F, -0.1005F));

		PartDefinition cube_r284 = jaw.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(5, 76).mirror().addBox(-0.2994F, -0.3069F, 0.244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.8664F, -2.1956F, -0.84F, -0.0705F, -0.1031F));

		PartDefinition cube_r285 = jaw.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(-0.2994F, 0.16F, 0.2597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(35, 75).mirror().addBox(-0.2994F, 0.66F, 0.2597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.8664F, -2.1956F, -0.8749F, -0.0705F, -0.1031F));

		PartDefinition cube_r286 = jaw.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(76, 49).mirror().addBox(-0.2994F, -0.2835F, -1.0792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.8664F, -2.1956F, -0.5171F, -0.0705F, -0.1031F));

		PartDefinition cube_r287 = jaw.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(55, 39).mirror().addBox(-0.2994F, -0.1684F, -0.8912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(33, 55).mirror().addBox(-0.2994F, -0.3684F, -0.8912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.8664F, -2.1956F, -0.9534F, -0.0705F, -0.1031F));

		PartDefinition cube_r288 = jaw.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(55, 31).mirror().addBox(-0.2994F, 0.1602F, -0.9254F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.8664F, -2.1956F, -0.7789F, -0.0705F, -0.1031F));

		PartDefinition cube_r289 = jaw.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(55, 27).mirror().addBox(-0.2994F, 0.4544F, -1.1566F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.8664F, -2.1956F, -0.4996F, -0.0705F, -0.1031F));

		PartDefinition cube_r290 = jaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(76, 46).mirror().addBox(-0.2994F, 0.4643F, -1.5674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.8664F, -2.1956F, -0.0807F, -0.0705F, -0.1031F));

		PartDefinition cube_r291 = jaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(10, 76).mirror().addBox(-0.2994F, 0.8963F, -1.6319F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.8664F, -2.1956F, -0.0284F, -0.0705F, -0.1031F));

		PartDefinition cube_r292 = jaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(20, 75).mirror().addBox(-0.2994F, 1.1528F, 0.115F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.8664F, -2.1956F, -0.7701F, -0.0705F, -0.1031F));

		PartDefinition cube_r293 = jaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(72, 40).mirror().addBox(-0.5F, -0.3939F, -0.2933F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 2.6893F, -3.3521F, 0.1038F, -0.0682F, -0.1005F));

		PartDefinition cube_r294 = jaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(50, 76).mirror().addBox(-0.3948F, -1.7812F, -2.5262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3664F, 0.9044F, 0.6626F, -0.0175F, -0.0174F));

		PartDefinition cube_r295 = jaw.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(53, 19).mirror().addBox(-0.5F, -0.5F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.7622F, 0.6255F, -0.6985F, 0.6638F, -0.0587F, -0.0497F));

		PartDefinition cube_r296 = jaw.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(72, 37).mirror().addBox(-0.3948F, -1.1524F, -1.7787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3664F, 0.9044F, 0.5928F, -0.0175F, -0.0174F));

		PartDefinition cube_r297 = jaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(15, 66).mirror().addBox(-0.3734F, -2.3586F, -2.9751F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3664F, 0.9044F, 0.6448F, -0.0105F, -0.0436F));

		PartDefinition cube_r298 = jaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(75, 4).mirror().addBox(-0.4016F, -0.7461F, -1.2524F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3664F, 0.9044F, 0.0776F, -0.0105F, -0.0436F));

		PartDefinition cube_r299 = jaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(74, 74).mirror().addBox(-0.4016F, -1.1876F, -1.318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3664F, 0.9044F, 0.6361F, -0.0105F, -0.0436F));

		PartDefinition cube_r300 = jaw.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(19, 53).mirror().addBox(-0.3948F, -0.5981F, -1.5662F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3664F, 0.9044F, 0.1128F, -0.0175F, -0.0174F));

		PartDefinition cube_r301 = jaw.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(75, 13).mirror().addBox(-0.3948F, 0.0849F, -3.2899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3664F, 0.9044F, -0.2188F, -0.0175F, -0.0174F));

		PartDefinition cube_r302 = jaw.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(75, 10).mirror().addBox(-0.3948F, 0.4422F, -2.7197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3664F, 0.9044F, -0.3584F, -0.0175F, -0.0174F));

		PartDefinition cube_r303 = jaw.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(75, 7).mirror().addBox(-0.3948F, -0.285F, -2.5258F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3664F, 0.9044F, -0.0268F, -0.0175F, -0.0174F));

		PartDefinition cube_r304 = jaw.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(35, 72).mirror().addBox(-0.3948F, -0.6911F, -2.0327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3664F, 0.9044F, 0.1914F, -0.0175F, -0.0174F));

		PartDefinition cube_r305 = jaw.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(20, 68).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5366F, 1.3121F, -2.1772F, 2.8919F, 0.0379F, 0.0853F));

		PartDefinition cube_r306 = jaw.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(15, 77).addBox(-0.5367F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6367F, 0.6155F, -2.0849F, -2.6218F, -0.0098F, 0.1014F));

		PartDefinition cube_r307 = jaw.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(0, 77).addBox(-0.5694F, -0.1767F, -0.8869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5694F, 1.2341F, -2.5215F, -2.6211F, 0.0508F, 0.1361F));

		PartDefinition cube_r308 = jaw.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(65, 76).addBox(-0.5261F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(76, 64).addBox(-0.5261F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5361F, 1.1226F, -2.6921F, -2.2034F, 0.0302F, 0.1079F));

		PartDefinition cube_r309 = jaw.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(76, 61).addBox(-0.5394F, -0.1527F, -0.1114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5694F, 1.2341F, -2.5215F, -1.731F, 0.0508F, 0.1361F));

		PartDefinition cube_r310 = jaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(77, 19).addBox(-0.5394F, 0.2267F, -0.7628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(77, 22).addBox(-0.5394F, -0.1733F, -0.4628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(60, 76).addBox(-0.5394F, 0.2267F, -0.4628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5694F, 1.2341F, -2.5215F, -0.2998F, 0.0508F, 0.1361F));

		PartDefinition cube_r311 = jaw.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(77, 25).addBox(-0.5158F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(25, 77).addBox(-0.5158F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5558F, 1.0761F, -2.4328F, -0.3013F, 0.0405F, 0.1027F));

		PartDefinition cube_r312 = jaw.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(76, 58).addBox(-0.5276F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4776F, 2.0304F, -2.2043F, 0.4167F, 0.0705F, 0.1031F));

		PartDefinition cube_r313 = jaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(76, 55).addBox(-0.5254F, -0.4122F, -0.8544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5554F, 1.516F, -1.8587F, 0.5004F, 0.0358F, 0.1029F));

		PartDefinition cube_r314 = jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(55, 76).addBox(-0.5254F, -0.474F, -0.5358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.5554F, 1.516F, -1.8587F, 0.8145F, 0.0358F, 0.1029F));

		PartDefinition cube_r315 = jaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(76, 52).addBox(-0.5303F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5904F, 1.2712F, -1.59F, 0.8138F, -0.0001F, 0.0648F));

		PartDefinition cube_r316 = jaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(40, 55).addBox(-0.7006F, -0.201F, -1.8993F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2512F)), PartPose.offsetAndRotation(0.7F, 0.8664F, -2.1956F, 0.6872F, 0.0705F, 0.1031F));

		PartDefinition cube_r317 = jaw.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(75, 16).addBox(-0.5F, -0.5289F, -0.7178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2F, 2.6893F, -3.3521F, -0.734F, 0.0682F, 0.1005F));

		PartDefinition cube_r318 = jaw.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(77, 28).addBox(-0.5F, -0.3974F, -0.747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.2F, 2.6893F, -3.3521F, -0.0184F, 0.0682F, 0.1005F));

		PartDefinition cube_r319 = jaw.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(5, 76).addBox(-0.7006F, -0.3069F, 0.244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.7F, 0.8664F, -2.1956F, -0.84F, 0.0705F, 0.1031F));

		PartDefinition cube_r320 = jaw.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(76, 0).addBox(-0.7006F, 0.16F, 0.2597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(35, 75).addBox(-0.7006F, 0.66F, 0.2597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.7F, 0.8664F, -2.1956F, -0.8749F, 0.0705F, 0.1031F));

		PartDefinition cube_r321 = jaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(76, 49).addBox(-0.7006F, -0.2835F, -1.0792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.7F, 0.8664F, -2.1956F, -0.5171F, 0.0705F, 0.1031F));

		PartDefinition cube_r322 = jaw.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(55, 39).addBox(-0.7006F, -0.1684F, -0.8912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(33, 55).addBox(-0.7006F, -0.3684F, -0.8912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.7F, 0.8664F, -2.1956F, -0.9534F, 0.0705F, 0.1031F));

		PartDefinition cube_r323 = jaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(55, 31).addBox(-0.7006F, 0.1602F, -0.9254F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.7F, 0.8664F, -2.1956F, -0.7789F, 0.0705F, 0.1031F));

		PartDefinition cube_r324 = jaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(55, 27).addBox(-0.7006F, 0.4544F, -1.1566F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.7F, 0.8664F, -2.1956F, -0.4996F, 0.0705F, 0.1031F));

		PartDefinition cube_r325 = jaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(76, 46).addBox(-0.7006F, 0.4643F, -1.5674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.7F, 0.8664F, -2.1956F, -0.0807F, 0.0705F, 0.1031F));

		PartDefinition cube_r326 = jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(10, 76).addBox(-0.7006F, 0.8963F, -1.6319F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.7F, 0.8664F, -2.1956F, -0.0284F, 0.0705F, 0.1031F));

		PartDefinition cube_r327 = jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(20, 75).addBox(-0.7006F, 1.1528F, 0.115F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.7F, 0.8664F, -2.1956F, -0.7701F, 0.0705F, 0.1031F));

		PartDefinition cube_r328 = jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(72, 40).addBox(-0.5F, -0.3939F, -0.2933F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2F, 2.6893F, -3.3521F, 0.1038F, 0.0682F, 0.1005F));

		PartDefinition cube_r329 = jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(50, 76).addBox(-0.6052F, -1.7812F, -2.5262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.7F, 0.3664F, 0.9044F, 0.6626F, 0.0175F, 0.0174F));

		PartDefinition cube_r330 = jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(53, 19).addBox(-0.5F, -0.5F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5622F, 0.6255F, -0.6985F, 0.6638F, 0.0587F, 0.0497F));

		PartDefinition cube_r331 = jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(72, 37).addBox(-0.6052F, -1.1524F, -1.7787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.7F, 0.3664F, 0.9044F, 0.5928F, 0.0175F, 0.0174F));

		PartDefinition cube_r332 = jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(15, 66).addBox(-0.6266F, -2.3586F, -2.9751F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.7F, 0.3664F, 0.9044F, 0.6448F, 0.0105F, 0.0436F));

		PartDefinition cube_r333 = jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(75, 4).addBox(-0.5984F, -0.7461F, -1.2524F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(0.7F, 0.3664F, 0.9044F, 0.0776F, 0.0105F, 0.0436F));

		PartDefinition cube_r334 = jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(74, 74).addBox(-0.5984F, -1.1876F, -1.318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.7F, 0.3664F, 0.9044F, 0.6361F, 0.0105F, 0.0436F));

		PartDefinition cube_r335 = jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(19, 53).addBox(-0.6052F, -0.5981F, -1.5662F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.7F, 0.3664F, 0.9044F, 0.1128F, 0.0175F, 0.0174F));

		PartDefinition cube_r336 = jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(75, 13).addBox(-0.6052F, 0.0849F, -3.2899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.7F, 0.3664F, 0.9044F, -0.2188F, 0.0175F, 0.0174F));

		PartDefinition cube_r337 = jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(75, 10).addBox(-0.6052F, 0.4422F, -2.7197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(0.7F, 0.3664F, 0.9044F, -0.3584F, 0.0175F, 0.0174F));

		PartDefinition cube_r338 = jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(75, 7).addBox(-0.6052F, -0.285F, -2.5258F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.7F, 0.3664F, 0.9044F, -0.0268F, 0.0175F, 0.0174F));

		PartDefinition cube_r339 = jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(35, 72).addBox(-0.6052F, -0.6911F, -2.0327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(0.7F, 0.3664F, 0.9044F, 0.1914F, 0.0175F, 0.0174F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(8, 82).addBox(0.0F, -1.7F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 1.7F, -0.1143F, -0.0847F, 0.0212F));

		PartDefinition cube_r340 = tail.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(82, 22).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r341 = tail.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(82, 18).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r342 = tail.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(50, 82).addBox(0.0F, -0.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7405F, 2.6412F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r343 = tail.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(53, 82).addBox(0.0F, -0.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, 4.5F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F))
				.texOffs(28, 83).addBox(0.0F, -1.2F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0048F, 5.8975F, 0.1848F, -0.1287F, -0.024F));

		PartDefinition cube_r344 = tail2.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(31, 83).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r345 = tail2.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(82, 30).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6738F, 4.9839F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r346 = tail2.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(82, 26).addBox(0.0F, 0.5941F, 1.1268F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 82).addBox(0.0F, 0.2941F, -0.8732F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0239F, 1.0422F, 0.2618F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(77, 83).addBox(0.0F, -0.9F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 83).addBox(0.0F, -0.8F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 83).addBox(0.0F, -0.7F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0422F, 4.9602F, 0.1398F, -0.0432F, -0.0061F));

		PartDefinition cube_r347 = tail3.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(40, 83).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r348 = tail3.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(74, 83).addBox(0.0F, -0.3F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 83).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4851F, 4.2271F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r349 = tail3.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(68, 83).addBox(0.0F, 0.4F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6316F, 0.0237F, 0.3491F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0384F, 6.871F, -0.2628F, -0.0843F, 0.0226F));

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