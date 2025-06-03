package fossils.fossils.client.blockentity.model.hypselospinus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HypselospinusFossilModel extends SkullModelBase {
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
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart opposablePinkie;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart opposablePinkie2;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart heads;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public HypselospinusFossilModel(ModelPart root) {
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
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.opposablePinkie = this.leftArm3.getChild("opposablePinkie");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.opposablePinkie2 = this.rightArm3.getChild("opposablePinkie2");
		this.neck4 = this.chest.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.heads = this.neck.getChild("heads");
		this.jaw = this.heads.getChild("jaw");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -25.778F, 6.3237F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(31, 76).mirror().addBox(-0.6F, -0.9F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7409F, 11.2756F, 8.72F, -1.5668F, 0.1902F, -0.1849F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(91, 27).mirror().addBox(-0.2719F, -0.0898F, -2.2058F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 4.1479F, 3.0621F, -1.0373F, 0.3081F, 0.0039F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(93, 96).mirror().addBox(-0.7339F, -0.2733F, -0.2354F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.2202F, 5.1728F, 2.1502F, 0.8901F, 0.2967F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(31, 80).mirror().addBox(-0.1697F, -0.1121F, -3.851F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 1.0125F, -2.8268F, 0.1745F, 0.1309F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-0.5033F, 0.4362F, -4.0036F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -2.7875F, -1.4268F, -0.0197F, 0.1258F, -0.0363F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(80, 27).mirror().addBox(-0.5033F, -0.1916F, -4.1423F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -2.7875F, -1.4268F, 0.1373F, 0.1258F, -0.0363F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(98, 90).mirror().addBox(-0.4377F, -0.021F, -0.0544F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -1.4998F, 5.2116F, -0.5278F, -0.2055F, 0.0405F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(68, 41).mirror().addBox(-5.0F, -0.0249F, 1.0025F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(68, 41).addBox(2.0F, -0.0249F, 1.0025F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, -3.1076F, -2.6257F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(94, 77).mirror().addBox(0.0F, -1.583F, -0.2122F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -0.6998F, 2.9116F, -0.3358F, -0.2055F, 0.0405F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(62, 64).mirror().addBox(-0.0791F, -0.2765F, -0.0699F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 7.2479F, 7.3621F, -1.113F, 0.1902F, -0.1849F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(49, 64).mirror().addBox(-0.5F, 0.9908F, 2.4099F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 1.7479F, 2.3621F, -0.6458F, 0.2967F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(88, 62).mirror().addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.2202F, 5.1728F, 2.9502F, -0.0873F, 0.2967F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(31, 90).mirror().addBox(-0.5F, -0.5299F, -3.2279F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(31, 90).addBox(6.5F, -0.5299F, -3.2279F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-3.5F, 3.2298F, 3.5708F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(70, 55).mirror().addBox(-1.2162F, -0.5399F, -0.4772F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 1.9813F, -1.8239F, -0.7613F, 0.3253F, -0.0656F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(67, 27).mirror().addBox(-0.0072F, -0.6366F, -0.1043F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 4.9813F, 1.3761F, -0.6216F, 0.3253F, -0.0656F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-0.2719F, -0.9661F, -2.3783F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 4.1479F, 3.0621F, -1.2816F, 0.3081F, 0.0039F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-0.1697F, -0.1121F, -3.751F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 1.0125F, -2.8268F, -0.0698F, 0.1309F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(16, 97).mirror().addBox(0.0F, 2.9005F, -3.0953F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -2.8875F, -1.5268F, 0.4189F, 0.1309F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(34, 62).mirror().addBox(-3.0F, 1.0F, 0.4F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(34, 62).addBox(1.0F, 1.0F, 0.4F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4076F, -1.8257F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(55, 44).mirror().addBox(-5.0F, -0.0054F, -3.8615F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(55, 44).addBox(2.0F, -0.0054F, -3.8615F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4076F, 3.1743F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(13, 65).mirror().addBox(-0.5F, -0.7F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7508F, -0.0857F, 4.0478F, -0.074F, -0.2055F, 0.0405F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 57).addBox(-0.4967F, 0.4362F, -4.0036F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -2.7875F, -1.4268F, -0.0197F, -0.1258F, 0.0363F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(80, 27).addBox(-0.4967F, -0.1916F, -4.1423F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.5F, -2.7875F, -1.4268F, 0.1373F, -0.1258F, 0.0363F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(98, 90).addBox(-0.5623F, -0.021F, -0.0544F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -1.4998F, 5.2116F, -0.5278F, 0.2055F, -0.0405F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(94, 77).addBox(-1.0F, -1.583F, -0.2122F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.0F, -0.6998F, 2.9116F, -0.3358F, 0.2055F, -0.0405F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(31, 76).addBox(-0.4F, -0.9F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7409F, 11.2756F, 8.72F, -1.5668F, -0.1902F, 0.1849F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(62, 64).addBox(-0.9209F, -0.2765F, -0.0699F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.3F, 7.2479F, 7.3621F, -1.113F, -0.1902F, 0.1849F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(49, 64).addBox(-0.5F, 0.9908F, 2.4099F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, 1.7479F, 2.3621F, -0.6458F, -0.2967F, 0.0F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(93, 96).addBox(-0.2661F, -0.2733F, -0.2354F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.2202F, 5.1728F, 2.1502F, 0.8901F, -0.2967F, 0.0F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(88, 62).addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.2202F, 5.1728F, 2.9502F, -0.0873F, -0.2967F, 0.0F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(70, 55).addBox(0.2162F, -0.5399F, -0.4772F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9F, 1.9813F, -1.8239F, -0.7613F, -0.3253F, 0.0656F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(67, 27).addBox(-0.9928F, -0.6366F, -0.1043F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9F, 4.9813F, 1.3761F, -0.6216F, -0.3253F, 0.0656F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(91, 27).addBox(-0.7281F, -0.0898F, -2.2058F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.4F, 4.1479F, 3.0621F, -1.0373F, -0.3081F, -0.0039F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 91).addBox(-0.7281F, -0.9661F, -2.3783F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.4F, 4.1479F, 3.0621F, -1.2816F, -0.3081F, -0.0039F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(31, 80).addBox(-0.8303F, -0.1121F, -3.851F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.0F, 1.0125F, -2.8268F, 0.1745F, -0.1309F, 0.0F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 65).addBox(-0.8303F, -0.1121F, -3.751F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.0F, 1.0125F, -2.8268F, -0.0698F, -0.1309F, 0.0F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(16, 97).addBox(-1.0F, 2.9005F, -3.0953F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -2.8875F, -1.5268F, 0.4189F, -0.1309F, 0.0F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(13, 65).addBox(-0.5F, -0.7F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.7508F, -0.0857F, 4.0478F, -0.074F, 0.2055F, -0.0405F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 33).addBox(-1.0F, 0.0F, 1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4076F, -4.8257F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(31, 17).addBox(0.0F, -0.3554F, -0.2055F, 0.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.1278F, -2.6223F, -0.096F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, 0.4587F, 1.241F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r41 = leftLeg.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(57, 102).addBox(-0.5F, -11.4343F, -6.4198F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.549F, 6.6736F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r42 = leftLeg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 72).addBox(-1.0F, -5.4F, -1.4F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3668F, -0.5757F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftLeg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(39, 69).addBox(-1.0F, -0.2254F, -0.1074F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.4668F, -1.6757F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftLeg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(81, 47).addBox(-1.0F, -14.8937F, -6.8715F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 23.3608F, 5.8013F, 0.192F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(69, 9).addBox(-1.9F, -0.2745F, -1.1999F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 12.6475F, -1.8549F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftLeg2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(9, 94).addBox(-0.5F, -5.8F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(47, 88).addBox(-0.5F, -3.0F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 5.4285F, 0.5756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(21, 105).addBox(-0.5F, 0.1159F, -0.9031F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2F, 8.3285F, 0.5756F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(88, 82).addBox(-1.0F, -1.0F, -0.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 8.9271F, -0.5874F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(93, 10).addBox(-1.9F, -15.0978F, 4.6681F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.2475F, -3.2467F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(63, 82).addBox(-1.9F, -11.735F, 1.4314F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(0, 80).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 10.6662F, -0.9948F, -0.8727F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(52, 29).addBox(-2.0F, -1.4696F, -1.8933F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8217F, 0.1167F, 0.4102F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(54, 0).addBox(-2.0F, -1.4F, -2.9F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0696F, -1.9933F, -0.2618F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, 0.4587F, 1.241F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r50 = rightLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(103, 30).addBox(-0.5F, -11.4343F, -6.4198F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.549F, 6.6736F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r51 = rightLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(11, 72).addBox(-1.0F, -5.4F, -1.4F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3668F, -0.5757F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r52 = rightLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(48, 71).addBox(-1.0F, -0.2254F, -0.1074F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.4668F, -1.6757F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r53 = rightLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(82, 6).addBox(-1.0F, -14.8937F, -6.8715F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 23.3608F, 5.8013F, 0.192F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(26, 69).addBox(-0.1F, -0.2745F, -1.1999F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 12.6475F, -1.8549F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r54 = rightLeg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(94, 50).addBox(-0.5F, -5.8F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(72, 91).addBox(-0.5F, -3.0F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 5.4285F, 0.5756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r55 = rightLeg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(45, 105).addBox(-0.5F, 0.1159F, -0.9031F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2F, 8.3285F, 0.5756F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r56 = rightLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(89, 33).addBox(-1.0F, -1.0F, -0.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 8.9271F, -0.5874F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r57 = rightLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(52, 93).addBox(-0.1F, -15.0978F, 4.6681F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.2475F, -3.2467F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r58 = rightLeg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(70, 82).addBox(-0.1F, -11.735F, 1.4314F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(11, 80).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 10.6662F, -0.9948F, -0.8727F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(63, 35).addBox(-2.0F, -1.4696F, -1.8933F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8217F, 0.1167F, 0.4102F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(38, 55).addBox(-2.0F, -1.4F, -2.9F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, -0.0696F, -1.9933F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(25, 35).addBox(-1.0F, -0.671F, -7.9355F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.6123F, -3.8127F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(104, 16).mirror().addBox(-3.4868F, -0.9855F, 0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.186F, -6.1912F, -0.1745F, -0.3615F, -0.9179F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(104, 18).mirror().addBox(-1.8203F, -0.2603F, 0.366F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.186F, -6.1912F, -0.2925F, -0.1964F, -0.4969F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(25, 33).mirror().addBox(-3.7437F, -2.3667F, 0.4744F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.186F, -6.1912F, 0.0025F, -0.3998F, -1.3867F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(29, 105).mirror().addBox(-3.6627F, -0.9506F, -0.4436F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2711F, -7.4162F, 0.0441F, -0.1069F, -0.9529F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(105, 20).mirror().addBox(-1.9078F, -0.1678F, -0.5606F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2711F, -7.4162F, 0.0089F, -0.0531F, -0.5185F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(46, 44).mirror().addBox(-5.9178F, -2.4095F, -0.4436F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2711F, -7.4162F, 0.0852F, -0.0783F, -1.3902F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(84, 4).mirror().addBox(-7.0482F, -2.8928F, -0.236F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7519F, -9.231F, 0.1102F, -0.0122F, -1.2882F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(100, 14).mirror().addBox(-3.9852F, -1.3335F, -0.236F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7519F, -9.231F, 0.0948F, -0.0576F, -0.854F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(101, 54).mirror().addBox(-2.3731F, -0.3779F, -0.3788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7519F, -9.231F, 0.0755F, -0.0296F, -0.4181F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(104, 84).mirror().addBox(-3.9141F, -1.3943F, -0.2708F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3519F, -11.231F, 0.2102F, 0.0735F, -0.8704F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(105, 5).mirror().addBox(-2.3318F, -0.4633F, -0.4099F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3519F, -11.231F, 0.2354F, 0.0405F, -0.4346F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(54, 9).mirror().addBox(-8.9581F, -2.9178F, -0.2708F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3519F, -11.231F, 0.1601F, 0.1551F, -1.302F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(104, 69).mirror().addBox(-3.943F, -1.4031F, -0.4941F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7519F, -12.831F, 0.2784F, 0.1533F, -0.8627F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(104, 82).mirror().addBox(-2.3478F, -0.4623F, -0.6347F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7519F, -12.831F, 0.3307F, 0.0844F, -0.4286F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(69, 16).mirror().addBox(-9.9806F, -2.938F, -0.4941F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7519F, -12.831F, 0.1888F, 0.256F, -1.2961F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(104, 16).addBox(1.4868F, -0.9855F, 0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.186F, -6.1912F, -0.1745F, 0.3615F, 0.9179F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(104, 18).addBox(-0.1797F, -0.2603F, 0.366F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.186F, -6.1912F, -0.2925F, 0.1964F, 0.4969F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(25, 33).addBox(2.7437F, -2.3667F, 0.4744F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.186F, -6.1912F, 0.0025F, 0.3998F, 1.3867F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(29, 105).addBox(1.6627F, -0.9506F, -0.4436F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2711F, -7.4162F, 0.0441F, 0.1069F, 0.9529F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(105, 20).addBox(-0.0922F, -0.1678F, -0.5606F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2711F, -7.4162F, 0.0089F, 0.0531F, 0.5185F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(46, 44).addBox(2.9178F, -2.4095F, -0.4436F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2711F, -7.4162F, 0.0852F, 0.0783F, 1.3902F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(84, 4).addBox(3.0482F, -2.8928F, -0.236F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7519F, -9.231F, 0.1102F, 0.0122F, 1.2882F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(100, 14).addBox(1.9852F, -1.3335F, -0.236F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7519F, -9.231F, 0.0948F, 0.0576F, 0.854F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(101, 54).addBox(0.3731F, -0.3779F, -0.3788F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7519F, -9.231F, 0.0755F, 0.0296F, 0.4181F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(104, 84).addBox(1.9141F, -1.3943F, -0.2708F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3519F, -11.231F, 0.2102F, -0.0735F, 0.8704F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(105, 5).addBox(0.3318F, -0.4633F, -0.4099F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3519F, -11.231F, 0.2354F, -0.0405F, 0.4346F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(54, 9).addBox(2.9581F, -2.9178F, -0.2708F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3519F, -11.231F, 0.1601F, -0.1551F, 1.302F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(104, 69).addBox(1.943F, -1.4031F, -0.4941F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7519F, -12.831F, 0.2784F, -0.1533F, 0.8627F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(104, 82).addBox(0.3478F, -0.4623F, -0.6347F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7519F, -12.831F, 0.3307F, -0.0844F, 0.4286F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(69, 16).addBox(2.9806F, -2.938F, -0.4941F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7519F, -12.831F, 0.1888F, -0.256F, 1.2961F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(19, 46).addBox(-1.0F, -0.392F, -6.9179F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2481F, -7.931F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(84, 96).addBox(0.01F, -5.482F, -1.9362F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2481F, -7.931F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(90, 96).addBox(0.01F, -5.3141F, -3.9471F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2481F, -7.931F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(87, 96).addBox(0.01F, -5.0313F, -5.9229F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2481F, -7.931F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(69, 96).addBox(0.01F, -5.6397F, -0.5012F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5207F, -7.4924F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(59, 93).addBox(0.01F, -6.4045F, -0.1008F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.632F, -1.8001F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(27, 92).addBox(0.01F, -6.0693F, -0.0073F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.632F, -3.9001F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(15, 57).addBox(0.01F, 1.919F, -1.5715F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.332F, -4.0001F, -0.0436F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8726F, -14.6793F, -0.131F, 0.0433F, -0.0057F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(67, 20).addBox(-1.0F, 0.0855F, 2.0911F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.0199F, -4.8724F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(26, 101).addBox(0.01F, -4.945F, -0.009F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1027F, -0.8792F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(102, 3).addBox(0.0F, -4.9168F, 0.0023F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1119F, -2.3853F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(101, 66).addBox(0.0F, -4.6804F, -0.9691F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5199F, -2.4724F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(18, 87).addBox(0.0F, -3.6285F, -2.8933F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5199F, -2.4724F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(94, 106).addBox(0.0F, -3.2139F, -4.786F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5199F, -2.4724F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(22, 76).mirror().addBox(0.069F, -2.4225F, -2.9904F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.6F, 10.4879F, -4.2018F, 1.3619F, -0.4451F, -1.1132F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(91, 20).mirror().addBox(0.0F, -1.4836F, -1.9712F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, 8.4879F, -4.2018F, 1.1355F, -0.2296F, -0.4552F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(80, 20).mirror().addBox(-6.0F, -0.065F, -4.0162F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 20).addBox(4.0F, -0.065F, -4.0162F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.7199F, -2.6724F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(19, 56).mirror().addBox(-6.0F, -0.2064F, -0.0137F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(19, 56).addBox(4.0F, -0.2064F, -0.0137F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 4.8199F, -2.5724F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(105, 86).mirror().addBox(-4.5929F, -1.1155F, -4.7896F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5199F, -2.4724F, 0.5252F, 0.423F, -0.7058F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(14, 105).mirror().addBox(-2.5483F, 0.0117F, -4.958F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5199F, -2.4724F, 0.6613F, 0.2323F, -0.2901F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(94, 56).mirror().addBox(-7.6911F, -2.9521F, -4.7896F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5199F, -2.4724F, 0.2963F, 0.6008F, -1.165F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(69, 18).mirror().addBox(-10.4004F, -2.9749F, -2.7589F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5199F, -2.4724F, 0.2799F, 0.55F, -1.191F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(105, 7).mirror().addBox(-2.505F, -0.197F, -2.9177F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5199F, -2.4724F, 0.6124F, 0.2103F, -0.3179F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(98, 105).mirror().addBox(-4.339F, -1.2591F, -2.7589F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5199F, -2.4724F, 0.4874F, 0.3836F, -0.7376F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(77, 105).mirror().addBox(-4.0548F, -1.3438F, -0.7997F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5199F, -2.4724F, 0.4365F, 0.3326F, -0.7727F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(104, 71).mirror().addBox(-2.4052F, -0.3659F, -0.9459F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5199F, -2.4724F, 0.5467F, 0.1834F, -0.3479F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(54, 7).mirror().addBox(-11.107F, -2.9315F, -0.7997F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5199F, -2.4724F, 0.256F, 0.4833F, -1.22F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(84, 104).mirror().addBox(-1.9308F, -0.1705F, -0.4074F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.6553F, -1.5387F, 0.4894F, 0.16F, -0.34F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(91, 104).mirror().addBox(-3.6728F, -0.9606F, -0.2893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.6553F, -1.5387F, 0.3927F, 0.288F, -0.7683F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(33, 12).mirror().addBox(-10.9228F, -2.4228F, -0.2893F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.6553F, -1.5387F, 0.2355F, 0.4252F, -1.2113F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(105, 56).mirror().addBox(-1.9143F, -0.1826F, -0.2012F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.641F, -0.175F, 0.4572F, 0.1458F, -0.3622F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(0, 105).mirror().addBox(-3.6399F, -0.9619F, -0.0847F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.641F, -0.175F, 0.3687F, 0.2617F, -0.7922F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(33, 14).mirror().addBox(-10.8924F, -2.4101F, -0.0847F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.641F, -0.175F, 0.225F, 0.3915F, -1.2328F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(55, 55).mirror().addBox(-6.0F, -0.2064F, -0.0137F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(55, 55).addBox(4.0F, -0.2064F, -0.0137F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 4.8199F, -2.5724F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(89, 92).mirror().addBox(-0.3697F, -0.0285F, -0.3475F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 13.2924F, 0.445F, 0.7524F, -0.9605F, -0.4665F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(77, 82).mirror().addBox(-0.3697F, 0.7758F, 2.5341F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 13.2924F, 0.445F, 1.0665F, -0.9605F, -0.4665F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(-0.5933F, 1.0046F, 2.886F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 13.2924F, 0.345F, 0.8819F, -0.8716F, -0.26F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(92, 46).mirror().addBox(-0.5933F, 0.0804F, 0.0579F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 13.2924F, 0.345F, 0.5678F, -0.8716F, -0.26F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(70, 71).mirror().addBox(-0.2666F, -0.3227F, 0.4338F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 13.3924F, -0.155F, -0.6172F, -1.2816F, 1.0529F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(57, 71).mirror().addBox(-0.5F, -0.0141F, 0.956F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 13.3924F, -0.155F, -1.5103F, -1.3972F, 1.8597F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(63, 91).mirror().addBox(-0.75F, -0.7837F, 0.0237F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 12.7797F, -2.473F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(83, 77).mirror().addBox(-1.25F, -0.5F, -3.4F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(83, 77).addBox(1.15F, -0.5F, -3.4F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.95F, 12.6797F, -1.973F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(22, 76).addBox(-1.069F, -2.4225F, -2.9904F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.6F, 10.4879F, -4.2018F, 1.3619F, 0.4451F, 1.1132F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(91, 20).addBox(-1.0F, -1.4836F, -1.9712F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5F, 8.4879F, -4.2018F, 1.1355F, 0.2296F, 0.4552F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(105, 86).addBox(2.5929F, -1.1155F, -4.7896F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5199F, -2.4724F, 0.5252F, -0.423F, 0.7058F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(14, 105).addBox(0.5483F, 0.0117F, -4.958F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5199F, -2.4724F, 0.6613F, -0.2323F, 0.2901F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(94, 56).addBox(3.6911F, -2.9521F, -4.7896F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5199F, -2.4724F, 0.2963F, -0.6008F, 1.165F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(69, 18).addBox(3.4004F, -2.9749F, -2.7589F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5199F, -2.4724F, 0.2799F, -0.55F, 1.191F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(105, 7).addBox(0.505F, -0.197F, -2.9177F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5199F, -2.4724F, 0.6124F, -0.2103F, 0.3179F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(98, 105).addBox(2.339F, -1.2591F, -2.7589F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5199F, -2.4724F, 0.4874F, -0.3836F, 0.7376F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(77, 105).addBox(2.0548F, -1.3438F, -0.7997F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5199F, -2.4724F, 0.4365F, -0.3326F, 0.7727F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(104, 71).addBox(0.4052F, -0.3659F, -0.9459F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5199F, -2.4724F, 0.5467F, -0.1834F, 0.3479F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(54, 7).addBox(3.107F, -2.9315F, -0.7997F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5199F, -2.4724F, 0.256F, -0.4833F, 1.22F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(84, 104).addBox(-0.0692F, -0.1705F, -0.4074F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.6553F, -1.5387F, 0.4894F, -0.16F, 0.34F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(91, 104).addBox(1.6728F, -0.9606F, -0.2893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.6553F, -1.5387F, 0.3927F, -0.288F, 0.7683F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(33, 12).addBox(2.9228F, -2.4228F, -0.2893F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.6553F, -1.5387F, 0.2355F, -0.4252F, 1.2113F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(105, 56).addBox(-0.0857F, -0.1826F, -0.2012F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.641F, -0.175F, 0.4572F, -0.1458F, 0.3622F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(0, 105).addBox(1.6399F, -0.9619F, -0.0847F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.641F, -0.175F, 0.3687F, -0.2617F, 0.7922F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(33, 14).addBox(2.8924F, -2.4101F, -0.0847F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.641F, -0.175F, 0.225F, -0.3915F, 1.2328F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(89, 92).addBox(-0.6303F, -0.0285F, -0.3475F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 13.2924F, 0.445F, 0.7524F, 0.9605F, 0.4665F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(77, 82).addBox(-0.6303F, 0.7758F, 2.5341F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 13.2924F, 0.445F, 1.0665F, 0.9605F, 0.4665F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(71, 0).addBox(-0.4067F, 1.0046F, 2.886F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 13.2924F, 0.345F, 0.8819F, 0.8716F, 0.26F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(92, 46).addBox(-0.4067F, 0.0804F, 0.0579F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 13.2924F, 0.345F, 0.5678F, 0.8716F, 0.26F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(70, 71).addBox(-0.7334F, -0.3227F, 0.4338F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 13.3924F, -0.155F, -0.6172F, 1.2816F, -1.0529F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(57, 71).addBox(-0.5F, -0.0141F, 0.956F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 13.3924F, -0.155F, -1.5103F, 1.3972F, -1.8597F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(63, 91).addBox(-0.25F, -0.7837F, 0.0237F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.95F, 12.7797F, -2.473F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(38, 46).addBox(-1.0F, -0.9762F, -5.9611F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5199F, -2.4724F, 0.7592F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.7523F, 10.6437F, -1.6645F, 0.8893F, 0.1356F, -0.1363F));

		PartDefinition cube_r156 = leftArm.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(94, 72).addBox(0.0F, -2.3F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4736F, 8.4624F, 1.3754F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r157 = leftArm.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(40, 97).addBox(0.0419F, -15.7734F, -7.7275F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5155F, 15.1874F, 11.8638F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r158 = leftArm.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(62, 106).addBox(-0.3441F, -2.0321F, 0.0903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3984F, -0.7317F, -1.0971F, -1.0374F, -0.4743F, -0.0768F));

		PartDefinition cube_r159 = leftArm.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(79, 99).addBox(-0.5F, -2.3784F, -0.7587F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3984F, 1.6683F, -0.3971F, -0.06F, -0.4743F, -0.0768F));

		PartDefinition cube_r160 = leftArm.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(101, 38).addBox(-0.2622F, -0.0365F, -0.1809F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6168F, 3.2178F, -1.1103F, 0.5073F, -0.4743F, -0.0768F));

		PartDefinition cube_r161 = leftArm.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(30, 95).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0264F, 1.8936F, 0.3562F, -0.0278F, 0.0171F, -0.0061F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(53, 82).addBox(-0.5909F, -0.1079F, -0.2717F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(84, 87).addBox(-0.5909F, 1.8921F, -1.3717F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.523F, 7.1971F, 1.8766F, -0.8283F, 0.1788F, 0.0722F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(11, 87).addBox(-0.508F, -0.0675F, -1.0751F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.358F, 8.781F, -0.2268F, 0.2294F, 0.3165F, 0.1985F));

		PartDefinition cube_r162 = leftArm3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(100, 26).addBox(-0.5F, -0.1301F, -1.9608F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.008F, 0.0807F, -1.0948F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r163 = leftArm3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(26, 65).addBox(12.3545F, -3.1239F, -11.9898F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-11.2929F, 10.0564F, 10.9147F, 0.0F, 0.0F, -0.3054F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create().texOffs(72, 103).addBox(-0.5945F, -0.2848F, -0.5127F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0365F, 0.3564F, 0.6637F, 0.48F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.7523F, 10.6437F, -1.6645F, 0.3429F, -0.2878F, 0.3105F));

		PartDefinition cube_r164 = rightArm.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(77, 94).addBox(-1.0F, -2.3F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4736F, 8.4624F, 1.3754F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r165 = rightArm.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(98, 32).addBox(-1.0419F, -15.7734F, -7.7275F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5155F, 15.1874F, 11.8638F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r166 = rightArm.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(84, 106).addBox(-0.6559F, -2.0321F, 0.0903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3984F, -0.7317F, -1.0971F, -1.0374F, 0.4743F, 0.0768F));

		PartDefinition cube_r167 = rightArm.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(100, 96).addBox(-0.5F, -2.3784F, -0.7587F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3984F, 1.6683F, -0.3971F, -0.06F, 0.4743F, 0.0768F));

		PartDefinition cube_r168 = rightArm.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(101, 44).addBox(-0.7378F, -0.0365F, -0.1809F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6168F, 3.2178F, -1.1103F, 0.5073F, 0.4743F, 0.0768F));

		PartDefinition cube_r169 = rightArm.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(35, 95).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0264F, 1.8936F, 0.3562F, -0.0278F, -0.0171F, 0.0061F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(58, 82).addBox(-0.4091F, -0.1079F, -0.2717F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(42, 88).addBox(-0.4091F, 1.8921F, -1.3717F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.523F, 7.1971F, 1.8766F, -0.8856F, -0.299F, 0.0282F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(77, 87).addBox(-0.492F, -0.0675F, -1.0751F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.358F, 8.781F, -0.2268F, 0.5846F, -0.2204F, -0.5468F));

		PartDefinition cube_r170 = rightArm3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(93, 100).addBox(-0.5F, -0.1301F, -1.9608F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.008F, 0.0807F, -1.0948F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r171 = rightArm3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(75, 67).addBox(-13.3545F, -3.1239F, -11.9898F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(11.2929F, 10.0564F, 10.9147F, 0.0F, 0.0F, 0.3054F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create().texOffs(9, 104).addBox(-0.4055F, -0.2848F, -0.5127F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0365F, 0.3564F, 0.6637F, 0.48F, 0.0F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.4632F, -6.9852F, -0.3499F, 0.0852F, -0.0189F));

		PartDefinition cube_r172 = neck4.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(108, 79).addBox(0.0F, -2.7F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 88).addBox(0.0F, -3.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 48).addBox(-1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.9F, -4.1F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r173 = neck4.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(105, 22).mirror().addBox(-1.937F, -0.096F, -0.8625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4438F, -2.5481F, 0.9908F, 0.7898F, -0.2967F));

		PartDefinition cube_r174 = neck4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(98, 24).mirror().addBox(-4.738F, -0.9017F, -0.7421F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4438F, -2.5481F, 0.5077F, 1.0466F, -0.8935F));

		PartDefinition cube_r175 = neck4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(105, 105).mirror().addBox(-3.7067F, -0.9454F, -0.4186F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.557F, -0.7557F, 0.9212F, 0.7816F, -0.6038F));

		PartDefinition cube_r176 = neck4.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(105, 3).mirror().addBox(-1.947F, -0.1443F, -0.5383F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.557F, -0.7557F, 1.1217F, 0.4433F, -0.2623F));

		PartDefinition cube_r177 = neck4.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(98, 94).mirror().addBox(-5.9599F, -2.4233F, -0.4186F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.557F, -0.7557F, 0.4635F, 1.0702F, -1.1655F));

		PartDefinition cube_r178 = neck4.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(105, 22).addBox(-0.063F, -0.096F, -0.8625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4438F, -2.5481F, 0.9908F, -0.7898F, 0.2967F));

		PartDefinition cube_r179 = neck4.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(98, 24).addBox(1.738F, -0.9017F, -0.7421F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4438F, -2.5481F, 0.5077F, -1.0466F, 0.8935F));

		PartDefinition cube_r180 = neck4.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(105, 105).addBox(1.7067F, -0.9454F, -0.4186F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.557F, -0.7557F, 0.9212F, -0.7816F, 0.6038F));

		PartDefinition cube_r181 = neck4.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(105, 3).addBox(-0.053F, -0.1443F, -0.5383F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.557F, -0.7557F, 1.1217F, -0.4433F, 0.2623F));

		PartDefinition cube_r182 = neck4.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(98, 94).addBox(2.9599F, -2.4233F, -0.4186F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.557F, -0.7557F, 0.4635F, -1.0702F, 1.1655F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8524F, -2.5106F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r183 = neck3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(89, 38).addBox(0.0F, -2.6F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 34).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5477F, -3.8023F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4523F, -3.3023F, 0.1537F, 0.3262F, 0.2153F));

		PartDefinition cube_r184 = neck2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(108, 76).addBox(0.0F, -0.522F, -0.04F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 73).addBox(0.0F, -0.622F, 1.96F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 53).addBox(0.0F, -0.722F, 3.96F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 20).addBox(-0.5F, -0.022F, -0.04F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.9F, -4.3F, -0.5934F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.1F, -4.7F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r185 = neck.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(94, 67).addBox(-0.5F, 0.2F, 1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.8F, -0.2967F, 0.0F, 0.0F));

		PartDefinition heads = neck.addOrReplaceChild("heads", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2341F, -1.3186F, -0.6329F, 0.2569F, 0.0785F));

		PartDefinition cube_r186 = heads.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(73, 6).addBox(-1.5F, -0.2635F, 0.0557F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8279F, -8.7808F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r187 = heads.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(84, 0).addBox(-1.5F, -0.3957F, -1.5949F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.8279F, -8.7808F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r188 = heads.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(29, 107).addBox(-1.1F, 0.0114F, -0.9893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6F, 3.1225F, -10.2301F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r189 = heads.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(98, 20).addBox(-0.8F, 0.06F, -1.9944F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3F, 1.4225F, -9.3301F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r190 = heads.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(97, 82).addBox(-0.8F, 0.0051F, -1.9786F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.1225F, -7.8301F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r191 = heads.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(89, 87).addBox(-0.8F, -0.0059F, -0.0289F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3F, 0.1225F, -7.8301F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r192 = heads.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(57, 77).addBox(-1.0F, -1.0408F, -0.3507F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 1.8225F, -5.3301F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r193 = heads.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(100, 102).addBox(-1.3F, -0.9832F, -1.012F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, 4.1765F, -8.7937F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r194 = heads.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(29, 102).addBox(-1.0F, -0.9978F, -0.9063F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.7765F, -7.9937F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r195 = heads.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(93, 6).addBox(-1.0F, -0.5F, 0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 3.6765F, -8.6937F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r196 = heads.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(62, 101).mirror().addBox(-0.5F, -2.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(62, 101).addBox(2.5F, -2.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5F, 1.1116F, 0.0382F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r197 = heads.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(50, 99).mirror().addBox(-2.0F, 0.3169F, 0.1897F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(50, 99).addBox(1.0F, 0.3169F, 0.1897F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -2.4775F, 1.0699F, -1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r198 = heads.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(63, 41).mirror().addBox(-2.0F, 0.1617F, 0.0035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(63, 41).addBox(1.0F, 0.1617F, 0.0035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -3.2775F, -0.7301F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r199 = heads.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(107, 62).mirror().addBox(-2.0F, 0.2362F, -0.0135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(107, 62).addBox(1.0F, 0.2362F, -0.0135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -3.0775F, 0.2699F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r200 = heads.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(107, 65).mirror().addBox(-0.5F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.92F, -2.2009F, -2.2207F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r201 = heads.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(108, 30).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.92F, -2.4405F, -1.2447F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r202 = heads.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(107, 102).mirror().addBox(-0.5F, -0.9149F, 0.0075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.52F, -0.604F, -1.9308F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r203 = heads.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(108, 50).mirror().addBox(-0.5F, -1.0003F, -0.0281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.52F, -1.404F, -1.6308F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r204 = heads.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(89, 106).mirror().addBox(-0.5F, -0.8F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.52F, -0.8137F, -0.5738F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r205 = heads.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(14, 107).mirror().addBox(-1.43F, -0.2308F, -1.3176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.5748F, -3.5681F, -1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r206 = heads.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(67, 104).mirror().addBox(-1.43F, -1.9966F, -0.9638F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.2748F, -3.2681F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r207 = heads.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(107, 27).mirror().addBox(-1.43F, 0.0206F, -0.9737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -1.4252F, -3.9681F, 1.8239F, 0.0F, 0.0F));

		PartDefinition cube_r208 = heads.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(107, 24).mirror().addBox(-1.43F, -0.0586F, -1.0203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.8252F, -4.6681F, 2.33F, 0.0F, 0.0F));

		PartDefinition cube_r209 = heads.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(97, 62).mirror().addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.53F, -0.9881F, -3.6341F, -2.6616F, 0.0F, 0.0F));

		PartDefinition cube_r210 = heads.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(97, 16).mirror().addBox(-0.4F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.979F, -1.5861F, -4.4033F, 0.6209F, -0.2494F, -0.0804F));

		PartDefinition cube_r211 = heads.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(101, 79).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(102, 0).mirror().addBox(-1.17F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.05F, -0.744F, -3.493F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r212 = heads.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(100, 10).mirror().addBox(0.3F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(100, 10).addBox(0.32F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.81F, 1.7648F, -8.2252F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r213 = heads.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(9, 100).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(9, 100).addBox(0.52F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.51F, 1.905F, -8.0826F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r214 = heads.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(83, 72).addBox(-1.3F, -0.6223F, -4.9617F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3F, 0.1225F, -5.7301F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r215 = heads.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(81, 41).addBox(-1.3F, -0.7F, -1.4F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 1.0149F, -6.8766F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r216 = heads.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(22, 86).mirror().addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(22, 86).addBox(2.6F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3F, 2.0522F, -5.2414F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r217 = heads.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(70, 77).addBox(-1.5F, -1.0266F, -2.9765F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3225F, -2.7301F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r218 = heads.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(82, 12).addBox(-1.5F, -0.6284F, 1.0587F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.2225F, -8.3301F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r219 = heads.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(83, 58).addBox(-1.0F, 0.1599F, -2.0245F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, -2.2775F, -3.5301F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r220 = heads.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(86, 16).addBox(-1.0F, 0.1515F, -1.9558F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, -2.9775F, -1.7301F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r221 = heads.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(31, 86).addBox(-2.0F, 0.2226F, -1.1241F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -3.3775F, -0.6301F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r222 = heads.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(62, 96).addBox(1.0F, 1.0402F, -0.1756F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -3.0775F, -1.5301F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r223 = heads.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(108, 50).addBox(-0.5F, -1.0003F, -0.0281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.52F, -1.404F, -1.6308F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r224 = heads.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(108, 30).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.92F, -2.4405F, -1.2447F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r225 = heads.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(107, 65).addBox(-0.5F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.92F, -2.2009F, -2.2207F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r226 = heads.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(107, 102).addBox(-0.5F, -0.9149F, 0.0075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.52F, -0.604F, -1.9308F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r227 = heads.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(89, 106).addBox(-0.5F, -0.8F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.52F, -0.8137F, -0.5738F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r228 = heads.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(102, 0).addBox(-0.83F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(101, 79).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.05F, -0.744F, -3.493F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r229 = heads.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(107, 27).addBox(0.43F, 0.0206F, -0.9737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -1.4252F, -3.9681F, 1.8239F, 0.0F, 0.0F));

		PartDefinition cube_r230 = heads.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(107, 24).addBox(0.43F, -0.0586F, -1.0203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6F, -0.8252F, -4.6681F, 2.33F, 0.0F, 0.0F));

		PartDefinition cube_r231 = heads.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(97, 62).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.53F, -0.9881F, -3.6341F, -2.6616F, 0.0F, 0.0F));

		PartDefinition cube_r232 = heads.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(67, 104).addBox(0.43F, -1.9966F, -0.9638F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.6F, 0.2748F, -3.2681F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r233 = heads.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(14, 107).addBox(0.43F, -0.2308F, -1.3176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.5748F, -3.5681F, -1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r234 = heads.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(75, 62).addBox(-2.0F, -2.0024F, -1.9669F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.8225F, -1.4301F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r235 = heads.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(0, 87).addBox(-2.0F, -2.0024F, 0.0331F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8225F, -1.4301F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r236 = heads.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(52, 12).addBox(-2.0F, -0.8F, -3.1F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.007F))
				.texOffs(83, 53).addBox(-1.5F, 0.0F, -5.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.6775F, -1.5301F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r237 = heads.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(97, 16).addBox(-0.6F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.979F, -1.5861F, -4.4033F, 0.6209F, 0.2494F, 0.0804F));

		PartDefinition cube_r238 = heads.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(83, 67).addBox(-1.0F, 0.029F, 0.0341F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, -0.4775F, -6.4301F, 0.5323F, 0.0F, 0.0F));

		PartDefinition jaw = heads.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(42, 82).addBox(0.9F, -0.0981F, -3.7843F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F))
				.texOffs(42, 82).mirror().addBox(-1.9F, -0.0981F, -3.7843F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.4266F, -0.2013F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r239 = jaw.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(56, 107).mirror().addBox(-1.0F, -1.0419F, 0.0111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(56, 107).addBox(1.8F, -1.0419F, 0.0111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.9F, 0.8F, 0.9F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r240 = jaw.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(0, 107).mirror().addBox(-1.0F, -0.9999F, -0.0843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 107).addBox(1.8F, -0.9999F, -0.0843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 0.9F, 0.0F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r241 = jaw.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(16, 101).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(16, 101).addBox(2.3F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.4F, -1.9629F, -2.3316F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r242 = jaw.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(101, 58).mirror().addBox(-1.0F, -0.4F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(101, 58).addBox(1.8F, -0.4F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.9F, -0.7968F, -2.3512F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r243 = jaw.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(100, 107).mirror().addBox(-1.0F, -0.0247F, -0.5398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(100, 107).addBox(1.8F, -0.0247F, -0.5398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, -1.3F, -1.4F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r244 = jaw.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(101, 50).mirror().addBox(-1.0F, -0.1F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(101, 50).addBox(1.8F, -0.1F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 0.0F, 0.2F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r245 = jaw.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(107, 12).mirror().addBox(-1.0F, 0.5474F, -0.6071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(107, 12).addBox(1.0F, 0.5474F, -0.6071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, -0.7F, -3.7F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r246 = jaw.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(18, 92).mirror().addBox(-1.0F, -0.8F, -4.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(18, 92).addBox(1.8F, -0.8F, -4.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.9F, 0.0F, 0.3F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r247 = jaw.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(95, 0).mirror().addBox(-0.4F, -0.7336F, -1.7052F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 0).addBox(2.0F, -0.7336F, -1.7052F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, -0.4F, -4.1F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r248 = jaw.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(72, 99).mirror().addBox(-1.0F, -0.0348F, -2.0313F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(72, 99).addBox(1.0F, -0.0348F, -2.0313F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.7F, -3.7F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r249 = jaw.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(107, 9).mirror().addBox(-1.5F, -0.0701F, 0.5709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -7.2F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r250 = jaw.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(98, 86).mirror().addBox(-1.0F, 0.2923F, -2.8278F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(98, 86).addBox(1.0F, 0.2923F, -2.8278F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.7F, -3.7F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r251 = jaw.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(94, 58).mirror().addBox(-0.5F, -0.9575F, -1.4591F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.5F, -7.9F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r252 = jaw.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(107, 9).addBox(0.5F, -0.0701F, 0.5709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.2F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r253 = jaw.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(92, 42).addBox(-1.0F, -0.0231F, -1.5139F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.1F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r254 = jaw.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(101, 76).addBox(-1.5F, -0.9455F, -0.0177F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7425F, -9.1591F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r255 = jaw.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(101, 73).addBox(-1.5F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0425F, -9.4591F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r256 = jaw.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(94, 58).addBox(-0.5F, -0.9575F, -1.4591F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 1.5F, -7.9F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r257 = jaw.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(103, 35).addBox(-1.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 1.1411F, -7.8844F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r258 = jaw.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(92, 38).addBox(-1.5F, -0.7F, -1.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 0.7993F, -6.0106F, 0.3316F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -0.8268F, -0.3252F, 2.0F, 2.0F, 13.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2076F, 5.9743F, -0.062F, -0.2589F, 0.0589F));

		PartDefinition cube_r259 = tail.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(53, 103).addBox(0.0F, -0.2134F, 0.0095F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1566F, 1.2731F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r260 = tail.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(104, 62).addBox(0.0F, -0.0033F, -0.0772F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7566F, 3.1731F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r261 = tail.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(105, 96).addBox(0.0F, 3.0375F, 5.3284F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 88).addBox(0.0F, 2.2764F, 3.5232F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 103).addBox(0.0F, 0.7154F, 1.718F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 103).addBox(0.0F, -0.1456F, -0.0871F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6566F, 5.2731F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r262 = tail.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(36, 102).addBox(0.0F, -5.9382F, 6.2324F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 97).addBox(0.0F, -6.0382F, 4.2324F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 96).addBox(0.0F, -6.5382F, 2.2324F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 96).addBox(0.0F, -6.4382F, 0.2324F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.747F, 4.3781F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r263 = tail.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(0, 96).addBox(0.0F, -6.9721F, 1.9966F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9261F, 0.5379F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r264 = tail.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(6, 96).addBox(0.0F, -6.4366F, 0.0734F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9261F, 0.5379F, -0.1484F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(33, 0).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1221F, 12.6761F, 0.1052F, -0.3083F, 0.0098F));

		PartDefinition cube_r265 = tail2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(67, 108).addBox(0.0F, -1.9892F, -0.094F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5918F, 8.0557F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r266 = tail2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(106, 44).addBox(0.0F, -2.5238F, 0.0027F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5918F, 6.0557F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r267 = tail2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(34, 56).addBox(0.0F, -4.6228F, 3.6852F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 38).addBox(0.0F, -4.5228F, 1.7852F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5918F, 0.0557F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r268 = tail2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(105, 107).addBox(0.0F, 6.7836F, 12.7894F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 107).addBox(0.0F, 6.0344F, 10.935F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 107).addBox(0.0F, 5.2852F, 9.0806F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 107).addBox(0.0F, 4.536F, 7.2263F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7787F, -7.4031F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r269 = tail2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(42, 103).addBox(0.0F, -4.1228F, -0.0148F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5918F, 0.0557F, -0.2531F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 46).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.043F, 8.741F, -0.063F, -0.351F, -0.022F));

		PartDefinition cube_r270 = tail3.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(108, 91).addBox(0.0F, -1.5707F, 3.8528F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 58).addBox(0.0F, -1.4707F, 1.8528F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4778F, 3.0491F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r271 = tail3.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(26, 108).addBox(0.0F, -1.5707F, -0.1472F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4778F, 3.0491F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r272 = tail3.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(11, 109).addBox(0.0F, 11.783F, 20.2452F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 108).addBox(0.0F, 10.0663F, 18.378F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 108).addBox(0.0F, 9.3495F, 16.5109F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 107).addBox(0.0F, 7.5328F, 14.6437F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8217F, -16.1441F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r273 = tail3.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(22, 72).addBox(0.0F, -1.8819F, -0.3259F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4778F, 1.3491F, -0.3054F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(46, 35).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0015F, 7.8855F, -0.0789F, 0.4309F, -0.1123F));

		PartDefinition cube_r274 = tail4.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(108, 97).addBox(0.0F, -1.5707F, 7.7528F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 94).addBox(0.0F, -1.5707F, 5.7528F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4763F, -4.8364F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r275 = tail4.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(8, 109).addBox(0.0F, 14.3094F, 25.6852F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 0).addBox(0.0F, 13.4959F, 23.8581F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 107).addBox(0.0F, 12.6825F, 22.031F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8232F, -24.0296F, 0.5411F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0253F, 6.9951F, -0.1415F, 0.3892F, -0.054F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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