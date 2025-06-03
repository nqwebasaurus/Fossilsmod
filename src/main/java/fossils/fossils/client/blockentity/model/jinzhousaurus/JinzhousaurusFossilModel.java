package fossils.fossils.client.blockentity.model.jinzhousaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class JinzhousaurusFossilModel extends SkullModelBase {
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
	private final ModelPart tail;
	private final ModelPart tail6;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
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
	private final ModelPart head;
	private final ModelPart jaw;

	public JinzhousaurusFossilModel(ModelPart root) {
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
		this.tail = this.hips.getChild("tail");
		this.tail6 = this.tail.getChild("tail6");
		this.tail2 = this.tail6.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
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
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -31.5F, 8.8F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(55, 102).addBox(0.0F, -3.6583F, -0.1462F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1973F, 1.2939F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(76, 101).addBox(0.0F, -4.0F, -4.1F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1846F, -4.7086F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 82).addBox(0.0F, -0.0739F, -3.0265F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.5846F, -3.3086F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(46, 71).addBox(-0.004F, -0.0877F, -3.7749F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.9846F, 0.3914F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(84, 62).mirror().addBox(-0.207F, -2.0178F, 0.0376F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9829F, 3.7224F, -5.5293F, -0.5285F, 0.204F, -0.0478F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(84, 83).mirror().addBox(0.0603F, -0.0138F, -2.0346F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9746F, 2.9782F, -1.571F, -1.4035F, 0.2996F, -0.023F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(80, 18).mirror().addBox(-0.9639F, -6.5983F, -5.5602F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2746F, 2.5782F, -4.171F, 0.0934F, 0.1719F, -0.0306F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(64, 90).mirror().addBox(-0.4802F, -0.375F, 0.6389F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.3796F, 1.364F, -8.249F, 0.3704F, 0.204F, -0.0478F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(96, 94).mirror().addBox(-0.5F, -0.7F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9399F, 0.9492F, -11.059F, 0.9747F, 0.2079F, -0.0259F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(80, 0).mirror().addBox(-0.483F, -0.9199F, -2.6134F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3796F, 1.364F, -8.249F, -0.0539F, 0.2089F, -0.0148F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(95, 77).mirror().addBox(-0.9139F, -2.3387F, -6.1452F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2746F, 2.5782F, -5.371F, 0.1457F, 0.2079F, -0.0259F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(51, 98).mirror().addBox(-0.483F, -0.4931F, -2.0749F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.3796F, 1.364F, -8.249F, 0.0334F, 0.2089F, -0.0148F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(20, 109).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.2947F, 1.4818F, -7.836F, -0.2622F, 0.2094F, -0.0037F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(30, 59).mirror().addBox(-0.362F, -0.9226F, 4.2414F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9891F, 3.4735F, -5.3136F, -0.6052F, 0.2023F, -0.065F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(93, 64).mirror().addBox(-0.362F, -0.44F, 2.7501F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-2.9891F, 3.4735F, -5.3136F, -0.5005F, 0.2023F, -0.065F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(34, 87).mirror().addBox(-0.5F, -0.5F, -1.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9829F, 2.2224F, -6.6293F, -0.6681F, 0.204F, -0.0478F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(98, 88).mirror().addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1123F, -2.6524F, -5.3605F, -0.7182F, 0.1719F, -0.0306F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 98).mirror().addBox(-0.8115F, -6.6913F, -1.6902F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2746F, 2.5782F, -4.171F, 0.1351F, 0.1659F, -0.0544F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(91, 10).mirror().addBox(-0.5F, -0.4F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.4395F, -0.338F, -0.3502F, -0.0924F, -0.1386F, 0.0742F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(91, 0).mirror().addBox(-1.4488F, -0.1163F, 0.1235F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2746F, -3.2218F, 1.129F, -0.774F, -0.1007F, 0.1207F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(94, 33).mirror().addBox(-1.8714F, -1.5188F, -2.4105F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2746F, -1.1218F, 2.829F, 0.4651F, -0.1007F, 0.1207F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(81, 69).mirror().addBox(-1.2067F, 0.0669F, 0.1062F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2746F, -3.5218F, -1.871F, -0.0754F, -0.1331F, 0.0837F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(80, 24).mirror().addBox(-1.1487F, -2.1297F, 10.0276F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9746F, 2.2782F, -3.371F, -0.6458F, 0.2967F, 0.0F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(66, 77).mirror().addBox(-1.1487F, -1.0771F, 10.0883F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9746F, 2.2782F, -3.371F, -0.5411F, 0.2967F, 0.0F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(102, 77).mirror().addBox(-0.3645F, -2.5366F, 1.0116F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.9746F, 2.2782F, -3.371F, -1.7686F, 0.2804F, 0.1093F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(42, 39).mirror().addBox(-0.2946F, 0.5316F, 2.5018F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9746F, 2.2782F, -3.371F, -0.3721F, 0.2434F, 0.0784F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(109, 40).mirror().addBox(0.0872F, -0.1456F, -0.9188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9746F, 3.7782F, -1.171F, -0.9483F, 0.2804F, 0.1093F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-1.2254F, -5.1409F, -3.2112F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2746F, 2.5782F, -4.171F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(68, 71).mirror().addBox(-0.2254F, -5.4339F, -1.6406F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(25, 74).mirror().addBox(-1.2254F, -6.4361F, -1.9988F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(68, 71).addBox(2.7746F, -5.4339F, -1.6406F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(25, 74).addBox(4.7746F, -6.4361F, -1.9988F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.2746F, 2.5782F, -4.171F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(80, 18).addBox(-0.0361F, -6.5983F, -5.5602F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.2746F, 2.5782F, -4.171F, 0.0934F, -0.1719F, 0.0306F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(64, 90).addBox(-0.5198F, -0.375F, 0.6389F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.3796F, 1.364F, -8.249F, 0.3704F, -0.204F, 0.0478F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(96, 94).addBox(-0.5F, -0.7F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9399F, 0.9492F, -11.059F, 0.9747F, -0.2079F, 0.0259F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(80, 0).addBox(-0.517F, -0.9199F, -2.6134F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3796F, 1.364F, -8.249F, -0.0539F, -0.2089F, 0.0148F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(95, 77).addBox(-0.0861F, -2.3387F, -6.1452F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.2746F, 2.5782F, -5.371F, 0.1457F, -0.2079F, 0.0259F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(51, 98).addBox(-0.517F, -0.4931F, -2.0749F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.3796F, 1.364F, -8.249F, 0.0334F, -0.2089F, 0.0148F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(20, 109).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.2947F, 1.4818F, -7.836F, -0.2622F, -0.2094F, 0.0037F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(30, 59).addBox(-0.638F, -0.9226F, 4.2414F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9891F, 3.4735F, -5.3136F, -0.6052F, -0.2023F, 0.065F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(93, 64).addBox(-0.638F, -0.44F, 2.7501F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(2.9891F, 3.4735F, -5.3136F, -0.5005F, -0.2023F, 0.065F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(84, 62).addBox(-0.793F, -2.0178F, 0.0376F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9829F, 3.7224F, -5.5293F, -0.5285F, -0.204F, 0.0478F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(34, 87).addBox(-0.5F, -0.5F, -1.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9829F, 2.2224F, -6.6293F, -0.6681F, -0.204F, 0.0478F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(98, 88).addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1123F, -2.6524F, -5.3605F, -0.7182F, -0.1719F, 0.0306F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 98).addBox(-0.1885F, -6.6913F, -1.6902F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.2746F, 2.5782F, -4.171F, 0.1351F, -0.1659F, 0.0544F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(91, 10).addBox(-0.5F, -0.4F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.4395F, -0.338F, -0.3502F, -0.0924F, 0.1386F, -0.0742F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(91, 0).addBox(0.4488F, -0.1163F, 0.1235F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.2746F, -3.2218F, 1.129F, -0.774F, 0.1007F, -0.1207F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(94, 33).addBox(0.8714F, -1.5188F, -2.4105F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2746F, -1.1218F, 2.829F, 0.4651F, 0.1007F, -0.1207F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(81, 69).addBox(0.2067F, 0.0669F, 0.1062F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2746F, -3.5218F, -1.871F, -0.0754F, 0.1331F, -0.0837F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(80, 24).addBox(0.1487F, -2.1297F, 10.0276F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9746F, 2.2782F, -3.371F, -0.6458F, -0.2967F, 0.0F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(66, 77).addBox(0.1487F, -1.0771F, 10.0883F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.9746F, 2.2782F, -3.371F, -0.5411F, -0.2967F, 0.0F));

		PartDefinition cube_r49 = hips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(102, 77).addBox(-0.6355F, -2.5366F, 1.0116F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.9746F, 2.2782F, -3.371F, -1.7686F, -0.2804F, -0.1093F));

		PartDefinition cube_r50 = hips.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(42, 39).addBox(-0.7054F, 0.5316F, 2.5018F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.9746F, 2.2782F, -3.371F, -0.3721F, -0.2434F, -0.0784F));

		PartDefinition cube_r51 = hips.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(84, 83).addBox(-1.0603F, -0.0138F, -2.0346F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9746F, 2.9782F, -1.571F, -1.4035F, -0.2996F, 0.023F));

		PartDefinition cube_r52 = hips.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(109, 40).addBox(-1.0872F, -0.1456F, -0.9188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9746F, 3.7782F, -1.171F, -0.9483F, -0.2804F, -0.1093F));

		PartDefinition cube_r53 = hips.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 60).addBox(0.2254F, -5.1409F, -3.2112F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2746F, 2.5782F, -4.171F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r54 = hips.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -0.0074F, -5.2693F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1F, -4.6F, -0.0175F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, 0.1534F, -3.7073F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(100, 81).addBox(-0.5F, -0.109F, -1.1511F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2584F, 0.2324F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(64, 100).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.2584F, 0.2324F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(11, 65).addBox(-1.5F, -7.0395F, -0.5262F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(84, 30).addBox(-1.0F, -4.0395F, -0.0262F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 6.0F, -2.3F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(91, 15).addBox(-1.0F, -1.9383F, -0.0925F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.9F, -2.3F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(55, 71).addBox(-1.5F, 0.1F, -1.7F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 11.2839F, -0.9984F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(25, 81).addBox(-1.0F, -3.63F, -1.9963F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.4F, -0.2F, 0.0698F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.164F, -0.5551F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(77, 77).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 12.8576F, -2.9535F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(67, 12).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 1.1354F, -0.3811F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(94, 38).addBox(-0.1F, -8.0F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(72, 48).addBox(-0.1F, -6.0F, -0.6F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 8.6919F, -1.6981F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 71).addBox(-1.0F, -6.5F, -1.5F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 11.2627F, -1.7208F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(52, 91).addBox(-1.9F, -0.7762F, -1.7005F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.1354F, 0.0189F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(66, 83).addBox(-1.9F, -4.9341F, -1.787F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.0354F, -0.3811F, -0.2443F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(77, 48).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 14.2224F, -3.0953F, -0.7854F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(55, 49).addBox(-2.0F, -0.0319F, -3.2504F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2F, -0.4F, 0.2531F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(48, 27).addBox(-2.0F, -0.3F, -4.2F, 4.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, 0.2681F, -3.0504F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, 0.1534F, -3.7073F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(101, 33).addBox(-0.5F, -0.109F, -1.1511F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2584F, 0.2324F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(28, 101).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.2584F, 0.2324F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(67, 0).addBox(-1.5F, -7.0395F, -0.5262F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(55, 84).addBox(-1.0F, -4.0395F, -0.0262F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 6.0F, -2.3F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(91, 20).addBox(-1.0F, -1.9383F, -0.0925F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.9F, -2.3F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(71, 63).addBox(-1.5F, 0.1F, -1.7F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 11.2839F, -0.9984F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(46, 81).addBox(-1.0F, -3.63F, -1.9963F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.4F, -0.2F, 0.0698F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.164F, -0.5551F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(9, 79).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 12.8576F, -2.9535F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(67, 24).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.1354F, -0.3811F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(89, 94).addBox(-0.9F, -8.0F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(20, 74).addBox(-0.9F, -6.0F, -0.6F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 8.6919F, -1.6981F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(37, 71).addBox(-1.0F, -6.5F, -1.5F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 11.2627F, -1.7208F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(16, 92).addBox(-0.1F, -0.7762F, -1.7005F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.1354F, 0.0189F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(75, 83).addBox(-0.1F, -4.9341F, -1.787F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.0354F, -0.3811F, -0.2443F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(55, 77).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 14.2224F, -3.0953F, -1.1345F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(55, 56).addBox(-2.0F, -0.0319F, -3.2504F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2F, -0.4F, 0.3403F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(19, 49).addBox(-2.0F, -0.3F, -4.2F, 4.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, 0.2681F, -3.0504F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(45, 63).addBox(-0.5F, -1.0766F, -0.2972F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.9F, 2.3F, -0.143F, -0.216F, 0.0308F));

		PartDefinition cube_r79 = tail.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(91, 99).addBox(0.0F, -3.4F, -1.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0766F, 3.7028F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r80 = tail.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(11, 60).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3583F, 4.7628F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r81 = tail.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(103, 0).addBox(0.0F, -3.6F, -1.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9766F, 1.7028F, -0.1222F, 0.0F, 0.0F));

		PartDefinition tail6 = tail.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1841F, 4.602F, -0.0532F, -0.1743F, 0.0092F));

		PartDefinition cube_r82 = tail6.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(103, 12).addBox(0.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5F, 2.2F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r83 = tail6.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(88, 99).addBox(0.0F, -2.6F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6529F, 4.2825F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r84 = tail6.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(61, 99).addBox(0.0F, -3.0F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7082F, 6.3433F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r85 = tail6.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(79, 101).addBox(0.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2753F, 8.2959F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r86 = tail6.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(103, 6).addBox(0.0F, -2.3F, -1.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8542F, 10.2536F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r87 = tail6.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(43, 106).addBox(0.0F, -2.911F, -0.0155F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0925F, 8.0008F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r88 = tail6.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(106, 38).addBox(0.0F, -2.9377F, 0.0832F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0925F, 5.9008F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r89 = tail6.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(106, 33).addBox(0.0F, -2.9679F, 0.082F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0925F, 3.9008F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r90 = tail6.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(25, 103).addBox(0.0F, -3.2016F, -0.0192F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0925F, 2.0008F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r91 = tail6.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(15, 51).addBox(0.0F, -3.5317F, -0.0134F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8925F, 0.0008F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r92 = tail6.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(27, 27).addBox(-0.5F, -0.4F, -0.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4925F, 0.1008F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail2 = tail6.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6925F, 9.0008F, 0.0715F, 0.2176F, 0.0155F));

		PartDefinition cube_r93 = tail2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(110, 22).addBox(0.0F, -1.5298F, -0.0644F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7113F, 9.0357F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r94 = tail2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(19, 103).addBox(0.0F, -2.5F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7206F, 2.3576F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r95 = tail2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(103, 18).addBox(0.0F, -2.6F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5064F, 4.408F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r96 = tail2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(16, 103).addBox(0.0F, -2.5F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1983F, 6.4242F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r97 = tail2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(13, 103).addBox(0.0F, -2.5F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8901F, 8.4404F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r98 = tail2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(52, 106).addBox(0.0F, -1.4F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2061F, 10.3198F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r99 = tail2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(67, 31).addBox(0.0F, -1.9383F, -0.0859F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6113F, 7.0357F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r100 = tail2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(49, 106).addBox(0.0F, -2.3578F, 0.0026F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6113F, 4.9357F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r101 = tail2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(46, 106).addBox(0.0F, -2.6307F, -0.0974F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5212F, 3.0385F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r102 = tail2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(55, 108).addBox(0.0F, -2.92F, 0.0438F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3512F, 0.8258F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r103 = tail2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(27, 15).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1999F, -0.014F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 41).addBox(-0.5F, -0.0288F, -0.0996F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6999F, 9.886F, 0.2436F, 0.2544F, 0.0625F));

		PartDefinition cube_r104 = tail3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(67, 19).addBox(0.0F, -0.9744F, -0.0978F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0712F, 5.0004F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r105 = tail3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(58, 106).addBox(0.0F, -0.6566F, -0.1937F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1494F, 1.82F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r106 = tail3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(110, 94).addBox(0.0F, -1.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6694F, 6.8551F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r107 = tail3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(110, 90).addBox(0.0F, -1.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8094F, 4.8376F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r108 = tail3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(79, 110).addBox(0.0F, -1.4477F, 0.0009F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0712F, 2.9004F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r109 = tail3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(110, 59).addBox(0.0F, -1.5174F, -0.0003F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0712F, 0.9004F, -0.3665F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0288F, 7.8004F, 0.0371F, 0.3488F, 0.0127F));

		PartDefinition cube_r110 = tail4.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(111, 43).addBox(0.0F, 4.5897F, 6.63F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 111).addBox(0.0F, 3.0897F, 4.63F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 111).addBox(0.0F, 1.7897F, 2.63F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 16).addBox(0.0F, 0.0175F, 1.0867F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6982F, -0.9453F, 0.6981F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5007F, 0.0262F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 8.9F, -0.2193F, 0.2985F, -0.0655F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -9.8F, 0.1404F, -0.1303F, -0.0126F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(100, 21).addBox(0.0F, -4.6778F, -0.0465F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9313F, -0.9575F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(7, 100).addBox(0.0F, -4.5586F, 0.0534F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9313F, -3.1575F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(100, 0).addBox(0.0F, -4.6677F, -0.0777F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.889F, -5.0182F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(47, 99).addBox(0.0F, -4.5215F, -0.0896F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.77F, -6.992F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(58, 99).addBox(-0.5F, -4.5629F, 0.0254F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3867F, -8.9562F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(44, 99).addBox(-0.5F, -4.7163F, 0.032F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3133F, -10.9562F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(30, 93).addBox(-0.5F, -4.3632F, -0.1571F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3133F, -12.7562F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(50, 0).addBox(-1.0F, -1.1139F, -6.8748F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3133F, -6.8562F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(104, 69).mirror().addBox(-2.0256F, 0.0621F, -0.4555F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3133F, -8.4562F, 0.3626F, 0.0988F, -0.4257F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(69, 104).mirror().addBox(-3.859F, -0.7896F, -0.3282F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3133F, -8.4562F, 0.3015F, 0.1798F, -0.8588F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(52, 12).mirror().addBox(-9.1637F, -2.3465F, -0.3282F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3133F, -8.4562F, 0.1987F, 0.2896F, -1.2935F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(103, 96).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0133F, -2.4562F, 0.083F, -0.1086F, -0.6706F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(103, 94).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1133F, -4.3562F, 0.086F, -0.1361F, -0.6036F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(24, 65).mirror().addBox(-2.8126F, -0.836F, -0.3751F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1133F, -4.3562F, 0.1497F, -0.1496F, -1.0443F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(103, 26).mirror().addBox(-1.9523F, -0.1223F, -0.6258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1133F, -12.1562F, 0.5237F, 0.1693F, -0.4041F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(103, 24).mirror().addBox(-3.7261F, -0.9288F, -0.5053F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1133F, -12.1562F, 0.4209F, 0.3104F, -0.8298F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(50, 10).mirror().addBox(-11.9845F, -2.4165F, -0.5053F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1133F, -12.1562F, 0.2517F, 0.457F, -1.2741F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(100, 86).mirror().addBox(-2.0256F, 0.0621F, -0.4555F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7133F, -10.4562F, 0.4428F, 0.1345F, -0.4164F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(98, 92).mirror().addBox(-3.859F, -0.7896F, -0.3282F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7133F, -10.4562F, 0.3602F, 0.2455F, -0.8464F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(50, 24).mirror().addBox(-10.1637F, -2.3465F, -0.3282F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7133F, -10.4562F, 0.2243F, 0.3734F, -1.2851F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(71, 9).mirror().addBox(-4.8126F, -0.836F, -0.3751F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1133F, -6.2562F, 0.1652F, 0.0201F, -0.8725F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(30, 57).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1133F, -6.2562F, 0.1721F, 0.0111F, -0.4362F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(103, 96).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0133F, -2.4562F, 0.083F, 0.1086F, 0.6706F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(103, 94).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1133F, -4.3562F, 0.086F, 0.1361F, 0.6036F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(24, 65).addBox(1.8126F, -0.836F, -0.3751F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1133F, -4.3562F, 0.1497F, 0.1496F, 1.0443F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(103, 26).addBox(-0.0477F, -0.1223F, -0.6258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1133F, -12.1562F, 0.5237F, -0.1693F, 0.4041F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(103, 24).addBox(1.7261F, -0.9288F, -0.5053F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1133F, -12.1562F, 0.4209F, -0.3104F, 0.8298F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(50, 10).addBox(2.9845F, -2.4165F, -0.5053F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1133F, -12.1562F, 0.2517F, -0.457F, 1.2741F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(52, 12).addBox(3.1637F, -2.3465F, -0.3282F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3133F, -8.4562F, 0.1987F, -0.2896F, 1.2935F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(69, 104).addBox(1.859F, -0.7896F, -0.3282F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3133F, -8.4562F, 0.3015F, -0.1798F, 0.8588F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(104, 69).addBox(0.0256F, 0.0621F, -0.4555F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3133F, -8.4562F, 0.3626F, -0.0988F, 0.4257F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(100, 86).addBox(0.0256F, 0.0621F, -0.4555F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7133F, -10.4562F, 0.4428F, -0.1345F, 0.4164F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(98, 92).addBox(1.859F, -0.7896F, -0.3282F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7133F, -10.4562F, 0.3602F, -0.2455F, 0.8464F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(50, 24).addBox(3.1637F, -2.3465F, -0.3282F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7133F, -10.4562F, 0.2243F, -0.3734F, 1.2851F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(71, 9).addBox(1.8126F, -0.836F, -0.3751F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1133F, -6.2562F, 0.1652F, -0.0201F, 0.8725F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(30, 57).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1133F, -6.2562F, 0.1721F, -0.0111F, 0.4362F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(38, 49).addBox(-0.5F, 0.0499F, 0.006F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.8436F, -7.0005F, 0.0611F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6564F, -13.4005F, 0.1398F, -0.0871F, -0.0046F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(48, 37).mirror().addBox(-13.2532F, -2.8478F, -0.3621F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.053F, -0.4248F, 0.2461F, 0.4403F, -1.2765F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(106, 2).mirror().addBox(-4.1519F, -1.2061F, -0.3621F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.053F, -0.4248F, 0.4086F, 0.2975F, -0.8335F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(105, 88).mirror().addBox(-2.463F, -0.1943F, -0.5133F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.053F, -0.4248F, 0.5075F, 0.1624F, -0.4068F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(104, 67).mirror().addBox(-1.9788F, -0.0522F, -0.5424F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.347F, -7.6248F, 0.6803F, 0.2323F, -0.3728F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(104, 57).mirror().addBox(-3.7742F, -0.8751F, -0.4194F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.347F, -7.6248F, 0.5438F, 0.4304F, -0.7851F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(61, 46).mirror().addBox(-10.0508F, -2.3882F, -0.4194F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.347F, -7.6248F, 0.3108F, 0.6149F, -1.2438F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(80, 12).mirror().addBox(-0.7255F, -0.8839F, -0.7704F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.7275F, 5.732F, -5.653F, 0.7406F, -0.0284F, 0.0825F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(21, 39).mirror().addBox(-0.5263F, 0.0202F, -0.5447F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 13.9069F, -4.2937F, -0.1266F, -0.6727F, 0.5901F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(50, 14).mirror().addBox(-0.2238F, 0.1379F, 0.024F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 13.6069F, -5.0937F, -0.1869F, -0.8308F, 0.6035F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(61, 39).mirror().addBox(-0.5379F, -0.0317F, -0.2268F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 13.6069F, -5.0937F, -0.0309F, -1.0653F, 0.592F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(7, 85).mirror().addBox(-1.0F, 0.2313F, 2.4064F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 85).addBox(0.0F, 0.2313F, 2.4064F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.947F, -8.7248F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(34, 82).mirror().addBox(-2.0F, -0.2705F, -0.398F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(34, 82).addBox(0.0F, -0.2705F, -0.398F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.947F, -8.7248F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(104, 45).mirror().addBox(-1.9933F, -0.0077F, -0.454F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.347F, -5.9248F, 0.6139F, 0.2064F, -0.3872F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(104, 43).mirror().addBox(-3.8004F, -0.8395F, -0.3297F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.347F, -5.9248F, 0.4906F, 0.3805F, -0.8061F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(50, 22).mirror().addBox(-12.0896F, -2.367F, -0.3297F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.347F, -5.9248F, 0.2846F, 0.5486F, -1.2582F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(103, 100).mirror().addBox(-2.4186F, -0.2712F, -0.3842F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.647F, -4.1248F, 0.5892F, 0.1964F, -0.3922F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(103, 98).mirror().addBox(-4.0715F, -1.2557F, -0.2371F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.647F, -4.1248F, 0.4713F, 0.3615F, -0.8131F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(29, 12).mirror().addBox(-13.1593F, -2.8587F, -0.2371F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.647F, -4.1248F, 0.2753F, 0.5237F, -1.263F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(105, 81).mirror().addBox(-2.463F, -0.1943F, -0.5133F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.747F, -2.3248F, 0.5564F, 0.183F, -0.3984F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(48, 35).mirror().addBox(-13.2532F, -2.8478F, -0.3621F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.747F, -2.3248F, 0.2633F, 0.4904F, -1.2688F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(106, 0).mirror().addBox(-4.1519F, -1.2061F, -0.3621F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.747F, -2.3248F, 0.4458F, 0.3361F, -0.8218F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(77, 55).mirror().addBox(-0.5F, -1.7F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.8485F, 3.0982F, -2.7516F, 0.5757F, -0.0061F, 0.0871F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(23, 93).mirror().addBox(-1.5F, -1.9F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7133F, 10.9557F, -8.1484F, 1.4214F, -0.7026F, -1.2809F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(39, 93).mirror().addBox(-0.3413F, -1.2324F, -0.605F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7275F, 9.932F, -9.053F, 1.1498F, -0.2273F, -0.2528F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(58, 63).mirror().addBox(-0.4898F, -0.7867F, -3.0312F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7259F, 1.6638F, -3.9986F, 0.8462F, -0.0061F, 0.0871F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-0.8487F, -0.0222F, -0.163F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7275F, 8.432F, -9.153F, 1.0897F, -0.0284F, 0.0825F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(21, 39).addBox(-0.4737F, 0.0202F, -0.5447F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 13.9069F, -4.2937F, -0.1266F, 0.6727F, -0.5901F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(50, 14).addBox(-0.7762F, 0.1379F, 0.024F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 13.6069F, -5.0937F, -0.1869F, 0.8308F, -0.6035F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(61, 39).addBox(-0.4621F, -0.0317F, -0.2268F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 13.6069F, -5.0937F, -0.0309F, 1.0653F, -0.592F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(100, 14).addBox(0.0F, -5.0924F, 1.8998F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 100).addBox(0.0F, -4.3924F, -0.0002F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.147F, -3.1248F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(100, 7).addBox(0.0F, -4.4027F, 0.0591F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.047F, -4.9248F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(84, 107).addBox(0.0F, -2.8701F, -0.1022F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.647F, -8.4248F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(22, 103).addBox(0.0F, -3.9138F, 0.1406F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.847F, -6.6248F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(61, 46).addBox(3.0508F, -2.3882F, -0.4194F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.347F, -7.6248F, 0.3108F, -0.6149F, 1.2438F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(104, 57).addBox(1.7742F, -0.8751F, -0.4194F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.347F, -7.6248F, 0.5438F, -0.4304F, 0.7851F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(104, 67).addBox(-0.0212F, -0.0522F, -0.5424F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.347F, -7.6248F, 0.6803F, -0.2323F, 0.3728F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(104, 45).addBox(-0.0067F, -0.0077F, -0.454F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.347F, -5.9248F, 0.6139F, -0.2064F, 0.3872F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(104, 43).addBox(1.8004F, -0.8395F, -0.3297F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.347F, -5.9248F, 0.4906F, -0.3805F, 0.8061F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(50, 22).addBox(3.0896F, -2.367F, -0.3297F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.347F, -5.9248F, 0.2846F, -0.5486F, 1.2582F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(103, 100).addBox(0.4186F, -0.2712F, -0.3842F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.647F, -4.1248F, 0.5892F, -0.1964F, 0.3922F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(103, 98).addBox(2.0715F, -1.2557F, -0.2371F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.647F, -4.1248F, 0.4713F, -0.3615F, 0.8131F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(29, 12).addBox(3.1593F, -2.8587F, -0.2371F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.647F, -4.1248F, 0.2753F, -0.5237F, 1.263F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(105, 88).addBox(0.463F, -0.1943F, -0.5133F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.053F, -0.4248F, 0.5075F, -0.1624F, 0.4068F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(106, 2).addBox(2.1519F, -1.2061F, -0.3621F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.053F, -0.4248F, 0.4086F, -0.2975F, 0.8335F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(48, 37).addBox(3.2532F, -2.8478F, -0.3621F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.053F, -0.4248F, 0.2461F, -0.4403F, 1.2765F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(105, 81).addBox(0.463F, -0.1943F, -0.5133F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.747F, -2.3248F, 0.5564F, -0.183F, 0.3984F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(48, 35).addBox(3.2532F, -2.8478F, -0.3621F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.747F, -2.3248F, 0.2633F, -0.4904F, 1.2688F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(106, 0).addBox(2.1519F, -1.2061F, -0.3621F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.747F, -2.3248F, 0.4458F, -0.3361F, 0.8218F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(77, 55).addBox(-0.5F, -1.7F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.8485F, 3.0982F, -2.7516F, 0.5757F, 0.0061F, -0.0871F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(23, 93).addBox(0.5F, -1.9F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.7133F, 10.9557F, -8.1484F, 1.4214F, 0.7026F, 1.2809F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(39, 93).addBox(-0.6587F, -1.2324F, -0.605F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.7275F, 9.932F, -9.053F, 1.1498F, 0.2273F, 0.2528F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(58, 63).addBox(-0.5102F, -0.7867F, -3.0312F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.7259F, 1.6638F, -3.9986F, 0.8462F, 0.0061F, -0.0871F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(0, 51).addBox(-0.1513F, -0.0222F, -0.163F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7275F, 8.432F, -9.153F, 1.0897F, 0.0284F, -0.0825F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(80, 12).addBox(-0.2745F, -0.8839F, -0.7704F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.7275F, 5.732F, -5.653F, 0.7406F, 0.0284F, -0.0825F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(29, 0).addBox(-0.5F, -0.0541F, -2.1103F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.847F, -6.6248F, 0.4276F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.1502F, 10.6271F, -5.9923F, 0.3353F, 0.2656F, -0.1834F));

		PartDefinition cube_r203 = leftArm.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(97, 51).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0644F, 7.8909F, 1.5398F, -0.4464F, -0.0535F, 0.1188F));

		PartDefinition cube_r204 = leftArm.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(33, 100).addBox(-1.2373F, -0.0313F, -1.0266F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8017F, 5.2258F, 1.7533F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r205 = leftArm.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(46, 93).addBox(-1.2373F, 0.0372F, -0.897F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8017F, 1.6258F, -0.1467F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r206 = leftArm.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(83, 98).addBox(-0.5F, -2.3784F, -1.0587F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4364F, 2.9919F, 0.0411F, 0.0572F, -0.4796F, -0.2279F));

		PartDefinition cube_r207 = leftArm.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(94, 102).addBox(-0.5F, -0.3536F, -1.1485F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4364F, 2.9919F, 0.0411F, 0.8071F, -0.4796F, 0.0182F));

		PartDefinition cube_r208 = leftArm.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(89, 89).addBox(-1.9373F, -1.0936F, -0.8243F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8017F, -0.2742F, -0.3467F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r209 = leftArm.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(50, 102).addBox(-1.2373F, 0.2064F, -0.8243F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8017F, -0.2742F, -0.3467F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(21, 30).addBox(0.0F, 0.3F, -0.6F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(59, 91).addBox(0.0F, 1.5F, -2.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4548F, 9.0785F, 3.3365F, -0.9209F, 0.3882F, -0.1248F));

		PartDefinition cube_r210 = leftArm2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(102, 108).addBox(0.0F, -1.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.3F, 0.5411F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(87, 37).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2987F, 7.5154F, -1.6481F, 0.1216F, 0.1335F, 0.2675F));

		PartDefinition cube_r211 = leftArm3.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(106, 7).addBox(-0.5F, 0.0F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r212 = leftArm3.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(71, 95).addBox(-0.4652F, 0.3346F, -0.9511F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.5F, 0.9F, 0.0F, 0.0F, -0.3054F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create().texOffs(99, 68).addBox(-0.5794F, -0.3392F, -0.6694F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0294F, 0.3F, 1.749F, 0.6109F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1502F, 10.6271F, -5.9923F, -0.4675F, 0.1224F, 0.3568F));

		PartDefinition cube_r213 = rightArm.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(97, 55).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0644F, 7.8909F, 1.5398F, -0.4464F, 0.0535F, -0.1188F));

		PartDefinition cube_r214 = rightArm.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(100, 59).addBox(0.2373F, -0.0313F, -1.0266F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8017F, 5.2258F, 1.7533F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r215 = rightArm.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(78, 95).addBox(0.2373F, 0.0372F, -0.897F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8017F, 1.6258F, -0.1467F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r216 = rightArm.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(39, 99).addBox(-0.5F, -2.3784F, -1.0587F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4364F, 2.9919F, 0.0411F, 0.0572F, 0.4796F, 0.2279F));

		PartDefinition cube_r217 = rightArm.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(99, 102).addBox(-0.5F, -0.3536F, -1.1485F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4364F, 2.9919F, 0.0411F, 0.8071F, 0.4796F, -0.0182F));

		PartDefinition cube_r218 = rightArm.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(7, 90).addBox(-0.0627F, -1.0936F, -0.8243F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8017F, -0.2742F, -0.3467F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r219 = rightArm.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(102, 73).addBox(0.2373F, 0.2064F, -0.8243F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8017F, -0.2742F, -0.3467F, 0.0873F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(84, 89).addBox(-1.0F, 0.3F, -0.6F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(34, 92).addBox(-1.0F, 1.5F, -2.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7889F, 8.9909F, 3.5814F, -0.8614F, -0.6724F, -0.1116F));

		PartDefinition cube_r220 = rightArm2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(107, 108).addBox(-1.0F, -1.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.3F, 0.5411F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(88, 76).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2987F, 7.5154F, -1.6481F, 0.4126F, -0.007F, -0.3584F));

		PartDefinition cube_r221 = rightArm3.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(28, 106).addBox(-0.5F, 0.0F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r222 = rightArm3.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(95, 73).addBox(-0.5348F, 0.3346F, -0.9511F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.5F, 0.9F, 0.0F, 0.0F, 0.3054F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create().texOffs(71, 99).addBox(-0.4206F, -0.3392F, -0.6694F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0294F, 0.3F, 1.749F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 3.122F, -8.4547F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r223 = neck4.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(61, 106).addBox(-0.5F, -2.4926F, -0.1186F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.482F, -1.6258F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r224 = neck4.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(35, 109).addBox(-0.5F, -2.1297F, -0.1526F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.482F, -3.4258F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r225 = neck4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(71, 69).mirror().addBox(-4.8393F, -0.8109F, -0.3015F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.682F, -3.1258F, 0.6593F, 0.8593F, -0.9871F));

		PartDefinition cube_r226 = neck4.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(105, 83).mirror().addBox(-2.0183F, 0.0349F, -0.4279F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.682F, -3.1258F, 0.9676F, 0.5842F, -0.5293F));

		PartDefinition cube_r227 = neck4.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(67, 7).mirror().addBox(-8.0109F, -2.3422F, -0.1508F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.982F, -1.2258F, 0.2785F, 0.8438F, -1.2827F));

		PartDefinition cube_r228 = neck4.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(104, 49).mirror().addBox(-3.7186F, -0.8503F, -0.1508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.982F, -1.2258F, 0.6456F, 0.6434F, -0.75F));

		PartDefinition cube_r229 = neck4.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(104, 47).mirror().addBox(-1.9349F, -0.0493F, -0.2705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.982F, -1.2258F, 0.8543F, 0.3924F, -0.3363F));

		PartDefinition cube_r230 = neck4.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(71, 69).addBox(1.8393F, -0.8109F, -0.3015F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.682F, -3.1258F, 0.6593F, -0.8593F, 0.9871F));

		PartDefinition cube_r231 = neck4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(105, 83).addBox(0.0183F, 0.0349F, -0.4279F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.682F, -3.1258F, 0.9676F, -0.5842F, 0.5293F));

		PartDefinition cube_r232 = neck4.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(67, 7).addBox(3.0109F, -2.3422F, -0.1508F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.982F, -1.2258F, 0.2785F, -0.8438F, 1.2827F));

		PartDefinition cube_r233 = neck4.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(104, 49).addBox(1.7186F, -0.8503F, -0.1508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.982F, -1.2258F, 0.6456F, -0.6434F, 0.75F));

		PartDefinition cube_r234 = neck4.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(104, 47).addBox(-0.0651F, -0.0493F, -0.2705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.982F, -1.2258F, 0.8543F, -0.3924F, 0.3363F));

		PartDefinition cube_r235 = neck4.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(71, 31).addBox(-1.0F, -0.9375F, -0.0515F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.682F, -4.0258F, 0.4712F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.025F, -3.8701F, 0.6529F, -0.5316F, -0.1099F));

		PartDefinition cube_r236 = neck3.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(110, 98).addBox(0.0F, -1.899F, -0.1226F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5436F, -0.71F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r237 = neck3.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(5, 110).addBox(0.0F, -1.6329F, -0.0182F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2436F, -2.31F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r238 = neck3.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(104, 53).mirror().addBox(-2.7518F, -0.0197F, 0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0436F, -2.01F, 0.3747F, 0.4129F, -1.1044F));

		PartDefinition cube_r239 = neck3.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(104, 51).mirror().addBox(-2.9079F, -0.0471F, 0.3973F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.3436F, -3.51F, 0.206F, 0.1169F, -1.1346F));

		PartDefinition cube_r240 = neck3.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(104, 53).addBox(0.7518F, -0.0197F, 0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0436F, -2.01F, 0.3747F, -0.4129F, 1.1044F));

		PartDefinition cube_r241 = neck3.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(104, 51).addBox(0.9079F, -0.0471F, 0.3973F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3436F, -3.51F, 0.206F, -0.1169F, 1.1346F));

		PartDefinition cube_r242 = neck3.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(37, 67).addBox(-0.5F, -0.8052F, -0.0547F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3436F, -3.51F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r243 = neck3.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(97, 43).addBox(-0.5F, -0.8368F, -0.0394F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.0436F, -2.01F, -0.3142F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5436F, -3.21F, -0.4618F, -0.3077F, 0.1254F));

		PartDefinition cube_r244 = neck2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(111, 12).addBox(0.0F, -0.3F, 3.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 8).addBox(0.0F, -0.2F, 1.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 4).addBox(0.0F, -0.1F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 57).addBox(-0.5F, 1.0F, -1.7F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.2195F, -3.0783F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r245 = neck2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(104, 55).mirror().addBox(-0.5078F, -0.7973F, -1.2021F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(104, 102).mirror().addBox(-1.9485F, -0.0279F, -0.5757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1885F, -2.6369F, 0.4561F, 0.6012F, -1.0218F));

		PartDefinition cube_r246 = neck2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(104, 71).mirror().addBox(-2.0294F, -0.0104F, -0.6319F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.268F, -0.7949F, 0.4215F, 0.5229F, -1.0652F));

		PartDefinition cube_r247 = neck2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(104, 55).addBox(-1.4922F, -0.7973F, -1.2021F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 102).addBox(-0.0515F, -0.0279F, -0.5757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1885F, -2.6369F, 0.4561F, -0.6012F, 1.0218F));

		PartDefinition cube_r248 = neck2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(104, 71).addBox(0.0294F, -0.0104F, -0.6319F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.268F, -0.7949F, 0.4215F, -0.5229F, 1.0652F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5195F, -5.0783F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r249 = neck.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(72, 61).mirror().addBox(-0.9485F, -0.0279F, -0.5757F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0052F, -0.5303F, 0.3961F, 0.7348F, -1.1276F));

		PartDefinition cube_r250 = neck.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(72, 61).addBox(-0.0515F, -0.0279F, -0.5757F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0052F, -0.5303F, 0.3961F, -0.7348F, 1.1276F));

		PartDefinition cube_r251 = neck.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(105, 90).addBox(0.0F, -0.7F, -1.5F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7831F, -0.227F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r252 = neck.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(16, 87).addBox(-0.5F, -0.284F, 0.7966F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.111F, -3.5428F, -0.2443F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.111F, -1.3428F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(76, 38).mirror().addBox(0.0F, -0.7F, -3.2F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(76, 38).addBox(0.8F, -0.7F, -3.2F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.6786F, -5.7123F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(9, 72).addBox(-0.5F, -1.9425F, -3.4314F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0052F, -3.2473F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r255 = head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(93, 83).addBox(-0.5F, -2.0417F, -1.5247F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1052F, -8.0473F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r256 = head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(91, 5).addBox(-0.5F, -0.9428F, -3.0471F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.4052F, -6.0473F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r257 = head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(24, 67).addBox(-0.5F, -0.5F, -3.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.0029F, -5.5604F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r258 = head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(102, 28).mirror().addBox(-1.2F, 0.0044F, -0.025F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(102, 28).addBox(-0.2F, 0.0044F, -0.025F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2F, -1.0371F, 0.5136F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(21, 99).mirror().addBox(-1.4F, -0.1584F, -0.4228F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(21, 99).addBox(0.0F, -0.1584F, -0.4228F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, -0.1371F, 0.5136F, -1.9897F, 0.0F, 0.0F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(101, 38).mirror().addBox(-1.2F, -0.0629F, -1.0265F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(101, 38).addBox(0.2F, -0.0629F, -1.0265F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.1629F, -0.6864F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(0, 105).mirror().addBox(-0.5F, -2.2F, -1.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 105).addBox(0.9F, -2.2F, -1.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 2.3621F, -1.0129F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(7, 95).mirror().addBox(-1.2F, -2.2989F, -0.356F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(33, 105).mirror().addBox(-1.2F, -2.2989F, 1.244F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(33, 105).addBox(0.2F, -2.2989F, 1.244F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(7, 95).addBox(0.2F, -2.2989F, -0.356F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4348F, -4.3672F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(71, 19).mirror().addBox(-0.5F, -0.067F, -1.212F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(71, 19).addBox(0.9F, -0.067F, -1.212F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7F, 0.267F, -0.3646F, -2.33F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-0.5F, -2.1F, -1.3F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(0, 91).addBox(0.9F, -2.1F, -1.3F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.7F, -0.533F, -2.3646F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r265 = head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(107, 28).mirror().addBox(-0.5F, -0.5694F, -0.9264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(107, 28).addBox(-0.06F, -0.5694F, -0.9264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.22F, -0.9499F, -9.7185F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r266 = head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(107, 73).mirror().addBox(-0.5F, -0.4481F, -0.0862F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(107, 73).addBox(-0.06F, -0.4481F, -0.0862F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.22F, -0.9499F, -9.7185F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r267 = head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(107, 63).mirror().addBox(-0.5F, -0.2195F, -0.1912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(107, 63).addBox(-0.06F, -0.2195F, -0.1912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.22F, -1.0499F, -10.1185F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r268 = head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(25, 88).mirror().addBox(-0.5F, -0.2839F, -0.7502F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)).mirror(false)
				.texOffs(25, 88).addBox(-0.06F, -0.2839F, -0.7502F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.22F, -0.9499F, -9.7185F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r269 = head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(109, 104).mirror().addBox(-0.49F, -0.0522F, -0.0182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(109, 104).addBox(0.93F, -0.0522F, -0.0182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.72F, -0.5202F, -2.9786F, -2.4086F, 0.0F, 0.0F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(97, 109).mirror().addBox(-0.49F, 0.0385F, 0.0074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(97, 109).addBox(0.93F, 0.0385F, 0.0074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.72F, -1.4202F, -2.4786F, -1.9897F, 0.0F, 0.0F));

		PartDefinition cube_r271 = head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(92, 109).mirror().addBox(-0.49F, -0.0382F, 0.021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(92, 109).addBox(0.93F, -0.0382F, 0.021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.72F, -1.8202F, -4.2786F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r272 = head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(64, 109).mirror().addBox(-0.49F, -0.0683F, 0.0017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(64, 109).addBox(0.93F, -0.0683F, 0.0017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.72F, -2.0202F, -3.2786F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r273 = head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(109, 37).mirror().addBox(-0.49F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(109, 37).addBox(0.93F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.72F, -0.9202F, -4.3786F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r274 = head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(92, 106).mirror().addBox(-0.3F, -0.3785F, -1.3675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false)
				.texOffs(97, 106).mirror().addBox(-0.61F, -0.5854F, -1.3812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(106, 10).mirror().addBox(-0.82F, -0.5854F, -1.3812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(106, 10).addBox(1.26F, -0.5854F, -1.3812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(97, 106).addBox(1.05F, -0.5854F, -1.3812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(92, 106).addBox(0.74F, -0.3785F, -1.3675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-0.72F, -1.173F, -2.7711F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r275 = head.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(105, 59).mirror().addBox(-0.5F, -0.1639F, -0.9091F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false)
				.texOffs(105, 59).addBox(1.34F, -0.1639F, -0.9091F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.92F, 0.2082F, -1.233F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r276 = head.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(88, 59).mirror().addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(88, 59).addBox(1.34F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.92F, -0.8518F, -1.7839F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r277 = head.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(38, 104).mirror().addBox(-0.5F, -2.2213F, -0.819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false)
				.texOffs(38, 104).addBox(1.34F, -2.2213F, -0.819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-0.92F, 0.7082F, -2.733F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r278 = head.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(106, 13).mirror().addBox(-0.5F, -0.386F, -0.1974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(106, 13).addBox(1.34F, -0.386F, -0.1974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.92F, -1.2918F, -1.533F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r279 = head.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(106, 19).mirror().addBox(-0.5F, -0.2094F, -0.7035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.151F)).mirror(false)
				.texOffs(106, 19).addBox(1.34F, -0.2094F, -0.7035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.151F)), PartPose.offsetAndRotation(-0.92F, -1.4918F, -1.533F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r280 = head.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(106, 16).mirror().addBox(-0.5F, -0.1239F, -0.2456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false)
				.texOffs(106, 16).addBox(1.34F, -0.1239F, -0.2456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(-0.92F, -1.1053F, -0.8216F, -1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r281 = head.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(109, 31).mirror().addBox(-0.5F, -0.9045F, -0.7939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(109, 31).addBox(1.34F, -0.9045F, -0.7939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.92F, 0.1108F, -1.306F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r282 = head.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(107, 76).mirror().addBox(-0.5F, -0.477F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(107, 76).addBox(0.66F, -0.477F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.58F, -1.6178F, -0.749F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r283 = head.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(45, 59).mirror().addBox(-1.0F, -0.6F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6134F, -2.0102F, -3.8701F, 0.2006F, -0.1396F, 0.0012F));

		PartDefinition cube_r284 = head.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(91, 25).addBox(-1.0F, -0.8221F, -0.2125F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, 0.8771F, -9.4991F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r285 = head.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(100, 64).addBox(-1.0F, -0.7643F, -0.168F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.0771F, -10.0991F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r286 = head.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(0, 102).addBox(-1.0F, -0.8388F, -1.9504F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(93, 29).addBox(-1.0F, -0.8388F, -1.7504F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 1.1397F, -10.1188F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r287 = head.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(5, 107).addBox(-0.5F, -0.1319F, -0.5598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.62F, -1.593F, -0.4815F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r288 = head.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(45, 59).addBox(-1.0F, -0.6F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6134F, -2.0102F, -3.8701F, 0.2006F, 0.1396F, -0.0012F));

		PartDefinition cube_r289 = head.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(109, 34).addBox(-0.5F, -1.2085F, 0.0228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7F, 0.3152F, -3.3717F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r290 = head.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(87, 109).addBox(-0.5F, 0.6026F, -0.9683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(69, 109).addBox(-0.5F, 0.0026F, -0.9683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.3673F, -11.2415F, 1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r291 = head.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(82, 103).addBox(-0.5F, -0.0319F, -0.9576F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.0673F, -10.5415F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r292 = head.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(90, 68).addBox(-1.0F, -0.0434F, -1.8851F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.0652F, -3.1672F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r293 = head.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(87, 106).addBox(-0.5F, -0.0391F, -0.9845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.6177F, -9.764F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r294 = head.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(69, 106).addBox(-0.5F, -0.0606F, -0.983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.0177F, -8.864F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r295 = head.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(88, 49).addBox(-0.5F, -0.0291F, -2.9903F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.1177F, -5.864F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r296 = head.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(14, 99).addBox(-0.5F, 0.0338F, -2.0053F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -2.3177F, -4.664F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r297 = head.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(78, 45).addBox(-1.0F, 0.0272F, -0.9437F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3652F, -3.7672F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r298 = head.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(93, 59).addBox(-1.0F, -0.0502F, 0.0219F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.7371F, -0.2864F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r299 = head.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(96, 98).addBox(-1.0F, -0.2679F, -0.1049F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7371F, -1.1864F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r300 = head.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(80, 6).addBox(-1.0F, -0.0672F, -2.5952F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.9371F, -1.1864F, -0.1396F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0006F, 2.7895F, -1.7165F, 0.2532F, -0.0016F, 0.0113F));

		PartDefinition cube_r301 = jaw.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(106, 4).addBox(-0.4991F, 0.0203F, -0.5819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.0053F, -2.3361F, -8.1726F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r302 = jaw.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(90, 73).addBox(-0.4991F, 0.0203F, 0.0181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0053F, -2.3361F, -8.1726F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r303 = jaw.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(38, 108).addBox(-0.4995F, -0.9666F, -0.912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0044F, -1.5766F, -9.3511F, -1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r304 = jaw.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(107, 85).addBox(-0.4995F, -0.9763F, -0.9511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.0044F, -1.0766F, -8.5511F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r305 = jaw.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(85, 45).mirror().addBox(0.005F, -0.7045F, -1.3908F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(85, 45).addBox(0.689F, -0.7045F, -1.3908F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3464F, -2.1467F, -5.4624F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r306 = jaw.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(64, 95).mirror().addBox(-0.003F, -0.5489F, -0.4874F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 95).addBox(0.697F, -0.5489F, -0.4874F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3464F, -2.1467F, -5.4624F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r307 = jaw.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(52, 88).mirror().addBox(-0.005F, -0.0672F, 0.1513F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 88).addBox(0.699F, -0.0672F, 0.1513F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3464F, -2.3467F, -2.9624F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r308 = jaw.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(88, 44).mirror().addBox(-1.0941F, -0.6764F, -2.5374F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(88, 44).addBox(0.1025F, -0.6764F, -2.5374F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0037F, -0.0875F, -2.5832F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r309 = jaw.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(10, 109).mirror().addBox(-1.2F, -0.0334F, -1.0285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(15, 109).mirror().addBox(-1.2F, -0.0334F, -1.3285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(15, 109).addBox(0.1966F, -0.0334F, -1.3285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(10, 109).addBox(0.1966F, -0.0334F, -1.0285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0023F, -1.1869F, -1.9556F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r310 = jaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(43, 88).mirror().addBox(-1.2F, -0.9446F, -0.0932F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(43, 88).addBox(0.1966F, -0.9446F, -0.0932F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0023F, 0.2131F, -2.5556F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r311 = jaw.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(0, 109).mirror().addBox(-1.2F, -0.9943F, -0.0474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(0, 109).addBox(0.1966F, -0.9943F, -0.0474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0023F, 1.4131F, 0.1444F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r312 = jaw.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(88, 54).mirror().addBox(-1.2F, -0.0347F, -2.7488F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(88, 54).addBox(0.1966F, -0.0347F, -2.7488F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0023F, 0.4131F, 0.2444F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r313 = jaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(30, 109).addBox(-0.4991F, -1.0091F, -1.7257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(25, 109).addBox(-0.4991F, -1.0091F, -1.0257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0053F, -0.6361F, -6.8726F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r314 = jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(74, 108).addBox(-0.5F, 0.0062F, -1.4053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(79, 107).addBox(-0.5F, 0.0062F, -1.0053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0044F, -2.3068F, -6.0234F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r315 = jaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(73, 90).addBox(-0.499F, -0.087F, -0.4484F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0053F, -2.1587F, -5.5939F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r316 = jaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(97, 47).addBox(-0.499F, -1.0425F, -2.0409F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0053F, -0.3587F, -4.8939F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r317 = jaw.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(104, 104).mirror().addBox(0.0046F, -0.7344F, -0.6655F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(104, 104).addBox(1.5961F, -0.7344F, -0.6655F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7998F, -1.2036F, -1.3886F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r318 = jaw.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(64, 105).mirror().addBox(-0.0054F, -0.3051F, -1.116F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 105).addBox(1.6061F, -0.3051F, -1.116F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7998F, -1.2036F, -1.3886F, -2.1118F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 115, 115);
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