package fossils.fossils.client.blockentity.model.falcarius;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class FalcariusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
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
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public FalcariusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
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
		this.neck4 = this.chest.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.8F, -2.4F, 0.0F, 0.0F, 0.0436F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.4F, 0.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(41, 7).mirror().addBox(-2.0F, -1.0F, 1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 26).mirror().addBox(-2.8F, -1.4F, 3.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(34, 16).mirror().addBox(-2.8F, -1.4F, 1.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(40, 26).addBox(0.8F, -1.4F, 3.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(34, 16).addBox(0.8F, -1.4F, 1.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(41, 7).addBox(0.0F, -1.0F, 1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(26, 16).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5F, -0.8F, -2.7F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(39, 49).mirror().addBox(-0.3F, -2.4668F, 1.725F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.2411F, 0.3301F, -1.6057F, 0.0F, -0.5934F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(35, 0).mirror().addBox(-0.3F, 0.3485F, 1.4769F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.2411F, 0.3301F, -0.7679F, 0.0F, -0.5934F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(34, 47).mirror().addBox(-0.3F, -0.6825F, -0.3427F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.2411F, 0.3301F, 0.2793F, 0.0F, -0.5934F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(26, 23).mirror().addBox(-0.3F, 3.3376F, -2.2135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.1F, -1.0F, -0.2094F, 0.0F, -0.5236F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(22, 45).mirror().addBox(-0.3F, 2.334F, -3.2999F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.1F, -1.0F, 0.2443F, 0.0F, -0.5236F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(5, 0).mirror().addBox(-0.3F, 2.1873F, -1.0185F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.1F, -1.0F, -0.384F, 0.0F, -0.5236F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(47, 45).mirror().addBox(-0.3F, -0.307F, -0.6327F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.1F, -1.0F, -0.5411F, 0.0F, -0.5236F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(42, 41).mirror().addBox(-2.0F, -0.187F, -1.6631F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(42, 41).addBox(1.6F, -0.187F, -1.6631F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -1.5F, -0.7F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(39, 19).mirror().addBox(-2.0F, -0.087F, -1.6631F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(39, 19).addBox(1.6F, -0.087F, -1.6631F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3F, -1.5F, -0.7F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(35, 23).mirror().addBox(-2.0F, -0.12F, 0.3289F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(35, 23).addBox(1.6F, -0.12F, 0.3289F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.2F, -1.7F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(26, 23).addBox(-0.7F, 3.3376F, -2.2135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, 2.1F, -1.0F, -0.2094F, 0.0F, 0.5236F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(22, 45).addBox(-0.7F, 2.334F, -3.2999F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, 2.1F, -1.0F, 0.2443F, 0.0F, 0.5236F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(5, 0).addBox(-0.7F, 2.1873F, -1.0185F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, 2.1F, -1.0F, -0.384F, 0.0F, 0.5236F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(39, 49).addBox(-0.7F, -2.4668F, 1.725F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.0F, 1.2411F, 0.3301F, -1.6057F, 0.0F, 0.5934F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(35, 0).addBox(-0.7F, 0.3485F, 1.4769F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, 1.2411F, 0.3301F, -0.7679F, 0.0F, 0.5934F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(34, 47).addBox(-0.7F, -0.6825F, -0.3427F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(2.0F, 1.2411F, 0.3301F, 0.2793F, 0.0F, 0.5934F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(47, 45).addBox(-0.7F, -0.307F, -0.6327F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.0F, 2.1F, -1.0F, -0.5411F, 0.0F, 0.5236F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(29, 47).addBox(-0.5F, -0.7948F, -0.5638F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8F, 1.0F, 0.05F, -0.6906F, 0.1119F, 0.1343F));

		PartDefinition cube_r19 = leftLeg1.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(10, 49).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.2052F, -0.5638F, 0.3752F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.9052F, 1.1362F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r20 = leftLeg2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(25, 36).addBox(-0.5F, -3.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 3.1954F, 0.5233F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r21 = leftLeg2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(20, 35).addBox(-0.5F, -3.0F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.4F, 2.9946F, 0.478F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(7, 38).addBox(-1.0F, -0.2066F, -0.6088F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.1946F, 0.578F, -0.7346F, -0.1132F, -0.1328F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(25, 10).addBox(-1.5F, -0.5F, -3.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7934F, -0.3088F, 0.3054F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(13, 12).addBox(-0.5F, -0.7948F, -0.5638F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.8F, 1.0F, 0.05F, -1.5275F, 0.0057F, -0.1308F));

		PartDefinition cube_r22 = rightLeg1.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(18, 48).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.2052F, -0.5638F, 0.3752F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.9052F, 1.1362F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r23 = rightLeg2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(36, 6).addBox(-0.5F, -3.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 3.1954F, 0.5233F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r24 = rightLeg2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(13, 0).addBox(-0.5F, -3.0F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.4F, 2.9946F, 0.478F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(0, 38).addBox(-1.0F, -0.2066F, -0.6088F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.1946F, 0.578F, -0.5236F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(24, 0).addBox(-1.5F, -0.5F, -3.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7934F, -0.3088F, 1.6144F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2F, -2.5F, 0.0228F, 0.1299F, 0.0436F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 6).addBox(-0.5F, -0.5972F, -1.2624F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 12).addBox(-1.0F, -0.0972F, -3.2624F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5F, -2.2F, -4.2F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(6, 6).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0777F, -6.821F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(45, 32).mirror().addBox(-3.3318F, -1.4507F, -0.4648F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7F, -1.4F, -0.0081F, -0.2752F, -1.6601F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(54, 51).mirror().addBox(-1.9397F, -0.3402F, -0.4648F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7F, -1.4F, -0.1765F, -0.2124F, -0.9879F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(29, 55).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7F, -1.4F, -0.2302F, -0.106F, -0.651F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(13, 20).mirror().addBox(-4.3318F, -1.4507F, -0.4648F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.5F, -3.1F, 0.004F, -0.1887F, -1.5582F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(34, 55).mirror().addBox(-1.9397F, -0.3402F, -0.4648F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.5F, -3.1F, -0.1126F, -0.1518F, -0.8948F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(55, 35).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.5F, -3.1F, -0.1505F, -0.0698F, -0.5532F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(24, 6).mirror().addBox(-5.3318F, -1.4507F, -0.4648F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.2F, -5.0F, 0.0181F, -0.0849F, -1.5078F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(55, 37).mirror().addBox(-1.9397F, -0.3402F, -0.4648F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.2F, -5.0F, -0.0374F, -0.0784F, -0.851F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.2F, -5.0F, -0.0554F, -0.0258F, -0.5054F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(9, 24).mirror().addBox(-5.3318F, -1.4507F, -0.4648F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.6F, -6.8F, 0.0227F, -0.0503F, -1.4383F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(56, 2).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.6F, -6.8F, -0.0237F, -0.0111F, -0.4362F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(56, 8).mirror().addBox(-1.9397F, -0.3402F, -0.4648F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.6F, -6.8F, -0.0126F, -0.0538F, -0.7829F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(29, 55).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7F, -1.4F, -0.2302F, 0.106F, 0.651F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(54, 51).addBox(0.9397F, -0.3402F, -0.4648F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7F, -1.4F, -0.1765F, 0.2124F, 0.9879F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(45, 32).addBox(1.3318F, -1.4507F, -0.4648F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7F, -1.4F, -0.0081F, 0.2752F, 1.6601F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(55, 35).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5F, -3.1F, -0.1505F, 0.0698F, 0.5532F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(34, 55).addBox(0.9397F, -0.3402F, -0.4648F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5F, -3.1F, -0.1126F, 0.1518F, 0.8948F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(13, 20).addBox(1.3318F, -1.4507F, -0.4648F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5F, -3.1F, 0.004F, 0.1887F, 1.5582F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 56).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.2F, -5.0F, -0.0554F, 0.0258F, 0.5054F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(55, 37).addBox(0.9397F, -0.3402F, -0.4648F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.2F, -5.0F, -0.0374F, 0.0784F, 0.851F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(24, 6).addBox(1.3318F, -1.4507F, -0.4648F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.2F, -5.0F, 0.0181F, 0.0849F, 1.5078F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(9, 24).addBox(1.3318F, -1.4507F, -0.4648F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6F, -6.8F, 0.0227F, 0.0503F, 1.4383F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(56, 2).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6F, -6.8F, -0.0237F, 0.0111F, 0.4362F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(56, 8).addBox(0.9397F, -0.3402F, -0.4648F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6F, -6.8F, -0.0126F, 0.0538F, 0.7829F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(52, 56).addBox(-0.5F, -1.0F, -2.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 56).addBox(-0.5F, -1.0F, -4.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 23).addBox(-1.0F, -0.5F, -5.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1F, 0.3F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -1.8851F, -0.3744F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.8022F, -2.3299F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(15, 28).addBox(-2.0F, -1.9818F, -2.0178F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7022F, -6.9299F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(13, 12).addBox(-1.5F, -1.4F, -2.5F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2022F, -4.4299F, -0.4276F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(32, 33).addBox(-0.5F, -0.6F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(19, 56).addBox(0.0F, -0.9F, -1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.6F, -7.4F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 6).mirror().addBox(-0.7F, 0.0F, -0.5101F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.7778F, -2.7364F, -0.493F, -0.6837F, 0.4616F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(44, 38).mirror().addBox(-0.7F, 0.0F, -0.0101F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.7778F, -2.7364F, -1.0821F, -0.7844F, 1.5091F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(7, 32).mirror().addBox(-0.1835F, -0.1534F, -1.8499F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.2F, -4.3F, 1.7503F, 0.0684F, -0.7967F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(45, 28).mirror().addBox(-0.2F, -0.0587F, -1.7671F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(9, 26).mirror().addBox(-0.2F, -0.3587F, -1.8671F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 0.8F, -3.5F, 1.1435F, -0.1578F, -0.3322F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(46, 4).mirror().addBox(-0.5F, -0.155F, -0.1702F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(46, 4).addBox(3.5F, -0.155F, -0.1702F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0F, -0.3F, -1.3F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(11, 33).mirror().addBox(-0.5F, -0.3F, -2.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(11, 33).addBox(3.5F, -0.3F, -2.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0F, -0.1F, -1.4F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(40, 23).mirror().addBox(-4.3318F, -1.4507F, -0.4648F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -1.4F, 0.0435F, 0.1054F, -1.5424F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(56, 10).mirror().addBox(-1.9397F, -0.3402F, -0.4648F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -1.4F, 0.0987F, 0.0571F, -0.8874F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(14, 56).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -1.4F, 0.1188F, 0.0552F, -0.5378F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(40, 23).addBox(1.3318F, -1.4507F, -0.4648F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -1.4F, 0.0435F, -0.1054F, 1.5424F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(56, 10).addBox(0.9397F, -0.3402F, -0.4648F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -1.4F, 0.0987F, -0.0571F, 0.8874F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(14, 56).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -1.4F, 0.1188F, -0.0552F, 0.5378F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(31, 30).addBox(-1.5F, -0.9818F, -3.0178F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.3022F, 0.4701F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(45, 28).addBox(-0.8F, -0.0587F, -1.7671F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(9, 26).addBox(-0.8F, -0.3587F, -1.8671F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3F, 0.8F, -3.5F, 1.1435F, 0.1578F, 0.3322F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(7, 32).addBox(-0.8165F, -0.1534F, -1.8499F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7F, 2.2F, -4.3F, 1.7503F, -0.0684F, 0.7967F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 6).addBox(-0.3F, 0.0F, -0.5101F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7778F, -2.7364F, -0.493F, 0.6837F, -0.4616F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(44, 38).addBox(-0.3F, 0.0F, -0.0101F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7778F, -2.7364F, -1.0821F, 0.7844F, -1.5091F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(40, 45).addBox(-0.5F, 0.5F, -2.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7F, -1.4F, -0.7854F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create().texOffs(40, 0).addBox(-0.5059F, -0.5647F, -0.6475F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.1474F, 2.2395F, -3.2157F, 0.9206F, 0.2777F, -0.1204F));

		PartDefinition cube_r73 = leftArm1.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(50, 34).addBox(0.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0941F, 4.4353F, -0.2475F, -1.0879F, 0.0006F, 0.1502F));

		PartDefinition cube_r74 = leftArm2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(47, 10).addBox(-1.75F, 0.2F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, -0.75F, 0.5F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftArm2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, -2.8F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.25F, -0.5F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(40, 12).addBox(-1.0388F, -0.0337F, -0.9491F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(23, 49).addBox(-1.0388F, 1.9163F, -0.9491F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(49, 50).addBox(-1.0388F, 1.9163F, 0.0509F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2F, 3.1F, -0.3F, 0.4224F, -0.281F, 0.2936F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create().texOffs(37, 38).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.0388F, 0.6879F, -0.4515F, -0.2618F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create().texOffs(14, 38).addBox(-0.4941F, -0.5647F, -0.6475F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.1474F, 2.2395F, -3.2157F, 0.4842F, -0.2777F, 0.1204F));

		PartDefinition cube_r76 = rightArm1.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(49, 41).addBox(-1.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0941F, 4.4353F, -0.2475F, -1.3497F, -0.0006F, -0.1502F));

		PartDefinition cube_r77 = rightArm2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(5, 47).addBox(0.75F, 0.2F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2F, -0.75F, 0.5F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightArm2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, -2.8F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.05F, 2.25F, -0.5F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(38, 31).addBox(0.0388F, -0.0337F, -0.9491F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(49, 21).addBox(0.0388F, 1.9163F, -0.9491F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(44, 50).addBox(0.0388F, 1.9163F, 0.0509F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.2F, 3.1F, -0.3F, 0.4224F, 0.281F, -0.2936F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create().texOffs(30, 38).addBox(0.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0388F, 0.6879F, -0.4515F, -0.2618F, 0.0F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2F, -2.8F));

		PartDefinition cube_r79 = neck4.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(15, 49).addBox(-0.5F, -0.8F, -2.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 56).addBox(-0.5F, -0.9F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 32).addBox(-1.0F, -0.5F, -3.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5F, 0.0F, -0.3F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r80 = neck4.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(23, 10).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8F, -2.5F, 0.3072F, 0.5565F, -0.9748F));

		PartDefinition cube_r81 = neck4.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(17, 33).mirror().addBox(-2.9397F, -0.3402F, -0.4648F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8F, -2.5F, 0.0801F, 0.5885F, -1.3893F));

		PartDefinition cube_r82 = neck4.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(41, 17).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -0.5F, 0.2834F, 0.1535F, -0.6262F));

		PartDefinition cube_r83 = neck4.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(54, 33).mirror().addBox(-1.9397F, -0.3402F, -0.4648F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -0.5F, 0.2199F, 0.2056F, -0.9771F));

		PartDefinition cube_r84 = neck4.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(45, 26).mirror().addBox(-3.3318F, -1.4507F, -0.4648F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -0.5F, 0.0472F, 0.2963F, -1.6474F));

		PartDefinition cube_r85 = neck4.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(45, 26).addBox(1.3318F, -1.4507F, -0.4648F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -0.5F, 0.0472F, -0.2963F, 1.6474F));

		PartDefinition cube_r86 = neck4.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(17, 33).addBox(0.9397F, -0.3402F, -0.4648F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8F, -2.5F, 0.0801F, -0.5885F, 1.3893F));

		PartDefinition cube_r87 = neck4.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(23, 10).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8F, -2.5F, 0.3072F, -0.5565F, 0.9748F));

		PartDefinition cube_r88 = neck4.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(54, 33).addBox(0.9397F, -0.3402F, -0.4648F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -0.5F, 0.2199F, -0.2056F, 0.9771F));

		PartDefinition cube_r89 = neck4.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(41, 17).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -0.5F, 0.2834F, -0.1535F, 0.6262F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -3.4F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r90 = neck3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(0, 24).addBox(-1.0F, -0.9828F, -0.0159F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.2F, -4.2F, -0.8727F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.6F, -3.9F, 0.1614F, 0.6102F, 0.0532F));

		PartDefinition cube_r91 = neck2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(24, 30).addBox(-1.0F, -0.2411F, -0.0633F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5F, -3.2F, -1.9F, -0.9512F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.1F, -2.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r92 = neck.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, -0.0293F, 0.0624F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -1.4F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r93 = neck.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(7, 43).addBox(-0.5F, 0.0F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -1.9F, -3.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(48, 54).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(51, 3).addBox(-0.18F, -0.7946F, -0.8635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(5, 53).addBox(-0.18F, -0.3946F, -0.8635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(5, 53).mirror().addBox(-0.82F, -0.3946F, -0.8635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(51, 3).mirror().addBox(-0.82F, -0.7946F, -0.8635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.2F, -3.3F, 0.0F, 0.0F, -0.0436F));

		PartDefinition cube_r94 = head.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(19, 53).addBox(0.0F, -0.0291F, -0.9708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, -0.9F, -0.4F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r95 = head.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(28, 52).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(52, 11).mirror().addBox(-0.4F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(52, 11).addBox(0.04F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(28, 52).addBox(0.04F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.32F, 0.8976F, -3.3157F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r96 = head.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(52, 30).mirror().addBox(-0.5F, -0.3551F, -0.9923F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(0, 53).mirror().addBox(-0.5F, -0.3551F, -0.5923F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false)
				.texOffs(52, 30).addBox(-0.06F, -0.3551F, -0.9923F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(0, 53).addBox(-0.06F, -0.3551F, -0.5923F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-0.22F, 0.3054F, -1.7635F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r97 = head.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(33, 52).mirror().addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(52, 45).mirror().addBox(-0.5F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(33, 52).addBox(-0.06F, -0.4F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(52, 45).addBox(-0.06F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.22F, 0.6079F, -2.2929F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r98 = head.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(53, 14).mirror().addBox(-1.12F, -1.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(51, 38).mirror().addBox(-1.34F, -1.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(52, 0).mirror().addBox(-1.23F, -1.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(51, 38).addBox(-0.66F, -1.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(52, 0).addBox(-0.77F, -1.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(53, 14).addBox(-0.88F, -1.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(43, 54).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 0.5F, -0.5F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r99 = head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(51, 8).mirror().addBox(-1.27F, -0.22F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.8F, -1.0F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r100 = head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(51, 8).addBox(0.27F, -0.22F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(38, 53).addBox(0.0F, 0.0926F, -0.3748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8F, -1.0F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r101 = head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(54, 24).addBox(0.0F, -0.0074F, 0.0252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8F, -1.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r102 = head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(55, 5).addBox(-1.0F, -0.8072F, -0.835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 1.2F, -3.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r103 = head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(9, 55).addBox(-1.0F, -0.1228F, -0.7893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.5F, 0.4F, -3.2F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(53, 48).addBox(-1.0F, -0.1106F, -0.8104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 0.1F, -2.5F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(24, 54).addBox(-1.0F, -0.0724F, -0.8905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.5F, -0.4F, -1.9F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r106 = head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(54, 41).addBox(0.0F, -0.0074F, -0.9748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -0.8F, -1.0F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r107 = head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(51, 27).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.0F, 1.137F, -3.3302F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r108 = head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(12, 45).addBox(-1.0F, -0.6741F, -1.9517F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.17F)), PartPose.offsetAndRotation(0.5F, 0.8F, -1.4F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r109 = head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(53, 53).addBox(-1.0F, -0.8741F, -1.7517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(54, 21).addBox(-1.0F, -0.8741F, -0.9517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.5F, 0.8F, -1.4F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(53, 18).mirror().addBox(-0.8F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(53, 18).addBox(-0.2F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.1F, -0.576F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(45, 0).addBox(-0.2F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F))
				.texOffs(45, 0).mirror().addBox(-0.8F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7F, 0.2F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r111 = jaw.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(49, 16).mirror().addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F)).mirror(false)
				.texOffs(49, 16).addBox(-0.2F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F)), PartPose.offsetAndRotation(-0.1F, -0.5405F, -1.9459F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r112 = jaw.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(43, 34).mirror().addBox(-1.0F, -0.3124F, -1.6611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(43, 34).addBox(-0.6F, -0.3124F, -1.6611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.3F, -0.6F, -1.1F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r113 = jaw.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(35, 43).mirror().addBox(-1.0F, -0.7F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(35, 43).addBox(-0.6F, -0.7F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3F, 0.2F, -1.2F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r114 = jaw.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(44, 17).mirror().addBox(-1.0F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(44, 17).addBox(-0.4F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r115 = jaw.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(14, 53).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(14, 53).addBox(0.14F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.32F, -0.1946F, -1.1635F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r116 = jaw.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(17, 43).addBox(-0.3F, -0.8505F, -1.408F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.32F))
				.texOffs(28, 43).addBox(-0.3F, -0.6505F, -1.508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2F, -0.3F, -2.5F, -0.2094F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(17, 20).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(41, 56).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 12).addBox(0.0F, -1.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 56).addBox(0.0F, -0.9F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 2.1F, -0.2428F, -0.1022F, 0.1926F));

		PartDefinition cube_r117 = tail.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, 2.1767F, 3.5976F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.0F, 0.0767F, 1.5976F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 32).addBox(0.0F, -0.5F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.5F, 0.6109F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(13, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.008F))
				.texOffs(56, 27).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 56).addBox(0.0F, -0.7F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.9F, 0.0894F, -0.2173F, -0.0193F));

		PartDefinition cube_r118 = tail2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(18, 0).addBox(0.0F, 6.364F, 10.5692F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 3).addBox(0.0F, 5.3339F, 8.8548F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 0).addBox(0.0F, 4.3038F, 7.1405F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 57).addBox(0.0F, 3.2737F, 5.4262F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -5.4F, 0.6109F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.0081F, 0.5001F, -0.3254F));

		PartDefinition cube_r119 = tail3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(6, 12).addBox(0.0F, 8.3901F, 13.5357F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 16).addBox(0.0F, 7.2233F, 11.9082F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -13.3F, 0.6109F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, -0.151F, 0.3887F, -0.0576F));

		return LayerDefinition.create(meshdefinition, 60, 60);
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