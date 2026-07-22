package fossils.fossils.client.blockentity.model.glyptodon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GlyptodonFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightArm7;
	private final ModelPart rightArm6;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftArm7;
	private final ModelPart leftArm6;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart body2;
	private final ModelPart body5;
	private final ModelPart body;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart leftSygomaticarch;
	private final ModelPart rightSygomaticarch;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public GlyptodonFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone2 = this.hips.getChild("bone2");
		this.bone4 = this.hips.getChild("bone4");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightArm7 = this.rightLeg3.getChild("rightArm7");
		this.rightArm6 = this.rightArm7.getChild("rightArm6");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftArm7 = this.leftLeg3.getChild("leftArm7");
		this.leftArm6 = this.leftArm7.getChild("leftArm6");
		this.body4 = this.hips.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.body2 = this.body3.getChild("body2");
		this.body5 = this.body2.getChild("body5");
		this.body = this.body5.getChild("body");
		this.bone = this.body.getChild("bone");
		this.bone3 = this.body.getChild("bone3");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.leftSygomaticarch = this.head.getChild("leftSygomaticarch");
		this.rightSygomaticarch = this.head.getChild("rightSygomaticarch");
		this.jaw = this.head.getChild("jaw");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -21.2608F, 7.7124F, 0.448F, 0.4279F, 0.003F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(53, 110).addBox(-0.5F, -0.525F, -0.95F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.4322F, -5.1098F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(102, 83).addBox(-0.5F, -2.5F, -1.375F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -2.9584F, -1.8043F, -2.0246F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(76, 74).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.015F, -0.2553F, -0.0883F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 107).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.9938F, 5.7003F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(69, 122).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.7469F, 4.7154F, -1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(11, 118).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.2901F, 3.4433F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(65, 48).addBox(-0.5F, -2.15F, -2.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2456F, -0.9875F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(44, 114).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -6.1791F, -1.1296F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(74, 83).addBox(-0.5F, -1.1F, -2.55F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 4.7676F, 3.6741F, -2.4609F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(65, 109).addBox(-0.5F, -0.7011F, 4.2991F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.2672F, -0.5033F, -0.9338F, 0.0F, 0.0F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8565F, 5.7065F, -4.5769F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r11 = bone2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(126, 92).addBox(-4.8073F, -5.2957F, -2.1751F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5188F, -5.8991F, -1.5406F, 0.0749F, -0.0236F, 0.3045F));

		PartDefinition cube_r12 = bone2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(60, 120).addBox(-1.6337F, -5.534F, -5.9059F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5188F, -5.8991F, -1.5406F, -0.3632F, 0.5673F, -0.1325F));

		PartDefinition cube_r13 = bone2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(90, 126).addBox(-0.3F, -1.15F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2441F, -5.0645F, -2.801F, -1.7132F, 0.0709F, 0.0263F));

		PartDefinition cube_r14 = bone2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(130, 47).addBox(-1.0181F, 0.9711F, -1.7907F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5188F, -5.8991F, -1.5406F, -1.6329F, 0.0231F, -0.1289F));

		PartDefinition cube_r15 = bone2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(129, 82).addBox(-0.3586F, 0.5696F, -7.2767F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5188F, -5.8991F, -1.5406F, -1.3892F, 0.0864F, -0.4282F));

		PartDefinition cube_r16 = bone2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(129, 11).addBox(-0.3586F, -0.8386F, -5.5197F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5188F, -5.8991F, -1.5406F, -1.1274F, 0.0864F, -0.4282F));

		PartDefinition cube_r17 = bone2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(129, 0).addBox(-0.3586F, 0.417F, -3.9883F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5188F, -5.8991F, -1.5406F, -1.4329F, 0.0864F, -0.4282F));

		PartDefinition cube_r18 = bone2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(76, 102).addBox(-0.3086F, 0.7554F, -6.0162F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5188F, -5.8991F, -1.5406F, -1.5725F, 0.0864F, -0.4282F));

		PartDefinition cube_r19 = bone2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(128, 107).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1831F, -7.0776F, -2.6814F, -1.3711F, 0.0231F, -0.1289F));

		PartDefinition cube_r20 = bone2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(46, 105).addBox(-0.5F, -4.837F, -0.9835F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1273F, -5.4503F, -2.0442F, -2.4091F, 0.0183F, 0.0171F));

		PartDefinition cube_r21 = bone2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(99, 39).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1129F, -3.0239F, 2.0917F, -1.6749F, 0.166F, 0.0735F));

		PartDefinition cube_r22 = bone2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(90, 19).addBox(-0.5F, -2.3F, -1.6F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0793F, -1.5918F, 2.8046F, -1.1018F, 0.1695F, 0.1087F));

		PartDefinition cube_r23 = bone2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(113, 142).addBox(-0.5F, -0.9F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(142, 105).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.1426F, 5.2951F, 0.0722F, -0.2291F, 0.1695F, 0.1087F));

		PartDefinition cube_r24 = bone2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(142, 98).addBox(-0.5F, 0.0F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.9633F, 4.8953F, 0.8599F, -1.1454F, 0.1695F, 0.1087F));

		PartDefinition cube_r25 = bone2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(83, 126).addBox(-0.5F, -0.8F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9633F, 3.7465F, 0.1317F, -1.6254F, 0.1695F, 0.1087F));

		PartDefinition cube_r26 = bone2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(53, 128).addBox(-0.5F, -1.45F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.7973F, 2.7064F, 0.4369F, -2.2799F, 0.1695F, 0.1087F));

		PartDefinition cube_r27 = bone2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(110, 45).addBox(-0.5885F, -4.5153F, 1.5622F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.6F, -2.6F, -1.0581F, 0.1695F, 0.1087F));

		PartDefinition cube_r28 = bone2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(112, 61).addBox(-1.0614F, -1.9027F, -2.1858F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0539F, -1.9247F, 4.8904F, -0.9339F, -0.1613F, -0.0675F));

		PartDefinition cube_r29 = bone2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(76, 126).addBox(-1.0614F, -1.9275F, -0.827F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0539F, -1.9247F, 4.8904F, -1.7193F, -0.1613F, -0.0675F));

		PartDefinition cube_r30 = bone2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(32, 75).addBox(-0.5F, -4.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.237F, 2.4627F, 3.5011F, -0.744F, 0.1695F, 0.1087F));

		PartDefinition cube_r31 = bone2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(25, 126).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2256F, 3.1533F, -1.2931F, -1.6871F, 0.1753F, 0.1284F));

		PartDefinition cube_r32 = bone2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(97, 142).addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1097F, 2.8367F, -0.8732F, -1.2944F, 0.1753F, 0.1284F));

		PartDefinition cube_r33 = bone2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(110, 39).addBox(-0.4842F, -3.405F, -1.6245F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.6F, -2.6F, -1.4288F, 0.1069F, 0.2185F));

		PartDefinition cube_r34 = bone2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(101, 33).addBox(-0.5F, -0.5F, -3.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3684F, -1.7339F, -1.4106F, -1.007F, 0.2346F, 0.2235F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8565F, 5.7065F, -4.5769F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r35 = bone4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(126, 92).mirror().addBox(3.8073F, -5.2957F, -2.1751F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5188F, -5.8991F, -1.5406F, 0.0749F, 0.0236F, -0.3045F));

		PartDefinition cube_r36 = bone4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(60, 120).mirror().addBox(-0.3663F, -5.534F, -5.9059F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5188F, -5.8991F, -1.5406F, -0.3632F, -0.5673F, 0.1325F));

		PartDefinition cube_r37 = bone4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(90, 126).mirror().addBox(-0.7F, -1.15F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2441F, -5.0645F, -2.801F, -1.7132F, -0.0709F, -0.0263F));

		PartDefinition cube_r38 = bone4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(130, 47).mirror().addBox(0.0181F, 0.9711F, -1.7907F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5188F, -5.8991F, -1.5406F, -1.6329F, -0.0231F, 0.1289F));

		PartDefinition cube_r39 = bone4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(129, 82).mirror().addBox(-0.6414F, 0.5696F, -7.2767F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5188F, -5.8991F, -1.5406F, -1.3892F, -0.0864F, 0.4282F));

		PartDefinition cube_r40 = bone4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(129, 11).mirror().addBox(-0.6414F, -0.8386F, -5.5197F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5188F, -5.8991F, -1.5406F, -1.1274F, -0.0864F, 0.4282F));

		PartDefinition cube_r41 = bone4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(129, 0).mirror().addBox(-0.6414F, 0.417F, -3.9883F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5188F, -5.8991F, -1.5406F, -1.4329F, -0.0864F, 0.4282F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(76, 102).mirror().addBox(-0.6914F, 0.7554F, -6.0162F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5188F, -5.8991F, -1.5406F, -1.5725F, -0.0864F, 0.4282F));

		PartDefinition cube_r43 = bone4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(128, 107).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.1831F, -7.0776F, -2.6814F, -1.3711F, -0.0231F, 0.1289F));

		PartDefinition cube_r44 = bone4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(46, 105).mirror().addBox(-0.5F, -4.837F, -0.9835F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.1273F, -5.4503F, -2.0442F, -2.4091F, -0.0183F, -0.0171F));

		PartDefinition cube_r45 = bone4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(99, 39).mirror().addBox(-0.5F, -0.2F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1129F, -3.0239F, 2.0917F, -1.6749F, -0.166F, -0.0735F));

		PartDefinition cube_r46 = bone4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(90, 19).mirror().addBox(-0.5F, -2.3F, -1.6F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0793F, -1.5918F, 2.8046F, -1.1018F, -0.1695F, -0.1087F));

		PartDefinition cube_r47 = bone4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(113, 142).mirror().addBox(-0.5F, -0.9F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(142, 105).mirror().addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.1426F, 5.2951F, 0.0722F, -0.2291F, -0.1695F, -0.1087F));

		PartDefinition cube_r48 = bone4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(142, 98).mirror().addBox(-0.5F, 0.0F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.9633F, 4.8953F, 0.8599F, -1.1454F, -0.1695F, -0.1087F));

		PartDefinition cube_r49 = bone4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(83, 126).mirror().addBox(-0.5F, -0.8F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9633F, 3.7465F, 0.1317F, -1.6254F, -0.1695F, -0.1087F));

		PartDefinition cube_r50 = bone4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(53, 128).mirror().addBox(-0.5F, -1.45F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.7973F, 2.7064F, 0.4369F, -2.2799F, -0.1695F, -0.1087F));

		PartDefinition cube_r51 = bone4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(110, 45).mirror().addBox(-0.4115F, -4.5153F, 1.5622F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.6F, -2.6F, -1.0581F, -0.1695F, -0.1087F));

		PartDefinition cube_r52 = bone4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(112, 61).mirror().addBox(0.0614F, -1.9027F, -2.1858F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0539F, -1.9247F, 4.8904F, -0.9339F, 0.1613F, 0.0675F));

		PartDefinition cube_r53 = bone4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(76, 126).mirror().addBox(0.0614F, -1.9275F, -0.827F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0539F, -1.9247F, 4.8904F, -1.7193F, 0.1613F, 0.0675F));

		PartDefinition cube_r54 = bone4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(32, 75).mirror().addBox(-0.5F, -4.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.237F, 2.4627F, 3.5011F, -0.744F, -0.1695F, -0.1087F));

		PartDefinition cube_r55 = bone4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(25, 126).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2256F, 3.1533F, -1.2931F, -1.6871F, -0.1753F, -0.1284F));

		PartDefinition cube_r56 = bone4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(97, 142).mirror().addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1097F, 2.8367F, -0.8732F, -1.2944F, -0.1753F, -0.1284F));

		PartDefinition cube_r57 = bone4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(110, 39).mirror().addBox(-0.5158F, -3.405F, -1.6245F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.6F, -2.6F, -1.4288F, -0.1069F, -0.2185F));

		PartDefinition cube_r58 = bone4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(101, 33).mirror().addBox(-0.5F, -0.5F, -3.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3684F, -1.7339F, -1.4106F, -1.007F, -0.2346F, -0.2235F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8696F, 1.306F, -3.1694F, -0.5767F, 0.3741F, -0.0838F));

		PartDefinition cube_r59 = rightLeg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(130, 133).addBox(-1.0F, -1.95F, -0.625F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.0805F, -3.0203F, -2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(120, 0).addBox(-0.5F, -0.5683F, -0.9249F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 0.7008F, -1.5685F, -2.9147F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(133, 119).addBox(-0.5F, -1.5114F, -2.0769F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.5F, 1.5008F, -0.6684F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(46, 127).addBox(-1.0F, -1.8F, -0.55F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2072F, -0.8869F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(107, 121).addBox(-0.5F, -3.9486F, -0.4345F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 3.9326F, -1.944F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(77, 137).addBox(-0.5F, -0.5F, 0.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 2.057F, -2.7331F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(25, 141).addBox(-0.5F, -1.0F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.8358F, -2.3011F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(81, 133).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 11.2752F, -6.7835F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(74, 133).addBox(-1.0F, 0.1F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.8431F, -4.4925F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(127, 8).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3262F, 8.9984F, -2.2975F, 1.3215F, 0.2289F, -0.3715F));

		PartDefinition cube_r69 = rightLeg.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(126, 99).addBox(-1.0F, 0.383F, -1.8214F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5537F, 8.5476F, -2.9129F, 0.7979F, 0.2289F, -0.3715F));

		PartDefinition cube_r70 = rightLeg.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(91, 117).addBox(-1.0F, -1.225F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 11.1703F, -3.732F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(39, 127).addBox(-0.5F, 0.4F, -0.875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 8.0533F, -3.4364F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(60, 133).addBox(-0.5F, -1.2F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.6496F, -3.3914F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 133).addBox(-0.5F, -1.625F, -0.475F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 8.3169F, -3.0434F, -0.1833F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9073F, 12.2378F, -3.8723F, 1.2803F, -0.5531F, -0.3419F));

		PartDefinition cube_r74 = rightLeg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(142, 88).addBox(0.2755F, -0.8301F, 0.1778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9781F, 2.1552F, -0.4312F, -0.4478F, 0.6868F, -2.2881F));

		PartDefinition cube_r75 = rightLeg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(134, 25).addBox(-0.2245F, -1.3084F, 0.8686F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9781F, 2.1552F, -0.4312F, -0.6834F, 0.6868F, -2.2881F));

		PartDefinition cube_r76 = rightLeg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(87, 122).addBox(-0.2245F, -1.9703F, -0.3452F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.2781F, 2.1552F, -0.4312F, -1.9313F, 0.6868F, -2.2881F));

		PartDefinition cube_r77 = rightLeg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(137, 136).addBox(-0.1634F, 0.0585F, 0.9639F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.2781F, 3.2552F, -1.4312F, -2.8738F, 0.6868F, -2.2881F));

		PartDefinition cube_r78 = rightLeg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(140, 38).addBox(-0.2245F, 3.3339F, -0.4604F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3781F, 2.1552F, -0.4312F, -2.1495F, 0.6868F, -2.2881F));

		PartDefinition cube_r79 = rightLeg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(100, 117).addBox(0.2755F, -1.1434F, -0.6333F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.9781F, 2.1552F, -0.4312F, -2.1495F, 0.6868F, -2.2881F));

		PartDefinition cube_r80 = rightLeg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(137, 133).addBox(-0.1634F, 1.081F, 0.1998F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2781F, 3.2552F, -1.4312F, -1.8877F, 0.6868F, -2.2881F));

		PartDefinition cube_r81 = rightLeg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(130, 137).addBox(-0.1634F, 1.7342F, -0.1533F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.2781F, 3.2552F, -1.4312F, -1.7132F, 0.6868F, -2.2881F));

		PartDefinition cube_r82 = rightLeg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(137, 116).addBox(-0.1634F, 0.4943F, 0.9204F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(137, 113).addBox(-0.1634F, 0.4943F, 1.1204F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.2781F, 3.2552F, -1.4312F, -2.804F, 0.6868F, -2.2881F));

		PartDefinition cube_r83 = rightLeg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(137, 110).addBox(-0.1634F, 1.0358F, 1.2271F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2781F, 3.2552F, -1.4312F, -2.4986F, 0.6868F, -2.2881F));

		PartDefinition cube_r84 = rightLeg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(89, 137).addBox(-0.1634F, 1.1627F, 0.5357F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.2781F, 2.1552F, -0.4312F, -0.0987F, 0.6868F, -2.2881F));

		PartDefinition cube_r85 = rightLeg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(82, 137).addBox(-0.1634F, 0.2314F, 1.0085F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(-0.2781F, 2.1552F, -0.4312F, -0.7969F, 0.6868F, -2.2881F));

		PartDefinition cube_r86 = rightLeg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(97, 127).addBox(-0.1634F, -1.1831F, 0.6056F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-0.2781F, 3.2552F, -1.4312F, -2.2193F, 0.6868F, -2.2881F));

		PartDefinition cube_r87 = rightLeg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(137, 77).addBox(-0.1634F, -0.0048F, 0.6664F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(134, 4).addBox(-0.1634F, -1.5048F, 0.6664F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2781F, 2.1552F, -0.4312F, -2.0186F, 0.6868F, -2.2881F));

		PartDefinition cube_r88 = rightLeg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(24, 135).addBox(0.2755F, -0.2912F, -0.8041F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9781F, 2.1552F, -0.4312F, -1.8877F, 0.6868F, -2.2881F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5503F, 4.8167F, -3.7678F, -2.2679F, 0.3585F, -0.3504F));

		PartDefinition cube_r89 = rightLeg3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(123, 16).addBox(-1.5F, -0.5F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.4103F, -0.1519F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightArm7 = rightLeg3.addOrReplaceChild("rightArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0384F, 1.8182F, 0.0204F, 0.6652F, 0.008F, -0.0104F));

		PartDefinition cube_r90 = rightArm7.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(123, 66).addBox(-2.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightArm6 = rightArm7.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightArm6.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(141, 69).addBox(-2.7175F, -1.0101F, -0.5488F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4618F, -0.8404F, -1.0822F, 0.2308F, 0.1246F));

		PartDefinition cube_r92 = rightArm6.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(35, 141).addBox(-1.541F, -1.0859F, -0.5237F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4618F, -0.8404F, -1.0914F, 0.0385F, 0.0205F));

		PartDefinition cube_r93 = rightArm6.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(30, 141).addBox(-0.2912F, -1.2375F, -0.4976F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4618F, -0.8404F, -1.0844F, -0.1154F, -0.0619F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8696F, 1.306F, -3.1694F, -0.5767F, -0.3741F, 0.0838F));

		PartDefinition cube_r94 = leftLeg.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(135, 98).addBox(-1.0F, -1.95F, -0.625F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.0805F, -3.0203F, -2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r95 = leftLeg.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(120, 12).addBox(-1.5F, -0.5683F, -0.9249F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 0.7008F, -1.5685F, -2.9147F, 0.0F, 0.0F));

		PartDefinition cube_r96 = leftLeg.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(135, 88).addBox(-1.5F, -1.5114F, -2.0769F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.5F, 1.5008F, -0.6684F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r97 = leftLeg.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(128, 37).addBox(-1.0F, -1.8F, -0.55F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2072F, -0.8869F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r98 = leftLeg.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 126).addBox(-0.5F, -3.9486F, -0.4345F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 3.9326F, -1.944F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r99 = leftLeg.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(44, 139).addBox(-0.5F, -0.5F, 0.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 2.057F, -2.7331F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r100 = leftLeg.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(108, 141).addBox(-0.5F, -1.0F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.8358F, -2.3011F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r101 = leftLeg.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(135, 73).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 11.2752F, -6.7835F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r102 = leftLeg.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(135, 43).addBox(-1.0F, 0.1F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.8431F, -4.4925F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r103 = leftLeg.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(128, 34).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3262F, 8.9984F, -2.2975F, 1.3215F, -0.2289F, 0.3715F));

		PartDefinition cube_r104 = leftLeg.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(128, 31).addBox(-1.0F, 0.383F, -1.8214F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5537F, 8.5476F, -2.9129F, 0.7979F, -0.2289F, 0.3715F));

		PartDefinition cube_r105 = leftLeg.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(119, 39).addBox(-1.0F, -1.225F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 11.1703F, -3.732F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r106 = leftLeg.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(10, 128).addBox(-0.5F, 0.4F, -0.875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 8.0533F, -3.4364F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r107 = leftLeg.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(135, 57).addBox(-0.5F, -1.2F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.6496F, -3.3914F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r108 = leftLeg.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(135, 37).addBox(-0.5F, -1.625F, -0.475F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 8.3169F, -3.0434F, -0.1833F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9073F, 12.2378F, -3.8723F, 1.2803F, 0.5531F, 0.3419F));

		PartDefinition cube_r109 = leftLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(92, 142).addBox(-1.2756F, -0.8301F, 0.1778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9781F, 2.1552F, -0.4312F, -0.4478F, -0.6868F, 2.2881F));

		PartDefinition cube_r110 = leftLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(116, 135).addBox(-1.7756F, -1.3084F, 0.8686F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9781F, 2.1552F, -0.4312F, -0.6834F, -0.6868F, 2.2881F));

		PartDefinition cube_r111 = leftLeg2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(9, 124).addBox(-1.7755F, -1.9703F, -0.3452F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2781F, 2.1552F, -0.4312F, -1.9313F, -0.6868F, 2.2881F));

		PartDefinition cube_r112 = leftLeg2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(140, 35).addBox(-1.8366F, 0.0585F, 0.9639F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.2781F, 3.2552F, -1.4312F, -2.8738F, -0.6868F, 2.2881F));

		PartDefinition cube_r113 = leftLeg2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(49, 140).addBox(-1.7755F, 3.3339F, -0.4604F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3781F, 2.1552F, -0.4312F, -2.1495F, -0.6868F, 2.2881F));

		PartDefinition cube_r114 = leftLeg2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(82, 140).addBox(-1.2756F, -1.1434F, -0.6333F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9781F, 2.1552F, -0.4312F, -2.1495F, -0.6868F, 2.2881F));

		PartDefinition cube_r115 = leftLeg2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(137, 139).addBox(-1.8366F, 1.081F, 0.1998F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2781F, 3.2552F, -1.4312F, -1.8877F, -0.6868F, 2.2881F));

		PartDefinition cube_r116 = leftLeg2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(116, 139).addBox(-1.8366F, 1.7342F, -0.1533F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.2781F, 3.2552F, -1.4312F, -1.7132F, -0.6868F, 2.2881F));

		PartDefinition cube_r117 = leftLeg2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(139, 102).addBox(-1.8366F, 0.4943F, 0.9204F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(96, 139).addBox(-1.8366F, 0.4943F, 1.1204F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.2781F, 3.2552F, -1.4312F, -2.804F, -0.6868F, 2.2881F));

		PartDefinition cube_r118 = leftLeg2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(139, 66).addBox(-1.8366F, 1.0358F, 1.2271F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2781F, 3.2552F, -1.4312F, -2.4986F, -0.6868F, 2.2881F));

		PartDefinition cube_r119 = leftLeg2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(65, 139).addBox(-1.8366F, 1.1627F, 0.5357F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.2781F, 2.1552F, -0.4312F, -0.0987F, -0.6868F, 2.2881F));

		PartDefinition cube_r120 = leftLeg2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(139, 63).addBox(-1.8366F, 0.2314F, 1.0085F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.2781F, 2.1552F, -0.4312F, -0.7969F, -0.6868F, 2.2881F));

		PartDefinition cube_r121 = leftLeg2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(128, 42).addBox(-1.8366F, -1.1831F, 0.6056F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.2781F, 3.2552F, -1.4312F, -2.2193F, -0.6868F, 2.2881F));

		PartDefinition cube_r122 = leftLeg2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(58, 139).addBox(-1.8366F, -0.0048F, 0.6664F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(135, 106).addBox(-1.8366F, -1.5048F, 0.6664F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2781F, 2.1552F, -0.4312F, -2.0186F, -0.6868F, 2.2881F));

		PartDefinition cube_r123 = leftLeg2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(111, 135).addBox(-1.2756F, -0.2912F, -0.8041F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9781F, 2.1552F, -0.4312F, -1.8877F, -0.6868F, 2.2881F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5503F, 4.8167F, -3.7678F, -2.2679F, -0.3585F, 0.3504F));

		PartDefinition cube_r124 = leftLeg3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(57, 124).addBox(-1.5F, -0.5F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.4103F, -0.1519F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftArm7 = leftLeg3.addOrReplaceChild("leftArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0384F, 1.8182F, 0.0204F, 0.6652F, -0.008F, 0.0104F));

		PartDefinition cube_r125 = leftArm7.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(125, 4).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition leftArm6 = leftArm7.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r126 = leftArm6.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(142, 43).addBox(1.7175F, -1.0101F, -0.5488F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.4618F, -0.8404F, -1.0822F, -0.2308F, -0.1246F));

		PartDefinition cube_r127 = leftArm6.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(10, 142).addBox(0.541F, -1.0859F, -0.5237F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.4618F, -0.8404F, -1.0914F, -0.0385F, -0.0205F));

		PartDefinition cube_r128 = leftArm6.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(123, 141).addBox(-0.7088F, -1.2375F, -0.4976F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.4618F, -0.8404F, -1.0844F, 0.1154F, 0.0619F));

		PartDefinition body4 = hips.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.3337F, -5.209F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r129 = body4.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(130, 115).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.005F, -1.097F, -16.6169F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r130 = body4.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(9, 112).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.005F, -2.944F, -14.2529F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r131 = body4.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(111, 83).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.005F, -4.3524F, -11.6041F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r132 = body4.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(84, 60).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.008F, -4.3672F, -11.6048F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r133 = body4.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(52, 15).mirror().addBox(2.973F, -7.9942F, -7.187F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, -0.0817F, -0.0652F, -0.5916F));

		PartDefinition cube_r134 = body4.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(63, 67).mirror().addBox(2.0729F, -5.9887F, -6.187F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, -0.0465F, -0.0936F, -1.0284F));

		PartDefinition cube_r135 = body4.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(110, 51).mirror().addBox(2.7804F, -5.9887F, -6.4133F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, -0.0463F, 0.011F, -1.0332F));

		PartDefinition cube_r136 = body4.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(48, 27).mirror().addBox(-2.0038F, -4.9186F, -6.187F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, -0.0116F, -0.1038F, -1.379F));

		PartDefinition cube_r137 = body4.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(-9.983F, -5.2193F, -6.187F, 9.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 0.0094F, -0.104F, -1.5808F));

		PartDefinition cube_r138 = body4.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(101, 18).mirror().addBox(-1.7F, -0.5F, -1.4F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.4439F, 11.8455F, -9.459F, 0.0095F, -0.1477F, -1.5812F));

		PartDefinition cube_r139 = body4.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(2.8106F, -7.7187F, -2.6392F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, -0.1954F, -0.1479F, -0.5752F));

		PartDefinition cube_r140 = body4.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(57, 79).mirror().addBox(1.9412F, -5.6698F, -2.6216F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, -0.1034F, -0.2221F, -1.0367F));

		PartDefinition cube_r141 = body4.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(63, 61).mirror().addBox(-2.3808F, -4.7767F, -2.6216F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, -0.0274F, -0.2431F, -1.3634F));

		PartDefinition cube_r142 = body4.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-7.5095F, -5.0769F, -2.3187F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 0.0757F, -0.2458F, -1.5438F));

		PartDefinition cube_r143 = body4.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(80, 48).mirror().addBox(-1.775F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.7053F, 12.2252F, -6.1597F, 0.0739F, -0.1153F, -1.5339F));

		PartDefinition cube_r144 = body4.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(80, 54).mirror().addBox(2.8423F, -7.8157F, -0.3593F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, -0.3281F, -0.2513F, -0.5316F));

		PartDefinition cube_r145 = body4.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(32, 82).mirror().addBox(1.9808F, -5.7787F, -0.3593F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, -0.185F, -0.3686F, -0.9926F));

		PartDefinition cube_r146 = body4.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(73, 19).mirror().addBox(-2.2879F, -4.8515F, 1.6407F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, -0.0527F, -0.4073F, -1.3392F));

		PartDefinition cube_r147 = body4.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(99, 70).mirror().addBox(-7.2292F, -5.2212F, 1.6407F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 0.0382F, -0.4088F, -1.5674F));

		PartDefinition cube_r148 = body4.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(97, 62).mirror().addBox(-2.3338F, -4.8515F, 1.1112F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, -0.0503F, -0.2766F, -1.3463F));

		PartDefinition cube_r149 = body4.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(21, 68).mirror().addBox(-6.2088F, -1.4508F, 0.074F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8577F, -5.0838F, 3.5471F, -0.4827F, -0.2893F, -0.5054F));

		PartDefinition cube_r150 = body4.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(71, 23).mirror().addBox(-8.9794F, -3.9824F, 0.074F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8577F, -5.0838F, 3.5471F, -0.3173F, -0.4657F, -0.9463F));

		PartDefinition cube_r151 = body4.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(42, 48).mirror().addBox(-13.1019F, -6.8161F, -0.0066F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8577F, -5.0838F, 3.5471F, -0.1383F, -0.5412F, -1.3326F));

		PartDefinition cube_r152 = body4.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(42, 61).mirror().addBox(-16.5606F, -9.1908F, -0.0066F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8577F, -5.0838F, 3.5471F, -0.0208F, -0.5565F, -1.557F));

		PartDefinition cube_r153 = body4.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(0.0F, -0.5F, 0.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.7448F, 14.1683F, -4.4733F, -0.0177F, -0.033F, -1.5675F));

		PartDefinition cube_r154 = body4.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(58, 89).mirror().addBox(-8.6919F, -4.1358F, 5.0778F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8577F, -5.0838F, 3.5471F, -0.3628F, -0.5249F, -0.9225F));

		PartDefinition cube_r155 = body4.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(57, 74).mirror().addBox(-12.6324F, -6.9759F, 5.0777F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8577F, -5.0838F, 3.5471F, -0.1316F, -0.6162F, -1.3456F));

		PartDefinition cube_r156 = body4.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(90, 28).mirror().addBox(-15.4626F, -8.7665F, 5.0777F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8577F, -5.0838F, 3.5471F, -0.0254F, -0.6279F, -1.5277F));

		PartDefinition cube_r157 = body4.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(91, 73).mirror().addBox(-6.0001F, -1.7654F, 5.0777F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8577F, -5.0838F, 3.5471F, -0.5447F, -0.3304F, -0.4916F));

		PartDefinition cube_r158 = body4.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(130, 77).mirror().addBox(-4.6093F, -1.4888F, 6.9932F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8577F, -5.0838F, 3.5471F, -0.7853F, 0.1873F, -0.184F));

		PartDefinition cube_r159 = body4.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(87, 102).mirror().addBox(-3.8118F, 2.9888F, 5.9932F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8577F, -5.0838F, 3.5471F, -0.325F, 0.7478F, 0.7426F));

		PartDefinition cube_r160 = body4.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(96, 102).mirror().addBox(-6.4082F, 4.723F, 5.9932F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8577F, -5.0838F, 3.5471F, -0.6233F, 0.5438F, 0.2556F));

		PartDefinition cube_r161 = body4.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(58, 94).mirror().addBox(-8.7901F, 6.3159F, 5.9932F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8577F, -5.0838F, 3.5471F, -0.7404F, 0.3444F, -0.0142F));

		PartDefinition cube_r162 = body4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(98, 110).mirror().addBox(-10.7952F, 11.5529F, 4.7155F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8577F, -5.0838F, 3.5471F, -0.603F, 0.2242F, -0.1461F));

		PartDefinition cube_r163 = body4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(80, 120).mirror().addBox(0.0F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.1607F, 14.3666F, 1.5624F, 0.0089F, 0.3114F, 0.0113F));

		PartDefinition cube_r164 = body4.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(86, 34).mirror().addBox(-5.6339F, -1.0929F, -0.8145F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8577F, 0.8163F, 11.6471F, -0.9676F, -0.2376F, -0.6012F));

		PartDefinition cube_r165 = body4.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(82, 39).mirror().addBox(-8.7004F, -7.8971F, 7.7235F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8577F, -5.0838F, 3.5471F, -0.8088F, -0.5252F, -0.9684F));

		PartDefinition cube_r166 = body4.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(82, 69).mirror().addBox(-11.8786F, -10.1736F, 7.7235F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8577F, -5.0838F, 3.5471F, -0.6384F, -0.732F, -1.2553F));

		PartDefinition cube_r167 = body4.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(120, 82).mirror().addBox(-12.5502F, -11.5454F, 7.7235F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8577F, -5.0838F, 3.5471F, -0.5406F, -0.8001F, -1.3962F));

		PartDefinition cube_r168 = body4.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(30, 88).mirror().addBox(0.0F, -1.0F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0748F, 13.1796F, 6.2717F, -0.4421F, 0.1782F, -1.8061F));

		PartDefinition cube_r169 = body4.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(94, 13).mirror().addBox(3.6281F, -9.1222F, -7.7757F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 0.1116F, 0.0368F, -0.5946F));

		PartDefinition cube_r170 = body4.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(28, 94).mirror().addBox(3.1434F, -6.7342F, -7.7757F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 0.0857F, 0.0805F, -1.0295F));

		PartDefinition cube_r171 = body4.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(75, 0).mirror().addBox(-0.743F, -5.253F, -7.7757F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 0.053F, 0.1049F, -1.3792F));

		PartDefinition cube_r172 = body4.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(63, 34).mirror().addBox(-7.8195F, -5.3022F, -7.7757F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 0.0339F, 0.1125F, -1.5546F));

		PartDefinition cube_r173 = body4.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(112, 67).mirror().addBox(4.829F, -10.2419F, -5.1836F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 0.3271F, 0.2213F, -0.5742F));

		PartDefinition cube_r174 = body4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(109, 0).mirror().addBox(5.2896F, 2.1488F, -10.8997F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, -1.05F, 0.3352F, -0.5208F));

		PartDefinition cube_r175 = body4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(121, 117).mirror().addBox(5.6985F, 3.1488F, -8.4333F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, -1.1889F, 0.4891F, -0.8635F));

		PartDefinition cube_r176 = body4.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(114, 22).mirror().addBox(3.214F, 5.314F, -8.4333F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, -1.233F, 0.1209F, -1.0077F));

		PartDefinition cube_r177 = body4.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(114, 70).mirror().addBox(2.1103F, 5.314F, -6.6419F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, -1.2991F, 0.2361F, -1.3755F));

		PartDefinition cube_r178 = body4.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(85, 114).mirror().addBox(5.5785F, 10.3125F, 1.6101F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, -2.4553F, 0.4176F, -0.4597F));

		PartDefinition cube_r179 = body4.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(128, 88).mirror().addBox(0.9992F, -15.4072F, -3.7658F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 1.1006F, -0.1001F, -0.1942F));

		PartDefinition cube_r180 = body4.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(105, 114).mirror().addBox(-12.0478F, -9.6557F, -3.7658F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 0.7582F, -0.901F, 0.4466F));

		PartDefinition cube_r181 = body4.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(67, 94).mirror().addBox(-12.0478F, -9.9236F, -2.3429F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 0.8018F, -0.901F, 0.4466F));

		PartDefinition cube_r182 = body4.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(112, 120).mirror().addBox(-9.7089F, -9.2722F, -3.3429F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 0.9924F, -0.6605F, 0.1786F));

		PartDefinition cube_r183 = body4.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(84, 94).mirror().addBox(-9.6979F, -8.9082F, -1.4601F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 1.6066F, -0.6603F, 0.173F));

		PartDefinition cube_r184 = body4.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(23, 38).mirror().addBox(-9.8763F, -8.7919F, -7.9839F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 1.6852F, -0.6525F, -0.0693F));

		PartDefinition cube_r185 = body4.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(119, 120).mirror().addBox(-9.8763F, -5.5311F, -10.5094F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 1.3361F, -0.6525F, -0.0693F));

		PartDefinition cube_r186 = body4.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(18, 121).mirror().addBox(-9.7089F, -7.6538F, -6.4332F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 0.6433F, -0.6605F, 0.1786F));

		PartDefinition cube_r187 = body4.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(104, 128).mirror().addBox(1.2761F, -15.6543F, -4.4392F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 1.1872F, -0.0862F, -0.2101F));

		PartDefinition cube_r188 = body4.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(130, 111).mirror().addBox(1.2761F, -16.1678F, -3.9348F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 1.3443F, -0.0862F, -0.2101F));

		PartDefinition cube_r189 = body4.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(114, 108).mirror().addBox(-12.2F, -9.9596F, -4.4392F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 0.8814F, -0.9444F, 0.3439F));

		PartDefinition cube_r190 = body4.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(29, 115).mirror().addBox(-12.7993F, -9.9596F, -4.2608F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 1.1065F, -1.0404F, 0.0759F));

		PartDefinition cube_r191 = body4.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(112, 126).mirror().addBox(-10.5756F, -6.4413F, -8.0228F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 0.5506F, -0.7696F, 0.1029F));

		PartDefinition cube_r192 = body4.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(119, 126).mirror().addBox(-10.5843F, -9.5291F, -2.0313F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 1.5289F, -0.7688F, 0.1393F));

		PartDefinition cube_r193 = body4.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(121, 33).mirror().addBox(-12.3971F, -10.0232F, -2.0313F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 1.5161F, -0.9867F, 0.1558F));

		PartDefinition cube_r194 = body4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(36, 121).mirror().addBox(-10.7726F, -4.6454F, -10.8784F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 1.0861F, -0.7614F, -0.1027F));

		PartDefinition cube_r195 = body4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(17, 75).mirror().addBox(-10.7726F, -9.5291F, -6.1715F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 1.6969F, -0.7614F, -0.1027F));

		PartDefinition cube_r196 = body4.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(17, 84).mirror().addBox(-12.581F, -9.9824F, -5.1715F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 1.7343F, -0.9773F, -0.1514F));

		PartDefinition cube_r197 = body4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(43, 121).mirror().addBox(-12.5809F, -5.8909F, -9.3322F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 1.1671F, -0.9773F, -0.1514F));

		PartDefinition cube_r198 = body4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(106, 79).mirror().addBox(5.755F, -11.6865F, -3.6916F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 0.8746F, 0.4501F, -0.4363F));

		PartDefinition cube_r199 = body4.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(109, 13).mirror().addBox(6.326F, -9.0951F, -3.6916F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 0.7196F, 0.6955F, -0.7189F));

		PartDefinition cube_r200 = body4.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(87, 110).mirror().addBox(5.7681F, -6.7719F, -3.6916F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 0.4653F, 0.8683F, -1.0765F));

		PartDefinition cube_r201 = body4.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(87, 89).mirror().addBox(-1.4501F, -6.9095F, -9.0897F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 0.2965F, 0.033F, -1.3777F));

		PartDefinition cube_r202 = body4.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(50, 0).mirror().addBox(-9.1051F, -7.0593F, -9.0897F, 9.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 0.2853F, 0.0883F, -1.5619F));

		PartDefinition cube_r203 = body4.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(103, 5).mirror().addBox(5.6237F, -11.3769F, -3.4744F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 0.7295F, 0.4366F, -0.4419F));

		PartDefinition cube_r204 = body4.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(33, 111).mirror().addBox(6.1757F, -8.7674F, -3.4744F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 0.5593F, 0.6484F, -0.7675F));

		PartDefinition cube_r205 = body4.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(49, 82).mirror().addBox(6.5263F, -6.5045F, -3.4744F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8577F, 2.9162F, -3.8529F, 0.3171F, 0.7798F, -1.1341F));

		PartDefinition cube_r206 = body4.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(114, 17).mirror().addBox(-0.1F, -0.5F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-8.7093F, 12.7756F, -13.4908F, 0.2881F, -0.163F, -1.6358F));

		PartDefinition cube_r207 = body4.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(99, 65).mirror().addBox(0.0F, -0.5F, 0.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.529F, 13.2869F, 6.451F, -0.4875F, 0.402F, -1.9668F));

		PartDefinition cube_r208 = body4.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(87, 83).mirror().addBox(0.025F, -0.5F, -0.1F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.6328F, 11.788F, 8.8903F, -0.5898F, 0.592F, -2.0893F));

		PartDefinition cube_r209 = body4.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(94, 0).mirror().addBox(0.0F, -0.5F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.7623F, 9.2809F, 11.4149F, -0.7355F, -0.3685F, -1.137F));

		PartDefinition cube_r210 = body4.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(119, 79).mirror().addBox(-6.0198F, -1.0996F, 0.9295F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8577F, 0.8163F, 11.6471F, -0.9288F, -0.1098F, -0.7805F));

		PartDefinition cube_r211 = body4.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(0, 114).mirror().addBox(-1.9504F, -0.1083F, -0.6058F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8577F, 0.8163F, 11.6471F, -0.9218F, 0.1883F, -0.2419F));

		PartDefinition cube_r212 = body4.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(125, 132).mirror().addBox(-0.5F, -1.725F, -1.125F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.3182F, 3.2797F, -19.0279F, 0.5393F, -1.0404F, 0.0759F));

		PartDefinition cube_r213 = body4.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(74, 113).mirror().addBox(-6.0198F, 0.6797F, 1.1143F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8577F, 0.8163F, 11.6471F, -0.0998F, -0.1098F, -0.7805F));

		PartDefinition cube_r214 = body4.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(80, 117).mirror().addBox(-2.0F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.3654F, 7.5418F, 12.4483F, -0.212F, -0.3685F, -1.137F));

		PartDefinition cube_r215 = body4.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(117, 89).mirror().addBox(-0.2F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.2306F, 9.5769F, 11.5316F, -0.3007F, -0.3017F, -0.8688F));

		PartDefinition cube_r216 = body4.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(49, 82).addBox(-8.5263F, -6.5045F, -3.4744F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 0.3171F, -0.7798F, 1.1341F));

		PartDefinition cube_r217 = body4.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(33, 111).addBox(-9.1757F, -8.7674F, -3.4744F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 0.5593F, -0.6484F, 0.7675F));

		PartDefinition cube_r218 = body4.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(103, 5).addBox(-9.6237F, -11.3769F, -3.4744F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 0.7295F, -0.4366F, 0.4419F));

		PartDefinition cube_r219 = body4.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(71, 30).addBox(-8.3577F, -14.8393F, -3.4744F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r220 = body4.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(114, 17).addBox(-0.9F, -0.5F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(8.7093F, 12.7756F, -13.4908F, 0.2881F, 0.163F, 1.6358F));

		PartDefinition cube_r221 = body4.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(50, 0).addBox(0.1051F, -7.0593F, -9.0897F, 9.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 0.2853F, -0.0883F, 1.5619F));

		PartDefinition cube_r222 = body4.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(87, 89).addBox(-2.5499F, -6.9095F, -9.0897F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 0.2965F, -0.033F, 1.3777F));

		PartDefinition cube_r223 = body4.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(87, 110).addBox(-8.7681F, -6.7719F, -3.6916F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 0.4653F, -0.8683F, 1.0765F));

		PartDefinition cube_r224 = body4.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(109, 13).addBox(-9.326F, -9.0951F, -3.6916F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 0.7196F, -0.6955F, 0.7189F));

		PartDefinition cube_r225 = body4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(106, 79).addBox(-9.7551F, -11.6865F, -3.6916F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 0.8746F, -0.4501F, 0.4363F));

		PartDefinition cube_r226 = body4.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(52, 23).addBox(-8.3577F, -15.2172F, -2.8448F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r227 = body4.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(101, 23).addBox(-6.8577F, -16.1374F, -3.37F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r228 = body4.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(43, 121).addBox(11.5809F, -5.8909F, -9.3322F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 1.1671F, 0.9773F, 0.1514F));

		PartDefinition cube_r229 = body4.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(17, 84).addBox(11.581F, -9.9824F, -5.1715F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 1.7343F, 0.9773F, 0.1514F));

		PartDefinition cube_r230 = body4.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(17, 75).addBox(9.7726F, -9.5291F, -6.1715F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 1.6969F, 0.7614F, 0.1027F));

		PartDefinition cube_r231 = body4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(36, 121).addBox(9.7726F, -4.6454F, -10.8784F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 1.0861F, 0.7614F, 0.1027F));

		PartDefinition cube_r232 = body4.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(121, 33).addBox(11.3971F, -10.0232F, -2.0313F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 1.5161F, 0.9867F, -0.1558F));

		PartDefinition cube_r233 = body4.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(119, 126).addBox(9.5843F, -9.5291F, -2.0313F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 1.5289F, 0.7688F, -0.1393F));

		PartDefinition cube_r234 = body4.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(112, 126).addBox(9.5756F, -6.4413F, -8.0228F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 0.5506F, 0.7696F, -0.1029F));

		PartDefinition cube_r235 = body4.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(125, 132).addBox(-0.5F, -1.725F, -1.125F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.3182F, 3.2797F, -19.0279F, 0.5393F, 1.0404F, -0.0759F));

		PartDefinition cube_r236 = body4.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(29, 115).addBox(11.7993F, -9.9596F, -4.2608F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 1.1065F, 1.0404F, -0.0759F));

		PartDefinition cube_r237 = body4.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(114, 108).addBox(11.2F, -9.9596F, -4.4392F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 0.8814F, 0.9444F, -0.3439F));

		PartDefinition cube_r238 = body4.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(130, 111).addBox(-2.2761F, -16.1678F, -3.9348F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 1.3443F, 0.0862F, 0.2101F));

		PartDefinition cube_r239 = body4.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(104, 128).addBox(-2.2761F, -15.6543F, -4.4392F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 1.1872F, 0.0862F, 0.2101F));

		PartDefinition cube_r240 = body4.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(48, 34).addBox(-7.3577F, -15.6543F, -4.1515F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r241 = body4.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(18, 121).addBox(8.7089F, -7.6538F, -6.4332F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 0.6433F, 0.6605F, -0.1786F));

		PartDefinition cube_r242 = body4.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(119, 120).addBox(8.8763F, -5.5311F, -10.5094F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 1.3361F, 0.6525F, 0.0693F));

		PartDefinition cube_r243 = body4.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(23, 38).addBox(8.8763F, -8.7919F, -7.9839F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 1.6852F, 0.6525F, 0.0693F));

		PartDefinition cube_r244 = body4.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(84, 94).addBox(8.6979F, -8.9082F, -1.4601F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 1.6066F, 0.6603F, -0.173F));

		PartDefinition cube_r245 = body4.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(112, 120).addBox(8.7089F, -9.2722F, -3.3429F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 0.9924F, 0.6605F, -0.1786F));

		PartDefinition cube_r246 = body4.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(67, 94).addBox(11.0478F, -9.9236F, -2.3429F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 0.8018F, 0.901F, -0.4466F));

		PartDefinition cube_r247 = body4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(105, 114).addBox(11.0478F, -9.6557F, -3.7658F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 0.7582F, 0.901F, -0.4466F));

		PartDefinition cube_r248 = body4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(128, 88).addBox(-1.9992F, -15.4072F, -3.7658F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 1.1006F, 0.1001F, 0.1942F));

		PartDefinition cube_r249 = body4.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(86, 9).addBox(-7.8577F, -15.4072F, -3.5076F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r250 = body4.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(85, 114).addBox(-9.5785F, 10.3125F, 1.6101F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, -2.4553F, -0.4176F, 0.4597F));

		PartDefinition cube_r251 = body4.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(82, 45).addBox(-8.3577F, 13.7607F, 1.6101F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, -2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r252 = body4.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(114, 70).addBox(-6.1103F, 5.314F, -6.6419F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, -1.2991F, -0.2361F, 1.3755F));

		PartDefinition cube_r253 = body4.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(114, 22).addBox(-7.214F, 5.314F, -8.4333F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, -1.233F, -0.1209F, 1.0077F));

		PartDefinition cube_r254 = body4.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(121, 117).addBox(-8.6985F, 3.1488F, -8.4333F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, -1.1889F, -0.4891F, 0.8635F));

		PartDefinition cube_r255 = body4.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(109, 0).addBox(-9.2896F, 2.1488F, -10.8997F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, -1.05F, -0.3352F, 0.5208F));

		PartDefinition cube_r256 = body4.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(86, 5).addBox(-8.3577F, 2.1488F, -14.2568F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r257 = body4.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(112, 67).addBox(-8.829F, -10.2419F, -5.1836F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 0.3271F, -0.2213F, 0.5742F));

		PartDefinition cube_r258 = body4.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(0, 55).addBox(-8.3577F, -13.4538F, -5.1836F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r259 = body4.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(63, 34).addBox(-0.1805F, -5.3022F, -7.7757F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 0.0339F, -0.1125F, 1.5546F));

		PartDefinition cube_r260 = body4.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(75, 0).addBox(-5.257F, -5.253F, -7.7757F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 0.053F, -0.1049F, 1.3792F));

		PartDefinition cube_r261 = body4.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(28, 94).addBox(-7.1434F, -6.7342F, -7.7757F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 0.0857F, -0.0805F, 1.0295F));

		PartDefinition cube_r262 = body4.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(94, 13).addBox(-7.6281F, -9.1222F, -7.7757F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 0.1116F, -0.0368F, 0.5946F));

		PartDefinition cube_r263 = body4.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(73, 14).addBox(-8.3577F, -11.9125F, -7.5232F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r264 = body4.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(0, 114).addBox(0.9504F, -0.1083F, -0.6058F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8577F, 0.8163F, 11.6471F, -0.9218F, -0.1883F, 0.2419F));

		PartDefinition cube_r265 = body4.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(76, 108).addBox(-2.8577F, 1.7882F, 1.422F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8577F, 0.8163F, 11.6471F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r266 = body4.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(91, 78).addBox(-2.8577F, -0.1083F, 0.0087F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8577F, 0.8163F, 11.6471F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r267 = body4.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(49, 85).addBox(-3.8577F, -1.4888F, 7.9479F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8577F, -5.0838F, 3.5471F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r268 = body4.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(87, 83).addBox(-3.025F, -0.5F, -0.1F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.6328F, 11.788F, 8.8903F, -0.5898F, -0.592F, 2.0893F));

		PartDefinition cube_r269 = body4.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(99, 65).addBox(-3.0F, -0.5F, 0.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.529F, 13.2869F, 6.451F, -0.4875F, -0.402F, 1.9668F));

		PartDefinition cube_r270 = body4.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(30, 88).addBox(-3.0F, -1.0F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0748F, 13.1796F, 6.2717F, -0.4421F, -0.1782F, 1.8061F));

		PartDefinition cube_r271 = body4.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(120, 82).addBox(10.5502F, -11.5454F, 7.7235F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8577F, -5.0838F, 3.5471F, -0.5406F, 0.8001F, 1.3962F));

		PartDefinition cube_r272 = body4.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(82, 69).addBox(5.8786F, -10.1736F, 7.7235F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8577F, -5.0838F, 3.5471F, -0.6384F, 0.732F, 1.2553F));

		PartDefinition cube_r273 = body4.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(117, 89).addBox(-3.8F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(5.2306F, 9.5769F, 11.5316F, -0.3007F, 0.3017F, 0.8688F));

		PartDefinition cube_r274 = body4.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(80, 117).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.3654F, 7.5418F, 12.4483F, -0.212F, 0.3685F, 1.137F));

		PartDefinition cube_r275 = body4.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(94, 0).addBox(-4.0F, -0.5F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.7623F, 9.2809F, 11.4149F, -0.7355F, 0.3685F, 1.137F));

		PartDefinition cube_r276 = body4.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(82, 39).addBox(4.7004F, -7.8971F, 7.7235F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8577F, -5.0838F, 3.5471F, -0.8088F, 0.5252F, 0.9684F));

		PartDefinition cube_r277 = body4.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(86, 34).addBox(1.6339F, -1.0929F, -0.8145F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8577F, 0.8163F, 11.6471F, -0.9676F, 0.2376F, 0.6012F));

		PartDefinition cube_r278 = body4.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(74, 113).addBox(2.0198F, 0.6797F, 1.1143F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8577F, 0.8163F, 11.6471F, -0.0998F, 0.1098F, 0.7805F));

		PartDefinition cube_r279 = body4.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(119, 79).addBox(2.0198F, -1.0996F, 0.9295F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8577F, 0.8163F, 11.6471F, -0.9288F, 0.1098F, 0.7805F));

		PartDefinition cube_r280 = body4.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(80, 120).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.1607F, 14.3666F, 1.5624F, 0.0089F, -0.3114F, -0.0113F));

		PartDefinition cube_r281 = body4.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(98, 110).addBox(9.7952F, 11.5529F, 4.7155F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8577F, -5.0838F, 3.5471F, -0.603F, -0.2242F, 0.1461F));

		PartDefinition cube_r282 = body4.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(58, 94).addBox(7.7901F, 6.3159F, 5.9932F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8577F, -5.0838F, 3.5471F, -0.7404F, -0.3444F, 0.0142F));

		PartDefinition cube_r283 = body4.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(96, 102).addBox(5.4082F, 4.723F, 5.9932F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8577F, -5.0838F, 3.5471F, -0.6233F, -0.5438F, -0.2556F));

		PartDefinition cube_r284 = body4.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(87, 102).addBox(2.8118F, 2.9888F, 5.9932F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8577F, -5.0838F, 3.5471F, -0.325F, -0.7478F, -0.7426F));

		PartDefinition cube_r285 = body4.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(130, 77).addBox(3.6093F, -1.4888F, 6.9932F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8577F, -5.0838F, 3.5471F, -0.7853F, -0.1873F, 0.184F));

		PartDefinition cube_r286 = body4.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(91, 73).addBox(2.0001F, -1.7654F, 5.0777F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8577F, -5.0838F, 3.5471F, -0.5447F, 0.3304F, 0.4916F));

		PartDefinition cube_r287 = body4.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(90, 28).addBox(11.4626F, -8.7665F, 5.0777F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8577F, -5.0838F, 3.5471F, -0.0254F, 0.6279F, 1.5277F));

		PartDefinition cube_r288 = body4.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(57, 74).addBox(6.6324F, -6.9759F, 5.0777F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8577F, -5.0838F, 3.5471F, -0.1316F, 0.6162F, 1.3456F));

		PartDefinition cube_r289 = body4.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(58, 89).addBox(4.6919F, -4.1358F, 5.0778F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8577F, -5.0838F, 3.5471F, -0.3628F, 0.5249F, 0.9225F));

		PartDefinition cube_r290 = body4.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(40, 68).addBox(-4.3577F, -0.3682F, 5.0777F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8577F, -5.0838F, 3.5471F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r291 = body4.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(0, 37).addBox(-5.0F, -0.5F, 0.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.7448F, 14.1683F, -4.4733F, -0.0177F, 0.033F, 1.5675F));

		PartDefinition cube_r292 = body4.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(42, 61).addBox(11.5606F, -9.1908F, -0.0066F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8577F, -5.0838F, 3.5471F, -0.0208F, 0.5565F, 1.557F));

		PartDefinition cube_r293 = body4.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(42, 48).addBox(7.1019F, -6.8161F, -0.0066F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8577F, -5.0838F, 3.5471F, -0.1383F, 0.5412F, 1.3326F));

		PartDefinition cube_r294 = body4.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(71, 23).addBox(4.9794F, -3.9824F, 0.074F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8577F, -5.0838F, 3.5471F, -0.3173F, 0.4657F, 0.9463F));

		PartDefinition cube_r295 = body4.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(21, 68).addBox(2.2088F, -1.4508F, 0.074F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8577F, -5.0838F, 3.5471F, -0.4827F, 0.2893F, 0.5054F));

		PartDefinition cube_r296 = body4.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(27, 20).addBox(-4.3577F, -0.0136F, 0.0837F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8577F, -5.0838F, 3.5471F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r297 = body4.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(97, 62).addBox(-3.6662F, -4.8515F, 1.1112F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, -0.0503F, 0.2766F, 1.3463F));

		PartDefinition cube_r298 = body4.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(99, 70).addBox(1.2292F, -5.2212F, 1.6407F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 0.0382F, 0.4088F, 1.5674F));

		PartDefinition cube_r299 = body4.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(73, 19).addBox(-3.7121F, -4.8515F, 1.6407F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, -0.0527F, 0.4073F, 1.3392F));

		PartDefinition cube_r300 = body4.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(32, 82).addBox(-5.9808F, -5.7787F, -0.3593F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, -0.185F, 0.3686F, 0.9926F));

		PartDefinition cube_r301 = body4.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(80, 54).addBox(-6.8423F, -7.8157F, -0.3593F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, -0.3281F, 0.2513F, 0.5316F));

		PartDefinition cube_r302 = body4.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(0, 58).addBox(-8.3577F, -10.292F, -0.3191F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r303 = body4.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(42, 55).addBox(-8.3577F, -10.205F, -2.6217F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r304 = body4.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(80, 48).addBox(-2.225F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.7053F, 12.2252F, -6.1597F, 0.0739F, 0.1153F, 1.5339F));

		PartDefinition cube_r305 = body4.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(0, 64).addBox(1.5095F, -5.0769F, -2.3187F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 0.0757F, 0.2458F, 1.5438F));

		PartDefinition cube_r306 = body4.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(63, 61).addBox(-3.6192F, -4.7767F, -2.6216F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, -0.0274F, 0.2431F, 1.3634F));

		PartDefinition cube_r307 = body4.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(57, 79).addBox(-5.9412F, -5.6698F, -2.6216F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, -0.1034F, 0.2221F, 1.0367F));

		PartDefinition cube_r308 = body4.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(0, 79).addBox(-6.8106F, -7.7187F, -2.6392F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, -0.1954F, 0.1479F, 0.5752F));

		PartDefinition cube_r309 = body4.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(101, 18).addBox(-1.3F, -0.5F, -1.4F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.4439F, 11.8455F, -9.459F, 0.0095F, 0.1477F, 1.5812F));

		PartDefinition cube_r310 = body4.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(0, 13).addBox(0.983F, -5.2193F, -6.187F, 9.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, 0.0094F, 0.104F, 1.5808F));

		PartDefinition cube_r311 = body4.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(48, 27).addBox(-3.9962F, -4.9186F, -6.187F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, -0.0116F, 0.1038F, 1.379F));

		PartDefinition cube_r312 = body4.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(110, 51).addBox(-6.7804F, -5.9887F, -6.4133F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, -0.0463F, -0.011F, 1.0332F));

		PartDefinition cube_r313 = body4.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(63, 67).addBox(-6.0729F, -5.9887F, -6.187F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, -0.0465F, 0.0936F, 1.0284F));

		PartDefinition cube_r314 = body4.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(52, 15).addBox(-6.973F, -7.9942F, -7.187F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, -0.0817F, 0.0652F, 0.5916F));

		PartDefinition cube_r315 = body4.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(0, 20).addBox(-8.3577F, -10.4609F, -7.2738F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8577F, 2.9162F, -3.8529F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r316 = body4.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(112, 33).addBox(-0.5F, 1.775F, -2.575F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -6.0259F, -2.6665F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r317 = body4.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(0, 99).addBox(-0.5F, 0.0F, -4.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, -6.0259F, -2.6665F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r318 = body4.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(24, 99).addBox(-0.5F, -1.475F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7633F, -1.1318F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r319 = body4.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(73, 92).addBox(-0.5F, 0.0F, -4.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -5.4347F, 1.2896F, -0.1484F, 0.0F, 0.0F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9233F, -1.33F, -5.2721F, 0.0349F, 0.0F, 0.0F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9233F, -0.0965F, -2.8954F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r320 = body2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(119, 49).mirror().addBox(-7.9634F, -6.3807F, -0.1722F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0585F, -4.4543F, -0.0737F, 0.5524F, -1.8565F));

		PartDefinition cube_r321 = body2.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(74, 131).mirror().addBox(-6.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0585F, -4.4543F, 0.2998F, 0.5134F, -1.1446F));

		PartDefinition cube_r322 = body2.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(83, 131).mirror().addBox(-4.8362F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0585F, -4.4543F, 0.51F, 0.3439F, -0.6491F));

		PartDefinition cube_r323 = body2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(76, 100).mirror().addBox(-2.0073F, 0.1202F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0585F, -4.4543F, 0.6082F, 0.1071F, -0.2194F));

		PartDefinition cube_r324 = body2.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(111, 89).mirror().addBox(-4.9634F, -6.3807F, -0.1722F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1415F, -3.1543F, -0.2291F, 0.4518F, -1.8666F));

		PartDefinition cube_r325 = body2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(131, 86).mirror().addBox(-4.8362F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1415F, -3.1543F, 0.357F, 0.4369F, -0.6426F));

		PartDefinition cube_r326 = body2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(131, 92).mirror().addBox(-6.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1415F, -3.1543F, 0.1052F, 0.5246F, -1.1765F));

		PartDefinition cube_r327 = body2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(136, 84).mirror().addBox(-2.0073F, 0.1202F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1415F, -3.1543F, 0.5199F, 0.2524F, -0.1704F));

		PartDefinition cube_r328 = body2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(146, 27).mirror().addBox(-4.9113F, -2.9566F, -0.3511F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3416F, -2.1543F, 0.0932F, 0.8418F, -1.3112F));

		PartDefinition cube_r329 = body2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(140, 121).mirror().addBox(-2.0073F, 0.1203F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3416F, -2.1543F, 0.8075F, 0.4175F, -0.202F));

		PartDefinition cube_r330 = body2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(133, 123).mirror().addBox(-4.8362F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3416F, -2.1543F, 0.558F, 0.7062F, -0.6597F));

		PartDefinition cube_r331 = body2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(133, 123).addBox(1.8363F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3416F, -2.1543F, 0.558F, -0.7062F, 0.6597F));

		PartDefinition cube_r332 = body2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(140, 121).addBox(0.0073F, 0.1203F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3416F, -2.1543F, 0.8075F, -0.4175F, 0.202F));

		PartDefinition cube_r333 = body2.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(146, 27).addBox(3.9113F, -2.9566F, -0.3511F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3416F, -2.1543F, 0.0932F, -0.8418F, 1.3112F));

		PartDefinition cube_r334 = body2.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(136, 84).addBox(0.0073F, 0.1202F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1415F, -3.1543F, 0.5199F, -0.2524F, 0.1704F));

		PartDefinition cube_r335 = body2.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(131, 92).addBox(3.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1415F, -3.1543F, 0.1052F, -0.5246F, 1.1765F));

		PartDefinition cube_r336 = body2.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(131, 86).addBox(1.8363F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1415F, -3.1543F, 0.357F, -0.4369F, 0.6426F));

		PartDefinition cube_r337 = body2.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(111, 89).addBox(3.9634F, -6.3807F, -0.1722F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1415F, -3.1543F, -0.2291F, -0.4518F, 1.8666F));

		PartDefinition cube_r338 = body2.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(76, 100).addBox(0.0073F, 0.1202F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0585F, -4.4543F, 0.6082F, -0.1071F, 0.2194F));

		PartDefinition cube_r339 = body2.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(83, 131).addBox(1.8363F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0585F, -4.4543F, 0.51F, -0.3439F, 0.6491F));

		PartDefinition cube_r340 = body2.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(74, 131).addBox(3.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0585F, -4.4543F, 0.2998F, -0.5134F, 1.1446F));

		PartDefinition cube_r341 = body2.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(119, 49).addBox(3.9634F, -6.3807F, -0.1722F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0585F, -4.4543F, -0.0737F, -0.5524F, 1.8565F));

		PartDefinition cube_r342 = body2.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(45, 89).addBox(-0.5F, -1.9908F, -0.7774F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.6815F, -4.2135F, 0.3709F, 0.0F, 0.0F));

		PartDefinition body5 = body2.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, -4.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r343 = body5.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(120, 86).mirror().addBox(-7.9634F, -6.3807F, -0.1722F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1585F, -3.5543F, 0.0751F, 0.0843F, -1.81F));

		PartDefinition cube_r344 = body5.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(131, 94).mirror().addBox(-6.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1585F, -3.5543F, 0.1193F, 0.0559F, -1.1983F));

		PartDefinition cube_r345 = body5.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(131, 96).mirror().addBox(-4.8362F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1585F, -3.5543F, 0.1375F, 0.0186F, -0.7194F));

		PartDefinition cube_r346 = body5.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(140, 41).mirror().addBox(-2.0073F, 0.1202F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1585F, -3.5543F, 0.1365F, -0.0228F, -0.2412F));

		PartDefinition cube_r347 = body5.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(65, 59).mirror().addBox(-8.9634F, -6.3807F, -0.1722F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2416F, -1.9543F, 0.0465F, 0.1137F, -1.7621F));

		PartDefinition cube_r348 = body5.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(132, 23).mirror().addBox(-4.8362F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2416F, -1.9543F, 0.1505F, 0.0575F, -0.6681F));

		PartDefinition cube_r349 = body5.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(132, 51).mirror().addBox(-6.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2416F, -1.9543F, 0.1129F, 0.0964F, -1.148F));

		PartDefinition cube_r350 = body5.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(140, 119).mirror().addBox(-2.0073F, 0.1203F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2416F, -1.9543F, 0.1659F, 0.0057F, -0.1906F));

		PartDefinition cube_r351 = body5.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(140, 119).addBox(0.0073F, 0.1203F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2416F, -1.9543F, 0.1659F, -0.0057F, 0.1906F));

		PartDefinition cube_r352 = body5.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(132, 51).addBox(3.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2416F, -1.9543F, 0.1129F, -0.0964F, 1.148F));

		PartDefinition cube_r353 = body5.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(132, 23).addBox(1.8363F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2416F, -1.9543F, 0.1505F, -0.0575F, 0.6681F));

		PartDefinition cube_r354 = body5.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(65, 59).addBox(3.9634F, -6.3807F, -0.1722F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2416F, -1.9543F, 0.0465F, -0.1137F, 1.7621F));

		PartDefinition cube_r355 = body5.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(140, 41).addBox(0.0073F, 0.1202F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1585F, -3.5543F, 0.1365F, 0.0228F, 0.2412F));

		PartDefinition cube_r356 = body5.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(131, 96).addBox(1.8363F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1585F, -3.5543F, 0.1375F, -0.0186F, 0.7194F));

		PartDefinition cube_r357 = body5.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(131, 94).addBox(3.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1585F, -3.5543F, 0.1193F, -0.0559F, 1.1983F));

		PartDefinition cube_r358 = body5.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(120, 86).addBox(3.9634F, -6.3807F, -0.1722F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1585F, -3.5543F, 0.0751F, -0.0843F, 1.81F));

		PartDefinition cube_r359 = body5.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(54, 104).addBox(-0.5F, -1.0F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.1F, 0.0524F, 0.0F, 0.0F));

		PartDefinition body = body5.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1007F, -4.0019F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r360 = body.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(106, 97).mirror().addBox(-0.5F, 0.0F, -0.2F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5079F, 9.0806F, -4.5493F, -1.2968F, -0.5528F, 1.4533F));

		PartDefinition cube_r361 = body.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(97, 48).mirror().addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4472F, 9.9006F, -4.0275F, -0.9504F, -0.5175F, 1.4365F));

		PartDefinition cube_r362 = body.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4376F, 10.7831F, -3.5141F, -0.7739F, -0.5096F, 1.3939F));

		PartDefinition cube_r363 = body.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(63, 39).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3708F, 10.7909F, -3.53F, -0.5594F, -0.4024F, 1.1474F));

		PartDefinition cube_r364 = body.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(29, 10).mirror().addBox(-0.5F, 0.0F, 0.1F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4602F, 10.8691F, -3.4512F, -0.3204F, -0.4309F, 1.0134F));

		PartDefinition cube_r365 = body.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(140, 86).mirror().addBox(-2.0073F, 0.1202F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3399F, -1.1713F, 0.006F, -0.0343F, -0.3025F));

		PartDefinition cube_r366 = body.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(131, 125).mirror().addBox(-4.8362F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3399F, -1.1713F, 0.0271F, -0.0518F, -0.7827F));

		PartDefinition cube_r367 = body.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(131, 127).mirror().addBox(-6.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3399F, -1.1713F, 0.0539F, -0.0575F, -1.2633F));

		PartDefinition cube_r368 = body.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(131, 129).mirror().addBox(-6.9634F, -6.3807F, -0.1722F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3399F, -1.1713F, 0.0866F, -0.0462F, -1.8749F));

		PartDefinition cube_r369 = body.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(121, 51).mirror().addBox(-7.7432F, -2.9834F, -0.2853F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3399F, -2.8713F, 0.0938F, -0.0871F, -1.4792F));

		PartDefinition cube_r370 = body.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(131, 131).mirror().addBox(-4.7012F, -0.9198F, -0.3931F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3399F, -2.8713F, 0.0488F, -0.0964F, -0.9973F));

		PartDefinition cube_r371 = body.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(140, 92).mirror().addBox(-1.9357F, -0.0311F, -0.4395F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3399F, -2.8713F, 0.0045F, -0.0839F, -0.5155F));

		PartDefinition cube_r372 = body.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(140, 92).addBox(-0.0643F, -0.0311F, -0.4395F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3399F, -2.8713F, 0.0045F, 0.0839F, 0.5155F));

		PartDefinition cube_r373 = body.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(131, 131).addBox(1.7012F, -0.9198F, -0.3931F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3399F, -2.8713F, 0.0488F, 0.0964F, 0.9973F));

		PartDefinition cube_r374 = body.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(121, 51).addBox(3.7432F, -2.9834F, -0.2853F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3399F, -2.8713F, 0.0938F, 0.0871F, 1.4792F));

		PartDefinition cube_r375 = body.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(131, 129).addBox(3.9634F, -6.3807F, -0.1722F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3399F, -1.1713F, 0.0866F, 0.0462F, 1.8749F));

		PartDefinition cube_r376 = body.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(131, 127).addBox(3.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3399F, -1.1713F, 0.0539F, 0.0575F, 1.2633F));

		PartDefinition cube_r377 = body.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(131, 125).addBox(1.8363F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3399F, -1.1713F, 0.0271F, 0.0518F, 0.7827F));

		PartDefinition cube_r378 = body.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(140, 86).addBox(0.0073F, 0.1202F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3399F, -1.1713F, 0.006F, 0.0343F, 0.3025F));

		PartDefinition cube_r379 = body.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(121, 113).addBox(-2.4624F, 0.7819F, -3.2328F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4624F, 9.6396F, -3.3203F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r380 = body.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(29, 10).addBox(-0.5F, 0.0F, 0.1F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4602F, 10.8691F, -3.4512F, -0.3204F, 0.4309F, -1.0134F));

		PartDefinition cube_r381 = body.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(63, 39).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3708F, 10.7909F, -3.53F, -0.5594F, 0.4024F, -1.1474F));

		PartDefinition cube_r382 = body.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(0, 85).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4376F, 10.7831F, -3.5141F, -0.7739F, 0.5096F, -1.3939F));

		PartDefinition cube_r383 = body.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(97, 48).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4472F, 9.9006F, -4.0275F, -0.9504F, 0.5175F, -1.4365F));

		PartDefinition cube_r384 = body.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(106, 97).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5079F, 9.0806F, -4.5493F, -1.2968F, 0.5528F, -1.4533F));

		PartDefinition cube_r385 = body.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(62, 115).addBox(-1.9624F, 0.3287F, -1.7115F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4624F, 9.6396F, -3.3203F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r386 = body.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(66, 85).addBox(-1.0F, -0.0269F, -1.9388F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2399F, -1.8713F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r387 = body.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(25, 131).addBox(-0.5F, -0.0401F, -2.1382F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.2F, 0.3491F, 0.0F, 0.0F));

		PartDefinition bone = body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(6.5569F, 4.6449F, 0.8843F, -0.219F, -0.0852F, 0.0189F));

		PartDefinition cube_r388 = bone.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(43, 97).addBox(-0.5F, -2.95F, -0.375F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1297F, 1.5073F, 0.0047F, 0.0367F, 0.3028F, -0.2662F));

		PartDefinition cube_r389 = bone.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(135, 142).addBox(-0.5F, -0.3F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.1012F, 0.7376F, -0.0605F, 0.604F, 0.3028F, -0.2662F));

		PartDefinition cube_r390 = bone.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(126, 120).addBox(-0.5F, -1.3F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0913F, 0.6275F, 3.7154F, -0.2687F, 0.3028F, -0.2662F));

		PartDefinition cube_r391 = bone.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(56, 142).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.1642F, -0.5144F, 4.9021F, -0.8796F, 0.3028F, -0.2662F));

		PartDefinition cube_r392 = bone.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(119, 44).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6309F, 1.4796F, 4.6646F, -1.4468F, 0.3028F, -0.2662F));

		PartDefinition cube_r393 = bone.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(95, 94).addBox(-0.5F, -1.375F, -1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3523F, -2.3598F, 1.7721F, -0.9668F, 0.3028F, -0.2662F));

		PartDefinition cube_r394 = bone.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(108, 54).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2897F, -4.9489F, -2.0047F, 0.6738F, 0.3028F, -0.2662F));

		PartDefinition cube_r395 = bone.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(39, 136).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.0748F, -5.2601F, -1.079F, 0.2462F, 0.3028F, -0.2662F));

		PartDefinition cube_r396 = bone.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(121, 107).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3932F, -4.9656F, 0.7781F, -0.2338F, 0.3028F, -0.2662F));

		PartDefinition cube_r397 = bone.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(100, 121).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6193F, -3.942F, 2.3065F, -0.6352F, 0.3028F, -0.2662F));

		PartDefinition cube_r398 = bone.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(22, 107).addBox(-0.9604F, -1.2864F, 1.9247F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.5813F, 0.3028F, -0.2662F));

		PartDefinition cube_r399 = bone.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(118, 142).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6438F, 3.1398F, -3.7589F, 2.8293F, 0.3028F, -0.2662F));

		PartDefinition cube_r400 = bone.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(87, 140).addBox(-0.5F, -1.0F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.6358F, 1.7593F, -2.572F, -3.1049F, 0.3028F, -0.2662F));

		PartDefinition cube_r401 = bone.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(111, 131).addBox(-0.7604F, -2.7939F, 0.38F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.9165F, 0.3028F, -0.2662F));

		PartDefinition cube_r402 = bone.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(34, 136).addBox(-0.5F, -3.0F, -1.4F, 2.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6772F, -0.6704F, -2.4003F, 2.4229F, -0.2261F, -0.003F));

		PartDefinition cube_r403 = bone.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(62, 110).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4013F, -0.5044F, -0.3955F, 3.0121F, -0.2687F, -0.2694F));

		PartDefinition cube_r404 = bone.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(67, 100).addBox(-0.7604F, -2.773F, -0.2958F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.5675F, 0.3028F, -0.2662F));

		PartDefinition cube_r405 = bone.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(121, 60).addBox(-0.5F, -1.5F, -1.275F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.2473F, -0.1671F, -2.8386F, 2.3057F, 0.3028F, -0.2662F));

		PartDefinition cube_r406 = bone.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(29, 136).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.5904F, 0.4065F, -4.3544F, 1.6948F, 0.3028F, -0.2662F));

		PartDefinition cube_r407 = bone.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(35, 99).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.882F, -0.5422F, -4.4831F, 1.2585F, 0.3028F, -0.2662F));

		PartDefinition cube_r408 = bone.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(50, 121).addBox(-0.5F, -2.025F, -0.95F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.6535F, -2.2862F, -2.3087F, 1.6512F, 0.3028F, -0.2662F));

		PartDefinition bone3 = body.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5569F, 4.6449F, 0.8843F, -0.219F, 0.0852F, -0.0189F));

		PartDefinition cube_r409 = bone3.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(43, 97).mirror().addBox(-0.5F, -2.95F, -0.375F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1297F, 1.5073F, 0.0047F, 0.0367F, -0.3028F, 0.2662F));

		PartDefinition cube_r410 = bone3.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(135, 142).mirror().addBox(-0.5F, -0.3F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.1012F, 0.7376F, -0.0605F, 0.604F, -0.3028F, 0.2662F));

		PartDefinition cube_r411 = bone3.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(126, 120).mirror().addBox(-0.5F, -1.3F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.0913F, 0.6275F, 3.7154F, -0.2687F, -0.3028F, 0.2662F));

		PartDefinition cube_r412 = bone3.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(56, 142).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1642F, -0.5144F, 4.9021F, -0.8796F, -0.3028F, 0.2662F));

		PartDefinition cube_r413 = bone3.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(119, 44).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6309F, 1.4796F, 4.6646F, -1.4468F, -0.3028F, 0.2662F));

		PartDefinition cube_r414 = bone3.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(95, 94).mirror().addBox(-0.5F, -1.375F, -1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3523F, -2.3598F, 1.7721F, -0.9668F, -0.3028F, 0.2662F));

		PartDefinition cube_r415 = bone3.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(108, 54).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2897F, -4.9489F, -2.0047F, 0.6738F, -0.3028F, 0.2662F));

		PartDefinition cube_r416 = bone3.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(39, 136).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(2.0748F, -5.2601F, -1.079F, 0.2462F, -0.3028F, 0.2662F));

		PartDefinition cube_r417 = bone3.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(121, 107).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.3932F, -4.9656F, 0.7781F, -0.2338F, -0.3028F, 0.2662F));

		PartDefinition cube_r418 = bone3.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(100, 121).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.6193F, -3.942F, 2.3065F, -0.6352F, -0.3028F, 0.2662F));

		PartDefinition cube_r419 = bone3.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(22, 107).mirror().addBox(-1.0396F, -1.2864F, 1.9247F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.5813F, -0.3028F, 0.2662F));

		PartDefinition cube_r420 = bone3.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(118, 142).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.6438F, 3.1398F, -3.7589F, 2.8293F, -0.3028F, 0.2662F));

		PartDefinition cube_r421 = bone3.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(87, 140).mirror().addBox(-0.5F, -1.0F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.6358F, 1.7593F, -2.572F, -3.1049F, -0.3028F, 0.2662F));

		PartDefinition cube_r422 = bone3.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(111, 131).mirror().addBox(-0.2396F, -2.7939F, 0.38F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.9165F, -0.3028F, 0.2662F));

		PartDefinition cube_r423 = bone3.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(34, 136).mirror().addBox(-1.5F, -3.0F, -1.4F, 2.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6772F, -0.6704F, -2.4003F, 2.4229F, 0.2261F, 0.003F));

		PartDefinition cube_r424 = bone3.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(62, 110).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4013F, -0.5044F, -0.3955F, 3.0121F, 0.2687F, 0.2694F));

		PartDefinition cube_r425 = bone3.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(67, 100).mirror().addBox(-0.2396F, -2.773F, -0.2958F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.5675F, -0.3028F, 0.2662F));

		PartDefinition cube_r426 = bone3.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(121, 60).mirror().addBox(-0.5F, -1.5F, -1.275F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.2473F, -0.1671F, -2.8386F, 2.3057F, -0.3028F, 0.2662F));

		PartDefinition cube_r427 = bone3.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(29, 136).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.5904F, 0.4065F, -4.3544F, 1.6948F, -0.3028F, 0.2662F));

		PartDefinition cube_r428 = bone3.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(35, 99).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.882F, -0.5422F, -4.4831F, 1.2585F, -0.3028F, 0.2662F));

		PartDefinition cube_r429 = bone3.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(50, 121).mirror().addBox(-0.5F, -2.025F, -0.95F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.6535F, -2.2862F, -2.3087F, 1.6512F, -0.3028F, 0.2662F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7679F, -3.1309F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r430 = chest.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(118, 131).addBox(-0.5F, -1.0F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.486F, -1.4626F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r431 = chest.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(88, 133).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8245F, 0.0937F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.1676F, 5.4007F, 0.1914F, -1.7699F, 0.3285F, -0.2644F));

		PartDefinition cube_r432 = leftArm.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(44, 136).addBox(-1.0F, -0.35F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.02F, 0.413F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r433 = leftArm.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(67, 128).addBox(-1.0F, -0.65F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -0.6F, 0.7F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r434 = leftArm.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(0, 144).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -0.6522F, 7.5255F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r435 = leftArm.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(143, 83).addBox(-0.5F, 0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(143, 80).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.578F, 6.4455F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r436 = leftArm.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(49, 143).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -1.5211F, 6.4701F, 1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r437 = leftArm.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(132, 15).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -1.3474F, 5.4852F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r438 = leftArm.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(143, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9419F, 6.0645F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r439 = leftArm.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(140, 142).addBox(-0.5F, -0.775F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6454F, -0.0873F, 3.5032F, 0.3054F, 0.0F, -0.5672F));

		PartDefinition cube_r440 = leftArm.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(116, 4).addBox(-0.5F, -0.7484F, -2.6016F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0016F, 2.7516F, 0.1745F, 0.0F, -0.5672F));

		PartDefinition cube_r441 = leftArm.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(112, 115).addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 1.2F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(65, 136).addBox(-0.5F, -0.2965F, -0.3472F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 81).addBox(-0.5F, -0.4965F, 0.0528F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1397F, -0.9011F, 8.7672F, 0.06F, 0.5766F, -0.2479F));

		PartDefinition cube_r442 = leftArm2.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(126, 125).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.33F, 3.1496F, -0.4132F, -0.1128F, -0.2618F, 0.0826F));

		PartDefinition cube_r443 = leftArm2.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(97, 136).addBox(-1.0F, 0.0F, -1.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 0.0035F, 1.7528F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r444 = leftArm2.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(140, 53).addBox(-0.5F, -1.1F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 3.4731F, 0.2055F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r445 = leftArm2.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(140, 94).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5035F, 0.5528F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(60, 128).addBox(-0.9856F, 0.0926F, -1.0522F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.6054F, 5.3293F, 0.1577F, -0.6118F, 0.6276F, -0.8822F));

		PartDefinition cube_r446 = leftArm3.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(92, 131).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4856F, 2.3941F, 1.4624F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r447 = leftArm3.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(104, 136).addBox(-0.5F, -0.8F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4856F, 2.4987F, 0.267F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r448 = leftArm3.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(136, 8).addBox(-0.5F, -1.1F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4856F, 2.5926F, -0.5522F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.1676F, 5.4007F, 0.1914F, -1.7699F, -0.3285F, 0.2644F));

		PartDefinition cube_r449 = rightArm.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(123, 138).addBox(-1.0F, -0.35F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.02F, 0.413F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r450 = rightArm.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(128, 73).addBox(-1.0F, -0.65F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, -0.6F, 0.7F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r451 = rightArm.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(147, 86).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -0.6522F, 7.5255F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r452 = rightArm.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(86, 147).addBox(-0.5F, 0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 147).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.578F, 6.4455F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r453 = rightArm.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(147, 71).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, -1.5211F, 6.4701F, 1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r454 = rightArm.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(134, 69).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, -1.3474F, 5.4852F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r455 = rightArm.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(147, 44).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9419F, 6.0645F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r456 = rightArm.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(147, 41).addBox(-0.5F, -0.775F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6454F, -0.0873F, 3.5032F, 0.3054F, 0.0F, 0.5672F));

		PartDefinition cube_r457 = rightArm.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(117, 97).addBox(-0.5F, -0.7484F, -2.6016F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, -0.0016F, 2.7516F, 0.1745F, 0.0F, 0.5672F));

		PartDefinition cube_r458 = rightArm.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(117, 92).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 1.2F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(139, 13).addBox(-1.5F, -0.2965F, -0.3472F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(139, 16).addBox(-1.5F, -0.4965F, 0.0528F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1397F, -0.9011F, 8.7672F, 0.06F, -0.5766F, 0.2479F));

		PartDefinition cube_r459 = rightArm2.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(5, 128).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.33F, 3.1496F, -0.4132F, -0.1128F, 0.2618F, -0.0826F));

		PartDefinition cube_r460 = rightArm2.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(139, 19).addBox(-1.0F, 0.0F, -1.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 0.0035F, 1.7528F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r461 = rightArm2.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(140, 58).addBox(-0.5F, -1.1F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 3.4731F, 0.2055F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r462 = rightArm2.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(103, 141).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.5035F, 0.5528F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(128, 60).addBox(-0.0144F, 0.0926F, -1.0522F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.6054F, 5.3293F, 0.1577F, -0.6118F, -0.6276F, 0.8822F));

		PartDefinition cube_r463 = rightArm3.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(5, 135).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4856F, 2.3941F, 1.4624F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r464 = rightArm3.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(0, 139).addBox(-0.5F, -0.8F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4856F, 2.4987F, 0.267F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r465 = rightArm3.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(17, 136).addBox(-0.5F, -1.1F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4856F, 2.5926F, -0.5522F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4433F, -1.4657F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r466 = neck3.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(143, 147).addBox(0.0F, -1.5477F, 0.0842F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.372F, -1.3523F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r467 = neck3.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(144, 29).addBox(-0.5F, -0.175F, 3.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.128F, -4.7523F, 0.4014F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2191F, -1.0418F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r468 = neck2.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(18, 116).addBox(-0.5F, -1.0F, -1.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.5504F, -1.3541F, 0.3316F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6848F, -0.6576F, -0.394F, -0.0806F, 0.0335F));

		PartDefinition cube_r469 = head.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(106, 91).addBox(-0.5F, -2.0F, -2.975F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 3.1135F, 1.2935F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r470 = head.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(97, 54).addBox(-0.5F, -3.8F, -3.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 6.5605F, -0.2825F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r471 = head.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(127, 26).addBox(-0.5F, -1.0F, -0.675F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 6.3657F, -1.3638F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r472 = head.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(18, 127).addBox(-0.4942F, -1.4421F, -2.3656F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0058F, 6.9013F, -0.7709F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r473 = head.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(132, 65).addBox(-0.509F, -2.0019F, -0.0127F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.491F, 6.1841F, -3.6523F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r474 = head.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(103, 9).addBox(-1.5F, -0.4019F, -0.0127F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.491F, 5.5972F, -3.7771F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r475 = head.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(117, 54).addBox(-1.5F, -0.0019F, -0.0127F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.491F, 5.1337F, -3.9644F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r476 = head.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(0, 119).addBox(-1.0F, -0.2269F, -0.0127F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.991F, 4.4051F, -3.7555F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r477 = head.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(116, 102).addBox(0.006F, -0.5019F, -0.0377F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.006F, 3.8748F, -3.7089F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r478 = head.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(51, 116).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5434F, -3.7488F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r479 = head.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(13, 93).addBox(-2.5F, 0.0F, -0.9F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -0.4042F, -1.8849F, -1.5097F, 0.0F, 0.0F));

		PartDefinition cube_r480 = head.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(144, 47).addBox(-0.4942F, -0.7315F, -0.494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0058F, 6.9013F, -0.7709F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r481 = head.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(116, 30).addBox(-1.5F, -0.5F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.491F, 0.1851F, -2.4291F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r482 = head.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(117, 57).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.009F, 0.4803F, -3.8131F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r483 = head.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(116, 9).addBox(-1.5F, -0.2F, -0.275F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.491F, -0.277F, -3.436F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r484 = head.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(17, 132).addBox(-1.5F, 1.9145F, -0.5314F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.503F, 3.2484F, -4.9337F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r485 = head.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(0, 122).addBox(-2.0F, -0.0132F, -0.0178F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.503F, 3.2484F, -4.9337F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r486 = head.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(116, 25).addBox(-2.0F, -0.131F, -0.3096F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.503F, 0.5234F, -3.9837F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r487 = head.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(117, 76).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, 0.5431F, -1.3821F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r488 = head.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(117, 73).addBox(-2.0F, -0.75F, 0.225F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(18, 112).addBox(-1.6F, -0.5F, -1.025F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, 1.2716F, -2.62F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r489 = head.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(144, 32).addBox(-0.5209F, -0.4726F, -0.5107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0058F, 6.9013F, -0.7709F, -0.4786F, -0.0357F, -0.0253F));

		PartDefinition leftSygomaticarch = head.addOrReplaceChild("leftSygomaticarch", CubeListBuilder.create(), PartPose.offset(2.9479F, 7.4281F, 0.4418F));

		PartDefinition cube_r490 = leftSygomaticarch.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(132, 19).addBox(-2.0483F, 0.6011F, -0.5973F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.865F, -3.26F, -1.1368F, -0.0019F, -0.8394F, -0.1119F));

		PartDefinition cube_r491 = leftSygomaticarch.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(144, 133).addBox(0.5953F, -4.6969F, -1.5333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(128, 144).addBox(0.5953F, -4.6969F, -1.2833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-0.865F, -3.26F, -1.1368F, -2.1843F, -0.0007F, 0.2354F));

		PartDefinition cube_r492 = leftSygomaticarch.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(141, 4).addBox(-0.7507F, -1.2538F, -0.4921F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.3972F, -0.3008F, -1.1413F, -0.1193F, -0.0779F, -0.2956F));

		PartDefinition cube_r493 = leftSygomaticarch.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(71, 145).addBox(-0.3499F, -0.4867F, -0.4921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.3972F, -0.3008F, -1.1413F, -0.1364F, 0.0409F, 0.5696F));

		PartDefinition cube_r494 = leftSygomaticarch.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(51, 137).addBox(-1.7073F, -0.7255F, -0.4921F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-2.3972F, -0.3008F, -1.1413F, -0.0622F, 0.1281F, 1.3974F));

		PartDefinition cube_r495 = leftSygomaticarch.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(66, 145).addBox(-0.8F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.8883F, -0.6177F, -3.5126F, -0.0172F, -0.1298F, 1.7028F));

		PartDefinition cube_r496 = leftSygomaticarch.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(145, 59).addBox(-0.8F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.3479F, -0.2353F, -3.4623F, 0.0844F, -0.1002F, 0.8684F));

		PartDefinition cube_r497 = leftSygomaticarch.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(5, 141).addBox(-0.5F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.3479F, -4.2302F, 1.082F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r498 = leftSygomaticarch.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(128, 53).addBox(-0.2F, -3.6F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.6479F, -1.1487F, -0.3549F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r499 = leftSygomaticarch.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(81, 144).addBox(-0.209F, -0.1531F, -0.5078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.9389F, -0.8777F, -3.5389F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r500 = leftSygomaticarch.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(144, 76).addBox(-0.209F, -0.6467F, -0.5133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.9389F, -0.8777F, -3.5389F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r501 = leftSygomaticarch.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(140, 129).addBox(-0.9F, -1.9019F, -0.9127F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(130, 140).addBox(-0.9F, -1.9019F, -1.5127F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.9389F, -0.4724F, -3.4581F, -1.0655F, -0.4729F, 0.7094F));

		PartDefinition cube_r502 = leftSygomaticarch.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(137, 47).addBox(-2.0F, -0.0269F, -0.0127F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.9389F, -3.2157F, -4.1439F, -0.2234F, 0.1539F, 0.5936F));

		PartDefinition cube_r503 = leftSygomaticarch.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(144, 116).addBox(0.5953F, -4.3157F, -2.0935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(40, 144).addBox(0.5953F, -4.3157F, -1.5935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.865F, -3.26F, -1.1368F, -2.4898F, -0.0007F, 0.2354F));

		PartDefinition cube_r504 = leftSygomaticarch.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(67, 132).addBox(0.5953F, -3.4453F, -3.1534F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-0.865F, -3.26F, -1.1368F, -2.8825F, -0.0007F, 0.2354F));

		PartDefinition cube_r505 = leftSygomaticarch.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(105, 27).addBox(0.4953F, 0.9814F, -0.5841F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.865F, -3.26F, -1.1368F, -0.3081F, -0.0007F, 0.2354F));

		PartDefinition cube_r506 = leftSygomaticarch.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(144, 113).addBox(0.4575F, -2.502F, 2.5848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.865F, -3.26F, -1.1368F, -1.3149F, 0.004F, 0.2243F));

		PartDefinition cube_r507 = leftSygomaticarch.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(10, 133).addBox(0.4575F, 0.7077F, -0.9288F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.865F, -3.26F, -1.1368F, -0.5383F, 0.004F, 0.2243F));

		PartDefinition cube_r508 = leftSygomaticarch.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(104, 132).addBox(0.4575F, 1.0141F, -1.9241F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.865F, -3.26F, -1.1368F, -0.0147F, 0.004F, 0.2243F));

		PartDefinition cube_r509 = leftSygomaticarch.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(125, 70).addBox(-1.6045F, 0.802F, -2.9807F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.865F, -3.26F, -1.1368F, -0.3528F, 0.1727F, 0.2461F));

		PartDefinition cube_r510 = leftSygomaticarch.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(137, 32).addBox(-0.6045F, 2.4136F, 0.1509F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.865F, -3.26F, -1.1368F, -1.4872F, 0.1727F, 0.2461F));

		PartDefinition cube_r511 = leftSygomaticarch.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(137, 29).addBox(-0.2046F, -0.2427F, 2.3532F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.865F, -3.26F, -1.1368F, -2.5576F, 0.3088F, 0.2435F));

		PartDefinition cube_r512 = leftSygomaticarch.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(145, 56).addBox(1.3746F, -2.3093F, 0.9685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.865F, -3.26F, -1.1368F, 2.9362F, 0.4791F, 0.3727F));

		PartDefinition cube_r513 = leftSygomaticarch.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(147, 89).addBox(1.3746F, -1.5316F, 1.1594F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.865F, -3.26F, -1.1368F, -2.867F, 0.4791F, 0.3727F));

		PartDefinition cube_r514 = leftSygomaticarch.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(141, 50).addBox(0.4575F, -1.0277F, 1.6271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(-0.865F, -3.26F, -1.1368F, -2.6763F, 0.004F, 0.2243F));

		PartDefinition cube_r515 = leftSygomaticarch.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(144, 136).addBox(0.4575F, 0.3327F, 1.1901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.865F, -3.26F, -1.1368F, -2.0218F, 0.004F, 0.2243F));

		PartDefinition cube_r516 = leftSygomaticarch.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(132, 102).addBox(0.4575F, 0.9529F, -0.6722F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.865F, -3.26F, -1.1368F, -1.28F, 0.004F, 0.2243F));

		PartDefinition cube_r517 = leftSygomaticarch.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(53, 133).addBox(0.4148F, 0.7224F, -2.6519F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F))
				.texOffs(97, 132).addBox(0.4148F, 0.5474F, -2.3519F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.865F, -3.26F, -1.1368F, -0.8869F, -0.0135F, 0.1152F));

		PartDefinition cube_r518 = leftSygomaticarch.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(25, 122).addBox(-1.0017F, -0.5908F, -1.1426F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.7017F, -7.3117F, -3.3704F, -2.8257F, -0.0469F, 0.4981F));

		PartDefinition cube_r519 = leftSygomaticarch.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(142, 73).addBox(1.1672F, 3.0632F, 0.9924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-0.865F, -3.26F, -1.1368F, -2.8844F, 0.0722F, -0.2344F));

		PartDefinition cube_r520 = leftSygomaticarch.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(140, 125).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0647F, -6.4741F, -3.1641F, 2.7879F, 0.0722F, -0.2344F));

		PartDefinition cube_r521 = leftSygomaticarch.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(71, 142).addBox(1.1672F, 1.8022F, 2.031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.865F, -3.26F, -1.1368F, 3.0497F, 0.0722F, -0.2344F));

		PartDefinition cube_r522 = leftSygomaticarch.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(145, 53).addBox(0.855F, 0.5532F, 2.6243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.865F, -3.26F, -1.1368F, 2.7443F, 0.0722F, -0.1035F));

		PartDefinition cube_r523 = leftSygomaticarch.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(20, 145).addBox(0.855F, -3.3898F, 0.5885F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-0.865F, -3.26F, -1.1368F, 1.3917F, 0.0722F, -0.1035F));

		PartDefinition cube_r524 = leftSygomaticarch.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(15, 145).addBox(0.855F, -2.5136F, -2.4856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.865F, -3.26F, -1.1368F, 0.3881F, 0.0722F, -0.1035F));

		PartDefinition cube_r525 = leftSygomaticarch.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(35, 145).addBox(0.855F, 2.2342F, -1.6329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(-0.865F, -3.26F, -1.1368F, -1.9245F, 0.0722F, -0.1035F));

		PartDefinition cube_r526 = leftSygomaticarch.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(30, 145).addBox(0.855F, 0.8798F, -2.6284F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-0.865F, -3.26F, -1.1368F, -1.1391F, 0.0722F, -0.1035F));

		PartDefinition cube_r527 = leftSygomaticarch.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(25, 145).addBox(0.4148F, -2.1853F, -2.109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.865F, -3.26F, -1.1368F, 0.3174F, -0.0135F, 0.1152F));

		PartDefinition cube_r528 = leftSygomaticarch.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(5, 145).addBox(0.4148F, -2.3192F, -2.456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.865F, -3.26F, -1.1368F, 0.4046F, -0.0135F, 0.1152F));

		PartDefinition cube_r529 = leftSygomaticarch.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(144, 139).addBox(0.4148F, -0.3753F, -2.8427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-0.865F, -3.26F, -1.1368F, -0.3371F, -0.0135F, 0.1152F));

		PartDefinition cube_r530 = leftSygomaticarch.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(20, 141).addBox(0.0F, -0.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4449F, -5.6458F, -5.0462F, -0.2542F, -0.3813F, 0.0964F));

		PartDefinition cube_r531 = leftSygomaticarch.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(145, 123).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(145, 126).addBox(-1.4F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.521F, -6.0427F, -4.5573F, -0.3769F, -0.0604F, 0.9336F));

		PartDefinition cube_r532 = leftSygomaticarch.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(141, 22).addBox(0.0F, -0.0132F, -0.0178F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4449F, -4.1797F, -5.3755F, 0.0283F, -0.3926F, -0.0108F));

		PartDefinition cube_r533 = leftSygomaticarch.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(15, 141).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.4449F, -2.3351F, -4.8619F, 0.2787F, -0.0736F, 0.2515F));

		PartDefinition cube_r534 = leftSygomaticarch.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(145, 129).addBox(-1.0F, -0.125F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.4449F, -2.1931F, -5.3413F, 0.6533F, 1.1025F, 0.8717F));

		PartDefinition cube_r535 = leftSygomaticarch.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(133, 145).addBox(-1.0F, -1.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(138, 145).addBox(-1.0F, -1.025F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.7566F, -1.2083F, -4.736F, 1.7252F, 1.1248F, 0.9475F));

		PartDefinition cube_r536 = leftSygomaticarch.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(0, 92).addBox(-0.525F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.2085F, -1.7552F, -0.4412F, -0.5828F, -0.0125F, 0.2115F));

		PartDefinition cube_r537 = leftSygomaticarch.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(32, 127).addBox(-0.65F, 0.425F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9479F, -6.6569F, -3.0781F, -0.0143F, 0.01F, 0.6108F));

		PartDefinition rightSygomaticarch = head.addOrReplaceChild("rightSygomaticarch", CubeListBuilder.create(), PartPose.offset(-2.9479F, 7.4281F, 0.4418F));

		PartDefinition cube_r538 = rightSygomaticarch.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(132, 19).mirror().addBox(1.0483F, 0.6011F, -0.5973F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.865F, -3.26F, -1.1368F, -0.0019F, 0.8394F, 0.1119F));

		PartDefinition cube_r539 = rightSygomaticarch.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(144, 133).mirror().addBox(-1.5953F, -4.6969F, -1.5333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(128, 144).mirror().addBox(-1.5953F, -4.6969F, -1.2833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(0.865F, -3.26F, -1.1368F, -2.1843F, 0.0007F, -0.2354F));

		PartDefinition cube_r540 = rightSygomaticarch.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(141, 4).mirror().addBox(-0.2493F, -1.2538F, -0.4921F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.3972F, -0.3008F, -1.1413F, -0.1193F, 0.0779F, 0.2956F));

		PartDefinition cube_r541 = rightSygomaticarch.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(71, 145).mirror().addBox(-0.6501F, -0.4867F, -0.4921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.3972F, -0.3008F, -1.1413F, -0.1364F, -0.0409F, -0.5696F));

		PartDefinition cube_r542 = rightSygomaticarch.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(51, 137).mirror().addBox(-0.2927F, -0.7255F, -0.4921F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(2.3972F, -0.3008F, -1.1413F, -0.0622F, -0.1281F, -1.3974F));

		PartDefinition cube_r543 = rightSygomaticarch.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(66, 145).mirror().addBox(-0.2F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.8883F, -0.6177F, -3.5126F, -0.0172F, 0.1298F, -1.7028F));

		PartDefinition cube_r544 = rightSygomaticarch.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(145, 59).mirror().addBox(-0.2F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.3479F, -0.2353F, -3.4623F, 0.0844F, 0.1002F, -0.8684F));

		PartDefinition cube_r545 = rightSygomaticarch.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(5, 141).mirror().addBox(-0.5F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.3479F, -4.2302F, 1.082F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r546 = rightSygomaticarch.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(128, 53).mirror().addBox(-0.8F, -3.6F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.6479F, -1.1487F, -0.3549F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r547 = rightSygomaticarch.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(81, 144).mirror().addBox(-0.791F, -0.1531F, -0.5078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.9389F, -0.8777F, -3.5389F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r548 = rightSygomaticarch.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(144, 76).mirror().addBox(-0.791F, -0.6467F, -0.5133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.9389F, -0.8777F, -3.5389F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r549 = rightSygomaticarch.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(140, 129).mirror().addBox(-0.1F, -1.9019F, -0.9127F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(130, 140).mirror().addBox(-0.1F, -1.9019F, -1.5127F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(1.9389F, -0.4724F, -3.4581F, -1.0655F, 0.4729F, -0.7094F));

		PartDefinition cube_r550 = rightSygomaticarch.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(137, 47).mirror().addBox(0.0F, -0.0269F, -0.0127F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.9389F, -3.2157F, -4.1439F, -0.2234F, -0.1539F, -0.5936F));

		PartDefinition cube_r551 = rightSygomaticarch.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(144, 116).mirror().addBox(-1.5953F, -4.3157F, -2.0935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(40, 144).mirror().addBox(-1.5953F, -4.3157F, -1.5935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(0.865F, -3.26F, -1.1368F, -2.4898F, 0.0007F, -0.2354F));

		PartDefinition cube_r552 = rightSygomaticarch.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(67, 132).mirror().addBox(-1.5953F, -3.4453F, -3.1534F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(0.865F, -3.26F, -1.1368F, -2.8825F, 0.0007F, -0.2354F));

		PartDefinition cube_r553 = rightSygomaticarch.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(105, 27).mirror().addBox(-1.4953F, 0.9814F, -0.5841F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.865F, -3.26F, -1.1368F, -0.3081F, 0.0007F, -0.2354F));

		PartDefinition cube_r554 = rightSygomaticarch.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(144, 113).mirror().addBox(-1.4575F, -2.502F, 2.5848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.865F, -3.26F, -1.1368F, -1.3149F, -0.004F, -0.2243F));

		PartDefinition cube_r555 = rightSygomaticarch.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(10, 133).mirror().addBox(-1.4575F, 0.7077F, -0.9288F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.865F, -3.26F, -1.1368F, -0.5383F, -0.004F, -0.2243F));

		PartDefinition cube_r556 = rightSygomaticarch.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(104, 132).mirror().addBox(-1.4575F, 1.0141F, -1.9241F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.865F, -3.26F, -1.1368F, -0.0147F, -0.004F, -0.2243F));

		PartDefinition cube_r557 = rightSygomaticarch.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(125, 70).mirror().addBox(-1.3955F, 0.802F, -2.9807F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.865F, -3.26F, -1.1368F, -0.3528F, -0.1727F, -0.2461F));

		PartDefinition cube_r558 = rightSygomaticarch.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(137, 32).mirror().addBox(-1.3955F, 2.4136F, 0.1509F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.865F, -3.26F, -1.1368F, -1.4872F, -0.1727F, -0.2461F));

		PartDefinition cube_r559 = rightSygomaticarch.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(137, 29).mirror().addBox(-1.7954F, -0.2427F, 2.3532F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.865F, -3.26F, -1.1368F, -2.5576F, -0.3088F, -0.2435F));

		PartDefinition cube_r560 = rightSygomaticarch.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(145, 56).mirror().addBox(-2.3746F, -2.3093F, 0.9685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.865F, -3.26F, -1.1368F, 2.9362F, -0.4791F, -0.3727F));

		PartDefinition cube_r561 = rightSygomaticarch.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(147, 89).mirror().addBox(-2.3746F, -1.5316F, 1.1594F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.865F, -3.26F, -1.1368F, -2.867F, -0.4791F, -0.3727F));

		PartDefinition cube_r562 = rightSygomaticarch.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(141, 50).mirror().addBox(-1.4575F, -1.0277F, 1.6271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(0.865F, -3.26F, -1.1368F, -2.6763F, -0.004F, -0.2243F));

		PartDefinition cube_r563 = rightSygomaticarch.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(144, 136).mirror().addBox(-1.4575F, 0.3327F, 1.1901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.865F, -3.26F, -1.1368F, -2.0218F, -0.004F, -0.2243F));

		PartDefinition cube_r564 = rightSygomaticarch.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(132, 102).mirror().addBox(-1.4575F, 0.9529F, -0.6722F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.865F, -3.26F, -1.1368F, -1.28F, -0.004F, -0.2243F));

		PartDefinition cube_r565 = rightSygomaticarch.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(53, 133).mirror().addBox(-1.4148F, 0.7224F, -2.6519F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false)
				.texOffs(97, 132).mirror().addBox(-1.4148F, 0.5474F, -2.3519F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.865F, -3.26F, -1.1368F, -0.8869F, 0.0135F, -0.1152F));

		PartDefinition cube_r566 = rightSygomaticarch.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(25, 122).mirror().addBox(-0.9983F, -0.5908F, -1.1426F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.7017F, -7.3117F, -3.3704F, -2.8257F, 0.0469F, -0.4981F));

		PartDefinition cube_r567 = rightSygomaticarch.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(142, 73).mirror().addBox(-2.1672F, 3.0632F, 0.9924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(0.865F, -3.26F, -1.1368F, -2.8844F, -0.0722F, 0.2344F));

		PartDefinition cube_r568 = rightSygomaticarch.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(140, 125).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.0647F, -6.4741F, -3.1641F, 2.7879F, -0.0722F, 0.2344F));

		PartDefinition cube_r569 = rightSygomaticarch.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(71, 142).mirror().addBox(-2.1672F, 1.8022F, 2.031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.865F, -3.26F, -1.1368F, 3.0497F, -0.0722F, 0.2344F));

		PartDefinition cube_r570 = rightSygomaticarch.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(145, 53).mirror().addBox(-1.855F, 0.5532F, 2.6243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.865F, -3.26F, -1.1368F, 2.7443F, -0.0722F, 0.1035F));

		PartDefinition cube_r571 = rightSygomaticarch.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(20, 145).mirror().addBox(-1.855F, -3.3898F, 0.5885F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(0.865F, -3.26F, -1.1368F, 1.3917F, -0.0722F, 0.1035F));

		PartDefinition cube_r572 = rightSygomaticarch.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(15, 145).mirror().addBox(-1.855F, -2.5136F, -2.4856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.865F, -3.26F, -1.1368F, 0.3881F, -0.0722F, 0.1035F));

		PartDefinition cube_r573 = rightSygomaticarch.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(35, 145).mirror().addBox(-1.855F, 2.2342F, -1.6329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(0.865F, -3.26F, -1.1368F, -1.9245F, -0.0722F, 0.1035F));

		PartDefinition cube_r574 = rightSygomaticarch.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(30, 145).mirror().addBox(-1.855F, 0.8798F, -2.6284F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(0.865F, -3.26F, -1.1368F, -1.1391F, -0.0722F, 0.1035F));

		PartDefinition cube_r575 = rightSygomaticarch.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(25, 145).mirror().addBox(-1.4148F, -2.1853F, -2.109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.865F, -3.26F, -1.1368F, 0.3174F, 0.0135F, -0.1152F));

		PartDefinition cube_r576 = rightSygomaticarch.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(5, 145).mirror().addBox(-1.4148F, -2.3192F, -2.456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.865F, -3.26F, -1.1368F, 0.4046F, 0.0135F, -0.1152F));

		PartDefinition cube_r577 = rightSygomaticarch.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(144, 139).mirror().addBox(-1.4148F, -0.3753F, -2.8427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(0.865F, -3.26F, -1.1368F, -0.3371F, 0.0135F, -0.1152F));

		PartDefinition cube_r578 = rightSygomaticarch.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(20, 141).mirror().addBox(-1.0F, -0.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4449F, -5.6458F, -5.0462F, -0.2542F, 0.3813F, -0.0964F));

		PartDefinition cube_r579 = rightSygomaticarch.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(145, 123).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(145, 126).mirror().addBox(0.4F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.521F, -6.0427F, -4.5573F, -0.3769F, 0.0604F, -0.9336F));

		PartDefinition cube_r580 = rightSygomaticarch.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(141, 22).mirror().addBox(-1.0F, -0.0132F, -0.0178F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4449F, -4.1797F, -5.3755F, 0.0283F, 0.3926F, 0.0108F));

		PartDefinition cube_r581 = rightSygomaticarch.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(15, 141).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.4449F, -2.3351F, -4.8619F, 0.2787F, 0.0736F, -0.2515F));

		PartDefinition cube_r582 = rightSygomaticarch.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(145, 129).mirror().addBox(0.0F, -0.125F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.4449F, -2.1931F, -5.3413F, 0.6533F, -1.1025F, -0.8717F));

		PartDefinition cube_r583 = rightSygomaticarch.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(133, 145).mirror().addBox(0.0F, -1.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(138, 145).mirror().addBox(0.0F, -1.025F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.7566F, -1.2083F, -4.736F, 1.7252F, -1.1248F, -0.9475F));

		PartDefinition cube_r584 = rightSygomaticarch.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-0.475F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.2085F, -1.7552F, -0.4412F, -0.5828F, 0.0125F, -0.2115F));

		PartDefinition cube_r585 = rightSygomaticarch.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(32, 127).mirror().addBox(-0.35F, 0.425F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9479F, -6.6569F, -3.0781F, -0.0143F, -0.01F, -0.6108F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5826F, -2.5015F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r586 = jaw.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(32, 132).mirror().addBox(-0.5F, -0.9F, -1.475F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2757F, 1.9076F, 0.992F, 0.6109F, 0.0F, -0.1047F));

		PartDefinition cube_r587 = jaw.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(10, 137).mirror().addBox(-0.5F, 0.0F, -0.05F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6317F, -1.4791F, 4.1647F, 0.1309F, 0.0F, -0.1047F));

		PartDefinition cube_r588 = jaw.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(105, 108).mirror().addBox(-0.6153F, -0.8585F, -1.6469F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8693F, 1.8484F, 5.1162F, 0.1598F, 0.0994F, -0.605F));

		PartDefinition cube_r589 = jaw.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(36, 115).mirror().addBox(-0.3605F, -1.3994F, -0.8409F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8693F, 1.8484F, 5.1162F, 1.5538F, -0.0524F, -0.6485F));

		PartDefinition cube_r590 = jaw.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(39, 132).mirror().addBox(-0.7F, -0.8F, -1.675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.4512F, 0.2376F, 1.3512F, -0.0873F, 0.0F, -0.1047F));

		PartDefinition cube_r591 = jaw.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(125, 20).mirror().addBox(-0.5F, -1.775F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.1675F, 3.736F, 4.7028F, -0.4695F, -0.0358F, -0.0984F));

		PartDefinition cube_r592 = jaw.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(136, 0).mirror().addBox(0.0F, 1.5565F, -1.2147F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -0.2F, 4.2F, -0.3229F, 0.0F, -0.1047F));

		PartDefinition cube_r593 = jaw.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(71, 117).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.0539F, 4.2039F, 3.2251F, -2.0754F, -0.0653F, -0.1807F));

		PartDefinition cube_r594 = jaw.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(35, 105).mirror().addBox(-0.648F, 0.4045F, -2.5109F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5557F, 5.2266F, 3.633F, -2.0475F, -0.0347F, -0.1714F));

		PartDefinition cube_r595 = jaw.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(46, 132).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6977F, 6.3182F, 3.6759F, -2.57F, -0.0462F, -0.1864F));

		PartDefinition cube_r596 = jaw.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(86, 144).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.9823F, 5.3225F, 5.2793F, -2.3981F, -0.0358F, -0.0984F));

		PartDefinition cube_r597 = jaw.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(125, 102).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.0738F, 4.6608F, 6.0044F, 2.8202F, -0.0288F, -0.1007F));

		PartDefinition cube_r598 = jaw.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(76, 145).mirror().addBox(-0.5F, -0.8F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2757F, 1.9076F, 0.992F, 1.0472F, 0.0F, -0.1047F));

		PartDefinition cube_r599 = jaw.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(13, 98).mirror().addBox(-0.5F, -1.475F, -1.3F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3589F, 1.1166F, 2.1041F, 0.1658F, 0.0F, -0.1047F));

		PartDefinition cube_r600 = jaw.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(72, 137).mirror().addBox(-0.5F, 0.025F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.6317F, -1.4791F, 4.1647F, -1.1776F, -0.0091F, -0.1043F));

		PartDefinition cube_r601 = jaw.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(91, 145).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6446F, -1.6024F, 5.1066F, 1.0472F, 0.0F, -0.1047F));

		PartDefinition cube_r602 = jaw.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(145, 94).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.5924F, -1.1051F, 5.9726F, 1.4835F, 0.0F, -0.1047F));

		PartDefinition cube_r603 = jaw.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(133, 53).mirror().addBox(-0.55F, -0.9F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.498F, 2.7567F, 3.8191F, -0.2328F, 0.088F, -0.6061F));

		PartDefinition cube_r604 = jaw.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(96, 145).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.1787F, 2.8304F, -0.1589F, -0.2182F, 0.0F, -0.1047F));

		PartDefinition cube_r605 = jaw.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(61, 142).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1561F, 3.0457F, 0.8174F, -1.2654F, 0.0F, -0.1047F));

		PartDefinition cube_r606 = jaw.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(101, 145).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.5507F, -0.7088F, 5.9378F, 1.9635F, 0.0F, -0.1047F));

		PartDefinition cube_r607 = jaw.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(141, 8).mirror().addBox(-0.5F, -1.4F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.4148F, 0.584F, 5.935F, 2.4435F, 0.0F, -0.1047F));

		PartDefinition cube_r608 = jaw.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(106, 145).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.431F, 0.4306F, 6.6846F, 3.1416F, 0.0F, -0.1047F));

		PartDefinition cube_r609 = jaw.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(111, 145).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6977F, 6.3182F, 3.6759F, -1.3642F, -0.0653F, -0.1807F));

		PartDefinition cube_r610 = jaw.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(116, 145).mirror().addBox(-0.5F, 0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8361F, 5.8845F, 4.5663F, -2.6732F, -0.0653F, -0.1807F));

		PartDefinition cube_r611 = jaw.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(121, 145).mirror().addBox(0.0F, -0.525F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9765F, 7.0403F, 2.192F, -2.0153F, 0.0866F, 0.1339F));

		PartDefinition cube_r612 = jaw.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(125, 102).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.0738F, 4.6608F, 6.0044F, 2.8202F, 0.0288F, 0.1007F));

		PartDefinition cube_r613 = jaw.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(86, 144).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.9823F, 5.3225F, 5.2793F, -2.3981F, 0.0358F, 0.0984F));

		PartDefinition cube_r614 = jaw.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(121, 145).addBox(-1.0F, -0.525F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9765F, 7.0403F, 2.192F, -2.0153F, -0.0866F, -0.1339F));

		PartDefinition cube_r615 = jaw.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(111, 145).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6977F, 6.3182F, 3.6759F, -1.3642F, 0.0653F, 0.1807F));

		PartDefinition cube_r616 = jaw.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(116, 145).addBox(-0.5F, 0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8361F, 5.8845F, 4.5663F, -2.6732F, 0.0653F, 0.1807F));

		PartDefinition cube_r617 = jaw.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(46, 132).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6977F, 6.3182F, 3.6759F, -2.57F, 0.0462F, 0.1864F));

		PartDefinition cube_r618 = jaw.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(35, 105).addBox(-0.352F, 0.4045F, -2.5109F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5557F, 5.2266F, 3.633F, -2.0475F, 0.0347F, 0.1714F));

		PartDefinition cube_r619 = jaw.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(71, 117).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0539F, 4.2039F, 3.2251F, -2.0754F, 0.0653F, 0.1807F));

		PartDefinition cube_r620 = jaw.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(136, 0).addBox(-1.0F, 1.5565F, -1.2147F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(3.0F, -0.2F, 4.2F, -0.3229F, 0.0F, 0.1047F));

		PartDefinition cube_r621 = jaw.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(125, 20).addBox(-0.5F, -1.775F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.1675F, 3.736F, 4.7028F, -0.4695F, 0.0358F, 0.0984F));

		PartDefinition cube_r622 = jaw.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(39, 132).addBox(-0.3F, -0.8F, -1.675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4512F, 0.2376F, 1.3512F, -0.0873F, 0.0F, 0.1047F));

		PartDefinition cube_r623 = jaw.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(36, 115).addBox(-0.6395F, -1.3994F, -0.8409F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.8693F, 1.8484F, 5.1162F, 1.5538F, 0.0524F, 0.6485F));

		PartDefinition cube_r624 = jaw.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(105, 108).addBox(-0.3847F, -0.8585F, -1.6469F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.8693F, 1.8484F, 5.1162F, 0.1598F, -0.0994F, 0.605F));

		PartDefinition cube_r625 = jaw.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(72, 137).addBox(-0.5F, 0.025F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.6317F, -1.4791F, 4.1647F, -1.1776F, 0.0091F, 0.1043F));

		PartDefinition cube_r626 = jaw.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(106, 145).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.431F, 0.4306F, 6.6846F, 3.1416F, 0.0F, 0.1047F));

		PartDefinition cube_r627 = jaw.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(141, 8).addBox(-0.5F, -1.4F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.4148F, 0.584F, 5.935F, 2.4435F, 0.0F, 0.1047F));

		PartDefinition cube_r628 = jaw.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(101, 145).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.5507F, -0.7088F, 5.9378F, 1.9635F, 0.0F, 0.1047F));

		PartDefinition cube_r629 = jaw.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(145, 94).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.5924F, -1.1051F, 5.9726F, 1.4835F, 0.0F, 0.1047F));

		PartDefinition cube_r630 = jaw.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(91, 145).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6446F, -1.6024F, 5.1066F, 1.0472F, 0.0F, 0.1047F));

		PartDefinition cube_r631 = jaw.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(10, 137).addBox(-0.5F, 0.0F, -0.05F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.6317F, -1.4791F, 4.1647F, 0.1309F, 0.0F, 0.1047F));

		PartDefinition cube_r632 = jaw.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(133, 53).addBox(-0.45F, -0.9F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.498F, 2.7567F, 3.8191F, -0.2328F, -0.088F, 0.6061F));

		PartDefinition cube_r633 = jaw.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(13, 98).addBox(-0.5F, -1.475F, -1.3F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.3589F, 1.1166F, 2.1041F, 0.1658F, 0.0F, 0.1047F));

		PartDefinition cube_r634 = jaw.addOrReplaceChild("cube_r634", CubeListBuilder.create().texOffs(76, 145).addBox(-0.5F, -0.8F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.2757F, 1.9076F, 0.992F, 1.0472F, 0.0F, 0.1047F));

		PartDefinition cube_r635 = jaw.addOrReplaceChild("cube_r635", CubeListBuilder.create().texOffs(61, 142).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.1561F, 3.0457F, 0.8174F, -1.2654F, 0.0F, 0.1047F));

		PartDefinition cube_r636 = jaw.addOrReplaceChild("cube_r636", CubeListBuilder.create().texOffs(96, 145).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.1787F, 2.8304F, -0.1589F, -0.2182F, 0.0F, 0.1047F));

		PartDefinition cube_r637 = jaw.addOrReplaceChild("cube_r637", CubeListBuilder.create().texOffs(32, 132).addBox(-0.5F, -0.9F, -1.475F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2757F, 1.9076F, 0.992F, 0.6109F, 0.0F, 0.1047F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(69, 5).addBox(-0.5F, -0.9067F, -2.1029F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F))
				.texOffs(97, 122).addBox(0.0F, -3.0067F, -0.1029F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.7651F, 1.6214F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r638 = tail.addOrReplaceChild("cube_r638", CubeListBuilder.create().texOffs(23, 28).addBox(0.0F, -1.4889F, -0.9938F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.414F, 4.1511F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r639 = tail.addOrReplaceChild("cube_r639", CubeListBuilder.create().texOffs(17, 70).addBox(0.0F, -2.5F, 2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 146).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9067F, 1.8971F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r640 = tail.addOrReplaceChild("cube_r640", CubeListBuilder.create().texOffs(10, 146).mirror().addBox(0.7F, -0.15F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(146, 12).mirror().addBox(-0.8F, -0.15F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(10, 146).addBox(2.5F, -0.15F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(146, 12).addBox(4.0F, -0.15F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.1F, -3.9498F, 3.2423F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r641 = tail.addOrReplaceChild("cube_r641", CubeListBuilder.create().texOffs(146, 15).mirror().addBox(0.9435F, -0.6F, -0.4996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(146, 18).mirror().addBox(-0.4565F, -0.4F, -0.5996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.4032F, -1.1869F, 4.0382F, -0.9163F, 0.3927F, -1.5708F));

		PartDefinition cube_r642 = tail.addOrReplaceChild("cube_r642", CubeListBuilder.create().texOffs(146, 21).mirror().addBox(-1.9311F, -0.4F, -0.6888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(146, 24).mirror().addBox(-3.3311F, -0.4F, -0.6888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.4032F, -1.1869F, 4.0382F, -0.965F, 0.4699F, -1.6872F));

		PartDefinition cube_r643 = tail.addOrReplaceChild("cube_r643", CubeListBuilder.create().texOffs(146, 15).addBox(-1.9435F, -0.6F, -0.4996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(146, 18).addBox(-0.5435F, -0.4F, -0.5996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.4032F, -1.1869F, 4.0382F, -0.9163F, -0.3927F, 1.5708F));

		PartDefinition cube_r644 = tail.addOrReplaceChild("cube_r644", CubeListBuilder.create().texOffs(146, 24).addBox(2.3311F, -0.4F, -0.6888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(146, 21).addBox(0.9311F, -0.4F, -0.6888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.4032F, -1.1869F, 4.0382F, -0.965F, -0.4699F, 1.6872F));

		PartDefinition cube_r645 = tail.addOrReplaceChild("cube_r645", CubeListBuilder.create().texOffs(0, 28).addBox(-3.5F, -0.1F, -4.0F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -3.2624F, 4.0713F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r646 = tail.addOrReplaceChild("cube_r646", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -3.0F, -3.9F, 7.0F, 7.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.2738F, 4.3328F, 0.2618F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(105, 102).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0616F, 4.7602F, 0.22F, -0.1278F, -0.0285F));

		PartDefinition cube_r647 = tail2.addOrReplaceChild("cube_r647", CubeListBuilder.create().texOffs(144, 108).addBox(0.0F, -1.1F, -0.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6799F, 3.4813F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r648 = tail2.addOrReplaceChild("cube_r648", CubeListBuilder.create().texOffs(54, 97).addBox(0.0F, -2.3F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3529F, 1.5952F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r649 = tail2.addOrReplaceChild("cube_r649", CubeListBuilder.create().texOffs(146, 147).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 3.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r650 = tail2.addOrReplaceChild("cube_r650", CubeListBuilder.create().texOffs(45, 144).addBox(0.0F, -1.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r651 = tail2.addOrReplaceChild("cube_r651", CubeListBuilder.create().texOffs(25, 0).addBox(-3.0F, 0.0F, -6.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.255F, 3.9287F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r652 = tail2.addOrReplaceChild("cube_r652", CubeListBuilder.create().texOffs(146, 3).mirror().addBox(-0.8F, -0.15F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(146, 6).mirror().addBox(0.7F, -0.15F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(146, 6).addBox(2.5F, -0.15F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(146, 3).addBox(4.0F, -0.15F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.1F, -3.7114F, 2.082F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r653 = tail2.addOrReplaceChild("cube_r653", CubeListBuilder.create().texOffs(146, 9).mirror().addBox(-0.5F, -0.075F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(126, 147).mirror().addBox(-1.9F, 0.125F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.8F, -2.4428F, 2.7698F, -0.9163F, 0.0873F, -1.5708F));

		PartDefinition cube_r654 = tail2.addOrReplaceChild("cube_r654", CubeListBuilder.create().texOffs(141, 26).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.7964F, 0.5146F, 2.2405F, -0.9296F, 0.1663F, -1.676F));

		PartDefinition cube_r655 = tail2.addOrReplaceChild("cube_r655", CubeListBuilder.create().texOffs(141, 26).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.7964F, 0.5146F, 2.2405F, -0.9296F, -0.1663F, 1.676F));

		PartDefinition cube_r656 = tail2.addOrReplaceChild("cube_r656", CubeListBuilder.create().texOffs(126, 147).addBox(0.9F, 0.125F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(146, 9).addBox(-0.5F, -0.075F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.8F, -2.4428F, 2.7698F, -0.9163F, -0.0873F, 1.5708F));

		PartDefinition cube_r657 = tail2.addOrReplaceChild("cube_r657", CubeListBuilder.create().texOffs(21, 50).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -3.2432F, 2.8441F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(11, 106).addBox(-0.5F, -0.475F, 0.025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4723F, 3.8774F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r658 = tail3.addOrReplaceChild("cube_r658", CubeListBuilder.create().texOffs(18, 148).addBox(0.0F, -2.0F, 3.925F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 34).addBox(0.0F, -1.9F, 1.925F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4277F, -0.8774F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r659 = tail3.addOrReplaceChild("cube_r659", CubeListBuilder.create().texOffs(27, 27).addBox(-2.0F, -2.4634F, -6.0468F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1295F, 4.8427F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r660 = tail3.addOrReplaceChild("cube_r660", CubeListBuilder.create().texOffs(5, 148).addBox(0.0F, 2.2F, 3.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(145, 142).addBox(0.0F, 0.5F, 1.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0555F, -0.6088F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r661 = tail3.addOrReplaceChild("cube_r661", CubeListBuilder.create().texOffs(146, 50).mirror().addBox(-0.8F, -0.15F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(48, 146).addBox(0.7F, -0.15F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(146, 50).addBox(2.2F, -0.15F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, -3.0391F, 1.2046F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r662 = tail3.addOrReplaceChild("cube_r662", CubeListBuilder.create().texOffs(53, 146).mirror().addBox(0.9435F, -0.6F, -0.4996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(58, 146).mirror().addBox(-0.4565F, -0.4F, -0.5996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8782F, -0.2012F, 1.0756F, -0.9163F, -0.0436F, -1.5708F));

		PartDefinition cube_r663 = tail3.addOrReplaceChild("cube_r663", CubeListBuilder.create().texOffs(146, 62).mirror().addBox(-1.9311F, -0.4F, -0.6888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8782F, -0.2012F, 1.0756F, -0.9159F, 0.0361F, -1.6746F));

		PartDefinition cube_r664 = tail3.addOrReplaceChild("cube_r664", CubeListBuilder.create().texOffs(146, 68).mirror().addBox(-0.8F, -0.15F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(146, 68).addBox(2.2F, -0.15F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(146, 65).addBox(0.7F, -0.15F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2F, -2.4641F, 4.2046F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r665 = tail3.addOrReplaceChild("cube_r665", CubeListBuilder.create().texOffs(76, 142).mirror().addBox(-2.5548F, -0.4623F, -0.5518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(147, 97).mirror().addBox(-0.8548F, -0.6623F, -0.4518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8782F, -1.4262F, 4.0756F, -0.9163F, -0.0436F, -1.6581F));

		PartDefinition cube_r666 = tail3.addOrReplaceChild("cube_r666", CubeListBuilder.create().texOffs(147, 97).addBox(-0.1452F, -0.6623F, -0.4518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(76, 142).addBox(1.5548F, -0.4623F, -0.5518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.8782F, -1.4262F, 4.0756F, -0.9163F, 0.0436F, 1.6581F));

		PartDefinition cube_r667 = tail3.addOrReplaceChild("cube_r667", CubeListBuilder.create().texOffs(53, 146).addBox(-1.9435F, -0.6F, -0.4996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(58, 146).addBox(-0.5435F, -0.4F, -0.5996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.8782F, -0.2012F, 1.0756F, -0.9163F, 0.0436F, 1.5708F));

		PartDefinition cube_r668 = tail3.addOrReplaceChild("cube_r668", CubeListBuilder.create().texOffs(146, 62).addBox(0.9311F, -0.4F, -0.6888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.8782F, -0.2012F, 1.0756F, -0.9159F, -0.0361F, 1.6746F));

		PartDefinition cube_r669 = tail3.addOrReplaceChild("cube_r669", CubeListBuilder.create().texOffs(42, 38).addBox(-2.0F, -1.6983F, -3.1681F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.7172F, 2.0932F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(23, 58).addBox(-1.5F, -1.8709F, 0.6344F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(106, 73).addBox(-0.5F, -0.45F, -0.075F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.038F, 4.0597F, 0.176F, -0.1289F, -0.0229F));

		PartDefinition cube_r670 = tail4.addOrReplaceChild("cube_r670", CubeListBuilder.create().texOffs(15, 148).addBox(0.0F, 3.2F, 5.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0935F, -4.6684F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r671 = tail4.addOrReplaceChild("cube_r671", CubeListBuilder.create().texOffs(66, 124).addBox(0.0F, -1.9F, 7.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 122).addBox(0.0F, -1.9F, 5.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3896F, -4.9371F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r672 = tail4.addOrReplaceChild("cube_r672", CubeListBuilder.create().texOffs(0, 45).addBox(-1.1F, -1.9657F, -0.0171F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.4F, 2.7244F, 0.8311F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r673 = tail4.addOrReplaceChild("cube_r673", CubeListBuilder.create().texOffs(147, 104).mirror().addBox(-0.4048F, -0.6623F, -0.4518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3782F, -1.3882F, 3.0159F, -0.9163F, -0.0436F, -1.0472F));

		PartDefinition cube_r674 = tail4.addOrReplaceChild("cube_r674", CubeListBuilder.create().texOffs(0, 147).mirror().addBox(-2.2548F, -0.4623F, -0.5518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3782F, -1.3882F, 3.0159F, -0.9163F, -0.0436F, -1.6581F));

		PartDefinition cube_r675 = tail4.addOrReplaceChild("cube_r675", CubeListBuilder.create().texOffs(147, 107).mirror().addBox(-1.8048F, -0.6373F, -0.3518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3782F, -1.2882F, 5.7159F, -0.9163F, -0.0436F, -1.6581F));

		PartDefinition cube_r676 = tail4.addOrReplaceChild("cube_r676", CubeListBuilder.create().texOffs(66, 142).mirror().addBox(-0.4048F, -0.6623F, -0.4518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3782F, -1.2882F, 5.7159F, -0.9163F, -0.0436F, -1.0472F));

		PartDefinition cube_r677 = tail4.addOrReplaceChild("cube_r677", CubeListBuilder.create().texOffs(66, 142).addBox(-0.5952F, -0.6623F, -0.4518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.3782F, -1.2882F, 5.7159F, -0.9163F, 0.0436F, 1.0472F));

		PartDefinition cube_r678 = tail4.addOrReplaceChild("cube_r678", CubeListBuilder.create().texOffs(147, 35).addBox(-1.7F, -0.15F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2F, -2.3261F, 5.8449F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r679 = tail4.addOrReplaceChild("cube_r679", CubeListBuilder.create().texOffs(147, 107).addBox(0.8048F, -0.6373F, -0.3518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.3782F, -1.2882F, 5.7159F, -0.9163F, 0.0436F, 1.6581F));

		PartDefinition cube_r680 = tail4.addOrReplaceChild("cube_r680", CubeListBuilder.create().texOffs(146, 101).addBox(-1.7F, -0.15F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2F, -2.426F, 3.1449F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r681 = tail4.addOrReplaceChild("cube_r681", CubeListBuilder.create().texOffs(147, 104).addBox(-0.5952F, -0.6623F, -0.4518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.3782F, -1.3882F, 3.0159F, -0.9163F, 0.0436F, 1.0472F));

		PartDefinition cube_r682 = tail4.addOrReplaceChild("cube_r682", CubeListBuilder.create().texOffs(0, 147).addBox(1.2548F, -0.4623F, -0.5518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.3782F, -1.3882F, 3.0159F, -0.9163F, 0.0436F, 1.6581F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(50, 5).addBox(-0.5F, -0.5773F, -0.0539F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0941F, 3.9206F, 0.1226F, -0.0866F, -0.0107F));

		PartDefinition cube_r683 = tail5.addOrReplaceChild("cube_r683", CubeListBuilder.create().texOffs(17, 55).addBox(0.0F, 6.0F, 9.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 10).addBox(0.0F, 5.0F, 7.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9994F, -8.589F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r684 = tail5.addOrReplaceChild("cube_r684", CubeListBuilder.create().texOffs(57, 121).addBox(0.0F, -1.9F, 13.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 112).addBox(0.0F, -1.95F, 11.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 91).addBox(0.0F, -1.925F, 9.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4837F, -8.8577F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r685 = tail5.addOrReplaceChild("cube_r685", CubeListBuilder.create().texOffs(40, 73).addBox(-1.0F, -2.0684F, -5.9356F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6895F, 8.3646F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r686 = tail5.addOrReplaceChild("cube_r686", CubeListBuilder.create().texOffs(147, 38).mirror().addBox(-0.4048F, -0.6623F, -0.4518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8782F, -0.9073F, 4.7953F, -0.9163F, -0.0436F, -1.0472F));

		PartDefinition cube_r687 = tail5.addOrReplaceChild("cube_r687", CubeListBuilder.create().texOffs(40, 147).mirror().addBox(-0.4048F, -0.6623F, -0.4518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8782F, -0.9073F, 7.2953F, -0.9163F, -0.0436F, -1.0472F));

		PartDefinition cube_r688 = tail5.addOrReplaceChild("cube_r688", CubeListBuilder.create().texOffs(40, 147).addBox(-0.5952F, -0.6623F, -0.4518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8782F, -0.9073F, 7.2953F, -0.9163F, 0.0436F, 1.0472F));

		PartDefinition cube_r689 = tail5.addOrReplaceChild("cube_r689", CubeListBuilder.create().texOffs(147, 119).addBox(-1.7F, -0.15F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2F, -1.9452F, 7.4243F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r690 = tail5.addOrReplaceChild("cube_r690", CubeListBuilder.create().texOffs(147, 38).addBox(-0.5952F, -0.6623F, -0.4518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8782F, -0.9073F, 4.7953F, -0.9163F, 0.0436F, 1.0472F));

		PartDefinition cube_r691 = tail5.addOrReplaceChild("cube_r691", CubeListBuilder.create().texOffs(147, 110).addBox(-1.7F, -0.15F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2F, -1.9452F, 4.9243F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r692 = tail5.addOrReplaceChild("cube_r692", CubeListBuilder.create().texOffs(0, 70).addBox(-1.0F, -1.1684F, -2.6356F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.3536F, 5.107F, -0.0436F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 155, 155);
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