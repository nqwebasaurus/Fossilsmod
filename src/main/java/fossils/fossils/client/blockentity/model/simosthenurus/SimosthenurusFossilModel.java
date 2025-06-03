package fossils.fossils.client.blockentity.model.simosthenurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SimosthenurusFossilModel extends SkullModelBase {
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
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftThumb;
	private final ModelPart leftThumb2;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightThumb;
	private final ModelPart rightThumb2;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftZygomaticarch;
	private final ModelPart rightZygomaticarch;
	private final ModelPart leftMaxilla;
	private final ModelPart rightMaxilla;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public SimosthenurusFossilModel(ModelPart root) {
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
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body3 = this.body.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.chest = this.body4.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftThumb = this.leftArm3.getChild("leftThumb");
		this.leftThumb2 = this.leftArm3.getChild("leftThumb2");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightThumb = this.rightArm3.getChild("rightThumb");
		this.rightThumb2 = this.rightArm3.getChild("rightThumb2");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftZygomaticarch = this.head.getChild("leftZygomaticarch");
		this.rightZygomaticarch = this.head.getChild("rightZygomaticarch");
		this.leftMaxilla = this.head.getChild("leftMaxilla");
		this.rightMaxilla = this.head.getChild("rightMaxilla");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -19.7597F, 15.6796F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(39, 76).addBox(0.0F, -0.8F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 75).addBox(0.0F, -1.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 96).addBox(0.0F, -1.5F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 67).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 29).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -3.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(40, 23).mirror().addBox(0.0807F, 0.3715F, -1.731F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.14F, 3.5572F, -0.5476F, -0.3476F, -0.3346F, -0.8553F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(83, 49).mirror().addBox(0.2738F, -1.361F, 3.8599F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8528F, -0.0471F, -2.0981F, -0.5698F, -0.5669F, -0.8976F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(33, 13).mirror().addBox(0.0807F, 0.3557F, -0.5363F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.14F, 3.5572F, -0.5476F, 0.1934F, -0.3346F, -0.8553F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(49, 61).mirror().addBox(-1.6263F, -1.8287F, -3.747F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.14F, 3.5572F, -0.5476F, -2.0778F, 0.4423F, -1.4121F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(71, 40).mirror().addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.912F, 2.252F, 1.0587F, -0.7004F, -0.3792F, -0.6137F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(11, 64).mirror().addBox(-0.3378F, -0.4061F, -3.1052F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.34F, 3.5572F, -1.6476F, -0.1735F, 0.3458F, -0.9902F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(55, 54).mirror().addBox(-0.3437F, 0.0338F, -3.941F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.14F, 3.5572F, -0.5476F, -1.2265F, -0.359F, -0.7857F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(44, 54).mirror().addBox(-0.7472F, -0.425F, -0.1726F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8528F, -0.0471F, -2.0981F, -0.4538F, 0.0F, -0.6981F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(63, 0).mirror().addBox(-3.8F, -0.1474F, -0.8623F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -1.5F, -1.2F, -0.1807F, -0.0653F, -0.3431F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(49, 61).addBox(0.6263F, -1.8287F, -3.747F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.14F, 3.5572F, -0.5476F, -2.0778F, -0.4423F, 1.4121F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(83, 49).addBox(-1.2738F, -1.361F, 3.8599F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8528F, -0.0471F, -2.0981F, -0.5698F, 0.5669F, 0.8976F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(71, 40).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.912F, 2.252F, 1.0587F, -0.7004F, 0.3792F, 0.6137F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(11, 64).addBox(-0.6622F, -0.4061F, -3.1052F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.34F, 3.5572F, -1.6476F, -0.1735F, -0.3458F, 0.9902F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(33, 13).addBox(-1.0807F, 0.3557F, -0.5363F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.14F, 3.5572F, -0.5476F, 0.1934F, 0.3346F, 0.8553F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(40, 23).addBox(-1.0807F, 0.3715F, -1.731F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.14F, 3.5572F, -0.5476F, -0.3476F, 0.3346F, 0.8553F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(55, 54).addBox(-0.6563F, 0.0338F, -3.941F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.14F, 3.5572F, -0.5476F, -1.2265F, 0.359F, 0.7857F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(44, 54).addBox(-0.2528F, -0.425F, -0.1726F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8528F, -0.0471F, -2.0981F, -0.4538F, 0.0F, 0.6981F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(80, 40).mirror().addBox(0.4689F, -6.6861F, -6.7267F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0528F, -0.0471F, -2.4981F, -0.2788F, -0.2798F, -0.5103F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(36, 29).mirror().addBox(0.4689F, -1.5207F, -8.0727F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0528F, -0.0471F, -2.4981F, -1.0468F, -0.2798F, -0.5103F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(33, 54).mirror().addBox(-0.3514F, -0.712F, -2.9118F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.0528F, -0.0471F, -2.4981F, -1.4797F, -0.4424F, -0.2121F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(80, 40).addBox(-1.4689F, -6.6861F, -6.7267F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0528F, -0.0471F, -2.4981F, -0.2788F, 0.2798F, 0.5103F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(36, 29).addBox(-1.4689F, -1.5207F, -8.0727F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0528F, -0.0471F, -2.4981F, -1.0468F, 0.2798F, 0.5103F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(33, 54).addBox(-0.6486F, -0.712F, -2.9118F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.0528F, -0.0471F, -2.4981F, -1.4797F, 0.4424F, 0.2121F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(63, 0).addBox(-0.2F, -0.1474F, -0.8623F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7F, -1.5F, -1.2F, -0.1807F, 0.0653F, 0.3431F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(52, 96).addBox(0.0F, -2.068F, -0.0777F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3F, -4.9F, -0.3316F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.1F, 0.7727F, -1.0827F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r27 = leftLeg.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(67, 4).addBox(-2.0F, -1.3F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.0091F, -0.1157F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r28 = leftLeg.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(12, 80).addBox(-1.0F, -0.2133F, -1.0342F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 4.2959F, 0.78F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r29 = leftLeg.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(44, 84).addBox(-1.0F, -8.2703F, 0.1769F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 79).addBox(-1.0F, -8.2703F, -0.5231F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.5F, 8.5959F, -0.62F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r30 = leftLeg.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(7, 80).addBox(-1.0F, 0.0125F, -0.0358F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.5F, 4.2959F, -0.92F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r31 = leftLeg.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(48, 23).addBox(-1.5F, -0.844F, -0.7796F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0F, 9.8122F, 1.867F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r32 = leftLeg.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(66, 13).addBox(-1.0F, -1.4304F, -1.0499F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 9.8122F, 1.867F, 0.576F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 8.4682F, 3.6188F, 2.6704F, 0.0F, 0.0F));

		PartDefinition cube_r33 = leftLeg2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(9, 70).addBox(-1.914F, -1.4819F, -0.6398F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.4F, 0.4737F, -1.9446F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r34 = leftLeg2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(78, 49).addBox(-0.4559F, 0.6365F, -0.5656F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.1F, 0.786F, 0.9319F, -0.0525F, 0.0049F, -0.0522F));

		PartDefinition cube_r35 = leftLeg2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(18, 78).addBox(-0.4559F, 0.6406F, 0.097F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1F, 0.786F, 0.9319F, -0.1572F, 0.0049F, -0.0522F));

		PartDefinition cube_r36 = leftLeg2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(61, 81).addBox(-0.4002F, -0.8516F, -0.9403F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.1F, 0.786F, 0.9319F, -0.0528F, 0.0121F, -0.0513F));

		PartDefinition cube_r37 = leftLeg2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(22, 67).addBox(-0.4559F, 11.293F, -0.9917F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.1F, 0.786F, 0.9319F, -0.0525F, 0.0049F, -0.0522F));

		PartDefinition cube_r38 = leftLeg2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(68, 84).addBox(-0.4559F, 7.719F, -0.3868F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.1F, 0.786F, 0.9319F, -0.1049F, 0.0049F, -0.0522F));

		PartDefinition cube_r39 = leftLeg2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(22, 92).addBox(-0.4559F, 6.0826F, 0.5712F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.1F, 0.786F, 0.9319F, -0.2271F, 0.0049F, -0.0522F));

		PartDefinition cube_r40 = leftLeg2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(57, 74).addBox(-1.009F, 7.4086F, -0.8373F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.4737F, -1.9446F, 0.1219F, -0.0085F, -0.0005F));

		PartDefinition cube_r41 = leftLeg2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(44, 79).addBox(-1.009F, 7.3998F, 1.2088F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.157F))
				.texOffs(35, 61).addBox(-1.009F, 7.3998F, 1.6088F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4737F, -1.9446F, -0.0701F, -0.0085F, -0.0005F));

		PartDefinition cube_r42 = leftLeg2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(43, 72).addBox(-1.009F, 14.9525F, 2.4057F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.4737F, -1.9446F, -0.1225F, -0.0085F, -0.0005F));

		PartDefinition cube_r43 = leftLeg2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(15, 46).addBox(-1.009F, -0.2183F, 0.3426F, 2.0F, 8.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.4737F, -1.9446F, -0.0352F, -0.0085F, -0.0005F));

		PartDefinition cube_r44 = leftLeg2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(64, 28).addBox(-1.015F, 3.4071F, -1.1773F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, 0.4737F, -1.9446F, 0.1744F, -0.0049F, -0.0002F));

		PartDefinition cube_r45 = leftLeg2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(60, 67).addBox(-1.015F, -0.1835F, -0.671F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4737F, -1.9446F, 0.0347F, -0.0049F, -0.0002F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 20.796F, -2.1496F, -1.5621F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(85, 73).addBox(-1.5F, -0.1105F, -0.2248F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.2557F, -1.3179F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(85, 57).addBox(-1.0F, -2.0135F, -0.9461F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.2443F, 1.1821F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(32, 76).addBox(-1.5F, -3.0F, -0.7F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.4557F, -0.1179F, -0.3665F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(0, 38).addBox(-1.1F, -0.1629F, -5.9132F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 4.6671F, -1.2262F, 0.5934F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.1F, 0.7727F, -1.0827F, -1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r49 = rightLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(49, 67).addBox(-1.0F, -1.3F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -0.0091F, -0.1157F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r50 = rightLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(80, 72).addBox(0.0F, -0.2133F, -1.0342F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 4.2959F, 0.78F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r51 = rightLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 85).addBox(0.0F, -8.2703F, 0.1769F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 84).addBox(0.0F, -8.2703F, -0.5231F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5F, 8.5959F, -0.62F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r52 = rightLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(80, 57).addBox(0.0F, 0.0125F, -0.0358F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5F, 4.2959F, -0.92F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r53 = rightLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(51, 29).addBox(-1.5F, -0.844F, -0.7796F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.0F, 9.8122F, 1.867F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r54 = rightLeg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(66, 54).addBox(-1.0F, -1.4304F, -1.0499F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 9.8122F, 1.867F, 0.576F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 8.4682F, 3.6188F, 2.3911F, 0.0F, 0.0F));

		PartDefinition cube_r55 = rightLeg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(32, 71).addBox(-1.086F, -1.4819F, -0.6398F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.4F, 0.4737F, -1.9446F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r56 = rightLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(39, 79).addBox(-0.5441F, 0.6365F, -0.5656F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1F, 0.786F, 0.9319F, -0.0525F, -0.0049F, 0.0522F));

		PartDefinition cube_r57 = rightLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(23, 78).addBox(-0.5441F, 0.6406F, 0.097F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, 0.786F, 0.9319F, -0.1572F, -0.0049F, 0.0522F));

		PartDefinition cube_r58 = rightLeg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(82, 27).addBox(-0.5998F, -0.8516F, -0.9403F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.1F, 0.786F, 0.9319F, -0.0528F, -0.0121F, 0.0513F));

		PartDefinition cube_r59 = rightLeg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(27, 67).addBox(-0.5441F, 11.293F, -0.9917F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.1F, 0.786F, 0.9319F, -0.0525F, -0.0049F, 0.0522F));

		PartDefinition cube_r60 = rightLeg2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(85, 0).addBox(-0.5441F, 7.719F, -0.3868F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.1F, 0.786F, 0.9319F, -0.1049F, -0.0049F, 0.0522F));

		PartDefinition cube_r61 = rightLeg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(27, 92).addBox(-0.5441F, 6.0826F, 0.5712F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.1F, 0.786F, 0.9319F, -0.2271F, -0.0049F, 0.0522F));

		PartDefinition cube_r62 = rightLeg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(64, 74).addBox(-0.991F, 7.4086F, -0.8373F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.4737F, -1.9446F, 0.1219F, 0.0085F, 0.0005F));

		PartDefinition cube_r63 = rightLeg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(71, 79).addBox(-0.991F, 7.3998F, 1.2088F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.157F))
				.texOffs(42, 61).addBox(-0.991F, 7.3998F, 1.6088F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4737F, -1.9446F, -0.0701F, 0.0085F, 0.0005F));

		PartDefinition cube_r64 = rightLeg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(50, 72).addBox(-0.991F, 14.9525F, 2.4057F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.4737F, -1.9446F, -0.1225F, 0.0085F, 0.0005F));

		PartDefinition cube_r65 = rightLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(24, 46).addBox(-0.991F, -0.2183F, 0.3426F, 2.0F, 8.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.4737F, -1.9446F, -0.0352F, 0.0085F, 0.0005F));

		PartDefinition cube_r66 = rightLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(0, 65).addBox(-0.985F, 3.4071F, -1.1773F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, 0.4737F, -1.9446F, 0.1744F, 0.0049F, 0.0002F));

		PartDefinition cube_r67 = rightLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(69, 67).addBox(-0.985F, -0.1835F, -0.671F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4737F, -1.9446F, 0.0347F, 0.0049F, 0.0002F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 20.796F, -2.1496F, -1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(83, 85).addBox(-0.5F, -0.1105F, -0.2248F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.2557F, -1.3179F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(85, 61).addBox(0.0F, -2.0135F, -0.9461F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.2443F, 1.1821F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 78).addBox(-0.5F, -3.0F, -0.7F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.4557F, -0.1179F, -0.3665F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(15, 38).addBox(0.1F, -0.1629F, -5.9132F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 4.6671F, -1.2262F, 1.2479F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.573F, -4.8887F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r71 = body2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(83, 93).addBox(-0.5F, -2.7F, 2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 75).addBox(-0.5F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2741F, -4.018F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r72 = body2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(27, 96).mirror().addBox(-1.0F, -0.0418F, -0.1022F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.824F, -1.9625F, -0.1579F, 0.1034F, -0.0164F));

		PartDefinition cube_r73 = body2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(22, 96).mirror().addBox(-1.0F, -0.0418F, -0.1022F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.824F, -3.9625F, -0.1983F, 0.6536F, -0.1216F));

		PartDefinition cube_r74 = body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(27, 96).addBox(0.0F, -0.0418F, -0.1022F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.824F, -1.9625F, -0.1579F, -0.1034F, 0.0164F));

		PartDefinition cube_r75 = body2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(22, 96).addBox(0.0F, -0.0418F, -0.1022F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.824F, -3.9625F, -0.1983F, -0.6536F, 0.1216F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(60, 61).addBox(-1.0F, -0.1F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -1.2741F, -4.018F, -0.1571F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7741F, -3.818F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(86, 93).addBox(-0.5F, -2.938F, -0.0476F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, -2.2F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(13, 92).addBox(-0.5F, -2.9681F, -0.0419F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -4.2F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(32, 96).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0537F, -1.6643F, 0.3787F, 0.7912F, 0.2053F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(76, 26).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8954F, 0.3428F, -3.3791F, 0.3467F, 0.4439F, 0.2015F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(32, 96).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0537F, -1.6643F, 0.3787F, -0.7912F, -0.2053F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(76, 26).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8954F, 0.3428F, -3.3791F, 0.3467F, -0.4439F, -0.2015F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(24, 61).addBox(-1.0F, -0.5F, -3.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -0.8F, 0.1571F, 0.0F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.4537F, -3.7643F, 0.2021F, 0.06F, 0.1454F));

		PartDefinition cube_r84 = body3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(0, 91).addBox(-0.5F, -3.1767F, -0.0866F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -2.2F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r85 = body3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(89, 93).addBox(-0.5F, -2.8205F, -4.0717F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.2F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r86 = body3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(50, 0).addBox(-1.0F, -0.449F, -5.0633F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.2F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r87 = body3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(8, 96).mirror().addBox(-1.0603F, -0.0386F, -0.2882F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1F, -3.8F, 1.118F, 0.1642F, 0.2367F));

		PartDefinition cube_r88 = body3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(90, 50).mirror().addBox(-2.9226F, -0.5239F, -0.2882F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1F, -3.8F, 1.0255F, 0.5879F, -0.0086F));

		PartDefinition cube_r89 = body3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(90, 48).mirror().addBox(-4.2009F, -1.993F, -0.2882F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1F, -3.8F, 0.622F, 1.0109F, -0.5525F));

		PartDefinition cube_r90 = body3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(5, 90).mirror().addBox(-1.3775F, 0.0712F, -1.8481F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1F, -0.2F, 0.3218F, 0.4044F, 0.1563F));

		PartDefinition cube_r91 = body3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(8, 96).addBox(0.0603F, -0.0386F, -0.2882F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -3.8F, 1.118F, -0.1642F, -0.2367F));

		PartDefinition cube_r92 = body3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(90, 50).addBox(0.9226F, -0.5239F, -0.2882F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -3.8F, 1.0255F, -0.5879F, 0.0086F));

		PartDefinition cube_r93 = body3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(90, 48).addBox(2.2009F, -1.993F, -0.2882F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -3.8F, 0.622F, -1.0109F, 0.5525F));

		PartDefinition cube_r94 = body3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(5, 90).addBox(-0.6225F, 0.0712F, -1.8481F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.2F, 0.3218F, -0.4044F, -0.1563F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(94, 42).addBox(-0.5F, -3.1523F, -4.9986F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 94).addBox(-0.5F, -3.3523F, -2.9986F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3F, -4.9F, 0.7161F, 0.0329F, 0.0286F));

		PartDefinition cube_r95 = body4.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(28, 78).addBox(-0.5F, -2.8523F, 0.0014F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r96 = body4.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(90, 4).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.022F, -0.5456F, 0.467F, 0.3937F, -0.4861F));

		PartDefinition cube_r97 = body4.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(96, 75).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.022F, -0.5456F, 0.5848F, 0.1488F, -0.056F));

		PartDefinition cube_r98 = body4.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(56, 9).mirror().addBox(-8.2036F, -1.9215F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.022F, -0.5456F, 0.1792F, 0.5772F, -1.0861F));

		PartDefinition cube_r99 = body4.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(33, 52).mirror().addBox(-9.2036F, -1.9215F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.022F, -2.5456F, 0.1418F, 0.5151F, -1.1055F));

		PartDefinition cube_r100 = body4.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(91, 22).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.022F, -2.5456F, 0.4011F, 0.3603F, -0.5104F));

		PartDefinition cube_r101 = body4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(97, 3).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.022F, -2.5456F, 0.5144F, 0.1445F, -0.0663F));

		PartDefinition cube_r102 = body4.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(91, 20).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.022F, -4.5456F, 0.3368F, 0.3256F, -0.532F));

		PartDefinition cube_r103 = body4.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(96, 91).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.022F, -4.5456F, 0.444F, 0.1396F, -0.0763F));

		PartDefinition cube_r104 = body4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(40, 21).mirror().addBox(-10.2036F, -1.9215F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.022F, -4.5456F, 0.107F, 0.4524F, -1.1217F));

		PartDefinition cube_r105 = body4.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(56, 9).addBox(2.2036F, -1.9215F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.022F, -0.5456F, 0.1792F, -0.5772F, 1.0861F));

		PartDefinition cube_r106 = body4.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(96, 75).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.022F, -0.5456F, 0.5848F, -0.1488F, 0.056F));

		PartDefinition cube_r107 = body4.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(90, 4).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.022F, -0.5456F, 0.467F, -0.3937F, 0.4861F));

		PartDefinition cube_r108 = body4.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(97, 3).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.022F, -2.5456F, 0.5144F, -0.1445F, 0.0663F));

		PartDefinition cube_r109 = body4.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(91, 22).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.022F, -2.5456F, 0.4011F, -0.3603F, 0.5104F));

		PartDefinition cube_r110 = body4.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(33, 52).addBox(2.2036F, -1.9215F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.022F, -2.5456F, 0.1418F, -0.5151F, 1.1055F));

		PartDefinition cube_r111 = body4.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(40, 21).addBox(2.2036F, -1.9215F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.022F, -4.5456F, 0.107F, -0.4524F, 1.1217F));

		PartDefinition cube_r112 = body4.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(96, 91).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.022F, -4.5456F, 0.444F, -0.1396F, 0.0763F));

		PartDefinition cube_r113 = body4.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(91, 20).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.022F, -4.5456F, 0.3368F, -0.3256F, 0.532F));

		PartDefinition cube_r114 = body4.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(30, 38).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -6.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.3463F, -5.8357F, -0.129F, 0.1414F, 0.069F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(69, 92).addBox(0.0F, -4.7046F, 5.6654F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 94).addBox(0.0F, -4.4046F, 3.7654F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 94).addBox(0.0F, -3.9046F, 2.0654F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.178F, -6.6456F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(93, 89).addBox(0.0F, -2.9046F, 0.0654F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.178F, -6.6456F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(21, 27).mirror().addBox(-11.656F, 0.0779F, -0.6599F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4627F, 9.8375F, 2.0271F, 0.5849F, 0.8218F, 0.9411F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(33, 9).mirror().addBox(-9.656F, 0.0779F, -0.6599F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4627F, 9.8375F, 2.0271F, 0.4752F, 0.7427F, 0.7904F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(33, 11).mirror().addBox(-8.256F, 0.0779F, -0.6599F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4627F, 9.8375F, 2.0271F, 0.3435F, 0.6008F, 0.5907F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(54, 11).mirror().addBox(-6.756F, 0.0779F, -0.6599F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4627F, 9.8375F, 2.0271F, 0.364F, 0.305F, 0.6139F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(50, 52).mirror().addBox(-6.2683F, 0.0375F, -0.2479F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4627F, 9.8375F, 0.5271F, 0.3147F, 0.142F, 0.4418F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(0.0276F, -1.4513F, -0.8959F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.1806F, 4.328F, -5.8068F, 1.5362F, -0.3458F, 0.2728F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(96, 77).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0317F, -0.6099F, 0.532F, 0.1457F, -0.0638F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(90, 52).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0317F, -0.6099F, 0.4174F, 0.3688F, -0.5046F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(51, 35).mirror().addBox(-9.2036F, -1.9215F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0317F, -0.6099F, 0.1509F, 0.5307F, -1.1009F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(55, 13).mirror().addBox(0.0276F, -0.4896F, -3.0192F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.1806F, 4.328F, -5.8068F, 0.6024F, -0.3458F, 0.2728F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(88, 82).mirror().addBox(-1.0143F, 0.304F, -2.7896F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1806F, 4.328F, -5.8068F, 0.7073F, -0.3993F, 0.2246F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(71, 35).mirror().addBox(-0.755F, 0.304F, -1.0676F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1806F, 4.328F, -5.8068F, 0.6564F, -0.1955F, 0.3969F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(13, 57).mirror().addBox(0.0276F, -1.0422F, -1.0994F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1806F, 4.328F, -5.8068F, 0.9951F, -0.3458F, 0.2728F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(66, 18).mirror().addBox(-7.2036F, -1.9215F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.2317F, -6.0099F, 0.2149F, 0.6253F, -1.2698F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(73, 33).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.2317F, -6.0099F, 0.5231F, 0.4167F, -0.668F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(66, 59).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.2317F, -6.0099F, 0.6419F, 0.1486F, -0.2516F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(37, 96).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3317F, -4.1099F, 0.5093F, 0.0929F, -0.078F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(66, 90).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3317F, -4.1099F, 0.4196F, 0.3115F, -0.5154F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(60, 49).mirror().addBox(-8.2036F, -1.9215F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3317F, -4.1099F, 0.1892F, 0.4841F, -1.0939F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(96, 89).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6317F, -2.4099F, 0.488F, 0.1428F, -0.0701F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(90, 54).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6317F, -2.4099F, 0.3768F, 0.3474F, -0.5188F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(50, 7).mirror().addBox(-9.2036F, -1.9215F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6317F, -2.4099F, 0.1285F, 0.4916F, -1.1119F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(72, 20).mirror().addBox(0.0276F, -0.3893F, -0.0018F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.1806F, 4.328F, -5.8068F, 0.7072F, -0.3458F, 0.2728F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(67, 51).mirror().addBox(-1.5F, -0.4F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0252F, 7.0298F, -6.4506F, -0.377F, 0.0748F, 0.1864F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(61, 26).mirror().addBox(-5.6788F, 0.2085F, -0.7036F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4627F, 9.1375F, -0.8729F, 0.2589F, 0.0603F, 0.4027F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(71, 65).mirror().addBox(-3.8836F, -0.0096F, -0.4605F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5627F, 8.5375F, -3.0729F, -0.3116F, 0.2011F, 0.2664F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(55, 13).addBox(-1.0276F, -0.4896F, -3.0192F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.1806F, 4.328F, -5.8068F, 0.6024F, 0.3458F, -0.2728F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(88, 82).addBox(0.0143F, 0.304F, -2.7896F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1806F, 4.328F, -5.8068F, 0.7073F, 0.3993F, -0.2246F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(71, 35).addBox(-0.245F, 0.304F, -1.0676F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1806F, 4.328F, -5.8068F, 0.6564F, 0.1955F, -0.3969F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(0, 58).addBox(-1.0276F, -1.4513F, -0.8959F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.1806F, 4.328F, -5.8068F, 1.5362F, 0.3458F, -0.2728F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(13, 57).addBox(-1.0276F, -1.0422F, -1.0994F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1806F, 4.328F, -5.8068F, 0.9951F, 0.3458F, -0.2728F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(66, 18).addBox(2.2036F, -1.9215F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2317F, -6.0099F, 0.2149F, -0.6253F, 1.2698F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(73, 33).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2317F, -6.0099F, 0.5231F, -0.4167F, 0.668F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(66, 59).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2317F, -6.0099F, 0.6419F, -0.1486F, 0.2516F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(37, 96).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3317F, -4.1099F, 0.5093F, -0.0929F, 0.078F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(66, 90).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3317F, -4.1099F, 0.4196F, -0.3115F, 0.5154F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(60, 49).addBox(2.2036F, -1.9215F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3317F, -4.1099F, 0.1892F, -0.4841F, 1.0939F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(51, 35).addBox(2.2036F, -1.9215F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0317F, -0.6099F, 0.1509F, -0.5307F, 1.1009F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(90, 52).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0317F, -0.6099F, 0.4174F, -0.3688F, 0.5046F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(96, 77).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0317F, -0.6099F, 0.532F, -0.1457F, 0.0638F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(96, 89).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6317F, -2.4099F, 0.488F, -0.1428F, 0.0701F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(90, 54).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6317F, -2.4099F, 0.3768F, -0.3474F, 0.5188F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(50, 7).addBox(2.2036F, -1.9215F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6317F, -2.4099F, 0.1285F, -0.4916F, 1.1119F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(72, 20).addBox(-1.0276F, -0.3893F, -0.0018F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.1806F, 4.328F, -5.8068F, 0.7072F, 0.3458F, -0.2728F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(67, 51).addBox(-1.5F, -0.4F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0252F, 7.0298F, -6.4506F, -0.377F, -0.0748F, -0.1864F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(21, 27).addBox(-0.344F, 0.0779F, -0.6599F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4627F, 9.8375F, 2.0271F, 0.5849F, -0.8218F, -0.9411F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(33, 9).addBox(-0.344F, 0.0779F, -0.6599F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4627F, 9.8375F, 2.0271F, 0.4752F, -0.7427F, -0.7904F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(33, 11).addBox(-0.744F, 0.0779F, -0.6599F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4627F, 9.8375F, 2.0271F, 0.3435F, -0.6008F, -0.5907F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(54, 11).addBox(-0.244F, 0.0779F, -0.6599F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4627F, 9.8375F, 2.0271F, 0.364F, -0.305F, -0.6139F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(50, 52).addBox(-0.7317F, 0.0375F, -0.2479F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4627F, 9.8375F, 0.5271F, 0.3147F, -0.142F, -0.4418F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(61, 26).addBox(-0.3212F, 0.2085F, -0.7036F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4627F, 9.1375F, -0.8729F, 0.2589F, -0.0603F, -0.4027F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(71, 65).addBox(-0.1164F, -0.0096F, -0.4605F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5627F, 8.5375F, -3.0729F, -0.3116F, -0.2011F, -0.2664F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(73, 28).addBox(-1.7627F, -1.0852F, -3.0406F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2627F, 8.3375F, -5.5729F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(21, 17).addBox(-1.7627F, 0.5503F, -2.3331F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2627F, 7.5375F, -2.8729F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(60, 43).addBox(-0.5F, -0.0814F, 0.0405F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.778F, -4.0456F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(33, 46).addBox(-0.5F, -0.8747F, 0.0866F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.378F, -7.2456F, 0.4887F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.6F, 7.3915F, -7.1202F, 0.6191F, 0.0927F, -0.3822F));

		PartDefinition cube_r173 = leftarm.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(78, 4).addBox(-0.5F, -1.0F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0131F, -0.0741F, -0.4254F, 0.1744F, 0.0013F, -0.0011F));

		PartDefinition cube_r174 = leftarm.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(85, 65).addBox(-1.0F, -0.0873F, -1.1134F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.3099F, 3.856F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r175 = leftarm.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(61, 86).addBox(-0.2F, -0.0423F, -0.9809F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 2.3099F, 1.556F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r176 = leftarm.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(12, 87).addBox(0.2F, -2.7284F, -0.9106F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 4.2099F, 3.456F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r177 = leftarm.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(86, 20).addBox(0.0F, -0.2111F, -0.9556F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.5099F, 0.856F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r178 = leftarm.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(5, 87).addBox(-1.5F, -0.3F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.8237F, 3.8199F, -0.1047F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 6.5302F, 3.9849F, -0.0322F, 0.0295F, 0.7413F));

		PartDefinition cube_r179 = leftarm2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(95, 16).addBox(-0.9913F, -0.4978F, -0.0424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.764F, 0.6298F, 0.2549F, -1.5708F, -1.3614F, 1.6755F));

		PartDefinition cube_r180 = leftarm2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(51, 79).addBox(-1.8166F, 4.6678F, -0.0424F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.764F, 0.6298F, 0.2549F, -1.5708F, -1.2392F, 1.6755F));

		PartDefinition cube_r181 = leftarm2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(89, 30).addBox(-0.1396F, -0.1747F, 0.198F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.764F, 2.9298F, -2.3451F, -1.5708F, -1.2566F, 1.6755F));

		PartDefinition cube_r182 = leftarm2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(89, 25).addBox(0.0391F, -0.1451F, -0.0424F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.764F, 0.6298F, -0.8451F, -1.5708F, -0.925F, 1.6755F));

		PartDefinition cube_r183 = leftarm2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(49, 91).addBox(-0.3006F, 0.0084F, -0.0596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.064F, 1.6298F, 0.7549F, 1.5708F, 1.3788F, -1.6232F));

		PartDefinition cube_r184 = leftarm2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(95, 83).addBox(-0.6F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5056F, -0.825F, 0.9635F, 1.5708F, 0.0698F, -1.6232F));

		PartDefinition cube_r185 = leftarm2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(92, 56).addBox(-1.0437F, -0.0538F, -0.1538F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.064F, 3.4298F, -0.0451F, -1.5708F, -0.9163F, 1.5184F));

		PartDefinition cube_r186 = leftarm2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(64, 92).addBox(-0.9688F, 0.0523F, -0.0596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.064F, 1.6298F, 1.0549F, -1.5708F, -0.9861F, 1.5184F));

		PartDefinition cube_r187 = leftarm2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(81, 20).addBox(-1.4354F, 3.4407F, -0.0596F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.064F, 1.6298F, 0.7549F, -1.5708F, -1.1519F, 1.5184F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.0209F, -3.6281F, -0.9599F, -1.3526F, 1.5708F));

		PartDefinition cube_r188 = leftArm3.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(82, 9).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0423F, 0.0906F, 0.0F, 0.0F, -0.1745F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2911F, 1.5818F, -0.2411F, 0.6533F, 0.0337F, 0.0294F));

		PartDefinition cube_r189 = leftArm4.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(45, 38).addBox(-1.4F, -0.6107F, -3.4276F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6F, 0.0F, 1.0547F, -0.1344F, -0.1117F));

		PartDefinition leftThumb = leftArm3.addOrReplaceChild("leftThumb", CubeListBuilder.create().texOffs(24, 87).addBox(-0.2632F, -0.2272F, -0.2154F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9707F, 0.5969F, -0.3022F, 0.1752F, 0.0983F, 0.2957F));

		PartDefinition leftThumb2 = leftArm3.addOrReplaceChild("leftThumb2", CubeListBuilder.create().texOffs(88, 77).addBox(-0.2632F, -0.2272F, -0.2154F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5992F, 0.9143F, -0.3746F, 0.3233F, -0.1537F, -0.8139F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.6F, 7.3915F, -7.1202F, -0.0354F, -0.0927F, 0.3822F));

		PartDefinition cube_r190 = rightarm.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(78, 67).addBox(-0.5F, -1.0F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0131F, -0.0741F, -0.4254F, 0.1744F, -0.0013F, 0.0011F));

		PartDefinition cube_r191 = rightarm.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(85, 69).addBox(-1.0F, -0.0873F, -1.1134F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.3099F, 3.856F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r192 = rightarm.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(78, 86).addBox(-0.8F, -0.0423F, -0.9809F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 2.3099F, 1.556F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r193 = rightarm.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(39, 87).addBox(-1.2F, -2.7284F, -0.9106F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 4.2099F, 3.456F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r194 = rightarm.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(49, 86).addBox(-1.0F, -0.2111F, -0.9556F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.5099F, 0.856F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r195 = rightarm.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(87, 40).addBox(-0.5F, -0.3F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 5.8237F, 3.8199F, -0.1047F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 6.5302F, 3.9849F, -0.0357F, -0.025F, -0.6104F));

		PartDefinition cube_r196 = rightarm2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(47, 95).addBox(-0.0087F, -0.4978F, -0.0424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.764F, 0.6298F, 0.2549F, -1.5708F, 1.3614F, -1.6755F));

		PartDefinition cube_r197 = rightarm2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(78, 79).addBox(0.8166F, 4.6678F, -0.0424F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.764F, 0.6298F, 0.2549F, -1.5708F, 1.2392F, -1.6755F));

		PartDefinition cube_r198 = rightarm2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(89, 43).addBox(-0.8604F, -0.1747F, 0.198F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.764F, 2.9298F, -2.3451F, -1.5708F, 1.2566F, -1.6755F));

		PartDefinition cube_r199 = rightarm2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(89, 35).addBox(-1.0391F, -0.1451F, -0.0424F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.764F, 0.6298F, -0.8451F, -1.5708F, 0.925F, -1.6755F));

		PartDefinition cube_r200 = rightarm2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(78, 91).addBox(-0.6994F, 0.0084F, -0.0596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.064F, 1.6298F, 0.7549F, 1.5708F, -1.3788F, 1.6232F));

		PartDefinition cube_r201 = rightarm2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(95, 86).addBox(-0.4F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5056F, -0.825F, 0.9635F, 1.5708F, -0.0698F, 1.6232F));

		PartDefinition cube_r202 = rightarm2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(92, 60).addBox(0.0437F, -0.0538F, -0.1538F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.064F, 3.4298F, -0.0451F, -1.5708F, 0.9163F, -1.5184F));

		PartDefinition cube_r203 = rightarm2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(92, 64).addBox(-0.0312F, 0.0523F, -0.0596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.064F, 1.6298F, 1.0549F, -1.5708F, 0.9861F, -1.5184F));

		PartDefinition cube_r204 = rightarm2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(56, 81).addBox(0.4354F, 3.4407F, -0.0596F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.064F, 1.6298F, 0.7549F, -1.5708F, 1.1519F, -1.5184F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.0209F, -3.6281F, -0.9599F, 1.3526F, -1.5708F));

		PartDefinition cube_r205 = rightArm3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(82, 32).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0423F, 0.0906F, 0.0F, 0.0F, 0.1745F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2911F, 1.5818F, -0.2411F, 0.6533F, -0.0337F, -0.0294F));

		PartDefinition cube_r206 = rightArm4.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(45, 45).addBox(-1.6F, -0.6107F, -3.4276F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6F, 0.0F, 1.0547F, 0.1344F, 0.1117F));

		PartDefinition rightThumb = rightArm3.addOrReplaceChild("rightThumb", CubeListBuilder.create().texOffs(54, 88).addBox(-0.7368F, -0.2272F, -0.2154F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9707F, 0.5969F, -0.3022F, 0.1752F, -0.0983F, -0.2957F));

		PartDefinition rightThumb2 = rightArm3.addOrReplaceChild("rightThumb2", CubeListBuilder.create().texOffs(17, 89).addBox(-0.7368F, -0.2272F, -0.2154F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5992F, 0.9143F, -0.3746F, 0.3233F, 0.1537F, 0.8139F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.978F, -7.3456F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r207 = neck2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(80, 95).addBox(0.0F, -2.8692F, -1.006F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.1F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r208 = neck2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(64, 96).addBox(0.0F, -1.1051F, 0.0436F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -2.9F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r209 = neck2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(60, 37).addBox(-0.5F, -0.5F, -3.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.7F, 0.2269F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -3.8F, 0.2612F, 0.4294F, 0.3097F));

		PartDefinition cube_r210 = neck.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(0, 97).addBox(0.0F, -0.6F, -0.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2439F, -1.7151F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r211 = neck.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(83, 53).addBox(-0.5F, -0.0405F, -1.9625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -1.7F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r212 = neck.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(35, 83).addBox(0.0F, -1.8F, 1.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 36).addBox(-0.5F, -0.5F, 0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -2.4F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3199F, -2.7513F, 0.704F, 0.2359F, 0.1959F));

		PartDefinition cube_r213 = head.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(76, 0).addBox(-1.5F, -0.3985F, -0.6349F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2508F, -0.0468F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r214 = head.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(0, 53).addBox(-2.5F, -0.3985F, -0.6349F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 9).addBox(-0.5F, -2.3985F, -0.6349F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2508F, -0.0468F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r215 = head.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(0, 72).addBox(-1.0F, 0.5532F, -0.0558F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.353F, -1.7388F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r216 = head.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(90, 85).addBox(-0.5F, -0.0494F, -0.979F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -3.7965F, -1.0983F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r217 = head.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(44, 90).addBox(-0.5F, 0.0044F, -1.1944F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -3.5965F, 0.1017F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r218 = head.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(0, 46).addBox(-1.5F, -0.9F, -2.5F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9235F, -4.9291F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r219 = head.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(40, 13).addBox(-1.5F, 0.6087F, -2.203F, 3.0F, 3.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -3.553F, -2.7388F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r220 = head.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(71, 59).addBox(-0.5F, -0.054F, -2.9654F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.753F, -1.7388F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r221 = head.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(71, 46).addBox(-2.0F, 0.0157F, -0.748F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.153F, -4.7388F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r222 = head.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(88, 17).addBox(-1.0F, -0.5F, 0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(28, 83).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.8155F, -8.0734F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r223 = head.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(61, 20).addBox(-1.0F, -0.2831F, 0.3441F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, -3.253F, -7.5388F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r224 = head.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(79, 17).addBox(-1.5F, -0.5F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -2.668F, -7.3791F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r225 = head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(17, 86).addBox(-1.5F, -0.0828F, 0.1777F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -1.3775F, -8.8665F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r226 = head.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(85, 6).addBox(-1.0F, -0.9F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -1.0029F, -7.5731F, 1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r227 = head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(9, 75).addBox(-0.5F, -0.5F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1115F, 0.201F, -5.3127F, -0.2551F, 0.0638F, 0.072F));

		PartDefinition leftZygomaticarch = head.addOrReplaceChild("leftZygomaticarch", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9316F, -0.5966F, -5.585F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r228 = leftZygomaticarch.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(82, 45).addBox(-2.2995F, -2.0337F, -0.1783F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1F, -1.3F, 0.0F, 0.1259F, 0.036F, -0.277F));

		PartDefinition cube_r229 = leftZygomaticarch.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(94, 33).addBox(-0.4792F, -1.1328F, -0.2184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.8055F, -0.7834F, 2.4846F, -0.5411F, -0.3491F, 0.0F));

		PartDefinition cube_r230 = leftZygomaticarch.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(94, 36).addBox(-0.3507F, -1.0726F, -0.9498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.8055F, 0.3166F, 1.7846F, 0.1448F, -0.216F, 0.044F));

		PartDefinition cube_r231 = leftZygomaticarch.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(92, 94).addBox(-0.4792F, -0.2245F, -1.0141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.8055F, -0.1834F, 2.4846F, -0.8675F, -0.216F, 0.044F));

		PartDefinition cube_r232 = leftZygomaticarch.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(94, 30).addBox(-0.4792F, -0.59F, -0.4618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.8055F, -0.7834F, 2.4846F, -1.1694F, -0.3491F, 0.0F));

		PartDefinition cube_r233 = leftZygomaticarch.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(59, 91).addBox(-0.9838F, -0.143F, -0.1627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -1.2F, 0.0F, 0.3543F, -0.0124F, -0.146F));

		PartDefinition cube_r234 = leftZygomaticarch.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(94, 39).addBox(-1.0832F, -0.028F, -0.054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.8F, 1.6F, -1.2741F, -0.2094F, 0.0F));

		PartDefinition cube_r235 = leftZygomaticarch.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(94, 24).addBox(-1.2703F, 0.0373F, -0.0488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.4F, 2.5F, -0.9774F, -0.2094F, 0.0F));

		PartDefinition cube_r236 = leftZygomaticarch.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(94, 9).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.249F, -1.6432F, 3.8842F, -1.6338F, -0.4449F, 0.0047F));

		PartDefinition cube_r237 = leftZygomaticarch.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(83, 89).addBox(0.0F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2853F, -1.8375F, 4.3559F, -2.1599F, -0.8344F, 0.0445F));

		PartDefinition cube_r238 = leftZygomaticarch.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(92, 6).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.452F, -2.1269F, 4.1267F, -1.2055F, -0.4285F, -0.1209F));

		PartDefinition cube_r239 = leftZygomaticarch.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(88, 89).addBox(-0.8394F, -0.0737F, 0.0099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, -2.4F, 3.7F, -0.9799F, -0.2969F, -0.0596F));

		PartDefinition rightZygomaticarch = head.addOrReplaceChild("rightZygomaticarch", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9316F, -0.5966F, -5.585F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r240 = rightZygomaticarch.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(82, 45).mirror().addBox(0.2995F, -2.0337F, -0.1783F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.3F, 0.0F, 0.1259F, -0.036F, 0.277F));

		PartDefinition cube_r241 = rightZygomaticarch.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(94, 33).mirror().addBox(-0.5208F, -1.1328F, -0.2184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.8055F, -0.7834F, 2.4846F, -0.5411F, 0.3491F, 0.0F));

		PartDefinition cube_r242 = rightZygomaticarch.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(94, 36).mirror().addBox(-0.6493F, -1.0726F, -0.9498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.8055F, 0.3166F, 1.7846F, 0.1448F, 0.216F, -0.044F));

		PartDefinition cube_r243 = rightZygomaticarch.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(92, 94).mirror().addBox(-0.5208F, -0.2245F, -1.0141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.8055F, -0.1834F, 2.4846F, -0.8675F, 0.216F, -0.044F));

		PartDefinition cube_r244 = rightZygomaticarch.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(94, 30).mirror().addBox(-0.5208F, -0.59F, -0.4618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.8055F, -0.7834F, 2.4846F, -1.1694F, 0.3491F, 0.0F));

		PartDefinition cube_r245 = rightZygomaticarch.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(59, 91).mirror().addBox(-0.0162F, -0.143F, -0.1627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, -1.2F, 0.0F, 0.3543F, 0.0124F, 0.146F));

		PartDefinition cube_r246 = rightZygomaticarch.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(94, 39).mirror().addBox(0.0832F, -0.028F, -0.054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8F, 1.6F, -1.2741F, 0.2094F, 0.0F));

		PartDefinition cube_r247 = rightZygomaticarch.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(94, 24).mirror().addBox(0.2703F, 0.0373F, -0.0488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4F, 2.5F, -0.9774F, 0.2094F, 0.0F));

		PartDefinition cube_r248 = rightZygomaticarch.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(94, 9).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.249F, -1.6432F, 3.8842F, -1.6338F, 0.4449F, -0.0047F));

		PartDefinition cube_r249 = rightZygomaticarch.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(83, 89).mirror().addBox(-1.0F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2853F, -1.8375F, 4.3559F, -2.1599F, 0.8344F, -0.0445F));

		PartDefinition cube_r250 = rightZygomaticarch.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(92, 6).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.452F, -2.1269F, 4.1267F, -1.2055F, 0.4285F, 0.1209F));

		PartDefinition cube_r251 = rightZygomaticarch.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(88, 89).mirror().addBox(-0.1606F, -0.0737F, 0.0099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9F, -2.4F, 3.7F, -0.9799F, 0.2969F, 0.0596F));

		PartDefinition leftMaxilla = head.addOrReplaceChild("leftMaxilla", CubeListBuilder.create(), PartPose.offset(0.417F, -0.2803F, -8.7339F));

		PartDefinition cube_r252 = leftMaxilla.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(75, 95).addBox(-0.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.292F, -0.0404F, -0.1337F));

		PartDefinition cube_r253 = leftMaxilla.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(95, 80).addBox(-0.5F, -0.1736F, -0.2512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.1468F, -0.8025F, -0.2947F, 0.0F, 0.0F));

		PartDefinition cube_r254 = leftMaxilla.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(92, 72).addBox(-0.3F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.217F, -0.5582F, 0.0296F, 0.7176F, 0.2128F, 0.1823F));

		PartDefinition cube_r255 = leftMaxilla.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(59, 95).addBox(-0.5F, -0.2773F, -0.312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.5468F, -0.5025F, -0.5216F, 0.0F, 0.0F));

		PartDefinition rightMaxilla = head.addOrReplaceChild("rightMaxilla", CubeListBuilder.create(), PartPose.offset(-0.417F, -0.2803F, -8.7339F));

		PartDefinition cube_r256 = rightMaxilla.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(75, 95).mirror().addBox(-0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.292F, 0.0404F, 0.1337F));

		PartDefinition cube_r257 = rightMaxilla.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(95, 80).mirror().addBox(-0.5F, -0.1736F, -0.2512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1468F, -0.8025F, -0.2947F, 0.0F, 0.0F));

		PartDefinition cube_r258 = rightMaxilla.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(92, 72).mirror().addBox(-0.7F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.217F, -0.5582F, 0.0296F, 0.7176F, -0.2128F, -0.1823F));

		PartDefinition cube_r259 = rightMaxilla.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(59, 95).mirror().addBox(-0.5F, -0.2773F, -0.312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5468F, -0.5025F, -0.5216F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.5616F, -4.3199F, -5.488F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(77, 13).addBox(-1.2968F, -0.0203F, -1.8667F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3187F, 0.4149F, -0.0003F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(86, 13).addBox(0.5F, -0.8F, -0.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.5616F, 2.8452F, -1.5466F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(24, 57).addBox(-0.2614F, -0.3311F, -0.2876F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.0616F, 1.0691F, 5.4412F, -0.1323F, 0.1142F, 0.708F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(71, 9).addBox(-1.8129F, -0.5471F, -1.2082F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.7F, 1.2F, -0.1032F, 0.4075F, -0.0952F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.5616F, -4.3199F, -5.488F));

		PartDefinition cube_r264 = rightFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(77, 13).mirror().addBox(-0.7032F, -0.0203F, -1.8667F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3187F, -0.4149F, 0.0003F));

		PartDefinition cube_r265 = rightFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(86, 13).mirror().addBox(-1.5F, -0.8F, -0.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.5616F, 2.8452F, -1.5466F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r266 = rightFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(24, 57).mirror().addBox(-2.7386F, -0.3311F, -0.2876F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.0616F, 1.0691F, 5.4412F, -0.1323F, -0.1142F, -0.708F));

		PartDefinition cube_r267 = rightFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(71, 9).mirror().addBox(-1.1871F, -0.5471F, -1.2082F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7F, 1.2F, -0.1032F, -0.4075F, 0.0952F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, -1.3901F, -1.5979F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r268 = jaw.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(37, 92).mirror().addBox(-0.8019F, -0.5013F, 0.5379F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.7868F, -0.9875F, -0.4014F, -0.0524F, 0.0F));

		PartDefinition cube_r269 = jaw.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(3, 96).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4016F, 1.7354F, 0.6067F, -0.1047F, -0.0524F, 0.0F));

		PartDefinition cube_r270 = jaw.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(34, 87).mirror().addBox(-0.8909F, -0.587F, -0.891F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.3868F, 0.4125F, -0.8552F, -0.0524F, 0.0F));

		PartDefinition cube_r271 = jaw.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(73, 90).mirror().addBox(-0.7967F, -0.059F, -0.9947F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 4.0868F, -1.3875F, -1.6057F, -0.0524F, 0.0F));

		PartDefinition cube_r272 = jaw.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(3, 92).mirror().addBox(-0.4772F, -2.029F, -0.2938F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3776F, 3.18F, -4.4307F, -1.6496F, -0.1788F, 0.029F));

		PartDefinition cube_r273 = jaw.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(54, 93).mirror().addBox(-0.4772F, 0.0631F, -0.3484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3776F, 3.18F, -4.4307F, -1.4751F, -0.1788F, 0.029F));

		PartDefinition cube_r274 = jaw.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(71, 74).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3723F, 2.3662F, -4.3796F, 3.0948F, -0.138F, -0.0353F));

		PartDefinition cube_r275 = jaw.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(8, 92).mirror().addBox(-0.6F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5644F, 2.4931F, -6.9301F, -2.2664F, -0.1194F, -0.0329F));

		PartDefinition cube_r276 = jaw.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(32, 92).mirror().addBox(0.1247F, -1.3006F, 0.3531F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3034F, 2.302F, -5.3262F, -2.3381F, 0.2358F, 0.1753F));

		PartDefinition cube_r277 = jaw.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(94, 27).mirror().addBox(-0.4772F, 0.1731F, 0.2674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.3776F, 3.18F, -4.4307F, -2.4001F, -0.1788F, 0.029F));

		PartDefinition cube_r278 = jaw.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(95, 0).mirror().addBox(-0.8605F, -0.9756F, 0.1488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.3166F, 2.3287F, -3.1219F, -1.7389F, 0.1299F, 0.0821F));

		PartDefinition cube_r279 = jaw.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(29, 87).mirror().addBox(-0.4772F, -1.4893F, -0.7575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.3776F, 3.18F, -4.4307F, -1.5973F, -0.1788F, 0.029F));

		PartDefinition cube_r280 = jaw.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(90, 0).mirror().addBox(-0.7444F, -1.0218F, -0.0003F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.4868F, -2.0875F, -0.9774F, -0.0524F, 0.0F));

		PartDefinition cube_r281 = jaw.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(93, 13).mirror().addBox(-0.8019F, 0.9344F, -0.5197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.7868F, -0.9875F, -0.3142F, -0.0524F, 0.0F));

		PartDefinition cube_r282 = jaw.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(42, 94).mirror().addBox(-0.87F, -1.0233F, -1.0245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.6868F, 0.3125F, -0.3491F, -0.0524F, 0.0F));

		PartDefinition cube_r283 = jaw.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(92, 68).mirror().addBox(-0.7601F, -2.0784F, -0.0322F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.5868F, -1.7875F, -0.7156F, -0.0524F, 0.0F));

		PartDefinition cube_r284 = jaw.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(37, 92).addBox(-0.1981F, -0.5013F, 0.5379F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.7868F, -0.9875F, -0.4014F, 0.0524F, 0.0F));

		PartDefinition cube_r285 = jaw.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(3, 96).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8016F, 1.7354F, 0.6067F, -0.1047F, 0.0524F, 0.0F));

		PartDefinition cube_r286 = jaw.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(34, 87).addBox(-0.1091F, -0.587F, -0.891F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.4F, 2.3868F, 0.4125F, -0.8552F, 0.0524F, 0.0F));

		PartDefinition cube_r287 = jaw.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(73, 90).addBox(-0.2033F, -0.059F, -0.9947F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.4F, 4.0868F, -1.3875F, -1.6057F, 0.0524F, 0.0F));

		PartDefinition cube_r288 = jaw.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(3, 92).addBox(-0.5228F, -2.029F, -0.2938F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7776F, 3.18F, -4.4307F, -1.6496F, 0.1788F, -0.029F));

		PartDefinition cube_r289 = jaw.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(54, 93).addBox(-0.5228F, 0.0631F, -0.3484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7776F, 3.18F, -4.4307F, -1.4751F, 0.1788F, -0.029F));

		PartDefinition cube_r290 = jaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(71, 74).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7723F, 2.3662F, -4.3796F, 3.0948F, 0.138F, 0.0353F));

		PartDefinition cube_r291 = jaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(8, 92).addBox(-0.4F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0356F, 2.4931F, -6.9301F, -2.2664F, 0.1194F, 0.0329F));

		PartDefinition cube_r292 = jaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(32, 92).addBox(-1.1247F, -1.3006F, 0.3531F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7034F, 2.302F, -5.3262F, -2.3381F, -0.2358F, -0.1753F));

		PartDefinition cube_r293 = jaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(94, 27).addBox(-0.5228F, 0.1731F, 0.2674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7776F, 3.18F, -4.4307F, -2.4001F, 0.1788F, -0.029F));

		PartDefinition cube_r294 = jaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(95, 0).addBox(-0.1395F, -0.9756F, 0.1488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7166F, 2.3287F, -3.1219F, -1.7389F, -0.1299F, -0.0821F));

		PartDefinition cube_r295 = jaw.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(29, 87).addBox(-0.5228F, -1.4893F, -0.7575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7776F, 3.18F, -4.4307F, -1.5973F, 0.1788F, -0.029F));

		PartDefinition cube_r296 = jaw.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(90, 0).addBox(-0.2556F, -1.0218F, -0.0003F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 2.4868F, -2.0875F, -0.9774F, 0.0524F, 0.0F));

		PartDefinition cube_r297 = jaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(93, 13).addBox(-0.1981F, 0.9344F, -0.5197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4F, 0.7868F, -0.9875F, -0.3142F, 0.0524F, 0.0F));

		PartDefinition cube_r298 = jaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(42, 94).addBox(-0.13F, -1.0233F, -1.0245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4F, 0.6868F, 0.3125F, -0.3491F, 0.0524F, 0.0F));

		PartDefinition cube_r299 = jaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(92, 68).addBox(-0.2399F, -2.0784F, -0.0322F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4F, 1.5868F, -1.7875F, -0.7156F, 0.0524F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, -0.3573F, 0.0074F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.004F))
				.texOffs(68, 81).addBox(0.0F, -1.1573F, 3.0074F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 64).addBox(0.0F, -1.0573F, 5.0074F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 5).addBox(0.0F, -1.0573F, 7.0074F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8228F, 1.6852F, -0.3328F, -0.0825F, 0.0285F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(13, 97).addBox(0.0F, -1.1F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 97).addBox(0.0F, -1.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 4).addBox(0.0F, -0.9F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 42).addBox(0.0F, -0.9F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1427F, 8.7574F, 0.4061F, -0.3227F, -0.1355F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(33, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1F, 7.9F, 0.429F, 0.0794F, 0.0363F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.8F, 0.5243F, 0.504F, 0.2723F));

		return LayerDefinition.create(meshdefinition, 102, 102);
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