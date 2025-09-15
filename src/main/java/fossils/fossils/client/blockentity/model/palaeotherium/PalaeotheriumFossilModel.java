package fossils.fossils.client.blockentity.model.palaeotherium;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PalaeotheriumFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart chest;
	private final ModelPart neck2;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public PalaeotheriumFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body3 = this.body.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.chest = this.body4.getChild("chest");
		this.neck2 = this.chest.getChild("neck2");
		this.leftarm = this.neck2.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightarm = this.neck2.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.bone2 = this.neck2.getChild("bone2");
		this.bone4 = this.neck2.getChild("bone4");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.head = this.neck6.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -21.889F, 16.4842F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(11, 41).addBox(0.0F, -0.9986F, 0.0389F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(20, 81).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.6447F, -1.3812F, -0.3819F, 0.1253F, 0.1768F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(81, 7).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.5057F, -3.1864F, -0.4336F, -0.1433F, -0.2225F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(20, 81).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6447F, -1.3812F, -0.3819F, -0.1253F, -0.1768F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(81, 7).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.5057F, -3.1864F, -0.4336F, 0.1433F, 0.2225F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -0.0986F, -0.9611F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 4.5862F, 0.631F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r7 = leftLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(36, 51).addBox(-1.0F, -4.4F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.755F, 0.0425F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r8 = leftLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(78, 70).addBox(0.5F, -0.8653F, -0.8869F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 4.1045F, 0.0312F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r9 = leftLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(42, 80).addBox(0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 2.7292F, -0.1513F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r10 = leftLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(87, 21).addBox(4.4F, -3.2F, -2.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.9F, 10.6517F, -2.8097F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r11 = leftLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(9, 52).addBox(-1.0F, 0.9683F, -1.1745F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.3586F, -0.3965F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r12 = leftLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(50, 62).addBox(0.0F, -1.3239F, -0.2399F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 5.3586F, -0.3965F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r13 = leftLeg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(42, 75).addBox(0.0F, -1.5F, -0.45F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 5.4768F, -0.8186F, -0.2793F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.518F, -0.7775F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r14 = leftLeg2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(64, 70).addBox(-1.0F, -0.3F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.1023F, 0.2332F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r15 = leftLeg2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 84).addBox(-1.0F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 1.0255F, 0.7001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r16 = leftLeg2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(37, 84).addBox(-1.0F, -0.675F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 1.427F, 0.2014F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r17 = leftLeg2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(62, 77).addBox(-1.5F, -0.2F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0F, 1.7023F, -0.1869F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r18 = leftLeg2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(22, 76).addBox(-1.5F, -2.8881F, -0.8332F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7F, 3.4657F, 1.291F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r19 = leftLeg2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(77, 56).addBox(-1.5F, -2.7881F, -1.0582F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7F, 6.0392F, 0.8578F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r20 = leftLeg2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(87, 55).addBox(-1.5F, 0.4619F, 0.1668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7F, 5.0131F, 0.0596F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r21 = leftLeg2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(83, 37).addBox(-1.5F, -0.6131F, -0.7332F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 5.0131F, 0.0596F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(75, 15).addBox(-0.8F, 0.1246F, -0.4284F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.3F, 7.1175F, -0.5357F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r22 = leftLeg3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(23, 57).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.7065F, 1.0594F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r23 = leftLeg3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(87, 9).addBox(-0.8F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.3295F, 0.122F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r24 = leftLeg3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(82, 9).addBox(-1.3F, -0.075F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 3.1246F, -0.4284F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 4.3683F, 0.4348F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r25 = leftLeg4.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(37, 87).addBox(-0.5F, -0.8546F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(1.0929F, 0.7449F, 0.0824F, 0.4269F, -0.4376F, -0.6421F));

		PartDefinition cube_r26 = leftLeg4.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(77, 86).addBox(-0.5F, -0.1421F, -0.4429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(1.0929F, 0.7449F, 0.0824F, 0.0604F, -0.4376F, -0.6421F));

		PartDefinition cube_r27 = leftLeg4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(87, 85).addBox(-0.5F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.9705F, -0.078F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r28 = leftLeg4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(75, 25).addBox(-1.0F, -4.0F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, 4.8556F, -0.4179F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 4.5862F, 0.631F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r29 = rightLeg.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(51, 40).addBox(-1.0F, -4.4F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.755F, 0.0425F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r30 = rightLeg.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(79, 42).addBox(-1.5F, -0.8653F, -0.8869F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.1045F, 0.0312F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r31 = rightLeg.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(47, 80).addBox(-1.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 2.7292F, -0.1513F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r32 = rightLeg.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(87, 24).addBox(-5.4F, -3.2F, -2.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.9F, 10.6517F, -2.8097F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r33 = rightLeg.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(52, 31).addBox(-1.0F, 0.9683F, -1.1745F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.3586F, -0.3965F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r34 = rightLeg.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(72, 56).addBox(-1.0F, -1.3239F, -0.2399F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 5.3586F, -0.3965F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r35 = rightLeg.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(47, 75).addBox(-1.0F, -1.5F, -0.45F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 5.4768F, -0.8186F, -0.2793F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.518F, -0.7775F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r36 = rightLeg2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(71, 30).addBox(0.0F, -0.3F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.1023F, 0.2332F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r37 = rightLeg2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(84, 2).addBox(0.0F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 1.0255F, 0.7001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r38 = rightLeg2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(84, 41).addBox(0.0F, -0.675F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 1.427F, 0.2014F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r39 = rightLeg2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(78, 37).addBox(0.5F, -0.2F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0F, 1.7023F, -0.1869F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r40 = rightLeg2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(74, 76).addBox(0.5F, -2.8881F, -0.8332F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7F, 3.4657F, 1.291F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r41 = rightLeg2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(57, 77).addBox(0.5F, -2.7881F, -1.0582F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7F, 6.0392F, 0.8578F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r42 = rightLeg2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(87, 82).addBox(0.5F, 0.4619F, 0.1668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7F, 5.0131F, 0.0596F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r43 = rightLeg2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(67, 83).addBox(0.5F, -0.6131F, -0.7332F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.0131F, 0.0596F, -0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(75, 20).addBox(-0.2F, 0.1246F, -0.4284F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.3F, 7.1175F, -0.5357F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r44 = rightLeg3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(33, 88).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.7065F, 1.0594F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r45 = rightLeg3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(18, 87).addBox(-0.2F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.3295F, 0.122F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r46 = rightLeg3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(27, 82).addBox(0.3F, -0.075F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, 3.1246F, -0.4284F, 0.1571F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 4.3683F, 0.4348F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r47 = rightLeg4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(42, 87).addBox(-0.5F, -0.8546F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-1.0929F, 0.7449F, 0.0824F, 0.4269F, 0.4376F, 0.6421F));

		PartDefinition cube_r48 = rightLeg4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(82, 86).addBox(-0.5F, -0.1421F, -0.4429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-1.0929F, 0.7449F, 0.0824F, 0.0604F, 0.4376F, 0.6421F));

		PartDefinition cube_r49 = rightLeg4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(88, 5).addBox(-0.5F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.9705F, -0.078F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r50 = rightLeg4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(35, 75).addBox(-1.0F, -4.0F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, 4.8556F, -0.4179F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9869F, 3.871F, 0.9851F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r51 = bone.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(60, 42).addBox(-2.7288F, -1.3062F, -0.1813F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7F, 1.2048F, 0.4984F, -0.3046F, -0.4082F, -0.058F));

		PartDefinition cube_r52 = bone.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(60, 39).addBox(-1.5585F, -0.35F, -0.7653F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6296F, 0.0803F, -0.62F, -0.6F, -0.3096F, -0.0709F));

		PartDefinition cube_r53 = bone.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(46, 71).addBox(-0.602F, -0.532F, 0.1844F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.181F, -2.9496F, -2.317F, 0.1946F, 0.8824F, 1.9273F));

		PartDefinition cube_r54 = bone.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(45, 51).addBox(-0.602F, 0.0395F, -0.162F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.181F, -2.9496F, -2.317F, 0.3168F, 0.8824F, 1.9273F));

		PartDefinition cube_r55 = bone.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(67, 76).addBox(-0.5292F, -0.5757F, -0.4171F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.181F, -3.2246F, -2.417F, -1.7165F, 0.531F, -1.4148F));

		PartDefinition cube_r56 = bone.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(39, 19).addBox(-2.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0753F, -4.1646F, -3.5456F, -1.7063F, 0.2325F, -1.3413F));

		PartDefinition cube_r57 = bone.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(38, 8).addBox(-0.575F, -0.5F, -2.85F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.6951F, -4.621F, -3.564F, -1.8217F, 0.0965F, -2.0183F));

		PartDefinition cube_r58 = bone.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(18, 53).addBox(-1.425F, -0.5F, -0.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2548F, -5.1573F, -3.2062F, -1.8291F, -0.0741F, -2.651F));

		PartDefinition cube_r59 = bone.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(39, 29).addBox(-2.0F, -0.8F, -0.9F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8961F, -5.5087F, -3.5189F, -1.8217F, 0.0965F, -2.0183F));

		PartDefinition cube_r60 = bone.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(72, 45).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7126F, -3.7869F, -2.518F, -1.7662F, 0.5162F, -1.5141F));

		PartDefinition cube_r61 = bone.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(61, 30).addBox(-1.5F, -0.325F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9459F, 0.1037F, 0.4846F, 2.8537F, 1.1551F, -1.7054F));

		PartDefinition cube_r62 = bone.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 72).addBox(-1.1015F, -0.5F, -0.8446F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8404F, 0.6481F, 2.0421F, 2.5639F, 0.8108F, -1.5467F));

		PartDefinition cube_r63 = bone.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(72, 61).addBox(-1.0998F, -0.5F, -1.0481F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6336F, 0.5979F, 1.5084F, 0.6826F, 0.9873F, 2.6985F));

		PartDefinition cube_r64 = bone.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(71, 34).addBox(-0.925F, -0.5F, -0.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7992F, 0.6905F, 1.9985F, 2.011F, 1.1419F, -2.1982F));

		PartDefinition cube_r65 = bone.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(55, 57).addBox(-3.4809F, -0.6256F, -0.5948F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.181F, -1.5134F, -1.4302F, -1.6236F, 0.9305F, -1.3866F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9869F, 3.871F, 0.9851F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r66 = bone3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(60, 42).mirror().addBox(-0.2712F, -1.3062F, -0.1813F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 1.2048F, 0.4984F, -0.3046F, 0.4082F, 0.058F));

		PartDefinition cube_r67 = bone3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(60, 39).mirror().addBox(-1.4415F, -0.35F, -0.7653F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6296F, 0.0803F, -0.62F, -0.6F, 0.3096F, 0.0709F));

		PartDefinition cube_r68 = bone3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(46, 71).mirror().addBox(-0.398F, -0.532F, 0.1844F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.181F, -2.9496F, -2.317F, 0.1946F, -0.8824F, -1.9273F));

		PartDefinition cube_r69 = bone3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(45, 51).mirror().addBox(-0.398F, 0.0395F, -0.162F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.181F, -2.9496F, -2.317F, 0.3168F, -0.8824F, -1.9273F));

		PartDefinition cube_r70 = bone3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(67, 76).mirror().addBox(-1.4708F, -0.5757F, -0.4171F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.181F, -3.2246F, -2.417F, -1.7165F, -0.531F, 1.4148F));

		PartDefinition cube_r71 = bone3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(39, 19).mirror().addBox(0.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0753F, -4.1646F, -3.5456F, -1.7063F, -0.2325F, 1.3413F));

		PartDefinition cube_r72 = bone3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(38, 8).mirror().addBox(-1.425F, -0.5F, -2.85F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.6951F, -4.621F, -3.564F, -1.8217F, -0.0965F, 2.0183F));

		PartDefinition cube_r73 = bone3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(18, 53).mirror().addBox(-0.575F, -0.5F, -0.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.2548F, -5.1573F, -3.2062F, -1.8291F, 0.0741F, 2.651F));

		PartDefinition cube_r74 = bone3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(39, 29).mirror().addBox(-1.0F, -0.8F, -0.9F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8961F, -5.5087F, -3.5189F, -1.8217F, -0.0965F, 2.0183F));

		PartDefinition cube_r75 = bone3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(72, 45).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7126F, -3.7869F, -2.518F, -1.7662F, -0.5162F, 1.5141F));

		PartDefinition cube_r76 = bone3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(61, 30).mirror().addBox(-1.5F, -0.325F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9459F, 0.1037F, 0.4846F, 2.8537F, -1.1551F, 1.7054F));

		PartDefinition cube_r77 = bone3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-0.8985F, -0.5F, -0.8446F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8404F, 0.6481F, 2.0421F, 2.5639F, -0.8108F, 1.5467F));

		PartDefinition cube_r78 = bone3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(72, 61).mirror().addBox(-0.9002F, -0.5F, -1.0481F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6336F, 0.5979F, 1.5084F, 0.6826F, -0.9873F, -2.6985F));

		PartDefinition cube_r79 = bone3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(71, 34).mirror().addBox(-1.075F, -0.5F, -0.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7992F, 0.6905F, 1.9985F, 2.011F, -1.1419F, 2.1982F));

		PartDefinition cube_r80 = bone3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(55, 57).mirror().addBox(0.4809F, -0.6256F, -0.5948F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.181F, -1.5134F, -1.4302F, -1.6236F, -0.9305F, 1.3866F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.3096F, -4.4992F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(29, 43).addBox(0.0F, -1.0354F, -0.1789F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4648F, -0.6549F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(88, 69).addBox(0.0F, -1.3589F, -0.9042F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1648F, -3.8549F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(23, 89).addBox(0.0F, 0.2F, 2.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8648F, -4.9549F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(80, 0).mirror().addBox(-1.8F, 0.0F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5152F, 0.0256F, -0.6005F, -0.2439F, 0.1211F, -0.2514F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(44, 0).mirror().addBox(-0.9F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5076F, -0.3722F, -2.4718F, -0.2533F, 0.0996F, -0.3365F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(79, 61).mirror().addBox(-4.8978F, -0.7765F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7725F, -4.4268F, -0.3604F, 0.3624F, -0.9636F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(66, 28).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7725F, -4.4268F, -0.2535F, 0.442F, -0.6923F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(66, 28).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7725F, -4.4268F, -0.2535F, -0.442F, 0.6923F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(79, 61).addBox(2.8978F, -0.7765F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7725F, -4.4268F, -0.3604F, -0.3624F, 0.9636F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(80, 0).addBox(-0.2F, 0.0F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5152F, 0.0256F, -0.6005F, -0.2439F, -0.1211F, 0.2514F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(44, 0).addBox(-0.1F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5076F, -0.3722F, -2.4718F, -0.2533F, -0.0996F, 0.3365F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(15, 13).addBox(-0.5F, -0.1513F, 8.7474F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0337F, -13.316F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9395F, -4.5739F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(70, 88).addBox(0.0F, -1.7408F, 0.0224F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.004F, -2.157F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(5, 89).addBox(0.0F, -1.3594F, -0.0811F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.004F, -4.057F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(53, 35).mirror().addBox(-9.1256F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.367F, -1.6528F, -0.4516F, 0.2669F, -1.3421F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(30, 68).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.367F, -1.6528F, -0.3168F, 0.4194F, -0.9469F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(64, 37).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.367F, -1.6528F, -0.1928F, 0.4859F, -0.6651F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(21, 68).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.567F, -3.6528F, -0.3388F, 0.391F, -0.9556F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(28, 15).mirror().addBox(-11.1256F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.567F, -3.6528F, -0.4598F, 0.2328F, -1.3441F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(63, 22).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.567F, -3.6528F, -0.2235F, 0.4641F, -0.6791F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(64, 37).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.367F, -1.6528F, -0.1928F, -0.4859F, 0.6651F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(30, 68).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.367F, -1.6528F, -0.3168F, -0.4194F, 0.9469F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(53, 35).addBox(5.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.367F, -1.6528F, -0.4516F, -0.2669F, 1.3421F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(63, 22).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.567F, -3.6528F, -0.2235F, -0.4641F, 0.6791F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(28, 15).addBox(5.1255F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.567F, -3.6528F, -0.4598F, -0.2328F, 1.3441F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(21, 68).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.567F, -3.6528F, -0.3388F, -0.391F, 0.9556F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(26, 20).addBox(-0.5F, -1.0F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.7F, -1.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6019F, -4.966F, -0.0558F, 0.1332F, 0.0359F));

		PartDefinition cube_r108 = body3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(30, 2).addBox(-0.5F, 0.0148F, -4.0846F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r109 = body3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(66, 18).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1651F, -0.4868F, -0.2829F, 0.4196F, -0.7046F));

		PartDefinition cube_r110 = body3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(69, 41).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1651F, -0.4868F, -0.3814F, 0.3337F, -0.9708F));

		PartDefinition cube_r111 = body3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(13, 27).mirror().addBox(-12.1256F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1651F, -0.4868F, -0.4757F, 0.1648F, -1.3472F));

		PartDefinition cube_r112 = body3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(66, 16).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7651F, -2.2868F, -0.3118F, 0.3968F, -0.716F));

		PartDefinition cube_r113 = body3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(69, 39).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7651F, -2.2868F, -0.4021F, 0.3048F, -0.9772F));

		PartDefinition cube_r114 = body3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(27, 0).mirror().addBox(-12.1256F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7651F, -2.2868F, -0.4835F, 0.1308F, -1.3484F));

		PartDefinition cube_r115 = body3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(13, 27).addBox(5.1255F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1651F, -0.4868F, -0.4757F, -0.1648F, 1.3472F));

		PartDefinition cube_r116 = body3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(69, 41).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1651F, -0.4868F, -0.3814F, -0.3337F, 0.9708F));

		PartDefinition cube_r117 = body3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(66, 18).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1651F, -0.4868F, -0.2829F, -0.4196F, 0.7046F));

		PartDefinition cube_r118 = body3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(27, 0).addBox(5.1255F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7651F, -2.2868F, -0.4835F, -0.1308F, 1.3484F));

		PartDefinition cube_r119 = body3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(69, 39).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7651F, -2.2868F, -0.4021F, -0.3048F, 0.9772F));

		PartDefinition cube_r120 = body3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(66, 16).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7651F, -2.2868F, -0.3118F, -0.3968F, 0.716F));

		PartDefinition cube_r121 = body3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(88, 47).addBox(0.0F, -1.3611F, -0.1182F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.196F, -0.857F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r122 = body3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(88, 37).addBox(0.0F, -1.6088F, 0.0394F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.304F, -2.957F, 0.0262F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(22, 35).addBox(-0.5F, -0.4312F, -3.9471F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9506F, -3.8712F, 0.4192F, 0.0399F, 0.0178F));

		PartDefinition cube_r123 = body4.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(88, 65).addBox(0.0F, -1.6745F, 0.0098F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4312F, -0.9471F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r124 = body4.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(89, 0).addBox(0.0F, -1.7501F, 0.0278F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4312F, -2.9471F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r125 = body4.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(21, 11).mirror().addBox(-12.1256F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4155F, -0.5687F, -0.2438F, -1.3435F));

		PartDefinition cube_r126 = body4.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(12, 68).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4155F, -0.6132F, -0.018F, -1.0079F));

		PartDefinition cube_r127 = body4.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(12, 66).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4155F, -0.6009F, 0.1319F, -0.7927F));

		PartDefinition cube_r128 = body4.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(15, 9).mirror().addBox(-12.1256F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4155F, -0.5647F, -0.2268F, -1.3444F));

		PartDefinition cube_r129 = body4.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(64, 68).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4155F, -0.6039F, -0.0032F, -1.008F));

		PartDefinition cube_r130 = body4.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(65, 9).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4155F, -0.5885F, 0.1444F, -0.791F));

		PartDefinition cube_r131 = body4.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(12, 66).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4155F, -0.6009F, -0.1319F, 0.7927F));

		PartDefinition cube_r132 = body4.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(12, 68).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4155F, -0.6132F, 0.018F, 1.0079F));

		PartDefinition cube_r133 = body4.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(21, 11).addBox(5.1255F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4155F, -0.5687F, 0.2438F, 1.3435F));

		PartDefinition cube_r134 = body4.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(65, 9).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4155F, -0.5885F, -0.1444F, 0.791F));

		PartDefinition cube_r135 = body4.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(64, 68).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4155F, -0.6039F, 0.0032F, 1.008F));

		PartDefinition cube_r136 = body4.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(15, 9).addBox(5.1255F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4155F, -0.5647F, 0.2268F, 1.3444F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0534F, -3.8819F, -0.2271F, 0.0425F, -0.0098F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(26, 89).addBox(0.0F, -2.4226F, -0.0168F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2508F, -1.0096F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(47, 87).addBox(0.0F, -2.8222F, -0.0133F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6508F, -2.9096F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(30, 27).mirror().addBox(-4.8F, 0.0F, -0.4F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1538F, 11.3038F, -1.0954F, -0.1723F, 0.3217F, 0.3999F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-11.7F, 0.0F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0856F, 11.8784F, 1.3799F, -0.1021F, 1.1124F, 0.6164F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-9.0F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0856F, 11.8784F, 1.3799F, -0.2962F, 0.9816F, 0.3668F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(28, 13).mirror().addBox(-7.1F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0856F, 11.8784F, 1.3799F, -0.324F, 0.8391F, 0.2672F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(28, 17).mirror().addBox(-5.5F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0856F, 11.8784F, 1.3799F, -0.2653F, 0.5302F, 0.2335F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(20, 41).mirror().addBox(-4.5F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9306F, 10.3225F, -2.8082F, -0.2852F, 0.2873F, 0.2223F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(52, 23).mirror().addBox(-3.9F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1131F, 9.319F, -4.3389F, -0.6766F, 0.2427F, 0.1255F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(50, 5).mirror().addBox(-3.7F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0243F, 8.3403F, -5.5099F, -0.5982F, 0.1007F, 0.7109F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(39, 33).mirror().addBox(-4.9F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9466F, 11.8477F, 0.9559F, -0.1477F, 0.3074F, 0.1736F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(53, 37).mirror().addBox(-9.1256F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9611F, -2.3337F, -0.5333F, -0.0906F, -1.3494F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9611F, -2.3337F, -0.5291F, 0.1148F, -1.0038F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(66, 24).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9611F, -2.3337F, -0.4875F, 0.2428F, -0.7716F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(39, 24).mirror().addBox(-10.1256F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2611F, -0.3337F, -0.5295F, -0.0736F, -1.3497F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(69, 43).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2611F, -0.3337F, -0.5196F, 0.1295F, -1.0027F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(66, 20).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2611F, -0.3337F, -0.4746F, 0.2549F, -0.7684F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(66, 24).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9611F, -2.3337F, -0.4875F, -0.2428F, 0.7716F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(0, 70).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9611F, -2.3337F, -0.5291F, -0.1148F, 1.0038F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(53, 37).addBox(5.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9611F, -2.3337F, -0.5333F, 0.0906F, 1.3494F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(66, 20).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2611F, -0.3337F, -0.4746F, -0.2549F, 0.7684F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(69, 43).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2611F, -0.3337F, -0.5196F, -0.1295F, 1.0027F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(39, 24).addBox(5.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2611F, -0.3337F, -0.5295F, 0.0736F, 1.3497F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(26, 29).addBox(-1.0F, -0.9364F, -0.0454F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 11.5083F, -2.1516F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(30, 27).addBox(-1.2F, 0.0F, -0.4F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1538F, 11.3038F, -1.0954F, -0.1723F, -0.3217F, -0.3999F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(39, 33).addBox(-0.1F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9466F, 11.8477F, 0.9559F, -0.1477F, -0.3074F, -0.1736F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(0, 13).addBox(-1.0F, -0.6916F, -6.5108F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 11.33F, -2.2767F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(50, 5).addBox(-0.3F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0243F, 8.3403F, -5.5099F, -0.5982F, -0.1007F, -0.7109F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(52, 23).addBox(-0.1F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1131F, 9.319F, -4.3389F, -0.6766F, -0.2427F, -0.1255F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(20, 41).addBox(-0.5F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9306F, 10.3225F, -2.8082F, -0.2852F, -0.2873F, -0.2223F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(14, 57).addBox(-1.0F, -0.9035F, -1.5298F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 11.33F, -2.2767F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(28, 17).addBox(-0.5F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0856F, 11.8784F, 1.3799F, -0.2653F, -0.5302F, -0.2335F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(28, 13).addBox(0.1F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0856F, 11.8784F, 1.3799F, -0.324F, -0.8391F, -0.2672F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(0, 11).addBox(0.0F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0856F, 11.8784F, 1.3799F, -0.2962F, -0.9816F, -0.3668F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(0, 0).addBox(-0.3F, 0.0F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0856F, 11.8784F, 1.3799F, -0.1021F, -1.1124F, -0.6164F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(33, 35).addBox(-0.5F, -1.908F, 6.84F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.9508F, -9.7096F, 0.3403F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3104F, -3.4549F, 0.4781F, 0.0975F, 0.0015F));

		PartDefinition cube_r173 = neck2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(39, 78).addBox(0.0F, -3.3489F, -0.0609F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.842F, -2.9765F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r174 = neck2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(5, 84).addBox(0.0F, -3.1489F, 0.0391F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6185F, -1.0478F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r175 = neck2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(80, 23).mirror().addBox(-4.8978F, -0.7765F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1493F, -2.4788F, -0.8061F, -0.3111F, -0.9759F));

		PartDefinition cube_r176 = neck2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(65, 66).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1493F, -2.4788F, -0.845F, -0.1181F, -0.7945F));

		PartDefinition cube_r177 = neck2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(66, 26).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1493F, -0.4788F, -0.796F, -0.0682F, -0.799F));

		PartDefinition cube_r178 = neck2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(9, 70).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1493F, -0.4788F, -0.7657F, -0.253F, -0.9871F));

		PartDefinition cube_r179 = neck2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(26, 66).mirror().addBox(-8.1256F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1493F, -0.4788F, -0.6402F, -0.5151F, -1.3167F));

		PartDefinition cube_r180 = neck2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(65, 66).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1493F, -2.4788F, -0.845F, 0.1181F, 0.7945F));

		PartDefinition cube_r181 = neck2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(80, 23).addBox(2.8978F, -0.7765F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1493F, -2.4788F, -0.8061F, 0.3111F, 0.9759F));

		PartDefinition cube_r182 = neck2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(26, 66).addBox(5.1255F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1493F, -0.4788F, -0.6402F, 0.5151F, 1.3167F));

		PartDefinition cube_r183 = neck2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(9, 70).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1493F, -0.4788F, -0.7657F, 0.253F, 0.9871F));

		PartDefinition cube_r184 = neck2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(66, 26).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1493F, -0.4788F, -0.796F, 0.0682F, 0.799F));

		PartDefinition cube_r185 = neck2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(20, 43).addBox(-0.5F, -0.2F, 2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.0131F, -5.7998F, -0.1047F, 0.0F, 0.0F));

		PartDefinition leftarm = neck2.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 4.5587F, -4.1543F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r186 = leftarm.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(28, 74).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 6.621F, 2.0131F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r187 = leftarm.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(71, 70).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.2246F, 1.2679F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r188 = leftarm.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(7, 72).addBox(-1.0F, -0.7F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(71, 73).addBox(-1.0F, -0.7F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 6.3149F, 1.3157F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r189 = leftarm.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(18, 48).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0062F, 0.7723F, 0.3562F, -0.1659F, 0.0014F, -0.001F));

		PartDefinition cube_r190 = leftarm.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(75, 48).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 4.3226F, -0.3972F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r191 = leftarm.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(57, 82).addBox(-0.5F, -1.4F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.4641F, 0.4195F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r192 = leftarm.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(18, 70).addBox(-0.5F, -3.4F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7412F, 0.5344F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r193 = leftarm.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(77, 10).addBox(-0.5F, -1.2F, 0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.0216F, -0.4226F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 7.1842F, 0.9136F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r194 = leftarm2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(59, 0).addBox(-0.4F, -1.0F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2236F, -0.2877F, 0.5559F, 1.5708F, 0.7679F, -1.5708F));

		PartDefinition cube_r195 = leftarm2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(39, 68).addBox(-1.0F, -1.3F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3236F, -1.6819F, 0.9729F, 1.5708F, 1.3352F, -1.5708F));

		PartDefinition cube_r196 = leftarm2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(53, 71).addBox(-1.0F, -0.7F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1764F, -0.5461F, 1.4201F, 1.5708F, -0.2356F, -1.5708F));

		PartDefinition cube_r197 = leftarm2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(40, 62).addBox(-1.0256F, -0.0299F, -0.9596F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.136F, 0.2017F, 1.4556F, -1.5708F, -1.5533F, 1.5708F));

		PartDefinition cube_r198 = leftarm2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(34, 56).addBox(-0.2F, -2.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1236F, 6.8388F, 1.0892F, 1.5708F, -1.3265F, -1.5708F));

		PartDefinition cube_r199 = leftarm2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(32, 85).addBox(-0.4929F, 1.6785F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 15).addBox(-0.4929F, 0.0785F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.7764F, 5.1133F, 0.6225F, 1.5708F, -1.4312F, -1.5708F));

		PartDefinition cube_r200 = leftarm2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(0, 61).addBox(-0.6285F, -2.2225F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7764F, 2.4922F, 0.2488F, 1.5708F, -1.3788F, -1.5708F));

		PartDefinition cube_r201 = leftarm2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(55, 60).addBox(-0.1335F, -0.0622F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3236F, 0.211F, 0.0776F, 1.5708F, -1.4661F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offset(-0.2F, 7.9969F, 1.1286F));

		PartDefinition cube_r202 = leftArm3.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(47, 84).addBox(0.2F, -0.7F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6775F, 0.8301F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r203 = leftArm3.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(74, 67).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(0, 55).addBox(-1.0F, -0.2399F, -0.3907F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.4216F, -0.4049F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r204 = leftArm4.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(15, 81).addBox(0.0856F, -0.8309F, -0.4937F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5765F, 4.2923F, -0.2672F, -1.0086F, -0.5442F, -0.2928F));

		PartDefinition cube_r205 = leftArm4.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(64, 54).addBox(-1.5765F, -0.8029F, -0.5191F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5765F, 4.2923F, -0.2672F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightarm = neck2.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 4.5587F, -4.1543F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r206 = rightarm.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(53, 74).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 6.621F, 2.0131F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r207 = rightarm.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(72, 4).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.2246F, 1.2679F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r208 = rightarm.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(35, 72).addBox(-1.0F, -0.7F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(74, 7).addBox(-1.0F, -0.7F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 6.3149F, 1.3157F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r209 = rightarm.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(49, 8).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0062F, 0.7723F, 0.3562F, -0.1659F, -0.0014F, 0.001F));

		PartDefinition cube_r210 = rightarm.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(17, 76).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 4.3226F, -0.3972F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r211 = rightarm.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(20, 83).addBox(-0.5F, -1.4F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.4641F, 0.4195F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r212 = rightarm.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(23, 70).addBox(-0.5F, -3.4F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7412F, 0.5344F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r213 = rightarm.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(27, 77).addBox(-0.5F, -1.2F, 0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.0216F, -0.4226F, -0.0524F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 7.1842F, 0.9136F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r214 = rightarm2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(59, 17).addBox(-0.6F, -1.0F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2236F, -0.2877F, 0.5559F, 1.5708F, -0.7679F, 1.5708F));

		PartDefinition cube_r215 = rightarm2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(68, 49).addBox(-1.0F, -1.3F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3236F, -1.6819F, 0.9729F, 1.5708F, -1.3352F, 1.5708F));

		PartDefinition cube_r216 = rightarm2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(71, 53).addBox(-1.0F, -0.7F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1764F, -0.5461F, 1.4201F, 1.5708F, 0.2356F, 1.5708F));

		PartDefinition cube_r217 = rightarm2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(45, 62).addBox(0.0256F, -0.0299F, -0.9596F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.136F, 0.2017F, 1.4556F, -1.5708F, 1.5533F, -1.5708F));

		PartDefinition cube_r218 = rightarm2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(41, 56).addBox(-0.8F, -2.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1236F, 6.8388F, 1.0892F, 1.5708F, 1.3265F, 1.5708F));

		PartDefinition cube_r219 = rightarm2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(85, 34).addBox(-0.5071F, 1.6785F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 19).addBox(-0.5071F, 0.0785F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7764F, 5.1133F, 0.6225F, 1.5708F, 1.4312F, 1.5708F));

		PartDefinition cube_r220 = rightarm2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(21, 61).addBox(-0.3715F, -2.2225F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7764F, 2.4922F, 0.2488F, 1.5708F, 1.3788F, 1.5708F));

		PartDefinition cube_r221 = rightarm2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(60, 60).addBox(-0.8665F, -0.0622F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3236F, 0.211F, 0.0776F, 1.5708F, 1.4661F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offset(0.2F, 7.9969F, 1.1286F));

		PartDefinition cube_r222 = rightArm3.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(84, 73).addBox(-1.2F, -0.7F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6775F, 0.8301F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r223 = rightArm3.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(10, 75).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(7, 56).addBox(-1.0F, -0.2399F, -0.3907F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.4216F, -0.4049F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r224 = rightArm4.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(72, 81).addBox(-1.0856F, -0.8309F, -0.4937F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5765F, 4.2923F, -0.2672F, -0.559F, 0.3735F, 0.4954F));

		PartDefinition cube_r225 = rightArm4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(65, 45).addBox(-0.4235F, -0.8029F, -0.5191F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5765F, 4.2923F, -0.2672F, -0.6545F, 0.0F, 0.0F));

		PartDefinition bone2 = neck2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.7082F, 0.7445F, -2.5377F));

		PartDefinition cube_r226 = bone2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(61, 49).addBox(-0.5F, -0.75F, -0.375F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.693F, -0.6594F, 3.3471F, 0.5277F, 0.169F, -0.3803F));

		PartDefinition cube_r227 = bone2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(59, 25).addBox(-0.5F, -0.775F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.7535F, 0.035F, 1.507F, 0.519F, 0.169F, -0.3803F));

		PartDefinition cube_r228 = bone2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(9, 47).addBox(-0.5F, -0.7F, -2.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.1492F, 0.1972F, 4.4428F, 0.039F, 0.169F, -0.3803F));

		PartDefinition cube_r229 = bone2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, -0.95F, -1.85F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7233F, -0.5447F, 2.9322F, 0.8506F, 0.169F, -0.3803F));

		PartDefinition cube_r230 = bone2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(27, 56).addBox(-0.5F, -0.8F, -0.45F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.9646F, -0.6701F, 1.8919F, 1.8192F, 0.169F, -0.3803F));

		PartDefinition cube_r231 = bone2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(0, 2).addBox(-1.5272F, -1.9788F, -3.9175F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5698F, 0.4149F, 1.7751F, 0.7982F, 0.169F, -0.3803F));

		PartDefinition cube_r232 = bone2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(10, 81).addBox(-0.5F, -1.7F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.81F, 0.7275F, -0.3065F, 3.102F, 0.169F, -0.3803F));

		PartDefinition cube_r233 = bone2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(54, 51).addBox(-0.5F, -0.1F, -2.15F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0944F, 0.3589F, -1.0525F, 2.5153F, 0.1294F, -0.3948F));

		PartDefinition cube_r234 = bone2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(80, 51).addBox(-1.5272F, -3.2929F, -3.6175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5698F, 0.4149F, 1.7751F, 1.1298F, 0.169F, -0.3803F));

		PartDefinition cube_r235 = bone2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(13, 29).addBox(0.0F, 0.3F, -2.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6157F, 0.5002F, 0.3011F, 0.7397F, -0.2656F, -0.2024F));

		PartDefinition bone4 = neck2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.7082F, 0.7445F, -2.5377F));

		PartDefinition cube_r236 = bone4.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(61, 49).mirror().addBox(-0.5F, -0.75F, -0.375F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.693F, -0.6594F, 3.3471F, 0.5277F, -0.169F, 0.3803F));

		PartDefinition cube_r237 = bone4.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(59, 25).mirror().addBox(-0.5F, -0.775F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.7535F, 0.035F, 1.507F, 0.519F, -0.169F, 0.3803F));

		PartDefinition cube_r238 = bone4.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(9, 47).mirror().addBox(-0.5F, -0.7F, -2.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.1492F, 0.1972F, 4.4428F, 0.039F, -0.169F, 0.3803F));

		PartDefinition cube_r239 = bone4.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(-0.5F, -0.95F, -1.85F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7233F, -0.5447F, 2.9322F, 0.8506F, -0.169F, 0.3803F));

		PartDefinition cube_r240 = bone4.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(27, 56).mirror().addBox(-0.5F, -0.8F, -0.45F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.9646F, -0.6701F, 1.8919F, 1.8192F, -0.169F, 0.3803F));

		PartDefinition cube_r241 = bone4.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(0, 2).mirror().addBox(0.5272F, -1.9788F, -3.9175F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5698F, 0.4149F, 1.7751F, 0.7982F, -0.169F, 0.3803F));

		PartDefinition cube_r242 = bone4.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(10, 81).mirror().addBox(-0.5F, -1.7F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.81F, 0.7275F, -0.3065F, 3.102F, -0.169F, 0.3803F));

		PartDefinition cube_r243 = bone4.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(54, 51).mirror().addBox(-0.5F, -0.1F, -2.15F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0944F, 0.3589F, -1.0525F, 2.5153F, -0.1294F, 0.3948F));

		PartDefinition cube_r244 = bone4.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(80, 51).mirror().addBox(0.5272F, -3.2929F, -3.6175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5698F, 0.4149F, 1.7751F, 1.1298F, -0.169F, 0.3803F));

		PartDefinition cube_r245 = bone4.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(13, 29).mirror().addBox(-1.0F, 0.3F, -2.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6157F, 0.5002F, 0.3011F, 0.7397F, 0.2656F, 0.2024F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1796F, -3.1233F, -0.6134F, 0.1793F, -0.1249F));

		PartDefinition cube_r246 = neck.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(85, 47).addBox(0.0F, -2.5828F, -0.0159F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6196F, -1.873F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r247 = neck.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(81, 67).mirror().addBox(-1.5F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0303F, -1.3555F, -0.0341F, 0.1287F, -0.9069F));

		PartDefinition cube_r248 = neck.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(81, 67).addBox(-0.5F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0303F, -1.3555F, -0.0341F, -0.1287F, 0.9069F));

		PartDefinition cube_r249 = neck.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(44, 35).addBox(-0.5F, -0.6166F, -0.4594F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0305F, -2.3993F, 0.0698F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(0, 50).addBox(-0.5F, -0.6F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F))
				.texOffs(62, 86).addBox(0.0F, -2.8F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0852F, -2.6688F, -0.2985F, 0.1641F, 0.0854F));

		PartDefinition cube_r250 = neck3.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(87, 88).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r251 = neck3.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(56, 49).mirror().addBox(-0.8F, 0.2F, -4.2F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(82, 13).mirror().addBox(-1.3F, 0.2F, -2.2F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.055F, 1.3133F, -0.0341F, 0.1287F, -0.9069F));

		PartDefinition cube_r252 = neck3.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(56, 49).addBox(-0.2F, 0.2F, -4.2F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 13).addBox(-0.7F, 0.2F, -2.2F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.055F, 1.3133F, -0.0341F, -0.1287F, 0.9069F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(50, 18).addBox(-0.5F, -0.6F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F))
				.texOffs(73, 88).addBox(0.0F, -1.9F, -2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0125F, -2.9567F, -0.251F, 0.0327F, 0.1268F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(50, 26).addBox(-0.5F, -0.6F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F))
				.texOffs(5, 75).addBox(0.0F, -1.9F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0033F, -2.9069F, -0.2867F, 0.0857F, 0.2478F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create().texOffs(27, 51).addBox(-0.5F, -0.6F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0342F, -2.8093F, 0.4045F, 0.1204F, 0.0514F));

		PartDefinition cube_r253 = neck6.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(0, 75).addBox(0.0F, -1.0011F, -0.216F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9244F, -1.7688F, -0.192F, 0.0F, 0.0F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0054F, -2.8541F, -0.0579F, 0.2855F, 0.0752F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(73, 0).addBox(-1.0F, -0.45F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9926F, -0.2462F, 2.4871F, 0.0F, 0.0F));

		PartDefinition cube_r255 = head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(74, 64).addBox(-1.0F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6294F, -0.8079F, 1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r256 = head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(0, 27).addBox(-1.5F, -0.975F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 4.4211F, -0.3491F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r257 = head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(50, 0).addBox(-0.2F, -1.0F, -0.075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.075F, 6.5099F, -2.0944F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r258 = head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(15, 2).addBox(-1.0F, -0.675F, -2.3F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 6.6202F, -2.1241F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(32, 78).addBox(-1.0F, -0.6696F, -0.8506F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(78, 31).addBox(-1.0F, -0.8696F, -0.9506F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 9.6435F, -4.3908F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(33, 41).addBox(-1.0F, -0.0946F, 0.4994F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 5.3759F, -4.8222F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(54, 13).addBox(-1.0F, -0.0946F, -0.1256F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 8.9673F, -5.4075F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(78, 28).addBox(-1.0F, -0.0946F, -0.1256F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 8.9673F, -5.4075F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(10, 78).addBox(-1.0F, -0.8196F, -0.6506F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, 9.158F, -4.271F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(56, 45).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 8.5074F, -3.5371F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r265 = head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(78, 34).addBox(-1.0F, 0.4054F, -0.3256F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 7.9395F, -4.9887F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r266 = head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(65, 5).addBox(-0.5F, -0.861F, -0.152F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 7.7066F, -5.3726F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r267 = head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(65, 58).addBox(-0.5F, -0.161F, -1.852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0F, 5.8795F, -5.5769F, 1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r268 = head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(65, 87).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 4.9616F, -5.1747F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r269 = head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(28, 70).addBox(-1.0F, 0.0F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 4.1633F, -4.7591F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(70, 11).addBox(-1.0F, -1.0F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.8993F, -3.5673F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r271 = head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(45, 13).addBox(-1.5F, -0.211F, -1.477F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.9595F, -3.701F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r272 = head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(65, 62).addBox(-0.5F, -0.024F, -1.9836F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4274F, -3.8785F, 1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r273 = head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(57, 86).addBox(-0.5F, -0.024F, -0.9586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.5367F, -3.482F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r274 = head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(52, 86).addBox(-0.5F, -0.024F, -0.9586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3019F, -2.9373F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r275 = head.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(81, 63).addBox(0.0F, -0.0424F, 0.3844F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(0, 80).addBox(0.0F, -0.0424F, -0.0656F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, -1.11F, -2.2677F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r276 = head.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(25, 86).addBox(0.0F, 0.0076F, 0.0094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -0.3369F, -2.9549F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r277 = head.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(60, 74).addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0F, -2.1561F, -1.3516F, 0.6283F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.425F, 8.7299F, -6.0083F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(57, 67).addBox(-0.15F, -0.5F, -1.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4995F, -6.5371F, 2.4959F, 1.4028F, 0.0517F, 0.39F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(86, 59).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.3643F, -4.7441F, 3.0101F, 1.8461F, 0.1214F, 0.2468F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(52, 77).addBox(-1.0F, 0.0F, -1.025F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.9274F, -5.495F, 1.6179F, 1.2593F, 0.1696F, 0.4607F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(47, 46).addBox(-1.2674F, -1.167F, -2.1943F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.2073F, -7.5881F, 4.1855F, 1.2802F, 0.7897F, -0.0955F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(50, 67).addBox(-1.3275F, -1.1436F, -0.4498F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.2073F, -7.5881F, 4.1855F, 1.0041F, 0.7071F, -0.3718F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(0, 45).addBox(-1.2774F, -1.2381F, 0.1157F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.2073F, -7.5881F, 4.1855F, 0.6567F, 0.509F, -0.5811F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(86, 62).addBox(-1.0F, -0.0424F, -1.0156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.925F, -10.8803F, 4.6773F, 0.5196F, 0.6906F, -0.8391F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(32, 81).addBox(-1.0F, -0.0424F, -1.0156F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7822F, -10.5356F, 5.0601F, 0.8155F, 0.219F, -0.2018F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(58, 7).addBox(-0.5F, -0.7101F, -0.5941F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.9F, -2.7804F, 1.9388F, 2.4173F, 0.2182F, -0.0436F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(13, 88).addBox(-0.5F, -0.2637F, -0.5438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.2F, 0.7191F, 1.9656F, 0.6817F, 0.1693F, -0.248F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(8, 88).addBox(-0.5F, -0.7363F, -0.5438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2F, 0.7191F, 1.9656F, 0.3152F, 0.1693F, -0.248F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(42, 41).addBox(-0.5F, -0.3338F, -1.9703F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.9F, -2.7804F, 1.9388F, 1.4573F, 0.2182F, -0.0436F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.425F, 8.7299F, -6.0083F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(57, 67).mirror().addBox(-0.85F, -0.5F, -1.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4995F, -6.5371F, 2.4959F, 1.4028F, -0.0517F, -0.39F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(86, 59).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.3643F, -4.7441F, 3.0101F, 1.8461F, -0.1214F, -0.2468F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(52, 77).mirror().addBox(0.0F, 0.0F, -1.025F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.9274F, -5.495F, 1.6179F, 1.2593F, -0.1696F, -0.4607F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(47, 46).mirror().addBox(-0.7326F, -1.167F, -2.1943F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.2073F, -7.5881F, 4.1855F, 1.2802F, -0.7897F, 0.0955F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(50, 67).mirror().addBox(-0.6725F, -1.1436F, -0.4498F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.2073F, -7.5881F, 4.1855F, 1.0041F, -0.7071F, 0.3718F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-0.7226F, -1.2381F, 0.1157F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.2073F, -7.5881F, 4.1855F, 0.6567F, -0.509F, 0.5811F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(86, 62).mirror().addBox(0.0F, -0.0424F, -1.0156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.925F, -10.8803F, 4.6773F, 0.5196F, -0.6906F, 0.8391F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(32, 81).mirror().addBox(0.0F, -0.0424F, -1.0156F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7822F, -10.5356F, 5.0601F, 0.8155F, -0.219F, 0.2018F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(58, 7).mirror().addBox(-0.5F, -0.7101F, -0.5941F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -2.7804F, 1.9388F, 2.4173F, -0.2182F, 0.0436F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(13, 88).mirror().addBox(-0.5F, -0.2637F, -0.5438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.7191F, 1.9656F, 0.6817F, -0.1693F, 0.248F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(8, 88).mirror().addBox(-0.5F, -0.7363F, -0.5438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.7191F, 1.9656F, 0.3152F, -0.1693F, 0.248F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(42, 41).mirror().addBox(-0.5F, -0.3338F, -1.9703F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -2.7804F, 1.9388F, 1.4573F, -0.2182F, 0.0436F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9F, 5.5795F, -2.0001F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r302 = leftOrbit.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(33, 62).addBox(0.3125F, -0.3538F, -0.1341F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1547F, -4.5231F, 1.496F, 1.6264F, -0.6387F, -1.0762F));

		PartDefinition cube_r303 = leftOrbit.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(26, 62).addBox(-0.8875F, -0.3538F, -0.1341F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(1.6121F, -5.3711F, 2.2113F, 2.1936F, -0.6387F, -1.0762F));

		PartDefinition cube_r304 = leftOrbit.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(85, 31).addBox(-0.0794F, -0.763F, -1.5887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1547F, -4.5231F, 1.496F, 1.1093F, -0.3015F, 0.144F));

		PartDefinition cube_r305 = leftOrbit.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(85, 18).addBox(-0.0794F, -0.5781F, -1.0092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.1547F, -4.5231F, 1.496F, 0.8911F, -0.3015F, 0.144F));

		PartDefinition cube_r306 = leftOrbit.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(85, 15).addBox(-0.0852F, -0.5407F, -0.4526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1547F, -4.5231F, 1.496F, 0.7724F, -0.2966F, 0.0628F));

		PartDefinition cube_r307 = leftOrbit.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(85, 28).addBox(-0.0017F, -0.523F, -0.0089F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.1547F, -4.5231F, 1.496F, 0.9162F, -0.4852F, -0.1977F));

		PartDefinition cube_r308 = leftOrbit.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(66, 0).addBox(-0.425F, -0.45F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4493F, -2.681F, 0.5441F, 1.2599F, -0.2347F, 0.2622F));

		PartDefinition cube_r309 = leftOrbit.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(84, 44).addBox(-0.5F, -0.5596F, -0.3043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3295F, -1.5813F, -1.9485F, 1.209F, 0.0601F, 0.0593F));

		PartDefinition cube_r310 = leftOrbit.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(64, 33).addBox(-0.5F, -0.5635F, -1.7945F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3295F, -1.5813F, -1.9485F, 1.3653F, 0.1231F, 0.3324F));

		PartDefinition cube_r311 = leftOrbit.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(42, 84).addBox(-0.5F, -0.5385F, -0.6945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3295F, -1.5813F, -1.9485F, 1.8292F, 0.1711F, 0.1937F));

		PartDefinition cube_r312 = leftOrbit.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(13, 85).addBox(-0.4582F, -0.883F, -1.7539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(8, 85).addBox(-0.4582F, -0.883F, -1.1539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3011F, -1.0675F, -1.648F, -3.0587F, 0.2773F, 0.2228F));

		PartDefinition cube_r313 = leftOrbit.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(48, 57).addBox(-0.8082F, -1.783F, -1.4289F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.4993F, -0.6683F, -1.9377F, 2.6421F, 0.3288F, 0.3184F));

		PartDefinition cube_r314 = leftOrbit.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(63, 12).addBox(-0.4582F, -0.583F, -1.4289F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.3011F, -1.0675F, -1.648F, 2.6136F, 0.2773F, 0.2228F));

		PartDefinition cube_r315 = leftOrbit.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(11, 35).addBox(-0.8378F, -0.7328F, -4.0306F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(1.1531F, -0.9841F, 0.5084F, 1.1396F, 0.1222F, 0.3249F));

		PartDefinition cube_r316 = leftOrbit.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(0, 33).addBox(-0.8128F, -0.8107F, -4.0601F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1531F, -0.9841F, 0.5084F, 0.9937F, 0.125F, 0.3434F));

		PartDefinition cube_r317 = leftOrbit.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(5, 62).addBox(-0.5686F, -0.3868F, -0.4056F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7586F, -0.8372F, -0.005F, 1.3322F, 0.0121F, 0.565F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9F, 5.5795F, -2.0001F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r318 = rightOrbit.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(33, 62).mirror().addBox(-1.3125F, -0.3538F, -0.1341F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1547F, -4.5231F, 1.496F, 1.6264F, 0.6387F, 1.0762F));

		PartDefinition cube_r319 = rightOrbit.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(26, 62).mirror().addBox(-0.1125F, -0.3538F, -0.1341F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-1.6121F, -5.3711F, 2.2113F, 2.1936F, 0.6387F, 1.0762F));

		PartDefinition cube_r320 = rightOrbit.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(85, 31).mirror().addBox(-0.9206F, -0.763F, -1.5887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1547F, -4.5231F, 1.496F, 1.1093F, 0.3015F, -0.144F));

		PartDefinition cube_r321 = rightOrbit.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(85, 18).mirror().addBox(-0.9206F, -0.5781F, -1.0092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.1547F, -4.5231F, 1.496F, 0.8911F, 0.3015F, -0.144F));

		PartDefinition cube_r322 = rightOrbit.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(85, 15).mirror().addBox(-0.9148F, -0.5407F, -0.4526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1547F, -4.5231F, 1.496F, 0.7724F, 0.2966F, -0.0628F));

		PartDefinition cube_r323 = rightOrbit.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(85, 28).mirror().addBox(-0.9983F, -0.523F, -0.0089F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.1547F, -4.5231F, 1.496F, 0.9162F, 0.4852F, 0.1977F));

		PartDefinition cube_r324 = rightOrbit.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(66, 0).mirror().addBox(-0.575F, -0.45F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4493F, -2.681F, 0.5441F, 1.2599F, 0.2347F, -0.2622F));

		PartDefinition cube_r325 = rightOrbit.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(84, 44).mirror().addBox(-0.5F, -0.5596F, -0.3043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3295F, -1.5813F, -1.9485F, 1.209F, -0.0601F, -0.0593F));

		PartDefinition cube_r326 = rightOrbit.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(64, 33).mirror().addBox(-0.5F, -0.5635F, -1.7945F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3295F, -1.5813F, -1.9485F, 1.3653F, -0.1231F, -0.3324F));

		PartDefinition cube_r327 = rightOrbit.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(42, 84).mirror().addBox(-0.5F, -0.5385F, -0.6945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3295F, -1.5813F, -1.9485F, 1.8292F, -0.1711F, -0.1937F));

		PartDefinition cube_r328 = rightOrbit.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(13, 85).mirror().addBox(-0.5418F, -0.883F, -1.7539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(8, 85).mirror().addBox(-0.5418F, -0.883F, -1.1539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3011F, -1.0675F, -1.648F, -3.0587F, -0.2773F, -0.2228F));

		PartDefinition cube_r329 = rightOrbit.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(48, 57).mirror().addBox(-0.1918F, -1.783F, -1.4289F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.4993F, -0.6683F, -1.9377F, 2.6421F, -0.3288F, -0.3184F));

		PartDefinition cube_r330 = rightOrbit.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(63, 12).mirror().addBox(-0.5418F, -0.583F, -1.4289F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.3011F, -1.0675F, -1.648F, 2.6136F, -0.2773F, -0.2228F));

		PartDefinition cube_r331 = rightOrbit.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(11, 35).mirror().addBox(-0.1622F, -0.7328F, -4.0306F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-1.1531F, -0.9841F, 0.5084F, 1.1396F, -0.1222F, -0.3249F));

		PartDefinition cube_r332 = rightOrbit.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-0.1872F, -0.8107F, -4.0601F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1531F, -0.9841F, 0.5084F, 0.9937F, -0.125F, -0.3434F));

		PartDefinition cube_r333 = rightOrbit.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(5, 62).mirror().addBox(-0.4314F, -0.3868F, -0.4056F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.7586F, -0.8372F, -0.005F, 1.3322F, -0.0121F, -0.565F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 1.2954F, -0.2329F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r334 = jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(30, 88).mirror().addBox(0.0F, -3.0F, -0.025F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2931F, -0.5844F, -5.9581F, -2.0577F, 0.0378F, -0.0462F));

		PartDefinition cube_r335 = jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(89, 41).mirror().addBox(0.0F, -1.0F, -0.525F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3347F, -0.5695F, -7.0753F, -2.0228F, 0.0378F, -0.0462F));

		PartDefinition cube_r336 = jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(84, 79).mirror().addBox(0.0F, 0.1933F, -1.4744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.1817F, -8.2915F, -1.9722F, -0.192F, 0.1047F));

		PartDefinition cube_r337 = jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(84, 76).mirror().addBox(-0.2094F, -0.0169F, -0.0042F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(84, 76).addBox(0.7906F, -0.0169F, -0.0042F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3906F, -0.863F, -6.9901F, -1.9722F, 0.0F, 0.0F));

		PartDefinition cube_r338 = jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(79, 79).mirror().addBox(-0.2094F, -0.0169F, -0.0042F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(79, 79).addBox(0.7906F, -0.0169F, -0.0042F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3906F, 0.0759F, -5.2242F, -2.0595F, 0.0F, 0.0F));

		PartDefinition cube_r339 = jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(52, 82).mirror().addBox(-0.4875F, 0.8535F, 0.6929F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5375F, 1.6652F, -1.5271F, -1.9809F, -0.1222F, 0.0F));

		PartDefinition cube_r340 = jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(14, 61).mirror().addBox(-0.4875F, -0.6278F, -0.1395F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.5375F, 1.6652F, -1.5271F, -2.2864F, -0.1222F, 0.0F));

		PartDefinition cube_r341 = jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-0.4875F, -0.6138F, 0.9086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5375F, 1.6652F, -1.5271F, -1.7628F, -0.1222F, 0.0F));

		PartDefinition cube_r342 = jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(83, 69).mirror().addBox(-0.5F, 0.075F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(83, 69).addBox(0.5F, 0.075F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 1.5838F, -4.4815F, -2.0159F, 0.0F, 0.0F));

		PartDefinition cube_r343 = jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(82, 83).mirror().addBox(-0.1F, 1.8666F, -1.5782F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(79, 75).mirror().addBox(-0.2F, 0.9666F, -1.3782F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.1817F, -8.2915F, -2.1817F, -0.192F, 0.1047F));

		PartDefinition cube_r344 = jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(77, 83).mirror().addBox(-0.2F, 2.1627F, -0.6686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(82, 25).mirror().addBox(-0.2F, 1.5627F, -0.6686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(45, 26).mirror().addBox(-0.1F, 0.8627F, -0.7686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.1817F, -8.2915F, -2.426F, -0.192F, 0.1047F));

		PartDefinition cube_r345 = jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(32, 8).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.1817F, -8.2915F, -2.2689F, -0.192F, 0.1047F));

		PartDefinition cube_r346 = jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(5, 80).mirror().addBox(-0.2094F, -1.1413F, -0.259F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(5, 80).addBox(0.7906F, -1.1413F, -0.259F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.3906F, 0.0181F, -7.1691F, -2.138F, 0.0F, 0.0F));

		PartDefinition cube_r347 = jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(80, 47).mirror().addBox(-0.5125F, -2.3961F, -1.2586F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5375F, 1.6652F, -1.5271F, -1.3614F, -0.1222F, 0.0F));

		PartDefinition cube_r348 = jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(79, 3).mirror().addBox(-0.5125F, 0.6016F, -0.5833F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5375F, 1.6652F, -1.5271F, -1.6232F, -0.1222F, 0.0F));

		PartDefinition cube_r349 = jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(67, 79).mirror().addBox(-0.2094F, -3.7113F, -0.9462F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(67, 79).addBox(0.7906F, -3.7113F, -0.9462F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.3906F, 0.0181F, -7.1691F, -2.1031F, 0.0F, 0.0F));

		PartDefinition cube_r350 = jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(72, 85).mirror().addBox(-0.5125F, -0.7031F, 1.0039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5375F, 1.6652F, -1.5271F, -1.3003F, -0.1222F, 0.0F));

		PartDefinition cube_r351 = jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(41, 2).mirror().addBox(-0.5125F, -0.8727F, -1.1408F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.5375F, 1.6652F, -1.5271F, 0.0524F, -0.1222F, 0.0F));

		PartDefinition cube_r352 = jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(62, 82).mirror().addBox(-0.5125F, -0.7912F, -1.4138F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5375F, 1.6652F, -1.5271F, -0.7767F, -0.1222F, 0.0F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(82, 55).mirror().addBox(-0.5125F, -1.9391F, -1.1485F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5375F, 1.6652F, -1.5271F, -0.5149F, -0.1222F, 0.0F));

		PartDefinition cube_r354 = jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(85, 52).mirror().addBox(-0.5125F, -0.5982F, 1.0826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5375F, 1.6652F, -1.5271F, -0.7679F, -0.1222F, 0.0F));

		PartDefinition cube_r355 = jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(30, 88).addBox(0.0F, -3.0F, -0.025F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0931F, -0.5844F, -5.9581F, -2.0577F, -0.0378F, 0.0462F));

		PartDefinition cube_r356 = jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(89, 41).addBox(0.0F, -1.0F, -0.525F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1347F, -0.5695F, -7.0753F, -2.0228F, -0.0378F, 0.0462F));

		PartDefinition cube_r357 = jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(84, 79).addBox(-1.0F, 0.1933F, -1.4744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4F, 0.1817F, -8.2915F, -1.9722F, 0.192F, -0.1047F));

		PartDefinition cube_r358 = jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(52, 82).addBox(-0.5125F, 0.8535F, 0.6929F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3375F, 1.6652F, -1.5271F, -1.9809F, 0.1222F, 0.0F));

		PartDefinition cube_r359 = jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(14, 61).addBox(-0.5125F, -0.6278F, -0.1395F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3375F, 1.6652F, -1.5271F, -2.2864F, 0.1222F, 0.0F));

		PartDefinition cube_r360 = jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(0, 87).addBox(-0.5125F, -0.6138F, 0.9086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3375F, 1.6652F, -1.5271F, -1.7628F, 0.1222F, 0.0F));

		PartDefinition cube_r361 = jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(82, 83).addBox(-0.9F, 1.8666F, -1.5782F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(79, 75).addBox(-0.8F, 0.9666F, -1.3782F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, 0.1817F, -8.2915F, -2.1817F, 0.192F, -0.1047F));

		PartDefinition cube_r362 = jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(77, 83).addBox(-0.8F, 2.1627F, -0.6686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(82, 25).addBox(-0.8F, 1.5627F, -0.6686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(45, 26).addBox(-0.9F, 0.8627F, -0.7686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4F, 0.1817F, -8.2915F, -2.426F, 0.192F, -0.1047F));

		PartDefinition cube_r363 = jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(32, 8).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1817F, -8.2915F, -2.2689F, 0.192F, -0.1047F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(80, 47).addBox(-0.4875F, -2.3961F, -1.2586F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3375F, 1.6652F, -1.5271F, -1.3614F, 0.1222F, 0.0F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(79, 3).addBox(-0.4875F, 0.6016F, -0.5833F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3375F, 1.6652F, -1.5271F, -1.6232F, 0.1222F, 0.0F));

		PartDefinition cube_r366 = jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(72, 85).addBox(-0.4875F, -0.7031F, 1.0039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3375F, 1.6652F, -1.5271F, -1.3003F, 0.1222F, 0.0F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(41, 2).addBox(-0.4875F, -0.8727F, -1.1408F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3375F, 1.6652F, -1.5271F, 0.0524F, 0.1222F, 0.0F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(62, 82).addBox(-0.4875F, -0.7912F, -1.4138F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3375F, 1.6652F, -1.5271F, -0.7767F, 0.1222F, 0.0F));

		PartDefinition cube_r369 = jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(82, 55).addBox(-0.4875F, -1.9391F, -1.1485F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3375F, 1.6652F, -1.5271F, -0.5149F, 0.1222F, 0.0F));

		PartDefinition cube_r370 = jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(85, 52).addBox(-0.4875F, -0.5982F, 1.0826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3375F, 1.6652F, -1.5271F, -0.7679F, 0.1222F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(29, 46).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(61, 54).addBox(0.0F, -0.7F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2964F, 0.0845F, -0.6093F, -0.1436F, 0.0995F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(5, 66).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(46, 68).addBox(0.0F, -0.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.031F, 2.9564F, -0.2657F, -0.1685F, 0.0456F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(38, 46).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0513F, 2.0655F, -0.1876F, -0.2145F, 0.0404F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(13, 20).addBox(-0.5F, -0.3193F, -0.124F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1095F, 2.7879F, -0.4587F, 0.2358F, -0.1148F));

		return LayerDefinition.create(meshdefinition, 93, 93);
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