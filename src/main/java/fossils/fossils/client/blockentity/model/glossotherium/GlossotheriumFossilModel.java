package fossils.fossils.client.blockentity.model.glossotherium;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GlossotheriumFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart body5;
	private final ModelPart body2;
	private final ModelPart body6;
	private final ModelPart chest;
	private final ModelPart chest2;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftSygomaticarch;
	private final ModelPart rightSygomaticarch;
	private final ModelPart jaw;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart leftArm7;
	private final ModelPart leftArm6;
	private final ModelPart leftArm8;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart rightArm7;
	private final ModelPart rightArm6;
	private final ModelPart rightArm8;
	private final ModelPart tail;
	private final ModelPart tail8;
	private final ModelPart tail2;
	private final ModelPart tail4;
	private final ModelPart tail9;
	private final ModelPart tail3;
	private final ModelPart tail10;

	public GlossotheriumFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.body4 = this.hips.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.body5 = this.body3.getChild("body5");
		this.body2 = this.body5.getChild("body2");
		this.body6 = this.body2.getChild("body6");
		this.chest = this.body6.getChild("chest");
		this.chest2 = this.chest.getChild("chest2");
		this.neck3 = this.chest2.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftSygomaticarch = this.head.getChild("leftSygomaticarch");
		this.rightSygomaticarch = this.head.getChild("rightSygomaticarch");
		this.jaw = this.head.getChild("jaw");
		this.bone2 = this.chest.getChild("bone2");
		this.bone3 = this.chest.getChild("bone3");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm3.getChild("leftArm5");
		this.leftArm7 = this.leftArm3.getChild("leftArm7");
		this.leftArm6 = this.leftArm3.getChild("leftArm6");
		this.leftArm8 = this.leftArm3.getChild("leftArm8");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm3.getChild("rightArm5");
		this.rightArm7 = this.rightArm3.getChild("rightArm7");
		this.rightArm6 = this.rightArm3.getChild("rightArm6");
		this.rightArm8 = this.rightArm3.getChild("rightArm8");
		this.tail = this.hips.getChild("tail");
		this.tail8 = this.tail.getChild("tail8");
		this.tail2 = this.tail8.getChild("tail2");
		this.tail4 = this.tail2.getChild("tail4");
		this.tail9 = this.tail4.getChild("tail9");
		this.tail3 = this.tail9.getChild("tail3");
		this.tail10 = this.tail3.getChild("tail10");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -31.2233F, 16.8426F, 0.4385F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(88, 14).addBox(-0.1F, -1.0F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.6642F, 3.6052F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(41, 58).addBox(-0.1F, -2.1903F, -0.167F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8904F, -6.0965F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(19, 33).addBox(-0.1F, -0.2F, -3.0F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6086F, 0.9515F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5627F, -1.9442F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(44, 0).addBox(-1.0F, -0.2057F, 0.0747F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -6.4F, -0.5411F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(2.977F, 6.3211F, -1.8342F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(77, 37).addBox(-0.3291F, -4.5078F, -0.7705F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.6391F, -6.362F, -1.0435F, -2.5284F, -1.5041F, 1.8128F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(97, 82).addBox(-0.1284F, -4.5078F, -2.5331F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.6391F, -6.362F, -1.0435F, -0.1533F, -1.3171F, -0.5682F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(106, 36).addBox(-0.1083F, -1.7141F, -4.8559F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6391F, -6.362F, -1.0435F, -0.9014F, -1.3064F, -0.5515F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(127, 35).addBox(1.2402F, -4.5914F, 2.6781F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8603F, -8.6951F, -1.6899F, -2.3949F, -1.4268F, 0.0271F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(30, 58).addBox(0.2891F, -5.6552F, -0.9027F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.8603F, -8.6951F, -1.6899F, -0.7629F, -1.3708F, -1.6403F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(84, 90).addBox(1.2449F, -0.3652F, 3.7907F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(121, 131).addBox(1.2449F, -0.3652F, 3.2907F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.8603F, -8.6951F, -1.6899F, -1.8504F, -1.2634F, -0.2494F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(7, 105).addBox(0.2891F, -0.2945F, 0.8278F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8603F, -8.6951F, -1.6899F, -0.3266F, -1.3708F, -1.6403F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(137, 81).addBox(1.2402F, -0.6202F, 3.3655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8603F, -8.6951F, -1.6899F, -2.0371F, -1.4268F, 0.0271F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(50, 70).addBox(1.2402F, -4.8003F, 3.8072F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.8603F, -8.6951F, -1.6899F, -2.0894F, -1.4268F, 0.0271F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(70, 15).addBox(0.3695F, 0.056F, -0.1749F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8603F, -8.6951F, -1.6899F, -1.0638F, -1.1858F, -0.9364F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(89, 61).addBox(0.3695F, 2.1066F, -0.3925F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.8603F, -8.6951F, -1.6899F, -0.5839F, -1.1858F, -0.9364F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(92, 14).addBox(1.2449F, 2.5989F, 2.3816F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8603F, -8.6951F, -1.6899F, -1.3704F, -1.2634F, -0.2494F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(83, 0).addBox(-0.1083F, -1.7387F, -4.6911F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.6391F, -6.362F, -1.0435F, -0.2905F, -1.3064F, -0.5515F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(70, 7).addBox(-0.4123F, -3.2809F, -1.7594F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3288F, 4.2009F, 0.1663F, -1.2756F, -0.0733F, 0.2001F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(97, 49).addBox(-0.825F, -0.1F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.487F, -0.9091F, -0.2621F, 1.654F, -0.0663F, 0.1129F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(7, 100).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.487F, -0.9091F, -0.2621F, 1.1679F, -0.0733F, 0.2001F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(32, 107).addBox(-0.5138F, -0.1147F, -0.631F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(80, 61).addBox(-0.5138F, -1.1147F, -2.431F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7603F, 1.201F, 3.9132F, 0.9934F, -0.0733F, 0.2001F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(22, 76).addBox(-0.4123F, -2.7932F, -0.5756F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3288F, 4.2009F, 0.1663F, -0.0102F, -0.0733F, 0.2001F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(75, 97).addBox(-0.825F, -1.5F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3095F, 0.1572F, -0.7791F, 0.6911F, 0.0101F, 0.0991F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 79).addBox(-0.5F, -2.5F, -1.9F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1878F, 4.1326F, 3.7444F, 2.8228F, -0.0305F, 0.1842F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(34, 90).addBox(0.0F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4494F, -3.944F, 3.2693F, 0.8313F, -0.1573F, -0.5302F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(133, 125).addBox(0.0F, 0.5F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 7).addBox(0.0F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7267F, -2.0243F, 5.4585F, 0.8086F, -0.0974F, -0.5866F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(84, 96).addBox(0.0F, 1.0F, -3.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.7267F, -2.0243F, 5.4585F, 1.2013F, -0.0974F, -0.5866F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(6, 129).addBox(0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7267F, -2.0243F, 5.4585F, 0.8146F, 0.1442F, -0.3339F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(128, 125).addBox(0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4494F, -3.944F, 3.2693F, 0.8214F, 0.0805F, -0.2739F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(22, 59).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9078F, -6.055F, 1.1479F, 0.8186F, -0.1114F, -0.0955F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(48, 107).addBox(-0.5F, -0.3F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.5991F, -5.9533F, 0.3691F, 0.238F, -0.371F, -0.4F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(127, 111).addBox(-1.3145F, -6.9102F, -1.7371F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 8).addBox(-1.3145F, -3.9102F, -5.7371F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6191F, -3.3049F, 5.3138F, 0.8925F, -0.371F, -0.4F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(108, 112).addBox(-0.9108F, -1.5117F, 2.142F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3288F, 4.2009F, 0.1663F, -0.8505F, 0.0909F, 0.171F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(119, 72).addBox(-0.9298F, -1.7938F, 0.6536F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F))
				.texOffs(32, 97).addBox(-0.9298F, -0.8938F, -0.7464F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7252F, 4.0645F, -1.0508F, 0.9309F, 0.2536F, 0.1906F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(120, 99).addBox(-0.1968F, -1.9275F, -1.7075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3288F, 4.2009F, 0.1663F, 1.6418F, 0.34F, 0.2641F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(44, 79).addBox(-0.9298F, -0.9151F, -0.0152F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7252F, 4.0645F, -1.0508F, 1.629F, 0.2536F, 0.1906F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(120, 112).addBox(-0.1968F, -2.1832F, -1.4179F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3288F, 4.2009F, 0.1663F, 1.5109F, 0.34F, 0.2641F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(103, 21).addBox(-0.9298F, -1.1393F, 0.4092F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7252F, 4.0645F, -1.0508F, 1.4981F, 0.2536F, 0.1906F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(90, 131).addBox(-0.4227F, 0.5415F, -2.6587F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3288F, 4.2009F, 0.1663F, 0.2998F, 0.2732F, 0.2005F));

		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(124, 44).addBox(-0.6F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2954F, 6.6834F, 0.513F, -2.5145F, 0.1156F, 0.1526F));

		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(55, 83).addBox(-1.2683F, -4.6624F, -7.7055F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.0813F, 14.9159F, -0.735F, -1.2416F, 0.057F, 0.286F));

		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(86, 40).addBox(-1.2683F, -3.2857F, -5.7519F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-2.0813F, 14.9159F, -0.735F, -1.5034F, 0.057F, 0.286F));

		PartDefinition cube_r44 = bone.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(92, 0).addBox(-1.2683F, -1.4955F, -3.2497F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.0813F, 14.9159F, -0.735F, -1.7652F, 0.057F, 0.286F));

		PartDefinition cube_r45 = bone.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(42, 9).addBox(-1.2683F, -1.4373F, -6.0131F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0813F, 14.9159F, -0.735F, -2.2016F, 0.057F, 0.286F));

		PartDefinition cube_r46 = bone.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(20, 83).addBox(0.0F, 0.0F, 6.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.977F, -6.8838F, -0.1101F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r47 = bone.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(22, 68).addBox(-1.2683F, 5.5823F, -5.8754F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0813F, 14.9159F, -0.735F, -3.1179F, 0.057F, 0.286F));

		PartDefinition cube_r48 = bone.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 107).addBox(-1.2683F, -1.9559F, -7.8649F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.0813F, 14.9159F, -0.735F, -2.1143F, 0.057F, 0.286F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-2.977F, 6.3211F, -1.8342F));

		PartDefinition cube_r49 = bone4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(77, 37).mirror().addBox(-0.6709F, -4.5078F, -0.7705F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.6391F, -6.362F, -1.0435F, -2.5284F, 1.5041F, -1.8128F));

		PartDefinition cube_r50 = bone4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(97, 82).mirror().addBox(-0.8716F, -4.5078F, -2.5331F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.6391F, -6.362F, -1.0435F, -0.1533F, 1.3171F, 0.5682F));

		PartDefinition cube_r51 = bone4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(106, 36).mirror().addBox(-0.8917F, -1.7141F, -4.8559F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6391F, -6.362F, -1.0435F, -0.9014F, 1.3064F, 0.5515F));

		PartDefinition cube_r52 = bone4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(127, 35).mirror().addBox(-2.2402F, -4.5914F, 2.6781F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8603F, -8.6951F, -1.6899F, -2.3949F, 1.4268F, -0.0271F));

		PartDefinition cube_r53 = bone4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(30, 58).mirror().addBox(-1.2891F, -5.6552F, -0.9027F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.8603F, -8.6951F, -1.6899F, -0.7629F, 1.3708F, 1.6403F));

		PartDefinition cube_r54 = bone4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(84, 90).mirror().addBox(-2.2449F, -0.3652F, 3.7907F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(121, 131).mirror().addBox(-2.2449F, -0.3652F, 3.2907F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8603F, -8.6951F, -1.6899F, -1.8504F, 1.2634F, 0.2494F));

		PartDefinition cube_r55 = bone4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(7, 105).mirror().addBox(-1.2891F, -0.2945F, 0.8278F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8603F, -8.6951F, -1.6899F, -0.3266F, 1.3708F, 1.6403F));

		PartDefinition cube_r56 = bone4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(137, 81).mirror().addBox(-2.2402F, -0.6202F, 3.3655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8603F, -8.6951F, -1.6899F, -2.0371F, 1.4268F, -0.0271F));

		PartDefinition cube_r57 = bone4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(50, 70).mirror().addBox(-2.2402F, -4.8003F, 3.8072F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8603F, -8.6951F, -1.6899F, -2.0894F, 1.4268F, -0.0271F));

		PartDefinition cube_r58 = bone4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(70, 15).mirror().addBox(-1.3695F, 0.056F, -0.1749F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8603F, -8.6951F, -1.6899F, -1.0638F, 1.1858F, 0.9364F));

		PartDefinition cube_r59 = bone4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(89, 61).mirror().addBox(-1.3695F, 2.1066F, -0.3925F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8603F, -8.6951F, -1.6899F, -0.5839F, 1.1858F, 0.9364F));

		PartDefinition cube_r60 = bone4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(92, 14).mirror().addBox(-2.2449F, 2.5989F, 2.3816F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8603F, -8.6951F, -1.6899F, -1.3704F, 1.2634F, 0.2494F));

		PartDefinition cube_r61 = bone4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(83, 0).mirror().addBox(-0.8917F, -1.7387F, -4.6911F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.6391F, -6.362F, -1.0435F, -0.2905F, 1.3064F, 0.5515F));

		PartDefinition cube_r62 = bone4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(70, 7).mirror().addBox(-0.5877F, -3.2809F, -1.7594F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3288F, 4.2009F, 0.1663F, -1.2756F, 0.0733F, -0.2001F));

		PartDefinition cube_r63 = bone4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(97, 49).mirror().addBox(-0.175F, -0.1F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.487F, -0.9091F, -0.2621F, 1.654F, 0.0663F, -0.1129F));

		PartDefinition cube_r64 = bone4.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(7, 100).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.487F, -0.9091F, -0.2621F, 1.1679F, 0.0733F, -0.2001F));

		PartDefinition cube_r65 = bone4.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(32, 107).mirror().addBox(-0.4862F, -0.1147F, -0.631F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 61).mirror().addBox(-0.4862F, -1.1147F, -2.431F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7603F, 1.201F, 3.9132F, 0.9934F, 0.0733F, -0.2001F));

		PartDefinition cube_r66 = bone4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(22, 76).mirror().addBox(-0.5877F, -2.7932F, -0.5756F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3288F, 4.2009F, 0.1663F, -0.0102F, 0.0733F, -0.2001F));

		PartDefinition cube_r67 = bone4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(75, 97).mirror().addBox(-0.175F, -1.5F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3095F, 0.1572F, -0.7791F, 0.6911F, -0.0101F, -0.0991F));

		PartDefinition cube_r68 = bone4.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-0.5F, -2.5F, -1.9F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1878F, 4.1326F, 3.7444F, 2.8228F, 0.0305F, -0.1842F));

		PartDefinition cube_r69 = bone4.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(34, 90).mirror().addBox(-1.0F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4494F, -3.944F, 3.2693F, 0.8313F, 0.1573F, 0.5302F));

		PartDefinition cube_r70 = bone4.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(133, 125).mirror().addBox(-1.0F, 0.5F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(88, 7).mirror().addBox(-1.0F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7267F, -2.0243F, 5.4585F, 0.8086F, 0.0974F, 0.5866F));

		PartDefinition cube_r71 = bone4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(84, 96).mirror().addBox(-1.0F, 1.0F, -3.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.7267F, -2.0243F, 5.4585F, 1.2013F, 0.0974F, 0.5866F));

		PartDefinition cube_r72 = bone4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(6, 129).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7267F, -2.0243F, 5.4585F, 0.8146F, -0.1442F, 0.3339F));

		PartDefinition cube_r73 = bone4.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(128, 125).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4494F, -3.944F, 3.2693F, 0.8214F, -0.0805F, 0.2739F));

		PartDefinition cube_r74 = bone4.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(22, 59).mirror().addBox(-0.5F, -3.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9078F, -6.055F, 1.1479F, 0.8186F, 0.1114F, 0.0955F));

		PartDefinition cube_r75 = bone4.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(48, 107).mirror().addBox(-0.5F, -0.3F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.5991F, -5.9533F, 0.3691F, 0.238F, 0.371F, 0.4F));

		PartDefinition cube_r76 = bone4.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(127, 111).mirror().addBox(0.3145F, -6.9102F, -1.7371F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 8).mirror().addBox(0.3145F, -3.9102F, -5.7371F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6191F, -3.3049F, 5.3138F, 0.8925F, 0.371F, 0.4F));

		PartDefinition cube_r77 = bone4.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(108, 112).mirror().addBox(-0.0892F, -1.5117F, 2.142F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3288F, 4.2009F, 0.1663F, -0.8505F, -0.0909F, -0.171F));

		PartDefinition cube_r78 = bone4.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(119, 72).mirror().addBox(-0.0702F, -1.7938F, 0.6536F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(32, 97).mirror().addBox(-0.0702F, -0.8938F, -0.7464F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7252F, 4.0645F, -1.0508F, 0.9309F, -0.2536F, -0.1906F));

		PartDefinition cube_r79 = bone4.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(120, 99).mirror().addBox(-0.8032F, -1.9275F, -1.7075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3288F, 4.2009F, 0.1663F, 1.6418F, -0.34F, -0.2641F));

		PartDefinition cube_r80 = bone4.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(44, 79).mirror().addBox(-0.0702F, -0.9151F, -0.0152F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7252F, 4.0645F, -1.0508F, 1.629F, -0.2536F, -0.1906F));

		PartDefinition cube_r81 = bone4.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(120, 112).mirror().addBox(-0.8032F, -2.1832F, -1.4179F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3288F, 4.2009F, 0.1663F, 1.5109F, -0.34F, -0.2641F));

		PartDefinition cube_r82 = bone4.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(103, 21).mirror().addBox(-0.0702F, -1.1393F, 0.4092F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7252F, 4.0645F, -1.0508F, 1.4981F, -0.2536F, -0.1906F));

		PartDefinition cube_r83 = bone4.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(90, 131).mirror().addBox(-0.5773F, 0.5415F, -2.6587F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3288F, 4.2009F, 0.1663F, 0.2998F, -0.2732F, -0.2005F));

		PartDefinition cube_r84 = bone4.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(124, 44).mirror().addBox(-0.4F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2954F, 6.6834F, 0.513F, -2.5145F, -0.1156F, -0.1526F));

		PartDefinition cube_r85 = bone4.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(55, 83).mirror().addBox(0.2683F, -4.6624F, -7.7055F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.0813F, 14.9159F, -0.735F, -1.2416F, -0.057F, -0.286F));

		PartDefinition cube_r86 = bone4.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(86, 40).mirror().addBox(0.2683F, -3.2857F, -5.7519F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(2.0813F, 14.9159F, -0.735F, -1.5034F, -0.057F, -0.286F));

		PartDefinition cube_r87 = bone4.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(92, 0).mirror().addBox(0.2683F, -1.4955F, -3.2497F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(2.0813F, 14.9159F, -0.735F, -1.7652F, -0.057F, -0.286F));

		PartDefinition cube_r88 = bone4.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(42, 9).mirror().addBox(0.2683F, -1.4373F, -6.0131F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0813F, 14.9159F, -0.735F, -2.2016F, -0.057F, -0.286F));

		PartDefinition cube_r89 = bone4.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(20, 83).mirror().addBox(-2.0F, 0.0F, 6.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.977F, -6.8838F, -0.1101F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r90 = bone4.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(22, 68).mirror().addBox(0.2683F, 5.5823F, -5.8754F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0813F, 14.9159F, -0.735F, -3.1179F, -0.057F, -0.286F));

		PartDefinition cube_r91 = bone4.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(0, 107).mirror().addBox(0.2683F, -1.9559F, -7.8649F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(2.0813F, 14.9159F, -0.735F, -2.1143F, -0.057F, -0.286F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.2846F, 11.498F, -1.6205F, -1.0978F, -0.1659F, -0.0354F));

		PartDefinition cube_r92 = leftLeg.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(106, 50).addBox(-1.0F, -0.9F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.6F, 10.42F, -1.4212F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r93 = leftLeg.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(95, 40).addBox(-2.0F, -0.65F, -0.9F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.4F, 10.5937F, 1.1436F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r94 = leftLeg.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(91, 54).addBox(-3.0F, 0.7F, -0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, 9.4929F, 0.3446F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r95 = leftLeg.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(124, 4).addBox(-1.2227F, -1.9311F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.5853F, 0.9436F, 1.3709F, -0.1065F, -0.5736F, 0.4096F));

		PartDefinition cube_r96 = leftLeg.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 130).addBox(-3.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.5525F, 4.3632F, 2.4736F, 0.0985F, -0.5472F, -0.0047F));

		PartDefinition cube_r97 = leftLeg.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(62, 111).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.5525F, 4.3632F, 2.4736F, -0.116F, -0.5441F, 0.4044F));

		PartDefinition cube_r98 = leftLeg.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(88, 47).addBox(-1.6091F, -1.5488F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.5853F, 0.9436F, 1.3709F, 0.1212F, -0.571F, -0.0066F));

		PartDefinition cube_r99 = leftLeg.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(64, 83).addBox(-1.5F, -1.0F, -0.3F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.7133F, -0.5557F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r100 = leftLeg.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(62, 50).addBox(-2.5F, -4.0F, -2.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 2.5F, 2.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r101 = leftLeg.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(113, 36).addBox(-3.0F, -0.0139F, -1.1995F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.7F, 7.4156F, 1.6161F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r102 = leftLeg.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(81, 7).addBox(-1.0F, -2.5F, -0.6F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.7F, 4.9008F, 1.541F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r103 = leftLeg.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(104, 78).addBox(-3.0F, 1.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.7F, 1.5F, 0.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(25, 0).addBox(-2.0F, -0.4371F, 0.0092F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.868F, 12.9712F, 2.1901F, -0.8526F, 0.0425F, 0.1238F));

		PartDefinition cube_r104 = leftLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(124, 68).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.9287F, -1.2866F, 4.5504F, -0.2094F, 0.0262F, 0.0F));

		PartDefinition cube_r105 = leftLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(131, 7).addBox(-1.5F, -0.8F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(131, 4).addBox(-1.5F, -0.8F, -1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.9862F, -0.0294F, 6.7459F, -0.3403F, 0.0262F, 0.0F));

		PartDefinition cube_r106 = leftLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(68, 131).addBox(-1.5F, -0.2F, 0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(130, 81).addBox(-1.5F, -0.2F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9706F, -1.2307F, 6.1489F, -0.6458F, 0.0262F, 0.0F));

		PartDefinition cube_r107 = leftLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(124, 64).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.9287F, -1.2866F, 4.5504F, -0.0349F, 0.0262F, 0.0F));

		PartDefinition cube_r108 = leftLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(65, 57).addBox(-1.0995F, -0.9995F, -3.1146F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.485F, -0.4F, 2.894F, 0.0524F, 0.0262F, 0.0F));

		PartDefinition cube_r109 = leftLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(29, 131).addBox(-0.4F, 0.4F, -0.325F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(111, 93).addBox(-1.5F, 0.4F, -0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5839F, -1.1433F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r110 = leftLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(111, 80).addBox(-1.5F, -1.3F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 1.591F, -0.6237F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r111 = leftLeg2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(46, 126).addBox(-1.5F, 0.0F, -1.125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.7141F, 7.2417F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r112 = leftLeg2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(39, 131).addBox(-1.5F, -0.1F, -0.125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0629F, 6.5092F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r113 = leftLeg2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(83, 120).addBox(-1.5F, -0.9F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.687F, 2.1046F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r114 = leftLeg2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(112, 16).addBox(-1.5F, -0.4F, -3.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.1514F, 2.0152F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(75, 52).addBox(-1.0F, -0.525F, 0.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7634F, 0.531F, 6.6516F, -0.8833F, -1.46F, -0.615F));

		PartDefinition cube_r115 = leftLeg3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(64, 88).addBox(-1.0F, -0.3F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4F, -0.5532F, -1.0204F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7F, -0.5432F, 2.7821F, -0.044F, -0.1308F, 0.0057F));

		PartDefinition cube_r116 = leftLeg4.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(95, 36).addBox(0.5F, -0.275F, -0.3F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.2F, 0.2F, 0.2F, 0.3491F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.2846F, 11.498F, -1.6205F, -0.6583F, 0.2063F, 0.0522F));

		PartDefinition cube_r117 = rightLeg.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(106, 68).addBox(-1.0F, -0.9F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.6F, 10.42F, -1.4212F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r118 = rightLeg.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(0, 96).addBox(-2.0F, -0.65F, -0.9F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.4F, 10.5937F, 1.1436F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r119 = rightLeg.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(0, 92).addBox(-1.0F, 0.7F, -0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.4F, 9.4929F, 0.3446F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r120 = rightLeg.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(124, 8).addBox(-0.7773F, -1.9311F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.5853F, 0.9436F, 1.3709F, -0.1065F, 0.5736F, -0.4096F));

		PartDefinition cube_r121 = rightLeg.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(11, 131).addBox(2.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.5525F, 4.3632F, 2.4736F, 0.0985F, 0.5472F, 0.0047F));

		PartDefinition cube_r122 = rightLeg.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(69, 111).addBox(0.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-4.5525F, 4.3632F, 2.4736F, -0.116F, 0.5441F, -0.4044F));

		PartDefinition cube_r123 = rightLeg.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(88, 69).addBox(-1.3909F, -1.5488F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-3.5853F, 0.9436F, 1.3709F, 0.1212F, 0.571F, 0.0066F));

		PartDefinition cube_r124 = rightLeg.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(31, 84).addBox(-1.5F, -1.0F, -0.3F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 0.7133F, -0.5557F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r125 = rightLeg.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(64, 40).addBox(-1.5F, -4.0F, -2.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2F, 2.5F, 2.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r126 = rightLeg.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(58, 117).addBox(1.0F, -0.0139F, -1.1995F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-3.7F, 7.4156F, 1.6161F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r127 = rightLeg.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(81, 69).addBox(-1.0F, -2.5F, -0.6F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.7F, 4.9008F, 1.541F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r128 = rightLeg.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(102, 104).addBox(1.0F, 1.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-3.7F, 1.5F, 0.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(0, 33).addBox(0.0F, -0.4371F, 0.0092F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.868F, 12.9712F, 2.1901F, -0.7653F, -0.0425F, -0.1238F));

		PartDefinition cube_r129 = rightLeg2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(121, 124).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.9287F, -1.2866F, 4.5504F, -0.2094F, -0.0262F, 0.0F));

		PartDefinition cube_r130 = rightLeg2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(22, 131).addBox(-0.5F, -0.8F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(131, 10).addBox(-0.5F, -0.8F, -1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.9862F, -0.0294F, 6.7459F, -0.3403F, -0.0262F, 0.0F));

		PartDefinition cube_r131 = rightLeg2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(131, 69).addBox(-0.5F, -0.2F, 0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(130, 95).addBox(-0.5F, -0.2F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9706F, -1.2307F, 6.1489F, -0.6458F, -0.0262F, 0.0F));

		PartDefinition cube_r132 = rightLeg2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(83, 124).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.9287F, -1.2866F, 4.5504F, -0.0349F, -0.0262F, 0.0F));

		PartDefinition cube_r133 = rightLeg2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(9, 66).addBox(0.0995F, -0.9995F, -3.1146F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.485F, -0.4F, 2.894F, 0.0524F, -0.0262F, 0.0F));

		PartDefinition cube_r134 = rightLeg2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(131, 31).addBox(-1.6F, 0.4F, -0.325F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(111, 97).addBox(-0.5F, 0.4F, -0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5839F, -1.1433F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r135 = rightLeg2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(111, 89).addBox(-0.5F, -1.3F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 1.591F, -0.6237F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r136 = rightLeg2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(56, 126).addBox(-0.5F, 0.0F, -1.125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.7141F, 7.2417F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r137 = rightLeg2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(131, 66).addBox(-0.5F, -0.1F, -0.125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0629F, 6.5092F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r138 = rightLeg2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(23, 121).addBox(-0.5F, -0.9F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.687F, 2.1046F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r139 = rightLeg2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(112, 20).addBox(-0.5F, -0.4F, -3.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.1514F, 2.0152F, 0.2618F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(75, 47).addBox(-2.0F, -0.525F, 0.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7657F, 0.5525F, 6.6489F, -3.1403F, 0.9759F, -1.6718F));

		PartDefinition cube_r140 = rightLeg3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(23, 89).addBox(-1.0F, -0.3F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4F, -0.5532F, -1.0204F, -0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7F, -0.5432F, 2.7821F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r141 = rightLeg4.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(95, 32).addBox(-3.5F, -0.275F, -0.3F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.2F, 0.2F, 0.2F, 0.3491F, 0.0F, 0.0F));

		PartDefinition body4 = hips.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4323F, -6.9906F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r142 = body4.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(138, 4).addBox(-0.6F, -2.27F, -0.227F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.9966F, -1.3034F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r143 = body4.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(138, 8).addBox(-0.6F, -2.07F, 0.073F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.612F, -5.2997F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r144 = body4.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(55, 79).addBox(-0.6F, -2.17F, 0.0731F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.8952F, -3.4325F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r145 = body4.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(0, 113).mirror().addBox(-0.2333F, -0.8036F, -0.6034F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -3.1051F, -4.7238F, 0.3554F, -0.1164F, 1.4866F));

		PartDefinition cube_r146 = body4.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(20, 117).mirror().addBox(-5.0623F, 3.5552F, -0.7401F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -3.1051F, -4.7238F, 0.3216F, 0.2275F, 0.6256F));

		PartDefinition cube_r147 = body4.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(113, 137).mirror().addBox(-8.9556F, 6.0601F, -0.7401F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -3.1051F, -4.7238F, 0.1777F, 0.3509F, 0.1315F));

		PartDefinition cube_r148 = body4.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(138, 19).mirror().addBox(-8.9556F, 6.0601F, -0.7401F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -2.3051F, -2.8238F, 0.1753F, 0.3335F, 0.1307F));

		PartDefinition cube_r149 = body4.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(30, 118).mirror().addBox(-5.0623F, 3.5552F, -0.7401F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -2.3051F, -2.8238F, 0.3112F, 0.2133F, 0.6234F));

		PartDefinition cube_r150 = body4.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(92, 112).mirror().addBox(-0.2333F, -0.8036F, -0.6034F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -2.3051F, -2.8238F, 0.3379F, -0.1178F, 1.4887F));

		PartDefinition cube_r151 = body4.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(33, 118).mirror().addBox(-5.0623F, 3.5552F, -0.7401F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.705F, -0.9238F, 0.3112F, 0.2133F, 0.6234F));

		PartDefinition cube_r152 = body4.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(95, 112).mirror().addBox(-0.2333F, -0.8036F, -0.6034F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.705F, -0.9238F, 0.3379F, -0.1178F, 1.4887F));

		PartDefinition cube_r153 = body4.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(95, 112).addBox(0.2333F, -0.8036F, -0.6034F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.705F, -0.9238F, 0.3379F, 0.1178F, -1.4887F));

		PartDefinition cube_r154 = body4.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(33, 118).addBox(5.0623F, 3.5552F, -0.7401F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.705F, -0.9238F, 0.3112F, -0.2133F, -0.6234F));

		PartDefinition cube_r155 = body4.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(92, 112).addBox(0.2333F, -0.8036F, -0.6034F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -2.3051F, -2.8238F, 0.3379F, 0.1178F, -1.4887F));

		PartDefinition cube_r156 = body4.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(30, 118).addBox(5.0623F, 3.5552F, -0.7401F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -2.3051F, -2.8238F, 0.3112F, -0.2133F, -0.6234F));

		PartDefinition cube_r157 = body4.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(138, 19).addBox(8.9556F, 6.0601F, -0.7401F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -2.3051F, -2.8238F, 0.1753F, -0.3335F, -0.1307F));

		PartDefinition cube_r158 = body4.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(0, 113).addBox(0.2333F, -0.8036F, -0.6034F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -3.1051F, -4.7238F, 0.3554F, 0.1164F, -1.4866F));

		PartDefinition cube_r159 = body4.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(20, 117).addBox(5.0623F, 3.5552F, -0.7401F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -3.1051F, -4.7238F, 0.3216F, -0.2275F, -0.6256F));

		PartDefinition cube_r160 = body4.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(113, 137).addBox(8.9556F, 6.0601F, -0.7401F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -3.1051F, -4.7238F, 0.1777F, -0.3509F, -0.1315F));

		PartDefinition cube_r161 = body4.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(34, 33).addBox(-1.0F, -0.07F, 0.073F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -3.612F, -5.2997F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r162 = body4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(68, 37).addBox(-1.5F, -0.5602F, 3.0964F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 84).addBox(-1.5F, -0.5061F, 5.0442F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.612F, -12.0997F, -0.1222F, 0.0F, 0.0F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9233F, -3.3176F, -5.237F, -0.0262F, -0.0436F, 0.0011F));

		PartDefinition cube_r163 = body3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(115, 33).addBox(-1.5F, -0.6061F, 0.0442F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9233F, -1.0943F, -5.8627F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r164 = body3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(132, 34).addBox(-0.6F, -2.7406F, -0.2547F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4233F, -0.4413F, -3.7432F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r165 = body3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(102, 54).addBox(-0.6F, -2.4061F, -0.2558F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4233F, -0.163F, -1.7627F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r166 = body3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(106, 137).addBox(-0.6F, -2.5061F, -0.0558F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4233F, -1.0943F, -5.8627F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r167 = body3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(80, 120).mirror().addBox(-3.407F, 2.4927F, -1.0641F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3467F, -0.7124F, -4.6868F, 0.3216F, 0.2275F, 0.678F));

		PartDefinition cube_r168 = body3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(87, 128).mirror().addBox(-0.0817F, -0.7569F, -0.9713F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3467F, -0.7124F, -4.6868F, 0.3554F, -0.1164F, 1.539F));

		PartDefinition cube_r169 = body3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(98, 106).mirror().addBox(-6.9953F, 5.8991F, -1.0641F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3467F, -0.7124F, -4.6868F, 0.1777F, 0.3509F, 0.1838F));

		PartDefinition cube_r170 = body3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(3, 113).mirror().addBox(-7.3589F, 5.9743F, -1.2128F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4467F, -0.7124F, -2.5868F, 0.1777F, 0.3509F, 0.1664F));

		PartDefinition cube_r171 = body3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(118, 104).mirror().addBox(-3.6928F, 2.7298F, -1.2128F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4467F, -0.7124F, -2.5868F, 0.3216F, 0.2275F, 0.6605F));

		PartDefinition cube_r172 = body3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(118, 127).mirror().addBox(-0.0666F, -0.3828F, -1.112F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4467F, -0.7124F, -2.5868F, 0.3554F, -0.1164F, 1.5215F));

		PartDefinition cube_r173 = body3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(124, 23).mirror().addBox(-0.2576F, -1.1806F, -1.1633F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7467F, -0.5124F, -0.3868F, 0.3554F, -0.1164F, 1.4866F));

		PartDefinition cube_r174 = body3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(118, 119).mirror().addBox(-3.9681F, 2.6996F, -1.27F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7467F, -0.5124F, -0.3868F, 0.3216F, 0.2275F, 0.6256F));

		PartDefinition cube_r175 = body3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(36, 131).mirror().addBox(-7.5879F, 5.8184F, -1.27F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7467F, -0.5124F, -0.3868F, 0.1777F, 0.3509F, 0.1315F));

		PartDefinition cube_r176 = body3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(36, 131).addBox(7.5879F, 5.8184F, -1.27F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.5124F, -0.3868F, 0.1777F, -0.3509F, -0.1315F));

		PartDefinition cube_r177 = body3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(118, 119).addBox(3.9681F, 2.6996F, -1.27F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.5124F, -0.3868F, 0.3216F, -0.2275F, -0.6256F));

		PartDefinition cube_r178 = body3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(124, 23).addBox(0.2576F, -1.1806F, -1.1633F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.5124F, -0.3868F, 0.3554F, 0.1164F, -1.4866F));

		PartDefinition cube_r179 = body3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(118, 127).addBox(0.0666F, -0.3828F, -1.112F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.7124F, -2.5868F, 0.3554F, 0.1164F, -1.5215F));

		PartDefinition cube_r180 = body3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(118, 104).addBox(3.6928F, 2.7298F, -1.2128F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.7124F, -2.5868F, 0.3216F, -0.2275F, -0.6605F));

		PartDefinition cube_r181 = body3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(3, 113).addBox(7.3589F, 5.9743F, -1.2128F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.7124F, -2.5868F, 0.1777F, -0.3509F, -0.1664F));

		PartDefinition cube_r182 = body3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(80, 120).addBox(3.407F, 2.4927F, -1.0641F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7124F, -4.6868F, 0.3216F, -0.2275F, -0.678F));

		PartDefinition cube_r183 = body3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(87, 128).addBox(0.0817F, -0.7569F, -0.9713F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7124F, -4.6868F, 0.3554F, 0.1164F, -1.539F));

		PartDefinition cube_r184 = body3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(98, 106).addBox(6.9953F, 5.8991F, -1.0641F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7124F, -4.6868F, 0.1777F, -0.3509F, -0.1838F));

		PartDefinition cube_r185 = body3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(0, 23).addBox(-1.0F, 0.0939F, -0.0558F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9233F, -1.2943F, -6.8627F, -0.1222F, 0.0F, 0.0F));

		PartDefinition body5 = body3.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9233F, -0.2411F, -6.9487F, -0.0087F, -0.0436F, 0.0004F));

		PartDefinition cube_r186 = body5.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(110, 133).mirror().addBox(-0.1119F, -0.5052F, -0.6898F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2233F, -0.4714F, -2.1382F, 0.3554F, -0.1164F, 1.6088F));

		PartDefinition cube_r187 = body5.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(120, 76).mirror().addBox(-2.8356F, 2.0184F, -0.7667F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2233F, -0.4714F, -2.1382F, 0.3216F, 0.2275F, 0.7478F));

		PartDefinition cube_r188 = body5.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(20, 88).mirror().addBox(-6.2681F, 5.7486F, -0.7667F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2233F, -0.4714F, -2.1382F, 0.1777F, 0.3509F, 0.2536F));

		PartDefinition cube_r189 = body5.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(50, 95).mirror().addBox(-6.2681F, 5.7486F, -0.7666F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3233F, -0.6714F, 0.0618F, 0.1777F, 0.3509F, 0.2536F));

		PartDefinition cube_r190 = body5.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(77, 120).mirror().addBox(-2.8356F, 2.0184F, -0.7666F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3233F, -0.6714F, 0.0618F, 0.3216F, 0.2275F, 0.7478F));

		PartDefinition cube_r191 = body5.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(126, 133).mirror().addBox(-0.1119F, -0.5052F, -0.6898F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3233F, -0.6714F, 0.0618F, 0.3554F, -0.1164F, 1.6088F));

		PartDefinition cube_r192 = body5.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(126, 133).addBox(0.1119F, -0.5052F, -0.6898F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3233F, -0.6714F, 0.0618F, 0.3554F, 0.1164F, -1.6088F));

		PartDefinition cube_r193 = body5.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(77, 120).addBox(2.8356F, 2.0184F, -0.7666F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3233F, -0.6714F, 0.0618F, 0.3216F, -0.2275F, -0.7478F));

		PartDefinition cube_r194 = body5.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(50, 95).addBox(6.2681F, 5.7486F, -0.7666F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3233F, -0.6714F, 0.0618F, 0.1777F, -0.3509F, -0.2536F));

		PartDefinition cube_r195 = body5.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(110, 133).addBox(0.1119F, -0.5052F, -0.6898F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2233F, -0.4714F, -2.1382F, 0.3554F, 0.1164F, -1.6088F));

		PartDefinition cube_r196 = body5.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(120, 76).addBox(2.8356F, 2.0184F, -0.7667F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2233F, -0.4714F, -2.1382F, 0.3216F, -0.2275F, -0.7478F));

		PartDefinition cube_r197 = body5.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(20, 88).addBox(6.2681F, 5.7486F, -0.7667F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2233F, -0.4714F, -2.1382F, 0.1777F, -0.3509F, -0.2536F));

		PartDefinition cube_r198 = body5.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(59, 0).addBox(-1.0F, -1.0F, -3.9F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.004F))
				.texOffs(37, 114).addBox(-1.5F, -1.6F, -2.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 114).addBox(-1.5F, -1.6F, -0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r199 = body5.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(137, 94).addBox(-0.6F, -2.8014F, 0.0678F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8407F, -2.9843F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r200 = body5.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(32, 134).addBox(-0.6F, -2.6014F, -0.0322F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8896F, -0.8308F, -0.3578F, 0.0F, 0.0F));

		PartDefinition body2 = body5.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0983F, -3.8751F, 0.1136F, -0.0434F, -0.0049F));

		PartDefinition cube_r201 = body2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(100, 132).addBox(-0.6F, -3.9874F, -0.3422F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5071F, -4.6216F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r202 = body2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(112, 126).addBox(-0.6F, -3.9874F, -0.2422F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5212F, -2.8723F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r203 = body2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(53, 126).addBox(-0.6F, -3.4874F, -0.1422F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6233F, -0.9027F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r204 = body2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(64, 47).addBox(-1.5F, -2.0F, -6.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 114).addBox(-1.5F, -2.0F, -10.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 27).addBox(-1.5F, -2.0F, -8.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 5.9F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r205 = body2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(71, 120).mirror().addBox(-1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5233F, -0.5696F, -4.3631F, 0.255F, 0.2863F, 0.7309F));

		PartDefinition cube_r206 = body2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(11, 87).mirror().addBox(-4.9775F, 5.4796F, -0.5618F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5233F, -0.5696F, -4.3631F, 0.0871F, 0.3714F, 0.2216F));

		PartDefinition cube_r207 = body2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(136, 101).mirror().addBox(-0.1697F, -0.8263F, -0.5132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5233F, -0.5696F, -4.3631F, 0.3587F, -0.0292F, 1.6086F));

		PartDefinition cube_r208 = body2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(14, 87).mirror().addBox(-4.9775F, 5.4796F, -0.5618F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1233F, -0.5696F, -2.3631F, 0.0871F, 0.3714F, 0.2216F));

		PartDefinition cube_r209 = body2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(74, 120).mirror().addBox(-1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1233F, -0.5696F, -2.3631F, 0.255F, 0.2863F, 0.7309F));

		PartDefinition cube_r210 = body2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(134, 136).mirror().addBox(-0.1697F, -0.8263F, -0.5132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1233F, -0.5696F, -2.3631F, 0.3587F, -0.0292F, 1.6086F));

		PartDefinition cube_r211 = body2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(133, 101).mirror().addBox(-0.1697F, -1.8263F, -0.5132F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4233F, -0.5696F, -0.1631F, 0.3587F, -0.0292F, 1.6086F));

		PartDefinition cube_r212 = body2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(6, 121).mirror().addBox(-1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4233F, -0.5696F, -0.1631F, 0.255F, 0.2863F, 0.7309F));

		PartDefinition cube_r213 = body2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(17, 87).mirror().addBox(-4.9775F, 5.4796F, -0.5618F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4233F, -0.5696F, -0.1631F, 0.0871F, 0.3714F, 0.2216F));

		PartDefinition cube_r214 = body2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(17, 87).addBox(4.9775F, 5.4796F, -0.5618F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4233F, -0.5696F, -0.1631F, 0.0871F, -0.3714F, -0.2216F));

		PartDefinition cube_r215 = body2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(6, 121).addBox(1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4233F, -0.5696F, -0.1631F, 0.255F, -0.2863F, -0.7309F));

		PartDefinition cube_r216 = body2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(133, 101).addBox(0.1697F, -1.8263F, -0.5132F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4233F, -0.5696F, -0.1631F, 0.3587F, 0.0292F, -1.6086F));

		PartDefinition cube_r217 = body2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(134, 136).addBox(0.1697F, -0.8263F, -0.5132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1233F, -0.5696F, -2.3631F, 0.3587F, 0.0292F, -1.6086F));

		PartDefinition cube_r218 = body2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(74, 120).addBox(1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1233F, -0.5696F, -2.3631F, 0.255F, -0.2863F, -0.7309F));

		PartDefinition cube_r219 = body2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(14, 87).addBox(4.9775F, 5.4796F, -0.5618F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1233F, -0.5696F, -2.3631F, 0.0871F, -0.3714F, -0.2216F));

		PartDefinition cube_r220 = body2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(71, 120).addBox(1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5233F, -0.5696F, -4.3631F, 0.255F, -0.2863F, -0.7309F));

		PartDefinition cube_r221 = body2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(11, 87).addBox(4.9775F, 5.4796F, -0.5618F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5233F, -0.5696F, -4.3631F, 0.0871F, -0.3714F, -0.2216F));

		PartDefinition cube_r222 = body2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(136, 101).addBox(0.1697F, -0.8263F, -0.5132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5233F, -0.5696F, -4.3631F, 0.3587F, 0.0292F, -1.6086F));

		PartDefinition cube_r223 = body2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(34, 42).addBox(-1.0F, -1.0F, -8.9F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.1F, 3.9F, 0.0524F, 0.0F, 0.0F));

		PartDefinition body6 = body2.addOrReplaceChild("body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.578F, -5.0888F, -0.1962F, -0.0772F, 0.0596F));

		PartDefinition cube_r224 = body6.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(76, 135).mirror().addBox(-0.1697F, -0.8263F, -0.5132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5233F, 0.2084F, -1.2743F, 0.3189F, -0.2179F, 1.5833F));

		PartDefinition cube_r225 = body6.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(65, 120).mirror().addBox(-1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5233F, 0.2084F, -1.2743F, 0.3758F, 0.1339F, 0.726F));

		PartDefinition cube_r226 = body6.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(63, 93).mirror().addBox(-4.9775F, 5.4796F, -0.5618F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5233F, 0.2084F, -1.2743F, 0.2734F, 0.2928F, 0.2524F));

		PartDefinition cube_r227 = body6.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(63, 93).addBox(4.9775F, 5.4796F, -0.5618F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5233F, 0.2084F, -1.2743F, 0.2734F, -0.2928F, -0.2524F));

		PartDefinition cube_r228 = body6.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(65, 120).addBox(1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5233F, 0.2084F, -1.2743F, 0.3758F, -0.1339F, -0.726F));

		PartDefinition cube_r229 = body6.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(76, 135).addBox(0.1697F, -0.8263F, -0.5132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5233F, 0.2084F, -1.2743F, 0.3189F, 0.2179F, -1.5833F));

		PartDefinition cube_r230 = body6.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(70, 77).addBox(-1.0F, -0.0401F, -7.1382F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(114, 54).addBox(-1.5F, -1.0401F, -6.1382F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4366F, 3.9777F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r231 = body6.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(9, 121).addBox(-0.6F, -4.6636F, 0.0067F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6938F, -1.7671F, -0.1484F, 0.0F, 0.0F));

		PartDefinition chest = body6.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1669F, -2.5223F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(115, 127).addBox(-0.6F, -4.9653F, -0.587F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0064F, -2.3457F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(127, 95).addBox(-0.6F, -5.0654F, -0.087F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4338F, -0.9738F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(52, 65).addBox(-2.0F, -1.0197F, 1.7017F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.3773F, -6.2914F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(15, 52).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.5308F, -2.1119F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(115, 7).addBox(-1.5F, -1.9F, -4.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 4).addBox(-1.5F, -1.9F, -2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 58).addBox(-1.0F, -0.9F, -5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2F, 1.1F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(135, 120).mirror().addBox(-0.1697F, -0.8263F, -0.5132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0233F, 0.6415F, -2.452F, 0.2368F, -0.2665F, 1.5519F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(68, 120).mirror().addBox(-1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0233F, 0.6415F, -2.452F, 0.3613F, 0.0416F, 0.6736F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(114, 57).mirror().addBox(-4.9775F, 5.4796F, -0.5618F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0233F, 0.6415F, -2.452F, 0.3031F, 0.204F, 0.2086F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(29, 134).mirror().addBox(-0.1697F, -0.8263F, -0.5132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0233F, -0.1585F, -0.652F, 0.2637F, -0.2941F, 1.5825F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(115, 119).mirror().addBox(-1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0233F, -0.1585F, -0.652F, 0.3991F, 0.0438F, 0.7132F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(66, 99).mirror().addBox(-4.9775F, 5.4796F, -0.5618F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0233F, -0.1585F, -0.652F, 0.3367F, 0.2228F, 0.2537F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(66, 99).addBox(4.9775F, 5.4796F, -0.5618F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0233F, -0.1585F, -0.652F, 0.3367F, -0.2228F, -0.2537F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(115, 119).addBox(1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0233F, -0.1585F, -0.652F, 0.3991F, -0.0438F, -0.7132F));

		PartDefinition cube_r245 = chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(29, 134).addBox(0.1697F, -0.8263F, -0.5132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0233F, -0.1585F, -0.652F, 0.2637F, 0.2941F, -1.5825F));

		PartDefinition cube_r246 = chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(114, 57).addBox(4.9775F, 5.4796F, -0.5618F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0233F, 0.6415F, -2.452F, 0.3031F, -0.204F, -0.2086F));

		PartDefinition cube_r247 = chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(68, 120).addBox(1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0233F, 0.6415F, -2.452F, 0.3613F, -0.0416F, -0.6736F));

		PartDefinition cube_r248 = chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(135, 120).addBox(0.1697F, -0.8263F, -0.5132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0233F, 0.6415F, -2.452F, 0.2368F, 0.2665F, -1.5519F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2851F, -2.9861F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r249 = chest2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(131, 59).addBox(-0.6F, -4.5644F, -0.5794F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7507F, -2.9815F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r250 = chest2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(131, 43).addBox(-0.6F, -4.8644F, -0.0794F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4546F, -1.5657F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r251 = chest2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(83, 117).addBox(-1.5F, -1.9F, -6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 30).addBox(-1.0F, -0.9F, -9.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -3.1F, 4.1F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r252 = chest2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(16, 138).mirror().addBox(-0.1697F, 0.1737F, -0.5132F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5233F, -1.7436F, -1.6659F, 0.2626F, -0.2457F, 1.4693F));

		PartDefinition cube_r253 = chest2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(0, 122).mirror().addBox(-1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5233F, -1.7436F, -1.6659F, 0.3613F, 0.0742F, 0.5975F));

		PartDefinition cube_r254 = chest2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(105, 116).mirror().addBox(-4.9775F, 5.4796F, -0.5618F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5233F, -1.7436F, -1.6659F, 0.2881F, 0.233F, 0.1292F));

		PartDefinition cube_r255 = chest2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(101, 78).mirror().addBox(-0.1697F, 0.1737F, -0.5132F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4233F, -0.5436F, -2.9659F, 0.2575F, -0.2717F, 1.3645F));

		PartDefinition cube_r256 = chest2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(3, 122).mirror().addBox(-1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4233F, -0.5436F, -2.9659F, 0.3781F, 0.0536F, 0.4925F));

		PartDefinition cube_r257 = chest2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(5, 134).mirror().addBox(-4.9775F, 5.4796F, -0.5618F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4233F, -0.5436F, -2.9659F, 0.313F, 0.2222F, 0.0288F));

		PartDefinition cube_r258 = chest2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(5, 134).addBox(4.9775F, 5.4796F, -0.5618F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4233F, -0.5436F, -2.9659F, 0.313F, -0.2222F, -0.0288F));

		PartDefinition cube_r259 = chest2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(3, 122).addBox(1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4233F, -0.5436F, -2.9659F, 0.3781F, -0.0536F, -0.4925F));

		PartDefinition cube_r260 = chest2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(101, 78).addBox(0.1697F, 0.1737F, -0.5132F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4233F, -0.5436F, -2.9659F, 0.2575F, 0.2717F, -1.3645F));

		PartDefinition cube_r261 = chest2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(105, 116).addBox(4.9775F, 5.4796F, -0.5618F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5233F, -1.7436F, -1.6659F, 0.2881F, -0.233F, -0.1292F));

		PartDefinition cube_r262 = chest2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(0, 122).addBox(1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5233F, -1.7436F, -1.6659F, 0.3613F, -0.0742F, -0.5975F));

		PartDefinition cube_r263 = chest2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(16, 138).addBox(0.1697F, 0.1737F, -0.5132F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5233F, -1.7436F, -1.6659F, 0.2626F, 0.2457F, -1.4693F));

		PartDefinition neck3 = chest2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1009F, -3.5656F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r264 = neck3.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(107, 131).addBox(-0.1F, -3.6722F, 0.0299F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6588F, -2.116F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r265 = neck3.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(106, 31).addBox(-0.5F, 0.9F, 1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -4.9F, 0.4014F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2195F, -2.6473F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r266 = neck2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(26, 134).addBox(0.0F, -2.6F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1919F, -0.1548F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r267 = neck2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(119, 24).addBox(0.0F, -1.9861F, -0.9362F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6761F, -3.1188F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r268 = neck2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(79, 27).addBox(-0.5F, 0.0F, -3.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.8F, 0.3316F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0626F, -3.542F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r269 = neck.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(23, 100).addBox(-0.5F, 0.7742F, 1.1409F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5182F, -4.5372F, 0.5236F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1191F, -2.6956F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(38, 30).addBox(-2.0F, -0.45F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 10.7193F, -5.7641F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r271 = head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(115, 46).addBox(-1.5F, -1.0F, -0.025F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 5.8107F, -5.6397F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r272 = head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(9, 73).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 4.8138F, -5.5612F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r273 = head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(55, 18).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.846F, -5.4424F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r274 = head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(115, 69).addBox(-2.0F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 9.9975F, -6.2887F, 1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r275 = head.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(115, 66).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 9.0084F, -6.2617F, 3.1154F, 0.0F, 0.0F));

		PartDefinition cube_r276 = head.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(115, 49).addBox(-2.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 8.0393F, -6.0635F, -1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r277 = head.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(67, 64).addBox(-2.0F, -1.8463F, -0.6756F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 8.0651F, -5.3734F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r278 = head.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(9, 82).addBox(-0.5F, -1.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 3.8837F, -5.4233F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r279 = head.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(83, 22).addBox(0.991F, 1.959F, -0.3391F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.991F, 0.1907F, -4.0969F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r280 = head.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(81, 17).addBox(-1.5045F, -1.4553F, -1.7993F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0045F, 0.0788F, -2.1644F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r281 = head.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(70, 22).addBox(-2.0F, -1.075F, -0.875F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.0274F, -1.1406F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r282 = head.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(55, 24).addBox(-2.0F, -1.3F, 0.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 5.9323F, -1.8356F, 3.1241F, 0.0F, 0.0F));

		PartDefinition cube_r283 = head.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(51, 30).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 4.1747F, -0.8813F, 2.6442F, 0.0F, 0.0F));

		PartDefinition cube_r284 = head.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(0, 51).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 1.2909F, -0.0544F, 1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r285 = head.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(42, 18).addBox(-2.0045F, 0.5273F, 0.8944F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0045F, 0.0788F, -2.1644F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r286 = head.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(127, 87).mirror().addBox(-1.5F, -2.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(127, 87).addBox(0.55F, -2.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.025F, 0.6887F, 2.9257F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r287 = head.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(132, 110).mirror().addBox(-0.6F, -1.986F, -0.7103F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.925F, 0.5696F, 2.7696F, -2.3756F, 0.0866F, -0.1226F));

		PartDefinition cube_r288 = head.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(133, 0).mirror().addBox(-0.6F, -2.2604F, 2.6086F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4446F, 1.6696F, -0.5953F, 0.0866F, -0.1226F));

		PartDefinition cube_r289 = head.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(135, 129).mirror().addBox(-0.6F, -3.2992F, 0.5479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4446F, 1.6696F, -1.6425F, 0.0866F, -0.1226F));

		PartDefinition cube_r290 = head.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(136, 40).mirror().addBox(-0.6F, -1.4321F, 3.1793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4446F, 1.6696F, -0.159F, 0.0866F, -0.1226F));

		PartDefinition cube_r291 = head.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(136, 40).addBox(-0.4F, -1.4321F, 3.1793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, 0.4446F, 1.6696F, -0.159F, -0.0866F, 0.1226F));

		PartDefinition cube_r292 = head.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(11, 136).addBox(-0.3F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2571F, 0.9947F, 4.86F, -0.5953F, 0.0F, 0.0F));

		PartDefinition cube_r293 = head.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(133, 0).addBox(-0.4F, -2.2604F, 2.6086F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.0F, 0.4446F, 1.6696F, -0.5953F, -0.0866F, 0.1226F));

		PartDefinition cube_r294 = head.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(135, 129).addBox(-0.4F, -3.2992F, 0.5479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, 0.4446F, 1.6696F, -1.6425F, -0.0866F, 0.1226F));

		PartDefinition cube_r295 = head.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(132, 110).addBox(-0.4F, -1.986F, -0.7103F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.925F, 0.5696F, 2.7696F, -2.3756F, -0.0866F, 0.1226F));

		PartDefinition cube_r296 = head.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(104, 85).addBox(-0.9955F, -0.8377F, -1.8406F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0045F, 0.0788F, -2.1644F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r297 = head.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(105, 64).addBox(-0.9955F, 0.0765F, -1.8444F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0045F, 0.0788F, -2.1644F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r298 = head.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(106, 46).addBox(-0.4955F, 0.9482F, -1.9133F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4955F, 0.0788F, -2.1644F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r299 = head.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(81, 79).addBox(-1.5045F, -1.9992F, -0.345F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0045F, 0.0788F, -2.1644F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r300 = head.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(106, 42).addBox(-0.5F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.491F, 1.9942F, -4.969F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftSygomaticarch = head.addOrReplaceChild("leftSygomaticarch", CubeListBuilder.create(), PartPose.offset(2.9479F, 6.8548F, 0.3631F));

		PartDefinition cube_r301 = leftSygomaticarch.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(68, 128).addBox(-1.025F, 0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(126, 56).addBox(-1.025F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1147F, -0.036F, -4.8034F, -0.4517F, 0.0282F, 2.3349F));

		PartDefinition cube_r302 = leftSygomaticarch.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(53, 102).addBox(-0.5F, -1.0F, -0.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.4479F, 0.7096F, -4.2467F, -0.2464F, -0.127F, 0.0318F));

		PartDefinition cube_r303 = leftSygomaticarch.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(53, 97).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.4479F, -2.9711F, -5.7864F, -0.1893F, -0.087F, -0.5174F));

		PartDefinition cube_r304 = leftSygomaticarch.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(49, 137).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4479F, -2.041F, -5.9243F, 0.5853F, 0.2017F, 1.3888F));

		PartDefinition cube_r305 = leftSygomaticarch.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(39, 137).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4479F, -2.041F, -5.9243F, -0.0958F, 0.6087F, -0.0549F));

		PartDefinition cube_r306 = leftSygomaticarch.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(133, 18).addBox(-1.0F, -1.3F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4479F, 0.2257F, -6.1873F, -0.3045F, 0.6319F, -0.1835F));

		PartDefinition cube_r307 = leftSygomaticarch.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(44, 137).addBox(-1.0F, -1.0F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4479F, -1.0441F, -6.0028F, -1.5069F, 0.6099F, 0.0366F));

		PartDefinition cube_r308 = leftSygomaticarch.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(115, 112).addBox(-0.6F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2877F, 1.6043F, -2.7878F, -0.2297F, -0.2747F, -0.0231F));

		PartDefinition cube_r309 = leftSygomaticarch.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(16, 101).addBox(-1.35F, -4.0F, -0.625F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(80, 133).addBox(0.0F, 0.2F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-1.9479F, 3.0482F, -3.1968F, -0.2526F, -0.2538F, 0.0647F));

		PartDefinition cube_r310 = leftSygomaticarch.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(79, 137).addBox(-0.8F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1428F, 5.0097F, -3.5968F, 0.0069F, -0.3561F, -0.7543F));

		PartDefinition cube_r311 = leftSygomaticarch.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(137, 22).addBox(-1.6536F, -1.0323F, 2.8268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(136, 84).addBox(-1.6536F, -0.0323F, 2.8268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4839F, 2.971F, -2.818F, 3.1156F, -0.0034F, -0.1919F));

		PartDefinition cube_r312 = leftSygomaticarch.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(103, 16).addBox(-1.654F, 2.9455F, -2.8897F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4839F, 2.971F, -2.818F, -1.8136F, 0.0261F, -0.0734F));

		PartDefinition cube_r313 = leftSygomaticarch.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(128, 15).addBox(-0.625F, -0.975F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.8878F, 3.6348F, -3.4598F, 0.2774F, 0.2264F, -2.9728F));

		PartDefinition cube_r314 = leftSygomaticarch.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(128, 15).addBox(-1.0F, -1.1F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.8878F, 3.6348F, -3.4598F, 0.3511F, 0.061F, -2.4701F));

		PartDefinition cube_r315 = leftSygomaticarch.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(65, 117).addBox(-0.2F, -0.8F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.5526F, 5.3948F, -3.806F, 0.268F, -0.2375F, -1.5968F));

		PartDefinition cube_r316 = leftSygomaticarch.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(56, 132).addBox(-0.5F, -1.125F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7046F, 1.1389F, -4.2152F, -0.5472F, 0.0669F, 2.4653F));

		PartDefinition cube_r317 = leftSygomaticarch.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(132, 23).addBox(0.2F, -0.125F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7046F, 1.1389F, -4.2152F, -0.2307F, 0.4466F, -2.948F));

		PartDefinition cube_r318 = leftSygomaticarch.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(124, 31).addBox(-2.4155F, 2.1622F, -0.9903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.4839F, 2.971F, -2.818F, -1.6072F, -0.805F, 2.9251F));

		PartDefinition cube_r319 = leftSygomaticarch.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(32, 102).addBox(-3.3826F, -0.7994F, -0.9903F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.4839F, 2.971F, -2.818F, 1.6772F, -1.3314F, -0.3462F));

		PartDefinition cube_r320 = leftSygomaticarch.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(101, 11).addBox(-0.3138F, -2.8063F, -0.9903F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.4839F, 2.971F, -2.818F, 1.5965F, 0.1944F, -0.2378F));

		PartDefinition cube_r321 = leftSygomaticarch.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(59, 77).addBox(-0.9491F, -0.2682F, -0.8631F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.226F)), PartPose.offsetAndRotation(-0.5839F, 2.971F, -2.818F, 1.3526F, -0.086F, -0.1017F));

		PartDefinition cube_r322 = leftSygomaticarch.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(63, 128).addBox(-3.8636F, -2.5924F, 0.7912F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.4839F, 2.971F, -2.818F, -1.9396F, -1.3765F, 1.899F));

		PartDefinition cube_r323 = leftSygomaticarch.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(121, 107).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.1206F, 0.0077F, -5.8649F, 1.2083F, -0.6685F, 0.098F));

		PartDefinition cube_r324 = leftSygomaticarch.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(128, 18).addBox(-3.1133F, -2.5924F, -2.6325F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.4839F, 2.971F, -2.818F, -0.2316F, -0.6685F, 0.098F));

		PartDefinition cube_r325 = leftSygomaticarch.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(75, 128).addBox(-1.8F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.8141F, 0.08F, -5.3919F, 0.2093F, 0.2099F, 1.3936F));

		PartDefinition cube_r326 = leftSygomaticarch.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(64, 137).addBox(-0.2784F, -1.7924F, -2.5161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F))
				.texOffs(133, 55).addBox(-0.2784F, -1.5924F, -2.5161F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(46, 129).addBox(-0.2784F, -2.5924F, -3.0161F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(17, 129).addBox(-0.2784F, -2.5924F, -3.5161F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.4839F, 2.971F, -2.818F, -0.1861F, 0.2307F, -0.0901F));

		PartDefinition cube_r327 = leftSygomaticarch.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(95, 131).addBox(-0.8186F, -1.5924F, -1.9935F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4839F, 2.971F, -2.818F, -0.1815F, -0.0697F, -0.0343F));

		PartDefinition cube_r328 = leftSygomaticarch.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(85, 107).addBox(-0.7487F, -1.6308F, -1.7055F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.4839F, 2.971F, -2.818F, -0.1815F, -0.0697F, -0.1739F));

		PartDefinition cube_r329 = leftSygomaticarch.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(12, 126).addBox(-0.7487F, -1.3052F, -0.812F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(69, 99).addBox(-0.7487F, -1.3302F, -1.412F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4839F, 2.971F, -2.818F, -0.3997F, -0.0697F, -0.1739F));

		PartDefinition cube_r330 = leftSygomaticarch.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(26, 126).addBox(-0.7487F, -1.2408F, -0.6352F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4839F, 2.971F, -2.818F, -0.2688F, -0.0697F, -0.1739F));

		PartDefinition cube_r331 = leftSygomaticarch.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(75, 131).addBox(-0.7487F, -0.2363F, -0.6121F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.4839F, 2.971F, -2.818F, -0.5306F, -0.0697F, -0.1739F));

		PartDefinition cube_r332 = leftSygomaticarch.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(23, 94).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.6634F, -0.4112F, -2.4142F, -0.383F, -0.1364F, -0.1965F));

		PartDefinition cube_r333 = leftSygomaticarch.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(109, 104).addBox(-1.8F, 0.2F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.5454F, 0.2909F, -3.5219F, -0.4773F, -0.9473F, 0.3361F));

		PartDefinition cube_r334 = leftSygomaticarch.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(94, 20).addBox(-1.8F, -2.8F, -0.2F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.5454F, 0.2909F, -3.5219F, -0.6867F, -0.9473F, 0.3361F));

		PartDefinition cube_r335 = leftSygomaticarch.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(16, 108).addBox(-0.8186F, -2.3953F, -1.8919F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.4839F, 2.971F, -2.818F, -0.3997F, -0.0697F, -0.0343F));

		PartDefinition cube_r336 = leftSygomaticarch.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(31, 126).addBox(-0.6653F, -1.9007F, -2.1412F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.4839F, 2.971F, -2.818F, -0.0086F, 0.0085F, -0.1999F));

		PartDefinition cube_r337 = leftSygomaticarch.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(101, 0).addBox(-0.3138F, -2.5076F, -1.3518F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.4839F, 2.971F, -2.818F, 1.4219F, 0.1944F, -0.2378F));

		PartDefinition cube_r338 = leftSygomaticarch.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(120, 95).addBox(0.6513F, 0.32F, -1.9713F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5557F, -0.598F, -2.6847F, 0.6251F, 0.2326F, 0.3421F));

		PartDefinition cube_r339 = leftSygomaticarch.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(76, 104).addBox(-0.5F, -0.375F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5166F, -0.218F, -0.7785F, 0.9141F, 0.0057F, 0.148F));

		PartDefinition cube_r340 = leftSygomaticarch.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(120, 91).addBox(-0.5F, 0.025F, -0.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5948F, -0.7667F, -1.4037F, -0.0458F, 0.0057F, 0.148F));

		PartDefinition cube_r341 = leftSygomaticarch.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(127, 23).addBox(-0.5F, -1.5F, -0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.8785F, -2.6485F, -3.3963F, -2.979F, 0.0429F, 0.0547F));

		PartDefinition cube_r342 = leftSygomaticarch.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(107, 126).addBox(-0.5F, 0.2389F, -0.2674F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(0.7955F, -0.9265F, -3.1334F, -3.0663F, 0.0429F, 0.0547F));

		PartDefinition cube_r343 = leftSygomaticarch.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(135, 37).addBox(-0.5F, -0.2382F, -0.3991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7955F, -0.9265F, -3.1334F, -2.8045F, 0.0429F, 0.0547F));

		PartDefinition cube_r344 = leftSygomaticarch.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(121, 15).addBox(-0.5F, -0.25F, -1.525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.7901F, -1.074F, -2.872F, -2.4118F, 0.038F, 0.0583F));

		PartDefinition cube_r345 = leftSygomaticarch.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(134, 27).addBox(-0.5781F, -1.3163F, -0.5951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4474F, -3.9424F, -2.1771F, 2.8092F, -0.0897F, -0.3526F));

		PartDefinition cube_r346 = leftSygomaticarch.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(123, 52).addBox(-2.1F, -0.6F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5718F, -5.4592F, -1.9687F, -0.2475F, -0.1645F, -0.6441F));

		PartDefinition cube_r347 = leftSygomaticarch.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(110, 72).addBox(-0.175F, -0.2F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.1262F, -8.4564F, -4.1821F, -3.0484F, -0.0553F, -3.1404F));

		PartDefinition cube_r348 = leftSygomaticarch.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(39, 110).addBox(-0.175F, -0.2F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6288F, -8.2183F, -3.6712F, -2.88F, -1.2339F, 3.0229F));

		PartDefinition cube_r349 = leftSygomaticarch.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(110, 26).addBox(-1.775F, -0.2F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0044F, -8.0112F, -2.2127F, -0.2094F, -1.1471F, 0.3202F));

		PartDefinition cube_r350 = leftSygomaticarch.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(36, 122).addBox(-0.975F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(12, 122).addBox(-0.675F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5648F, -7.4207F, -1.3717F, -0.8163F, -0.9432F, 1.0114F));

		PartDefinition cube_r351 = leftSygomaticarch.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(121, 120).addBox(-1.0F, -1.6F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.7952F, -6.3904F, -1.6805F, -0.2855F, 0.08F, 0.1965F));

		PartDefinition cube_r352 = leftSygomaticarch.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(76, 115).addBox(-1.6508F, -3.2001F, -0.763F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4474F, -3.9424F, -2.1771F, -0.2927F, -0.0463F, -0.2215F));

		PartDefinition cube_r353 = leftSygomaticarch.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(66, 134).addBox(-0.5781F, -0.8415F, -0.5235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(134, 49).addBox(-0.5781F, -0.2657F, -0.3167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4474F, -3.9424F, -2.1771F, 0.1476F, -0.0897F, -0.3526F));

		PartDefinition cube_r354 = leftSygomaticarch.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(134, 59).addBox(-0.5781F, -0.2289F, -0.5327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.4474F, -3.9424F, -2.1771F, -0.1142F, -0.0897F, -0.3526F));

		PartDefinition cube_r355 = leftSygomaticarch.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(121, 19).addBox(-0.6508F, -0.9592F, -2.5973F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.4474F, -3.9424F, -2.1771F, -1.558F, -0.0463F, -0.2215F));

		PartDefinition cube_r356 = leftSygomaticarch.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(95, 135).addBox(-0.6508F, -1.2701F, -0.5412F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.4474F, -3.9424F, -2.1771F, -0.5108F, -0.0463F, -0.2215F));

		PartDefinition cube_r357 = leftSygomaticarch.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(134, 91).addBox(-0.5781F, -0.9064F, -0.3528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.4474F, -3.9424F, -2.1771F, -0.2014F, -0.0897F, -0.3526F));

		PartDefinition cube_r358 = leftSygomaticarch.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(134, 46).addBox(-0.5781F, -0.0913F, -0.9296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.4474F, -3.9424F, -2.1771F, 1.0639F, -0.0897F, -0.3526F));

		PartDefinition cube_r359 = leftSygomaticarch.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(44, 134).addBox(-0.5781F, -0.5243F, -1.5601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.4474F, -3.9424F, -2.1771F, 1.6748F, -0.0897F, -0.3526F));

		PartDefinition cube_r360 = leftSygomaticarch.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(134, 43).addBox(-0.5781F, -1.1249F, -1.5492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.4474F, -3.9424F, -2.1771F, 2.1111F, -0.0897F, -0.3526F));

		PartDefinition cube_r361 = leftSygomaticarch.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(39, 134).addBox(-0.5781F, -1.788F, -1.1497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(133, 72).addBox(-0.5781F, -1.788F, -0.8497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.4474F, -3.9424F, -2.1771F, 2.5474F, -0.0897F, -0.3526F));

		PartDefinition cube_r362 = leftSygomaticarch.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(134, 62).addBox(-0.5781F, -1.2877F, -1.958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.4474F, -3.9424F, -2.1771F, 1.762F, -0.0897F, -0.3526F));

		PartDefinition cube_r363 = leftSygomaticarch.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(71, 135).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.8934F, -1.9936F, -1.567F, -2.8482F, 0.038F, 0.0583F));

		PartDefinition cube_r364 = leftSygomaticarch.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(120, 36).addBox(-0.5F, -0.45F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8361F, -1.3834F, -2.1387F, -2.0191F, 0.038F, 0.0583F));

		PartDefinition cube_r365 = leftSygomaticarch.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(120, 87).addBox(-0.5F, -0.7F, -1.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.7901F, -1.074F, -2.872F, -1.8882F, 0.038F, 0.0583F));

		PartDefinition cube_r366 = leftSygomaticarch.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(132, 87).addBox(-0.5F, -1.768F, -0.3986F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.7955F, -0.9515F, -3.1584F, -2.5427F, 0.038F, 0.0583F));

		PartDefinition cube_r367 = leftSygomaticarch.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(135, 34).addBox(-1.0305F, -0.7113F, -0.4407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0943F, -0.598F, -2.6847F, -2.8308F, 0.0317F, 0.0619F));

		PartDefinition cube_r368 = leftSygomaticarch.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(85, 135).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6114F, -1.1358F, -2.1907F, -0.9815F, 0.0086F, 0.069F));

		PartDefinition cube_r369 = leftSygomaticarch.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(135, 13).addBox(-1.0305F, -1.0846F, -0.8783F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0943F, -0.598F, -2.6847F, -1.3299F, 0.0317F, 0.0619F));

		PartDefinition cube_r370 = leftSygomaticarch.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(90, 135).addBox(-0.5F, -1.1F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(0, 135).addBox(-0.5F, -0.5F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4519F, 0.2293F, -0.4395F, -1.0494F, 0.0057F, 0.148F));

		PartDefinition cube_r371 = leftSygomaticarch.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(85, 112).addBox(0.3045F, -0.8377F, -1.8406F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.9434F, -6.776F, -2.5275F, -0.3509F, 0.108F, 0.2863F));

		PartDefinition cube_r372 = leftSygomaticarch.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(134, 133).addBox(0.4404F, -0.4909F, -1.1654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5557F, 0.577F, -1.3097F, -1.6603F, 0.0057F, 0.148F));

		PartDefinition cube_r373 = leftSygomaticarch.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(82, 128).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.9389F, -4.7921F, -5.1441F, -0.5389F, 0.8413F, -0.4193F));

		PartDefinition cube_r374 = leftSygomaticarch.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(23, 116).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3522F, -5.3154F, -3.658F, -1.4562F, 1.1069F, -1.3164F));

		PartDefinition cube_r375 = leftSygomaticarch.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(128, 102).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3522F, -5.3154F, -3.658F, -0.7287F, 0.8399F, -0.4601F));

		PartDefinition cube_r376 = leftSygomaticarch.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(121, 116).addBox(-2.0F, -0.025F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.6911F, -2.6495F, -4.9915F, -1.5162F, 1.3466F, -1.2306F));

		PartDefinition cube_r377 = leftSygomaticarch.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(51, 133).addBox(-1.0F, -0.025F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4647F, -2.9907F, -5.477F, -0.4194F, 0.9941F, -0.0734F));

		PartDefinition cube_r378 = leftSygomaticarch.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(6, 116).addBox(-2.0F, -2.975F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3522F, -5.3154F, -3.658F, -1.1279F, 1.0588F, -1.3362F));

		PartDefinition cube_r379 = leftSygomaticarch.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(91, 106).addBox(-1.0F, -2.775F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.9389F, -5.7318F, -4.8021F, -0.553F, 0.7407F, -0.6226F));

		PartDefinition cube_r380 = leftSygomaticarch.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(113, 134).addBox(0.6509F, 0.352F, -0.0442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5557F, -0.598F, -2.6847F, 0.3004F, -0.0326F, 0.1445F));

		PartDefinition cube_r381 = leftSygomaticarch.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(92, 82).addBox(0.6458F, 0.2638F, -0.3405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5557F, -0.598F, -2.6847F, -0.3307F, -0.117F, 0.1264F));

		PartDefinition rightSygomaticarch = head.addOrReplaceChild("rightSygomaticarch", CubeListBuilder.create(), PartPose.offset(-2.9479F, 6.8548F, 0.3631F));

		PartDefinition cube_r382 = rightSygomaticarch.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(68, 128).mirror().addBox(-0.975F, 0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(126, 56).mirror().addBox(-0.975F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1147F, -0.036F, -4.8034F, -0.4517F, -0.0282F, -2.3349F));

		PartDefinition cube_r383 = rightSygomaticarch.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(53, 102).mirror().addBox(-1.5F, -1.0F, -0.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(2.4479F, 0.7096F, -4.2467F, -0.2464F, 0.127F, -0.0318F));

		PartDefinition cube_r384 = rightSygomaticarch.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(53, 97).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.4479F, -2.9711F, -5.7864F, -0.1893F, 0.087F, 0.5174F));

		PartDefinition cube_r385 = rightSygomaticarch.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(49, 137).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.4479F, -2.041F, -5.9243F, 0.5853F, -0.2017F, -1.3888F));

		PartDefinition cube_r386 = rightSygomaticarch.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(39, 137).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.4479F, -2.041F, -5.9243F, -0.0958F, -0.6087F, 0.0549F));

		PartDefinition cube_r387 = rightSygomaticarch.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(133, 18).mirror().addBox(0.0F, -1.3F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.4479F, 0.2257F, -6.1873F, -0.3045F, -0.6319F, 0.1835F));

		PartDefinition cube_r388 = rightSygomaticarch.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(44, 137).mirror().addBox(0.0F, -1.0F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.4479F, -1.0441F, -6.0028F, -1.5069F, -0.6099F, -0.0366F));

		PartDefinition cube_r389 = rightSygomaticarch.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(115, 112).mirror().addBox(-0.4F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2877F, 1.6043F, -2.7878F, -0.2297F, 0.2747F, 0.0231F));

		PartDefinition cube_r390 = rightSygomaticarch.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(16, 101).mirror().addBox(-0.65F, -4.0F, -0.625F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(80, 133).mirror().addBox(-1.0F, 0.2F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(1.9479F, 3.0482F, -3.1968F, -0.2526F, 0.2538F, -0.0647F));

		PartDefinition cube_r391 = rightSygomaticarch.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(79, 137).mirror().addBox(-0.2F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1428F, 5.0097F, -3.5968F, 0.0069F, 0.3561F, 0.7543F));

		PartDefinition cube_r392 = rightSygomaticarch.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(137, 22).mirror().addBox(0.6536F, -1.0323F, 2.8268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(136, 84).mirror().addBox(0.6536F, -0.0323F, 2.8268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.4839F, 2.971F, -2.818F, 3.1156F, 0.0034F, 0.1919F));

		PartDefinition cube_r393 = rightSygomaticarch.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(103, 16).mirror().addBox(0.654F, 2.9455F, -2.8897F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.4839F, 2.971F, -2.818F, -1.8136F, -0.0261F, 0.0734F));

		PartDefinition cube_r394 = rightSygomaticarch.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(128, 15).mirror().addBox(-1.375F, -0.975F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(1.8878F, 3.6348F, -3.4598F, 0.2774F, -0.2264F, 2.9728F));

		PartDefinition cube_r395 = rightSygomaticarch.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(128, 15).mirror().addBox(-1.0F, -1.1F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.8878F, 3.6348F, -3.4598F, 0.3511F, -0.061F, 2.4701F));

		PartDefinition cube_r396 = rightSygomaticarch.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(65, 117).mirror().addBox(-2.8F, -0.8F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.5526F, 5.3948F, -3.806F, 0.268F, 0.2375F, 1.5968F));

		PartDefinition cube_r397 = rightSygomaticarch.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(56, 132).mirror().addBox(-0.5F, -1.125F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7046F, 1.1389F, -4.2152F, -0.5472F, -0.0669F, -2.4653F));

		PartDefinition cube_r398 = rightSygomaticarch.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(132, 23).mirror().addBox(-1.2F, -0.125F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7046F, 1.1389F, -4.2152F, -0.2307F, -0.4466F, 2.948F));

		PartDefinition cube_r399 = rightSygomaticarch.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(124, 31).mirror().addBox(1.4155F, 2.1622F, -0.9903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.4839F, 2.971F, -2.818F, -1.6072F, 0.805F, -2.9251F));

		PartDefinition cube_r400 = rightSygomaticarch.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(32, 102).mirror().addBox(2.3826F, -0.7994F, -0.9903F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.4839F, 2.971F, -2.818F, 1.6772F, 1.3314F, 0.3462F));

		PartDefinition cube_r401 = rightSygomaticarch.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(101, 11).mirror().addBox(-0.6862F, -2.8063F, -0.9903F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.4839F, 2.971F, -2.818F, 1.5965F, -0.1944F, 0.2378F));

		PartDefinition cube_r402 = rightSygomaticarch.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(59, 77).mirror().addBox(-0.0509F, -0.2682F, -0.8631F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.226F)).mirror(false), PartPose.offsetAndRotation(0.5839F, 2.971F, -2.818F, 1.3526F, 0.086F, 0.1017F));

		PartDefinition cube_r403 = rightSygomaticarch.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(63, 128).mirror().addBox(2.8636F, -2.5924F, 0.7912F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.4839F, 2.971F, -2.818F, -1.9396F, 1.3765F, -1.899F));

		PartDefinition cube_r404 = rightSygomaticarch.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(121, 107).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.1206F, 0.0077F, -5.8649F, 1.2083F, 0.6685F, -0.098F));

		PartDefinition cube_r405 = rightSygomaticarch.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(128, 18).mirror().addBox(2.1133F, -2.5924F, -2.6325F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.4839F, 2.971F, -2.818F, -0.2316F, 0.6685F, -0.098F));

		PartDefinition cube_r406 = rightSygomaticarch.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(75, 128).mirror().addBox(-0.2F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.8141F, 0.08F, -5.3919F, 0.2093F, -0.2099F, -1.3936F));

		PartDefinition cube_r407 = rightSygomaticarch.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(64, 137).mirror().addBox(-0.7216F, -1.7924F, -2.5161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(133, 55).mirror().addBox(-0.7216F, -1.5924F, -2.5161F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(46, 129).mirror().addBox(-0.7216F, -2.5924F, -3.0161F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(17, 129).mirror().addBox(-0.7216F, -2.5924F, -3.5161F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.4839F, 2.971F, -2.818F, -0.1861F, -0.2307F, 0.0901F));

		PartDefinition cube_r408 = rightSygomaticarch.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(95, 131).mirror().addBox(-0.1814F, -1.5924F, -1.9935F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4839F, 2.971F, -2.818F, -0.1815F, 0.0697F, 0.0343F));

		PartDefinition cube_r409 = rightSygomaticarch.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(85, 107).mirror().addBox(-0.2513F, -1.6308F, -1.7055F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.4839F, 2.971F, -2.818F, -0.1815F, 0.0697F, 0.1739F));

		PartDefinition cube_r410 = rightSygomaticarch.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(12, 126).mirror().addBox(-0.2513F, -1.3052F, -0.812F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(69, 99).mirror().addBox(-0.2513F, -1.3302F, -1.412F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4839F, 2.971F, -2.818F, -0.3997F, 0.0697F, 0.1739F));

		PartDefinition cube_r411 = rightSygomaticarch.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(26, 126).mirror().addBox(-0.2513F, -1.2408F, -0.6352F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4839F, 2.971F, -2.818F, -0.2688F, 0.0697F, 0.1739F));

		PartDefinition cube_r412 = rightSygomaticarch.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(75, 131).mirror().addBox(-0.2513F, -0.2363F, -0.6121F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.4839F, 2.971F, -2.818F, -0.5306F, 0.0697F, 0.1739F));

		PartDefinition cube_r413 = rightSygomaticarch.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(23, 94).mirror().addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.6634F, -0.4112F, -2.4142F, -0.383F, 0.1364F, 0.1965F));

		PartDefinition cube_r414 = rightSygomaticarch.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(109, 104).mirror().addBox(-0.2F, 0.2F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.5454F, 0.2909F, -3.5219F, -0.4773F, 0.9473F, -0.3361F));

		PartDefinition cube_r415 = rightSygomaticarch.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(94, 20).mirror().addBox(-0.2F, -2.8F, -0.2F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.5454F, 0.2909F, -3.5219F, -0.6867F, 0.9473F, -0.3361F));

		PartDefinition cube_r416 = rightSygomaticarch.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(16, 108).mirror().addBox(-0.1814F, -2.3953F, -1.8919F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.4839F, 2.971F, -2.818F, -0.3997F, 0.0697F, 0.0343F));

		PartDefinition cube_r417 = rightSygomaticarch.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(31, 126).mirror().addBox(-0.3348F, -1.9007F, -2.1412F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.4839F, 2.971F, -2.818F, -0.0086F, -0.0085F, 0.1999F));

		PartDefinition cube_r418 = rightSygomaticarch.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(101, 0).mirror().addBox(-0.6862F, -2.5076F, -1.3518F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(0.4839F, 2.971F, -2.818F, 1.4219F, -0.1944F, 0.2378F));

		PartDefinition cube_r419 = rightSygomaticarch.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(120, 95).mirror().addBox(-1.6513F, 0.32F, -1.9713F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5557F, -0.598F, -2.6847F, 0.6251F, -0.2326F, -0.3421F));

		PartDefinition cube_r420 = rightSygomaticarch.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(76, 104).mirror().addBox(-0.5F, -0.375F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5166F, -0.218F, -0.7785F, 0.9141F, -0.0057F, -0.148F));

		PartDefinition cube_r421 = rightSygomaticarch.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(120, 91).mirror().addBox(-0.5F, 0.025F, -0.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5948F, -0.7667F, -1.4037F, -0.0458F, -0.0057F, -0.148F));

		PartDefinition cube_r422 = rightSygomaticarch.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(127, 23).mirror().addBox(-0.5F, -1.5F, -0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.8785F, -2.6485F, -3.3963F, -2.979F, -0.0429F, -0.0547F));

		PartDefinition cube_r423 = rightSygomaticarch.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(107, 126).mirror().addBox(-0.5F, 0.2389F, -0.2674F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(-0.7955F, -0.9265F, -3.1334F, -3.0663F, -0.0429F, -0.0547F));

		PartDefinition cube_r424 = rightSygomaticarch.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(135, 37).mirror().addBox(-0.5F, -0.2382F, -0.3991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7955F, -0.9265F, -3.1334F, -2.8045F, -0.0429F, -0.0547F));

		PartDefinition cube_r425 = rightSygomaticarch.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(121, 15).mirror().addBox(-0.5F, -0.25F, -1.525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.7901F, -1.074F, -2.872F, -2.4118F, -0.038F, -0.0583F));

		PartDefinition cube_r426 = rightSygomaticarch.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(134, 27).mirror().addBox(-0.4219F, -1.3163F, -0.5951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4474F, -3.9424F, -2.1771F, 2.8092F, 0.0897F, 0.3526F));

		PartDefinition cube_r427 = rightSygomaticarch.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(123, 52).mirror().addBox(0.1F, -0.6F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5718F, -5.4592F, -1.9687F, -0.2475F, 0.1645F, 0.6441F));

		PartDefinition cube_r428 = rightSygomaticarch.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(110, 72).mirror().addBox(-1.825F, -0.2F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.1262F, -8.4564F, -4.1821F, -3.0484F, 0.0553F, 3.1404F));

		PartDefinition cube_r429 = rightSygomaticarch.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(39, 110).mirror().addBox(-1.825F, -0.2F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6288F, -8.2183F, -3.6712F, -2.88F, 1.2339F, -3.0229F));

		PartDefinition cube_r430 = rightSygomaticarch.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(110, 26).mirror().addBox(-0.225F, -0.2F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0044F, -8.0112F, -2.2127F, -0.2094F, 1.1471F, -0.3202F));

		PartDefinition cube_r431 = rightSygomaticarch.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(36, 122).mirror().addBox(-0.025F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(12, 122).mirror().addBox(-0.325F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5648F, -7.4207F, -1.3717F, -0.8163F, 0.9432F, -1.0114F));

		PartDefinition cube_r432 = rightSygomaticarch.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(121, 120).mirror().addBox(-1.0F, -1.6F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.7952F, -6.3904F, -1.6805F, -0.2855F, -0.08F, -0.1965F));

		PartDefinition cube_r433 = rightSygomaticarch.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(76, 115).mirror().addBox(-0.3492F, -3.2001F, -0.763F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4474F, -3.9424F, -2.1771F, -0.2927F, 0.0463F, 0.2215F));

		PartDefinition cube_r434 = rightSygomaticarch.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(66, 134).mirror().addBox(-0.4219F, -0.8415F, -0.5235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(134, 49).mirror().addBox(-0.4219F, -0.2657F, -0.3167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4474F, -3.9424F, -2.1771F, 0.1476F, 0.0897F, 0.3526F));

		PartDefinition cube_r435 = rightSygomaticarch.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(134, 59).mirror().addBox(-0.4219F, -0.2289F, -0.5327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.4474F, -3.9424F, -2.1771F, -0.1142F, 0.0897F, 0.3526F));

		PartDefinition cube_r436 = rightSygomaticarch.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(121, 19).mirror().addBox(-0.3492F, -0.9592F, -2.5973F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.4474F, -3.9424F, -2.1771F, -1.558F, 0.0463F, 0.2215F));

		PartDefinition cube_r437 = rightSygomaticarch.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(95, 135).mirror().addBox(-0.3492F, -1.2701F, -0.5412F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.4474F, -3.9424F, -2.1771F, -0.5108F, 0.0463F, 0.2215F));

		PartDefinition cube_r438 = rightSygomaticarch.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(134, 91).mirror().addBox(-0.4219F, -0.9064F, -0.3528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.4474F, -3.9424F, -2.1771F, -0.2014F, 0.0897F, 0.3526F));

		PartDefinition cube_r439 = rightSygomaticarch.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(134, 46).mirror().addBox(-0.4219F, -0.0913F, -0.9296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.4474F, -3.9424F, -2.1771F, 1.0639F, 0.0897F, 0.3526F));

		PartDefinition cube_r440 = rightSygomaticarch.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(44, 134).mirror().addBox(-0.4219F, -0.5243F, -1.5601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.4474F, -3.9424F, -2.1771F, 1.6748F, 0.0897F, 0.3526F));

		PartDefinition cube_r441 = rightSygomaticarch.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(134, 43).mirror().addBox(-0.4219F, -1.1249F, -1.5492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.4474F, -3.9424F, -2.1771F, 2.1111F, 0.0897F, 0.3526F));

		PartDefinition cube_r442 = rightSygomaticarch.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(39, 134).mirror().addBox(-0.4219F, -1.788F, -1.1497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(133, 72).mirror().addBox(-0.4219F, -1.788F, -0.8497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.4474F, -3.9424F, -2.1771F, 2.5474F, 0.0897F, 0.3526F));

		PartDefinition cube_r443 = rightSygomaticarch.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(134, 62).mirror().addBox(-0.4219F, -1.2877F, -1.958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.4474F, -3.9424F, -2.1771F, 1.762F, 0.0897F, 0.3526F));

		PartDefinition cube_r444 = rightSygomaticarch.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(71, 135).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.8934F, -1.9936F, -1.567F, -2.8482F, -0.038F, -0.0583F));

		PartDefinition cube_r445 = rightSygomaticarch.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(120, 36).mirror().addBox(-0.5F, -0.45F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8361F, -1.3834F, -2.1387F, -2.0191F, -0.038F, -0.0583F));

		PartDefinition cube_r446 = rightSygomaticarch.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(120, 87).mirror().addBox(-0.5F, -0.7F, -1.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.7901F, -1.074F, -2.872F, -1.8882F, -0.038F, -0.0583F));

		PartDefinition cube_r447 = rightSygomaticarch.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(132, 87).mirror().addBox(-0.5F, -1.768F, -0.3986F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.7955F, -0.9515F, -3.1584F, -2.5427F, -0.038F, -0.0583F));

		PartDefinition cube_r448 = rightSygomaticarch.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(135, 34).mirror().addBox(0.0305F, -0.7113F, -0.4407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0943F, -0.598F, -2.6847F, -2.8308F, -0.0317F, -0.0619F));

		PartDefinition cube_r449 = rightSygomaticarch.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(85, 135).mirror().addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6114F, -1.1358F, -2.1907F, -0.9815F, -0.0086F, -0.069F));

		PartDefinition cube_r450 = rightSygomaticarch.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(135, 13).mirror().addBox(0.0305F, -1.0846F, -0.8783F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0943F, -0.598F, -2.6847F, -1.3299F, -0.0317F, -0.0619F));

		PartDefinition cube_r451 = rightSygomaticarch.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(90, 135).mirror().addBox(-0.5F, -1.1F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(0, 135).mirror().addBox(-0.5F, -0.5F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4519F, 0.2293F, -0.4395F, -1.0494F, -0.0057F, -0.148F));

		PartDefinition cube_r452 = rightSygomaticarch.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(85, 112).mirror().addBox(-1.3045F, -0.8377F, -1.8406F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.9434F, -6.776F, -2.5275F, -0.3509F, -0.108F, -0.2863F));

		PartDefinition cube_r453 = rightSygomaticarch.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(134, 133).mirror().addBox(-1.4404F, -0.4909F, -1.1654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.5557F, 0.577F, -1.3097F, -1.6603F, -0.0057F, -0.148F));

		PartDefinition cube_r454 = rightSygomaticarch.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(82, 128).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.9389F, -4.7921F, -5.1441F, -0.5389F, -0.8413F, 0.4193F));

		PartDefinition cube_r455 = rightSygomaticarch.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(23, 116).mirror().addBox(0.0F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.3522F, -5.3154F, -3.658F, -1.4562F, -1.1069F, 1.3164F));

		PartDefinition cube_r456 = rightSygomaticarch.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(128, 102).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.3522F, -5.3154F, -3.658F, -0.7287F, -0.8399F, 0.4601F));

		PartDefinition cube_r457 = rightSygomaticarch.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(121, 116).mirror().addBox(0.0F, -0.025F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.6911F, -2.6495F, -4.9915F, -1.5162F, -1.3466F, 1.2306F));

		PartDefinition cube_r458 = rightSygomaticarch.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(51, 133).mirror().addBox(0.0F, -0.025F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.4647F, -2.9907F, -5.477F, -0.4194F, -0.9941F, 0.0734F));

		PartDefinition cube_r459 = rightSygomaticarch.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(6, 116).mirror().addBox(0.0F, -2.975F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.3522F, -5.3154F, -3.658F, -1.1279F, -1.0588F, 1.3362F));

		PartDefinition cube_r460 = rightSygomaticarch.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(91, 106).mirror().addBox(0.0F, -2.775F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.9389F, -5.7318F, -4.8021F, -0.553F, -0.7407F, 0.6226F));

		PartDefinition cube_r461 = rightSygomaticarch.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(113, 134).mirror().addBox(-1.6508F, 0.352F, -0.0442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.5557F, -0.598F, -2.6847F, 0.3004F, 0.0326F, -0.1445F));

		PartDefinition cube_r462 = rightSygomaticarch.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(92, 82).mirror().addBox(-1.6458F, 0.2638F, -0.3405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.5557F, -0.598F, -2.6847F, -0.3307F, 0.117F, -0.1264F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 2.2093F, -0.9803F));

		PartDefinition cube_r463 = jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(92, 76).mirror().addBox(-0.6802F, -1.1239F, 0.3556F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-2.1907F, 1.4654F, -0.2256F, -0.5419F, 0.1296F, -0.2455F));

		PartDefinition cube_r464 = jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(101, 26).mirror().addBox(-0.6802F, -1.1679F, -0.9692F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1907F, 1.4654F, -0.2256F, -0.6728F, 0.1296F, -0.2455F));

		PartDefinition cube_r465 = jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(90, 121).mirror().addBox(-0.7116F, -3.8252F, -0.9873F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.1907F, 1.4654F, -0.2256F, -1.0132F, 0.1296F, -0.2455F));

		PartDefinition cube_r466 = jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(101, 111).mirror().addBox(-0.7116F, -1.8354F, 1.5231F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.1907F, 1.4654F, -0.2256F, -0.1841F, 0.1296F, -0.2455F));

		PartDefinition cube_r467 = jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(97, 121).mirror().addBox(-0.7116F, -1.2969F, -3.1348F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1907F, 1.4654F, -0.2256F, -2.3309F, 0.1296F, -0.2455F));

		PartDefinition cube_r468 = jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(82, 102).mirror().addBox(-0.6802F, 0.0669F, -1.4666F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.1907F, 1.4654F, -0.2256F, -0.411F, 0.1296F, -0.2455F));

		PartDefinition cube_r469 = jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(98, 116).mirror().addBox(-0.6802F, -0.1876F, -1.4474F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.1907F, 1.4654F, -0.2256F, 0.6362F, 0.1296F, -0.2455F));

		PartDefinition cube_r470 = jaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(117, 10).mirror().addBox(-0.6802F, 0.6176F, 1.238F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.1907F, 1.4654F, -0.2256F, -0.2801F, 0.1296F, -0.2455F));

		PartDefinition cube_r471 = jaw.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(13, 117).mirror().addBox(-0.1719F, 2.3482F, 1.0882F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(44, 117).mirror().addBox(-0.1719F, 2.3482F, 0.5882F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.1907F, 1.4654F, -0.2256F, -0.2103F, 0.1296F, -0.071F));

		PartDefinition cube_r472 = jaw.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(37, 117).mirror().addBox(-0.6802F, 0.9093F, -2.1061F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-2.1907F, 1.4654F, -0.2256F, 0.7496F, 0.1296F, -0.2455F));

		PartDefinition cube_r473 = jaw.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(61, 133).mirror().addBox(-0.6984F, -0.4245F, -1.6654F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.1907F, 1.4654F, -0.2256F, 0.4032F, 0.094F, -0.2386F));

		PartDefinition cube_r474 = jaw.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(51, 117).mirror().addBox(-0.9502F, 0.0275F, -1.6694F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(43, 122).mirror().addBox(-0.9502F, -0.1562F, -3.5098F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.0907F, 5.8654F, -0.2256F, 1.2034F, 0.1296F, -0.1234F));

		PartDefinition cube_r475 = jaw.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(117, 60).mirror().addBox(-0.9502F, -0.4303F, -1.8062F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(102, 89).mirror().addBox(-0.9502F, -0.9303F, -2.1062F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0907F, 5.8654F, -0.2256F, 1.3605F, 0.1296F, -0.1234F));

		PartDefinition cube_r476 = jaw.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(122, 40).mirror().addBox(-0.9502F, -2.4863F, -2.1653F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.0907F, 5.8654F, -0.2256F, 2.6869F, 0.1296F, -0.1234F));

		PartDefinition cube_r477 = jaw.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(137, 52).mirror().addBox(-0.9502F, -2.8127F, 1.7201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.0907F, 5.8654F, -0.2256F, -2.3309F, 0.1296F, -0.1234F));

		PartDefinition cube_r478 = jaw.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(59, 137).mirror().addBox(-0.9502F, 0.2757F, 2.2031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-1.0907F, 5.8654F, -0.2256F, -1.4582F, 0.1296F, -0.1234F));

		PartDefinition cube_r479 = jaw.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(137, 75).mirror().addBox(-1.0675F, 0.8628F, -3.5636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.0907F, 5.8654F, -0.2256F, 0.8568F, 0.1118F, -0.1668F));

		PartDefinition cube_r480 = jaw.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(137, 78).mirror().addBox(-1.0675F, 0.2844F, 2.8731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0907F, 5.8654F, -0.2256F, -1.4558F, 0.1118F, -0.1668F));

		PartDefinition cube_r481 = jaw.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(137, 87).mirror().addBox(-0.1915F, -0.2321F, -0.4828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0012F, 9.7276F, -1.7275F, -0.4974F, 0.35F, 0.6787F));

		PartDefinition cube_r482 = jaw.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(100, 129).mirror().addBox(-0.9692F, -0.8504F, -0.4828F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(128, 107).mirror().addBox(-0.9692F, -1.4504F, -0.4828F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0012F, 9.7276F, -1.7275F, -0.0724F, 0.5958F, 1.5578F));

		PartDefinition cube_r483 = jaw.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(129, 133).mirror().addBox(-0.6545F, -1.4593F, -0.4828F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.0012F, 9.7276F, -1.7275F, -0.58F, -0.1618F, -0.1257F));

		PartDefinition cube_r484 = jaw.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(124, 60).mirror().addBox(-1.868F, -0.5444F, -0.4828F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-1.0012F, 9.7276F, -1.7275F, 0.4597F, 0.3996F, 2.591F));

		PartDefinition cube_r485 = jaw.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(124, 48).mirror().addBox(-0.5795F, -1.7593F, -0.4828F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0012F, 9.7276F, -1.7275F, -1.4596F, -0.0357F, 0.1529F));

		PartDefinition cube_r486 = jaw.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(97, 121).addBox(-0.2884F, -1.2969F, -3.1348F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1907F, 1.4654F, -0.2256F, -2.3309F, -0.1296F, 0.2455F));

		PartDefinition cube_r487 = jaw.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(101, 111).addBox(-0.2884F, -1.8354F, 1.5231F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.1907F, 1.4654F, -0.2256F, -0.1841F, -0.1296F, 0.2455F));

		PartDefinition cube_r488 = jaw.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(90, 121).addBox(-0.2884F, -3.8252F, -0.9873F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.1907F, 1.4654F, -0.2256F, -1.0132F, -0.1296F, 0.2455F));

		PartDefinition cube_r489 = jaw.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(98, 116).addBox(-0.3198F, -0.1876F, -1.4474F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.1907F, 1.4654F, -0.2256F, 0.6362F, -0.1296F, 0.2455F));

		PartDefinition cube_r490 = jaw.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(82, 102).addBox(-0.3198F, 0.0669F, -1.4666F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.1907F, 1.4654F, -0.2256F, -0.411F, -0.1296F, 0.2455F));

		PartDefinition cube_r491 = jaw.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(101, 26).addBox(-0.3198F, -1.1679F, -0.9692F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1907F, 1.4654F, -0.2256F, -0.6728F, -0.1296F, 0.2455F));

		PartDefinition cube_r492 = jaw.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(44, 117).addBox(-0.8281F, 2.3482F, 0.5882F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(13, 117).addBox(-0.8281F, 2.3482F, 1.0882F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(2.1907F, 1.4654F, -0.2256F, -0.2103F, -0.1296F, 0.071F));

		PartDefinition cube_r493 = jaw.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(61, 133).addBox(-0.3016F, -0.4245F, -1.6654F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.1907F, 1.4654F, -0.2256F, 0.4032F, -0.094F, 0.2386F));

		PartDefinition cube_r494 = jaw.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(37, 117).addBox(-0.3198F, 0.9093F, -2.1061F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(2.1907F, 1.4654F, -0.2256F, 0.7496F, -0.1296F, 0.2455F));

		PartDefinition cube_r495 = jaw.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(102, 89).addBox(-0.0498F, -0.9303F, -2.1062F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F))
				.texOffs(117, 60).addBox(-0.0498F, -0.4303F, -1.8062F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.0907F, 5.8654F, -0.2256F, 1.3605F, -0.1296F, 0.1234F));

		PartDefinition cube_r496 = jaw.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(43, 122).addBox(-0.0498F, -0.1562F, -3.5098F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(51, 117).addBox(-0.0498F, 0.0275F, -1.6694F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0907F, 5.8654F, -0.2256F, 1.2034F, -0.1296F, 0.1234F));

		PartDefinition cube_r497 = jaw.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(137, 75).addBox(0.0675F, 0.8628F, -3.5636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.0907F, 5.8654F, -0.2256F, 0.8568F, -0.1118F, 0.1668F));

		PartDefinition cube_r498 = jaw.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(137, 87).addBox(-0.8085F, -0.2321F, -0.4828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0012F, 9.7276F, -1.7275F, -0.4974F, -0.35F, -0.6787F));

		PartDefinition cube_r499 = jaw.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(128, 107).addBox(-1.0308F, -1.4504F, -0.4828F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(100, 129).addBox(-1.0308F, -0.8504F, -0.4828F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.0012F, 9.7276F, -1.7275F, -0.0724F, -0.5958F, -1.5578F));

		PartDefinition cube_r500 = jaw.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(124, 48).addBox(-1.4205F, -1.7593F, -0.4828F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0012F, 9.7276F, -1.7275F, -1.4596F, 0.0357F, -0.1529F));

		PartDefinition cube_r501 = jaw.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(129, 133).addBox(-0.3455F, -1.4593F, -0.4828F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.0012F, 9.7276F, -1.7275F, -0.58F, 0.1618F, 0.1257F));

		PartDefinition cube_r502 = jaw.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(124, 60).addBox(-0.132F, -0.5444F, -0.4828F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.0012F, 9.7276F, -1.7275F, 0.4597F, -0.3996F, -2.591F));

		PartDefinition cube_r503 = jaw.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(137, 78).addBox(0.0675F, 0.2844F, 2.8731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0907F, 5.8654F, -0.2256F, -1.4558F, -0.1118F, 0.1668F));

		PartDefinition cube_r504 = jaw.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(59, 137).addBox(-0.0498F, 0.2757F, 2.2031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(1.0907F, 5.8654F, -0.2256F, -1.4582F, -0.1296F, 0.1234F));

		PartDefinition cube_r505 = jaw.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(137, 52).addBox(-0.0498F, -2.8127F, 1.7201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.0907F, 5.8654F, -0.2256F, -2.3309F, -0.1296F, 0.1234F));

		PartDefinition cube_r506 = jaw.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(122, 40).addBox(-0.0498F, -2.4863F, -2.1653F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.0907F, 5.8654F, -0.2256F, 2.6869F, -0.1296F, 0.1234F));

		PartDefinition cube_r507 = jaw.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(117, 10).addBox(-0.3198F, 0.6176F, 1.238F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.1907F, 1.4654F, -0.2256F, -0.2801F, -0.1296F, 0.2455F));

		PartDefinition cube_r508 = jaw.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(92, 76).addBox(-0.3198F, -1.1239F, 0.3556F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(2.1907F, 1.4654F, -0.2256F, -0.5419F, -0.1296F, 0.2455F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(7.082F, 3.9151F, -0.5982F, 0.0261F, 0.2438F, -0.0725F));

		PartDefinition cube_r509 = bone2.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(0, 0).addBox(-0.1F, 0.0F, -8.3F, 2.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7586F, 2.7876F, -3.7432F, -2.6844F, 0.4391F, -0.9835F));

		PartDefinition cube_r510 = bone2.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(108, 117).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9991F, 2.9458F, -0.6337F, -3.0148F, 0.2457F, -0.3953F));

		PartDefinition cube_r511 = bone2.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(0, 58).addBox(-0.5F, -3.0F, -3.3F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.6637F, -1.0319F, -4.3267F, 2.3521F, 0.2457F, -0.3953F));

		PartDefinition cube_r512 = bone2.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(86, 33).addBox(-0.5F, -3.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.1689F, -2.7813F, -3.4996F, 2.7011F, 0.2457F, -0.3953F));

		PartDefinition cube_r513 = bone2.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(93, 90).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3325F, -4.6813F, -1.1837F, -2.4912F, 0.2457F, -0.3953F));

		PartDefinition cube_r514 = bone2.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(66, 93).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.784F, -4.6185F, 0.7386F, -1.7058F, 0.2457F, -0.3953F));

		PartDefinition cube_r515 = bone2.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(111, 101).addBox(0.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3655F, 0.3118F, -5.3738F, -0.412F, 0.2135F, -2.3369F));

		PartDefinition cube_r516 = bone2.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(117, 57).addBox(0.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6461F, 3.2074F, -5.0603F, -0.3954F, 0.1047F, -1.8143F));

		PartDefinition cube_r517 = bone2.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(128, 116).addBox(0.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2323F, 5.1163F, -4.9488F, -0.4153F, 0.0557F, -1.2729F));

		PartDefinition cube_r518 = bone2.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(51, 37).addBox(-1.0F, -0.5F, -0.8F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.3116F, 5.7336F, -5.8575F, -0.5438F, -0.0624F, -0.447F));

		PartDefinition cube_r519 = bone2.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(115, 30).addBox(-1.0F, -0.7F, 0.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.3116F, 5.7336F, -5.8575F, -0.4777F, 0.0096F, -0.6754F));

		PartDefinition cube_r520 = bone2.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7526F, -3.9244F, 3.4689F, -0.3532F, 0.2457F, -0.3953F));

		PartDefinition cube_r521 = bone2.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(115, 41).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0997F, -2.8094F, 4.8937F, 0.8249F, 0.2457F, -0.3953F));

		PartDefinition cube_r522 = bone2.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(30, 113).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1004F, -2.0827F, 3.0412F, 1.8721F, 0.2457F, -0.3953F));

		PartDefinition cube_r523 = bone2.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(41, 67).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8937F, 1.1363F, 1.7568F, 2.1775F, 0.2457F, -0.3953F));

		PartDefinition cube_r524 = bone2.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(19, 125).addBox(-0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.7296F, 1.4369F, -4.6798F, -0.3096F, 0.2457F, -0.3953F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.082F, 3.9151F, -0.5982F, 0.0261F, -0.2438F, 0.0725F));

		PartDefinition cube_r525 = bone3.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.9F, 0.0F, -8.3F, 2.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7586F, 2.7876F, -3.7432F, -2.6844F, -0.4391F, 0.9835F));

		PartDefinition cube_r526 = bone3.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(108, 117).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9991F, 2.9458F, -0.6337F, -3.0148F, -0.2457F, 0.3953F));

		PartDefinition cube_r527 = bone3.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-0.5F, -3.0F, -3.3F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.6637F, -1.0319F, -4.3267F, 2.3521F, -0.2457F, 0.3953F));

		PartDefinition cube_r528 = bone3.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(86, 33).mirror().addBox(-0.5F, -3.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(2.1689F, -2.7813F, -3.4996F, 2.7011F, -0.2457F, 0.3953F));

		PartDefinition cube_r529 = bone3.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(93, 90).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3325F, -4.6813F, -1.1837F, -2.4912F, -0.2457F, 0.3953F));

		PartDefinition cube_r530 = bone3.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(66, 93).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.784F, -4.6185F, 0.7386F, -1.7058F, -0.2457F, 0.3953F));

		PartDefinition cube_r531 = bone3.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(111, 101).mirror().addBox(-3.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3655F, 0.3118F, -5.3738F, -0.412F, -0.2135F, 2.3369F));

		PartDefinition cube_r532 = bone3.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(117, 57).mirror().addBox(-3.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6461F, 3.2074F, -5.0603F, -0.3954F, -0.1047F, 1.8143F));

		PartDefinition cube_r533 = bone3.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(128, 116).mirror().addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2323F, 5.1163F, -4.9488F, -0.4153F, -0.0557F, 1.2729F));

		PartDefinition cube_r534 = bone3.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(51, 37).mirror().addBox(-6.0F, -0.5F, -0.8F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.3116F, 5.7336F, -5.8575F, -0.5438F, 0.0624F, 0.447F));

		PartDefinition cube_r535 = bone3.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(115, 30).mirror().addBox(-2.0F, -0.7F, 0.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.3116F, 5.7336F, -5.8575F, -0.4777F, -0.0096F, 0.6754F));

		PartDefinition cube_r536 = bone3.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7526F, -3.9244F, 3.4689F, -0.3532F, -0.2457F, 0.3953F));

		PartDefinition cube_r537 = bone3.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(115, 41).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.0997F, -2.8094F, 4.8937F, 0.8249F, -0.2457F, 0.3953F));

		PartDefinition cube_r538 = bone3.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(30, 113).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1004F, -2.0827F, 3.0412F, 1.8721F, -0.2457F, 0.3953F));

		PartDefinition cube_r539 = bone3.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(41, 67).mirror().addBox(-0.5F, -3.0F, 0.0F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8937F, 1.1363F, 1.7568F, 2.1775F, -0.2457F, 0.3953F));

		PartDefinition cube_r540 = bone3.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(19, 125).mirror().addBox(-0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.7296F, 1.4369F, -4.6798F, -0.3096F, -0.2457F, 0.3953F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(23, 11).addBox(-1.2F, -0.7F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(7.3386F, 8.5112F, -4.4107F, -0.5127F, 0.2682F, -0.1405F));

		PartDefinition cube_r541 = leftArm.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(90, 27).addBox(-1.0F, -0.4F, -1.7F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 0.5041F, 0.5966F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r542 = leftArm.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(76, 111).addBox(-1.0F, -0.2F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2929F, 0.0649F, -2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r543 = leftArm.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(93, 101).addBox(-1.0F, -0.8F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.2929F, 0.0649F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r544 = leftArm.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(9, 78).addBox(-3.5206F, -0.5F, -1.1533F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.8502F, 0.4534F, 7.68F, -0.5259F, -1.1261F, 0.4679F));

		PartDefinition cube_r545 = leftArm.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(75, 85).addBox(-1.8F, -0.5F, -0.6F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2446F, 0.2245F, 6.6644F, -2.5047F, 1.1992F, -2.5529F));

		PartDefinition cube_r546 = leftArm.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(42, 85).addBox(0.0F, -0.5F, -0.6F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.3291F, 0.6572F, 8.6152F, -1.3682F, 1.3485F, -1.378F));

		PartDefinition cube_r547 = leftArm.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(76, 107).addBox(-0.6F, -0.5F, -1.325F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8993F, 0.6947F, 8.8798F, -0.3671F, 0.9253F, -0.3128F));

		PartDefinition cube_r548 = leftArm.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(55, 107).addBox(-0.751F, -0.5F, 0.0016F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8502F, 0.4534F, 7.68F, -0.2176F, -0.0018F, -0.0143F));

		PartDefinition cube_r549 = leftArm.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(49, 42).addBox(-0.5014F, -0.3286F, -2.7838F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1215F, -0.0105F, 4.3214F, -0.0873F, 0.052F, -0.0076F));

		PartDefinition cube_r550 = leftArm.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(17, 44).addBox(-0.9195F, -0.5F, -2.7601F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2805F, 0.2F, 4.7601F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r551 = leftArm.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(105, 54).addBox(-1.2F, -0.15F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(23, 105).addBox(-0.5F, -0.15F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1128F, -0.9727F, 1.6424F, -0.3054F, 0.0873F, 0.0F));

		PartDefinition cube_r552 = leftArm.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(121, 103).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.35F, -1.5452F, 3.5213F, -0.6545F, 0.0873F, 0.0F));

		PartDefinition cube_r553 = leftArm.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(100, 125).addBox(-0.9F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0267F, -0.9F, 2.6274F, 0.2618F, 0.0873F, 0.0F));

		PartDefinition cube_r554 = leftArm.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(38, 21).addBox(-0.5F, -0.6895F, -3.7005F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1215F, -0.0105F, 4.3214F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r555 = leftArm.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(101, 73).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, -0.0755F, 8.1713F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r556 = leftArm.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(97, 44).addBox(-1.2F, -2.0F, -4.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 12.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4839F, -0.8967F, 9.9025F, -0.2768F, -0.0253F, 0.0891F));

		PartDefinition cube_r557 = leftArm2.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(127, 92).addBox(-2.0F, 2.6246F, -1.0218F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(127, 28).addBox(-2.0F, 2.0246F, -1.0218F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.0F, -0.4965F, 0.1528F, 0.288F, 0.0F, 0.0349F));

		PartDefinition cube_r558 = leftArm2.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(129, 84).addBox(-1.0F, -1.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0679F, 1.4312F, 0.5537F, 0.3752F, 0.0F, 0.0349F));

		PartDefinition cube_r559 = leftArm2.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(56, 129).addBox(-1.0F, -1.7F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F))
				.texOffs(129, 40).addBox(-1.0F, -1.2F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.0679F, 1.4312F, 0.5537F, -0.3665F, 0.0F, 0.0349F));

		PartDefinition cube_r560 = leftArm2.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(108, 122).addBox(-1.0F, -1.1F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.089F, 2.0358F, 0.3695F, 0.0262F, 0.0F, 0.0349F));

		PartDefinition cube_r561 = leftArm2.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(130, 98).addBox(-1.0F, -1.2F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(122, 84).addBox(-1.0F, -0.9F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-0.4072F, 11.1481F, 1.0464F, 0.6545F, 0.0F, 0.0349F));

		PartDefinition cube_r562 = leftArm2.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(91, 58).addBox(-1.0F, -0.725F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.1097F, 2.6268F, -0.6878F, 0.3491F, 0.0F, 0.0349F));

		PartDefinition cube_r563 = leftArm2.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(126, 72).addBox(-1.0F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1097F, 2.6268F, -0.6878F, -0.4363F, 0.0F, 0.0349F));

		PartDefinition cube_r564 = leftArm2.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(57, 122).addBox(-1.0F, -1.9F, -0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.1788F, 4.6063F, -1.1747F, -0.0436F, 0.0F, 0.0349F));

		PartDefinition cube_r565 = leftArm2.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(79, 33).addBox(-1.0F, -1.9F, -0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2414F, 6.3983F, -1.0178F, 0.0873F, 0.0F, 0.0349F));

		PartDefinition cube_r566 = leftArm2.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(98, 58).addBox(-1.0F, -2.7F, -0.2F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.3292F, 8.9135F, -0.3574F, 0.2182F, 0.0F, 0.0349F));

		PartDefinition cube_r567 = leftArm2.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(41, 103).addBox(-1.0F, -0.1F, -0.1F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2412F, 6.392F, 0.4199F, 0.1309F, 0.0F, 0.0349F));

		PartDefinition cube_r568 = leftArm2.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(7, 110).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1739F, 4.4656F, 0.6528F, 0.0873F, 0.0F, 0.0349F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(54, 90).addBox(-0.6F, 0.2F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5531F, 9.8168F, 0.057F, -0.1058F, 0.5933F, 0.0222F));

		PartDefinition cube_r569 = leftArm3.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(16, 134).addBox(-1.0F, 0.0F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3127F, 0.9266F, -0.3541F, -0.5195F, 0.2064F, 0.0219F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4923F, 2.6871F, -0.008F, -0.8126F, -1.1507F, 1.2138F));

		PartDefinition cube_r570 = leftArm4.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(135, 114).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.093F, 4.6007F, -0.8727F, -1.7138F, 1.5571F, -1.4317F));

		PartDefinition cube_r571 = leftArm4.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(23, 110).addBox(-2.4F, 0.4F, -0.875F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition leftArm5 = leftArm3.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4267F, 2.8885F, 0.0914F, -0.4702F, 0.1001F, -0.1113F));

		PartDefinition cube_r572 = leftArm5.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(135, 107).addBox(-0.6F, 4.2F, -1.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(33, 68).addBox(-0.6F, -0.4F, -2.1F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 1.5F, 0.0F, 0.0F, 0.2618F));

		PartDefinition leftArm7 = leftArm3.addOrReplaceChild("leftArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5089F, 3.1492F, 1.6F, 0.0873F, 0.0F, 0.5236F));

		PartDefinition leftArm6 = leftArm3.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2715F, 3.2475F, 1.776F, -0.3819F, 0.6477F, -0.6346F));

		PartDefinition cube_r573 = leftArm6.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(36, 126).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition leftArm8 = leftArm3.addOrReplaceChild("leftArm8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1755F, 1.0282F, -0.318F, -0.5269F, 0.1846F, -0.0166F));

		PartDefinition cube_r574 = leftArm8.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(90, 125).addBox(-1.0F, 0.0F, -0.825F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.2618F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(19, 23).addBox(0.2F, -0.7F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-7.3386F, 8.5112F, -4.4107F, -1.2544F, -0.2682F, 0.1405F));

		PartDefinition cube_r575 = rightArm.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(43, 90).addBox(-1.0F, -0.4F, -1.7F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 0.5041F, 0.5966F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r576 = rightArm.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(111, 76).addBox(-1.0F, -0.2F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2929F, 0.0649F, -2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r577 = rightArm.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(102, 99).addBox(-1.0F, -0.8F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.2929F, 0.0649F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r578 = rightArm.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(78, 57).addBox(-0.4794F, -0.5F, -1.1533F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.8502F, 0.4534F, 7.68F, -0.5259F, 1.1261F, -0.4679F));

		PartDefinition cube_r579 = rightArm.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(0, 87).addBox(-0.2F, -0.5F, -0.6F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2446F, 0.2245F, 6.6644F, -2.5047F, -1.1992F, 2.5529F));

		PartDefinition cube_r580 = rightArm.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(86, 85).addBox(-2.0F, -0.5F, -0.6F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.3291F, 0.6572F, 8.6152F, -1.3682F, -1.3485F, 1.378F));

		PartDefinition cube_r581 = rightArm.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(110, 0).addBox(-1.4F, -0.5F, -1.325F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8993F, 0.6947F, 8.8798F, -0.3671F, -0.9253F, 0.3128F));

		PartDefinition cube_r582 = rightArm.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(109, 108).addBox(-1.249F, -0.5F, 0.0016F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8502F, 0.4534F, 7.68F, -0.2176F, 0.0018F, 0.0143F));

		PartDefinition cube_r583 = rightArm.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(47, 50).addBox(-0.4986F, -0.3286F, -2.7838F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1215F, -0.0105F, 4.3214F, -0.0873F, -0.052F, 0.0076F));

		PartDefinition cube_r584 = rightArm.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(32, 50).addBox(-0.0805F, -0.5F, -2.7601F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2805F, 0.2F, 4.7601F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r585 = rightArm.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(106, 5).addBox(0.2F, -0.15F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(105, 59).addBox(-0.5F, -0.15F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1128F, -0.9727F, 1.6424F, -0.3054F, -0.0873F, 0.0F));

		PartDefinition cube_r586 = rightArm.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(50, 122).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.35F, -1.5452F, 3.5213F, -0.6545F, -0.0873F, 0.0F));

		PartDefinition cube_r587 = rightArm.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(126, 0).addBox(-0.1F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0267F, -0.9F, 2.6274F, 0.2618F, -0.0873F, 0.0F));

		PartDefinition cube_r588 = rightArm.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F, -0.6895F, -3.7005F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1215F, -0.0105F, 4.3214F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r589 = rightArm.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(102, 94).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2F, -0.0755F, 8.1713F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r590 = rightArm.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(97, 68).addBox(-0.8F, -2.0F, -4.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 12.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4839F, -0.8967F, 9.9025F, 0.2104F, 0.4403F, 0.1999F));

		PartDefinition cube_r591 = rightArm2.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(128, 122).addBox(0.0F, 2.6246F, -1.0218F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(121, 128).addBox(0.0F, 2.0246F, -1.0218F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.0F, -0.4965F, 0.1528F, 0.288F, 0.0F, -0.0349F));

		PartDefinition cube_r592 = rightArm2.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(130, 78).addBox(-1.0F, -1.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0679F, 1.4312F, 0.5537F, 0.3752F, 0.0F, -0.0349F));

		PartDefinition cube_r593 = rightArm2.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(130, 75).addBox(-1.0F, -1.7F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F))
				.texOffs(130, 52).addBox(-1.0F, -1.2F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0679F, 1.4312F, 0.5537F, -0.3665F, 0.0F, -0.0349F));

		PartDefinition cube_r594 = rightArm2.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(123, 80).addBox(-1.0F, -1.1F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.089F, 2.0358F, 0.3695F, 0.0262F, 0.0F, -0.0349F));

		PartDefinition cube_r595 = rightArm2.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(128, 130).addBox(-1.0F, -1.2F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(124, 12).addBox(-1.0F, -0.9F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.4072F, 11.1481F, 1.0464F, 0.6545F, 0.0F, -0.0349F));

		PartDefinition cube_r596 = rightArm2.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(98, 65).addBox(-1.0F, -0.725F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.1097F, 2.6268F, -0.6878F, 0.3491F, 0.0F, -0.0349F));

		PartDefinition cube_r597 = rightArm2.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(128, 119).addBox(-1.0F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1097F, 2.6268F, -0.6878F, -0.4363F, 0.0F, -0.0349F));

		PartDefinition cube_r598 = rightArm2.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(123, 76).addBox(-1.0F, -1.9F, -0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.1788F, 4.6063F, -1.1747F, -0.0436F, 0.0F, -0.0349F));

		PartDefinition cube_r599 = rightArm2.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(119, 0).addBox(-1.0F, -1.9F, -0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2414F, 6.3983F, -1.0178F, 0.0873F, 0.0F, -0.0349F));

		PartDefinition cube_r600 = rightArm2.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(0, 100).addBox(-1.0F, -2.7F, -0.2F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.3292F, 8.9135F, -0.3574F, 0.2182F, 0.0F, -0.0349F));

		PartDefinition cube_r601 = rightArm2.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(69, 104).addBox(-1.0F, -0.1F, -0.1F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2412F, 6.392F, 0.4199F, 0.1309F, 0.0F, -0.0349F));

		PartDefinition cube_r602 = rightArm2.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(110, 10).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1739F, 4.4656F, 0.6528F, 0.0873F, 0.0F, -0.0349F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(75, 90).addBox(-0.4F, 0.2F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0444F, 10.0493F, 0.5356F, -0.6612F, -0.999F, 0.5106F));

		PartDefinition cube_r603 = rightArm3.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(21, 134).addBox(0.0F, 0.0F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3127F, 0.9266F, -0.3541F, -0.5111F, -0.2279F, -0.0608F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.788F, 2.3687F, -0.6797F, -1.1683F, 1.2597F, -1.5725F));

		PartDefinition cube_r604 = rightArm4.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(55, 111).addBox(0.4F, 0.4F, -0.875F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r605 = rightArm4.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(118, 135).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.293F, 4.6007F, -0.8727F, -1.7138F, -1.5571F, 1.4317F));

		PartDefinition rightArm5 = rightArm3.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4267F, 2.8885F, 0.0914F, -0.4604F, 0.0167F, 0.1495F));

		PartDefinition cube_r606 = rightArm5.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(135, 117).addBox(-1.4F, 4.2F, -1.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(43, 95).addBox(-0.4F, -0.4F, -2.1F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 1.5F, 0.0F, 0.0F, -0.2618F));

		PartDefinition rightArm7 = rightArm3.addOrReplaceChild("rightArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5089F, 3.1492F, 1.6F, 0.0873F, 0.0F, -0.5236F));

		PartDefinition rightArm6 = rightArm3.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0788F, 3.3893F, 1.957F, -0.3819F, -0.6477F, 0.6346F));

		PartDefinition cube_r607 = rightArm6.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(41, 126).addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition rightArm8 = rightArm3.addOrReplaceChild("rightArm8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1755F, 1.0282F, -0.318F, -0.5269F, -0.1846F, 0.0166F));

		PartDefinition cube_r608 = rightArm8.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(95, 125).addBox(0.0F, 0.0F, -0.825F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -0.6109F, 0.0F, -0.2618F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(33, 77).addBox(-0.5F, 0.0933F, -0.1029F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4458F, 4.8631F, -0.903F, 0.0813F, -0.1027F));

		PartDefinition cube_r609 = tail.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(138, 16).addBox(-0.1F, -1.05F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1805F, 1.8952F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r610 = tail.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(129, 137).addBox(-0.1F, -0.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0933F, -0.1029F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail8 = tail.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(59, 70).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1939F, 3.8622F, -0.1584F, 0.1293F, -0.0206F));

		PartDefinition cube_r611 = tail8.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(103, 132).addBox(0.0F, -0.5F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8202F, 2.6282F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r612 = tail8.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(88, 76).addBox(-0.1F, -1.45F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 54).addBox(-0.1F, -1.25F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0128F, -2.0019F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail8.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(70, 70).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.0444F, 3.9545F, -0.0964F, 0.0869F, -0.0084F));

		PartDefinition cube_r613 = tail2.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(137, 110).addBox(-0.1F, -1.1F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0463F, 2.1077F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r614 = tail2.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(56, 136).addBox(0.0F, -0.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9193F, 2.5604F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r615 = tail2.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(123, 135).addBox(0.0F, -0.2F, -0.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9928F, 0.5256F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r616 = tail2.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(97, 73).addBox(-0.1F, -1.075F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail4 = tail2.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(72, 0).addBox(-0.5F, -2.1F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 2.0F, 4.0F, 0.088F, 0.1304F, 0.0115F));

		PartDefinition cube_r617 = tail4.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(0, 138).addBox(-0.1F, -0.8F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9537F, 2.1077F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r618 = tail4.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(137, 136).addBox(0.0F, -0.9F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0807F, 2.5604F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r619 = tail4.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(138, 0).addBox(0.0F, -0.2F, -0.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0072F, 0.5256F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r620 = tail4.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(19, 138).addBox(-0.1F, -0.975F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail9 = tail4.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(97, 6).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0961F, 3.5324F, -0.0088F, 0.0873F, -0.0008F));

		PartDefinition cube_r621 = tail9.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(97, 11).addBox(-0.1F, -0.3F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.037F, 0.0177F, -0.0262F, 0.0F, 0.0F));

		PartDefinition tail3 = tail9.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(93, 96).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.0006F, 2.756F, 0.1139F, 0.0867F, 0.0099F));

		PartDefinition tail10 = tail3.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(9, 59).addBox(-0.5F, -0.8982F, 0.0171F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8982F, 2.7829F, 0.2628F, 0.0843F, 0.0226F));

		return LayerDefinition.create(meshdefinition, 144, 144);
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