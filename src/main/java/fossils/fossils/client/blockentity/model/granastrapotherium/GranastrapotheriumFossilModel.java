package fossils.fossils.client.blockentity.model.granastrapotherium;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GranastrapotheriumFossilModel extends SkullModelBase {
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
	private final ModelPart bone4;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart body5;
	private final ModelPart body6;
	private final ModelPart body7;
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
	private final ModelPart bone3;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
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
	private final ModelPart tail6;

	public GranastrapotheriumFossilModel(ModelPart root) {
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
		this.bone4 = this.hips.getChild("bone4");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body3 = this.body.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.body5 = this.body4.getChild("body5");
		this.body6 = this.body5.getChild("body6");
		this.body7 = this.body6.getChild("body7");
		this.chest = this.body7.getChild("chest");
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
		this.bone3 = this.neck2.getChild("bone3");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.head = this.neck5.getChild("head");
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
		this.tail6 = this.tail5.getChild("tail6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -31.5442F, 19.0612F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(61, 37).addBox(0.0F, -1.0986F, 0.0389F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(25, 11).mirror().addBox(-1.6F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.6447F, -1.3812F, -0.3819F, 0.1253F, 0.1768F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(106, 10).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.5057F, -3.1864F, -0.4336F, -0.1433F, -0.2225F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(25, 11).addBox(-0.4F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6447F, -1.3812F, -0.3819F, -0.1253F, -0.1768F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(106, 10).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.5057F, -3.1864F, -0.4336F, 0.1433F, 0.2225F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(32, 18).addBox(-0.5F, -0.0986F, -0.9611F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 5.9349F, 1.0563F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r7 = leftLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(9, 76).addBox(-1.0F, -1.4F, -1.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(76, 7).addBox(-1.0F, -1.0F, -1.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.081F, -1.1742F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r8 = leftLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(64, 54).addBox(-1.0F, -0.7F, -1.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 0.3318F, 0.0001F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r9 = leftLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(102, 83).addBox(0.5F, 0.0347F, -0.9869F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.4365F, 0.2629F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r10 = leftLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(37, 104).addBox(-0.5F, -3.0F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.1182F, -1.0942F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r11 = leftLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(102, 74).addBox(-0.5F, -2.7F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.2628F, 0.3126F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r12 = leftLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(110, 93).addBox(4.4F, 3.3F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.9F, 10.6517F, -2.8097F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r13 = leftLeg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(60, 72).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.3573F, -4.4287F, -1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r14 = leftLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(69, 74).addBox(-1.0F, -0.2F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 11.5435F, -3.8719F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r15 = leftLeg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(67, 8).addBox(-1.0F, -1.0317F, -1.4745F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 11.5586F, -3.3965F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r16 = leftLeg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(85, 6).addBox(0.0F, -0.8239F, -0.4399F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 11.5586F, -3.3965F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r17 = leftLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(32, 70).addBox(-0.5F, -6.0F, -0.1F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.007F, 5.9564F, -1.7987F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r18 = leftLeg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(5, 84).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.007F, 5.9564F, -1.7987F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r19 = leftLeg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(62, 85).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.007F, 6.389F, -0.4672F, -0.3142F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.7753F, -4.5373F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r20 = leftLeg2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(46, 98).addBox(-1.0F, -0.1F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1023F, 0.2332F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r21 = leftLeg2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(92, 6).addBox(-1.0F, -1.0F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 1.0255F, 0.7001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r22 = leftLeg2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(86, 17).addBox(-1.0F, -0.875F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 1.4271F, 0.2014F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r23 = leftLeg2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(10, 84).addBox(-1.5F, -5.2F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.7021F, -0.2306F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r24 = leftLeg2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(85, 72).addBox(-1.5F, -0.5F, -0.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0F, 1.7023F, -0.1869F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r25 = leftLeg2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(53, 98).addBox(-1.5F, -5.0139F, -0.1398F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1F, 5.4657F, 0.391F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r26 = leftLeg2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(32, 102).addBox(-1.5F, -2.3748F, -0.3658F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.1F, 5.4657F, 0.391F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r27 = leftLeg2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(20, 87).addBox(-0.5F, -2.15F, -0.55F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 7.9945F, -0.1342F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r28 = leftLeg2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(86, 89).addBox(-1.5F, 1.1869F, -0.7332F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, 5.0131F, 0.0596F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 10.8071F, -0.8581F, -1.7977F, 0.0F, 0.0F));

		PartDefinition cube_r29 = leftLeg3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(51, 106).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.3F, -0.7065F, 1.0594F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r30 = leftLeg3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(110, 40).addBox(-1.0F, -1.7F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(10, 110).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.3F, -1.7753F, 1.3875F, 1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r31 = leftLeg3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(57, 43).addBox(-1.3F, -1.0F, -0.4F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.3295F, 0.122F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r32 = leftLeg3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(57, 81).addBox(-1.5F, -1.0F, -0.6F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3F, 3.0473F, 0.9234F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r33 = leftLeg3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(16, 64).addBox(-1.0F, -2.2F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-0.8F, 1.6246F, 1.0716F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 3.6864F, 0.2102F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r34 = leftLeg4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(107, 0).addBox(-0.5F, -1.4F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(1.6782F, 0.5557F, 0.3922F, -0.2809F, -0.2065F, -0.4096F));

		PartDefinition cube_r35 = leftLeg4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(23, 75).addBox(-2.6391F, -0.9148F, 0.1596F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(1.1391F, 0.0553F, -0.2739F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 5.9349F, 1.0563F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r36 = rightLeg.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(51, 77).addBox(-1.0F, -1.4F, -1.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(76, 58).addBox(-1.0F, -1.0F, -1.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.081F, -1.1742F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r37 = rightLeg.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(25, 65).addBox(-1.0F, -0.7F, -1.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 0.3318F, 0.0001F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r38 = rightLeg.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(97, 104).addBox(-1.5F, 0.0347F, -0.9869F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.4365F, 0.2629F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r39 = rightLeg.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(92, 104).addBox(-0.5F, -3.0F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.1182F, -1.0942F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r40 = rightLeg.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(87, 104).addBox(-0.5F, -2.7F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.2628F, 0.3126F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r41 = rightLeg.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(112, 18).addBox(-5.4F, 3.3F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.9F, 10.6517F, -2.8097F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r42 = rightLeg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(73, 2).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.3573F, -4.4287F, -1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r43 = rightLeg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 75).addBox(-1.0F, -0.2F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 11.5435F, -3.8719F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r44 = rightLeg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(52, 67).addBox(-1.0F, -1.0317F, -1.4745F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 11.5586F, -3.3965F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r45 = rightLeg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(88, 25).addBox(-1.0F, -0.8239F, -0.4399F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 11.5586F, -3.3965F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r46 = rightLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(37, 70).addBox(-0.5F, -6.0F, -0.1F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.007F, 5.9564F, -1.7987F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r47 = rightLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(15, 84).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.007F, 5.9564F, -1.7987F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r48 = rightLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 88).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.007F, 6.389F, -0.4672F, -0.3142F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.7753F, -4.5373F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r49 = rightLeg2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(98, 46).addBox(0.0F, -0.1F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1023F, 0.2332F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r50 = rightLeg2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(65, 97).addBox(0.0F, -1.0F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 1.0255F, 0.7001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r51 = rightLeg2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(88, 61).addBox(0.0F, -0.875F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 1.4271F, 0.2014F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r52 = rightLeg2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(84, 39).addBox(0.5F, -5.2F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.7021F, -0.2306F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r53 = rightLeg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(89, 35).addBox(0.5F, -0.5F, -0.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0F, 1.7023F, -0.1869F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r54 = rightLeg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(27, 100).addBox(0.5F, -5.0139F, -0.1398F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.1F, 5.4657F, 0.391F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r55 = rightLeg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(46, 102).addBox(0.5F, -2.3748F, -0.3658F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-1.1F, 5.4657F, 0.391F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r56 = rightLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(32, 89).addBox(-0.5F, -2.15F, -0.55F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 7.9945F, -0.1342F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r57 = rightLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(90, 72).addBox(0.5F, 1.1869F, -0.7332F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 5.0131F, 0.0596F, -0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 10.8071F, -0.8581F, -1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r58 = rightLeg3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(63, 106).addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.3F, -0.7065F, 1.0594F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r59 = rightLeg3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(110, 49).addBox(0.0F, -1.7F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(40, 110).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.3F, -1.7753F, 1.3875F, 1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightLeg3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(58, 61).addBox(-1.7F, -1.0F, -0.4F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -0.3295F, 0.122F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(81, 80).addBox(-1.5F, -1.0F, -0.6F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, 3.0473F, 0.9234F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(64, 49).addBox(-2.0F, -2.2F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.8F, 1.6246F, 1.0716F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offset(0.3F, 3.6864F, 0.2102F));

		PartDefinition cube_r63 = rightLeg4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(108, 28).addBox(-0.5F, -1.4F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-1.6782F, 0.5557F, 0.3922F, -0.2809F, 0.2065F, 0.4096F));

		PartDefinition cube_r64 = rightLeg4.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(42, 75).addBox(-0.3609F, -0.9148F, 0.1596F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-1.1391F, 0.0553F, -0.2739F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9869F, 5.0964F, 1.4304F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r65 = bone.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(86, 66).addBox(-1.5F, -0.5F, -0.35F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4879F, 1.3972F, 1.2753F, -0.3252F, -0.5327F, -0.0126F));

		PartDefinition cube_r66 = bone.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(86, 22).addBox(-1.5585F, -0.35F, -0.5403F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6296F, 0.6803F, -0.62F, -0.568F, 0.0194F, -0.2887F));

		PartDefinition cube_r67 = bone.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(70, 23).addBox(0.1694F, -0.6208F, -2.9873F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F))
				.texOffs(56, 10).addBox(1.0694F, -0.6208F, -3.9873F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0268F, -1.5948F, -0.1618F, 0.0595F, 0.5661F, 1.8367F));

		PartDefinition cube_r68 = bone.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(32, 11).addBox(0.1694F, -0.3985F, -5.0014F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(67, 59).addBox(1.0694F, -0.3985F, -3.0014F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F))
				.texOffs(68, 60).addBox(1.0694F, -0.3985F, -5.0014F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0268F, -1.5948F, -0.1618F, 0.1817F, 0.5661F, 1.8367F));

		PartDefinition cube_r69 = bone.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(67, 13).addBox(0.5779F, -0.6023F, -0.5108F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0268F, -1.8948F, -2.3618F, -1.5499F, 0.8759F, -1.2514F));

		PartDefinition cube_r70 = bone.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(11, 35).addBox(-0.2046F, -1.2044F, 0.805F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4981F, -1.6231F, -5.5253F, -2.0498F, 0.2971F, -1.6743F));

		PartDefinition cube_r71 = bone.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(24, 35).addBox(1.3204F, -1.2044F, 0.43F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.4981F, -1.6231F, -5.5253F, -1.995F, 0.3735F, -1.508F));

		PartDefinition cube_r72 = bone.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(109, 63).addBox(1.6777F, -0.5457F, -1.0808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.0215F, -6.1568F, -7.6679F, -1.0279F, -0.1337F, 1.1715F));

		PartDefinition cube_r73 = bone.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(30, 25).addBox(-0.3565F, -0.5457F, -1.9635F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0215F, -6.1568F, -7.6679F, -1.4853F, -0.5516F, 2.3626F));

		PartDefinition cube_r74 = bone.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(51, 72).addBox(-1.0F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.0215F, -6.1568F, -7.6679F, -2.0745F, -0.2502F, -2.6099F));

		PartDefinition cube_r75 = bone.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(0, 21).addBox(-1.5107F, -1.2754F, -0.2891F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.4981F, -1.6231F, -5.5253F, -1.7895F, -0.6394F, 3.1217F));

		PartDefinition cube_r76 = bone.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(15, 22).addBox(-0.3963F, -1.2754F, 1.5435F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.4981F, -1.6231F, -5.5253F, -2.125F, -0.3995F, -2.5083F));

		PartDefinition cube_r77 = bone.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(34, 4).addBox(1.9846F, -0.9106F, -1.4459F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4731F, -1.5231F, -5.2253F, -2.5954F, -0.3864F, -2.104F));

		PartDefinition cube_r78 = bone.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(56, 19).addBox(-2.0F, -0.5F, -1.025F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5371F, -5.4079F, -4.7266F, -2.5005F, 0.0801F, -1.798F));

		PartDefinition cube_r79 = bone.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(22, 41).addBox(1.77F, -1.2754F, 0.0789F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4981F, -1.6231F, -5.5253F, -2.2386F, 0.0679F, -1.8615F));

		PartDefinition cube_r80 = bone.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(85, 58).addBox(-1.5F, -0.325F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9459F, 0.7037F, 0.4846F, 2.8537F, 1.1551F, -1.7054F));

		PartDefinition cube_r81 = bone.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(79, 35).addBox(0.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.283F, -0.2123F, 3.6027F, 0.4532F, 0.5372F, 2.2806F));

		PartDefinition cube_r82 = bone.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(32, 79).addBox(0.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2955F, 1.5051F, 3.328F, 1.9209F, 1.1588F, -2.2969F));

		PartDefinition cube_r83 = bone.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(103, 50).addBox(-1.1015F, -0.5F, -0.8446F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8404F, 1.2481F, 2.0421F, 2.5639F, 0.8108F, -1.5467F));

		PartDefinition cube_r84 = bone.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(60, 77).addBox(-1.0998F, -0.5F, -2.0481F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6336F, 1.1979F, 1.5084F, 0.6826F, 0.9873F, 2.6985F));

		PartDefinition cube_r85 = bone.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(103, 41).addBox(-0.925F, -0.5F, -0.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7992F, 1.2905F, 1.9985F, 2.011F, 1.1419F, -2.1982F));

		PartDefinition cube_r86 = bone.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(104, 13).addBox(-0.9F, 1.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.8969F, -0.4689F, 0.2364F, -1.6036F, 0.2766F, -1.3532F));

		PartDefinition cube_r87 = bone.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(25, 92).addBox(-0.9F, -0.3F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8969F, -0.4689F, 0.2364F, -1.611F, 0.669F, -1.3692F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9869F, 5.0964F, 1.4304F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r88 = bone4.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(86, 66).mirror().addBox(-1.5F, -0.5F, -0.35F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.4879F, 1.3972F, 1.2753F, -0.3252F, 0.5327F, 0.0126F));

		PartDefinition cube_r89 = bone4.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(86, 22).mirror().addBox(-1.4415F, -0.35F, -0.5403F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6296F, 0.6803F, -0.62F, -0.568F, -0.0194F, 0.2887F));

		PartDefinition cube_r90 = bone4.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(70, 23).mirror().addBox(-1.1694F, -0.6208F, -2.9873F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(56, 10).mirror().addBox(-2.0694F, -0.6208F, -3.9873F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0268F, -1.5948F, -0.1618F, 0.0595F, -0.5661F, -1.8367F));

		PartDefinition cube_r91 = bone4.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(32, 11).mirror().addBox(-1.1694F, -0.3985F, -5.0014F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(67, 59).mirror().addBox(-2.0694F, -0.3985F, -3.0014F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(68, 60).mirror().addBox(-2.0694F, -0.3985F, -5.0014F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0268F, -1.5948F, -0.1618F, 0.1817F, -0.5661F, -1.8367F));

		PartDefinition cube_r92 = bone4.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(67, 13).mirror().addBox(-4.5779F, -0.6023F, -0.5108F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.0268F, -1.8948F, -2.3618F, -1.5499F, -0.8759F, 1.2514F));

		PartDefinition cube_r93 = bone4.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(11, 35).mirror().addBox(-1.7954F, -1.2044F, 0.805F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4981F, -1.6231F, -5.5253F, -2.0498F, -0.2971F, 1.6743F));

		PartDefinition cube_r94 = bone4.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(24, 35).mirror().addBox(-3.3204F, -1.2044F, 0.43F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4981F, -1.6231F, -5.5253F, -1.995F, -0.3735F, 1.508F));

		PartDefinition cube_r95 = bone4.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(109, 63).mirror().addBox(-2.6777F, -0.5457F, -1.0808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.0215F, -6.1568F, -7.6679F, -1.0279F, 0.1337F, -1.1715F));

		PartDefinition cube_r96 = bone4.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(30, 25).mirror().addBox(-1.6435F, -0.5457F, -1.9635F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0215F, -6.1568F, -7.6679F, -1.4853F, 0.5516F, -2.3626F));

		PartDefinition cube_r97 = bone4.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(51, 72).mirror().addBox(0.0F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.0215F, -6.1568F, -7.6679F, -2.0745F, 0.2502F, 2.6099F));

		PartDefinition cube_r98 = bone4.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 21).mirror().addBox(-1.4893F, -1.2754F, -0.2891F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.4981F, -1.6231F, -5.5253F, -1.7895F, 0.6394F, -3.1217F));

		PartDefinition cube_r99 = bone4.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(15, 22).mirror().addBox(-2.6037F, -1.2754F, 1.5435F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4981F, -1.6231F, -5.5253F, -2.125F, 0.3995F, 2.5083F));

		PartDefinition cube_r100 = bone4.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(34, 4).mirror().addBox(-5.9846F, -0.9106F, -1.4459F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4731F, -1.5231F, -5.2253F, -2.5954F, 0.3864F, 2.104F));

		PartDefinition cube_r101 = bone4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(56, 19).mirror().addBox(-2.0F, -0.5F, -1.025F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5371F, -5.4079F, -4.7266F, -2.5005F, -0.0801F, 1.798F));

		PartDefinition cube_r102 = bone4.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(22, 41).mirror().addBox(-5.77F, -1.2754F, 0.0789F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4981F, -1.6231F, -5.5253F, -2.2386F, -0.0679F, 1.8615F));

		PartDefinition cube_r103 = bone4.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(85, 58).mirror().addBox(-1.5F, -0.325F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9459F, 0.7037F, 0.4846F, 2.8537F, -1.1551F, 1.7054F));

		PartDefinition cube_r104 = bone4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(79, 35).mirror().addBox(-2.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.283F, -0.2123F, 3.6027F, 0.4532F, -0.5372F, -2.2806F));

		PartDefinition cube_r105 = bone4.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(32, 79).mirror().addBox(-2.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.2955F, 1.5051F, 3.328F, 1.9209F, -1.1588F, 2.2969F));

		PartDefinition cube_r106 = bone4.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(103, 50).mirror().addBox(-0.8985F, -0.5F, -0.8446F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8404F, 1.2481F, 2.0421F, 2.5639F, -0.8108F, 1.5467F));

		PartDefinition cube_r107 = bone4.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(60, 77).mirror().addBox(-0.9002F, -0.5F, -2.0481F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6336F, 1.1979F, 1.5084F, 0.6826F, -0.9873F, -2.6985F));

		PartDefinition cube_r108 = bone4.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(103, 41).mirror().addBox(-1.075F, -0.5F, -0.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7992F, 1.2905F, 1.9985F, 2.011F, -1.1419F, 2.1982F));

		PartDefinition cube_r109 = bone4.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(104, 13).mirror().addBox(-1.1F, 1.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8969F, -0.4689F, 0.2364F, -1.6036F, -0.2766F, 1.3532F));

		PartDefinition cube_r110 = bone4.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(25, 92).mirror().addBox(-1.1F, -0.3F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8969F, -0.4689F, 0.2364F, -1.611F, -0.669F, 1.3692F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.3096F, -4.4992F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r111 = body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(18, 48).addBox(0.0F, -0.9354F, -0.1789F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4648F, -0.6548F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r112 = body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(66, 81).addBox(0.0F, -1.1589F, 0.0958F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.347F, -4.8381F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(14, 80).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8171F, -2.8061F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(52, 65).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8375F, -0.7612F, -4.302F, -0.2521F, 0.0151F, -0.3147F));

		PartDefinition cube_r115 = body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(36, 55).mirror().addBox(-1.8F, 0.0F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5152F, 0.0256F, -0.6004F, -0.2439F, 0.1211F, -0.2514F));

		PartDefinition cube_r116 = body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(56, 23).mirror().addBox(-0.9F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5076F, -0.3722F, -2.4718F, -0.2533F, 0.0996F, -0.3365F));

		PartDefinition cube_r117 = body2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(36, 55).addBox(-0.2F, 0.0F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5152F, 0.0256F, -0.6004F, -0.2439F, -0.1211F, 0.2514F));

		PartDefinition cube_r118 = body2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(52, 65).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8375F, -0.7612F, -4.302F, -0.2521F, -0.0151F, 0.3147F));

		PartDefinition cube_r119 = body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(56, 23).addBox(-0.1F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5076F, -0.3722F, -2.4718F, -0.2533F, -0.0996F, 0.3365F));

		PartDefinition cube_r120 = body2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(24, 28).addBox(-0.5F, -0.1513F, 8.7474F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0337F, -13.316F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9395F, -4.5739F, -0.2552F, -0.1267F, 0.033F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(29, 51).addBox(0.0F, -1.3408F, 0.0224F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.004F, -2.157F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(5, 114).addBox(0.0F, -1.1594F, -0.0812F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.004F, -4.057F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(105, 47).mirror().addBox(-1.736F, 0.1116F, -0.4114F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2369F, -1.6803F, -0.2482F, 0.2181F, -0.448F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(92, 32).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.567F, -3.6528F, -0.354F, 0.3621F, -0.7317F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(13, 62).mirror().addBox(-6.1255F, -3.0192F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.567F, -3.6528F, -0.4951F, 0.0797F, -1.3496F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(92, 30).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.567F, -3.6528F, -0.4324F, 0.2613F, -0.9857F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(105, 47).addBox(-0.264F, 0.1116F, -0.4114F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2369F, -1.6803F, -0.2482F, -0.2181F, 0.448F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(92, 32).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.567F, -3.6528F, -0.354F, -0.3621F, 0.7317F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(13, 62).addBox(5.1255F, -3.0192F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.567F, -3.6528F, -0.4951F, -0.0797F, 1.3496F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(92, 30).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.567F, -3.6528F, -0.4324F, -0.2613F, 0.9857F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(11, 28).addBox(-0.5F, -1.0F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.7F, -1.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6019F, -4.966F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r132 = body3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(22, 45).addBox(-0.5F, 0.0148F, -4.0846F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r133 = body3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(72, 35).mirror().addBox(-7.1255F, -3.0192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1651F, -0.4868F, -0.4678F, 0.1988F, -1.3458F));

		PartDefinition cube_r134 = body3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(64, 92).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1651F, -0.4868F, -0.3604F, 0.3624F, -0.9636F));

		PartDefinition cube_r135 = body3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(55, 92).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1651F, -0.4868F, -0.2535F, 0.442F, -0.6923F));

		PartDefinition cube_r136 = body3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(91, 89).mirror().addBox(-8.1256F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7651F, -2.2868F, -0.4557F, 0.2499F, -1.3431F));

		PartDefinition cube_r137 = body3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(46, 92).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7651F, -2.2868F, -0.3279F, 0.4052F, -0.9514F));

		PartDefinition cube_r138 = body3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(37, 92).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7651F, -2.2868F, -0.2082F, 0.4751F, -0.6722F));

		PartDefinition cube_r139 = body3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(72, 35).addBox(5.1255F, -3.0192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1651F, -0.4868F, -0.4678F, -0.1988F, 1.3458F));

		PartDefinition cube_r140 = body3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(64, 92).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1651F, -0.4868F, -0.3604F, -0.3624F, 0.9636F));

		PartDefinition cube_r141 = body3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(55, 92).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1651F, -0.4868F, -0.2535F, -0.442F, 0.6923F));

		PartDefinition cube_r142 = body3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(91, 89).addBox(5.1255F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7651F, -2.2868F, -0.4557F, -0.2499F, 1.3431F));

		PartDefinition cube_r143 = body3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(46, 92).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7651F, -2.2868F, -0.3279F, -0.4052F, 0.9514F));

		PartDefinition cube_r144 = body3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(37, 92).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7651F, -2.2868F, -0.2082F, -0.4751F, 0.6722F));

		PartDefinition cube_r145 = body3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(61, 113).addBox(0.0F, -1.2611F, -0.1182F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.196F, -0.857F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r146 = body3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(58, 113).addBox(0.0F, -1.2088F, 0.0394F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.304F, -2.957F, 0.1134F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(46, 43).addBox(-0.5F, -0.4312F, -3.9471F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9506F, -3.8712F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r147 = body4.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(64, 113).addBox(0.0F, -1.2745F, 0.0098F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4312F, -0.9471F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r148 = body4.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(70, 113).addBox(0.0F, -1.6501F, 0.0278F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4312F, -2.9471F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r149 = body4.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(93, 83).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4155F, -0.4086F, 0.315F, -0.7498F));

		PartDefinition cube_r150 = body4.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(93, 19).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4155F, -0.4717F, 0.2029F, -0.9948F));

		PartDefinition cube_r151 = body4.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(74, 0).mirror().addBox(-9.1256F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4155F, -0.5104F, 0.0116F, -1.3503F));

		PartDefinition cube_r152 = body4.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(93, 17).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4155F, -0.354F, 0.3621F, -0.7317F));

		PartDefinition cube_r153 = body4.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(91, 91).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4155F, -0.4324F, 0.2613F, -0.9857F));

		PartDefinition cube_r154 = body4.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(60, 16).mirror().addBox(-10.1256F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4155F, -0.4951F, 0.0797F, -1.3496F));

		PartDefinition cube_r155 = body4.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(93, 83).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4155F, -0.4086F, -0.315F, 0.7498F));

		PartDefinition cube_r156 = body4.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(93, 19).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4155F, -0.4717F, -0.2029F, 0.9948F));

		PartDefinition cube_r157 = body4.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(74, 0).addBox(5.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4155F, -0.5104F, -0.0116F, 1.3503F));

		PartDefinition cube_r158 = body4.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(93, 17).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4155F, -0.354F, -0.3621F, 0.7317F));

		PartDefinition cube_r159 = body4.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(91, 91).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4155F, -0.4324F, -0.2613F, 0.9857F));

		PartDefinition cube_r160 = body4.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(60, 16).addBox(5.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4155F, -0.4951F, -0.0797F, 1.3496F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(50, 25).addBox(-0.5F, -0.4312F, -3.9471F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.1275F, -0.0922F, 0.032F));

		PartDefinition cube_r161 = body5.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(67, 113).addBox(0.0F, -1.6745F, 0.0098F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4312F, -0.9471F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r162 = body5.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(73, 113).addBox(0.0F, -2.0501F, 0.0278F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4312F, -2.9471F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r163 = body5.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(95, 23).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4156F, -0.4353F, 0.2911F, -0.7578F));

		PartDefinition cube_r164 = body5.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(95, 21).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4156F, -0.491F, 0.1736F, -0.9984F));

		PartDefinition cube_r165 = body5.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(51, 8).mirror().addBox(-11.1256F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4156F, -0.518F, -0.0225F, -1.3502F));

		PartDefinition cube_r166 = body5.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(58, 94).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4156F, -0.4353F, 0.2911F, -0.7578F));

		PartDefinition cube_r167 = body5.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(94, 0).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4156F, -0.491F, 0.1736F, -0.9984F));

		PartDefinition cube_r168 = body5.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(46, 0).mirror().addBox(-11.1256F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4156F, -0.518F, -0.0225F, -1.3502F));

		PartDefinition cube_r169 = body5.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(95, 23).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4156F, -0.4353F, -0.2911F, 0.7578F));

		PartDefinition cube_r170 = body5.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(95, 21).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4156F, -0.491F, -0.1736F, 0.9984F));

		PartDefinition cube_r171 = body5.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(51, 8).addBox(5.1255F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4156F, -0.518F, 0.0225F, 1.3502F));

		PartDefinition cube_r172 = body5.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(58, 94).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4156F, -0.4353F, -0.2911F, 0.7578F));

		PartDefinition cube_r173 = body5.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(94, 0).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4156F, -0.491F, -0.1736F, 0.9984F));

		PartDefinition cube_r174 = body5.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(46, 0).addBox(5.1255F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4156F, -0.518F, 0.0225F, 1.3502F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(50, 37).addBox(-0.5F, -0.4312F, -3.9471F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.1314F, -0.0865F, -0.0114F));

		PartDefinition cube_r175 = body6.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(45, 111).addBox(0.0F, -2.2745F, 0.0098F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4312F, -0.9471F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r176 = body6.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(112, 105).addBox(0.0F, -2.6501F, 0.0278F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4312F, -2.9471F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r177 = body6.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(95, 63).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4156F, -0.5259F, 0.2061F, -0.7801F));

		PartDefinition cube_r178 = body6.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(95, 61).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4156F, -0.5573F, 0.0706F, -1.0065F));

		PartDefinition cube_r179 = body6.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(37, 31).mirror().addBox(-12.1256F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4156F, -0.5449F, -0.1417F, -1.348F));

		PartDefinition cube_r180 = body6.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(95, 27).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4155F, -0.5385F, 0.1938F, -0.7826F));

		PartDefinition cube_r181 = body6.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(95, 25).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4155F, -0.5666F, 0.0558F, -1.007F));

		PartDefinition cube_r182 = body6.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(34, 9).mirror().addBox(-12.1256F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4155F, -0.5488F, -0.1587F, -1.3474F));

		PartDefinition cube_r183 = body6.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(95, 63).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4156F, -0.5259F, -0.2061F, 0.7801F));

		PartDefinition cube_r184 = body6.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(95, 61).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4156F, -0.5573F, -0.0706F, 1.0065F));

		PartDefinition cube_r185 = body6.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(37, 31).addBox(5.1255F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4156F, -0.5449F, 0.1417F, 1.348F));

		PartDefinition cube_r186 = body6.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(95, 27).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4155F, -0.5385F, -0.1938F, 0.7826F));

		PartDefinition cube_r187 = body6.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(95, 25).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4155F, -0.5666F, -0.0558F, 1.007F));

		PartDefinition cube_r188 = body6.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(34, 9).addBox(5.1255F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4155F, -0.5488F, 0.1587F, 1.3474F));

		PartDefinition body7 = body6.addOrReplaceChild("body7", CubeListBuilder.create().texOffs(18, 51).addBox(-0.5F, -0.4312F, -3.9471F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.044F, -0.1308F, -0.0057F));

		PartDefinition cube_r189 = body7.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(15, 112).addBox(0.0F, -2.6745F, 0.0098F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4312F, -0.9471F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r190 = body7.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(106, 112).addBox(0.0F, -3.0501F, 0.0278F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4312F, -2.9471F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r191 = body7.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(95, 69).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4155F, -0.5885F, 0.1444F, -0.791F));

		PartDefinition cube_r192 = body7.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(95, 67).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4155F, -0.6039F, -0.0032F, -1.008F));

		PartDefinition cube_r193 = body7.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(37, 35).mirror().addBox(-12.1256F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4155F, -0.5647F, -0.2268F, -1.3444F));

		PartDefinition cube_r194 = body7.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(67, 95).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4155F, -0.6009F, 0.1319F, -0.7927F));

		PartDefinition cube_r195 = body7.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(95, 65).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4155F, -0.6132F, -0.018F, -1.0079F));

		PartDefinition cube_r196 = body7.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(37, 33).mirror().addBox(-12.1256F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4155F, -0.5687F, -0.2438F, -1.3435F));

		PartDefinition cube_r197 = body7.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(95, 69).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4155F, -0.5885F, -0.1444F, 0.791F));

		PartDefinition cube_r198 = body7.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(95, 67).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4155F, -0.6039F, 0.0032F, 1.008F));

		PartDefinition cube_r199 = body7.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(37, 35).addBox(5.1255F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4155F, -0.5647F, 0.2268F, 1.3444F));

		PartDefinition cube_r200 = body7.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(67, 95).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4155F, -0.6009F, -0.1319F, 0.7927F));

		PartDefinition cube_r201 = body7.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(95, 65).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4155F, -0.6132F, 0.018F, 1.0079F));

		PartDefinition cube_r202 = body7.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(37, 33).addBox(5.1255F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4155F, -0.5687F, 0.2438F, 1.3435F));

		PartDefinition chest = body7.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0536F, -3.8395F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(42, 104).addBox(0.0F, -3.6226F, -0.0168F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2508F, -1.0096F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(12, 104).addBox(0.0F, -4.1222F, -0.0133F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6508F, -2.9096F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-12.7743F, 1.027F, -1.5689F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.345F, 12.1034F, 2.6694F, 0.2655F, 1.1355F, 0.9228F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(90, 11).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9611F, -2.3337F, -0.4875F, 0.2428F, -0.7716F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(85, 0).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9611F, -2.3337F, -0.5291F, 0.1148F, -1.0038F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(72, 33).mirror().addBox(-9.1256F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9611F, -2.3337F, -0.5333F, -0.0906F, -1.3494F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(91, 4).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2611F, -0.3337F, -0.4485F, 0.2791F, -0.7615F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(91, 2).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2611F, -0.3337F, -0.5006F, 0.1589F, -1.0F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(45, 17).mirror().addBox(-11.1256F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2611F, -0.3337F, -0.5218F, -0.0395F, -1.3501F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(55, 2).mirror().addBox(-4.9F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.001F, 12.2102F, -0.4065F, -0.0269F, 0.2836F, 0.3738F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(61, 0).mirror().addBox(-4.9F, 0.0F, -1.0F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0405F, 12.2956F, 1.8814F, 0.0566F, 0.3562F, 0.3204F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(75, 46).mirror().addBox(-4.3F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8916F, 9.4049F, -4.2547F, -0.3709F, 0.3187F, 0.4227F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-4.5F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9306F, 11.2225F, -2.2082F, -0.2089F, 0.1521F, 0.4775F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(40, 2).mirror().addBox(-5.3F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5052F, 12.1315F, 2.509F, -0.0379F, 0.5379F, 0.4032F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(29, 0).mirror().addBox(-6.7F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4723F, 12.0919F, 2.6986F, -0.0522F, 0.7808F, 0.4884F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(-9.3385F, 0.9624F, -1.6075F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.345F, 12.1034F, 2.6694F, 0.0561F, 1.0075F, 0.6531F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-10.8721F, 1.0318F, -1.5804F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.345F, 12.1034F, 2.6694F, 0.2028F, 1.062F, 0.8549F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(90, 11).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9611F, -2.3337F, -0.4875F, -0.2428F, 0.7716F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(85, 0).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9611F, -2.3337F, -0.5291F, -0.1148F, 1.0038F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(72, 33).addBox(5.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9611F, -2.3337F, -0.5333F, 0.0906F, 1.3494F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(91, 4).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2611F, -0.3337F, -0.4485F, -0.2791F, 0.7615F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(91, 2).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2611F, -0.3337F, -0.5006F, -0.1589F, 1.0F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(45, 17).addBox(5.1255F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2611F, -0.3337F, -0.5218F, 0.0395F, 1.3501F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(37, 25).addBox(-2.0856F, -1.0209F, 0.0041F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0856F, 12.6034F, -1.3201F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(55, 2).addBox(-0.1F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.001F, 12.2102F, -0.4065F, -0.0269F, -0.2836F, -0.3738F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(61, 0).addBox(-0.1F, 0.0F, -1.0F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0405F, 12.2956F, 1.8814F, 0.0566F, -0.3562F, -0.3204F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(19, 4).addBox(-2.1131F, -0.946F, -4.9459F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1131F, 11.419F, -3.0389F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(75, 46).addBox(0.3F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8916F, 9.4049F, -4.2547F, -0.3709F, -0.3187F, -0.4227F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(0, 62).addBox(-0.5F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9306F, 11.2225F, -2.2082F, -0.2089F, -0.1521F, -0.4775F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(75, 42).addBox(-1.0F, -0.9035F, -1.5298F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 12.23F, -1.6767F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(40, 2).addBox(-0.7F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5052F, 12.1315F, 2.509F, -0.0379F, -0.5379F, -0.4032F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(29, 0).addBox(-0.3F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4723F, 12.0919F, 2.6986F, -0.0522F, -0.7808F, -0.4884F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(19, 2).addBox(-0.0038F, 0.5695F, -1.1553F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.345F, 12.1034F, 2.6694F, -0.1067F, -0.8618F, -0.5217F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(0, 0).addBox(-0.4552F, 0.5903F, -1.0866F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.345F, 12.1034F, 2.6694F, 0.0006F, -1.0136F, -0.6891F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(0, 11).addBox(-0.4002F, 0.5972F, -1.1188F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.345F, 12.1034F, 2.6694F, -0.0197F, -0.9349F, -0.6673F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(35, 43).addBox(-0.5F, -1.908F, 6.84F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.9508F, -9.7096F, 0.3403F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3104F, -3.4549F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r239 = neck2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(109, 16).addBox(0.0F, -3.5489F, -0.0609F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.842F, -2.9765F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r240 = neck2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(78, 106).addBox(0.0F, -4.1489F, 0.0391F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6185F, -1.0478F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r241 = neck2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(103, 53).mirror().addBox(-7.1255F, -3.0192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1493F, -0.4788F, -0.6161F, -0.4305F, -1.3277F));

		PartDefinition cube_r242 = neck2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(93, 87).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1493F, -0.4788F, -0.7169F, -0.18F, -0.9976F));

		PartDefinition cube_r243 = neck2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(93, 85).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1493F, -0.4788F, -0.7352F, -0.0056F, -0.8013F));

		PartDefinition cube_r244 = neck2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(103, 53).addBox(5.1255F, -3.0192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1493F, -0.4788F, -0.6161F, 0.4305F, 1.3277F));

		PartDefinition cube_r245 = neck2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(93, 87).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1493F, -0.4788F, -0.7169F, 0.18F, 0.9976F));

		PartDefinition cube_r246 = neck2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(93, 85).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1493F, -0.4788F, -0.7352F, 0.0056F, 0.8013F));

		PartDefinition cube_r247 = neck2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(73, 48).addBox(-0.5F, -0.2F, 2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.0131F, -5.7998F, -0.1047F, 0.0F, 0.0F));

		PartDefinition leftarm = neck2.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, 5.9665F, -3.2666F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r248 = leftarm.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(101, 58).addBox(-1.0F, -0.234F, -0.4311F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 11.1436F, 1.9001F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r249 = leftarm.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(97, 79).addBox(-1.0F, -1.3285F, -0.9789F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 11.1436F, 1.9001F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r250 = leftarm.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(93, 101).addBox(-1.0F, -0.1534F, -0.7039F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.1436F, 1.9001F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r251 = leftarm.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(101, 35).addBox(-1.0F, -0.7306F, -0.6847F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(79, 100).addBox(-1.0F, -1.1306F, -0.0847F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(101, 32).addBox(-1.0F, -0.7306F, -0.0847F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 11.1436F, 1.9001F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r252 = leftarm.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(53, 49).addBox(-1.0F, -1.5F, -1.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0062F, 0.7723F, 0.3562F, -0.6022F, 0.0014F, -0.001F));

		PartDefinition cube_r253 = leftarm.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(33, 49).addBox(-1.0F, -1.0F, -1.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0062F, 0.7723F, 0.3562F, -0.1659F, 0.0014F, -0.001F));

		PartDefinition cube_r254 = leftarm.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(74, 80).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 4.3226F, -0.3972F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r255 = leftarm.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(11, 48).addBox(-0.5F, 0.025F, 0.025F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.4133F, -0.928F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r256 = leftarm.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(18, 76).addBox(-0.5F, -4.5F, 0.3F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7412F, 0.5344F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r257 = leftarm.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(0, 101).addBox(-0.5F, -0.2F, 0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.0216F, -0.4226F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 11.7574F, 2.6242F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r258 = leftarm2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(82, 52).addBox(0.0F, -0.9F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1764F, -0.3428F, 0.4411F, 1.5708F, 1.0734F, -1.5708F));

		PartDefinition cube_r259 = leftarm2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(20, 109).addBox(-0.1801F, 0.4972F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.3236F, 0.311F, 1.2776F, 1.5708F, 1.4661F, -1.5708F));

		PartDefinition cube_r260 = leftarm2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(113, 31).addBox(-0.2028F, -1.8199F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(25, 105).addBox(-0.5028F, -1.3199F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(30, 113).addBox(-0.2028F, -0.8199F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.3236F, 0.311F, 1.2776F, 1.5708F, -0.1047F, -1.5708F));

		PartDefinition cube_r261 = leftarm2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(5, 91).addBox(0.3799F, 1.5365F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3236F, -1.389F, 0.0776F, -1.5708F, -1.5097F, 1.5708F));

		PartDefinition cube_r262 = leftarm2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(37, 63).addBox(-0.909F, -0.6719F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3236F, 4.8444F, 1.0397F, 1.5708F, -1.501F, -1.5708F));

		PartDefinition cube_r263 = leftarm2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(15, 97).addBox(-0.7799F, 4.8057F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.7764F, 0.5922F, -0.8512F, 1.5708F, -1.4835F, -1.5708F));

		PartDefinition cube_r264 = leftarm2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(81, 84).addBox(-1.0292F, -0.1611F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7764F, 0.5922F, -0.8512F, 1.5708F, -1.4312F, -1.5708F));

		PartDefinition cube_r265 = leftarm2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(5, 98).addBox(-0.05F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3236F, 5.1852F, 0.0981F, 1.5708F, -1.5533F, -1.5708F));

		PartDefinition cube_r266 = leftarm2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(78, 11).addBox(-0.55F, -2.8F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3236F, 2.6387F, 0.2231F, 1.5708F, -1.4224F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 9.3969F, 0.1286F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r267 = leftArm3.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(18, 113).addBox(0.2F, -0.7F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6775F, 0.8301F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r268 = leftArm3.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(102, 17).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4216F, -0.4049F, 0.2271F, -0.0429F, -0.008F));

		PartDefinition cube_r269 = leftArm4.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(100, 2).addBox(0.0856F, -0.5309F, -0.4937F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5765F, 2.3923F, -0.2672F, -0.8195F, -0.4858F, -0.3862F));

		PartDefinition cube_r270 = leftArm4.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(23, 83).addBox(-1.5765F, -0.8029F, -0.5191F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0765F, 2.3923F, -0.2672F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r271 = leftArm4.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(82, 2).addBox(-0.5F, -0.1F, -0.7F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0F, 0.0601F, 0.1093F, 0.0411F, -0.3027F, -0.1372F));

		PartDefinition rightarm = neck2.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, 5.9665F, -3.2666F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r272 = rightarm.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(86, 101).addBox(-1.0F, -0.234F, -0.4311F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 11.1436F, 1.9001F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r273 = rightarm.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(97, 97).addBox(-1.0F, -1.3285F, -0.9789F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 11.1436F, 1.9001F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r274 = rightarm.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(100, 101).addBox(-1.0F, -0.1534F, -0.7039F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.1436F, 1.9001F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r275 = rightarm.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(101, 55).addBox(-1.0F, -0.7306F, -0.6847F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(101, 29).addBox(-1.0F, -1.1306F, -0.0847F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(101, 38).addBox(-1.0F, -0.7306F, -0.0847F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 11.1436F, 1.9001F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r276 = rightarm.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(0, 56).addBox(-1.0F, -1.5F, -1.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0062F, 0.7723F, 0.3562F, -0.6022F, -0.0014F, 0.001F));

		PartDefinition cube_r277 = rightarm.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(53, 55).addBox(-1.0F, -1.0F, -1.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0062F, 0.7723F, 0.3562F, -0.1659F, -0.0014F, 0.001F));

		PartDefinition cube_r278 = rightarm.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(50, 81).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 4.3226F, -0.3972F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r279 = rightarm.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(29, 55).addBox(-0.5F, 0.025F, 0.025F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.4133F, -0.928F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r280 = rightarm.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(69, 79).addBox(-0.5F, -4.5F, 0.3F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7412F, 0.5344F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r281 = rightarm.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(63, 101).addBox(-0.5F, -0.2F, 0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.0216F, -0.4226F, -0.0524F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 11.7574F, 2.6242F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r282 = rightarm2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(83, 11).addBox(-1.0F, -0.9F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1764F, -0.3428F, 0.4411F, 1.5708F, -1.0734F, 1.5708F));

		PartDefinition cube_r283 = rightarm2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(109, 59).addBox(-0.8199F, 0.4972F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.3236F, 0.311F, 1.2776F, 1.5708F, -1.4661F, 1.5708F));

		PartDefinition cube_r284 = rightarm2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(35, 113).addBox(-0.7972F, -1.8199F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(105, 44).addBox(-1.4972F, -1.3199F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(113, 34).addBox(-0.7972F, -0.8199F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.3236F, 0.311F, 1.2776F, 1.5708F, 0.1047F, 1.5708F));

		PartDefinition cube_r285 = rightarm2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(10, 91).addBox(-1.3799F, 1.5365F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3236F, -1.389F, 0.0776F, -1.5708F, 1.5097F, -1.5708F));

		PartDefinition cube_r286 = rightarm2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(1, 65).addBox(-0.091F, -0.6719F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.3236F, 4.8444F, 1.0397F, 1.5708F, 1.501F, 1.5708F));

		PartDefinition cube_r287 = rightarm2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(41, 98).addBox(-0.2201F, 4.8057F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7764F, 0.5922F, -0.8512F, 1.5708F, 1.4835F, 1.5708F));

		PartDefinition cube_r288 = rightarm2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(57, 85).addBox(0.0292F, -0.1611F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7764F, 0.5922F, -0.8512F, 1.5708F, 1.4312F, 1.5708F));

		PartDefinition cube_r289 = rightarm2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(10, 98).addBox(-0.95F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3236F, 5.1852F, 0.0981F, 1.5708F, 1.5533F, 1.5708F));

		PartDefinition cube_r290 = rightarm2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(0, 80).addBox(-0.45F, -2.8F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3236F, 2.6387F, 0.2231F, 1.5708F, 1.4224F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 9.3969F, 0.1286F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r291 = rightArm3.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(113, 28).addBox(-1.2F, -0.7F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6775F, 0.8301F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r292 = rightArm3.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(102, 71).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4216F, -0.4049F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r293 = rightArm4.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(20, 100).addBox(-2.1086F, 0.3164F, -0.2669F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0765F, 1.7923F, 0.1328F, -0.4382F, 0.3088F, 0.5359F));

		PartDefinition cube_r294 = rightArm4.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(83, 31).addBox(-1.4235F, -0.1203F, -0.2866F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0765F, 1.7923F, 0.1328F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r295 = rightArm4.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(82, 48).addBox(-2.5F, -0.1F, -0.7F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0F, 0.0601F, 0.1093F, 0.0411F, 0.3027F, 0.1372F));

		PartDefinition bone2 = neck2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.7082F, 2.0445F, -0.9377F));

		PartDefinition cube_r296 = bone2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(11, 41).addBox(-0.5F, 0.075F, -1.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.693F, -0.6594F, 3.3471F, 0.964F, 0.169F, -0.3803F));

		PartDefinition cube_r297 = bone2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(32, 83).addBox(-0.5F, -3.375F, -1.35F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.016F, 1.5275F, 2.4482F, 1.6534F, 0.169F, -0.3803F));

		PartDefinition cube_r298 = bone2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(78, 74).addBox(-0.5F, -3.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.4514F, 1.9172F, 3.9702F, 0.4753F, 0.169F, -0.3803F));

		PartDefinition cube_r299 = bone2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(45, 11).addBox(-0.5F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7916F, -3.0219F, 7.9487F, 0.8069F, 0.169F, -0.3803F));

		PartDefinition cube_r300 = bone2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(0, 44).addBox(-0.5F, -1.1F, -1.85F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6624F, -1.866F, 6.1377F, 0.5015F, 0.169F, -0.3803F));

		PartDefinition cube_r301 = bone2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(104, 20).addBox(-0.5F, 0.0F, -1.05F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.4849F, -3.1769F, 4.5134F, 1.7843F, 0.169F, -0.3803F));

		PartDefinition cube_r302 = bone2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(44, 49).addBox(-0.5F, 0.0F, -3.05F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.6697F, -1.8988F, 0.7276F, 1.8541F, 0.169F, -0.3803F));

		PartDefinition cube_r303 = bone2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(17, 13).addBox(-1.5272F, -1.9788F, -3.9175F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5698F, 0.4149F, 1.7751F, 0.7982F, 0.169F, -0.3803F));

		PartDefinition cube_r304 = bone2.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(5, 107).addBox(-0.5F, -2.0F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.81F, 0.7275F, -0.3065F, 2.753F, 0.169F, -0.3803F));

		PartDefinition cube_r305 = bone2.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(81, 25).addBox(-0.5F, -0.1F, -2.15F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0944F, 0.3589F, -1.0525F, 2.5153F, 0.1294F, -0.3948F));

		PartDefinition cube_r306 = bone2.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(95, 71).addBox(-2.1F, 0.0F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.8383F, 1.4405F, -2.4F, 1.6098F, 0.169F, -0.3803F));

		PartDefinition cube_r307 = bone2.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(74, 86).addBox(-1.5272F, -3.2929F, -3.6175F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5698F, 0.4149F, 1.7751F, 1.1298F, 0.169F, -0.3803F));

		PartDefinition cube_r308 = bone2.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(0, 2).addBox(0.4F, 0.3F, -2.5F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6157F, 0.5002F, 0.3011F, 0.5851F, -0.1351F, -0.084F));

		PartDefinition bone3 = neck2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-3.7082F, 2.0445F, -0.9377F));

		PartDefinition cube_r309 = bone3.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(11, 41).mirror().addBox(-0.5F, 0.075F, -1.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.693F, -0.6594F, 3.3471F, 0.964F, -0.169F, 0.3803F));

		PartDefinition cube_r310 = bone3.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(32, 83).mirror().addBox(-0.5F, -3.375F, -1.35F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.016F, 1.5275F, 2.4482F, 1.6534F, -0.169F, 0.3803F));

		PartDefinition cube_r311 = bone3.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(78, 74).mirror().addBox(-0.5F, -3.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4514F, 1.9172F, 3.9702F, 0.4753F, -0.169F, 0.3803F));

		PartDefinition cube_r312 = bone3.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(45, 11).mirror().addBox(-0.5F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7916F, -3.0219F, 7.9487F, 0.8069F, -0.169F, 0.3803F));

		PartDefinition cube_r313 = bone3.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-0.5F, -1.1F, -1.85F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6624F, -1.866F, 6.1377F, 0.5015F, -0.169F, 0.3803F));

		PartDefinition cube_r314 = bone3.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(104, 20).mirror().addBox(-0.5F, 0.0F, -1.05F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.4849F, -3.1769F, 4.5134F, 1.7843F, -0.169F, 0.3803F));

		PartDefinition cube_r315 = bone3.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(44, 49).mirror().addBox(-0.5F, 0.0F, -3.05F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.6697F, -1.8988F, 0.7276F, 1.8541F, -0.169F, 0.3803F));

		PartDefinition cube_r316 = bone3.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(17, 13).mirror().addBox(0.5272F, -1.9788F, -3.9175F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5698F, 0.4149F, 1.7751F, 0.7982F, -0.169F, 0.3803F));

		PartDefinition cube_r317 = bone3.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(5, 107).mirror().addBox(-0.5F, -2.0F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.81F, 0.7275F, -0.3065F, 2.753F, -0.169F, 0.3803F));

		PartDefinition cube_r318 = bone3.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(81, 25).mirror().addBox(-0.5F, -0.1F, -2.15F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0944F, 0.3589F, -1.0525F, 2.5153F, -0.1294F, 0.3948F));

		PartDefinition cube_r319 = bone3.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(95, 71).mirror().addBox(0.1F, 0.0F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.8383F, 1.4405F, -2.4F, 1.6098F, -0.169F, 0.3803F));

		PartDefinition cube_r320 = bone3.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(74, 86).mirror().addBox(-0.4728F, -3.2929F, -3.6175F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5698F, 0.4149F, 1.7751F, 1.1298F, -0.169F, 0.3803F));

		PartDefinition cube_r321 = bone3.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(0, 2).mirror().addBox(-1.4F, 0.3F, -2.5F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6157F, 0.5002F, 0.3011F, 0.5851F, 0.1351F, 0.084F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1796F, -3.1233F, -0.6184F, -0.215F, 0.1506F));

		PartDefinition cube_r322 = neck.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(32, 107).addBox(0.0F, -3.1828F, -0.0159F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6196F, -1.873F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r323 = neck.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(61, 67).addBox(-0.5F, -0.6166F, -0.4594F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0305F, -2.3993F, 0.0698F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(73, 53).addBox(-0.5F, -0.6F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F))
				.texOffs(53, 87).addBox(0.0F, -3.3F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0852F, -2.6688F, -0.3035F, -0.2085F, 0.0647F));

		PartDefinition cube_r324 = neck3.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(40, 113).addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(0, 50).addBox(-0.5F, -0.6F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.0125F, -2.9567F, -0.0464F, -0.3487F, 0.0159F));

		PartDefinition cube_r325 = neck4.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(16, 69).addBox(0.0F, -1.3F, -1.3F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -2.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(69, 18).addBox(-0.5F, -0.6F, -4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.2151F, -2.8788F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r326 = neck5.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(58, 100).mirror().addBox(0.0F, 0.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0923F, -2.2175F, 0.121F, -0.05F, 0.3897F));

		PartDefinition cube_r327 = neck5.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(58, 100).addBox(0.0F, 0.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0923F, -2.2175F, 0.121F, 0.05F, -0.3897F));

		PartDefinition head = neck5.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8564F, -2.9942F, -0.534F, -0.4988F, -0.3138F));

		PartDefinition cube_r328 = head.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(49, 4).addBox(-3.0F, -0.45F, -0.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5909F, -1.3405F, 2.2515F, 0.0F, 0.0F));

		PartDefinition cube_r329 = head.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(62, 4).addBox(-3.0F, -2.0F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, 0.5254F, 0.7081F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r330 = head.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(47, 61).addBox(-3.0F, -1.0F, -0.4F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0876F, -0.5551F, 1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r331 = head.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(37, 37).addBox(-1.575F, -1.1F, -0.775F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.075F, 1.6408F, -1.438F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r332 = head.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(0, 13).addBox(-1.575F, -2.0F, -0.975F, 3.0F, 2.0F, 5.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.075F, 5.5099F, -2.7944F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r333 = head.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(104, 79).addBox(-1.0F, -0.9F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 9.8946F, -6.8236F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r334 = head.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(75, 103).addBox(-1.0F, -0.3F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 9.1301F, -7.4681F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r335 = head.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(79, 62).addBox(-1.0F, -0.1217F, -0.0967F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 8.4276F, -7.5751F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r336 = head.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(94, 34).addBox(-1.0F, -0.475F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 8.0028F, -7.2081F, 1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r337 = head.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(68, 103).addBox(-1.0F, -0.4848F, -1.2437F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, 8.3276F, -5.7751F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r338 = head.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(91, 93).addBox(-1.0F, -1.4578F, -0.4623F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 8.3276F, -5.7751F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r339 = head.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(54, 31).addBox(-0.8F, 0.1F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F))
				.texOffs(54, 31).addBox(-0.3F, 0.1F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 7.5829F, -7.6475F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r340 = head.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(111, 96).addBox(-0.5F, -0.4F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.004F, 3.6989F, -7.8549F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r341 = head.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(109, 69).addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 66).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.496F, 2.1498F, -7.5379F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r342 = head.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(5, 80).addBox(-0.5F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.496F, 1.5504F, -7.564F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r343 = head.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(11, 58).addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.503F, -0.2656F, -6.7095F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r344 = head.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(111, 4).addBox(0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0F, -2.0632F, -3.7047F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r345 = head.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(98, 93).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -3.4513F, -2.2895F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r346 = head.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(42, 70).addBox(0.5F, -0.5F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0F, -1.2944F, -5.0279F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r347 = head.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(86, 69).addBox(-2.0F, -0.575F, -0.375F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, -3.2956F, -3.0143F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r348 = head.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(65, 30).addBox(0.0F, -1.4F, -0.4F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0F, -2.1561F, -3.0516F, 0.6283F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.425F, 8.7298F, -7.7083F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(112, 43).addBox(-1.3185F, -0.851F, -0.681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7072F, -12.6106F, 4.6851F, 0.3228F, 0.4857F, -0.9491F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(79, 19).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.6948F, -12.2344F, 4.7136F, 0.569F, 0.0947F, -0.1468F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(90, 13).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.922F, -8.9955F, 0.9988F, 1.1476F, -0.1096F, -0.2382F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(83, 96).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.425F, -11.7942F, 3.5059F, 0.9439F, 0.1667F, 0.2251F));

		PartDefinition cube_r353 = leftFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(79, 66).addBox(0.14F, -0.0836F, 2.1357F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.825F, -6.8188F, 1.1966F, -0.1008F, -0.0767F, -0.1344F));

		PartDefinition cube_r354 = leftFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(61, 23).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7593F, -3.9621F, 3.4783F, -0.6041F, 0.3645F, -0.0994F));

		PartDefinition cube_r355 = leftFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(18, 57).addBox(-0.8023F, -0.0836F, -0.3982F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.825F, -6.8188F, 1.1966F, -0.1057F, 0.314F, -0.1749F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(0, 27).addBox(-0.9F, -3.0F, -0.4F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.825F, -7.1188F, 1.1966F, -0.5713F, 0.3274F, -0.166F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(0, 36).addBox(-0.9F, -2.8F, -0.4F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9224F, -9.6938F, 2.7327F, -0.8403F, 0.4561F, 0.014F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(50, 110).addBox(0.125F, -0.05F, -1.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.925F, -4.6871F, -0.1359F, 1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r359 = leftFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(97, 13).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.05F, -4.4585F, -0.1059F, 1.3315F, 0.0592F, -0.2188F));

		PartDefinition cube_r360 = leftFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(111, 25).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.0496F, -3.6589F, 0.7061F, 1.538F, 0.0089F, 0.342F));

		PartDefinition cube_r361 = leftFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(95, 75).addBox(-0.425F, -0.5279F, -1.9104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.175F, -2.9118F, 0.6917F, 1.5272F, 0.0019F, 0.2007F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.425F, 8.7298F, -7.7083F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(112, 43).mirror().addBox(0.3185F, -0.851F, -0.681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7072F, -12.6106F, 4.6851F, 0.3228F, -0.4857F, 0.9491F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(79, 19).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.6948F, -12.2344F, 4.7136F, 0.569F, -0.0947F, 0.1468F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(90, 13).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.922F, -8.9955F, 0.9988F, 1.1476F, 0.1096F, 0.2382F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(83, 96).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.425F, -11.7942F, 3.5059F, 0.9439F, -0.1667F, -0.2251F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(79, 66).mirror().addBox(-1.14F, -0.0836F, 2.1357F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.825F, -6.8188F, 1.1966F, -0.1008F, 0.0767F, 0.1344F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(61, 23).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7593F, -3.9621F, 3.4783F, -0.6041F, -0.3645F, 0.0994F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(18, 57).mirror().addBox(-0.1977F, -0.0836F, -0.3982F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.825F, -6.8188F, 1.1966F, -0.1057F, -0.314F, 0.1749F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(-0.1F, -3.0F, -0.4F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.825F, -7.1188F, 1.1966F, -0.5713F, -0.3274F, 0.166F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-0.1F, -2.8F, -0.4F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9224F, -9.6938F, 2.7327F, -0.8403F, -0.4561F, -0.014F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(50, 110).mirror().addBox(-1.125F, -0.05F, -1.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.925F, -4.6871F, -0.1359F, 1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(97, 13).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.05F, -4.4585F, -0.1059F, 1.3315F, -0.0592F, 0.2188F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(111, 25).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.0496F, -3.6589F, 0.7061F, 1.538F, -0.0089F, -0.342F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(95, 75).mirror().addBox(-0.575F, -0.5279F, -1.9104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.175F, -2.9118F, 0.6917F, 1.5272F, -0.0019F, -0.2007F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7008F, 8.039F, -5.0648F, -0.0522F, 0.0046F, 0.0871F));

		PartDefinition cube_r375 = leftOrbit.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(104, 25).addBox(-5.2482F, -1.7228F, -8.0572F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8805F, -0.7717F, -0.6938F, -1.9792F, 0.1729F, 0.6015F));

		PartDefinition cube_r376 = leftOrbit.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(71, 110).addBox(1.4345F, -0.9506F, -8.5552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(89, 52).addBox(1.4345F, -0.9506F, -8.1552F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.8805F, -0.7717F, -0.6938F, -2.1337F, 0.0271F, -0.114F));

		PartDefinition cube_r377 = leftOrbit.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(10, 113).addBox(1.4345F, -1.4809F, -6.1632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 113).addBox(1.4345F, -1.4809F, -6.4632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.8805F, -0.7717F, -0.6938F, -2.0464F, 0.0271F, -0.114F));

		PartDefinition cube_r378 = leftOrbit.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(110, 52).addBox(-0.0253F, -1.0193F, -5.9636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.8805F, -0.7717F, -0.6938F, -2.0993F, 0.119F, 0.1376F));

		PartDefinition cube_r379 = leftOrbit.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(99, 6).addBox(-0.0253F, -2.4467F, -5.9582F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(90, 79).addBox(-0.0253F, -1.7717F, -5.9582F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.8805F, -0.7717F, -0.6938F, -1.8113F, 0.119F, 0.1376F));

		PartDefinition cube_r380 = leftOrbit.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(113, 55).addBox(1.4345F, -0.693F, -6.4663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F))
				.texOffs(86, 109).addBox(1.4345F, -0.1977F, -6.4908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(81, 109).addBox(1.4345F, -0.1977F, -6.2158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.8805F, -0.7717F, -0.6938F, -2.1075F, 0.0271F, -0.114F));

		PartDefinition cube_r381 = leftOrbit.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(91, 47).addBox(-5.6811F, -0.1962F, -7.953F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8805F, -0.7717F, -0.6938F, -2.0098F, 0.3935F, 0.5295F));

		PartDefinition cube_r382 = leftOrbit.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(0, 106).addBox(1.4345F, -0.1962F, -8.539F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.8805F, -0.7717F, -0.6938F, -2.1511F, 0.0271F, -0.114F));

		PartDefinition cube_r383 = leftOrbit.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(112, 75).addBox(1.4345F, -1.5849F, -7.9804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8805F, -0.7717F, -0.6938F, -1.8457F, 0.0271F, -0.114F));

		PartDefinition cube_r384 = leftOrbit.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(112, 72).addBox(1.4345F, -2.8119F, -7.0445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.8805F, -0.7717F, -0.6938F, -1.6711F, 0.0271F, -0.114F));

		PartDefinition cube_r385 = leftOrbit.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(96, 109).addBox(1.4345F, -4.1061F, -5.773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.8805F, -0.7717F, -0.6938F, -1.453F, 0.0271F, -0.114F));

		PartDefinition cube_r386 = leftOrbit.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(74, 91).addBox(-0.4442F, -0.4281F, -4.6195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.8805F, -0.7717F, -0.6938F, -2.1096F, 0.1526F, 0.2261F));

		PartDefinition cube_r387 = leftOrbit.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(101, 112).addBox(-0.9568F, -0.7199F, -0.3197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.895F, -0.178F, -0.3567F, 1.8267F, 0.1006F, 0.2284F));

		PartDefinition cube_r388 = leftOrbit.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(34, 98).addBox(-0.8469F, 0.0494F, -0.2849F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.8805F, -0.7717F, -0.6938F, 0.7944F, 0.2634F, 0.3932F));

		PartDefinition cube_r389 = leftOrbit.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(109, 112).addBox(-0.4442F, 1.6337F, -1.3141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(66, 110).addBox(-0.4442F, 2.2337F, -1.3141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(101, 109).addBox(-0.4442F, 2.9337F, -1.3141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.8805F, -0.7717F, -0.6938F, 2.7163F, 0.1526F, 0.2261F));

		PartDefinition cube_r390 = leftOrbit.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(112, 99).addBox(-0.4442F, 3.1686F, -2.4207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(96, 112).addBox(-0.4442F, 3.1686F, -2.9207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(91, 112).addBox(-0.4442F, 2.9686F, -2.9207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.8805F, -0.7717F, -0.6938F, 3.0217F, 0.1526F, 0.2261F));

		PartDefinition cube_r391 = leftOrbit.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(61, 110).addBox(-0.4442F, -2.4899F, -3.6035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.8805F, -0.7717F, -0.6938F, -1.8216F, 0.1526F, 0.2261F));

		PartDefinition cube_r392 = leftOrbit.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(112, 87).addBox(-0.4442F, -3.4797F, 0.5536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.8805F, -0.7717F, -0.6938F, -0.5562F, 0.1526F, 0.2261F));

		PartDefinition cube_r393 = leftOrbit.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(86, 112).addBox(-0.4442F, -2.8712F, 0.3667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.8805F, -0.7717F, -0.6938F, -0.626F, 0.1526F, 0.2261F));

		PartDefinition cube_r394 = leftOrbit.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(112, 84).addBox(-0.8469F, 0.2334F, 1.2938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.8805F, -0.7717F, -0.6938F, 0.9166F, 0.2634F, 0.3932F));

		PartDefinition cube_r395 = leftOrbit.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(112, 81).addBox(-0.8469F, -0.2339F, 1.1912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8805F, -0.7717F, -0.6938F, 1.0038F, 0.2634F, 0.3932F));

		PartDefinition cube_r396 = leftOrbit.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(81, 112).addBox(-0.4442F, -2.5555F, 0.3738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.8805F, -0.7717F, -0.6938F, -0.277F, 0.1526F, 0.2261F));

		PartDefinition cube_r397 = leftOrbit.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(76, 112).addBox(-0.4442F, -2.2012F, -2.604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.8805F, -0.7717F, -0.6938F, -1.4551F, 0.1526F, 0.2261F));

		PartDefinition cube_r398 = leftOrbit.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(111, 78).addBox(-0.7623F, -2.7182F, -1.0458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4545F, -1.3813F, -2.3485F, -0.6303F, 0.6F, 0.0718F));

		PartDefinition cube_r399 = leftOrbit.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(76, 95).addBox(-0.7623F, -0.9868F, 0.6459F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.4545F, -1.3813F, -2.3485F, 0.7224F, 0.6F, 0.0718F));

		PartDefinition cube_r400 = leftOrbit.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(107, 100).addBox(-1.3144F, 1.3657F, -0.3337F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(107, 86).addBox(-0.7144F, 1.3657F, -0.3337F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.5295F, -1.3813F, -1.9485F, 0.1391F, -0.1593F, -0.2106F));

		PartDefinition cube_r401 = leftOrbit.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(107, 104).addBox(-1.3144F, 0.2339F, -3.0404F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(107, 82).addBox(-0.7144F, 0.2339F, -3.0404F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5295F, -1.3813F, -1.9485F, 1.099F, -0.1593F, -0.2106F));

		PartDefinition cube_r402 = leftOrbit.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(39, 87).addBox(-1.2197F, -1.174F, -2.9196F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(25, 87).addBox(-0.6197F, -1.174F, -2.9196F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5295F, -1.3813F, -1.9485F, 1.5908F, -0.1601F, -0.1753F));

		PartDefinition cube_r403 = leftOrbit.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(90, 97).addBox(-0.6662F, 0.0431F, -1.8058F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(58, 96).addBox(-0.6662F, -0.5569F, -1.6558F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5295F, -1.3813F, -1.9485F, 1.1272F, -0.1314F, -0.2222F));

		PartDefinition cube_r404 = leftOrbit.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(96, 51).addBox(-1.286F, -0.5685F, -1.6629F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5295F, -1.3813F, -1.9485F, 1.1404F, -0.1616F, -0.2378F));

		PartDefinition cube_r405 = leftOrbit.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(96, 42).addBox(-0.8034F, -0.2126F, -1.711F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5658F, -2.3313F, -2.2925F, 1.5618F, -0.4486F, 0.0286F));

		PartDefinition cube_r406 = leftOrbit.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(27, 96).addBox(-0.8118F, -0.2077F, -1.7105F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3751F, -3.9153F, -2.1861F, 1.492F, -0.4486F, -0.0936F));

		PartDefinition cube_r407 = leftOrbit.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(72, 28).addBox(-0.8023F, -0.2192F, -0.9954F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2218F, -6.6881F, -2.1538F, 1.3286F, -0.3302F, -0.3031F));

		PartDefinition cube_r408 = leftOrbit.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(70, 69).addBox(-0.6273F, -0.2192F, -0.1954F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1194F, -5.9828F, -2.2669F, 1.3335F, 0.2642F, -0.4461F));

		PartDefinition cube_r409 = leftOrbit.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(70, 64).addBox(-0.8F, -0.2F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4744F, -4.7886F, -2.1567F, 1.7343F, -0.3857F, -0.4066F));

		PartDefinition cube_r410 = leftOrbit.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(36, 57).addBox(-1.7986F, -0.7879F, -0.1134F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0752F, -3.6376F, -1.3933F, 1.7295F, 0.3041F, -0.2967F));

		PartDefinition cube_r411 = leftOrbit.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(7, 70).addBox(-0.7623F, -0.2865F, -0.2461F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.4545F, -1.3813F, -2.3485F, 1.3682F, 0.6F, 0.0718F));

		PartDefinition cube_r412 = leftOrbit.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(51, 94).addBox(-0.6487F, -0.632F, -1.6422F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5295F, -1.3813F, -1.9485F, 1.6385F, 0.5487F, 0.3719F));

		PartDefinition cube_r413 = leftOrbit.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(25, 112).addBox(-0.5379F, -0.4947F, -0.5031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4295F, -1.3813F, -1.9485F, 1.9048F, 0.5129F, 0.2194F));

		PartDefinition cube_r414 = leftOrbit.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(0, 95).addBox(-1.0006F, 2.0506F, -0.3718F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5295F, -1.3813F, -1.9485F, 0.0047F, -0.0956F, -0.2013F));

		PartDefinition cube_r415 = leftOrbit.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(104, 66).addBox(-1.0006F, 5.8941F, -1.4168F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5295F, -1.3813F, -1.9485F, 0.1792F, -0.0956F, -0.2013F));

		PartDefinition cube_r416 = leftOrbit.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(15, 91).addBox(-1.0006F, 8.6104F, -2.6409F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(106, 6).addBox(-1.0006F, 9.2144F, -2.973F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5295F, -1.3813F, -1.9485F, 0.3188F, -0.0956F, -0.2013F));

		PartDefinition cube_r417 = leftOrbit.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(112, 102).addBox(-1.0006F, 6.3629F, 10.6875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5295F, -1.3813F, -1.9485F, -0.8593F, -0.0956F, -0.2013F));

		PartDefinition cube_r418 = leftOrbit.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(112, 46).addBox(-1.0006F, 11.0278F, -4.8752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(109, 22).addBox(-1.0006F, 10.5278F, -4.8752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5295F, -1.3813F, -1.9485F, 0.4934F, -0.0956F, -0.2013F));

		PartDefinition cube_r419 = leftOrbit.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(104, 61).addBox(-1.0006F, 6.3994F, -2.323F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5295F, -1.3813F, -1.9485F, 0.249F, -0.0956F, -0.2013F));

		PartDefinition cube_r420 = leftOrbit.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(25, 108).addBox(-1.0006F, 4.684F, -1.2933F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5295F, -1.3813F, -1.9485F, 0.0919F, -0.0956F, -0.2013F));

		PartDefinition cube_r421 = leftOrbit.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(15, 108).addBox(-1.0006F, 2.7864F, -0.8384F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5295F, -1.3813F, -1.9485F, -0.004F, -0.0956F, -0.2013F));

		PartDefinition cube_r422 = leftOrbit.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(44, 94).addBox(-0.8033F, -0.5627F, -1.6651F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8805F, -0.7717F, -0.6938F, -2.2391F, 0.3411F, 0.3319F));

		PartDefinition cube_r423 = leftOrbit.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(51, 103).addBox(-1.0F, -0.5522F, 0.1016F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.672F, 0.3595F, -0.3441F, 0.7432F, 0.1165F, 0.0872F));

		PartDefinition cube_r424 = leftOrbit.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(86, 84).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1235F, -0.1003F, 1.7836F, 0.8485F, 0.1312F, 0.0764F));

		PartDefinition cube_r425 = leftOrbit.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(67, 87).addBox(-0.7F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4106F, -1.5833F, 3.0943F, 0.925F, -0.0049F, -0.0945F));

		PartDefinition cube_r426 = leftOrbit.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(46, 87).addBox(0.0F, -0.5825F, -0.5657F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.672F, 0.3595F, -0.3441F, 0.4553F, 0.1165F, 0.0872F));

		PartDefinition cube_r427 = leftOrbit.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(23, 79).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.7449F, -1.6527F, 1.6169F, 0.9599F, -0.0049F, -0.0945F));

		PartDefinition cube_r428 = leftOrbit.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(41, 79).addBox(-1.0F, -0.503F, 1.0705F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.672F, 0.3595F, -0.3441F, 0.7956F, 0.1165F, 0.0872F));

		PartDefinition cube_r429 = leftOrbit.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(5, 111).addBox(-0.8508F, 0.1014F, 0.12F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.895F, -0.178F, -0.3567F, -2.9426F, 0.1751F, 0.1652F));

		PartDefinition cube_r430 = leftOrbit.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(94, 38).addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.3018F, -0.3326F, -1.5879F, 2.568F, 0.1738F, 0.046F));

		PartDefinition cube_r431 = leftOrbit.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(37, 94).addBox(-0.8508F, -0.6797F, 0.1984F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.895F, -0.178F, -0.3567F, 2.5901F, 0.1751F, 0.1652F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7008F, 8.039F, -5.0648F, -0.0522F, -0.0046F, -0.0871F));

		PartDefinition cube_r432 = rightOrbit.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(104, 25).mirror().addBox(3.2482F, -1.7228F, -8.0572F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8805F, -0.7717F, -0.6938F, -1.9792F, -0.1729F, -0.6015F));

		PartDefinition cube_r433 = rightOrbit.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(71, 110).mirror().addBox(-2.4345F, -0.9506F, -8.5552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(89, 52).mirror().addBox(-2.4345F, -0.9506F, -8.1552F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.8805F, -0.7717F, -0.6938F, -2.1337F, -0.0271F, 0.114F));

		PartDefinition cube_r434 = rightOrbit.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(10, 113).mirror().addBox(-2.4345F, -1.4809F, -6.1632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(0, 113).mirror().addBox(-2.4345F, -1.4809F, -6.4632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.8805F, -0.7717F, -0.6938F, -2.0464F, -0.0271F, 0.114F));

		PartDefinition cube_r435 = rightOrbit.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(110, 52).mirror().addBox(-0.9747F, -1.0193F, -5.9636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.8805F, -0.7717F, -0.6938F, -2.0993F, -0.119F, -0.1376F));

		PartDefinition cube_r436 = rightOrbit.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(99, 6).mirror().addBox(-0.9747F, -2.4467F, -5.9582F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(90, 79).mirror().addBox(-0.9747F, -1.7717F, -5.9582F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.8805F, -0.7717F, -0.6938F, -1.8113F, -0.119F, -0.1376F));

		PartDefinition cube_r437 = rightOrbit.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(113, 55).mirror().addBox(-2.4345F, -0.693F, -6.4663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(86, 109).mirror().addBox(-2.4345F, -0.1977F, -6.4908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(81, 109).mirror().addBox(-2.4345F, -0.1977F, -6.2158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.8805F, -0.7717F, -0.6938F, -2.1075F, -0.0271F, 0.114F));

		PartDefinition cube_r438 = rightOrbit.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(91, 47).mirror().addBox(3.6811F, -0.1962F, -7.953F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8805F, -0.7717F, -0.6938F, -2.0098F, -0.3935F, -0.5295F));

		PartDefinition cube_r439 = rightOrbit.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(0, 106).mirror().addBox(-2.4345F, -0.1962F, -8.539F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.8805F, -0.7717F, -0.6938F, -2.1511F, -0.0271F, 0.114F));

		PartDefinition cube_r440 = rightOrbit.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(112, 75).mirror().addBox(-2.4345F, -1.5849F, -7.9804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8805F, -0.7717F, -0.6938F, -1.8457F, -0.0271F, 0.114F));

		PartDefinition cube_r441 = rightOrbit.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(112, 72).mirror().addBox(-2.4345F, -2.8119F, -7.0445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.8805F, -0.7717F, -0.6938F, -1.6711F, -0.0271F, 0.114F));

		PartDefinition cube_r442 = rightOrbit.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(96, 109).mirror().addBox(-2.4345F, -4.1061F, -5.773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.8805F, -0.7717F, -0.6938F, -1.453F, -0.0271F, 0.114F));

		PartDefinition cube_r443 = rightOrbit.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(74, 91).mirror().addBox(-0.5558F, -0.4281F, -4.6195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.8805F, -0.7717F, -0.6938F, -2.1096F, -0.1526F, -0.2261F));

		PartDefinition cube_r444 = rightOrbit.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(101, 112).mirror().addBox(-0.0432F, -0.7199F, -0.3197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.895F, -0.178F, -0.3567F, 1.8267F, -0.1006F, -0.2284F));

		PartDefinition cube_r445 = rightOrbit.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(34, 98).mirror().addBox(-0.1531F, 0.0494F, -0.2849F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.8805F, -0.7717F, -0.6938F, 0.7944F, -0.2634F, -0.3932F));

		PartDefinition cube_r446 = rightOrbit.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(109, 112).mirror().addBox(-0.5558F, 1.6337F, -1.3141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(66, 110).mirror().addBox(-0.5558F, 2.2337F, -1.3141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(101, 109).mirror().addBox(-0.5558F, 2.9337F, -1.3141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.8805F, -0.7717F, -0.6938F, 2.7163F, -0.1526F, -0.2261F));

		PartDefinition cube_r447 = rightOrbit.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(112, 99).mirror().addBox(-0.5558F, 3.1686F, -2.4207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(96, 112).mirror().addBox(-0.5558F, 3.1686F, -2.9207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(91, 112).mirror().addBox(-0.5558F, 2.9686F, -2.9207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.8805F, -0.7717F, -0.6938F, 3.0217F, -0.1526F, -0.2261F));

		PartDefinition cube_r448 = rightOrbit.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(61, 110).mirror().addBox(-0.5558F, -2.4899F, -3.6035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.8805F, -0.7717F, -0.6938F, -1.8216F, -0.1526F, -0.2261F));

		PartDefinition cube_r449 = rightOrbit.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(112, 87).mirror().addBox(-0.5558F, -3.4797F, 0.5536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.8805F, -0.7717F, -0.6938F, -0.5562F, -0.1526F, -0.2261F));

		PartDefinition cube_r450 = rightOrbit.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(86, 112).mirror().addBox(-0.5558F, -2.8712F, 0.3667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.8805F, -0.7717F, -0.6938F, -0.626F, -0.1526F, -0.2261F));

		PartDefinition cube_r451 = rightOrbit.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(112, 84).mirror().addBox(-0.1531F, 0.2334F, 1.2938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.8805F, -0.7717F, -0.6938F, 0.9166F, -0.2634F, -0.3932F));

		PartDefinition cube_r452 = rightOrbit.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(112, 81).mirror().addBox(-0.1531F, -0.2339F, 1.1912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8805F, -0.7717F, -0.6938F, 1.0038F, -0.2634F, -0.3932F));

		PartDefinition cube_r453 = rightOrbit.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(81, 112).mirror().addBox(-0.5558F, -2.5555F, 0.3738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.8805F, -0.7717F, -0.6938F, -0.277F, -0.1526F, -0.2261F));

		PartDefinition cube_r454 = rightOrbit.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(76, 112).mirror().addBox(-0.5558F, -2.2012F, -2.604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.8805F, -0.7717F, -0.6938F, -1.4551F, -0.1526F, -0.2261F));

		PartDefinition cube_r455 = rightOrbit.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(111, 78).mirror().addBox(-0.2377F, -2.7182F, -1.0458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4545F, -1.3813F, -2.3485F, -0.6303F, -0.6F, -0.0718F));

		PartDefinition cube_r456 = rightOrbit.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(76, 95).mirror().addBox(-0.2377F, -0.9868F, 0.6459F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.4545F, -1.3813F, -2.3485F, 0.7224F, -0.6F, -0.0718F));

		PartDefinition cube_r457 = rightOrbit.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(107, 100).mirror().addBox(0.3144F, 1.3657F, -0.3337F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(107, 86).mirror().addBox(-0.2856F, 1.3657F, -0.3337F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.5295F, -1.3813F, -1.9485F, 0.1391F, 0.1593F, 0.2106F));

		PartDefinition cube_r458 = rightOrbit.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(107, 104).mirror().addBox(0.3144F, 0.2339F, -3.0404F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(107, 82).mirror().addBox(-0.2856F, 0.2339F, -3.0404F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5295F, -1.3813F, -1.9485F, 1.099F, 0.1593F, 0.2106F));

		PartDefinition cube_r459 = rightOrbit.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(39, 87).mirror().addBox(0.2197F, -1.174F, -2.9196F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(25, 87).mirror().addBox(-0.3803F, -1.174F, -2.9196F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5295F, -1.3813F, -1.9485F, 1.5908F, 0.1601F, 0.1753F));

		PartDefinition cube_r460 = rightOrbit.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(90, 97).mirror().addBox(-0.3338F, 0.0431F, -1.8058F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(58, 96).mirror().addBox(-0.3338F, -0.5569F, -1.6558F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5295F, -1.3813F, -1.9485F, 1.1272F, 0.1314F, 0.2222F));

		PartDefinition cube_r461 = rightOrbit.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(96, 51).mirror().addBox(0.286F, -0.5685F, -1.6629F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5295F, -1.3813F, -1.9485F, 1.1404F, 0.1616F, 0.2378F));

		PartDefinition cube_r462 = rightOrbit.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(96, 42).mirror().addBox(-0.1966F, -0.2126F, -1.711F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5658F, -2.3313F, -2.2925F, 1.5618F, 0.4486F, -0.0286F));

		PartDefinition cube_r463 = rightOrbit.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(27, 96).mirror().addBox(-0.1882F, -0.2077F, -1.7105F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3751F, -3.9153F, -2.1861F, 1.492F, 0.4486F, 0.0936F));

		PartDefinition cube_r464 = rightOrbit.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(20, 96).mirror().addBox(-0.1882F, -0.2077F, -1.7105F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9114F, -3.785F, -1.9507F, 1.3538F, 0.4031F, -0.2384F));

		PartDefinition cube_r465 = rightOrbit.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(72, 28).mirror().addBox(-0.1977F, -0.2192F, -0.9954F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2218F, -6.6881F, -2.1538F, 1.3286F, 0.3302F, 0.3031F));

		PartDefinition cube_r466 = rightOrbit.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(70, 69).mirror().addBox(-0.3727F, -0.2192F, -0.1954F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1194F, -5.9828F, -2.2669F, 1.3335F, -0.2642F, 0.4461F));

		PartDefinition cube_r467 = rightOrbit.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(70, 64).mirror().addBox(-0.2F, -0.2F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4744F, -4.7886F, -2.1567F, 1.7343F, 0.3857F, 0.4066F));

		PartDefinition cube_r468 = rightOrbit.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(36, 57).mirror().addBox(-0.2014F, -0.7879F, -0.1134F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0752F, -3.6376F, -1.3933F, 1.7295F, -0.3041F, 0.2967F));

		PartDefinition cube_r469 = rightOrbit.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(7, 70).mirror().addBox(-0.2377F, -0.2865F, -0.2461F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.4545F, -1.3813F, -2.3485F, 1.3682F, -0.6F, -0.0718F));

		PartDefinition cube_r470 = rightOrbit.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(51, 94).mirror().addBox(-0.3513F, -0.632F, -1.6422F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5295F, -1.3813F, -1.9485F, 1.6385F, -0.5487F, -0.3719F));

		PartDefinition cube_r471 = rightOrbit.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(25, 112).mirror().addBox(-0.4621F, -0.4947F, -0.5031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4295F, -1.3813F, -1.9485F, 1.9048F, -0.5129F, -0.2194F));

		PartDefinition cube_r472 = rightOrbit.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(0.0006F, 2.0506F, -0.3718F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5295F, -1.3813F, -1.9485F, 0.0047F, 0.0956F, 0.2013F));

		PartDefinition cube_r473 = rightOrbit.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(104, 66).mirror().addBox(0.0006F, 5.8941F, -1.4168F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5295F, -1.3813F, -1.9485F, 0.1792F, 0.0956F, 0.2013F));

		PartDefinition cube_r474 = rightOrbit.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(15, 91).mirror().addBox(0.0006F, 8.6104F, -2.6409F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(106, 6).mirror().addBox(0.0006F, 9.2144F, -2.973F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5295F, -1.3813F, -1.9485F, 0.3188F, 0.0956F, 0.2013F));

		PartDefinition cube_r475 = rightOrbit.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(112, 102).mirror().addBox(0.0006F, 6.3629F, 10.6875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5295F, -1.3813F, -1.9485F, -0.8593F, 0.0956F, 0.2013F));

		PartDefinition cube_r476 = rightOrbit.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(112, 46).mirror().addBox(0.0006F, 11.0278F, -4.8752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(109, 22).mirror().addBox(0.0006F, 10.5278F, -4.8752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5295F, -1.3813F, -1.9485F, 0.4934F, 0.0956F, 0.2013F));

		PartDefinition cube_r477 = rightOrbit.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(104, 61).mirror().addBox(0.0006F, 6.3994F, -2.323F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5295F, -1.3813F, -1.9485F, 0.249F, 0.0956F, 0.2013F));

		PartDefinition cube_r478 = rightOrbit.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(25, 108).mirror().addBox(0.0006F, 4.684F, -1.2933F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5295F, -1.3813F, -1.9485F, 0.0919F, 0.0956F, 0.2013F));

		PartDefinition cube_r479 = rightOrbit.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(15, 108).mirror().addBox(0.0006F, 2.7864F, -0.8384F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5295F, -1.3813F, -1.9485F, -0.004F, 0.0956F, 0.2013F));

		PartDefinition cube_r480 = rightOrbit.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(44, 94).mirror().addBox(-0.1967F, -0.5627F, -1.6651F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8805F, -0.7717F, -0.6938F, -2.2391F, -0.3411F, -0.3319F));

		PartDefinition cube_r481 = rightOrbit.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(51, 103).mirror().addBox(-1.0F, -0.5522F, 0.1016F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.672F, 0.3595F, -0.3441F, 0.7432F, -0.1165F, -0.0872F));

		PartDefinition cube_r482 = rightOrbit.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(86, 84).mirror().addBox(-0.5F, -1.3F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1235F, -0.1003F, 1.7836F, 0.8485F, -0.1312F, -0.0764F));

		PartDefinition cube_r483 = rightOrbit.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(67, 87).mirror().addBox(-0.3F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4106F, -1.5833F, 3.0943F, 0.925F, 0.0049F, 0.0945F));

		PartDefinition cube_r484 = rightOrbit.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(46, 87).mirror().addBox(-1.0F, -0.5825F, -0.5657F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.672F, 0.3595F, -0.3441F, 0.4553F, -0.1165F, -0.0872F));

		PartDefinition cube_r485 = rightOrbit.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(23, 79).mirror().addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.7449F, -1.6527F, 1.6169F, 0.9599F, 0.0049F, 0.0945F));

		PartDefinition cube_r486 = rightOrbit.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(41, 79).mirror().addBox(-1.0F, -0.503F, 1.0705F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.672F, 0.3595F, -0.3441F, 0.7956F, -0.1165F, -0.0872F));

		PartDefinition cube_r487 = rightOrbit.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(5, 111).mirror().addBox(-0.1492F, 0.1014F, 0.12F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.895F, -0.178F, -0.3567F, -2.9426F, -0.1751F, -0.1652F));

		PartDefinition cube_r488 = rightOrbit.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(94, 38).mirror().addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.3018F, -0.3326F, -1.5879F, 2.568F, -0.1738F, -0.046F));

		PartDefinition cube_r489 = rightOrbit.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(37, 94).mirror().addBox(-0.1492F, -0.6797F, 0.1984F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.895F, -0.178F, -0.3567F, 2.5901F, -0.1751F, -0.1652F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 1.9509F, -0.9092F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r490 = jaw.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(0, 110).mirror().addBox(-0.6791F, 4.1341F, -0.6936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0485F, -0.0991F, -11.2187F, -2.2387F, 0.0168F, -0.0179F));

		PartDefinition cube_r491 = jaw.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(110, 90).mirror().addBox(-0.6791F, 4.0468F, -1.3223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(81, 91).mirror().addBox(-0.6791F, 2.4468F, -1.3223F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0485F, -0.0991F, -11.2187F, -2.1078F, 0.0168F, -0.0179F));

		PartDefinition cube_r492 = jaw.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(58, 105).mirror().addBox(-0.6791F, 2.5345F, -0.8874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.0485F, -0.0991F, -11.2187F, -2.195F, 0.0168F, -0.0179F));

		PartDefinition cube_r493 = jaw.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(102, 104).mirror().addBox(-0.6791F, -0.1738F, -1.1304F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0485F, -0.0991F, -11.2187F, -2.1427F, 0.0168F, -0.0179F));

		PartDefinition cube_r494 = jaw.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(82, 104).mirror().addBox(-0.6531F, -0.2419F, -1.5543F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0485F, -0.0991F, -11.2187F, -1.9862F, 0.0204F, -0.0287F));

		PartDefinition cube_r495 = jaw.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(73, 106).mirror().addBox(-1.1455F, 0.121F, -0.8825F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 104).mirror().addBox(-1.1455F, 1.721F, -0.2825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(104, 97).mirror().addBox(-1.1455F, 1.121F, -0.2825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.0485F, -0.0991F, -9.8187F, -2.1488F, -0.0732F, 0.0667F));

		PartDefinition cube_r496 = jaw.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(39, 83).mirror().addBox(-1.1455F, -1.0675F, -2.4052F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.0485F, -0.0991F, -9.8187F, -0.6391F, -0.0732F, 0.0667F));

		PartDefinition cube_r497 = jaw.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(48, 113).mirror().addBox(0.4985F, 8.1423F, -1.8125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0985F, 3.4009F, -1.9187F, -1.9286F, -0.0698F, 0.0175F));

		PartDefinition cube_r498 = jaw.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(100, 89).mirror().addBox(-1.1455F, -0.3642F, -2.564F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(99, 10).mirror().addBox(-1.1455F, 0.0358F, -2.564F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0485F, -0.0991F, -9.8187F, -0.9445F, -0.0732F, 0.0667F));

		PartDefinition cube_r499 = jaw.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(112, 15).mirror().addBox(-0.103F, -3.0352F, -1.9106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.0985F, 3.4009F, -1.9187F, -0.6458F, -0.192F, 0.0175F));

		PartDefinition cube_r500 = jaw.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(112, 0).mirror().addBox(-0.103F, -1.5531F, -1.0134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(111, 7).mirror().addBox(-0.103F, -0.9531F, -1.0134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.0985F, 3.4009F, -1.9187F, -1.2915F, -0.192F, 0.0175F));

		PartDefinition cube_r501 = jaw.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(108, 32).mirror().addBox(-0.103F, -4.7188F, -0.907F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.0985F, 3.4009F, -1.9187F, -0.0785F, -0.192F, 0.0175F));

		PartDefinition cube_r502 = jaw.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(68, 106).mirror().addBox(-0.103F, -4.8548F, -3.9747F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.0985F, 3.4009F, -1.9187F, -0.8203F, -0.192F, 0.0175F));

		PartDefinition cube_r503 = jaw.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(20, 104).mirror().addBox(-0.5F, -2.7519F, -0.5175F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6407F, -0.5568F, -7.2027F, -2.0535F, -0.0668F, -0.0288F));

		PartDefinition cube_r504 = jaw.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(105, 92).mirror().addBox(-0.5F, 0.2517F, -0.5262F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6407F, -0.5568F, -7.2027F, -2.0186F, -0.0668F, -0.0288F));

		PartDefinition cube_r505 = jaw.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(91, 109).mirror().addBox(-0.9455F, 0.2033F, -1.3153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.0485F, -0.0991F, -9.8187F, -1.8696F, -0.0732F, 0.0667F));

		PartDefinition cube_r506 = jaw.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(111, 12).mirror().addBox(0.4985F, 7.4096F, -2.6869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-3.0985F, 3.4009F, -1.9187F, -1.8239F, -0.0698F, 0.0175F));

		PartDefinition cube_r507 = jaw.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(107, 108).mirror().addBox(0.4985F, 5.8503F, -0.887F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0985F, 3.4009F, -1.9187F, -2.0595F, -0.0698F, 0.0175F));

		PartDefinition cube_r508 = jaw.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(107, 74).mirror().addBox(-0.078F, 2.7083F, -0.3934F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0985F, 3.4009F, -1.9187F, -1.9809F, -0.192F, 0.0175F));

		PartDefinition cube_r509 = jaw.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(89, 42).mirror().addBox(-0.078F, 1.4677F, -0.6177F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.0985F, 3.4009F, -1.9187F, -2.2864F, -0.192F, 0.0175F));

		PartDefinition cube_r510 = jaw.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(113, 37).mirror().addBox(-0.078F, 0.9619F, -0.5534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0985F, 3.4009F, -1.9187F, -1.7628F, -0.192F, 0.0175F));

		PartDefinition cube_r511 = jaw.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(108, 36).mirror().addBox(0.4985F, 4.6146F, -0.248F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0985F, 3.4009F, -1.9187F, -2.0159F, -0.0698F, 0.0175F));

		PartDefinition cube_r512 = jaw.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-1.0F, -0.5F, -0.525F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0002F, -0.4925F, -10.74F, -2.1139F, -0.0732F, 0.0667F));

		PartDefinition cube_r513 = jaw.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(79, 39).mirror().addBox(-0.9186F, -0.2467F, -0.4852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0485F, -0.0991F, -9.8187F, -2.0326F, -0.0535F, 0.1198F));

		PartDefinition cube_r514 = jaw.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(47, 57).mirror().addBox(0.4985F, 6.5825F, -0.1144F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0985F, 3.4009F, -1.9187F, -2.0333F, -0.0698F, 0.0175F));

		PartDefinition cube_r515 = jaw.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(108, 55).mirror().addBox(-0.103F, -3.9406F, -1.0863F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0985F, 3.4009F, -1.9187F, -0.6632F, -0.192F, 0.0175F));

		PartDefinition cube_r516 = jaw.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(45, 107).mirror().addBox(-0.103F, 1.2952F, -3.359F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.0985F, 3.4009F, -1.9187F, -1.3177F, -0.192F, 0.0175F));

		PartDefinition cube_r517 = jaw.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(15, 103).mirror().addBox(0.4985F, 2.8291F, -1.4222F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.0985F, 3.4009F, -1.9187F, -1.9722F, -0.0698F, 0.0175F));

		PartDefinition cube_r518 = jaw.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(72, 99).mirror().addBox(-0.103F, 0.0547F, -2.0075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0985F, 3.4009F, -1.9187F, -1.3003F, -0.192F, 0.0175F));

		PartDefinition cube_r519 = jaw.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(7, 64).mirror().addBox(-0.103F, -2.8616F, -1.7077F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.0985F, 3.4009F, -1.9187F, -0.1222F, -0.192F, 0.0175F));

		PartDefinition cube_r520 = jaw.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(56, 109).mirror().addBox(-0.103F, -1.1406F, -3.5346F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.0985F, 3.4009F, -1.9187F, -0.7767F, -0.192F, 0.0175F));

		PartDefinition cube_r521 = jaw.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(35, 109).mirror().addBox(-0.103F, -3.6474F, -3.2626F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0985F, 3.4009F, -1.9187F, -0.6021F, -0.192F, 0.0175F));

		PartDefinition cube_r522 = jaw.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(20, 104).addBox(-0.5F, -2.7519F, -0.5175F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4407F, -0.5568F, -7.2027F, -2.0535F, 0.0668F, 0.0288F));

		PartDefinition cube_r523 = jaw.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(0, 110).addBox(-0.3209F, 4.1341F, -0.6936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1515F, -0.0991F, -11.2187F, -2.2387F, -0.0168F, 0.0179F));

		PartDefinition cube_r524 = jaw.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(110, 90).addBox(-0.3209F, 4.0468F, -1.3223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(81, 91).addBox(-0.3209F, 2.4468F, -1.3223F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1515F, -0.0991F, -11.2187F, -2.1078F, -0.0168F, 0.0179F));

		PartDefinition cube_r525 = jaw.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(58, 105).addBox(-0.3209F, 2.5345F, -0.8874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.1515F, -0.0991F, -11.2187F, -2.195F, -0.0168F, 0.0179F));

		PartDefinition cube_r526 = jaw.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(102, 104).addBox(-0.3209F, -0.1738F, -1.1304F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1515F, -0.0991F, -11.2187F, -2.1427F, -0.0168F, 0.0179F));

		PartDefinition cube_r527 = jaw.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(82, 104).addBox(-0.3469F, -0.2419F, -1.5543F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1515F, -0.0991F, -11.2187F, -1.9862F, -0.0204F, 0.0287F));

		PartDefinition cube_r528 = jaw.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(105, 92).addBox(-0.5F, 0.2517F, -0.5262F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4407F, -0.5568F, -7.2027F, -2.0186F, 0.0668F, 0.0288F));

		PartDefinition cube_r529 = jaw.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(91, 109).addBox(-0.0545F, 0.2033F, -1.3153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1515F, -0.0991F, -9.8187F, -1.8696F, 0.0732F, -0.0667F));

		PartDefinition cube_r530 = jaw.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(48, 113).addBox(-1.4985F, 8.1423F, -1.8125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.8985F, 3.4009F, -1.9187F, -1.9286F, 0.0698F, -0.0175F));

		PartDefinition cube_r531 = jaw.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(111, 12).addBox(-1.4985F, 7.4096F, -2.6869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.8985F, 3.4009F, -1.9187F, -1.8239F, 0.0698F, -0.0175F));

		PartDefinition cube_r532 = jaw.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(107, 108).addBox(-1.4985F, 5.8503F, -0.887F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.8985F, 3.4009F, -1.9187F, -2.0595F, 0.0698F, -0.0175F));

		PartDefinition cube_r533 = jaw.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(107, 74).addBox(-0.922F, 2.7083F, -0.3934F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.8985F, 3.4009F, -1.9187F, -1.9809F, 0.192F, -0.0175F));

		PartDefinition cube_r534 = jaw.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(89, 42).addBox(-0.922F, 1.4677F, -0.6177F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.8985F, 3.4009F, -1.9187F, -2.2864F, 0.192F, -0.0175F));

		PartDefinition cube_r535 = jaw.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(113, 37).addBox(-0.922F, 0.9619F, -0.5534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.8985F, 3.4009F, -1.9187F, -1.7628F, 0.192F, -0.0175F));

		PartDefinition cube_r536 = jaw.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(108, 36).addBox(-1.4985F, 4.6146F, -0.248F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8985F, 3.4009F, -1.9187F, -2.0159F, 0.0698F, -0.0175F));

		PartDefinition cube_r537 = jaw.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(39, 83).addBox(-0.8545F, -1.0675F, -2.4052F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.1515F, -0.0991F, -9.8187F, -0.6391F, 0.0732F, -0.0667F));

		PartDefinition cube_r538 = jaw.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(100, 89).addBox(-0.8545F, -0.3642F, -2.564F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(99, 10).addBox(-0.8545F, 0.0358F, -2.564F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1515F, -0.0991F, -9.8187F, -0.9445F, 0.0732F, -0.0667F));

		PartDefinition cube_r539 = jaw.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(5, 104).addBox(-0.8545F, 1.721F, -0.2825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(73, 106).addBox(0.1455F, 0.121F, -0.8825F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(104, 97).addBox(-0.8545F, 1.121F, -0.2825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.1515F, -0.0991F, -9.8187F, -2.1488F, 0.0732F, -0.0667F));

		PartDefinition cube_r540 = jaw.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(0, 72).addBox(-1.0F, -0.5F, -0.525F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1998F, -0.4925F, -10.74F, -2.1139F, 0.0732F, -0.0667F));

		PartDefinition cube_r541 = jaw.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(79, 39).addBox(-0.0814F, -0.2467F, -0.4852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1515F, -0.0991F, -9.8187F, -2.0326F, 0.0535F, -0.1198F));

		PartDefinition cube_r542 = jaw.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(47, 57).addBox(-1.4985F, 6.5825F, -0.1144F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.8985F, 3.4009F, -1.9187F, -2.0333F, 0.0698F, -0.0175F));

		PartDefinition cube_r543 = jaw.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(108, 55).addBox(-0.897F, -3.9406F, -1.0863F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.8985F, 3.4009F, -1.9187F, -0.6632F, 0.192F, -0.0175F));

		PartDefinition cube_r544 = jaw.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(45, 107).addBox(-0.897F, 1.2952F, -3.359F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8985F, 3.4009F, -1.9187F, -1.3177F, 0.192F, -0.0175F));

		PartDefinition cube_r545 = jaw.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(15, 103).addBox(-1.4985F, 2.8291F, -1.4222F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8985F, 3.4009F, -1.9187F, -1.9722F, 0.0698F, -0.0175F));

		PartDefinition cube_r546 = jaw.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(72, 99).addBox(-0.897F, 0.0547F, -2.0075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8985F, 3.4009F, -1.9187F, -1.3003F, 0.192F, -0.0175F));

		PartDefinition cube_r547 = jaw.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(112, 15).addBox(-0.897F, -3.0352F, -1.9106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.8985F, 3.4009F, -1.9187F, -0.6458F, 0.192F, -0.0175F));

		PartDefinition cube_r548 = jaw.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(7, 64).addBox(-0.897F, -2.8616F, -1.7077F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.8985F, 3.4009F, -1.9187F, -0.1222F, 0.192F, -0.0175F));

		PartDefinition cube_r549 = jaw.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(56, 109).addBox(-0.897F, -1.1406F, -3.5346F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.8985F, 3.4009F, -1.9187F, -0.7767F, 0.192F, -0.0175F));

		PartDefinition cube_r550 = jaw.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(68, 106).addBox(-0.897F, -4.8548F, -3.9747F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.8985F, 3.4009F, -1.9187F, -0.8203F, 0.192F, -0.0175F));

		PartDefinition cube_r551 = jaw.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(108, 32).addBox(-0.897F, -4.7188F, -0.907F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.8985F, 3.4009F, -1.9187F, -0.0785F, 0.192F, -0.0175F));

		PartDefinition cube_r552 = jaw.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(35, 109).addBox(-0.897F, -3.6474F, -3.2626F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8985F, 3.4009F, -1.9187F, -0.6021F, 0.192F, -0.0175F));

		PartDefinition cube_r553 = jaw.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(112, 0).addBox(-0.897F, -1.5531F, -1.0134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 7).addBox(-0.897F, -0.9531F, -1.0134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.8985F, 3.4009F, -1.9187F, -1.2915F, 0.192F, -0.0175F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(23, 70).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(43, 62).addBox(0.0F, -0.7F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2964F, 0.0845F, -0.4747F, -0.1166F, 0.0597F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(94, 57).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(67, 64).addBox(0.0F, -0.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.031F, 2.9564F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(43, 65).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0513F, 2.0655F, -0.1698F, -0.2151F, 0.0366F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(66, 43).addBox(-0.5F, -0.3193F, -0.124F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1095F, 2.7879F, -0.2686F, -0.3375F, 0.0909F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(70, 37).addBox(-0.5F, -0.0943F, -0.024F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.2316F, 2.8957F, -0.3878F, -0.325F, 0.1297F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(45, 19).addBox(-0.5F, -0.0193F, -0.024F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.075F, 3.0F, -0.1806F, -0.2577F, 0.0465F));

		return LayerDefinition.create(meshdefinition, 120, 120);
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