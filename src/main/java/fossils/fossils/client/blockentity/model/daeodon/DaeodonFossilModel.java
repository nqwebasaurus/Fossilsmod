package fossils.fossils.client.blockentity.model.daeodon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DaeodonFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg5;
	private final ModelPart leftLeg6;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg5;
	private final ModelPart rightLeg6;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck3;
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
	private final ModelPart tail5;

	public DaeodonFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg5 = this.leftLeg4.getChild("leftLeg5");
		this.leftLeg6 = this.leftLeg5.getChild("leftLeg6");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.rightLeg5 = this.rightLeg4.getChild("rightLeg5");
		this.rightLeg6 = this.rightLeg5.getChild("rightLeg6");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body3 = this.body.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.chest = this.body4.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.bone2 = this.chest.getChild("bone2");
		this.bone3 = this.chest.getChild("bone3");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -26.1986F, 14.5428F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(36, 83).addBox(0.0F, -0.1986F, 3.9389F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 82).addBox(0.0F, -1.3986F, 1.9389F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 103).addBox(0.0F, -2.1986F, -0.0611F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, -0.0986F, 0.0389F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5381F, 2.2338F, 1.0478F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(83, 44).addBox(-0.5F, -1.025F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5381F, 1.8531F, -0.9876F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(63, 39).addBox(-0.7F, -1.025F, 0.125F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5381F, 3.1783F, 0.5103F, 0.7466F, 0.7099F, 0.5426F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(83, 29).addBox(-0.5F, -0.625F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5381F, 2.2161F, 0.0264F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(95, 82).addBox(-1.0F, -0.5F, -0.275F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3853F, 1.6268F, 0.8048F, -0.5263F, -0.3766F, -0.7693F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(90, 29).addBox(-0.5F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.8786F, 0.7459F, -0.7294F, -0.506F, -0.3532F, -0.6233F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(91, 10).addBox(-0.3F, -0.8F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.4522F, 0.1578F, -1.4367F, -0.5676F, 0.1032F, -0.9054F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(75, 23).addBox(-1.1F, -0.8F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.4522F, 0.1578F, -1.4367F, -0.8406F, -0.7703F, -0.1787F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(27, 67).addBox(-1.2162F, -0.5525F, -1.1749F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7468F, -1.8784F, -1.9653F, 0.5093F, 1.0933F, 2.3002F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(63, 66).addBox(-1.0941F, -0.5525F, -0.3027F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7468F, -2.2784F, -1.8653F, 0.418F, 0.9113F, 2.1409F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(96, 0).addBox(-1.0998F, -0.5F, -0.7481F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6823F, 1.01F, 1.7508F, 1.3732F, 1.0603F, -2.936F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(90, 48).addBox(-1.0766F, -0.5F, -0.2905F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6823F, 1.01F, 1.7508F, 2.1513F, 0.9294F, -2.0887F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(64, 7).addBox(-1.0797F, -0.2843F, -0.5125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.7778F, 0.0146F, 0.5888F, -1.9532F, 0.6094F, -1.2905F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(95, 43).addBox(-0.0467F, -0.3256F, -4.037F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9602F, -3.095F, -1.6993F, -2.3385F, 0.5411F, -1.1039F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(71, 0).addBox(-3.2472F, -0.4317F, -2.0211F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9602F, -3.095F, -1.6993F, -1.0079F, 0.5649F, 0.8843F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(69, 35).addBox(-1.6362F, -0.4317F, -4.2015F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.9602F, -3.095F, -1.6993F, -1.6119F, 0.7743F, -0.0417F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(94, 16).addBox(0.6535F, -0.259F, -2.3225F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F))
				.texOffs(75, 26).addBox(-0.3465F, -0.259F, -1.7225F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9602F, -3.095F, -1.6993F, -1.738F, 0.5125F, -0.2704F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(79, 104).addBox(-0.6116F, -0.259F, -3.7058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9602F, -3.095F, -1.6993F, -1.1375F, 0.3275F, 1.0243F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(26, 76).addBox(-2.1923F, -0.259F, -3.6798F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9602F, -3.095F, -1.6993F, -1.2732F, 0.4537F, 0.6717F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(104, 102).addBox(-0.4198F, -0.6776F, -1.0291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.9602F, -3.095F, -1.6993F, -1.3932F, 0.6583F, 0.1414F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(84, 58).addBox(-0.6526F, -0.6776F, -1.9201F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.9602F, -3.095F, -1.6993F, -1.6008F, 0.6778F, -0.1917F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(71, 4).addBox(-1.7563F, -0.6776F, -2.7804F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.9602F, -3.095F, -1.6993F, -1.1585F, 0.5552F, 0.5487F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(49, 106).addBox(-0.375F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.7783F, -0.1425F, 0.6224F, 2.8105F, 0.0677F, -1.1201F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(106, 26).addBox(-0.6F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9799F, -0.8091F, 0.2584F, 2.5319F, 0.9686F, -1.6192F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5381F, 2.2338F, 1.0478F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r26 = bone4.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(63, 39).mirror().addBox(-0.3F, -1.025F, 0.125F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.5381F, 3.1783F, 0.5103F, 0.7466F, -0.7099F, -0.5426F));

		PartDefinition cube_r27 = bone4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(95, 82).mirror().addBox(-1.0F, -0.5F, -0.275F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3853F, 1.6268F, 0.8048F, -0.5263F, 0.3766F, 0.7693F));

		PartDefinition cube_r28 = bone4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(90, 29).mirror().addBox(-1.5F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.8786F, 0.7459F, -0.7294F, -0.506F, 0.3532F, 0.6233F));

		PartDefinition cube_r29 = bone4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(91, 10).mirror().addBox(-1.7F, -0.8F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.4522F, 0.1578F, -1.4367F, -0.5676F, -0.1032F, 0.9054F));

		PartDefinition cube_r30 = bone4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(75, 23).mirror().addBox(-1.9F, -0.8F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.4522F, 0.1578F, -1.4367F, -0.8406F, 0.7703F, 0.1787F));

		PartDefinition cube_r31 = bone4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(27, 67).mirror().addBox(0.2162F, -0.5525F, -1.1749F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7468F, -1.8784F, -1.9653F, 0.5093F, -1.0933F, -2.3002F));

		PartDefinition cube_r32 = bone4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(63, 66).mirror().addBox(0.0941F, -0.5525F, -0.3027F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7468F, -2.2784F, -1.8653F, 0.418F, -0.9113F, -2.1409F));

		PartDefinition cube_r33 = bone4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(96, 0).mirror().addBox(-0.9002F, -0.5F, -0.7481F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6823F, 1.01F, 1.7508F, 1.3732F, -1.0603F, 2.936F));

		PartDefinition cube_r34 = bone4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(90, 48).mirror().addBox(-0.9234F, -0.5F, -0.2905F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6823F, 1.01F, 1.7508F, 2.1513F, -0.9294F, 2.0887F));

		PartDefinition cube_r35 = bone4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(64, 7).mirror().addBox(-0.9203F, -0.2843F, -0.5125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.7778F, 0.0146F, 0.5888F, -1.9532F, -0.6094F, 1.2905F));

		PartDefinition cube_r36 = bone4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(95, 43).mirror().addBox(-1.9532F, -0.3256F, -4.037F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9602F, -3.095F, -1.6993F, -2.3385F, -0.5411F, 1.1039F));

		PartDefinition cube_r37 = bone4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(1.2472F, -0.4317F, -2.0211F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9602F, -3.095F, -1.6993F, -1.0079F, -0.5649F, -0.8843F));

		PartDefinition cube_r38 = bone4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(69, 35).mirror().addBox(-0.3638F, -0.4317F, -4.2015F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.9602F, -3.095F, -1.6993F, -1.6119F, -0.7743F, 0.0417F));

		PartDefinition cube_r39 = bone4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(94, 16).mirror().addBox(-2.6535F, -0.259F, -2.3225F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false)
				.texOffs(75, 26).mirror().addBox(-2.6535F, -0.259F, -1.7225F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9602F, -3.095F, -1.6993F, -1.738F, -0.5125F, 0.2704F));

		PartDefinition cube_r40 = bone4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(79, 104).mirror().addBox(-0.3885F, -0.259F, -3.7058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9602F, -3.095F, -1.6993F, -1.1375F, -0.3275F, -1.0243F));

		PartDefinition cube_r41 = bone4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(26, 76).mirror().addBox(-0.8077F, -0.259F, -3.6798F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9602F, -3.095F, -1.6993F, -1.2732F, -0.4537F, -0.6717F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(104, 102).mirror().addBox(-0.5802F, -0.6776F, -1.0291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-0.9602F, -3.095F, -1.6993F, -1.3932F, -0.6583F, -0.1414F));

		PartDefinition cube_r43 = bone4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(84, 58).mirror().addBox(-0.3474F, -0.6776F, -1.9201F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.9602F, -3.095F, -1.6993F, -1.6008F, -0.6778F, 0.1917F));

		PartDefinition cube_r44 = bone4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(71, 4).mirror().addBox(-0.2437F, -0.6776F, -2.7804F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.9602F, -3.095F, -1.6993F, -1.1585F, -0.5552F, -0.5487F));

		PartDefinition cube_r45 = bone4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(49, 106).mirror().addBox(-0.625F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.7783F, -0.1425F, 0.6224F, 2.8105F, -0.0677F, 1.1201F));

		PartDefinition cube_r46 = bone4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(106, 26).mirror().addBox(-0.4F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9799F, -0.8091F, 0.2584F, 2.5319F, -0.9686F, 1.6192F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(51, 80).addBox(-1.0F, 1.2253F, -0.5397F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.9F, 2.3923F, 0.2366F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(45, 67).addBox(-1.0F, -1.0F, -1.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3214F, -0.0994F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(63, 59).addBox(-0.5F, 0.0961F, -0.1884F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 1.1292F, -0.1514F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(84, 23).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 9.879F, 0.2511F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(52, 39).addBox(-1.0F, 1.8F, -0.1F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 5.4598F, 0.433F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(19, 74).addBox(-1.0F, -1.7F, -0.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 6.7024F, 0.6044F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(70, 54).addBox(-1.0F, -3.1F, -0.45F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 7.2401F, 0.1451F, 0.0785F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.4469F, 1.8295F, 1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(62, 95).addBox(-1.0F, -0.8F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.1023F, 0.2332F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(72, 72).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.0255F, 0.7001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(76, 76).addBox(0.0F, -0.7475F, -1.179F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 3.8738F, 1.141F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(95, 85).addBox(0.0F, -2.1F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 2.5738F, 1.041F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(106, 3).addBox(-1.0F, -0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 1.427F, 0.2014F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(71, 76).addBox(-1.5F, -4.5201F, -0.5278F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.0F, 4.6131F, -0.3404F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(64, 90).addBox(-1.5F, -3.0335F, -0.8498F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0F, 4.306F, 0.2131F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(72, 39).addBox(-1.5F, 2.4548F, -1.0683F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 97).addBox(-1.0F, -0.5452F, -1.0683F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.7131F, 0.2596F, -0.3229F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 8.0729F, -1.0647F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(39, 73).addBox(-0.8F, -2.5274F, 0.5506F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, 0.1557F, -0.2179F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(106, 35).addBox(-0.8F, -0.0727F, -0.2395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.1557F, -0.2179F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(47, 59).addBox(-1.3F, -0.0129F, -0.2037F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.1557F, -0.2179F, -0.1396F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 4.0137F, -0.5935F, -0.5149F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 0.0417F, 0.1521F, 0.4014F, 0.0F, 0.0F));

		PartDefinition leftLeg6 = leftLeg5.addOrReplaceChild("leftLeg6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3384F, 1.9403F, -0.1381F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg6.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(96, 54).addBox(-0.454F, -0.8471F, 0.0635F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6733F, 1.7589F, -0.1292F, -1.0806F, -0.0261F, 0.0698F));

		PartDefinition cube_r65 = leftLeg6.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(96, 3).addBox(-0.546F, -0.8471F, 0.0635F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, 1.7589F, -0.1292F, -1.0531F, -0.1463F, -0.1151F));

		PartDefinition cube_r66 = leftLeg6.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(100, 85).addBox(-0.4632F, -1.8162F, -0.2199F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6733F, 1.7589F, -0.1292F, -0.0373F, -0.2592F, 0.0572F));

		PartDefinition cube_r67 = leftLeg6.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(74, 98).addBox(-0.5368F, -1.8162F, -0.2199F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.55F, 1.7589F, -0.1292F, -0.0122F, 0.0864F, -0.0965F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(58, 80).addBox(-1.0F, 1.2253F, -0.5397F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-3.9F, 2.3923F, 0.2366F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(36, 68).addBox(-1.0F, -1.0F, -1.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3214F, -0.0994F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(64, 0).addBox(-1.5F, 0.0961F, -0.1884F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 1.1292F, -0.1514F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(29, 84).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 9.879F, 0.2511F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(53, 4).addBox(-1.0F, 1.8F, -0.1F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 5.4598F, 0.433F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(54, 75).addBox(-1.0F, -1.7F, -0.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 6.7024F, 0.6044F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(70, 60).addBox(-1.0F, -3.1F, -0.45F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 7.2401F, 0.1451F, 0.0785F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.4469F, 1.8295F, 1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(74, 95).addBox(-1.0F, -0.8F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.1023F, 0.2332F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(73, 19).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.0255F, 0.7001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(17, 79).addBox(-1.0F, -0.7475F, -1.179F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 3.8738F, 1.141F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(95, 90).addBox(-1.0F, -2.1F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 2.5738F, 1.041F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(9, 106).addBox(0.0F, -0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 1.427F, 0.2014F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(78, 47).addBox(0.5F, -4.5201F, -0.5278F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.0F, 4.6131F, -0.3404F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(75, 90).addBox(0.5F, -3.0335F, -0.8498F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0F, 4.306F, 0.2131F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightLeg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(72, 43).addBox(-0.5F, 2.4548F, -1.0683F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(5, 97).addBox(0.0F, -0.5452F, -1.0683F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.7131F, 0.2596F, -0.3229F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 8.0729F, -1.0647F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(73, 47).addBox(-0.2F, -2.5274F, 0.5506F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, 0.1557F, -0.2179F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(36, 106).addBox(-0.2F, -0.0727F, -0.2395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.1557F, -0.2179F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(59, 47).addBox(-0.7F, -0.0129F, -0.2037F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.1557F, -0.2179F, -0.1396F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 4.0137F, -0.5935F, -0.5149F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 0.0417F, 0.1521F, 0.4014F, 0.0F, 0.0F));

		PartDefinition rightLeg6 = rightLeg5.addOrReplaceChild("rightLeg6", CubeListBuilder.create(), PartPose.offset(0.3384F, 1.9403F, -0.1381F));

		PartDefinition cube_r85 = rightLeg6.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(89, 96).addBox(0.6764F, -0.7468F, 0.1067F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.55F, 2.1589F, -0.2292F, 0.3171F, 0.0733F, 0.0136F));

		PartDefinition cube_r86 = rightLeg6.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(96, 21).addBox(-0.4394F, -0.7612F, 0.0146F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.55F, 2.1589F, -0.2292F, 0.3276F, -0.0867F, 0.1646F));

		PartDefinition cube_r87 = rightLeg6.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(100, 89).addBox(-0.5368F, -1.8162F, -0.2199F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6733F, 1.7589F, -0.1292F, -0.0373F, 0.2592F, -0.0572F));

		PartDefinition cube_r88 = rightLeg6.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(94, 98).addBox(-0.4632F, -1.8162F, -0.2199F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.55F, 1.7589F, -0.1292F, -0.0122F, -0.0864F, 0.0965F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.4979F, -3.8073F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(26, 90).addBox(0.0F, -0.9F, 4.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 105).addBox(0.0F, -1.1F, 2.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2966F, -5.8386F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(97, 80).mirror().addBox(-2.1F, 0.1F, -0.9F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1939F, -0.681F, -0.7293F, -0.2487F, -0.225F, -0.4895F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(97, 29).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7623F, -0.8115F, -3.2729F, -0.1178F, -0.225F, -0.4895F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(97, 80).addBox(0.1F, 0.1F, -0.9F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1939F, -0.681F, -0.7293F, -0.2487F, 0.225F, 0.4895F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(97, 29).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7623F, -0.8115F, -3.2729F, -0.1178F, 0.225F, 0.4895F));

		PartDefinition cube_r94 = body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(36, 19).addBox(-0.5F, -0.1512F, 8.7474F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4656F, -13.1997F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.702F, -4.6624F, -0.2303F, 0.17F, -0.0396F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(97, 78).mirror().addBox(-1.2F, 0.1F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4817F, -0.5252F, -0.5466F, 0.0596F, -0.0516F, -0.5099F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(84, 27).mirror().addBox(-2.5138F, 0.5279F, -0.1465F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4206F, -2.5644F, -0.2424F, 0.4188F, -0.843F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(88, 70).mirror().addBox(-5.5648F, -0.1407F, -0.1465F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4206F, -2.5644F, -0.3433F, 0.3428F, -1.113F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(82, 11).mirror().addBox(-2.4651F, 0.4628F, -0.1263F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1206F, -4.5644F, -0.1819F, 0.4878F, -0.7122F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(83, 52).mirror().addBox(-5.5009F, -0.1909F, -0.1263F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1206F, -4.5644F, -0.3072F, 0.424F, -0.9952F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(98, 19).mirror().addBox(-6.989F, -2.3251F, -0.1263F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1206F, -4.5644F, -0.4451F, 0.2744F, -1.3925F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(84, 27).addBox(-0.4862F, 0.5279F, -0.1465F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4206F, -2.5644F, -0.2424F, -0.4188F, 0.843F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(88, 70).addBox(2.5648F, -0.1407F, -0.1465F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4206F, -2.5644F, -0.3433F, -0.3428F, 1.113F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(82, 11).addBox(-0.5349F, 0.4628F, -0.1263F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1206F, -4.5644F, -0.1819F, -0.4878F, 0.7122F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(83, 52).addBox(2.5009F, -0.1909F, -0.1263F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1206F, -4.5644F, -0.3072F, -0.424F, 0.9952F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(98, 19).addBox(4.989F, -2.3251F, -0.1263F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1206F, -4.5644F, -0.4451F, -0.2744F, 1.3925F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(6, 106).addBox(0.0F, -2.4594F, -0.9811F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0383F, -0.135F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(66, 104).addBox(0.0F, -2.8594F, 0.0189F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.696F, -3.157F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(66, 98).addBox(0.0F, -3.1938F, -0.0713F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.596F, -5.057F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(97, 78).addBox(-0.8F, 0.1F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4817F, -0.5252F, -0.5466F, 0.0596F, 0.0516F, 0.5099F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(13, 38).addBox(-0.5F, -1.0F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, -5.0F, -0.1314F, 0.0865F, -0.0114F));

		PartDefinition cube_r111 = body3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(49, 17).addBox(-0.5F, 0.0148F, -4.0846F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r112 = body3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(84, 62).mirror().addBox(-5.471F, -0.2187F, -0.1169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0206F, -1.5644F, -0.2033F, 0.5515F, -0.8939F));

		PartDefinition cube_r113 = body3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(88, 41).mirror().addBox(-2.4434F, 0.4282F, -0.1169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0206F, -1.5644F, -0.0365F, 0.5831F, -0.5853F));

		PartDefinition cube_r114 = body3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(71, 12).mirror().addBox(-8.9506F, -2.339F, -0.1169F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0206F, -1.5644F, -0.4105F, 0.4281F, -1.328F));

		PartDefinition cube_r115 = body3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(56, 37).mirror().addBox(-9.9247F, -2.3487F, -0.1126F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6794F, -3.4644F, -0.403F, 0.4353F, -1.2903F));

		PartDefinition cube_r116 = body3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(89, 19).mirror().addBox(-5.4509F, -0.2377F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6794F, -3.4644F, -0.1925F, 0.5552F, -0.8536F));

		PartDefinition cube_r117 = body3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(89, 8).mirror().addBox(-2.4289F, 0.4047F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6794F, -3.4644F, -0.0247F, 0.5838F, -0.5442F));

		PartDefinition cube_r118 = body3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(84, 62).addBox(2.471F, -0.2187F, -0.1169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0206F, -1.5644F, -0.2033F, -0.5515F, 0.8939F));

		PartDefinition cube_r119 = body3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(88, 41).addBox(-0.5566F, 0.4282F, -0.1169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0206F, -1.5644F, -0.0365F, -0.5831F, 0.5853F));

		PartDefinition cube_r120 = body3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(71, 12).addBox(4.9506F, -2.339F, -0.1169F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0206F, -1.5644F, -0.4105F, -0.4281F, 1.328F));

		PartDefinition cube_r121 = body3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(56, 37).addBox(4.9247F, -2.3487F, -0.1126F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6794F, -3.4644F, -0.403F, -0.4353F, 1.2903F));

		PartDefinition cube_r122 = body3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(89, 19).addBox(2.4509F, -0.2377F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6794F, -3.4644F, -0.1925F, -0.5552F, 0.8536F));

		PartDefinition cube_r123 = body3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(89, 8).addBox(-0.5711F, 0.4047F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6794F, -3.4644F, -0.0247F, -0.5838F, 0.5442F));

		PartDefinition cube_r124 = body3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(20, 102).addBox(0.0F, -3.7952F, 0.1008F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3011F, -2.102F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r125 = body3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(86, 95).addBox(0.0F, -4.6863F, -0.0009F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2015F, -3.9883F, -0.288F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(40, 4).addBox(-0.5F, -0.6566F, -4.8266F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8534F, -3.785F, 0.3843F, 0.0405F, 0.0164F));

		PartDefinition cube_r126 = body4.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(25, 0).mirror().addBox(-9.5484F, -0.2838F, -0.6032F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4698F, 12.0776F, -5.4062F, -0.0334F, 0.9652F, 0.5309F));

		PartDefinition cube_r127 = body4.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(25, 2).mirror().addBox(-8.5484F, -0.2838F, -0.6032F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4698F, 12.0776F, -5.4062F, -0.167F, 0.8762F, 0.3877F));

		PartDefinition cube_r128 = body4.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(85, 37).mirror().addBox(-2.4289F, 0.4047F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1989F, -1.361F, -0.3595F, 0.3681F, -0.6996F));

		PartDefinition cube_r129 = body4.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(88, 72).mirror().addBox(-5.4509F, -0.2377F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1989F, -1.361F, -0.4391F, 0.2657F, -0.9534F));

		PartDefinition cube_r130 = body4.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(49, 23).mirror().addBox(-10.9247F, -2.3487F, -0.1126F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1989F, -1.361F, -0.5027F, 0.0815F, -1.3162F));

		PartDefinition cube_r131 = body4.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(36, 28).mirror().addBox(-11.9247F, -2.3487F, -0.1126F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1989F, -3.361F, -0.5093F, 0.0562F, -1.3166F));

		PartDefinition cube_r132 = body4.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(88, 68).mirror().addBox(-5.4509F, -0.2377F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1989F, -3.361F, -0.4547F, 0.2443F, -0.9574F));

		PartDefinition cube_r133 = body4.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(85, 17).mirror().addBox(-2.4289F, 0.4047F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1989F, -3.361F, -0.3809F, 0.3511F, -0.7072F));

		PartDefinition cube_r134 = body4.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(30, 30).mirror().addBox(-7.5808F, -0.145F, -0.5346F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4319F, 11.8331F, -6.4401F, -0.3141F, 0.7538F, 0.1957F));

		PartDefinition cube_r135 = body4.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(36, 26).mirror().addBox(-6.3808F, 0.155F, -0.4347F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5874F, 11.5468F, -7.3025F, -0.346F, 0.5776F, 0.1596F));

		PartDefinition cube_r136 = body4.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(-5.8808F, 0.255F, -0.4347F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.322F, 11.34F, -8.2335F, -0.3313F, 0.4302F, 0.2231F));

		PartDefinition cube_r137 = body4.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(52, 45).mirror().addBox(-5.2009F, 0.4428F, -0.6686F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4963F, 11.199F, -9.478F, -0.1654F, 0.3484F, 0.4509F));

		PartDefinition cube_r138 = body4.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(49, 23).addBox(4.9247F, -2.3487F, -0.1126F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1989F, -1.361F, -0.5027F, -0.0815F, 1.3162F));

		PartDefinition cube_r139 = body4.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(88, 72).addBox(2.4509F, -0.2377F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1989F, -1.361F, -0.4391F, -0.2657F, 0.9534F));

		PartDefinition cube_r140 = body4.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(85, 37).addBox(-0.5711F, 0.4047F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1989F, -1.361F, -0.3595F, -0.3681F, 0.6996F));

		PartDefinition cube_r141 = body4.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(36, 28).addBox(4.9247F, -2.3487F, -0.1126F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1989F, -3.361F, -0.5093F, -0.0562F, 1.3166F));

		PartDefinition cube_r142 = body4.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(88, 68).addBox(2.4509F, -0.2377F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1989F, -3.361F, -0.4547F, -0.2443F, 0.9574F));

		PartDefinition cube_r143 = body4.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(85, 17).addBox(-0.5711F, 0.4047F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1989F, -3.361F, -0.3809F, -0.3511F, 0.7072F));

		PartDefinition cube_r144 = body4.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(25, 0).addBox(-0.4516F, -0.2838F, -0.6032F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4698F, 12.0776F, -5.4062F, -0.0334F, -0.9652F, -0.5309F));

		PartDefinition cube_r145 = body4.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(25, 2).addBox(-0.4516F, -0.2838F, -0.6032F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4698F, 12.0776F, -5.4062F, -0.167F, -0.8762F, -0.3877F));

		PartDefinition cube_r146 = body4.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(30, 30).addBox(-0.4192F, -0.145F, -0.5346F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4319F, 11.8331F, -6.4401F, -0.3141F, -0.7538F, -0.1957F));

		PartDefinition cube_r147 = body4.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(36, 26).addBox(-0.6192F, 0.155F, -0.4347F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5874F, 11.5468F, -7.3025F, -0.346F, -0.5776F, -0.1596F));

		PartDefinition cube_r148 = body4.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(48, 0).addBox(-0.1192F, 0.255F, -0.4347F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.322F, 11.34F, -8.2335F, -0.3313F, -0.4302F, -0.2231F));

		PartDefinition cube_r149 = body4.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(52, 45).addBox(-0.7991F, 0.4428F, -0.6686F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4963F, 11.199F, -9.478F, -0.1654F, -0.3484F, -0.4509F));

		PartDefinition cube_r150 = body4.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(15, 30).addBox(-0.5F, -0.9192F, -0.0436F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 11.8968F, -10.3808F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r151 = body4.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(15, 22).addBox(0.0F, -5.775F, -0.075F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6227F, -1.7677F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r152 = body4.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(68, 75).addBox(0.0F, -6.9F, 0.0F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6566F, -3.8266F, -0.5236F, 0.0F, 0.0F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3413F, -4.8184F, -0.1402F, 0.0864F, -0.0122F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(3, 106).addBox(0.0F, -7.9643F, 0.512F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 106).addBox(0.0F, -2.1855F, 0.0014F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1913F, -1.0194F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(106, 21).addBox(-0.005F, -5.1485F, -0.3787F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1913F, -1.0194F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(0, 106).addBox(0.0F, -2.9661F, -0.9858F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5079F, -0.1552F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(14, 106).addBox(-0.005F, -5.9661F, -0.4858F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8913F, -2.8194F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(106, 16).addBox(0.0F, -3.0093F, 0.0379F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8913F, -2.8194F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(36, 73).addBox(-0.005F, -8.0631F, -0.2421F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5011F, -6.0396F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(54, 106).addBox(0.0F, -1.8811F, 0.07F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2477F, -6.4751F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(17, 106).addBox(0.0F, -2.9943F, -0.9773F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5523F, -1.9751F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(58, 96).addBox(-0.005F, -4.9943F, 0.0227F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0217F, -4.3146F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(106, 53).addBox(0.0F, -1.9944F, -0.0773F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9768F, -4.4416F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(98, 59).mirror().addBox(-6.9247F, -2.3486F, -0.1126F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.0424F, -5.6426F, -0.5093F, 0.0562F, -1.4214F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(88, 80).mirror().addBox(-5.4509F, -0.2377F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.0424F, -5.6426F, -0.4547F, 0.2443F, -1.0621F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(88, 39).mirror().addBox(-2.4289F, 0.4047F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.0424F, -5.6426F, -0.3809F, 0.3511F, -0.8119F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(21, 88).mirror().addBox(-2.4289F, 0.4047F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.0424F, -3.9426F, -0.3667F, 0.3624F, -0.7022F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(72, 66).mirror().addBox(-8.9247F, -2.3486F, -0.1126F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.0424F, -3.9426F, -0.5049F, 0.0731F, -1.3164F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(88, 78).mirror().addBox(-5.4509F, -0.2377F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.0424F, -3.9426F, -0.4443F, 0.2586F, -0.9548F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(49, 30).mirror().addBox(-10.9247F, -2.3486F, -0.1126F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0424F, -2.2426F, -0.4916F, 0.1237F, -1.3151F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(88, 76).mirror().addBox(-5.4509F, -0.2377F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0424F, -2.2426F, -0.4127F, 0.3012F, -0.946F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(87, 2).mirror().addBox(-2.4289F, 0.4047F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0424F, -2.2426F, -0.3233F, 0.3959F, -0.6862F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-11.9247F, -2.3486F, -0.1126F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2424F, -0.4426F, -0.4916F, 0.1237F, -1.3151F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(88, 74).mirror().addBox(-5.4509F, -0.2377F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2424F, -0.4426F, -0.4127F, 0.3012F, -0.946F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(87, 0).mirror().addBox(-2.4289F, 0.4047F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2424F, -0.4426F, -0.3233F, 0.3959F, -0.6862F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(53, 28).mirror().addBox(-4.0152F, -0.3557F, -1.607F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9306F, 12.45F, -3.8393F, -0.2456F, 0.2723F, 0.6111F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(53, 28).addBox(-0.9849F, -0.3557F, -1.607F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9306F, 12.45F, -3.8393F, -0.2456F, -0.2723F, -0.6111F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(9, 69).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 11.7756F, -5.5157F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(88, 39).addBox(-0.5711F, 0.4047F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0424F, -5.6426F, -0.3809F, -0.3511F, 0.8119F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(88, 80).addBox(2.4509F, -0.2377F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0424F, -5.6426F, -0.4547F, -0.2443F, 1.0621F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(98, 59).addBox(4.9247F, -2.3486F, -0.1126F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0424F, -5.6426F, -0.5093F, -0.0562F, 1.4214F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(88, 78).addBox(2.4509F, -0.2377F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.0424F, -3.9426F, -0.4443F, -0.2586F, 0.9548F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(72, 66).addBox(4.9247F, -2.3486F, -0.1126F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.0424F, -3.9426F, -0.5049F, -0.0731F, 1.3164F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(21, 88).addBox(-0.5711F, 0.4047F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.0424F, -3.9426F, -0.3667F, -0.3624F, 0.7022F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(87, 2).addBox(-0.5711F, 0.4047F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0424F, -2.2426F, -0.3233F, -0.3959F, 0.6862F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(88, 76).addBox(2.4509F, -0.2377F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0424F, -2.2426F, -0.4127F, -0.3012F, 0.946F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(49, 30).addBox(4.9247F, -2.3486F, -0.1126F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0424F, -2.2426F, -0.4916F, -0.1237F, 1.3151F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(87, 0).addBox(-0.5711F, 0.4047F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2424F, -0.4426F, -0.3233F, -0.3959F, 0.6862F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(88, 74).addBox(2.4509F, -0.2377F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2424F, -0.4426F, -0.4127F, -0.3012F, 0.946F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(46, 2).addBox(4.9247F, -2.3486F, -0.1126F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2424F, -0.4426F, -0.4916F, -0.1237F, 1.3151F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(13, 45).addBox(-0.5F, -0.2108F, -4.9451F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.5607F, -1.8986F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(0, 86).addBox(-0.5F, -1.908F, 10.84F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.7607F, -11.4986F, 0.3403F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.7F, 8.5123F, -6.182F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r192 = leftarm.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(7, 82).addBox(-1.0F, 0.3F, 0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.4925F, 1.8553F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r193 = leftarm.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(92, 13).addBox(-1.0F, -1.0F, 0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(91, 59).addBox(-1.0F, -1.0F, 0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.0861F, 2.3583F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r194 = leftarm.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(92, 51).addBox(-0.9995F, -0.0499F, -1.0694F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.0143F, -0.4156F, 1.0209F, -0.4364F, 0.001F, -0.0014F));

		PartDefinition cube_r195 = leftarm.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(92, 32).addBox(-0.9995F, -0.0499F, -1.0694F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0126F, 0.26F, 1.7581F, -0.7419F, 0.001F, -0.0014F));

		PartDefinition cube_r196 = leftarm.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(18, 69).addBox(-0.9995F, -2.1499F, -2.0694F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.0104F, 2.2628F, 1.1264F, -0.3055F, 0.001F, -0.0014F));

		PartDefinition cube_r197 = leftarm.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(81, 39).addBox(0.3F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.8124F, 2.1877F, -1.1757F, -0.96F, 0.001F, -0.0014F));

		PartDefinition cube_r198 = leftarm.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(7, 90).addBox(-0.5F, -0.7F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0155F, 0.1403F, -1.4263F, -0.2008F, 0.001F, -0.0014F));

		PartDefinition cube_r199 = leftarm.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(57, 89).addBox(-0.5F, 0.2F, -2.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(39, 81).addBox(-0.5F, -0.8F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.013F, 1.1032F, -0.307F, -1.2044F, 0.001F, -0.0014F));

		PartDefinition cube_r200 = leftarm.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(91, 21).addBox(-0.5F, -1.8F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0099F, 2.5866F, 0.9555F, 0.3053F, 0.0009F, -0.0015F));

		PartDefinition cube_r201 = leftarm.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(10, 99).addBox(-0.5F, -1.6F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(99, 12).addBox(-0.5F, -1.6F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 6.8184F, 2.3161F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r202 = leftarm.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(69, 94).addBox(-0.5F, -3.2F, -1.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 4.9521F, 2.8516F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r203 = leftarm.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(101, 3).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 4.9521F, 2.8516F, 0.5411F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 7.6097F, 3.0826F, -1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r204 = leftarm2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(46, 81).addBox(0.5F, -1.2F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.7764F, -0.087F, 0.8556F, 1.5708F, 1.4661F, -1.5708F));

		PartDefinition cube_r205 = leftarm2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(59, 55).addBox(-2.0F, -1.3F, -1.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.1764F, -0.7125F, 0.9484F, 1.5708F, -0.4102F, -1.5708F));

		PartDefinition cube_r206 = leftarm2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(97, 62).addBox(-0.009F, -0.02F, -0.9596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.136F, 2.4278F, 0.0419F, 1.5708F, -1.309F, -1.5708F));

		PartDefinition cube_r207 = leftarm2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(97, 70).addBox(-1.2256F, -3.0299F, -0.9596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.136F, 3.3278F, 1.3419F, 1.5708F, -1.4835F, -1.5708F));

		PartDefinition cube_r208 = leftarm2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(105, 88).addBox(-0.7F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.8764F, 4.3324F, 1.2938F, 1.5708F, -1.1519F, -1.5708F));

		PartDefinition cube_r209 = leftarm2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(78, 14).addBox(-0.4F, -1.0F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3236F, 7.2039F, 3.0687F, 1.5708F, -0.733F, -1.5708F));

		PartDefinition cube_r210 = leftarm2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(77, 54).addBox(-0.0506F, 0.001F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3236F, 6.9995F, 1.7043F, 1.5708F, -0.9076F, -1.5708F));

		PartDefinition cube_r211 = leftarm2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(77, 59).addBox(0.0994F, 0.001F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3236F, 5.1944F, 0.8433F, 1.5708F, -0.9948F, -1.5708F));

		PartDefinition cube_r212 = leftarm2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(10, 77).addBox(-0.0506F, 0.001F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.3236F, 5.1944F, 0.8433F, 1.5708F, -1.1257F, -1.5708F));

		PartDefinition cube_r213 = leftarm2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(0, 74).addBox(0.0244F, -0.099F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3236F, 0.6164F, -0.923F, 1.5708F, -1.2217F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 8.505F, 3.4353F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r214 = leftArm3.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(104, 32).addBox(10.418F, -1.4998F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-11.6233F, 1.8326F, 0.5163F, 0.1658F, 0.0F, 0.1222F));

		PartDefinition cube_r215 = leftArm3.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(10, 103).addBox(-0.5F, -0.1776F, -0.3713F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.7F, 1.8326F, 0.5163F, 0.1658F, 0.0F, -0.1222F));

		PartDefinition cube_r216 = leftArm3.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(38, 60).addBox(-1.0F, -0.2F, -0.7F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.6092F, 0.1533F, -0.3071F, 0.0073F, -0.0188F));

		PartDefinition cube_r217 = leftArm4.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(21, 90).addBox(-1.5875F, -0.3814F, -0.1588F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5848F, 2.1065F, -0.0292F, 0.4165F, -0.061F, 0.1092F));

		PartDefinition cube_r218 = leftArm4.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(70, 89).addBox(-0.5787F, -0.5275F, -0.1702F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5848F, 2.1065F, -0.0292F, 0.4124F, 0.0644F, -0.0661F));

		PartDefinition cube_r219 = leftArm4.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(104, 96).addBox(-0.4632F, -1.0662F, -0.2199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.608F, 2.0065F, -0.1292F, -0.0183F, -0.1296F, 0.0535F));

		PartDefinition cube_r220 = leftArm4.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(49, 103).addBox(-0.5368F, -1.0662F, -0.2199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5848F, 2.0065F, -0.1292F, -0.0245F, 0.1728F, -0.0545F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.7F, 8.5123F, -6.182F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r221 = rightarm.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(82, 19).addBox(-1.0F, 0.3F, 0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.4925F, 1.8553F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r222 = rightarm.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(0, 94).addBox(-1.0F, -1.0F, 0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(55, 93).addBox(-1.0F, -1.0F, 0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.0861F, 2.3583F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r223 = rightarm.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(48, 93).addBox(-1.0005F, -0.0499F, -1.0694F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0143F, -0.4156F, 1.0209F, -0.4364F, -0.001F, 0.0014F));

		PartDefinition cube_r224 = rightarm.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(93, 26).addBox(-1.0005F, -0.0499F, -1.0694F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0126F, 0.26F, 1.7581F, -0.7419F, -0.001F, 0.0014F));

		PartDefinition cube_r225 = rightarm.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(54, 70).addBox(-1.0005F, -2.1499F, -2.0694F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0104F, 2.2628F, 1.1264F, -0.3055F, -0.001F, 0.0014F));

		PartDefinition cube_r226 = rightarm.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(81, 73).addBox(-1.3F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8124F, 2.1877F, -1.1757F, -0.96F, -0.001F, 0.0014F));

		PartDefinition cube_r227 = rightarm.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(14, 90).addBox(-0.5F, -0.7F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0155F, 0.1403F, -1.4263F, -0.2008F, -0.001F, 0.0014F));

		PartDefinition cube_r228 = rightarm.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(0, 90).addBox(-0.5F, 0.2F, -2.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(81, 68).addBox(-0.5F, -0.8F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.013F, 1.1032F, -0.307F, -1.2044F, -0.001F, 0.0014F));

		PartDefinition cube_r229 = rightarm.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(91, 54).addBox(-0.5F, -1.8F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0099F, 2.5866F, 0.9555F, 0.3053F, -0.0009F, 0.0015F));

		PartDefinition cube_r230 = rightarm.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(39, 99).addBox(-0.5F, -1.6F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(99, 31).addBox(-0.5F, -1.6F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 6.8184F, 2.3161F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r231 = rightarm.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(81, 95).addBox(-0.5F, -3.2F, -1.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 4.9521F, 2.8516F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r232 = rightarm.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(101, 21).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 4.9521F, 2.8516F, 0.5411F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 7.6097F, 3.0826F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r233 = rightarm2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(71, 83).addBox(-1.5F, -1.2F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.7764F, -0.087F, 0.8556F, 1.5708F, -1.4661F, 1.5708F));

		PartDefinition cube_r234 = rightarm2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(60, 10).addBox(-2.0F, -1.3F, -1.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1764F, -0.7125F, 0.9484F, 1.5708F, 0.4102F, 1.5708F));

		PartDefinition cube_r235 = rightarm2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(97, 66).addBox(-0.991F, -0.02F, -0.9596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.136F, 2.4278F, 0.0419F, 1.5708F, 1.309F, 1.5708F));

		PartDefinition cube_r236 = rightarm2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(97, 74).addBox(0.2256F, -3.0299F, -0.9596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.136F, 3.3278F, 1.3419F, 1.5708F, 1.4835F, 1.5708F));

		PartDefinition cube_r237 = rightarm2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(89, 105).addBox(-0.3F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8764F, 4.3324F, 1.2938F, 1.5708F, 1.1519F, 1.5708F));

		PartDefinition cube_r238 = rightarm2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(80, 0).addBox(-0.6F, -1.0F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3236F, 7.2039F, 3.0687F, 1.5708F, 0.733F, 1.5708F));

		PartDefinition cube_r239 = rightarm2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(29, 79).addBox(-0.9494F, 0.001F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3236F, 6.9995F, 1.7043F, 1.5708F, 0.9076F, 1.5708F));

		PartDefinition cube_r240 = rightarm2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(22, 79).addBox(-1.0994F, 0.001F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3236F, 5.1944F, 0.8433F, 1.5708F, 0.9948F, 1.5708F));

		PartDefinition cube_r241 = rightarm2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(78, 34).addBox(-0.9494F, 0.001F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.3236F, 5.1944F, 0.8433F, 1.5708F, 1.1257F, 1.5708F));

		PartDefinition cube_r242 = rightarm2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(5, 74).addBox(-1.0244F, -0.099F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3236F, 0.6164F, -0.923F, 1.5708F, 1.2217F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 8.505F, 3.4353F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r243 = rightArm3.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(104, 79).addBox(-11.418F, -1.4998F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(11.6233F, 1.8326F, 0.5163F, 0.1658F, 0.0F, -0.1222F));

		PartDefinition cube_r244 = rightArm3.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(36, 103).addBox(-0.5F, -0.1776F, -0.3713F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.7F, 1.8326F, 0.5163F, 0.1658F, 0.0F, 0.1222F));

		PartDefinition cube_r245 = rightArm3.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(0, 61).addBox(-1.0F, -0.2F, -0.7F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.6092F, 0.1533F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r246 = rightArm4.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(90, 43).addBox(-0.5407F, -0.9728F, -0.1525F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.608F, 2.0065F, -0.1292F, -1.06F, -0.1032F, -0.0706F));

		PartDefinition cube_r247 = rightArm4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(36, 90).addBox(-0.4593F, -0.9728F, -0.1525F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5848F, 2.0065F, -0.1292F, -1.0669F, 0.0601F, 0.07F));

		PartDefinition cube_r248 = rightArm4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(44, 105).addBox(-0.5368F, -1.0662F, -0.2199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.608F, 2.0065F, -0.1292F, -0.0183F, 0.1296F, -0.0535F));

		PartDefinition cube_r249 = rightArm4.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(104, 13).addBox(-0.4632F, -1.0662F, -0.2199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5848F, 2.0065F, -0.1292F, -0.0245F, -0.1728F, 0.0545F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.2182F, 3.9722F, -4.4163F, 0.0152F, 0.0859F, -0.0168F));

		PartDefinition cube_r250 = bone2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(22, 54).addBox(-0.495F, -2.029F, 0.1867F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.0898F, 0.0725F, -0.317F));

		PartDefinition cube_r251 = bone2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(0, 11).addBox(-0.4128F, -1.4353F, -0.6707F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.0553F, 0.0725F, -0.317F));

		PartDefinition cube_r252 = bone2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(19, 11).addBox(-0.4128F, -1.4627F, -3.8405F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.005F))
				.texOffs(0, 22).addBox(-0.495F, -0.9573F, 2.9966F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4742F, 0.0725F, -0.317F));

		PartDefinition cube_r253 = bone2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(26, 47).addBox(-0.5F, -1.325F, -2.825F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.6623F, -5.9925F, 3.905F, 0.8633F, 0.0725F, -0.317F));

		PartDefinition cube_r254 = bone2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(38, 54).addBox(-0.5F, -1.5F, -1.95F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0014F)), PartPose.offsetAndRotation(-2.0703F, -6.9664F, 2.7485F, 1.1251F, 0.0725F, -0.317F));

		PartDefinition cube_r255 = bone2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(9, 58).addBox(-0.5F, -1.0F, -1.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7652F, -4.8797F, -2.2162F, -3.0113F, 0.0725F, -0.317F));

		PartDefinition cube_r256 = bone2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(0, 54).addBox(-0.5F, -0.9F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.9237F, -2.5798F, -1.0796F, -2.7059F, 0.0725F, -0.317F));

		PartDefinition cube_r257 = bone2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(54, 59).addBox(-0.5F, -0.1F, -3.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.8436F, -8.2322F, -1.9336F, 1.8058F, 0.0725F, -0.317F));

		PartDefinition cube_r258 = bone2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(0, 46).addBox(-0.5F, -1.5F, -2.5F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.12F, -6.1258F, -1.5089F, 2.5738F, 0.0725F, -0.317F));

		PartDefinition cube_r259 = bone2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.8F, -3.0F, 2.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3523F, -0.2864F, -0.5912F, 1.2901F, -0.3787F, -0.2816F));

		PartDefinition cube_r260 = bone2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(76, 29).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7676F, 2.5806F, -1.63F, 2.1985F, 0.0725F, -0.317F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.2182F, 3.9722F, -4.4163F, 0.0152F, -0.0859F, 0.0168F));

		PartDefinition cube_r261 = bone3.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(22, 54).mirror().addBox(-0.505F, -2.029F, 0.1867F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.0898F, -0.0725F, 0.317F));

		PartDefinition cube_r262 = bone3.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-0.5872F, -1.4353F, -0.6707F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.0553F, -0.0725F, 0.317F));

		PartDefinition cube_r263 = bone3.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(19, 11).mirror().addBox(-0.5872F, -1.4627F, -3.8405F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(0, 22).mirror().addBox(-0.505F, -0.9573F, 2.9966F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4742F, -0.0725F, 0.317F));

		PartDefinition cube_r264 = bone3.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(26, 47).mirror().addBox(-0.5F, -1.325F, -2.825F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.6623F, -5.9925F, 3.905F, 0.8633F, -0.0725F, 0.317F));

		PartDefinition cube_r265 = bone3.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(38, 54).mirror().addBox(-0.5F, -1.5F, -1.95F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0014F)).mirror(false), PartPose.offsetAndRotation(2.0703F, -6.9664F, 2.7485F, 1.1251F, -0.0725F, 0.317F));

		PartDefinition cube_r266 = bone3.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(9, 58).mirror().addBox(-0.5F, -1.0F, -1.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7652F, -4.8797F, -2.2162F, -3.0113F, -0.0725F, 0.317F));

		PartDefinition cube_r267 = bone3.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-0.5F, -0.9F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.9237F, -2.5798F, -1.0796F, -2.7059F, -0.0725F, 0.317F));

		PartDefinition cube_r268 = bone3.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(54, 59).mirror().addBox(-0.5F, -0.1F, -3.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.8436F, -8.2322F, -1.9336F, 1.8058F, -0.0725F, 0.317F));

		PartDefinition cube_r269 = bone3.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-0.5F, -1.5F, -2.5F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(2.12F, -6.1258F, -1.5089F, 2.5738F, -0.0725F, 0.317F));

		PartDefinition cube_r270 = bone3.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.0F, -0.8F, -3.0F, 2.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3523F, -0.2864F, -0.5912F, 1.2901F, 0.3787F, 0.2816F));

		PartDefinition cube_r271 = bone3.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(76, 29).mirror().addBox(-0.5F, -1.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7676F, 2.5806F, -1.63F, 2.1985F, -0.0725F, 0.317F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.404F, -5.834F, 0.2568F, 0.1689F, 0.0441F));

		PartDefinition cube_r272 = neck2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(30, 88).addBox(-0.004F, -5.0F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.015F, -1.1943F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r273 = neck2.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(18, 58).addBox(0.0F, -2.6F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5157F, -1.9109F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r274 = neck2.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(33, 88).addBox(0.0F, -4.6F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7431F, -3.8356F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r275 = neck2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(80, 5).mirror().addBox(-2.0F, 0.0F, -0.9F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3175F, -2.852F, -0.074F, 0.013F, -0.7891F));

		PartDefinition cube_r276 = neck2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(80, 5).addBox(0.0F, 0.0F, -0.9F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3175F, -2.852F, -0.074F, -0.013F, 0.7891F));

		PartDefinition cube_r277 = neck2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(48, 47).addBox(-0.5F, -0.2F, 2.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.0131F, -6.5998F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3147F, -3.799F, -0.6849F, 0.1016F, -0.0827F));

		PartDefinition cube_r278 = neck.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(51, 76).addBox(0.0F, -1.9977F, -1.0523F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.58F, -0.859F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r279 = neck.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(105, 59).mirror().addBox(-0.8F, 0.0F, -2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(77, 64).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.081F, -1.3483F, 0.0619F, 0.0322F, -0.479F));

		PartDefinition cube_r280 = neck.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(105, 59).addBox(-0.2F, 0.0F, -2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 64).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.081F, -1.3483F, 0.0619F, -0.0322F, 0.479F));

		PartDefinition cube_r281 = neck.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(49, 11).addBox(-0.5F, -0.6166F, -1.4594F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F))
				.texOffs(65, 80).addBox(0.0F, -2.5165F, -1.4594F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1701F, -2.3853F, 0.0698F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(39, 40).addBox(-0.5F, -0.6F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.2456F, -3.7117F, 0.0529F, 0.0864F, 0.0122F));

		PartDefinition cube_r282 = neck3.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(41, 94).mirror().addBox(0.0F, 0.0307F, -0.7264F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.3422F, -1.9236F, 0.2335F, -0.0728F, 0.2969F));

		PartDefinition cube_r283 = neck3.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(41, 94).addBox(0.0F, 0.0307F, -0.7264F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3422F, -1.9236F, 0.2335F, 0.0728F, -0.2969F));

		PartDefinition cube_r284 = neck3.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(14, 94).addBox(0.0F, 0.2307F, -3.1264F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9244F, -2.0688F, 0.3752F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1705F, -6.2922F, -0.6966F, -0.0148F, 0.1489F));

		PartDefinition cube_r285 = head.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(76, 86).addBox(-1.0F, -1.5F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.2881F, 1.9095F, 2.2864F, 0.0F, 0.0F));

		PartDefinition cube_r286 = head.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(7, 94).addBox(-1.0F, -0.8F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.2881F, 1.9095F, 1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r287 = head.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(11, 52).addBox(-1.0F, -1.8F, -1.6F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 4.2977F, -1.4499F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r288 = head.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(29, 54).addBox(-0.5F, -4.0105F, 0.029F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.5F, 5.6742F, 0.4052F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r289 = head.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(19, 21).addBox(-0.5F, -1.1105F, -6.471F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 4.782F, -0.1087F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r290 = head.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(41, 91).addBox(-1.0F, -0.1F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 11.9024F, -3.2051F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r291 = head.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(90, 64).addBox(-1.0F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 10.7166F, -2.8531F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r292 = head.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(25, 4).addBox(-1.0F, -0.6F, -4.9F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 6.4084F, -0.2116F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r293 = head.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(45, 72).addBox(-1.0F, -1.035F, -3.0615F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 9.19F, -2.8987F, 1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r294 = head.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(72, 68).addBox(-1.0F, -0.95F, -1.95F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 10.7906F, -2.736F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r295 = head.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(74, 105).addBox(-0.5F, -0.275F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F))
				.texOffs(59, 105).addBox(-0.5F, -0.275F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 11.0889F, -6.3985F, 1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r296 = head.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(69, 99).addBox(-0.5F, -0.025F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 10.1585F, -6.032F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r297 = head.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(29, 61).addBox(-0.5F, -0.525F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 9.0392F, -4.9152F, 1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r298 = head.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(51, 96).addBox(-1.0F, -1.4305F, -0.8697F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(80, 8).addBox(-1.5F, -1.0305F, -0.8697F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 13.841F, -4.5317F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r299 = head.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(63, 71).addBox(-1.0F, -0.425F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 12.2835F, -5.1688F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r300 = head.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(71, 8).addBox(-1.0F, -1.0305F, -1.8697F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 12.1956F, -3.5817F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r301 = head.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(36, 11).addBox(-1.4F, 0.0428F, -2.8774F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 4.1822F, -4.1519F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r302 = head.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(30, 32).addBox(-1.4F, -0.0072F, -1.0774F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.9F, 7.4036F, -4.8203F, 1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r303 = head.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(26, 40).addBox(-1.0F, -2.0F, -2.1F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.9933F, 0.1081F, 1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r304 = head.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(99, 98).addBox(-0.5F, -0.3959F, -0.9407F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.7595F, -3.201F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r305 = head.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(53, 25).addBox(-2.5F, -0.4959F, -1.9407F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.3595F, -3.201F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r306 = head.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(103, 7).addBox(-0.5F, 0.0388F, 0.0157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6122F, -3.5974F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r307 = head.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(102, 61).addBox(-0.5F, 0.001F, -0.0086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1325F, -2.5605F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r308 = head.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(61, 102).addBox(-0.5F, -0.049F, -0.0086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1986F, -2.9216F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r309 = head.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(48, 53).addBox(-1.0F, -1.0F, -1.6F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.6492F, -0.0359F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r310 = head.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(90, 86).addBox(-0.5F, -0.049F, -0.0086F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.7163F, -3.2762F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r311 = head.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(85, 90).addBox(-0.725F, -0.1104F, -1.2294F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0F, -1.5407F, -0.0222F, 0.5535F, 0.4145F, 0.0777F));

		PartDefinition cube_r312 = head.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(104, 99).addBox(-0.5F, -0.025F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -1.9534F, -2.0296F, 0.4363F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.0F, 7.7298F, -5.0083F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(26, 102).addBox(-0.5F, -0.7603F, -0.4367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.3666F, 6.3243F, 0.1377F, 2.8651F, 0.1239F, 3.0752F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(31, 102).addBox(-0.5F, -0.2365F, -0.452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3666F, 6.3243F, 0.1377F, 2.4463F, 0.1239F, 3.0752F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(102, 41).addBox(-0.5F, -0.7603F, -0.4367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.1666F, 6.2743F, 0.1377F, 2.8651F, 0.1239F, 2.9879F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(101, 35).addBox(-0.5F, -0.2365F, -0.452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1666F, 6.2743F, 0.1377F, 2.4463F, 0.1239F, 2.9879F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(76, 83).addBox(-0.5F, -0.2365F, -0.452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.7666F, 6.0243F, 0.2627F, 2.351F, 0.2798F, 2.4089F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(67, 44).addBox(-0.5F, -0.7603F, -0.4367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.7666F, 6.0243F, 0.2627F, 2.7699F, 0.2798F, 2.4089F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(98, 8).addBox(-0.4935F, -1.3816F, -0.4415F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.4643F, 5.4095F, 1.2345F, 2.83F, 0.1703F, 2.3954F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(99, 102).addBox(-0.4935F, -1.2751F, -0.2369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(94, 102).addBox(-0.4935F, -0.5751F, -0.2369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(2.4643F, 5.4095F, 1.2345F, 2.5682F, 0.1703F, 2.3954F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(61, 98).addBox(-0.5252F, -0.5606F, -0.399F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.4643F, 5.4095F, 1.2345F, 2.3631F, 0.3138F, 2.3631F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(0, 31).addBox(-0.8F, -0.1215F, -2.4631F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3281F, -7.0998F, 2.5075F, 1.1044F, 0.4319F, -0.3318F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(101, 25).addBox(-0.5252F, -0.2621F, -0.1138F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(2.4643F, 5.4095F, 1.2345F, 2.1362F, 0.3138F, 2.3631F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(27, 72).addBox(-1.6F, -1.1F, -0.8F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, -4.8094F, 2.3017F, 1.3654F, 0.0741F, 0.3414F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(88, 82).addBox(-0.4987F, -0.3531F, -0.654F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.7753F, 4.4123F, -0.5549F, 2.1253F, 0.5394F, -0.0009F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(43, 87).addBox(-0.4987F, -0.4759F, -0.5267F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.7753F, 4.4123F, -0.5549F, 1.7326F, 0.5394F, -0.0009F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(102, 105).addBox(-0.4603F, -0.4211F, -0.9657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.7753F, 4.4123F, -0.5549F, 1.5667F, 0.539F, 0.1008F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(14, 86).addBox(-1.1F, -1.1F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, -5.7857F, 2.5181F, 1.4088F, -0.1468F, -0.7298F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(94, 35).addBox(-0.275F, -0.7F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.3158F, 5.7456F, -0.433F, 0.0964F, -0.3586F, -0.9845F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(64, 20).addBox(-0.593F, -0.2562F, 1.5813F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.4708F, 5.1043F, 0.305F, -0.6158F, -1.3215F, 1.9654F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(37, 47).addBox(-0.6F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 2.1149F, 0.3878F, 1.0864F, 0.4724F, -0.235F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(83, 48).addBox(-0.3581F, -1.0917F, -0.322F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.4708F, 5.1043F, 0.305F, -1.7125F, -1.4137F, 2.505F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(19, 95).addBox(0.125F, -0.75F, -0.075F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.3158F, 5.7456F, -0.433F, 0.2766F, -0.2502F, -1.5693F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(26, 105).addBox(-0.5025F, -0.6931F, -0.5977F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5298F, -9.6693F, 4.3705F, 0.9468F, 0.6704F, 0.2053F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(31, 105).addBox(-0.5025F, -0.6216F, -0.5079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5298F, -9.6693F, 4.3705F, -0.275F, 0.6704F, 0.2053F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(36, 86).addBox(-0.5025F, -0.6691F, -0.4064F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.5298F, -9.6693F, 4.3705F, -1.4967F, 0.6704F, 0.2053F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(56, 32).addBox(-1.3F, -0.601F, -2.4541F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5F, -4.0359F, 1.6317F, 1.5693F, 0.1073F, 0.6379F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(18, 63).addBox(0.3F, -1.5F, -2.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1176F, -1.1464F, 2.5554F, 1.2911F, 0.5006F, -0.0551F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.0F, 7.7298F, -5.0083F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(26, 102).mirror().addBox(-0.5F, -0.7603F, -0.4367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.3666F, 6.3243F, 0.1377F, 2.8651F, -0.1239F, -3.0752F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(31, 102).mirror().addBox(-0.5F, -0.2365F, -0.452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3666F, 6.3243F, 0.1377F, 2.4463F, -0.1239F, -3.0752F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(102, 41).mirror().addBox(-0.5F, -0.7603F, -0.4367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.1666F, 6.2743F, 0.1377F, 2.8651F, -0.1239F, -2.9879F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(101, 35).mirror().addBox(-0.5F, -0.2365F, -0.452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1666F, 6.2743F, 0.1377F, 2.4463F, -0.1239F, -2.9879F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(76, 83).mirror().addBox(-0.5F, -0.2365F, -0.452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.7666F, 6.0243F, 0.2627F, 2.351F, -0.2798F, -2.4089F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(67, 44).mirror().addBox(-0.5F, -0.7603F, -0.4367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.7666F, 6.0243F, 0.2627F, 2.7699F, -0.2798F, -2.4089F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(98, 8).mirror().addBox(-0.5065F, -1.3816F, -0.4415F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.4643F, 5.4095F, 1.2345F, 2.83F, -0.1703F, -2.3954F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(99, 102).mirror().addBox(-0.5065F, -1.2751F, -0.2369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(94, 102).mirror().addBox(-0.5065F, -0.5751F, -0.2369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-2.4643F, 5.4095F, 1.2345F, 2.5682F, -0.1703F, -2.3954F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(61, 98).mirror().addBox(-0.4748F, -0.5606F, -0.399F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.4643F, 5.4095F, 1.2345F, 2.3631F, -0.3138F, -2.3631F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-0.2F, -0.1215F, -2.4631F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3281F, -7.0998F, 2.5075F, 1.1044F, -0.4319F, 0.3318F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(101, 25).mirror().addBox(-0.4748F, -0.2621F, -0.1138F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-2.4643F, 5.4095F, 1.2345F, 2.1362F, -0.3138F, -2.3631F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(27, 72).mirror().addBox(-1.4F, -1.1F, -0.8F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -4.8094F, 2.3017F, 1.3654F, -0.0741F, -0.3414F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(88, 82).mirror().addBox(-0.5013F, -0.3531F, -0.654F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.7753F, 4.4123F, -0.5549F, 2.1253F, -0.5394F, 0.0009F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(43, 87).mirror().addBox(-0.5013F, -0.4759F, -0.5267F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.7753F, 4.4123F, -0.5549F, 1.7326F, -0.5394F, 0.0009F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(102, 105).mirror().addBox(-0.5397F, -0.4211F, -0.9657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.7753F, 4.4123F, -0.5549F, 1.5667F, -0.539F, -0.1008F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(14, 86).mirror().addBox(0.1F, -1.1F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -5.7857F, 2.5181F, 1.4088F, 0.1468F, 0.7298F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(94, 35).mirror().addBox(-1.725F, -0.7F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.3158F, 5.7456F, -0.433F, 0.0964F, 0.3586F, 0.9845F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(64, 20).mirror().addBox(-0.407F, -0.2562F, 1.5813F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.4708F, 5.1043F, 0.305F, -0.6158F, 1.3215F, -1.9654F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(37, 47).mirror().addBox(-0.4F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.1149F, 0.3878F, 1.0864F, -0.4724F, 0.235F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(83, 48).mirror().addBox(-0.6419F, -1.0917F, -0.322F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.4708F, 5.1043F, 0.305F, -1.7125F, 1.4137F, -2.505F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(19, 95).mirror().addBox(-2.125F, -0.75F, -0.075F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.3158F, 5.7456F, -0.433F, 0.2766F, 0.2502F, 1.5693F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(26, 105).mirror().addBox(-0.4975F, -0.6931F, -0.5977F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5298F, -9.6693F, 4.3705F, 0.9468F, -0.6704F, -0.2053F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(31, 105).mirror().addBox(-0.4975F, -0.6216F, -0.5079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5298F, -9.6693F, 4.3705F, -0.275F, -0.6704F, -0.2053F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(36, 86).mirror().addBox(-0.4975F, -0.6691F, -0.4064F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-0.5298F, -9.6693F, 4.3705F, -1.4967F, -0.6704F, -0.2053F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(56, 32).mirror().addBox(-0.7F, -0.601F, -2.4541F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -4.0359F, 1.6317F, 1.5693F, -0.1073F, -0.6379F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(18, 63).mirror().addBox(-1.3F, -1.5F, -2.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1176F, -1.1464F, 2.5554F, 1.2911F, -0.5006F, 0.0551F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4F, 5.2615F, -0.2284F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r365 = leftOrbit.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(83, 64).addBox(-1.0798F, -0.9137F, 0.2533F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6693F, 0.0222F, -0.6872F, -0.0364F, 0.2962F, -0.0526F));

		PartDefinition cube_r366 = leftOrbit.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(102, 47).addBox(-1.0798F, -0.2624F, 1.2858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(2.6693F, 0.0222F, -0.6872F, 0.0508F, 0.2962F, -0.0526F));

		PartDefinition cube_r367 = leftOrbit.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(84, 102).addBox(-1.0798F, -0.2075F, -0.5029F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6693F, 0.0222F, -0.6872F, 1.6216F, 0.2962F, -0.0526F));

		PartDefinition cube_r368 = leftOrbit.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(24, 98).addBox(-1.0798F, -0.2828F, -0.2913F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.6693F, 0.0222F, -0.6872F, 1.098F, 0.2962F, -0.0526F));

		PartDefinition cube_r369 = leftOrbit.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(102, 44).addBox(-1.0798F, 0.4856F, 0.862F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6693F, 0.0222F, -0.6872F, 0.3999F, 0.2962F, -0.0526F));

		PartDefinition cube_r370 = leftOrbit.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(102, 38).addBox(-0.4955F, -0.2998F, 0.6278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.3693F, 0.0222F, 0.0128F, 1.8383F, 0.4704F, -0.0564F));

		PartDefinition cube_r371 = leftOrbit.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(101, 16).addBox(-1.0798F, 0.389F, -0.8022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.6693F, 0.0222F, -0.6872F, 2.5467F, 0.2962F, -0.0526F));

		PartDefinition cube_r372 = leftOrbit.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(81, 82).addBox(-0.5F, -0.6F, -0.475F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.2208F, -3.5391F, 0.4549F, 1.8063F, -0.1996F, -0.9913F));

		PartDefinition cube_r373 = leftOrbit.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(103, 0).addBox(-0.55F, 0.0F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1599F, -3.4238F, 1.0965F, 1.4437F, -0.5029F, -0.9524F));

		PartDefinition cube_r374 = leftOrbit.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(34, 98).addBox(-0.5F, -1.5F, -1.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2793F, -4.0661F, 0.8235F, 1.2827F, -0.1996F, -0.9913F));

		PartDefinition cube_r375 = leftOrbit.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(102, 73).addBox(-0.0031F, -0.3052F, 0.4144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.719F, -2.6212F, 0.3967F, 1.5009F, -0.1996F, -0.9913F));

		PartDefinition cube_r376 = leftOrbit.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(74, 102).addBox(-0.2404F, -0.4552F, -0.2404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.719F, -2.6212F, 0.3967F, 1.5604F, -0.1576F, -0.5944F));

		PartDefinition cube_r377 = leftOrbit.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(102, 70).addBox(-0.2404F, -0.3052F, -0.2404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.719F, -2.6212F, 0.3967F, 1.4295F, -0.1576F, -0.5944F));

		PartDefinition cube_r378 = leftOrbit.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(102, 82).addBox(-0.4496F, -0.5517F, 0.4047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.719F, -2.6212F, 0.3967F, -0.2402F, -0.0354F, -0.3646F));

		PartDefinition cube_r379 = leftOrbit.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(102, 67).addBox(-0.1746F, -0.2517F, -0.6953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.719F, -2.6212F, 0.3967F, 0.9379F, -0.0354F, -0.3646F));

		PartDefinition cube_r380 = leftOrbit.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(102, 64).addBox(-0.0194F, -0.2744F, -1.3994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.719F, -2.6212F, 0.3967F, 0.9096F, 0.1192F, -0.0867F));

		PartDefinition cube_r381 = leftOrbit.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(102, 93).addBox(-0.4981F, -1.8692F, -0.2183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.3693F, 0.0222F, 0.0128F, 0.6732F, 0.4273F, 0.0293F));

		PartDefinition cube_r382 = leftOrbit.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(80, 90).addBox(-0.5F, -2.2F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.2793F, -4.0661F, 0.8235F, 1.0209F, -0.1996F, -0.9913F));

		PartDefinition cube_r383 = leftOrbit.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(81, 78).addBox(-0.4981F, -1.2146F, -0.5326F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(2.3693F, 0.0222F, 0.0128F, 1.3713F, 0.4273F, 0.0293F));

		PartDefinition cube_r384 = leftOrbit.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(97, 105).addBox(-0.3925F, -1.0518F, -1.5678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3693F, 0.0222F, 0.0128F, 0.8504F, 0.5182F, 0.1751F));

		PartDefinition cube_r385 = leftOrbit.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(22, 84).addBox(-0.8248F, -0.4751F, -0.9894F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.4582F, -0.797F, -2.7056F, 0.3694F, -0.2036F, 1.6082F));

		PartDefinition cube_r386 = leftOrbit.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(89, 4).addBox(-1.5F, -0.9F, -0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2555F, 1.4789F, -2.3412F, -0.3269F, -0.9791F, 1.2937F));

		PartDefinition cube_r387 = leftOrbit.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(46, 96).addBox(-0.975F, -0.275F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5036F, -0.0331F, -2.9759F, 0.1015F, -0.2088F, 1.0212F));

		PartDefinition cube_r388 = leftOrbit.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(101, 55).addBox(-1.6F, -0.2F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(101, 51).addBox(-1.0F, -0.2F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5036F, -0.0331F, -2.9759F, 0.0126F, -0.2315F, 1.4231F));

		PartDefinition cube_r389 = leftOrbit.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(85, 33).addBox(-0.7F, -0.5F, -0.575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F))
				.texOffs(85, 13).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(1.7808F, -0.983F, -1.8442F, 0.3665F, 0.1635F, 1.7486F));

		PartDefinition cube_r390 = leftOrbit.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(69, 103).addBox(-0.5606F, -0.4751F, -0.1639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.4582F, -0.797F, -2.7056F, 0.3665F, -0.1628F, 1.6241F));

		PartDefinition cube_r391 = leftOrbit.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(54, 103).addBox(-0.5535F, -0.4751F, -0.7964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(1.4582F, -0.797F, -2.7056F, 0.4908F, -0.7224F, 1.3466F));

		PartDefinition cube_r392 = leftOrbit.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(0, 69).addBox(-0.5F, -0.4F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6161F, 1.0866F, -1.5877F, 1.2986F, 0.657F, 0.8974F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4F, 5.2615F, -0.2284F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r393 = rightOrbit.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(83, 64).mirror().addBox(0.0798F, -0.9137F, 0.2533F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6693F, 0.0222F, -0.6872F, -0.0364F, -0.2962F, 0.0526F));

		PartDefinition cube_r394 = rightOrbit.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(102, 47).mirror().addBox(0.0798F, -0.2624F, 1.2858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-2.6693F, 0.0222F, -0.6872F, 0.0508F, -0.2962F, 0.0526F));

		PartDefinition cube_r395 = rightOrbit.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(84, 102).mirror().addBox(0.0798F, -0.2075F, -0.5029F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6693F, 0.0222F, -0.6872F, 1.6216F, -0.2962F, 0.0526F));

		PartDefinition cube_r396 = rightOrbit.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(24, 98).mirror().addBox(0.0798F, -0.2828F, -0.2913F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.6693F, 0.0222F, -0.6872F, 1.098F, -0.2962F, 0.0526F));

		PartDefinition cube_r397 = rightOrbit.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(102, 44).mirror().addBox(0.0798F, 0.4856F, 0.862F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6693F, 0.0222F, -0.6872F, 0.3999F, -0.2962F, 0.0526F));

		PartDefinition cube_r398 = rightOrbit.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(102, 38).mirror().addBox(-0.5045F, -0.2998F, 0.6278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.3693F, 0.0222F, 0.0128F, 1.8383F, -0.4704F, 0.0564F));

		PartDefinition cube_r399 = rightOrbit.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(101, 16).mirror().addBox(0.0798F, 0.389F, -0.8022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.6693F, 0.0222F, -0.6872F, 2.5467F, -0.2962F, 0.0526F));

		PartDefinition cube_r400 = rightOrbit.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(81, 82).mirror().addBox(-0.5F, -0.6F, -0.475F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2208F, -3.5391F, 0.4549F, 1.8063F, 0.1996F, 0.9913F));

		PartDefinition cube_r401 = rightOrbit.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(103, 0).mirror().addBox(-0.45F, 0.0F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1599F, -3.4238F, 1.0965F, 1.4437F, 0.5029F, 0.9524F));

		PartDefinition cube_r402 = rightOrbit.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(34, 98).mirror().addBox(-0.5F, -1.5F, -1.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2793F, -4.0661F, 0.8235F, 1.2827F, 0.1996F, 0.9913F));

		PartDefinition cube_r403 = rightOrbit.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(102, 73).mirror().addBox(-0.9969F, -0.3052F, 0.4144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.719F, -2.6212F, 0.3967F, 1.5009F, 0.1996F, 0.9913F));

		PartDefinition cube_r404 = rightOrbit.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(74, 102).mirror().addBox(-0.7596F, -0.4552F, -0.2404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.719F, -2.6212F, 0.3967F, 1.5604F, 0.1576F, 0.5944F));

		PartDefinition cube_r405 = rightOrbit.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(102, 70).mirror().addBox(-0.7596F, -0.3052F, -0.2404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.719F, -2.6212F, 0.3967F, 1.4295F, 0.1576F, 0.5944F));

		PartDefinition cube_r406 = rightOrbit.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(102, 82).mirror().addBox(-0.5504F, -0.5517F, 0.4047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.719F, -2.6212F, 0.3967F, -0.2402F, 0.0354F, 0.3646F));

		PartDefinition cube_r407 = rightOrbit.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(102, 67).mirror().addBox(-0.8254F, -0.2517F, -0.6953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.719F, -2.6212F, 0.3967F, 0.9379F, 0.0354F, 0.3646F));

		PartDefinition cube_r408 = rightOrbit.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(102, 64).mirror().addBox(-0.9806F, -0.2744F, -1.3994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.719F, -2.6212F, 0.3967F, 0.9096F, -0.1192F, 0.0867F));

		PartDefinition cube_r409 = rightOrbit.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(102, 93).mirror().addBox(-0.5019F, -1.8692F, -0.2183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3693F, 0.0222F, 0.0128F, 0.6732F, -0.4273F, -0.0293F));

		PartDefinition cube_r410 = rightOrbit.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(80, 90).mirror().addBox(-0.5F, -2.2F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.2793F, -4.0661F, 0.8235F, 1.0209F, 0.1996F, 0.9913F));

		PartDefinition cube_r411 = rightOrbit.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(81, 78).mirror().addBox(-0.5019F, -1.2146F, -0.5326F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-2.3693F, 0.0222F, 0.0128F, 1.3713F, -0.4273F, -0.0293F));

		PartDefinition cube_r412 = rightOrbit.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(97, 105).mirror().addBox(-0.6075F, -1.0518F, -1.5678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3693F, 0.0222F, 0.0128F, 0.8504F, -0.5182F, -0.1751F));

		PartDefinition cube_r413 = rightOrbit.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(22, 84).mirror().addBox(-0.1752F, -0.4751F, -0.9894F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.4582F, -0.797F, -2.7056F, 0.3694F, 0.2036F, -1.6082F));

		PartDefinition cube_r414 = rightOrbit.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(89, 4).mirror().addBox(-0.5F, -0.9F, -0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2555F, 1.4789F, -2.3412F, -0.3269F, 0.9791F, -1.2937F));

		PartDefinition cube_r415 = rightOrbit.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(46, 96).mirror().addBox(-0.025F, -0.275F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5036F, -0.0331F, -2.9759F, 0.1015F, 0.2088F, -1.0212F));

		PartDefinition cube_r416 = rightOrbit.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(101, 55).mirror().addBox(0.6F, -0.2F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(101, 51).mirror().addBox(0.0F, -0.2F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5036F, -0.0331F, -2.9759F, 0.0126F, 0.2315F, -1.4231F));

		PartDefinition cube_r417 = rightOrbit.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(85, 33).mirror().addBox(-0.3F, -0.5F, -0.575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(85, 13).mirror().addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(-1.7808F, -0.983F, -1.8442F, 0.3665F, -0.1635F, -1.7486F));

		PartDefinition cube_r418 = rightOrbit.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(69, 103).mirror().addBox(-0.4394F, -0.4751F, -0.1639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.4582F, -0.797F, -2.7056F, 0.3665F, 0.1628F, -1.6241F));

		PartDefinition cube_r419 = rightOrbit.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(54, 103).mirror().addBox(-0.4465F, -0.4751F, -0.7964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(-1.4582F, -0.797F, -2.7056F, 0.4908F, 0.7224F, -1.3466F));

		PartDefinition cube_r420 = rightOrbit.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-0.5F, -0.4F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6161F, 1.0866F, -1.5877F, 1.2986F, -0.657F, -0.8974F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5159F, 2.4122F, 1.7136F, 1.5609F, 0.0199F, -0.0031F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(107, 44).mirror().addBox(-0.6834F, 5.2304F, -5.8266F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1318F, 1.5098F, -3.48F, -0.6316F, -0.2661F, 0.0386F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(60, 20).mirror().addBox(0.0906F, 4.3242F, -4.586F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1318F, 1.5098F, -3.48F, -0.6267F, -0.1386F, 0.0083F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(79, 100).mirror().addBox(0.5721F, 4.6936F, -1.3664F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1318F, 1.5098F, -3.48F, -1.3237F, -0.0535F, -0.0114F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(23, 102).mirror().addBox(0.5721F, 0.5946F, -0.5432F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1318F, 1.5098F, -3.48F, -1.411F, -0.0535F, -0.0114F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(84, 105).mirror().addBox(-0.5F, -0.9F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.8527F, 4.6877F, -10.516F, -2.2103F, -0.1079F, 0.5811F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(83, 86).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.5289F, 4.2413F, -10.7525F, -1.1631F, -0.1079F, 0.5811F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(104, 76).mirror().addBox(-1.0836F, 6.3063F, 0.7172F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.1318F, 1.5098F, -3.48F, -1.3218F, -0.2905F, -0.0139F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(44, 101).mirror().addBox(-0.1579F, -2.5193F, -0.1239F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.4363F, 3.005F, -11.6937F, -1.9852F, 0.7679F, 0.0195F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(19, 98).mirror().addBox(-1.0624F, 6.3963F, 0.4391F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.1318F, 1.5098F, -3.48F, -1.4191F, -0.2917F, -0.007F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(105, 85).mirror().addBox(0.6F, -0.875F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-3.6314F, 3.7021F, -8.2251F, -1.2605F, 0.694F, -0.1093F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(26, 95).mirror().addBox(-0.5F, -0.5F, 0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-3.6314F, 3.7021F, -8.2251F, -1.3338F, -0.0229F, -0.3172F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(0.0784F, 3.6027F, -0.0545F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-3.1318F, 1.5098F, -3.48F, -1.3553F, -0.102F, 0.0236F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(66, 47).mirror().addBox(0.0784F, -0.3693F, -0.2206F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.1318F, 1.5098F, -3.48F, -1.3204F, -0.102F, 0.0236F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(106, 50).mirror().addBox(0.0784F, 5.593F, -0.3149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1318F, 1.5098F, -3.48F, -1.3116F, -0.102F, 0.0236F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(97, 46).mirror().addBox(0.0784F, 3.2984F, 1.4064F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.1318F, 1.5098F, -3.48F, -1.4382F, -0.102F, 0.0236F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(65, 84).mirror().addBox(0.0784F, -0.4304F, 1.1495F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.1318F, 1.5098F, -3.48F, -1.364F, -0.102F, 0.0236F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(7, 64).mirror().addBox(-0.5002F, -0.7034F, -2.5213F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.9316F, 2.0362F, -0.701F, -1.7104F, -0.2269F, -0.1222F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(60, 14).mirror().addBox(0.5F, 0.0098F, 0.0397F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.5318F, 1.0098F, -1.38F, -1.8502F, -0.2209F, 0.052F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(44, 76).mirror().addBox(-0.3F, 0.3F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3365F, 3.3932F, -0.5404F, -2.0382F, -0.2755F, 0.4034F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(50, 89).mirror().addBox(-0.4841F, -0.4476F, -0.6596F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7915F, 2.9943F, -0.9575F, -1.2805F, -0.4901F, 0.4498F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(104, 29).mirror().addBox(-0.5002F, -0.9317F, -0.3935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.9316F, 2.0362F, -0.701F, -1.309F, -0.2269F, -0.1222F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(54, 65).mirror().addBox(-0.4841F, -0.8043F, -1.7409F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.7915F, 2.9943F, -0.9575F, -0.338F, -0.4901F, 0.4498F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(51, 85).mirror().addBox(-0.4841F, -0.3466F, -0.7483F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.7915F, 2.9943F, -0.9575F, -0.4689F, -0.4901F, 0.4498F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(29, 98).mirror().addBox(-0.1998F, -1.1761F, -0.32F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.3363F, 3.005F, -11.6937F, -2.3244F, 0.7624F, -0.08F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(5, 102).mirror().addBox(-0.95F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4753F, 3.2258F, -12.5431F, -2.2269F, 0.2123F, -0.0084F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(15, 102).mirror().addBox(-0.575F, -1.2F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-2.6098F, 3.2798F, -12.5513F, -2.3482F, 0.3389F, -0.1333F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(0, 102).mirror().addBox(-0.1998F, -1.1573F, -0.1778F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-3.3363F, 3.005F, -11.6937F, -2.4117F, 0.7624F, -0.08F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(89, 101).mirror().addBox(-0.5042F, -0.8009F, -0.3358F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-3.5831F, 2.3529F, -12.3916F, -2.7071F, 0.8629F, 0.1424F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(97, 38).mirror().addBox(-0.5042F, -1.7401F, -0.5946F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-3.5831F, 2.3529F, -12.3916F, -2.424F, 0.8863F, 0.1019F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(90, 91).mirror().addBox(0.5F, -1.7382F, -2.6077F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.5318F, 1.0098F, -1.38F, 0.1744F, -0.2209F, 0.052F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(61, 75).mirror().addBox(0.5F, 1.0138F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.5318F, 1.0098F, -1.38F, -0.8467F, -0.2209F, 0.052F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(58, 85).mirror().addBox(0.3825F, -0.5766F, -0.7835F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.5318F, 1.0098F, -1.38F, -1.4665F, -0.419F, -0.1372F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(104, 10).mirror().addBox(0.5003F, 1.1827F, -0.8721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.5318F, 1.0098F, -1.38F, -1.8233F, -0.2249F, 0.0484F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(51, 99).mirror().addBox(0.2825F, -0.5319F, -0.4849F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.5318F, 1.0098F, -1.38F, -2.0865F, -0.4304F, 0.054F));

		PartDefinition cube_r455 = jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(107, 44).addBox(0.6834F, 5.2304F, -5.8266F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.5098F, -3.48F, -0.6316F, 0.2661F, -0.0386F));

		PartDefinition cube_r456 = jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(60, 20).addBox(-0.0906F, 4.3242F, -4.586F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.5098F, -3.48F, -0.6267F, 0.1386F, -0.0083F));

		PartDefinition cube_r457 = jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(79, 100).addBox(-0.5721F, 4.6936F, -1.3664F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.5098F, -3.48F, -1.3237F, 0.0535F, 0.0114F));

		PartDefinition cube_r458 = jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(23, 102).addBox(-0.5721F, 0.5946F, -0.5432F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.5098F, -3.48F, -1.411F, 0.0535F, 0.0114F));

		PartDefinition cube_r459 = jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(84, 105).addBox(-0.5F, -0.9F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.1791F, 4.6877F, -10.516F, -2.2103F, 0.1079F, -0.5811F));

		PartDefinition cube_r460 = jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(83, 86).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.5029F, 4.2413F, -10.7525F, -1.1631F, 0.1079F, -0.5811F));

		PartDefinition cube_r461 = jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(104, 76).addBox(0.0836F, 6.3063F, 0.7172F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1F, 1.5098F, -3.48F, -1.3218F, 0.2905F, 0.0139F));

		PartDefinition cube_r462 = jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(10, 74).addBox(-1.187F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.8267F, 3.6803F, -11.6164F, -1.4714F, 0.0F, 0.0F));

		PartDefinition cube_r463 = jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(44, 101).addBox(-0.8421F, -2.5193F, -0.1239F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4045F, 3.005F, -11.6937F, -1.9852F, -0.7679F, -0.0195F));

		PartDefinition cube_r464 = jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(19, 98).addBox(0.0624F, 6.3963F, 0.4391F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1F, 1.5098F, -3.48F, -1.4191F, 0.2917F, 0.007F));

		PartDefinition cube_r465 = jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(105, 85).addBox(-1.6F, -0.875F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5996F, 3.7021F, -8.2251F, -1.2605F, -0.694F, 0.1093F));

		PartDefinition cube_r466 = jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(26, 95).addBox(-1.5F, -0.5F, 0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5996F, 3.7021F, -8.2251F, -1.3338F, 0.0229F, 0.3172F));

		PartDefinition cube_r467 = jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(0, 81).addBox(-1.0784F, 3.6027F, -0.0545F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1F, 1.5098F, -3.48F, -1.3553F, 0.102F, -0.0236F));

		PartDefinition cube_r468 = jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(66, 47).addBox(-1.0784F, -0.3693F, -0.2206F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1F, 1.5098F, -3.48F, -1.3204F, 0.102F, -0.0236F));

		PartDefinition cube_r469 = jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(95, 95).addBox(-1.3689F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.1448F, 4.2132F, -11.042F, -1.975F, 0.0F, 0.0F));

		PartDefinition cube_r470 = jaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(33, 95).addBox(-1.1673F, -0.4841F, -0.3895F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3464F, 3.7696F, -11.6805F, -2.0797F, 0.0F, 0.0F));

		PartDefinition cube_r471 = jaw.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(106, 50).addBox(-1.0784F, 5.593F, -0.3149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.5098F, -3.48F, -1.3116F, 0.102F, -0.0236F));

		PartDefinition cube_r472 = jaw.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(97, 46).addBox(-1.0784F, 3.2984F, 1.4064F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1F, 1.5098F, -3.48F, -1.4382F, 0.102F, -0.0236F));

		PartDefinition cube_r473 = jaw.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(65, 84).addBox(-1.0784F, -0.4304F, 1.1495F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1F, 1.5098F, -3.48F, -1.364F, 0.102F, -0.0236F));

		PartDefinition cube_r474 = jaw.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(7, 64).addBox(-0.4998F, -0.7034F, -2.5213F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8998F, 2.0362F, -0.701F, -1.7104F, 0.2269F, 0.1222F));

		PartDefinition cube_r475 = jaw.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(60, 14).addBox(-1.5F, 0.0098F, 0.0397F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5F, 1.0098F, -1.38F, -1.8502F, 0.2209F, -0.052F));

		PartDefinition cube_r476 = jaw.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(44, 76).addBox(-0.7F, 0.3F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3048F, 3.3932F, -0.5404F, -2.0382F, 0.2755F, -0.4034F));

		PartDefinition cube_r477 = jaw.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(50, 89).addBox(-0.5159F, -0.4476F, -0.6596F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7597F, 2.9943F, -0.9575F, -1.2805F, 0.4901F, -0.4498F));

		PartDefinition cube_r478 = jaw.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(104, 29).addBox(-0.4998F, -0.9317F, -0.3935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8998F, 2.0362F, -0.701F, -1.309F, 0.2269F, 0.1222F));

		PartDefinition cube_r479 = jaw.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(54, 65).addBox(-0.5159F, -0.8043F, -1.7409F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.7597F, 2.9943F, -0.9575F, -0.338F, 0.4901F, -0.4498F));

		PartDefinition cube_r480 = jaw.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(51, 85).addBox(-0.5159F, -0.3466F, -0.7483F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.7597F, 2.9943F, -0.9575F, -0.4689F, 0.4901F, -0.4498F));

		PartDefinition cube_r481 = jaw.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(29, 98).addBox(-0.8002F, -1.1761F, -0.32F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3045F, 3.005F, -11.6937F, -2.3244F, -0.7624F, 0.08F));

		PartDefinition cube_r482 = jaw.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(5, 102).addBox(-0.05F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5565F, 3.2258F, -12.5431F, -2.2269F, -0.2123F, 0.0084F));

		PartDefinition cube_r483 = jaw.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(15, 102).addBox(-0.425F, -1.2F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.4221F, 3.2798F, -12.5513F, -2.3482F, -0.3389F, 0.1333F));

		PartDefinition cube_r484 = jaw.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(0, 102).addBox(-0.8002F, -1.1573F, -0.1778F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.3045F, 3.005F, -11.6937F, -2.4117F, -0.7624F, 0.08F));

		PartDefinition cube_r485 = jaw.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(89, 101).addBox(-0.4958F, -0.8009F, -0.3358F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.5513F, 2.3529F, -12.3916F, -2.7071F, -0.8629F, -0.1424F));

		PartDefinition cube_r486 = jaw.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(97, 38).addBox(-0.4958F, -1.7401F, -0.5946F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5513F, 2.3529F, -12.3916F, -2.424F, -0.8863F, -0.1019F));

		PartDefinition cube_r487 = jaw.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(90, 91).addBox(-1.5F, -1.7382F, -2.6077F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, 1.0098F, -1.38F, 0.1744F, 0.2209F, -0.052F));

		PartDefinition cube_r488 = jaw.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(61, 75).addBox(-1.5F, 1.0138F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.5F, 1.0098F, -1.38F, -0.8467F, 0.2209F, -0.052F));

		PartDefinition cube_r489 = jaw.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(58, 85).addBox(-1.3825F, -0.5766F, -0.7835F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, 1.0098F, -1.38F, -1.4665F, 0.419F, 0.1372F));

		PartDefinition cube_r490 = jaw.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(104, 10).addBox(-1.5003F, 1.1827F, -0.8721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, 1.0098F, -1.38F, -1.8233F, 0.2249F, -0.0484F));

		PartDefinition cube_r491 = jaw.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(51, 99).addBox(-1.2825F, -0.5319F, -0.4849F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, 1.0098F, -1.38F, -2.0865F, 0.4304F, -0.054F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(84, 54).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(15, 99).addBox(0.0F, -0.8F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9009F, 0.94F, -0.4276F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(7, 86).addBox(-0.5F, -0.4886F, 0.0422F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(107, 38).addBox(0.0F, -0.9886F, 1.0422F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2841F, 1.8804F, 0.0903F, 0.0106F, 0.0118F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(69, 14).addBox(-0.5F, -0.5058F, -0.3243F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(107, 41).addBox(0.0F, -0.8058F, 0.6757F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0423F, 2.1244F, -0.3381F, 0.1525F, -0.0853F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(66, 25).addBox(-0.5F, -0.1162F, -0.0685F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.3199F, 2.6593F, -0.3289F, 0.1567F, -0.0771F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(43, 32).addBox(-0.5F, -0.2162F, -0.0685F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0964F, 2.9104F, -0.2256F, -0.2555F, 0.0579F));

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