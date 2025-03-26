package fossils.fossils.client.blockentity.model.synthetoceras;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SynthetocerasFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg5;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg5;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftHorn;
	private final ModelPart rightHorn;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public SynthetocerasFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg5 = this.leftLeg4.getChild("leftLeg5");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.rightLeg5 = this.rightLeg4.getChild("rightLeg5");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftHorn = this.head.getChild("leftHorn");
		this.rightHorn = this.head.getChild("rightHorn");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(10, 0).addBox(-2.5F, 2.2482F, -0.7279F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -25.0F, 11.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(51, 4).addBox(0.0F, -0.7937F, -0.4061F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -0.8F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 26).addBox(0.0F, -1.6201F, -0.5189F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -2.8F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(29, 0).mirror().addBox(-2.5F, 0.0F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.658F, -1.2034F, -2.5165F, -0.5579F, -0.3796F, -0.5359F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(29, 18).mirror().addBox(-2.5F, -0.5F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6631F, 0.8497F, -0.8722F, -2.3488F, -0.8788F, 1.6405F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(35, 22).mirror().addBox(-1.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0304F, 2.5365F, 0.9809F, -2.0849F, -1.073F, 0.9694F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(66, 69).mirror().addBox(0.0057F, -0.0316F, -0.0898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.9884F, 2.9189F, 2.9228F, -1.6075F, -1.1417F, 0.4385F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-1.5F, -0.5F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.9884F, 4.7189F, 3.3228F, -1.381F, -1.1337F, 0.1892F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(57, 42).mirror().addBox(0.4305F, -0.2406F, -2.0752F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9884F, 4.2189F, 3.5228F, -0.9276F, -1.0244F, -0.322F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(29, 0).addBox(-2.5F, 0.0F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.658F, -1.2034F, -2.5165F, -0.5579F, 0.3796F, 0.5359F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(29, 18).addBox(-2.5F, -0.5F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6631F, 0.8497F, -0.8722F, -2.3488F, 0.8788F, -1.6405F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(35, 22).addBox(-1.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0304F, 2.5365F, 0.9809F, -2.0849F, 1.073F, -0.9694F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(57, 42).addBox(-1.4305F, -0.2406F, -2.0752F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.9884F, 4.2189F, 3.5228F, -0.9276F, 1.0244F, 0.322F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(66, 69).addBox(-1.0057F, -0.0316F, -0.0898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.9884F, 2.9189F, 2.9228F, -1.6075F, 1.1417F, -0.4385F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 70).addBox(0.5F, -0.5F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.9884F, 4.7189F, 3.3228F, -1.381F, 1.1337F, -0.1892F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.4F, 2.6F, 1.1F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r16 = leftLeg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(24, 43).addBox(-1.5F, -5.4F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.3668F, -0.5757F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r17 = leftLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 52).addBox(-1.0F, -0.5026F, -1.0104F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.9959F, 0.58F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r18 = leftLeg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(69, 41).addBox(-1.0F, -4.9F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 11.928F, -1.3838F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r19 = leftLeg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(40, 12).addBox(-1.5F, 0.5897F, -0.0531F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 5.3785F, -1.1766F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r20 = leftLeg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(51, 28).addBox(-1.5F, 0.0185F, -2.2559F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.2785F, 1.1234F, -0.5411F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.6769F, 0.2997F, 1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r21 = leftLeg2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(21, 37).addBox(-1.5F, -0.8F, -1.9F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 1.1517F, 0.8022F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r22 = leftLeg2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(10, 45).addBox(-1.9F, -6.9479F, -0.7979F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.4F, 8.6737F, -0.3446F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r23 = leftLeg2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(47, 45).addBox(-1.9F, -0.356F, 0.0216F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.4F, 2.0737F, -1.0446F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(19, 43).addBox(-0.5F, -0.5443F, -0.6179F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 9.0737F, -0.8446F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r24 = leftLeg3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(62, 9).addBox(-1.0F, -3.0136F, -0.8894F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.5F, 0.8414F, 0.2937F, -0.2618F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(30, 57).addBox(-0.6F, -0.6629F, -1.9144F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 6.3414F, -0.0063F, 0.925F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offset(0.4F, -0.2629F, -4.5144F));

		PartDefinition cube_r25 = leftLeg5.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 62).addBox(8.0001F, 0.2042F, 1.1491F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-9.7F, -0.1103F, 2.0647F, -0.7125F, 0.1238F, -0.2313F));

		PartDefinition cube_r26 = leftLeg5.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(28, 61).addBox(8.0001F, -0.2275F, 1.2852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-9.7F, -0.1103F, 2.0647F, -1.0267F, 0.1238F, -0.2313F));

		PartDefinition cube_r27 = leftLeg5.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(60, 26).addBox(-0.5F, -0.6306F, -0.97F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-0.1F, -0.1103F, 2.0647F, -0.7125F, -0.1238F, 0.2313F));

		PartDefinition cube_r28 = leftLeg5.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(60, 51).addBox(-0.5F, -0.3665F, -0.9882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, -0.1103F, 2.0647F, -1.0267F, -0.1238F, 0.2313F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.4F, 2.6F, 1.1F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r29 = rightLeg.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(42, 30).addBox(-0.5F, -5.4F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.3668F, -0.5757F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r30 = rightLeg.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(15, 51).addBox(0.0F, -0.5026F, -1.0104F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.9959F, 0.58F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r31 = rightLeg.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(42, 17).addBox(0.0F, -4.9F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 11.928F, -1.3838F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r32 = rightLeg.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(8, 40).addBox(-0.5F, 0.5897F, -0.0531F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 5.3785F, -1.1766F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r33 = rightLeg.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(50, 15).addBox(-0.5F, 0.0185F, -2.2559F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 6.2785F, 1.1234F, -0.5411F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.6769F, 0.2997F, 1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r34 = rightLeg2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(33, 32).addBox(-0.5F, -0.8F, -1.9F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 1.1517F, 0.8022F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r35 = rightLeg2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(5, 45).addBox(0.9F, -6.9479F, -0.7979F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4F, 8.6737F, -0.3446F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r36 = rightLeg2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(42, 45).addBox(0.9F, -0.356F, 0.0216F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.4F, 2.0737F, -1.0446F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, -0.5443F, -0.6179F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 9.0737F, -0.8446F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r37 = rightLeg3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(20, 11).addBox(0.0F, -3.0136F, -0.8894F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.5F, 0.8414F, 0.2937F, -0.2618F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(10, 57).addBox(-0.4F, -0.6629F, -1.9144F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 6.3414F, -0.0063F, 0.925F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offset(-0.4F, -0.2629F, -4.5144F));

		PartDefinition cube_r38 = rightLeg5.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(61, 5).addBox(-9.0001F, 0.2042F, 1.1491F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(9.7F, -0.1103F, 2.0647F, -0.7125F, -0.1238F, 0.2313F));

		PartDefinition cube_r39 = rightLeg5.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(10, 61).addBox(-9.0001F, -0.2275F, 1.2852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(9.7F, -0.1103F, 2.0647F, -1.0267F, -0.1238F, 0.2313F));

		PartDefinition cube_r40 = rightLeg5.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(60, 0).addBox(-0.5F, -0.6306F, -0.97F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.1F, -0.1103F, 2.0647F, -0.7125F, 0.1238F, -0.2313F));

		PartDefinition cube_r41 = rightLeg5.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(60, 19).addBox(-0.5F, -0.3665F, -0.9882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, -0.1103F, 2.0647F, -1.0267F, 0.1238F, -0.2313F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.4F, -4.2F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(13, 33).addBox(0.0F, -1.5751F, -0.317F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -0.7F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r43 = body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(47, 70).addBox(0.0F, -1.6577F, -0.218F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -2.7F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r44 = body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(70, 62).mirror().addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0026F, -0.3198F, -2.8726F, 0.076F, -1.8398F));

		PartDefinition cube_r45 = body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(70, 62).mirror().addBox(0.0F, -0.6F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0026F, -2.8198F, -3.0241F, 0.0336F, -1.8481F));

		PartDefinition cube_r46 = body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(70, 62).mirror().addBox(0.0F, -0.5F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0026F, -4.3198F, -3.1416F, 0.0F, -1.7802F));

		PartDefinition cube_r47 = body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(70, 62).addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0026F, -0.3198F, -2.8726F, -0.076F, 1.8398F));

		PartDefinition cube_r48 = body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(70, 62).addBox(0.0F, -0.6F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0026F, -2.8198F, -3.0241F, -0.0336F, 1.8481F));

		PartDefinition cube_r49 = body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(70, 62).addBox(0.0F, -0.5F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0026F, -4.3198F, -3.1416F, 0.0F, 1.7802F));

		PartDefinition cube_r50 = body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(70, 62).addBox(0.0F, -1.8852F, -0.4263F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -4.5F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r51 = body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(11, 3).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -6.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2F, -6.0F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(40, 26).mirror().addBox(-5.0139F, 0.0113F, -0.4366F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7418F, 6.7954F, -0.3828F, -0.4149F, -0.4664F, -2.4149F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(29, 4).mirror().addBox(-5.0221F, 0.0123F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2769F, 7.9919F, -2.6456F, -0.2775F, -0.2756F, -2.7113F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(26, 8).mirror().addBox(-7.0359F, -0.03F, -0.4838F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2787F, 5.3247F, 2.0037F, -0.6072F, -0.5983F, -2.2586F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(57, 39).mirror().addBox(-6.0551F, -2.1982F, -0.4625F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.0842F, -0.3452F, -0.0193F, 0.3904F, -1.4499F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(37, 68).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.0842F, -0.3452F, 0.1713F, 0.3531F, -0.9355F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(63, 33).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.0842F, -0.3452F, 0.258F, 0.297F, -0.6655F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(69, 32).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.7842F, -4.3452F, 0.0394F, 0.2087F, -0.8675F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(40, 38).mirror().addBox(-8.0551F, -2.1982F, -0.4625F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.7842F, -4.3452F, -0.0629F, 0.203F, -1.358F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(64, 44).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.4842F, -2.3452F, 0.1518F, 0.2305F, -0.6409F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(44, 68).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.4842F, -2.3452F, 0.0861F, 0.2617F, -0.9089F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(44, 35).mirror().addBox(-7.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.4842F, -2.3452F, -0.0476F, 0.2712F, -1.4067F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(65, 0).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.7842F, -4.3452F, 0.0926F, 0.1914F, -0.6009F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(65, 15).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.0842F, -6.3452F, 0.0489F, 0.1616F, -0.6086F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(44, 22).mirror().addBox(-3.9989F, 0.0042F, -0.3758F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2769F, 8.3991F, -5.0516F, -0.1421F, -0.0463F, -2.8122F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(41, 5).mirror().addBox(-8.0551F, -2.1982F, -0.4625F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.0842F, -6.3452F, -0.074F, 0.1518F, -1.3599F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(69, 34).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.0842F, -6.3452F, 0.005F, 0.1687F, -0.8739F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(63, 33).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.0842F, -0.3452F, 0.258F, -0.297F, 0.6655F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(37, 68).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.0842F, -0.3452F, 0.1713F, -0.3531F, 0.9355F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(26, 8).addBox(0.0359F, -0.03F, -0.4838F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2787F, 5.3247F, 2.0037F, -0.6072F, 0.5983F, 2.2586F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(57, 39).addBox(3.0551F, -2.1982F, -0.4625F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.0842F, -0.3452F, -0.0193F, -0.3904F, 1.4499F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(64, 44).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.4842F, -2.3452F, 0.1518F, -0.2305F, 0.6409F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(44, 68).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.4842F, -2.3452F, 0.0861F, -0.2617F, 0.9089F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(40, 26).addBox(0.0139F, 0.0113F, -0.4366F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7418F, 6.7954F, -0.3828F, -0.4149F, 0.4664F, 2.4149F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(44, 35).addBox(3.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.4842F, -2.3452F, -0.0476F, -0.2712F, 1.4067F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(65, 0).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.7842F, -4.3452F, 0.0926F, -0.1914F, 0.6009F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(21, 18).addBox(-0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.5946F, -8.2408F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(69, 32).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.7842F, -4.3452F, 0.0394F, -0.2087F, 0.8675F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(29, 4).addBox(0.0221F, 0.0123F, -0.4055F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2769F, 7.9919F, -2.6456F, -0.2775F, 0.2756F, 2.7113F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(40, 38).addBox(3.0551F, -2.1982F, -0.4625F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.7842F, -4.3452F, -0.0629F, -0.203F, 1.358F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(65, 15).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.0842F, -6.3452F, 0.0489F, -0.1616F, 0.6086F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(44, 22).addBox(-0.0011F, 0.0042F, -0.3758F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2769F, 8.3991F, -5.0516F, -0.1421F, 0.0463F, 2.8122F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(41, 5).addBox(3.0551F, -2.1982F, -0.4625F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.0842F, -6.3452F, -0.074F, -0.1518F, 1.3599F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(69, 34).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.0842F, -6.3452F, 0.005F, -0.1687F, 0.8739F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, -0.3F, -6.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.8F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(15, 45).addBox(0.0F, -3.4938F, 4.054F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 70).addBox(0.0F, -2.8938F, 2.054F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 70).addBox(0.0F, -2.8938F, 0.054F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -4.8F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(11, 70).addBox(0.0F, -2.9698F, 0.0459F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -6.9F, -0.1833F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offset(0.0F, 1.1F, -6.8F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(26, 70).addBox(0.0F, -2.9966F, -0.0068F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -2.2F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(29, 70).addBox(0.0F, -3.5668F, 1.4035F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 66).addBox(0.0F, -2.1668F, -0.0965F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6F, -5.6F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(9, 20).mirror().addBox(-1.0649F, -0.492F, -0.1338F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 5.6138F, -5.1221F, 1.1652F, 0.4338F, -0.1376F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(33, 26).mirror().addBox(-0.5F, -0.6346F, -0.1771F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(33, 26).addBox(6.1F, -0.6346F, -0.1771F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-3.3F, 5.6138F, -5.1221F, 1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -0.2435F, -0.2146F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).addBox(6.1F, -0.2435F, -0.2146F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.3F, 5.6138F, -5.1221F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(11, 12).mirror().addBox(-0.5F, -0.542F, 0.7714F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(11, 12).addBox(6.1F, -0.542F, 0.7714F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.3F, 5.6138F, -5.1221F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(22, 30).mirror().addBox(-0.5F, -0.6561F, 2.7199F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(22, 30).addBox(6.1F, -0.6561F, 2.7199F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.3F, 5.6138F, -5.1221F, 1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(9, 20).addBox(0.0649F, -0.492F, -0.1338F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 5.6138F, -5.1221F, 1.1652F, -0.4338F, 0.1376F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(46, 24).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6842F, -1.5452F, 0.078F, 0.1815F, -0.6734F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(67, 53).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6842F, -1.5452F, 0.0279F, 0.1954F, -0.9396F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(40, 28).mirror().addBox(-8.0551F, -2.1982F, -0.4625F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6842F, -1.5452F, -0.0666F, 0.1859F, -1.4285F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(53, 19).mirror().addBox(-3.0478F, 0.0622F, -0.5682F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7935F, 8.1083F, 0.1864F, -0.1079F, -0.0726F, -2.9842F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(53, 26).mirror().addBox(-2.9973F, 0.058F, -0.5687F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8988F, 7.539F, -2.9249F, -0.0959F, 0.0494F, -2.6886F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(57, 14).mirror().addBox(-6.0551F, -2.1982F, -0.4625F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.5842F, -3.5452F, -0.0959F, 0.0494F, -1.5367F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 14).mirror().addBox(-1.8786F, 0.0554F, -0.2992F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5426F, 6.6153F, -6.1286F, 0.1679F, -0.0811F, -2.6579F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(66, 39).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.5842F, -3.5452F, -0.0624F, 0.0881F, -1.0571F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(35, 6).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.5842F, -3.5452F, -0.0374F, 0.1012F, -0.7944F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(65, 26).mirror().addBox(-5.0551F, -2.1982F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.5842F, -5.2452F, -0.1508F, -0.2067F, -1.5847F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(66, 13).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.5842F, -5.2452F, -0.2286F, -0.1144F, -1.1072F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(29, 32).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.5842F, -5.2452F, -0.25F, -0.052F, -0.8521F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(29, 32).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.5842F, -5.2452F, -0.25F, 0.052F, 0.8521F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(66, 13).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.5842F, -5.2452F, -0.2286F, 0.1144F, 1.1072F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 14).addBox(-0.1214F, 0.0554F, -0.2992F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5426F, 6.6153F, -6.1286F, 0.1679F, 0.0811F, 2.6579F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(65, 26).addBox(3.0551F, -2.1982F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.5842F, -5.2452F, -0.1508F, 0.2067F, 1.5847F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(53, 26).addBox(-0.0027F, 0.058F, -0.5687F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8988F, 7.539F, -2.9249F, -0.0959F, -0.0494F, 2.6886F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(57, 14).addBox(3.0551F, -2.1982F, -0.4625F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.5842F, -3.5452F, -0.0959F, -0.0494F, 1.5367F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(66, 39).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.5842F, -3.5452F, -0.0624F, -0.0881F, 1.0571F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(35, 6).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.5842F, -3.5452F, -0.0374F, -0.1012F, 0.7944F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(46, 24).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6842F, -1.5452F, 0.078F, -0.1815F, 0.6734F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(67, 53).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6842F, -1.5452F, 0.0279F, -0.1954F, 0.9396F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(53, 19).addBox(0.0478F, 0.0622F, -0.5682F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7935F, 8.1083F, 0.1864F, -0.1079F, 0.0726F, 2.9842F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(40, 28).addBox(3.0551F, -2.1982F, -0.4625F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6842F, -1.5452F, -0.0666F, -0.1859F, 1.4285F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(30, 10).addBox(-1.5F, -0.8784F, -3.0089F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.7946F, -4.4408F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(20, 11).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.4946F, -1.4408F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5F, -0.989F, -0.0323F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4F, -5.4F, 0.3229F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6F, 6.9651F, -5.6441F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r123 = leftarm.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(10, 11).addBox(0.0F, -1.2F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5119F, -0.1535F, 0.4938F, 0.3053F, 0.0014F, -0.001F));

		PartDefinition cube_r124 = leftarm.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(57, 8).addBox(0.0F, -5.0389F, -0.1208F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 5.2099F, 2.556F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r125 = leftarm.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(35, 15).addBox(0.0F, -0.6F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.5542F, 2.6206F, -0.4014F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 4.5389F, 2.1847F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r126 = leftarm2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(70, 59).addBox(-0.564F, -1.0149F, -0.2424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.364F, 1.2298F, -0.0451F, 1.5708F, -1.3439F, -1.5708F));

		PartDefinition cube_r127 = leftarm2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(5, 58).addBox(-0.2142F, -0.1646F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.6064F, 3.8149F, -0.7091F, 1.5708F, -1.4312F, -1.5708F));

		PartDefinition cube_r128 = leftarm2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(27, 65).addBox(-0.9F, -0.2F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6064F, 1.2149F, 0.1909F, -1.5708F, -1.501F, 1.5708F));

		PartDefinition cube_r129 = leftarm2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(60, 64).addBox(-0.043F, -2.9067F, -0.4596F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.136F, -1.0702F, 1.8549F, 1.5708F, 1.1694F, -1.5708F));

		PartDefinition cube_r130 = leftarm2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(59, 16).addBox(-1.6F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1764F, -1.2136F, 1.4522F, 1.5708F, -0.7679F, -1.5708F));

		PartDefinition cube_r131 = leftarm2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(45, 62).addBox(-0.0214F, -3.8344F, 0.5404F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.864F, 3.4298F, -0.5451F, -1.5708F, -1.4137F, 1.5708F));

		PartDefinition cube_r132 = leftarm2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(50, 62).addBox(-1.0214F, -4.0344F, 0.5404F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.864F, 7.3298F, 0.9549F, 1.5708F, -1.4312F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(20, 52).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 7.3551F, 0.2659F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r133 = leftArm3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(61, 69).addBox(7.0722F, -2.423F, -0.5717F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-8.1233F, 4.8129F, 0.6363F, 0.3332F, -0.0687F, 0.2072F));

		PartDefinition cube_r134 = leftArm3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(69, 55).addBox(-0.75F, -0.8F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6F, 4.8129F, 0.6363F, 0.3332F, 0.0687F, -0.2072F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(66, 3).addBox(-0.5F, -0.0423F, -0.4094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.8F, -0.1F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r135 = leftArm4.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(55, 3).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3233F, 2.0605F, 0.0176F, 1.0547F, 0.1344F, 0.1117F));

		PartDefinition cube_r136 = leftArm4.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(46, 54).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.3233F, 2.0605F, 0.0176F, 0.7057F, 0.1344F, 0.1117F));

		PartDefinition cube_r137 = leftArm4.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(55, 54).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 2.0605F, 0.0176F, 1.0547F, -0.1344F, -0.1117F));

		PartDefinition cube_r138 = leftArm4.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(53, 22).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3F, 2.0605F, 0.0176F, 0.7057F, -0.1344F, -0.1117F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6F, 6.9651F, -5.6441F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r139 = rightarm.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, -1.2F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5119F, -0.1535F, 0.4938F, 0.3053F, -0.0014F, 0.001F));

		PartDefinition cube_r140 = rightarm.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, -5.0389F, -0.1208F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 5.2099F, 2.556F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r141 = rightarm.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(20, 3).addBox(-1.0F, -0.6F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.5542F, 2.6206F, -0.4014F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 4.5389F, 2.1847F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r142 = rightarm2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(70, 50).addBox(-0.436F, -1.0149F, -0.2424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.364F, 1.2298F, -0.0451F, 1.5708F, 1.3439F, 1.5708F));

		PartDefinition cube_r143 = rightarm2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(25, 57).addBox(-0.7858F, -0.1646F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.6064F, 3.8149F, -0.7091F, 1.5708F, 1.4312F, 1.5708F));

		PartDefinition cube_r144 = rightarm2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(11, 65).addBox(-0.1F, -0.2F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6064F, 1.2149F, 0.1909F, -1.5708F, 1.501F, -1.5708F));

		PartDefinition cube_r145 = rightarm2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(55, 64).addBox(-0.957F, -2.9067F, -0.4596F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.136F, -1.0702F, 1.8549F, 1.5708F, -1.1694F, 1.5708F));

		PartDefinition cube_r146 = rightarm2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(9, 27).addBox(-0.4F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1764F, -1.2136F, 1.4522F, 1.5708F, 0.7679F, 1.5708F));

		PartDefinition cube_r147 = rightarm2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(35, 62).addBox(-0.9786F, -3.8344F, 0.5404F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.864F, 3.4298F, -0.5451F, -1.5708F, 1.4137F, -1.5708F));

		PartDefinition cube_r148 = rightarm2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(40, 62).addBox(0.0214F, -4.0344F, 0.5404F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.864F, 7.3298F, 0.9549F, 1.5708F, 1.4312F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 7.3551F, 0.2659F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r149 = rightArm3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(56, 69).addBox(-8.0722F, -2.423F, -0.5717F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(8.1233F, 4.8129F, 0.6363F, 0.3332F, 0.0687F, -0.2072F));

		PartDefinition cube_r150 = rightArm3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(69, 46).addBox(-0.25F, -0.8F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6F, 4.8129F, 0.6363F, 0.3332F, -0.0687F, 0.2072F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(0, 66).addBox(-0.5F, -0.0423F, -0.4094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.8F, -0.1F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r151 = rightArm4.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(53, 35).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3233F, 2.0605F, 0.0176F, 1.0547F, -0.1344F, -0.1117F));

		PartDefinition cube_r152 = rightArm4.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(5, 54).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3233F, 2.0605F, 0.0176F, 0.7057F, -0.1344F, -0.1117F));

		PartDefinition cube_r153 = rightArm4.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(39, 54).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3F, 2.0605F, 0.0176F, 1.0547F, 0.1344F, 0.1117F));

		PartDefinition cube_r154 = rightArm4.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(10, 3).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.3F, 2.0605F, 0.0176F, 0.7057F, 0.1344F, 0.1117F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8F, -5.1F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r155 = neck3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(71, 1).addBox(0.0F, -1.7621F, -1.3333F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7346F, -0.5669F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r156 = neck3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(44, 0).addBox(-0.5F, -0.9F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.9F, -2.8F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offset(0.0F, -1.4F, -2.5F));

		PartDefinition cube_r157 = neck2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(13, 33).addBox(-0.5F, -0.1681F, -0.0721F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2F, -1.9F, -0.9687F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.9F, -2.1F, 0.2182F, -0.3927F, 0.0F));

		PartDefinition cube_r158 = neck.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(65, 64).addBox(-0.5F, -0.3753F, -0.4709F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.7F, -2.0F, 0.8727F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -1.4F, -2.0F));

		PartDefinition cube_r159 = head.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(64, 36).addBox(-1.0F, -1.0278F, 0.0377F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0811F, -4.2344F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r160 = head.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(62, 55).addBox(-1.0F, -0.5982F, -0.0143F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(33, 48).addBox(-1.0F, -0.9982F, -0.0143F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 2.6811F, -4.8344F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r161 = head.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(24, 48).addBox(-1.0F, -0.2F, 2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(13, 27).addBox(-1.0F, -0.5F, -0.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.2811F, -8.7344F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r162 = head.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(67, 28).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.78F, 4.6168F, -9.9451F, 0.277F, -0.036F, 0.1259F));

		PartDefinition cube_r163 = head.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(67, 28).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.78F, 4.6168F, -9.9451F, 0.277F, 0.036F, -0.1259F));

		PartDefinition cube_r164 = head.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(40, 7).mirror().addBox(-1.2F, -0.3F, -2.9F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.22F)).mirror(false)
				.texOffs(40, 7).addBox(-0.8F, -0.3F, -2.9F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.2811F, -8.7344F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r165 = head.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(40, 40).mirror().addBox(-1.2F, -0.368F, -0.2589F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(40, 40).addBox(0.2F, -0.368F, -0.2589F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 4.5811F, -11.0344F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r166 = head.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(29, 37).mirror().addBox(-0.4F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 4.5319F, -10.764F, 0.7113F, -0.269F, -0.2252F));

		PartDefinition cube_r167 = head.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(29, 37).addBox(-0.6F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 4.5319F, -10.764F, 0.7113F, 0.269F, 0.2252F));

		PartDefinition cube_r168 = head.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(51, 58).addBox(-1.5F, 3.025F, -0.0331F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 0.0356F, -13.0246F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r169 = head.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(58, 58).addBox(-1.0F, -4.5939F, -1.2962F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.5F, 2.3356F, -8.8246F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r170 = head.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(9, 20).addBox(-1.0312F, -2.0849F, -0.5081F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -2.6644F, -13.9246F, -0.1757F, -0.061F, -0.5204F));

		PartDefinition cube_r171 = head.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(67, 8).addBox(-1.0312F, -3.5098F, -1.0596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.5F, -2.6644F, -13.9246F, -0.5074F, -0.061F, -0.5204F));

		PartDefinition cube_r172 = head.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(16, 68).addBox(-0.8348F, -3.0495F, -0.8643F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.5F, -2.6644F, -13.9246F, -0.5074F, 0.061F, 0.5204F));

		PartDefinition cube_r173 = head.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(16, 39).addBox(-0.8348F, -1.5861F, -0.4732F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -2.6644F, -13.9246F, -0.1757F, 0.061F, 0.5204F));

		PartDefinition cube_r174 = head.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(65, 49).addBox(-1.0F, -1.8286F, -0.2146F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -1.2644F, -13.7246F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r175 = head.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(21, 68).addBox(-1.0F, -1.8753F, -0.1557F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.5F, 0.2356F, -12.9246F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r176 = head.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(65, 18).addBox(-1.5F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2356F, -9.3246F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r177 = head.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(52, 49).addBox(-1.0F, -4.6595F, -0.721F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 2.3356F, -8.8246F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r178 = head.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(32, 38).addBox(-1.0F, -0.0437F, -2.9907F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.5F, -7.5F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r179 = head.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(0, 26).addBox(-1.0F, -0.0115F, -3.9021F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, -4.2F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r180 = head.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(32, 68).mirror().addBox(-2.5F, -0.0019F, -0.998F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(32, 68).addBox(1.5F, -0.0019F, -0.998F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.3F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r181 = head.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(58, 33).mirror().addBox(-2.5F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(58, 33).addBox(1.5F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.2871F, -1.218F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r182 = head.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(44, 17).mirror().addBox(-0.1707F, -0.8971F, -0.5485F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.1728F, -4.8721F, 0.4775F, -0.4357F, -0.4166F));

		PartDefinition cube_r183 = head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(0.0F, -0.0437F, -2.9566F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -0.8272F, -3.8721F, 0.8091F, -0.4357F, -0.4166F));

		PartDefinition cube_r184 = head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(0, 38).addBox(-2.0F, -0.0437F, -2.9566F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -0.8272F, -3.8721F, 0.8091F, 0.4357F, 0.4166F));

		PartDefinition cube_r185 = head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(44, 17).addBox(-0.8293F, -0.8971F, -0.5485F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 1.1728F, -4.8721F, 0.4775F, 0.4357F, 0.4166F));

		PartDefinition cube_r186 = head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(42, 70).addBox(-0.6F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(42, 70).addBox(-0.6F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.02F, 3.4943F, -9.7279F, 0.0F, 1.4312F, -1.5708F));

		PartDefinition cube_r187 = head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(42, 70).addBox(-0.8F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(42, 70).addBox(-0.8F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.02F, 2.0511F, -8.3112F, 0.0F, 0.6458F, -1.5708F));

		PartDefinition cube_r188 = head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(42, 70).mirror().addBox(-0.4F, -0.3F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false)
				.texOffs(42, 70).addBox(3.44F, -0.3F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-2.02F, -0.5689F, -3.1112F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r189 = head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(22, 25).addBox(-2.5F, -0.0454F, -1.9657F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(49, 40).addBox(-1.5F, -0.0454F, -2.9657F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1F, -2.5F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r190 = head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(17, 59).addBox(-1.0F, 0.0079F, -1.0229F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4F, 0.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r191 = head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(63, 61).addBox(-1.0F, -0.0156F, -0.0147F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, -0.9F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r192 = head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(0, 33).addBox(-2.0F, -0.9F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -1.3F, 0.2269F, 0.0F, 0.0F));

		PartDefinition leftHorn = head.addOrReplaceChild("leftHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, -1.8514F, -2.4533F, -0.0349F, -0.1047F, 0.0F));

		PartDefinition cube_r193 = leftHorn.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(18, 20).addBox(-0.3438F, -0.6944F, -0.3848F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.7F, -4.0F, 0.0F, 0.0043F, -0.0258F, -1.7367F));

		PartDefinition cube_r194 = leftHorn.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(51, 32).addBox(-0.4971F, -0.5765F, -0.4529F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2F, -1.4F, 0.0F, -0.0048F, -0.0257F, -1.3875F));

		PartDefinition cube_r195 = leftHorn.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(63, 58).addBox(-0.1F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.4F, 0.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r196 = leftHorn.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(50, 0).addBox(-0.1F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8F, 0.4F, 0.0F, -0.0216F, -0.0148F, -0.602F));

		PartDefinition rightHorn = head.addOrReplaceChild("rightHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, -1.8514F, -2.4533F, -0.0349F, 0.1047F, 0.0F));

		PartDefinition cube_r197 = rightHorn.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(18, 20).mirror().addBox(-1.6562F, -0.6944F, -0.3848F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.7F, -4.0F, 0.0F, 0.0043F, 0.0258F, 1.7367F));

		PartDefinition cube_r198 = rightHorn.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(51, 32).mirror().addBox(-2.5029F, -0.5765F, -0.4529F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2F, -1.4F, 0.0F, -0.0048F, 0.0257F, 1.3875F));

		PartDefinition cube_r199 = rightHorn.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(63, 58).mirror().addBox(-1.9F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.4F, 0.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r200 = rightHorn.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(50, 0).mirror().addBox(-2.9F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 0.4F, 0.0F, -0.0216F, 0.0148F, 0.602F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -1.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r201 = jaw.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(71, 5).mirror().addBox(-1.0F, -1.8746F, -0.0219F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(71, 5).addBox(0.8F, -1.8746F, -0.0219F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 3.4636F, -3.4558F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r202 = jaw.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(51, 68).mirror().addBox(-1.0F, 0.0554F, 0.0387F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(51, 68).addBox(1.0F, 0.0554F, 0.0387F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.527F, -1.6584F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r203 = jaw.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(6, 65).mirror().addBox(-1.0F, -0.0756F, -0.9613F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(6, 65).addBox(1.0F, -0.0756F, -0.9613F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 3.9907F, 0.2569F, -1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r204 = jaw.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(37, 70).mirror().addBox(-1.0F, -0.9795F, -0.9888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(37, 70).addBox(2.2F, -0.9795F, -0.9888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.1F, 3.9907F, 0.3569F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r205 = jaw.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(52, 44).mirror().addBox(-1.0F, -0.9F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(52, 44).addBox(2.2F, -0.9F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.1F, 2.527F, -0.6584F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r206 = jaw.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(67, 21).mirror().addBox(-1.0F, -1.995F, -1.0923F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(67, 21).addBox(2.2F, -1.995F, -1.0923F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 3.2907F, 1.0569F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r207 = jaw.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(22, 63).mirror().addBox(-1.0F, -0.5F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(22, 63).addBox(2.2F, -0.5F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.1F, 0.0F, 0.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r208 = jaw.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(17, 63).mirror().addBox(-1.0F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(17, 63).addBox(2.2F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.1F, 0.5F, -0.4F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r209 = jaw.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(25, 52).addBox(-1.0F, -0.0322F, -0.9801F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 4.927F, -2.5584F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r210 = jaw.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(60, 23).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 5.7244F, -8.4733F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r211 = jaw.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(60, 30).addBox(-1.0F, 0.4258F, 0.0007F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(62, 41).addBox(-1.0F, 0.0258F, 0.0007F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.227F, -7.4584F, -1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r212 = jaw.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(44, 58).addBox(-1.0F, -0.6143F, -0.0206F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 4.827F, -6.1584F, -1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r213 = jaw.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(62, 46).addBox(-1.0F, 0.0151F, -0.0017F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 4.327F, -5.2584F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r214 = jaw.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(37, 58).addBox(-0.9F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1F, 4.2636F, -4.2558F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r215 = jaw.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(32, 52).addBox(-1.0F, -0.827F, -0.0623F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.827F, -3.1584F, -1.309F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(33, 43).addBox(-0.5F, -0.1497F, -0.0853F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 1.7F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(48, 9).addBox(-0.5F, -0.1402F, -0.0232F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.0497F, 2.8147F, -0.5411F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(57, 47).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.6109F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 75, 75);
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