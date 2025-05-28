package fossils.fossils.client.blockentity.model.prenocephale;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PrenocephaleFossilModel extends SkullModelBase {
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
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
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
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public PrenocephaleFossilModel(ModelPart root) {
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
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
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
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.8634F, -7.2205F, 0.1304F, -0.0114F, 0.0865F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(36, 32).mirror().addBox(-3.2F, 0.5F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 50).mirror().addBox(-2.2F, 0.5F, 2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 63).addBox(0.0F, -0.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 32).addBox(0.2F, 0.5F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 50).addBox(0.2F, 0.5F, 2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -1.35F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(50, 60).mirror().addBox(0.5285F, -0.0685F, 1.9875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.9575F, -0.0963F, -0.0826F, -2.8182F, 0.4032F, -0.0816F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(60, 49).mirror().addBox(0.5285F, 1.2732F, 1.0903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.9575F, -0.0963F, -0.0826F, -2.0677F, 0.4032F, -0.0816F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(59, 9).mirror().addBox(-0.3824F, -0.0794F, -3.994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 46).mirror().addBox(-0.3824F, -0.0794F, -2.994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(45, 60).mirror().addBox(-0.3824F, -0.0794F, -1.994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, -2.0F, 1.15F, 0.1907F, 0.1358F, -0.0401F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(59, 40).mirror().addBox(-3.0F, -0.0916F, 0.0365F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5F, 3.25F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(49, 57).mirror().addBox(-0.5F, 0.4908F, -0.3217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7F, -1.5F, 0.55F, -0.7854F, 0.2094F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(20, 60).mirror().addBox(-0.3753F, 0.0108F, -0.9891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6F, -2.0F, 1.15F, 0.0873F, 0.1396F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(57, 43).mirror().addBox(-3.0F, -0.0768F, -0.7069F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0F, 1.25F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(34, 55).mirror().addBox(-3.0F, -0.1768F, 0.1931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(34, 55).addBox(2.0F, -0.1768F, 0.1931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -2.0F, 1.25F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(10, 61).mirror().addBox(-3.0F, -0.0407F, 0.02F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9F, 2.35F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(59, 57).mirror().addBox(0.5285F, 1.658F, -0.9043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.9575F, -0.0963F, -0.0826F, -1.1252F, 0.4032F, -0.0816F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(57, 29).mirror().addBox(0.5285F, 1.6232F, -0.107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-2.9575F, -0.0963F, -0.0826F, -1.5441F, 0.4032F, -0.0816F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(48, 24).mirror().addBox(-0.3173F, -0.4693F, -0.741F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.9575F, -0.0963F, -0.0826F, -1.251F, -0.0211F, -0.0521F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(57, 20).mirror().addBox(-0.5F, -0.6423F, -0.9462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -0.2651F, 1.092F, 0.384F, 0.0F, -0.2618F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(41, 24).mirror().addBox(-3.0F, -0.9559F, -1.954F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(41, 24).addBox(2.0F, -0.9559F, -1.954F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.5F, 2.45F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(49, 57).addBox(-0.5F, 0.4908F, -0.3217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.7F, -1.5F, 0.55F, -0.7854F, -0.2094F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(59, 9).addBox(-0.6176F, -0.0794F, -3.994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 46).addBox(-0.6176F, -0.0794F, -2.994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 60).addBox(-0.6176F, -0.0794F, -1.994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, -2.0F, 1.15F, 0.1907F, -0.1358F, 0.0401F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(20, 60).addBox(-0.6247F, 0.0108F, -0.9891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.6F, -2.0F, 1.15F, 0.0873F, -0.1396F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(57, 43).addBox(2.0F, -0.0768F, -0.7069F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.0F, 1.25F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(59, 40).addBox(2.0F, -0.0916F, 0.0365F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.5F, 3.25F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(10, 61).addBox(2.0F, -0.0407F, 0.02F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, 2.35F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(50, 60).addBox(-1.5285F, -0.0685F, 1.9875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.9575F, -0.0963F, -0.0826F, -2.8182F, -0.4032F, 0.0816F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(60, 49).addBox(-1.5285F, 1.2732F, 1.0903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.9575F, -0.0963F, -0.0826F, -2.0677F, -0.4032F, 0.0816F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(59, 57).addBox(-1.5285F, 1.658F, -0.9043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.9575F, -0.0963F, -0.0826F, -1.1252F, -0.4032F, 0.0816F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(57, 29).addBox(-1.5285F, 1.6232F, -0.107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(2.9575F, -0.0963F, -0.0826F, -1.5441F, -0.4032F, 0.0816F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(28, 41).mirror().addBox(0.7466F, 1.8499F, -0.3881F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9F, -0.0651F, 0.992F, 0.6435F, 0.165F, -0.2328F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(40, 47).mirror().addBox(-0.264F, -0.3006F, -0.6104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-2.9F, -0.0651F, 0.992F, 0.6249F, 0.406F, -0.6022F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(28, 41).addBox(-1.7466F, 1.8499F, -0.3881F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9F, -0.0651F, 0.992F, 0.6435F, -0.165F, 0.2328F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(40, 47).addBox(-0.736F, -0.3006F, -0.6104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(2.9F, -0.0651F, 0.992F, 0.6249F, -0.406F, 0.6022F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(48, 24).addBox(-0.6827F, -0.4693F, -0.741F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.9575F, -0.0963F, -0.0826F, -1.251F, 0.0211F, 0.0521F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(57, 20).addBox(-0.5F, -0.6423F, -0.9462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -0.2651F, 1.092F, 0.384F, 0.0F, 0.2618F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(10, 52).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5656F, 1.1622F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, -1.2764F, -3.3378F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.05F, 0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4F, 0.1884F, 0.5272F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r34 = leftLeg1.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(14, 51).addBox(-0.5F, -1.9F, -0.0455F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.7052F, -0.5638F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r35 = leftLeg1.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 51).addBox(-0.5F, -1.7F, -0.0455F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7052F, -0.5638F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r36 = leftLeg1.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(60, 60).addBox(-0.5F, 0.6814F, -0.0391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(59, 54).addBox(-0.5F, -0.0186F, -0.0391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7052F, -0.8638F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r37 = leftLeg1.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(55, 60).addBox(-0.5F, -0.141F, -0.7276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.6052F, 0.2362F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r38 = leftLeg1.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(47, 44).addBox(-0.5F, 0.1552F, -0.8404F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.6052F, 0.2362F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(39, 55).addBox(-0.9F, -0.0054F, -0.522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(36, 24).addBox(-0.9F, -0.0054F, -0.022F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 5.6113F, 0.0658F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r39 = leftLeg2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(37, 8).addBox(-0.5F, -0.2633F, -0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 1.6045F, -0.0571F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r40 = leftLeg2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(49, 8).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 0.7829F, 0.2039F, -0.1222F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(33, 39).addBox(-1.0F, -0.2066F, -0.6088F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.2989F, 0.5115F, -1.5687F, 0.089F, -0.1737F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(33, 35).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1117F, -0.0325F, 0.9425F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(0, 36).addBox(-2.0F, -0.5F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, 0.0086F, -1.4016F, 0.0087F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4F, 0.1884F, 0.5272F, -0.225F, -0.0294F, -0.1276F));

		PartDefinition cube_r41 = rightLeg1.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(14, 51).mirror().addBox(-0.5F, -1.9F, -0.0455F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7052F, -0.5638F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r42 = rightLeg1.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-0.5F, -1.7F, -0.0455F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7052F, -0.5638F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r43 = rightLeg1.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(60, 60).mirror().addBox(-0.5F, 0.6814F, -0.0391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(59, 54).mirror().addBox(-0.5F, -0.0186F, -0.0391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.7052F, -0.8638F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r44 = rightLeg1.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(55, 60).mirror().addBox(-0.5F, -0.141F, -0.7276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.6052F, 0.2362F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r45 = rightLeg1.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(47, 44).mirror().addBox(-0.5F, 0.1552F, -0.8404F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.6052F, 0.2362F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(39, 55).mirror().addBox(-0.1F, -0.0054F, -0.522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(36, 24).mirror().addBox(-0.1F, -0.0054F, -0.022F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.6113F, 0.0658F, 1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r46 = rightLeg2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(37, 8).mirror().addBox(-0.5F, -0.2633F, -0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.6045F, -0.0571F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r47 = rightLeg2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(49, 8).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.7829F, 0.2039F, -0.1222F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(33, 39).mirror().addBox(-1.0F, -0.2066F, -0.6088F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.2989F, 0.5115F, -1.1603F, 0.04F, 0.0174F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(33, 35).mirror().addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.1117F, -0.0325F, 0.1134F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-1.0F, -0.5F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0086F, -1.4016F, 0.0087F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, 2.55F, -0.1402F, 0.0864F, -0.0122F));

		PartDefinition cube_r48 = tail1.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(20, 63).addBox(0.0F, -1.6F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 49).addBox(0.0F, -1.5F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 14).mirror().addBox(-2.8F, 0.0F, 3.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(42, 12).mirror().addBox(-3.1F, 0.0F, 1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(50, 19).mirror().addBox(-2.5F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 14).addBox(-0.2F, 0.0F, 3.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 12).addBox(0.1F, 0.0F, 1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 19).addBox(0.5F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 19).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2612F, 0.8291F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r49 = tail1.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(38, 65).addBox(0.0F, -0.3F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0986F, 4.33F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r50 = tail1.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(64, 57).addBox(0.0F, -0.9F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0367F, 2.2428F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r51 = tail1.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(63, 25).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6299F, 0.3135F, 0.1396F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(21, 27).addBox(-0.5F, -0.1084F, -0.1257F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.007F))
				.texOffs(50, 21).addBox(0.2F, 0.3916F, -0.1257F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 49).addBox(-0.2F, 0.3916F, 1.8743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 47).addBox(0.5F, 0.3916F, 3.8743F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 21).mirror().addBox(-2.2F, 0.3916F, -0.1257F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(50, 49).mirror().addBox(-1.8F, 0.3916F, 1.8743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 47).mirror().addBox(-1.5F, 0.3916F, 3.8743F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 48).addBox(0.0F, -1.3084F, -0.1257F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.168F, 5.7349F, 0.0271F, 0.2617F, 0.007F));

		PartDefinition cube_r52 = tail2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(41, 65).addBox(0.0F, -0.8F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 0).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2084F, 2.3743F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r53 = tail2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(32, 64).addBox(0.0F, 1.5F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 64).addBox(0.0F, 1.2F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 63).addBox(0.0F, 0.8F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2047F, -3.4921F, 0.2618F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -0.4395F, -0.0878F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(12, 64).addBox(0.0F, -0.7395F, 1.9122F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 64).addBox(0.0F, -0.6395F, 3.9122F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 64).addBox(0.0F, -0.6395F, 5.9122F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 64).addBox(0.0F, -0.6395F, 7.9122F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3527F, 5.8539F, 0.2168F, 0.3844F, 0.0824F));

		PartDefinition cube_r54 = tail3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(64, 54).addBox(0.0F, 3.1F, 15.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 40).addBox(0.0F, 2.7F, 13.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 37).addBox(0.0F, 2.3F, 11.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 64).addBox(0.0F, 1.8F, 9.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.852F, -9.346F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r55 = tail3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(64, 9).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5395F, 0.4122F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.2209F, -0.0996F, 1.0F, 1.0F, 17.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -0.2407F, 8.9832F, 0.064F, 0.3048F, 0.0192F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.35F, -1.25F, 0.2552F, 0.1267F, 0.033F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(9, 64).addBox(0.0F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0222F, -1.4184F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(64, 6).addBox(0.0F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.092F, -3.4171F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(22, 35).addBox(-0.5F, -0.0714F, -0.0265F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8373F, -3.8998F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(63, 4).mirror().addBox(-1.9F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4612F, -1.4421F, 0.0855F, -0.1163F, -0.4704F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(63, 4).addBox(-0.1F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4612F, -1.4421F, 0.0855F, 0.1163F, 0.4704F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(62, 45).mirror().addBox(-3.3847F, -1.7132F, -0.4412F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3612F, -5.3421F, 0.1762F, 0.2329F, -1.1863F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(48, 29).mirror().addBox(-2.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3612F, -5.3421F, 0.2629F, 0.1263F, -0.7103F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(62, 43).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3612F, -5.3421F, 0.3045F, 0.0626F, -0.2766F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(51, 12).mirror().addBox(-2.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4612F, -3.4421F, 0.2247F, 0.0475F, -0.7405F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(63, 23).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4612F, -3.4421F, 0.2368F, 0.0072F, -0.3058F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(51, 12).addBox(0.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4612F, -3.4421F, 0.2247F, -0.0475F, 0.7405F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(63, 23).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4612F, -3.4421F, 0.2368F, -0.0072F, 0.3058F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(48, 29).addBox(0.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3612F, -5.3421F, 0.2629F, -0.1263F, 0.7103F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(62, 43).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3612F, -5.3421F, 0.3045F, -0.0626F, 0.2766F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(62, 45).addBox(2.3847F, -1.7132F, -0.4412F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3612F, -5.3421F, 0.1762F, -0.2329F, 1.1863F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(6, 64).addBox(0.0F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9926F, -5.4632F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(36, 19).addBox(-0.5F, -0.05F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -0.4373F, -6.8998F, 0.1396F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0373F, -6.7998F, 0.4775F, 0.1553F, 0.0799F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(62, 21).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.124F, -2.5422F, 0.1876F, -0.0445F, -0.6776F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(61, 35).mirror().addBox(-3.3847F, -1.7132F, -0.4412F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.124F, -2.5422F, 0.1888F, 0.0748F, -1.5843F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(46, 6).mirror().addBox(-2.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.124F, -2.5422F, 0.2019F, -0.0201F, -1.1135F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(40, 39).mirror().addBox(-3.0F, -0.5713F, -0.2905F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.3036F, -2.0961F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(11, 30).mirror().addBox(-3.0F, -0.3156F, -0.4216F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.8036F, -4.4961F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(54, 57).mirror().addBox(-0.5F, -0.2998F, -0.9997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.6473F, -4.5533F, 1.2954F, -0.4454F, -0.285F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(40, 39).addBox(2.0F, -0.5713F, -0.2905F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, 0.3036F, -2.0961F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(11, 30).addBox(2.0F, -0.3156F, -0.4216F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-1.0F, 0.8036F, -4.4961F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(54, 57).addBox(-0.5F, -0.2998F, -0.9997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.6473F, -4.5533F, 1.2954F, 0.4454F, 0.285F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(21, 41).addBox(-0.5F, -0.9206F, -1.9446F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.1736F, -4.6096F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(7, 41).addBox(-0.5F, -0.3F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.8736F, -4.3096F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(46, 6).addBox(0.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.124F, -2.5422F, 0.2019F, 0.0201F, 1.1135F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(61, 35).addBox(2.3847F, -1.7132F, -0.4412F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.124F, -2.5422F, 0.1888F, -0.0748F, 1.5843F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(62, 21).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.124F, -2.5422F, 0.1876F, 0.0445F, 0.6776F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(52, 47).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.024F, -0.5422F, 0.0143F, -0.0703F, -0.4439F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(45, 32).mirror().addBox(-2.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.024F, -0.5422F, 0.0556F, -0.1166F, -0.8798F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(60, 52).mirror().addBox(-3.3847F, -1.7132F, -0.4412F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.024F, -0.5422F, 0.1032F, -0.0778F, -1.3605F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(60, 52).addBox(2.3847F, -1.7132F, -0.4412F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.024F, -0.5422F, 0.1032F, 0.0778F, 1.3605F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(45, 32).addBox(0.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.024F, -0.5422F, 0.0556F, 0.1166F, 0.8798F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(52, 47).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.024F, -0.5422F, 0.0143F, 0.0703F, 0.4439F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(3, 64).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -0.4585F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(0, 64).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6781F, -1.451F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(11, 35).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4339F, -3.9914F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create().texOffs(45, 19).addBox(-0.5059F, -0.5647F, -0.6475F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9774F, 1.6896F, -4.2233F, 0.7934F, 0.474F, -0.0131F));

		PartDefinition cube_r96 = leftArm1.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(53, 0).addBox(0.0F, -1.7F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0384F, 2.1539F, -0.7946F, -1.3778F, 0.1244F, -0.0034F));

		PartDefinition cube_r97 = leftArm2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(12, 45).addBox(-1.75F, 0.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, -1.05F, 0.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r98 = leftArm2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(7, 45).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 0.5754F, -0.1472F, -0.0611F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(31, 48).addBox(-0.9629F, -0.1904F, -0.3965F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.1464F, 1.983F, -0.0316F, 0.0091F, -0.0852F, 0.5782F));

		PartDefinition cube_r99 = leftHand.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(29, 55).addBox(-0.8F, 0.15F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.04F)), PartPose.offsetAndRotation(-0.1629F, -0.1404F, 0.0035F, -0.5061F, 0.0F, 0.0F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0371F, 0.5313F, -0.6988F, -0.2618F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create().texOffs(45, 19).mirror().addBox(-0.4941F, -0.5647F, -0.6475F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.9774F, 1.6896F, -4.2233F, -0.2597F, -0.1115F, 0.5943F));

		PartDefinition cube_r100 = rightArm1.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(53, 0).mirror().addBox(-1.0F, -1.7F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0384F, 2.1539F, -0.7946F, -1.0115F, -0.4555F, -0.2275F));

		PartDefinition cube_r101 = rightArm2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(12, 45).mirror().addBox(0.75F, 0.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -1.05F, 0.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightArm2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(7, 45).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 0.5754F, -0.1472F, -0.0611F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(31, 48).mirror().addBox(-0.0371F, -0.1904F, -0.3965F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.1464F, 1.983F, -0.0316F, -0.0059F, 0.0855F, -0.7533F));

		PartDefinition cube_r103 = rightHand.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(29, 55).mirror().addBox(-0.2F, 0.15F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.04F)).mirror(false), PartPose.offsetAndRotation(0.1629F, -0.1404F, 0.0035F, -0.5061F, 0.0F, 0.0F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0371F, 0.5313F, -0.6988F, -0.2618F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1514F, -3.4185F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r104 = neck1.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(63, 63).addBox(0.0F, -0.5F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3575F, -0.3223F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r105 = neck1.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(41, 28).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.4208F, -2.9F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0527F, -1.6216F, -0.5397F, 0.3944F, -0.1905F));

		PartDefinition cube_r106 = neck2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(65, 60).addBox(0.0F, -0.7487F, -1.7458F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 43).addBox(-0.5F, -0.5487F, -1.7458F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -0.105F, -0.8573F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r107 = neck2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(60, 63).addBox(0.0F, -0.4F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 58).addBox(-0.5F, -0.1F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.805F, -4.8573F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0943F, -1.9168F, 0.0889F, 0.0422F, 0.3636F));

		PartDefinition cube_r108 = neck.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(45, 63).addBox(0.0F, -0.5F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5817F, -1.5008F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r109 = neck.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(33, 44).addBox(-0.5F, -0.1F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2845F, -2.1028F, 0.6835F, -0.0523F, -0.2115F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(24, 54).addBox(-0.5F, -0.6F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F))
				.texOffs(54, 9).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(0.0F, 1.2971F, -4.5521F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(50, 51).addBox(-0.5F, -1.4841F, -0.143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(54, 37).addBox(-0.5F, -0.7841F, -0.243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.4971F, -4.5521F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(61, 12).addBox(-0.8F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 1.3552F, -0.8183F, -2.6791F, 0.0F, 0.0F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(40, 62).addBox(-0.5F, 0.9954F, 0.0004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(30, 61).addBox(-0.5F, -0.0046F, 0.0004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -2.0509F, -2.771F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(25, 61).addBox(-0.5F, -0.0148F, -0.0169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.7509F, -2.071F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(62, 15).addBox(-0.5F, -0.0465F, 0.9314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(35, 61).addBox(-0.5F, -0.0465F, 0.0314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -2.5509F, -0.171F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(61, 32).addBox(-0.5F, -0.0724F, -0.0202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.8509F, -1.071F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(19, 51).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0509F, -1.471F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(51, 63).mirror().addBox(-0.1181F, -0.8822F, -0.0172F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(51, 63).addBox(1.0819F, -0.8822F, -0.0172F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4819F, 1.1775F, -2.8403F, 0.0697F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6668F, -0.5623F));

		PartDefinition cube_r119 = leftFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(58, 0).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.9029F, -2.4421F, -1.3991F, 0.2786F, -0.02F));

		PartDefinition cube_r120 = leftFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(48, 63).addBox(-0.1819F, -0.3825F, -0.9997F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 34).addBox(-0.9819F, -0.4825F, -0.9997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(20, 57).addBox(-0.6219F, -0.4825F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.7819F, 1.3443F, -2.278F, -0.0375F, 0.2611F, -0.0187F));

		PartDefinition cube_r121 = leftFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(54, 40).addBox(-0.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.4506F, -3.3708F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r122 = leftFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(53, 3).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.4587F, 0.7008F, -3.6521F, -0.7247F, 0.0172F, 0.5428F));

		PartDefinition cube_r123 = leftFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(15, 55).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.3437F, 0.8843F, -3.8626F, -0.6549F, 0.0172F, 0.5428F));

		PartDefinition cube_r124 = leftFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(10, 55).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.2042F, 1.1109F, -4.0012F, -0.4803F, 0.0172F, 0.5428F));

		PartDefinition cube_r125 = leftFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(49, 54).addBox(-0.8F, -0.7841F, -0.243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.3F, 1.1639F, -3.9898F, -0.6461F, 0.3098F, 0.3842F));

		PartDefinition cube_r126 = leftFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(44, 53).addBox(-0.85F, -0.8962F, -0.2524F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.5F, 0.8639F, -3.5898F, -0.6547F, 0.2887F, 0.3551F));

		PartDefinition cube_r127 = leftFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(45, 49).addBox(-0.3818F, -0.4921F, -0.5798F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8335F, 0.0167F, -1.9968F, -0.9786F, 0.3044F, 0.1176F));

		PartDefinition cube_r128 = leftFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(46, 0).addBox(-1.3437F, -0.8969F, -0.5514F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8335F, 0.0167F, -1.9968F, -1.1209F, 0.7964F, 0.2443F));

		PartDefinition cube_r129 = leftFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(24, 50).addBox(-0.8F, -0.9F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.375F, -0.7684F, -0.9728F, -1.4547F, -0.1947F, 0.0323F));

		PartDefinition cube_r130 = leftFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(58, 23).addBox(-0.0325F, -0.0599F, 0.041F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.524F, -1.2765F, -2.125F, -0.6053F, -0.2017F, 0.9101F));

		PartDefinition cube_r131 = leftFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(15, 58).addBox(0.7877F, -0.0599F, -0.5894F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.524F, -2.0765F, -1.525F, -1.0222F, -0.54F, 1.2854F));

		PartDefinition cube_r132 = leftFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(10, 58).addBox(-0.0325F, -0.0599F, 0.041F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.524F, -2.0765F, -1.525F, -0.8272F, -0.1065F, 0.7011F));

		PartDefinition cube_r133 = leftFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(5, 58).addBox(0.0115F, -0.3784F, -0.0272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.224F, -1.5765F, -0.725F, -1.5372F, -0.1713F, 1.3759F));

		PartDefinition cube_r134 = leftFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(57, 17).addBox(-0.5F, -0.459F, -0.3683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.2F, 1.7298F, -3.8801F, 0.5411F, 0.5236F, 0.0F));

		PartDefinition cube_r135 = leftFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(44, 56).addBox(-0.5F, -0.4627F, -0.6328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2F, 1.7298F, -3.8801F, -0.0349F, 0.5236F, 0.0F));

		PartDefinition cube_r136 = leftFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(58, 3).addBox(-0.5F, -0.5F, -0.5384F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5227F, -1.4668F, -0.8291F, -1.4346F, -0.1095F, 0.6732F));

		PartDefinition cube_r137 = leftFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(58, 26).addBox(-0.0626F, -0.9867F, 0.0017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5227F, -2.2668F, -0.4291F, -1.9105F, 0.2848F, 0.6178F));

		PartDefinition cube_r138 = leftFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(25, 58).addBox(0.7394F, -0.9867F, -0.6002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5227F, -2.2668F, -0.4291F, -1.6418F, 0.4343F, 1.3494F));

		PartDefinition cube_r139 = leftFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(5, 55).addBox(-0.3F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(0, 55).addBox(-0.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, 2.0531F, -3.8109F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r140 = leftFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(0, 44).addBox(-1.7907F, -1.8336F, -0.2133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.375F, -0.5684F, -0.8728F, -1.4658F, 0.3302F, 0.1224F));

		PartDefinition cube_r141 = leftFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(30, 58).addBox(0.7394F, -0.9867F, -0.6002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5227F, -1.8668F, 0.4709F, -1.7469F, 0.7727F, 1.2889F));

		PartDefinition cube_r142 = leftFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(35, 58).addBox(-0.0626F, -0.9867F, 0.0017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 6).addBox(-0.0626F, -1.8867F, 0.0017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5227F, -1.8668F, 0.4709F, -2.2287F, 0.4714F, 0.4989F));

		PartDefinition cube_r143 = leftFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(47, 41).addBox(-1.1F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.4957F, -0.3038F, 1.1746F, 0.2174F, -1.3091F, 1.5959F));

		PartDefinition cube_r144 = leftFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(47, 38).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.4957F, -0.3038F, 1.1746F, 1.1703F, -0.9474F, 0.7407F));

		PartDefinition cube_r145 = leftFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(24, 47).addBox(-1.5F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.9817F, -0.1384F, 1.3978F, 1.0359F, -0.2025F, 0.421F));

		PartDefinition cube_r146 = leftFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(34, 52).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.6152F, -0.4372F, -0.0668F, 1.871F, 0.4818F, 0.2359F));

		PartDefinition cube_r147 = leftFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(52, 31).addBox(-0.4649F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.7149F, -0.5625F, 0.2081F, 1.7174F, 0.3816F, 0.2026F));

		PartDefinition cube_r148 = leftFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(29, 52).addBox(-0.5388F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.9088F, -0.4928F, 0.448F, 1.4731F, 0.3816F, 0.2026F));

		PartDefinition cube_r149 = leftFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(5, 52).addBox(-0.6F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(2.0556F, -0.4811F, 0.7919F, 1.043F, 0.1296F, 0.2272F));

		PartDefinition cube_r150 = leftFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(0, 61).addBox(-0.3375F, -0.8056F, -0.1264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 61).addBox(-0.3375F, -0.8056F, -0.7264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.572F, 0.9337F, -1.5138F, 0.284F, 0.3308F, 0.0982F));

		PartDefinition cube_r151 = leftFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(53, 23).addBox(-0.3275F, -0.7377F, -0.4774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(53, 26).addBox(-0.2175F, -0.7377F, -0.4774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.572F, 0.9337F, -1.5138F, 0.1793F, 0.3308F, 0.0982F));

		PartDefinition cube_r152 = leftFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(39, 52).addBox(-0.3475F, -0.3708F, -0.9579F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.572F, 0.9337F, -1.5138F, -0.3269F, 0.3308F, 0.0982F));

		PartDefinition cube_r153 = leftFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(51, 34).addBox(-0.3375F, -0.5207F, -0.3946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.572F, 0.9337F, -1.5138F, -2.8576F, 0.3308F, 0.0982F));

		PartDefinition cube_r154 = leftFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(51, 16).addBox(-0.3375F, -0.7906F, -0.4194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.572F, 0.9337F, -1.5138F, -0.7283F, 0.3308F, 0.0982F));

		PartDefinition cube_r155 = leftFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(54, 54).addBox(-0.48F, -1.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(0.0F, 1.9639F, -3.9898F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r156 = leftFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(17, 48).addBox(-1.3F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 0.3562F, 0.5018F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r157 = leftFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(15, 61).addBox(-0.3F, -0.7775F, -0.5264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.72F, 0.667F, -0.0217F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r158 = leftFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(62, 18).addBox(-0.3F, -0.2237F, -0.5367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.72F, 0.667F, -0.0217F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r159 = leftFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(0, 48).addBox(-0.5575F, 0.0414F, -0.8747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(0, 48).addBox(-0.5575F, -0.6586F, -0.8747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.572F, 0.9337F, -1.5138F, -1.4003F, 0.3308F, 0.0982F));

		PartDefinition cube_r160 = leftFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(38, 4).addBox(-0.5F, -0.7384F, -1.5656F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.69F, 0.6645F, -0.8527F, -1.3956F, -0.1571F, 0.0F));

		PartDefinition cube_r161 = leftFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(44, 34).addBox(-0.8F, -0.9051F, -1.0016F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2668F, 0.1123F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r162 = leftFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(39, 1).addBox(-0.5372F, -0.1365F, 0.0188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.572F, 0.9337F, -1.5138F, 0.0703F, 0.1563F, 0.1441F));

		PartDefinition cube_r163 = leftFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(39, 1).addBox(-0.5575F, -0.1173F, -0.7741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.572F, 0.9337F, -1.5138F, 0.0657F, 0.3308F, 0.0982F));

		PartDefinition cube_r164 = leftFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(18, 45).addBox(-0.6F, 0.1725F, -0.2439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6812F, 0.7575F, -0.8155F, -0.646F, 0.1737F, -0.0231F));

		PartDefinition cube_r165 = leftFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(44, 16).addBox(-1.3F, -0.4F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 1.505F, -0.5632F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r166 = leftFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(54, 6).addBox(-0.3432F, -0.0462F, -0.144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(46, 3).addBox(-1.9432F, -0.0807F, -0.444F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8F, -0.2057F, 0.4671F, 1.0475F, 0.039F, 0.2799F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6668F, -0.5623F));

		PartDefinition cube_r167 = rightFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(58, 0).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.9029F, -2.4421F, -1.3991F, -0.2786F, 0.02F));

		PartDefinition cube_r168 = rightFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(48, 63).mirror().addBox(0.1819F, -0.3825F, -0.9997F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 34).mirror().addBox(-0.0181F, -0.4825F, -0.9997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(20, 57).mirror().addBox(-0.3781F, -0.4825F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.7819F, 1.3443F, -2.278F, -0.0375F, -0.2611F, 0.0187F));

		PartDefinition cube_r169 = rightFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(54, 40).mirror().addBox(-0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4506F, -3.3708F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r170 = rightFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(53, 3).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.4587F, 0.7008F, -3.6521F, -0.7247F, -0.0172F, -0.5428F));

		PartDefinition cube_r171 = rightFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(15, 55).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.3437F, 0.8843F, -3.8626F, -0.6549F, -0.0172F, -0.5428F));

		PartDefinition cube_r172 = rightFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(10, 55).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.2042F, 1.1109F, -4.0012F, -0.4803F, -0.0172F, -0.5428F));

		PartDefinition cube_r173 = rightFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(49, 54).mirror().addBox(-0.2F, -0.7841F, -0.243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.1639F, -3.9898F, -0.6461F, -0.3098F, -0.3842F));

		PartDefinition cube_r174 = rightFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(44, 53).mirror().addBox(-0.15F, -0.8962F, -0.2524F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8639F, -3.5898F, -0.6547F, -0.2887F, -0.3551F));

		PartDefinition cube_r175 = rightFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(45, 49).mirror().addBox(-0.6182F, -0.4921F, -0.5798F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8335F, 0.0167F, -1.9968F, -0.9786F, -0.3044F, -0.1176F));

		PartDefinition cube_r176 = rightFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(46, 0).mirror().addBox(-0.6563F, -0.8969F, -0.5514F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8335F, 0.0167F, -1.9968F, -1.1209F, -0.7964F, -0.2443F));

		PartDefinition cube_r177 = rightFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(24, 50).mirror().addBox(-0.2F, -0.9F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.375F, -0.7684F, -0.9728F, -1.4547F, 0.1947F, -0.0323F));

		PartDefinition cube_r178 = rightFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(58, 23).mirror().addBox(-0.9675F, -0.0599F, 0.041F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.524F, -1.2765F, -2.125F, -0.6053F, 0.2017F, -0.9101F));

		PartDefinition cube_r179 = rightFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(15, 58).mirror().addBox(-1.7877F, -0.0599F, -0.5894F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.524F, -2.0765F, -1.525F, -1.0222F, 0.54F, -1.2854F));

		PartDefinition cube_r180 = rightFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(10, 58).mirror().addBox(-0.9675F, -0.0599F, 0.041F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.524F, -2.0765F, -1.525F, -0.8272F, 0.1065F, -0.7011F));

		PartDefinition cube_r181 = rightFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(5, 58).mirror().addBox(-1.0115F, -0.3784F, -0.0272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.224F, -1.5765F, -0.725F, -1.5372F, 0.1713F, -1.3759F));

		PartDefinition cube_r182 = rightFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(57, 17).mirror().addBox(-0.5F, -0.459F, -0.3683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 1.7298F, -3.8801F, 0.5411F, -0.5236F, 0.0F));

		PartDefinition cube_r183 = rightFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(44, 56).mirror().addBox(-0.5F, -0.4627F, -0.6328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 1.7298F, -3.8801F, -0.0349F, -0.5236F, 0.0F));

		PartDefinition cube_r184 = rightFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(58, 3).mirror().addBox(-0.5F, -0.5F, -0.5384F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5227F, -1.4668F, -0.8291F, -1.4346F, 0.1095F, -0.6732F));

		PartDefinition cube_r185 = rightFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(58, 26).mirror().addBox(-0.9374F, -0.9867F, 0.0017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5227F, -2.2668F, -0.4291F, -1.9105F, -0.2848F, -0.6178F));

		PartDefinition cube_r186 = rightFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(25, 58).mirror().addBox(-1.7394F, -0.9867F, -0.6002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5227F, -2.2668F, -0.4291F, -1.6418F, -0.4343F, -1.3494F));

		PartDefinition cube_r187 = rightFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(5, 55).mirror().addBox(-0.7F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(0, 55).mirror().addBox(-0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0531F, -3.8109F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r188 = rightFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-0.2093F, -1.8336F, -0.2133F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.375F, -0.5684F, -0.8728F, -1.4658F, -0.3302F, -0.1224F));

		PartDefinition cube_r189 = rightFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(30, 58).mirror().addBox(-1.7394F, -0.9867F, -0.6002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5227F, -1.8668F, 0.4709F, -1.7469F, -0.7727F, -1.2889F));

		PartDefinition cube_r190 = rightFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(35, 58).mirror().addBox(-0.9374F, -0.9867F, 0.0017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(59, 6).mirror().addBox(-0.9374F, -1.8867F, 0.0017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5227F, -1.8668F, 0.4709F, -2.2287F, -0.4714F, -0.4989F));

		PartDefinition cube_r191 = rightFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(47, 41).mirror().addBox(-0.9F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.4957F, -0.3038F, 1.1746F, 0.2174F, 1.3091F, -1.5959F));

		PartDefinition cube_r192 = rightFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(47, 38).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.4957F, -0.3038F, 1.1746F, 1.1703F, 0.9474F, -0.7407F));

		PartDefinition cube_r193 = rightFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(24, 47).mirror().addBox(-0.5F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.9817F, -0.1384F, 1.3978F, 1.0359F, 0.2025F, -0.421F));

		PartDefinition cube_r194 = rightFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(34, 52).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.6152F, -0.4372F, -0.0668F, 1.871F, -0.4818F, -0.2359F));

		PartDefinition cube_r195 = rightFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(52, 31).mirror().addBox(-0.5351F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.7149F, -0.5625F, 0.2081F, 1.7174F, -0.3816F, -0.2026F));

		PartDefinition cube_r196 = rightFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(29, 52).mirror().addBox(-0.4612F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.9088F, -0.4928F, 0.448F, 1.4731F, -0.3816F, -0.2026F));

		PartDefinition cube_r197 = rightFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(5, 52).mirror().addBox(-0.4F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-2.0556F, -0.4811F, 0.7919F, 1.043F, -0.1296F, -0.2272F));

		PartDefinition cube_r198 = rightFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-0.6625F, -0.8056F, -0.1264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 61).mirror().addBox(-0.6625F, -0.8056F, -0.7264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.572F, 0.9337F, -1.5138F, 0.284F, -0.3308F, -0.0982F));

		PartDefinition cube_r199 = rightFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(53, 23).mirror().addBox(-0.6725F, -0.7377F, -0.4774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(53, 26).mirror().addBox(-0.7825F, -0.7377F, -0.4774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.572F, 0.9337F, -1.5138F, 0.1793F, -0.3308F, -0.0982F));

		PartDefinition cube_r200 = rightFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(39, 52).mirror().addBox(-0.6525F, -0.3708F, -0.9579F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.572F, 0.9337F, -1.5138F, -0.3269F, -0.3308F, -0.0982F));

		PartDefinition cube_r201 = rightFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(51, 34).mirror().addBox(-0.6625F, -0.5207F, -0.3946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.572F, 0.9337F, -1.5138F, -2.8576F, -0.3308F, -0.0982F));

		PartDefinition cube_r202 = rightFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(51, 16).mirror().addBox(-0.6625F, -0.7906F, -0.4194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false), PartPose.offsetAndRotation(-0.572F, 0.9337F, -1.5138F, -0.7283F, -0.3308F, -0.0982F));

		PartDefinition cube_r203 = rightFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(54, 54).mirror().addBox(-0.52F, -1.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.9639F, -3.9898F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r204 = rightFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(17, 48).mirror().addBox(-0.7F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3562F, 0.5018F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r205 = rightFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(15, 61).mirror().addBox(-0.7F, -0.7775F, -0.5264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.72F, 0.667F, -0.0217F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r206 = rightFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(62, 18).mirror().addBox(-0.7F, -0.2237F, -0.5367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.72F, 0.667F, -0.0217F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r207 = rightFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-0.4425F, 0.0414F, -0.8747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(0, 48).mirror().addBox(-0.4425F, -0.6586F, -0.8747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.572F, 0.9337F, -1.5138F, -1.4003F, -0.3308F, -0.0982F));

		PartDefinition cube_r208 = rightFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(38, 4).mirror().addBox(-0.5F, -0.7384F, -1.5656F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.69F, 0.6645F, -0.8527F, -1.3956F, 0.1571F, 0.0F));

		PartDefinition cube_r209 = rightFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(44, 34).mirror().addBox(-1.2F, -0.9051F, -1.0016F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2668F, 0.1123F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r210 = rightFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(39, 1).mirror().addBox(-0.4628F, -0.1365F, 0.0188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.572F, 0.9337F, -1.5138F, 0.0703F, -0.1563F, -0.1441F));

		PartDefinition cube_r211 = rightFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(39, 1).mirror().addBox(-0.4425F, -0.1173F, -0.7741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.572F, 0.9337F, -1.5138F, 0.0657F, -0.3308F, -0.0982F));

		PartDefinition cube_r212 = rightFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(18, 45).mirror().addBox(-0.4F, 0.1725F, -0.2439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6812F, 0.7575F, -0.8155F, -0.646F, -0.1737F, 0.0231F));

		PartDefinition cube_r213 = rightFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(44, 16).mirror().addBox(-0.7F, -0.4F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.505F, -0.5632F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r214 = rightFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(54, 6).mirror().addBox(-0.6568F, -0.0462F, -0.144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(46, 3).mirror().addBox(-0.0568F, -0.0807F, -0.444F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.2057F, 0.4671F, 1.0475F, -0.039F, -0.2799F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4743F, -0.7544F, -0.5543F, 0.0F, 0.0F));

		PartDefinition cube_r215 = jaw.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(62, 29).mirror().addBox(-1.5F, -0.7837F, -0.83F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(62, 29).addBox(-0.3F, -0.7837F, -0.83F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.4F, 1.0879F, -0.5112F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r216 = jaw.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(52, 44).mirror().addBox(-1.5F, -0.3764F, -0.9144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(52, 44).addBox(-0.3F, -0.3764F, -0.9144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, 0.3879F, -1.0112F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r217 = jaw.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(42, 8).mirror().addBox(-1.5F, -0.7514F, -1.7565F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(42, 8).addBox(-0.3F, -0.7514F, -1.7565F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, 0.0879F, 0.5888F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r218 = jaw.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(40, 59).mirror().addBox(-0.5F, -0.189F, -0.7674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.0878F, -0.7286F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r219 = jaw.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(59, 37).mirror().addBox(-0.5F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.4878F, -0.6286F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r220 = jaw.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(14, 41).mirror().addBox(-0.2306F, -0.7469F, -1.7564F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(0, 40).mirror().addBox(-0.3306F, -0.5469F, -1.7564F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.7492F, 1.1351F, -1.1986F, 0.684F, -0.3145F, -0.1541F));

		PartDefinition cube_r221 = jaw.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(37, 15).mirror().addBox(-0.3306F, -0.4477F, -1.772F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7492F, 1.1351F, -1.1986F, 0.6316F, -0.3145F, -0.1541F));

		PartDefinition cube_r222 = jaw.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(40, 59).addBox(-0.5F, -0.189F, -0.7674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.6F, 0.0878F, -0.7286F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r223 = jaw.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(59, 37).addBox(-0.5F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.6F, 0.4878F, -0.6286F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r224 = jaw.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(14, 41).addBox(-0.7694F, -0.7469F, -1.7564F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F))
				.texOffs(0, 40).addBox(-0.6694F, -0.5469F, -1.7564F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.7492F, 1.1351F, -1.1986F, 0.684F, 0.3145F, 0.1541F));

		PartDefinition cube_r225 = jaw.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(37, 15).addBox(-0.6694F, -0.4477F, -1.772F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7492F, 1.1351F, -1.1986F, 0.6316F, 0.3145F, 0.1541F));

		PartDefinition cube_r226 = jaw.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(56, 14).addBox(-0.6056F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F))
				.texOffs(55, 51).addBox(-0.6056F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(55, 51).addBox(-0.6056F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1056F, 2.1633F, -2.6325F, 0.5634F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 70, 70);
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