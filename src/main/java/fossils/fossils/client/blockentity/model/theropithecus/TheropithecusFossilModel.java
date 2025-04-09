package fossils.fossils.client.blockentity.model.theropithecus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TheropithecusFossilModel extends SkullModelBase {
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
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;

	public TheropithecusFossilModel(ModelPart root) {
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
		this.head = this.neck2.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -8.3642F, 7.7417F, -1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(47, 72).addBox(0.0F, -0.6937F, -0.4061F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -0.8F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(65, 86).addBox(0.0F, -1.1201F, -0.5189F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -2.8F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(89, 15).mirror().addBox(-1.1F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 89).mirror().addBox(-0.3F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7667F, 3.6326F, 4.8356F, -3.1416F, 0.8727F, -2.3998F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(10, 89).mirror().addBox(-0.3F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0616F, 3.3624F, 4.0356F, 0.0F, 1.5708F, 0.7418F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(89, 20).mirror().addBox(-1.4F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0147F, 4.3217F, 2.7574F, 0.0F, 0.8378F, 0.7418F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(79, 10).mirror().addBox(-1.7F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5137F, 2.3478F, 3.8853F, 0.0795F, -0.8705F, -1.2338F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(79, 7).mirror().addBox(-1.7F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8481F, 3.12F, 4.0638F, 3.0659F, -0.8282F, 2.0245F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(73, 41).mirror().addBox(-1.5F, -0.5F, 0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.4781F, 1.2934F, 1.4436F, -2.4202F, -1.1398F, 1.3704F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(73, 38).mirror().addBox(-1.5F, -0.5F, 0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4781F, 1.2934F, 1.4436F, -2.1798F, -1.2277F, 1.1113F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(72, 14).mirror().addBox(-0.4982F, -0.0534F, -0.1653F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(72, 9).mirror().addBox(-0.5F, -1.5F, -1.55F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.5195F, 3.1775F, 5.9576F, -1.1165F, -1.4257F, -1.212F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(32, 44).mirror().addBox(-1.0F, -0.5F, -1.6F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8137F, 1.4126F, -1.4268F, -0.435F, 0.7323F, -0.6861F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(11, 44).mirror().addBox(0.174F, -0.3669F, -3.5229F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8281F, 0.8328F, 0.1434F, -0.434F, -0.6934F, -0.7457F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-0.9079F, -0.3669F, -3.3534F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8281F, 0.8328F, 0.1434F, -0.3677F, -0.452F, -0.867F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(43, 49).mirror().addBox(-0.8142F, -0.5F, -1.9763F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3922F, 1.0962F, -1.292F, -0.3939F, -0.0176F, -0.7432F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(71, 58).mirror().addBox(-0.2315F, -0.3573F, -1.129F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8281F, 0.8328F, 0.1434F, -2.6924F, -0.8822F, 1.6883F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(58, 11).mirror().addBox(-2.5F, -0.1F, -0.9F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3948F, 3.3238F, 4.5429F, 1.5593F, -1.5196F, -2.7323F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(10, 50).mirror().addBox(-0.5F, -0.7575F, -1.4646F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.5195F, 3.1775F, 5.9576F, -0.3311F, -1.4257F, -1.212F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(86, 9).mirror().addBox(0.1516F, -0.4067F, -0.817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.7564F, 4.6888F, 5.5473F, 0.573F, 0.2111F, 0.8052F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(43, 23).mirror().addBox(-1.7732F, -0.4067F, -0.7978F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7564F, 4.6888F, 5.5473F, 0.588F, 0.2987F, 0.8646F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(80, 67).mirror().addBox(-0.5F, -0.7F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 4.1482F, 2.5721F, 0.0F, -0.1745F, 0.7418F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(11, 44).addBox(-1.174F, -0.3669F, -3.5229F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8281F, 0.8328F, 0.1434F, -0.434F, 0.6934F, 0.7457F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0921F, -0.3669F, -3.3534F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8281F, 0.8328F, 0.1434F, -0.3677F, 0.452F, 0.867F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(32, 44).addBox(-1.0F, -0.5F, -1.6F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8137F, 1.4126F, -1.4268F, -0.435F, -0.7323F, 0.6861F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(43, 49).addBox(-1.1858F, -0.5F, -1.9763F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3922F, 1.0962F, -1.292F, -0.3939F, 0.0176F, 0.7432F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(73, 41).addBox(-1.5F, -0.5F, 0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.4781F, 1.2934F, 1.4436F, -2.4202F, 1.1398F, -1.3704F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(73, 38).addBox(-1.5F, -0.5F, 0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4781F, 1.2934F, 1.4436F, -2.1798F, 1.2277F, -1.1113F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(71, 58).addBox(-2.7685F, -0.3573F, -1.129F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8281F, 0.8328F, 0.1434F, -2.6924F, 0.8822F, -1.6883F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(79, 10).addBox(-0.3F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5137F, 2.3478F, 3.8853F, 0.0795F, 0.8705F, 1.2338F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(79, 7).addBox(-0.3F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8481F, 3.12F, 4.0638F, 3.0659F, 0.8282F, -2.0245F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(58, 11).addBox(-1.5F, -0.1F, -0.9F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.3948F, 3.3238F, 4.5429F, 1.5593F, 1.5196F, 2.7323F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(72, 14).addBox(-0.5018F, -0.0534F, -0.1653F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(72, 9).addBox(-0.5F, -1.5F, -1.55F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.5195F, 3.1775F, 5.9576F, -1.1165F, 1.4257F, 1.212F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(10, 50).addBox(-0.5F, -0.7575F, -1.4646F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.5195F, 3.1775F, 5.9576F, -0.3311F, 1.4257F, 1.212F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(86, 9).addBox(-1.1516F, -0.4067F, -0.817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.7564F, 4.6888F, 5.5473F, 0.573F, -0.2111F, -0.8052F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(43, 23).addBox(-0.2268F, -0.4067F, -0.7978F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7564F, 4.6888F, 5.5473F, 0.588F, -0.2987F, -0.8646F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(89, 15).addBox(0.1F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 89).addBox(-0.7F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7667F, 3.6326F, 4.8356F, -3.1416F, -0.8727F, 2.3998F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(10, 89).addBox(-0.7F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0616F, 3.3624F, 4.0356F, 0.0F, -1.5708F, -0.7418F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(89, 20).addBox(0.4F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0147F, 4.3217F, 2.7574F, 0.0F, -0.8378F, -0.7418F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(80, 67).addBox(-1.5F, -0.7F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5F, 4.1482F, 2.5721F, 0.0F, 0.1745F, -0.7418F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(23, 62).addBox(-0.5F, -0.9517F, -3.0528F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.2F, 5.9F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(32, 88).addBox(-0.5F, -0.9669F, -1.6379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(27, 88).addBox(-0.5F, -0.9669F, -1.0379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 5.9F, 2.9F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9F, 4.0253F, 3.7699F, -0.9333F, -0.0994F, -0.2453F));

		PartDefinition cube_r42 = leftLeg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(63, 5).addBox(-1.5F, -5.4F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.3668F, -0.5757F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftLeg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(79, 13).addBox(-1.0F, 0.0788F, -0.0676F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 5.396F, -2.72F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftLeg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(50, 64).addBox(-1.0F, -0.5026F, -1.0104F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.996F, 0.58F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftLeg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(88, 80).addBox(-1.0F, -3.2F, -3.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 11.928F, -1.3838F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(32, 64).addBox(-1.5F, 0.5897F, -0.0531F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 7.6785F, -3.7766F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(65, 0).addBox(-1.5F, 0.0185F, -2.2559F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 8.5785F, -1.4766F, -0.5411F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.8633F, -3.4541F, 2.5569F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(10, 67).addBox(-1.5F, -0.0469F, 0.3654F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(75, 61).addBox(-1.5F, -0.0469F, 0.0654F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, -0.2483F, 0.9022F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(59, 49).addBox(-1.5F, -0.1523F, -0.4962F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.5517F, -0.2978F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(50, 35).addBox(-1.5F, -0.4F, -1.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1517F, 0.8022F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 81).addBox(-1.9F, -0.1589F, 0.5196F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.4F, 1.4737F, -0.6446F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(22, 44).addBox(0.3F, -5.5F, -0.4F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 6.0555F, -0.1229F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 50).addBox(-1.9F, -0.0561F, 0.032F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.4F, 1.4737F, -0.6446F, -0.1571F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(10, 56).addBox(-1.5F, -0.5443F, -0.6179F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 10.7051F, -1.8679F, -2.1463F, 0.0238F, 0.0366F));

		PartDefinition cube_r54 = leftLeg3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(32, 84).addBox(-1.0F, -1.6185F, -0.9027F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.5F, -0.4586F, 0.2937F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(68, 76).addBox(-1.2F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-1.0F, 1.4557F, -0.1179F, 0.0F, 0.0F, 0.3927F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(13, 33).addBox(-1.6F, -0.6629F, -2.9144F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 3.3749F, 0.0205F, 1.5708F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offset(0.4F, -0.2629F, -4.5144F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9F, 4.0253F, 3.7699F, -1.0084F, 0.1109F, 0.0697F));

		PartDefinition cube_r56 = rightLeg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(63, 14).addBox(-0.5F, -5.4F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.3668F, -0.5757F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r57 = rightLeg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(45, 80).addBox(0.0F, 0.0788F, -0.0676F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 5.396F, -2.72F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r58 = rightLeg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(66, 53).addBox(0.0F, -0.5026F, -1.0104F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.996F, 0.58F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r59 = rightLeg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(88, 83).addBox(0.0F, -3.2F, -3.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 11.928F, -1.3838F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(64, 44).addBox(-0.5F, 0.5897F, -0.0531F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 7.6785F, -3.7766F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(66, 34).addBox(-0.5F, 0.0185F, -2.2559F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 8.5785F, -1.4766F, -0.5411F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.8633F, -3.4541F, 1.946F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(55, 67).addBox(-0.5F, -0.0469F, 0.3654F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(45, 77).addBox(-0.5F, -0.0469F, 0.0654F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, -0.2483F, 0.9022F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(57, 63).addBox(-0.5F, -0.1523F, -0.4962F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.5517F, -0.2978F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(77, 21).addBox(-0.5F, -0.4F, -1.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.1517F, 0.8022F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(17, 81).addBox(0.9F, -0.1589F, 0.5196F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4F, 1.4737F, -0.6446F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(27, 44).addBox(-1.3F, -5.5F, -0.4F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 6.0555F, -0.1229F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(5, 50).addBox(0.9F, -0.0561F, 0.032F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.4F, 1.4737F, -0.6446F, -0.1571F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(19, 56).addBox(-1.5F, -0.5443F, -0.6179F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 10.7051F, -1.8679F, -1.4578F, -0.0099F, 0.0867F));

		PartDefinition cube_r68 = rightLeg3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(37, 84).addBox(0.0F, -1.6185F, -0.9027F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.5F, -0.4586F, 0.2937F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(76, 71).addBox(0.2F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(1.0F, 1.4557F, -0.1179F, 0.0F, 0.0F, -0.3927F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(26, 33).addBox(-1.4F, -0.6629F, -2.9144F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 3.3749F, 0.0205F, 1.5708F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offset(-0.4F, -0.2629F, -4.5144F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -4.2F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r70 = body2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(89, 29).addBox(0.0F, -1.0751F, -0.317F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -0.7F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r71 = body2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(62, 67).addBox(0.0F, -1.1577F, -0.218F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -2.7F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r72 = body2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(28, 56).mirror().addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0026F, -0.3198F, -2.8726F, 0.076F, -1.8398F));

		PartDefinition cube_r73 = body2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(69, 10).mirror().addBox(0.0F, -0.6F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0026F, -2.8198F, -3.0241F, 0.0336F, -1.8481F));

		PartDefinition cube_r74 = body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(57, 87).mirror().addBox(0.0F, -0.5F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0026F, -4.3198F, -3.1416F, 0.0F, -1.7802F));

		PartDefinition cube_r75 = body2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(28, 56).addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0026F, -0.3198F, -2.8726F, -0.076F, 1.8398F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(69, 10).addBox(0.0F, -0.6F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0026F, -2.8198F, -3.0241F, -0.0336F, 1.8481F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(57, 87).addBox(0.0F, -0.5F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0026F, -4.3198F, -3.1416F, 0.0F, 1.7802F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(74, 89).addBox(0.0F, -1.1852F, -0.5263F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -4.5F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -6.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -6.0F, 0.1706F, -0.2506F, -0.3514F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(15, 17).mirror().addBox(0.0F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.077F, 8.3175F, -2.2301F, -0.5299F, -0.7223F, -2.2129F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(30, 15).mirror().addBox(0.1F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1021F, 8.3502F, -2.2536F, -0.4366F, -0.4626F, -2.4696F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(43, 12).mirror().addBox(-0.8F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5353F, 8.7288F, -2.4614F, -0.4024F, -0.1115F, -2.7233F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(50, 33).mirror().addBox(-0.2F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2427F, 8.4695F, -2.3782F, -0.3263F, 0.3003F, -2.9594F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(74, 19).mirror().addBox(-0.6985F, -0.4352F, -0.5588F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7636F, 8.0225F, -8.7117F, 0.4007F, -0.139F, -2.485F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(82, 32).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.0842F, -0.3452F, 0.331F, 0.3501F, -0.6423F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(84, 13).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.0842F, -0.3452F, 0.228F, 0.4228F, -0.914F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(82, 30).mirror().addBox(-5.0551F, -2.1982F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.0842F, -0.3452F, -0.0074F, 0.477F, -1.4449F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(81, 74).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.2842F, -2.2452F, 0.2543F, 0.3023F, -0.6139F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(82, 28).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.2842F, -2.2452F, 0.1661F, 0.3572F, -0.8845F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(71, 69).mirror().addBox(-6.0551F, -2.1982F, -0.4625F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.2842F, -2.2452F, -0.026F, 0.3917F, -1.3997F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(5, 82).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6842F, -4.2453F, 0.1817F, 0.2498F, -0.5814F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(82, 42).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6842F, -4.2453F, 0.1099F, 0.288F, -0.8501F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(32, 6).mirror().addBox(-7.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6842F, -4.2453F, -0.0397F, 0.3053F, -1.3521F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(66, 38).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.9842F, -6.3453F, 0.1667F, 0.2401F, -0.585F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(63, 32).mirror().addBox(-0.1489F, -0.1942F, 0.0922F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0212F, 8.9672F, -4.4996F, -0.3193F, 0.1191F, -2.9186F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(47, 14).mirror().addBox(-8.0551F, -2.1982F, -0.4625F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.9842F, -6.3453F, -0.0437F, 0.2882F, -1.3533F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(77, 24).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.9842F, -6.3453F, 0.098F, 0.2749F, -0.8534F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(82, 32).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.0842F, -0.3452F, 0.331F, -0.3501F, 0.6423F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(84, 13).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.0842F, -0.3452F, 0.228F, -0.4228F, 0.914F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(82, 30).addBox(3.0551F, -2.1982F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.0842F, -0.3452F, -0.0074F, -0.477F, 1.4449F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(81, 74).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.2842F, -2.2452F, 0.2543F, -0.3023F, 0.6139F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(82, 28).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.2842F, -2.2452F, 0.1661F, -0.3572F, 0.8845F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(71, 69).addBox(3.0551F, -2.1982F, -0.4625F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.2842F, -2.2452F, -0.026F, -0.3917F, 1.3997F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(5, 82).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6842F, -4.2453F, 0.1817F, -0.2498F, 0.5814F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(56, 0).addBox(-0.5212F, -0.7524F, -0.0482F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0212F, 8.9672F, -4.4996F, -0.0156F, -0.1278F, -0.0285F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(82, 42).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6842F, -4.2453F, 0.1099F, -0.288F, 0.8501F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(32, 6).addBox(3.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6842F, -4.2453F, -0.0397F, -0.3053F, 1.3521F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(66, 38).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.9842F, -6.3453F, 0.1354F, -0.4208F, 0.4841F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(74, 19).addBox(-2.3015F, -0.4352F, -0.5588F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7636F, 8.0225F, -8.7117F, 0.4007F, 0.139F, 2.485F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(17, 17).addBox(-6.4F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2977F, 8.2101F, -2.0091F, -0.8447F, 0.7859F, 1.9525F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(32, 15).addBox(-4.4F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2963F, 8.244F, -2.0436F, -0.6793F, 0.5306F, 2.2548F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(45, 12).addBox(-4.4255F, -0.353F, -0.739F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5338F, 8.512F, -2.4884F, -0.5691F, 0.1228F, 2.5273F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(50, 33).addBox(-3.9684F, -0.063F, -0.2234F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0212F, 8.5672F, -2.5996F, -0.3746F, -0.1552F, 2.8126F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(63, 32).addBox(-4.0123F, -0.1775F, 0.096F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0212F, 8.9672F, -4.4996F, -0.388F, -0.109F, 2.6286F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(47, 14).addBox(3.0551F, -2.1982F, -0.4625F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.9842F, -6.3453F, -0.202F, -0.3946F, 1.2954F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(77, 24).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.9842F, -6.3453F, 0.0146F, -0.4406F, 0.7716F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.3F, -6.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.8F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(60, 89).addBox(0.0F, -1.321F, -1.234F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.3F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(42, 89).addBox(0.0F, -1.7769F, -0.728F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -2.0F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(89, 40).addBox(0.0F, -1.6938F, 0.054F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -4.8F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(47, 68).addBox(0.0F, -1.9698F, 0.0459F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -6.9F, -0.1396F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1F, -6.8F, 0.3695F, -0.1106F, -0.1855F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(66, 61).mirror().addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 4.9269F, -4.3752F, -0.8748F, 0.1699F, 0.5388F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-0.5F, -0.0639F, -5.8201F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(0, 17).addBox(6.1F, -0.0639F, -5.8201F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-3.3F, 0.7138F, 0.5779F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(54, 72).mirror().addBox(-0.5F, -0.3742F, -1.86F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(54, 72).addBox(6.1F, -0.3742F, -1.86F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-3.3F, 1.8139F, -3.5221F, 1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(54, 5).mirror().addBox(-0.5F, -1.1561F, 3.1199F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(50, 27).mirror().addBox(-0.5F, -0.9561F, 3.1199F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(54, 5).addBox(6.1F, -1.1561F, 3.1199F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F))
				.texOffs(50, 27).addBox(6.1F, -0.9561F, 3.1199F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-3.3F, 5.1139F, -3.5221F, 1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(15, 19).mirror().addBox(-1.0649F, -0.492F, -0.0338F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 5.1139F, -3.5221F, 1.1652F, 0.4338F, -0.1376F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(24, 38).mirror().addBox(-0.5F, -0.6346F, -0.0771F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(24, 38).addBox(6.1F, -0.6346F, -0.0771F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-3.3F, 5.1139F, -3.5221F, 1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(34, 82).mirror().addBox(-5.0551F, -2.1982F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.1842F, -3.2453F, -0.0892F, 0.2412F, -1.5357F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(83, 18).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.1842F, -3.2453F, 0.0347F, 0.2546F, -1.0405F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(27, 82).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.1842F, -3.2453F, 0.1006F, 0.2368F, -0.7711F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(82, 26).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.4842F, -1.3453F, 0.1059F, 0.2032F, -0.6681F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(82, 61).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.4842F, -1.3453F, 0.049F, 0.2235F, -0.9352F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(63, 19).mirror().addBox(-7.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.4842F, -1.3453F, -0.0615F, 0.2205F, -1.4275F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(15, 9).mirror().addBox(-0.5F, -0.2435F, 0.1854F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 9).addBox(6.1F, -0.2435F, 0.1854F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.3F, 5.1139F, -3.5221F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(13, 26).mirror().addBox(-0.5F, -0.542F, 1.1714F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(13, 26).addBox(6.1F, -0.542F, 1.1714F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.3F, 5.1139F, -3.5221F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(15, 19).addBox(0.0649F, -0.492F, -0.0338F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 5.1139F, -3.5221F, 1.1652F, -0.4338F, 0.1376F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(34, 82).addBox(3.0551F, -2.1982F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.1842F, -3.2453F, -0.0892F, -0.2412F, 1.5357F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(83, 18).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.1842F, -3.2453F, 0.0347F, -0.2546F, 1.0405F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(27, 82).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.1842F, -3.2453F, 0.1006F, -0.2368F, 0.7711F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(82, 26).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.4842F, -1.3453F, 0.1755F, -0.0578F, 0.6563F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(82, 61).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.4842F, -1.3453F, 0.1548F, -0.1011F, 0.9153F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(63, 19).addBox(3.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.4842F, -1.3453F, 0.0908F, -0.1611F, 1.3958F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(66, 61).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 4.9269F, -4.3752F, -0.8748F, -0.1699F, -0.5388F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(50, 23).addBox(-1.5F, -1.0587F, 1.7738F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3431F, -5.6378F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(43, 44).addBox(-1.0F, -0.913F, 1.1021F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.5805F, -4.0744F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(71, 89).addBox(0.0F, -1.9476F, 0.0375F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -3.9F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(68, 89).addBox(0.0F, -1.9815F, 0.0453F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -2.0F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(30, 19).addBox(-0.5F, -0.989F, 0.9677F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4F, -5.4F, 0.3229F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6F, 6.3429F, -3.4821F, 0.8383F, 0.1334F, -0.2909F));

		PartDefinition cube_r149 = leftarm.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(68, 27).addBox(0.0F, -1.2F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5118F, -0.1535F, 0.4938F, 0.3053F, 0.0014F, -0.001F));

		PartDefinition cube_r150 = leftarm.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(86, 3).addBox(-0.5F, 0.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 6.7652F, 6.0222F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r151 = leftarm.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(59, 40).addBox(0.0F, -0.0373F, -0.0956F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.6099F, 1.056F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r152 = leftarm.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(22, 81).addBox(0.0F, -5.0389F, -0.1208F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 5.21F, 2.556F, 0.5149F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1372F, 7.8696F, 6.7191F, -1.199F, -0.1151F, 1.1502F));

		PartDefinition cube_r153 = leftarm2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(27, 67).addBox(-0.1296F, -5.239F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.4064F, 4.048F, 0.1989F, -1.5708F, -1.5446F, 1.5708F));

		PartDefinition cube_r154 = leftarm2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(32, 68).addBox(-0.1296F, -4.839F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4064F, 4.048F, 0.1989F, 1.5708F, -1.5097F, -1.5708F));

		PartDefinition cube_r155 = leftarm2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(47, 54).addBox(-0.6F, -3.6F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(0.4064F, 7.448F, 0.9989F, 1.5708F, -1.4748F, -1.5708F));

		PartDefinition cube_r156 = leftarm2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(37, 88).addBox(-0.564F, -1.0149F, -0.2424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.464F, 1.2298F, -0.0451F, 1.5708F, -1.3439F, -1.5708F));

		PartDefinition cube_r157 = leftarm2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(37, 54).addBox(-0.2142F, -0.1646F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.7064F, 3.8149F, -0.7091F, 1.5708F, -1.4312F, -1.5708F));

		PartDefinition cube_r158 = leftarm2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(73, 80).addBox(-0.9F, -0.2F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7064F, 1.2149F, 0.1909F, -1.5708F, -1.501F, 1.5708F));

		PartDefinition cube_r159 = leftarm2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(5, 67).addBox(-0.1296F, -5.239F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1064F, 4.048F, 0.1989F, -1.5708F, -1.5446F, 1.5708F));

		PartDefinition cube_r160 = leftarm2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(66, 64).addBox(-0.1296F, -4.839F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.1064F, 4.048F, 0.1989F, 1.5708F, -1.5097F, -1.5708F));

		PartDefinition cube_r161 = leftarm2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(32, 54).addBox(-0.6F, -3.6F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.1064F, 7.448F, 0.9989F, 1.5708F, -1.4748F, -1.5708F));

		PartDefinition cube_r162 = leftarm2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(20, 89).addBox(-1.0F, -0.4F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1764F, -0.8515F, 0.9635F, -1.5708F, -1.4573F, 1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 11.5311F, 0.8987F, 0.5236F, -0.2042F, 0.3378F));

		PartDefinition cube_r163 = leftArm3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(7, 77).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r164 = leftArm3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(57, 35).addBox(-1.0F, 0.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.7399F, -0.0221F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r165 = leftArm4.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(0, 70).addBox(-0.8F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 1.4577F, 0.0906F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r166 = leftArm4.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(57, 53).addBox(-0.8F, 0.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0423F, 0.0906F, 0.0F, 0.0F, -0.0873F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6F, 6.3429F, -3.4821F, 0.3577F, -0.0806F, 0.3787F));

		PartDefinition cube_r167 = rightarm.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(10, 72).addBox(-1.0F, -1.2F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5118F, -0.1535F, 0.4938F, 0.3053F, -0.0014F, 0.001F));

		PartDefinition cube_r168 = rightarm.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(86, 6).addBox(-0.5F, 0.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 6.7652F, 6.0222F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r169 = rightarm.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(0, 61).addBox(-1.0F, -0.0373F, -0.0956F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.6099F, 1.056F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r170 = rightarm.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(81, 70).addBox(-1.0F, -5.0389F, -0.1208F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 5.21F, 2.556F, 0.5149F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1372F, 7.8696F, 6.7191F, -1.0648F, -0.0636F, -0.3467F));

		PartDefinition cube_r171 = rightarm2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(42, 68).addBox(-0.8704F, -5.239F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.4064F, 4.048F, 0.1989F, -1.5708F, 1.5446F, -1.5708F));

		PartDefinition cube_r172 = rightarm2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(37, 68).addBox(-0.8704F, -4.839F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4064F, 4.048F, 0.1989F, 1.5708F, 1.5097F, 1.5708F));

		PartDefinition cube_r173 = rightarm2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(52, 54).addBox(-0.4F, -3.6F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(-0.4064F, 7.448F, 0.9989F, 1.5708F, 1.4748F, 1.5708F));

		PartDefinition cube_r174 = rightarm2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(88, 73).addBox(-0.436F, -1.0149F, -0.2424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.464F, 1.2298F, -0.0451F, 1.5708F, 1.3439F, 1.5708F));

		PartDefinition cube_r175 = rightarm2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(54, 43).addBox(-0.7858F, -0.1646F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.7064F, 3.8149F, -0.7091F, 1.5708F, 1.4312F, 1.5708F));

		PartDefinition cube_r176 = rightarm2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(80, 77).addBox(-0.1F, -0.2F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7064F, 1.2149F, 0.1909F, -1.5708F, 1.501F, -1.5708F));

		PartDefinition cube_r177 = rightarm2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(22, 67).addBox(-0.8704F, -5.239F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1064F, 4.048F, 0.1989F, -1.5708F, 1.5446F, -1.5708F));

		PartDefinition cube_r178 = rightarm2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(17, 67).addBox(-0.8704F, -4.839F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.1064F, 4.048F, 0.1989F, 1.5708F, 1.5097F, 1.5708F));

		PartDefinition cube_r179 = rightarm2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(42, 54).addBox(-0.4F, -3.6F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.1064F, 7.448F, 0.9989F, 1.5708F, 1.4748F, 1.5708F));

		PartDefinition cube_r180 = rightarm2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(89, 23).addBox(0.0F, -0.4F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1764F, -0.8515F, 0.9635F, -1.5708F, 1.4573F, -1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 11.5311F, 0.8987F, 0.4352F, -0.1187F, -0.1282F));

		PartDefinition cube_r181 = rightArm3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(12, 77).addBox(0.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r182 = rightArm3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(57, 58).addBox(-2.0F, 0.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.7399F, -0.0221F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r183 = rightArm4.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(81, 0).addBox(-0.2F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.4577F, 0.0906F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r184 = rightArm4.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(59, 27).addBox(-2.2F, 0.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0423F, 0.0906F, 0.0F, 0.0F, 0.0873F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5F, -4.3F, -0.171F, -0.1951F, -0.0973F));

		PartDefinition cube_r185 = neck3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(77, 89).addBox(0.0F, -1.5342F, -0.7343F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7346F, -0.9669F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r186 = neck3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(74, 0).addBox(-0.5F, -0.9F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.9F, -2.8F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8F, -1.6F, 0.4837F, -0.4261F, -0.389F));

		PartDefinition cube_r187 = neck2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(7, 74).mirror().addBox(0.0F, -0.0055F, -0.8398F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5775F, 0.6258F, -0.9F, 0.4247F, 0.3161F));

		PartDefinition cube_r188 = neck2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(7, 74).addBox(0.0F, -0.0055F, -0.8398F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5775F, 0.6258F, -0.9F, -0.4247F, -0.3161F));

		PartDefinition cube_r189 = neck2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(61, 22).addBox(-0.5F, -0.1681F, 0.9279F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2F, -1.9F, -0.9687F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1F, -1.5F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r190 = head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(31, 75).addBox(-1.0F, -0.6F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.6428F, -4.5231F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r191 = head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(46, 38).addBox(-1.0F, -0.4F, 0.9F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 3.5811F, -7.1344F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r192 = head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(41, 64).addBox(-1.0F, -0.9638F, -0.0514F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.4811F, -3.0344F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r193 = head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(45, 0).addBox(-1.0F, -0.9894F, -0.2857F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.0811F, -5.7344F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r194 = head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(24, 78).addBox(-1.0F, -0.5874F, -1.0321F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, 3.3811F, -6.8344F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r195 = head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(17, 78).addBox(-1.0F, -0.8874F, -0.7937F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 3.3811F, -6.8344F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r196 = head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(73, 77).addBox(-1.0F, -1.053F, -1.0114F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.1811F, -5.8344F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r197 = head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(32, 49).addBox(-1.0F, 0.1631F, -0.1461F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 1.5F, -6.5F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r198 = head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(75, 30).addBox(-0.5F, 0.4146F, -0.8098F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.4F, -5.1F, 1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r199 = head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(17, 74).addBox(-0.5F, -0.0162F, -1.3635F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4F, -4.6F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r200 = head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(78, 52).addBox(-1.6F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(79, 4).addBox(-1.6F, -0.1F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5871F, 3.6037F, -7.5796F, -0.0466F, 0.0F, 0.0F));

		PartDefinition cube_r201 = head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(80, 44).addBox(-0.9F, 0.0863F, -0.9525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(80, 44).addBox(-0.3F, 0.0863F, -0.9525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1F, 2.0461F, -7.2149F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r202 = head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(80, 44).addBox(-0.5F, 0.0863F, 0.0475F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.0461F, -7.2149F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r203 = head.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(64, 40).addBox(-1.5F, -0.2425F, 0.0192F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.8F, -4.0F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r204 = head.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(0, 45).addBox(-1.5F, 0.5546F, -3.5657F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1F, -2.5F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r205 = head.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(0, 25).addBox(-1.0F, -0.9F, -2.2F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.213F, -1.9092F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r206 = head.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(12, 82).addBox(-1.0F, -1.4031F, -0.9718F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0056F)), PartPose.offsetAndRotation(0.5F, -0.3F, 0.9F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r207 = head.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(82, 47).addBox(-1.0F, -0.0522F, -0.0417F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.213F, 0.4787F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r208 = head.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(27, 84).addBox(-1.0F, 0.3586F, 0.2408F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.8566F, -0.6494F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r209 = head.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(84, 20).addBox(-1.0F, -0.3056F, -0.3658F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.5F, -2.8566F, -0.7494F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r210 = head.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(0, 86).addBox(-1.0F, -0.3052F, 0.4427F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(85, 76).addBox(-1.0F, -0.3052F, 0.1427F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(69, 85).addBox(-1.0F, -0.3052F, -0.2573F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -2.3566F, 1.0506F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r211 = head.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(89, 26).addBox(0.3F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.3689F, 0.1141F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r212 = head.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(85, 63).addBox(-1.0F, -0.2757F, -0.298F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.5F, -2.5566F, 0.7506F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r213 = head.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(85, 51).addBox(-1.0F, -0.347F, 0.1235F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(42, 85).addBox(-1.0F, -0.347F, -0.2765F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.5F, -2.7566F, -0.0494F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r214 = head.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(22, 85).addBox(-1.0F, -0.3108F, -0.2658F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -2.8566F, -0.4494F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r215 = head.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(64, 82).addBox(-1.0F, -0.3414F, -0.8592F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(69, 71).addBox(-1.0F, -0.3414F, -2.2592F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.5F, -2.8566F, -0.6494F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r216 = head.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(72, 4).addBox(-1.0F, -0.314F, -1.6345F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -2.1566F, -2.5494F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r217 = head.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(54, 16).addBox(-0.5F, 0.0173F, -0.9931F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.8F, -2.3F, 0.3491F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.8359F, 2.5361F, -9.8986F));

		PartDefinition cube_r218 = leftFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(36, 17).addBox(-2.3713F, -0.7166F, 0.203F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3511F, -1.9164F, 7.7242F, -0.1328F, 0.8999F, 0.0464F));

		PartDefinition cube_r219 = leftFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(80, 58).addBox(-2.3289F, -1.5587F, 1.0537F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3511F, -1.9164F, 7.7242F, -0.2267F, 0.4693F, 0.2278F));

		PartDefinition cube_r220 = leftFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(78, 55).addBox(-1.9941F, -1.5134F, -0.1488F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3511F, -1.9164F, 7.7242F, -0.8706F, 1.3246F, -0.4488F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(47, 87).addBox(-1.3349F, -0.9668F, -0.3754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(78, 64).addBox(-0.7349F, -0.9668F, -0.3754F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.3511F, -1.9164F, 7.7242F, 0.7196F, 0.8213F, 1.7004F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(57, 80).addBox(0.421F, -0.7899F, -0.4515F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3511F, -1.9164F, 7.7242F, 0.8567F, 0.816F, 1.2377F));

		PartDefinition cube_r223 = leftFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(50, 80).addBox(0.5104F, -0.7899F, -1.5177F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.3511F, -1.9164F, 7.7242F, 0.6141F, 0.4544F, 0.8389F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(85, 55).addBox(0.1773F, -0.7899F, -1.9387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3511F, -1.9164F, 7.7242F, 0.5523F, 0.162F, 0.6378F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(84, 15).addBox(-0.55F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6967F, -1.755F, 5.9998F, 0.7063F, 0.4802F, 1.2232F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(73, 44).addBox(-0.4406F, -0.9668F, -1.5136F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3511F, -1.9164F, 7.7242F, 0.491F, -0.3104F, 0.9682F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(86, 0).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.36F, -1.5412F, 6.382F, 0.8472F, 0.3491F, 1.314F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(0, 74).addBox(-0.5817F, -0.5F, -0.7585F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.6967F, -1.755F, 5.9998F, 1.0203F, 0.8292F, 1.7244F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(0, 78).addBox(-1.7954F, -0.339F, -0.1451F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.3373F, -4.1406F, 5.3694F, -0.7332F, 0.7521F, 0.1032F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(10, 86).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.5329F, -3.7015F, 5.4606F, 0.9163F, 0.7496F, 1.5807F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(46, 20).addBox(-1.3611F, -0.3561F, -0.72F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(46, 20).addBox(-1.3611F, -0.3561F, -1.32F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.3471F, -0.9626F, 2.505F, -2.6434F, 0.6192F, -1.4059F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(43, 17).addBox(-0.6807F, -0.3768F, -2.806F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3471F, -0.9626F, 3.505F, 3.1162F, 0.6192F, -1.4059F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(71, 64).addBox(-0.5F, -0.8F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1922F, -2.3194F, 5.777F, -3.1076F, 1.273F, -1.4769F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(54, 76).addBox(-2.3681F, -0.3768F, -2.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3471F, -0.9626F, 3.505F, 3.0591F, 1.3167F, -1.471F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(75, 26).addBox(-0.5F, -0.4F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7552F, -3.3775F, 5.7773F, 0.1362F, 0.7717F, 1.6388F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(24, 74).addBox(-0.1707F, -0.1576F, -1.7972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4668F, -4.2834F, 5.3309F, 1.6551F, 0.3645F, 1.2901F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(75, 34).addBox(0.0F, -0.0522F, -0.0417F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3359F, -4.7491F, 10.3774F, -0.515F, 0.3613F, 0.5584F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(61, 76).addBox(0.0F, 0.0297F, -0.1358F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3359F, -4.9927F, 9.5492F, -0.1724F, 0.1195F, 0.6005F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(43, 6).addBox(0.0F, 0.0173F, -0.9931F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3359F, -4.3361F, 7.5987F, 0.2898F, -0.1975F, 0.582F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(82, 34).addBox(-0.5007F, -1.5518F, -0.6341F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0523F, 2.0303F, 3.0562F, 0.1726F, -0.0794F, -0.1942F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(78, 82).addBox(-0.5007F, -1.5352F, -0.4303F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0523F, 2.0303F, 3.0562F, 0.0417F, -0.0794F, -0.1942F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(15, 86).addBox(-0.5007F, -0.3008F, -0.6521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(60, 86).addBox(-0.5007F, 0.0992F, -0.6521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0523F, 2.0303F, 3.0562F, 0.6089F, -0.0794F, -0.1942F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(87, 44).addBox(-0.5007F, -0.2608F, -0.4748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.0523F, 2.0303F, 3.0562F, 0.2598F, -0.0794F, -0.1942F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(5, 62).addBox(-0.5F, -0.0369F, -0.1461F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8359F, -1.0361F, 3.3986F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(87, 37).addBox(0.2F, -0.2425F, -0.2808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.8359F, -3.3361F, 5.8986F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(87, 34).addBox(-0.7792F, -0.6364F, -1.3393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(87, 34).addBox(-0.7792F, -0.6364F, -0.7393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3641F, -0.2788F, 2.944F, 1.1479F, 0.2499F, 0.2719F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.8359F, 2.5361F, -9.8986F));

		PartDefinition cube_r247 = rightFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(36, 17).mirror().addBox(0.3713F, -0.7166F, 0.203F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3511F, -1.9164F, 7.7242F, -0.1328F, -0.8999F, -0.0464F));

		PartDefinition cube_r248 = rightFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(80, 58).mirror().addBox(0.3289F, -1.5587F, 1.0537F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3511F, -1.9164F, 7.7242F, -0.2267F, -0.4693F, -0.2278F));

		PartDefinition cube_r249 = rightFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(78, 55).mirror().addBox(-0.0059F, -1.5134F, -0.1488F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3511F, -1.9164F, 7.7242F, -0.8706F, -1.3246F, 0.4488F));

		PartDefinition cube_r250 = rightFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(47, 87).mirror().addBox(0.3349F, -0.9668F, -0.3754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(78, 64).mirror().addBox(-1.2651F, -0.9668F, -0.3754F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.3511F, -1.9164F, 7.7242F, 0.7196F, -0.8213F, -1.7004F));

		PartDefinition cube_r251 = rightFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(57, 80).mirror().addBox(-2.421F, -0.7899F, -0.4515F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3511F, -1.9164F, 7.7242F, 0.8567F, -0.816F, -1.2377F));

		PartDefinition cube_r252 = rightFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(50, 80).mirror().addBox(-2.5104F, -0.7899F, -1.5177F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.3511F, -1.9164F, 7.7242F, 0.6141F, -0.4544F, -0.8389F));

		PartDefinition cube_r253 = rightFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(85, 55).mirror().addBox(-1.1773F, -0.7899F, -1.9387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3511F, -1.9164F, 7.7242F, 0.5523F, -0.162F, -0.6378F));

		PartDefinition cube_r254 = rightFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(84, 15).mirror().addBox(-0.45F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6967F, -1.755F, 5.9998F, 0.7063F, -0.4802F, -1.2232F));

		PartDefinition cube_r255 = rightFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(73, 44).mirror().addBox(-0.5594F, -0.9668F, -1.5136F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3511F, -1.9164F, 7.7242F, 0.491F, 0.3104F, -0.9682F));

		PartDefinition cube_r256 = rightFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.36F, -1.5412F, 6.382F, 0.8472F, -0.3491F, -1.314F));

		PartDefinition cube_r257 = rightFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.4183F, -0.5F, -0.7585F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.6967F, -1.755F, 5.9998F, 1.0203F, -0.8292F, -1.7244F));

		PartDefinition cube_r258 = rightFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-0.2046F, -0.339F, -0.1451F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.3373F, -4.1406F, 5.3694F, -0.7332F, -0.7521F, -0.1032F));

		PartDefinition cube_r259 = rightFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(10, 86).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.5329F, -3.7015F, 5.4606F, 0.9163F, -0.7496F, -1.5807F));

		PartDefinition cube_r260 = rightFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(46, 20).mirror().addBox(0.3611F, -0.3561F, -0.72F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(46, 20).mirror().addBox(0.3611F, -0.3561F, -1.32F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.3471F, -0.9626F, 2.505F, -2.6434F, -0.6192F, 1.4059F));

		PartDefinition cube_r261 = rightFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(43, 17).mirror().addBox(-0.3193F, -0.3768F, -2.806F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3471F, -0.9626F, 3.505F, 3.1162F, -0.6192F, 1.4059F));

		PartDefinition cube_r262 = rightFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(71, 64).mirror().addBox(-0.5F, -0.8F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1922F, -2.3194F, 5.777F, -3.1076F, -1.273F, 1.4769F));

		PartDefinition cube_r263 = rightFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(54, 76).mirror().addBox(1.3681F, -0.3768F, -2.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3471F, -0.9626F, 3.505F, 3.0591F, -1.3167F, 1.471F));

		PartDefinition cube_r264 = rightFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(75, 26).mirror().addBox(-0.5F, -0.4F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7552F, -3.3775F, 5.7773F, 0.1362F, -0.7717F, -1.6388F));

		PartDefinition cube_r265 = rightFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(24, 74).mirror().addBox(-0.8293F, -0.1576F, -1.7972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4668F, -4.2834F, 5.3309F, 1.6551F, -0.3645F, -1.2901F));

		PartDefinition cube_r266 = rightFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(75, 34).mirror().addBox(-2.0F, -0.0522F, -0.0417F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3359F, -4.7491F, 10.3774F, -0.515F, -0.3613F, -0.5584F));

		PartDefinition cube_r267 = rightFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(61, 76).mirror().addBox(-2.0F, 0.0297F, -0.1358F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3359F, -4.9927F, 9.5492F, -0.1724F, -0.1195F, -0.6005F));

		PartDefinition cube_r268 = rightFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(43, 6).mirror().addBox(-2.0F, 0.0173F, -0.9931F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3359F, -4.3361F, 7.5987F, 0.2898F, 0.1975F, -0.582F));

		PartDefinition cube_r269 = rightFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(82, 34).mirror().addBox(-0.4993F, -1.5518F, -0.6341F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.0523F, 2.0303F, 3.0562F, 0.1726F, 0.0794F, 0.1942F));

		PartDefinition cube_r270 = rightFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(78, 82).mirror().addBox(-0.4993F, -1.5352F, -0.4303F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0523F, 2.0303F, 3.0562F, 0.0417F, 0.0794F, 0.1942F));

		PartDefinition cube_r271 = rightFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(15, 86).mirror().addBox(-0.4993F, -0.3008F, -0.6521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(60, 86).mirror().addBox(-0.4993F, 0.0992F, -0.6521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0523F, 2.0303F, 3.0562F, 0.6089F, 0.0794F, 0.1942F));

		PartDefinition cube_r272 = rightFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(87, 44).mirror().addBox(-0.4993F, -0.2608F, -0.4748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.0523F, 2.0303F, 3.0562F, 0.2598F, 0.0794F, 0.1942F));

		PartDefinition cube_r273 = rightFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(5, 62).mirror().addBox(-0.5F, -0.0369F, -0.1461F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8359F, -1.0361F, 3.3986F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r274 = rightFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(87, 37).mirror().addBox(-1.2F, -0.2425F, -0.2808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.8359F, -3.3361F, 5.8986F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(87, 34).mirror().addBox(-0.2208F, -0.6364F, -1.3393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(87, 34).mirror().addBox(-0.2208F, -0.6364F, -0.7393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3641F, -0.2788F, 2.944F, 1.1479F, -0.2499F, -0.2719F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0955F, -0.9208F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r276 = jaw.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(55, 83).mirror().addBox(-1.0F, -1.4658F, -0.1202F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(55, 83).addBox(2.2F, -1.4658F, -0.1202F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.1F, 0.6434F, -2.0968F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r277 = jaw.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(82, 38).mirror().addBox(-1.0F, -1.7649F, -0.1351F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(82, 38).addBox(2.2F, -1.7649F, -0.1351F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.1F, 2.3434F, -1.9968F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r278 = jaw.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(75, 48).mirror().addBox(-1.0F, -0.0743F, -2.054F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(75, 48).addBox(0.0F, -0.0743F, -2.054F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 4.7704F, -6.8552F, -2.9322F, 0.0F, 0.0F));

		PartDefinition cube_r279 = jaw.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(52, 87).mirror().addBox(-1.0F, 0.0134F, -0.9744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(52, 87).addBox(0.0F, 0.0134F, -0.9744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 5.2704F, -5.8552F, -2.0769F, 0.0F, 0.0F));

		PartDefinition cube_r280 = jaw.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(84, 86).mirror().addBox(-1.0F, -0.0829F, -0.9166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(84, 86).addBox(0.0F, -0.0829F, -0.9166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.3704F, -4.9552F, -1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r281 = jaw.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(87, 47).mirror().addBox(-1.0F, -1.0121F, 0.0118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(87, 47).addBox(0.0F, -1.0121F, 0.0118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 3.3055F, -5.5866F, -1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r282 = jaw.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(79, 86).mirror().addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(79, 86).addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 4.0055F, -5.6867F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r283 = jaw.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(19, 50).mirror().addBox(0.1F, -0.7F, -0.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 50).addBox(1.7F, -0.7F, -0.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 3.0008F, -3.4194F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r284 = jaw.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(62, 71).mirror().addBox(-1.0F, -0.0682F, 0.2037F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 71).addBox(0.0F, -0.0682F, 0.2037F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7704F, -3.6552F, -1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r285 = jaw.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(71, 53).mirror().addBox(-1.0F, -0.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(71, 53).addBox(2.2F, -0.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.1F, 2.4704F, -1.1552F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r286 = jaw.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(74, 86).mirror().addBox(-1.0F, -0.0175F, -0.9793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(74, 86).addBox(2.2F, -0.0175F, -0.9793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.1F, 2.4341F, 0.1601F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r287 = jaw.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(86, 70).mirror().addBox(-1.0F, -0.0909F, -0.9742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(86, 70).addBox(2.2F, -0.0909F, -0.9742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.1F, 3.4341F, -0.1399F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r288 = jaw.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(38, 75).mirror().addBox(-1.0F, -1.0145F, -2.0058F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(38, 75).addBox(1.0F, -1.0145F, -2.0058F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 4.7341F, -1.4399F, -1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r289 = jaw.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(70, 21).mirror().addBox(-1.0F, -1.6167F, -1.952F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(70, 21).addBox(1.0F, -1.6167F, -1.952F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 4.8341F, -3.0399F, -1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r290 = jaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(5, 88).mirror().addBox(-0.5028F, -0.2479F, -0.4871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.7812F, 3.4564F, -6.9135F, -0.3371F, -0.1368F, 2.9324F));

		PartDefinition cube_r291 = jaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(87, 67).mirror().addBox(-0.5028F, 0.1071F, -0.668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(87, 58).mirror().addBox(-0.5028F, -0.2929F, -0.668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.7812F, 3.4564F, -6.9135F, 0.012F, -0.1368F, 2.9324F));

		PartDefinition cube_r292 = jaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(5, 84).mirror().addBox(-0.5028F, -1.5379F, -0.6451F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.7812F, 3.4564F, -6.9135F, -0.4244F, -0.1368F, 2.9324F));

		PartDefinition cube_r293 = jaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(83, 82).mirror().addBox(-0.5028F, -1.52F, -0.4395F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7812F, 3.4564F, -6.9135F, -0.5553F, -0.1368F, 2.9324F));

		PartDefinition cube_r294 = jaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(50, 83).mirror().addBox(-0.6F, -0.7F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(50, 83).addBox(2.8F, -0.7F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.6F, 0.2397F, -0.3864F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r295 = jaw.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(68, 48).mirror().addBox(-1.0F, 0.5F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(68, 48).addBox(2.2F, 0.5F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.1F, -0.0566F, -0.4968F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r296 = jaw.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(5, 88).addBox(-0.4972F, -0.2479F, -0.4871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.7812F, 3.4564F, -6.9135F, -0.3371F, 0.1368F, -2.9324F));

		PartDefinition cube_r297 = jaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(87, 67).addBox(-0.4972F, 0.1071F, -0.668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(87, 58).addBox(-0.4972F, -0.2929F, -0.668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.7812F, 3.4564F, -6.9135F, 0.012F, 0.1368F, -2.9324F));

		PartDefinition cube_r298 = jaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(31, 79).addBox(-1.0F, -0.9F, -0.6276F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(38, 79).addBox(-1.0F, -0.5F, -0.6276F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0129F, 3.708F, -6.6682F, 0.477F, 0.0F, 0.0F));

		PartDefinition cube_r299 = jaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(5, 84).addBox(-0.4972F, -1.5379F, -0.6451F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.7812F, 3.4564F, -6.9135F, -0.4244F, 0.1368F, -2.9324F));

		PartDefinition cube_r300 = jaw.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(83, 82).addBox(-0.4972F, -1.52F, -0.4395F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7812F, 3.4564F, -6.9135F, -0.5553F, 0.1368F, -2.9324F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(14, 62).addBox(-0.5F, -0.1497F, -0.0853F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3448F, 1.4809F, -0.2502F, -0.0779F, -0.2956F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, -0.5315F, -0.3345F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2954F, 2.7846F, 0.0829F, 0.6106F, -0.426F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(35, 38).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3885F, 4.5405F, -0.7437F, 0.1623F, -0.546F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.0335F, 3.7642F, -0.8904F, 0.0344F, 0.2635F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(39, 26).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0132F, 3.9051F, -0.5167F, -0.2094F, 0.2184F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(13, 38).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.1386F, 3.8873F, -0.3665F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(26, 26).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1011F, 3.882F, -0.4306F, -0.0024F, 0.2065F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(30, 8).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.1637F, 4.6089F, 0.4625F, 0.0F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(39, 32).addBox(-0.5F, -0.5017F, -0.007F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5675F, 4.4346F, 1.0123F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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