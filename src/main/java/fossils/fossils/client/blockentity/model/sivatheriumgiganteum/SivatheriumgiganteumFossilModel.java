package fossils.fossils.client.blockentity.model.sivatheriumgiganteum;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SivatheriumgiganteumFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftArm6;
	private final ModelPart leftArm7;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightArm6;
	private final ModelPart rightArm7;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck5;
	private final ModelPart head;
	private final ModelPart leftHorn;
	private final ModelPart rightHorn;
	private final ModelPart leftMaxilla;
	private final ModelPart rightMaxilla;
	private final ModelPart leftFrontossicone;
	private final ModelPart rightFrontossicone;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public SivatheriumgiganteumFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftArm6 = this.leftLeg3.getChild("leftArm6");
		this.leftArm7 = this.leftArm6.getChild("leftArm7");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightArm6 = this.rightLeg3.getChild("rightArm6");
		this.rightArm7 = this.rightArm6.getChild("rightArm7");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body3 = this.body.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.chest = this.body4.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck4 = this.neck.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck5 = this.neck3.getChild("neck5");
		this.head = this.neck5.getChild("head");
		this.leftHorn = this.head.getChild("leftHorn");
		this.rightHorn = this.head.getChild("rightHorn");
		this.leftMaxilla = this.head.getChild("leftMaxilla");
		this.rightMaxilla = this.head.getChild("rightMaxilla");
		this.leftFrontossicone = this.head.getChild("leftFrontossicone");
		this.rightFrontossicone = this.head.getChild("rightFrontossicone");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -40.6644F, 21.9835F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(28, 51).addBox(0.0F, -1.8986F, 0.0389F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(96, 25).mirror().addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.2405F, -3.0239F, -7.9019F, -1.1556F, 0.1453F, -1.09F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(84, 0).mirror().addBox(-3.0F, -0.5F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6963F, -4.0901F, -6.7226F, -1.3741F, -0.404F, -0.3968F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(59, 76).mirror().addBox(-2.5F, -0.5F, -0.7F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5412F, -1.5456F, -6.4469F, -1.2886F, -0.4028F, 0.1988F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(75, 43).mirror().addBox(-4.0F, -1.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.6204F, -5.4043F, -0.4473F, 0.1198F, 1.0681F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(75, 106).mirror().addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.8648F, -1.3043F, -0.0465F, -0.063F, 0.4835F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(78, 121).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.7601F, -3.3016F, -0.5546F, 0.6015F, 0.7402F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(95, 0).mirror().addBox(-1.4F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.9296F, 4.8786F, -1.3869F, -0.4656F, 0.2574F, 0.9501F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(-4.0F, -1.0F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.0469F, -4.0025F, -0.5546F, 0.6015F, 0.7402F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(94, 21).mirror().addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.8648F, -1.3043F, 0.1864F, -0.0962F, 0.471F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(70, 82).mirror().addBox(-2.8833F, -0.1F, -0.0571F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6203F, 2.4358F, -2.4756F, 1.9086F, -0.8178F, 2.1841F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(94, 9).mirror().addBox(-1.2444F, -0.6F, -1.074F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3893F, 3.4319F, -2.0664F, 2.4113F, -0.679F, 1.3769F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(33, 75).mirror().addBox(-3.2F, -0.5F, -1.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9175F, 5.3625F, 2.1721F, 0.7363F, -0.8352F, -2.8697F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(53, 110).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5091F, 5.7334F, 0.5285F, 0.7704F, -0.8671F, -2.915F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(40, 110).mirror().addBox(2.2835F, -2.006F, 2.0361F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.7929F, 1.6698F, -2.4379F, 1.0623F, -1.0287F, 3.0113F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(5, 82).mirror().addBox(-0.2577F, -0.6F, -0.0181F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1205F, 2.9509F, -1.6147F, 2.2921F, -0.8222F, 1.5637F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(26, 92).mirror().addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.1519F, 0.42F, -4.6357F, -2.2292F, -0.4336F, 1.5301F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(110, 28).mirror().addBox(-3.2894F, -0.3309F, -0.1002F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7929F, -0.2302F, -4.0379F, -2.1019F, -0.6376F, 1.1991F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(110, 17).mirror().addBox(-2.8454F, -0.3309F, 0.5524F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7929F, -0.2302F, -4.0379F, -2.3396F, -0.2691F, 1.7229F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(83, 76).mirror().addBox(-0.5F, -0.5F, -0.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.45F, -1.4939F, -6.0387F, -1.473F, -0.4783F, 0.6257F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(23, 96).mirror().addBox(-3.8472F, 0.9791F, -3.6807F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7929F, -0.2302F, -4.0379F, -1.6338F, -0.4133F, 0.0315F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(90, 91).mirror().addBox(-1.6754F, -0.2677F, -0.831F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6763F, -3.2264F, -4.7796F, -1.5371F, -0.6116F, -0.0366F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(105, 120).mirror().addBox(-0.1742F, -0.3186F, -1.1218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6763F, -3.2264F, -4.7796F, -2.728F, -0.6841F, 1.2426F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(37, 60).mirror().addBox(-3.0138F, 0.1766F, -0.7315F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7929F, -0.2302F, -4.0379F, 3.0197F, -0.9031F, 1.6118F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(104, 87).mirror().addBox(-0.2098F, -0.3186F, -0.8407F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6763F, -3.2264F, -4.7796F, -1.3772F, -1.2478F, -0.2615F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(53, 110).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.5091F, 5.7334F, 0.5285F, 0.7704F, 0.8671F, 2.915F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(33, 75).addBox(-0.8F, -0.5F, -1.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9175F, 5.3625F, 2.1721F, 0.7363F, 0.8352F, 2.8697F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(40, 110).addBox(-4.2835F, -2.006F, 2.0361F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.7929F, 1.6698F, -2.4379F, 1.0623F, 1.0287F, -3.0113F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(70, 82).addBox(-0.1167F, -0.1F, -0.0571F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6203F, 2.4358F, -2.4756F, 1.9086F, 0.8178F, -2.1841F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(94, 9).addBox(-0.7556F, -0.6F, -1.074F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3893F, 3.4319F, -2.0664F, 2.4113F, 0.679F, -1.3769F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(5, 82).addBox(-2.7423F, -0.6F, -0.0181F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1205F, 2.9509F, -1.6147F, 2.2921F, 0.8222F, -1.5637F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(26, 92).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.1519F, 0.42F, -4.6357F, -2.2292F, 0.4336F, -1.5301F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(110, 28).addBox(1.2894F, -0.3309F, -0.1002F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7929F, -0.2302F, -4.0379F, -2.1019F, 0.6376F, -1.1991F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(110, 17).addBox(0.8454F, -0.3309F, 0.5524F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.7929F, -0.2302F, -4.0379F, -2.3396F, 0.2691F, -1.7229F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(59, 76).addBox(-1.5F, -0.5F, -0.7F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5412F, -1.5456F, -6.4469F, -1.2886F, 0.4028F, -0.1988F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(83, 76).addBox(-2.5F, -0.5F, -0.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.45F, -1.4939F, -6.0387F, -1.473F, 0.4783F, -0.6257F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(96, 25).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.2405F, -3.0239F, -7.9019F, -1.1556F, -0.1453F, 1.09F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(84, 0).addBox(0.0F, -0.5F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6963F, -4.0901F, -6.7226F, -1.3741F, 0.404F, 0.3968F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(23, 96).addBox(1.8472F, 0.9791F, -3.6807F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7929F, -0.2302F, -4.0379F, -1.6338F, 0.4133F, -0.0315F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(90, 91).addBox(-0.3246F, -0.2677F, -0.831F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6763F, -3.2264F, -4.7796F, -1.5371F, 0.6116F, 0.0366F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(105, 120).addBox(-0.8258F, -0.3186F, -1.1218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6763F, -3.2264F, -4.7796F, -2.728F, 0.6841F, -1.2426F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(37, 60).addBox(2.0138F, 0.1766F, -0.7315F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7929F, -0.2302F, -4.0379F, 3.0197F, 0.9031F, -1.6118F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(104, 87).addBox(-0.7902F, -0.3186F, -0.8407F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6763F, -3.2264F, -4.7796F, -1.3772F, 1.2478F, 0.2615F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(95, 0).addBox(-0.6F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.9296F, 4.8786F, -1.3869F, -0.4656F, -0.2574F, -0.9501F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(75, 43).addBox(0.0F, -1.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 4.6204F, -5.4043F, -0.4473F, -0.1198F, -1.0681F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(71, 0).addBox(0.0F, -1.0F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 6.0469F, -4.0025F, -0.5546F, -0.6015F, -0.7402F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(78, 121).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 6.7601F, -3.3016F, -0.5546F, -0.6015F, -0.7402F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(54, 90).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.7601F, -3.3016F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r49 = hips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(75, 106).addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 6.8648F, -1.3043F, -0.0465F, 0.063F, -0.4835F));

		PartDefinition cube_r50 = hips.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(54, 106).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 6.8648F, -1.3043F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r51 = hips.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(94, 21).addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 6.8648F, -1.3043F, 0.1864F, 0.0962F, -0.471F));

		PartDefinition cube_r52 = hips.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(104, 83).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.1801F, -1.4499F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r53 = hips.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(88, 124).addBox(0.0F, -1.3986F, -1.9611F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 11).addBox(-0.5F, -0.0986F, -2.9611F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9F, 4.969F, -2.7281F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 68).addBox(-2.0F, -5.4F, -0.7F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(85, 70).addBox(-1.0F, -3.4F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.255F, -0.4575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(106, 79).addBox(-1.0F, 0.2F, 0.6F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8786F, -0.1072F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(58, 95).addBox(-0.5F, -0.0653F, -0.7119F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.955F, -0.0575F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(28, 108).addBox(-0.5F, -0.5F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 12.4876F, -4.0068F, -1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(76, 64).addBox(-1.0F, -1.0F, -1.8F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 10.1159F, -1.9813F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(63, 96).addBox(-0.5F, 0.2021F, 0.2435F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 4.1652F, -1.7822F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(55, 80).addBox(-0.5F, -3.0893F, -0.106F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 4.1652F, -1.7822F, -0.1658F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.2991F, -2.351F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(22, 72).addBox(-1.0F, -0.2F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0743F, 1.9591F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(5, 86).addBox(-1.0F, -1.0F, -1.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(111, 39).addBox(-0.5F, -1.9F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 3.2314F, 1.0508F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(16, 82).addBox(-0.5F, -1.5F, -0.6F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 3.2314F, 1.0508F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 91).addBox(-1.0F, 4.2619F, -1.6332F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(21, 100).addBox(-0.5F, -0.5381F, -1.2332F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7131F, 0.5596F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(75, 110).addBox(-1.4F, -0.4662F, 0.0561F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 1.5475F, -0.6467F, 0.0175F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.0392F, -1.6483F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftLeg3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(100, 96).addBox(-0.5F, 0.0561F, -1.9789F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.0F, 1.3197F, 2.0521F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftLeg3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(40, 84).addBox(-0.5F, -5.9857F, -1.9115F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.3197F, 1.7521F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(78, 101).addBox(-0.5F, -1.9F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, 1.4488F, 0.6805F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftLeg3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(35, 108).addBox(-0.5F, -4.055F, -0.875F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 9.9339F, -0.0594F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftLeg3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(124, 9).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 11.0383F, -0.4199F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftLeg3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(104, 123).addBox(-0.5F, 0.9575F, 0.1299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(123, 92).addBox(-0.5F, 0.2575F, 0.1299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 9.8339F, -1.0594F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftLeg3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(49, 101).addBox(-0.5F, -0.0353F, -0.9248F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 5.9339F, 0.3406F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftLeg3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(31, 101).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.9339F, -0.7594F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftLeg3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(101, 69).addBox(-0.5F, 0.0664F, -0.0155F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.8339F, 0.5406F, -0.1396F, 0.0F, 0.0F));

		PartDefinition leftArm6 = leftLeg3.addOrReplaceChild("leftArm6", CubeListBuilder.create().texOffs(110, 6).addBox(-0.5F, -0.1039F, -0.5139F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0384F, 11.7675F, -0.2644F, 0.5672F, 0.0F, 0.0F));

		PartDefinition leftArm7 = leftArm6.addOrReplaceChild("leftArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6644F, 3.0552F, 0.4199F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftArm7.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(115, 68).addBox(-0.3056F, -0.5195F, -0.5346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.6F, -1.4F, 0.8731F, 0.0492F, 0.0179F));

		PartDefinition cube_r77 = leftArm7.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(103, 29).addBox(-2.1606F, -0.3284F, -2.3139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9027F, 0.3032F, 0.1545F, 0.2446F, 0.0511F, 0.0113F));

		PartDefinition cube_r78 = leftArm7.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(116, 83).addBox(-2.1606F, -1.0562F, -0.7321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9027F, 0.3532F, -0.4705F, 0.7421F, 0.0511F, 0.0113F));

		PartDefinition cube_r79 = leftArm7.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(63, 118).addBox(-0.5F, -0.5877F, -0.0856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1976F, 0.4039F, -1.0801F, 0.7367F, -0.0376F, 0.0312F));

		PartDefinition cube_r80 = leftArm7.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(117, 117).addBox(-0.5F, -0.2252F, -0.8223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(120, 44).addBox(-0.5F, -0.2252F, -0.2223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(58, 118).addBox(-0.5F, -0.9252F, -0.2223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.1976F, 0.3539F, -0.4551F, 0.2392F, -0.0376F, 0.0312F));

		PartDefinition cube_r81 = leftArm7.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(69, 116).addBox(-0.0875F, -0.1965F, -0.8844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5921F, 0.0826F, -1.3533F, 0.9303F, -0.3158F, -0.32F));

		PartDefinition cube_r82 = leftArm7.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(20, 119).addBox(-0.0773F, -0.1722F, -0.9306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5976F, 0.4539F, -1.1551F, 0.2621F, -0.4184F, -0.0682F));

		PartDefinition cube_r83 = leftArm7.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(39, 117).addBox(-0.2899F, -0.5206F, -0.5342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0115F, -0.2793F, -0.3571F, 0.4362F, 0.0522F, -0.0046F));

		PartDefinition cube_r84 = leftArm7.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(116, 35).addBox(-0.706F, -0.4641F, -0.4548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0115F, -0.2793F, -0.3571F, 0.4313F, -0.0265F, 0.0411F));

		PartDefinition cube_r85 = leftArm7.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(38, 120).addBox(-0.5F, -0.9252F, -0.2223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F))
				.texOffs(44, 118).addBox(-0.5F, -0.2252F, -0.8223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(122, 110).addBox(-0.5F, -0.2252F, -0.2223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.4031F, 0.3539F, -0.4551F, 0.2392F, 0.0376F, -0.0312F));

		PartDefinition cube_r86 = leftArm7.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(117, 31).addBox(-0.7101F, -0.5206F, -0.5342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1939F, -0.2793F, -0.3571F, 0.4362F, -0.0522F, 0.0046F));

		PartDefinition cube_r87 = leftArm7.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(117, 28).addBox(-0.294F, -0.4641F, -0.4548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1939F, -0.2793F, -0.3571F, 0.4313F, 0.0265F, -0.0411F));

		PartDefinition cube_r88 = leftArm7.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(123, 0).addBox(-0.9227F, -0.1722F, -0.9306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.8031F, 0.4539F, -1.1551F, 0.2621F, 0.4184F, 0.0682F));

		PartDefinition cube_r89 = leftArm7.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(117, 20).addBox(-0.9125F, -0.1965F, -0.8844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7975F, 0.0826F, -1.3533F, 0.9303F, 0.3158F, 0.32F));

		PartDefinition cube_r90 = leftArm7.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(33, 120).addBox(-0.5F, -0.5877F, -0.0856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4031F, 0.4039F, -1.0801F, 0.7367F, 0.0376F, -0.0312F));

		PartDefinition cube_r91 = leftArm7.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(116, 41).addBox(1.1607F, -1.0562F, -0.7321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6973F, 0.3532F, -0.4705F, 0.7421F, -0.0511F, -0.0113F));

		PartDefinition cube_r92 = leftArm7.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(88, 121).addBox(1.1606F, -0.4284F, -1.0139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5973F, 0.3032F, 0.1545F, 0.2446F, -0.0511F, -0.0113F));

		PartDefinition cube_r93 = leftArm7.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(104, 0).addBox(1.1607F, -0.3284F, -2.3139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6973F, 0.3032F, 0.1545F, 0.2446F, -0.0511F, -0.0113F));

		PartDefinition cube_r94 = leftArm7.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(116, 3).addBox(-0.6944F, -0.5195F, -0.5346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2055F, 0.6F, -1.4F, 0.8731F, -0.0492F, -0.0179F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9F, 4.969F, -2.7281F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(69, 55).addBox(-1.0F, -5.4F, -0.7F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(87, 60).addBox(-1.0F, -3.4F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.255F, -0.4575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(21, 107).addBox(-1.0F, 0.2F, 0.6F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8786F, -0.1072F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(96, 59).addBox(-0.5F, -0.0653F, -0.7119F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.955F, -0.0575F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(108, 46).addBox(-0.5F, -0.5F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 12.4876F, -4.0068F, -1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(72, 76).addBox(-1.0F, -1.0F, -1.8F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 10.1159F, -1.9813F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(68, 96).addBox(-0.5F, 0.2021F, 0.2435F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 4.1652F, -1.7822F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(60, 80).addBox(-0.5F, -3.0893F, -0.106F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 4.1652F, -1.7822F, -0.1658F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.2991F, -2.351F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(76, 34).addBox(-1.0F, -0.2F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0743F, 1.9591F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(87, 65).addBox(-1.0F, -1.0F, -1.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(107, 112).addBox(-0.5F, -1.9F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 3.2314F, 1.0508F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(21, 83).addBox(-0.5F, -1.5F, -0.6F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 3.2314F, 1.0508F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(63, 91).addBox(-1.0F, 4.2619F, -1.6332F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(26, 100).addBox(-0.5F, -0.5381F, -1.2332F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7131F, 0.5596F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(97, 112).addBox(0.4F, -0.4662F, 0.0561F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 1.5475F, -0.6467F, 0.0175F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.0392F, -1.6483F, -1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(101, 47).addBox(-0.5F, 0.0561F, -1.9789F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.0F, 1.3197F, 2.0521F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(47, 84).addBox(-0.5F, -5.9857F, -1.9115F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.3197F, 1.7521F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(100, 101).addBox(-0.5F, -1.9F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, 1.4488F, 0.6805F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightLeg3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(48, 108).addBox(-0.5F, -4.055F, -0.875F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 9.9339F, -0.0594F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightLeg3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(124, 35).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 11.0383F, -0.4199F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r113 = rightLeg3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(124, 32).addBox(-0.5F, 0.9575F, 0.1299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(124, 22).addBox(-0.5F, 0.2575F, 0.1299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 9.8339F, -1.0594F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r114 = rightLeg3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(101, 58).addBox(-0.5F, -0.0353F, -0.9248F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 5.9339F, 0.3406F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r115 = rightLeg3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(36, 101).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.9339F, -0.7594F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r116 = rightLeg3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(101, 76).addBox(-0.5F, 0.0664F, -0.0155F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.8339F, 0.5406F, -0.1396F, 0.0F, 0.0F));

		PartDefinition rightArm6 = rightLeg3.addOrReplaceChild("rightArm6", CubeListBuilder.create().texOffs(7, 110).addBox(-0.5F, -0.1039F, -0.5139F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0384F, 11.7675F, -0.2644F));

		PartDefinition rightArm7 = rightArm6.addOrReplaceChild("rightArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6644F, 3.0552F, 0.4199F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r117 = rightArm7.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(115, 71).addBox(-0.6944F, -0.5195F, -0.5346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.6F, -1.4F, 0.8731F, -0.0492F, -0.0179F));

		PartDefinition cube_r118 = rightArm7.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(61, 103).addBox(1.1606F, -0.3284F, -2.3139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.9027F, 0.3032F, 0.1545F, 0.2446F, -0.0511F, -0.0113F));

		PartDefinition cube_r119 = rightArm7.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(117, 17).addBox(1.1606F, -1.0562F, -0.7321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.9027F, 0.3532F, -0.4705F, 0.7421F, -0.0511F, -0.0113F));

		PartDefinition cube_r120 = rightArm7.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(118, 77).addBox(-0.5F, -0.5877F, -0.0856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1976F, 0.4039F, -1.0801F, 0.7367F, 0.0376F, -0.0312F));

		PartDefinition cube_r121 = rightArm7.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(28, 118).addBox(-0.5F, -0.2252F, -0.8223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(94, 120).addBox(-0.5F, -0.2252F, -0.2223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(118, 74).addBox(-0.5F, -0.9252F, -0.2223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.1976F, 0.3539F, -0.4551F, 0.2392F, 0.0376F, -0.0312F));

		PartDefinition cube_r122 = rightArm7.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(10, 117).addBox(-0.9125F, -0.1965F, -0.8844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5921F, 0.0826F, -1.3533F, 0.9303F, 0.3158F, 0.32F));

		PartDefinition cube_r123 = rightArm7.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(119, 104).addBox(-0.9227F, -0.1722F, -0.9306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5976F, 0.4539F, -1.1551F, 0.2621F, 0.4184F, 0.0682F));

		PartDefinition cube_r124 = rightArm7.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(117, 111).addBox(-0.7101F, -0.5206F, -0.5342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0115F, -0.2793F, -0.3571F, 0.4362F, -0.0522F, 0.0046F));

		PartDefinition cube_r125 = rightArm7.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(116, 38).addBox(-0.294F, -0.4641F, -0.4548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0115F, -0.2793F, -0.3571F, 0.4313F, 0.0265F, -0.0411F));

		PartDefinition cube_r126 = rightArm7.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(120, 70).addBox(-0.5F, -0.9252F, -0.2223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F))
				.texOffs(74, 118).addBox(-0.5F, -0.2252F, -0.8223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(122, 116).addBox(-0.5F, -0.2252F, -0.2223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.4031F, 0.3539F, -0.4551F, 0.2392F, -0.0376F, 0.0312F));

		PartDefinition cube_r127 = rightArm7.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(107, 117).addBox(-0.2899F, -0.5206F, -0.5342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.1939F, -0.2793F, -0.3571F, 0.4362F, 0.0522F, -0.0046F));

		PartDefinition cube_r128 = rightArm7.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(95, 117).addBox(-0.706F, -0.4641F, -0.4548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.1939F, -0.2793F, -0.3571F, 0.4313F, -0.0265F, 0.0411F));

		PartDefinition cube_r129 = rightArm7.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(123, 73).addBox(-0.0773F, -0.1722F, -0.9306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.8031F, 0.4539F, -1.1551F, 0.2621F, -0.4184F, -0.0682F));

		PartDefinition cube_r130 = rightArm7.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(53, 117).addBox(-0.0875F, -0.1965F, -0.8844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.7975F, 0.0826F, -1.3533F, 0.9303F, -0.3158F, -0.32F));

		PartDefinition cube_r131 = rightArm7.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(120, 67).addBox(-0.5F, -0.5877F, -0.0856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.4031F, 0.4039F, -1.0801F, 0.7367F, -0.0376F, 0.0312F));

		PartDefinition cube_r132 = rightArm7.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(0, 117).addBox(-2.1607F, -1.0562F, -0.7321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6973F, 0.3532F, -0.4705F, 0.7421F, 0.0511F, 0.0113F));

		PartDefinition cube_r133 = rightArm7.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(68, 122).addBox(-2.1606F, -0.4284F, -1.0139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5973F, 0.3032F, 0.1545F, 0.2446F, 0.0511F, 0.0113F));

		PartDefinition cube_r134 = rightArm7.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(14, 104).addBox(-2.1607F, -0.3284F, -2.3139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6973F, 0.3032F, 0.1545F, 0.2446F, 0.0511F, 0.0113F));

		PartDefinition cube_r135 = rightArm7.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(20, 116).addBox(-0.3056F, -0.5195F, -0.5346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2055F, 0.6F, -1.4F, 0.8731F, 0.0492F, 0.0179F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.7071F, -6.3562F, 0.035F, 0.0872F, 0.0031F));

		PartDefinition cube_r136 = body2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(93, 123).addBox(0.0F, -1.3793F, -0.0345F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9966F, -0.6386F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r137 = body2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(110, 120).addBox(0.0F, -1.8736F, 0.0944F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3966F, -2.7386F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r138 = body2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(54, 120).addBox(0.0F, -0.9F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2966F, -5.8386F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r139 = body2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(114, 15).mirror().addBox(-2.0905F, -0.0585F, -0.4833F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8156F, -0.1891F, -0.3343F, -0.2024F, -0.1463F, -0.273F));

		PartDefinition cube_r140 = body2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(113, 44).mirror().addBox(-1.4485F, -0.3465F, 0.4902F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 60).mirror().addBox(-1.6729F, -0.1798F, -1.4902F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0619F, -0.218F, -3.4137F, -0.2024F, -0.1463F, -0.273F));

		PartDefinition cube_r141 = body2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(114, 15).addBox(0.0905F, -0.0585F, -0.4833F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8156F, -0.1891F, -0.3343F, -0.2024F, 0.1463F, 0.273F));

		PartDefinition cube_r142 = body2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(113, 44).addBox(-0.5515F, -0.3465F, 0.4902F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 60).addBox(-0.3271F, -0.1798F, -1.4902F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0619F, -0.218F, -3.4137F, -0.2024F, 0.1463F, 0.273F));

		PartDefinition cube_r143 = body2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(13, 51).addBox(-1.0F, -0.1512F, 8.7474F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4656F, -13.1997F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7124F, -4.7618F, -0.2708F, 0.042F, -0.0117F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(105, 26).mirror().addBox(-6.0504F, -0.7529F, -0.3985F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1206F, -1.6644F, -0.3183F, 0.3896F, -1.104F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(105, 24).mirror().addBox(-3.1414F, 0.0623F, -0.3985F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1206F, -1.6644F, -0.2036F, 0.4577F, -0.8265F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(89, 19).mirror().addBox(-9.2753F, -3.0572F, -0.3985F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1206F, -1.6644F, -0.4412F, 0.2388F, -1.4959F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(105, 15).mirror().addBox(-3.1091F, 0.1003F, -0.4998F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1794F, -3.5644F, -0.2036F, 0.4577F, -0.8265F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(105, 13).mirror().addBox(-6.0291F, -0.7078F, -0.4998F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1794F, -3.5644F, -0.3183F, 0.3896F, -1.104F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(69, 62).mirror().addBox(-11.2733F, -3.0073F, -0.4998F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1794F, -3.5644F, -0.4412F, 0.2388F, -1.4959F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(104, 44).mirror().addBox(-2.9712F, -0.0432F, -0.4877F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4794F, -5.6644F, -0.1819F, 0.4878F, -0.7122F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(103, 33).mirror().addBox(-5.8588F, -0.8107F, -0.4877F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4794F, -5.6644F, -0.3072F, 0.424F, -0.9952F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(57, 34).mirror().addBox(-13.0763F, -3.0355F, -0.4877F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4794F, -5.6644F, -0.4451F, 0.2744F, -1.3925F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(105, 26).addBox(3.0504F, -0.7529F, -0.3985F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1206F, -1.6644F, -0.3183F, -0.3896F, 1.104F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(105, 24).addBox(0.1414F, 0.0623F, -0.3985F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1206F, -1.6644F, -0.2036F, -0.4577F, 0.8265F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(89, 19).addBox(5.2753F, -3.0572F, -0.3985F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1206F, -1.6644F, -0.4412F, -0.2388F, 1.4959F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(105, 15).addBox(0.1091F, 0.1003F, -0.4998F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1794F, -3.5644F, -0.2036F, -0.4577F, 0.8265F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(105, 13).addBox(3.0291F, -0.7078F, -0.4998F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1794F, -3.5644F, -0.3183F, -0.3896F, 1.104F));

		PartDefinition cube_r158 = body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(69, 62).addBox(5.2733F, -3.0073F, -0.4998F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1794F, -3.5644F, -0.4412F, -0.2388F, 1.4959F));

		PartDefinition cube_r159 = body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(104, 44).addBox(-0.0288F, -0.0432F, -0.4877F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4794F, -5.6644F, -0.1819F, -0.4878F, 0.7122F));

		PartDefinition cube_r160 = body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(103, 33).addBox(2.8588F, -0.8107F, -0.4877F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4794F, -5.6644F, -0.3072F, -0.424F, 0.9952F));

		PartDefinition cube_r161 = body.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(57, 34).addBox(5.0763F, -3.0355F, -0.4877F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4794F, -5.6644F, -0.4451F, -0.2744F, 1.3925F));

		PartDefinition cube_r162 = body.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(15, 121).addBox(0.0F, -2.9752F, -0.1023F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.396F, -6.057F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r163 = body.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(119, 120).addBox(0.0F, -2.5594F, -0.0812F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.696F, -2.057F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r164 = body.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(116, 120).addBox(0.0F, -2.7938F, -0.0713F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.596F, -3.957F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r165 = body.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(21, 23).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2869F, -6.9009F, 0.131F, 0.0433F, 0.0057F));

		PartDefinition cube_r166 = body3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(96, 123).addBox(0.0F, -2.0489F, 0.014F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.096F, -5.057F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r167 = body3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(113, 120).addBox(-0.001F, -5.0136F, -0.3366F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.096F, -5.057F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r168 = body3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(50, 114).addBox(0.0F, -3.8237F, -0.064F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.396F, -1.057F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r169 = body3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(17, 34).addBox(0.0F, -4.3004F, -0.0664F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.396F, -3.057F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r170 = body3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(44, 6).mirror().addBox(-14.1045F, -3.0252F, -0.5004F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3794F, -0.5644F, -0.4872F, 0.1406F, -1.3145F));

		PartDefinition cube_r171 = body3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(106, 73).mirror().addBox(-5.8808F, -0.7903F, -0.5004F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3794F, -0.5644F, -0.4019F, 0.3153F, -0.9428F));

		PartDefinition cube_r172 = body3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(106, 71).mirror().addBox(-2.9872F, -0.0177F, -0.5004F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3794F, -0.5644F, -0.3086F, 0.407F, -0.6804F));

		PartDefinition cube_r173 = body3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(40, 41).mirror().addBox(-15.1587F, -3.1108F, -0.3243F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6794F, -4.6644F, -0.4805F, 0.166F, -1.3134F));

		PartDefinition cube_r174 = body3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(103, 22).mirror().addBox(-5.9641F, -0.8478F, -0.3243F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6794F, -4.6644F, -0.3856F, 0.3365F, -0.9376F));

		PartDefinition cube_r175 = body3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(107, 35).mirror().addBox(-3.0825F, -0.0518F, -0.3243F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6794F, -4.6644F, -0.2863F, 0.4233F, -0.6714F));

		PartDefinition cube_r176 = body3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(40, 39).mirror().addBox(-15.1555F, -3.0609F, -0.4123F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4794F, -2.6644F, -0.4782F, 0.1744F, -1.3131F));

		PartDefinition cube_r177 = body3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(107, 4).mirror().addBox(-5.9416F, -0.8032F, -0.4123F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4794F, -2.6644F, -0.3801F, 0.3435F, -0.9357F));

		PartDefinition cube_r178 = body3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(103, 11).mirror().addBox(-3.0493F, -0.0144F, -0.4123F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4794F, -2.6644F, -0.2788F, 0.4288F, -0.6683F));

		PartDefinition cube_r179 = body3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(106, 71).addBox(-0.0128F, -0.0177F, -0.5004F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3794F, -0.5644F, -0.3086F, -0.407F, 0.6804F));

		PartDefinition cube_r180 = body3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(106, 73).addBox(2.8808F, -0.7903F, -0.5004F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3794F, -0.5644F, -0.4019F, -0.3153F, 0.9428F));

		PartDefinition cube_r181 = body3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(44, 6).addBox(5.1045F, -3.0252F, -0.5004F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3794F, -0.5644F, -0.4872F, -0.1406F, 1.3145F));

		PartDefinition cube_r182 = body3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(103, 11).addBox(0.0493F, -0.0144F, -0.4123F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4794F, -2.6644F, -0.2788F, -0.4288F, 0.6683F));

		PartDefinition cube_r183 = body3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(107, 4).addBox(2.9416F, -0.8032F, -0.4123F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4794F, -2.6644F, -0.3801F, -0.3435F, 0.9357F));

		PartDefinition cube_r184 = body3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(40, 39).addBox(5.1555F, -3.0609F, -0.4123F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4794F, -2.6644F, -0.4782F, -0.1744F, 1.3131F));

		PartDefinition cube_r185 = body3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(107, 35).addBox(0.0825F, -0.0518F, -0.3243F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6794F, -4.6644F, -0.2863F, -0.4233F, 0.6714F));

		PartDefinition cube_r186 = body3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(103, 22).addBox(2.9641F, -0.8478F, -0.3243F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6794F, -4.6644F, -0.3856F, -0.3365F, 0.9376F));

		PartDefinition cube_r187 = body3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(40, 41).addBox(5.1587F, -3.1108F, -0.3243F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6794F, -4.6644F, -0.4805F, -0.166F, 1.3134F));

		PartDefinition cube_r188 = body3.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(47, 43).addBox(-1.0F, -1.0F, -11.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 6.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6F, -5.0F, 0.0437F, 0.0436F, 0.0019F));

		PartDefinition cube_r189 = body4.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(0, 34).addBox(-1.0F, -1.0F, -17.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.9F, 11.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r190 = body4.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(82, 124).addBox(0.0F, -1.812F, -0.0503F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3761F, -2.0112F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r191 = body4.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(36, 114).addBox(-0.001F, -5.6601F, -0.5244F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3761F, -2.0112F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r192 = body4.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(79, 124).addBox(0.0F, -1.9924F, 1.7691F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 124).addBox(0.0F, -1.6952F, -0.1102F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0761F, -5.9112F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r193 = body4.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(66, 111).addBox(-0.001F, -7.3201F, 1.1805F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 111).addBox(-0.001F, -6.5315F, -0.551F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0761F, -5.9112F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r194 = body4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(42, 17).mirror().addBox(-15.2777F, -3.0829F, -0.3109F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3033F, -1.5756F, -0.4983F, 0.0984F, -1.3158F));

		PartDefinition cube_r195 = body4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(106, 69).mirror().addBox(-6.0627F, -0.7756F, -0.3109F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3033F, -1.5756F, -0.4286F, 0.2799F, -0.9506F));

		PartDefinition cube_r196 = body4.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(106, 62).mirror().addBox(-3.1591F, 0.0435F, -0.3109F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3033F, -1.5756F, -0.3452F, 0.3793F, -0.6944F));

		PartDefinition cube_r197 = body4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(107, 37).mirror().addBox(-3.0026F, -0.1532F, -0.3361F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8033F, -3.5756F, -0.3809F, 0.3511F, -0.7072F));

		PartDefinition cube_r198 = body4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(107, 99).mirror().addBox(-5.8606F, -0.9251F, -0.3361F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8033F, -3.5756F, -0.4547F, 0.2443F, -0.9574F));

		PartDefinition cube_r199 = body4.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(42, 19).mirror().addBox(-15.0333F, -3.1415F, -0.3361F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8033F, -3.5756F, -0.5093F, 0.0562F, -1.3166F));

		PartDefinition cube_r200 = body4.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(106, 60).mirror().addBox(-2.8971F, -0.1273F, -0.5187F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0033F, -5.5756F, -0.3809F, 0.3511F, -0.7072F));

		PartDefinition cube_r201 = body4.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(106, 58).mirror().addBox(-5.7654F, -0.8728F, -0.5187F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0033F, -5.5756F, -0.4547F, 0.2443F, -0.9574F));

		PartDefinition cube_r202 = body4.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(44, 4).mirror().addBox(-13.9661F, -3.0561F, -0.5187F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0033F, -5.5756F, -0.5093F, 0.0562F, -1.3166F));

		PartDefinition cube_r203 = body4.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(106, 62).addBox(0.1591F, 0.0435F, -0.3109F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3033F, -1.5756F, -0.3452F, -0.3793F, 0.6944F));

		PartDefinition cube_r204 = body4.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(106, 69).addBox(3.0627F, -0.7756F, -0.3109F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3033F, -1.5756F, -0.4286F, -0.2799F, 0.9506F));

		PartDefinition cube_r205 = body4.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(42, 17).addBox(5.2777F, -3.0829F, -0.3109F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3033F, -1.5756F, -0.4983F, -0.0984F, 1.3158F));

		PartDefinition cube_r206 = body4.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(42, 19).addBox(5.0333F, -3.1415F, -0.3361F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8033F, -3.5756F, -0.5093F, -0.0562F, 1.3166F));

		PartDefinition cube_r207 = body4.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(107, 99).addBox(2.8607F, -0.9251F, -0.3361F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8033F, -3.5756F, -0.4547F, -0.2443F, 0.9574F));

		PartDefinition cube_r208 = body4.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(107, 37).addBox(0.0026F, -0.1532F, -0.3361F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8033F, -3.5756F, -0.3809F, -0.3511F, 0.7072F));

		PartDefinition cube_r209 = body4.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(44, 4).addBox(4.9661F, -3.0561F, -0.5187F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0033F, -5.5756F, -0.5093F, -0.0562F, 1.3166F));

		PartDefinition cube_r210 = body4.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(106, 58).addBox(2.7654F, -0.8728F, -0.5187F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0033F, -5.5756F, -0.4547F, -0.2443F, 0.9574F));

		PartDefinition cube_r211 = body4.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(106, 60).addBox(-0.1029F, -0.1273F, -0.5187F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0033F, -5.5756F, -0.3809F, -0.3511F, 0.7072F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.25F, -6.1236F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(124, 95).addBox(0.0F, -1.649F, 1.9703F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(124, 62).addBox(0.0F, -1.4226F, -0.0168F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0412F, -3.8455F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(60, 111).addBox(-0.001F, -5.6464F, 1.5639F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 112).addBox(-0.001F, -3.8972F, -0.2904F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4412F, -3.8455F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(121, 34).addBox(-0.001F, -4.1709F, -0.3591F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5588F, -5.7455F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(124, 50).addBox(0.0F, -1.2163F, -0.0649F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5588F, -5.7455F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(28, 121).addBox(0.0F, -3.0352F, -0.0576F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1588F, -7.4455F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(25, 0).mirror().addBox(-11.384F, -0.4337F, -0.5333F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 13.4185F, 9.9057F, 0.3551F, 0.6221F, 0.8261F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(25, 2).mirror().addBox(-10.184F, -0.4337F, -0.5333F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 13.4185F, 9.9057F, 0.27F, 0.5901F, 0.7029F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(44, 8).mirror().addBox(-8.984F, -0.4337F, -0.5333F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 13.4185F, 9.9057F, 0.2112F, 0.4361F, 0.6202F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(57, 32).mirror().addBox(-8.1049F, -0.0413F, 0.1652F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 13.4185F, 8.2057F, 0.1722F, 0.3637F, 0.5278F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(58, 51).mirror().addBox(-7.4265F, -0.1188F, -0.4895F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 14.1185F, 6.5057F, 0.159F, 0.3694F, 0.4909F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(57, 36).mirror().addBox(-7.4191F, 0.0183F, -0.2881F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 14.4185F, 4.1057F, 0.1787F, 0.3606F, 0.5462F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(52, 0).mirror().addBox(-7.3169F, -0.0437F, -0.2411F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 14.8185F, 1.9057F, 0.1466F, 0.3403F, 0.4485F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(41, 106).mirror().addBox(0.0366F, -2.4195F, -6.2274F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6366F, 3.8452F, -2.4944F, 1.9681F, -0.2314F, 0.204F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(109, 107).mirror().addBox(0.0366F, 3.4863F, -1.2706F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-5.6366F, 3.8452F, -2.4944F, 2.8407F, -0.2314F, 0.204F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(51, 95).mirror().addBox(0.0366F, 3.0039F, -2.4761F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6366F, 3.8452F, -2.4944F, -3.0934F, -0.2314F, 0.204F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(94, 76).mirror().addBox(0.0366F, 2.891F, -1.2569F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.6366F, 3.8452F, -2.4944F, -2.9625F, -0.2314F, 0.204F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(100, 35).mirror().addBox(0.0366F, 3.9313F, -0.2928F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(28, 60).mirror().addBox(0.0366F, -3.045F, 0.3982F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-5.6366F, 3.8452F, -2.4944F, -2.7879F, -0.2314F, 0.204F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(73, 121).mirror().addBox(0.0366F, 5.1714F, -0.1583F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.6366F, 3.8452F, -2.4944F, -2.4825F, -0.2314F, 0.204F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(63, 121).mirror().addBox(0.0366F, 4.9504F, -1.8496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6366F, 3.8452F, -2.4944F, -2.0462F, -0.2314F, 0.204F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(0.0366F, -2.754F, -1.4861F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-5.6366F, 3.8452F, -2.4944F, 1.2699F, -0.2314F, 0.204F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(94, 70).mirror().addBox(0.0366F, -6.7785F, -0.7724F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6366F, 3.8452F, -2.4944F, 2.7797F, -0.2314F, 0.204F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(50, 2).mirror().addBox(-14.1435F, -3.0662F, -0.4093F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1382F, -1.4099F, -0.4287F, 0.3513F, -1.3001F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(108, 50).mirror().addBox(-5.9327F, -0.8127F, -0.4093F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1382F, -1.4099F, -0.2574F, 0.4885F, -0.886F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(109, 105).mirror().addBox(-3.0431F, -0.026F, -0.4093F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1382F, -1.4099F, -0.1116F, 0.5369F, -0.5904F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(58, 53).mirror().addBox(-9.8978F, -0.7765F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.1382F, -6.8099F, 0.1221F, 0.1011F, -1.3421F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(105, 67).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.1382F, -6.8099F, 0.144F, 0.0662F, -1.0817F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(105, 65).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4382F, -4.8099F, -0.2758F, 0.4391F, -0.719F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(105, 56).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4382F, -4.8099F, -0.3802F, 0.3542F, -0.9878F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(83, 80).mirror().addBox(-9.1256F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4382F, -4.8099F, -0.4823F, 0.1843F, -1.3658F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(42, 21).mirror().addBox(-14.1256F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7382F, -3.2099F, -0.4457F, 0.2924F, -1.3055F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(105, 54).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7382F, -3.2099F, -0.3001F, 0.4408F, -0.9051F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(105, 52).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7382F, -3.2099F, -0.1695F, 0.5022F, -0.6192F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(56, 56).mirror().addBox(0.0366F, -1.0586F, -6.4381F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6366F, 3.8452F, -2.4944F, 1.4881F, -0.2314F, 0.204F));

		PartDefinition cube_r245 = chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(35, 92).mirror().addBox(0.0366F, -6.7692F, -3.4844F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-5.6366F, 3.8452F, -2.4944F, 2.3782F, -0.2314F, 0.204F));

		PartDefinition cube_r246 = chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.9811F, -1.1869F, -5.5414F, 2.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6366F, 3.8452F, -2.4944F, 1.5487F, 0.2173F, 0.2725F));

		PartDefinition cube_r247 = chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(0.0366F, -2.4099F, -6.2514F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.6366F, 3.8452F, -2.4944F, 1.7237F, -0.2314F, 0.204F));

		PartDefinition cube_r248 = chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(57, 30).mirror().addBox(-6.8221F, -0.0215F, -0.3479F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 14.8185F, -0.0943F, 0.1169F, 0.3074F, 0.3603F));

		PartDefinition cube_r249 = chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(90, 51).mirror().addBox(-3.7F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 13.7185F, -4.8943F, -0.1291F, -0.2125F, 0.6098F));

		PartDefinition cube_r250 = chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(58, 53).addBox(2.8978F, -0.7765F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.1382F, -6.8099F, 0.1221F, -0.1011F, 1.3421F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(105, 67).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.1382F, -6.8099F, 0.144F, -0.0662F, 1.0817F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(105, 65).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4382F, -4.8099F, -0.2758F, -0.4391F, 0.719F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(105, 56).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4382F, -4.8099F, -0.3802F, -0.3542F, 0.9878F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(83, 80).addBox(5.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4382F, -4.8099F, -0.4823F, -0.1843F, 1.3658F));

		PartDefinition cube_r255 = chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(109, 105).addBox(0.0431F, -0.026F, -0.4093F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1382F, -1.4099F, -0.1116F, -0.5369F, 0.5904F));

		PartDefinition cube_r256 = chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(108, 50).addBox(2.9327F, -0.8127F, -0.4093F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1382F, -1.4099F, -0.2574F, -0.4885F, 0.886F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(50, 2).addBox(5.1435F, -3.0662F, -0.4093F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1382F, -1.4099F, -0.4287F, -0.3513F, 1.3001F));

		PartDefinition cube_r258 = chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(42, 21).addBox(5.1255F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7382F, -3.2099F, -0.4457F, -0.2924F, 1.3055F));

		PartDefinition cube_r259 = chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(105, 54).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7382F, -3.2099F, -0.3001F, -0.4408F, 0.9051F));

		PartDefinition cube_r260 = chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(105, 52).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7382F, -3.2099F, -0.1695F, -0.5022F, 0.6192F));

		PartDefinition cube_r261 = chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0366F, -2.754F, -1.4861F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(5.6366F, 3.8452F, -2.4944F, 1.2699F, 0.2314F, -0.204F));

		PartDefinition cube_r262 = chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(41, 106).addBox(-1.0366F, -2.4195F, -6.2274F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6366F, 3.8452F, -2.4944F, 1.9681F, 0.2314F, -0.204F));

		PartDefinition cube_r263 = chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(56, 56).addBox(-1.0366F, -1.0586F, -6.4381F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6366F, 3.8452F, -2.4944F, 1.4881F, 0.2314F, -0.204F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(94, 70).addBox(-1.0366F, -6.7785F, -0.7724F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6366F, 3.8452F, -2.4944F, 2.7797F, 0.2314F, -0.204F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(109, 107).addBox(-1.0366F, 3.4863F, -1.2706F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(5.6366F, 3.8452F, -2.4944F, 2.8407F, 0.2314F, -0.204F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(51, 95).addBox(-1.0366F, 3.0039F, -2.4761F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6366F, 3.8452F, -2.4944F, -3.0934F, 0.2314F, -0.204F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(94, 76).addBox(-1.0366F, 2.891F, -1.2569F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.6366F, 3.8452F, -2.4944F, -2.9625F, 0.2314F, -0.204F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(100, 35).addBox(-1.0366F, 3.9313F, -0.2928F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(28, 60).addBox(-1.0366F, -3.045F, 0.3982F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(5.6366F, 3.8452F, -2.4944F, -2.7879F, 0.2314F, -0.204F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(73, 121).addBox(-1.0366F, 5.1714F, -0.1583F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.6366F, 3.8452F, -2.4944F, -2.4825F, 0.2314F, -0.204F));

		PartDefinition cube_r270 = chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(63, 121).addBox(-1.0366F, 4.9504F, -1.8496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6366F, 3.8452F, -2.4944F, -2.0462F, 0.2314F, -0.204F));

		PartDefinition cube_r271 = chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(35, 92).addBox(-1.0366F, -6.7692F, -3.4844F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(5.6366F, 3.8452F, -2.4944F, 2.3782F, 0.2314F, -0.204F));

		PartDefinition cube_r272 = chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0189F, -1.1869F, -5.5414F, 2.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6366F, 3.8452F, -2.4944F, 1.5487F, -0.2173F, -0.2725F));

		PartDefinition cube_r273 = chest.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(0, 11).addBox(-1.0366F, -2.4099F, -6.2514F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.6366F, 3.8452F, -2.4944F, 1.7237F, 0.2314F, -0.204F));

		PartDefinition cube_r274 = chest.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(13, 65).addBox(-1.0F, -0.9815F, 0.014F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 14.7556F, 6.3453F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r275 = chest.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(63, 64).addBox(-1.0F, -0.9984F, -0.0401F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.3556F, 2.4453F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r276 = chest.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(78, 4).addBox(-1.0F, 0.6661F, 4.6948F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 13.1556F, -5.1547F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r277 = chest.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(25, 0).addBox(-0.6161F, -0.4337F, -0.5333F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 13.4185F, 9.9057F, 0.3551F, -0.6221F, -0.8261F));

		PartDefinition cube_r278 = chest.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(25, 2).addBox(-0.8161F, -0.4337F, -0.5333F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 13.4185F, 9.9057F, 0.27F, -0.5901F, -0.7029F));

		PartDefinition cube_r279 = chest.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(44, 8).addBox(-0.0161F, -0.4337F, -0.5333F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 13.4185F, 9.9057F, 0.2112F, -0.4361F, -0.6202F));

		PartDefinition cube_r280 = chest.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(57, 32).addBox(0.1049F, -0.0413F, 0.1652F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 13.4185F, 8.2057F, 0.1722F, -0.3637F, -0.5278F));

		PartDefinition cube_r281 = chest.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(58, 51).addBox(-0.5735F, -0.1188F, -0.4895F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 14.1185F, 6.5057F, 0.159F, -0.3694F, -0.4909F));

		PartDefinition cube_r282 = chest.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(57, 36).addBox(-0.5809F, 0.0183F, -0.2881F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 14.4185F, 4.1057F, 0.1787F, -0.3606F, -0.5462F));

		PartDefinition cube_r283 = chest.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(52, 0).addBox(-0.6831F, -0.0437F, -0.2411F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 14.8185F, 1.9057F, 0.1466F, -0.3403F, -0.4485F));

		PartDefinition cube_r284 = chest.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(57, 30).addBox(-1.1779F, -0.0215F, -0.3479F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 14.8185F, -0.0943F, 0.1169F, -0.3074F, -0.3603F));

		PartDefinition cube_r285 = chest.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(90, 51).addBox(-0.3F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 13.7185F, -4.8943F, -0.1291F, 0.2125F, -0.6098F));

		PartDefinition cube_r286 = chest.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(41, 56).addBox(-1.0F, -0.0036F, -0.1282F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.1556F, -5.1547F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r287 = chest.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(0, 23).addBox(-1.0F, -1.908F, 4.84F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.6588F, -11.5455F, 0.3403F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.9F, 11.2272F, -3.7595F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r288 = leftarm.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(106, 75).addBox(-0.5F, -0.7117F, -0.4194F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 7.2673F, 4.1378F, -1.213F, 0.0F, 0.0F));

		PartDefinition cube_r289 = leftarm.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(88, 86).addBox(-0.5F, -0.1117F, -1.7194F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 7.2673F, 4.1378F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r290 = leftarm.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(0, 75).addBox(-0.502F, -2.0446F, -0.0071F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5118F, 1.3039F, -2.5244F, -0.2008F, 0.0014F, -0.001F));

		PartDefinition cube_r291 = leftarm.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(61, 10).addBox(-0.5F, -0.6F, -2.6F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5118F, -0.2961F, -0.0244F, 0.061F, 0.0014F, -0.001F));

		PartDefinition cube_r292 = leftarm.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(90, 99).addBox(-0.5F, -1.5F, -0.9F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.01F, 1.7389F, -0.1011F, 0.7679F, 0.0014F, -0.001F));

		PartDefinition cube_r293 = leftarm.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(92, 110).addBox(-0.011F, -0.5746F, 0.2689F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 1.8673F, -0.8622F, 0.0697F, 0.0014F, -0.001F));

		PartDefinition cube_r294 = leftarm.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(73, 96).addBox(-0.0076F, 0.0237F, -0.8126F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 3.6673F, 0.2378F, 0.7766F, 0.0014F, -0.001F));

		PartDefinition cube_r295 = leftarm.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(0, 113).addBox(0.0F, -0.0127F, -0.9873F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 5.7524F, 3.9282F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r296 = leftarm.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(123, 86).addBox(0.0F, 0.0165F, -0.9614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 5.2524F, 3.0282F, 1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r297 = leftarm.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(87, 110).addBox(0.0F, -0.0478F, -0.9659F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 3.6524F, 2.1282F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r298 = leftarm.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(97, 42).addBox(0.0F, -1.3072F, -2.0399F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.8524F, 1.6282F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r299 = leftarm.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(114, 24).addBox(0.0F, -0.0542F, 0.047F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.5F, 2.6524F, 0.1282F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r300 = leftarm.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(14, 99).addBox(0.0F, -1.5F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 1.4524F, 0.4282F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 9.5661F, 2.7715F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r301 = leftarm2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(14, 108).addBox(-1.9209F, -1.9645F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1764F, -1.11F, 4.2564F, 1.5708F, -0.6632F, -1.5708F));

		PartDefinition cube_r302 = leftarm2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(114, 52).addBox(-0.9976F, -1.9889F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1764F, -2.11F, 4.6564F, 1.5708F, -0.3578F, -1.5708F));

		PartDefinition cube_r303 = leftarm2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(112, 20).addBox(1.5F, 2.225F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1764F, -0.11F, 0.6564F, 1.5708F, 0.1222F, -1.5708F));

		PartDefinition cube_r304 = leftarm2.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(89, 39).addBox(-4.1152F, 0.0788F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.104F)), PartPose.offsetAndRotation(-0.1764F, -4.1461F, 4.0201F, 1.5708F, -0.8465F, -1.5708F));

		PartDefinition cube_r305 = leftarm2.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(76, 40).addBox(-0.9F, -0.1F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.1764F, -1.9461F, 0.4201F, 1.5708F, -1.0647F, -1.5708F));

		PartDefinition cube_r306 = leftarm2.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(102, 110).addBox(0.0149F, 0.0003F, -0.4596F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.136F, 1.0298F, 1.1549F, -1.5708F, -1.4486F, 1.5708F));

		PartDefinition cube_r307 = leftarm2.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(89, 4).addBox(-1.9F, -1.5F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.1764F, 0.143F, 1.9844F, -1.5708F, -0.9512F, 1.5708F));

		PartDefinition cube_r308 = leftarm2.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(0, 96).addBox(-0.2168F, 0.6627F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3236F, 8.6954F, 0.8336F, 1.5708F, -1.2566F, -1.5708F));

		PartDefinition cube_r309 = leftarm2.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(96, 29).addBox(-0.0198F, 0.7127F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3236F, 4.7954F, -0.1664F, 1.5708F, -1.3439F, -1.5708F));

		PartDefinition cube_r310 = leftarm2.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(26, 83).addBox(-0.0335F, -0.4622F, 0.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3236F, -0.0046F, -0.6664F, 1.5708F, -1.4486F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 13.1979F, 2.6239F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r311 = leftArm3.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(65, 80).addBox(-0.5F, -0.9F, -0.4F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8837F, 0.0231F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(21, 111).addBox(-0.5F, -0.104F, -0.5139F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0602F, -0.2933F, -0.2618F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6644F, 2.5416F, 0.0299F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r312 = leftArm5.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(117, 114).addBox(-0.3056F, -0.5195F, -0.5346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.6F, -1.4F, 0.8731F, 0.0492F, 0.0179F));

		PartDefinition cube_r313 = leftArm5.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(7, 102).addBox(-2.1606F, -0.3284F, -2.3139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9027F, 0.3032F, 0.1544F, 0.2446F, 0.0511F, 0.0113F));

		PartDefinition cube_r314 = leftArm5.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(10, 120).addBox(-2.1606F, -1.0562F, -0.7321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9027F, 0.3532F, -0.4706F, 0.7421F, 0.0511F, 0.0113F));

		PartDefinition cube_r315 = leftArm5.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(0, 123).addBox(-0.5F, -0.5877F, -0.0856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1976F, 0.4039F, -1.0801F, 0.7367F, -0.0376F, 0.0312F));

		PartDefinition cube_r316 = leftArm5.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(120, 6).addBox(-0.5F, -0.2252F, -0.8223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(100, 118).addBox(-0.5F, -0.2252F, -0.2223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(118, 92).addBox(-0.5F, -0.9252F, -0.2223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.1976F, 0.3539F, -0.4551F, 0.2392F, -0.0376F, 0.0312F));

		PartDefinition cube_r317 = leftArm5.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(85, 115).addBox(-0.0875F, -0.1965F, -0.8844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5921F, 0.0826F, -1.3533F, 0.9303F, -0.3158F, -0.32F));

		PartDefinition cube_r318 = leftArm5.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(119, 10).addBox(-0.0773F, -0.1722F, -0.9306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5976F, 0.4539F, -1.1551F, 0.2621F, -0.4184F, -0.0682F));

		PartDefinition cube_r319 = leftArm5.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(5, 119).addBox(-0.2899F, -0.5206F, -0.5342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0115F, -0.2793F, -0.3571F, 0.4362F, 0.0522F, -0.0046F));

		PartDefinition cube_r320 = leftArm5.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(121, 83).addBox(-0.706F, -0.4641F, -0.4548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0115F, -0.2793F, -0.3571F, 0.4313F, -0.0265F, 0.0411F));

		PartDefinition cube_r321 = leftArm5.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(118, 89).addBox(-0.5F, -0.9252F, -0.2223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F))
				.texOffs(0, 120).addBox(-0.5F, -0.2252F, -0.8223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(79, 118).addBox(-0.5F, -0.2252F, -0.2223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.4031F, 0.3539F, -0.4551F, 0.2392F, 0.0376F, -0.0312F));

		PartDefinition cube_r322 = leftArm5.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(89, 118).addBox(-0.7101F, -0.5206F, -0.5342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1939F, -0.2793F, -0.3571F, 0.4362F, -0.0522F, 0.0046F));

		PartDefinition cube_r323 = leftArm5.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(83, 121).addBox(-0.294F, -0.4641F, -0.4548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1939F, -0.2793F, -0.3571F, 0.4313F, 0.0265F, -0.0411F));

		PartDefinition cube_r324 = leftArm5.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(118, 86).addBox(-0.9227F, -0.1722F, -0.9306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.8031F, 0.4539F, -1.1551F, 0.2621F, 0.4184F, 0.0682F));

		PartDefinition cube_r325 = leftArm5.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(74, 115).addBox(-0.9125F, -0.1965F, -0.8844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7975F, 0.0826F, -1.3533F, 0.9303F, 0.3158F, 0.32F));

		PartDefinition cube_r326 = leftArm5.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(122, 119).addBox(-0.5F, -0.5877F, -0.0856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4031F, 0.4039F, -1.0801F, 0.7367F, 0.0376F, -0.0312F));

		PartDefinition cube_r327 = leftArm5.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(119, 107).addBox(1.1607F, -1.0562F, -0.7321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6973F, 0.3532F, -0.4706F, 0.7421F, -0.0511F, -0.0113F));

		PartDefinition cube_r328 = leftArm5.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(123, 76).addBox(1.1607F, -0.4284F, -1.0139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5973F, 0.3032F, 0.1544F, 0.2446F, -0.0511F, -0.0113F));

		PartDefinition cube_r329 = leftArm5.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(0, 102).addBox(1.1607F, -0.3284F, -2.3139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6973F, 0.3032F, 0.1544F, 0.2446F, -0.0511F, -0.0113F));

		PartDefinition cube_r330 = leftArm5.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(112, 117).addBox(-0.6944F, -0.5195F, -0.5346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2055F, 0.6F, -1.4F, 0.8731F, -0.0492F, -0.0179F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.9F, 11.2272F, -3.7595F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r331 = rightarm.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(102, 106).addBox(-1.5F, -0.7117F, -0.4194F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 7.2673F, 4.1378F, -1.213F, 0.0F, 0.0F));

		PartDefinition cube_r332 = rightarm.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(89, 54).addBox(-1.5F, -0.1117F, -1.7194F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 7.2673F, 4.1378F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r333 = rightarm.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(76, 28).addBox(-1.498F, -2.0446F, -0.0071F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5118F, 1.3039F, -2.5244F, -0.2008F, -0.0014F, 0.001F));

		PartDefinition cube_r334 = rightarm.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(62, 43).addBox(-1.5F, -0.6F, -2.6F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5118F, -0.2961F, -0.0244F, 0.061F, -0.0014F, 0.001F));

		PartDefinition cube_r335 = rightarm.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(95, 99).addBox(-0.5F, -1.5F, -0.9F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.01F, 1.7389F, -0.1011F, 0.7679F, -0.0014F, 0.001F));

		PartDefinition cube_r336 = rightarm.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(111, 83).addBox(-0.989F, -0.5746F, 0.2689F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 1.8673F, -0.8622F, 0.0697F, -0.0014F, 0.001F));

		PartDefinition cube_r337 = rightarm.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(85, 96).addBox(-0.9924F, 0.0237F, -0.8126F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 3.6673F, 0.2378F, 0.7766F, -0.0014F, 0.001F));

		PartDefinition cube_r338 = rightarm.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(40, 113).addBox(-1.0F, -0.0127F, -0.9873F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 5.7524F, 3.9282F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r339 = rightarm.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(123, 89).addBox(-1.0F, 0.0165F, -0.9614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 5.2524F, 3.0282F, 1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r340 = rightarm.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(69, 111).addBox(-1.0F, -0.0478F, -0.9659F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 3.6524F, 2.1282F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r341 = rightarm.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(98, 53).addBox(-1.0F, -1.3072F, -2.0399F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.8524F, 1.6282F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r342 = rightarm.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(5, 115).addBox(-1.0F, -0.0542F, 0.047F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.5F, 2.6524F, 0.1282F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r343 = rightarm.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(99, 91).addBox(-1.0F, -1.5F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 1.4524F, 0.4282F, 0.3054F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 9.5661F, 2.7715F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r344 = rightarm2.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(107, 101).addBox(-0.0791F, -1.9645F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1764F, -1.11F, 4.2564F, 1.5708F, 0.6632F, 1.5708F));

		PartDefinition cube_r345 = rightarm2.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(115, 6).addBox(-0.0024F, -1.9889F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1764F, -2.11F, 4.6564F, 1.5708F, 0.3578F, 1.5708F));

		PartDefinition cube_r346 = rightarm2.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(112, 31).addBox(-2.5F, 2.225F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1764F, -0.11F, 0.6564F, 1.5708F, -0.1222F, 1.5708F));

		PartDefinition cube_r347 = rightarm2.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(88, 48).addBox(0.1152F, 0.0788F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.104F)), PartPose.offsetAndRotation(0.1764F, -4.1461F, 4.0201F, 1.5708F, 0.8465F, 1.5708F));

		PartDefinition cube_r348 = rightarm2.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(77, 51).addBox(-4.1F, -0.1F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.1764F, -1.9461F, 0.4201F, 1.5708F, 1.0647F, 1.5708F));

		PartDefinition cube_r349 = rightarm2.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(12, 112).addBox(-1.0149F, 0.0003F, -0.4596F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.136F, 1.0298F, 1.1549F, -1.5708F, 1.4486F, -1.5708F));

		PartDefinition cube_r350 = rightarm2.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(87, 31).addBox(-1.1F, -1.5F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.1764F, 0.143F, 1.9844F, -1.5708F, 0.9512F, -1.5708F));

		PartDefinition cube_r351 = rightarm2.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(9, 91).addBox(-1.7832F, 0.6627F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3236F, 8.6954F, 0.8336F, 1.5708F, 1.2566F, 1.5708F));

		PartDefinition cube_r352 = rightarm2.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(42, 96).addBox(-1.9802F, 0.7127F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3236F, 4.7954F, -0.1664F, 1.5708F, 1.3439F, 1.5708F));

		PartDefinition cube_r353 = rightarm2.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(33, 84).addBox(-1.9665F, -0.4622F, 0.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3236F, -0.0046F, -0.6664F, 1.5708F, 1.4486F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 13.1979F, 2.6239F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r354 = rightArm3.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(0, 81).addBox(-0.5F, -0.9F, -0.4F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8837F, 0.0231F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(26, 112).addBox(-0.5F, -0.104F, -0.5139F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0602F, -0.2933F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6644F, 2.5416F, 0.0299F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r355 = rightArm5.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(15, 118).addBox(-0.6944F, -0.5195F, -0.5346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.6F, -1.4F, 0.8731F, -0.0492F, -0.0179F));

		PartDefinition cube_r356 = rightArm5.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(54, 102).addBox(1.1606F, -0.3284F, -2.3139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.9027F, 0.3032F, 0.1544F, 0.2446F, -0.0511F, -0.0113F));

		PartDefinition cube_r357 = rightArm5.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(120, 59).addBox(1.1606F, -1.0562F, -0.7321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.9027F, 0.3532F, -0.4706F, 0.7421F, -0.0511F, -0.0113F));

		PartDefinition cube_r358 = rightArm5.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(49, 123).addBox(-0.5F, -0.5877F, -0.0856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1976F, 0.4039F, -1.0801F, 0.7367F, 0.0376F, -0.0312F));

		PartDefinition cube_r359 = rightArm5.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(120, 56).addBox(-0.5F, -0.2252F, -0.8223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(119, 95).addBox(-0.5F, -0.2252F, -0.2223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(68, 119).addBox(-0.5F, -0.9252F, -0.2223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.1976F, 0.3539F, -0.4551F, 0.2392F, 0.0376F, -0.0312F));

		PartDefinition cube_r360 = rightArm5.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(102, 115).addBox(-0.9125F, -0.1965F, -0.8844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5921F, 0.0826F, -1.3533F, 0.9303F, 0.3158F, 0.32F));

		PartDefinition cube_r361 = rightArm5.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(119, 101).addBox(-0.9227F, -0.1722F, -0.9306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5976F, 0.4539F, -1.1551F, 0.2621F, 0.4184F, 0.0682F));

		PartDefinition cube_r362 = rightArm5.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(119, 98).addBox(-0.7101F, -0.5206F, -0.5342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0115F, -0.2793F, -0.3571F, 0.4362F, -0.0522F, 0.0046F));

		PartDefinition cube_r363 = rightArm5.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(122, 29).addBox(-0.294F, -0.4641F, -0.4548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0115F, -0.2793F, -0.3571F, 0.4313F, 0.0265F, -0.0411F));

		PartDefinition cube_r364 = rightArm5.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(119, 64).addBox(-0.5F, -0.9252F, -0.2223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F))
				.texOffs(49, 120).addBox(-0.5F, -0.2252F, -0.8223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(119, 23).addBox(-0.5F, -0.2252F, -0.2223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.4031F, 0.3539F, -0.4551F, 0.2392F, -0.0376F, 0.0312F));

		PartDefinition cube_r365 = rightArm5.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(119, 53).addBox(-0.2899F, -0.5206F, -0.5342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.1939F, -0.2793F, -0.3571F, 0.4362F, 0.0522F, -0.0046F));

		PartDefinition cube_r366 = rightArm5.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(122, 26).addBox(-0.706F, -0.4641F, -0.4548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.1939F, -0.2793F, -0.3571F, 0.4313F, -0.0265F, 0.0411F));

		PartDefinition cube_r367 = rightArm5.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(119, 50).addBox(-0.0773F, -0.1722F, -0.9306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.8031F, 0.4539F, -1.1551F, 0.2621F, -0.4184F, -0.0682F));

		PartDefinition cube_r368 = rightArm5.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(90, 115).addBox(-0.0875F, -0.1965F, -0.8844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.7975F, 0.0826F, -1.3533F, 0.9303F, -0.3158F, -0.32F));

		PartDefinition cube_r369 = rightArm5.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(36, 123).addBox(-0.5F, -0.5877F, -0.0856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.4031F, 0.4039F, -1.0801F, 0.7367F, -0.0376F, 0.0312F));

		PartDefinition cube_r370 = rightArm5.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(120, 47).addBox(-2.1607F, -1.0562F, -0.7321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6973F, 0.3532F, -0.4706F, 0.7421F, 0.0511F, 0.0113F));

		PartDefinition cube_r371 = rightArm5.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(123, 79).addBox(-2.1607F, -0.4284F, -1.0139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5973F, 0.3032F, 0.1544F, 0.2446F, 0.0511F, 0.0113F));

		PartDefinition cube_r372 = rightArm5.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(41, 102).addBox(-2.1607F, -0.3284F, -2.3139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6973F, 0.3032F, 0.1544F, 0.2446F, 0.0511F, 0.0113F));

		PartDefinition cube_r373 = rightArm5.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(118, 0).addBox(-0.3056F, -0.5195F, -0.5346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2055F, 0.6F, -1.4F, 0.8731F, 0.0492F, 0.0179F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7588F, -6.7455F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r374 = neck2.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(25, 117).addBox(0.0F, -2.2483F, -0.0894F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8185F, -1.9478F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r375 = neck2.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(121, 39).addBox(0.0F, -1.6F, -0.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4688F, -3.4393F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r376 = neck2.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(0, 61).addBox(-1.0F, -0.2F, 1.8F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.0131F, -5.7998F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4785F, -4.0865F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r377 = neck.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(57, 121).addBox(0.0F, -1.8F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4399F, -2.0237F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r378 = neck.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(74, 10).addBox(-1.0F, -1.1F, 3.8F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.6898F, -6.55F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0833F, -2.6753F, 0.0938F, 0.2756F, 0.3385F));

		PartDefinition cube_r379 = neck4.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(32, 43).addBox(-1.0F, -1.1F, -1.2F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, -3.8F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r380 = neck4.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(46, 121).addBox(0.0F, -2.3368F, -1.0495F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -0.8F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r381 = neck4.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(43, 121).addBox(0.0F, -2.743F, -0.9308F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -2.9F, 0.1134F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(74, 70).addBox(-1.0F, -1.1F, -2.9F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.8588F, -4.7659F, -0.2002F, -0.0453F, -0.1195F));

		PartDefinition cube_r382 = neck3.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(60, 121).addBox(0.0F, -2.5179F, -0.9061F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0412F, -1.0341F, 0.3316F, 0.0F, 0.0F));

		PartDefinition neck5 = neck3.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(40, 30).addBox(-1.0F, -0.8F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3518F, -2.7068F, 0.2523F, 0.1487F, -0.0511F));

		PartDefinition cube_r383 = neck5.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(85, 124).addBox(0.0F, -3.1041F, -4.9284F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 93).addBox(0.0F, -2.9041F, -3.5284F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1244F, 1.2312F, 0.288F, 0.0F, 0.0F));

		PartDefinition head = neck5.addOrReplaceChild("head", CubeListBuilder.create().texOffs(13, 59).addBox(-2.0F, -2.1F, -2.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 0.6966F, -5.3905F, 0.1304F, 0.019F, 0.0878F));

		PartDefinition cube_r384 = head.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(46, 75).addBox(-3.5F, -1.9289F, -1.0073F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, -3.6422F, -0.9567F, 1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r385 = head.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(63, 38).addBox(-3.5F, -1.9F, 0.7F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 4).addBox(-4.0F, -1.9F, -2.3F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0422F, -1.1567F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r386 = head.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(87, 26).addBox(-0.5F, -0.1907F, -0.1973F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 4.9097F, -6.8438F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r387 = head.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(79, 86).addBox(-0.5F, -0.1907F, -0.1973F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 4.9097F, -6.8438F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r388 = head.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(7, 106).addBox(-0.5F, -0.9835F, -0.5084F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.0F, 6.4097F, -6.6437F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r389 = head.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(74, 22).addBox(-1.5F, -0.7F, -0.7F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0415F, -4.5631F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r390 = head.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(65, 4).addBox(-3.0F, -0.0136F, -0.1955F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.9F, -5.0F, 1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r391 = head.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(37, 70).addBox(-2.9F, 2.2606F, -3.0004F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(37, 70).mirror().addBox(-3.1F, 2.2606F, -3.0004F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 70).addBox(-2.9F, 2.2606F, -3.0004F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 43).addBox(-3.0F, 0.7606F, -5.0004F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0F, -0.3F, -5.0F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r392 = head.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(44, 79).addBox(-2.5F, -2.0857F, -1.8232F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.0F, 3.1742F, -0.5729F, 1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r393 = head.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(21, 33).addBox(-3.0F, -3.3712F, -0.0081F, 4.0F, 4.0F, 5.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.0F, 4.5742F, -1.5729F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r394 = head.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(92, 82).addBox(-1.5F, -0.3107F, -0.0195F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.5F, 7.0709F, -1.801F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r395 = head.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(96, 66).addBox(-1.5F, -0.9292F, -0.0058F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 8.3168F, -3.5453F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r396 = head.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(90, 95).addBox(-1.5F, -1.8828F, -2.6962F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(33, 79).addBox(-1.5F, -1.8828F, -1.9962F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 6.5168F, -1.5453F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r397 = head.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(22, 78).addBox(-1.5F, 0.5F, -0.425F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.9168F, -3.3453F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r398 = head.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(42, 92).addBox(-1.5F, -0.3612F, -1.8898F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 7.0709F, -1.801F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r399 = head.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(11, 77).addBox(-1.4F, -0.4915F, 1.8526F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4F, 10.3165F, -7.5688F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r400 = head.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(40, 23).addBox(-2.5F, -0.4891F, -0.4252F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(41, 51).addBox(-2.0F, -1.4891F, -0.4252F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.9656F, -3.8244F, 1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r401 = head.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(42, 11).addBox(-2.6429F, -1.0F, -1.5F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.3571F, -2.1982F, -3.0282F, 0.8447F, 0.0F, 0.0F));

		PartDefinition cube_r402 = head.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(114, 107).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(114, 107).addBox(2.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.2923F, 0.7226F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r403 = head.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(59, 23).addBox(-1.0F, -2.0F, -2.7F, 4.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.0F, 0.2F, 0.9F, 0.48F, 0.0F, 0.0F));

		PartDefinition leftHorn = head.addOrReplaceChild("leftHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7407F, -2.0551F, -4.6295F, -1.3675F, 0.6351F, -0.5965F));

		PartDefinition cube_r404 = leftHorn.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(50, 70).addBox(-2.7022F, -0.4751F, -0.5619F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2944F, -0.4013F, -1.0215F, 0.3336F, 0.1905F, -0.2649F));

		PartDefinition cube_r405 = leftHorn.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(81, 82).addBox(-0.801F, -1.5871F, -0.5619F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2944F, -0.4013F, -1.0215F, 0.3509F, 0.1553F, -0.1648F));

		PartDefinition cube_r406 = leftHorn.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(78, 16).addBox(-1.2918F, -1.4264F, -0.5619F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2944F, -0.4013F, -1.0215F, 0.3818F, 0.0227F, 0.1785F));

		PartDefinition cube_r407 = leftHorn.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(90, 106).addBox(-4.2509F, -1.4746F, -0.0312F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(7.6163F, -3.7731F, -0.1381F, 0.3514F, -0.3062F, -0.483F));

		PartDefinition cube_r408 = leftHorn.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(111, 88).addBox(-0.6104F, -0.5636F, 0.4002F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0255F, -1.2919F, -2.7571F, 1.4163F, 1.2155F, 0.8994F));

		PartDefinition cube_r409 = leftHorn.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(111, 0).addBox(0.4575F, -0.5636F, -0.3496F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.0255F, -1.2919F, -2.7571F, 0.658F, 0.9739F, 0.062F));

		PartDefinition cube_r410 = leftHorn.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(87, 36).addBox(-2.3357F, -0.5636F, -0.4947F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.0255F, -1.2919F, -2.7571F, 0.5884F, 0.903F, -0.0242F));

		PartDefinition cube_r411 = leftHorn.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(75, 47).addBox(0.0889F, -1.0746F, -0.5619F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2944F, -0.4013F, -1.0215F, 0.2989F, 0.2422F, -0.4263F));

		PartDefinition cube_r412 = leftHorn.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(97, 86).addBox(-0.1727F, -1.8789F, -0.0312F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(7.6163F, -3.7731F, -0.1381F, 0.4606F, 0.0344F, -1.2404F));

		PartDefinition cube_r413 = leftHorn.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(99, 121).addBox(2.2089F, 0.8435F, 1.1233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 64).addBox(1.6089F, -0.1565F, 1.1233F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(7.6163F, -3.7731F, -0.1381F, -0.3074F, 0.2521F, -1.0837F));

		PartDefinition cube_r414 = leftHorn.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(68, 107).addBox(-0.0141F, -0.2108F, -0.1581F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.6163F, -3.7731F, -0.1381F, 0.4326F, 0.1672F, -1.5171F));

		PartDefinition cube_r415 = leftHorn.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(106, 91).addBox(0.3567F, -0.3613F, 0.7057F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.6163F, -3.7731F, -0.1381F, -0.2882F, 0.0441F, -0.9283F));

		PartDefinition cube_r416 = leftHorn.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(98, 4).addBox(-1.7591F, 0.453F, 0.3722F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.6163F, -3.7731F, -0.1381F, -0.2335F, -0.168F, -0.5903F));

		PartDefinition cube_r417 = leftHorn.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(23, 122).addBox(-0.4685F, -1.8477F, 1.4782F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.6163F, -3.7731F, -0.1381F, 1.2722F, -0.2124F, -0.488F));

		PartDefinition cube_r418 = leftHorn.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(122, 19).addBox(-1.2031F, -1.9346F, 1.4782F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.6163F, -3.7731F, -0.1381F, 1.2186F, -0.5852F, -0.3526F));

		PartDefinition cube_r419 = leftHorn.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(65, 17).addBox(-4.1262F, -2.4019F, -0.0312F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.6163F, -3.7731F, -0.1381F, 0.4361F, -0.1572F, -0.8471F));

		PartDefinition cube_r420 = leftHorn.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(32, 98).addBox(-2.1546F, 0.2317F, 0.1863F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 110).addBox(-4.1546F, 0.2317F, 0.1863F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.6163F, -3.7731F, -0.1381F, -0.0882F, -0.0698F, -0.8319F));

		PartDefinition cube_r421 = leftHorn.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(80, 54).addBox(-1.0383F, -2.363F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3563F, -0.0997F, -0.3008F, 0.4999F, 0.045F, -0.5157F));

		PartDefinition cube_r422 = leftHorn.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(18, 122).addBox(-0.6423F, -0.5842F, -0.4925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.7654F, 1.6442F, 0.3739F, 0.0637F, -0.0252F, 1.0006F));

		PartDefinition cube_r423 = leftHorn.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(122, 16).addBox(-0.2953F, -0.468F, -0.4925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(5, 122).addBox(-0.6453F, -0.468F, -0.4925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7654F, 1.6442F, 0.3739F, 0.0681F, -0.0079F, 0.7393F));

		PartDefinition cube_r424 = leftHorn.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(88, 43).addBox(-1.8347F, -1.1537F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.3563F, -0.0997F, -0.3008F, 0.2893F, -0.4159F, 0.5022F));

		PartDefinition rightHorn = head.addOrReplaceChild("rightHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7407F, -2.0551F, -4.6295F, -1.3675F, -0.6351F, 0.5965F));

		PartDefinition cube_r425 = rightHorn.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(50, 70).mirror().addBox(-1.2978F, -0.4751F, -0.5619F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2944F, -0.4013F, -1.0215F, 0.3336F, -0.1905F, 0.2649F));

		PartDefinition cube_r426 = rightHorn.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(81, 82).mirror().addBox(-2.199F, -1.5871F, -0.5619F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2944F, -0.4013F, -1.0215F, 0.3509F, -0.1553F, 0.1648F));

		PartDefinition cube_r427 = rightHorn.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(78, 16).mirror().addBox(-1.7082F, -1.4264F, -0.5619F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2944F, -0.4013F, -1.0215F, 0.3818F, -0.0227F, -0.1785F));

		PartDefinition cube_r428 = rightHorn.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(90, 106).mirror().addBox(2.2509F, -1.4746F, -0.0312F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-7.6163F, -3.7731F, -0.1381F, 0.3514F, 0.3062F, 0.483F));

		PartDefinition cube_r429 = rightHorn.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(111, 88).mirror().addBox(-1.3896F, -0.5636F, 0.4002F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0255F, -1.2919F, -2.7571F, 1.4163F, -1.2155F, -0.8994F));

		PartDefinition cube_r430 = rightHorn.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(111, 0).mirror().addBox(-2.4575F, -0.5636F, -0.3496F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.0255F, -1.2919F, -2.7571F, 0.658F, -0.9739F, -0.062F));

		PartDefinition cube_r431 = rightHorn.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(87, 36).mirror().addBox(-1.6643F, -0.5636F, -0.4947F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.0255F, -1.2919F, -2.7571F, 0.5884F, -0.903F, 0.0242F));

		PartDefinition cube_r432 = rightHorn.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(75, 47).mirror().addBox(-4.0889F, -1.0746F, -0.5619F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2944F, -0.4013F, -1.0215F, 0.2989F, -0.2422F, 0.4263F));

		PartDefinition cube_r433 = rightHorn.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(97, 86).mirror().addBox(-1.8273F, -1.8789F, -0.0312F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-7.6163F, -3.7731F, -0.1381F, 0.4606F, -0.0344F, 1.2404F));

		PartDefinition cube_r434 = rightHorn.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(99, 121).mirror().addBox(-3.2089F, 0.8435F, 1.1233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(114, 64).mirror().addBox(-2.6089F, -0.1565F, 1.1233F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-7.6163F, -3.7731F, -0.1381F, -0.3074F, -0.2521F, 1.0837F));

		PartDefinition cube_r435 = rightHorn.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(68, 107).mirror().addBox(-1.9859F, -0.2108F, -0.1581F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.6163F, -3.7731F, -0.1381F, 0.4326F, -0.1672F, 1.5171F));

		PartDefinition cube_r436 = rightHorn.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(106, 91).mirror().addBox(-2.3567F, -0.3613F, 0.7057F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.6163F, -3.7731F, -0.1381F, -0.2882F, -0.0441F, 0.9283F));

		PartDefinition cube_r437 = rightHorn.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(98, 4).mirror().addBox(-1.2409F, 0.453F, 0.3722F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.6163F, -3.7731F, -0.1381F, -0.2335F, 0.168F, 0.5903F));

		PartDefinition cube_r438 = rightHorn.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(23, 122).mirror().addBox(-0.5315F, -1.8477F, 1.4782F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.6163F, -3.7731F, -0.1381F, 1.2722F, 0.2124F, 0.488F));

		PartDefinition cube_r439 = rightHorn.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(122, 19).mirror().addBox(0.2031F, -1.9346F, 1.4782F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.6163F, -3.7731F, -0.1381F, 1.2186F, 0.5852F, 0.3526F));

		PartDefinition cube_r440 = rightHorn.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(65, 17).mirror().addBox(-0.8738F, -2.4019F, -0.0312F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.6163F, -3.7731F, -0.1381F, 0.4361F, 0.1572F, 0.8471F));

		PartDefinition cube_r441 = rightHorn.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(32, 98).mirror().addBox(-0.8454F, 0.2317F, 0.1863F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 110).mirror().addBox(2.1546F, 0.2317F, 0.1863F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.6163F, -3.7731F, -0.1381F, -0.0882F, 0.0698F, 0.8319F));

		PartDefinition cube_r442 = rightHorn.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(80, 54).mirror().addBox(-1.9618F, -2.363F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3563F, -0.0997F, -0.3008F, 0.4999F, -0.045F, 0.5157F));

		PartDefinition cube_r443 = rightHorn.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(18, 122).mirror().addBox(-0.3577F, -0.5842F, -0.4925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.7654F, 1.6442F, 0.3739F, 0.0637F, 0.0252F, -1.0006F));

		PartDefinition cube_r444 = rightHorn.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(122, 16).mirror().addBox(-0.7047F, -0.468F, -0.4925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(5, 122).mirror().addBox(-0.3547F, -0.468F, -0.4925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7654F, 1.6442F, 0.3739F, 0.0681F, 0.0079F, -0.7393F));

		PartDefinition cube_r445 = rightHorn.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(88, 43).mirror().addBox(-1.1653F, -1.1537F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.3563F, -0.0997F, -0.3008F, 0.2893F, 0.4159F, -0.5022F));

		PartDefinition leftMaxilla = head.addOrReplaceChild("leftMaxilla", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4002F, 7.9724F, -2.7729F, 0.0F, 0.0F, 0.096F));

		PartDefinition cube_r446 = leftMaxilla.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(103, 7).addBox(-0.2169F, -0.7765F, -1.9033F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.4F, 1.2423F, -3.0959F, 0.9429F, -0.0121F, -0.0688F));

		PartDefinition cube_r447 = leftMaxilla.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(103, 18).addBox(-0.4246F, -0.1265F, -0.1433F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.4F, -1.6577F, -2.3959F, 1.5887F, -0.0121F, -0.0688F));

		PartDefinition cube_r448 = leftMaxilla.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(85, 21).addBox(-0.3001F, -0.0246F, -0.1498F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.4F, -0.0577F, -3.5959F, 0.9778F, -0.0121F, -0.0688F));

		PartDefinition cube_r449 = leftMaxilla.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(85, 9).addBox(-0.1207F, -0.0899F, -0.2733F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4F, 2.3423F, -4.7959F, 1.0825F, -0.0121F, -0.0688F));

		PartDefinition cube_r450 = leftMaxilla.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(63, 70).addBox(-0.6971F, 0.1085F, -1.8284F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, 2.3423F, -4.7959F, 1.0599F, -0.0632F, -0.1246F));

		PartDefinition cube_r451 = leftMaxilla.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(118, 80).addBox(0.0428F, -0.804F, -3.4676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(104, 40).addBox(0.0428F, -0.804F, -2.9676F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6449F, 1.5516F, -3.5793F, 1.1638F, 0.0971F, 0.2435F));

		PartDefinition rightMaxilla = head.addOrReplaceChild("rightMaxilla", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4002F, 7.9724F, -2.7729F, 0.0F, 0.0F, -0.096F));

		PartDefinition cube_r452 = rightMaxilla.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(103, 7).mirror().addBox(-0.7831F, -0.7765F, -1.9033F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.2423F, -3.0959F, 0.9429F, 0.0121F, 0.0688F));

		PartDefinition cube_r453 = rightMaxilla.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(103, 18).mirror().addBox(-0.5754F, -0.1265F, -0.1433F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -1.6577F, -2.3959F, 1.5887F, 0.0121F, 0.0688F));

		PartDefinition cube_r454 = rightMaxilla.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(85, 21).mirror().addBox(-0.6999F, -0.0246F, -0.1498F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0577F, -3.5959F, 0.9778F, 0.0121F, 0.0688F));

		PartDefinition cube_r455 = rightMaxilla.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(85, 9).mirror().addBox(-0.8793F, -0.0899F, -0.2733F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 2.3423F, -4.7959F, 1.0825F, 0.0121F, 0.0688F));

		PartDefinition cube_r456 = rightMaxilla.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(63, 70).mirror().addBox(-0.3029F, 0.1085F, -1.8284F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 2.3423F, -4.7959F, 1.0599F, 0.0632F, 0.1246F));

		PartDefinition cube_r457 = rightMaxilla.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(118, 80).mirror().addBox(-1.0428F, -0.804F, -3.4676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(104, 40).mirror().addBox(-1.0428F, -0.804F, -2.9676F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6449F, 1.5516F, -3.5793F, 1.1638F, -0.0971F, -0.2435F));

		PartDefinition leftFrontossicone = head.addOrReplaceChild("leftFrontossicone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.867F, 1.3249F, -6.0235F, -0.0317F, -0.3477F, 0.0928F));

		PartDefinition cube_r458 = leftFrontossicone.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(113, 91).addBox(-0.5F, -2.4F, 0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5264F, 0.281F, 1.9111F, 0.0F, 0.0F));

		PartDefinition cube_r459 = leftFrontossicone.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(113, 79).addBox(-0.5F, -2.2F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(113, 75).addBox(-0.5F, -1.1F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.5264F, 0.281F, 1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r460 = leftFrontossicone.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(84, 118).addBox(0.5F, 0.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.1621F, 0.0217F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r461 = leftFrontossicone.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(114, 11).addBox(0.5F, -0.0808F, -0.9926F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0F, -0.5379F, 0.3217F, 2.5133F, 0.0F, 0.0F));

		PartDefinition cube_r462 = leftFrontossicone.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(53, 113).addBox(0.5F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.1621F, 0.0217F, 2.0333F, 0.0F, 0.0F));

		PartDefinition rightFrontossicone = head.addOrReplaceChild("rightFrontossicone", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.867F, 1.3249F, -6.0235F, -0.0317F, 0.3477F, -0.0928F));

		PartDefinition cube_r463 = rightFrontossicone.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(113, 91).mirror().addBox(-0.5F, -2.4F, 0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5264F, 0.281F, 1.9111F, 0.0F, 0.0F));

		PartDefinition cube_r464 = rightFrontossicone.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(113, 79).mirror().addBox(-0.5F, -2.2F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(113, 75).mirror().addBox(-0.5F, -1.1F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5264F, 0.281F, 1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r465 = rightFrontossicone.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(84, 118).mirror().addBox(-1.5F, 0.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.1621F, 0.0217F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r466 = rightFrontossicone.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(114, 11).mirror().addBox(-1.5F, -0.0808F, -0.9926F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.0F, -0.5379F, 0.3217F, 2.5133F, 0.0F, 0.0F));

		PartDefinition cube_r467 = rightFrontossicone.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(53, 113).mirror().addBox(-1.5F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.1621F, 0.0217F, 2.0333F, 0.0F, 0.0F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offset(2.4F, 1.0856F, -1.9235F));

		PartDefinition cube_r468 = leftOrbit.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(89, 14).addBox(0.2037F, -0.6683F, -0.7438F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3734F, -0.8077F, 1.1759F, 0.4969F, -0.6755F, -0.1183F));

		PartDefinition cube_r469 = leftOrbit.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(72, 91).addBox(0.2867F, -1.3827F, 0.0086F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3734F, 0.0923F, 1.1759F, 0.8896F, -0.6755F, -0.1183F));

		PartDefinition cube_r470 = leftOrbit.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(68, 103).addBox(-0.1172F, -0.8483F, -0.4998F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3734F, 0.0923F, 1.1759F, 1.3597F, -0.2934F, 0.4599F));

		PartDefinition cube_r471 = leftOrbit.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(107, 95).addBox(-0.4904F, 0.8953F, -1.4479F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.2794F, 1.4824F, -0.5299F, -0.112F, 0.3259F, 0.3612F));

		PartDefinition cube_r472 = leftOrbit.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(31, 123).addBox(-0.4763F, 0.8527F, -0.3477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.2794F, 1.4824F, -0.5299F, 0.4154F, 0.1958F, 0.376F));

		PartDefinition cube_r473 = leftOrbit.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(10, 123).addBox(-0.4763F, -1.8473F, -0.3477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3794F, 1.4824F, -0.5299F, 0.4154F, 0.1958F, 0.376F));

		PartDefinition cube_r474 = leftOrbit.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(122, 122).addBox(-0.4763F, -1.8352F, -0.6198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3794F, 1.4824F, -0.5299F, 0.795F, 0.1958F, 0.376F));

		PartDefinition cube_r475 = leftOrbit.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(61, 107).addBox(-0.55F, -0.25F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.7031F, 1.9836F, -1.774F, 2.0039F, 0.3035F, 0.2692F));

		PartDefinition cube_r476 = leftOrbit.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(115, 60).addBox(-0.4961F, -0.0872F, -0.6166F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.85F, 0.7189F, -3.0475F, 1.0049F, 0.3215F, 0.2274F));

		PartDefinition cube_r477 = leftOrbit.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(115, 56).addBox(-0.5F, -1.0F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(115, 56).addBox(-0.5F, -1.0F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.85F, 1.919F, -2.2475F, 1.5111F, 0.3215F, 0.2274F));

		PartDefinition cube_r478 = leftOrbit.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(50, 64).addBox(-1.1172F, -0.9439F, -4.2073F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3734F, 0.0923F, 1.1759F, 1.5065F, -0.2636F, 0.5925F));

		PartDefinition cube_r479 = leftOrbit.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(0, 106).addBox(-2.0396F, -0.0034F, -0.6253F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6775F, 0.2872F, -1.1249F, 1.5877F, 0.135F, 0.4509F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offset(-2.4F, 1.0856F, -1.9235F));

		PartDefinition cube_r480 = rightOrbit.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(89, 14).mirror().addBox(-1.2037F, -0.6683F, -0.7438F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3734F, -0.8077F, 1.1759F, 0.4969F, 0.6755F, 0.1183F));

		PartDefinition cube_r481 = rightOrbit.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(72, 91).mirror().addBox(-1.2867F, -1.3827F, 0.0086F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3734F, 0.0923F, 1.1759F, 0.8896F, 0.6755F, 0.1183F));

		PartDefinition cube_r482 = rightOrbit.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(68, 103).mirror().addBox(-0.8828F, -0.8483F, -0.4998F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3734F, 0.0923F, 1.1759F, 1.3597F, 0.2934F, -0.4599F));

		PartDefinition cube_r483 = rightOrbit.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(107, 95).mirror().addBox(-0.5096F, 0.8953F, -1.4479F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.2794F, 1.4824F, -0.5299F, -0.112F, -0.3259F, -0.3612F));

		PartDefinition cube_r484 = rightOrbit.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(31, 123).mirror().addBox(-0.5237F, 0.8527F, -0.3477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.2794F, 1.4824F, -0.5299F, 0.4154F, -0.1958F, -0.376F));

		PartDefinition cube_r485 = rightOrbit.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(10, 123).mirror().addBox(-0.5237F, -1.8473F, -0.3477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.3794F, 1.4824F, -0.5299F, 0.4154F, -0.1958F, -0.376F));

		PartDefinition cube_r486 = rightOrbit.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(122, 122).mirror().addBox(-0.5237F, -1.8352F, -0.6198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3794F, 1.4824F, -0.5299F, 0.795F, -0.1958F, -0.376F));

		PartDefinition cube_r487 = rightOrbit.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(61, 107).mirror().addBox(-0.45F, -0.25F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.7031F, 1.9836F, -1.774F, 2.0039F, -0.3035F, -0.2692F));

		PartDefinition cube_r488 = rightOrbit.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(115, 60).mirror().addBox(-0.5039F, -0.0872F, -0.6166F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.85F, 0.7189F, -3.0475F, 1.0049F, -0.3215F, -0.2274F));

		PartDefinition cube_r489 = rightOrbit.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(115, 56).mirror().addBox(-0.5F, -1.0F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(115, 56).mirror().addBox(-0.5F, -1.0F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.85F, 1.919F, -2.2475F, 1.5111F, -0.3215F, -0.2274F));

		PartDefinition cube_r490 = rightOrbit.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(50, 64).mirror().addBox(-0.8828F, -0.9439F, -4.2073F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3734F, 0.0923F, 1.1759F, 1.5065F, 0.2636F, -0.5925F));

		PartDefinition cube_r491 = rightOrbit.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(0, 106).mirror().addBox(0.0396F, -0.0034F, -0.6253F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6775F, 0.2872F, -1.1249F, 1.5877F, -0.135F, -0.4509F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(97, 106).addBox(0.6F, -3.1588F, -0.4614F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(97, 106).mirror().addBox(-2.8F, -3.1588F, -0.4614F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.6F, 1.9633F, 0.7844F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r492 = jaw.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(17, 41).addBox(-1.8F, 2.3301F, 1.669F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 3.8736F, -9.7796F, -2.1468F, 0.0F, 0.0F));

		PartDefinition cube_r493 = jaw.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(73, 124).mirror().addBox(-0.0577F, -0.247F, -0.3715F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6426F, 3.495F, -5.3086F, -1.5556F, -0.2085F, 0.0152F));

		PartDefinition cube_r494 = jaw.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(114, 101).mirror().addBox(0.1769F, -1.9708F, -1.0272F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6426F, 4.795F, -9.9086F, -1.6232F, -0.2094F, 0.0F));

		PartDefinition cube_r495 = jaw.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(45, 114).mirror().addBox(-0.3429F, 0.4631F, 0.2941F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6426F, 3.495F, -7.4086F, -1.5795F, -0.2094F, 0.0F));

		PartDefinition cube_r496 = jaw.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(112, 112).mirror().addBox(0.1119F, -0.0897F, -0.0937F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 3.8736F, -9.7796F, -1.6916F, -0.1577F, -0.0064F));

		PartDefinition cube_r497 = jaw.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(63, 124).mirror().addBox(-0.0574F, -2.1464F, -0.2808F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(63, 124).addBox(2.1426F, -2.1464F, -0.2808F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6426F, 3.495F, -5.2086F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r498 = jaw.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(82, 109).mirror().addBox(-1.0F, 0.0279F, -1.0414F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(82, 109).addBox(0.6F, 0.0279F, -1.0414F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.9F, 5.0669F, -3.0257F, -1.597F, 0.0F, 0.0F));

		PartDefinition cube_r499 = jaw.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(114, 95).mirror().addBox(-1.0F, -0.191F, -0.7582F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(114, 95).addBox(0.6F, -0.191F, -0.7582F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.9F, 4.6669F, -6.2257F, -1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r500 = jaw.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(31, 114).mirror().addBox(-1.0F, -0.266F, -0.9832F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false)
				.texOffs(31, 114).addBox(0.6F, -0.266F, -0.9832F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-0.9F, 4.6669F, -6.2257F, -1.5446F, 0.0F, 0.0F));

		PartDefinition cube_r501 = jaw.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(80, 114).mirror().addBox(-0.5F, -1.9568F, -0.0695F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(80, 114).addBox(1.1F, -1.9568F, -0.0695F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.4F, 2.8763F, -2.7753F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r502 = jaw.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(7, 97).mirror().addBox(-0.5F, -1.0F, -1.65F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 97).addBox(1.1F, -1.0F, -1.65F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 4.3763F, -2.2753F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r503 = jaw.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(81, 91).mirror().addBox(-1.0F, -0.1689F, -0.1572F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(81, 91).addBox(2.2F, -0.1689F, -0.1572F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.7F, 0.6669F, 0.2743F, -1.4181F, 0.0F, 0.0F));

		PartDefinition cube_r504 = jaw.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(122, 113).mirror().addBox(-0.5F, -0.05F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(122, 113).addBox(1.1F, -0.05F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4F, 3.8941F, -3.5401F, -1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r505 = jaw.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(115, 46).mirror().addBox(-1.0F, -0.9696F, 0.6873F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(115, 46).addBox(0.6F, -0.9696F, 0.6873F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 2.8669F, -5.1257F, -1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r506 = jaw.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(78, 96).mirror().addBox(-1.0F, -0.1187F, -1.7433F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 96).addBox(2.2F, -0.1187F, -1.7433F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 3.9669F, 0.0743F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r507 = jaw.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(124, 38).mirror().addBox(-1.0F, 0.2F, 1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(124, 38).addBox(2.2F, 0.2F, 1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.7F, 1.5669F, -1.3257F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r508 = jaw.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(85, 103).mirror().addBox(-1.1F, -3.3F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(85, 103).addBox(2.3F, -3.3F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.7F, 0.0669F, -0.9257F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r509 = jaw.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(98, 13).mirror().addBox(-1.0F, -0.1922F, -0.0366F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(98, 13).addBox(2.2F, -0.1922F, -0.0366F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-1.7F, 0.8669F, -1.2257F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r510 = jaw.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(121, 13).mirror().addBox(-1.0F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(121, 13).addBox(2.2F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.7F, 0.0669F, -0.8257F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r511 = jaw.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(73, 124).addBox(0.0577F, -0.247F, -0.3715F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4426F, 3.495F, -5.3086F, -1.5556F, 0.2085F, -0.0152F));

		PartDefinition cube_r512 = jaw.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(114, 101).addBox(-1.1769F, -1.9708F, -1.0272F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.4426F, 4.795F, -9.9086F, -1.6232F, 0.2094F, 0.0F));

		PartDefinition cube_r513 = jaw.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(45, 114).addBox(-0.6571F, 0.4631F, 0.2941F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4426F, 3.495F, -7.4086F, -1.5795F, 0.2094F, 0.0F));

		PartDefinition cube_r514 = jaw.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(112, 112).addBox(-1.1119F, -0.0897F, -0.0937F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4F, 3.8736F, -9.7796F, -1.6916F, 0.1577F, 0.0064F));

		PartDefinition cube_r515 = jaw.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(121, 3).addBox(-1.8F, 2.2883F, -0.2286F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 3.8736F, -9.7796F, -1.6581F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(37, 63).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(33, 72).addBox(0.0F, -0.8F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 92).addBox(0.0F, -0.8F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5464F, 1.6845F, -0.9452F, 0.1291F, -0.1764F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(70, 86).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F))
				.texOffs(23, 93).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 18).addBox(0.0F, -0.4F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0568F, 4.947F, -0.4422F, -0.158F, 0.0744F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(11, 71).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0037F, 2.8952F, -0.176F, -0.1289F, 0.0229F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0125F, 3.958F, -0.1787F, -0.2148F, 0.0385F));

		PartDefinition cube_r516 = tail4.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(17, 43).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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