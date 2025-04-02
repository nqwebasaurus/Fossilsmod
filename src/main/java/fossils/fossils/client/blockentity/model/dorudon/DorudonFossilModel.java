package fossils.fossils.client.blockentity.model.dorudon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DorudonFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart chest;
	private final ModelPart body6;
	private final ModelPart body;
	private final ModelPart body5;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart body2;
	private final ModelPart hips;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;

	public DorudonFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.chest = this.fossil.getChild("chest");
		this.body6 = this.chest.getChild("body6");
		this.body = this.body6.getChild("body");
		this.body5 = this.body.getChild("body5");
		this.body4 = this.body5.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.body2 = this.body3.getChild("body2");
		this.hips = this.body2.getChild("hips");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest = fossil.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -16.1819F, -17.8833F, -0.1807F, 0.0653F, 0.3431F));

		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(71, 24).addBox(0.0F, -1.8226F, -0.0168F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2146F, -2.0706F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(74, 65).addBox(0.0F, -1.2226F, -1.9168F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 72).addBox(0.0F, -1.9226F, 0.0832F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9854F, -3.8706F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(58, 32).mirror().addBox(-0.652F, 0.3921F, 0.8278F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9096F, 2.865F, -0.6856F, 0.6082F, -0.1502F, 0.562F));

		PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(50, 53).mirror().addBox(-0.652F, -1.2324F, 0.6923F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.9096F, 2.865F, -0.6856F, 0.7479F, -0.1502F, 0.562F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-0.652F, -1.3155F, -0.1273F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9096F, 2.865F, -0.6856F, 1.4285F, -0.1502F, 0.562F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(57, 63).mirror().addBox(-0.652F, -3.0954F, 0.1449F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.9096F, 2.865F, -0.6856F, -1.3815F, -0.1502F, 0.562F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(51, 10).mirror().addBox(-0.652F, -0.9052F, -0.5772F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-3.9096F, 2.865F, -0.6856F, -0.8055F, -0.1502F, 0.562F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(55, 68).mirror().addBox(-0.652F, 1.347F, -1.9771F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(50, 68).mirror().addBox(-0.652F, 1.347F, -2.3771F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.9096F, 2.865F, -0.6856F, 0.2243F, -0.1502F, 0.562F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(62, 26).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0648F, -3.035F, -0.2164F, 0.4844F, -0.6926F));

		PartDefinition cube_r10 = chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(62, 24).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0648F, -3.035F, -0.3383F, 0.4122F, -0.9721F));

		PartDefinition cube_r11 = chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(67, 67).mirror().addBox(-7.1255F, -3.0192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0648F, -3.035F, -0.4676F, 0.2526F, -1.3626F));

		PartDefinition cube_r12 = chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(58, 10).mirror().addBox(-8.1255F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5648F, -1.335F, -0.4529F, 0.2672F, -1.3075F));

		PartDefinition cube_r13 = chest.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(7, 58).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5648F, -1.335F, -0.3178F, 0.4201F, -0.9125F));

		PartDefinition cube_r14 = chest.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(53, 16).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5648F, -1.335F, -0.1936F, 0.4869F, -0.6306F));

		PartDefinition cube_r15 = chest.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(-0.652F, -2.2202F, -0.8882F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.9096F, 2.865F, -0.6856F, 1.7776F, -0.1502F, 0.562F));

		PartDefinition cube_r16 = chest.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(41, 43).mirror().addBox(-0.7653F, -1.2507F, -2.5281F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9096F, 2.865F, -0.6856F, 1.2342F, 0.2574F, 0.3608F));

		PartDefinition cube_r17 = chest.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(44, 58).mirror().addBox(-0.652F, -1.3488F, -3.3267F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.9096F, 2.865F, -0.6856F, 1.1144F, -0.1502F, 0.562F));

		PartDefinition cube_r18 = chest.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(21, 9).mirror().addBox(-6.81F, 0.1277F, -0.2759F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2938F, 9.6753F, 2.5386F, 0.3078F, 0.2102F, 0.3964F));

		PartDefinition cube_r19 = chest.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(38, 16).mirror().addBox(-5.7411F, 0.0765F, -0.7534F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5479F, 9.1573F, 0.3913F, -0.3148F, 0.3781F, 0.3678F));

		PartDefinition cube_r20 = chest.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(38, 18).mirror().addBox(-4.6407F, 0.1077F, -0.4728F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9461F, 7.9035F, -1.9243F, -0.6146F, 0.4343F, 0.253F));

		PartDefinition cube_r21 = chest.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(62, 26).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0648F, -3.035F, -0.2164F, -0.4844F, 0.6926F));

		PartDefinition cube_r22 = chest.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(62, 24).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0648F, -3.035F, -0.3383F, -0.4122F, 0.9721F));

		PartDefinition cube_r23 = chest.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(67, 67).addBox(5.1255F, -3.0192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0648F, -3.035F, -0.4676F, -0.2526F, 1.3626F));

		PartDefinition cube_r24 = chest.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(58, 10).addBox(5.1255F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5648F, -1.335F, -0.4529F, -0.2672F, 1.3075F));

		PartDefinition cube_r25 = chest.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(7, 58).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5648F, -1.335F, -0.3178F, -0.4201F, 0.9125F));

		PartDefinition cube_r26 = chest.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(53, 16).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5648F, -1.335F, -0.1936F, -0.4869F, 0.6306F));

		PartDefinition cube_r27 = chest.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(57, 63).addBox(-0.348F, -3.0954F, 0.1449F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.9096F, 2.865F, -0.6856F, -1.3815F, 0.1502F, -0.562F));

		PartDefinition cube_r28 = chest.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(51, 10).addBox(-0.348F, -0.9052F, -0.5772F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.9096F, 2.865F, -0.6856F, -0.8055F, 0.1502F, -0.562F));

		PartDefinition cube_r29 = chest.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(55, 68).addBox(-0.348F, 1.347F, -1.9771F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 68).addBox(-0.348F, 1.347F, -2.3771F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.9096F, 2.865F, -0.6856F, 0.2243F, 0.1502F, -0.562F));

		PartDefinition cube_r30 = chest.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(58, 32).addBox(-0.348F, 0.3921F, 0.8278F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9096F, 2.865F, -0.6856F, 0.6082F, 0.1502F, -0.562F));

		PartDefinition cube_r31 = chest.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(50, 53).addBox(-0.348F, -1.2324F, 0.6923F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.9096F, 2.865F, -0.6856F, 0.7479F, 0.1502F, -0.562F));

		PartDefinition cube_r32 = chest.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 46).addBox(-0.348F, -1.3155F, -0.1273F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9096F, 2.865F, -0.6856F, 1.4285F, 0.1502F, -0.562F));

		PartDefinition cube_r33 = chest.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 39).addBox(-0.348F, -2.2202F, -0.8882F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.9096F, 2.865F, -0.6856F, 1.7776F, 0.1502F, -0.562F));

		PartDefinition cube_r34 = chest.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(41, 43).addBox(-0.2347F, -1.2507F, -2.5281F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9096F, 2.865F, -0.6856F, 1.2342F, -0.2574F, -0.3608F));

		PartDefinition cube_r35 = chest.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(44, 58).addBox(-0.348F, -1.3488F, -3.3267F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.9096F, 2.865F, -0.6856F, 1.1144F, 0.1502F, -0.562F));

		PartDefinition cube_r36 = chest.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(40, 48).addBox(-1.0F, -0.8339F, -0.0052F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 9.9065F, 1.5041F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r37 = chest.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(21, 9).addBox(0.81F, 0.1277F, -0.2759F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2938F, 9.6753F, 2.5386F, 0.3078F, -0.2102F, -0.3964F));

		PartDefinition cube_r38 = chest.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(38, 16).addBox(-0.2589F, 0.0765F, -0.7534F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5479F, 9.1573F, 0.3913F, -0.3148F, -0.3781F, -0.3678F));

		PartDefinition cube_r39 = chest.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(38, 18).addBox(-0.3593F, 0.1077F, -0.4728F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9461F, 7.9035F, -1.9243F, -0.6146F, -0.4343F, -0.253F));

		PartDefinition cube_r40 = chest.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(49, 33).addBox(-1.0F, -1.0035F, -3.0435F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 10.0823F, 1.5202F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r41 = chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(15, 38).addBox(-1.0F, -1.0215F, -4.0704F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 9.0823F, -1.2798F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r42 = chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(17, 29).addBox(-1.0F, -1.908F, 4.84F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.4854F, -9.7706F, 0.3403F, 0.0F, 0.0F));

		PartDefinition body6 = chest.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(21, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0624F, -0.0171F, 0.2095F, -0.0517F, 0.0336F));

		PartDefinition cube_r43 = body6.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(18, 52).mirror().addBox(-9.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0206F, 0.4356F, -0.5071F, 0.0646F, -1.3165F));

		PartDefinition cube_r44 = body6.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(62, 18).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0206F, 0.4356F, -0.4495F, 0.2515F, -0.9561F));

		PartDefinition cube_r45 = body6.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(62, 16).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0206F, 0.4356F, -0.3738F, 0.3568F, -0.7047F));

		PartDefinition cube_r46 = body6.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(51, 26).mirror().addBox(-9.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0206F, 2.4356F, -0.5027F, 0.0815F, -1.3162F));

		PartDefinition cube_r47 = body6.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(60, 61).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0206F, 2.4356F, -0.4391F, 0.2657F, -0.9534F));

		PartDefinition cube_r48 = body6.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(51, 61).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0206F, 2.4356F, -0.3595F, 0.3681F, -0.6996F));

		PartDefinition cube_r49 = body6.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(51, 24).mirror().addBox(-9.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0206F, 4.4356F, -0.4805F, 0.166F, -1.3134F));

		PartDefinition cube_r50 = body6.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(21, 61).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0206F, 4.4356F, -0.3856F, 0.3365F, -0.9376F));

		PartDefinition cube_r51 = body6.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(35, 60).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0206F, 4.4356F, -0.2863F, 0.4233F, -0.6714F));

		PartDefinition cube_r52 = body6.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(62, 16).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0206F, 0.4356F, -0.3738F, -0.3568F, 0.7047F));

		PartDefinition cube_r53 = body6.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(62, 18).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0206F, 0.4356F, -0.4495F, -0.2515F, 0.9561F));

		PartDefinition cube_r54 = body6.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(18, 52).addBox(5.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0206F, 0.4356F, -0.5071F, -0.0646F, 1.3165F));

		PartDefinition cube_r55 = body6.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(51, 61).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0206F, 2.4356F, -0.3595F, -0.3681F, 0.6996F));

		PartDefinition cube_r56 = body6.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(60, 61).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0206F, 2.4356F, -0.4391F, -0.2657F, 0.9534F));

		PartDefinition cube_r57 = body6.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(51, 26).addBox(5.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0206F, 2.4356F, -0.5027F, -0.0815F, 1.3162F));

		PartDefinition cube_r58 = body6.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(51, 24).addBox(5.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0206F, 4.4356F, -0.4805F, -0.166F, 1.3134F));

		PartDefinition cube_r59 = body6.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(21, 61).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0206F, 4.4356F, -0.3856F, -0.3365F, 0.9376F));

		PartDefinition cube_r60 = body6.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(35, 60).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0206F, 4.4356F, -0.2863F, -0.4233F, 0.6714F));

		PartDefinition cube_r61 = body6.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(72, 28).addBox(0.0F, -0.7471F, -3.7739F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 71).addBox(0.0F, -1.3817F, -1.8772F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 71).addBox(0.0F, -2.0163F, 0.0194F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.696F, 3.943F, -0.3316F, 0.0F, 0.0F));

		PartDefinition body = body6.addOrReplaceChild("body", CubeListBuilder.create().texOffs(11, 39).addBox(0.0F, -2.5898F, 3.9717F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3905F, 5.8543F, -0.1531F, -0.0728F, 0.0994F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(58, 36).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3206F, 6.4356F, -0.0848F, 0.5639F, -0.7683F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(35, 58).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3206F, 6.4356F, -0.2416F, 0.521F, -1.0702F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(69, 8).mirror().addBox(-6.1255F, -3.0192F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3206F, 6.4356F, -0.4293F, 0.3867F, -1.4923F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(60, 8).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2206F, 4.3356F, -0.1284F, 0.5271F, -0.6862F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(59, 46).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2206F, 4.3356F, -0.2698F, 0.4749F, -0.979F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(67, 10).mirror().addBox(-7.1255F, -3.0192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2206F, 4.3356F, -0.4336F, 0.3345F, -1.3891F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(58, 30).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0794F, 2.4356F, -0.2709F, 0.4757F, -0.9271F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(58, 28).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0794F, 2.4356F, -0.1292F, 0.5281F, -0.6342F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(16, 58).mirror().addBox(-8.1255F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0794F, 2.4356F, -0.4349F, 0.3348F, -1.3371F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(51, 18).mirror().addBox(-9.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2794F, 0.4356F, -0.4385F, 0.3177F, -1.3034F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(59, 44).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2794F, 0.4356F, -0.2821F, 0.4613F, -0.8972F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(59, 42).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2794F, 0.4356F, -0.1449F, 0.5172F, -0.6072F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(58, 36).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3206F, 6.4356F, -0.0848F, -0.5639F, 0.7683F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(35, 58).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3206F, 6.4356F, -0.2416F, -0.521F, 1.0702F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(69, 8).addBox(5.1255F, -3.0192F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3206F, 6.4356F, -0.4293F, -0.3867F, 1.4923F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(60, 8).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2206F, 4.3356F, -0.1284F, -0.5271F, 0.6862F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(59, 46).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2206F, 4.3356F, -0.2698F, -0.4749F, 0.979F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(67, 10).addBox(5.1255F, -3.0192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2206F, 4.3356F, -0.4336F, -0.3345F, 1.3891F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(58, 30).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0794F, 2.4356F, -0.2709F, -0.4757F, 0.9271F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(58, 28).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0794F, 2.4356F, -0.1292F, -0.5281F, 0.6342F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(16, 58).addBox(5.1255F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0794F, 2.4356F, -0.4349F, -0.3348F, 1.3371F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(51, 18).addBox(5.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2794F, 0.4356F, -0.4385F, -0.3177F, 1.3034F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(59, 44).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2794F, 0.4356F, -0.2821F, -0.4613F, 0.8972F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(59, 42).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2794F, 0.4356F, -0.1449F, -0.5172F, 0.6072F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(48, 71).addBox(0.0F, -1.5522F, 0.0128F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8296F, 1.9014F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(71, 38).addBox(0.0F, -1.6594F, 0.0188F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.196F, 5.943F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(39, 71).addBox(0.0F, -1.9522F, 0.0128F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.296F, -0.257F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, -1.0F, -8.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.5F, 8.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body5 = body.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(19, 20).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(13, 72).addBox(0.0F, -2.4F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 71).addBox(0.0F, -2.4F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4017F, 6.9651F, 0.1923F, -0.2183F, 0.0678F));

		PartDefinition cube_r90 = body5.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(57, 71).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r91 = body5.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(50, 66).mirror().addBox(-1.5F, -0.2F, -0.9F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7314F, 0.4217F, 5.9F, 0.0F, -0.192F, -0.8465F));

		PartDefinition cube_r92 = body5.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(72, 21).mirror().addBox(-1.1F, -0.2F, -0.3F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7314F, 0.4217F, 3.3F, 0.0F, 0.0F, -0.8465F));

		PartDefinition cube_r93 = body5.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(72, 19).mirror().addBox(-1.1F, 0.3F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5672F));

		PartDefinition cube_r94 = body5.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(50, 66).addBox(-0.5F, -0.2F, -0.9F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7314F, 0.4217F, 5.9F, 0.0F, 0.192F, 0.8465F));

		PartDefinition cube_r95 = body5.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(72, 21).addBox(0.1F, -0.2F, -0.3F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7314F, 0.4217F, 3.3F, 0.0F, 0.0F, 0.8465F));

		PartDefinition cube_r96 = body5.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(72, 19).addBox(0.1F, 0.3F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5672F));

		PartDefinition body4 = body5.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(36, 20).addBox(-1.0F, -1.0F, 0.1F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(60, 71).addBox(0.0F, -2.3F, 1.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0759F, 5.7934F, 0.1638F, -0.1729F, 0.0303F));

		PartDefinition cube_r97 = body4.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(0, 72).addBox(0.0F, -1.4F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 4.1F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r98 = body4.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(67, 36).mirror().addBox(-1.8F, -0.2F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7921F, 0.4904F, 3.6054F, 0.0F, -0.0349F, -0.8465F));

		PartDefinition cube_r99 = body4.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(67, 6).mirror().addBox(-1.6F, -0.2F, -0.2F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.818F, 0.5197F, 1.297F, 0.0F, -0.0698F, -0.8465F));

		PartDefinition cube_r100 = body4.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(67, 36).addBox(-0.2F, -0.2F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7921F, 0.4904F, 3.6054F, 0.0F, 0.0349F, 0.8465F));

		PartDefinition cube_r101 = body4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(67, 6).addBox(-0.4F, -0.2F, -0.2F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.818F, 0.5197F, 1.297F, 0.0F, 0.0698F, 0.8465F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, -1.1F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(30, 72).addBox(0.0F, -2.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 0).addBox(0.0F, -2.5F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 72).addBox(0.0F, -2.5F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.105F, 4.9524F, 0.1935F, -0.1338F, 0.062F));

		PartDefinition cube_r102 = body3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(5, 68).mirror().addBox(-1.6F, 0.0F, -0.8F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.988F, 0.3109F, 4.8123F, 0.0F, -0.1396F, -0.8465F));

		PartDefinition cube_r103 = body3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(68, 44).mirror().addBox(-1.8F, 0.0F, -0.9F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0414F, 0.3712F, 2.9167F, 0.0F, -0.192F, -0.8465F));

		PartDefinition cube_r104 = body3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(67, 63).mirror().addBox(-1.8F, -0.2F, -0.9F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8453F, 0.4515F, 0.9179F, 0.0F, -0.1571F, -0.8465F));

		PartDefinition cube_r105 = body3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(5, 68).addBox(-0.4F, 0.0F, -0.8F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.988F, 0.3109F, 4.8123F, 0.0F, 0.1396F, 0.8465F));

		PartDefinition cube_r106 = body3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(68, 44).addBox(-0.2F, 0.0F, -0.9F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0414F, 0.3712F, 2.9167F, 0.0F, 0.192F, 0.8465F));

		PartDefinition cube_r107 = body3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(67, 63).addBox(-0.2F, -0.2F, -0.9F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8453F, 0.4515F, 0.9179F, 0.0F, 0.1571F, 0.8465F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1393F, 5.9321F, 0.2597F, -0.2029F, 0.0797F));

		PartDefinition cube_r108 = body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(33, 72).addBox(0.0F, -1.3F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2179F, 4.9748F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r109 = body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(71, 15).addBox(0.0F, 0.1F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3966F, -1.1386F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(54, 71).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7361F, 0.0667F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r111 = body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(67, 65).mirror().addBox(-1.4545F, 0.2611F, -1.0574F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9678F, 0.9436F, 2.6623F, 0.0F, -0.2967F, -0.8465F));

		PartDefinition cube_r112 = body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(27, 67).mirror().addBox(-1.1434F, 0.1079F, -0.5882F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9523F, 1.5279F, 4.182F, 0.0F, -0.2094F, -0.8465F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(68, 42).mirror().addBox(-1.9F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6108F, 0.5401F, 0.797F, 0.0F, -0.2793F, -0.8465F));

		PartDefinition cube_r114 = body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(67, 65).addBox(-0.5455F, 0.2611F, -1.0574F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9678F, 0.9436F, 2.6623F, 0.0F, 0.2967F, 0.8465F));

		PartDefinition cube_r115 = body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(27, 67).addBox(-0.8566F, 0.1079F, -0.5882F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9523F, 1.5279F, 4.182F, 0.0F, 0.2094F, 0.8465F));

		PartDefinition cube_r116 = body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(68, 42).addBox(-0.1F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6108F, 0.5401F, 0.797F, 0.0F, 0.2793F, 0.8465F));

		PartDefinition cube_r117 = body2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(38, 0).addBox(-0.5F, -0.1512F, 8.7474F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5656F, -8.4997F, -0.2094F, 0.0F, 0.0F));

		PartDefinition hips = body2.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3634F, 4.9213F, 0.1344F, -0.3693F, 0.0445F));

		PartDefinition cube_r118 = hips.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(21, 73).mirror().addBox(-0.5306F, 2.0103F, 4.559F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(3, 73).mirror().addBox(-0.4938F, 1.3822F, 2.769F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(68, 72).mirror().addBox(-0.4938F, 0.9822F, 0.769F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3523F, 0.2279F, -0.118F, 0.0F, -0.2094F, -0.8465F));

		PartDefinition cube_r119 = hips.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(50, 63).mirror().addBox(-1.0F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1171F, 3.8414F, 2.154F, -0.2722F, 0.4916F, -0.0393F));

		PartDefinition cube_r120 = hips.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(21, 73).addBox(-0.4694F, 2.0103F, 4.559F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 73).addBox(-0.5062F, 1.3822F, 2.769F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 72).addBox(-0.5062F, 0.9822F, 0.769F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3523F, 0.2279F, -0.118F, 0.0F, 0.2094F, 0.8465F));

		PartDefinition cube_r121 = hips.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(50, 63).addBox(-1.0F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1171F, 3.8414F, 2.154F, -0.2722F, -0.4916F, 0.0393F));

		PartDefinition cube_r122 = hips.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(73, 71).addBox(0.0F, -0.7986F, -0.9611F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4831F, 5.8155F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r123 = hips.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(74, 23).addBox(0.0F, -0.9986F, -0.9611F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.622F, 4.0103F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r124 = hips.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(25, 58).addBox(0.0F, -1.0986F, 1.0389F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 55).addBox(-0.5F, 3.3014F, 2.8389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(34, 29).addBox(-0.5F, -0.0986F, 0.0389F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.4F, -0.4451F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(38, 8).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(74, 4).addBox(0.0F, -0.7F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4536F, 5.5845F, -0.6398F, -0.176F, 0.1296F));

		PartDefinition cube_r125 = tail.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(16, 73).mirror().addBox(0.1045F, 0.9245F, 1.3841F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(73, 69).mirror().addBox(-0.1018F, 0.0975F, -0.3518F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7634F, 1.1092F, 1.2829F, 0.4435F, -0.0363F, -0.7627F));

		PartDefinition cube_r126 = tail.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(16, 73).addBox(-1.1045F, 0.9245F, 1.3841F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 69).addBox(-0.8982F, 0.0975F, -0.3518F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7634F, 1.1092F, 1.2829F, 0.4435F, 0.0363F, 0.7627F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0398F, 4.9211F, -0.3613F, -0.2134F, 0.1066F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0921F, 6.2F, -0.4426F, -0.3027F, 0.0411F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6879F, 4.3376F, 2.2271F, 0.3023F, -0.2186F, -0.3126F));

		PartDefinition cube_r127 = leftLeg.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(64, 56).addBox(-0.5F, -1.5F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.2846F, -0.2023F, -0.3316F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5009F, -0.2945F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r128 = leftLeg2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(65, 32).addBox(-0.5F, -0.8F, -1.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1566F, 1.4322F, -0.3554F, 1.8441F, 0.5325F, -1.4981F));

		PartDefinition cube_r129 = leftLeg3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(72, 58).addBox(0.0F, -2.9857F, -1.4115F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4414F, 0.7937F, -0.2269F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6879F, 4.3376F, 2.2271F, -0.3522F, 0.2186F, 0.3126F));

		PartDefinition cube_r130 = rightLeg.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(64, 56).mirror().addBox(-0.5F, -1.5F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2846F, -0.2023F, -0.3316F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5009F, -0.2945F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r131 = rightLeg2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(65, 32).mirror().addBox(-0.5F, -0.8F, -1.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1566F, 1.4322F, -0.3554F, 1.8441F, -0.5325F, 1.4981F));

		PartDefinition cube_r132 = rightLeg3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(72, 58).mirror().addBox(0.0F, -2.9857F, -1.4115F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4414F, 0.7937F, -0.2269F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.1F, 5.6739F, -0.9915F, -0.4799F, 0.0756F, -1.0455F));

		PartDefinition cube_r133 = leftarm.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(60, 0).addBox(0.0F, -0.2F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5119F, -0.2961F, -0.0244F, 0.3228F, 0.0014F, -0.001F));

		PartDefinition cube_r134 = leftarm.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(17, 66).addBox(-0.011F, 0.0254F, 0.0689F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5013F, 1.0619F, -1.2637F, 0.794F, 0.0014F, -0.001F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 2.0968F, 0.7683F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r135 = leftarm2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(40, 62).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1764F, 1.1732F, 0.8099F, 1.5708F, -1.4661F, -1.5708F));

		PartDefinition cube_r136 = leftarm2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(51, 58).addBox(-0.7F, 0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.1764F, -0.617F, 1.4424F, -1.5708F, -0.8639F, 1.5708F));

		PartDefinition cube_r137 = leftarm2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(62, 63).addBox(-0.3335F, -0.5622F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3236F, 0.4954F, -0.4664F, 1.5708F, -1.4486F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 2.775F, 0.4115F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r138 = leftArm3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(33, 44).addBox(0.0F, -2.0F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.4F, 0.0F, 3.1416F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1F, 5.6739F, -0.9915F, 0.2223F, -0.8136F, 1.1313F));

		PartDefinition cube_r139 = rightarm.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(-1.0F, -0.2F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5119F, -0.2961F, -0.0244F, 0.3228F, -0.0014F, 0.001F));

		PartDefinition cube_r140 = rightarm.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(17, 66).mirror().addBox(-0.989F, 0.0254F, 0.0689F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.5013F, 1.0619F, -1.2637F, 0.794F, -0.0014F, 0.001F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 2.0968F, 0.7683F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r141 = rightarm2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(40, 62).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1764F, 1.1732F, 0.8099F, 1.5708F, 1.4661F, 1.5708F));

		PartDefinition cube_r142 = rightarm2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(51, 58).mirror().addBox(-0.3F, 0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)).mirror(false), PartPose.offsetAndRotation(0.1764F, -0.617F, 1.4424F, -1.5708F, 0.8639F, -1.5708F));

		PartDefinition cube_r143 = rightarm2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(62, 63).mirror().addBox(-0.6665F, -0.5622F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3236F, 0.4954F, -0.4664F, 1.5708F, 1.4486F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 2.775F, 0.4115F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r144 = rightArm3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(33, 44).mirror().addBox(0.0F, -2.0F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0F, 0.4F, 0.0F, -3.1416F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.658F, -5.1829F, 0.6981F, 0.3341F, 0.103F));

		PartDefinition cube_r145 = neck2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(65, 69).mirror().addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.9581F, -3.1889F, -1.1039F, -0.3035F, -0.7363F));

		PartDefinition cube_r146 = neck2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(69, 58).mirror().addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.9581F, -3.1889F, -0.3431F, -0.2751F, -0.6502F));

		PartDefinition cube_r147 = neck2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(65, 69).addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.9581F, -3.1889F, -1.1039F, 0.3035F, 0.7363F));

		PartDefinition cube_r148 = neck2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(69, 58).addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.9581F, -3.1889F, -0.3431F, 0.2751F, 0.6502F));

		PartDefinition cube_r149 = neck2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(74, 15).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9581F, -3.1889F, 0.0F, 0.4363F, 1.5708F));

		PartDefinition cube_r150 = neck2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(27, 72).addBox(0.0F, -2.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8159F, -2.0206F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r151 = neck2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(36, 53).addBox(-0.5F, -0.2F, 3.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.2131F, -5.7998F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2519F, -2.0121F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r152 = neck.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(67, 4).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0574F, -0.9501F, -0.2358F, 0.615F, -0.1378F));

		PartDefinition cube_r153 = neck.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(67, 4).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0574F, -0.9501F, -0.2358F, -0.615F, 0.1378F));

		PartDefinition cube_r154 = neck.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(65, 48).addBox(-0.5F, -1.1F, 3.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.5695F, -4.6993F, -0.192F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.288F, -2.2394F, -0.6768F, 0.2058F, 0.1137F));

		PartDefinition cube_r155 = head.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(52, 43).addBox(-0.9F, -0.1435F, -3.6195F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, 1.1961F, -4.0221F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r156 = head.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(51, 0).addBox(-0.9F, -0.0675F, -2.7471F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.984F, -3.81F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r157 = head.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(51, 20).addBox(-1.4F, -0.8221F, -0.1873F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, 7.0581F, -7.9666F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r158 = head.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(28, 38).addBox(-1.4F, -0.2221F, -3.1873F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.4F, 4.2548F, -6.5033F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r159 = head.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(21, 63).addBox(-1.4F, -0.8221F, -1.0873F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4F, 5.2346F, -6.0766F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r160 = head.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-1.0F, -1.4F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(0, 75).addBox(-1.0F, -1.4F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(19, 11).addBox(-1.0F, -1.0F, -7.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.5557F, 1.3852F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r161 = head.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(74, 35).mirror().addBox(1.3F, 0.1962F, -3.8745F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 35).addBox(3.1F, 0.1962F, -3.8745F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2F, 1.9305F, -2.2022F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r162 = head.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(41, 38).addBox(-1.4F, -0.8221F, -0.0873F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4F, 5.2346F, -6.0766F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r163 = head.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(29, 52).addBox(-0.5F, -0.1141F, -0.0752F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9656F, -3.8244F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r164 = head.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(45, 62).addBox(0.5F, -0.0075F, -1.0171F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(52, 38).addBox(0.0F, -0.0075F, -1.0171F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -0.7968F, -2.9346F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r165 = head.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(67, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, -1.7F, -2.5F, 0.8203F, 0.0F, 0.0F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offset(2.2F, 0.4933F, -1.5002F));

		PartDefinition cube_r166 = leftOrbit.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(9, 49).addBox(-0.7578F, -0.0724F, -0.1093F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2905F, -1.7197F, 1.9666F, 1.2841F, -0.8771F, -1.1712F));

		PartDefinition cube_r167 = leftOrbit.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(49, 28).addBox(-0.7578F, -0.0724F, -2.6093F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.13F, -2.1519F, 2.4187F, 1.4411F, -0.8771F, -1.1712F));

		PartDefinition cube_r168 = leftOrbit.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(57, 53).addBox(-0.746F, -0.1193F, -1.7621F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7337F, -0.618F, 0.8571F, 0.7075F, 0.1454F, 0.1781F));

		PartDefinition cube_r169 = leftOrbit.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(17, 70).addBox(-0.746F, 0.5558F, -1.0008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(70, 12).addBox(-0.746F, -0.0442F, -1.0008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7337F, -0.618F, 0.8571F, -0.2176F, 0.1454F, 0.1781F));

		PartDefinition cube_r170 = leftOrbit.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(0, 52).addBox(-0.8F, -0.3435F, -0.2195F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.3F, 3.1679F, -4.8721F, 0.7678F, -0.1904F, -0.1807F));

		PartDefinition cube_r171 = leftOrbit.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(14, 54).addBox(-0.7248F, -0.2108F, -1.8443F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.1337F, -1.418F, 2.3571F, 0.5741F, 0.1798F, 0.1792F));

		PartDefinition cube_r172 = leftOrbit.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(7, 54).addBox(-0.3F, -0.2435F, -1.8195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.8F, 3.0947F, -4.9403F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r173 = leftOrbit.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(28, 57).addBox(-0.7248F, -0.5882F, -1.8965F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1337F, -1.418F, 2.3571F, 0.6788F, 0.1798F, 0.1792F));

		PartDefinition cube_r174 = leftOrbit.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(57, 57).addBox(-0.746F, -0.3001F, -1.7595F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.7337F, -0.618F, 0.8571F, 0.8122F, 0.1454F, 0.1781F));

		PartDefinition cube_r175 = leftOrbit.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(0, 57).addBox(0.0F, -0.9F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -3.4742F, 1.0229F, 2.2253F, 0.0F, 0.2443F));

		PartDefinition cube_r176 = leftOrbit.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(21, 54).addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -3.1887F, 0.1694F, 1.8937F, 0.0F, 0.2443F));

		PartDefinition cube_r177 = leftOrbit.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(43, 53).addBox(-1.0F, 0.0F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.7F, -2.9246F, -0.3178F, 0.7308F, 0.965F, 0.5317F));

		PartDefinition cube_r178 = leftOrbit.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(70, 46).addBox(-0.5F, -0.3F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(70, 32).addBox(-0.5F, -0.3F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0204F, -0.0103F, -0.7757F, -0.2175F, 0.2459F, -0.0606F));

		PartDefinition cube_r179 = leftOrbit.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(74, 38).addBox(0.0F, -1.0F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2368F, 2.5313F, -1.1252F, 0.977F, 0.2833F, 0.2355F));

		PartDefinition cube_r180 = leftOrbit.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(74, 52).addBox(0.0F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7033F, 3.237F, -2.1173F, 0.8024F, 0.2833F, 0.2355F));

		PartDefinition cube_r181 = leftOrbit.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(51, 5).addBox(-0.9F, -1.0221F, -2.9873F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0288F, 1.9648F, -0.8845F, 0.7326F, 0.2833F, 0.2355F));

		PartDefinition cube_r182 = leftOrbit.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(27, 69).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-1.9F, 7.4797F, -7.3632F, 0.5212F, 0.0523F, -0.0908F));

		PartDefinition cube_r183 = leftOrbit.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(45, 67).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-1.7F, 4.5507F, -4.5192F, 0.6788F, 0.0595F, -0.0639F));

		PartDefinition cube_r184 = leftOrbit.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(66, 38).addBox(-0.5F, -1.0F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F))
				.texOffs(22, 66).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-1.7F, 5.9147F, -5.9819F, 0.7486F, 0.0595F, -0.0639F));

		PartDefinition cube_r185 = leftOrbit.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(60, 68).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-1.9F, 6.9525F, -6.655F, 0.7478F, 0.0713F, -0.0767F));

		PartDefinition cube_r186 = leftOrbit.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(59, 38).addBox(-1.4F, -0.7221F, -1.7873F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 6.3487F, -6.4149F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r187 = leftOrbit.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(58, 48).addBox(-1.4F, -0.2221F, -1.7873F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.0F, 5.8455F, -7.1611F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r188 = leftOrbit.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(0, 69).addBox(-0.5F, -0.7F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(22, 70).addBox(-0.5F, -0.7F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2015F, 0.5784F, -1.5907F, 0.1067F, 0.2523F, 0.02F));

		PartDefinition cube_r189 = leftOrbit.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(49, 48).addBox(-1.0F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.2F, -0.3885F, 0.2751F, 0.5661F, 0.289F, -0.4216F));

		PartDefinition cube_r190 = leftOrbit.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(11, 44).addBox(-1.8F, -0.1F, -2.9F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1223F, 1.1172F, -2.3448F, 0.8776F, 0.1096F, 0.496F));

		PartDefinition cube_r191 = leftOrbit.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(22, 44).addBox(-2.8F, -0.7F, -1.7F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0707F, 1.1419F, -1.848F, 1.5087F, 0.0544F, 0.351F));

		PartDefinition cube_r192 = leftOrbit.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(22, 48).addBox(-2.5F, -0.5F, -0.7F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.278F, 0.7622F, -1.8913F, 1.1662F, 0.0281F, 0.2638F));

		PartDefinition cube_r193 = leftOrbit.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(70, 49).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2976F, 1.903F, -0.8787F, 0.6501F, 0.0552F, 0.0828F));

		PartDefinition cube_r194 = leftOrbit.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(0, 61).addBox(-0.746F, -0.2341F, -3.3509F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7337F, -0.618F, 0.8571F, 0.7598F, 0.1454F, 0.1781F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offset(-2.2F, 0.4933F, -1.5002F));

		PartDefinition cube_r195 = rightOrbit.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(9, 49).mirror().addBox(-0.2422F, -0.0724F, -0.1093F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2905F, -1.7197F, 1.9666F, 1.2841F, 0.8771F, 1.1712F));

		PartDefinition cube_r196 = rightOrbit.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(49, 28).mirror().addBox(-0.2422F, -0.0724F, -2.6093F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.13F, -2.1519F, 2.4187F, 1.4411F, 0.8771F, 1.1712F));

		PartDefinition cube_r197 = rightOrbit.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(57, 53).mirror().addBox(-0.2752F, -0.4659F, -3.4736F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1337F, -1.418F, 2.3571F, 0.7137F, -0.1798F, -0.1792F));

		PartDefinition cube_r198 = rightOrbit.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(17, 70).mirror().addBox(-0.2752F, 1.7141F, -2.3077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(70, 12).mirror().addBox(-0.2752F, 1.1141F, -2.3077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1337F, -1.418F, 2.3571F, -0.2113F, -0.1798F, -0.1792F));

		PartDefinition cube_r199 = rightOrbit.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-0.2F, -0.3435F, -0.2195F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.3F, 3.1679F, -4.8721F, 0.7678F, 0.1904F, 0.1807F));

		PartDefinition cube_r200 = rightOrbit.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(14, 54).mirror().addBox(-0.2752F, -0.2108F, -1.8443F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.1337F, -1.418F, 2.3571F, 0.5741F, -0.1798F, -0.1792F));

		PartDefinition cube_r201 = rightOrbit.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(7, 54).mirror().addBox(-0.7F, -0.2435F, -1.8195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.8F, 3.0947F, -4.9403F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r202 = rightOrbit.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(28, 57).mirror().addBox(-0.2752F, -0.5882F, -1.8965F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1337F, -1.418F, 2.3571F, 0.6788F, -0.1798F, -0.1792F));

		PartDefinition cube_r203 = rightOrbit.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(57, 57).mirror().addBox(-0.2752F, -0.8237F, -3.4254F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.1337F, -1.418F, 2.3571F, 0.8185F, -0.1798F, -0.1792F));

		PartDefinition cube_r204 = rightOrbit.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-1.0F, -0.9F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4F, -3.4742F, 1.0229F, 2.2253F, 0.0F, -0.2443F));

		PartDefinition cube_r205 = rightOrbit.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(21, 54).mirror().addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4F, -3.1887F, 0.1694F, 1.8937F, 0.0F, -0.2443F));

		PartDefinition cube_r206 = rightOrbit.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(43, 53).mirror().addBox(0.0F, 0.0F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.7F, -2.9246F, -0.3178F, 0.7308F, -0.965F, -0.5317F));

		PartDefinition cube_r207 = rightOrbit.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(70, 46).mirror().addBox(-0.5F, -0.3F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(70, 32).mirror().addBox(-0.5F, -0.3F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0204F, -0.0103F, -0.7757F, -0.2175F, -0.2459F, 0.0606F));

		PartDefinition cube_r208 = rightOrbit.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(74, 38).mirror().addBox(0.0F, -1.0F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2368F, 2.5313F, -1.1252F, 0.977F, -0.2833F, -0.2355F));

		PartDefinition cube_r209 = rightOrbit.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(74, 52).mirror().addBox(0.0F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7033F, 3.237F, -2.1173F, 0.8024F, -0.2833F, -0.2355F));

		PartDefinition cube_r210 = rightOrbit.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(51, 5).mirror().addBox(-0.1F, -1.0221F, -2.9873F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0288F, 1.9648F, -0.8845F, 0.7326F, -0.2833F, -0.2355F));

		PartDefinition cube_r211 = rightOrbit.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(27, 69).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(1.9F, 7.4797F, -7.3632F, 0.5212F, -0.0523F, 0.0908F));

		PartDefinition cube_r212 = rightOrbit.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(45, 67).mirror().addBox(-0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(1.7F, 4.5507F, -4.5192F, 0.6788F, -0.0595F, 0.0639F));

		PartDefinition cube_r213 = rightOrbit.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(66, 38).mirror().addBox(-0.5F, -1.0F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false)
				.texOffs(22, 66).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(1.7F, 5.9147F, -5.9819F, 0.7486F, -0.0595F, 0.0639F));

		PartDefinition cube_r214 = rightOrbit.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(60, 68).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(1.9F, 6.9525F, -6.655F, 0.7478F, -0.0713F, 0.0767F));

		PartDefinition cube_r215 = rightOrbit.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(59, 38).mirror().addBox(0.4F, -0.7221F, -1.7873F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0F, 6.3487F, -6.4149F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r216 = rightOrbit.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(58, 48).mirror().addBox(0.4F, -0.2221F, -1.7873F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.0F, 5.8455F, -7.1611F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r217 = rightOrbit.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-0.5F, -0.7F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(22, 70).mirror().addBox(-0.5F, -0.7F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2015F, 0.5784F, -1.5907F, 0.1067F, -0.2523F, -0.02F));

		PartDefinition cube_r218 = rightOrbit.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(49, 48).mirror().addBox(0.0F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.2F, -0.3885F, 0.2751F, 0.5661F, -0.289F, 0.4216F));

		PartDefinition cube_r219 = rightOrbit.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(11, 44).mirror().addBox(-0.2F, -0.1F, -2.9F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1223F, 1.1172F, -2.3448F, 0.8776F, -0.1096F, -0.496F));

		PartDefinition cube_r220 = rightOrbit.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(22, 44).mirror().addBox(-0.2F, -0.7F, -1.7F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0707F, 1.1419F, -1.848F, 1.5087F, -0.0544F, -0.351F));

		PartDefinition cube_r221 = rightOrbit.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(22, 48).mirror().addBox(-0.5F, -0.5F, -0.7F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.278F, 0.7622F, -1.8913F, 1.1662F, -0.0281F, -0.2638F));

		PartDefinition cube_r222 = rightOrbit.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(70, 49).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2976F, 1.903F, -0.8787F, 0.6501F, -0.0552F, -0.0828F));

		PartDefinition cube_r223 = rightOrbit.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-0.5F, -0.5F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0805F, 0.6217F, -0.088F, 0.7661F, -0.1798F, -0.1792F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, -0.2494F, 0.3182F, 1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r224 = jaw.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(74, 7).mirror().addBox(0.193F, 2.2282F, -1.162F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 67).mirror().addBox(-0.007F, 1.7282F, -0.562F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 1.4514F, -6.0672F, -1.6228F, -0.1041F, -0.0119F));

		PartDefinition cube_r225 = jaw.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7943F, 1.4456F, -8.7099F, -1.7207F, -0.0818F, -0.0571F));

		PartDefinition cube_r226 = jaw.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(64, 52).mirror().addBox(-0.4F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7765F, 1.1842F, -10.5495F, -1.608F, -0.0537F, -0.0304F));

		PartDefinition cube_r227 = jaw.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(74, 62).mirror().addBox(0.4014F, 0.1951F, -2.6571F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(67, 28).mirror().addBox(0.0014F, -0.1049F, -2.0571F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 2.0514F, -2.3672F, -1.3293F, -0.1948F, -0.0185F));

		PartDefinition cube_r228 = jaw.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(12, 68).mirror().addBox(-0.0424F, -0.2457F, -0.0283F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6189F, 0.652F, -6.0912F, -1.4527F, -0.1241F, -0.0384F));

		PartDefinition cube_r229 = jaw.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(63, 74).mirror().addBox(0.1576F, 0.7543F, -1.5283F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 1.4514F, -6.0672F, -1.5406F, -0.127F, -0.0274F));

		PartDefinition cube_r230 = jaw.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(34, 68).mirror().addBox(-0.0424F, -0.2246F, -0.1274F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 1.4514F, -6.0672F, -1.6977F, -0.127F, -0.0274F));

		PartDefinition cube_r231 = jaw.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(35, 62).mirror().addBox(0.0031F, -0.1443F, -1.7171F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(74, 55).mirror().addBox(0.2031F, 3.1557F, -2.6171F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(30, 61).mirror().addBox(0.0031F, -0.1443F, -0.9171F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 2.0514F, -2.3672F, -1.5008F, -0.2819F, -0.0245F));

		PartDefinition cube_r232 = jaw.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(18, 49).mirror().addBox(0.0F, -0.5F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.858F, 0.0831F, -4.7102F, -1.588F, -0.2819F, -0.0245F));

		PartDefinition cube_r233 = jaw.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(65, 12).mirror().addBox(-1.0F, -1.7196F, -0.1127F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(65, 12).addBox(2.2F, -1.7196F, -0.1127F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.7F, 0.8669F, -2.6257F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r234 = jaw.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(7, 64).mirror().addBox(-1.0F, -0.0187F, -0.9433F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 64).addBox(2.2F, -0.0187F, -0.9433F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 1.9669F, -0.4257F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r235 = jaw.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(58, 12).mirror().addBox(-1.0F, -1.0F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(58, 12).addBox(2.2F, -1.0F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.7F, 1.9263F, -0.4497F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r236 = jaw.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(60, 20).mirror().addBox(-0.6F, 2.6F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(60, 20).addBox(2.8F, 2.6F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.2F, -2.664F, -0.0856F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r237 = jaw.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(68, 69).mirror().addBox(-1.1F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(68, 69).addBox(2.3F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.7F, -1.3289F, -1.1205F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r238 = jaw.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(67, 20).mirror().addBox(-1.1F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1094F)).mirror(false)
				.texOffs(67, 20).addBox(2.3F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1094F)), PartPose.offsetAndRotation(-1.7F, -1.0553F, -1.8722F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r239 = jaw.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(12, 64).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(12, 64).addBox(2.7F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.2F, -1.0703F, -1.8618F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r240 = jaw.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(60, 4).mirror().addBox(-0.5F, -0.6F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.5383F, -12.6002F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r241 = jaw.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(69, 52).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4367F, -9.9462F, -1.6387F, -0.0384F, -0.0498F));

		PartDefinition cube_r242 = jaw.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(7, 60).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.766F, -10.9717F, -1.64F, -0.0198F, -0.0336F));

		PartDefinition cube_r243 = jaw.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(14, 60).mirror().addBox(-0.2F, -4.2828F, -2.275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F)).mirror(false)
				.texOffs(14, 60).addBox(0.2F, -4.2828F, -2.275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F))
				.texOffs(5, 70).addBox(0.0F, -4.1828F, -1.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.1F, 2.4669F, -15.4257F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r244 = jaw.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(74, 7).addBox(-0.193F, 2.2282F, -1.162F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 67).addBox(-0.993F, 1.7282F, -0.562F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.4514F, -6.0672F, -1.6228F, 0.1041F, 0.0119F));

		PartDefinition cube_r245 = jaw.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(0, 65).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.4057F, 1.4456F, -8.7099F, -1.7207F, 0.0818F, 0.0571F));

		PartDefinition cube_r246 = jaw.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(64, 52).addBox(-0.6F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.4235F, 1.1842F, -10.5495F, -1.608F, 0.0537F, 0.0304F));

		PartDefinition cube_r247 = jaw.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(74, 62).addBox(-0.4014F, 0.1951F, -2.6571F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 28).addBox(-1.0014F, -0.1049F, -2.0571F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.5F, 2.0514F, -2.3672F, -1.3293F, 0.1948F, 0.0185F));

		PartDefinition cube_r248 = jaw.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(12, 68).addBox(-0.9576F, -0.2457F, -0.0283F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4189F, 0.652F, -6.0912F, -1.4527F, 0.1241F, 0.0384F));

		PartDefinition cube_r249 = jaw.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(63, 74).addBox(-0.1576F, 0.7543F, -1.5283F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.4514F, -6.0672F, -1.5406F, 0.127F, 0.0274F));

		PartDefinition cube_r250 = jaw.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(34, 68).addBox(-0.9576F, -0.2246F, -0.1274F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4F, 1.4514F, -6.0672F, -1.6977F, 0.127F, 0.0274F));

		PartDefinition cube_r251 = jaw.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(35, 62).addBox(-1.0031F, -0.1443F, -1.7171F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(74, 55).addBox(-0.2031F, 3.1557F, -2.6171F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 61).addBox(-1.0031F, -0.1443F, -0.9171F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, 2.0514F, -2.3672F, -1.5008F, 0.2819F, 0.0245F));

		PartDefinition cube_r252 = jaw.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(18, 49).addBox(0.0F, -0.5F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.658F, 0.0831F, -4.7102F, -1.588F, 0.2819F, 0.0245F));

		PartDefinition cube_r253 = jaw.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(69, 52).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.3F, 0.4367F, -9.9462F, -1.6387F, 0.0384F, 0.0498F));

		PartDefinition cube_r254 = jaw.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(7, 60).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.4F, 0.766F, -10.9717F, -1.64F, 0.0198F, 0.0336F));

		return LayerDefinition.create(meshdefinition, 77, 77);
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