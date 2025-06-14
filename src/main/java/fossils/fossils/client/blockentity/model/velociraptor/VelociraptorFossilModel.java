package fossils.fossils.client.blockentity.model.velociraptor;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class VelociraptorFossilModel extends SkullModelBase {
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

	public VelociraptorFossilModel(ModelPart root) {
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
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 1.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -23.0F, -1.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0012F, 0.0471F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0F, -3.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(10, 52).mirror().addBox(-1.1547F, -2.9343F, -1.6876F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7453F, 1.4804F, 1.3491F, -0.5585F, 0.0F, 0.2182F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(52, 10).mirror().addBox(-1.1547F, -3.3337F, -1.5208F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7453F, 1.4804F, 1.3491F, 0.1047F, 0.0F, 0.2182F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(25, 30).mirror().addBox(-1.1547F, -2.463F, -3.4249F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7453F, 1.4804F, 1.3491F, 0.0524F, 0.0F, 0.2182F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(48, 51).mirror().addBox(-0.8268F, 0.5565F, -5.2952F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7453F, 1.4804F, 1.3491F, -0.7854F, 0.2094F, 0.2182F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(60, 45).mirror().addBox(-0.8268F, -4.0349F, -4.0091F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7453F, 1.4804F, 1.3491F, 0.1745F, 0.2094F, 0.2182F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(35, 35).mirror().addBox(-0.8268F, -2.9165F, -4.238F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7453F, 1.4804F, 1.3491F, -0.1222F, 0.2094F, 0.2182F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(35, 17).mirror().addBox(-0.81F, -2.6292F, -2.5004F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7453F, 1.4804F, 1.3491F, 0.384F, 0.0F, -0.0436F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(27, 60).mirror().addBox(0.0368F, 1.0943F, -1.5692F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6453F, 0.5804F, 1.3491F, 0.7376F, 0.0641F, -0.2937F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(21, 63).mirror().addBox(0.1853F, -0.1413F, -2.0088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6453F, 0.5804F, 1.3491F, 1.1978F, 0.0146F, -0.2373F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(60, 55).mirror().addBox(0.0368F, -0.3415F, -1.0697F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6453F, 0.5804F, 1.3491F, 0.3711F, 0.0641F, -0.2937F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(45, 55).mirror().addBox(-0.3704F, 0.0677F, -0.5568F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2453F, 1.4804F, -0.7509F, 0.5073F, 0.1031F, -0.1203F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(59, 25).mirror().addBox(-0.3704F, 2.9651F, -0.9906F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.2453F, 1.4804F, -0.7509F, 0.6469F, 0.1031F, -0.1203F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(3, 51).mirror().addBox(-0.3704F, 4.7941F, -2.6054F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(60, 40).mirror().addBox(-0.3704F, 4.7941F, -2.9054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.2453F, 1.4804F, -0.7509F, 1.0221F, 0.1031F, -0.1203F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(50, 6).mirror().addBox(-0.3704F, 4.6022F, -0.9573F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2453F, 1.4804F, -0.7509F, 0.6556F, 0.1031F, -0.1203F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(35, 35).addBox(-0.1732F, -2.9165F, -4.238F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7453F, 1.4804F, 1.3491F, -0.1222F, -0.2094F, -0.2182F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(60, 45).addBox(-0.1732F, -4.0349F, -4.0091F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7453F, 1.4804F, 1.3491F, 0.1745F, -0.2094F, -0.2182F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(25, 30).addBox(0.1547F, -2.463F, -3.4249F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7453F, 1.4804F, 1.3491F, 0.0524F, 0.0F, -0.2182F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(52, 10).addBox(0.1547F, -3.3337F, -1.5208F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7453F, 1.4804F, 1.3491F, 0.1047F, 0.0F, -0.2182F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(10, 52).addBox(0.1547F, -2.9343F, -1.6876F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7453F, 1.4804F, 1.3491F, -0.5585F, 0.0F, -0.2182F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(48, 51).addBox(-0.1732F, 0.5565F, -5.2952F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7453F, 1.4804F, 1.3491F, -0.7854F, -0.2094F, -0.2182F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(35, 17).addBox(-0.19F, -2.6292F, -2.5004F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7453F, 1.4804F, 1.3491F, 0.384F, 0.0F, 0.0436F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(27, 60).addBox(-1.0368F, 1.0943F, -1.5692F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6453F, 0.5804F, 1.3491F, 0.7376F, -0.0641F, 0.2937F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(60, 55).addBox(-1.0368F, -0.3415F, -1.0697F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6453F, 0.5804F, 1.3491F, 0.3711F, -0.0641F, 0.2937F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(21, 63).addBox(-1.1853F, -0.1413F, -2.0088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6453F, 0.5804F, 1.3491F, 1.1978F, -0.0146F, 0.2373F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(45, 55).addBox(-0.6296F, 0.0677F, -0.5568F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2453F, 1.4804F, -0.7509F, 0.5073F, -0.1031F, 0.1203F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(59, 25).addBox(-0.6296F, 2.9651F, -0.9906F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2453F, 1.4804F, -0.7509F, 0.6469F, -0.1031F, 0.1203F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(50, 6).addBox(-0.6296F, 4.6022F, -0.9573F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2453F, 1.4804F, -0.7509F, 0.6556F, -0.1031F, 0.1203F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(60, 40).addBox(-0.6296F, 4.7941F, -2.9054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(3, 51).addBox(-0.6296F, 4.7941F, -2.6054F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2453F, 1.4804F, -0.7509F, 1.0221F, -0.1031F, 0.1203F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(28, 0).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.1F, -3.3F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(6, 0).addBox(-0.5F, -0.7948F, -0.5638F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3038F, -0.0714F, -0.3F, -0.6091F, 0.05F, 0.0715F));

		PartDefinition cube_r31 = leftLeg1.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(19, 48).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.2052F, -0.5638F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(12, 46).addBox(-0.9F, -0.0054F, -0.522F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.01F))
				.texOffs(28, 44).addBox(-0.9F, 2.9946F, -0.022F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 7.1052F, 0.2362F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r32 = leftLeg2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(16, 36).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(48, 41).addBox(-0.5F, -4.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.6F, 4.4946F, 0.478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(45, 24).addBox(-1.0F, -0.2066F, -0.6088F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0946F, 0.178F, -1.0893F, -0.0774F, -0.0404F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7934F, -0.3088F, 1.2654F, 0.0F, 0.0F));

		PartDefinition leftSickleClaw = leftFoot.addOrReplaceChild("leftSickleClaw", CubeListBuilder.create().texOffs(33, 30).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -1.2654F, 0.3054F, 0.0F));

		PartDefinition cube_r33 = leftSickleClaw.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(36, 40).addBox(0.0F, -2.0F, -2.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, -0.7418F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(36, 23).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, 0.0F, -2.5F, -0.6109F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.7948F, -0.5638F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3038F, -0.0773F, -0.3098F, -0.4784F, -0.0403F, -0.0774F));

		PartDefinition cube_r34 = rightLeg1.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(43, 47).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.2052F, -0.5638F, 0.1571F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(45, 9).addBox(-0.1F, -0.0054F, -0.522F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.01F))
				.texOffs(44, 16).addBox(-0.1F, 2.9946F, -0.022F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 7.1052F, 0.2362F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r35 = rightLeg2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(11, 36).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(48, 36).addBox(-0.5F, -4.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.6F, 4.4946F, 0.478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(5, 45).addBox(-1.0F, -0.2066F, -0.6088F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0946F, 0.178F, -1.1657F, 0.2415F, 0.1022F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(14, 6).addBox(-1.5F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7934F, -0.3088F, 2.138F, 0.0F, 0.0F));

		PartDefinition rightSickleClaw = rightFoot.addOrReplaceChild("rightSickleClaw", CubeListBuilder.create().texOffs(28, 8).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, -1.1345F, -0.3054F, 0.0F));

		PartDefinition cube_r36 = rightSickleClaw.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(40, 5).addBox(0.0F, -2.0F, -2.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, -0.7418F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(20, 30).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -2.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -3.3F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(30, 15).addBox(-0.5F, -0.8952F, -0.0025F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6F, -1.9F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(33, 30).addBox(-0.5F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7F, -3.9F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(42, 63).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -3.4269F, 0.2376F, 0.2089F, -0.4878F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(63, 32).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -1.4269F, 0.252F, 0.177F, -0.6596F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(63, 24).mirror().addBox(-3.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -1.4269F, -0.0373F, 0.3237F, -1.6974F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(58, 48).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -1.4269F, 0.14F, 0.2951F, -1.1294F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(58, 53).mirror().addBox(-4.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -3.4269F, -0.0739F, 0.3276F, -1.5346F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(59, 11).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -3.4269F, 0.1116F, 0.3171F, -0.9634F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(63, 32).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -1.4269F, 0.252F, -0.177F, 0.6596F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(58, 48).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -1.4269F, 0.14F, -0.2951F, 1.1294F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(63, 24).addBox(2.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -1.4269F, -0.0373F, -0.3237F, 1.6974F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(58, 53).addBox(2.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -3.4269F, -0.0739F, -0.3276F, 1.5346F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(59, 11).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -3.4269F, 0.1116F, -0.3171F, 0.9634F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(42, 63).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -3.4269F, 0.2376F, -0.2089F, 0.4878F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(15, 15).addBox(-2.0F, -1.9021F, -0.1562F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.2F, -0.3F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(22, 23).addBox(-1.5F, -0.9F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.8971F, -2.1906F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(14, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7F, -3.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -4.7F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(21, 36).addBox(-0.5F, -0.1964F, -2.2441F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 52).addBox(-1.0F, 0.0036F, -2.2441F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -2.9F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, -1.109F, -0.0167F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -1.1F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(7, 34).addBox(-0.5F, -0.676F, -0.1108F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2F, -3.0F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(49, 34).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5255F, -2.6269F, 0.4124F, 0.3003F, -0.4239F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(63, 2).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1255F, -0.6269F, 0.3639F, 0.1863F, -0.3969F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(21, 0).mirror().addBox(-5.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1255F, -0.6269F, 0.014F, 0.4232F, -1.4361F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(58, 43).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1255F, -0.6269F, 0.2394F, 0.3527F, -0.8552F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 9).mirror().addBox(-5.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5255F, -2.6269F, -0.0722F, 0.5198F, -1.514F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(58, 38).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5255F, -2.6269F, 0.2294F, 0.4757F, -0.8979F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(44, 6).mirror().addBox(-4.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9255F, -4.4269F, -0.0085F, 0.6829F, -1.594F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(58, 0).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9255F, -4.4269F, 0.3906F, 0.5756F, -0.933F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(33, 40).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9255F, -4.4269F, 0.5903F, 0.3276F, -0.4849F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(33, 40).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9255F, -4.4269F, 0.5903F, -0.3276F, 0.4849F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(58, 0).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9255F, -4.4269F, 0.3906F, -0.5756F, 0.933F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(44, 6).addBox(2.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9255F, -4.4269F, -0.0085F, -0.6829F, 1.594F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(49, 34).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5255F, -2.6269F, 0.4124F, -0.3003F, 0.4239F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(58, 38).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5255F, -2.6269F, 0.2294F, -0.4757F, 0.8979F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 9).addBox(2.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5255F, -2.6269F, -0.0722F, -0.5198F, 1.514F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(21, 0).addBox(2.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1255F, -0.6269F, 0.014F, -0.4232F, 1.4361F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(58, 43).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1255F, -0.6269F, 0.2394F, -0.3527F, 0.8552F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(63, 2).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1255F, -0.6269F, 0.3639F, -0.1863F, 0.3969F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(0, 7).mirror().addBox(-2.1F, -0.1F, -0.3F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6899F, 5.4831F, -1.3582F, 0.457F, 1.0981F, 0.5068F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(27, 37).mirror().addBox(-1.5F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5591F, 5.3265F, -2.2021F, 0.2011F, 0.408F, 0.9215F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(7, 56).mirror().addBox(0.4694F, -1.1281F, -2.9477F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6097F, 3.3261F, -1.9865F, 1.1149F, -0.0017F, 0.0376F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(21, 42).mirror().addBox(-0.1597F, 0.1578F, -1.2102F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1124F, 2.2262F, -4.1776F, 0.1013F, -0.5324F, -0.4949F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(49, 20).mirror().addBox(-1.3903F, -2.7517F, 1.705F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(49, 20).addBox(3.6097F, -2.7517F, 1.705F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6097F, 3.3261F, -1.9865F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(-1.3903F, -2.5254F, -1.9711F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(0, 13).addBox(3.6097F, -2.5254F, -1.9711F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6097F, 3.3261F, -1.9865F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(49, 30).addBox(0.3903F, -2.297F, -1.1923F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6097F, 3.3261F, -1.9865F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(21, 42).addBox(-0.8403F, 0.1578F, -1.2102F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1124F, 2.2262F, -4.1776F, 0.1013F, 0.5324F, 0.4949F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(7, 56).addBox(-1.4694F, -1.1281F, -2.9477F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6097F, 3.3261F, -1.9865F, 1.1149F, 0.0017F, -0.0376F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(27, 37).addBox(-0.5F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5591F, 5.3265F, -2.2021F, 0.2011F, -0.408F, -0.9215F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(0, 7).addBox(-1.9F, -0.1F, -0.3F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6899F, 5.4831F, -1.3582F, 0.457F, -1.0981F, -0.5068F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(0, 34).addBox(-1.0F, -0.5F, -3.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create().texOffs(0, 45).addBox(-0.5059F, -0.5647F, -0.6475F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.2474F, 2.9395F, -3.5157F, 0.657F, 0.0545F, -1.269F));

		PartDefinition cube_r87 = leftArm1.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(22, 59).addBox(0.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0941F, 4.6353F, -0.6475F, -1.7894F, 0.0387F, -0.0202F));

		PartDefinition cube_r88 = leftArm2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(0, 59).addBox(-1.75F, -0.2F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, 1.95F, 0.6F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r89 = leftArm2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(50, 57).addBox(-1.75F, 0.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, -0.85F, 0.6F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r90 = leftArm2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(9, 26).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.25F, -0.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r91 = leftArm2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(29, 1).addBox(-0.5F, -0.5991F, -0.5131F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.35F, -0.5F, -0.0262F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(49, 15).addBox(-1.0F, -0.25F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(38, 46).addBox(-1.0F, 1.7F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(17, 59).addBox(-1.0F, 1.7F, 0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2F, 4.5F, -0.4F, 0.6614F, -0.0692F, 0.0532F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create().texOffs(46, 0).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.2597F, -0.0338F, -0.1265F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create().texOffs(43, 39).addBox(-0.4941F, -0.5647F, -0.6475F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.2474F, 2.9395F, -3.5157F, 0.5557F, -0.0922F, 1.2823F));

		PartDefinition cube_r92 = rightArm1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(58, 32).addBox(-1.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0941F, 4.6353F, -0.6475F, -1.7894F, -0.0387F, 0.0202F));

		PartDefinition cube_r93 = rightArm2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(55, 57).addBox(0.75F, -0.2F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2F, 1.95F, 0.6F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightArm2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(36, 57).addBox(0.75F, 0.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2F, -0.85F, 0.6F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightArm2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(14, 15).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.05F, 2.25F, -0.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightArm2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -0.5991F, -0.5131F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.05F, 2.35F, -0.5F, -0.0262F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(48, 46).addBox(0.0F, -0.25F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(33, 46).addBox(0.0F, 1.7F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(12, 59).addBox(0.0F, 1.7F, 0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.2F, 4.5F, -0.4F, 0.7923F, 0.0692F, -0.0532F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create().texOffs(42, 32).addBox(0.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.2597F, 0.0338F, 0.1265F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1F, -4.8F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r97 = neck3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(60, 50).addBox(-1.0F, -0.8643F, 0.2306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 0.2F, -1.2F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r98 = neck3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(37, 0).addBox(-0.5F, -1.3F, 1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 0).addBox(-1.0F, -1.0F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.6F, -3.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3F, -3.0F, 0.2676F, 0.212F, 0.0517F));

		PartDefinition cube_r99 = neck2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(40, 40).addBox(-0.5F, -0.3262F, 2.9312F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 11).addBox(-0.5F, -0.5262F, 0.9312F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 11).addBox(-1.0F, -0.0262F, -0.0688F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.7F, -1.9F, -0.7941F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.9F, -2.8F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r100 = neck.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(41, 17).addBox(0.0F, -0.8762F, -0.0153F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.1F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r101 = neck.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(52, 24).addBox(-0.5F, -0.0676F, 0.0085F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.0F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r102 = neck.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(43, 0).addBox(0.0F, -1.0024F, -0.0026F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -2.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r103 = neck.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(31, 53).addBox(-0.5F, -0.4303F, -0.203F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -2.8F, -0.0349F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -3.0F, 0.2628F, 0.0956F, -0.0195F));

		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(14, 26).addBox(-1.0F, -0.0457F, -0.0186F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.7531F, -0.033F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(5, 61).mirror().addBox(-1.1F, -0.2369F, 0.0861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(60, 59).mirror().addBox(-1.1F, -0.2369F, -0.2139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false)
				.texOffs(60, 59).addBox(0.1F, -0.2369F, -0.2139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F))
				.texOffs(5, 61).addBox(0.1F, -0.2369F, 0.0861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(54, 14).addBox(-1.0F, -0.0231F, -0.0139F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.6531F, -1.033F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r106 = head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(22, 56).addBox(-1.0F, -0.0006F, 0.0629F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2531F, -2.033F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r107 = head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(57, 8).addBox(-1.0F, 0.0158F, 0.0061F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2469F, -2.833F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r108 = head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(61, 19).mirror().addBox(-0.2858F, -0.2F, -0.5975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5142F, 0.6544F, -3.0268F, 0.6283F, -0.1222F, 0.0F));

		PartDefinition cube_r109 = head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(53, 53).mirror().addBox(-0.9077F, -0.5229F, -0.5631F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5142F, 0.6544F, -3.0268F, 0.5836F, 0.1889F, 0.2261F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(54, 18).mirror().addBox(-0.8803F, -0.5F, -1.4486F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5142F, 0.6544F, -3.0268F, 0.6956F, -0.4266F, -0.2443F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(53, 53).addBox(-0.0923F, -0.5229F, -0.5631F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5142F, 0.6544F, -3.0268F, 0.5836F, -0.1889F, -0.2261F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(54, 18).addBox(-0.1197F, -0.5F, -1.4486F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5142F, 0.6544F, -3.0268F, 0.6956F, 0.4266F, 0.2443F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(61, 19).addBox(-0.7142F, -0.2F, -0.5975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5142F, 0.6544F, -3.0268F, 0.6283F, 0.1222F, 0.0F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(27, 39).addBox(-1.0F, -0.0298F, 0.0058F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 2.0469F, -5.233F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(55, 4).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.6199F, -5.6353F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(63, 6).addBox(-1.0F, -0.1052F, -0.2628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.5F, 2.9469F, -6.933F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(60, 2).mirror().addBox(-0.3F, -1.007F, -0.0283F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 2).addBox(0.5F, -1.007F, -0.0283F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 4.0951F, -6.6888F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(59, 15).mirror().addBox(-0.3F, -0.9408F, 0.1493F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(59, 15).addBox(0.5F, -0.9408F, 0.1493F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 3.7951F, -4.7888F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(39, 27).mirror().addBox(-0.6F, -1.0549F, -2.9126F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.11F)).mirror(false)
				.texOffs(39, 27).addBox(-0.4F, -1.0549F, -2.9126F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 3.1469F, -4.033F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(15, 55).mirror().addBox(-0.8F, -0.9577F, -1.9337F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(15, 55).addBox(-0.2F, -0.9577F, -1.9337F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2469F, -2.333F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(57, 22).addBox(-1.0F, -1.0013F, -0.9318F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.2469F, -1.833F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(29, 57).addBox(-1.0F, 0.0F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 40).addBox(-1.0F, -1.0F, -0.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.9469F, -1.333F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(62, 13).mirror().addBox(-0.62F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(46, 61).mirror().addBox(-0.64F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(46, 61).addBox(0.04F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F))
				.texOffs(62, 13).addBox(0.02F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2F, 2.9372F, -6.4951F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r124 = head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(61, 62).mirror().addBox(-1.02F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(56, 62).mirror().addBox(-1.02F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(56, 62).addBox(0.42F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(61, 62).addBox(0.42F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2F, 0.4962F, -0.2758F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r125 = head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(32, 61).mirror().addBox(-0.92F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(61, 29).mirror().addBox(-1.14F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(54, 28).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(61, 29).addBox(0.54F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(32, 61).addBox(0.32F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 28).addBox(0.4F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2F, 0.6429F, -1.8966F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r126 = head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-1.0F, -0.7847F, -1.8904F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false)
				.texOffs(0, 55).addBox(0.4F, -0.7847F, -1.8904F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.2F, 0.2429F, -1.0966F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r127 = head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(37, 62).mirror().addBox(-1.05F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false)
				.texOffs(62, 35).mirror().addBox(-1.22F, -1.1F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(62, 35).addBox(0.02F, -1.1F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(37, 62).addBox(-0.15F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.1F, 1.8367F, -3.5019F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r128 = head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(51, 62).mirror().addBox(-0.92F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(51, 62).addBox(-0.28F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.674F, -3.1365F, 0.4189F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(38, 53).addBox(0.0F, 0.4057F, -3.9737F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(53, 39).addBox(-0.5F, 0.6045F, -7.3872F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F))
				.texOffs(38, 53).mirror().addBox(-1.2F, 0.4057F, -3.9737F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(53, 39).mirror().addBox(-0.7F, 0.6045F, -7.3872F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1F, 1.5F, 0.4F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r129 = jaw.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(30, 15).mirror().addBox(-0.6F, -1.0955F, -1.4872F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(30, 15).addBox(-0.2F, -1.0955F, -1.4872F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 1.4F, -5.6F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r130 = jaw.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(34, 8).mirror().addBox(-1.0F, -0.7743F, -1.7988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(53, 44).mirror().addBox(-1.3F, -0.7743F, -1.0988F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(34, 8).addBox(-0.8F, -0.7743F, -1.7988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(53, 44).addBox(-0.5F, -0.7743F, -1.0988F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.3F, 1.2F, -3.9F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r131 = jaw.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(37, 0).mirror().addBox(-1.0F, -0.7943F, -0.1737F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.151F)).mirror(false)
				.texOffs(37, 0).addBox(0.2F, -0.7943F, -0.1737F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.151F)), PartPose.offsetAndRotation(-0.2F, 1.2F, -2.1F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r132 = jaw.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(41, 59).mirror().addBox(-0.35F, -1.2F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(41, 59).addBox(0.99F, -1.2F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.92F, 0.8767F, -1.8088F, 1.693F, 0.0F, 0.0F));

		PartDefinition cube_r133 = jaw.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(21, 37).mirror().addBox(-1.0F, -0.1675F, -2.8046F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(21, 37).addBox(0.2F, -0.1675F, -2.8046F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.2F, 0.0F, -1.4F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r134 = jaw.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(53, 34).mirror().addBox(-1.0F, -0.3F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(53, 49).mirror().addBox(-1.0F, -0.3F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(53, 34).addBox(0.2F, -0.3F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(53, 49).addBox(0.2F, -0.3F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.2F, 0.0F, 0.5F, 0.0698F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(28, 8).addBox(0.0F, -1.1F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 6).addBox(0.0F, -0.9F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 19).addBox(0.0F, -0.9F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 2.7F, 0.1747F, 0.043F, 0.0076F));

		PartDefinition cube_r135 = tail.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(24, 48).addBox(0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5077F, 4.9059F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r136 = tail.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(7, 13).addBox(0.0F, -1.1719F, -0.3732F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9809F, 2.9397F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r137 = tail.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(0, 13).addBox(0.0F, -0.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, 0.5F, 0.6981F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(15, 3).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.003F))
				.texOffs(14, 0).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 19).addBox(0.0F, -0.8F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 6).addBox(0.0F, -0.7F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.9F, 0.4267F, 0.0059F, -0.018F));

		PartDefinition cube_r138 = tail2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(9, 63).addBox(0.0F, 3.1F, 9.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 64).addBox(0.0F, 2.3F, 7.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 64).addBox(0.0F, 1.7F, 5.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 64).addBox(0.0F, 1.0F, 3.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 56).addBox(0.0F, 0.3F, 1.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5077F, -0.9941F, 0.3927F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, 0.2812F, -0.0077F, 0.0214F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 11.0F, 0.0573F, -0.0077F, 0.0465F));

		return LayerDefinition.create(meshdefinition, 68, 68);
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